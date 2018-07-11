/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package QualityMetamodel.resource.qualitymetamodel.mopp;

/**
 * A representation for a range in a document where a keyword (i.e., a static
 * string) is expected.
 */
public class QualitymetamodelExpectedCsString extends QualityMetamodel.resource.qualitymetamodel.mopp.QualitymetamodelAbstractExpectedElement {
	
	private QualityMetamodel.resource.qualitymetamodel.grammar.QualitymetamodelKeyword keyword;
	
	public QualitymetamodelExpectedCsString(QualityMetamodel.resource.qualitymetamodel.grammar.QualitymetamodelKeyword keyword) {
		super(keyword.getMetaclass());
		this.keyword = keyword;
	}
	
	public String getValue() {
		return keyword.getValue();
	}
	
	/**
	 * Returns the expected keyword.
	 */
	public QualityMetamodel.resource.qualitymetamodel.grammar.QualitymetamodelSyntaxElement getSymtaxElement() {
		return keyword;
	}
	
	public java.util.Set<String> getTokenNames() {
		return java.util.Collections.singleton("'" + getValue() + "'");
	}
	
	public String toString() {
		return "CsString \"" + getValue() + "\"";
	}
	
	public boolean equals(Object o) {
		if (o instanceof QualitymetamodelExpectedCsString) {
			return getValue().equals(((QualitymetamodelExpectedCsString) o).getValue());
		}
		return false;
	}
	
	@Override	
	public int hashCode() {
		return getValue().hashCode();
	}
	
}
