/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package QualityMetamodel.resource.qualitymetamodel.grammar;

/**
 * The abstract super class for all elements of a grammar. This class provides
 * methods to traverse the grammar rules.
 */
public abstract class QualitymetamodelSyntaxElement {
	
	private QualitymetamodelSyntaxElement[] children;
	private QualitymetamodelSyntaxElement parent;
	private QualityMetamodel.resource.qualitymetamodel.grammar.QualitymetamodelCardinality cardinality;
	
	public QualitymetamodelSyntaxElement(QualityMetamodel.resource.qualitymetamodel.grammar.QualitymetamodelCardinality cardinality, QualitymetamodelSyntaxElement[] children) {
		this.cardinality = cardinality;
		this.children = children;
		if (this.children != null) {
			for (QualitymetamodelSyntaxElement child : this.children) {
				child.setParent(this);
			}
		}
	}
	
	/**
	 * Sets the parent of this syntax element. This method must be invoked at most
	 * once.
	 */
	public void setParent(QualitymetamodelSyntaxElement parent) {
		assert this.parent == null;
		this.parent = parent;
	}
	
	/**
	 * Returns the parent of this syntax element. This parent is determined by the
	 * containment hierarchy in the CS model.
	 */
	public QualitymetamodelSyntaxElement getParent() {
		return parent;
	}
	
	public QualitymetamodelSyntaxElement[] getChildren() {
		if (children == null) {
			return new QualitymetamodelSyntaxElement[0];
		}
		return children;
	}
	
	public org.eclipse.emf.ecore.EClass getMetaclass() {
		return parent.getMetaclass();
	}
	
	public QualityMetamodel.resource.qualitymetamodel.grammar.QualitymetamodelCardinality getCardinality() {
		return cardinality;
	}
	
}
