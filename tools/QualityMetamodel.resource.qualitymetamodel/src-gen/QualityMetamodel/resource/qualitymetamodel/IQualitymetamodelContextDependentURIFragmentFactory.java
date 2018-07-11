/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package QualityMetamodel.resource.qualitymetamodel;

/**
 * An interface for factories to create instances of
 * QualityMetamodel.resource.qualitymetamodel.IQualitymetamodelContextDependentURIF
 * ragment.
 * 
 * @param <ContainerType> the type of the class containing the reference to be
 * resolved
 * @param <ReferenceType> the type of the reference to be resolved
 */
public interface IQualitymetamodelContextDependentURIFragmentFactory<ContainerType extends org.eclipse.emf.ecore.EObject, ReferenceType extends org.eclipse.emf.ecore.EObject> {
	
	/**
	 * Create a new instance of the
	 * QualityMetamodel.resource.qualitymetamodel.IQualitymetamodelContextDependentURIF
	 * ragment interface.
	 * 
	 * @param identifier the identifier that references an Object
	 * @param container the object that contains the reference
	 * @param reference the reference itself
	 * @param positionInReference the position of the identifier (if the reference is
	 * multiple)
	 * @param proxy the proxy that will be resolved later to the actual EObject
	 * 
	 * @return the new instance of
	 * QualityMetamodel.resource.qualitymetamodel.IQualitymetamodelContextDependentURIF
	 * ragment
	 */
	public QualityMetamodel.resource.qualitymetamodel.IQualitymetamodelContextDependentURIFragment<?> create(String identifier, ContainerType container, org.eclipse.emf.ecore.EReference reference, int positionInReference, org.eclipse.emf.ecore.EObject proxy);
}
