/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package QualityMetamodel.resource.qualitymetamodel.ui;

public class QualitymetamodelOutlinePageLexicalSortingAction extends QualityMetamodel.resource.qualitymetamodel.ui.AbstractQualitymetamodelOutlinePageAction {
	
	public QualitymetamodelOutlinePageLexicalSortingAction(QualityMetamodel.resource.qualitymetamodel.ui.QualitymetamodelOutlinePageTreeViewer treeViewer) {
		super(treeViewer, "Sort alphabetically", org.eclipse.jface.action.IAction.AS_CHECK_BOX);
		initialize("icons/sort_lexically_icon.gif");
	}
	
	public void runInternal(boolean on) {
		getTreeViewerComparator().setSortLexically(on);
		getTreeViewer().refresh();
	}
	
}
