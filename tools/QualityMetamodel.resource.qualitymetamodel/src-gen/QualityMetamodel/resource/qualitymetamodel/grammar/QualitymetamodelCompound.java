/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package QualityMetamodel.resource.qualitymetamodel.grammar;

public class QualitymetamodelCompound extends QualityMetamodel.resource.qualitymetamodel.grammar.QualitymetamodelSyntaxElement {
	
	public QualitymetamodelCompound(QualityMetamodel.resource.qualitymetamodel.grammar.QualitymetamodelChoice choice, QualityMetamodel.resource.qualitymetamodel.grammar.QualitymetamodelCardinality cardinality) {
		super(cardinality, new QualityMetamodel.resource.qualitymetamodel.grammar.QualitymetamodelSyntaxElement[] {choice});
	}
	
	public String toString() {
		return "(" + getChildren()[0] + ")";
	}
	
}
