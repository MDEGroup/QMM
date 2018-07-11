/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package QualityMetamodel.resource.qualitymetamodel.analysis;

public class VariableExpReferredVariableReferenceResolver implements QualityMetamodel.resource.qualitymetamodel.IQualitymetamodelReferenceResolver<QualityMetamodel.QMM_OCL.VariableExp, QualityMetamodel.QMM_OCL.VariableDeclaration> {
	
	private QualityMetamodel.resource.qualitymetamodel.analysis.QualitymetamodelDefaultResolverDelegate<QualityMetamodel.QMM_OCL.VariableExp, QualityMetamodel.QMM_OCL.VariableDeclaration> delegate = new QualityMetamodel.resource.qualitymetamodel.analysis.QualitymetamodelDefaultResolverDelegate<QualityMetamodel.QMM_OCL.VariableExp, QualityMetamodel.QMM_OCL.VariableDeclaration>();
	
	public void resolve(String identifier, QualityMetamodel.QMM_OCL.VariableExp container, org.eclipse.emf.ecore.EReference reference, int position, boolean resolveFuzzy, final QualityMetamodel.resource.qualitymetamodel.IQualitymetamodelReferenceResolveResult<QualityMetamodel.QMM_OCL.VariableDeclaration> result) {
		delegate.resolve(identifier, container, reference, position, resolveFuzzy, result);
	}
	
	public String deResolve(QualityMetamodel.QMM_OCL.VariableDeclaration element, QualityMetamodel.QMM_OCL.VariableExp container, org.eclipse.emf.ecore.EReference reference) {
		return delegate.deResolve(element, container, reference);
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		// save options in a field or leave method empty if this resolver does not depend
		// on any option
	}
	
}
