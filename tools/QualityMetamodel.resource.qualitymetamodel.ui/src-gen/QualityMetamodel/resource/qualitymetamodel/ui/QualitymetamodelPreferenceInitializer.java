/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package QualityMetamodel.resource.qualitymetamodel.ui;

/**
 * A class used to initialize default preference values.
 */
public class QualitymetamodelPreferenceInitializer extends org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer {
	
	public void initializeDefaultPreferences() {
		
		initializeDefaultSyntaxHighlighting();
		initializeDefaultBrackets();
		
		org.eclipse.jface.preference.IPreferenceStore store = QualityMetamodel.resource.qualitymetamodel.ui.QualitymetamodelUIPlugin.getDefault().getPreferenceStore();
		// Set default value for matching brackets
		store.setDefault(QualityMetamodel.resource.qualitymetamodel.ui.QualitymetamodelPreferenceConstants.EDITOR_MATCHING_BRACKETS_COLOR, "192,192,192");
		store.setDefault(QualityMetamodel.resource.qualitymetamodel.ui.QualitymetamodelPreferenceConstants.EDITOR_MATCHING_BRACKETS_CHECKBOX, true);
		
	}
	
	private void initializeDefaultBrackets() {
		org.eclipse.jface.preference.IPreferenceStore store = QualityMetamodel.resource.qualitymetamodel.ui.QualitymetamodelUIPlugin.getDefault().getPreferenceStore();
		initializeDefaultBrackets(store, new QualityMetamodel.resource.qualitymetamodel.mopp.QualitymetamodelMetaInformation());
	}
	
	public void initializeDefaultSyntaxHighlighting() {
		org.eclipse.jface.preference.IPreferenceStore store = QualityMetamodel.resource.qualitymetamodel.ui.QualitymetamodelUIPlugin.getDefault().getPreferenceStore();
		initializeDefaultSyntaxHighlighting(store, new QualityMetamodel.resource.qualitymetamodel.mopp.QualitymetamodelMetaInformation());
	}
	
	private void initializeDefaultBrackets(org.eclipse.jface.preference.IPreferenceStore store, QualityMetamodel.resource.qualitymetamodel.IQualitymetamodelMetaInformation metaInformation) {
		String languageId = metaInformation.getSyntaxName();
		// set default brackets for ITextResource bracket set
		QualityMetamodel.resource.qualitymetamodel.ui.QualitymetamodelBracketSet bracketSet = new QualityMetamodel.resource.qualitymetamodel.ui.QualitymetamodelBracketSet(null, null);
		final java.util.Collection<QualityMetamodel.resource.qualitymetamodel.IQualitymetamodelBracketPair> bracketPairs = metaInformation.getBracketPairs();
		if (bracketPairs != null) {
			for (QualityMetamodel.resource.qualitymetamodel.IQualitymetamodelBracketPair bracketPair : bracketPairs) {
				bracketSet.addBracketPair(bracketPair.getOpeningBracket(), bracketPair.getClosingBracket(), bracketPair.isClosingEnabledInside());
			}
		}
		store.setDefault(languageId + QualityMetamodel.resource.qualitymetamodel.ui.QualitymetamodelPreferenceConstants.EDITOR_BRACKETS_SUFFIX, bracketSet.getBracketString());
	}
	
	private void initializeDefaultSyntaxHighlighting(org.eclipse.jface.preference.IPreferenceStore store, QualityMetamodel.resource.qualitymetamodel.mopp.QualitymetamodelMetaInformation metaInformation) {
		String languageId = metaInformation.getSyntaxName();
		String[] tokenNames = metaInformation.getSyntaxHighlightableTokenNames();
		if (tokenNames == null) {
			return;
		}
		for (int i = 0; i < tokenNames.length; i++) {
			String tokenName = tokenNames[i];
			QualityMetamodel.resource.qualitymetamodel.IQualitymetamodelTokenStyle style = metaInformation.getDefaultTokenStyle(tokenName);
			if (style != null) {
				String color = getColorString(style.getColorAsRGB());
				setProperties(store, languageId, tokenName, color, style.isBold(), true, style.isItalic(), style.isStrikethrough(), style.isUnderline());
			} else {
				setProperties(store, languageId, tokenName, "0,0,0", false, false, false, false, false);
			}
		}
	}
	
	private void setProperties(org.eclipse.jface.preference.IPreferenceStore store, String languageID, String tokenName, String color, boolean bold, boolean enable, boolean italic, boolean strikethrough, boolean underline) {
		store.setDefault(QualityMetamodel.resource.qualitymetamodel.ui.QualitymetamodelSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, QualityMetamodel.resource.qualitymetamodel.ui.QualitymetamodelSyntaxColoringHelper.StyleProperty.BOLD), bold);
		store.setDefault(QualityMetamodel.resource.qualitymetamodel.ui.QualitymetamodelSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, QualityMetamodel.resource.qualitymetamodel.ui.QualitymetamodelSyntaxColoringHelper.StyleProperty.COLOR), color);
		store.setDefault(QualityMetamodel.resource.qualitymetamodel.ui.QualitymetamodelSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, QualityMetamodel.resource.qualitymetamodel.ui.QualitymetamodelSyntaxColoringHelper.StyleProperty.ENABLE), enable);
		store.setDefault(QualityMetamodel.resource.qualitymetamodel.ui.QualitymetamodelSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, QualityMetamodel.resource.qualitymetamodel.ui.QualitymetamodelSyntaxColoringHelper.StyleProperty.ITALIC), italic);
		store.setDefault(QualityMetamodel.resource.qualitymetamodel.ui.QualitymetamodelSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, QualityMetamodel.resource.qualitymetamodel.ui.QualitymetamodelSyntaxColoringHelper.StyleProperty.STRIKETHROUGH), strikethrough);
		store.setDefault(QualityMetamodel.resource.qualitymetamodel.ui.QualitymetamodelSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, QualityMetamodel.resource.qualitymetamodel.ui.QualitymetamodelSyntaxColoringHelper.StyleProperty.UNDERLINE), underline);
	}
	
	private String getColorString(int[] colorAsRGB) {
		if (colorAsRGB == null) {
			return "0,0,0";
		}
		if (colorAsRGB.length != 3) {
			return "0,0,0";
		}
		return colorAsRGB[0] + "," +colorAsRGB[1] + ","+ colorAsRGB[2];
	}
}
