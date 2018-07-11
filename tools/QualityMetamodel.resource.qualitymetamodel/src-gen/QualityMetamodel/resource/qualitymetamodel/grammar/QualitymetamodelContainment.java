/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package QualityMetamodel.resource.qualitymetamodel.grammar;

public class QualitymetamodelContainment extends QualityMetamodel.resource.qualitymetamodel.grammar.QualitymetamodelTerminal {
	
	private final org.eclipse.emf.ecore.EClass[] allowedTypes;
	
	public QualitymetamodelContainment(org.eclipse.emf.ecore.EStructuralFeature feature, QualityMetamodel.resource.qualitymetamodel.grammar.QualitymetamodelCardinality cardinality, org.eclipse.emf.ecore.EClass[] allowedTypes, int mandatoryOccurencesAfter) {
		super(feature, cardinality, mandatoryOccurencesAfter);
		this.allowedTypes = allowedTypes;
	}
	
	public org.eclipse.emf.ecore.EClass[] getAllowedTypes() {
		return allowedTypes;
	}
	
	public String toString() {
		String typeRestrictions = null;
		if (allowedTypes != null && allowedTypes.length > 0) {
			typeRestrictions = QualityMetamodel.resource.qualitymetamodel.util.QualitymetamodelStringUtil.explode(allowedTypes, ", ", new QualityMetamodel.resource.qualitymetamodel.IQualitymetamodelFunction1<String, org.eclipse.emf.ecore.EClass>() {
				public String execute(org.eclipse.emf.ecore.EClass eClass) {
					return eClass.getName();
				}
			});
		}
		return getFeature().getName() + (typeRestrictions == null ? "" : "[" + typeRestrictions + "]");
	}
	
}
