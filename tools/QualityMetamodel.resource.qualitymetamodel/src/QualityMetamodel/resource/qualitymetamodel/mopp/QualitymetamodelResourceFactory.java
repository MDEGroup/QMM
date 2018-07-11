/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package QualityMetamodel.resource.qualitymetamodel.mopp;

public class QualitymetamodelResourceFactory implements org.eclipse.emf.ecore.resource.Resource.Factory {
	
	public QualitymetamodelResourceFactory() {
		super();
	}
	
	public org.eclipse.emf.ecore.resource.Resource createResource(org.eclipse.emf.common.util.URI uri) {
		return new QualityMetamodel.resource.qualitymetamodel.mopp.QualitymetamodelResource(uri);
	}
	
}
