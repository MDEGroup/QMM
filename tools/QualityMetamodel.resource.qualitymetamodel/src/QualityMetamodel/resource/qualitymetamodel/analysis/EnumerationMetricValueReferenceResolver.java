/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package QualityMetamodel.resource.qualitymetamodel.analysis;

public class EnumerationMetricValueReferenceResolver implements QualityMetamodel.resource.qualitymetamodel.IQualitymetamodelReferenceResolver<QualityMetamodel.EnumerationMetric, QualityMetamodel.EnumerationItem> {
	
	private QualityMetamodel.resource.qualitymetamodel.analysis.QualitymetamodelDefaultResolverDelegate<QualityMetamodel.EnumerationMetric, QualityMetamodel.EnumerationItem> delegate = new QualityMetamodel.resource.qualitymetamodel.analysis.QualitymetamodelDefaultResolverDelegate<QualityMetamodel.EnumerationMetric, QualityMetamodel.EnumerationItem>();
	
	public void resolve(String identifier, QualityMetamodel.EnumerationMetric container, org.eclipse.emf.ecore.EReference reference, int position, boolean resolveFuzzy, final QualityMetamodel.resource.qualitymetamodel.IQualitymetamodelReferenceResolveResult<QualityMetamodel.EnumerationItem> result) {
		delegate.resolve(identifier, container, reference, position, resolveFuzzy, result);
	}
	
	public String deResolve(QualityMetamodel.EnumerationItem element, QualityMetamodel.EnumerationMetric container, org.eclipse.emf.ecore.EReference reference) {
		return delegate.deResolve(element, container, reference);
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		// save options in a field or leave method empty if this resolver does not depend
		// on any option
	}
	
}
