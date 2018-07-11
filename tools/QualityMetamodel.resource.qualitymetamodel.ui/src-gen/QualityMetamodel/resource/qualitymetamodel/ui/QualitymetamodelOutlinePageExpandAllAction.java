/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package QualityMetamodel.resource.qualitymetamodel.ui;

public class QualitymetamodelOutlinePageExpandAllAction extends QualityMetamodel.resource.qualitymetamodel.ui.AbstractQualitymetamodelOutlinePageAction {
	
	public QualitymetamodelOutlinePageExpandAllAction(QualityMetamodel.resource.qualitymetamodel.ui.QualitymetamodelOutlinePageTreeViewer treeViewer) {
		super(treeViewer, "Expand all", org.eclipse.jface.action.IAction.AS_PUSH_BUTTON);
		initialize("icons/expand_all_icon.gif");
	}
	
	public void runInternal(boolean on) {
		if (on) {
			getTreeViewer().expandAll();
		}
	}
	
	public boolean keepState() {
		return false;
	}
	
}
