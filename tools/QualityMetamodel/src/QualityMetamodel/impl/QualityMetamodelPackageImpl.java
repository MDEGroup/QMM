/**
 */
package QualityMetamodel.impl;

import QualityMetamodel.AggregatedValue;
import QualityMetamodel.AggregatedValueMetric;
import QualityMetamodel.BooleanValueType;
import QualityMetamodel.EnumerationItem;
import QualityMetamodel.EnumerationMetric;
import QualityMetamodel.IntegerValueType;
import QualityMetamodel.ListValue;
import QualityMetamodel.MetricProvider;
import QualityMetamodel.Operation;

import QualityMetamodel.QMM_OCL.QMM_OCLPackage;

import QualityMetamodel.QMM_OCL.impl.QMM_OCLPackageImpl;

import QualityMetamodel.QualityAttribute;
import QualityMetamodel.QualityMetamodelFactory;
import QualityMetamodel.QualityMetamodelPackage;
import QualityMetamodel.QualityModel;
import QualityMetamodel.RangeValueType;
import QualityMetamodel.RealValueType;
import QualityMetamodel.SingleValue;
import QualityMetamodel.TextValueType;
import QualityMetamodel.Value;
import QualityMetamodel.ValueType;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class QualityMetamodelPackageImpl extends EPackageImpl implements QualityMetamodelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass qualityModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass qualityAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass singleValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aggregatedValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass metricProviderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textValueTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rangeValueTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aggregatedValueMetricEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumerationMetricEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumerationItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass realValueTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanValueTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integerValueTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listValueEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see QualityMetamodel.QualityMetamodelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private QualityMetamodelPackageImpl() {
		super(eNS_URI, QualityMetamodelFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link QualityMetamodelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static QualityMetamodelPackage init() {
		if (isInited) return (QualityMetamodelPackage)EPackage.Registry.INSTANCE.getEPackage(QualityMetamodelPackage.eNS_URI);

		// Obtain or create and register package
		QualityMetamodelPackageImpl theQualityMetamodelPackage = (QualityMetamodelPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof QualityMetamodelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new QualityMetamodelPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		QMM_OCLPackageImpl theQMM_OCLPackage = (QMM_OCLPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(QMM_OCLPackage.eNS_URI) instanceof QMM_OCLPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(QMM_OCLPackage.eNS_URI) : QMM_OCLPackage.eINSTANCE);

		// Create package meta-data objects
		theQualityMetamodelPackage.createPackageContents();
		theQMM_OCLPackage.createPackageContents();

		// Initialize created meta-data
		theQualityMetamodelPackage.initializePackageContents();
		theQMM_OCLPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theQualityMetamodelPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(QualityMetamodelPackage.eNS_URI, theQualityMetamodelPackage);
		return theQualityMetamodelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQualityModel() {
		return qualityModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQualityModel_MetricProviders() {
		return (EReference)qualityModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQualityModel_QualityTypes() {
		return (EReference)qualityModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQualityModel_QualityAttributes() {
		return (EReference)qualityModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQualityModel_QualityValues() {
		return (EReference)qualityModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQualityAttribute() {
		return qualityAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQualityAttribute_Value() {
		return (EReference)qualityAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQualityAttribute_QualityAttributes() {
		return (EReference)qualityAttributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValue() {
		return valueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValue_ValueType() {
		return (EReference)valueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValue_Description() {
		return (EAttribute)valueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValueType() {
		return valueTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueType_Val() {
		return (EReference)valueTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSingleValue() {
		return singleValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSingleValue_MeasuredBy() {
		return (EReference)singleValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAggregatedValue() {
		return aggregatedValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAggregatedValue_CalculatedBy() {
		return (EReference)aggregatedValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperation() {
		return operationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperation_Name() {
		return (EAttribute)operationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperation_AggregatedValues() {
		return (EReference)operationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperation_Body() {
		return (EAttribute)operationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperation_Ref() {
		return (EReference)operationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMetricProvider() {
		return metricProviderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMetricProvider_Name() {
		return (EAttribute)metricProviderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMetricProvider_Description() {
		return (EAttribute)metricProviderEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMetricProvider_Id() {
		return (EAttribute)metricProviderEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTextValueType() {
		return textValueTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextValueType_Value() {
		return (EAttribute)textValueTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRangeValueType() {
		return rangeValueTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRangeValueType_Min() {
		return (EAttribute)rangeValueTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRangeValueType_Max() {
		return (EAttribute)rangeValueTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAggregatedValueMetric() {
		return aggregatedValueMetricEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAggregatedValueMetric_Minimum() {
		return (EAttribute)aggregatedValueMetricEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAggregatedValueMetric_Maximum() {
		return (EAttribute)aggregatedValueMetricEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAggregatedValueMetric_Average() {
		return (EAttribute)aggregatedValueMetricEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAggregatedValueMetric_Median() {
		return (EAttribute)aggregatedValueMetricEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAggregatedValueMetric_StandardDeviation() {
		return (EAttribute)aggregatedValueMetricEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnumerationMetric() {
		return enumerationMetricEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnumerationMetric_Set() {
		return (EReference)enumerationMetricEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnumerationMetric_Value() {
		return (EReference)enumerationMetricEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnumerationItem() {
		return enumerationItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnumerationItem_Name() {
		return (EAttribute)enumerationItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRealValueType() {
		return realValueTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRealValueType_Value() {
		return (EAttribute)realValueTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooleanValueType() {
		return booleanValueTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooleanValueType_Value() {
		return (EAttribute)booleanValueTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntegerValueType() {
		return integerValueTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntegerValueType_Value() {
		return (EAttribute)integerValueTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListValue() {
		return listValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListValue_Elements() {
		return (EReference)listValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QualityMetamodelFactory getQualityMetamodelFactory() {
		return (QualityMetamodelFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		qualityModelEClass = createEClass(QUALITY_MODEL);
		createEReference(qualityModelEClass, QUALITY_MODEL__METRIC_PROVIDERS);
		createEReference(qualityModelEClass, QUALITY_MODEL__QUALITY_TYPES);
		createEReference(qualityModelEClass, QUALITY_MODEL__QUALITY_ATTRIBUTES);
		createEReference(qualityModelEClass, QUALITY_MODEL__QUALITY_VALUES);

		qualityAttributeEClass = createEClass(QUALITY_ATTRIBUTE);
		createEReference(qualityAttributeEClass, QUALITY_ATTRIBUTE__VALUE);
		createEReference(qualityAttributeEClass, QUALITY_ATTRIBUTE__QUALITY_ATTRIBUTES);

		valueEClass = createEClass(VALUE);
		createEReference(valueEClass, VALUE__VALUE_TYPE);
		createEAttribute(valueEClass, VALUE__DESCRIPTION);

		valueTypeEClass = createEClass(VALUE_TYPE);
		createEReference(valueTypeEClass, VALUE_TYPE__VAL);

		singleValueEClass = createEClass(SINGLE_VALUE);
		createEReference(singleValueEClass, SINGLE_VALUE__MEASURED_BY);

		aggregatedValueEClass = createEClass(AGGREGATED_VALUE);
		createEReference(aggregatedValueEClass, AGGREGATED_VALUE__CALCULATED_BY);

		operationEClass = createEClass(OPERATION);
		createEAttribute(operationEClass, OPERATION__NAME);
		createEReference(operationEClass, OPERATION__AGGREGATED_VALUES);
		createEAttribute(operationEClass, OPERATION__BODY);
		createEReference(operationEClass, OPERATION__REF);

		metricProviderEClass = createEClass(METRIC_PROVIDER);
		createEAttribute(metricProviderEClass, METRIC_PROVIDER__NAME);
		createEAttribute(metricProviderEClass, METRIC_PROVIDER__DESCRIPTION);
		createEAttribute(metricProviderEClass, METRIC_PROVIDER__ID);

		textValueTypeEClass = createEClass(TEXT_VALUE_TYPE);
		createEAttribute(textValueTypeEClass, TEXT_VALUE_TYPE__VALUE);

		rangeValueTypeEClass = createEClass(RANGE_VALUE_TYPE);
		createEAttribute(rangeValueTypeEClass, RANGE_VALUE_TYPE__MIN);
		createEAttribute(rangeValueTypeEClass, RANGE_VALUE_TYPE__MAX);

		aggregatedValueMetricEClass = createEClass(AGGREGATED_VALUE_METRIC);
		createEAttribute(aggregatedValueMetricEClass, AGGREGATED_VALUE_METRIC__MINIMUM);
		createEAttribute(aggregatedValueMetricEClass, AGGREGATED_VALUE_METRIC__MAXIMUM);
		createEAttribute(aggregatedValueMetricEClass, AGGREGATED_VALUE_METRIC__AVERAGE);
		createEAttribute(aggregatedValueMetricEClass, AGGREGATED_VALUE_METRIC__MEDIAN);
		createEAttribute(aggregatedValueMetricEClass, AGGREGATED_VALUE_METRIC__STANDARD_DEVIATION);

		enumerationMetricEClass = createEClass(ENUMERATION_METRIC);
		createEReference(enumerationMetricEClass, ENUMERATION_METRIC__SET);
		createEReference(enumerationMetricEClass, ENUMERATION_METRIC__VALUE);

		enumerationItemEClass = createEClass(ENUMERATION_ITEM);
		createEAttribute(enumerationItemEClass, ENUMERATION_ITEM__NAME);

		realValueTypeEClass = createEClass(REAL_VALUE_TYPE);
		createEAttribute(realValueTypeEClass, REAL_VALUE_TYPE__VALUE);

		booleanValueTypeEClass = createEClass(BOOLEAN_VALUE_TYPE);
		createEAttribute(booleanValueTypeEClass, BOOLEAN_VALUE_TYPE__VALUE);

		integerValueTypeEClass = createEClass(INTEGER_VALUE_TYPE);
		createEAttribute(integerValueTypeEClass, INTEGER_VALUE_TYPE__VALUE);

		listValueEClass = createEClass(LIST_VALUE);
		createEReference(listValueEClass, LIST_VALUE__ELEMENTS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		QMM_OCLPackage theQMM_OCLPackage = (QMM_OCLPackage)EPackage.Registry.INSTANCE.getEPackage(QMM_OCLPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theQMM_OCLPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		qualityModelEClass.getESuperTypes().add(theQMM_OCLPackage.getModule());
		qualityAttributeEClass.getESuperTypes().add(theQMM_OCLPackage.getVariableDeclaration());
		valueEClass.getESuperTypes().add(theQMM_OCLPackage.getVariableDeclaration());
		valueTypeEClass.getESuperTypes().add(theQMM_OCLPackage.getVariableDeclaration());
		singleValueEClass.getESuperTypes().add(this.getValue());
		aggregatedValueEClass.getESuperTypes().add(this.getValue());
		textValueTypeEClass.getESuperTypes().add(this.getValueType());
		rangeValueTypeEClass.getESuperTypes().add(this.getValueType());
		aggregatedValueMetricEClass.getESuperTypes().add(this.getValueType());
		enumerationMetricEClass.getESuperTypes().add(this.getValueType());
		realValueTypeEClass.getESuperTypes().add(this.getValueType());
		booleanValueTypeEClass.getESuperTypes().add(this.getValueType());
		integerValueTypeEClass.getESuperTypes().add(this.getValueType());
		listValueEClass.getESuperTypes().add(this.getValueType());

		// Initialize classes, features, and operations; add parameters
		initEClass(qualityModelEClass, QualityModel.class, "QualityModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getQualityModel_MetricProviders(), this.getMetricProvider(), null, "metricProviders", null, 0, -1, QualityModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQualityModel_QualityTypes(), this.getValueType(), null, "qualityTypes", null, 0, -1, QualityModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQualityModel_QualityAttributes(), this.getQualityAttribute(), null, "qualityAttributes", null, 0, -1, QualityModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQualityModel_QualityValues(), this.getValue(), null, "qualityValues", null, 0, -1, QualityModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(qualityAttributeEClass, QualityAttribute.class, "QualityAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getQualityAttribute_Value(), this.getValue(), null, "value", null, 1, 1, QualityAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQualityAttribute_QualityAttributes(), this.getQualityAttribute(), null, "qualityAttributes", null, 0, -1, QualityAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(valueEClass, Value.class, "Value", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getValue_ValueType(), this.getValueType(), this.getValueType_Val(), "valueType", null, 1, 1, Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getValue_Description(), ecorePackage.getEString(), "description", null, 0, 1, Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(valueTypeEClass, ValueType.class, "ValueType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getValueType_Val(), this.getValue(), this.getValue_ValueType(), "val", null, 1, 1, ValueType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(singleValueEClass, SingleValue.class, "SingleValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSingleValue_MeasuredBy(), this.getMetricProvider(), null, "measuredBy", null, 1, 1, SingleValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(aggregatedValueEClass, AggregatedValue.class, "AggregatedValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAggregatedValue_CalculatedBy(), this.getOperation(), null, "calculatedBy", null, 1, 1, AggregatedValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(operationEClass, Operation.class, "Operation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOperation_Name(), ecorePackage.getEString(), "name", null, 0, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperation_AggregatedValues(), this.getValue(), null, "aggregatedValues", null, 1, -1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOperation_Body(), ecorePackage.getEString(), "body", null, 0, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperation_Ref(), theQMM_OCLPackage.getOclExpression(), null, "ref", null, 0, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(metricProviderEClass, MetricProvider.class, "MetricProvider", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMetricProvider_Name(), ecorePackage.getEString(), "name", null, 0, 1, MetricProvider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMetricProvider_Description(), ecorePackage.getEString(), "description", null, 0, 1, MetricProvider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMetricProvider_Id(), ecorePackage.getEString(), "id", null, 0, 1, MetricProvider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(textValueTypeEClass, TextValueType.class, "TextValueType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTextValueType_Value(), ecorePackage.getEString(), "value", null, 0, 1, TextValueType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rangeValueTypeEClass, RangeValueType.class, "RangeValueType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRangeValueType_Min(), ecorePackage.getEIntegerObject(), "min", null, 0, 1, RangeValueType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRangeValueType_Max(), ecorePackage.getEIntegerObject(), "max", null, 0, 1, RangeValueType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(aggregatedValueMetricEClass, AggregatedValueMetric.class, "AggregatedValueMetric", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAggregatedValueMetric_Minimum(), ecorePackage.getEString(), "minimum", null, 0, 1, AggregatedValueMetric.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAggregatedValueMetric_Maximum(), ecorePackage.getEString(), "maximum", null, 0, 1, AggregatedValueMetric.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAggregatedValueMetric_Average(), ecorePackage.getEString(), "average", null, 0, 1, AggregatedValueMetric.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAggregatedValueMetric_Median(), ecorePackage.getEString(), "median", null, 0, 1, AggregatedValueMetric.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAggregatedValueMetric_StandardDeviation(), ecorePackage.getEString(), "standardDeviation", null, 0, 1, AggregatedValueMetric.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(enumerationMetricEClass, EnumerationMetric.class, "EnumerationMetric", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEnumerationMetric_Set(), this.getEnumerationItem(), null, "set", null, 1, -1, EnumerationMetric.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEnumerationMetric_Value(), this.getEnumerationItem(), null, "value", null, 0, 1, EnumerationMetric.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(enumerationItemEClass, EnumerationItem.class, "EnumerationItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEnumerationItem_Name(), ecorePackage.getEString(), "name", null, 0, 1, EnumerationItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(realValueTypeEClass, RealValueType.class, "RealValueType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRealValueType_Value(), ecorePackage.getEDoubleObject(), "value", null, 0, 1, RealValueType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(booleanValueTypeEClass, BooleanValueType.class, "BooleanValueType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBooleanValueType_Value(), ecorePackage.getEBooleanObject(), "value", null, 0, 1, BooleanValueType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(integerValueTypeEClass, IntegerValueType.class, "IntegerValueType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIntegerValueType_Value(), ecorePackage.getEIntegerObject(), "value", null, 0, 1, IntegerValueType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(listValueEClass, ListValue.class, "ListValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getListValue_Elements(), this.getValueType(), null, "elements", null, 1, -1, ListValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //QualityMetamodelPackageImpl
