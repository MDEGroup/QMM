/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package QualityMetamodel.resource.qualitymetamodel.mopp;

/**
 * A representation for a range in a document where an enumeration literal (i.e.,
 * a set of static strings) is expected.
 */
public class QualitymetamodelExpectedEnumerationTerminal extends QualityMetamodel.resource.qualitymetamodel.mopp.QualitymetamodelAbstractExpectedElement {
	
	private QualityMetamodel.resource.qualitymetamodel.grammar.QualitymetamodelEnumerationTerminal enumerationTerminal;
	
	public QualitymetamodelExpectedEnumerationTerminal(QualityMetamodel.resource.qualitymetamodel.grammar.QualitymetamodelEnumerationTerminal enumerationTerminal) {
		super(enumerationTerminal.getMetaclass());
		this.enumerationTerminal = enumerationTerminal;
	}
	
	public java.util.Set<String> getTokenNames() {
		// EnumerationTerminals are associated with multiple tokens, one for each literal
		// that was mapped to a string
		java.util.Set<String> tokenNames = new java.util.LinkedHashSet<String>();
		java.util.Map<String, String> mapping = enumerationTerminal.getLiteralMapping();
		for (String literalName : mapping.keySet()) {
			String text = mapping.get(literalName);
			if (text != null && !"".equals(text)) {
				tokenNames.add("'" + text + "'");
			}
		}
		return tokenNames;
	}
	
	public QualityMetamodel.resource.qualitymetamodel.grammar.QualitymetamodelEnumerationTerminal getEnumerationTerminal() {
		return this.enumerationTerminal;
	}
	
	/**
	 * Returns the expected enumeration terminal.
	 */
	public QualityMetamodel.resource.qualitymetamodel.grammar.QualitymetamodelSyntaxElement getSymtaxElement() {
		return enumerationTerminal;
	}
	
	public String toString() {
		return "EnumTerminal \"" + getEnumerationTerminal() + "\"";
	}
	
}
