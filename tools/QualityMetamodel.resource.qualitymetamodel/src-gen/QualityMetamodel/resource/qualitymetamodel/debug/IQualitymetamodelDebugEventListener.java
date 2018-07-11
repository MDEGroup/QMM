/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package QualityMetamodel.resource.qualitymetamodel.debug;

public interface IQualitymetamodelDebugEventListener {
	
	/**
	 * Notification that the given event occurred in the while debugging.
	 */
	public void handleMessage(QualityMetamodel.resource.qualitymetamodel.debug.QualitymetamodelDebugMessage message);
}
