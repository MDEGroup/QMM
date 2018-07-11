/**
 */
package QualityMetamodel.impl;

import QualityMetamodel.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class QualityMetamodelFactoryImpl extends EFactoryImpl implements QualityMetamodelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static QualityMetamodelFactory init() {
		try {
			QualityMetamodelFactory theQualityMetamodelFactory = (QualityMetamodelFactory)EPackage.Registry.INSTANCE.getEFactory(QualityMetamodelPackage.eNS_URI);
			if (theQualityMetamodelFactory != null) {
				return theQualityMetamodelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new QualityMetamodelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QualityMetamodelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case QualityMetamodelPackage.QUALITY_MODEL: return createQualityModel();
			case QualityMetamodelPackage.QUALITY_ATTRIBUTE: return createQualityAttribute();
			case QualityMetamodelPackage.SINGLE_VALUE: return createSingleValue();
			case QualityMetamodelPackage.AGGREGATED_VALUE: return createAggregatedValue();
			case QualityMetamodelPackage.OPERATION: return createOperation();
			case QualityMetamodelPackage.METRIC_PROVIDER: return createMetricProvider();
			case QualityMetamodelPackage.TEXT_VALUE_TYPE: return createTextValueType();
			case QualityMetamodelPackage.RANGE_VALUE_TYPE: return createRangeValueType();
			case QualityMetamodelPackage.AGGREGATED_VALUE_METRIC: return createAggregatedValueMetric();
			case QualityMetamodelPackage.ENUMERATION_METRIC: return createEnumerationMetric();
			case QualityMetamodelPackage.ENUMERATION_ITEM: return createEnumerationItem();
			case QualityMetamodelPackage.REAL_VALUE_TYPE: return createRealValueType();
			case QualityMetamodelPackage.BOOLEAN_VALUE_TYPE: return createBooleanValueType();
			case QualityMetamodelPackage.INTEGER_VALUE_TYPE: return createIntegerValueType();
			case QualityMetamodelPackage.LIST_VALUE: return createListValue();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QualityModel createQualityModel() {
		QualityModelImpl qualityModel = new QualityModelImpl();
		return qualityModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QualityAttribute createQualityAttribute() {
		QualityAttributeImpl qualityAttribute = new QualityAttributeImpl();
		return qualityAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleValue createSingleValue() {
		SingleValueImpl singleValue = new SingleValueImpl();
		return singleValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AggregatedValue createAggregatedValue() {
		AggregatedValueImpl aggregatedValue = new AggregatedValueImpl();
		return aggregatedValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation createOperation() {
		OperationImpl operation = new OperationImpl();
		return operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetricProvider createMetricProvider() {
		MetricProviderImpl metricProvider = new MetricProviderImpl();
		return metricProvider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextValueType createTextValueType() {
		TextValueTypeImpl textValueType = new TextValueTypeImpl();
		return textValueType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RangeValueType createRangeValueType() {
		RangeValueTypeImpl rangeValueType = new RangeValueTypeImpl();
		return rangeValueType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AggregatedValueMetric createAggregatedValueMetric() {
		AggregatedValueMetricImpl aggregatedValueMetric = new AggregatedValueMetricImpl();
		return aggregatedValueMetric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumerationMetric createEnumerationMetric() {
		EnumerationMetricImpl enumerationMetric = new EnumerationMetricImpl();
		return enumerationMetric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumerationItem createEnumerationItem() {
		EnumerationItemImpl enumerationItem = new EnumerationItemImpl();
		return enumerationItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RealValueType createRealValueType() {
		RealValueTypeImpl realValueType = new RealValueTypeImpl();
		return realValueType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanValueType createBooleanValueType() {
		BooleanValueTypeImpl booleanValueType = new BooleanValueTypeImpl();
		return booleanValueType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerValueType createIntegerValueType() {
		IntegerValueTypeImpl integerValueType = new IntegerValueTypeImpl();
		return integerValueType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListValue createListValue() {
		ListValueImpl listValue = new ListValueImpl();
		return listValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QualityMetamodelPackage getQualityMetamodelPackage() {
		return (QualityMetamodelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static QualityMetamodelPackage getPackage() {
		return QualityMetamodelPackage.eINSTANCE;
	}

} //QualityMetamodelFactoryImpl
