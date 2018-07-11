/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package QualityMetamodel.resource.qualitymetamodel.ui;

public class QualitymetamodelOutlinePageTypeSortingAction extends QualityMetamodel.resource.qualitymetamodel.ui.AbstractQualitymetamodelOutlinePageAction {
	
	public QualitymetamodelOutlinePageTypeSortingAction(QualityMetamodel.resource.qualitymetamodel.ui.QualitymetamodelOutlinePageTreeViewer treeViewer) {
		super(treeViewer, "Group types", org.eclipse.jface.action.IAction.AS_CHECK_BOX);
		initialize("icons/group_types_icon.gif");
	}
	
	public void runInternal(boolean on) {
		getTreeViewerComparator().setGroupTypes(on);
		getTreeViewer().refresh();
	}
	
}
