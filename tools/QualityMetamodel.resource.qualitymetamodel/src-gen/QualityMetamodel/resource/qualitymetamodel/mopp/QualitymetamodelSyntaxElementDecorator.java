/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package QualityMetamodel.resource.qualitymetamodel.mopp;

public class QualitymetamodelSyntaxElementDecorator {
	
	/**
	 * the syntax element to be decorated
	 */
	private QualityMetamodel.resource.qualitymetamodel.grammar.QualitymetamodelSyntaxElement decoratedElement;
	
	/**
	 * an array of child decorators (one decorator per child of the decorated syntax
	 * element
	 */
	private QualitymetamodelSyntaxElementDecorator[] childDecorators;
	
	/**
	 * a list of the indices that must be printed
	 */
	private java.util.List<Integer> indicesToPrint = new java.util.ArrayList<Integer>();
	
	public QualitymetamodelSyntaxElementDecorator(QualityMetamodel.resource.qualitymetamodel.grammar.QualitymetamodelSyntaxElement decoratedElement, QualitymetamodelSyntaxElementDecorator[] childDecorators) {
		super();
		this.decoratedElement = decoratedElement;
		this.childDecorators = childDecorators;
	}
	
	public void addIndexToPrint(Integer index) {
		indicesToPrint.add(index);
	}
	
	public QualityMetamodel.resource.qualitymetamodel.grammar.QualitymetamodelSyntaxElement getDecoratedElement() {
		return decoratedElement;
	}
	
	public QualitymetamodelSyntaxElementDecorator[] getChildDecorators() {
		return childDecorators;
	}
	
	public Integer getNextIndexToPrint() {
		if (indicesToPrint.size() == 0) {
			return null;
		}
		return indicesToPrint.remove(0);
	}
	
	public String toString() {
		return "" + getDecoratedElement();
	}
	
}
