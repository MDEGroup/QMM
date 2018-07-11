/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package QualityMetamodel.resource.qualitymetamodel.debug;

public class QualitymetamodelSourceLookupParticipant extends org.eclipse.debug.core.sourcelookup.AbstractSourceLookupParticipant {
	
	public String getSourceName(Object object) throws org.eclipse.core.runtime.CoreException {
		if (object instanceof QualityMetamodel.resource.qualitymetamodel.debug.QualitymetamodelStackFrame) {
			QualityMetamodel.resource.qualitymetamodel.debug.QualitymetamodelStackFrame frame = (QualityMetamodel.resource.qualitymetamodel.debug.QualitymetamodelStackFrame) object;
			return frame.getResourceURI();
		}
		return null;
	}
	
}
