/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package QualityMetamodel.resource.qualitymetamodel.grammar;

public class QualitymetamodelLineBreak extends QualityMetamodel.resource.qualitymetamodel.grammar.QualitymetamodelFormattingElement {
	
	private final int tabs;
	
	public QualitymetamodelLineBreak(QualityMetamodel.resource.qualitymetamodel.grammar.QualitymetamodelCardinality cardinality, int tabs) {
		super(cardinality);
		this.tabs = tabs;
	}
	
	public int getTabs() {
		return tabs;
	}
	
	public String toString() {
		return "!" + getTabs();
	}
	
}
