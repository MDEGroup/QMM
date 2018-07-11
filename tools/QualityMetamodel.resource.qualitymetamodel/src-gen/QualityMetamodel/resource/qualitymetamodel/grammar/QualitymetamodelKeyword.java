/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package QualityMetamodel.resource.qualitymetamodel.grammar;

/**
 * A class to represent a keyword in the grammar.
 */
public class QualitymetamodelKeyword extends QualityMetamodel.resource.qualitymetamodel.grammar.QualitymetamodelSyntaxElement {
	
	private final String value;
	
	public QualitymetamodelKeyword(String value, QualityMetamodel.resource.qualitymetamodel.grammar.QualitymetamodelCardinality cardinality) {
		super(cardinality, null);
		this.value = value;
	}
	
	public String getValue() {
		return value;
	}
	
	public String toString() {
		return value;
	}
	
}
