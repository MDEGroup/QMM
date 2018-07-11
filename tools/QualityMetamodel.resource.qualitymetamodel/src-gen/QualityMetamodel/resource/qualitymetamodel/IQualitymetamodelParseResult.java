/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package QualityMetamodel.resource.qualitymetamodel;

/**
 * An interface used to access the result of parsing a document.
 */
public interface IQualitymetamodelParseResult {
	
	/**
	 * Returns the root object of the document.
	 */
	public org.eclipse.emf.ecore.EObject getRoot();
	
	/**
	 * Returns a list of commands that must be executed after parsing the document.
	 */
	public java.util.Collection<QualityMetamodel.resource.qualitymetamodel.IQualitymetamodelCommand<QualityMetamodel.resource.qualitymetamodel.IQualitymetamodelTextResource>> getPostParseCommands();
	
}
