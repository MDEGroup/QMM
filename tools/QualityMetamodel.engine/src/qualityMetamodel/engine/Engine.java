package qualityMetamodel.engine;

import java.io.IOException;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import QualityMetamodel.AggregatedValue;
import QualityMetamodel.IntegerValueType;
import QualityMetamodel.QualityAttribute;
import QualityMetamodel.QualityModel;
import QualityMetamodel.RealValueType;
import QualityMetamodel.SingleValue;
import QualityMetamodel.Value;
import QualityMetamodel.resource.qualitymetamodel.mopp.QualitymetamodelResourceFactory;


public class Engine {

	Connector connector;
	public void calculateQuality(Connector connector, String qualityModelPath, String artifactName){
		this.connector = connector;
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("qualitymetamodel", new QualitymetamodelResourceFactory());
		    
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(Resource.Factory.Registry.DEFAULT_EXTENSION,new XMIResourceFactoryImpl());
		ResourceSet rs = new ResourceSetImpl();

		Resource dslResource = rs.getResource(URI.createFileURI(qualityModelPath), true);
		EList<EObject> list = dslResource.getContents();
		EObject root = list.get(0);
		QualityModel qualityModel = null;
		if(root instanceof QualityModel)
			qualityModel = (QualityModel) root;
		for (Value qualityValue : qualityModel.getQualityValues()
							.stream().filter(z -> z instanceof SingleValue)
							.collect(Collectors.toList())) {
			SingleValue singleValue = (SingleValue) qualityValue; 
			
			connector.getInstanciateValueType(singleValue, artifactName);
		}
		
		OCLVisitor v = new OCLVisitor();
		v.startVisiting(qualityModel);
		for (QualityAttribute qualityAttribute : qualityModel.getQualityAttributes()
							.stream().filter(z -> z.getValue() instanceof AggregatedValue)
							.collect(Collectors.toList())) {
			AggregatedValue aggregatedValue = (AggregatedValue) qualityAttribute.getValue();
			getInstanciateValueType(aggregatedValue, v.getValues().get(aggregatedValue));
		}
		
		//Serialize
		Resource xmiResource = rs.createResource(URI.createFileURI(qualityModelPath + ".xmi"));
		xmiResource.getContents().add(qualityModel);
		try {
			xmiResource.save(null);
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}

	public void getInstanciateValueType(AggregatedValue aggregatedValue, Object value) {
		if(aggregatedValue.getValueType() instanceof IntegerValueType)
			((IntegerValueType)aggregatedValue.getValueType()).setValue((Integer) value);
		
		else if(aggregatedValue.getValueType() instanceof RealValueType)
			((RealValueType)aggregatedValue.getValueType()).setValue((Double)value);
		else 
			((RealValueType)aggregatedValue.getValueType()).setValue((Double) value);
	}

}
