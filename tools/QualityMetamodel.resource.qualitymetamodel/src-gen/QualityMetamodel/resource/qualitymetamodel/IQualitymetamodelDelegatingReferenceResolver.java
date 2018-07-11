/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package QualityMetamodel.resource.qualitymetamodel;

/**
 * A delegating reference resolver is an extension of a normal reference resolver
 * that can be configured with another resolver that it may delegate method calls
 * to. This interface can be implemented by additional resolvers to customize
 * resolving using the load option ADDITIONAL_REFERENCE_RESOLVERS.
 * 
 * @see QualityMetamodel.resource.qualitymetamodel.IQualitymetamodelOptions
 */
public interface IQualitymetamodelDelegatingReferenceResolver<ContainerType extends org.eclipse.emf.ecore.EObject, ReferenceType extends org.eclipse.emf.ecore.EObject> extends QualityMetamodel.resource.qualitymetamodel.IQualitymetamodelReferenceResolver<ContainerType, ReferenceType> {
	
	/**
	 * Sets the delegate for this resolver.
	 */
	public void setDelegate(QualityMetamodel.resource.qualitymetamodel.IQualitymetamodelReferenceResolver<ContainerType, ReferenceType> delegate);
	
}
