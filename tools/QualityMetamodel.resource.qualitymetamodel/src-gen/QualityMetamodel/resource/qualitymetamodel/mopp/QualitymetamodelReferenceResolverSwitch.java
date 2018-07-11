/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package QualityMetamodel.resource.qualitymetamodel.mopp;

public class QualitymetamodelReferenceResolverSwitch implements QualityMetamodel.resource.qualitymetamodel.IQualitymetamodelReferenceResolverSwitch {
	
	/**
	 * This map stores a copy of the options the were set for loading the resource.
	 */
	private java.util.Map<Object, Object> options;
	
	protected QualityMetamodel.resource.qualitymetamodel.analysis.QualityAttributeQualityAttributesReferenceResolver qualityAttributeQualityAttributesReferenceResolver = new QualityMetamodel.resource.qualitymetamodel.analysis.QualityAttributeQualityAttributesReferenceResolver();
	protected QualityMetamodel.resource.qualitymetamodel.analysis.QualityAttributeValueReferenceResolver qualityAttributeValueReferenceResolver = new QualityMetamodel.resource.qualitymetamodel.analysis.QualityAttributeValueReferenceResolver();
	protected QualityMetamodel.resource.qualitymetamodel.analysis.SingleValueMeasuredByReferenceResolver singleValueMeasuredByReferenceResolver = new QualityMetamodel.resource.qualitymetamodel.analysis.SingleValueMeasuredByReferenceResolver();
	protected QualityMetamodel.resource.qualitymetamodel.analysis.ValueValueTypeReferenceResolver valueValueTypeReferenceResolver = new QualityMetamodel.resource.qualitymetamodel.analysis.ValueValueTypeReferenceResolver();
	protected QualityMetamodel.resource.qualitymetamodel.analysis.OperationAggregatedValuesReferenceResolver operationAggregatedValuesReferenceResolver = new QualityMetamodel.resource.qualitymetamodel.analysis.OperationAggregatedValuesReferenceResolver();
	protected QualityMetamodel.resource.qualitymetamodel.analysis.EnumerationMetricValueReferenceResolver enumerationMetricValueReferenceResolver = new QualityMetamodel.resource.qualitymetamodel.analysis.EnumerationMetricValueReferenceResolver();
	protected QualityMetamodel.resource.qualitymetamodel.analysis.OclInstanceModelMetamodelReferenceResolver oclInstanceModelMetamodelReferenceResolver = new QualityMetamodel.resource.qualitymetamodel.analysis.OclInstanceModelMetamodelReferenceResolver();
	protected QualityMetamodel.resource.qualitymetamodel.analysis.OclModelElementExpModelReferenceResolver oclModelElementExpModelReferenceResolver = new QualityMetamodel.resource.qualitymetamodel.analysis.OclModelElementExpModelReferenceResolver();
	protected QualityMetamodel.resource.qualitymetamodel.analysis.VariableExpReferredVariableReferenceResolver variableExpReferredVariableReferenceResolver = new QualityMetamodel.resource.qualitymetamodel.analysis.VariableExpReferredVariableReferenceResolver();
	protected QualityMetamodel.resource.qualitymetamodel.analysis.OclModelElementModelReferenceResolver oclModelElementModelReferenceResolver = new QualityMetamodel.resource.qualitymetamodel.analysis.OclModelElementModelReferenceResolver();
	
	public QualityMetamodel.resource.qualitymetamodel.IQualitymetamodelReferenceResolver<QualityMetamodel.QualityAttribute, QualityMetamodel.QualityAttribute> getQualityAttributeQualityAttributesReferenceResolver() {
		return getResolverChain(QualityMetamodel.QualityMetamodelPackage.eINSTANCE.getQualityAttribute_QualityAttributes(), qualityAttributeQualityAttributesReferenceResolver);
	}
	
	public QualityMetamodel.resource.qualitymetamodel.IQualitymetamodelReferenceResolver<QualityMetamodel.QualityAttribute, QualityMetamodel.Value> getQualityAttributeValueReferenceResolver() {
		return getResolverChain(QualityMetamodel.QualityMetamodelPackage.eINSTANCE.getQualityAttribute_Value(), qualityAttributeValueReferenceResolver);
	}
	
