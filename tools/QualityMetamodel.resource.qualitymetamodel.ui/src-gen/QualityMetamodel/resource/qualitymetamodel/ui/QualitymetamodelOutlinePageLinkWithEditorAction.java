/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package QualityMetamodel.resource.qualitymetamodel.ui;

public class QualitymetamodelOutlinePageLinkWithEditorAction extends QualityMetamodel.resource.qualitymetamodel.ui.AbstractQualitymetamodelOutlinePageAction {
	
	public QualitymetamodelOutlinePageLinkWithEditorAction(QualityMetamodel.resource.qualitymetamodel.ui.QualitymetamodelOutlinePageTreeViewer treeViewer) {
		super(treeViewer, "Link with Editor", org.eclipse.jface.action.IAction.AS_CHECK_BOX);
		initialize("icons/link_with_editor_icon.gif");
	}
	
	public void runInternal(boolean on) {
		getTreeViewer().setLinkWithEditor(on);
	}
	
}
