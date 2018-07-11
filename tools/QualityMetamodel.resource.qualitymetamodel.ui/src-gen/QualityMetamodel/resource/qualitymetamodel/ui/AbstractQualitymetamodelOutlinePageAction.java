/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package QualityMetamodel.resource.qualitymetamodel.ui;

public abstract class AbstractQualitymetamodelOutlinePageAction extends org.eclipse.jface.action.Action {
	
	private String preferenceKey = this.getClass().getSimpleName() + ".isChecked";
	
	private QualityMetamodel.resource.qualitymetamodel.ui.QualitymetamodelOutlinePageTreeViewer treeViewer;
	
	public AbstractQualitymetamodelOutlinePageAction(QualityMetamodel.resource.qualitymetamodel.ui.QualitymetamodelOutlinePageTreeViewer treeViewer, String text, int style) {
		super(text, style);
		this.treeViewer = treeViewer;
	}
	
	public void initialize(String imagePath) {
		org.eclipse.jface.resource.ImageDescriptor descriptor = QualityMetamodel.resource.qualitymetamodel.ui.QualitymetamodelImageProvider.INSTANCE.getImageDescriptor(imagePath);
		setDisabledImageDescriptor(descriptor);
		setImageDescriptor(descriptor);
		setHoverImageDescriptor(descriptor);
		boolean checked = QualityMetamodel.resource.qualitymetamodel.ui.QualitymetamodelUIPlugin.getDefault().getPreferenceStore().getBoolean(preferenceKey);
		valueChanged(checked, false);
	}
	
	@Override	
	public void run() {
		if (keepState()) {
			valueChanged(isChecked(), true);
		} else {
			runBusy(true);
		}
	}
	
	public void runBusy(final boolean on) {
		org.eclipse.swt.custom.BusyIndicator.showWhile(org.eclipse.swt.widgets.Display.getCurrent(), new Runnable() {
			public void run() {
				runInternal(on);
			}
		});
	}
	
	public abstract void runInternal(boolean on);
	
	private void valueChanged(boolean on, boolean store) {
		setChecked(on);
		runBusy(on);
		if (store) {
			QualityMetamodel.resource.qualitymetamodel.ui.QualitymetamodelUIPlugin.getDefault().getPreferenceStore().setValue(preferenceKey, on);
		}
	}
	
	public boolean keepState() {
		return true;
	}
	
	public QualityMetamodel.resource.qualitymetamodel.ui.QualitymetamodelOutlinePageTreeViewer getTreeViewer() {
		return treeViewer;
	}
	
	public QualityMetamodel.resource.qualitymetamodel.ui.QualitymetamodelOutlinePageTreeViewerComparator getTreeViewerComparator() {
		return (QualityMetamodel.resource.qualitymetamodel.ui.QualitymetamodelOutlinePageTreeViewerComparator) treeViewer.getComparator();
	}
	
}
