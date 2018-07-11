/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package QualityMetamodel.resource.qualitymetamodel.grammar;

public class QualitymetamodelWhiteSpace extends QualityMetamodel.resource.qualitymetamodel.grammar.QualitymetamodelFormattingElement {
	
	private final int amount;
	
	public QualitymetamodelWhiteSpace(int amount, QualityMetamodel.resource.qualitymetamodel.grammar.QualitymetamodelCardinality cardinality) {
		super(cardinality);
		this.amount = amount;
	}
	
	public int getAmount() {
		return amount;
	}
	
	public String toString() {
		return "#" + getAmount();
	}
	
}
