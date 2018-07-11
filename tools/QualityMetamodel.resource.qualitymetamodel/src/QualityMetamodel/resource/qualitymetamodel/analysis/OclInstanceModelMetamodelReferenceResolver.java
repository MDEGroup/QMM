/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package QualityMetamodel.resource.qualitymetamodel.analysis;

public class OclInstanceModelMetamodelReferenceResolver implements QualityMetamodel.resource.qualitymetamodel.IQualitymetamodelReferenceResolver<QualityMetamodel.QMM_OCL.OclInstanceModel, QualityMetamodel.QMM_OCL.OclMetamodel> {
	
	private QualityMetamodel.resource.qualitymetamodel.analysis.QualitymetamodelDefaultResolverDelegate<QualityMetamodel.QMM_OCL.OclInstanceModel, QualityMetamodel.QMM_OCL.OclMetamodel> delegate = new QualityMetamodel.resource.qualitymetamodel.analysis.QualitymetamodelDefaultResolverDelegate<QualityMetamodel.QMM_OCL.OclInstanceModel, QualityMetamodel.QMM_OCL.OclMetamodel>();
	
	public void resolve(String identifier, QualityMetamodel.QMM_OCL.OclInstanceModel container, org.eclipse.emf.ecore.EReference reference, int position, boolean resolveFuzzy, final QualityMetamodel.resource.qualitymetamodel.IQualitymetamodelReferenceResolveResult<QualityMetamodel.QMM_OCL.OclMetamodel> result) {
		delegate.resolve(identifier, container, reference, position, resolveFuzzy, result);
	}
	
	public String deResolve(QualityMetamodel.QMM_OCL.OclMetamodel element, QualityMetamodel.QMM_OCL.OclInstanceModel container, org.eclipse.emf.ecore.EReference reference) {
		return delegate.deResolve(element, container, reference);
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		// save options in a field or leave method empty if this resolver does not depend
		// on any option
	}
	
}