	public QualityMetamodel.resource.qualitymetamodel.IQualitymetamodelReferenceResolver<QualityMetamodel.SingleValue, QualityMetamodel.MetricProvider> getSingleValueMeasuredByReferenceResolver() {
		return getResolverChain(QualityMetamodel.QualityMetamodelPackage.eINSTANCE.getSingleValue_MeasuredBy(), singleValueMeasuredByReferenceResolver);
	}
	
	public QualityMetamodel.resource.qualitymetamodel.IQualitymetamodelReferenceResolver<QualityMetamodel.Value, QualityMetamodel.ValueType> getValueValueTypeReferenceResolver() {
		return getResolverChain(QualityMetamodel.QualityMetamodelPackage.eINSTANCE.getValue_ValueType(), valueValueTypeReferenceResolver);
	}
	
	public QualityMetamodel.resource.qualitymetamodel.IQualitymetamodelReferenceResolver<QualityMetamodel.Operation, QualityMetamodel.Value> getOperationAggregatedValuesReferenceResolver() {
		return getResolverChain(QualityMetamodel.QualityMetamodelPackage.eINSTANCE.getOperation_AggregatedValues(), operationAggregatedValuesReferenceResolver);
	}
	
	public QualityMetamodel.resource.qualitymetamodel.IQualitymetamodelReferenceResolver<QualityMetamodel.EnumerationMetric, QualityMetamodel.EnumerationItem> getEnumerationMetricValueReferenceResolver() {
		return getResolverChain(QualityMetamodel.QualityMetamodelPackage.eINSTANCE.getEnumerationMetric_Value(), enumerationMetricValueReferenceResolver);
	}
	
	public QualityMetamodel.resource.qualitymetamodel.IQualitymetamodelReferenceResolver<QualityMetamodel.QMM_OCL.OclInstanceModel, QualityMetamodel.QMM_OCL.OclMetamodel> getOclInstanceModelMetamodelReferenceResolver() {
		return getResolverChain(QualityMetamodel.QMM_OCL.QMM_OCLPackage.eINSTANCE.getOclInstanceModel_Metamodel(), oclInstanceModelMetamodelReferenceResolver);
	}
	
	public QualityMetamodel.resource.qualitymetamodel.IQualitymetamodelReferenceResolver<QualityMetamodel.QMM_OCL.OclModelElementExp, QualityMetamodel.QMM_OCL.OclModel> getOclModelElementExpModelReferenceResolver() {
		return getResolverChain(QualityMetamodel.QMM_OCL.QMM_OCLPackage.eINSTANCE.getOclModelElementExp_Model(), oclModelElementExpModelReferenceResolver);
	}
	
	public QualityMetamodel.resource.qualitymetamodel.IQualitymetamodelReferenceResolver<QualityMetamodel.QMM_OCL.VariableExp, QualityMetamodel.QMM_OCL.VariableDeclaration> getVariableExpReferredVariableReferenceResolver() {
		return getResolverChain(QualityMetamodel.QMM_OCL.QMM_OCLPackage.eINSTANCE.getVariableExp_ReferredVariable(), variableExpReferredVariableReferenceResolver);
	}
	
	public QualityMetamodel.resource.qualitymetamodel.IQualitymetamodelReferenceResolver<QualityMetamodel.QMM_OCL.OclModelElement, QualityMetamodel.QMM_OCL.OclModel> getOclModelElementModelReferenceResolver() {
		return getResolverChain(QualityMetamodel.QMM_OCL.QMM_OCLPackage.eINSTANCE.getOclModelElement_Model(), oclModelElementModelReferenceResolver);
	}
	
	public void setOptions(java.util.Map<?, ?> options) {
		if (options != null) {
			this.options = new java.util.LinkedHashMap<Object, Object>();
			this.options.putAll(options);
		}
		qualityAttributeQualityAttributesReferenceResolver.setOptions(options);
		qualityAttributeValueReferenceResolver.setOptions(options);
		singleValueMeasuredByReferenceResolver.setOptions(options);
		valueValueTypeReferenceResolver.setOptions(options);
		operationAggregatedValuesReferenceResolver.setOptions(options);
		enumerationMetricValueReferenceResolver.setOptions(options);
		oclInstanceModelMetamodelReferenceResolver.setOptions(options);
		oclModelElementExpModelReferenceResolver.setOptions(options);
		variableExpReferredVariableReferenceResolver.setOptions(options);
		oclModelElementModelReferenceResolver.setOptions(options);
	}
	
