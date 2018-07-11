/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package QualityMetamodel.resource.qualitymetamodel.mopp;

/**
 * A representation for a range in a document where a boolean attribute is
 * expected.
 */
public class QualitymetamodelExpectedBooleanTerminal extends QualityMetamodel.resource.qualitymetamodel.mopp.QualitymetamodelAbstractExpectedElement {
	
	private QualityMetamodel.resource.qualitymetamodel.grammar.QualitymetamodelBooleanTerminal booleanTerminal;
	
	public QualitymetamodelExpectedBooleanTerminal(QualityMetamodel.resource.qualitymetamodel.grammar.QualitymetamodelBooleanTerminal booleanTerminal) {
		super(booleanTerminal.getMetaclass());
		this.booleanTerminal = booleanTerminal;
	}
	
	public QualityMetamodel.resource.qualitymetamodel.grammar.QualitymetamodelBooleanTerminal getBooleanTerminal() {
		return booleanTerminal;
	}
	
	/**
	 * Returns the expected boolean terminal.
	 */
	public QualityMetamodel.resource.qualitymetamodel.grammar.QualitymetamodelSyntaxElement getSymtaxElement() {
		return booleanTerminal;
	}
	
	private org.eclipse.emf.ecore.EStructuralFeature getFeature() {
		return booleanTerminal.getFeature();
	}
	
	public String toString() {
		return "EFeature " + getFeature().getEContainingClass().getName() + "." + getFeature().getName();
	}
	
	public boolean equals(Object o) {
		if (o instanceof QualitymetamodelExpectedBooleanTerminal) {
			return getFeature().equals(((QualitymetamodelExpectedBooleanTerminal) o).getFeature());
		}
		return false;
	}
	
	@Override	
	public int hashCode() {
		return getFeature().hashCode();
	}
	
	public java.util.Set<String> getTokenNames() {
		// BooleanTerminals are associated with two or one token(s)
		java.util.Set<String> tokenNames = new java.util.LinkedHashSet<String>(2);
		String trueLiteral = booleanTerminal.getTrueLiteral();
		if (!"".equals(trueLiteral)) {
			tokenNames.add("'" + trueLiteral + "'");
		}
		String falseLiteral = booleanTerminal.getFalseLiteral();
		if (!"".equals(falseLiteral)) {
			tokenNames.add("'" + falseLiteral + "'");
		}
		return tokenNames;
	}
	
}
