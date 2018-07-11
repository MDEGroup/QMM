/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package QualityMetamodel.resource.qualitymetamodel;

/**
 * A simple interface for commands that can be executed and that return
 * information about the success of their execution.
 */
public interface IQualitymetamodelCommand<ContextType> {
	
	public boolean execute(ContextType context);
}
