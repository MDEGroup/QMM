/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package QualityMetamodel.resource.qualitymetamodel;

public interface IQualitymetamodelProblem {
	public String getMessage();
	public QualityMetamodel.resource.qualitymetamodel.QualitymetamodelEProblemSeverity getSeverity();
	public QualityMetamodel.resource.qualitymetamodel.QualitymetamodelEProblemType getType();
	public java.util.Collection<QualityMetamodel.resource.qualitymetamodel.IQualitymetamodelQuickFix> getQuickFixes();
}
