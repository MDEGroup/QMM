/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package QualityMetamodel.resource.qualitymetamodel.mopp;

public class QualitymetamodelFoldingInformationProvider {
	
	public org.eclipse.emf.ecore.EClass[] getFoldableClasses() {
		return new org.eclipse.emf.ecore.EClass[] {
			QualityMetamodel.QMM_OCL.QMM_OCLPackage.eINSTANCE.getOclFeatureDefinition(),
		};
	}
	
}
