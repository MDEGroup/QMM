/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package QualityMetamodel.resource.qualitymetamodel.analysis;

public class OperationAggregatedValuesReferenceResolver implements QualityMetamodel.resource.qualitymetamodel.IQualitymetamodelReferenceResolver<QualityMetamodel.Operation, QualityMetamodel.Value> {
	
	private QualityMetamodel.resource.qualitymetamodel.analysis.QualitymetamodelDefaultResolverDelegate<QualityMetamodel.Operation, QualityMetamodel.Value> delegate = new QualityMetamodel.resource.qualitymetamodel.analysis.QualitymetamodelDefaultResolverDelegate<QualityMetamodel.Operation, QualityMetamodel.Value>();
	
	public void resolve(String identifier, QualityMetamodel.Operation container, org.eclipse.emf.ecore.EReference reference, int position, boolean resolveFuzzy, final QualityMetamodel.resource.qualitymetamodel.IQualitymetamodelReferenceResolveResult<QualityMetamodel.Value> result) {
		delegate.resolve(identifier, container, reference, position, resolveFuzzy, result);
	}
	
	public String deResolve(QualityMetamodel.Value element, QualityMetamodel.Operation container, org.eclipse.emf.ecore.EReference reference) {
		return delegate.deResolve(element, container, reference);
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		// save options in a field or leave method empty if this resolver does not depend
		// on any option
	}
	
}
