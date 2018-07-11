/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package QualityMetamodel.resource.qualitymetamodel;

/**
 * Implementors of this interface map identifiers to URIs. This is sometimes
 * necessary when resolving references depends on the resolution of others.
 * 
 * @param <ReferenceType> unused type parameter which is needed to implement
 * QualityMetamodel.resource.qualitymetamodel.IQualitymetamodelReferenceMapping.
 */
public interface IQualitymetamodelURIMapping<ReferenceType> extends QualityMetamodel.resource.qualitymetamodel.IQualitymetamodelReferenceMapping<ReferenceType> {
	
	/**
	 * Returns an alternative proxy URI that should follow EMF's default naming scheme
	 * such that it can be resolved by the default resolution mechanism that will be
	 * called on this URI (see <code>Resource.getEObject()</code>).
	 */
	public org.eclipse.emf.common.util.URI getTargetIdentifier();
	
}
