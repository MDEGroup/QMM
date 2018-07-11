/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package QualityMetamodel.resource.qualitymetamodel.mopp;

/**
 * Abstract super class for all expected elements. Provides methods to add
 * followers.
 */
public abstract class QualitymetamodelAbstractExpectedElement implements QualityMetamodel.resource.qualitymetamodel.IQualitymetamodelExpectedElement {
	
	private org.eclipse.emf.ecore.EClass ruleMetaclass;
	
	private java.util.Set<QualityMetamodel.resource.qualitymetamodel.util.QualitymetamodelPair<QualityMetamodel.resource.qualitymetamodel.IQualitymetamodelExpectedElement, QualityMetamodel.resource.qualitymetamodel.mopp.QualitymetamodelContainedFeature[]>> followers = new java.util.LinkedHashSet<QualityMetamodel.resource.qualitymetamodel.util.QualitymetamodelPair<QualityMetamodel.resource.qualitymetamodel.IQualitymetamodelExpectedElement, QualityMetamodel.resource.qualitymetamodel.mopp.QualitymetamodelContainedFeature[]>>();
	
	public QualitymetamodelAbstractExpectedElement(org.eclipse.emf.ecore.EClass ruleMetaclass) {
		super();
		this.ruleMetaclass = ruleMetaclass;
	}
	
	public org.eclipse.emf.ecore.EClass getRuleMetaclass() {
		return ruleMetaclass;
	}
	
	public void addFollower(QualityMetamodel.resource.qualitymetamodel.IQualitymetamodelExpectedElement follower, QualityMetamodel.resource.qualitymetamodel.mopp.QualitymetamodelContainedFeature[] path) {
		followers.add(new QualityMetamodel.resource.qualitymetamodel.util.QualitymetamodelPair<QualityMetamodel.resource.qualitymetamodel.IQualitymetamodelExpectedElement, QualityMetamodel.resource.qualitymetamodel.mopp.QualitymetamodelContainedFeature[]>(follower, path));
	}
	
	public java.util.Collection<QualityMetamodel.resource.qualitymetamodel.util.QualitymetamodelPair<QualityMetamodel.resource.qualitymetamodel.IQualitymetamodelExpectedElement, QualityMetamodel.resource.qualitymetamodel.mopp.QualitymetamodelContainedFeature[]>> getFollowers() {
		return followers;
	}
	
}
