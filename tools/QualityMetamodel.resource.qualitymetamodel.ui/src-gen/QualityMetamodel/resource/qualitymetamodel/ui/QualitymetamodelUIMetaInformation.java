/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package QualityMetamodel.resource.qualitymetamodel.ui;

public class QualitymetamodelUIMetaInformation extends QualityMetamodel.resource.qualitymetamodel.mopp.QualitymetamodelMetaInformation {
	
	public QualityMetamodel.resource.qualitymetamodel.IQualitymetamodelHoverTextProvider getHoverTextProvider() {
		return new QualityMetamodel.resource.qualitymetamodel.ui.QualitymetamodelHoverTextProvider();
	}
	
	public QualityMetamodel.resource.qualitymetamodel.ui.QualitymetamodelImageProvider getImageProvider() {
		return QualityMetamodel.resource.qualitymetamodel.ui.QualitymetamodelImageProvider.INSTANCE;
	}
	
	public QualityMetamodel.resource.qualitymetamodel.ui.QualitymetamodelColorManager createColorManager() {
		return new QualityMetamodel.resource.qualitymetamodel.ui.QualitymetamodelColorManager();
	}
	
	/**
	 * @deprecated this method is only provided to preserve API compatibility. Use
	 * createTokenScanner(QualityMetamodel.resource.qualitymetamodel.IQualitymetamodelT
	 * extResource,
	 * QualityMetamodel.resource.qualitymetamodel.ui.QualitymetamodelColorManager)
	 * instead.
	 */
	public QualityMetamodel.resource.qualitymetamodel.ui.QualitymetamodelTokenScanner createTokenScanner(QualityMetamodel.resource.qualitymetamodel.ui.QualitymetamodelColorManager colorManager) {
		return createTokenScanner(null, colorManager);
	}
	
	public QualityMetamodel.resource.qualitymetamodel.ui.QualitymetamodelTokenScanner createTokenScanner(QualityMetamodel.resource.qualitymetamodel.IQualitymetamodelTextResource resource, QualityMetamodel.resource.qualitymetamodel.ui.QualitymetamodelColorManager colorManager) {
		return new QualityMetamodel.resource.qualitymetamodel.ui.QualitymetamodelTokenScanner(resource, colorManager);
	}
	
	public QualityMetamodel.resource.qualitymetamodel.ui.QualitymetamodelCodeCompletionHelper createCodeCompletionHelper() {
		return new QualityMetamodel.resource.qualitymetamodel.ui.QualitymetamodelCodeCompletionHelper();
	}
	
}
