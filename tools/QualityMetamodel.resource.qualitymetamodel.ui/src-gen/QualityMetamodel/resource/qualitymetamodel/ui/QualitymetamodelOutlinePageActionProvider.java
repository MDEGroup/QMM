/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package QualityMetamodel.resource.qualitymetamodel.ui;

public class QualitymetamodelOutlinePageActionProvider {
	
	public java.util.List<org.eclipse.jface.action.IAction> getActions(QualityMetamodel.resource.qualitymetamodel.ui.QualitymetamodelOutlinePageTreeViewer treeViewer) {
		// To add custom actions to the outline view, set the
		// 'overrideOutlinePageActionProvider' option to <code>false</code> and modify
		// this method.
		java.util.List<org.eclipse.jface.action.IAction> defaultActions = new java.util.ArrayList<org.eclipse.jface.action.IAction>();
		defaultActions.add(new QualityMetamodel.resource.qualitymetamodel.ui.QualitymetamodelOutlinePageLinkWithEditorAction(treeViewer));
		defaultActions.add(new QualityMetamodel.resource.qualitymetamodel.ui.QualitymetamodelOutlinePageCollapseAllAction(treeViewer));
		defaultActions.add(new QualityMetamodel.resource.qualitymetamodel.ui.QualitymetamodelOutlinePageExpandAllAction(treeViewer));
		defaultActions.add(new QualityMetamodel.resource.qualitymetamodel.ui.QualitymetamodelOutlinePageAutoExpandAction(treeViewer));
		defaultActions.add(new QualityMetamodel.resource.qualitymetamodel.ui.QualitymetamodelOutlinePageLexicalSortingAction(treeViewer));
		defaultActions.add(new QualityMetamodel.resource.qualitymetamodel.ui.QualitymetamodelOutlinePageTypeSortingAction(treeViewer));
		return defaultActions;
	}
	
}
