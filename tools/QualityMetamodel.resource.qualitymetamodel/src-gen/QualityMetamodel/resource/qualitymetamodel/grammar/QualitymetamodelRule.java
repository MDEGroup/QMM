/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package QualityMetamodel.resource.qualitymetamodel.grammar;

/**
 * A class to represent a rules in the grammar.
 */
public class QualitymetamodelRule extends QualityMetamodel.resource.qualitymetamodel.grammar.QualitymetamodelSyntaxElement {
	
	private final org.eclipse.emf.ecore.EClass metaclass;
	
	public QualitymetamodelRule(org.eclipse.emf.ecore.EClass metaclass, QualityMetamodel.resource.qualitymetamodel.grammar.QualitymetamodelChoice choice, QualityMetamodel.resource.qualitymetamodel.grammar.QualitymetamodelCardinality cardinality) {
		super(cardinality, new QualityMetamodel.resource.qualitymetamodel.grammar.QualitymetamodelSyntaxElement[] {choice});
		this.metaclass = metaclass;
	}
	
	public org.eclipse.emf.ecore.EClass getMetaclass() {
		return metaclass;
	}
	
	public QualityMetamodel.resource.qualitymetamodel.grammar.QualitymetamodelChoice getDefinition() {
		return (QualityMetamodel.resource.qualitymetamodel.grammar.QualitymetamodelChoice) getChildren()[0];
	}
	
}

