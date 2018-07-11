/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package QualityMetamodel.resource.qualitymetamodel.util;

/**
 * Class QualitymetamodelTextResourceUtil can be used to perform common tasks on
 * text resources, such as loading and saving resources, as well as, checking them
 * for errors. This class is deprecated and has been replaced by
 * QualityMetamodel.resource.qualitymetamodel.util.QualitymetamodelResourceUtil.
 */
public class QualitymetamodelTextResourceUtil {
	
	/**
	 * Use
	 * QualityMetamodel.resource.qualitymetamodel.util.QualitymetamodelResourceUtil.get
	 * Resource() instead.
	 */
	@Deprecated	
	public static QualityMetamodel.resource.qualitymetamodel.mopp.QualitymetamodelResource getResource(org.eclipse.core.resources.IFile file) {
		return new QualityMetamodel.resource.qualitymetamodel.util.QualitymetamodelEclipseProxy().getResource(file);
	}
	
	/**
	 * Use
	 * QualityMetamodel.resource.qualitymetamodel.util.QualitymetamodelResourceUtil.get
	 * Resource() instead.
	 */
	@Deprecated	
	public static QualityMetamodel.resource.qualitymetamodel.mopp.QualitymetamodelResource getResource(java.io.File file, java.util.Map<?,?> options) {
		return QualityMetamodel.resource.qualitymetamodel.util.QualitymetamodelResourceUtil.getResource(file, options);
	}
	
	/**
	 * Use
	 * QualityMetamodel.resource.qualitymetamodel.util.QualitymetamodelResourceUtil.get
	 * Resource() instead.
	 */
	@Deprecated	
	public static QualityMetamodel.resource.qualitymetamodel.mopp.QualitymetamodelResource getResource(org.eclipse.emf.common.util.URI uri) {
		return QualityMetamodel.resource.qualitymetamodel.util.QualitymetamodelResourceUtil.getResource(uri);
	}
	
	/**
	 * Use
	 * QualityMetamodel.resource.qualitymetamodel.util.QualitymetamodelResourceUtil.get
	 * Resource() instead.
	 */
	@Deprecated	
	public static QualityMetamodel.resource.qualitymetamodel.mopp.QualitymetamodelResource getResource(org.eclipse.emf.common.util.URI uri, java.util.Map<?,?> options) {
		return QualityMetamodel.resource.qualitymetamodel.util.QualitymetamodelResourceUtil.getResource(uri, options);
	}
	
}
