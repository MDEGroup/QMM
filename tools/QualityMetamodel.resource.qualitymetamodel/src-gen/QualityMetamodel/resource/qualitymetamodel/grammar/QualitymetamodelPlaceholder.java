/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package QualityMetamodel.resource.qualitymetamodel.grammar;

/**
 * A class to represent placeholders in a grammar.
 */
public class QualitymetamodelPlaceholder extends QualityMetamodel.resource.qualitymetamodel.grammar.QualitymetamodelTerminal {
	
	private final String tokenName;
	
	public QualitymetamodelPlaceholder(org.eclipse.emf.ecore.EStructuralFeature feature, String tokenName, QualityMetamodel.resource.qualitymetamodel.grammar.QualitymetamodelCardinality cardinality, int mandatoryOccurencesAfter) {
		super(feature, cardinality, mandatoryOccurencesAfter);
		this.tokenName = tokenName;
	}
	
	public String getTokenName() {
		return tokenName;
	}
	
}
