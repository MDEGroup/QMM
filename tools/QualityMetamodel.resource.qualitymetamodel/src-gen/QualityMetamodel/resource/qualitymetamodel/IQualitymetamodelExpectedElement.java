/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package QualityMetamodel.resource.qualitymetamodel;

/**
 * An element that is expected at a given position in a resource stream.
 */
public interface IQualitymetamodelExpectedElement {
	
	/**
	 * Returns the names of all tokens that are expected at the given position.
	 */
	public java.util.Set<String> getTokenNames();
	
	/**
	 * Returns the metaclass of the rule that contains the expected element.
	 */
	public org.eclipse.emf.ecore.EClass getRuleMetaclass();
	
	/**
	 * Returns the syntax element that is expected.
	 */
	public QualityMetamodel.resource.qualitymetamodel.grammar.QualitymetamodelSyntaxElement getSymtaxElement();
	
	/**
	 * Adds an element that is a valid follower for this element.
	 */
	public void addFollower(QualityMetamodel.resource.qualitymetamodel.IQualitymetamodelExpectedElement follower, QualityMetamodel.resource.qualitymetamodel.mopp.QualitymetamodelContainedFeature[] path);
	
	/**
	 * Returns all valid followers for this element. Each follower is represented by a
	 * pair of an expected elements and the containment trace that leads from the
	 * current element to the follower.
	 */
	public java.util.Collection<QualityMetamodel.resource.qualitymetamodel.util.QualitymetamodelPair<QualityMetamodel.resource.qualitymetamodel.IQualitymetamodelExpectedElement, QualityMetamodel.resource.qualitymetamodel.mopp.QualitymetamodelContainedFeature[]>> getFollowers();
	
}
