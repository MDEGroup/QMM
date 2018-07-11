/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package QualityMetamodel.resource.qualitymetamodel;

/**
 * Implementors of this interface can provide a post-processor for text resources.
 */
public interface IQualitymetamodelResourcePostProcessorProvider {
	
	/**
	 * Returns the processor that shall be called after text resource are successfully
	 * parsed.
	 */
	public QualityMetamodel.resource.qualitymetamodel.IQualitymetamodelResourcePostProcessor getResourcePostProcessor();
	
}
