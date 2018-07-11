/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package QualityMetamodel.resource.qualitymetamodel.mopp;

public class QualitymetamodelMetaInformation implements QualityMetamodel.resource.qualitymetamodel.IQualitymetamodelMetaInformation {
	
	public String getSyntaxName() {
		return "qualitymetamodel";
	}
	
	public String getURI() {
		return "http://www.univaq.disim.it/mde/qualitymm";
	}
	
	public QualityMetamodel.resource.qualitymetamodel.IQualitymetamodelTextScanner createLexer() {
		return new QualityMetamodel.resource.qualitymetamodel.mopp.QualitymetamodelAntlrScanner(new QualityMetamodel.resource.qualitymetamodel.mopp.QualitymetamodelLexer());
	}
	
	public QualityMetamodel.resource.qualitymetamodel.IQualitymetamodelTextParser createParser(java.io.InputStream inputStream, String encoding) {
		return new QualityMetamodel.resource.qualitymetamodel.mopp.QualitymetamodelParser().createInstance(inputStream, encoding);
	}
	
	public QualityMetamodel.resource.qualitymetamodel.IQualitymetamodelTextPrinter createPrinter(java.io.OutputStream outputStream, QualityMetamodel.resource.qualitymetamodel.IQualitymetamodelTextResource resource) {
		return new QualityMetamodel.resource.qualitymetamodel.mopp.QualitymetamodelPrinter2(outputStream, resource);
	}
	
	public org.eclipse.emf.ecore.EClass[] getClassesWithSyntax() {
		return new QualityMetamodel.resource.qualitymetamodel.mopp.QualitymetamodelSyntaxCoverageInformationProvider().getClassesWithSyntax();
	}
	
	public org.eclipse.emf.ecore.EClass[] getStartSymbols() {
		return new QualityMetamodel.resource.qualitymetamodel.mopp.QualitymetamodelSyntaxCoverageInformationProvider().getStartSymbols();
	}
	
	public QualityMetamodel.resource.qualitymetamodel.IQualitymetamodelReferenceResolverSwitch getReferenceResolverSwitch() {
		return new QualityMetamodel.resource.qualitymetamodel.mopp.QualitymetamodelReferenceResolverSwitch();
	}
	
	public QualityMetamodel.resource.qualitymetamodel.IQualitymetamodelTokenResolverFactory getTokenResolverFactory() {
		return new QualityMetamodel.resource.qualitymetamodel.mopp.QualitymetamodelTokenResolverFactory();
	}
	
	public String getPathToCSDefinition() {
		return "qualityModel/model/qualityMetamodel.cs";
	}
	
	public String[] getTokenNames() {
		return QualityMetamodel.resource.qualitymetamodel.mopp.QualitymetamodelParser.tokenNames;
	}
	
	public QualityMetamodel.resource.qualitymetamodel.IQualitymetamodelTokenStyle getDefaultTokenStyle(String tokenName) {
		return new QualityMetamodel.resource.qualitymetamodel.mopp.QualitymetamodelTokenStyleInformationProvider().getDefaultTokenStyle(tokenName);
	}
	
	public java.util.Collection<QualityMetamodel.resource.qualitymetamodel.IQualitymetamodelBracketPair> getBracketPairs() {
		return new QualityMetamodel.resource.qualitymetamodel.mopp.QualitymetamodelBracketInformationProvider().getBracketPairs();
	}
	
	public org.eclipse.emf.ecore.EClass[] getFoldableClasses() {
		return new QualityMetamodel.resource.qualitymetamodel.mopp.QualitymetamodelFoldingInformationProvider().getFoldableClasses();
	}
	
	public org.eclipse.emf.ecore.resource.Resource.Factory createResourceFactory() {
		return new QualityMetamodel.resource.qualitymetamodel.mopp.QualitymetamodelResourceFactory();
	}
	
	public QualityMetamodel.resource.qualitymetamodel.mopp.QualitymetamodelNewFileContentProvider getNewFileContentProvider() {
		return new QualityMetamodel.resource.qualitymetamodel.mopp.QualitymetamodelNewFileContentProvider();
	}
	
	public void registerResourceFactory() {
		org.eclipse.emf.ecore.resource.Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(getSyntaxName(), new QualityMetamodel.resource.qualitymetamodel.mopp.QualitymetamodelResourceFactory());
	}
	
	/**
	 * Returns the key of the option that can be used to register a preprocessor that
	 * is used as a pipe when loading resources. This key is language-specific. To
	 * register one preprocessor for multiple resource types, it must be registered
	 * individually using all keys.
	 */
	public String getInputStreamPreprocessorProviderOptionKey() {
		return getSyntaxName() + "_" + "INPUT_STREAM_PREPROCESSOR_PROVIDER";
	}
	
	/**
	 * Returns the key of the option that can be used to register a post-processors
	 * that are invoked after loading resources. This key is language-specific. To
	 * register one post-processor for multiple resource types, it must be registered
	 * individually using all keys.
	 */
	public String getResourcePostProcessorProviderOptionKey() {
		return getSyntaxName() + "_" + "RESOURCE_POSTPROCESSOR_PROVIDER";
	}
	
	public String getLaunchConfigurationType() {
		return "QualityMetamodel.resource.qualitymetamodel.ui.launchConfigurationType";
	}
	
	public QualityMetamodel.resource.qualitymetamodel.IQualitymetamodelNameProvider createNameProvider() {
		return new QualityMetamodel.resource.qualitymetamodel.analysis.QualitymetamodelDefaultNameProvider();
	}
	
	public String[] getSyntaxHighlightableTokenNames() {
		QualityMetamodel.resource.qualitymetamodel.mopp.QualitymetamodelAntlrTokenHelper tokenHelper = new QualityMetamodel.resource.qualitymetamodel.mopp.QualitymetamodelAntlrTokenHelper();
		java.util.List<String> highlightableTokens = new java.util.ArrayList<String>();
		String[] parserTokenNames = getTokenNames();
		for (int i = 0; i < parserTokenNames.length; i++) {
			// If ANTLR is used we need to normalize the token names
			if (!tokenHelper.canBeUsedForSyntaxHighlighting(i)) {
				continue;
			}
			String tokenName = tokenHelper.getTokenName(parserTokenNames, i);
			if (tokenName == null) {
				continue;
			}
			highlightableTokens.add(tokenName);
		}
		highlightableTokens.add(QualityMetamodel.resource.qualitymetamodel.mopp.QualitymetamodelTokenStyleInformationProvider.TASK_ITEM_TOKEN_NAME);
		return highlightableTokens.toArray(new String[highlightableTokens.size()]);
	}
	
}
