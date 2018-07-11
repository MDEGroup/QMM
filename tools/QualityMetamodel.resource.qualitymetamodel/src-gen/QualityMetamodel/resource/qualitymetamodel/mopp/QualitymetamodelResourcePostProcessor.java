/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package QualityMetamodel.resource.qualitymetamodel.mopp;

public class QualitymetamodelResourcePostProcessor implements QualityMetamodel.resource.qualitymetamodel.IQualitymetamodelResourcePostProcessor {
	
	public void process(QualityMetamodel.resource.qualitymetamodel.mopp.QualitymetamodelResource resource) {
		// Set the overrideResourcePostProcessor option to false to customize resource
		// post processing.
	}
	
	public void terminate() {
		// To signal termination to the process() method, setting a boolean field is
		// recommended. Depending on the value of this field process() can stop its
		// computation. However, this is only required for computation intensive
		// post-processors.
	}
	
}
