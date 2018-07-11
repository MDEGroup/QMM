/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package QualityMetamodel.resource.qualitymetamodel.grammar;

/**
 * A class to represent boolean terminals in a grammar.
 */
public class QualitymetamodelBooleanTerminal extends QualityMetamodel.resource.qualitymetamodel.grammar.QualitymetamodelTerminal {
	
	private String trueLiteral;
	private String falseLiteral;
	
	public QualitymetamodelBooleanTerminal(org.eclipse.emf.ecore.EStructuralFeature attribute, String trueLiteral, String falseLiteral, QualityMetamodel.resource.qualitymetamodel.grammar.QualitymetamodelCardinality cardinality, int mandatoryOccurrencesAfter) {
		super(attribute, cardinality, mandatoryOccurrencesAfter);
		assert attribute instanceof org.eclipse.emf.ecore.EAttribute;
		this.trueLiteral = trueLiteral;
		this.falseLiteral = falseLiteral;
	}
	
	public String getTrueLiteral() {
		return trueLiteral;
	}
	
	public String getFalseLiteral() {
		return falseLiteral;
	}
	
	public org.eclipse.emf.ecore.EAttribute getAttribute() {
		return (org.eclipse.emf.ecore.EAttribute) getFeature();
	}
	
}
