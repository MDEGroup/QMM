/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package QualityMetamodel.resource.qualitymetamodel.grammar;

public class QualitymetamodelSequence extends QualityMetamodel.resource.qualitymetamodel.grammar.QualitymetamodelSyntaxElement {
	
	public QualitymetamodelSequence(QualityMetamodel.resource.qualitymetamodel.grammar.QualitymetamodelCardinality cardinality, QualityMetamodel.resource.qualitymetamodel.grammar.QualitymetamodelSyntaxElement... elements) {
		super(cardinality, elements);
	}
	
	public String toString() {
		return QualityMetamodel.resource.qualitymetamodel.util.QualitymetamodelStringUtil.explode(getChildren(), " ");
	}
	
}
