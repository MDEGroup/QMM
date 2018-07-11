/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package QualityMetamodel.resource.qualitymetamodel.debug;

public class QualitymetamodelSourceLocator extends org.eclipse.debug.core.sourcelookup.AbstractSourceLookupDirector {
	
	public void initializeParticipants() {
		addParticipants(new org.eclipse.debug.core.sourcelookup.ISourceLookupParticipant[]{new QualityMetamodel.resource.qualitymetamodel.debug.QualitymetamodelSourceLookupParticipant()});
	}
	
}
