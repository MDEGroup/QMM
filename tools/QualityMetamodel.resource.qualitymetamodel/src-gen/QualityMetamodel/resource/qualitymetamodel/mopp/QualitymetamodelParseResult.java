/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package QualityMetamodel.resource.qualitymetamodel.mopp;

public class QualitymetamodelParseResult implements QualityMetamodel.resource.qualitymetamodel.IQualitymetamodelParseResult {
	
	private org.eclipse.emf.ecore.EObject root;
	private java.util.Collection<QualityMetamodel.resource.qualitymetamodel.IQualitymetamodelCommand<QualityMetamodel.resource.qualitymetamodel.IQualitymetamodelTextResource>> commands = new java.util.ArrayList<QualityMetamodel.resource.qualitymetamodel.IQualitymetamodelCommand<QualityMetamodel.resource.qualitymetamodel.IQualitymetamodelTextResource>>();
	
	public QualitymetamodelParseResult() {
		super();
	}
	
	public void setRoot(org.eclipse.emf.ecore.EObject root) {
		this.root = root;
	}
	
	public org.eclipse.emf.ecore.EObject getRoot() {
		return root;
	}
	
	public java.util.Collection<QualityMetamodel.resource.qualitymetamodel.IQualitymetamodelCommand<QualityMetamodel.resource.qualitymetamodel.IQualitymetamodelTextResource>> getPostParseCommands() {
		return commands;
	}
	
}
