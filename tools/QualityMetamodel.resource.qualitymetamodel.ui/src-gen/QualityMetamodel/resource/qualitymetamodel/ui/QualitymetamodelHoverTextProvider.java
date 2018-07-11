/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package QualityMetamodel.resource.qualitymetamodel.ui;

public class QualitymetamodelHoverTextProvider implements QualityMetamodel.resource.qualitymetamodel.IQualitymetamodelHoverTextProvider {
	
	private QualityMetamodel.resource.qualitymetamodel.ui.QualitymetamodelDefaultHoverTextProvider defaultProvider = new QualityMetamodel.resource.qualitymetamodel.ui.QualitymetamodelDefaultHoverTextProvider();
	
	public String getHoverText(org.eclipse.emf.ecore.EObject container, org.eclipse.emf.ecore.EObject referencedObject) {
		// Set option overrideHoverTextProvider to false and customize this method to
		// obtain custom hover texts.
		return defaultProvider.getHoverText(referencedObject);
	}
	
	public String getHoverText(org.eclipse.emf.ecore.EObject object) {
		// Set option overrideHoverTextProvider to false and customize this method to
		// obtain custom hover texts.
		return defaultProvider.getHoverText(object);
	}
	
}
