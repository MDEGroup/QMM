/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package QualityMetamodel.resource.qualitymetamodel.mopp;

/**
 * A representation for a range in a document where a structural feature (e.g., a
 * reference) is expected.
 */
public class QualitymetamodelExpectedStructuralFeature extends QualityMetamodel.resource.qualitymetamodel.mopp.QualitymetamodelAbstractExpectedElement {
	
	private QualityMetamodel.resource.qualitymetamodel.grammar.QualitymetamodelPlaceholder placeholder;
	
	public QualitymetamodelExpectedStructuralFeature(QualityMetamodel.resource.qualitymetamodel.grammar.QualitymetamodelPlaceholder placeholder) {
		super(placeholder.getMetaclass());
		this.placeholder = placeholder;
	}
	
	public org.eclipse.emf.ecore.EStructuralFeature getFeature() {
		return placeholder.getFeature();
	}
	
	/**
	 * Returns the expected placeholder.
	 */
	public QualityMetamodel.resource.qualitymetamodel.grammar.QualitymetamodelSyntaxElement getSymtaxElement() {
		return placeholder;
	}
	
	public String getTokenName() {
		return placeholder.getTokenName();
	}
	
	public java.util.Set<String> getTokenNames() {
		return java.util.Collections.singleton(getTokenName());
	}
	
	public String toString() {
		return "EFeature " + getFeature().getEContainingClass().getName() + "." + getFeature().getName();
	}
	
	public boolean equals(Object o) {
		if (o instanceof QualitymetamodelExpectedStructuralFeature) {
			return getFeature().equals(((QualitymetamodelExpectedStructuralFeature) o).getFeature());
		}
		return false;
	}
	@Override	
	public int hashCode() {
		return getFeature().hashCode();
	}
	
}
