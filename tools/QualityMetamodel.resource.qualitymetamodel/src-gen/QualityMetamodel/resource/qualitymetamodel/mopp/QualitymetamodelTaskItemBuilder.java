/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package QualityMetamodel.resource.qualitymetamodel.mopp;

/**
 * The QualitymetamodelTaskItemBuilder is used to find task items in text
 * documents. The current implementation uses the generated lexer and the
 * TaskItemDetector to detect task items. This class is called by the
 * BuilderAdapter, which runs both this builder and the default builder that is
 * intended to be customized.
 */
public class QualitymetamodelTaskItemBuilder {
	
	public void build(org.eclipse.core.resources.IFile resource, org.eclipse.emf.ecore.resource.ResourceSet resourceSet, org.eclipse.core.runtime.IProgressMonitor monitor) {
		monitor.setTaskName("Searching for task items");
		new QualityMetamodel.resource.qualitymetamodel.mopp.QualitymetamodelMarkerHelper().removeAllMarkers(resource, org.eclipse.core.resources.IMarker.TASK);
		if (isInBinFolder(resource)) {
			return;
		}
		java.util.List<QualityMetamodel.resource.qualitymetamodel.mopp.QualitymetamodelTaskItem> taskItems = new java.util.ArrayList<QualityMetamodel.resource.qualitymetamodel.mopp.QualitymetamodelTaskItem>();
		QualityMetamodel.resource.qualitymetamodel.mopp.QualitymetamodelTaskItemDetector taskItemDetector = new QualityMetamodel.resource.qualitymetamodel.mopp.QualitymetamodelTaskItemDetector();
		try {
			java.io.InputStream inputStream = resource.getContents();
			String content = QualityMetamodel.resource.qualitymetamodel.util.QualitymetamodelStreamUtil.getContent(inputStream);
			QualityMetamodel.resource.qualitymetamodel.IQualitymetamodelTextScanner lexer = new QualityMetamodel.resource.qualitymetamodel.mopp.QualitymetamodelMetaInformation().createLexer();
			lexer.setText(content);
			
			QualityMetamodel.resource.qualitymetamodel.IQualitymetamodelTextToken nextToken = lexer.getNextToken();
			while (nextToken != null) {
				String text = nextToken.getText();
				taskItems.addAll(taskItemDetector.findTaskItems(text, nextToken.getLine(), nextToken.getOffset()));
				nextToken = lexer.getNextToken();
			}
		} catch (java.io.IOException e) {
			QualityMetamodel.resource.qualitymetamodel.mopp.QualitymetamodelPlugin.logError("Exception while searching for task items", e);
		} catch (org.eclipse.core.runtime.CoreException e) {
			QualityMetamodel.resource.qualitymetamodel.mopp.QualitymetamodelPlugin.logError("Exception while searching for task items", e);
		}
		
		for (QualityMetamodel.resource.qualitymetamodel.mopp.QualitymetamodelTaskItem taskItem : taskItems) {
			java.util.Map<String, Object> markerAttributes = new java.util.LinkedHashMap<String, Object>();
			markerAttributes.put(org.eclipse.core.resources.IMarker.USER_EDITABLE, false);
			markerAttributes.put(org.eclipse.core.resources.IMarker.DONE, false);
			markerAttributes.put(org.eclipse.core.resources.IMarker.LINE_NUMBER, taskItem.getLine());
			markerAttributes.put(org.eclipse.core.resources.IMarker.CHAR_START, taskItem.getCharStart());
			markerAttributes.put(org.eclipse.core.resources.IMarker.CHAR_END, taskItem.getCharEnd());
			markerAttributes.put(org.eclipse.core.resources.IMarker.MESSAGE, taskItem.getMessage());
			new QualityMetamodel.resource.qualitymetamodel.mopp.QualitymetamodelMarkerHelper().createMarker(resource, org.eclipse.core.resources.IMarker.TASK, markerAttributes);
		}
	}
	
	public String getBuilderMarkerId() {
		return org.eclipse.core.resources.IMarker.TASK;
	}
	
	public boolean isInBinFolder(org.eclipse.core.resources.IFile resource) {
		org.eclipse.core.resources.IContainer parent = resource.getParent();
		while (parent != null) {
			if ("bin".equals(parent.getName())) {
				return true;
			}
			parent = parent.getParent();
		}
		return false;
	}
	
}
