package qualityMetamodel.engine;

import java.io.File;
import java.io.IOException;

import org.mdeforge.business.model.ATLTransformation;
import org.mdeforge.business.model.AggregatedIntegerMetric;
import org.mdeforge.business.model.AggregatedRealMetric;
import org.mdeforge.business.model.Artifact;
import org.mdeforge.business.model.CoDomainConformToRelation;
import org.mdeforge.business.model.DomainConformToRelation;
import org.mdeforge.business.model.EcoreMetamodel;
import org.mdeforge.business.model.Metric;
import org.mdeforge.business.model.Property;
import org.mdeforge.business.model.SimpleMetric;
import org.mdeforge.client.ATLTransformationService;
import org.mdeforge.client.ArtifactService;
import org.mdeforge.client.EcoreMetamodelService;

import QualityMetamodel.IntegerValueType;
import QualityMetamodel.RealValueType;
import QualityMetamodel.SingleValue;

public class MDEForgeConnector implements Connector{

//	private static String CONNECTION_HOST = "http://localhost:8080/mdeforge/";
//	private static String CONNECTION_USERNAME = "Admin";
//	private static String CONNECTION_PASSWORD = "juri";

	private static ATLTransformationService atlTransformationService;
	private static EcoreMetamodelService ecoreMetamodelService;
	private static ArtifactService artifactService;
	
	public MDEForgeConnector(String connection_host, String username, String password) {
		try {
			artifactService = new ArtifactService(connection_host, username, password);
			atlTransformationService = new ATLTransformationService(connection_host, username, password);
			ecoreMetamodelService = new EcoreMetamodelService(connection_host, username, password);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Override
	public void getInstanciateValueType(SingleValue singleValue, String artifactName) {
		try {
			Artifact art = null;
			try{
				String artName = getName(artifactName);
				art = artifactService.getArtifactByName(artName);
				if( art == null){
					art = uploadArtifact(artifactName);	
				}
				} catch (Exception e){
					art = uploadArtifact(artifactName);	
				}
			for (Metric metric : artifactService.getArtifactMetrics(art.getId())) {
				if (singleValue.getMeasuredBy().getDescription().equals(metric.getName())) {
					if (metric instanceof SimpleMetric) {
						SimpleMetric sm = (SimpleMetric) metric;
						if(singleValue.getValueType() instanceof IntegerValueType)
							((IntegerValueType)singleValue.getValueType()).setValue(Integer.parseInt(sm.getValue()));
						else ((RealValueType)singleValue.getValueType()).setValue(Double.parseDouble(sm.getValue()));
					} else if (metric instanceof AggregatedIntegerMetric) {
						AggregatedIntegerMetric sm = (AggregatedIntegerMetric) metric;
						if(singleValue.getValueType() instanceof IntegerValueType)
							((IntegerValueType)singleValue.getValueType()).setValue((int) sm.getAverage());
						else ((RealValueType)singleValue.getValueType()).setValue((double) sm.getAverage());
						
					} else if (metric instanceof AggregatedRealMetric) {
						AggregatedRealMetric sm = (AggregatedRealMetric) metric;
						if(singleValue.getValueType() instanceof IntegerValueType) 
							((IntegerValueType)singleValue.getValueType()).setValue((int) sm.getAverage());
						else ((RealValueType)singleValue.getValueType()).setValue((double) sm.getAverage());

					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


	private String getName(String artifactName) throws Exception {
		File file = new File(artifactName);
		if(file.exists()) 
			return file.getName().replaceAll(".ecore", "");
		else throw new Exception();
	}

	private Artifact uploadArtifact(String artifactName) throws Exception {
		if(artifactName.toLowerCase().endsWith("ecore")){
			return uploadMetamodel(artifactName);
		}
		if(artifactName.toLowerCase().endsWith("atl")){
			return uploadTransformation(artifactName);
		}
		else throw new Exception("Unandled artifact");
	}

	@Override
	public EcoreMetamodel uploadMetamodel(String artifactPath) {
		System.out.println("############ Upload Metamodel ############");
		EcoreMetamodel ecoreMetamodelToUpload = new EcoreMetamodel();
		EcoreMetamodel uploadedArtifact = new EcoreMetamodel();
		
		try {
			File file = new File(artifactPath);
			if(file.exists()) {
				ecoreMetamodelToUpload.setName(file.getName().replace(".ecore", ""));
				Property property = new Property();
				property.setName("Info");
				property.setValue("Uploaded From Client");
				ecoreMetamodelToUpload.getProperties().add(property);
				uploadedArtifact = ecoreMetamodelService.addEcoreMetamodel(ecoreMetamodelToUpload, artifactPath);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return uploadedArtifact;
		
	}

	@Override
	public ATLTransformation uploadTransformation(String transformationPath) {
		System.out.println("############ Upload Transformation ############");
		ATLTransformation transformationToUpload = new ATLTransformation();
		ATLTransformation uploadedArtifact = new ATLTransformation();
		
		try {
			File file = new File(transformationPath);
			if(file.exists()) {
				transformationToUpload.setName(file.getName().replace(".atl", ""));
				transformationToUpload.setOpen(true);
				Property property = new Property();
				property.setName("Info");
				property.setValue("Uploaded From Client");
				transformationToUpload.getProperties().add(property);
				uploadedArtifact = atlTransformationService.addATLTransformation(transformationToUpload, transformationPath);
				
			}
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return uploadedArtifact;
	}

}
