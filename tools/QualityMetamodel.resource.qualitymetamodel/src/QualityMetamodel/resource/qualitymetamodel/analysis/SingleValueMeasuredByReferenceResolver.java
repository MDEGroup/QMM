/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package QualityMetamodel.resource.qualitymetamodel.analysis;

public class SingleValueMeasuredByReferenceResolver implements QualityMetamodel.resource.qualitymetamodel.IQualitymetamodelReferenceResolver<QualityMetamodel.SingleValue, QualityMetamodel.MetricProvider> {
	
	private QualityMetamodel.resource.qualitymetamodel.analysis.QualitymetamodelDefaultResolverDelegate<QualityMetamodel.SingleValue, QualityMetamodel.MetricProvider> delegate = new QualityMetamodel.resource.qualitymetamodel.analysis.QualitymetamodelDefaultResolverDelegate<QualityMetamodel.SingleValue, QualityMetamodel.MetricProvider>();
	
	public void resolve(String identifier, QualityMetamodel.SingleValue container, org.eclipse.emf.ecore.EReference reference, int position, boolean resolveFuzzy, final QualityMetamodel.resource.qualitymetamodel.IQualitymetamodelReferenceResolveResult<QualityMetamodel.MetricProvider> result) {
		delegate.resolve(identifier, container, reference, position, resolveFuzzy, result);
	}
	
	public String deResolve(QualityMetamodel.MetricProvider element, QualityMetamodel.SingleValue container, org.eclipse.emf.ecore.EReference reference) {
		return delegate.deResolve(element, container, reference);
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		// save options in a field or leave method empty if this resolver does not depend
		// on any option
	}
	
}
