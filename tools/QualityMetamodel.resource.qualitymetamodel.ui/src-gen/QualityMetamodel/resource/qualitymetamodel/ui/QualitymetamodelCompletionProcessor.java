/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package QualityMetamodel.resource.qualitymetamodel.ui;

public class QualitymetamodelCompletionProcessor implements org.eclipse.jface.text.contentassist.IContentAssistProcessor {
	
	private QualityMetamodel.resource.qualitymetamodel.IQualitymetamodelResourceProvider resourceProvider;
	private QualityMetamodel.resource.qualitymetamodel.ui.IQualitymetamodelBracketHandlerProvider bracketHandlerProvider;
	
	public QualitymetamodelCompletionProcessor(QualityMetamodel.resource.qualitymetamodel.IQualitymetamodelResourceProvider resourceProvider, QualityMetamodel.resource.qualitymetamodel.ui.IQualitymetamodelBracketHandlerProvider bracketHandlerProvider) {
		this.resourceProvider = resourceProvider;
		this.bracketHandlerProvider = bracketHandlerProvider;
	}
	
	public org.eclipse.jface.text.contentassist.ICompletionProposal[] computeCompletionProposals(org.eclipse.jface.text.ITextViewer viewer, int offset) {
		QualityMetamodel.resource.qualitymetamodel.IQualitymetamodelTextResource textResource = resourceProvider.getResource();
		if (textResource == null) {
			return new org.eclipse.jface.text.contentassist.ICompletionProposal[0];
		}
		String content = viewer.getDocument().get();
		QualityMetamodel.resource.qualitymetamodel.ui.QualitymetamodelCodeCompletionHelper helper = new QualityMetamodel.resource.qualitymetamodel.ui.QualitymetamodelCodeCompletionHelper();
		QualityMetamodel.resource.qualitymetamodel.ui.QualitymetamodelCompletionProposal[] computedProposals = helper.computeCompletionProposals(textResource, content, offset);
		
		// call completion proposal post processor to allow for customizing the proposals
		QualityMetamodel.resource.qualitymetamodel.ui.QualitymetamodelProposalPostProcessor proposalPostProcessor = new QualityMetamodel.resource.qualitymetamodel.ui.QualitymetamodelProposalPostProcessor();
		java.util.List<QualityMetamodel.resource.qualitymetamodel.ui.QualitymetamodelCompletionProposal> computedProposalList = java.util.Arrays.asList(computedProposals);
		java.util.List<QualityMetamodel.resource.qualitymetamodel.ui.QualitymetamodelCompletionProposal> extendedProposalList = proposalPostProcessor.process(computedProposalList);
		if (extendedProposalList == null) {
			extendedProposalList = java.util.Collections.emptyList();
		}
		java.util.List<QualityMetamodel.resource.qualitymetamodel.ui.QualitymetamodelCompletionProposal> finalProposalList = new java.util.ArrayList<QualityMetamodel.resource.qualitymetamodel.ui.QualitymetamodelCompletionProposal>();
		for (QualityMetamodel.resource.qualitymetamodel.ui.QualitymetamodelCompletionProposal proposal : extendedProposalList) {
			if (proposal.getMatchesPrefix()) {
				finalProposalList.add(proposal);
			}
		}
		org.eclipse.jface.text.contentassist.ICompletionProposal[] result = new org.eclipse.jface.text.contentassist.ICompletionProposal[finalProposalList.size()];
		int i = 0;
		for (QualityMetamodel.resource.qualitymetamodel.ui.QualitymetamodelCompletionProposal proposal : finalProposalList) {
			String proposalString = proposal.getInsertString();
			String displayString = proposal.getDisplayString();
			String prefix = proposal.getPrefix();
			org.eclipse.swt.graphics.Image image = proposal.getImage();
			org.eclipse.jface.text.contentassist.IContextInformation info;
			info = new org.eclipse.jface.text.contentassist.ContextInformation(image, proposalString, proposalString);
			int begin = offset - prefix.length();
			int replacementLength = prefix.length();
			// if a closing bracket was automatically inserted right before, we enlarge the
			// replacement length in order to overwrite the bracket.
			QualityMetamodel.resource.qualitymetamodel.ui.IQualitymetamodelBracketHandler bracketHandler = bracketHandlerProvider.getBracketHandler();
			String closingBracket = bracketHandler.getClosingBracket();
			if (bracketHandler.addedClosingBracket() && proposalString.endsWith(closingBracket)) {
				replacementLength += closingBracket.length();
			}
			result[i++] = new org.eclipse.jface.text.contentassist.CompletionProposal(proposalString, begin, replacementLength, proposalString.length(), image, displayString, info, proposalString);
		}
		return result;
	}
	
	public org.eclipse.jface.text.contentassist.IContextInformation[] computeContextInformation(org.eclipse.jface.text.ITextViewer viewer, int offset) {
		return null;
	}
	
	public char[] getCompletionProposalAutoActivationCharacters() {
		return null;
	}
	
	public char[] getContextInformationAutoActivationCharacters() {
		return null;
	}
	
	public org.eclipse.jface.text.contentassist.IContextInformationValidator getContextInformationValidator() {
		return null;
	}
	
	public String getErrorMessage() {
		return null;
	}
}
