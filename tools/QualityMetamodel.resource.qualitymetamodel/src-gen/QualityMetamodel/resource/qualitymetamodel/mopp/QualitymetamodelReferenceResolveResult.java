/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package QualityMetamodel.resource.qualitymetamodel.mopp;

/**
 * A basic implementation of the
 * QualityMetamodel.resource.qualitymetamodel.IQualitymetamodelReferenceResolveResu
 * lt interface that collects mappings in a list.
 * 
 * @param <ReferenceType> the type of the references that can be contained in this
 * result
 */
public class QualitymetamodelReferenceResolveResult<ReferenceType> implements QualityMetamodel.resource.qualitymetamodel.IQualitymetamodelReferenceResolveResult<ReferenceType> {
	
	private java.util.Collection<QualityMetamodel.resource.qualitymetamodel.IQualitymetamodelReferenceMapping<ReferenceType>> mappings;
	private String errorMessage;
	private boolean resolveFuzzy;
	private java.util.Set<QualityMetamodel.resource.qualitymetamodel.IQualitymetamodelQuickFix> quickFixes;
	
	public QualitymetamodelReferenceResolveResult(boolean resolveFuzzy) {
		super();
		this.resolveFuzzy = resolveFuzzy;
	}
	
	public String getErrorMessage() {
		return errorMessage;
	}
	
	public java.util.Collection<QualityMetamodel.resource.qualitymetamodel.IQualitymetamodelQuickFix> getQuickFixes() {
		if (quickFixes == null) {
			quickFixes = new java.util.LinkedHashSet<QualityMetamodel.resource.qualitymetamodel.IQualitymetamodelQuickFix>();
		}
		return java.util.Collections.unmodifiableSet(quickFixes);
	}
	
	public void addQuickFix(QualityMetamodel.resource.qualitymetamodel.IQualitymetamodelQuickFix quickFix) {
		if (quickFixes == null) {
			quickFixes = new java.util.LinkedHashSet<QualityMetamodel.resource.qualitymetamodel.IQualitymetamodelQuickFix>();
		}
		quickFixes.add(quickFix);
	}
	
	public java.util.Collection<QualityMetamodel.resource.qualitymetamodel.IQualitymetamodelReferenceMapping<ReferenceType>> getMappings() {
		return mappings;
	}
	
	public boolean wasResolved() {
		return mappings != null;
	}
	
	public boolean wasResolvedMultiple() {
		return mappings != null && mappings.size() > 1;
	}
	
	public boolean wasResolvedUniquely() {
		return mappings != null && mappings.size() == 1;
	}
	
	public void setErrorMessage(String message) {
		errorMessage = message;
	}
	
	public void addMapping(String identifier, ReferenceType target) {
		if (!resolveFuzzy && target == null) {
			throw new IllegalArgumentException("Mapping references to null is only allowed for fuzzy resolution.");
		}
		addMapping(identifier, target, null);
	}
	
	public void addMapping(String identifier, ReferenceType target, String warning) {
		if (mappings == null) {
			mappings = new java.util.ArrayList<QualityMetamodel.resource.qualitymetamodel.IQualitymetamodelReferenceMapping<ReferenceType>>(1);
		}
		mappings.add(new QualityMetamodel.resource.qualitymetamodel.mopp.QualitymetamodelElementMapping<ReferenceType>(identifier, target, warning));
		errorMessage = null;
	}
	
	public void addMapping(String identifier, org.eclipse.emf.common.util.URI uri) {
		addMapping(identifier, uri, null);
	}
	
	public void addMapping(String identifier, org.eclipse.emf.common.util.URI uri, String warning) {
		if (mappings == null) {
			mappings = new java.util.ArrayList<QualityMetamodel.resource.qualitymetamodel.IQualitymetamodelReferenceMapping<ReferenceType>>(1);
		}
		mappings.add(new QualityMetamodel.resource.qualitymetamodel.mopp.QualitymetamodelURIMapping<ReferenceType>(identifier, uri, warning));
	}
}
