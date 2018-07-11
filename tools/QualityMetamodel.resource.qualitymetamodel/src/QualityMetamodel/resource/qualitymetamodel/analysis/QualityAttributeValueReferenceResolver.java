/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package QualityMetamodel.resource.qualitymetamodel.analysis;

public class QualityAttributeValueReferenceResolver implements QualityMetamodel.resource.qualitymetamodel.IQualitymetamodelReferenceResolver<QualityMetamodel.QualityAttribute, QualityMetamodel.Value> {
	
	private QualityMetamodel.resource.qualitymetamodel.analysis.QualitymetamodelDefaultResolverDelegate<QualityMetamodel.QualityAttribute, QualityMetamodel.Value> delegate = new QualityMetamodel.resource.qualitymetamodel.analysis.QualitymetamodelDefaultResolverDelegate<QualityMetamodel.QualityAttribute, QualityMetamodel.Value>();
	
	public void resolve(String identifier, QualityMetamodel.QualityAttribute container, org.eclipse.emf.ecore.EReference reference, int position, boolean resolveFuzzy, final QualityMetamodel.resource.qualitymetamodel.IQualitymetamodelReferenceResolveResult<QualityMetamodel.Value> result) {
		delegate.resolve(identifier, container, reference, position, resolveFuzzy, result);
	}
	
	public String deResolve(QualityMetamodel.Value element, QualityMetamodel.QualityAttribute container, org.eclipse.emf.ecore.EReference reference) {
		return delegate.deResolve(element, container, reference);
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		// save options in a field or leave method empty if this resolver does not depend
		// on any option
	}
	
}
