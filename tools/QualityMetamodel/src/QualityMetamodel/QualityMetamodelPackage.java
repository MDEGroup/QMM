/**
 */
package QualityMetamodel;

import QualityMetamodel.QMM_OCL.QMM_OCLPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see QualityMetamodel.QualityMetamodelFactory
 * @model kind="package"
 * @generated
 */
public interface QualityMetamodelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "QualityMetamodel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.univaq.disim.it/mde/qualitymm";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "QM";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	QualityMetamodelPackage eINSTANCE = QualityMetamodel.impl.QualityMetamodelPackageImpl.init();

	/**
	 * The meta object id for the '{@link QualityMetamodel.impl.QualityModelImpl <em>Quality Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QualityMetamodel.impl.QualityModelImpl
	 * @see QualityMetamodel.impl.QualityMetamodelPackageImpl#getQualityModel()
	 * @generated
	 */
	int QUALITY_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_MODEL__LINE = QMM_OCLPackage.MODULE__LINE;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_MODEL__COLUMN = QMM_OCLPackage.MODULE__COLUMN;

	/**
	 * The feature id for the '<em><b>Char Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_MODEL__CHAR_START = QMM_OCLPackage.MODULE__CHAR_START;

	/**
	 * The feature id for the '<em><b>Char End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_MODEL__CHAR_END = QMM_OCLPackage.MODULE__CHAR_END;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_MODEL__NAME = QMM_OCLPackage.MODULE__NAME;

	/**
	 * The feature id for the '<em><b>Metamodels</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_MODEL__METAMODELS = QMM_OCLPackage.MODULE__METAMODELS;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_MODEL__IMPORTS = QMM_OCLPackage.MODULE__IMPORTS;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_MODEL__ELEMENTS = QMM_OCLPackage.MODULE__ELEMENTS;

	/**
	 * The feature id for the '<em><b>Metric Providers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_MODEL__METRIC_PROVIDERS = QMM_OCLPackage.MODULE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Quality Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_MODEL__QUALITY_TYPES = QMM_OCLPackage.MODULE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Quality Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_MODEL__QUALITY_ATTRIBUTES = QMM_OCLPackage.MODULE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Quality Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_MODEL__QUALITY_VALUES = QMM_OCLPackage.MODULE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Quality Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_MODEL_FEATURE_COUNT = QMM_OCLPackage.MODULE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Quality Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_MODEL_OPERATION_COUNT = QMM_OCLPackage.MODULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link QualityMetamodel.impl.QualityAttributeImpl <em>Quality Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QualityMetamodel.impl.QualityAttributeImpl
	 * @see QualityMetamodel.impl.QualityMetamodelPackageImpl#getQualityAttribute()
	 * @generated
	 */
	int QUALITY_ATTRIBUTE = 1;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_ATTRIBUTE__LINE = QMM_OCLPackage.VARIABLE_DECLARATION__LINE;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_ATTRIBUTE__COLUMN = QMM_OCLPackage.VARIABLE_DECLARATION__COLUMN;

	/**
	 * The feature id for the '<em><b>Char Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_ATTRIBUTE__CHAR_START = QMM_OCLPackage.VARIABLE_DECLARATION__CHAR_START;

	/**
	 * The feature id for the '<em><b>Char End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_ATTRIBUTE__CHAR_END = QMM_OCLPackage.VARIABLE_DECLARATION__CHAR_END;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_ATTRIBUTE__VAR_NAME = QMM_OCLPackage.VARIABLE_DECLARATION__VAR_NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_ATTRIBUTE__TYPE = QMM_OCLPackage.VARIABLE_DECLARATION__TYPE;

	/**
	 * The feature id for the '<em><b>Variable Exp</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_ATTRIBUTE__VARIABLE_EXP = QMM_OCLPackage.VARIABLE_DECLARATION__VARIABLE_EXP;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_ATTRIBUTE__VALUE = QMM_OCLPackage.VARIABLE_DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Quality Attributes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_ATTRIBUTE__QUALITY_ATTRIBUTES = QMM_OCLPackage.VARIABLE_DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Quality Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_ATTRIBUTE_FEATURE_COUNT = QMM_OCLPackage.VARIABLE_DECLARATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Quality Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_ATTRIBUTE_OPERATION_COUNT = QMM_OCLPackage.VARIABLE_DECLARATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link QualityMetamodel.impl.ValueImpl <em>Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QualityMetamodel.impl.ValueImpl
	 * @see QualityMetamodel.impl.QualityMetamodelPackageImpl#getValue()
	 * @generated
	 */
	int VALUE = 2;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE__LINE = QMM_OCLPackage.VARIABLE_DECLARATION__LINE;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE__COLUMN = QMM_OCLPackage.VARIABLE_DECLARATION__COLUMN;

	/**
	 * The feature id for the '<em><b>Char Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE__CHAR_START = QMM_OCLPackage.VARIABLE_DECLARATION__CHAR_START;

	/**
	 * The feature id for the '<em><b>Char End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE__CHAR_END = QMM_OCLPackage.VARIABLE_DECLARATION__CHAR_END;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE__VAR_NAME = QMM_OCLPackage.VARIABLE_DECLARATION__VAR_NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE__TYPE = QMM_OCLPackage.VARIABLE_DECLARATION__TYPE;

	/**
	 * The feature id for the '<em><b>Variable Exp</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE__VARIABLE_EXP = QMM_OCLPackage.VARIABLE_DECLARATION__VARIABLE_EXP;

	/**
	 * The feature id for the '<em><b>Value Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE__VALUE_TYPE = QMM_OCLPackage.VARIABLE_DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE__DESCRIPTION = QMM_OCLPackage.VARIABLE_DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_FEATURE_COUNT = QMM_OCLPackage.VARIABLE_DECLARATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_OPERATION_COUNT = QMM_OCLPackage.VARIABLE_DECLARATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link QualityMetamodel.impl.ValueTypeImpl <em>Value Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QualityMetamodel.impl.ValueTypeImpl
	 * @see QualityMetamodel.impl.QualityMetamodelPackageImpl#getValueType()
	 * @generated
	 */
	int VALUE_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_TYPE__LINE = QMM_OCLPackage.VARIABLE_DECLARATION__LINE;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_TYPE__COLUMN = QMM_OCLPackage.VARIABLE_DECLARATION__COLUMN;

	/**
	 * The feature id for the '<em><b>Char Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_TYPE__CHAR_START = QMM_OCLPackage.VARIABLE_DECLARATION__CHAR_START;

	/**
	 * The feature id for the '<em><b>Char End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_TYPE__CHAR_END = QMM_OCLPackage.VARIABLE_DECLARATION__CHAR_END;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_TYPE__VAR_NAME = QMM_OCLPackage.VARIABLE_DECLARATION__VAR_NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_TYPE__TYPE = QMM_OCLPackage.VARIABLE_DECLARATION__TYPE;

	/**
	 * The feature id for the '<em><b>Variable Exp</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_TYPE__VARIABLE_EXP = QMM_OCLPackage.VARIABLE_DECLARATION__VARIABLE_EXP;

	/**
	 * The feature id for the '<em><b>Val</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_TYPE__VAL = QMM_OCLPackage.VARIABLE_DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Value Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_TYPE_FEATURE_COUNT = QMM_OCLPackage.VARIABLE_DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Value Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_TYPE_OPERATION_COUNT = QMM_OCLPackage.VARIABLE_DECLARATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link QualityMetamodel.impl.SingleValueImpl <em>Single Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QualityMetamodel.impl.SingleValueImpl
	 * @see QualityMetamodel.impl.QualityMetamodelPackageImpl#getSingleValue()
	 * @generated
	 */
	int SINGLE_VALUE = 4;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_VALUE__LINE = VALUE__LINE;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_VALUE__COLUMN = VALUE__COLUMN;

	/**
	 * The feature id for the '<em><b>Char Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_VALUE__CHAR_START = VALUE__CHAR_START;

	/**
	 * The feature id for the '<em><b>Char End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_VALUE__CHAR_END = VALUE__CHAR_END;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_VALUE__VAR_NAME = VALUE__VAR_NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_VALUE__TYPE = VALUE__TYPE;

	/**
	 * The feature id for the '<em><b>Variable Exp</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_VALUE__VARIABLE_EXP = VALUE__VARIABLE_EXP;

	/**
	 * The feature id for the '<em><b>Value Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_VALUE__VALUE_TYPE = VALUE__VALUE_TYPE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_VALUE__DESCRIPTION = VALUE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Measured By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_VALUE__MEASURED_BY = VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Single Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Single Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_VALUE_OPERATION_COUNT = VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link QualityMetamodel.impl.AggregatedValueImpl <em>Aggregated Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QualityMetamodel.impl.AggregatedValueImpl
	 * @see QualityMetamodel.impl.QualityMetamodelPackageImpl#getAggregatedValue()
	 * @generated
	 */
	int AGGREGATED_VALUE = 5;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATED_VALUE__LINE = VALUE__LINE;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATED_VALUE__COLUMN = VALUE__COLUMN;

	/**
	 * The feature id for the '<em><b>Char Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATED_VALUE__CHAR_START = VALUE__CHAR_START;

	/**
	 * The feature id for the '<em><b>Char End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATED_VALUE__CHAR_END = VALUE__CHAR_END;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATED_VALUE__VAR_NAME = VALUE__VAR_NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATED_VALUE__TYPE = VALUE__TYPE;

	/**
	 * The feature id for the '<em><b>Variable Exp</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATED_VALUE__VARIABLE_EXP = VALUE__VARIABLE_EXP;

	/**
	 * The feature id for the '<em><b>Value Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATED_VALUE__VALUE_TYPE = VALUE__VALUE_TYPE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATED_VALUE__DESCRIPTION = VALUE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Calculated By</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATED_VALUE__CALCULATED_BY = VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Aggregated Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATED_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Aggregated Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATED_VALUE_OPERATION_COUNT = VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link QualityMetamodel.impl.OperationImpl <em>Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QualityMetamodel.impl.OperationImpl
	 * @see QualityMetamodel.impl.QualityMetamodelPackageImpl#getOperation()
	 * @generated
	 */
	int OPERATION = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Aggregated Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__AGGREGATED_VALUES = 1;

	/**
	 * The feature id for the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__BODY = 2;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__REF = 3;

	/**
	 * The number of structural features of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link QualityMetamodel.impl.MetricProviderImpl <em>Metric Provider</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QualityMetamodel.impl.MetricProviderImpl
	 * @see QualityMetamodel.impl.QualityMetamodelPackageImpl#getMetricProvider()
	 * @generated
	 */
	int METRIC_PROVIDER = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC_PROVIDER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC_PROVIDER__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC_PROVIDER__ID = 2;

	/**
	 * The number of structural features of the '<em>Metric Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC_PROVIDER_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Metric Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC_PROVIDER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link QualityMetamodel.impl.TextValueTypeImpl <em>Text Value Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QualityMetamodel.impl.TextValueTypeImpl
	 * @see QualityMetamodel.impl.QualityMetamodelPackageImpl#getTextValueType()
	 * @generated
	 */
	int TEXT_VALUE_TYPE = 8;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_VALUE_TYPE__LINE = VALUE_TYPE__LINE;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_VALUE_TYPE__COLUMN = VALUE_TYPE__COLUMN;

	/**
	 * The feature id for the '<em><b>Char Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_VALUE_TYPE__CHAR_START = VALUE_TYPE__CHAR_START;

	/**
	 * The feature id for the '<em><b>Char End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_VALUE_TYPE__CHAR_END = VALUE_TYPE__CHAR_END;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_VALUE_TYPE__VAR_NAME = VALUE_TYPE__VAR_NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_VALUE_TYPE__TYPE = VALUE_TYPE__TYPE;

	/**
	 * The feature id for the '<em><b>Variable Exp</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_VALUE_TYPE__VARIABLE_EXP = VALUE_TYPE__VARIABLE_EXP;

	/**
	 * The feature id for the '<em><b>Val</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_VALUE_TYPE__VAL = VALUE_TYPE__VAL;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_VALUE_TYPE__VALUE = VALUE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Text Value Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_VALUE_TYPE_FEATURE_COUNT = VALUE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Text Value Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_VALUE_TYPE_OPERATION_COUNT = VALUE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link QualityMetamodel.impl.RangeValueTypeImpl <em>Range Value Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QualityMetamodel.impl.RangeValueTypeImpl
	 * @see QualityMetamodel.impl.QualityMetamodelPackageImpl#getRangeValueType()
	 * @generated
	 */
	int RANGE_VALUE_TYPE = 9;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_VALUE_TYPE__LINE = VALUE_TYPE__LINE;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_VALUE_TYPE__COLUMN = VALUE_TYPE__COLUMN;

	/**
	 * The feature id for the '<em><b>Char Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_VALUE_TYPE__CHAR_START = VALUE_TYPE__CHAR_START;

	/**
	 * The feature id for the '<em><b>Char End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_VALUE_TYPE__CHAR_END = VALUE_TYPE__CHAR_END;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_VALUE_TYPE__VAR_NAME = VALUE_TYPE__VAR_NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_VALUE_TYPE__TYPE = VALUE_TYPE__TYPE;

	/**
	 * The feature id for the '<em><b>Variable Exp</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_VALUE_TYPE__VARIABLE_EXP = VALUE_TYPE__VARIABLE_EXP;

	/**
	 * The feature id for the '<em><b>Val</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_VALUE_TYPE__VAL = VALUE_TYPE__VAL;

	/**
	 * The feature id for the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_VALUE_TYPE__MIN = VALUE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_VALUE_TYPE__MAX = VALUE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Range Value Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_VALUE_TYPE_FEATURE_COUNT = VALUE_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Range Value Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_VALUE_TYPE_OPERATION_COUNT = VALUE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link QualityMetamodel.impl.AggregatedValueMetricImpl <em>Aggregated Value Metric</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QualityMetamodel.impl.AggregatedValueMetricImpl
	 * @see QualityMetamodel.impl.QualityMetamodelPackageImpl#getAggregatedValueMetric()
	 * @generated
	 */
	int AGGREGATED_VALUE_METRIC = 10;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATED_VALUE_METRIC__LINE = VALUE_TYPE__LINE;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATED_VALUE_METRIC__COLUMN = VALUE_TYPE__COLUMN;

	/**
	 * The feature id for the '<em><b>Char Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATED_VALUE_METRIC__CHAR_START = VALUE_TYPE__CHAR_START;

	/**
	 * The feature id for the '<em><b>Char End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATED_VALUE_METRIC__CHAR_END = VALUE_TYPE__CHAR_END;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATED_VALUE_METRIC__VAR_NAME = VALUE_TYPE__VAR_NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATED_VALUE_METRIC__TYPE = VALUE_TYPE__TYPE;

	/**
	 * The feature id for the '<em><b>Variable Exp</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATED_VALUE_METRIC__VARIABLE_EXP = VALUE_TYPE__VARIABLE_EXP;

	/**
	 * The feature id for the '<em><b>Val</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATED_VALUE_METRIC__VAL = VALUE_TYPE__VAL;

	/**
	 * The feature id for the '<em><b>Minimum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATED_VALUE_METRIC__MINIMUM = VALUE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Maximum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATED_VALUE_METRIC__MAXIMUM = VALUE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Average</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATED_VALUE_METRIC__AVERAGE = VALUE_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Median</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATED_VALUE_METRIC__MEDIAN = VALUE_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Standard Deviation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATED_VALUE_METRIC__STANDARD_DEVIATION = VALUE_TYPE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Aggregated Value Metric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATED_VALUE_METRIC_FEATURE_COUNT = VALUE_TYPE_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Aggregated Value Metric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATED_VALUE_METRIC_OPERATION_COUNT = VALUE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link QualityMetamodel.impl.EnumerationMetricImpl <em>Enumeration Metric</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QualityMetamodel.impl.EnumerationMetricImpl
	 * @see QualityMetamodel.impl.QualityMetamodelPackageImpl#getEnumerationMetric()
	 * @generated
	 */
	int ENUMERATION_METRIC = 11;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_METRIC__LINE = VALUE_TYPE__LINE;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_METRIC__COLUMN = VALUE_TYPE__COLUMN;

	/**
	 * The feature id for the '<em><b>Char Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_METRIC__CHAR_START = VALUE_TYPE__CHAR_START;

	/**
	 * The feature id for the '<em><b>Char End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_METRIC__CHAR_END = VALUE_TYPE__CHAR_END;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_METRIC__VAR_NAME = VALUE_TYPE__VAR_NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_METRIC__TYPE = VALUE_TYPE__TYPE;

	/**
	 * The feature id for the '<em><b>Variable Exp</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_METRIC__VARIABLE_EXP = VALUE_TYPE__VARIABLE_EXP;

	/**
	 * The feature id for the '<em><b>Val</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_METRIC__VAL = VALUE_TYPE__VAL;

	/**
	 * The feature id for the '<em><b>Set</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_METRIC__SET = VALUE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_METRIC__VALUE = VALUE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Enumeration Metric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_METRIC_FEATURE_COUNT = VALUE_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Enumeration Metric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_METRIC_OPERATION_COUNT = VALUE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link QualityMetamodel.impl.EnumerationItemImpl <em>Enumeration Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QualityMetamodel.impl.EnumerationItemImpl
	 * @see QualityMetamodel.impl.QualityMetamodelPackageImpl#getEnumerationItem()
	 * @generated
	 */
	int ENUMERATION_ITEM = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_ITEM__NAME = 0;

	/**
	 * The number of structural features of the '<em>Enumeration Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_ITEM_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Enumeration Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_ITEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link QualityMetamodel.impl.RealValueTypeImpl <em>Real Value Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QualityMetamodel.impl.RealValueTypeImpl
	 * @see QualityMetamodel.impl.QualityMetamodelPackageImpl#getRealValueType()
	 * @generated
	 */
	int REAL_VALUE_TYPE = 13;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_VALUE_TYPE__LINE = VALUE_TYPE__LINE;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_VALUE_TYPE__COLUMN = VALUE_TYPE__COLUMN;

	/**
	 * The feature id for the '<em><b>Char Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_VALUE_TYPE__CHAR_START = VALUE_TYPE__CHAR_START;

	/**
	 * The feature id for the '<em><b>Char End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_VALUE_TYPE__CHAR_END = VALUE_TYPE__CHAR_END;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_VALUE_TYPE__VAR_NAME = VALUE_TYPE__VAR_NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_VALUE_TYPE__TYPE = VALUE_TYPE__TYPE;

	/**
	 * The feature id for the '<em><b>Variable Exp</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_VALUE_TYPE__VARIABLE_EXP = VALUE_TYPE__VARIABLE_EXP;

	/**
	 * The feature id for the '<em><b>Val</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_VALUE_TYPE__VAL = VALUE_TYPE__VAL;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_VALUE_TYPE__VALUE = VALUE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Real Value Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_VALUE_TYPE_FEATURE_COUNT = VALUE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Real Value Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_VALUE_TYPE_OPERATION_COUNT = VALUE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link QualityMetamodel.impl.BooleanValueTypeImpl <em>Boolean Value Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QualityMetamodel.impl.BooleanValueTypeImpl
	 * @see QualityMetamodel.impl.QualityMetamodelPackageImpl#getBooleanValueType()
	 * @generated
	 */
	int BOOLEAN_VALUE_TYPE = 14;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VALUE_TYPE__LINE = VALUE_TYPE__LINE;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VALUE_TYPE__COLUMN = VALUE_TYPE__COLUMN;

	/**
	 * The feature id for the '<em><b>Char Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VALUE_TYPE__CHAR_START = VALUE_TYPE__CHAR_START;

	/**
	 * The feature id for the '<em><b>Char End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VALUE_TYPE__CHAR_END = VALUE_TYPE__CHAR_END;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VALUE_TYPE__VAR_NAME = VALUE_TYPE__VAR_NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VALUE_TYPE__TYPE = VALUE_TYPE__TYPE;

	/**
	 * The feature id for the '<em><b>Variable Exp</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VALUE_TYPE__VARIABLE_EXP = VALUE_TYPE__VARIABLE_EXP;

	/**
	 * The feature id for the '<em><b>Val</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VALUE_TYPE__VAL = VALUE_TYPE__VAL;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VALUE_TYPE__VALUE = VALUE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Boolean Value Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VALUE_TYPE_FEATURE_COUNT = VALUE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Boolean Value Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VALUE_TYPE_OPERATION_COUNT = VALUE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link QualityMetamodel.impl.IntegerValueTypeImpl <em>Integer Value Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QualityMetamodel.impl.IntegerValueTypeImpl
	 * @see QualityMetamodel.impl.QualityMetamodelPackageImpl#getIntegerValueType()
	 * @generated
	 */
	int INTEGER_VALUE_TYPE = 15;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VALUE_TYPE__LINE = VALUE_TYPE__LINE;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VALUE_TYPE__COLUMN = VALUE_TYPE__COLUMN;

	/**
	 * The feature id for the '<em><b>Char Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VALUE_TYPE__CHAR_START = VALUE_TYPE__CHAR_START;

	/**
	 * The feature id for the '<em><b>Char End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VALUE_TYPE__CHAR_END = VALUE_TYPE__CHAR_END;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VALUE_TYPE__VAR_NAME = VALUE_TYPE__VAR_NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VALUE_TYPE__TYPE = VALUE_TYPE__TYPE;

	/**
	 * The feature id for the '<em><b>Variable Exp</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VALUE_TYPE__VARIABLE_EXP = VALUE_TYPE__VARIABLE_EXP;

	/**
	 * The feature id for the '<em><b>Val</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VALUE_TYPE__VAL = VALUE_TYPE__VAL;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VALUE_TYPE__VALUE = VALUE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Integer Value Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VALUE_TYPE_FEATURE_COUNT = VALUE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Integer Value Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VALUE_TYPE_OPERATION_COUNT = VALUE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link QualityMetamodel.impl.ListValueImpl <em>List Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QualityMetamodel.impl.ListValueImpl
	 * @see QualityMetamodel.impl.QualityMetamodelPackageImpl#getListValue()
	 * @generated
	 */
	int LIST_VALUE = 16;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_VALUE__LINE = VALUE_TYPE__LINE;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_VALUE__COLUMN = VALUE_TYPE__COLUMN;

	/**
	 * The feature id for the '<em><b>Char Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_VALUE__CHAR_START = VALUE_TYPE__CHAR_START;

	/**
	 * The feature id for the '<em><b>Char End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_VALUE__CHAR_END = VALUE_TYPE__CHAR_END;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_VALUE__VAR_NAME = VALUE_TYPE__VAR_NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_VALUE__TYPE = VALUE_TYPE__TYPE;

	/**
	 * The feature id for the '<em><b>Variable Exp</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_VALUE__VARIABLE_EXP = VALUE_TYPE__VARIABLE_EXP;

	/**
	 * The feature id for the '<em><b>Val</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_VALUE__VAL = VALUE_TYPE__VAL;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_VALUE__ELEMENTS = VALUE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>List Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_VALUE_FEATURE_COUNT = VALUE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>List Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_VALUE_OPERATION_COUNT = VALUE_TYPE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link QualityMetamodel.QualityModel <em>Quality Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Quality Model</em>'.
	 * @see QualityMetamodel.QualityModel
	 * @generated
	 */
	EClass getQualityModel();

	/**
	 * Returns the meta object for the containment reference list '{@link QualityMetamodel.QualityModel#getMetricProviders <em>Metric Providers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Metric Providers</em>'.
	 * @see QualityMetamodel.QualityModel#getMetricProviders()
	 * @see #getQualityModel()
	 * @generated
	 */
	EReference getQualityModel_MetricProviders();

	/**
	 * Returns the meta object for the containment reference list '{@link QualityMetamodel.QualityModel#getQualityTypes <em>Quality Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Quality Types</em>'.
	 * @see QualityMetamodel.QualityModel#getQualityTypes()
	 * @see #getQualityModel()
	 * @generated
	 */
	EReference getQualityModel_QualityTypes();

	/**
	 * Returns the meta object for the containment reference list '{@link QualityMetamodel.QualityModel#getQualityAttributes <em>Quality Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Quality Attributes</em>'.
	 * @see QualityMetamodel.QualityModel#getQualityAttributes()
	 * @see #getQualityModel()
	 * @generated
	 */
	EReference getQualityModel_QualityAttributes();

	/**
	 * Returns the meta object for the containment reference list '{@link QualityMetamodel.QualityModel#getQualityValues <em>Quality Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Quality Values</em>'.
	 * @see QualityMetamodel.QualityModel#getQualityValues()
	 * @see #getQualityModel()
	 * @generated
	 */
	EReference getQualityModel_QualityValues();

	/**
	 * Returns the meta object for class '{@link QualityMetamodel.QualityAttribute <em>Quality Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Quality Attribute</em>'.
	 * @see QualityMetamodel.QualityAttribute
	 * @generated
	 */
	EClass getQualityAttribute();

	/**
	 * Returns the meta object for the reference '{@link QualityMetamodel.QualityAttribute#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see QualityMetamodel.QualityAttribute#getValue()
	 * @see #getQualityAttribute()
	 * @generated
	 */
	EReference getQualityAttribute_Value();

	/**
	 * Returns the meta object for the reference list '{@link QualityMetamodel.QualityAttribute#getQualityAttributes <em>Quality Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Quality Attributes</em>'.
	 * @see QualityMetamodel.QualityAttribute#getQualityAttributes()
	 * @see #getQualityAttribute()
	 * @generated
	 */
	EReference getQualityAttribute_QualityAttributes();

	/**
	 * Returns the meta object for class '{@link QualityMetamodel.Value <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value</em>'.
	 * @see QualityMetamodel.Value
	 * @generated
	 */
	EClass getValue();

	/**
	 * Returns the meta object for the reference '{@link QualityMetamodel.Value#getValueType <em>Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value Type</em>'.
	 * @see QualityMetamodel.Value#getValueType()
	 * @see #getValue()
	 * @generated
	 */
	EReference getValue_ValueType();

	/**
	 * Returns the meta object for the attribute '{@link QualityMetamodel.Value#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see QualityMetamodel.Value#getDescription()
	 * @see #getValue()
	 * @generated
	 */
	EAttribute getValue_Description();

	/**
	 * Returns the meta object for class '{@link QualityMetamodel.ValueType <em>Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value Type</em>'.
	 * @see QualityMetamodel.ValueType
	 * @generated
	 */
	EClass getValueType();

	/**
	 * Returns the meta object for the reference '{@link QualityMetamodel.ValueType#getVal <em>Val</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Val</em>'.
	 * @see QualityMetamodel.ValueType#getVal()
	 * @see #getValueType()
	 * @generated
	 */
	EReference getValueType_Val();

	/**
	 * Returns the meta object for class '{@link QualityMetamodel.SingleValue <em>Single Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Single Value</em>'.
	 * @see QualityMetamodel.SingleValue
	 * @generated
	 */
	EClass getSingleValue();

	/**
	 * Returns the meta object for the reference '{@link QualityMetamodel.SingleValue#getMeasuredBy <em>Measured By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Measured By</em>'.
	 * @see QualityMetamodel.SingleValue#getMeasuredBy()
	 * @see #getSingleValue()
	 * @generated
	 */
	EReference getSingleValue_MeasuredBy();

	/**
	 * Returns the meta object for class '{@link QualityMetamodel.AggregatedValue <em>Aggregated Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Aggregated Value</em>'.
	 * @see QualityMetamodel.AggregatedValue
	 * @generated
	 */
	EClass getAggregatedValue();

	/**
	 * Returns the meta object for the containment reference '{@link QualityMetamodel.AggregatedValue#getCalculatedBy <em>Calculated By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Calculated By</em>'.
	 * @see QualityMetamodel.AggregatedValue#getCalculatedBy()
	 * @see #getAggregatedValue()
	 * @generated
	 */
	EReference getAggregatedValue_CalculatedBy();

	/**
	 * Returns the meta object for class '{@link QualityMetamodel.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation</em>'.
	 * @see QualityMetamodel.Operation
	 * @generated
	 */
	EClass getOperation();

	/**
	 * Returns the meta object for the attribute '{@link QualityMetamodel.Operation#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see QualityMetamodel.Operation#getName()
	 * @see #getOperation()
	 * @generated
	 */
	EAttribute getOperation_Name();

	/**
	 * Returns the meta object for the reference list '{@link QualityMetamodel.Operation#getAggregatedValues <em>Aggregated Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Aggregated Values</em>'.
	 * @see QualityMetamodel.Operation#getAggregatedValues()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_AggregatedValues();

	/**
	 * Returns the meta object for the attribute '{@link QualityMetamodel.Operation#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Body</em>'.
	 * @see QualityMetamodel.Operation#getBody()
	 * @see #getOperation()
	 * @generated
	 */
	EAttribute getOperation_Body();

	/**
	 * Returns the meta object for the containment reference '{@link QualityMetamodel.Operation#getRef <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ref</em>'.
	 * @see QualityMetamodel.Operation#getRef()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_Ref();

	/**
	 * Returns the meta object for class '{@link QualityMetamodel.MetricProvider <em>Metric Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Metric Provider</em>'.
	 * @see QualityMetamodel.MetricProvider
	 * @generated
	 */
	EClass getMetricProvider();

	/**
	 * Returns the meta object for the attribute '{@link QualityMetamodel.MetricProvider#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see QualityMetamodel.MetricProvider#getName()
	 * @see #getMetricProvider()
	 * @generated
	 */
	EAttribute getMetricProvider_Name();

	/**
	 * Returns the meta object for the attribute '{@link QualityMetamodel.MetricProvider#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see QualityMetamodel.MetricProvider#getDescription()
	 * @see #getMetricProvider()
	 * @generated
	 */
	EAttribute getMetricProvider_Description();

	/**
	 * Returns the meta object for the attribute '{@link QualityMetamodel.MetricProvider#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see QualityMetamodel.MetricProvider#getId()
	 * @see #getMetricProvider()
	 * @generated
	 */
	EAttribute getMetricProvider_Id();

	/**
	 * Returns the meta object for class '{@link QualityMetamodel.TextValueType <em>Text Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text Value Type</em>'.
	 * @see QualityMetamodel.TextValueType
	 * @generated
	 */
	EClass getTextValueType();

	/**
	 * Returns the meta object for the attribute '{@link QualityMetamodel.TextValueType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see QualityMetamodel.TextValueType#getValue()
	 * @see #getTextValueType()
	 * @generated
	 */
	EAttribute getTextValueType_Value();

	/**
	 * Returns the meta object for class '{@link QualityMetamodel.RangeValueType <em>Range Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Range Value Type</em>'.
	 * @see QualityMetamodel.RangeValueType
	 * @generated
	 */
	EClass getRangeValueType();

	/**
	 * Returns the meta object for the attribute '{@link QualityMetamodel.RangeValueType#getMin <em>Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min</em>'.
	 * @see QualityMetamodel.RangeValueType#getMin()
	 * @see #getRangeValueType()
	 * @generated
	 */
	EAttribute getRangeValueType_Min();

	/**
	 * Returns the meta object for the attribute '{@link QualityMetamodel.RangeValueType#getMax <em>Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max</em>'.
	 * @see QualityMetamodel.RangeValueType#getMax()
	 * @see #getRangeValueType()
	 * @generated
	 */
	EAttribute getRangeValueType_Max();

	/**
	 * Returns the meta object for class '{@link QualityMetamodel.AggregatedValueMetric <em>Aggregated Value Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Aggregated Value Metric</em>'.
	 * @see QualityMetamodel.AggregatedValueMetric
	 * @generated
	 */
	EClass getAggregatedValueMetric();

	/**
	 * Returns the meta object for the attribute '{@link QualityMetamodel.AggregatedValueMetric#getMinimum <em>Minimum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Minimum</em>'.
	 * @see QualityMetamodel.AggregatedValueMetric#getMinimum()
	 * @see #getAggregatedValueMetric()
	 * @generated
	 */
	EAttribute getAggregatedValueMetric_Minimum();

	/**
	 * Returns the meta object for the attribute '{@link QualityMetamodel.AggregatedValueMetric#getMaximum <em>Maximum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maximum</em>'.
	 * @see QualityMetamodel.AggregatedValueMetric#getMaximum()
	 * @see #getAggregatedValueMetric()
	 * @generated
	 */
	EAttribute getAggregatedValueMetric_Maximum();

	/**
	 * Returns the meta object for the attribute '{@link QualityMetamodel.AggregatedValueMetric#getAverage <em>Average</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Average</em>'.
	 * @see QualityMetamodel.AggregatedValueMetric#getAverage()
	 * @see #getAggregatedValueMetric()
	 * @generated
	 */
	EAttribute getAggregatedValueMetric_Average();

	/**
	 * Returns the meta object for the attribute '{@link QualityMetamodel.AggregatedValueMetric#getMedian <em>Median</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Median</em>'.
	 * @see QualityMetamodel.AggregatedValueMetric#getMedian()
	 * @see #getAggregatedValueMetric()
	 * @generated
	 */
	EAttribute getAggregatedValueMetric_Median();

	/**
	 * Returns the meta object for the attribute '{@link QualityMetamodel.AggregatedValueMetric#getStandardDeviation <em>Standard Deviation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Standard Deviation</em>'.
	 * @see QualityMetamodel.AggregatedValueMetric#getStandardDeviation()
	 * @see #getAggregatedValueMetric()
	 * @generated
	 */
	EAttribute getAggregatedValueMetric_StandardDeviation();

	/**
	 * Returns the meta object for class '{@link QualityMetamodel.EnumerationMetric <em>Enumeration Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enumeration Metric</em>'.
	 * @see QualityMetamodel.EnumerationMetric
	 * @generated
	 */
	EClass getEnumerationMetric();

	/**
	 * Returns the meta object for the containment reference list '{@link QualityMetamodel.EnumerationMetric#getSet <em>Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Set</em>'.
	 * @see QualityMetamodel.EnumerationMetric#getSet()
	 * @see #getEnumerationMetric()
	 * @generated
	 */
	EReference getEnumerationMetric_Set();

	/**
	 * Returns the meta object for the reference '{@link QualityMetamodel.EnumerationMetric#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see QualityMetamodel.EnumerationMetric#getValue()
	 * @see #getEnumerationMetric()
	 * @generated
	 */
	EReference getEnumerationMetric_Value();

	/**
	 * Returns the meta object for class '{@link QualityMetamodel.EnumerationItem <em>Enumeration Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enumeration Item</em>'.
	 * @see QualityMetamodel.EnumerationItem
	 * @generated
	 */
	EClass getEnumerationItem();

	/**
	 * Returns the meta object for the attribute '{@link QualityMetamodel.EnumerationItem#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see QualityMetamodel.EnumerationItem#getName()
	 * @see #getEnumerationItem()
	 * @generated
	 */
	EAttribute getEnumerationItem_Name();

	/**
	 * Returns the meta object for class '{@link QualityMetamodel.RealValueType <em>Real Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Real Value Type</em>'.
	 * @see QualityMetamodel.RealValueType
	 * @generated
	 */
	EClass getRealValueType();

	/**
	 * Returns the meta object for the attribute '{@link QualityMetamodel.RealValueType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see QualityMetamodel.RealValueType#getValue()
	 * @see #getRealValueType()
	 * @generated
	 */
	EAttribute getRealValueType_Value();

	/**
	 * Returns the meta object for class '{@link QualityMetamodel.BooleanValueType <em>Boolean Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Value Type</em>'.
	 * @see QualityMetamodel.BooleanValueType
	 * @generated
	 */
	EClass getBooleanValueType();

	/**
	 * Returns the meta object for the attribute '{@link QualityMetamodel.BooleanValueType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see QualityMetamodel.BooleanValueType#getValue()
	 * @see #getBooleanValueType()
	 * @generated
	 */
	EAttribute getBooleanValueType_Value();

	/**
	 * Returns the meta object for class '{@link QualityMetamodel.IntegerValueType <em>Integer Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Value Type</em>'.
	 * @see QualityMetamodel.IntegerValueType
	 * @generated
	 */
	EClass getIntegerValueType();

	/**
	 * Returns the meta object for the attribute '{@link QualityMetamodel.IntegerValueType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see QualityMetamodel.IntegerValueType#getValue()
	 * @see #getIntegerValueType()
	 * @generated
	 */
	EAttribute getIntegerValueType_Value();

	/**
	 * Returns the meta object for class '{@link QualityMetamodel.ListValue <em>List Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List Value</em>'.
	 * @see QualityMetamodel.ListValue
	 * @generated
	 */
	EClass getListValue();

	/**
	 * Returns the meta object for the containment reference list '{@link QualityMetamodel.ListValue#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see QualityMetamodel.ListValue#getElements()
	 * @see #getListValue()
	 * @generated
	 */
	EReference getListValue_Elements();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	QualityMetamodelFactory getQualityMetamodelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link QualityMetamodel.impl.QualityModelImpl <em>Quality Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QualityMetamodel.impl.QualityModelImpl
		 * @see QualityMetamodel.impl.QualityMetamodelPackageImpl#getQualityModel()
		 * @generated
		 */
		EClass QUALITY_MODEL = eINSTANCE.getQualityModel();

		/**
		 * The meta object literal for the '<em><b>Metric Providers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUALITY_MODEL__METRIC_PROVIDERS = eINSTANCE.getQualityModel_MetricProviders();

		/**
		 * The meta object literal for the '<em><b>Quality Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUALITY_MODEL__QUALITY_TYPES = eINSTANCE.getQualityModel_QualityTypes();

		/**
		 * The meta object literal for the '<em><b>Quality Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUALITY_MODEL__QUALITY_ATTRIBUTES = eINSTANCE.getQualityModel_QualityAttributes();

		/**
		 * The meta object literal for the '<em><b>Quality Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUALITY_MODEL__QUALITY_VALUES = eINSTANCE.getQualityModel_QualityValues();

		/**
		 * The meta object literal for the '{@link QualityMetamodel.impl.QualityAttributeImpl <em>Quality Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QualityMetamodel.impl.QualityAttributeImpl
		 * @see QualityMetamodel.impl.QualityMetamodelPackageImpl#getQualityAttribute()
		 * @generated
		 */
		EClass QUALITY_ATTRIBUTE = eINSTANCE.getQualityAttribute();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUALITY_ATTRIBUTE__VALUE = eINSTANCE.getQualityAttribute_Value();

		/**
		 * The meta object literal for the '<em><b>Quality Attributes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUALITY_ATTRIBUTE__QUALITY_ATTRIBUTES = eINSTANCE.getQualityAttribute_QualityAttributes();

		/**
		 * The meta object literal for the '{@link QualityMetamodel.impl.ValueImpl <em>Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QualityMetamodel.impl.ValueImpl
		 * @see QualityMetamodel.impl.QualityMetamodelPackageImpl#getValue()
		 * @generated
		 */
		EClass VALUE = eINSTANCE.getValue();

		/**
		 * The meta object literal for the '<em><b>Value Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUE__VALUE_TYPE = eINSTANCE.getValue_ValueType();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUE__DESCRIPTION = eINSTANCE.getValue_Description();

		/**
		 * The meta object literal for the '{@link QualityMetamodel.impl.ValueTypeImpl <em>Value Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QualityMetamodel.impl.ValueTypeImpl
		 * @see QualityMetamodel.impl.QualityMetamodelPackageImpl#getValueType()
		 * @generated
		 */
		EClass VALUE_TYPE = eINSTANCE.getValueType();

		/**
		 * The meta object literal for the '<em><b>Val</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUE_TYPE__VAL = eINSTANCE.getValueType_Val();

		/**
		 * The meta object literal for the '{@link QualityMetamodel.impl.SingleValueImpl <em>Single Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QualityMetamodel.impl.SingleValueImpl
		 * @see QualityMetamodel.impl.QualityMetamodelPackageImpl#getSingleValue()
		 * @generated
		 */
		EClass SINGLE_VALUE = eINSTANCE.getSingleValue();

		/**
		 * The meta object literal for the '<em><b>Measured By</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SINGLE_VALUE__MEASURED_BY = eINSTANCE.getSingleValue_MeasuredBy();

		/**
		 * The meta object literal for the '{@link QualityMetamodel.impl.AggregatedValueImpl <em>Aggregated Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QualityMetamodel.impl.AggregatedValueImpl
		 * @see QualityMetamodel.impl.QualityMetamodelPackageImpl#getAggregatedValue()
		 * @generated
		 */
		EClass AGGREGATED_VALUE = eINSTANCE.getAggregatedValue();

		/**
		 * The meta object literal for the '<em><b>Calculated By</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGGREGATED_VALUE__CALCULATED_BY = eINSTANCE.getAggregatedValue_CalculatedBy();

		/**
		 * The meta object literal for the '{@link QualityMetamodel.impl.OperationImpl <em>Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QualityMetamodel.impl.OperationImpl
		 * @see QualityMetamodel.impl.QualityMetamodelPackageImpl#getOperation()
		 * @generated
		 */
		EClass OPERATION = eINSTANCE.getOperation();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION__NAME = eINSTANCE.getOperation_Name();

		/**
		 * The meta object literal for the '<em><b>Aggregated Values</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION__AGGREGATED_VALUES = eINSTANCE.getOperation_AggregatedValues();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION__BODY = eINSTANCE.getOperation_Body();

		/**
		 * The meta object literal for the '<em><b>Ref</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION__REF = eINSTANCE.getOperation_Ref();

		/**
		 * The meta object literal for the '{@link QualityMetamodel.impl.MetricProviderImpl <em>Metric Provider</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QualityMetamodel.impl.MetricProviderImpl
		 * @see QualityMetamodel.impl.QualityMetamodelPackageImpl#getMetricProvider()
		 * @generated
		 */
		EClass METRIC_PROVIDER = eINSTANCE.getMetricProvider();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METRIC_PROVIDER__NAME = eINSTANCE.getMetricProvider_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METRIC_PROVIDER__DESCRIPTION = eINSTANCE.getMetricProvider_Description();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METRIC_PROVIDER__ID = eINSTANCE.getMetricProvider_Id();

		/**
		 * The meta object literal for the '{@link QualityMetamodel.impl.TextValueTypeImpl <em>Text Value Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QualityMetamodel.impl.TextValueTypeImpl
		 * @see QualityMetamodel.impl.QualityMetamodelPackageImpl#getTextValueType()
		 * @generated
		 */
		EClass TEXT_VALUE_TYPE = eINSTANCE.getTextValueType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_VALUE_TYPE__VALUE = eINSTANCE.getTextValueType_Value();

		/**
		 * The meta object literal for the '{@link QualityMetamodel.impl.RangeValueTypeImpl <em>Range Value Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QualityMetamodel.impl.RangeValueTypeImpl
		 * @see QualityMetamodel.impl.QualityMetamodelPackageImpl#getRangeValueType()
		 * @generated
		 */
		EClass RANGE_VALUE_TYPE = eINSTANCE.getRangeValueType();

		/**
		 * The meta object literal for the '<em><b>Min</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RANGE_VALUE_TYPE__MIN = eINSTANCE.getRangeValueType_Min();

		/**
		 * The meta object literal for the '<em><b>Max</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RANGE_VALUE_TYPE__MAX = eINSTANCE.getRangeValueType_Max();

		/**
		 * The meta object literal for the '{@link QualityMetamodel.impl.AggregatedValueMetricImpl <em>Aggregated Value Metric</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QualityMetamodel.impl.AggregatedValueMetricImpl
		 * @see QualityMetamodel.impl.QualityMetamodelPackageImpl#getAggregatedValueMetric()
		 * @generated
		 */
		EClass AGGREGATED_VALUE_METRIC = eINSTANCE.getAggregatedValueMetric();

		/**
		 * The meta object literal for the '<em><b>Minimum</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGGREGATED_VALUE_METRIC__MINIMUM = eINSTANCE.getAggregatedValueMetric_Minimum();

		/**
		 * The meta object literal for the '<em><b>Maximum</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGGREGATED_VALUE_METRIC__MAXIMUM = eINSTANCE.getAggregatedValueMetric_Maximum();

		/**
		 * The meta object literal for the '<em><b>Average</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGGREGATED_VALUE_METRIC__AVERAGE = eINSTANCE.getAggregatedValueMetric_Average();

		/**
		 * The meta object literal for the '<em><b>Median</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGGREGATED_VALUE_METRIC__MEDIAN = eINSTANCE.getAggregatedValueMetric_Median();

		/**
		 * The meta object literal for the '<em><b>Standard Deviation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGGREGATED_VALUE_METRIC__STANDARD_DEVIATION = eINSTANCE.getAggregatedValueMetric_StandardDeviation();

		/**
		 * The meta object literal for the '{@link QualityMetamodel.impl.EnumerationMetricImpl <em>Enumeration Metric</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QualityMetamodel.impl.EnumerationMetricImpl
		 * @see QualityMetamodel.impl.QualityMetamodelPackageImpl#getEnumerationMetric()
		 * @generated
		 */
		EClass ENUMERATION_METRIC = eINSTANCE.getEnumerationMetric();

		/**
		 * The meta object literal for the '<em><b>Set</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENUMERATION_METRIC__SET = eINSTANCE.getEnumerationMetric_Set();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENUMERATION_METRIC__VALUE = eINSTANCE.getEnumerationMetric_Value();

		/**
		 * The meta object literal for the '{@link QualityMetamodel.impl.EnumerationItemImpl <em>Enumeration Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QualityMetamodel.impl.EnumerationItemImpl
		 * @see QualityMetamodel.impl.QualityMetamodelPackageImpl#getEnumerationItem()
		 * @generated
		 */
		EClass ENUMERATION_ITEM = eINSTANCE.getEnumerationItem();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENUMERATION_ITEM__NAME = eINSTANCE.getEnumerationItem_Name();

		/**
		 * The meta object literal for the '{@link QualityMetamodel.impl.RealValueTypeImpl <em>Real Value Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QualityMetamodel.impl.RealValueTypeImpl
		 * @see QualityMetamodel.impl.QualityMetamodelPackageImpl#getRealValueType()
		 * @generated
		 */
		EClass REAL_VALUE_TYPE = eINSTANCE.getRealValueType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REAL_VALUE_TYPE__VALUE = eINSTANCE.getRealValueType_Value();

		/**
		 * The meta object literal for the '{@link QualityMetamodel.impl.BooleanValueTypeImpl <em>Boolean Value Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QualityMetamodel.impl.BooleanValueTypeImpl
		 * @see QualityMetamodel.impl.QualityMetamodelPackageImpl#getBooleanValueType()
		 * @generated
		 */
		EClass BOOLEAN_VALUE_TYPE = eINSTANCE.getBooleanValueType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOLEAN_VALUE_TYPE__VALUE = eINSTANCE.getBooleanValueType_Value();

		/**
		 * The meta object literal for the '{@link QualityMetamodel.impl.IntegerValueTypeImpl <em>Integer Value Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QualityMetamodel.impl.IntegerValueTypeImpl
		 * @see QualityMetamodel.impl.QualityMetamodelPackageImpl#getIntegerValueType()
		 * @generated
		 */
		EClass INTEGER_VALUE_TYPE = eINSTANCE.getIntegerValueType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTEGER_VALUE_TYPE__VALUE = eINSTANCE.getIntegerValueType_Value();

		/**
		 * The meta object literal for the '{@link QualityMetamodel.impl.ListValueImpl <em>List Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QualityMetamodel.impl.ListValueImpl
		 * @see QualityMetamodel.impl.QualityMetamodelPackageImpl#getListValue()
		 * @generated
		 */
		EClass LIST_VALUE = eINSTANCE.getListValue();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIST_VALUE__ELEMENTS = eINSTANCE.getListValue_Elements();

	}

} //QualityMetamodelPackage
