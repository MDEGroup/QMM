/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package QualityMetamodel.resource.qualitymetamodel.mopp;

public class QualitymetamodelProblem implements QualityMetamodel.resource.qualitymetamodel.IQualitymetamodelProblem {
	
	private String message;
	private QualityMetamodel.resource.qualitymetamodel.QualitymetamodelEProblemType type;
	private QualityMetamodel.resource.qualitymetamodel.QualitymetamodelEProblemSeverity severity;
	private java.util.Collection<QualityMetamodel.resource.qualitymetamodel.IQualitymetamodelQuickFix> quickFixes;
	
	public QualitymetamodelProblem(String message, QualityMetamodel.resource.qualitymetamodel.QualitymetamodelEProblemType type, QualityMetamodel.resource.qualitymetamodel.QualitymetamodelEProblemSeverity severity) {
		this(message, type, severity, java.util.Collections.<QualityMetamodel.resource.qualitymetamodel.IQualitymetamodelQuickFix>emptySet());
	}
	
	public QualitymetamodelProblem(String message, QualityMetamodel.resource.qualitymetamodel.QualitymetamodelEProblemType type, QualityMetamodel.resource.qualitymetamodel.QualitymetamodelEProblemSeverity severity, QualityMetamodel.resource.qualitymetamodel.IQualitymetamodelQuickFix quickFix) {
		this(message, type, severity, java.util.Collections.singleton(quickFix));
	}
	
	public QualitymetamodelProblem(String message, QualityMetamodel.resource.qualitymetamodel.QualitymetamodelEProblemType type, QualityMetamodel.resource.qualitymetamodel.QualitymetamodelEProblemSeverity severity, java.util.Collection<QualityMetamodel.resource.qualitymetamodel.IQualitymetamodelQuickFix> quickFixes) {
		super();
		this.message = message;
		this.type = type;
		this.severity = severity;
		this.quickFixes = new java.util.LinkedHashSet<QualityMetamodel.resource.qualitymetamodel.IQualitymetamodelQuickFix>();
		this.quickFixes.addAll(quickFixes);
	}
	
	public QualityMetamodel.resource.qualitymetamodel.QualitymetamodelEProblemType getType() {
		return type;
	}
	
	public QualityMetamodel.resource.qualitymetamodel.QualitymetamodelEProblemSeverity getSeverity() {
		return severity;
	}
	
	public String getMessage() {
		return message;
	}
	
	public java.util.Collection<QualityMetamodel.resource.qualitymetamodel.IQualitymetamodelQuickFix> getQuickFixes() {
		return quickFixes;
	}
	
}
