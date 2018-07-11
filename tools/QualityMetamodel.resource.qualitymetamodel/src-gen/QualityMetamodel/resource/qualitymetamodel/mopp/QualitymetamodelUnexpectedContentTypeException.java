/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package QualityMetamodel.resource.qualitymetamodel.mopp;

/**
 * An Excpetion to represent invalid content types for parser instances.
 * 
 * @see
 * QualityMetamodel.resource.qualitymetamodel.IQualitymetamodelOptions.RESOURCE_CON
 * TENT_TYPE
 */
public class QualitymetamodelUnexpectedContentTypeException extends org.antlr.runtime3_4_0.RecognitionException {
	
	private static final long serialVersionUID = 4791359811519433999L;
	
	private Object contentType = null;
	
	public  QualitymetamodelUnexpectedContentTypeException(Object contentType) {
		this.contentType = contentType;
	}
	
	public Object getContentType() {
		return contentType;
	}
	
}