	public void resolveFuzzy(String identifier, org.eclipse.emf.ecore.EObject container, org.eclipse.emf.ecore.EReference reference, int position, QualityMetamodel.resource.qualitymetamodel.IQualitymetamodelReferenceResolveResult<org.eclipse.emf.ecore.EObject> result) {
		if (container == null) {
			return;
		}
		if (QualityMetamodel.QualityMetamodelPackage.eINSTANCE.getQualityAttribute().isInstance(container)) {
			QualitymetamodelFuzzyResolveResult<QualityMetamodel.QualityAttribute> frr = new QualitymetamodelFuzzyResolveResult<QualityMetamodel.QualityAttribute>(result);
			String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("qualityAttributes")) {
				qualityAttributeQualityAttributesReferenceResolver.resolve(identifier, (QualityMetamodel.QualityAttribute) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (QualityMetamodel.QualityMetamodelPackage.eINSTANCE.getQualityAttribute().isInstance(container)) {
			QualitymetamodelFuzzyResolveResult<QualityMetamodel.Value> frr = new QualitymetamodelFuzzyResolveResult<QualityMetamodel.Value>(result);
			String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("value")) {
				qualityAttributeValueReferenceResolver.resolve(identifier, (QualityMetamodel.QualityAttribute) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (QualityMetamodel.QualityMetamodelPackage.eINSTANCE.getSingleValue().isInstance(container)) {
			QualitymetamodelFuzzyResolveResult<QualityMetamodel.MetricProvider> frr = new QualitymetamodelFuzzyResolveResult<QualityMetamodel.MetricProvider>(result);
			String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("measuredBy")) {
				singleValueMeasuredByReferenceResolver.resolve(identifier, (QualityMetamodel.SingleValue) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (QualityMetamodel.QualityMetamodelPackage.eINSTANCE.getValue().isInstance(container)) {
			QualitymetamodelFuzzyResolveResult<QualityMetamodel.ValueType> frr = new QualitymetamodelFuzzyResolveResult<QualityMetamodel.ValueType>(result);
			String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("valueType")) {
				valueValueTypeReferenceResolver.resolve(identifier, (QualityMetamodel.Value) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (QualityMetamodel.QualityMetamodelPackage.eINSTANCE.getOperation().isInstance(container)) {
			QualitymetamodelFuzzyResolveResult<QualityMetamodel.Value> frr = new QualitymetamodelFuzzyResolveResult<QualityMetamodel.Value>(result);
			String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("aggregatedValues")) {
				operationAggregatedValuesReferenceResolver.resolve(identifier, (QualityMetamodel.Operation) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (QualityMetamodel.QualityMetamodelPackage.eINSTANCE.getEnumerationMetric().isInstance(container)) {
			QualitymetamodelFuzzyResolveResult<QualityMetamodel.EnumerationItem> frr = new QualitymetamodelFuzzyResolveResult<QualityMetamodel.EnumerationItem>(result);
			String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("value")) {
				enumerationMetricValueReferenceResolver.resolve(identifier, (QualityMetamodel.EnumerationMetric) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (QualityMetamodel.QMM_OCL.QMM_OCLPackage.eINSTANCE.getOclInstanceModel().isInstance(container)) {
			QualitymetamodelFuzzyResolveResult<QualityMetamodel.QMM_OCL.OclMetamodel> frr = new QualitymetamodelFuzzyResolveResult<QualityMetamodel.QMM_OCL.OclMetamodel>(result);
			String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("metamodel")) {
				oclInstanceModelMetamodelReferenceResolver.resolve(identifier, (QualityMetamodel.QMM_OCL.OclInstanceModel) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (QualityMetamodel.QMM_OCL.QMM_OCLPackage.eINSTANCE.getOclModelElementExp().isInstance(container)) {
			QualitymetamodelFuzzyResolveResult<QualityMetamodel.QMM_OCL.OclModel> frr = new QualitymetamodelFuzzyResolveResult<QualityMetamodel.QMM_OCL.OclModel>(result);
			String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("model")) {
				oclModelElementExpModelReferenceResolver.resolve(identifier, (QualityMetamodel.QMM_OCL.OclModelElementExp) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (QualityMetamodel.QMM_OCL.QMM_OCLPackage.eINSTANCE.getVariableExp().isInstance(container)) {
			QualitymetamodelFuzzyResolveResult<QualityMetamodel.QMM_OCL.VariableDeclaration> frr = new QualitymetamodelFuzzyResolveResult<QualityMetamodel.QMM_OCL.VariableDeclaration>(result);
			String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("referredVariable")) {
				variableExpReferredVariableReferenceResolver.resolve(identifier, (QualityMetamodel.QMM_OCL.VariableExp) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (QualityMetamodel.QMM_OCL.QMM_OCLPackage.eINSTANCE.getOclModelElement().isInstance(container)) {
			QualitymetamodelFuzzyResolveResult<QualityMetamodel.QMM_OCL.OclModel> frr = new QualitymetamodelFuzzyResolveResult<QualityMetamodel.QMM_OCL.OclModel>(result);
			String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("model")) {
				oclModelElementModelReferenceResolver.resolve(identifier, (QualityMetamodel.QMM_OCL.OclModelElement) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
	}
	
	public QualityMetamodel.resource.qualitymetamodel.IQualitymetamodelReferenceResolver<? extends org.eclipse.emf.ecore.EObject, ? extends org.eclipse.emf.ecore.EObject> getResolver(org.eclipse.emf.ecore.EStructuralFeature reference) {
		if (reference == QualityMetamodel.QualityMetamodelPackage.eINSTANCE.getQualityAttribute_QualityAttributes()) {
			return getResolverChain(reference, qualityAttributeQualityAttributesReferenceResolver);
		}
		if (reference == QualityMetamodel.QualityMetamodelPackage.eINSTANCE.getQualityAttribute_Value()) {
			return getResolverChain(reference, qualityAttributeValueReferenceResolver);
		}
		if (reference == QualityMetamodel.QualityMetamodelPackage.eINSTANCE.getSingleValue_MeasuredBy()) {
			return getResolverChain(reference, singleValueMeasuredByReferenceResolver);
		}
		if (reference == QualityMetamodel.QualityMetamodelPackage.eINSTANCE.getValue_ValueType()) {
			return getResolverChain(reference, valueValueTypeReferenceResolver);
		}
		if (reference == QualityMetamodel.QualityMetamodelPackage.eINSTANCE.getOperation_AggregatedValues()) {
			return getResolverChain(reference, operationAggregatedValuesReferenceResolver);
		}
		if (reference == QualityMetamodel.QualityMetamodelPackage.eINSTANCE.getEnumerationMetric_Value()) {
			return getResolverChain(reference, enumerationMetricValueReferenceResolver);
		}
		if (reference == QualityMetamodel.QMM_OCL.QMM_OCLPackage.eINSTANCE.getOclInstanceModel_Metamodel()) {
			return getResolverChain(reference, oclInstanceModelMetamodelReferenceResolver);
		}
		if (reference == QualityMetamodel.QMM_OCL.QMM_OCLPackage.eINSTANCE.getOclModelElementExp_Model()) {
			return getResolverChain(reference, oclModelElementExpModelReferenceResolver);
		}
		if (reference == QualityMetamodel.QMM_OCL.QMM_OCLPackage.eINSTANCE.getVariableExp_ReferredVariable()) {
			return getResolverChain(reference, variableExpReferredVariableReferenceResolver);
		}
		if (reference == QualityMetamodel.QMM_OCL.QMM_OCLPackage.eINSTANCE.getOclModelElement_Model()) {
			return getResolverChain(reference, oclModelElementModelReferenceResolver);
		}
		return null;
	}
	
	@SuppressWarnings({"rawtypes", "unchecked"})	
	public <ContainerType extends org.eclipse.emf.ecore.EObject, ReferenceType extends org.eclipse.emf.ecore.EObject> QualityMetamodel.resource.qualitymetamodel.IQualitymetamodelReferenceResolver<ContainerType, ReferenceType> getResolverChain(org.eclipse.emf.ecore.EStructuralFeature reference, QualityMetamodel.resource.qualitymetamodel.IQualitymetamodelReferenceResolver<ContainerType, ReferenceType> originalResolver) {
		if (options == null) {
			return originalResolver;
		}
		Object value = options.get(QualityMetamodel.resource.qualitymetamodel.IQualitymetamodelOptions.ADDITIONAL_REFERENCE_RESOLVERS);
		if (value == null) {
			return originalResolver;
		}
		if (!(value instanceof java.util.Map)) {
			// send this to the error log
			new QualityMetamodel.resource.qualitymetamodel.util.QualitymetamodelRuntimeUtil().logWarning("Found value with invalid type for option " + QualityMetamodel.resource.qualitymetamodel.IQualitymetamodelOptions.ADDITIONAL_REFERENCE_RESOLVERS + " (expected " + java.util.Map.class.getName() + ", but was " + value.getClass().getName() + ")", null);
			return originalResolver;
		}
		java.util.Map<?,?> resolverMap = (java.util.Map<?,?>) value;
		Object resolverValue = resolverMap.get(reference);
		if (resolverValue == null) {
			return originalResolver;
		}
		if (resolverValue instanceof QualityMetamodel.resource.qualitymetamodel.IQualitymetamodelReferenceResolver) {
			QualityMetamodel.resource.qualitymetamodel.IQualitymetamodelReferenceResolver replacingResolver = (QualityMetamodel.resource.qualitymetamodel.IQualitymetamodelReferenceResolver) resolverValue;
			if (replacingResolver instanceof QualityMetamodel.resource.qualitymetamodel.IQualitymetamodelDelegatingReferenceResolver) {
				// pass original resolver to the replacing one
				((QualityMetamodel.resource.qualitymetamodel.IQualitymetamodelDelegatingReferenceResolver) replacingResolver).setDelegate(originalResolver);
			}
			return replacingResolver;
		} else if (resolverValue instanceof java.util.Collection) {
			java.util.Collection replacingResolvers = (java.util.Collection) resolverValue;
			QualityMetamodel.resource.qualitymetamodel.IQualitymetamodelReferenceResolver replacingResolver = originalResolver;
			for (Object next : replacingResolvers) {
				if (next instanceof QualityMetamodel.resource.qualitymetamodel.IQualitymetamodelReferenceCache) {
					QualityMetamodel.resource.qualitymetamodel.IQualitymetamodelReferenceResolver nextResolver = (QualityMetamodel.resource.qualitymetamodel.IQualitymetamodelReferenceResolver) next;
					if (nextResolver instanceof QualityMetamodel.resource.qualitymetamodel.IQualitymetamodelDelegatingReferenceResolver) {
						// pass original resolver to the replacing one
						((QualityMetamodel.resource.qualitymetamodel.IQualitymetamodelDelegatingReferenceResolver) nextResolver).setDelegate(replacingResolver);
					}
					replacingResolver = nextResolver;
				} else {
					// The collection contains a non-resolver. Send a warning to the error log.
					new QualityMetamodel.resource.qualitymetamodel.util.QualitymetamodelRuntimeUtil().logWarning("Found value with invalid type in value map for option " + QualityMetamodel.resource.qualitymetamodel.IQualitymetamodelOptions.ADDITIONAL_REFERENCE_RESOLVERS + " (expected " + QualityMetamodel.resource.qualitymetamodel.IQualitymetamodelDelegatingReferenceResolver.class.getName() + ", but was " + next.getClass().getName() + ")", null);
				}
			}
			return replacingResolver;
		} else {
			// The value for the option ADDITIONAL_REFERENCE_RESOLVERS has an unknown type.
			new QualityMetamodel.resource.qualitymetamodel.util.QualitymetamodelRuntimeUtil().logWarning("Found value with invalid type in value map for option " + QualityMetamodel.resource.qualitymetamodel.IQualitymetamodelOptions.ADDITIONAL_REFERENCE_RESOLVERS + " (expected " + QualityMetamodel.resource.qualitymetamodel.IQualitymetamodelDelegatingReferenceResolver.class.getName() + ", but was " + resolverValue.getClass().getName() + ")", null);
			return originalResolver;
		}
	}
	
}
