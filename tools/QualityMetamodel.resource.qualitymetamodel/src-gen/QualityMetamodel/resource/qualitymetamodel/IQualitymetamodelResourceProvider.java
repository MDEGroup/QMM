/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package QualityMetamodel.resource.qualitymetamodel;

/**
 * Implementors of this interface provide an EMF resource.
 */
public interface IQualitymetamodelResourceProvider {
	
	/**
	 * Returns the resource.
	 */
	public QualityMetamodel.resource.qualitymetamodel.IQualitymetamodelTextResource getResource();
	
}
