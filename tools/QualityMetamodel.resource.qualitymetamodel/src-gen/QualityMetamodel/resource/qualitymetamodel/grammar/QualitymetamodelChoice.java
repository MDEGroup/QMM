/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package QualityMetamodel.resource.qualitymetamodel.grammar;

public class QualitymetamodelChoice extends QualityMetamodel.resource.qualitymetamodel.grammar.QualitymetamodelSyntaxElement {
	
	public QualitymetamodelChoice(QualityMetamodel.resource.qualitymetamodel.grammar.QualitymetamodelCardinality cardinality, QualityMetamodel.resource.qualitymetamodel.grammar.QualitymetamodelSyntaxElement... choices) {
		super(cardinality, choices);
	}
	
	public String toString() {
		return QualityMetamodel.resource.qualitymetamodel.util.QualitymetamodelStringUtil.explode(getChildren(), "|");
	}
	
}
