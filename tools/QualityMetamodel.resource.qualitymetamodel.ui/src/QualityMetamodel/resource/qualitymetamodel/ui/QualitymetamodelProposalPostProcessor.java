/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package QualityMetamodel.resource.qualitymetamodel.ui;

/**
 * A class which can be overridden to customize code completion proposals.
 */
public class QualitymetamodelProposalPostProcessor {
	
	public java.util.List<QualityMetamodel.resource.qualitymetamodel.ui.QualitymetamodelCompletionProposal> process(java.util.List<QualityMetamodel.resource.qualitymetamodel.ui.QualitymetamodelCompletionProposal> proposals) {
		// the default implementation does returns the proposals as they are
		return proposals;
	}
	
}
