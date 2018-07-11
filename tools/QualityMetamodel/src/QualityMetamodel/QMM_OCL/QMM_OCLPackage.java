/**
 */
package QualityMetamodel.QMM_OCL;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
 * @see QualityMetamodel.QMM_OCL.QMM_OCLFactory
 * @model kind="package"
 * @generated
 */
public interface QMM_OCLPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "QMM_OCL";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.univaq.disim.it/mde/qualitymm/ocl";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "QMM_OCL";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	QMM_OCLPackage eINSTANCE = QualityMetamodel.QMM_OCL.impl.QMM_OCLPackageImpl.init();

	/**
	 * The meta object id for the '{@link QualityMetamodel.QMM_OCL.impl.LocatedElementImpl <em>Located Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QualityMetamodel.QMM_OCL.impl.LocatedElementImpl
	 * @see QualityMetamodel.QMM_OCL.impl.QMM_OCLPackageImpl#getLocatedElement()
	 * @generated
	 */
	int LOCATED_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATED_ELEMENT__LINE = 0;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATED_ELEMENT__COLUMN = 1;

	/**
	 * The feature id for the '<em><b>Char Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATED_ELEMENT__CHAR_START = 2;

	/**
	 * The feature id for the '<em><b>Char End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATED_ELEMENT__CHAR_END = 3;

	/**
	 * The number of structural features of the '<em>Located Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATED_ELEMENT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Located Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link QualityMetamodel.QMM_OCL.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QualityMetamodel.QMM_OCL.impl.NamedElementImpl
	 * @see QualityMetamodel.QMM_OCL.impl.QMM_OCLPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__LINE = LOCATED_ELEMENT__LINE;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__COLUMN = LOCATED_ELEMENT__COLUMN;

	/**
	 * The feature id for the '<em><b>Char Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__CHAR_START = LOCATED_ELEMENT__CHAR_START;

	/**
	 * The feature id for the '<em><b>Char End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__CHAR_END = LOCATED_ELEMENT__CHAR_END;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = LOCATED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = LOCATED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_OPERATION_COUNT = LOCATED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link QualityMetamodel.QMM_OCL.impl.ModuleImpl <em>Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QualityMetamodel.QMM_OCL.impl.ModuleImpl
	 * @see QualityMetamodel.QMM_OCL.impl.QMM_OCLPackageImpl#getModule()
	 * @generated
	 */
	int MODULE = 2;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__LINE = NAMED_ELEMENT__LINE;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__COLUMN = NAMED_ELEMENT__COLUMN;

	/**
	 * The feature id for the '<em><b>Char Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__CHAR_START = NAMED_ELEMENT__CHAR_START;

	/**
	 * The feature id for the '<em><b>Char End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__CHAR_END = NAMED_ELEMENT__CHAR_END;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Metamodels</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__METAMODELS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__IMPORTS = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__ELEMENTS = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link QualityMetamodel.QMM_OCL.impl.ModuleElementImpl <em>Module Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QualityMetamodel.QMM_OCL.impl.ModuleElementImpl
	 * @see QualityMetamodel.QMM_OCL.impl.QMM_OCLPackageImpl#getModuleElement()
	 * @generated
	 */
	int MODULE_ELEMENT = 3;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_ELEMENT__LINE = LOCATED_ELEMENT__LINE;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_ELEMENT__COLUMN = LOCATED_ELEMENT__COLUMN;

	/**
	 * The feature id for the '<em><b>Char Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_ELEMENT__CHAR_START = LOCATED_ELEMENT__CHAR_START;

	/**
	 * The feature id for the '<em><b>Char End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_ELEMENT__CHAR_END = LOCATED_ELEMENT__CHAR_END;

	/**
	 * The feature id for the '<em><b>Module</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_ELEMENT__MODULE = LOCATED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Module Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_ELEMENT_FEATURE_COUNT = LOCATED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Module Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_ELEMENT_OPERATION_COUNT = LOCATED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link QualityMetamodel.QMM_OCL.impl.ImportImpl <em>Import</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QualityMetamodel.QMM_OCL.impl.ImportImpl
	 * @see QualityMetamodel.QMM_OCL.impl.QMM_OCLPackageImpl#getImport()
	 * @generated
	 */
	int IMPORT = 4;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT__LINE = NAMED_ELEMENT__LINE;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT__COLUMN = NAMED_ELEMENT__COLUMN;

	/**
	 * The feature id for the '<em><b>Char Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT__CHAR_START = NAMED_ELEMENT__CHAR_START;

	/**
	 * The feature id for the '<em><b>Char End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT__CHAR_END = NAMED_ELEMENT__CHAR_END;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Module</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT__MODULE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Import</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Import</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link QualityMetamodel.QMM_OCL.impl.OclExpressionImpl <em>Ocl Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QualityMetamodel.QMM_OCL.impl.OclExpressionImpl
	 * @see QualityMetamodel.QMM_OCL.impl.QMM_OCLPackageImpl#getOclExpression()
	 * @generated
	 */
	int OCL_EXPRESSION = 5;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_EXPRESSION__LINE = LOCATED_ELEMENT__LINE;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_EXPRESSION__COLUMN = LOCATED_ELEMENT__COLUMN;

	/**
	 * The feature id for the '<em><b>Char Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_EXPRESSION__CHAR_START = LOCATED_ELEMENT__CHAR_START;

	/**
	 * The feature id for the '<em><b>Char End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_EXPRESSION__CHAR_END = LOCATED_ELEMENT__CHAR_END;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_EXPRESSION__TYPE = LOCATED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>If Exp3</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_EXPRESSION__IF_EXP3 = LOCATED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Applied Property</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_EXPRESSION__APPLIED_PROPERTY = LOCATED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Let Exp</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_EXPRESSION__LET_EXP = LOCATED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Loop Exp</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_EXPRESSION__LOOP_EXP = LOCATED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Parent Operation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_EXPRESSION__PARENT_OPERATION = LOCATED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Initialized Variable</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_EXPRESSION__INITIALIZED_VARIABLE = LOCATED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>If Exp2</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_EXPRESSION__IF_EXP2 = LOCATED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Owning Operation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_EXPRESSION__OWNING_OPERATION = LOCATED_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>If Exp1</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_EXPRESSION__IF_EXP1 = LOCATED_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Owning Attribute</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_EXPRESSION__OWNING_ATTRIBUTE = LOCATED_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Applied Operator</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_EXPRESSION__APPLIED_OPERATOR = LOCATED_ELEMENT_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>Ocl Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_EXPRESSION_FEATURE_COUNT = LOCATED_ELEMENT_FEATURE_COUNT + 12;

	/**
	 * The number of operations of the '<em>Ocl Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_EXPRESSION_OPERATION_COUNT = LOCATED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link QualityMetamodel.QMM_OCL.impl.VariableExpImpl <em>Variable Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QualityMetamodel.QMM_OCL.impl.VariableExpImpl
	 * @see QualityMetamodel.QMM_OCL.impl.QMM_OCLPackageImpl#getVariableExp()
	 * @generated
	 */
	int VARIABLE_EXP = 6;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_EXP__LINE = OCL_EXPRESSION__LINE;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_EXP__COLUMN = OCL_EXPRESSION__COLUMN;

	/**
	 * The feature id for the '<em><b>Char Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_EXP__CHAR_START = OCL_EXPRESSION__CHAR_START;

	/**
	 * The feature id for the '<em><b>Char End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_EXP__CHAR_END = OCL_EXPRESSION__CHAR_END;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_EXP__TYPE = OCL_EXPRESSION__TYPE;

	/**
	 * The feature id for the '<em><b>If Exp3</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_EXP__IF_EXP3 = OCL_EXPRESSION__IF_EXP3;

	/**
	 * The feature id for the '<em><b>Applied Property</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_EXP__APPLIED_PROPERTY = OCL_EXPRESSION__APPLIED_PROPERTY;

	/**
	 * The feature id for the '<em><b>Let Exp</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_EXP__LET_EXP = OCL_EXPRESSION__LET_EXP;

	/**
	 * The feature id for the '<em><b>Loop Exp</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_EXP__LOOP_EXP = OCL_EXPRESSION__LOOP_EXP;

	/**
	 * The feature id for the '<em><b>Parent Operation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_EXP__PARENT_OPERATION = OCL_EXPRESSION__PARENT_OPERATION;

	/**
	 * The feature id for the '<em><b>Initialized Variable</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_EXP__INITIALIZED_VARIABLE = OCL_EXPRESSION__INITIALIZED_VARIABLE;

	/**
	 * The feature id for the '<em><b>If Exp2</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_EXP__IF_EXP2 = OCL_EXPRESSION__IF_EXP2;

	/**
	 * The feature id for the '<em><b>Owning Operation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_EXP__OWNING_OPERATION = OCL_EXPRESSION__OWNING_OPERATION;

	/**
	 * The feature id for the '<em><b>If Exp1</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_EXP__IF_EXP1 = OCL_EXPRESSION__IF_EXP1;

	/**
	 * The feature id for the '<em><b>Owning Attribute</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_EXP__OWNING_ATTRIBUTE = OCL_EXPRESSION__OWNING_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Applied Operator</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_EXP__APPLIED_OPERATOR = OCL_EXPRESSION__APPLIED_OPERATOR;

	/**
	 * The feature id for the '<em><b>Referred Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_EXP__REFERRED_VARIABLE = OCL_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Variable Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_EXP_FEATURE_COUNT = OCL_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Variable Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_EXP_OPERATION_COUNT = OCL_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link QualityMetamodel.QMM_OCL.impl.SuperExpImpl <em>Super Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QualityMetamodel.QMM_OCL.impl.SuperExpImpl
	 * @see QualityMetamodel.QMM_OCL.impl.QMM_OCLPackageImpl#getSuperExp()
	 * @generated
	 */
	int SUPER_EXP = 7;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_EXP__LINE = OCL_EXPRESSION__LINE;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_EXP__COLUMN = OCL_EXPRESSION__COLUMN;

	/**
	 * The feature id for the '<em><b>Char Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_EXP__CHAR_START = OCL_EXPRESSION__CHAR_START;

	/**
	 * The feature id for the '<em><b>Char End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_EXP__CHAR_END = OCL_EXPRESSION__CHAR_END;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_EXP__TYPE = OCL_EXPRESSION__TYPE;

	/**
	 * The feature id for the '<em><b>If Exp3</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_EXP__IF_EXP3 = OCL_EXPRESSION__IF_EXP3;

	/**
	 * The feature id for the '<em><b>Applied Property</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_EXP__APPLIED_PROPERTY = OCL_EXPRESSION__APPLIED_PROPERTY;

	/**
	 * The feature id for the '<em><b>Let Exp</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_EXP__LET_EXP = OCL_EXPRESSION__LET_EXP;

	/**
	 * The feature id for the '<em><b>Loop Exp</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_EXP__LOOP_EXP = OCL_EXPRESSION__LOOP_EXP;

	/**
	 * The feature id for the '<em><b>Parent Operation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_EXP__PARENT_OPERATION = OCL_EXPRESSION__PARENT_OPERATION;

	/**
	 * The feature id for the '<em><b>Initialized Variable</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_EXP__INITIALIZED_VARIABLE = OCL_EXPRESSION__INITIALIZED_VARIABLE;

	/**
	 * The feature id for the '<em><b>If Exp2</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_EXP__IF_EXP2 = OCL_EXPRESSION__IF_EXP2;

	/**
	 * The feature id for the '<em><b>Owning Operation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_EXP__OWNING_OPERATION = OCL_EXPRESSION__OWNING_OPERATION;

	/**
	 * The feature id for the '<em><b>If Exp1</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_EXP__IF_EXP1 = OCL_EXPRESSION__IF_EXP1;

	/**
	 * The feature id for the '<em><b>Owning Attribute</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_EXP__OWNING_ATTRIBUTE = OCL_EXPRESSION__OWNING_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Applied Operator</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_EXP__APPLIED_OPERATOR = OCL_EXPRESSION__APPLIED_OPERATOR;

	/**
	 * The number of structural features of the '<em>Super Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_EXP_FEATURE_COUNT = OCL_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Super Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_EXP_OPERATION_COUNT = OCL_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link QualityMetamodel.QMM_OCL.impl.SelfExpImpl <em>Self Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QualityMetamodel.QMM_OCL.impl.SelfExpImpl
	 * @see QualityMetamodel.QMM_OCL.impl.QMM_OCLPackageImpl#getSelfExp()
	 * @generated
	 */
	int SELF_EXP = 8;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELF_EXP__LINE = OCL_EXPRESSION__LINE;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELF_EXP__COLUMN = OCL_EXPRESSION__COLUMN;

	/**
	 * The feature id for the '<em><b>Char Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELF_EXP__CHAR_START = OCL_EXPRESSION__CHAR_START;

	/**
	 * The feature id for the '<em><b>Char End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELF_EXP__CHAR_END = OCL_EXPRESSION__CHAR_END;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELF_EXP__TYPE = OCL_EXPRESSION__TYPE;

	/**
	 * The feature id for the '<em><b>If Exp3</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELF_EXP__IF_EXP3 = OCL_EXPRESSION__IF_EXP3;

	/**
	 * The feature id for the '<em><b>Applied Property</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELF_EXP__APPLIED_PROPERTY = OCL_EXPRESSION__APPLIED_PROPERTY;

	/**
	 * The feature id for the '<em><b>Let Exp</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELF_EXP__LET_EXP = OCL_EXPRESSION__LET_EXP;

	/**
	 * The feature id for the '<em><b>Loop Exp</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELF_EXP__LOOP_EXP = OCL_EXPRESSION__LOOP_EXP;

	/**
	 * The feature id for the '<em><b>Parent Operation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELF_EXP__PARENT_OPERATION = OCL_EXPRESSION__PARENT_OPERATION;

	/**
	 * The feature id for the '<em><b>Initialized Variable</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELF_EXP__INITIALIZED_VARIABLE = OCL_EXPRESSION__INITIALIZED_VARIABLE;

	/**
	 * The feature id for the '<em><b>If Exp2</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELF_EXP__IF_EXP2 = OCL_EXPRESSION__IF_EXP2;

	/**
	 * The feature id for the '<em><b>Owning Operation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELF_EXP__OWNING_OPERATION = OCL_EXPRESSION__OWNING_OPERATION;

	/**
	 * The feature id for the '<em><b>If Exp1</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELF_EXP__IF_EXP1 = OCL_EXPRESSION__IF_EXP1;

	/**
	 * The feature id for the '<em><b>Owning Attribute</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELF_EXP__OWNING_ATTRIBUTE = OCL_EXPRESSION__OWNING_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Applied Operator</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELF_EXP__APPLIED_OPERATOR = OCL_EXPRESSION__APPLIED_OPERATOR;

	/**
	 * The number of structural features of the '<em>Self Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELF_EXP_FEATURE_COUNT = OCL_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Self Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELF_EXP_OPERATION_COUNT = OCL_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link QualityMetamodel.QMM_OCL.impl.EnvExpImpl <em>Env Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QualityMetamodel.QMM_OCL.impl.EnvExpImpl
	 * @see QualityMetamodel.QMM_OCL.impl.QMM_OCLPackageImpl#getEnvExp()
	 * @generated
	 */
	int ENV_EXP = 9;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENV_EXP__LINE = OCL_EXPRESSION__LINE;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENV_EXP__COLUMN = OCL_EXPRESSION__COLUMN;

	/**
	 * The feature id for the '<em><b>Char Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENV_EXP__CHAR_START = OCL_EXPRESSION__CHAR_START;

	/**
	 * The feature id for the '<em><b>Char End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENV_EXP__CHAR_END = OCL_EXPRESSION__CHAR_END;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENV_EXP__TYPE = OCL_EXPRESSION__TYPE;

	/**
	 * The feature id for the '<em><b>If Exp3</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENV_EXP__IF_EXP3 = OCL_EXPRESSION__IF_EXP3;

	/**
	 * The feature id for the '<em><b>Applied Property</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENV_EXP__APPLIED_PROPERTY = OCL_EXPRESSION__APPLIED_PROPERTY;

	/**
	 * The feature id for the '<em><b>Let Exp</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENV_EXP__LET_EXP = OCL_EXPRESSION__LET_EXP;

	/**
	 * The feature id for the '<em><b>Loop Exp</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENV_EXP__LOOP_EXP = OCL_EXPRESSION__LOOP_EXP;

	/**
	 * The feature id for the '<em><b>Parent Operation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENV_EXP__PARENT_OPERATION = OCL_EXPRESSION__PARENT_OPERATION;

	/**
	 * The feature id for the '<em><b>Initialized Variable</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENV_EXP__INITIALIZED_VARIABLE = OCL_EXPRESSION__INITIALIZED_VARIABLE;

	/**
	 * The feature id for the '<em><b>If Exp2</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENV_EXP__IF_EXP2 = OCL_EXPRESSION__IF_EXP2;

	/**
	 * The feature id for the '<em><b>Owning Operation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENV_EXP__OWNING_OPERATION = OCL_EXPRESSION__OWNING_OPERATION;

	/**
	 * The feature id for the '<em><b>If Exp1</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENV_EXP__IF_EXP1 = OCL_EXPRESSION__IF_EXP1;

	/**
	 * The feature id for the '<em><b>Owning Attribute</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENV_EXP__OWNING_ATTRIBUTE = OCL_EXPRESSION__OWNING_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Applied Operator</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENV_EXP__APPLIED_OPERATOR = OCL_EXPRESSION__APPLIED_OPERATOR;

	/**
	 * The number of structural features of the '<em>Env Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENV_EXP_FEATURE_COUNT = OCL_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Env Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENV_EXP_OPERATION_COUNT = OCL_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link QualityMetamodel.QMM_OCL.impl.PrimitiveExpImpl <em>Primitive Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QualityMetamodel.QMM_OCL.impl.PrimitiveExpImpl
	 * @see QualityMetamodel.QMM_OCL.impl.QMM_OCLPackageImpl#getPrimitiveExp()
	 * @generated
	 */
	int PRIMITIVE_EXP = 10;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_EXP__LINE = OCL_EXPRESSION__LINE;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_EXP__COLUMN = OCL_EXPRESSION__COLUMN;

	/**
	 * The feature id for the '<em><b>Char Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_EXP__CHAR_START = OCL_EXPRESSION__CHAR_START;

	/**
	 * The feature id for the '<em><b>Char End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_EXP__CHAR_END = OCL_EXPRESSION__CHAR_END;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_EXP__TYPE = OCL_EXPRESSION__TYPE;

	/**
	 * The feature id for the '<em><b>If Exp3</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_EXP__IF_EXP3 = OCL_EXPRESSION__IF_EXP3;

	/**
	 * The feature id for the '<em><b>Applied Property</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_EXP__APPLIED_PROPERTY = OCL_EXPRESSION__APPLIED_PROPERTY;

	/**
	 * The feature id for the '<em><b>Let Exp</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_EXP__LET_EXP = OCL_EXPRESSION__LET_EXP;

	/**
	 * The feature id for the '<em><b>Loop Exp</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_EXP__LOOP_EXP = OCL_EXPRESSION__LOOP_EXP;

	/**
	 * The feature id for the '<em><b>Parent Operation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_EXP__PARENT_OPERATION = OCL_EXPRESSION__PARENT_OPERATION;

	/**
	 * The feature id for the '<em><b>Initialized Variable</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_EXP__INITIALIZED_VARIABLE = OCL_EXPRESSION__INITIALIZED_VARIABLE;

	/**
	 * The feature id for the '<em><b>If Exp2</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_EXP__IF_EXP2 = OCL_EXPRESSION__IF_EXP2;

	/**
	 * The feature id for the '<em><b>Owning Operation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_EXP__OWNING_OPERATION = OCL_EXPRESSION__OWNING_OPERATION;

	/**
	 * The feature id for the '<em><b>If Exp1</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_EXP__IF_EXP1 = OCL_EXPRESSION__IF_EXP1;

	/**
	 * The feature id for the '<em><b>Owning Attribute</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_EXP__OWNING_ATTRIBUTE = OCL_EXPRESSION__OWNING_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Applied Operator</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_EXP__APPLIED_OPERATOR = OCL_EXPRESSION__APPLIED_OPERATOR;

	/**
	 * The number of structural features of the '<em>Primitive Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_EXP_FEATURE_COUNT = OCL_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Primitive Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_EXP_OPERATION_COUNT = OCL_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link QualityMetamodel.QMM_OCL.impl.StringExpImpl <em>String Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QualityMetamodel.QMM_OCL.impl.StringExpImpl
	 * @see QualityMetamodel.QMM_OCL.impl.QMM_OCLPackageImpl#getStringExp()
	 * @generated
	 */
	int STRING_EXP = 11;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_EXP__LINE = PRIMITIVE_EXP__LINE;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_EXP__COLUMN = PRIMITIVE_EXP__COLUMN;

	/**
	 * The feature id for the '<em><b>Char Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_EXP__CHAR_START = PRIMITIVE_EXP__CHAR_START;

	/**
	 * The feature id for the '<em><b>Char End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_EXP__CHAR_END = PRIMITIVE_EXP__CHAR_END;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_EXP__TYPE = PRIMITIVE_EXP__TYPE;

	/**
	 * The feature id for the '<em><b>If Exp3</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_EXP__IF_EXP3 = PRIMITIVE_EXP__IF_EXP3;

	/**
	 * The feature id for the '<em><b>Applied Property</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_EXP__APPLIED_PROPERTY = PRIMITIVE_EXP__APPLIED_PROPERTY;

	/**
	 * The feature id for the '<em><b>Let Exp</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_EXP__LET_EXP = PRIMITIVE_EXP__LET_EXP;

	/**
	 * The feature id for the '<em><b>Loop Exp</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_EXP__LOOP_EXP = PRIMITIVE_EXP__LOOP_EXP;

	/**
	 * The feature id for the '<em><b>Parent Operation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_EXP__PARENT_OPERATION = PRIMITIVE_EXP__PARENT_OPERATION;

	/**
	 * The feature id for the '<em><b>Initialized Variable</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_EXP__INITIALIZED_VARIABLE = PRIMITIVE_EXP__INITIALIZED_VARIABLE;

	/**
	 * The feature id for the '<em><b>If Exp2</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_EXP__IF_EXP2 = PRIMITIVE_EXP__IF_EXP2;

	/**
	 * The feature id for the '<em><b>Owning Operation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_EXP__OWNING_OPERATION = PRIMITIVE_EXP__OWNING_OPERATION;

	/**
	 * The feature id for the '<em><b>If Exp1</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_EXP__IF_EXP1 = PRIMITIVE_EXP__IF_EXP1;

	/**
	 * The feature id for the '<em><b>Owning Attribute</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_EXP__OWNING_ATTRIBUTE = PRIMITIVE_EXP__OWNING_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Applied Operator</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_EXP__APPLIED_OPERATOR = PRIMITIVE_EXP__APPLIED_OPERATOR;

	/**
	 * The feature id for the '<em><b>String Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_EXP__STRING_SYMBOL = PRIMITIVE_EXP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>String Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_EXP_FEATURE_COUNT = PRIMITIVE_EXP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>String Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_EXP_OPERATION_COUNT = PRIMITIVE_EXP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link QualityMetamodel.QMM_OCL.impl.BooleanExpImpl <em>Boolean Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QualityMetamodel.QMM_OCL.impl.BooleanExpImpl
	 * @see QualityMetamodel.QMM_OCL.impl.QMM_OCLPackageImpl#getBooleanExp()
	 * @generated
	 */
	int BOOLEAN_EXP = 12;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_EXP__LINE = PRIMITIVE_EXP__LINE;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_EXP__COLUMN = PRIMITIVE_EXP__COLUMN;

	/**
	 * The feature id for the '<em><b>Char Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_EXP__CHAR_START = PRIMITIVE_EXP__CHAR_START;

	/**
	 * The feature id for the '<em><b>Char End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_EXP__CHAR_END = PRIMITIVE_EXP__CHAR_END;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_EXP__TYPE = PRIMITIVE_EXP__TYPE;

	/**
	 * The feature id for the '<em><b>If Exp3</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_EXP__IF_EXP3 = PRIMITIVE_EXP__IF_EXP3;

	/**
	 * The feature id for the '<em><b>Applied Property</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_EXP__APPLIED_PROPERTY = PRIMITIVE_EXP__APPLIED_PROPERTY;

	/**
	 * The feature id for the '<em><b>Let Exp</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_EXP__LET_EXP = PRIMITIVE_EXP__LET_EXP;

	/**
	 * The feature id for the '<em><b>Loop Exp</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_EXP__LOOP_EXP = PRIMITIVE_EXP__LOOP_EXP;

	/**
	 * The feature id for the '<em><b>Parent Operation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_EXP__PARENT_OPERATION = PRIMITIVE_EXP__PARENT_OPERATION;

	/**
	 * The feature id for the '<em><b>Initialized Variable</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_EXP__INITIALIZED_VARIABLE = PRIMITIVE_EXP__INITIALIZED_VARIABLE;

	/**
	 * The feature id for the '<em><b>If Exp2</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_EXP__IF_EXP2 = PRIMITIVE_EXP__IF_EXP2;

	/**
	 * The feature id for the '<em><b>Owning Operation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_EXP__OWNING_OPERATION = PRIMITIVE_EXP__OWNING_OPERATION;

	/**
	 * The feature id for the '<em><b>If Exp1</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_EXP__IF_EXP1 = PRIMITIVE_EXP__IF_EXP1;

	/**
	 * The feature id for the '<em><b>Owning Attribute</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_EXP__OWNING_ATTRIBUTE = PRIMITIVE_EXP__OWNING_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Applied Operator</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_EXP__APPLIED_OPERATOR = PRIMITIVE_EXP__APPLIED_OPERATOR;

	/**
	 * The feature id for the '<em><b>Boolean Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_EXP__BOOLEAN_SYMBOL = PRIMITIVE_EXP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Boolean Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_EXP_FEATURE_COUNT = PRIMITIVE_EXP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Boolean Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_EXP_OPERATION_COUNT = PRIMITIVE_EXP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link QualityMetamodel.QMM_OCL.impl.NumericExpImpl <em>Numeric Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QualityMetamodel.QMM_OCL.impl.NumericExpImpl
	 * @see QualityMetamodel.QMM_OCL.impl.QMM_OCLPackageImpl#getNumericExp()
	 * @generated
	 */
	int NUMERIC_EXP = 13;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_EXP__LINE = PRIMITIVE_EXP__LINE;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_EXP__COLUMN = PRIMITIVE_EXP__COLUMN;

	/**
	 * The feature id for the '<em><b>Char Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_EXP__CHAR_START = PRIMITIVE_EXP__CHAR_START;

	/**
	 * The feature id for the '<em><b>Char End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_EXP__CHAR_END = PRIMITIVE_EXP__CHAR_END;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_EXP__TYPE = PRIMITIVE_EXP__TYPE;

	/**
	 * The feature id for the '<em><b>If Exp3</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_EXP__IF_EXP3 = PRIMITIVE_EXP__IF_EXP3;

	/**
	 * The feature id for the '<em><b>Applied Property</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_EXP__APPLIED_PROPERTY = PRIMITIVE_EXP__APPLIED_PROPERTY;

	/**
	 * The feature id for the '<em><b>Let Exp</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_EXP__LET_EXP = PRIMITIVE_EXP__LET_EXP;

	/**
	 * The feature id for the '<em><b>Loop Exp</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_EXP__LOOP_EXP = PRIMITIVE_EXP__LOOP_EXP;

	/**
	 * The feature id for the '<em><b>Parent Operation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_EXP__PARENT_OPERATION = PRIMITIVE_EXP__PARENT_OPERATION;

	/**
	 * The feature id for the '<em><b>Initialized Variable</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_EXP__INITIALIZED_VARIABLE = PRIMITIVE_EXP__INITIALIZED_VARIABLE;

	/**
	 * The feature id for the '<em><b>If Exp2</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_EXP__IF_EXP2 = PRIMITIVE_EXP__IF_EXP2;

	/**
	 * The feature id for the '<em><b>Owning Operation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_EXP__OWNING_OPERATION = PRIMITIVE_EXP__OWNING_OPERATION;

	/**
	 * The feature id for the '<em><b>If Exp1</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_EXP__IF_EXP1 = PRIMITIVE_EXP__IF_EXP1;

	/**
	 * The feature id for the '<em><b>Owning Attribute</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_EXP__OWNING_ATTRIBUTE = PRIMITIVE_EXP__OWNING_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Applied Operator</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_EXP__APPLIED_OPERATOR = PRIMITIVE_EXP__APPLIED_OPERATOR;

	/**
	 * The number of structural features of the '<em>Numeric Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_EXP_FEATURE_COUNT = PRIMITIVE_EXP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Numeric Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_EXP_OPERATION_COUNT = PRIMITIVE_EXP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link QualityMetamodel.QMM_OCL.impl.RealExpImpl <em>Real Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QualityMetamodel.QMM_OCL.impl.RealExpImpl
	 * @see QualityMetamodel.QMM_OCL.impl.QMM_OCLPackageImpl#getRealExp()
	 * @generated
	 */
	int REAL_EXP = 14;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_EXP__LINE = NUMERIC_EXP__LINE;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_EXP__COLUMN = NUMERIC_EXP__COLUMN;

	/**
	 * The feature id for the '<em><b>Char Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_EXP__CHAR_START = NUMERIC_EXP__CHAR_START;

	/**
	 * The feature id for the '<em><b>Char End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_EXP__CHAR_END = NUMERIC_EXP__CHAR_END;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_EXP__TYPE = NUMERIC_EXP__TYPE;

	/**
	 * The feature id for the '<em><b>If Exp3</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_EXP__IF_EXP3 = NUMERIC_EXP__IF_EXP3;

	/**
	 * The feature id for the '<em><b>Applied Property</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_EXP__APPLIED_PROPERTY = NUMERIC_EXP__APPLIED_PROPERTY;

	/**
	 * The feature id for the '<em><b>Let Exp</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_EXP__LET_EXP = NUMERIC_EXP__LET_EXP;

	/**
	 * The feature id for the '<em><b>Loop Exp</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_EXP__LOOP_EXP = NUMERIC_EXP__LOOP_EXP;

	/**
	 * The feature id for the '<em><b>Parent Operation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_EXP__PARENT_OPERATION = NUMERIC_EXP__PARENT_OPERATION;

	/**
	 * The feature id for the '<em><b>Initialized Variable</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_EXP__INITIALIZED_VARIABLE = NUMERIC_EXP__INITIALIZED_VARIABLE;

	/**
	 * The feature id for the '<em><b>If Exp2</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_EXP__IF_EXP2 = NUMERIC_EXP__IF_EXP2;

	/**
	 * The feature id for the '<em><b>Owning Operation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_EXP__OWNING_OPERATION = NUMERIC_EXP__OWNING_OPERATION;

	/**
	 * The feature id for the '<em><b>If Exp1</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_EXP__IF_EXP1 = NUMERIC_EXP__IF_EXP1;

	/**
	 * The feature id for the '<em><b>Owning Attribute</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_EXP__OWNING_ATTRIBUTE = NUMERIC_EXP__OWNING_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Applied Operator</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_EXP__APPLIED_OPERATOR = NUMERIC_EXP__APPLIED_OPERATOR;

	/**
	 * The feature id for the '<em><b>Real Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_EXP__REAL_SYMBOL = NUMERIC_EXP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Real Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_EXP_FEATURE_COUNT = NUMERIC_EXP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Real Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_EXP_OPERATION_COUNT = NUMERIC_EXP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link QualityMetamodel.QMM_OCL.impl.IntegerExpImpl <em>Integer Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QualityMetamodel.QMM_OCL.impl.IntegerExpImpl
	 * @see QualityMetamodel.QMM_OCL.impl.QMM_OCLPackageImpl#getIntegerExp()
	 * @generated
	 */
	int INTEGER_EXP = 15;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_EXP__LINE = NUMERIC_EXP__LINE;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_EXP__COLUMN = NUMERIC_EXP__COLUMN;

	/**
	 * The feature id for the '<em><b>Char Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_EXP__CHAR_START = NUMERIC_EXP__CHAR_START;

	/**
	 * The feature id for the '<em><b>Char End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_EXP__CHAR_END = NUMERIC_EXP__CHAR_END;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_EXP__TYPE = NUMERIC_EXP__TYPE;

	/**
	 * The feature id for the '<em><b>If Exp3</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_EXP__IF_EXP3 = NUMERIC_EXP__IF_EXP3;

	/**
	 * The feature id for the '<em><b>Applied Property</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_EXP__APPLIED_PROPERTY = NUMERIC_EXP__APPLIED_PROPERTY;

	/**
	 * The feature id for the '<em><b>Let Exp</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_EXP__LET_EXP = NUMERIC_EXP__LET_EXP;

	/**
	 * The feature id for the '<em><b>Loop Exp</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_EXP__LOOP_EXP = NUMERIC_EXP__LOOP_EXP;

	/**
	 * The feature id for the '<em><b>Parent Operation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_EXP__PARENT_OPERATION = NUMERIC_EXP__PARENT_OPERATION;

	/**
	 * The feature id for the '<em><b>Initialized Variable</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_EXP__INITIALIZED_VARIABLE = NUMERIC_EXP__INITIALIZED_VARIABLE;

	/**
	 * The feature id for the '<em><b>If Exp2</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_EXP__IF_EXP2 = NUMERIC_EXP__IF_EXP2;

	/**
	 * The feature id for the '<em><b>Owning Operation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_EXP__OWNING_OPERATION = NUMERIC_EXP__OWNING_OPERATION;

	/**
	 * The feature id for the '<em><b>If Exp1</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_EXP__IF_EXP1 = NUMERIC_EXP__IF_EXP1;

	/**
	 * The feature id for the '<em><b>Owning Attribute</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_EXP__OWNING_ATTRIBUTE = NUMERIC_EXP__OWNING_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Applied Operator</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_EXP__APPLIED_OPERATOR = NUMERIC_EXP__APPLIED_OPERATOR;

	/**
	 * The feature id for the '<em><b>Integer Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_EXP__INTEGER_SYMBOL = NUMERIC_EXP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Integer Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_EXP_FEATURE_COUNT = NUMERIC_EXP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Integer Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_EXP_OPERATION_COUNT = NUMERIC_EXP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link QualityMetamodel.QMM_OCL.impl.CollectionExpImpl <em>Collection Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QualityMetamodel.QMM_OCL.impl.CollectionExpImpl
	 * @see QualityMetamodel.QMM_OCL.impl.QMM_OCLPackageImpl#getCollectionExp()
	 * @generated
	 */
	int COLLECTION_EXP = 16;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_EXP__LINE = OCL_EXPRESSION__LINE;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_EXP__COLUMN = OCL_EXPRESSION__COLUMN;

	/**
	 * The feature id for the '<em><b>Char Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_EXP__CHAR_START = OCL_EXPRESSION__CHAR_START;

	/**
	 * The feature id for the '<em><b>Char End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_EXP__CHAR_END = OCL_EXPRESSION__CHAR_END;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_EXP__TYPE = OCL_EXPRESSION__TYPE;

	/**
	 * The feature id for the '<em><b>If Exp3</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_EXP__IF_EXP3 = OCL_EXPRESSION__IF_EXP3;

	/**
	 * The feature id for the '<em><b>Applied Property</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_EXP__APPLIED_PROPERTY = OCL_EXPRESSION__APPLIED_PROPERTY;

	/**
	 * The feature id for the '<em><b>Let Exp</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_EXP__LET_EXP = OCL_EXPRESSION__LET_EXP;

	/**
	 * The feature id for the '<em><b>Loop Exp</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_EXP__LOOP_EXP = OCL_EXPRESSION__LOOP_EXP;

	/**
	 * The feature id for the '<em><b>Parent Operation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_EXP__PARENT_OPERATION = OCL_EXPRESSION__PARENT_OPERATION;

	/**
	 * The feature id for the '<em><b>Initialized Variable</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_EXP__INITIALIZED_VARIABLE = OCL_EXPRESSION__INITIALIZED_VARIABLE;

	/**
	 * The feature id for the '<em><b>If Exp2</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_EXP__IF_EXP2 = OCL_EXPRESSION__IF_EXP2;

	/**
	 * The feature id for the '<em><b>Owning Operation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_EXP__OWNING_OPERATION = OCL_EXPRESSION__OWNING_OPERATION;

	/**
	 * The feature id for the '<em><b>If Exp1</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_EXP__IF_EXP1 = OCL_EXPRESSION__IF_EXP1;

	/**
	 * The feature id for the '<em><b>Owning Attribute</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_EXP__OWNING_ATTRIBUTE = OCL_EXPRESSION__OWNING_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Applied Operator</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_EXP__APPLIED_OPERATOR = OCL_EXPRESSION__APPLIED_OPERATOR;

	/**
	 * The feature id for the '<em><b>Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_EXP__PARTS = OCL_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Collection Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_EXP_FEATURE_COUNT = OCL_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Collection Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_EXP_OPERATION_COUNT = OCL_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link QualityMetamodel.QMM_OCL.impl.CollectionPartImpl <em>Collection Part</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QualityMetamodel.QMM_OCL.impl.CollectionPartImpl
	 * @see QualityMetamodel.QMM_OCL.impl.QMM_OCLPackageImpl#getCollectionPart()
	 * @generated
	 */
	int COLLECTION_PART = 17;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_PART__LINE = LOCATED_ELEMENT__LINE;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_PART__COLUMN = LOCATED_ELEMENT__COLUMN;

	/**
	 * The feature id for the '<em><b>Char Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_PART__CHAR_START = LOCATED_ELEMENT__CHAR_START;

	/**
	 * The feature id for the '<em><b>Char End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_PART__CHAR_END = LOCATED_ELEMENT__CHAR_END;

	/**
	 * The feature id for the '<em><b>Collection</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_PART__COLLECTION = LOCATED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Collection Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_PART_FEATURE_COUNT = LOCATED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Collection Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_PART_OPERATION_COUNT = LOCATED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link QualityMetamodel.QMM_OCL.impl.CollectionRangeImpl <em>Collection Range</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QualityMetamodel.QMM_OCL.impl.CollectionRangeImpl
	 * @see QualityMetamodel.QMM_OCL.impl.QMM_OCLPackageImpl#getCollectionRange()
	 * @generated
	 */
	int COLLECTION_RANGE = 18;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_RANGE__LINE = COLLECTION_PART__LINE;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_RANGE__COLUMN = COLLECTION_PART__COLUMN;

	/**
	 * The feature id for the '<em><b>Char Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_RANGE__CHAR_START = COLLECTION_PART__CHAR_START;

	/**
	 * The feature id for the '<em><b>Char End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_RANGE__CHAR_END = COLLECTION_PART__CHAR_END;

	/**
	 * The feature id for the '<em><b>Collection</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_RANGE__COLLECTION = COLLECTION_PART__COLLECTION;

	/**
	 * The feature id for the '<em><b>First</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_RANGE__FIRST = COLLECTION_PART_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Last</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_RANGE__LAST = COLLECTION_PART_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Collection Range</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_RANGE_FEATURE_COUNT = COLLECTION_PART_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Collection Range</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_RANGE_OPERATION_COUNT = COLLECTION_PART_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link QualityMetamodel.QMM_OCL.impl.CollectionItemImpl <em>Collection Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QualityMetamodel.QMM_OCL.impl.CollectionItemImpl
	 * @see QualityMetamodel.QMM_OCL.impl.QMM_OCLPackageImpl#getCollectionItem()
	 * @generated
	 */
	int COLLECTION_ITEM = 19;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_ITEM__LINE = COLLECTION_PART__LINE;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_ITEM__COLUMN = COLLECTION_PART__COLUMN;

	/**
	 * The feature id for the '<em><b>Char Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_ITEM__CHAR_START = COLLECTION_PART__CHAR_START;

	/**
	 * The feature id for the '<em><b>Char End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_ITEM__CHAR_END = COLLECTION_PART__CHAR_END;

	/**
	 * The feature id for the '<em><b>Collection</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_ITEM__COLLECTION = COLLECTION_PART__COLLECTION;

	/**
	 * The feature id for the '<em><b>Item</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_ITEM__ITEM = COLLECTION_PART_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Collection Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_ITEM_FEATURE_COUNT = COLLECTION_PART_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Collection Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_ITEM_OPERATION_COUNT = COLLECTION_PART_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link QualityMetamodel.QMM_OCL.impl.BagExpImpl <em>Bag Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QualityMetamodel.QMM_OCL.impl.BagExpImpl
	 * @see QualityMetamodel.QMM_OCL.impl.QMM_OCLPackageImpl#getBagExp()
	 * @generated
	 */
	int BAG_EXP = 20;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG_EXP__LINE = COLLECTION_EXP__LINE;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG_EXP__COLUMN = COLLECTION_EXP__COLUMN;

	/**
	 * The feature id for the '<em><b>Char Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG_EXP__CHAR_START = COLLECTION_EXP__CHAR_START;

	/**
	 * The feature id for the '<em><b>Char End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG_EXP__CHAR_END = COLLECTION_EXP__CHAR_END;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG_EXP__TYPE = COLLECTION_EXP__TYPE;

	/**
	 * The feature id for the '<em><b>If Exp3</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG_EXP__IF_EXP3 = COLLECTION_EXP__IF_EXP3;

	/**
	 * The feature id for the '<em><b>Applied Property</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG_EXP__APPLIED_PROPERTY = COLLECTION_EXP__APPLIED_PROPERTY;

	/**
	 * The feature id for the '<em><b>Let Exp</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG_EXP__LET_EXP = COLLECTION_EXP__LET_EXP;

	/**
	 * The feature id for the '<em><b>Loop Exp</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG_EXP__LOOP_EXP = COLLECTION_EXP__LOOP_EXP;

	/**
	 * The feature id for the '<em><b>Parent Operation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG_EXP__PARENT_OPERATION = COLLECTION_EXP__PARENT_OPERATION;

	/**
	 * The feature id for the '<em><b>Initialized Variable</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG_EXP__INITIALIZED_VARIABLE = COLLECTION_EXP__INITIALIZED_VARIABLE;

	/**
	 * The feature id for the '<em><b>If Exp2</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG_EXP__IF_EXP2 = COLLECTION_EXP__IF_EXP2;

	/**
	 * The feature id for the '<em><b>Owning Operation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG_EXP__OWNING_OPERATION = COLLECTION_EXP__OWNING_OPERATION;

	/**
	 * The feature id for the '<em><b>If Exp1</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG_EXP__IF_EXP1 = COLLECTION_EXP__IF_EXP1;

	/**
	 * The feature id for the '<em><b>Owning Attribute</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG_EXP__OWNING_ATTRIBUTE = COLLECTION_EXP__OWNING_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Applied Operator</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG_EXP__APPLIED_OPERATOR = COLLECTION_EXP__APPLIED_OPERATOR;

	/**
	 * The feature id for the '<em><b>Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG_EXP__PARTS = COLLECTION_EXP__PARTS;

	/**
	 * The number of structural features of the '<em>Bag Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG_EXP_FEATURE_COUNT = COLLECTION_EXP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Bag Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG_EXP_OPERATION_COUNT = COLLECTION_EXP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link QualityMetamodel.QMM_OCL.impl.OrderedSetExpImpl <em>Ordered Set Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QualityMetamodel.QMM_OCL.impl.OrderedSetExpImpl
	 * @see QualityMetamodel.QMM_OCL.impl.QMM_OCLPackageImpl#getOrderedSetExp()
	 * @generated
	 */
	int ORDERED_SET_EXP = 21;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_SET_EXP__LINE = COLLECTION_EXP__LINE;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_SET_EXP__COLUMN = COLLECTION_EXP__COLUMN;

	/**
	 * The feature id for the '<em><b>Char Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_SET_EXP__CHAR_START = COLLECTION_EXP__CHAR_START;

	/**
	 * The feature id for the '<em><b>Char End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_SET_EXP__CHAR_END = COLLECTION_EXP__CHAR_END;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_SET_EXP__TYPE = COLLECTION_EXP__TYPE;

	/**
	 * The feature id for the '<em><b>If Exp3</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_SET_EXP__IF_EXP3 = COLLECTION_EXP__IF_EXP3;

	/**
	 * The feature id for the '<em><b>Applied Property</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_SET_EXP__APPLIED_PROPERTY = COLLECTION_EXP__APPLIED_PROPERTY;

	/**
	 * The feature id for the '<em><b>Let Exp</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_SET_EXP__LET_EXP = COLLECTION_EXP__LET_EXP;

	/**
	 * The feature id for the '<em><b>Loop Exp</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_SET_EXP__LOOP_EXP = COLLECTION_EXP__LOOP_EXP;

	/**
	 * The feature id for the '<em><b>Parent Operation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_SET_EXP__PARENT_OPERATION = COLLECTION_EXP__PARENT_OPERATION;

	/**
	 * The feature id for the '<em><b>Initialized Variable</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_SET_EXP__INITIALIZED_VARIABLE = COLLECTION_EXP__INITIALIZED_VARIABLE;

	/**
	 * The feature id for the '<em><b>If Exp2</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_SET_EXP__IF_EXP2 = COLLECTION_EXP__IF_EXP2;

	/**
	 * The feature id for the '<em><b>Owning Operation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_SET_EXP__OWNING_OPERATION = COLLECTION_EXP__OWNING_OPERATION;

	/**
	 * The feature id for the '<em><b>If Exp1</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_SET_EXP__IF_EXP1 = COLLECTION_EXP__IF_EXP1;

	/**
	 * The feature id for the '<em><b>Owning Attribute</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_SET_EXP__OWNING_ATTRIBUTE = COLLECTION_EXP__OWNING_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Applied Operator</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_SET_EXP__APPLIED_OPERATOR = COLLECTION_EXP__APPLIED_OPERATOR;

	/**
	 * The feature id for the '<em><b>Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_SET_EXP__PARTS = COLLECTION_EXP__PARTS;

	/**
	 * The number of structural features of the '<em>Ordered Set Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_SET_EXP_FEATURE_COUNT = COLLECTION_EXP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Ordered Set Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_SET_EXP_OPERATION_COUNT = COLLECTION_EXP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link QualityMetamodel.QMM_OCL.impl.SequenceExpImpl <em>Sequence Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QualityMetamodel.QMM_OCL.impl.SequenceExpImpl
	 * @see QualityMetamodel.QMM_OCL.impl.QMM_OCLPackageImpl#getSequenceExp()
	 * @generated
	 */
	int SEQUENCE_EXP = 22;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_EXP__LINE = COLLECTION_EXP__LINE;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_EXP__COLUMN = COLLECTION_EXP__COLUMN;

	/**
	 * The feature id for the '<em><b>Char Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_EXP__CHAR_START = COLLECTION_EXP__CHAR_START;

	/**
	 * The feature id for the '<em><b>Char End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_EXP__CHAR_END = COLLECTION_EXP__CHAR_END;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_EXP__TYPE = COLLECTION_EXP__TYPE;

	/**
	 * The feature id for the '<em><b>If Exp3</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_EXP__IF_EXP3 = COLLECTION_EXP__IF_EXP3;

	/**
	 * The feature id for the '<em><b>Applied Property</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_EXP__APPLIED_PROPERTY = COLLECTION_EXP__APPLIED_PROPERTY;

	/**
	 * The feature id for the '<em><b>Let Exp</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_EXP__LET_EXP = COLLECTION_EXP__LET_EXP;

	/**
	 * The feature id for the '<em><b>Loop Exp</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_EXP__LOOP_EXP = COLLECTION_EXP__LOOP_EXP;

	/**
	 * The feature id for the '<em><b>Parent Operation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_EXP__PARENT_OPERATION = COLLECTION_EXP__PARENT_OPERATION;

	/**
	 * The feature id for the '<em><b>Initialized Variable</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_EXP__INITIALIZED_VARIABLE = COLLECTION_EXP__INITIALIZED_VARIABLE;

	/**
	 * The feature id for the '<em><b>If Exp2</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_EXP__IF_EXP2 = COLLECTION_EXP__IF_EXP2;

	/**
	 * The feature id for the '<em><b>Owning Operation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_EXP__OWNING_OPERATION = COLLECTION_EXP__OWNING_OPERATION;

	/**
	 * The feature id for the '<em><b>If Exp1</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_EXP__IF_EXP1 = COLLECTION_EXP__IF_EXP1;

	/**
	 * The feature id for the '<em><b>Owning Attribute</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_EXP__OWNING_ATTRIBUTE = COLLECTION_EXP__OWNING_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Applied Operator</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_EXP__APPLIED_OPERATOR = COLLECTION_EXP__APPLIED_OPERATOR;

	/**
	 * The feature id for the '<em><b>Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_EXP__PARTS = COLLECTION_EXP__PARTS;

	/**
	 * The number of structural features of the '<em>Sequence Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_EXP_FEATURE_COUNT = COLLECTION_EXP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Sequence Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_EXP_OPERATION_COUNT = COLLECTION_EXP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link QualityMetamodel.QMM_OCL.impl.SetExpImpl <em>Set Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QualityMetamodel.QMM_OCL.impl.SetExpImpl
	 * @see QualityMetamodel.QMM_OCL.impl.QMM_OCLPackageImpl#getSetExp()
	 * @generated
	 */
	int SET_EXP = 23;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_EXP__LINE = COLLECTION_EXP__LINE;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_EXP__COLUMN = COLLECTION_EXP__COLUMN;

	/**
	 * The feature id for the '<em><b>Char Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_EXP__CHAR_START = COLLECTION_EXP__CHAR_START;

	/**
	 * The feature id for the '<em><b>Char End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_EXP__CHAR_END = COLLECTION_EXP__CHAR_END;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_EXP__TYPE = COLLECTION_EXP__TYPE;

	/**
	 * The feature id for the '<em><b>If Exp3</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_EXP__IF_EXP3 = COLLECTION_EXP__IF_EXP3;

	/**
	 * The feature id for the '<em><b>Applied Property</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_EXP__APPLIED_PROPERTY = COLLECTION_EXP__APPLIED_PROPERTY;

	/**
	 * The feature id for the '<em><b>Let Exp</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_EXP__LET_EXP = COLLECTION_EXP__LET_EXP;

	/**
	 * The feature id for the '<em><b>Loop Exp</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_EXP__LOOP_EXP = COLLECTION_EXP__LOOP_EXP;

	/**
	 * The feature id for the '<em><b>Parent Operation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_EXP__PARENT_OPERATION = COLLECTION_EXP__PARENT_OPERATION;

	/**
	 * The feature id for the '<em><b>Initialized Variable</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_EXP__INITIALIZED_VARIABLE = COLLECTION_EXP__INITIALIZED_VARIABLE;

	/**
	 * The feature id for the '<em><b>If Exp2</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_EXP__IF_EXP2 = COLLECTION_EXP__IF_EXP2;

	/**
	 * The feature id for the '<em><b>Owning Operation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_EXP__OWNING_OPERATION = COLLECTION_EXP__OWNING_OPERATION;

	/**
	 * The feature id for the '<em><b>If Exp1</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_EXP__IF_EXP1 = COLLECTION_EXP__IF_EXP1;

	/**
	 * The feature id for the '<em><b>Owning Attribute</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_EXP__OWNING_ATTRIBUTE = COLLECTION_EXP__OWNING_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Applied Operator</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_EXP__APPLIED_OPERATOR = COLLECTION_EXP__APPLIED_OPERATOR;

	/**
	 * The feature id for the '<em><b>Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_EXP__PARTS = COLLECTION_EXP__PARTS;

	/**
	 * The number of structural features of the '<em>Set Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_EXP_FEATURE_COUNT = COLLECTION_EXP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Set Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_EXP_OPERATION_COUNT = COLLECTION_EXP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link QualityMetamodel.QMM_OCL.impl.TupleExpImpl <em>Tuple Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QualityMetamodel.QMM_OCL.impl.TupleExpImpl
	 * @see QualityMetamodel.QMM_OCL.impl.QMM_OCLPackageImpl#getTupleExp()
	 * @generated
	 */
	int TUPLE_EXP = 24;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE_EXP__LINE = OCL_EXPRESSION__LINE;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE_EXP__COLUMN = OCL_EXPRESSION__COLUMN;

	/**
	 * The feature id for the '<em><b>Char Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE_EXP__CHAR_START = OCL_EXPRESSION__CHAR_START;

	/**
	 * The feature id for the '<em><b>Char End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE_EXP__CHAR_END = OCL_EXPRESSION__CHAR_END;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE_EXP__TYPE = OCL_EXPRESSION__TYPE;

	/**
	 * The feature id for the '<em><b>If Exp3</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE_EXP__IF_EXP3 = OCL_EXPRESSION__IF_EXP3;

	/**
	 * The feature id for the '<em><b>Applied Property</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE_EXP__APPLIED_PROPERTY = OCL_EXPRESSION__APPLIED_PROPERTY;

	/**
	 * The feature id for the '<em><b>Let Exp</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE_EXP__LET_EXP = OCL_EXPRESSION__LET_EXP;

	/**
	 * The feature id for the '<em><b>Loop Exp</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE_EXP__LOOP_EXP = OCL_EXPRESSION__LOOP_EXP;

	/**
	 * The feature id for the '<em><b>Parent Operation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE_EXP__PARENT_OPERATION = OCL_EXPRESSION__PARENT_OPERATION;

	/**
	 * The feature id for the '<em><b>Initialized Variable</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE_EXP__INITIALIZED_VARIABLE = OCL_EXPRESSION__INITIALIZED_VARIABLE;

	/**
	 * The feature id for the '<em><b>If Exp2</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE_EXP__IF_EXP2 = OCL_EXPRESSION__IF_EXP2;

	/**
	 * The feature id for the '<em><b>Owning Operation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE_EXP__OWNING_OPERATION = OCL_EXPRESSION__OWNING_OPERATION;

	/**
	 * The feature id for the '<em><b>If Exp1</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE_EXP__IF_EXP1 = OCL_EXPRESSION__IF_EXP1;

	/**
	 * The feature id for the '<em><b>Owning Attribute</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE_EXP__OWNING_ATTRIBUTE = OCL_EXPRESSION__OWNING_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Applied Operator</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE_EXP__APPLIED_OPERATOR = OCL_EXPRESSION__APPLIED_OPERATOR;

	/**
	 * The feature id for the '<em><b>Tuple Part</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE_EXP__TUPLE_PART = OCL_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Tuple Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE_EXP_FEATURE_COUNT = OCL_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Tuple Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE_EXP_OPERATION_COUNT = OCL_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link QualityMetamodel.QMM_OCL.impl.VariableDeclarationImpl <em>Variable Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QualityMetamodel.QMM_OCL.impl.VariableDeclarationImpl
	 * @see QualityMetamodel.QMM_OCL.impl.QMM_OCLPackageImpl#getVariableDeclaration()
	 * @generated
	 */
	int VARIABLE_DECLARATION = 53;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION__LINE = LOCATED_ELEMENT__LINE;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION__COLUMN = LOCATED_ELEMENT__COLUMN;

	/**
	 * The feature id for the '<em><b>Char Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION__CHAR_START = LOCATED_ELEMENT__CHAR_START;

	/**
	 * The feature id for the '<em><b>Char End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION__CHAR_END = LOCATED_ELEMENT__CHAR_END;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION__VAR_NAME = LOCATED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION__TYPE = LOCATED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Variable Exp</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION__VARIABLE_EXP = LOCATED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Variable Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION_FEATURE_COUNT = LOCATED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Variable Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION_OPERATION_COUNT = LOCATED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link QualityMetamodel.QMM_OCL.impl.LocalVariableImpl <em>Local Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QualityMetamodel.QMM_OCL.impl.LocalVariableImpl
	 * @see QualityMetamodel.QMM_OCL.impl.QMM_OCLPackageImpl#getLocalVariable()
	 * @generated
	 */
	int LOCAL_VARIABLE = 54;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_VARIABLE__LINE = VARIABLE_DECLARATION__LINE;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_VARIABLE__COLUMN = VARIABLE_DECLARATION__COLUMN;

	/**
	 * The feature id for the '<em><b>Char Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_VARIABLE__CHAR_START = VARIABLE_DECLARATION__CHAR_START;

	/**
	 * The feature id for the '<em><b>Char End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_VARIABLE__CHAR_END = VARIABLE_DECLARATION__CHAR_END;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_VARIABLE__VAR_NAME = VARIABLE_DECLARATION__VAR_NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_VARIABLE__TYPE = VARIABLE_DECLARATION__TYPE;

	/**
	 * The feature id for the '<em><b>Variable Exp</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_VARIABLE__VARIABLE_EXP = VARIABLE_DECLARATION__VARIABLE_EXP;

	/**
	 * The feature id for the '<em><b>Let Exp</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_VARIABLE__LET_EXP = VARIABLE_DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Init Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_VARIABLE__INIT_EXPRESSION = VARIABLE_DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Base Exp</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_VARIABLE__BASE_EXP = VARIABLE_DECLARATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Eq</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_VARIABLE__EQ = VARIABLE_DECLARATION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Local Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_VARIABLE_FEATURE_COUNT = VARIABLE_DECLARATION_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Local Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_VARIABLE_OPERATION_COUNT = VARIABLE_DECLARATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link QualityMetamodel.QMM_OCL.impl.TuplePartImpl <em>Tuple Part</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QualityMetamodel.QMM_OCL.impl.TuplePartImpl
	 * @see QualityMetamodel.QMM_OCL.impl.QMM_OCLPackageImpl#getTuplePart()
	 * @generated
	 */
	int TUPLE_PART = 25;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE_PART__LINE = LOCAL_VARIABLE__LINE;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE_PART__COLUMN = LOCAL_VARIABLE__COLUMN;

	/**
	 * The feature id for the '<em><b>Char Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE_PART__CHAR_START = LOCAL_VARIABLE__CHAR_START;

	/**
	 * The feature id for the '<em><b>Char End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE_PART__CHAR_END = LOCAL_VARIABLE__CHAR_END;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE_PART__VAR_NAME = LOCAL_VARIABLE__VAR_NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE_PART__TYPE = LOCAL_VARIABLE__TYPE;

	/**
	 * The feature id for the '<em><b>Variable Exp</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE_PART__VARIABLE_EXP = LOCAL_VARIABLE__VARIABLE_EXP;

	/**
	 * The feature id for the '<em><b>Let Exp</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE_PART__LET_EXP = LOCAL_VARIABLE__LET_EXP;

	/**
	 * The feature id for the '<em><b>Init Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE_PART__INIT_EXPRESSION = LOCAL_VARIABLE__INIT_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Base Exp</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE_PART__BASE_EXP = LOCAL_VARIABLE__BASE_EXP;

	/**
	 * The feature id for the '<em><b>Eq</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE_PART__EQ = LOCAL_VARIABLE__EQ;

	/**
	 * The feature id for the '<em><b>Tuple</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE_PART__TUPLE = LOCAL_VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Tuple Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE_PART_FEATURE_COUNT = LOCAL_VARIABLE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Tuple Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE_PART_OPERATION_COUNT = LOCAL_VARIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link QualityMetamodel.QMM_OCL.impl.MapExpImpl <em>Map Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QualityMetamodel.QMM_OCL.impl.MapExpImpl
	 * @see QualityMetamodel.QMM_OCL.impl.QMM_OCLPackageImpl#getMapExp()
	 * @generated
	 */
	int MAP_EXP = 26;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_EXP__LINE = OCL_EXPRESSION__LINE;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_EXP__COLUMN = OCL_EXPRESSION__COLUMN;

	/**
	 * The feature id for the '<em><b>Char Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_EXP__CHAR_START = OCL_EXPRESSION__CHAR_START;

	/**
	 * The feature id for the '<em><b>Char End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_EXP__CHAR_END = OCL_EXPRESSION__CHAR_END;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_EXP__TYPE = OCL_EXPRESSION__TYPE;

	/**
	 * The feature id for the '<em><b>If Exp3</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_EXP__IF_EXP3 = OCL_EXPRESSION__IF_EXP3;

	/**
	 * The feature id for the '<em><b>Applied Property</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_EXP__APPLIED_PROPERTY = OCL_EXPRESSION__APPLIED_PROPERTY;

	/**
	 * The feature id for the '<em><b>Let Exp</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_EXP__LET_EXP = OCL_EXPRESSION__LET_EXP;

	/**
	 * The feature id for the '<em><b>Loop Exp</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_EXP__LOOP_EXP = OCL_EXPRESSION__LOOP_EXP;

	/**
	 * The feature id for the '<em><b>Parent Operation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_EXP__PARENT_OPERATION = OCL_EXPRESSION__PARENT_OPERATION;

	/**
	 * The feature id for the '<em><b>Initialized Variable</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_EXP__INITIALIZED_VARIABLE = OCL_EXPRESSION__INITIALIZED_VARIABLE;

	/**
	 * The feature id for the '<em><b>If Exp2</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_EXP__IF_EXP2 = OCL_EXPRESSION__IF_EXP2;

	/**
	 * The feature id for the '<em><b>Owning Operation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_EXP__OWNING_OPERATION = OCL_EXPRESSION__OWNING_OPERATION;

	/**
	 * The feature id for the '<em><b>If Exp1</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_EXP__IF_EXP1 = OCL_EXPRESSION__IF_EXP1;

	/**
	 * The feature id for the '<em><b>Owning Attribute</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_EXP__OWNING_ATTRIBUTE = OCL_EXPRESSION__OWNING_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Applied Operator</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_EXP__APPLIED_OPERATOR = OCL_EXPRESSION__APPLIED_OPERATOR;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_EXP__ELEMENTS = OCL_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Map Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_EXP_FEATURE_COUNT = OCL_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Map Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_EXP_OPERATION_COUNT = OCL_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link QualityMetamodel.QMM_OCL.impl.MapElementImpl <em>Map Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QualityMetamodel.QMM_OCL.impl.MapElementImpl
	 * @see QualityMetamodel.QMM_OCL.impl.QMM_OCLPackageImpl#getMapElement()
	 * @generated
	 */
	int MAP_ELEMENT = 27;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_ELEMENT__LINE = LOCATED_ELEMENT__LINE;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_ELEMENT__COLUMN = LOCATED_ELEMENT__COLUMN;

	/**
	 * The feature id for the '<em><b>Char Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_ELEMENT__CHAR_START = LOCATED_ELEMENT__CHAR_START;

	/**
	 * The feature id for the '<em><b>Char End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_ELEMENT__CHAR_END = LOCATED_ELEMENT__CHAR_END;

	/**
	 * The feature id for the '<em><b>Map</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_ELEMENT__MAP = LOCATED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_ELEMENT__KEY = LOCATED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_ELEMENT__VALUE = LOCATED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Map Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_ELEMENT_FEATURE_COUNT = LOCATED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Map Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_ELEMENT_OPERATION_COUNT = LOCATED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link QualityMetamodel.QMM_OCL.impl.EnumLiteralExpImpl <em>Enum Literal Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QualityMetamodel.QMM_OCL.impl.EnumLiteralExpImpl
	 * @see QualityMetamodel.QMM_OCL.impl.QMM_OCLPackageImpl#getEnumLiteralExp()
	 * @generated
	 */
	int ENUM_LITERAL_EXP = 28;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_LITERAL_EXP__LINE = OCL_EXPRESSION__LINE;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_LITERAL_EXP__COLUMN = OCL_EXPRESSION__COLUMN;

	/**
	 * The feature id for the '<em><b>Char Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_LITERAL_EXP__CHAR_START = OCL_EXPRESSION__CHAR_START;

	/**
	 * The feature id for the '<em><b>Char End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_LITERAL_EXP__CHAR_END = OCL_EXPRESSION__CHAR_END;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_LITERAL_EXP__TYPE = OCL_EXPRESSION__TYPE;

	/**
	 * The feature id for the '<em><b>If Exp3</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_LITERAL_EXP__IF_EXP3 = OCL_EXPRESSION__IF_EXP3;

	/**
	 * The feature id for the '<em><b>Applied Property</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_LITERAL_EXP__APPLIED_PROPERTY = OCL_EXPRESSION__APPLIED_PROPERTY;

	/**
	 * The feature id for the '<em><b>Let Exp</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_LITERAL_EXP__LET_EXP = OCL_EXPRESSION__LET_EXP;

	/**
	 * The feature id for the '<em><b>Loop Exp</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_LITERAL_EXP__LOOP_EXP = OCL_EXPRESSION__LOOP_EXP;

	/**
	 * The feature id for the '<em><b>Parent Operation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_LITERAL_EXP__PARENT_OPERATION = OCL_EXPRESSION__PARENT_OPERATION;

	/**
	 * The feature id for the '<em><b>Initialized Variable</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_LITERAL_EXP__INITIALIZED_VARIABLE = OCL_EXPRESSION__INITIALIZED_VARIABLE;

	/**
	 * The feature id for the '<em><b>If Exp2</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_LITERAL_EXP__IF_EXP2 = OCL_EXPRESSION__IF_EXP2;

	/**
	 * The feature id for the '<em><b>Owning Operation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_LITERAL_EXP__OWNING_OPERATION = OCL_EXPRESSION__OWNING_OPERATION;

	/**
	 * The feature id for the '<em><b>If Exp1</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_LITERAL_EXP__IF_EXP1 = OCL_EXPRESSION__IF_EXP1;

	/**
	 * The feature id for the '<em><b>Owning Attribute</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_LITERAL_EXP__OWNING_ATTRIBUTE = OCL_EXPRESSION__OWNING_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Applied Operator</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_LITERAL_EXP__APPLIED_OPERATOR = OCL_EXPRESSION__APPLIED_OPERATOR;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_LITERAL_EXP__NAME = OCL_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Enum Literal Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_LITERAL_EXP_FEATURE_COUNT = OCL_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Enum Literal Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_LITERAL_EXP_OPERATION_COUNT = OCL_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link QualityMetamodel.QMM_OCL.impl.OclUndefinedExpImpl <em>Ocl Undefined Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QualityMetamodel.QMM_OCL.impl.OclUndefinedExpImpl
	 * @see QualityMetamodel.QMM_OCL.impl.QMM_OCLPackageImpl#getOclUndefinedExp()
	 * @generated
	 */
	int OCL_UNDEFINED_EXP = 29;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_UNDEFINED_EXP__LINE = OCL_EXPRESSION__LINE;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_UNDEFINED_EXP__COLUMN = OCL_EXPRESSION__COLUMN;

	/**
	 * The feature id for the '<em><b>Char Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_UNDEFINED_EXP__CHAR_START = OCL_EXPRESSION__CHAR_START;

	/**
	 * The feature id for the '<em><b>Char End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_UNDEFINED_EXP__CHAR_END = OCL_EXPRESSION__CHAR_END;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_UNDEFINED_EXP__TYPE = OCL_EXPRESSION__TYPE;

	/**
	 * The feature id for the '<em><b>If Exp3</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_UNDEFINED_EXP__IF_EXP3 = OCL_EXPRESSION__IF_EXP3;

	/**
	 * The feature id for the '<em><b>Applied Property</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_UNDEFINED_EXP__APPLIED_PROPERTY = OCL_EXPRESSION__APPLIED_PROPERTY;

	/**
	 * The feature id for the '<em><b>Let Exp</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_UNDEFINED_EXP__LET_EXP = OCL_EXPRESSION__LET_EXP;

	/**
	 * The feature id for the '<em><b>Loop Exp</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_UNDEFINED_EXP__LOOP_EXP = OCL_EXPRESSION__LOOP_EXP;

	/**
	 * The feature id for the '<em><b>Parent Operation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_UNDEFINED_EXP__PARENT_OPERATION = OCL_EXPRESSION__PARENT_OPERATION;

	/**
	 * The feature id for the '<em><b>Initialized Variable</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_UNDEFINED_EXP__INITIALIZED_VARIABLE = OCL_EXPRESSION__INITIALIZED_VARIABLE;

	/**
	 * The feature id for the '<em><b>If Exp2</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_UNDEFINED_EXP__IF_EXP2 = OCL_EXPRESSION__IF_EXP2;

	/**
	 * The feature id for the '<em><b>Owning Operation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_UNDEFINED_EXP__OWNING_OPERATION = OCL_EXPRESSION__OWNING_OPERATION;

	/**
	 * The feature id for the '<em><b>If Exp1</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_UNDEFINED_EXP__IF_EXP1 = OCL_EXPRESSION__IF_EXP1;

	/**
	 * The feature id for the '<em><b>Owning Attribute</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_UNDEFINED_EXP__OWNING_ATTRIBUTE = OCL_EXPRESSION__OWNING_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Applied Operator</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_UNDEFINED_EXP__APPLIED_OPERATOR = OCL_EXPRESSION__APPLIED_OPERATOR;

	/**
	 * The number of structural features of the '<em>Ocl Undefined Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_UNDEFINED_EXP_FEATURE_COUNT = OCL_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Ocl Undefined Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_UNDEFINED_EXP_OPERATION_COUNT = OCL_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link QualityMetamodel.QMM_OCL.impl.StaticPropertyCallExpImpl <em>Static Property Call Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QualityMetamodel.QMM_OCL.impl.StaticPropertyCallExpImpl
	 * @see QualityMetamodel.QMM_OCL.impl.QMM_OCLPackageImpl#getStaticPropertyCallExp()
	 * @generated
	 */
	int STATIC_PROPERTY_CALL_EXP = 30;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_PROPERTY_CALL_EXP__LINE = OCL_EXPRESSION__LINE;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_PROPERTY_CALL_EXP__COLUMN = OCL_EXPRESSION__COLUMN;

	/**
	 * The feature id for the '<em><b>Char Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_PROPERTY_CALL_EXP__CHAR_START = OCL_EXPRESSION__CHAR_START;

	/**
	 * The feature id for the '<em><b>Char End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_PROPERTY_CALL_EXP__CHAR_END = OCL_EXPRESSION__CHAR_END;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_PROPERTY_CALL_EXP__TYPE = OCL_EXPRESSION__TYPE;

	/**
	 * The feature id for the '<em><b>If Exp3</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_PROPERTY_CALL_EXP__IF_EXP3 = OCL_EXPRESSION__IF_EXP3;

	/**
	 * The feature id for the '<em><b>Applied Property</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_PROPERTY_CALL_EXP__APPLIED_PROPERTY = OCL_EXPRESSION__APPLIED_PROPERTY;

	/**
	 * The feature id for the '<em><b>Let Exp</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_PROPERTY_CALL_EXP__LET_EXP = OCL_EXPRESSION__LET_EXP;

	/**
	 * The feature id for the '<em><b>Loop Exp</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_PROPERTY_CALL_EXP__LOOP_EXP = OCL_EXPRESSION__LOOP_EXP;

	/**
	 * The feature id for the '<em><b>Parent Operation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_PROPERTY_CALL_EXP__PARENT_OPERATION = OCL_EXPRESSION__PARENT_OPERATION;

	/**
	 * The feature id for the '<em><b>Initialized Variable</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_PROPERTY_CALL_EXP__INITIALIZED_VARIABLE = OCL_EXPRESSION__INITIALIZED_VARIABLE;

	/**
	 * The feature id for the '<em><b>If Exp2</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_PROPERTY_CALL_EXP__IF_EXP2 = OCL_EXPRESSION__IF_EXP2;

	/**
	 * The feature id for the '<em><b>Owning Operation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_PROPERTY_CALL_EXP__OWNING_OPERATION = OCL_EXPRESSION__OWNING_OPERATION;

	/**
	 * The feature id for the '<em><b>If Exp1</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_PROPERTY_CALL_EXP__IF_EXP1 = OCL_EXPRESSION__IF_EXP1;

	/**
	 * The feature id for the '<em><b>Owning Attribute</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_PROPERTY_CALL_EXP__OWNING_ATTRIBUTE = OCL_EXPRESSION__OWNING_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Applied Operator</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_PROPERTY_CALL_EXP__APPLIED_OPERATOR = OCL_EXPRESSION__APPLIED_OPERATOR;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_PROPERTY_CALL_EXP__SOURCE = OCL_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Static Call</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_PROPERTY_CALL_EXP__STATIC_CALL = OCL_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Static Property Call Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_PROPERTY_CALL_EXP_FEATURE_COUNT = OCL_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Static Property Call Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_PROPERTY_CALL_EXP_OPERATION_COUNT = OCL_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link QualityMetamodel.QMM_OCL.impl.StaticPropertyCallImpl <em>Static Property Call</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QualityMetamodel.QMM_OCL.impl.StaticPropertyCallImpl
	 * @see QualityMetamodel.QMM_OCL.impl.QMM_OCLPackageImpl#getStaticPropertyCall()
	 * @generated
	 */
	int STATIC_PROPERTY_CALL = 31;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_PROPERTY_CALL__LINE = LOCATED_ELEMENT__LINE;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_PROPERTY_CALL__COLUMN = LOCATED_ELEMENT__COLUMN;

	/**
	 * The feature id for the '<em><b>Char Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_PROPERTY_CALL__CHAR_START = LOCATED_ELEMENT__CHAR_START;

	/**
	 * The feature id for the '<em><b>Char End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_PROPERTY_CALL__CHAR_END = LOCATED_ELEMENT__CHAR_END;

	/**
	 * The feature id for the '<em><b>Static Call Exp</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_PROPERTY_CALL__STATIC_CALL_EXP = LOCATED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Static Property Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_PROPERTY_CALL_FEATURE_COUNT = LOCATED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Static Property Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_PROPERTY_CALL_OPERATION_COUNT = LOCATED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link QualityMetamodel.QMM_OCL.impl.StaticNavigationOrAttributeCallImpl <em>Static Navigation Or Attribute Call</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QualityMetamodel.QMM_OCL.impl.StaticNavigationOrAttributeCallImpl
	 * @see QualityMetamodel.QMM_OCL.impl.QMM_OCLPackageImpl#getStaticNavigationOrAttributeCall()
	 * @generated
	 */
	int STATIC_NAVIGATION_OR_ATTRIBUTE_CALL = 32;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_NAVIGATION_OR_ATTRIBUTE_CALL__LINE = STATIC_PROPERTY_CALL__LINE;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_NAVIGATION_OR_ATTRIBUTE_CALL__COLUMN = STATIC_PROPERTY_CALL__COLUMN;

	/**
	 * The feature id for the '<em><b>Char Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_NAVIGATION_OR_ATTRIBUTE_CALL__CHAR_START = STATIC_PROPERTY_CALL__CHAR_START;

	/**
	 * The feature id for the '<em><b>Char End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_NAVIGATION_OR_ATTRIBUTE_CALL__CHAR_END = STATIC_PROPERTY_CALL__CHAR_END;

	/**
	 * The feature id for the '<em><b>Static Call Exp</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_NAVIGATION_OR_ATTRIBUTE_CALL__STATIC_CALL_EXP = STATIC_PROPERTY_CALL__STATIC_CALL_EXP;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_NAVIGATION_OR_ATTRIBUTE_CALL__NAME = STATIC_PROPERTY_CALL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Static Navigation Or Attribute Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_NAVIGATION_OR_ATTRIBUTE_CALL_FEATURE_COUNT = STATIC_PROPERTY_CALL_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Static Navigation Or Attribute Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_NAVIGATION_OR_ATTRIBUTE_CALL_OPERATION_COUNT = STATIC_PROPERTY_CALL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link QualityMetamodel.QMM_OCL.impl.StaticOperationCallImpl <em>Static Operation Call</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QualityMetamodel.QMM_OCL.impl.StaticOperationCallImpl
	 * @see QualityMetamodel.QMM_OCL.impl.QMM_OCLPackageImpl#getStaticOperationCall()
	 * @generated
	 */
	int STATIC_OPERATION_CALL = 33;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_OPERATION_CALL__LINE = STATIC_PROPERTY_CALL__LINE;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_OPERATION_CALL__COLUMN = STATIC_PROPERTY_CALL__COLUMN;

	/**
	 * The feature id for the '<em><b>Char Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_OPERATION_CALL__CHAR_START = STATIC_PROPERTY_CALL__CHAR_START;

	/**
	 * The feature id for the '<em><b>Char End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_OPERATION_CALL__CHAR_END = STATIC_PROPERTY_CALL__CHAR_END;

	/**
	 * The feature id for the '<em><b>Static Call Exp</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_OPERATION_CALL__STATIC_CALL_EXP = STATIC_PROPERTY_CALL__STATIC_CALL_EXP;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_OPERATION_CALL__ARGUMENTS = STATIC_PROPERTY_CALL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_OPERATION_CALL__OPERATION_NAME = STATIC_PROPERTY_CALL_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Static Operation Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_OPERATION_CALL_FEATURE_COUNT = STATIC_PROPERTY_CALL_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Static Operation Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_OPERATION_CALL_OPERATION_COUNT = STATIC_PROPERTY_CALL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link QualityMetamodel.QMM_OCL.impl.PropertyCallExpImpl <em>Property Call Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QualityMetamodel.QMM_OCL.impl.PropertyCallExpImpl
	 * @see QualityMetamodel.QMM_OCL.impl.QMM_OCLPackageImpl#getPropertyCallExp()
	 * @generated
	 */
	int PROPERTY_CALL_EXP = 34;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_CALL_EXP__LINE = OCL_EXPRESSION__LINE;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_CALL_EXP__COLUMN = OCL_EXPRESSION__COLUMN;

	/**
	 * The feature id for the '<em><b>Char Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_CALL_EXP__CHAR_START = OCL_EXPRESSION__CHAR_START;

	/**
	 * The feature id for the '<em><b>Char End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_CALL_EXP__CHAR_END = OCL_EXPRESSION__CHAR_END;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_CALL_EXP__TYPE = OCL_EXPRESSION__TYPE;

	/**
	 * The feature id for the '<em><b>If Exp3</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_CALL_EXP__IF_EXP3 = OCL_EXPRESSION__IF_EXP3;

	/**
	 * The feature id for the '<em><b>Applied Property</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_CALL_EXP__APPLIED_PROPERTY = OCL_EXPRESSION__APPLIED_PROPERTY;

	/**
	 * The feature id for the '<em><b>Let Exp</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_CALL_EXP__LET_EXP = OCL_EXPRESSION__LET_EXP;

	/**
	 * The feature id for the '<em><b>Loop Exp</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_CALL_EXP__LOOP_EXP = OCL_EXPRESSION__LOOP_EXP;

	/**
	 * The feature id for the '<em><b>Parent Operation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_CALL_EXP__PARENT_OPERATION = OCL_EXPRESSION__PARENT_OPERATION;

	/**
	 * The feature id for the '<em><b>Initialized Variable</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_CALL_EXP__INITIALIZED_VARIABLE = OCL_EXPRESSION__INITIALIZED_VARIABLE;

	/**
	 * The feature id for the '<em><b>If Exp2</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_CALL_EXP__IF_EXP2 = OCL_EXPRESSION__IF_EXP2;

	/**
	 * The feature id for the '<em><b>Owning Operation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_CALL_EXP__OWNING_OPERATION = OCL_EXPRESSION__OWNING_OPERATION;

	/**
	 * The feature id for the '<em><b>If Exp1</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_CALL_EXP__IF_EXP1 = OCL_EXPRESSION__IF_EXP1;

	/**
	 * The feature id for the '<em><b>Owning Attribute</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_CALL_EXP__OWNING_ATTRIBUTE = OCL_EXPRESSION__OWNING_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Applied Operator</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_CALL_EXP__APPLIED_OPERATOR = OCL_EXPRESSION__APPLIED_OPERATOR;

	/**
	 * The feature id for the '<em><b>Calls</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_CALL_EXP__CALLS = OCL_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_CALL_EXP__SOURCE = OCL_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Property Call Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_CALL_EXP_FEATURE_COUNT = OCL_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Property Call Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_CALL_EXP_OPERATION_COUNT = OCL_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link QualityMetamodel.QMM_OCL.impl.PropertyCallImpl <em>Property Call</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QualityMetamodel.QMM_OCL.impl.PropertyCallImpl
	 * @see QualityMetamodel.QMM_OCL.impl.QMM_OCLPackageImpl#getPropertyCall()
	 * @generated
	 */
	int PROPERTY_CALL = 35;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_CALL__LINE = LOCATED_ELEMENT__LINE;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_CALL__COLUMN = LOCATED_ELEMENT__COLUMN;

	/**
	 * The feature id for the '<em><b>Char Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_CALL__CHAR_START = LOCATED_ELEMENT__CHAR_START;

	/**
	 * The feature id for the '<em><b>Char End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_CALL__CHAR_END = LOCATED_ELEMENT__CHAR_END;

	/**
	 * The feature id for the '<em><b>Call Exp</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_CALL__CALL_EXP = LOCATED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Property Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_CALL_FEATURE_COUNT = LOCATED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Property Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_CALL_OPERATION_COUNT = LOCATED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link QualityMetamodel.QMM_OCL.impl.NavigationOrAttributeCallImpl <em>Navigation Or Attribute Call</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QualityMetamodel.QMM_OCL.impl.NavigationOrAttributeCallImpl
	 * @see QualityMetamodel.QMM_OCL.impl.QMM_OCLPackageImpl#getNavigationOrAttributeCall()
	 * @generated
	 */
	int NAVIGATION_OR_ATTRIBUTE_CALL = 36;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_OR_ATTRIBUTE_CALL__LINE = PROPERTY_CALL__LINE;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_OR_ATTRIBUTE_CALL__COLUMN = PROPERTY_CALL__COLUMN;

	/**
	 * The feature id for the '<em><b>Char Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_OR_ATTRIBUTE_CALL__CHAR_START = PROPERTY_CALL__CHAR_START;

	/**
	 * The feature id for the '<em><b>Char End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_OR_ATTRIBUTE_CALL__CHAR_END = PROPERTY_CALL__CHAR_END;

	/**
	 * The feature id for the '<em><b>Call Exp</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_OR_ATTRIBUTE_CALL__CALL_EXP = PROPERTY_CALL__CALL_EXP;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_OR_ATTRIBUTE_CALL__NAME = PROPERTY_CALL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Navigation Or Attribute Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_OR_ATTRIBUTE_CALL_FEATURE_COUNT = PROPERTY_CALL_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Navigation Or Attribute Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_OR_ATTRIBUTE_CALL_OPERATION_COUNT = PROPERTY_CALL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link QualityMetamodel.QMM_OCL.impl.OperationCallImpl <em>Operation Call</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QualityMetamodel.QMM_OCL.impl.OperationCallImpl
	 * @see QualityMetamodel.QMM_OCL.impl.QMM_OCLPackageImpl#getOperationCall()
	 * @generated
	 */
	int OPERATION_CALL = 37;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CALL__LINE = PROPERTY_CALL__LINE;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CALL__COLUMN = PROPERTY_CALL__COLUMN;

	/**
	 * The feature id for the '<em><b>Char Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CALL__CHAR_START = PROPERTY_CALL__CHAR_START;

	/**
	 * The feature id for the '<em><b>Char End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CALL__CHAR_END = PROPERTY_CALL__CHAR_END;

	/**
	 * The feature id for the '<em><b>Call Exp</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CALL__CALL_EXP = PROPERTY_CALL__CALL_EXP;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CALL__ARGUMENTS = PROPERTY_CALL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CALL__OPERATION_NAME = PROPERTY_CALL_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Operation Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CALL_FEATURE_COUNT = PROPERTY_CALL_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Operation Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CALL_OPERATION_COUNT = PROPERTY_CALL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link QualityMetamodel.QMM_OCL.impl.OperatorCallExpImpl <em>Operator Call Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QualityMetamodel.QMM_OCL.impl.OperatorCallExpImpl
	 * @see QualityMetamodel.QMM_OCL.impl.QMM_OCLPackageImpl#getOperatorCallExp()
	 * @generated
	 */
	int OPERATOR_CALL_EXP = 38;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_CALL_EXP__LINE = OCL_EXPRESSION__LINE;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_CALL_EXP__COLUMN = OCL_EXPRESSION__COLUMN;

	/**
	 * The feature id for the '<em><b>Char Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_CALL_EXP__CHAR_START = OCL_EXPRESSION__CHAR_START;

	/**
	 * The feature id for the '<em><b>Char End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_CALL_EXP__CHAR_END = OCL_EXPRESSION__CHAR_END;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_CALL_EXP__TYPE = OCL_EXPRESSION__TYPE;

	/**
	 * The feature id for the '<em><b>If Exp3</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_CALL_EXP__IF_EXP3 = OCL_EXPRESSION__IF_EXP3;

	/**
	 * The feature id for the '<em><b>Applied Property</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_CALL_EXP__APPLIED_PROPERTY = OCL_EXPRESSION__APPLIED_PROPERTY;

	/**
	 * The feature id for the '<em><b>Let Exp</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_CALL_EXP__LET_EXP = OCL_EXPRESSION__LET_EXP;

	/**
	 * The feature id for the '<em><b>Loop Exp</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_CALL_EXP__LOOP_EXP = OCL_EXPRESSION__LOOP_EXP;

	/**
	 * The feature id for the '<em><b>Parent Operation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_CALL_EXP__PARENT_OPERATION = OCL_EXPRESSION__PARENT_OPERATION;

	/**
	 * The feature id for the '<em><b>Initialized Variable</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_CALL_EXP__INITIALIZED_VARIABLE = OCL_EXPRESSION__INITIALIZED_VARIABLE;

	/**
	 * The feature id for the '<em><b>If Exp2</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_CALL_EXP__IF_EXP2 = OCL_EXPRESSION__IF_EXP2;

	/**
	 * The feature id for the '<em><b>Owning Operation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_CALL_EXP__OWNING_OPERATION = OCL_EXPRESSION__OWNING_OPERATION;

	/**
	 * The feature id for the '<em><b>If Exp1</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_CALL_EXP__IF_EXP1 = OCL_EXPRESSION__IF_EXP1;

	/**
	 * The feature id for the '<em><b>Owning Attribute</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_CALL_EXP__OWNING_ATTRIBUTE = OCL_EXPRESSION__OWNING_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Applied Operator</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_CALL_EXP__APPLIED_OPERATOR = OCL_EXPRESSION__APPLIED_OPERATOR;

	/**
	 * The feature id for the '<em><b>Argument</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_CALL_EXP__ARGUMENT = OCL_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_CALL_EXP__OPERATION_NAME = OCL_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_CALL_EXP__SOURCE = OCL_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Operator Call Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_CALL_EXP_FEATURE_COUNT = OCL_EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Operator Call Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_CALL_EXP_OPERATION_COUNT = OCL_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link QualityMetamodel.QMM_OCL.impl.NotOpCallExpImpl <em>Not Op Call Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QualityMetamodel.QMM_OCL.impl.NotOpCallExpImpl
	 * @see QualityMetamodel.QMM_OCL.impl.QMM_OCLPackageImpl#getNotOpCallExp()
	 * @generated
	 */
	int NOT_OP_CALL_EXP = 39;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_OP_CALL_EXP__LINE = OPERATOR_CALL_EXP__LINE;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_OP_CALL_EXP__COLUMN = OPERATOR_CALL_EXP__COLUMN;

	/**
	 * The feature id for the '<em><b>Char Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_OP_CALL_EXP__CHAR_START = OPERATOR_CALL_EXP__CHAR_START;

	/**
	 * The feature id for the '<em><b>Char End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_OP_CALL_EXP__CHAR_END = OPERATOR_CALL_EXP__CHAR_END;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_OP_CALL_EXP__TYPE = OPERATOR_CALL_EXP__TYPE;

	/**
	 * The feature id for the '<em><b>If Exp3</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_OP_CALL_EXP__IF_EXP3 = OPERATOR_CALL_EXP__IF_EXP3;

	/**
	 * The feature id for the '<em><b>Applied Property</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_OP_CALL_EXP__APPLIED_PROPERTY = OPERATOR_CALL_EXP__APPLIED_PROPERTY;

	/**
	 * The feature id for the '<em><b>Let Exp</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_OP_CALL_EXP__LET_EXP = OPERATOR_CALL_EXP__LET_EXP;

	/**
	 * The feature id for the '<em><b>Loop Exp</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_OP_CALL_EXP__LOOP_EXP = OPERATOR_CALL_EXP__LOOP_EXP;

	/**
	 * The feature id for the '<em><b>Parent Operation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_OP_CALL_EXP__PARENT_OPERATION = OPERATOR_CALL_EXP__PARENT_OPERATION;

	/**
	 * The feature id for the '<em><b>Initialized Variable</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_OP_CALL_EXP__INITIALIZED_VARIABLE = OPERATOR_CALL_EXP__INITIALIZED_VARIABLE;

	/**
	 * The feature id for the '<em><b>If Exp2</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_OP_CALL_EXP__IF_EXP2 = OPERATOR_CALL_EXP__IF_EXP2;

	/**
	 * The feature id for the '<em><b>Owning Operation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_OP_CALL_EXP__OWNING_OPERATION = OPERATOR_CALL_EXP__OWNING_OPERATION;

	/**
	 * The feature id for the '<em><b>If Exp1</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_OP_CALL_EXP__IF_EXP1 = OPERATOR_CALL_EXP__IF_EXP1;

	/**
	 * The feature id for the '<em><b>Owning Attribute</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_OP_CALL_EXP__OWNING_ATTRIBUTE = OPERATOR_CALL_EXP__OWNING_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Applied Operator</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_OP_CALL_EXP__APPLIED_OPERATOR = OPERATOR_CALL_EXP__APPLIED_OPERATOR;

	/**
	 * The feature id for the '<em><b>Argument</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_OP_CALL_EXP__ARGUMENT = OPERATOR_CALL_EXP__ARGUMENT;

	/**
	 * The feature id for the '<em><b>Operation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_OP_CALL_EXP__OPERATION_NAME = OPERATOR_CALL_EXP__OPERATION_NAME;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_OP_CALL_EXP__SOURCE = OPERATOR_CALL_EXP__SOURCE;

	/**
	 * The number of structural features of the '<em>Not Op Call Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_OP_CALL_EXP_FEATURE_COUNT = OPERATOR_CALL_EXP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Not Op Call Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_OP_CALL_EXP_OPERATION_COUNT = OPERATOR_CALL_EXP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link QualityMetamodel.QMM_OCL.impl.RelOpCallExpImpl <em>Rel Op Call Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QualityMetamodel.QMM_OCL.impl.RelOpCallExpImpl
	 * @see QualityMetamodel.QMM_OCL.impl.QMM_OCLPackageImpl#getRelOpCallExp()
	 * @generated
	 */
	int REL_OP_CALL_EXP = 40;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REL_OP_CALL_EXP__LINE = OPERATOR_CALL_EXP__LINE;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REL_OP_CALL_EXP__COLUMN = OPERATOR_CALL_EXP__COLUMN;

	/**
	 * The feature id for the '<em><b>Char Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REL_OP_CALL_EXP__CHAR_START = OPERATOR_CALL_EXP__CHAR_START;

	/**
	 * The feature id for the '<em><b>Char End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REL_OP_CALL_EXP__CHAR_END = OPERATOR_CALL_EXP__CHAR_END;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REL_OP_CALL_EXP__TYPE = OPERATOR_CALL_EXP__TYPE;

	/**
	 * The feature id for the '<em><b>If Exp3</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REL_OP_CALL_EXP__IF_EXP3 = OPERATOR_CALL_EXP__IF_EXP3;

	/**
	 * The feature id for the '<em><b>Applied Property</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REL_OP_CALL_EXP__APPLIED_PROPERTY = OPERATOR_CALL_EXP__APPLIED_PROPERTY;

	/**
	 * The feature id for the '<em><b>Let Exp</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REL_OP_CALL_EXP__LET_EXP = OPERATOR_CALL_EXP__LET_EXP;

	/**
	 * The feature id for the '<em><b>Loop Exp</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REL_OP_CALL_EXP__LOOP_EXP = OPERATOR_CALL_EXP__LOOP_EXP;

	/**
	 * The feature id for the '<em><b>Parent Operation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REL_OP_CALL_EXP__PARENT_OPERATION = OPERATOR_CALL_EXP__PARENT_OPERATION;

	/**
	 * The feature id for the '<em><b>Initialized Variable</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REL_OP_CALL_EXP__INITIALIZED_VARIABLE = OPERATOR_CALL_EXP__INITIALIZED_VARIABLE;

	/**
	 * The feature id for the '<em><b>If Exp2</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REL_OP_CALL_EXP__IF_EXP2 = OPERATOR_CALL_EXP__IF_EXP2;

	/**
	 * The feature id for the '<em><b>Owning Operation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REL_OP_CALL_EXP__OWNING_OPERATION = OPERATOR_CALL_EXP__OWNING_OPERATION;

	/**
	 * The feature id for the '<em><b>If Exp1</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REL_OP_CALL_EXP__IF_EXP1 = OPERATOR_CALL_EXP__IF_EXP1;

	/**
	 * The feature id for the '<em><b>Owning Attribute</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REL_OP_CALL_EXP__OWNING_ATTRIBUTE = OPERATOR_CALL_EXP__OWNING_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Applied Operator</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REL_OP_CALL_EXP__APPLIED_OPERATOR = OPERATOR_CALL_EXP__APPLIED_OPERATOR;

	/**
	 * The feature id for the '<em><b>Argument</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REL_OP_CALL_EXP__ARGUMENT = OPERATOR_CALL_EXP__ARGUMENT;

	/**
	 * The feature id for the '<em><b>Operation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REL_OP_CALL_EXP__OPERATION_NAME = OPERATOR_CALL_EXP__OPERATION_NAME;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REL_OP_CALL_EXP__SOURCE = OPERATOR_CALL_EXP__SOURCE;

	/**
	 * The number of structural features of the '<em>Rel Op Call Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REL_OP_CALL_EXP_FEATURE_COUNT = OPERATOR_CALL_EXP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Rel Op Call Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REL_OP_CALL_EXP_OPERATION_COUNT = OPERATOR_CALL_EXP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link QualityMetamodel.QMM_OCL.impl.EqOpCallExpImpl <em>Eq Op Call Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QualityMetamodel.QMM_OCL.impl.EqOpCallExpImpl
	 * @see QualityMetamodel.QMM_OCL.impl.QMM_OCLPackageImpl#getEqOpCallExp()
	 * @generated
	 */
	int EQ_OP_CALL_EXP = 41;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQ_OP_CALL_EXP__LINE = OPERATOR_CALL_EXP__LINE;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQ_OP_CALL_EXP__COLUMN = OPERATOR_CALL_EXP__COLUMN;

	/**
	 * The feature id for the '<em><b>Char Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQ_OP_CALL_EXP__CHAR_START = OPERATOR_CALL_EXP__CHAR_START;

	/**
	 * The feature id for the '<em><b>Char End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQ_OP_CALL_EXP__CHAR_END = OPERATOR_CALL_EXP__CHAR_END;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQ_OP_CALL_EXP__TYPE = OPERATOR_CALL_EXP__TYPE;

	/**
	 * The feature id for the '<em><b>If Exp3</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQ_OP_CALL_EXP__IF_EXP3 = OPERATOR_CALL_EXP__IF_EXP3;

	/**
	 * The feature id for the '<em><b>Applied Property</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQ_OP_CALL_EXP__APPLIED_PROPERTY = OPERATOR_CALL_EXP__APPLIED_PROPERTY;

	/**
	 * The feature id for the '<em><b>Let Exp</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQ_OP_CALL_EXP__LET_EXP = OPERATOR_CALL_EXP__LET_EXP;

	/**
	 * The feature id for the '<em><b>Loop Exp</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQ_OP_CALL_EXP__LOOP_EXP = OPERATOR_CALL_EXP__LOOP_EXP;

	/**
	 * The feature id for the '<em><b>Parent Operation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQ_OP_CALL_EXP__PARENT_OPERATION = OPERATOR_CALL_EXP__PARENT_OPERATION;

	/**
	 * The feature id for the '<em><b>Initialized Variable</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQ_OP_CALL_EXP__INITIALIZED_VARIABLE = OPERATOR_CALL_EXP__INITIALIZED_VARIABLE;

	/**
	 * The feature id for the '<em><b>If Exp2</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQ_OP_CALL_EXP__IF_EXP2 = OPERATOR_CALL_EXP__IF_EXP2;

	/**
	 * The feature id for the '<em><b>Owning Operation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQ_OP_CALL_EXP__OWNING_OPERATION = OPERATOR_CALL_EXP__OWNING_OPERATION;

	/**
	 * The feature id for the '<em><b>If Exp1</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQ_OP_CALL_EXP__IF_EXP1 = OPERATOR_CALL_EXP__IF_EXP1;

	/**
	 * The feature id for the '<em><b>Owning Attribute</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQ_OP_CALL_EXP__OWNING_ATTRIBUTE = OPERATOR_CALL_EXP__OWNING_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Applied Operator</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQ_OP_CALL_EXP__APPLIED_OPERATOR = OPERATOR_CALL_EXP__APPLIED_OPERATOR;

	/**
	 * The feature id for the '<em><b>Argument</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQ_OP_CALL_EXP__ARGUMENT = OPERATOR_CALL_EXP__ARGUMENT;

	/**
	 * The feature id for the '<em><b>Operation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQ_OP_CALL_EXP__OPERATION_NAME = OPERATOR_CALL_EXP__OPERATION_NAME;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQ_OP_CALL_EXP__SOURCE = OPERATOR_CALL_EXP__SOURCE;

	/**
	 * The number of structural features of the '<em>Eq Op Call Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQ_OP_CALL_EXP_FEATURE_COUNT = OPERATOR_CALL_EXP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Eq Op Call Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQ_OP_CALL_EXP_OPERATION_COUNT = OPERATOR_CALL_EXP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link QualityMetamodel.QMM_OCL.impl.AddOpCallExpImpl <em>Add Op Call Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QualityMetamodel.QMM_OCL.impl.AddOpCallExpImpl
	 * @see QualityMetamodel.QMM_OCL.impl.QMM_OCLPackageImpl#getAddOpCallExp()
	 * @generated
	 */
	int ADD_OP_CALL_EXP = 42;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_OP_CALL_EXP__LINE = OPERATOR_CALL_EXP__LINE;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_OP_CALL_EXP__COLUMN = OPERATOR_CALL_EXP__COLUMN;

	/**
	 * The feature id for the '<em><b>Char Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_OP_CALL_EXP__CHAR_START = OPERATOR_CALL_EXP__CHAR_START;

	/**
	 * The feature id for the '<em><b>Char End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_OP_CALL_EXP__CHAR_END = OPERATOR_CALL_EXP__CHAR_END;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_OP_CALL_EXP__TYPE = OPERATOR_CALL_EXP__TYPE;

	/**
	 * The feature id for the '<em><b>If Exp3</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_OP_CALL_EXP__IF_EXP3 = OPERATOR_CALL_EXP__IF_EXP3;

	/**
	 * The feature id for the '<em><b>Applied Property</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_OP_CALL_EXP__APPLIED_PROPERTY = OPERATOR_CALL_EXP__APPLIED_PROPERTY;

	/**
	 * The feature id for the '<em><b>Let Exp</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_OP_CALL_EXP__LET_EXP = OPERATOR_CALL_EXP__LET_EXP;

	/**
	 * The feature id for the '<em><b>Loop Exp</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_OP_CALL_EXP__LOOP_EXP = OPERATOR_CALL_EXP__LOOP_EXP;

	/**
	 * The feature id for the '<em><b>Parent Operation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_OP_CALL_EXP__PARENT_OPERATION = OPERATOR_CALL_EXP__PARENT_OPERATION;

	/**
	 * The feature id for the '<em><b>Initialized Variable</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_OP_CALL_EXP__INITIALIZED_VARIABLE = OPERATOR_CALL_EXP__INITIALIZED_VARIABLE;

	/**
	 * The feature id for the '<em><b>If Exp2</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_OP_CALL_EXP__IF_EXP2 = OPERATOR_CALL_EXP__IF_EXP2;

	/**
	 * The feature id for the '<em><b>Owning Operation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_OP_CALL_EXP__OWNING_OPERATION = OPERATOR_CALL_EXP__OWNING_OPERATION;

	/**
	 * The feature id for the '<em><b>If Exp1</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_OP_CALL_EXP__IF_EXP1 = OPERATOR_CALL_EXP__IF_EXP1;

	/**
	 * The feature id for the '<em><b>Owning Attribute</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_OP_CALL_EXP__OWNING_ATTRIBUTE = OPERATOR_CALL_EXP__OWNING_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Applied Operator</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_OP_CALL_EXP__APPLIED_OPERATOR = OPERATOR_CALL_EXP__APPLIED_OPERATOR;

	/**
	 * The feature id for the '<em><b>Argument</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_OP_CALL_EXP__ARGUMENT = OPERATOR_CALL_EXP__ARGUMENT;

	/**
	 * The feature id for the '<em><b>Operation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_OP_CALL_EXP__OPERATION_NAME = OPERATOR_CALL_EXP__OPERATION_NAME;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_OP_CALL_EXP__SOURCE = OPERATOR_CALL_EXP__SOURCE;

	/**
	 * The number of structural features of the '<em>Add Op Call Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_OP_CALL_EXP_FEATURE_COUNT = OPERATOR_CALL_EXP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Add Op Call Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_OP_CALL_EXP_OPERATION_COUNT = OPERATOR_CALL_EXP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link QualityMetamodel.QMM_OCL.impl.IntOpCallExpImpl <em>Int Op Call Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QualityMetamodel.QMM_OCL.impl.IntOpCallExpImpl
	 * @see QualityMetamodel.QMM_OCL.impl.QMM_OCLPackageImpl#getIntOpCallExp()
	 * @generated
	 */
	int INT_OP_CALL_EXP = 43;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_OP_CALL_EXP__LINE = OPERATOR_CALL_EXP__LINE;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_OP_CALL_EXP__COLUMN = OPERATOR_CALL_EXP__COLUMN;

	/**
	 * The feature id for the '<em><b>Char Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_OP_CALL_EXP__CHAR_START = OPERATOR_CALL_EXP__CHAR_START;

	/**
	 * The feature id for the '<em><b>Char End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_OP_CALL_EXP__CHAR_END = OPERATOR_CALL_EXP__CHAR_END;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_OP_CALL_EXP__TYPE = OPERATOR_CALL_EXP__TYPE;

	/**
	 * The feature id for the '<em><b>If Exp3</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_OP_CALL_EXP__IF_EXP3 = OPERATOR_CALL_EXP__IF_EXP3;

	/**
	 * The feature id for the '<em><b>Applied Property</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_OP_CALL_EXP__APPLIED_PROPERTY = OPERATOR_CALL_EXP__APPLIED_PROPERTY;

	/**
	 * The feature id for the '<em><b>Let Exp</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_OP_CALL_EXP__LET_EXP = OPERATOR_CALL_EXP__LET_EXP;

	/**
	 * The feature id for the '<em><b>Loop Exp</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_OP_CALL_EXP__LOOP_EXP = OPERATOR_CALL_EXP__LOOP_EXP;

	/**
	 * The feature id for the '<em><b>Parent Operation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_OP_CALL_EXP__PARENT_OPERATION = OPERATOR_CALL_EXP__PARENT_OPERATION;

	/**
	 * The feature id for the '<em><b>Initialized Variable</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_OP_CALL_EXP__INITIALIZED_VARIABLE = OPERATOR_CALL_EXP__INITIALIZED_VARIABLE;

	/**
	 * The feature id for the '<em><b>If Exp2</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_OP_CALL_EXP__IF_EXP2 = OPERATOR_CALL_EXP__IF_EXP2;

	/**
	 * The feature id for the '<em><b>Owning Operation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_OP_CALL_EXP__OWNING_OPERATION = OPERATOR_CALL_EXP__OWNING_OPERATION;

	/**
	 * The feature id for the '<em><b>If Exp1</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_OP_CALL_EXP__IF_EXP1 = OPERATOR_CALL_EXP__IF_EXP1;

	/**
	 * The feature id for the '<em><b>Owning Attribute</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_OP_CALL_EXP__OWNING_ATTRIBUTE = OPERATOR_CALL_EXP__OWNING_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Applied Operator</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_OP_CALL_EXP__APPLIED_OPERATOR = OPERATOR_CALL_EXP__APPLIED_OPERATOR;

	/**
	 * The feature id for the '<em><b>Argument</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_OP_CALL_EXP__ARGUMENT = OPERATOR_CALL_EXP__ARGUMENT;

	/**
	 * The feature id for the '<em><b>Operation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_OP_CALL_EXP__OPERATION_NAME = OPERATOR_CALL_EXP__OPERATION_NAME;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_OP_CALL_EXP__SOURCE = OPERATOR_CALL_EXP__SOURCE;

	/**
	 * The number of structural features of the '<em>Int Op Call Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_OP_CALL_EXP_FEATURE_COUNT = OPERATOR_CALL_EXP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Int Op Call Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_OP_CALL_EXP_OPERATION_COUNT = OPERATOR_CALL_EXP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link QualityMetamodel.QMM_OCL.impl.MulOpCallExpImpl <em>Mul Op Call Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QualityMetamodel.QMM_OCL.impl.MulOpCallExpImpl
	 * @see QualityMetamodel.QMM_OCL.impl.QMM_OCLPackageImpl#getMulOpCallExp()
	 * @generated
	 */
	int MUL_OP_CALL_EXP = 44;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUL_OP_CALL_EXP__LINE = OPERATOR_CALL_EXP__LINE;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUL_OP_CALL_EXP__COLUMN = OPERATOR_CALL_EXP__COLUMN;

	/**
	 * The feature id for the '<em><b>Char Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUL_OP_CALL_EXP__CHAR_START = OPERATOR_CALL_EXP__CHAR_START;

	/**
	 * The feature id for the '<em><b>Char End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUL_OP_CALL_EXP__CHAR_END = OPERATOR_CALL_EXP__CHAR_END;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUL_OP_CALL_EXP__TYPE = OPERATOR_CALL_EXP__TYPE;

	/**
	 * The feature id for the '<em><b>If Exp3</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUL_OP_CALL_EXP__IF_EXP3 = OPERATOR_CALL_EXP__IF_EXP3;

	/**
	 * The feature id for the '<em><b>Applied Property</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUL_OP_CALL_EXP__APPLIED_PROPERTY = OPERATOR_CALL_EXP__APPLIED_PROPERTY;

	/**
	 * The feature id for the '<em><b>Let Exp</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUL_OP_CALL_EXP__LET_EXP = OPERATOR_CALL_EXP__LET_EXP;

	/**
	 * The feature id for the '<em><b>Loop Exp</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUL_OP_CALL_EXP__LOOP_EXP = OPERATOR_CALL_EXP__LOOP_EXP;

	/**
	 * The feature id for the '<em><b>Parent Operation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUL_OP_CALL_EXP__PARENT_OPERATION = OPERATOR_CALL_EXP__PARENT_OPERATION;

	/**
	 * The feature id for the '<em><b>Initialized Variable</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUL_OP_CALL_EXP__INITIALIZED_VARIABLE = OPERATOR_CALL_EXP__INITIALIZED_VARIABLE;

	/**
	 * The feature id for the '<em><b>If Exp2</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUL_OP_CALL_EXP__IF_EXP2 = OPERATOR_CALL_EXP__IF_EXP2;

	/**
	 * The feature id for the '<em><b>Owning Operation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUL_OP_CALL_EXP__OWNING_OPERATION = OPERATOR_CALL_EXP__OWNING_OPERATION;

	/**
	 * The feature id for the '<em><b>If Exp1</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUL_OP_CALL_EXP__IF_EXP1 = OPERATOR_CALL_EXP__IF_EXP1;

	/**
	 * The feature id for the '<em><b>Owning Attribute</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUL_OP_CALL_EXP__OWNING_ATTRIBUTE = OPERATOR_CALL_EXP__OWNING_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Applied Operator</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUL_OP_CALL_EXP__APPLIED_OPERATOR = OPERATOR_CALL_EXP__APPLIED_OPERATOR;

	/**
	 * The feature id for the '<em><b>Argument</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUL_OP_CALL_EXP__ARGUMENT = OPERATOR_CALL_EXP__ARGUMENT;

	/**
	 * The feature id for the '<em><b>Operation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUL_OP_CALL_EXP__OPERATION_NAME = OPERATOR_CALL_EXP__OPERATION_NAME;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUL_OP_CALL_EXP__SOURCE = OPERATOR_CALL_EXP__SOURCE;

	/**
	 * The number of structural features of the '<em>Mul Op Call Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUL_OP_CALL_EXP_FEATURE_COUNT = OPERATOR_CALL_EXP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Mul Op Call Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUL_OP_CALL_EXP_OPERATION_COUNT = OPERATOR_CALL_EXP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link QualityMetamodel.QMM_OCL.impl.LambdaCallExpImpl <em>Lambda Call Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QualityMetamodel.QMM_OCL.impl.LambdaCallExpImpl
	 * @see QualityMetamodel.QMM_OCL.impl.QMM_OCLPackageImpl#getLambdaCallExp()
	 * @generated
	 */
	int LAMBDA_CALL_EXP = 45;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAMBDA_CALL_EXP__LINE = VARIABLE_EXP__LINE;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAMBDA_CALL_EXP__COLUMN = VARIABLE_EXP__COLUMN;

	/**
	 * The feature id for the '<em><b>Char Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAMBDA_CALL_EXP__CHAR_START = VARIABLE_EXP__CHAR_START;

	/**
	 * The feature id for the '<em><b>Char End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAMBDA_CALL_EXP__CHAR_END = VARIABLE_EXP__CHAR_END;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAMBDA_CALL_EXP__TYPE = VARIABLE_EXP__TYPE;

	/**
	 * The feature id for the '<em><b>If Exp3</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAMBDA_CALL_EXP__IF_EXP3 = VARIABLE_EXP__IF_EXP3;

	/**
	 * The feature id for the '<em><b>Applied Property</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAMBDA_CALL_EXP__APPLIED_PROPERTY = VARIABLE_EXP__APPLIED_PROPERTY;

	/**
	 * The feature id for the '<em><b>Let Exp</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAMBDA_CALL_EXP__LET_EXP = VARIABLE_EXP__LET_EXP;

	/**
	 * The feature id for the '<em><b>Loop Exp</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAMBDA_CALL_EXP__LOOP_EXP = VARIABLE_EXP__LOOP_EXP;

	/**
	 * The feature id for the '<em><b>Parent Operation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAMBDA_CALL_EXP__PARENT_OPERATION = VARIABLE_EXP__PARENT_OPERATION;

	/**
	 * The feature id for the '<em><b>Initialized Variable</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAMBDA_CALL_EXP__INITIALIZED_VARIABLE = VARIABLE_EXP__INITIALIZED_VARIABLE;

	/**
	 * The feature id for the '<em><b>If Exp2</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAMBDA_CALL_EXP__IF_EXP2 = VARIABLE_EXP__IF_EXP2;

	/**
	 * The feature id for the '<em><b>Owning Operation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAMBDA_CALL_EXP__OWNING_OPERATION = VARIABLE_EXP__OWNING_OPERATION;

	/**
	 * The feature id for the '<em><b>If Exp1</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAMBDA_CALL_EXP__IF_EXP1 = VARIABLE_EXP__IF_EXP1;

	/**
	 * The feature id for the '<em><b>Owning Attribute</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAMBDA_CALL_EXP__OWNING_ATTRIBUTE = VARIABLE_EXP__OWNING_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Applied Operator</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAMBDA_CALL_EXP__APPLIED_OPERATOR = VARIABLE_EXP__APPLIED_OPERATOR;

	/**
	 * The feature id for the '<em><b>Referred Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAMBDA_CALL_EXP__REFERRED_VARIABLE = VARIABLE_EXP__REFERRED_VARIABLE;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAMBDA_CALL_EXP__ARGUMENTS = VARIABLE_EXP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Lambda Call Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAMBDA_CALL_EXP_FEATURE_COUNT = VARIABLE_EXP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Lambda Call Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAMBDA_CALL_EXP_OPERATION_COUNT = VARIABLE_EXP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link QualityMetamodel.QMM_OCL.impl.BraceExpImpl <em>Brace Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QualityMetamodel.QMM_OCL.impl.BraceExpImpl
	 * @see QualityMetamodel.QMM_OCL.impl.QMM_OCLPackageImpl#getBraceExp()
	 * @generated
	 */
	int BRACE_EXP = 46;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRACE_EXP__LINE = OCL_EXPRESSION__LINE;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRACE_EXP__COLUMN = OCL_EXPRESSION__COLUMN;

	/**
	 * The feature id for the '<em><b>Char Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRACE_EXP__CHAR_START = OCL_EXPRESSION__CHAR_START;

	/**
	 * The feature id for the '<em><b>Char End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRACE_EXP__CHAR_END = OCL_EXPRESSION__CHAR_END;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRACE_EXP__TYPE = OCL_EXPRESSION__TYPE;

	/**
	 * The feature id for the '<em><b>If Exp3</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRACE_EXP__IF_EXP3 = OCL_EXPRESSION__IF_EXP3;

	/**
	 * The feature id for the '<em><b>Applied Property</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRACE_EXP__APPLIED_PROPERTY = OCL_EXPRESSION__APPLIED_PROPERTY;

	/**
	 * The feature id for the '<em><b>Let Exp</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRACE_EXP__LET_EXP = OCL_EXPRESSION__LET_EXP;

	/**
	 * The feature id for the '<em><b>Loop Exp</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRACE_EXP__LOOP_EXP = OCL_EXPRESSION__LOOP_EXP;

	/**
	 * The feature id for the '<em><b>Parent Operation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRACE_EXP__PARENT_OPERATION = OCL_EXPRESSION__PARENT_OPERATION;

	/**
	 * The feature id for the '<em><b>Initialized Variable</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRACE_EXP__INITIALIZED_VARIABLE = OCL_EXPRESSION__INITIALIZED_VARIABLE;

	/**
	 * The feature id for the '<em><b>If Exp2</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRACE_EXP__IF_EXP2 = OCL_EXPRESSION__IF_EXP2;

	/**
	 * The feature id for the '<em><b>Owning Operation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRACE_EXP__OWNING_OPERATION = OCL_EXPRESSION__OWNING_OPERATION;

	/**
	 * The feature id for the '<em><b>If Exp1</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRACE_EXP__IF_EXP1 = OCL_EXPRESSION__IF_EXP1;

	/**
	 * The feature id for the '<em><b>Owning Attribute</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRACE_EXP__OWNING_ATTRIBUTE = OCL_EXPRESSION__OWNING_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Applied Operator</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRACE_EXP__APPLIED_OPERATOR = OCL_EXPRESSION__APPLIED_OPERATOR;

	/**
	 * The feature id for the '<em><b>Exp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRACE_EXP__EXP = OCL_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Brace Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRACE_EXP_FEATURE_COUNT = OCL_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Brace Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRACE_EXP_OPERATION_COUNT = OCL_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link QualityMetamodel.QMM_OCL.impl.CollectionOperationCallImpl <em>Collection Operation Call</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QualityMetamodel.QMM_OCL.impl.CollectionOperationCallImpl
	 * @see QualityMetamodel.QMM_OCL.impl.QMM_OCLPackageImpl#getCollectionOperationCall()
	 * @generated
	 */
	int COLLECTION_OPERATION_CALL = 47;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_OPERATION_CALL__LINE = OPERATION_CALL__LINE;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_OPERATION_CALL__COLUMN = OPERATION_CALL__COLUMN;

	/**
	 * The feature id for the '<em><b>Char Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_OPERATION_CALL__CHAR_START = OPERATION_CALL__CHAR_START;

	/**
	 * The feature id for the '<em><b>Char End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_OPERATION_CALL__CHAR_END = OPERATION_CALL__CHAR_END;

	/**
	 * The feature id for the '<em><b>Call Exp</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_OPERATION_CALL__CALL_EXP = OPERATION_CALL__CALL_EXP;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_OPERATION_CALL__ARGUMENTS = OPERATION_CALL__ARGUMENTS;

	/**
	 * The feature id for the '<em><b>Operation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_OPERATION_CALL__OPERATION_NAME = OPERATION_CALL__OPERATION_NAME;

	/**
	 * The number of structural features of the '<em>Collection Operation Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_OPERATION_CALL_FEATURE_COUNT = OPERATION_CALL_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Collection Operation Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_OPERATION_CALL_OPERATION_COUNT = OPERATION_CALL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link QualityMetamodel.QMM_OCL.impl.LoopExpImpl <em>Loop Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QualityMetamodel.QMM_OCL.impl.LoopExpImpl
	 * @see QualityMetamodel.QMM_OCL.impl.QMM_OCLPackageImpl#getLoopExp()
	 * @generated
	 */
	int LOOP_EXP = 48;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_EXP__LINE = PROPERTY_CALL__LINE;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_EXP__COLUMN = PROPERTY_CALL__COLUMN;

	/**
	 * The feature id for the '<em><b>Char Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_EXP__CHAR_START = PROPERTY_CALL__CHAR_START;

	/**
	 * The feature id for the '<em><b>Char End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_EXP__CHAR_END = PROPERTY_CALL__CHAR_END;

	/**
	 * The feature id for the '<em><b>Call Exp</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_EXP__CALL_EXP = PROPERTY_CALL__CALL_EXP;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_EXP__BODY = PROPERTY_CALL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Iterators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_EXP__ITERATORS = PROPERTY_CALL_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Loop Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_EXP_FEATURE_COUNT = PROPERTY_CALL_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Loop Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_EXP_OPERATION_COUNT = PROPERTY_CALL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link QualityMetamodel.QMM_OCL.impl.IterateExpImpl <em>Iterate Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QualityMetamodel.QMM_OCL.impl.IterateExpImpl
	 * @see QualityMetamodel.QMM_OCL.impl.QMM_OCLPackageImpl#getIterateExp()
	 * @generated
	 */
	int ITERATE_EXP = 49;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATE_EXP__LINE = LOOP_EXP__LINE;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATE_EXP__COLUMN = LOOP_EXP__COLUMN;

	/**
	 * The feature id for the '<em><b>Char Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATE_EXP__CHAR_START = LOOP_EXP__CHAR_START;

	/**
	 * The feature id for the '<em><b>Char End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATE_EXP__CHAR_END = LOOP_EXP__CHAR_END;

	/**
	 * The feature id for the '<em><b>Call Exp</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATE_EXP__CALL_EXP = LOOP_EXP__CALL_EXP;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATE_EXP__BODY = LOOP_EXP__BODY;

	/**
	 * The feature id for the '<em><b>Iterators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATE_EXP__ITERATORS = LOOP_EXP__ITERATORS;

	/**
	 * The feature id for the '<em><b>Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATE_EXP__RESULT = LOOP_EXP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Iterate Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATE_EXP_FEATURE_COUNT = LOOP_EXP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Iterate Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATE_EXP_OPERATION_COUNT = LOOP_EXP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link QualityMetamodel.QMM_OCL.impl.IteratorExpImpl <em>Iterator Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QualityMetamodel.QMM_OCL.impl.IteratorExpImpl
	 * @see QualityMetamodel.QMM_OCL.impl.QMM_OCLPackageImpl#getIteratorExp()
	 * @generated
	 */
	int ITERATOR_EXP = 50;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATOR_EXP__LINE = LOOP_EXP__LINE;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATOR_EXP__COLUMN = LOOP_EXP__COLUMN;

	/**
	 * The feature id for the '<em><b>Char Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATOR_EXP__CHAR_START = LOOP_EXP__CHAR_START;

	/**
	 * The feature id for the '<em><b>Char End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATOR_EXP__CHAR_END = LOOP_EXP__CHAR_END;

	/**
	 * The feature id for the '<em><b>Call Exp</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATOR_EXP__CALL_EXP = LOOP_EXP__CALL_EXP;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATOR_EXP__BODY = LOOP_EXP__BODY;

	/**
	 * The feature id for the '<em><b>Iterators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATOR_EXP__ITERATORS = LOOP_EXP__ITERATORS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATOR_EXP__NAME = LOOP_EXP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Iterator Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATOR_EXP_FEATURE_COUNT = LOOP_EXP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Iterator Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATOR_EXP_OPERATION_COUNT = LOOP_EXP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link QualityMetamodel.QMM_OCL.impl.LetExpImpl <em>Let Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QualityMetamodel.QMM_OCL.impl.LetExpImpl
	 * @see QualityMetamodel.QMM_OCL.impl.QMM_OCLPackageImpl#getLetExp()
	 * @generated
	 */
	int LET_EXP = 51;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LET_EXP__LINE = OCL_EXPRESSION__LINE;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LET_EXP__COLUMN = OCL_EXPRESSION__COLUMN;

	/**
	 * The feature id for the '<em><b>Char Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LET_EXP__CHAR_START = OCL_EXPRESSION__CHAR_START;

	/**
	 * The feature id for the '<em><b>Char End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LET_EXP__CHAR_END = OCL_EXPRESSION__CHAR_END;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LET_EXP__TYPE = OCL_EXPRESSION__TYPE;

	/**
	 * The feature id for the '<em><b>If Exp3</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LET_EXP__IF_EXP3 = OCL_EXPRESSION__IF_EXP3;

	/**
	 * The feature id for the '<em><b>Applied Property</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LET_EXP__APPLIED_PROPERTY = OCL_EXPRESSION__APPLIED_PROPERTY;

	/**
	 * The feature id for the '<em><b>Let Exp</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LET_EXP__LET_EXP = OCL_EXPRESSION__LET_EXP;

	/**
	 * The feature id for the '<em><b>Loop Exp</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LET_EXP__LOOP_EXP = OCL_EXPRESSION__LOOP_EXP;

	/**
	 * The feature id for the '<em><b>Parent Operation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LET_EXP__PARENT_OPERATION = OCL_EXPRESSION__PARENT_OPERATION;

	/**
	 * The feature id for the '<em><b>Initialized Variable</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LET_EXP__INITIALIZED_VARIABLE = OCL_EXPRESSION__INITIALIZED_VARIABLE;

	/**
	 * The feature id for the '<em><b>If Exp2</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LET_EXP__IF_EXP2 = OCL_EXPRESSION__IF_EXP2;

	/**
	 * The feature id for the '<em><b>Owning Operation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LET_EXP__OWNING_OPERATION = OCL_EXPRESSION__OWNING_OPERATION;

	/**
	 * The feature id for the '<em><b>If Exp1</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LET_EXP__IF_EXP1 = OCL_EXPRESSION__IF_EXP1;

	/**
	 * The feature id for the '<em><b>Owning Attribute</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LET_EXP__OWNING_ATTRIBUTE = OCL_EXPRESSION__OWNING_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Applied Operator</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LET_EXP__APPLIED_OPERATOR = OCL_EXPRESSION__APPLIED_OPERATOR;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LET_EXP__VARIABLE = OCL_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>In </b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LET_EXP__IN_ = OCL_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Let Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LET_EXP_FEATURE_COUNT = OCL_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Let Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LET_EXP_OPERATION_COUNT = OCL_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link QualityMetamodel.QMM_OCL.impl.IfExpImpl <em>If Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QualityMetamodel.QMM_OCL.impl.IfExpImpl
	 * @see QualityMetamodel.QMM_OCL.impl.QMM_OCLPackageImpl#getIfExp()
	 * @generated
	 */
	int IF_EXP = 52;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_EXP__LINE = OCL_EXPRESSION__LINE;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_EXP__COLUMN = OCL_EXPRESSION__COLUMN;

	/**
	 * The feature id for the '<em><b>Char Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_EXP__CHAR_START = OCL_EXPRESSION__CHAR_START;

	/**
	 * The feature id for the '<em><b>Char End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_EXP__CHAR_END = OCL_EXPRESSION__CHAR_END;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_EXP__TYPE = OCL_EXPRESSION__TYPE;

	/**
	 * The feature id for the '<em><b>If Exp3</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_EXP__IF_EXP3 = OCL_EXPRESSION__IF_EXP3;

	/**
	 * The feature id for the '<em><b>Applied Property</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_EXP__APPLIED_PROPERTY = OCL_EXPRESSION__APPLIED_PROPERTY;

	/**
	 * The feature id for the '<em><b>Let Exp</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_EXP__LET_EXP = OCL_EXPRESSION__LET_EXP;

	/**
	 * The feature id for the '<em><b>Loop Exp</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_EXP__LOOP_EXP = OCL_EXPRESSION__LOOP_EXP;

	/**
	 * The feature id for the '<em><b>Parent Operation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_EXP__PARENT_OPERATION = OCL_EXPRESSION__PARENT_OPERATION;

	/**
	 * The feature id for the '<em><b>Initialized Variable</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_EXP__INITIALIZED_VARIABLE = OCL_EXPRESSION__INITIALIZED_VARIABLE;

	/**
	 * The feature id for the '<em><b>If Exp2</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_EXP__IF_EXP2 = OCL_EXPRESSION__IF_EXP2;

	/**
	 * The feature id for the '<em><b>Owning Operation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_EXP__OWNING_OPERATION = OCL_EXPRESSION__OWNING_OPERATION;

	/**
	 * The feature id for the '<em><b>If Exp1</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_EXP__IF_EXP1 = OCL_EXPRESSION__IF_EXP1;

	/**
	 * The feature id for the '<em><b>Owning Attribute</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_EXP__OWNING_ATTRIBUTE = OCL_EXPRESSION__OWNING_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Applied Operator</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_EXP__APPLIED_OPERATOR = OCL_EXPRESSION__APPLIED_OPERATOR;

	/**
	 * The feature id for the '<em><b>Then Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_EXP__THEN_EXPRESSION = OCL_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_EXP__CONDITION = OCL_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Else Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_EXP__ELSE_EXPRESSION = OCL_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>If Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_EXP_FEATURE_COUNT = OCL_EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>If Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_EXP_OPERATION_COUNT = OCL_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link QualityMetamodel.QMM_OCL.impl.IteratorImpl <em>Iterator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QualityMetamodel.QMM_OCL.impl.IteratorImpl
	 * @see QualityMetamodel.QMM_OCL.impl.QMM_OCLPackageImpl#getIterator()
	 * @generated
	 */
	int ITERATOR = 55;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATOR__LINE = VARIABLE_DECLARATION__LINE;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATOR__COLUMN = VARIABLE_DECLARATION__COLUMN;

	/**
	 * The feature id for the '<em><b>Char Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATOR__CHAR_START = VARIABLE_DECLARATION__CHAR_START;

	/**
	 * The feature id for the '<em><b>Char End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATOR__CHAR_END = VARIABLE_DECLARATION__CHAR_END;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATOR__VAR_NAME = VARIABLE_DECLARATION__VAR_NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATOR__TYPE = VARIABLE_DECLARATION__TYPE;

	/**
	 * The feature id for the '<em><b>Variable Exp</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATOR__VARIABLE_EXP = VARIABLE_DECLARATION__VARIABLE_EXP;

	/**
	 * The feature id for the '<em><b>Loop Expr</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATOR__LOOP_EXPR = VARIABLE_DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Iterator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATOR_FEATURE_COUNT = VARIABLE_DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Iterator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATOR_OPERATION_COUNT = VARIABLE_DECLARATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link QualityMetamodel.QMM_OCL.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QualityMetamodel.QMM_OCL.impl.ParameterImpl
	 * @see QualityMetamodel.QMM_OCL.impl.QMM_OCLPackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 56;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__LINE = VARIABLE_DECLARATION__LINE;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__COLUMN = VARIABLE_DECLARATION__COLUMN;

	/**
	 * The feature id for the '<em><b>Char Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__CHAR_START = VARIABLE_DECLARATION__CHAR_START;

	/**
	 * The feature id for the '<em><b>Char End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__CHAR_END = VARIABLE_DECLARATION__CHAR_END;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__VAR_NAME = VARIABLE_DECLARATION__VAR_NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__TYPE = VARIABLE_DECLARATION__TYPE;

	/**
	 * The feature id for the '<em><b>Variable Exp</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__VARIABLE_EXP = VARIABLE_DECLARATION__VARIABLE_EXP;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__OPERATION = VARIABLE_DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = VARIABLE_DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_OPERATION_COUNT = VARIABLE_DECLARATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link QualityMetamodel.QMM_OCL.impl.OclTypeImpl <em>Ocl Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QualityMetamodel.QMM_OCL.impl.OclTypeImpl
	 * @see QualityMetamodel.QMM_OCL.impl.QMM_OCLPackageImpl#getOclType()
	 * @generated
	 */
	int OCL_TYPE = 58;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_TYPE__LINE = LOCATED_ELEMENT__LINE;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_TYPE__COLUMN = LOCATED_ELEMENT__COLUMN;

	/**
	 * The feature id for the '<em><b>Char Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_TYPE__CHAR_START = LOCATED_ELEMENT__CHAR_START;

	/**
	 * The feature id for the '<em><b>Char End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_TYPE__CHAR_END = LOCATED_ELEMENT__CHAR_END;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_TYPE__NAME = LOCATED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Definitions</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_TYPE__DEFINITIONS = LOCATED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Ocl Expression</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_TYPE__OCL_EXPRESSION = LOCATED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_TYPE__OPERATION = LOCATED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Map Type2</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_TYPE__MAP_TYPE2 = LOCATED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_TYPE__ATTRIBUTE = LOCATED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Map Type</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_TYPE__MAP_TYPE = LOCATED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Collection Types</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_TYPE__COLLECTION_TYPES = LOCATED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Tuple Type Attribute</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_TYPE__TUPLE_TYPE_ATTRIBUTE = LOCATED_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Variable Declaration</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_TYPE__VARIABLE_DECLARATION = LOCATED_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Lambda Return Type</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_TYPE__LAMBDA_RETURN_TYPE = LOCATED_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Lambda Arg Type</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_TYPE__LAMBDA_ARG_TYPE = LOCATED_ELEMENT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Static Property Call</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_TYPE__STATIC_PROPERTY_CALL = LOCATED_ELEMENT_FEATURE_COUNT + 12;

	/**
	 * The number of structural features of the '<em>Ocl Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_TYPE_FEATURE_COUNT = LOCATED_ELEMENT_FEATURE_COUNT + 13;

	/**
	 * The number of operations of the '<em>Ocl Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_TYPE_OPERATION_COUNT = LOCATED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link QualityMetamodel.QMM_OCL.impl.CollectionTypeImpl <em>Collection Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QualityMetamodel.QMM_OCL.impl.CollectionTypeImpl
	 * @see QualityMetamodel.QMM_OCL.impl.QMM_OCLPackageImpl#getCollectionType()
	 * @generated
	 */
	int COLLECTION_TYPE = 57;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_TYPE__LINE = OCL_TYPE__LINE;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_TYPE__COLUMN = OCL_TYPE__COLUMN;

	/**
	 * The feature id for the '<em><b>Char Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_TYPE__CHAR_START = OCL_TYPE__CHAR_START;

	/**
	 * The feature id for the '<em><b>Char End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_TYPE__CHAR_END = OCL_TYPE__CHAR_END;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_TYPE__NAME = OCL_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Definitions</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_TYPE__DEFINITIONS = OCL_TYPE__DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Ocl Expression</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_TYPE__OCL_EXPRESSION = OCL_TYPE__OCL_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_TYPE__OPERATION = OCL_TYPE__OPERATION;

	/**
	 * The feature id for the '<em><b>Map Type2</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_TYPE__MAP_TYPE2 = OCL_TYPE__MAP_TYPE2;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_TYPE__ATTRIBUTE = OCL_TYPE__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Map Type</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_TYPE__MAP_TYPE = OCL_TYPE__MAP_TYPE;

	/**
	 * The feature id for the '<em><b>Collection Types</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_TYPE__COLLECTION_TYPES = OCL_TYPE__COLLECTION_TYPES;

	/**
	 * The feature id for the '<em><b>Tuple Type Attribute</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_TYPE__TUPLE_TYPE_ATTRIBUTE = OCL_TYPE__TUPLE_TYPE_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Variable Declaration</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_TYPE__VARIABLE_DECLARATION = OCL_TYPE__VARIABLE_DECLARATION;

	/**
	 * The feature id for the '<em><b>Lambda Return Type</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_TYPE__LAMBDA_RETURN_TYPE = OCL_TYPE__LAMBDA_RETURN_TYPE;

	/**
	 * The feature id for the '<em><b>Lambda Arg Type</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_TYPE__LAMBDA_ARG_TYPE = OCL_TYPE__LAMBDA_ARG_TYPE;

	/**
	 * The feature id for the '<em><b>Static Property Call</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_TYPE__STATIC_PROPERTY_CALL = OCL_TYPE__STATIC_PROPERTY_CALL;

	/**
	 * The feature id for the '<em><b>Element Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_TYPE__ELEMENT_TYPE = OCL_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Collection Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_TYPE_FEATURE_COUNT = OCL_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Collection Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_TYPE_OPERATION_COUNT = OCL_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link QualityMetamodel.QMM_OCL.impl.OclModelElementExpImpl <em>Ocl Model Element Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QualityMetamodel.QMM_OCL.impl.OclModelElementExpImpl
	 * @see QualityMetamodel.QMM_OCL.impl.QMM_OCLPackageImpl#getOclModelElementExp()
	 * @generated
	 */
	int OCL_MODEL_ELEMENT_EXP = 59;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_MODEL_ELEMENT_EXP__LINE = OCL_EXPRESSION__LINE;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_MODEL_ELEMENT_EXP__COLUMN = OCL_EXPRESSION__COLUMN;

	/**
	 * The feature id for the '<em><b>Char Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_MODEL_ELEMENT_EXP__CHAR_START = OCL_EXPRESSION__CHAR_START;

	/**
	 * The feature id for the '<em><b>Char End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_MODEL_ELEMENT_EXP__CHAR_END = OCL_EXPRESSION__CHAR_END;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_MODEL_ELEMENT_EXP__TYPE = OCL_EXPRESSION__TYPE;

	/**
	 * The feature id for the '<em><b>If Exp3</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_MODEL_ELEMENT_EXP__IF_EXP3 = OCL_EXPRESSION__IF_EXP3;

	/**
	 * The feature id for the '<em><b>Applied Property</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_MODEL_ELEMENT_EXP__APPLIED_PROPERTY = OCL_EXPRESSION__APPLIED_PROPERTY;

	/**
	 * The feature id for the '<em><b>Let Exp</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_MODEL_ELEMENT_EXP__LET_EXP = OCL_EXPRESSION__LET_EXP;

	/**
	 * The feature id for the '<em><b>Loop Exp</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_MODEL_ELEMENT_EXP__LOOP_EXP = OCL_EXPRESSION__LOOP_EXP;

	/**
	 * The feature id for the '<em><b>Parent Operation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_MODEL_ELEMENT_EXP__PARENT_OPERATION = OCL_EXPRESSION__PARENT_OPERATION;

	/**
	 * The feature id for the '<em><b>Initialized Variable</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_MODEL_ELEMENT_EXP__INITIALIZED_VARIABLE = OCL_EXPRESSION__INITIALIZED_VARIABLE;

	/**
	 * The feature id for the '<em><b>If Exp2</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_MODEL_ELEMENT_EXP__IF_EXP2 = OCL_EXPRESSION__IF_EXP2;

	/**
	 * The feature id for the '<em><b>Owning Operation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_MODEL_ELEMENT_EXP__OWNING_OPERATION = OCL_EXPRESSION__OWNING_OPERATION;

	/**
	 * The feature id for the '<em><b>If Exp1</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_MODEL_ELEMENT_EXP__IF_EXP1 = OCL_EXPRESSION__IF_EXP1;

	/**
	 * The feature id for the '<em><b>Owning Attribute</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_MODEL_ELEMENT_EXP__OWNING_ATTRIBUTE = OCL_EXPRESSION__OWNING_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Applied Operator</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_MODEL_ELEMENT_EXP__APPLIED_OPERATOR = OCL_EXPRESSION__APPLIED_OPERATOR;

	/**
	 * The feature id for the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_MODEL_ELEMENT_EXP__MODEL = OCL_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_MODEL_ELEMENT_EXP__NAME = OCL_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Ocl Model Element Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_MODEL_ELEMENT_EXP_FEATURE_COUNT = OCL_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Ocl Model Element Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_MODEL_ELEMENT_EXP_OPERATION_COUNT = OCL_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link QualityMetamodel.QMM_OCL.impl.PrimitiveImpl <em>Primitive</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QualityMetamodel.QMM_OCL.impl.PrimitiveImpl
	 * @see QualityMetamodel.QMM_OCL.impl.QMM_OCLPackageImpl#getPrimitive()
	 * @generated
	 */
	int PRIMITIVE = 60;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE__LINE = OCL_TYPE__LINE;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE__COLUMN = OCL_TYPE__COLUMN;

	/**
	 * The feature id for the '<em><b>Char Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE__CHAR_START = OCL_TYPE__CHAR_START;

	/**
	 * The feature id for the '<em><b>Char End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE__CHAR_END = OCL_TYPE__CHAR_END;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE__NAME = OCL_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Definitions</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE__DEFINITIONS = OCL_TYPE__DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Ocl Expression</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE__OCL_EXPRESSION = OCL_TYPE__OCL_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE__OPERATION = OCL_TYPE__OPERATION;

	/**
	 * The feature id for the '<em><b>Map Type2</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE__MAP_TYPE2 = OCL_TYPE__MAP_TYPE2;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE__ATTRIBUTE = OCL_TYPE__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Map Type</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE__MAP_TYPE = OCL_TYPE__MAP_TYPE;

	/**
	 * The feature id for the '<em><b>Collection Types</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE__COLLECTION_TYPES = OCL_TYPE__COLLECTION_TYPES;

	/**
	 * The feature id for the '<em><b>Tuple Type Attribute</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE__TUPLE_TYPE_ATTRIBUTE = OCL_TYPE__TUPLE_TYPE_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Variable Declaration</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE__VARIABLE_DECLARATION = OCL_TYPE__VARIABLE_DECLARATION;

	/**
	 * The feature id for the '<em><b>Lambda Return Type</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE__LAMBDA_RETURN_TYPE = OCL_TYPE__LAMBDA_RETURN_TYPE;

	/**
	 * The feature id for the '<em><b>Lambda Arg Type</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE__LAMBDA_ARG_TYPE = OCL_TYPE__LAMBDA_ARG_TYPE;

	/**
	 * The feature id for the '<em><b>Static Property Call</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE__STATIC_PROPERTY_CALL = OCL_TYPE__STATIC_PROPERTY_CALL;

	/**
	 * The number of structural features of the '<em>Primitive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_FEATURE_COUNT = OCL_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Primitive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_OPERATION_COUNT = OCL_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link QualityMetamodel.QMM_OCL.impl.StringTypeImpl <em>String Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QualityMetamodel.QMM_OCL.impl.StringTypeImpl
	 * @see QualityMetamodel.QMM_OCL.impl.QMM_OCLPackageImpl#getStringType()
	 * @generated
	 */
	int STRING_TYPE = 61;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TYPE__LINE = PRIMITIVE__LINE;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TYPE__COLUMN = PRIMITIVE__COLUMN;

	/**
	 * The feature id for the '<em><b>Char Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TYPE__CHAR_START = PRIMITIVE__CHAR_START;

	/**
	 * The feature id for the '<em><b>Char End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TYPE__CHAR_END = PRIMITIVE__CHAR_END;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TYPE__NAME = PRIMITIVE__NAME;

	/**
	 * The feature id for the '<em><b>Definitions</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TYPE__DEFINITIONS = PRIMITIVE__DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Ocl Expression</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TYPE__OCL_EXPRESSION = PRIMITIVE__OCL_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TYPE__OPERATION = PRIMITIVE__OPERATION;

	/**
	 * The feature id for the '<em><b>Map Type2</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TYPE__MAP_TYPE2 = PRIMITIVE__MAP_TYPE2;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TYPE__ATTRIBUTE = PRIMITIVE__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Map Type</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TYPE__MAP_TYPE = PRIMITIVE__MAP_TYPE;

	/**
	 * The feature id for the '<em><b>Collection Types</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TYPE__COLLECTION_TYPES = PRIMITIVE__COLLECTION_TYPES;

	/**
	 * The feature id for the '<em><b>Tuple Type Attribute</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TYPE__TUPLE_TYPE_ATTRIBUTE = PRIMITIVE__TUPLE_TYPE_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Variable Declaration</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TYPE__VARIABLE_DECLARATION = PRIMITIVE__VARIABLE_DECLARATION;

	/**
	 * The feature id for the '<em><b>Lambda Return Type</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TYPE__LAMBDA_RETURN_TYPE = PRIMITIVE__LAMBDA_RETURN_TYPE;

	/**
	 * The feature id for the '<em><b>Lambda Arg Type</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TYPE__LAMBDA_ARG_TYPE = PRIMITIVE__LAMBDA_ARG_TYPE;

	/**
	 * The feature id for the '<em><b>Static Property Call</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TYPE__STATIC_PROPERTY_CALL = PRIMITIVE__STATIC_PROPERTY_CALL;

	/**
	 * The number of structural features of the '<em>String Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TYPE_FEATURE_COUNT = PRIMITIVE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>String Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TYPE_OPERATION_COUNT = PRIMITIVE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link QualityMetamodel.QMM_OCL.impl.BooleanTypeImpl <em>Boolean Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QualityMetamodel.QMM_OCL.impl.BooleanTypeImpl
	 * @see QualityMetamodel.QMM_OCL.impl.QMM_OCLPackageImpl#getBooleanType()
	 * @generated
	 */
	int BOOLEAN_TYPE = 62;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_TYPE__LINE = PRIMITIVE__LINE;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_TYPE__COLUMN = PRIMITIVE__COLUMN;

	/**
	 * The feature id for the '<em><b>Char Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_TYPE__CHAR_START = PRIMITIVE__CHAR_START;

	/**
	 * The feature id for the '<em><b>Char End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_TYPE__CHAR_END = PRIMITIVE__CHAR_END;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_TYPE__NAME = PRIMITIVE__NAME;

	/**
	 * The feature id for the '<em><b>Definitions</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_TYPE__DEFINITIONS = PRIMITIVE__DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Ocl Expression</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_TYPE__OCL_EXPRESSION = PRIMITIVE__OCL_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_TYPE__OPERATION = PRIMITIVE__OPERATION;

	/**
	 * The feature id for the '<em><b>Map Type2</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_TYPE__MAP_TYPE2 = PRIMITIVE__MAP_TYPE2;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_TYPE__ATTRIBUTE = PRIMITIVE__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Map Type</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_TYPE__MAP_TYPE = PRIMITIVE__MAP_TYPE;

	/**
	 * The feature id for the '<em><b>Collection Types</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_TYPE__COLLECTION_TYPES = PRIMITIVE__COLLECTION_TYPES;

	/**
	 * The feature id for the '<em><b>Tuple Type Attribute</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_TYPE__TUPLE_TYPE_ATTRIBUTE = PRIMITIVE__TUPLE_TYPE_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Variable Declaration</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_TYPE__VARIABLE_DECLARATION = PRIMITIVE__VARIABLE_DECLARATION;

	/**
	 * The feature id for the '<em><b>Lambda Return Type</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_TYPE__LAMBDA_RETURN_TYPE = PRIMITIVE__LAMBDA_RETURN_TYPE;

	/**
	 * The feature id for the '<em><b>Lambda Arg Type</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_TYPE__LAMBDA_ARG_TYPE = PRIMITIVE__LAMBDA_ARG_TYPE;

	/**
	 * The feature id for the '<em><b>Static Property Call</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_TYPE__STATIC_PROPERTY_CALL = PRIMITIVE__STATIC_PROPERTY_CALL;

	/**
	 * The number of structural features of the '<em>Boolean Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_TYPE_FEATURE_COUNT = PRIMITIVE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Boolean Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_TYPE_OPERATION_COUNT = PRIMITIVE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link QualityMetamodel.QMM_OCL.impl.NumericTypeImpl <em>Numeric Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QualityMetamodel.QMM_OCL.impl.NumericTypeImpl
	 * @see QualityMetamodel.QMM_OCL.impl.QMM_OCLPackageImpl#getNumericType()
	 * @generated
	 */
	int NUMERIC_TYPE = 63;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_TYPE__LINE = PRIMITIVE__LINE;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_TYPE__COLUMN = PRIMITIVE__COLUMN;

	/**
	 * The feature id for the '<em><b>Char Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_TYPE__CHAR_START = PRIMITIVE__CHAR_START;

	/**
	 * The feature id for the '<em><b>Char End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_TYPE__CHAR_END = PRIMITIVE__CHAR_END;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_TYPE__NAME = PRIMITIVE__NAME;

	/**
	 * The feature id for the '<em><b>Definitions</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_TYPE__DEFINITIONS = PRIMITIVE__DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Ocl Expression</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_TYPE__OCL_EXPRESSION = PRIMITIVE__OCL_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_TYPE__OPERATION = PRIMITIVE__OPERATION;

	/**
	 * The feature id for the '<em><b>Map Type2</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_TYPE__MAP_TYPE2 = PRIMITIVE__MAP_TYPE2;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_TYPE__ATTRIBUTE = PRIMITIVE__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Map Type</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_TYPE__MAP_TYPE = PRIMITIVE__MAP_TYPE;

	/**
	 * The feature id for the '<em><b>Collection Types</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_TYPE__COLLECTION_TYPES = PRIMITIVE__COLLECTION_TYPES;

	/**
	 * The feature id for the '<em><b>Tuple Type Attribute</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_TYPE__TUPLE_TYPE_ATTRIBUTE = PRIMITIVE__TUPLE_TYPE_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Variable Declaration</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_TYPE__VARIABLE_DECLARATION = PRIMITIVE__VARIABLE_DECLARATION;

	/**
	 * The feature id for the '<em><b>Lambda Return Type</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_TYPE__LAMBDA_RETURN_TYPE = PRIMITIVE__LAMBDA_RETURN_TYPE;

	/**
	 * The feature id for the '<em><b>Lambda Arg Type</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_TYPE__LAMBDA_ARG_TYPE = PRIMITIVE__LAMBDA_ARG_TYPE;

	/**
	 * The feature id for the '<em><b>Static Property Call</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_TYPE__STATIC_PROPERTY_CALL = PRIMITIVE__STATIC_PROPERTY_CALL;

	/**
	 * The number of structural features of the '<em>Numeric Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_TYPE_FEATURE_COUNT = PRIMITIVE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Numeric Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_TYPE_OPERATION_COUNT = PRIMITIVE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link QualityMetamodel.QMM_OCL.impl.IntegerTypeImpl <em>Integer Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QualityMetamodel.QMM_OCL.impl.IntegerTypeImpl
	 * @see QualityMetamodel.QMM_OCL.impl.QMM_OCLPackageImpl#getIntegerType()
	 * @generated
	 */
	int INTEGER_TYPE = 64;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_TYPE__LINE = NUMERIC_TYPE__LINE;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_TYPE__COLUMN = NUMERIC_TYPE__COLUMN;

	/**
	 * The feature id for the '<em><b>Char Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_TYPE__CHAR_START = NUMERIC_TYPE__CHAR_START;

	/**
	 * The feature id for the '<em><b>Char End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_TYPE__CHAR_END = NUMERIC_TYPE__CHAR_END;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_TYPE__NAME = NUMERIC_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Definitions</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_TYPE__DEFINITIONS = NUMERIC_TYPE__DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Ocl Expression</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_TYPE__OCL_EXPRESSION = NUMERIC_TYPE__OCL_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_TYPE__OPERATION = NUMERIC_TYPE__OPERATION;

	/**
	 * The feature id for the '<em><b>Map Type2</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_TYPE__MAP_TYPE2 = NUMERIC_TYPE__MAP_TYPE2;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_TYPE__ATTRIBUTE = NUMERIC_TYPE__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Map Type</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_TYPE__MAP_TYPE = NUMERIC_TYPE__MAP_TYPE;

	/**
	 * The feature id for the '<em><b>Collection Types</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_TYPE__COLLECTION_TYPES = NUMERIC_TYPE__COLLECTION_TYPES;

	/**
	 * The feature id for the '<em><b>Tuple Type Attribute</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_TYPE__TUPLE_TYPE_ATTRIBUTE = NUMERIC_TYPE__TUPLE_TYPE_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Variable Declaration</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_TYPE__VARIABLE_DECLARATION = NUMERIC_TYPE__VARIABLE_DECLARATION;

	/**
	 * The feature id for the '<em><b>Lambda Return Type</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_TYPE__LAMBDA_RETURN_TYPE = NUMERIC_TYPE__LAMBDA_RETURN_TYPE;

	/**
	 * The feature id for the '<em><b>Lambda Arg Type</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_TYPE__LAMBDA_ARG_TYPE = NUMERIC_TYPE__LAMBDA_ARG_TYPE;

	/**
	 * The feature id for the '<em><b>Static Property Call</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_TYPE__STATIC_PROPERTY_CALL = NUMERIC_TYPE__STATIC_PROPERTY_CALL;

	/**
	 * The number of structural features of the '<em>Integer Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_TYPE_FEATURE_COUNT = NUMERIC_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Integer Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_TYPE_OPERATION_COUNT = NUMERIC_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link QualityMetamodel.QMM_OCL.impl.RealTypeImpl <em>Real Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QualityMetamodel.QMM_OCL.impl.RealTypeImpl
	 * @see QualityMetamodel.QMM_OCL.impl.QMM_OCLPackageImpl#getRealType()
	 * @generated
	 */
	int REAL_TYPE = 65;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_TYPE__LINE = NUMERIC_TYPE__LINE;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_TYPE__COLUMN = NUMERIC_TYPE__COLUMN;

	/**
	 * The feature id for the '<em><b>Char Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_TYPE__CHAR_START = NUMERIC_TYPE__CHAR_START;

	/**
	 * The feature id for the '<em><b>Char End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_TYPE__CHAR_END = NUMERIC_TYPE__CHAR_END;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_TYPE__NAME = NUMERIC_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Definitions</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_TYPE__DEFINITIONS = NUMERIC_TYPE__DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Ocl Expression</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_TYPE__OCL_EXPRESSION = NUMERIC_TYPE__OCL_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_TYPE__OPERATION = NUMERIC_TYPE__OPERATION;

	/**
	 * The feature id for the '<em><b>Map Type2</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_TYPE__MAP_TYPE2 = NUMERIC_TYPE__MAP_TYPE2;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_TYPE__ATTRIBUTE = NUMERIC_TYPE__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Map Type</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_TYPE__MAP_TYPE = NUMERIC_TYPE__MAP_TYPE;

	/**
	 * The feature id for the '<em><b>Collection Types</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_TYPE__COLLECTION_TYPES = NUMERIC_TYPE__COLLECTION_TYPES;

	/**
	 * The feature id for the '<em><b>Tuple Type Attribute</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_TYPE__TUPLE_TYPE_ATTRIBUTE = NUMERIC_TYPE__TUPLE_TYPE_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Variable Declaration</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_TYPE__VARIABLE_DECLARATION = NUMERIC_TYPE__VARIABLE_DECLARATION;

	/**
	 * The feature id for the '<em><b>Lambda Return Type</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_TYPE__LAMBDA_RETURN_TYPE = NUMERIC_TYPE__LAMBDA_RETURN_TYPE;

	/**
	 * The feature id for the '<em><b>Lambda Arg Type</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_TYPE__LAMBDA_ARG_TYPE = NUMERIC_TYPE__LAMBDA_ARG_TYPE;

	/**
	 * The feature id for the '<em><b>Static Property Call</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_TYPE__STATIC_PROPERTY_CALL = NUMERIC_TYPE__STATIC_PROPERTY_CALL;

	/**
	 * The number of structural features of the '<em>Real Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_TYPE_FEATURE_COUNT = NUMERIC_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Real Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_TYPE_OPERATION_COUNT = NUMERIC_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link QualityMetamodel.QMM_OCL.impl.BagTypeImpl <em>Bag Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QualityMetamodel.QMM_OCL.impl.BagTypeImpl
	 * @see QualityMetamodel.QMM_OCL.impl.QMM_OCLPackageImpl#getBagType()
	 * @generated
	 */
	int BAG_TYPE = 66;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG_TYPE__LINE = COLLECTION_TYPE__LINE;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG_TYPE__COLUMN = COLLECTION_TYPE__COLUMN;

	/**
	 * The feature id for the '<em><b>Char Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG_TYPE__CHAR_START = COLLECTION_TYPE__CHAR_START;

	/**
	 * The feature id for the '<em><b>Char End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG_TYPE__CHAR_END = COLLECTION_TYPE__CHAR_END;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG_TYPE__NAME = COLLECTION_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Definitions</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG_TYPE__DEFINITIONS = COLLECTION_TYPE__DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Ocl Expression</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG_TYPE__OCL_EXPRESSION = COLLECTION_TYPE__OCL_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG_TYPE__OPERATION = COLLECTION_TYPE__OPERATION;

	/**
	 * The feature id for the '<em><b>Map Type2</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG_TYPE__MAP_TYPE2 = COLLECTION_TYPE__MAP_TYPE2;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG_TYPE__ATTRIBUTE = COLLECTION_TYPE__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Map Type</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG_TYPE__MAP_TYPE = COLLECTION_TYPE__MAP_TYPE;

	/**
	 * The feature id for the '<em><b>Collection Types</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG_TYPE__COLLECTION_TYPES = COLLECTION_TYPE__COLLECTION_TYPES;

	/**
	 * The feature id for the '<em><b>Tuple Type Attribute</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG_TYPE__TUPLE_TYPE_ATTRIBUTE = COLLECTION_TYPE__TUPLE_TYPE_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Variable Declaration</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG_TYPE__VARIABLE_DECLARATION = COLLECTION_TYPE__VARIABLE_DECLARATION;

	/**
	 * The feature id for the '<em><b>Lambda Return Type</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG_TYPE__LAMBDA_RETURN_TYPE = COLLECTION_TYPE__LAMBDA_RETURN_TYPE;

	/**
	 * The feature id for the '<em><b>Lambda Arg Type</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG_TYPE__LAMBDA_ARG_TYPE = COLLECTION_TYPE__LAMBDA_ARG_TYPE;

	/**
	 * The feature id for the '<em><b>Static Property Call</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG_TYPE__STATIC_PROPERTY_CALL = COLLECTION_TYPE__STATIC_PROPERTY_CALL;

	/**
	 * The feature id for the '<em><b>Element Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG_TYPE__ELEMENT_TYPE = COLLECTION_TYPE__ELEMENT_TYPE;

	/**
	 * The number of structural features of the '<em>Bag Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG_TYPE_FEATURE_COUNT = COLLECTION_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Bag Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG_TYPE_OPERATION_COUNT = COLLECTION_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link QualityMetamodel.QMM_OCL.impl.OrderedSetTypeImpl <em>Ordered Set Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QualityMetamodel.QMM_OCL.impl.OrderedSetTypeImpl
	 * @see QualityMetamodel.QMM_OCL.impl.QMM_OCLPackageImpl#getOrderedSetType()
	 * @generated
	 */
	int ORDERED_SET_TYPE = 67;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_SET_TYPE__LINE = COLLECTION_TYPE__LINE;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_SET_TYPE__COLUMN = COLLECTION_TYPE__COLUMN;

	/**
	 * The feature id for the '<em><b>Char Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_SET_TYPE__CHAR_START = COLLECTION_TYPE__CHAR_START;

	/**
	 * The feature id for the '<em><b>Char End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_SET_TYPE__CHAR_END = COLLECTION_TYPE__CHAR_END;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_SET_TYPE__NAME = COLLECTION_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Definitions</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_SET_TYPE__DEFINITIONS = COLLECTION_TYPE__DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Ocl Expression</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_SET_TYPE__OCL_EXPRESSION = COLLECTION_TYPE__OCL_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_SET_TYPE__OPERATION = COLLECTION_TYPE__OPERATION;

	/**
	 * The feature id for the '<em><b>Map Type2</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_SET_TYPE__MAP_TYPE2 = COLLECTION_TYPE__MAP_TYPE2;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_SET_TYPE__ATTRIBUTE = COLLECTION_TYPE__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Map Type</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_SET_TYPE__MAP_TYPE = COLLECTION_TYPE__MAP_TYPE;

	/**
	 * The feature id for the '<em><b>Collection Types</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_SET_TYPE__COLLECTION_TYPES = COLLECTION_TYPE__COLLECTION_TYPES;

	/**
	 * The feature id for the '<em><b>Tuple Type Attribute</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_SET_TYPE__TUPLE_TYPE_ATTRIBUTE = COLLECTION_TYPE__TUPLE_TYPE_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Variable Declaration</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_SET_TYPE__VARIABLE_DECLARATION = COLLECTION_TYPE__VARIABLE_DECLARATION;

	/**
	 * The feature id for the '<em><b>Lambda Return Type</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_SET_TYPE__LAMBDA_RETURN_TYPE = COLLECTION_TYPE__LAMBDA_RETURN_TYPE;

	/**
	 * The feature id for the '<em><b>Lambda Arg Type</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_SET_TYPE__LAMBDA_ARG_TYPE = COLLECTION_TYPE__LAMBDA_ARG_TYPE;

	/**
	 * The feature id for the '<em><b>Static Property Call</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_SET_TYPE__STATIC_PROPERTY_CALL = COLLECTION_TYPE__STATIC_PROPERTY_CALL;

	/**
	 * The feature id for the '<em><b>Element Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_SET_TYPE__ELEMENT_TYPE = COLLECTION_TYPE__ELEMENT_TYPE;

	/**
	 * The number of structural features of the '<em>Ordered Set Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_SET_TYPE_FEATURE_COUNT = COLLECTION_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Ordered Set Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_SET_TYPE_OPERATION_COUNT = COLLECTION_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link QualityMetamodel.QMM_OCL.impl.SequenceTypeImpl <em>Sequence Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QualityMetamodel.QMM_OCL.impl.SequenceTypeImpl
	 * @see QualityMetamodel.QMM_OCL.impl.QMM_OCLPackageImpl#getSequenceType()
	 * @generated
	 */
	int SEQUENCE_TYPE = 68;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_TYPE__LINE = COLLECTION_TYPE__LINE;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_TYPE__COLUMN = COLLECTION_TYPE__COLUMN;

	/**
	 * The feature id for the '<em><b>Char Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_TYPE__CHAR_START = COLLECTION_TYPE__CHAR_START;

	/**
	 * The feature id for the '<em><b>Char End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_TYPE__CHAR_END = COLLECTION_TYPE__CHAR_END;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_TYPE__NAME = COLLECTION_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Definitions</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_TYPE__DEFINITIONS = COLLECTION_TYPE__DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Ocl Expression</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_TYPE__OCL_EXPRESSION = COLLECTION_TYPE__OCL_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_TYPE__OPERATION = COLLECTION_TYPE__OPERATION;

	/**
	 * The feature id for the '<em><b>Map Type2</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_TYPE__MAP_TYPE2 = COLLECTION_TYPE__MAP_TYPE2;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_TYPE__ATTRIBUTE = COLLECTION_TYPE__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Map Type</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_TYPE__MAP_TYPE = COLLECTION_TYPE__MAP_TYPE;

	/**
	 * The feature id for the '<em><b>Collection Types</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_TYPE__COLLECTION_TYPES = COLLECTION_TYPE__COLLECTION_TYPES;

	/**
	 * The feature id for the '<em><b>Tuple Type Attribute</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_TYPE__TUPLE_TYPE_ATTRIBUTE = COLLECTION_TYPE__TUPLE_TYPE_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Variable Declaration</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_TYPE__VARIABLE_DECLARATION = COLLECTION_TYPE__VARIABLE_DECLARATION;

	/**
	 * The feature id for the '<em><b>Lambda Return Type</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_TYPE__LAMBDA_RETURN_TYPE = COLLECTION_TYPE__LAMBDA_RETURN_TYPE;

	/**
	 * The feature id for the '<em><b>Lambda Arg Type</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_TYPE__LAMBDA_ARG_TYPE = COLLECTION_TYPE__LAMBDA_ARG_TYPE;

	/**
	 * The feature id for the '<em><b>Static Property Call</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_TYPE__STATIC_PROPERTY_CALL = COLLECTION_TYPE__STATIC_PROPERTY_CALL;

	/**
	 * The feature id for the '<em><b>Element Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_TYPE__ELEMENT_TYPE = COLLECTION_TYPE__ELEMENT_TYPE;

	/**
	 * The number of structural features of the '<em>Sequence Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_TYPE_FEATURE_COUNT = COLLECTION_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Sequence Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_TYPE_OPERATION_COUNT = COLLECTION_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link QualityMetamodel.QMM_OCL.impl.SetTypeImpl <em>Set Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QualityMetamodel.QMM_OCL.impl.SetTypeImpl
	 * @see QualityMetamodel.QMM_OCL.impl.QMM_OCLPackageImpl#getSetType()
	 * @generated
	 */
	int SET_TYPE = 69;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_TYPE__LINE = COLLECTION_TYPE__LINE;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_TYPE__COLUMN = COLLECTION_TYPE__COLUMN;

	/**
	 * The feature id for the '<em><b>Char Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_TYPE__CHAR_START = COLLECTION_TYPE__CHAR_START;

	/**
	 * The feature id for the '<em><b>Char End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_TYPE__CHAR_END = COLLECTION_TYPE__CHAR_END;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_TYPE__NAME = COLLECTION_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Definitions</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_TYPE__DEFINITIONS = COLLECTION_TYPE__DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Ocl Expression</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_TYPE__OCL_EXPRESSION = COLLECTION_TYPE__OCL_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_TYPE__OPERATION = COLLECTION_TYPE__OPERATION;

	/**
	 * The feature id for the '<em><b>Map Type2</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_TYPE__MAP_TYPE2 = COLLECTION_TYPE__MAP_TYPE2;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_TYPE__ATTRIBUTE = COLLECTION_TYPE__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Map Type</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_TYPE__MAP_TYPE = COLLECTION_TYPE__MAP_TYPE;

	/**
	 * The feature id for the '<em><b>Collection Types</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_TYPE__COLLECTION_TYPES = COLLECTION_TYPE__COLLECTION_TYPES;

	/**
	 * The feature id for the '<em><b>Tuple Type Attribute</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_TYPE__TUPLE_TYPE_ATTRIBUTE = COLLECTION_TYPE__TUPLE_TYPE_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Variable Declaration</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_TYPE__VARIABLE_DECLARATION = COLLECTION_TYPE__VARIABLE_DECLARATION;

	/**
	 * The feature id for the '<em><b>Lambda Return Type</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_TYPE__LAMBDA_RETURN_TYPE = COLLECTION_TYPE__LAMBDA_RETURN_TYPE;

	/**
	 * The feature id for the '<em><b>Lambda Arg Type</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_TYPE__LAMBDA_ARG_TYPE = COLLECTION_TYPE__LAMBDA_ARG_TYPE;

	/**
	 * The feature id for the '<em><b>Static Property Call</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_TYPE__STATIC_PROPERTY_CALL = COLLECTION_TYPE__STATIC_PROPERTY_CALL;

	/**
	 * The feature id for the '<em><b>Element Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_TYPE__ELEMENT_TYPE = COLLECTION_TYPE__ELEMENT_TYPE;

	/**
	 * The number of structural features of the '<em>Set Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_TYPE_FEATURE_COUNT = COLLECTION_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Set Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_TYPE_OPERATION_COUNT = COLLECTION_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link QualityMetamodel.QMM_OCL.impl.OclAnyTypeImpl <em>Ocl Any Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QualityMetamodel.QMM_OCL.impl.OclAnyTypeImpl
	 * @see QualityMetamodel.QMM_OCL.impl.QMM_OCLPackageImpl#getOclAnyType()
	 * @generated
	 */
	int OCL_ANY_TYPE = 70;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_ANY_TYPE__LINE = OCL_TYPE__LINE;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_ANY_TYPE__COLUMN = OCL_TYPE__COLUMN;

	/**
	 * The feature id for the '<em><b>Char Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_ANY_TYPE__CHAR_START = OCL_TYPE__CHAR_START;

	/**
	 * The feature id for the '<em><b>Char End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_ANY_TYPE__CHAR_END = OCL_TYPE__CHAR_END;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_ANY_TYPE__NAME = OCL_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Definitions</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_ANY_TYPE__DEFINITIONS = OCL_TYPE__DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Ocl Expression</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_ANY_TYPE__OCL_EXPRESSION = OCL_TYPE__OCL_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_ANY_TYPE__OPERATION = OCL_TYPE__OPERATION;

	/**
	 * The feature id for the '<em><b>Map Type2</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_ANY_TYPE__MAP_TYPE2 = OCL_TYPE__MAP_TYPE2;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_ANY_TYPE__ATTRIBUTE = OCL_TYPE__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Map Type</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_ANY_TYPE__MAP_TYPE = OCL_TYPE__MAP_TYPE;

	/**
	 * The feature id for the '<em><b>Collection Types</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_ANY_TYPE__COLLECTION_TYPES = OCL_TYPE__COLLECTION_TYPES;

	/**
	 * The feature id for the '<em><b>Tuple Type Attribute</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_ANY_TYPE__TUPLE_TYPE_ATTRIBUTE = OCL_TYPE__TUPLE_TYPE_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Variable Declaration</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_ANY_TYPE__VARIABLE_DECLARATION = OCL_TYPE__VARIABLE_DECLARATION;

	/**
	 * The feature id for the '<em><b>Lambda Return Type</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_ANY_TYPE__LAMBDA_RETURN_TYPE = OCL_TYPE__LAMBDA_RETURN_TYPE;

	/**
	 * The feature id for the '<em><b>Lambda Arg Type</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_ANY_TYPE__LAMBDA_ARG_TYPE = OCL_TYPE__LAMBDA_ARG_TYPE;

	/**
	 * The feature id for the '<em><b>Static Property Call</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_ANY_TYPE__STATIC_PROPERTY_CALL = OCL_TYPE__STATIC_PROPERTY_CALL;

	/**
	 * The number of structural features of the '<em>Ocl Any Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_ANY_TYPE_FEATURE_COUNT = OCL_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Ocl Any Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_ANY_TYPE_OPERATION_COUNT = OCL_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link QualityMetamodel.QMM_OCL.impl.TupleTypeImpl <em>Tuple Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QualityMetamodel.QMM_OCL.impl.TupleTypeImpl
	 * @see QualityMetamodel.QMM_OCL.impl.QMM_OCLPackageImpl#getTupleType()
	 * @generated
	 */
	int TUPLE_TYPE = 71;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE_TYPE__LINE = OCL_TYPE__LINE;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE_TYPE__COLUMN = OCL_TYPE__COLUMN;

	/**
	 * The feature id for the '<em><b>Char Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE_TYPE__CHAR_START = OCL_TYPE__CHAR_START;

	/**
	 * The feature id for the '<em><b>Char End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE_TYPE__CHAR_END = OCL_TYPE__CHAR_END;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE_TYPE__NAME = OCL_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Definitions</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE_TYPE__DEFINITIONS = OCL_TYPE__DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Ocl Expression</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE_TYPE__OCL_EXPRESSION = OCL_TYPE__OCL_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE_TYPE__OPERATION = OCL_TYPE__OPERATION;

	/**
	 * The feature id for the '<em><b>Map Type2</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE_TYPE__MAP_TYPE2 = OCL_TYPE__MAP_TYPE2;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE_TYPE__ATTRIBUTE = OCL_TYPE__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Map Type</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE_TYPE__MAP_TYPE = OCL_TYPE__MAP_TYPE;

	/**
	 * The feature id for the '<em><b>Collection Types</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE_TYPE__COLLECTION_TYPES = OCL_TYPE__COLLECTION_TYPES;

	/**
	 * The feature id for the '<em><b>Tuple Type Attribute</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE_TYPE__TUPLE_TYPE_ATTRIBUTE = OCL_TYPE__TUPLE_TYPE_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Variable Declaration</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE_TYPE__VARIABLE_DECLARATION = OCL_TYPE__VARIABLE_DECLARATION;

	/**
	 * The feature id for the '<em><b>Lambda Return Type</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE_TYPE__LAMBDA_RETURN_TYPE = OCL_TYPE__LAMBDA_RETURN_TYPE;

	/**
	 * The feature id for the '<em><b>Lambda Arg Type</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE_TYPE__LAMBDA_ARG_TYPE = OCL_TYPE__LAMBDA_ARG_TYPE;

	/**
	 * The feature id for the '<em><b>Static Property Call</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE_TYPE__STATIC_PROPERTY_CALL = OCL_TYPE__STATIC_PROPERTY_CALL;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE_TYPE__ATTRIBUTES = OCL_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Tuple Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE_TYPE_FEATURE_COUNT = OCL_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Tuple Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE_TYPE_OPERATION_COUNT = OCL_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link QualityMetamodel.QMM_OCL.impl.TupleTypeAttributeImpl <em>Tuple Type Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QualityMetamodel.QMM_OCL.impl.TupleTypeAttributeImpl
	 * @see QualityMetamodel.QMM_OCL.impl.QMM_OCLPackageImpl#getTupleTypeAttribute()
	 * @generated
	 */
	int TUPLE_TYPE_ATTRIBUTE = 72;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE_TYPE_ATTRIBUTE__LINE = LOCATED_ELEMENT__LINE;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE_TYPE_ATTRIBUTE__COLUMN = LOCATED_ELEMENT__COLUMN;

	/**
	 * The feature id for the '<em><b>Char Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE_TYPE_ATTRIBUTE__CHAR_START = LOCATED_ELEMENT__CHAR_START;

	/**
	 * The feature id for the '<em><b>Char End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE_TYPE_ATTRIBUTE__CHAR_END = LOCATED_ELEMENT__CHAR_END;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE_TYPE_ATTRIBUTE__TYPE = LOCATED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Tuple Type</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE_TYPE_ATTRIBUTE__TUPLE_TYPE = LOCATED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE_TYPE_ATTRIBUTE__NAME = LOCATED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Tuple Type Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE_TYPE_ATTRIBUTE_FEATURE_COUNT = LOCATED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Tuple Type Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE_TYPE_ATTRIBUTE_OPERATION_COUNT = LOCATED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link QualityMetamodel.QMM_OCL.impl.OclModelElementImpl <em>Ocl Model Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QualityMetamodel.QMM_OCL.impl.OclModelElementImpl
	 * @see QualityMetamodel.QMM_OCL.impl.QMM_OCLPackageImpl#getOclModelElement()
	 * @generated
	 */
	int OCL_MODEL_ELEMENT = 73;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_MODEL_ELEMENT__LINE = OCL_TYPE__LINE;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_MODEL_ELEMENT__COLUMN = OCL_TYPE__COLUMN;

	/**
	 * The feature id for the '<em><b>Char Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_MODEL_ELEMENT__CHAR_START = OCL_TYPE__CHAR_START;

	/**
	 * The feature id for the '<em><b>Char End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_MODEL_ELEMENT__CHAR_END = OCL_TYPE__CHAR_END;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_MODEL_ELEMENT__NAME = OCL_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Definitions</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_MODEL_ELEMENT__DEFINITIONS = OCL_TYPE__DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Ocl Expression</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_MODEL_ELEMENT__OCL_EXPRESSION = OCL_TYPE__OCL_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_MODEL_ELEMENT__OPERATION = OCL_TYPE__OPERATION;

	/**
	 * The feature id for the '<em><b>Map Type2</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_MODEL_ELEMENT__MAP_TYPE2 = OCL_TYPE__MAP_TYPE2;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_MODEL_ELEMENT__ATTRIBUTE = OCL_TYPE__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Map Type</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_MODEL_ELEMENT__MAP_TYPE = OCL_TYPE__MAP_TYPE;

	/**
	 * The feature id for the '<em><b>Collection Types</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_MODEL_ELEMENT__COLLECTION_TYPES = OCL_TYPE__COLLECTION_TYPES;

	/**
	 * The feature id for the '<em><b>Tuple Type Attribute</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_MODEL_ELEMENT__TUPLE_TYPE_ATTRIBUTE = OCL_TYPE__TUPLE_TYPE_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Variable Declaration</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_MODEL_ELEMENT__VARIABLE_DECLARATION = OCL_TYPE__VARIABLE_DECLARATION;

	/**
	 * The feature id for the '<em><b>Lambda Return Type</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_MODEL_ELEMENT__LAMBDA_RETURN_TYPE = OCL_TYPE__LAMBDA_RETURN_TYPE;

	/**
	 * The feature id for the '<em><b>Lambda Arg Type</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_MODEL_ELEMENT__LAMBDA_ARG_TYPE = OCL_TYPE__LAMBDA_ARG_TYPE;

	/**
	 * The feature id for the '<em><b>Static Property Call</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_MODEL_ELEMENT__STATIC_PROPERTY_CALL = OCL_TYPE__STATIC_PROPERTY_CALL;

	/**
	 * The feature id for the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_MODEL_ELEMENT__MODEL = OCL_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ocl Model Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_MODEL_ELEMENT_FEATURE_COUNT = OCL_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Ocl Model Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_MODEL_ELEMENT_OPERATION_COUNT = OCL_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link QualityMetamodel.QMM_OCL.impl.MapTypeImpl <em>Map Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QualityMetamodel.QMM_OCL.impl.MapTypeImpl
	 * @see QualityMetamodel.QMM_OCL.impl.QMM_OCLPackageImpl#getMapType()
	 * @generated
	 */
	int MAP_TYPE = 74;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_TYPE__LINE = OCL_TYPE__LINE;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_TYPE__COLUMN = OCL_TYPE__COLUMN;

	/**
	 * The feature id for the '<em><b>Char Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_TYPE__CHAR_START = OCL_TYPE__CHAR_START;

	/**
	 * The feature id for the '<em><b>Char End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_TYPE__CHAR_END = OCL_TYPE__CHAR_END;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_TYPE__NAME = OCL_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Definitions</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_TYPE__DEFINITIONS = OCL_TYPE__DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Ocl Expression</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_TYPE__OCL_EXPRESSION = OCL_TYPE__OCL_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_TYPE__OPERATION = OCL_TYPE__OPERATION;

	/**
	 * The feature id for the '<em><b>Map Type2</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_TYPE__MAP_TYPE2 = OCL_TYPE__MAP_TYPE2;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_TYPE__ATTRIBUTE = OCL_TYPE__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Map Type</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_TYPE__MAP_TYPE = OCL_TYPE__MAP_TYPE;

	/**
	 * The feature id for the '<em><b>Collection Types</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_TYPE__COLLECTION_TYPES = OCL_TYPE__COLLECTION_TYPES;

	/**
	 * The feature id for the '<em><b>Tuple Type Attribute</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_TYPE__TUPLE_TYPE_ATTRIBUTE = OCL_TYPE__TUPLE_TYPE_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Variable Declaration</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_TYPE__VARIABLE_DECLARATION = OCL_TYPE__VARIABLE_DECLARATION;

	/**
	 * The feature id for the '<em><b>Lambda Return Type</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_TYPE__LAMBDA_RETURN_TYPE = OCL_TYPE__LAMBDA_RETURN_TYPE;

	/**
	 * The feature id for the '<em><b>Lambda Arg Type</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_TYPE__LAMBDA_ARG_TYPE = OCL_TYPE__LAMBDA_ARG_TYPE;

	/**
	 * The feature id for the '<em><b>Static Property Call</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_TYPE__STATIC_PROPERTY_CALL = OCL_TYPE__STATIC_PROPERTY_CALL;

	/**
	 * The feature id for the '<em><b>Value Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_TYPE__VALUE_TYPE = OCL_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Key Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_TYPE__KEY_TYPE = OCL_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Map Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_TYPE_FEATURE_COUNT = OCL_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Map Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_TYPE_OPERATION_COUNT = OCL_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link QualityMetamodel.QMM_OCL.impl.LambdaTypeImpl <em>Lambda Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QualityMetamodel.QMM_OCL.impl.LambdaTypeImpl
	 * @see QualityMetamodel.QMM_OCL.impl.QMM_OCLPackageImpl#getLambdaType()
	 * @generated
	 */
	int LAMBDA_TYPE = 75;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAMBDA_TYPE__LINE = OCL_TYPE__LINE;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAMBDA_TYPE__COLUMN = OCL_TYPE__COLUMN;

	/**
	 * The feature id for the '<em><b>Char Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAMBDA_TYPE__CHAR_START = OCL_TYPE__CHAR_START;

	/**
	 * The feature id for the '<em><b>Char End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAMBDA_TYPE__CHAR_END = OCL_TYPE__CHAR_END;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAMBDA_TYPE__NAME = OCL_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Definitions</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAMBDA_TYPE__DEFINITIONS = OCL_TYPE__DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Ocl Expression</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAMBDA_TYPE__OCL_EXPRESSION = OCL_TYPE__OCL_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAMBDA_TYPE__OPERATION = OCL_TYPE__OPERATION;

	/**
	 * The feature id for the '<em><b>Map Type2</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAMBDA_TYPE__MAP_TYPE2 = OCL_TYPE__MAP_TYPE2;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAMBDA_TYPE__ATTRIBUTE = OCL_TYPE__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Map Type</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAMBDA_TYPE__MAP_TYPE = OCL_TYPE__MAP_TYPE;

	/**
	 * The feature id for the '<em><b>Collection Types</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAMBDA_TYPE__COLLECTION_TYPES = OCL_TYPE__COLLECTION_TYPES;

	/**
	 * The feature id for the '<em><b>Tuple Type Attribute</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAMBDA_TYPE__TUPLE_TYPE_ATTRIBUTE = OCL_TYPE__TUPLE_TYPE_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Variable Declaration</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAMBDA_TYPE__VARIABLE_DECLARATION = OCL_TYPE__VARIABLE_DECLARATION;

	/**
	 * The feature id for the '<em><b>Lambda Return Type</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAMBDA_TYPE__LAMBDA_RETURN_TYPE = OCL_TYPE__LAMBDA_RETURN_TYPE;

	/**
	 * The feature id for the '<em><b>Lambda Arg Type</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAMBDA_TYPE__LAMBDA_ARG_TYPE = OCL_TYPE__LAMBDA_ARG_TYPE;

	/**
	 * The feature id for the '<em><b>Static Property Call</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAMBDA_TYPE__STATIC_PROPERTY_CALL = OCL_TYPE__STATIC_PROPERTY_CALL;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAMBDA_TYPE__RETURN_TYPE = OCL_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Argument Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAMBDA_TYPE__ARGUMENT_TYPES = OCL_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Lambda Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAMBDA_TYPE_FEATURE_COUNT = OCL_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Lambda Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAMBDA_TYPE_OPERATION_COUNT = OCL_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link QualityMetamodel.QMM_OCL.impl.EnvTypeImpl <em>Env Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QualityMetamodel.QMM_OCL.impl.EnvTypeImpl
	 * @see QualityMetamodel.QMM_OCL.impl.QMM_OCLPackageImpl#getEnvType()
	 * @generated
	 */
	int ENV_TYPE = 76;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENV_TYPE__LINE = OCL_TYPE__LINE;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENV_TYPE__COLUMN = OCL_TYPE__COLUMN;

	/**
	 * The feature id for the '<em><b>Char Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENV_TYPE__CHAR_START = OCL_TYPE__CHAR_START;

	/**
	 * The feature id for the '<em><b>Char End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENV_TYPE__CHAR_END = OCL_TYPE__CHAR_END;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENV_TYPE__NAME = OCL_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Definitions</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENV_TYPE__DEFINITIONS = OCL_TYPE__DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Ocl Expression</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENV_TYPE__OCL_EXPRESSION = OCL_TYPE__OCL_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENV_TYPE__OPERATION = OCL_TYPE__OPERATION;

	/**
	 * The feature id for the '<em><b>Map Type2</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENV_TYPE__MAP_TYPE2 = OCL_TYPE__MAP_TYPE2;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENV_TYPE__ATTRIBUTE = OCL_TYPE__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Map Type</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENV_TYPE__MAP_TYPE = OCL_TYPE__MAP_TYPE;

	/**
	 * The feature id for the '<em><b>Collection Types</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENV_TYPE__COLLECTION_TYPES = OCL_TYPE__COLLECTION_TYPES;

	/**
	 * The feature id for the '<em><b>Tuple Type Attribute</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENV_TYPE__TUPLE_TYPE_ATTRIBUTE = OCL_TYPE__TUPLE_TYPE_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Variable Declaration</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENV_TYPE__VARIABLE_DECLARATION = OCL_TYPE__VARIABLE_DECLARATION;

	/**
	 * The feature id for the '<em><b>Lambda Return Type</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENV_TYPE__LAMBDA_RETURN_TYPE = OCL_TYPE__LAMBDA_RETURN_TYPE;

	/**
	 * The feature id for the '<em><b>Lambda Arg Type</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENV_TYPE__LAMBDA_ARG_TYPE = OCL_TYPE__LAMBDA_ARG_TYPE;

	/**
	 * The feature id for the '<em><b>Static Property Call</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENV_TYPE__STATIC_PROPERTY_CALL = OCL_TYPE__STATIC_PROPERTY_CALL;

	/**
	 * The number of structural features of the '<em>Env Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENV_TYPE_FEATURE_COUNT = OCL_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Env Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENV_TYPE_OPERATION_COUNT = OCL_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link QualityMetamodel.QMM_OCL.impl.OclFeatureDefinitionImpl <em>Ocl Feature Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QualityMetamodel.QMM_OCL.impl.OclFeatureDefinitionImpl
	 * @see QualityMetamodel.QMM_OCL.impl.QMM_OCLPackageImpl#getOclFeatureDefinition()
	 * @generated
	 */
	int OCL_FEATURE_DEFINITION = 77;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_FEATURE_DEFINITION__LINE = MODULE_ELEMENT__LINE;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_FEATURE_DEFINITION__COLUMN = MODULE_ELEMENT__COLUMN;

	/**
	 * The feature id for the '<em><b>Char Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_FEATURE_DEFINITION__CHAR_START = MODULE_ELEMENT__CHAR_START;

	/**
	 * The feature id for the '<em><b>Char End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_FEATURE_DEFINITION__CHAR_END = MODULE_ELEMENT__CHAR_END;

	/**
	 * The feature id for the '<em><b>Module</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_FEATURE_DEFINITION__MODULE = MODULE_ELEMENT__MODULE;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_FEATURE_DEFINITION__FEATURE = MODULE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Context </b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_FEATURE_DEFINITION__CONTEXT_ = MODULE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_FEATURE_DEFINITION__STATIC = MODULE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Ocl Feature Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_FEATURE_DEFINITION_FEATURE_COUNT = MODULE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Ocl Feature Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_FEATURE_DEFINITION_OPERATION_COUNT = MODULE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link QualityMetamodel.QMM_OCL.impl.OclContextDefinitionImpl <em>Ocl Context Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QualityMetamodel.QMM_OCL.impl.OclContextDefinitionImpl
	 * @see QualityMetamodel.QMM_OCL.impl.QMM_OCLPackageImpl#getOclContextDefinition()
	 * @generated
	 */
	int OCL_CONTEXT_DEFINITION = 78;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_CONTEXT_DEFINITION__LINE = LOCATED_ELEMENT__LINE;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_CONTEXT_DEFINITION__COLUMN = LOCATED_ELEMENT__COLUMN;

	/**
	 * The feature id for the '<em><b>Char Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_CONTEXT_DEFINITION__CHAR_START = LOCATED_ELEMENT__CHAR_START;

	/**
	 * The feature id for the '<em><b>Char End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_CONTEXT_DEFINITION__CHAR_END = LOCATED_ELEMENT__CHAR_END;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_CONTEXT_DEFINITION__DEFINITION = LOCATED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Context </b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_CONTEXT_DEFINITION__CONTEXT_ = LOCATED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Ocl Context Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_CONTEXT_DEFINITION_FEATURE_COUNT = LOCATED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Ocl Context Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_CONTEXT_DEFINITION_OPERATION_COUNT = LOCATED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link QualityMetamodel.QMM_OCL.impl.OclFeatureImpl <em>Ocl Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QualityMetamodel.QMM_OCL.impl.OclFeatureImpl
	 * @see QualityMetamodel.QMM_OCL.impl.QMM_OCLPackageImpl#getOclFeature()
	 * @generated
	 */
	int OCL_FEATURE = 79;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_FEATURE__LINE = NAMED_ELEMENT__LINE;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_FEATURE__COLUMN = NAMED_ELEMENT__COLUMN;

	/**
	 * The feature id for the '<em><b>Char Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_FEATURE__CHAR_START = NAMED_ELEMENT__CHAR_START;

	/**
	 * The feature id for the '<em><b>Char End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_FEATURE__CHAR_END = NAMED_ELEMENT__CHAR_END;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_FEATURE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_FEATURE__DEFINITION = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Eq</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_FEATURE__EQ = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Ocl Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_FEATURE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Ocl Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_FEATURE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link QualityMetamodel.QMM_OCL.impl.AttributeImpl <em>Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QualityMetamodel.QMM_OCL.impl.AttributeImpl
	 * @see QualityMetamodel.QMM_OCL.impl.QMM_OCLPackageImpl#getAttribute()
	 * @generated
	 */
	int ATTRIBUTE = 80;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__LINE = OCL_FEATURE__LINE;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__COLUMN = OCL_FEATURE__COLUMN;

	/**
	 * The feature id for the '<em><b>Char Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__CHAR_START = OCL_FEATURE__CHAR_START;

	/**
	 * The feature id for the '<em><b>Char End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__CHAR_END = OCL_FEATURE__CHAR_END;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__NAME = OCL_FEATURE__NAME;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__DEFINITION = OCL_FEATURE__DEFINITION;

	/**
	 * The feature id for the '<em><b>Eq</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__EQ = OCL_FEATURE__EQ;

	/**
	 * The feature id for the '<em><b>Init Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__INIT_EXPRESSION = OCL_FEATURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__TYPE = OCL_FEATURE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_FEATURE_COUNT = OCL_FEATURE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_OPERATION_COUNT = OCL_FEATURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link QualityMetamodel.QMM_OCL.impl.OperationImpl <em>Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QualityMetamodel.QMM_OCL.impl.OperationImpl
	 * @see QualityMetamodel.QMM_OCL.impl.QMM_OCLPackageImpl#getOperation()
	 * @generated
	 */
	int OPERATION = 81;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__LINE = OCL_FEATURE__LINE;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__COLUMN = OCL_FEATURE__COLUMN;

	/**
	 * The feature id for the '<em><b>Char Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__CHAR_START = OCL_FEATURE__CHAR_START;

	/**
	 * The feature id for the '<em><b>Char End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__CHAR_END = OCL_FEATURE__CHAR_END;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__NAME = OCL_FEATURE__NAME;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__DEFINITION = OCL_FEATURE__DEFINITION;

	/**
	 * The feature id for the '<em><b>Eq</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__EQ = OCL_FEATURE__EQ;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__PARAMETERS = OCL_FEATURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__RETURN_TYPE = OCL_FEATURE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__BODY = OCL_FEATURE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_FEATURE_COUNT = OCL_FEATURE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_OPERATION_COUNT = OCL_FEATURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link QualityMetamodel.QMM_OCL.impl.OclModelImpl <em>Ocl Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QualityMetamodel.QMM_OCL.impl.OclModelImpl
	 * @see QualityMetamodel.QMM_OCL.impl.QMM_OCLPackageImpl#getOclModel()
	 * @generated
	 */
	int OCL_MODEL = 82;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_MODEL__LINE = NAMED_ELEMENT__LINE;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_MODEL__COLUMN = NAMED_ELEMENT__COLUMN;

	/**
	 * The feature id for the '<em><b>Char Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_MODEL__CHAR_START = NAMED_ELEMENT__CHAR_START;

	/**
	 * The feature id for the '<em><b>Char End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_MODEL__CHAR_END = NAMED_ELEMENT__CHAR_END;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_MODEL__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_MODEL__ELEMENTS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ocl Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_MODEL_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Ocl Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_MODEL_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link QualityMetamodel.QMM_OCL.impl.OclMetamodelImpl <em>Ocl Metamodel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QualityMetamodel.QMM_OCL.impl.OclMetamodelImpl
	 * @see QualityMetamodel.QMM_OCL.impl.QMM_OCLPackageImpl#getOclMetamodel()
	 * @generated
	 */
	int OCL_METAMODEL = 83;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_METAMODEL__LINE = OCL_MODEL__LINE;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_METAMODEL__COLUMN = OCL_MODEL__COLUMN;

	/**
	 * The feature id for the '<em><b>Char Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_METAMODEL__CHAR_START = OCL_MODEL__CHAR_START;

	/**
	 * The feature id for the '<em><b>Char End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_METAMODEL__CHAR_END = OCL_MODEL__CHAR_END;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_METAMODEL__NAME = OCL_MODEL__NAME;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_METAMODEL__ELEMENTS = OCL_MODEL__ELEMENTS;

	/**
	 * The feature id for the '<em><b>Model</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_METAMODEL__MODEL = OCL_MODEL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_METAMODEL__URI = OCL_MODEL_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Ocl Metamodel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_METAMODEL_FEATURE_COUNT = OCL_MODEL_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Ocl Metamodel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_METAMODEL_OPERATION_COUNT = OCL_MODEL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link QualityMetamodel.QMM_OCL.impl.OclInstanceModelImpl <em>Ocl Instance Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QualityMetamodel.QMM_OCL.impl.OclInstanceModelImpl
	 * @see QualityMetamodel.QMM_OCL.impl.QMM_OCLPackageImpl#getOclInstanceModel()
	 * @generated
	 */
	int OCL_INSTANCE_MODEL = 84;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_INSTANCE_MODEL__LINE = OCL_MODEL__LINE;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_INSTANCE_MODEL__COLUMN = OCL_MODEL__COLUMN;

	/**
	 * The feature id for the '<em><b>Char Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_INSTANCE_MODEL__CHAR_START = OCL_MODEL__CHAR_START;

	/**
	 * The feature id for the '<em><b>Char End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_INSTANCE_MODEL__CHAR_END = OCL_MODEL__CHAR_END;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_INSTANCE_MODEL__NAME = OCL_MODEL__NAME;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_INSTANCE_MODEL__ELEMENTS = OCL_MODEL__ELEMENTS;

	/**
	 * The feature id for the '<em><b>Metamodel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_INSTANCE_MODEL__METAMODEL = OCL_MODEL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ocl Instance Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_INSTANCE_MODEL_FEATURE_COUNT = OCL_MODEL_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Ocl Instance Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_INSTANCE_MODEL_OPERATION_COUNT = OCL_MODEL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '<em>Boolean</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QualityMetamodel.QMM_OCL.impl.QMM_OCLPackageImpl#getBoolean()
	 * @generated
	 */
	int BOOLEAN = 85;

	/**
	 * The meta object id for the '<em>Double</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QualityMetamodel.QMM_OCL.impl.QMM_OCLPackageImpl#getDouble()
	 * @generated
	 */
	int DOUBLE = 86;

	/**
	 * The meta object id for the '<em>Integer</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QualityMetamodel.QMM_OCL.impl.QMM_OCLPackageImpl#getInteger()
	 * @generated
	 */
	int INTEGER = 87;

	/**
	 * The meta object id for the '<em>String</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see QualityMetamodel.QMM_OCL.impl.QMM_OCLPackageImpl#getString()
	 * @generated
	 */
	int STRING = 88;


	/**
	 * Returns the meta object for class '{@link QualityMetamodel.QMM_OCL.LocatedElement <em>Located Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Located Element</em>'.
	 * @see QualityMetamodel.QMM_OCL.LocatedElement
	 * @generated
	 */
	EClass getLocatedElement();

	/**
	 * Returns the meta object for the attribute '{@link QualityMetamodel.QMM_OCL.LocatedElement#getLine <em>Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Line</em>'.
	 * @see QualityMetamodel.QMM_OCL.LocatedElement#getLine()
	 * @see #getLocatedElement()
	 * @generated
	 */
	EAttribute getLocatedElement_Line();

	/**
	 * Returns the meta object for the attribute '{@link QualityMetamodel.QMM_OCL.LocatedElement#getColumn <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Column</em>'.
	 * @see QualityMetamodel.QMM_OCL.LocatedElement#getColumn()
	 * @see #getLocatedElement()
	 * @generated
	 */
	EAttribute getLocatedElement_Column();

	/**
	 * Returns the meta object for the attribute '{@link QualityMetamodel.QMM_OCL.LocatedElement#getCharStart <em>Char Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Char Start</em>'.
	 * @see QualityMetamodel.QMM_OCL.LocatedElement#getCharStart()
	 * @see #getLocatedElement()
	 * @generated
	 */
	EAttribute getLocatedElement_CharStart();

	/**
	 * Returns the meta object for the attribute '{@link QualityMetamodel.QMM_OCL.LocatedElement#getCharEnd <em>Char End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Char End</em>'.
	 * @see QualityMetamodel.QMM_OCL.LocatedElement#getCharEnd()
	 * @see #getLocatedElement()
	 * @generated
	 */
	EAttribute getLocatedElement_CharEnd();

	/**
	 * Returns the meta object for class '{@link QualityMetamodel.QMM_OCL.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see QualityMetamodel.QMM_OCL.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link QualityMetamodel.QMM_OCL.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see QualityMetamodel.QMM_OCL.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link QualityMetamodel.QMM_OCL.Module <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Module</em>'.
	 * @see QualityMetamodel.QMM_OCL.Module
	 * @generated
	 */
	EClass getModule();

	/**
	 * Returns the meta object for the containment reference list '{@link QualityMetamodel.QMM_OCL.Module#getMetamodels <em>Metamodels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Metamodels</em>'.
	 * @see QualityMetamodel.QMM_OCL.Module#getMetamodels()
	 * @see #getModule()
	 * @generated
	 */
	EReference getModule_Metamodels();

	/**
	 * Returns the meta object for the containment reference list '{@link QualityMetamodel.QMM_OCL.Module#getImports <em>Imports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Imports</em>'.
	 * @see QualityMetamodel.QMM_OCL.Module#getImports()
	 * @see #getModule()
	 * @generated
	 */
	EReference getModule_Imports();

	/**
	 * Returns the meta object for the containment reference list '{@link QualityMetamodel.QMM_OCL.Module#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see QualityMetamodel.QMM_OCL.Module#getElements()
	 * @see #getModule()
	 * @generated
	 */
	EReference getModule_Elements();

	/**
	 * Returns the meta object for class '{@link QualityMetamodel.QMM_OCL.ModuleElement <em>Module Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Module Element</em>'.
	 * @see QualityMetamodel.QMM_OCL.ModuleElement
	 * @generated
	 */
	EClass getModuleElement();

	/**
	 * Returns the meta object for the container reference '{@link QualityMetamodel.QMM_OCL.ModuleElement#getModule <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Module</em>'.
	 * @see QualityMetamodel.QMM_OCL.ModuleElement#getModule()
	 * @see #getModuleElement()
	 * @generated
	 */
	EReference getModuleElement_Module();

	/**
	 * Returns the meta object for class '{@link QualityMetamodel.QMM_OCL.Import <em>Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Import</em>'.
	 * @see QualityMetamodel.QMM_OCL.Import
	 * @generated
	 */
	EClass getImport();

	/**
	 * Returns the meta object for the container reference '{@link QualityMetamodel.QMM_OCL.Import#getModule <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Module</em>'.
	 * @see QualityMetamodel.QMM_OCL.Import#getModule()
	 * @see #getImport()
	 * @generated
	 */
	EReference getImport_Module();

	/**
	 * Returns the meta object for class '{@link QualityMetamodel.QMM_OCL.OclExpression <em>Ocl Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ocl Expression</em>'.
	 * @see QualityMetamodel.QMM_OCL.OclExpression
	 * @generated
	 */
	EClass getOclExpression();

	/**
	 * Returns the meta object for the containment reference '{@link QualityMetamodel.QMM_OCL.OclExpression#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see QualityMetamodel.QMM_OCL.OclExpression#getType()
	 * @see #getOclExpression()
	 * @generated
	 */
	EReference getOclExpression_Type();

	/**
	 * Returns the meta object for the container reference '{@link QualityMetamodel.QMM_OCL.OclExpression#getIfExp3 <em>If Exp3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>If Exp3</em>'.
	 * @see QualityMetamodel.QMM_OCL.OclExpression#getIfExp3()
	 * @see #getOclExpression()
	 * @generated
	 */
	EReference getOclExpression_IfExp3();

	/**
	 * Returns the meta object for the container reference '{@link QualityMetamodel.QMM_OCL.OclExpression#getAppliedProperty <em>Applied Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Applied Property</em>'.
	 * @see QualityMetamodel.QMM_OCL.OclExpression#getAppliedProperty()
	 * @see #getOclExpression()
	 * @generated
	 */
	EReference getOclExpression_AppliedProperty();

	/**
	 * Returns the meta object for the container reference '{@link QualityMetamodel.QMM_OCL.OclExpression#getLetExp <em>Let Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Let Exp</em>'.
	 * @see QualityMetamodel.QMM_OCL.OclExpression#getLetExp()
	 * @see #getOclExpression()
	 * @generated
	 */
	EReference getOclExpression_LetExp();

	/**
	 * Returns the meta object for the container reference '{@link QualityMetamodel.QMM_OCL.OclExpression#getLoopExp <em>Loop Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Loop Exp</em>'.
	 * @see QualityMetamodel.QMM_OCL.OclExpression#getLoopExp()
	 * @see #getOclExpression()
	 * @generated
	 */
	EReference getOclExpression_LoopExp();

	/**
	 * Returns the meta object for the container reference '{@link QualityMetamodel.QMM_OCL.OclExpression#getParentOperation <em>Parent Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent Operation</em>'.
	 * @see QualityMetamodel.QMM_OCL.OclExpression#getParentOperation()
	 * @see #getOclExpression()
	 * @generated
	 */
	EReference getOclExpression_ParentOperation();

	/**
	 * Returns the meta object for the container reference '{@link QualityMetamodel.QMM_OCL.OclExpression#getInitializedVariable <em>Initialized Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Initialized Variable</em>'.
	 * @see QualityMetamodel.QMM_OCL.OclExpression#getInitializedVariable()
	 * @see #getOclExpression()
	 * @generated
	 */
	EReference getOclExpression_InitializedVariable();

	/**
	 * Returns the meta object for the container reference '{@link QualityMetamodel.QMM_OCL.OclExpression#getIfExp2 <em>If Exp2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>If Exp2</em>'.
	 * @see QualityMetamodel.QMM_OCL.OclExpression#getIfExp2()
	 * @see #getOclExpression()
	 * @generated
	 */
	EReference getOclExpression_IfExp2();

	/**
	 * Returns the meta object for the container reference '{@link QualityMetamodel.QMM_OCL.OclExpression#getOwningOperation <em>Owning Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owning Operation</em>'.
	 * @see QualityMetamodel.QMM_OCL.OclExpression#getOwningOperation()
	 * @see #getOclExpression()
	 * @generated
	 */
	EReference getOclExpression_OwningOperation();

	/**
	 * Returns the meta object for the container reference '{@link QualityMetamodel.QMM_OCL.OclExpression#getIfExp1 <em>If Exp1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>If Exp1</em>'.
	 * @see QualityMetamodel.QMM_OCL.OclExpression#getIfExp1()
	 * @see #getOclExpression()
	 * @generated
	 */
	EReference getOclExpression_IfExp1();

	/**
	 * Returns the meta object for the container reference '{@link QualityMetamodel.QMM_OCL.OclExpression#getOwningAttribute <em>Owning Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owning Attribute</em>'.
	 * @see QualityMetamodel.QMM_OCL.OclExpression#getOwningAttribute()
	 * @see #getOclExpression()
	 * @generated
	 */
	EReference getOclExpression_OwningAttribute();

	/**
	 * Returns the meta object for the container reference '{@link QualityMetamodel.QMM_OCL.OclExpression#getAppliedOperator <em>Applied Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Applied Operator</em>'.
	 * @see QualityMetamodel.QMM_OCL.OclExpression#getAppliedOperator()
	 * @see #getOclExpression()
	 * @generated
	 */
	EReference getOclExpression_AppliedOperator();

	/**
	 * Returns the meta object for class '{@link QualityMetamodel.QMM_OCL.VariableExp <em>Variable Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable Exp</em>'.
	 * @see QualityMetamodel.QMM_OCL.VariableExp
	 * @generated
	 */
	EClass getVariableExp();

	/**
	 * Returns the meta object for the reference '{@link QualityMetamodel.QMM_OCL.VariableExp#getReferredVariable <em>Referred Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Referred Variable</em>'.
	 * @see QualityMetamodel.QMM_OCL.VariableExp#getReferredVariable()
	 * @see #getVariableExp()
	 * @generated
	 */
	EReference getVariableExp_ReferredVariable();

	/**
	 * Returns the meta object for class '{@link QualityMetamodel.QMM_OCL.SuperExp <em>Super Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Super Exp</em>'.
	 * @see QualityMetamodel.QMM_OCL.SuperExp
	 * @generated
	 */
	EClass getSuperExp();

	/**
	 * Returns the meta object for class '{@link QualityMetamodel.QMM_OCL.SelfExp <em>Self Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Self Exp</em>'.
	 * @see QualityMetamodel.QMM_OCL.SelfExp
	 * @generated
	 */
	EClass getSelfExp();

	/**
	 * Returns the meta object for class '{@link QualityMetamodel.QMM_OCL.EnvExp <em>Env Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Env Exp</em>'.
	 * @see QualityMetamodel.QMM_OCL.EnvExp
	 * @generated
	 */
	EClass getEnvExp();

	/**
	 * Returns the meta object for class '{@link QualityMetamodel.QMM_OCL.PrimitiveExp <em>Primitive Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primitive Exp</em>'.
	 * @see QualityMetamodel.QMM_OCL.PrimitiveExp
	 * @generated
	 */
	EClass getPrimitiveExp();

	/**
	 * Returns the meta object for class '{@link QualityMetamodel.QMM_OCL.StringExp <em>String Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Exp</em>'.
	 * @see QualityMetamodel.QMM_OCL.StringExp
	 * @generated
	 */
	EClass getStringExp();

	/**
	 * Returns the meta object for the attribute '{@link QualityMetamodel.QMM_OCL.StringExp#getStringSymbol <em>String Symbol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>String Symbol</em>'.
	 * @see QualityMetamodel.QMM_OCL.StringExp#getStringSymbol()
	 * @see #getStringExp()
	 * @generated
	 */
	EAttribute getStringExp_StringSymbol();

	/**
	 * Returns the meta object for class '{@link QualityMetamodel.QMM_OCL.BooleanExp <em>Boolean Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Exp</em>'.
	 * @see QualityMetamodel.QMM_OCL.BooleanExp
	 * @generated
	 */
	EClass getBooleanExp();

	/**
	 * Returns the meta object for the attribute '{@link QualityMetamodel.QMM_OCL.BooleanExp#isBooleanSymbol <em>Boolean Symbol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Boolean Symbol</em>'.
	 * @see QualityMetamodel.QMM_OCL.BooleanExp#isBooleanSymbol()
	 * @see #getBooleanExp()
	 * @generated
	 */
	EAttribute getBooleanExp_BooleanSymbol();

	/**
	 * Returns the meta object for class '{@link QualityMetamodel.QMM_OCL.NumericExp <em>Numeric Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Numeric Exp</em>'.
	 * @see QualityMetamodel.QMM_OCL.NumericExp
	 * @generated
	 */
	EClass getNumericExp();

	/**
	 * Returns the meta object for class '{@link QualityMetamodel.QMM_OCL.RealExp <em>Real Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Real Exp</em>'.
	 * @see QualityMetamodel.QMM_OCL.RealExp
	 * @generated
	 */
	EClass getRealExp();

	/**
	 * Returns the meta object for the attribute '{@link QualityMetamodel.QMM_OCL.RealExp#getRealSymbol <em>Real Symbol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Real Symbol</em>'.
	 * @see QualityMetamodel.QMM_OCL.RealExp#getRealSymbol()
	 * @see #getRealExp()
	 * @generated
	 */
	EAttribute getRealExp_RealSymbol();

	/**
	 * Returns the meta object for class '{@link QualityMetamodel.QMM_OCL.IntegerExp <em>Integer Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Exp</em>'.
	 * @see QualityMetamodel.QMM_OCL.IntegerExp
	 * @generated
	 */
	EClass getIntegerExp();

	/**
	 * Returns the meta object for the attribute '{@link QualityMetamodel.QMM_OCL.IntegerExp#getIntegerSymbol <em>Integer Symbol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Integer Symbol</em>'.
	 * @see QualityMetamodel.QMM_OCL.IntegerExp#getIntegerSymbol()
	 * @see #getIntegerExp()
	 * @generated
	 */
	EAttribute getIntegerExp_IntegerSymbol();

	/**
	 * Returns the meta object for class '{@link QualityMetamodel.QMM_OCL.CollectionExp <em>Collection Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Collection Exp</em>'.
	 * @see QualityMetamodel.QMM_OCL.CollectionExp
	 * @generated
	 */
	EClass getCollectionExp();

	/**
	 * Returns the meta object for the containment reference list '{@link QualityMetamodel.QMM_OCL.CollectionExp#getParts <em>Parts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parts</em>'.
	 * @see QualityMetamodel.QMM_OCL.CollectionExp#getParts()
	 * @see #getCollectionExp()
	 * @generated
	 */
	EReference getCollectionExp_Parts();

	/**
	 * Returns the meta object for class '{@link QualityMetamodel.QMM_OCL.CollectionPart <em>Collection Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Collection Part</em>'.
	 * @see QualityMetamodel.QMM_OCL.CollectionPart
	 * @generated
	 */
	EClass getCollectionPart();

	/**
	 * Returns the meta object for the container reference '{@link QualityMetamodel.QMM_OCL.CollectionPart#getCollection <em>Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Collection</em>'.
	 * @see QualityMetamodel.QMM_OCL.CollectionPart#getCollection()
	 * @see #getCollectionPart()
	 * @generated
	 */
	EReference getCollectionPart_Collection();

	/**
	 * Returns the meta object for class '{@link QualityMetamodel.QMM_OCL.CollectionRange <em>Collection Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Collection Range</em>'.
	 * @see QualityMetamodel.QMM_OCL.CollectionRange
	 * @generated
	 */
	EClass getCollectionRange();

	/**
	 * Returns the meta object for the containment reference '{@link QualityMetamodel.QMM_OCL.CollectionRange#getFirst <em>First</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>First</em>'.
	 * @see QualityMetamodel.QMM_OCL.CollectionRange#getFirst()
	 * @see #getCollectionRange()
	 * @generated
	 */
	EReference getCollectionRange_First();

	/**
	 * Returns the meta object for the containment reference '{@link QualityMetamodel.QMM_OCL.CollectionRange#getLast <em>Last</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Last</em>'.
	 * @see QualityMetamodel.QMM_OCL.CollectionRange#getLast()
	 * @see #getCollectionRange()
	 * @generated
	 */
	EReference getCollectionRange_Last();

	/**
	 * Returns the meta object for class '{@link QualityMetamodel.QMM_OCL.CollectionItem <em>Collection Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Collection Item</em>'.
	 * @see QualityMetamodel.QMM_OCL.CollectionItem
	 * @generated
	 */
	EClass getCollectionItem();

	/**
	 * Returns the meta object for the containment reference '{@link QualityMetamodel.QMM_OCL.CollectionItem#getItem <em>Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Item</em>'.
	 * @see QualityMetamodel.QMM_OCL.CollectionItem#getItem()
	 * @see #getCollectionItem()
	 * @generated
	 */
	EReference getCollectionItem_Item();

	/**
	 * Returns the meta object for class '{@link QualityMetamodel.QMM_OCL.BagExp <em>Bag Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bag Exp</em>'.
	 * @see QualityMetamodel.QMM_OCL.BagExp
	 * @generated
	 */
	EClass getBagExp();

	/**
	 * Returns the meta object for class '{@link QualityMetamodel.QMM_OCL.OrderedSetExp <em>Ordered Set Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ordered Set Exp</em>'.
	 * @see QualityMetamodel.QMM_OCL.OrderedSetExp
	 * @generated
	 */
	EClass getOrderedSetExp();

	/**
	 * Returns the meta object for class '{@link QualityMetamodel.QMM_OCL.SequenceExp <em>Sequence Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sequence Exp</em>'.
	 * @see QualityMetamodel.QMM_OCL.SequenceExp
	 * @generated
	 */
	EClass getSequenceExp();

	/**
	 * Returns the meta object for class '{@link QualityMetamodel.QMM_OCL.SetExp <em>Set Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Set Exp</em>'.
	 * @see QualityMetamodel.QMM_OCL.SetExp
	 * @generated
	 */
	EClass getSetExp();

	/**
	 * Returns the meta object for class '{@link QualityMetamodel.QMM_OCL.TupleExp <em>Tuple Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tuple Exp</em>'.
	 * @see QualityMetamodel.QMM_OCL.TupleExp
	 * @generated
	 */
	EClass getTupleExp();

	/**
	 * Returns the meta object for the containment reference list '{@link QualityMetamodel.QMM_OCL.TupleExp#getTuplePart <em>Tuple Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tuple Part</em>'.
	 * @see QualityMetamodel.QMM_OCL.TupleExp#getTuplePart()
	 * @see #getTupleExp()
	 * @generated
	 */
	EReference getTupleExp_TuplePart();

	/**
	 * Returns the meta object for class '{@link QualityMetamodel.QMM_OCL.TuplePart <em>Tuple Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tuple Part</em>'.
	 * @see QualityMetamodel.QMM_OCL.TuplePart
	 * @generated
	 */
	EClass getTuplePart();

	/**
	 * Returns the meta object for the container reference '{@link QualityMetamodel.QMM_OCL.TuplePart#getTuple <em>Tuple</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Tuple</em>'.
	 * @see QualityMetamodel.QMM_OCL.TuplePart#getTuple()
	 * @see #getTuplePart()
	 * @generated
	 */
	EReference getTuplePart_Tuple();

	/**
	 * Returns the meta object for class '{@link QualityMetamodel.QMM_OCL.MapExp <em>Map Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Map Exp</em>'.
	 * @see QualityMetamodel.QMM_OCL.MapExp
	 * @generated
	 */
	EClass getMapExp();

	/**
	 * Returns the meta object for the containment reference list '{@link QualityMetamodel.QMM_OCL.MapExp#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see QualityMetamodel.QMM_OCL.MapExp#getElements()
	 * @see #getMapExp()
	 * @generated
	 */
	EReference getMapExp_Elements();

	/**
	 * Returns the meta object for class '{@link QualityMetamodel.QMM_OCL.MapElement <em>Map Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Map Element</em>'.
	 * @see QualityMetamodel.QMM_OCL.MapElement
	 * @generated
	 */
	EClass getMapElement();

	/**
	 * Returns the meta object for the container reference '{@link QualityMetamodel.QMM_OCL.MapElement#getMap <em>Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Map</em>'.
	 * @see QualityMetamodel.QMM_OCL.MapElement#getMap()
	 * @see #getMapElement()
	 * @generated
	 */
	EReference getMapElement_Map();

	/**
	 * Returns the meta object for the containment reference '{@link QualityMetamodel.QMM_OCL.MapElement#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Key</em>'.
	 * @see QualityMetamodel.QMM_OCL.MapElement#getKey()
	 * @see #getMapElement()
	 * @generated
	 */
	EReference getMapElement_Key();

	/**
	 * Returns the meta object for the containment reference '{@link QualityMetamodel.QMM_OCL.MapElement#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see QualityMetamodel.QMM_OCL.MapElement#getValue()
	 * @see #getMapElement()
	 * @generated
	 */
	EReference getMapElement_Value();

	/**
	 * Returns the meta object for class '{@link QualityMetamodel.QMM_OCL.EnumLiteralExp <em>Enum Literal Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enum Literal Exp</em>'.
	 * @see QualityMetamodel.QMM_OCL.EnumLiteralExp
	 * @generated
	 */
	EClass getEnumLiteralExp();

	/**
	 * Returns the meta object for the attribute '{@link QualityMetamodel.QMM_OCL.EnumLiteralExp#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see QualityMetamodel.QMM_OCL.EnumLiteralExp#getName()
	 * @see #getEnumLiteralExp()
	 * @generated
	 */
	EAttribute getEnumLiteralExp_Name();

	/**
	 * Returns the meta object for class '{@link QualityMetamodel.QMM_OCL.OclUndefinedExp <em>Ocl Undefined Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ocl Undefined Exp</em>'.
	 * @see QualityMetamodel.QMM_OCL.OclUndefinedExp
	 * @generated
	 */
	EClass getOclUndefinedExp();

	/**
	 * Returns the meta object for class '{@link QualityMetamodel.QMM_OCL.StaticPropertyCallExp <em>Static Property Call Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Static Property Call Exp</em>'.
	 * @see QualityMetamodel.QMM_OCL.StaticPropertyCallExp
	 * @generated
	 */
	EClass getStaticPropertyCallExp();

	/**
	 * Returns the meta object for the containment reference '{@link QualityMetamodel.QMM_OCL.StaticPropertyCallExp#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Source</em>'.
	 * @see QualityMetamodel.QMM_OCL.StaticPropertyCallExp#getSource()
	 * @see #getStaticPropertyCallExp()
	 * @generated
	 */
	EReference getStaticPropertyCallExp_Source();

	/**
	 * Returns the meta object for the containment reference '{@link QualityMetamodel.QMM_OCL.StaticPropertyCallExp#getStaticCall <em>Static Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Static Call</em>'.
	 * @see QualityMetamodel.QMM_OCL.StaticPropertyCallExp#getStaticCall()
	 * @see #getStaticPropertyCallExp()
	 * @generated
	 */
	EReference getStaticPropertyCallExp_StaticCall();

	/**
	 * Returns the meta object for class '{@link QualityMetamodel.QMM_OCL.StaticPropertyCall <em>Static Property Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Static Property Call</em>'.
	 * @see QualityMetamodel.QMM_OCL.StaticPropertyCall
	 * @generated
	 */
	EClass getStaticPropertyCall();

	/**
	 * Returns the meta object for the container reference '{@link QualityMetamodel.QMM_OCL.StaticPropertyCall#getStaticCallExp <em>Static Call Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Static Call Exp</em>'.
	 * @see QualityMetamodel.QMM_OCL.StaticPropertyCall#getStaticCallExp()
	 * @see #getStaticPropertyCall()
	 * @generated
	 */
	EReference getStaticPropertyCall_StaticCallExp();

	/**
	 * Returns the meta object for class '{@link QualityMetamodel.QMM_OCL.StaticNavigationOrAttributeCall <em>Static Navigation Or Attribute Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Static Navigation Or Attribute Call</em>'.
	 * @see QualityMetamodel.QMM_OCL.StaticNavigationOrAttributeCall
	 * @generated
	 */
	EClass getStaticNavigationOrAttributeCall();

	/**
	 * Returns the meta object for the attribute '{@link QualityMetamodel.QMM_OCL.StaticNavigationOrAttributeCall#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see QualityMetamodel.QMM_OCL.StaticNavigationOrAttributeCall#getName()
	 * @see #getStaticNavigationOrAttributeCall()
	 * @generated
	 */
	EAttribute getStaticNavigationOrAttributeCall_Name();

	/**
	 * Returns the meta object for class '{@link QualityMetamodel.QMM_OCL.StaticOperationCall <em>Static Operation Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Static Operation Call</em>'.
	 * @see QualityMetamodel.QMM_OCL.StaticOperationCall
	 * @generated
	 */
	EClass getStaticOperationCall();

	/**
	 * Returns the meta object for the containment reference list '{@link QualityMetamodel.QMM_OCL.StaticOperationCall#getArguments <em>Arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Arguments</em>'.
	 * @see QualityMetamodel.QMM_OCL.StaticOperationCall#getArguments()
	 * @see #getStaticOperationCall()
	 * @generated
	 */
	EReference getStaticOperationCall_Arguments();

	/**
	 * Returns the meta object for the attribute '{@link QualityMetamodel.QMM_OCL.StaticOperationCall#getOperationName <em>Operation Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation Name</em>'.
	 * @see QualityMetamodel.QMM_OCL.StaticOperationCall#getOperationName()
	 * @see #getStaticOperationCall()
	 * @generated
	 */
	EAttribute getStaticOperationCall_OperationName();

	/**
	 * Returns the meta object for class '{@link QualityMetamodel.QMM_OCL.PropertyCallExp <em>Property Call Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property Call Exp</em>'.
	 * @see QualityMetamodel.QMM_OCL.PropertyCallExp
	 * @generated
	 */
	EClass getPropertyCallExp();

	/**
	 * Returns the meta object for the containment reference list '{@link QualityMetamodel.QMM_OCL.PropertyCallExp#getCalls <em>Calls</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Calls</em>'.
	 * @see QualityMetamodel.QMM_OCL.PropertyCallExp#getCalls()
	 * @see #getPropertyCallExp()
	 * @generated
	 */
	EReference getPropertyCallExp_Calls();

	/**
	 * Returns the meta object for the containment reference '{@link QualityMetamodel.QMM_OCL.PropertyCallExp#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Source</em>'.
	 * @see QualityMetamodel.QMM_OCL.PropertyCallExp#getSource()
	 * @see #getPropertyCallExp()
	 * @generated
	 */
	EReference getPropertyCallExp_Source();

	/**
	 * Returns the meta object for class '{@link QualityMetamodel.QMM_OCL.PropertyCall <em>Property Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property Call</em>'.
	 * @see QualityMetamodel.QMM_OCL.PropertyCall
	 * @generated
	 */
	EClass getPropertyCall();

	/**
	 * Returns the meta object for the container reference '{@link QualityMetamodel.QMM_OCL.PropertyCall#getCallExp <em>Call Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Call Exp</em>'.
	 * @see QualityMetamodel.QMM_OCL.PropertyCall#getCallExp()
	 * @see #getPropertyCall()
	 * @generated
	 */
	EReference getPropertyCall_CallExp();

	/**
	 * Returns the meta object for class '{@link QualityMetamodel.QMM_OCL.NavigationOrAttributeCall <em>Navigation Or Attribute Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Navigation Or Attribute Call</em>'.
	 * @see QualityMetamodel.QMM_OCL.NavigationOrAttributeCall
	 * @generated
	 */
	EClass getNavigationOrAttributeCall();

	/**
	 * Returns the meta object for the attribute '{@link QualityMetamodel.QMM_OCL.NavigationOrAttributeCall#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see QualityMetamodel.QMM_OCL.NavigationOrAttributeCall#getName()
	 * @see #getNavigationOrAttributeCall()
	 * @generated
	 */
	EAttribute getNavigationOrAttributeCall_Name();

	/**
	 * Returns the meta object for class '{@link QualityMetamodel.QMM_OCL.OperationCall <em>Operation Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation Call</em>'.
	 * @see QualityMetamodel.QMM_OCL.OperationCall
	 * @generated
	 */
	EClass getOperationCall();

	/**
	 * Returns the meta object for the containment reference list '{@link QualityMetamodel.QMM_OCL.OperationCall#getArguments <em>Arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Arguments</em>'.
	 * @see QualityMetamodel.QMM_OCL.OperationCall#getArguments()
	 * @see #getOperationCall()
	 * @generated
	 */
	EReference getOperationCall_Arguments();

	/**
	 * Returns the meta object for the attribute '{@link QualityMetamodel.QMM_OCL.OperationCall#getOperationName <em>Operation Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation Name</em>'.
	 * @see QualityMetamodel.QMM_OCL.OperationCall#getOperationName()
	 * @see #getOperationCall()
	 * @generated
	 */
	EAttribute getOperationCall_OperationName();

	/**
	 * Returns the meta object for class '{@link QualityMetamodel.QMM_OCL.OperatorCallExp <em>Operator Call Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operator Call Exp</em>'.
	 * @see QualityMetamodel.QMM_OCL.OperatorCallExp
	 * @generated
	 */
	EClass getOperatorCallExp();

	/**
	 * Returns the meta object for the containment reference '{@link QualityMetamodel.QMM_OCL.OperatorCallExp#getArgument <em>Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Argument</em>'.
	 * @see QualityMetamodel.QMM_OCL.OperatorCallExp#getArgument()
	 * @see #getOperatorCallExp()
	 * @generated
	 */
	EReference getOperatorCallExp_Argument();

	/**
	 * Returns the meta object for the attribute '{@link QualityMetamodel.QMM_OCL.OperatorCallExp#getOperationName <em>Operation Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation Name</em>'.
	 * @see QualityMetamodel.QMM_OCL.OperatorCallExp#getOperationName()
	 * @see #getOperatorCallExp()
	 * @generated
	 */
	EAttribute getOperatorCallExp_OperationName();

	/**
	 * Returns the meta object for the containment reference '{@link QualityMetamodel.QMM_OCL.OperatorCallExp#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Source</em>'.
	 * @see QualityMetamodel.QMM_OCL.OperatorCallExp#getSource()
	 * @see #getOperatorCallExp()
	 * @generated
	 */
	EReference getOperatorCallExp_Source();

	/**
	 * Returns the meta object for class '{@link QualityMetamodel.QMM_OCL.NotOpCallExp <em>Not Op Call Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Not Op Call Exp</em>'.
	 * @see QualityMetamodel.QMM_OCL.NotOpCallExp
	 * @generated
	 */
	EClass getNotOpCallExp();

	/**
	 * Returns the meta object for class '{@link QualityMetamodel.QMM_OCL.RelOpCallExp <em>Rel Op Call Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rel Op Call Exp</em>'.
	 * @see QualityMetamodel.QMM_OCL.RelOpCallExp
	 * @generated
	 */
	EClass getRelOpCallExp();

	/**
	 * Returns the meta object for class '{@link QualityMetamodel.QMM_OCL.EqOpCallExp <em>Eq Op Call Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Eq Op Call Exp</em>'.
	 * @see QualityMetamodel.QMM_OCL.EqOpCallExp
	 * @generated
	 */
	EClass getEqOpCallExp();

	/**
	 * Returns the meta object for class '{@link QualityMetamodel.QMM_OCL.AddOpCallExp <em>Add Op Call Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Add Op Call Exp</em>'.
	 * @see QualityMetamodel.QMM_OCL.AddOpCallExp
	 * @generated
	 */
	EClass getAddOpCallExp();

	/**
	 * Returns the meta object for class '{@link QualityMetamodel.QMM_OCL.IntOpCallExp <em>Int Op Call Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Int Op Call Exp</em>'.
	 * @see QualityMetamodel.QMM_OCL.IntOpCallExp
	 * @generated
	 */
	EClass getIntOpCallExp();

	/**
	 * Returns the meta object for class '{@link QualityMetamodel.QMM_OCL.MulOpCallExp <em>Mul Op Call Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mul Op Call Exp</em>'.
	 * @see QualityMetamodel.QMM_OCL.MulOpCallExp
	 * @generated
	 */
	EClass getMulOpCallExp();

	/**
	 * Returns the meta object for class '{@link QualityMetamodel.QMM_OCL.LambdaCallExp <em>Lambda Call Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lambda Call Exp</em>'.
	 * @see QualityMetamodel.QMM_OCL.LambdaCallExp
	 * @generated
	 */
	EClass getLambdaCallExp();

	/**
	 * Returns the meta object for the containment reference list '{@link QualityMetamodel.QMM_OCL.LambdaCallExp#getArguments <em>Arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Arguments</em>'.
	 * @see QualityMetamodel.QMM_OCL.LambdaCallExp#getArguments()
	 * @see #getLambdaCallExp()
	 * @generated
	 */
	EReference getLambdaCallExp_Arguments();

	/**
	 * Returns the meta object for class '{@link QualityMetamodel.QMM_OCL.BraceExp <em>Brace Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Brace Exp</em>'.
	 * @see QualityMetamodel.QMM_OCL.BraceExp
	 * @generated
	 */
	EClass getBraceExp();

	/**
	 * Returns the meta object for the containment reference '{@link QualityMetamodel.QMM_OCL.BraceExp#getExp <em>Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Exp</em>'.
	 * @see QualityMetamodel.QMM_OCL.BraceExp#getExp()
	 * @see #getBraceExp()
	 * @generated
	 */
	EReference getBraceExp_Exp();

	/**
	 * Returns the meta object for class '{@link QualityMetamodel.QMM_OCL.CollectionOperationCall <em>Collection Operation Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Collection Operation Call</em>'.
	 * @see QualityMetamodel.QMM_OCL.CollectionOperationCall
	 * @generated
	 */
	EClass getCollectionOperationCall();

	/**
	 * Returns the meta object for class '{@link QualityMetamodel.QMM_OCL.LoopExp <em>Loop Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Loop Exp</em>'.
	 * @see QualityMetamodel.QMM_OCL.LoopExp
	 * @generated
	 */
	EClass getLoopExp();

	/**
	 * Returns the meta object for the containment reference '{@link QualityMetamodel.QMM_OCL.LoopExp#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Body</em>'.
	 * @see QualityMetamodel.QMM_OCL.LoopExp#getBody()
	 * @see #getLoopExp()
	 * @generated
	 */
	EReference getLoopExp_Body();

	/**
	 * Returns the meta object for the containment reference list '{@link QualityMetamodel.QMM_OCL.LoopExp#getIterators <em>Iterators</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Iterators</em>'.
	 * @see QualityMetamodel.QMM_OCL.LoopExp#getIterators()
	 * @see #getLoopExp()
	 * @generated
	 */
	EReference getLoopExp_Iterators();

	/**
	 * Returns the meta object for class '{@link QualityMetamodel.QMM_OCL.IterateExp <em>Iterate Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Iterate Exp</em>'.
	 * @see QualityMetamodel.QMM_OCL.IterateExp
	 * @generated
	 */
	EClass getIterateExp();

	/**
	 * Returns the meta object for the containment reference '{@link QualityMetamodel.QMM_OCL.IterateExp#getResult <em>Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Result</em>'.
	 * @see QualityMetamodel.QMM_OCL.IterateExp#getResult()
	 * @see #getIterateExp()
	 * @generated
	 */
	EReference getIterateExp_Result();

	/**
	 * Returns the meta object for class '{@link QualityMetamodel.QMM_OCL.IteratorExp <em>Iterator Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Iterator Exp</em>'.
	 * @see QualityMetamodel.QMM_OCL.IteratorExp
	 * @generated
	 */
	EClass getIteratorExp();

	/**
	 * Returns the meta object for the attribute '{@link QualityMetamodel.QMM_OCL.IteratorExp#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see QualityMetamodel.QMM_OCL.IteratorExp#getName()
	 * @see #getIteratorExp()
	 * @generated
	 */
	EAttribute getIteratorExp_Name();

	/**
	 * Returns the meta object for class '{@link QualityMetamodel.QMM_OCL.LetExp <em>Let Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Let Exp</em>'.
	 * @see QualityMetamodel.QMM_OCL.LetExp
	 * @generated
	 */
	EClass getLetExp();

	/**
	 * Returns the meta object for the containment reference '{@link QualityMetamodel.QMM_OCL.LetExp#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Variable</em>'.
	 * @see QualityMetamodel.QMM_OCL.LetExp#getVariable()
	 * @see #getLetExp()
	 * @generated
	 */
	EReference getLetExp_Variable();

	/**
	 * Returns the meta object for the containment reference '{@link QualityMetamodel.QMM_OCL.LetExp#getIn_ <em>In </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>In </em>'.
	 * @see QualityMetamodel.QMM_OCL.LetExp#getIn_()
	 * @see #getLetExp()
	 * @generated
	 */
	EReference getLetExp_In_();

	/**
	 * Returns the meta object for class '{@link QualityMetamodel.QMM_OCL.IfExp <em>If Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>If Exp</em>'.
	 * @see QualityMetamodel.QMM_OCL.IfExp
	 * @generated
	 */
	EClass getIfExp();

	/**
	 * Returns the meta object for the containment reference '{@link QualityMetamodel.QMM_OCL.IfExp#getThenExpression <em>Then Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Then Expression</em>'.
	 * @see QualityMetamodel.QMM_OCL.IfExp#getThenExpression()
	 * @see #getIfExp()
	 * @generated
	 */
	EReference getIfExp_ThenExpression();

	/**
	 * Returns the meta object for the containment reference '{@link QualityMetamodel.QMM_OCL.IfExp#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see QualityMetamodel.QMM_OCL.IfExp#getCondition()
	 * @see #getIfExp()
	 * @generated
	 */
	EReference getIfExp_Condition();

	/**
	 * Returns the meta object for the containment reference '{@link QualityMetamodel.QMM_OCL.IfExp#getElseExpression <em>Else Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Else Expression</em>'.
	 * @see QualityMetamodel.QMM_OCL.IfExp#getElseExpression()
	 * @see #getIfExp()
	 * @generated
	 */
	EReference getIfExp_ElseExpression();

	/**
	 * Returns the meta object for class '{@link QualityMetamodel.QMM_OCL.VariableDeclaration <em>Variable Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable Declaration</em>'.
	 * @see QualityMetamodel.QMM_OCL.VariableDeclaration
	 * @generated
	 */
	EClass getVariableDeclaration();

	/**
	 * Returns the meta object for the attribute '{@link QualityMetamodel.QMM_OCL.VariableDeclaration#getVarName <em>Var Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var Name</em>'.
	 * @see QualityMetamodel.QMM_OCL.VariableDeclaration#getVarName()
	 * @see #getVariableDeclaration()
	 * @generated
	 */
	EAttribute getVariableDeclaration_VarName();

	/**
	 * Returns the meta object for the containment reference '{@link QualityMetamodel.QMM_OCL.VariableDeclaration#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see QualityMetamodel.QMM_OCL.VariableDeclaration#getType()
	 * @see #getVariableDeclaration()
	 * @generated
	 */
	EReference getVariableDeclaration_Type();

	/**
	 * Returns the meta object for the reference list '{@link QualityMetamodel.QMM_OCL.VariableDeclaration#getVariableExp <em>Variable Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Variable Exp</em>'.
	 * @see QualityMetamodel.QMM_OCL.VariableDeclaration#getVariableExp()
	 * @see #getVariableDeclaration()
	 * @generated
	 */
	EReference getVariableDeclaration_VariableExp();

	/**
	 * Returns the meta object for class '{@link QualityMetamodel.QMM_OCL.LocalVariable <em>Local Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Local Variable</em>'.
	 * @see QualityMetamodel.QMM_OCL.LocalVariable
	 * @generated
	 */
	EClass getLocalVariable();

	/**
	 * Returns the meta object for the container reference '{@link QualityMetamodel.QMM_OCL.LocalVariable#getLetExp <em>Let Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Let Exp</em>'.
	 * @see QualityMetamodel.QMM_OCL.LocalVariable#getLetExp()
	 * @see #getLocalVariable()
	 * @generated
	 */
	EReference getLocalVariable_LetExp();

	/**
	 * Returns the meta object for the containment reference '{@link QualityMetamodel.QMM_OCL.LocalVariable#getInitExpression <em>Init Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Init Expression</em>'.
	 * @see QualityMetamodel.QMM_OCL.LocalVariable#getInitExpression()
	 * @see #getLocalVariable()
	 * @generated
	 */
	EReference getLocalVariable_InitExpression();

	/**
	 * Returns the meta object for the container reference '{@link QualityMetamodel.QMM_OCL.LocalVariable#getBaseExp <em>Base Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Base Exp</em>'.
	 * @see QualityMetamodel.QMM_OCL.LocalVariable#getBaseExp()
	 * @see #getLocalVariable()
	 * @generated
	 */
	EReference getLocalVariable_BaseExp();

	/**
	 * Returns the meta object for the attribute '{@link QualityMetamodel.QMM_OCL.LocalVariable#getEq <em>Eq</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Eq</em>'.
	 * @see QualityMetamodel.QMM_OCL.LocalVariable#getEq()
	 * @see #getLocalVariable()
	 * @generated
	 */
	EAttribute getLocalVariable_Eq();

	/**
	 * Returns the meta object for class '{@link QualityMetamodel.QMM_OCL.Iterator <em>Iterator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Iterator</em>'.
	 * @see QualityMetamodel.QMM_OCL.Iterator
	 * @generated
	 */
	EClass getIterator();

	/**
	 * Returns the meta object for the container reference '{@link QualityMetamodel.QMM_OCL.Iterator#getLoopExpr <em>Loop Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Loop Expr</em>'.
	 * @see QualityMetamodel.QMM_OCL.Iterator#getLoopExpr()
	 * @see #getIterator()
	 * @generated
	 */
	EReference getIterator_LoopExpr();

	/**
	 * Returns the meta object for class '{@link QualityMetamodel.QMM_OCL.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see QualityMetamodel.QMM_OCL.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for the container reference '{@link QualityMetamodel.QMM_OCL.Parameter#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Operation</em>'.
	 * @see QualityMetamodel.QMM_OCL.Parameter#getOperation()
	 * @see #getParameter()
	 * @generated
	 */
	EReference getParameter_Operation();

	/**
	 * Returns the meta object for class '{@link QualityMetamodel.QMM_OCL.CollectionType <em>Collection Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Collection Type</em>'.
	 * @see QualityMetamodel.QMM_OCL.CollectionType
	 * @generated
	 */
	EClass getCollectionType();

	/**
	 * Returns the meta object for the containment reference '{@link QualityMetamodel.QMM_OCL.CollectionType#getElementType <em>Element Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Element Type</em>'.
	 * @see QualityMetamodel.QMM_OCL.CollectionType#getElementType()
	 * @see #getCollectionType()
	 * @generated
	 */
	EReference getCollectionType_ElementType();

	/**
	 * Returns the meta object for class '{@link QualityMetamodel.QMM_OCL.OclType <em>Ocl Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ocl Type</em>'.
	 * @see QualityMetamodel.QMM_OCL.OclType
	 * @generated
	 */
	EClass getOclType();

	/**
	 * Returns the meta object for the attribute '{@link QualityMetamodel.QMM_OCL.OclType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see QualityMetamodel.QMM_OCL.OclType#getName()
	 * @see #getOclType()
	 * @generated
	 */
	EAttribute getOclType_Name();

	/**
	 * Returns the meta object for the container reference '{@link QualityMetamodel.QMM_OCL.OclType#getDefinitions <em>Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Definitions</em>'.
	 * @see QualityMetamodel.QMM_OCL.OclType#getDefinitions()
	 * @see #getOclType()
	 * @generated
	 */
	EReference getOclType_Definitions();

	/**
	 * Returns the meta object for the container reference '{@link QualityMetamodel.QMM_OCL.OclType#getOclExpression <em>Ocl Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Ocl Expression</em>'.
	 * @see QualityMetamodel.QMM_OCL.OclType#getOclExpression()
	 * @see #getOclType()
	 * @generated
	 */
	EReference getOclType_OclExpression();

	/**
	 * Returns the meta object for the container reference '{@link QualityMetamodel.QMM_OCL.OclType#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Operation</em>'.
	 * @see QualityMetamodel.QMM_OCL.OclType#getOperation()
	 * @see #getOclType()
	 * @generated
	 */
	EReference getOclType_Operation();

	/**
	 * Returns the meta object for the container reference '{@link QualityMetamodel.QMM_OCL.OclType#getMapType2 <em>Map Type2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Map Type2</em>'.
	 * @see QualityMetamodel.QMM_OCL.OclType#getMapType2()
	 * @see #getOclType()
	 * @generated
	 */
	EReference getOclType_MapType2();

	/**
	 * Returns the meta object for the container reference '{@link QualityMetamodel.QMM_OCL.OclType#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Attribute</em>'.
	 * @see QualityMetamodel.QMM_OCL.OclType#getAttribute()
	 * @see #getOclType()
	 * @generated
	 */
	EReference getOclType_Attribute();

	/**
	 * Returns the meta object for the container reference '{@link QualityMetamodel.QMM_OCL.OclType#getMapType <em>Map Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Map Type</em>'.
	 * @see QualityMetamodel.QMM_OCL.OclType#getMapType()
	 * @see #getOclType()
	 * @generated
	 */
	EReference getOclType_MapType();

	/**
	 * Returns the meta object for the container reference '{@link QualityMetamodel.QMM_OCL.OclType#getCollectionTypes <em>Collection Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Collection Types</em>'.
	 * @see QualityMetamodel.QMM_OCL.OclType#getCollectionTypes()
	 * @see #getOclType()
	 * @generated
	 */
	EReference getOclType_CollectionTypes();

	/**
	 * Returns the meta object for the container reference '{@link QualityMetamodel.QMM_OCL.OclType#getTupleTypeAttribute <em>Tuple Type Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Tuple Type Attribute</em>'.
	 * @see QualityMetamodel.QMM_OCL.OclType#getTupleTypeAttribute()
	 * @see #getOclType()
	 * @generated
	 */
	EReference getOclType_TupleTypeAttribute();

	/**
	 * Returns the meta object for the container reference '{@link QualityMetamodel.QMM_OCL.OclType#getVariableDeclaration <em>Variable Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Variable Declaration</em>'.
	 * @see QualityMetamodel.QMM_OCL.OclType#getVariableDeclaration()
	 * @see #getOclType()
	 * @generated
	 */
	EReference getOclType_VariableDeclaration();

	/**
	 * Returns the meta object for the container reference '{@link QualityMetamodel.QMM_OCL.OclType#getLambdaReturnType <em>Lambda Return Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Lambda Return Type</em>'.
	 * @see QualityMetamodel.QMM_OCL.OclType#getLambdaReturnType()
	 * @see #getOclType()
	 * @generated
	 */
	EReference getOclType_LambdaReturnType();

	/**
	 * Returns the meta object for the container reference '{@link QualityMetamodel.QMM_OCL.OclType#getLambdaArgType <em>Lambda Arg Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Lambda Arg Type</em>'.
	 * @see QualityMetamodel.QMM_OCL.OclType#getLambdaArgType()
	 * @see #getOclType()
	 * @generated
	 */
	EReference getOclType_LambdaArgType();

	/**
	 * Returns the meta object for the container reference '{@link QualityMetamodel.QMM_OCL.OclType#getStaticPropertyCall <em>Static Property Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Static Property Call</em>'.
	 * @see QualityMetamodel.QMM_OCL.OclType#getStaticPropertyCall()
	 * @see #getOclType()
	 * @generated
	 */
	EReference getOclType_StaticPropertyCall();

	/**
	 * Returns the meta object for class '{@link QualityMetamodel.QMM_OCL.OclModelElementExp <em>Ocl Model Element Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ocl Model Element Exp</em>'.
	 * @see QualityMetamodel.QMM_OCL.OclModelElementExp
	 * @generated
	 */
	EClass getOclModelElementExp();

	/**
	 * Returns the meta object for the reference '{@link QualityMetamodel.QMM_OCL.OclModelElementExp#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Model</em>'.
	 * @see QualityMetamodel.QMM_OCL.OclModelElementExp#getModel()
	 * @see #getOclModelElementExp()
	 * @generated
	 */
	EReference getOclModelElementExp_Model();

	/**
	 * Returns the meta object for the attribute '{@link QualityMetamodel.QMM_OCL.OclModelElementExp#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see QualityMetamodel.QMM_OCL.OclModelElementExp#getName()
	 * @see #getOclModelElementExp()
	 * @generated
	 */
	EAttribute getOclModelElementExp_Name();

	/**
	 * Returns the meta object for class '{@link QualityMetamodel.QMM_OCL.Primitive <em>Primitive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primitive</em>'.
	 * @see QualityMetamodel.QMM_OCL.Primitive
	 * @generated
	 */
	EClass getPrimitive();

	/**
	 * Returns the meta object for class '{@link QualityMetamodel.QMM_OCL.StringType <em>String Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Type</em>'.
	 * @see QualityMetamodel.QMM_OCL.StringType
	 * @generated
	 */
	EClass getStringType();

	/**
	 * Returns the meta object for class '{@link QualityMetamodel.QMM_OCL.BooleanType <em>Boolean Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Type</em>'.
	 * @see QualityMetamodel.QMM_OCL.BooleanType
	 * @generated
	 */
	EClass getBooleanType();

	/**
	 * Returns the meta object for class '{@link QualityMetamodel.QMM_OCL.NumericType <em>Numeric Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Numeric Type</em>'.
	 * @see QualityMetamodel.QMM_OCL.NumericType
	 * @generated
	 */
	EClass getNumericType();

	/**
	 * Returns the meta object for class '{@link QualityMetamodel.QMM_OCL.IntegerType <em>Integer Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Type</em>'.
	 * @see QualityMetamodel.QMM_OCL.IntegerType
	 * @generated
	 */
	EClass getIntegerType();

	/**
	 * Returns the meta object for class '{@link QualityMetamodel.QMM_OCL.RealType <em>Real Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Real Type</em>'.
	 * @see QualityMetamodel.QMM_OCL.RealType
	 * @generated
	 */
	EClass getRealType();

	/**
	 * Returns the meta object for class '{@link QualityMetamodel.QMM_OCL.BagType <em>Bag Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bag Type</em>'.
	 * @see QualityMetamodel.QMM_OCL.BagType
	 * @generated
	 */
	EClass getBagType();

	/**
	 * Returns the meta object for class '{@link QualityMetamodel.QMM_OCL.OrderedSetType <em>Ordered Set Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ordered Set Type</em>'.
	 * @see QualityMetamodel.QMM_OCL.OrderedSetType
	 * @generated
	 */
	EClass getOrderedSetType();

	/**
	 * Returns the meta object for class '{@link QualityMetamodel.QMM_OCL.SequenceType <em>Sequence Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sequence Type</em>'.
	 * @see QualityMetamodel.QMM_OCL.SequenceType
	 * @generated
	 */
	EClass getSequenceType();

	/**
	 * Returns the meta object for class '{@link QualityMetamodel.QMM_OCL.SetType <em>Set Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Set Type</em>'.
	 * @see QualityMetamodel.QMM_OCL.SetType
	 * @generated
	 */
	EClass getSetType();

	/**
	 * Returns the meta object for class '{@link QualityMetamodel.QMM_OCL.OclAnyType <em>Ocl Any Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ocl Any Type</em>'.
	 * @see QualityMetamodel.QMM_OCL.OclAnyType
	 * @generated
	 */
	EClass getOclAnyType();

	/**
	 * Returns the meta object for class '{@link QualityMetamodel.QMM_OCL.TupleType <em>Tuple Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tuple Type</em>'.
	 * @see QualityMetamodel.QMM_OCL.TupleType
	 * @generated
	 */
	EClass getTupleType();

	/**
	 * Returns the meta object for the containment reference list '{@link QualityMetamodel.QMM_OCL.TupleType#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see QualityMetamodel.QMM_OCL.TupleType#getAttributes()
	 * @see #getTupleType()
	 * @generated
	 */
	EReference getTupleType_Attributes();

	/**
	 * Returns the meta object for class '{@link QualityMetamodel.QMM_OCL.TupleTypeAttribute <em>Tuple Type Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tuple Type Attribute</em>'.
	 * @see QualityMetamodel.QMM_OCL.TupleTypeAttribute
	 * @generated
	 */
	EClass getTupleTypeAttribute();

	/**
	 * Returns the meta object for the containment reference '{@link QualityMetamodel.QMM_OCL.TupleTypeAttribute#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see QualityMetamodel.QMM_OCL.TupleTypeAttribute#getType()
	 * @see #getTupleTypeAttribute()
	 * @generated
	 */
	EReference getTupleTypeAttribute_Type();

	/**
	 * Returns the meta object for the container reference '{@link QualityMetamodel.QMM_OCL.TupleTypeAttribute#getTupleType <em>Tuple Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Tuple Type</em>'.
	 * @see QualityMetamodel.QMM_OCL.TupleTypeAttribute#getTupleType()
	 * @see #getTupleTypeAttribute()
	 * @generated
	 */
	EReference getTupleTypeAttribute_TupleType();

	/**
	 * Returns the meta object for the attribute '{@link QualityMetamodel.QMM_OCL.TupleTypeAttribute#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see QualityMetamodel.QMM_OCL.TupleTypeAttribute#getName()
	 * @see #getTupleTypeAttribute()
	 * @generated
	 */
	EAttribute getTupleTypeAttribute_Name();

	/**
	 * Returns the meta object for class '{@link QualityMetamodel.QMM_OCL.OclModelElement <em>Ocl Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ocl Model Element</em>'.
	 * @see QualityMetamodel.QMM_OCL.OclModelElement
	 * @generated
	 */
	EClass getOclModelElement();

	/**
	 * Returns the meta object for the reference '{@link QualityMetamodel.QMM_OCL.OclModelElement#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Model</em>'.
	 * @see QualityMetamodel.QMM_OCL.OclModelElement#getModel()
	 * @see #getOclModelElement()
	 * @generated
	 */
	EReference getOclModelElement_Model();

	/**
	 * Returns the meta object for class '{@link QualityMetamodel.QMM_OCL.MapType <em>Map Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Map Type</em>'.
	 * @see QualityMetamodel.QMM_OCL.MapType
	 * @generated
	 */
	EClass getMapType();

	/**
	 * Returns the meta object for the containment reference '{@link QualityMetamodel.QMM_OCL.MapType#getValueType <em>Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value Type</em>'.
	 * @see QualityMetamodel.QMM_OCL.MapType#getValueType()
	 * @see #getMapType()
	 * @generated
	 */
	EReference getMapType_ValueType();

	/**
	 * Returns the meta object for the containment reference '{@link QualityMetamodel.QMM_OCL.MapType#getKeyType <em>Key Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Key Type</em>'.
	 * @see QualityMetamodel.QMM_OCL.MapType#getKeyType()
	 * @see #getMapType()
	 * @generated
	 */
	EReference getMapType_KeyType();

	/**
	 * Returns the meta object for class '{@link QualityMetamodel.QMM_OCL.LambdaType <em>Lambda Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lambda Type</em>'.
	 * @see QualityMetamodel.QMM_OCL.LambdaType
	 * @generated
	 */
	EClass getLambdaType();

	/**
	 * Returns the meta object for the containment reference '{@link QualityMetamodel.QMM_OCL.LambdaType#getReturnType <em>Return Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Return Type</em>'.
	 * @see QualityMetamodel.QMM_OCL.LambdaType#getReturnType()
	 * @see #getLambdaType()
	 * @generated
	 */
	EReference getLambdaType_ReturnType();

	/**
	 * Returns the meta object for the containment reference list '{@link QualityMetamodel.QMM_OCL.LambdaType#getArgumentTypes <em>Argument Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Argument Types</em>'.
	 * @see QualityMetamodel.QMM_OCL.LambdaType#getArgumentTypes()
	 * @see #getLambdaType()
	 * @generated
	 */
	EReference getLambdaType_ArgumentTypes();

	/**
	 * Returns the meta object for class '{@link QualityMetamodel.QMM_OCL.EnvType <em>Env Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Env Type</em>'.
	 * @see QualityMetamodel.QMM_OCL.EnvType
	 * @generated
	 */
	EClass getEnvType();

	/**
	 * Returns the meta object for class '{@link QualityMetamodel.QMM_OCL.OclFeatureDefinition <em>Ocl Feature Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ocl Feature Definition</em>'.
	 * @see QualityMetamodel.QMM_OCL.OclFeatureDefinition
	 * @generated
	 */
	EClass getOclFeatureDefinition();

	/**
	 * Returns the meta object for the containment reference '{@link QualityMetamodel.QMM_OCL.OclFeatureDefinition#getFeature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Feature</em>'.
	 * @see QualityMetamodel.QMM_OCL.OclFeatureDefinition#getFeature()
	 * @see #getOclFeatureDefinition()
	 * @generated
	 */
	EReference getOclFeatureDefinition_Feature();

	/**
	 * Returns the meta object for the containment reference '{@link QualityMetamodel.QMM_OCL.OclFeatureDefinition#getContext_ <em>Context </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Context </em>'.
	 * @see QualityMetamodel.QMM_OCL.OclFeatureDefinition#getContext_()
	 * @see #getOclFeatureDefinition()
	 * @generated
	 */
	EReference getOclFeatureDefinition_Context_();

	/**
	 * Returns the meta object for the attribute '{@link QualityMetamodel.QMM_OCL.OclFeatureDefinition#isStatic <em>Static</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Static</em>'.
	 * @see QualityMetamodel.QMM_OCL.OclFeatureDefinition#isStatic()
	 * @see #getOclFeatureDefinition()
	 * @generated
	 */
	EAttribute getOclFeatureDefinition_Static();

	/**
	 * Returns the meta object for class '{@link QualityMetamodel.QMM_OCL.OclContextDefinition <em>Ocl Context Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ocl Context Definition</em>'.
	 * @see QualityMetamodel.QMM_OCL.OclContextDefinition
	 * @generated
	 */
	EClass getOclContextDefinition();

	/**
	 * Returns the meta object for the container reference '{@link QualityMetamodel.QMM_OCL.OclContextDefinition#getDefinition <em>Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Definition</em>'.
	 * @see QualityMetamodel.QMM_OCL.OclContextDefinition#getDefinition()
	 * @see #getOclContextDefinition()
	 * @generated
	 */
	EReference getOclContextDefinition_Definition();

	/**
	 * Returns the meta object for the containment reference '{@link QualityMetamodel.QMM_OCL.OclContextDefinition#getContext_ <em>Context </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Context </em>'.
	 * @see QualityMetamodel.QMM_OCL.OclContextDefinition#getContext_()
	 * @see #getOclContextDefinition()
	 * @generated
	 */
	EReference getOclContextDefinition_Context_();

	/**
	 * Returns the meta object for class '{@link QualityMetamodel.QMM_OCL.OclFeature <em>Ocl Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ocl Feature</em>'.
	 * @see QualityMetamodel.QMM_OCL.OclFeature
	 * @generated
	 */
	EClass getOclFeature();

	/**
	 * Returns the meta object for the container reference '{@link QualityMetamodel.QMM_OCL.OclFeature#getDefinition <em>Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Definition</em>'.
	 * @see QualityMetamodel.QMM_OCL.OclFeature#getDefinition()
	 * @see #getOclFeature()
	 * @generated
	 */
	EReference getOclFeature_Definition();

	/**
	 * Returns the meta object for the attribute '{@link QualityMetamodel.QMM_OCL.OclFeature#getEq <em>Eq</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Eq</em>'.
	 * @see QualityMetamodel.QMM_OCL.OclFeature#getEq()
	 * @see #getOclFeature()
	 * @generated
	 */
	EAttribute getOclFeature_Eq();

	/**
	 * Returns the meta object for class '{@link QualityMetamodel.QMM_OCL.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute</em>'.
	 * @see QualityMetamodel.QMM_OCL.Attribute
	 * @generated
	 */
	EClass getAttribute();

	/**
	 * Returns the meta object for the containment reference '{@link QualityMetamodel.QMM_OCL.Attribute#getInitExpression <em>Init Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Init Expression</em>'.
	 * @see QualityMetamodel.QMM_OCL.Attribute#getInitExpression()
	 * @see #getAttribute()
	 * @generated
	 */
	EReference getAttribute_InitExpression();

	/**
	 * Returns the meta object for the containment reference '{@link QualityMetamodel.QMM_OCL.Attribute#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see QualityMetamodel.QMM_OCL.Attribute#getType()
	 * @see #getAttribute()
	 * @generated
	 */
	EReference getAttribute_Type();

	/**
	 * Returns the meta object for class '{@link QualityMetamodel.QMM_OCL.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation</em>'.
	 * @see QualityMetamodel.QMM_OCL.Operation
	 * @generated
	 */
	EClass getOperation();

	/**
	 * Returns the meta object for the containment reference list '{@link QualityMetamodel.QMM_OCL.Operation#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see QualityMetamodel.QMM_OCL.Operation#getParameters()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_Parameters();

	/**
	 * Returns the meta object for the containment reference '{@link QualityMetamodel.QMM_OCL.Operation#getReturnType <em>Return Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Return Type</em>'.
	 * @see QualityMetamodel.QMM_OCL.Operation#getReturnType()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_ReturnType();

	/**
	 * Returns the meta object for the containment reference '{@link QualityMetamodel.QMM_OCL.Operation#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Body</em>'.
	 * @see QualityMetamodel.QMM_OCL.Operation#getBody()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_Body();

	/**
	 * Returns the meta object for class '{@link QualityMetamodel.QMM_OCL.OclModel <em>Ocl Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ocl Model</em>'.
	 * @see QualityMetamodel.QMM_OCL.OclModel
	 * @generated
	 */
	EClass getOclModel();

	/**
	 * Returns the meta object for the reference list '{@link QualityMetamodel.QMM_OCL.OclModel#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Elements</em>'.
	 * @see QualityMetamodel.QMM_OCL.OclModel#getElements()
	 * @see #getOclModel()
	 * @generated
	 */
	EReference getOclModel_Elements();

	/**
	 * Returns the meta object for class '{@link QualityMetamodel.QMM_OCL.OclMetamodel <em>Ocl Metamodel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ocl Metamodel</em>'.
	 * @see QualityMetamodel.QMM_OCL.OclMetamodel
	 * @generated
	 */
	EClass getOclMetamodel();

	/**
	 * Returns the meta object for the reference list '{@link QualityMetamodel.QMM_OCL.OclMetamodel#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Model</em>'.
	 * @see QualityMetamodel.QMM_OCL.OclMetamodel#getModel()
	 * @see #getOclMetamodel()
	 * @generated
	 */
	EReference getOclMetamodel_Model();

	/**
	 * Returns the meta object for the attribute '{@link QualityMetamodel.QMM_OCL.OclMetamodel#getUri <em>Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uri</em>'.
	 * @see QualityMetamodel.QMM_OCL.OclMetamodel#getUri()
	 * @see #getOclMetamodel()
	 * @generated
	 */
	EAttribute getOclMetamodel_Uri();

	/**
	 * Returns the meta object for class '{@link QualityMetamodel.QMM_OCL.OclInstanceModel <em>Ocl Instance Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ocl Instance Model</em>'.
	 * @see QualityMetamodel.QMM_OCL.OclInstanceModel
	 * @generated
	 */
	EClass getOclInstanceModel();

	/**
	 * Returns the meta object for the reference '{@link QualityMetamodel.QMM_OCL.OclInstanceModel#getMetamodel <em>Metamodel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Metamodel</em>'.
	 * @see QualityMetamodel.QMM_OCL.OclInstanceModel#getMetamodel()
	 * @see #getOclInstanceModel()
	 * @generated
	 */
	EReference getOclInstanceModel_Metamodel();

	/**
	 * Returns the meta object for data type '<em>Boolean</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Boolean</em>'.
	 * @model instanceClass="boolean"
	 * @generated
	 */
	EDataType getBoolean();

	/**
	 * Returns the meta object for data type '<em>Double</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Double</em>'.
	 * @model instanceClass="double"
	 * @generated
	 */
	EDataType getDouble();

	/**
	 * Returns the meta object for data type '<em>Integer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Integer</em>'.
	 * @model instanceClass="int"
	 * @generated
	 */
	EDataType getInteger();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>String</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 * @generated
	 */
	EDataType getString();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	QMM_OCLFactory getQMM_OCLFactory();

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
		 * The meta object literal for the '{@link QualityMetamodel.QMM_OCL.impl.LocatedElementImpl <em>Located Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QualityMetamodel.QMM_OCL.impl.LocatedElementImpl
		 * @see QualityMetamodel.QMM_OCL.impl.QMM_OCLPackageImpl#getLocatedElement()
		 * @generated
		 */
		EClass LOCATED_ELEMENT = eINSTANCE.getLocatedElement();

		/**
		 * The meta object literal for the '<em><b>Line</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATED_ELEMENT__LINE = eINSTANCE.getLocatedElement_Line();

		/**
		 * The meta object literal for the '<em><b>Column</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATED_ELEMENT__COLUMN = eINSTANCE.getLocatedElement_Column();

		/**
		 * The meta object literal for the '<em><b>Char Start</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATED_ELEMENT__CHAR_START = eINSTANCE.getLocatedElement_CharStart();

		/**
		 * The meta object literal for the '<em><b>Char End</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATED_ELEMENT__CHAR_END = eINSTANCE.getLocatedElement_CharEnd();

		/**
		 * The meta object literal for the '{@link QualityMetamodel.QMM_OCL.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QualityMetamodel.QMM_OCL.impl.NamedElementImpl
		 * @see QualityMetamodel.QMM_OCL.impl.QMM_OCLPackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '{@link QualityMetamodel.QMM_OCL.impl.ModuleImpl <em>Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QualityMetamodel.QMM_OCL.impl.ModuleImpl
		 * @see QualityMetamodel.QMM_OCL.impl.QMM_OCLPackageImpl#getModule()
		 * @generated
		 */
		EClass MODULE = eINSTANCE.getModule();

		/**
		 * The meta object literal for the '<em><b>Metamodels</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE__METAMODELS = eINSTANCE.getModule_Metamodels();

		/**
		 * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE__IMPORTS = eINSTANCE.getModule_Imports();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE__ELEMENTS = eINSTANCE.getModule_Elements();

		/**
		 * The meta object literal for the '{@link QualityMetamodel.QMM_OCL.impl.ModuleElementImpl <em>Module Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QualityMetamodel.QMM_OCL.impl.ModuleElementImpl
		 * @see QualityMetamodel.QMM_OCL.impl.QMM_OCLPackageImpl#getModuleElement()
		 * @generated
		 */
		EClass MODULE_ELEMENT = eINSTANCE.getModuleElement();

		/**
		 * The meta object literal for the '<em><b>Module</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE_ELEMENT__MODULE = eINSTANCE.getModuleElement_Module();

		/**
		 * The meta object literal for the '{@link QualityMetamodel.QMM_OCL.impl.ImportImpl <em>Import</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QualityMetamodel.QMM_OCL.impl.ImportImpl
		 * @see QualityMetamodel.QMM_OCL.impl.QMM_OCLPackageImpl#getImport()
		 * @generated
		 */
		EClass IMPORT = eINSTANCE.getImport();

		/**
		 * The meta object literal for the '<em><b>Module</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPORT__MODULE = eINSTANCE.getImport_Module();

		/**
		 * The meta object literal for the '{@link QualityMetamodel.QMM_OCL.impl.OclExpressionImpl <em>Ocl Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QualityMetamodel.QMM_OCL.impl.OclExpressionImpl
		 * @see QualityMetamodel.QMM_OCL.impl.QMM_OCLPackageImpl#getOclExpression()
		 * @generated
		 */
		EClass OCL_EXPRESSION = eINSTANCE.getOclExpression();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OCL_EXPRESSION__TYPE = eINSTANCE.getOclExpression_Type();

		/**
		 * The meta object literal for the '<em><b>If Exp3</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OCL_EXPRESSION__IF_EXP3 = eINSTANCE.getOclExpression_IfExp3();

		/**
		 * The meta object literal for the '<em><b>Applied Property</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OCL_EXPRESSION__APPLIED_PROPERTY = eINSTANCE.getOclExpression_AppliedProperty();

		/**
		 * The meta object literal for the '<em><b>Let Exp</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OCL_EXPRESSION__LET_EXP = eINSTANCE.getOclExpression_LetExp();

		/**
		 * The meta object literal for the '<em><b>Loop Exp</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OCL_EXPRESSION__LOOP_EXP = eINSTANCE.getOclExpression_LoopExp();

		/**
		 * The meta object literal for the '<em><b>Parent Operation</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OCL_EXPRESSION__PARENT_OPERATION = eINSTANCE.getOclExpression_ParentOperation();

		/**
		 * The meta object literal for the '<em><b>Initialized Variable</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OCL_EXPRESSION__INITIALIZED_VARIABLE = eINSTANCE.getOclExpression_InitializedVariable();

		/**
		 * The meta object literal for the '<em><b>If Exp2</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OCL_EXPRESSION__IF_EXP2 = eINSTANCE.getOclExpression_IfExp2();

		/**
		 * The meta object literal for the '<em><b>Owning Operation</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OCL_EXPRESSION__OWNING_OPERATION = eINSTANCE.getOclExpression_OwningOperation();

		/**
		 * The meta object literal for the '<em><b>If Exp1</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OCL_EXPRESSION__IF_EXP1 = eINSTANCE.getOclExpression_IfExp1();

		/**
		 * The meta object literal for the '<em><b>Owning Attribute</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OCL_EXPRESSION__OWNING_ATTRIBUTE = eINSTANCE.getOclExpression_OwningAttribute();

		/**
		 * The meta object literal for the '<em><b>Applied Operator</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OCL_EXPRESSION__APPLIED_OPERATOR = eINSTANCE.getOclExpression_AppliedOperator();

		/**
		 * The meta object literal for the '{@link QualityMetamodel.QMM_OCL.impl.VariableExpImpl <em>Variable Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QualityMetamodel.QMM_OCL.impl.VariableExpImpl
		 * @see QualityMetamodel.QMM_OCL.impl.QMM_OCLPackageImpl#getVariableExp()
		 * @generated
		 */
		EClass VARIABLE_EXP = eINSTANCE.getVariableExp();

		/**
		 * The meta object literal for the '<em><b>Referred Variable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE_EXP__REFERRED_VARIABLE = eINSTANCE.getVariableExp_ReferredVariable();

		/**
		 * The meta object literal for the '{@link QualityMetamodel.QMM_OCL.impl.SuperExpImpl <em>Super Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QualityMetamodel.QMM_OCL.impl.SuperExpImpl
		 * @see QualityMetamodel.QMM_OCL.impl.QMM_OCLPackageImpl#getSuperExp()
		 * @generated
		 */
		EClass SUPER_EXP = eINSTANCE.getSuperExp();

		/**
		 * The meta object literal for the '{@link QualityMetamodel.QMM_OCL.impl.SelfExpImpl <em>Self Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QualityMetamodel.QMM_OCL.impl.SelfExpImpl
		 * @see QualityMetamodel.QMM_OCL.impl.QMM_OCLPackageImpl#getSelfExp()
		 * @generated
		 */
		EClass SELF_EXP = eINSTANCE.getSelfExp();

		/**
		 * The meta object literal for the '{@link QualityMetamodel.QMM_OCL.impl.EnvExpImpl <em>Env Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QualityMetamodel.QMM_OCL.impl.EnvExpImpl
		 * @see QualityMetamodel.QMM_OCL.impl.QMM_OCLPackageImpl#getEnvExp()
		 * @generated
		 */
		EClass ENV_EXP = eINSTANCE.getEnvExp();

		/**
		 * The meta object literal for the '{@link QualityMetamodel.QMM_OCL.impl.PrimitiveExpImpl <em>Primitive Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QualityMetamodel.QMM_OCL.impl.PrimitiveExpImpl
		 * @see QualityMetamodel.QMM_OCL.impl.QMM_OCLPackageImpl#getPrimitiveExp()
		 * @generated
		 */
		EClass PRIMITIVE_EXP = eINSTANCE.getPrimitiveExp();

		/**
		 * The meta object literal for the '{@link QualityMetamodel.QMM_OCL.impl.StringExpImpl <em>String Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QualityMetamodel.QMM_OCL.impl.StringExpImpl
		 * @see QualityMetamodel.QMM_OCL.impl.QMM_OCLPackageImpl#getStringExp()
		 * @generated
		 */
		EClass STRING_EXP = eINSTANCE.getStringExp();

		/**
		 * The meta object literal for the '<em><b>String Symbol</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_EXP__STRING_SYMBOL = eINSTANCE.getStringExp_StringSymbol();

		/**
		 * The meta object literal for the '{@link QualityMetamodel.QMM_OCL.impl.BooleanExpImpl <em>Boolean Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QualityMetamodel.QMM_OCL.impl.BooleanExpImpl
		 * @see QualityMetamodel.QMM_OCL.impl.QMM_OCLPackageImpl#getBooleanExp()
		 * @generated
		 */
		EClass BOOLEAN_EXP = eINSTANCE.getBooleanExp();

		/**
		 * The meta object literal for the '<em><b>Boolean Symbol</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOLEAN_EXP__BOOLEAN_SYMBOL = eINSTANCE.getBooleanExp_BooleanSymbol();

		/**
		 * The meta object literal for the '{@link QualityMetamodel.QMM_OCL.impl.NumericExpImpl <em>Numeric Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QualityMetamodel.QMM_OCL.impl.NumericExpImpl
		 * @see QualityMetamodel.QMM_OCL.impl.QMM_OCLPackageImpl#getNumericExp()
		 * @generated
		 */
		EClass NUMERIC_EXP = eINSTANCE.getNumericExp();

		/**
		 * The meta object literal for the '{@link QualityMetamodel.QMM_OCL.impl.RealExpImpl <em>Real Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QualityMetamodel.QMM_OCL.impl.RealExpImpl
		 * @see QualityMetamodel.QMM_OCL.impl.QMM_OCLPackageImpl#getRealExp()
		 * @generated
		 */
		EClass REAL_EXP = eINSTANCE.getRealExp();

		/**
		 * The meta object literal for the '<em><b>Real Symbol</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REAL_EXP__REAL_SYMBOL = eINSTANCE.getRealExp_RealSymbol();

		/**
		 * The meta object literal for the '{@link QualityMetamodel.QMM_OCL.impl.IntegerExpImpl <em>Integer Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QualityMetamodel.QMM_OCL.impl.IntegerExpImpl
		 * @see QualityMetamodel.QMM_OCL.impl.QMM_OCLPackageImpl#getIntegerExp()
		 * @generated
		 */
		EClass INTEGER_EXP = eINSTANCE.getIntegerExp();

		/**
		 * The meta object literal for the '<em><b>Integer Symbol</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTEGER_EXP__INTEGER_SYMBOL = eINSTANCE.getIntegerExp_IntegerSymbol();

		/**
		 * The meta object literal for the '{@link QualityMetamodel.QMM_OCL.impl.CollectionExpImpl <em>Collection Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QualityMetamodel.QMM_OCL.impl.CollectionExpImpl
		 * @see QualityMetamodel.QMM_OCL.impl.QMM_OCLPackageImpl#getCollectionExp()
		 * @generated
		 */
		EClass COLLECTION_EXP = eINSTANCE.getCollectionExp();

		/**
		 * The meta object literal for the '<em><b>Parts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLLECTION_EXP__PARTS = eINSTANCE.getCollectionExp_Parts();

		/**
		 * The meta object literal for the '{@link QualityMetamodel.QMM_OCL.impl.CollectionPartImpl <em>Collection Part</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QualityMetamodel.QMM_OCL.impl.CollectionPartImpl
		 * @see QualityMetamodel.QMM_OCL.impl.QMM_OCLPackageImpl#getCollectionPart()
		 * @generated
		 */
		EClass COLLECTION_PART = eINSTANCE.getCollectionPart();

		/**
		 * The meta object literal for the '<em><b>Collection</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLLECTION_PART__COLLECTION = eINSTANCE.getCollectionPart_Collection();

		/**
		 * The meta object literal for the '{@link QualityMetamodel.QMM_OCL.impl.CollectionRangeImpl <em>Collection Range</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QualityMetamodel.QMM_OCL.impl.CollectionRangeImpl
		 * @see QualityMetamodel.QMM_OCL.impl.QMM_OCLPackageImpl#getCollectionRange()
		 * @generated
		 */
		EClass COLLECTION_RANGE = eINSTANCE.getCollectionRange();

		/**
		 * The meta object literal for the '<em><b>First</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLLECTION_RANGE__FIRST = eINSTANCE.getCollectionRange_First();

		/**
		 * The meta object literal for the '<em><b>Last</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLLECTION_RANGE__LAST = eINSTANCE.getCollectionRange_Last();

		/**
		 * The meta object literal for the '{@link QualityMetamodel.QMM_OCL.impl.CollectionItemImpl <em>Collection Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QualityMetamodel.QMM_OCL.impl.CollectionItemImpl
		 * @see QualityMetamodel.QMM_OCL.impl.QMM_OCLPackageImpl#getCollectionItem()
		 * @generated
		 */
		EClass COLLECTION_ITEM = eINSTANCE.getCollectionItem();

		/**
		 * The meta object literal for the '<em><b>Item</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLLECTION_ITEM__ITEM = eINSTANCE.getCollectionItem_Item();

		/**
		 * The meta object literal for the '{@link QualityMetamodel.QMM_OCL.impl.BagExpImpl <em>Bag Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QualityMetamodel.QMM_OCL.impl.BagExpImpl
		 * @see QualityMetamodel.QMM_OCL.impl.QMM_OCLPackageImpl#getBagExp()
		 * @generated
		 */
		EClass BAG_EXP = eINSTANCE.getBagExp();

		/**
		 * The meta object literal for the '{@link QualityMetamodel.QMM_OCL.impl.OrderedSetExpImpl <em>Ordered Set Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QualityMetamodel.QMM_OCL.impl.OrderedSetExpImpl
		 * @see QualityMetamodel.QMM_OCL.impl.QMM_OCLPackageImpl#getOrderedSetExp()
		 * @generated
		 */
		EClass ORDERED_SET_EXP = eINSTANCE.getOrderedSetExp();

		/**
		 * The meta object literal for the '{@link QualityMetamodel.QMM_OCL.impl.SequenceExpImpl <em>Sequence Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QualityMetamodel.QMM_OCL.impl.SequenceExpImpl
		 * @see QualityMetamodel.QMM_OCL.impl.QMM_OCLPackageImpl#getSequenceExp()
		 * @generated
		 */
		EClass SEQUENCE_EXP = eINSTANCE.getSequenceExp();

		/**
		 * The meta object literal for the '{@link QualityMetamodel.QMM_OCL.impl.SetExpImpl <em>Set Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QualityMetamodel.QMM_OCL.impl.SetExpImpl
		 * @see QualityMetamodel.QMM_OCL.impl.QMM_OCLPackageImpl#getSetExp()
		 * @generated
		 */
		EClass SET_EXP = eINSTANCE.getSetExp();

		/**
		 * The meta object literal for the '{@link QualityMetamodel.QMM_OCL.impl.TupleExpImpl <em>Tuple Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QualityMetamodel.QMM_OCL.impl.TupleExpImpl
		 * @see QualityMetamodel.QMM_OCL.impl.QMM_OCLPackageImpl#getTupleExp()
		 * @generated
		 */
		EClass TUPLE_EXP = eINSTANCE.getTupleExp();

		/**
		 * The meta object literal for the '<em><b>Tuple Part</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TUPLE_EXP__TUPLE_PART = eINSTANCE.getTupleExp_TuplePart();

		/**
		 * The meta object literal for the '{@link QualityMetamodel.QMM_OCL.impl.TuplePartImpl <em>Tuple Part</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QualityMetamodel.QMM_OCL.impl.TuplePartImpl
		 * @see QualityMetamodel.QMM_OCL.impl.QMM_OCLPackageImpl#getTuplePart()
		 * @generated
		 */
		EClass TUPLE_PART = eINSTANCE.getTuplePart();

		/**
		 * The meta object literal for the '<em><b>Tuple</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TUPLE_PART__TUPLE = eINSTANCE.getTuplePart_Tuple();

		/**
		 * The meta object literal for the '{@link QualityMetamodel.QMM_OCL.impl.MapExpImpl <em>Map Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QualityMetamodel.QMM_OCL.impl.MapExpImpl
		 * @see QualityMetamodel.QMM_OCL.impl.QMM_OCLPackageImpl#getMapExp()
		 * @generated
		 */
		EClass MAP_EXP = eINSTANCE.getMapExp();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAP_EXP__ELEMENTS = eINSTANCE.getMapExp_Elements();

		/**
		 * The meta object literal for the '{@link QualityMetamodel.QMM_OCL.impl.MapElementImpl <em>Map Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QualityMetamodel.QMM_OCL.impl.MapElementImpl
		 * @see QualityMetamodel.QMM_OCL.impl.QMM_OCLPackageImpl#getMapElement()
		 * @generated
		 */
		EClass MAP_ELEMENT = eINSTANCE.getMapElement();

		/**
		 * The meta object literal for the '<em><b>Map</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAP_ELEMENT__MAP = eINSTANCE.getMapElement_Map();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAP_ELEMENT__KEY = eINSTANCE.getMapElement_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAP_ELEMENT__VALUE = eINSTANCE.getMapElement_Value();

		/**
		 * The meta object literal for the '{@link QualityMetamodel.QMM_OCL.impl.EnumLiteralExpImpl <em>Enum Literal Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QualityMetamodel.QMM_OCL.impl.EnumLiteralExpImpl
		 * @see QualityMetamodel.QMM_OCL.impl.QMM_OCLPackageImpl#getEnumLiteralExp()
		 * @generated
		 */
		EClass ENUM_LITERAL_EXP = eINSTANCE.getEnumLiteralExp();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENUM_LITERAL_EXP__NAME = eINSTANCE.getEnumLiteralExp_Name();

		/**
		 * The meta object literal for the '{@link QualityMetamodel.QMM_OCL.impl.OclUndefinedExpImpl <em>Ocl Undefined Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QualityMetamodel.QMM_OCL.impl.OclUndefinedExpImpl
		 * @see QualityMetamodel.QMM_OCL.impl.QMM_OCLPackageImpl#getOclUndefinedExp()
		 * @generated
		 */
		EClass OCL_UNDEFINED_EXP = eINSTANCE.getOclUndefinedExp();

		/**
		 * The meta object literal for the '{@link QualityMetamodel.QMM_OCL.impl.StaticPropertyCallExpImpl <em>Static Property Call Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QualityMetamodel.QMM_OCL.impl.StaticPropertyCallExpImpl
		 * @see QualityMetamodel.QMM_OCL.impl.QMM_OCLPackageImpl#getStaticPropertyCallExp()
		 * @generated
		 */
		EClass STATIC_PROPERTY_CALL_EXP = eINSTANCE.getStaticPropertyCallExp();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATIC_PROPERTY_CALL_EXP__SOURCE = eINSTANCE.getStaticPropertyCallExp_Source();

		/**
		 * The meta object literal for the '<em><b>Static Call</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATIC_PROPERTY_CALL_EXP__STATIC_CALL = eINSTANCE.getStaticPropertyCallExp_StaticCall();

		/**
		 * The meta object literal for the '{@link QualityMetamodel.QMM_OCL.impl.StaticPropertyCallImpl <em>Static Property Call</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QualityMetamodel.QMM_OCL.impl.StaticPropertyCallImpl
		 * @see QualityMetamodel.QMM_OCL.impl.QMM_OCLPackageImpl#getStaticPropertyCall()
		 * @generated
		 */
		EClass STATIC_PROPERTY_CALL = eINSTANCE.getStaticPropertyCall();

		/**
		 * The meta object literal for the '<em><b>Static Call Exp</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATIC_PROPERTY_CALL__STATIC_CALL_EXP = eINSTANCE.getStaticPropertyCall_StaticCallExp();

		/**
		 * The meta object literal for the '{@link QualityMetamodel.QMM_OCL.impl.StaticNavigationOrAttributeCallImpl <em>Static Navigation Or Attribute Call</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QualityMetamodel.QMM_OCL.impl.StaticNavigationOrAttributeCallImpl
		 * @see QualityMetamodel.QMM_OCL.impl.QMM_OCLPackageImpl#getStaticNavigationOrAttributeCall()
		 * @generated
		 */
		EClass STATIC_NAVIGATION_OR_ATTRIBUTE_CALL = eINSTANCE.getStaticNavigationOrAttributeCall();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATIC_NAVIGATION_OR_ATTRIBUTE_CALL__NAME = eINSTANCE.getStaticNavigationOrAttributeCall_Name();

		/**
		 * The meta object literal for the '{@link QualityMetamodel.QMM_OCL.impl.StaticOperationCallImpl <em>Static Operation Call</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QualityMetamodel.QMM_OCL.impl.StaticOperationCallImpl
		 * @see QualityMetamodel.QMM_OCL.impl.QMM_OCLPackageImpl#getStaticOperationCall()
		 * @generated
		 */
		EClass STATIC_OPERATION_CALL = eINSTANCE.getStaticOperationCall();

		/**
		 * The meta object literal for the '<em><b>Arguments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATIC_OPERATION_CALL__ARGUMENTS = eINSTANCE.getStaticOperationCall_Arguments();

		/**
		 * The meta object literal for the '<em><b>Operation Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATIC_OPERATION_CALL__OPERATION_NAME = eINSTANCE.getStaticOperationCall_OperationName();

		/**
		 * The meta object literal for the '{@link QualityMetamodel.QMM_OCL.impl.PropertyCallExpImpl <em>Property Call Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QualityMetamodel.QMM_OCL.impl.PropertyCallExpImpl
		 * @see QualityMetamodel.QMM_OCL.impl.QMM_OCLPackageImpl#getPropertyCallExp()
		 * @generated
		 */
		EClass PROPERTY_CALL_EXP = eINSTANCE.getPropertyCallExp();

		/**
		 * The meta object literal for the '<em><b>Calls</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_CALL_EXP__CALLS = eINSTANCE.getPropertyCallExp_Calls();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_CALL_EXP__SOURCE = eINSTANCE.getPropertyCallExp_Source();

		/**
		 * The meta object literal for the '{@link QualityMetamodel.QMM_OCL.impl.PropertyCallImpl <em>Property Call</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QualityMetamodel.QMM_OCL.impl.PropertyCallImpl
		 * @see QualityMetamodel.QMM_OCL.impl.QMM_OCLPackageImpl#getPropertyCall()
		 * @generated
		 */
		EClass PROPERTY_CALL = eINSTANCE.getPropertyCall();

		/**
		 * The meta object literal for the '<em><b>Call Exp</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_CALL__CALL_EXP = eINSTANCE.getPropertyCall_CallExp();

		/**
		 * The meta object literal for the '{@link QualityMetamodel.QMM_OCL.impl.NavigationOrAttributeCallImpl <em>Navigation Or Attribute Call</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QualityMetamodel.QMM_OCL.impl.NavigationOrAttributeCallImpl
		 * @see QualityMetamodel.QMM_OCL.impl.QMM_OCLPackageImpl#getNavigationOrAttributeCall()
		 * @generated
		 */
		EClass NAVIGATION_OR_ATTRIBUTE_CALL = eINSTANCE.getNavigationOrAttributeCall();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAVIGATION_OR_ATTRIBUTE_CALL__NAME = eINSTANCE.getNavigationOrAttributeCall_Name();

		/**
		 * The meta object literal for the '{@link QualityMetamodel.QMM_OCL.impl.OperationCallImpl <em>Operation Call</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QualityMetamodel.QMM_OCL.impl.OperationCallImpl
		 * @see QualityMetamodel.QMM_OCL.impl.QMM_OCLPackageImpl#getOperationCall()
		 * @generated
		 */
		EClass OPERATION_CALL = eINSTANCE.getOperationCall();

		/**
		 * The meta object literal for the '<em><b>Arguments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION_CALL__ARGUMENTS = eINSTANCE.getOperationCall_Arguments();

		/**
		 * The meta object literal for the '<em><b>Operation Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION_CALL__OPERATION_NAME = eINSTANCE.getOperationCall_OperationName();

		/**
		 * The meta object literal for the '{@link QualityMetamodel.QMM_OCL.impl.OperatorCallExpImpl <em>Operator Call Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QualityMetamodel.QMM_OCL.impl.OperatorCallExpImpl
		 * @see QualityMetamodel.QMM_OCL.impl.QMM_OCLPackageImpl#getOperatorCallExp()
		 * @generated
		 */
		EClass OPERATOR_CALL_EXP = eINSTANCE.getOperatorCallExp();

		/**
		 * The meta object literal for the '<em><b>Argument</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATOR_CALL_EXP__ARGUMENT = eINSTANCE.getOperatorCallExp_Argument();

		/**
		 * The meta object literal for the '<em><b>Operation Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATOR_CALL_EXP__OPERATION_NAME = eINSTANCE.getOperatorCallExp_OperationName();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATOR_CALL_EXP__SOURCE = eINSTANCE.getOperatorCallExp_Source();

		/**
		 * The meta object literal for the '{@link QualityMetamodel.QMM_OCL.impl.NotOpCallExpImpl <em>Not Op Call Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QualityMetamodel.QMM_OCL.impl.NotOpCallExpImpl
		 * @see QualityMetamodel.QMM_OCL.impl.QMM_OCLPackageImpl#getNotOpCallExp()
		 * @generated
		 */
		EClass NOT_OP_CALL_EXP = eINSTANCE.getNotOpCallExp();

		/**
		 * The meta object literal for the '{@link QualityMetamodel.QMM_OCL.impl.RelOpCallExpImpl <em>Rel Op Call Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QualityMetamodel.QMM_OCL.impl.RelOpCallExpImpl
		 * @see QualityMetamodel.QMM_OCL.impl.QMM_OCLPackageImpl#getRelOpCallExp()
		 * @generated
		 */
		EClass REL_OP_CALL_EXP = eINSTANCE.getRelOpCallExp();

		/**
		 * The meta object literal for the '{@link QualityMetamodel.QMM_OCL.impl.EqOpCallExpImpl <em>Eq Op Call Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QualityMetamodel.QMM_OCL.impl.EqOpCallExpImpl
		 * @see QualityMetamodel.QMM_OCL.impl.QMM_OCLPackageImpl#getEqOpCallExp()
		 * @generated
		 */
		EClass EQ_OP_CALL_EXP = eINSTANCE.getEqOpCallExp();

		/**
		 * The meta object literal for the '{@link QualityMetamodel.QMM_OCL.impl.AddOpCallExpImpl <em>Add Op Call Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QualityMetamodel.QMM_OCL.impl.AddOpCallExpImpl
		 * @see QualityMetamodel.QMM_OCL.impl.QMM_OCLPackageImpl#getAddOpCallExp()
		 * @generated
		 */
		EClass ADD_OP_CALL_EXP = eINSTANCE.getAddOpCallExp();

		/**
		 * The meta object literal for the '{@link QualityMetamodel.QMM_OCL.impl.IntOpCallExpImpl <em>Int Op Call Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QualityMetamodel.QMM_OCL.impl.IntOpCallExpImpl
		 * @see QualityMetamodel.QMM_OCL.impl.QMM_OCLPackageImpl#getIntOpCallExp()
		 * @generated
		 */
		EClass INT_OP_CALL_EXP = eINSTANCE.getIntOpCallExp();

		/**
		 * The meta object literal for the '{@link QualityMetamodel.QMM_OCL.impl.MulOpCallExpImpl <em>Mul Op Call Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QualityMetamodel.QMM_OCL.impl.MulOpCallExpImpl
		 * @see QualityMetamodel.QMM_OCL.impl.QMM_OCLPackageImpl#getMulOpCallExp()
		 * @generated
		 */
		EClass MUL_OP_CALL_EXP = eINSTANCE.getMulOpCallExp();

		/**
		 * The meta object literal for the '{@link QualityMetamodel.QMM_OCL.impl.LambdaCallExpImpl <em>Lambda Call Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QualityMetamodel.QMM_OCL.impl.LambdaCallExpImpl
		 * @see QualityMetamodel.QMM_OCL.impl.QMM_OCLPackageImpl#getLambdaCallExp()
		 * @generated
		 */
		EClass LAMBDA_CALL_EXP = eINSTANCE.getLambdaCallExp();

		/**
		 * The meta object literal for the '<em><b>Arguments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAMBDA_CALL_EXP__ARGUMENTS = eINSTANCE.getLambdaCallExp_Arguments();

		/**
		 * The meta object literal for the '{@link QualityMetamodel.QMM_OCL.impl.BraceExpImpl <em>Brace Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QualityMetamodel.QMM_OCL.impl.BraceExpImpl
		 * @see QualityMetamodel.QMM_OCL.impl.QMM_OCLPackageImpl#getBraceExp()
		 * @generated
		 */
		EClass BRACE_EXP = eINSTANCE.getBraceExp();

		/**
		 * The meta object literal for the '<em><b>Exp</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BRACE_EXP__EXP = eINSTANCE.getBraceExp_Exp();

		/**
		 * The meta object literal for the '{@link QualityMetamodel.QMM_OCL.impl.CollectionOperationCallImpl <em>Collection Operation Call</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QualityMetamodel.QMM_OCL.impl.CollectionOperationCallImpl
		 * @see QualityMetamodel.QMM_OCL.impl.QMM_OCLPackageImpl#getCollectionOperationCall()
		 * @generated
		 */
		EClass COLLECTION_OPERATION_CALL = eINSTANCE.getCollectionOperationCall();

		/**
		 * The meta object literal for the '{@link QualityMetamodel.QMM_OCL.impl.LoopExpImpl <em>Loop Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QualityMetamodel.QMM_OCL.impl.LoopExpImpl
		 * @see QualityMetamodel.QMM_OCL.impl.QMM_OCLPackageImpl#getLoopExp()
		 * @generated
		 */
		EClass LOOP_EXP = eINSTANCE.getLoopExp();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOOP_EXP__BODY = eINSTANCE.getLoopExp_Body();

		/**
		 * The meta object literal for the '<em><b>Iterators</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOOP_EXP__ITERATORS = eINSTANCE.getLoopExp_Iterators();

		/**
		 * The meta object literal for the '{@link QualityMetamodel.QMM_OCL.impl.IterateExpImpl <em>Iterate Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QualityMetamodel.QMM_OCL.impl.IterateExpImpl
		 * @see QualityMetamodel.QMM_OCL.impl.QMM_OCLPackageImpl#getIterateExp()
		 * @generated
		 */
		EClass ITERATE_EXP = eINSTANCE.getIterateExp();

		/**
		 * The meta object literal for the '<em><b>Result</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITERATE_EXP__RESULT = eINSTANCE.getIterateExp_Result();

		/**
		 * The meta object literal for the '{@link QualityMetamodel.QMM_OCL.impl.IteratorExpImpl <em>Iterator Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QualityMetamodel.QMM_OCL.impl.IteratorExpImpl
		 * @see QualityMetamodel.QMM_OCL.impl.QMM_OCLPackageImpl#getIteratorExp()
		 * @generated
		 */
		EClass ITERATOR_EXP = eINSTANCE.getIteratorExp();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITERATOR_EXP__NAME = eINSTANCE.getIteratorExp_Name();

		/**
		 * The meta object literal for the '{@link QualityMetamodel.QMM_OCL.impl.LetExpImpl <em>Let Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QualityMetamodel.QMM_OCL.impl.LetExpImpl
		 * @see QualityMetamodel.QMM_OCL.impl.QMM_OCLPackageImpl#getLetExp()
		 * @generated
		 */
		EClass LET_EXP = eINSTANCE.getLetExp();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LET_EXP__VARIABLE = eINSTANCE.getLetExp_Variable();

		/**
		 * The meta object literal for the '<em><b>In </b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LET_EXP__IN_ = eINSTANCE.getLetExp_In_();

		/**
		 * The meta object literal for the '{@link QualityMetamodel.QMM_OCL.impl.IfExpImpl <em>If Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QualityMetamodel.QMM_OCL.impl.IfExpImpl
		 * @see QualityMetamodel.QMM_OCL.impl.QMM_OCLPackageImpl#getIfExp()
		 * @generated
		 */
		EClass IF_EXP = eINSTANCE.getIfExp();

		/**
		 * The meta object literal for the '<em><b>Then Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF_EXP__THEN_EXPRESSION = eINSTANCE.getIfExp_ThenExpression();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF_EXP__CONDITION = eINSTANCE.getIfExp_Condition();

		/**
		 * The meta object literal for the '<em><b>Else Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF_EXP__ELSE_EXPRESSION = eINSTANCE.getIfExp_ElseExpression();

		/**
		 * The meta object literal for the '{@link QualityMetamodel.QMM_OCL.impl.VariableDeclarationImpl <em>Variable Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QualityMetamodel.QMM_OCL.impl.VariableDeclarationImpl
		 * @see QualityMetamodel.QMM_OCL.impl.QMM_OCLPackageImpl#getVariableDeclaration()
		 * @generated
		 */
		EClass VARIABLE_DECLARATION = eINSTANCE.getVariableDeclaration();

		/**
		 * The meta object literal for the '<em><b>Var Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE_DECLARATION__VAR_NAME = eINSTANCE.getVariableDeclaration_VarName();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE_DECLARATION__TYPE = eINSTANCE.getVariableDeclaration_Type();

		/**
		 * The meta object literal for the '<em><b>Variable Exp</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE_DECLARATION__VARIABLE_EXP = eINSTANCE.getVariableDeclaration_VariableExp();

		/**
		 * The meta object literal for the '{@link QualityMetamodel.QMM_OCL.impl.LocalVariableImpl <em>Local Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QualityMetamodel.QMM_OCL.impl.LocalVariableImpl
		 * @see QualityMetamodel.QMM_OCL.impl.QMM_OCLPackageImpl#getLocalVariable()
		 * @generated
		 */
		EClass LOCAL_VARIABLE = eINSTANCE.getLocalVariable();

		/**
		 * The meta object literal for the '<em><b>Let Exp</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCAL_VARIABLE__LET_EXP = eINSTANCE.getLocalVariable_LetExp();

		/**
		 * The meta object literal for the '<em><b>Init Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCAL_VARIABLE__INIT_EXPRESSION = eINSTANCE.getLocalVariable_InitExpression();

		/**
		 * The meta object literal for the '<em><b>Base Exp</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCAL_VARIABLE__BASE_EXP = eINSTANCE.getLocalVariable_BaseExp();

		/**
		 * The meta object literal for the '<em><b>Eq</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCAL_VARIABLE__EQ = eINSTANCE.getLocalVariable_Eq();

		/**
		 * The meta object literal for the '{@link QualityMetamodel.QMM_OCL.impl.IteratorImpl <em>Iterator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QualityMetamodel.QMM_OCL.impl.IteratorImpl
		 * @see QualityMetamodel.QMM_OCL.impl.QMM_OCLPackageImpl#getIterator()
		 * @generated
		 */
		EClass ITERATOR = eINSTANCE.getIterator();

		/**
		 * The meta object literal for the '<em><b>Loop Expr</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITERATOR__LOOP_EXPR = eINSTANCE.getIterator_LoopExpr();

		/**
		 * The meta object literal for the '{@link QualityMetamodel.QMM_OCL.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QualityMetamodel.QMM_OCL.impl.ParameterImpl
		 * @see QualityMetamodel.QMM_OCL.impl.QMM_OCLPackageImpl#getParameter()
		 * @generated
		 */
		EClass PARAMETER = eINSTANCE.getParameter();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER__OPERATION = eINSTANCE.getParameter_Operation();

		/**
		 * The meta object literal for the '{@link QualityMetamodel.QMM_OCL.impl.CollectionTypeImpl <em>Collection Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QualityMetamodel.QMM_OCL.impl.CollectionTypeImpl
		 * @see QualityMetamodel.QMM_OCL.impl.QMM_OCLPackageImpl#getCollectionType()
		 * @generated
		 */
		EClass COLLECTION_TYPE = eINSTANCE.getCollectionType();

		/**
		 * The meta object literal for the '<em><b>Element Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLLECTION_TYPE__ELEMENT_TYPE = eINSTANCE.getCollectionType_ElementType();

		/**
		 * The meta object literal for the '{@link QualityMetamodel.QMM_OCL.impl.OclTypeImpl <em>Ocl Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QualityMetamodel.QMM_OCL.impl.OclTypeImpl
		 * @see QualityMetamodel.QMM_OCL.impl.QMM_OCLPackageImpl#getOclType()
		 * @generated
		 */
		EClass OCL_TYPE = eINSTANCE.getOclType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OCL_TYPE__NAME = eINSTANCE.getOclType_Name();

		/**
		 * The meta object literal for the '<em><b>Definitions</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OCL_TYPE__DEFINITIONS = eINSTANCE.getOclType_Definitions();

		/**
		 * The meta object literal for the '<em><b>Ocl Expression</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OCL_TYPE__OCL_EXPRESSION = eINSTANCE.getOclType_OclExpression();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OCL_TYPE__OPERATION = eINSTANCE.getOclType_Operation();

		/**
		 * The meta object literal for the '<em><b>Map Type2</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OCL_TYPE__MAP_TYPE2 = eINSTANCE.getOclType_MapType2();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OCL_TYPE__ATTRIBUTE = eINSTANCE.getOclType_Attribute();

		/**
		 * The meta object literal for the '<em><b>Map Type</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OCL_TYPE__MAP_TYPE = eINSTANCE.getOclType_MapType();

		/**
		 * The meta object literal for the '<em><b>Collection Types</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OCL_TYPE__COLLECTION_TYPES = eINSTANCE.getOclType_CollectionTypes();

		/**
		 * The meta object literal for the '<em><b>Tuple Type Attribute</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OCL_TYPE__TUPLE_TYPE_ATTRIBUTE = eINSTANCE.getOclType_TupleTypeAttribute();

		/**
		 * The meta object literal for the '<em><b>Variable Declaration</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OCL_TYPE__VARIABLE_DECLARATION = eINSTANCE.getOclType_VariableDeclaration();

		/**
		 * The meta object literal for the '<em><b>Lambda Return Type</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OCL_TYPE__LAMBDA_RETURN_TYPE = eINSTANCE.getOclType_LambdaReturnType();

		/**
		 * The meta object literal for the '<em><b>Lambda Arg Type</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OCL_TYPE__LAMBDA_ARG_TYPE = eINSTANCE.getOclType_LambdaArgType();

		/**
		 * The meta object literal for the '<em><b>Static Property Call</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OCL_TYPE__STATIC_PROPERTY_CALL = eINSTANCE.getOclType_StaticPropertyCall();

		/**
		 * The meta object literal for the '{@link QualityMetamodel.QMM_OCL.impl.OclModelElementExpImpl <em>Ocl Model Element Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QualityMetamodel.QMM_OCL.impl.OclModelElementExpImpl
		 * @see QualityMetamodel.QMM_OCL.impl.QMM_OCLPackageImpl#getOclModelElementExp()
		 * @generated
		 */
		EClass OCL_MODEL_ELEMENT_EXP = eINSTANCE.getOclModelElementExp();

		/**
		 * The meta object literal for the '<em><b>Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OCL_MODEL_ELEMENT_EXP__MODEL = eINSTANCE.getOclModelElementExp_Model();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OCL_MODEL_ELEMENT_EXP__NAME = eINSTANCE.getOclModelElementExp_Name();

		/**
		 * The meta object literal for the '{@link QualityMetamodel.QMM_OCL.impl.PrimitiveImpl <em>Primitive</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QualityMetamodel.QMM_OCL.impl.PrimitiveImpl
		 * @see QualityMetamodel.QMM_OCL.impl.QMM_OCLPackageImpl#getPrimitive()
		 * @generated
		 */
		EClass PRIMITIVE = eINSTANCE.getPrimitive();

		/**
		 * The meta object literal for the '{@link QualityMetamodel.QMM_OCL.impl.StringTypeImpl <em>String Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QualityMetamodel.QMM_OCL.impl.StringTypeImpl
		 * @see QualityMetamodel.QMM_OCL.impl.QMM_OCLPackageImpl#getStringType()
		 * @generated
		 */
		EClass STRING_TYPE = eINSTANCE.getStringType();

		/**
		 * The meta object literal for the '{@link QualityMetamodel.QMM_OCL.impl.BooleanTypeImpl <em>Boolean Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QualityMetamodel.QMM_OCL.impl.BooleanTypeImpl
		 * @see QualityMetamodel.QMM_OCL.impl.QMM_OCLPackageImpl#getBooleanType()
		 * @generated
		 */
		EClass BOOLEAN_TYPE = eINSTANCE.getBooleanType();

		/**
		 * The meta object literal for the '{@link QualityMetamodel.QMM_OCL.impl.NumericTypeImpl <em>Numeric Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QualityMetamodel.QMM_OCL.impl.NumericTypeImpl
		 * @see QualityMetamodel.QMM_OCL.impl.QMM_OCLPackageImpl#getNumericType()
		 * @generated
		 */
		EClass NUMERIC_TYPE = eINSTANCE.getNumericType();

		/**
		 * The meta object literal for the '{@link QualityMetamodel.QMM_OCL.impl.IntegerTypeImpl <em>Integer Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QualityMetamodel.QMM_OCL.impl.IntegerTypeImpl
		 * @see QualityMetamodel.QMM_OCL.impl.QMM_OCLPackageImpl#getIntegerType()
		 * @generated
		 */
		EClass INTEGER_TYPE = eINSTANCE.getIntegerType();

		/**
		 * The meta object literal for the '{@link QualityMetamodel.QMM_OCL.impl.RealTypeImpl <em>Real Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QualityMetamodel.QMM_OCL.impl.RealTypeImpl
		 * @see QualityMetamodel.QMM_OCL.impl.QMM_OCLPackageImpl#getRealType()
		 * @generated
		 */
		EClass REAL_TYPE = eINSTANCE.getRealType();

		/**
		 * The meta object literal for the '{@link QualityMetamodel.QMM_OCL.impl.BagTypeImpl <em>Bag Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QualityMetamodel.QMM_OCL.impl.BagTypeImpl
		 * @see QualityMetamodel.QMM_OCL.impl.QMM_OCLPackageImpl#getBagType()
		 * @generated
		 */
		EClass BAG_TYPE = eINSTANCE.getBagType();

		/**
		 * The meta object literal for the '{@link QualityMetamodel.QMM_OCL.impl.OrderedSetTypeImpl <em>Ordered Set Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QualityMetamodel.QMM_OCL.impl.OrderedSetTypeImpl
		 * @see QualityMetamodel.QMM_OCL.impl.QMM_OCLPackageImpl#getOrderedSetType()
		 * @generated
		 */
		EClass ORDERED_SET_TYPE = eINSTANCE.getOrderedSetType();

		/**
		 * The meta object literal for the '{@link QualityMetamodel.QMM_OCL.impl.SequenceTypeImpl <em>Sequence Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QualityMetamodel.QMM_OCL.impl.SequenceTypeImpl
		 * @see QualityMetamodel.QMM_OCL.impl.QMM_OCLPackageImpl#getSequenceType()
		 * @generated
		 */
		EClass SEQUENCE_TYPE = eINSTANCE.getSequenceType();

		/**
		 * The meta object literal for the '{@link QualityMetamodel.QMM_OCL.impl.SetTypeImpl <em>Set Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QualityMetamodel.QMM_OCL.impl.SetTypeImpl
		 * @see QualityMetamodel.QMM_OCL.impl.QMM_OCLPackageImpl#getSetType()
		 * @generated
		 */
		EClass SET_TYPE = eINSTANCE.getSetType();

		/**
		 * The meta object literal for the '{@link QualityMetamodel.QMM_OCL.impl.OclAnyTypeImpl <em>Ocl Any Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QualityMetamodel.QMM_OCL.impl.OclAnyTypeImpl
		 * @see QualityMetamodel.QMM_OCL.impl.QMM_OCLPackageImpl#getOclAnyType()
		 * @generated
		 */
		EClass OCL_ANY_TYPE = eINSTANCE.getOclAnyType();

		/**
		 * The meta object literal for the '{@link QualityMetamodel.QMM_OCL.impl.TupleTypeImpl <em>Tuple Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QualityMetamodel.QMM_OCL.impl.TupleTypeImpl
		 * @see QualityMetamodel.QMM_OCL.impl.QMM_OCLPackageImpl#getTupleType()
		 * @generated
		 */
		EClass TUPLE_TYPE = eINSTANCE.getTupleType();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TUPLE_TYPE__ATTRIBUTES = eINSTANCE.getTupleType_Attributes();

		/**
		 * The meta object literal for the '{@link QualityMetamodel.QMM_OCL.impl.TupleTypeAttributeImpl <em>Tuple Type Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QualityMetamodel.QMM_OCL.impl.TupleTypeAttributeImpl
		 * @see QualityMetamodel.QMM_OCL.impl.QMM_OCLPackageImpl#getTupleTypeAttribute()
		 * @generated
		 */
		EClass TUPLE_TYPE_ATTRIBUTE = eINSTANCE.getTupleTypeAttribute();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TUPLE_TYPE_ATTRIBUTE__TYPE = eINSTANCE.getTupleTypeAttribute_Type();

		/**
		 * The meta object literal for the '<em><b>Tuple Type</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TUPLE_TYPE_ATTRIBUTE__TUPLE_TYPE = eINSTANCE.getTupleTypeAttribute_TupleType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TUPLE_TYPE_ATTRIBUTE__NAME = eINSTANCE.getTupleTypeAttribute_Name();

		/**
		 * The meta object literal for the '{@link QualityMetamodel.QMM_OCL.impl.OclModelElementImpl <em>Ocl Model Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QualityMetamodel.QMM_OCL.impl.OclModelElementImpl
		 * @see QualityMetamodel.QMM_OCL.impl.QMM_OCLPackageImpl#getOclModelElement()
		 * @generated
		 */
		EClass OCL_MODEL_ELEMENT = eINSTANCE.getOclModelElement();

		/**
		 * The meta object literal for the '<em><b>Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OCL_MODEL_ELEMENT__MODEL = eINSTANCE.getOclModelElement_Model();

		/**
		 * The meta object literal for the '{@link QualityMetamodel.QMM_OCL.impl.MapTypeImpl <em>Map Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QualityMetamodel.QMM_OCL.impl.MapTypeImpl
		 * @see QualityMetamodel.QMM_OCL.impl.QMM_OCLPackageImpl#getMapType()
		 * @generated
		 */
		EClass MAP_TYPE = eINSTANCE.getMapType();

		/**
		 * The meta object literal for the '<em><b>Value Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAP_TYPE__VALUE_TYPE = eINSTANCE.getMapType_ValueType();

		/**
		 * The meta object literal for the '<em><b>Key Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAP_TYPE__KEY_TYPE = eINSTANCE.getMapType_KeyType();

		/**
		 * The meta object literal for the '{@link QualityMetamodel.QMM_OCL.impl.LambdaTypeImpl <em>Lambda Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QualityMetamodel.QMM_OCL.impl.LambdaTypeImpl
		 * @see QualityMetamodel.QMM_OCL.impl.QMM_OCLPackageImpl#getLambdaType()
		 * @generated
		 */
		EClass LAMBDA_TYPE = eINSTANCE.getLambdaType();

		/**
		 * The meta object literal for the '<em><b>Return Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAMBDA_TYPE__RETURN_TYPE = eINSTANCE.getLambdaType_ReturnType();

		/**
		 * The meta object literal for the '<em><b>Argument Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAMBDA_TYPE__ARGUMENT_TYPES = eINSTANCE.getLambdaType_ArgumentTypes();

		/**
		 * The meta object literal for the '{@link QualityMetamodel.QMM_OCL.impl.EnvTypeImpl <em>Env Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QualityMetamodel.QMM_OCL.impl.EnvTypeImpl
		 * @see QualityMetamodel.QMM_OCL.impl.QMM_OCLPackageImpl#getEnvType()
		 * @generated
		 */
		EClass ENV_TYPE = eINSTANCE.getEnvType();

		/**
		 * The meta object literal for the '{@link QualityMetamodel.QMM_OCL.impl.OclFeatureDefinitionImpl <em>Ocl Feature Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QualityMetamodel.QMM_OCL.impl.OclFeatureDefinitionImpl
		 * @see QualityMetamodel.QMM_OCL.impl.QMM_OCLPackageImpl#getOclFeatureDefinition()
		 * @generated
		 */
		EClass OCL_FEATURE_DEFINITION = eINSTANCE.getOclFeatureDefinition();

		/**
		 * The meta object literal for the '<em><b>Feature</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OCL_FEATURE_DEFINITION__FEATURE = eINSTANCE.getOclFeatureDefinition_Feature();

		/**
		 * The meta object literal for the '<em><b>Context </b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OCL_FEATURE_DEFINITION__CONTEXT_ = eINSTANCE.getOclFeatureDefinition_Context_();

		/**
		 * The meta object literal for the '<em><b>Static</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OCL_FEATURE_DEFINITION__STATIC = eINSTANCE.getOclFeatureDefinition_Static();

		/**
		 * The meta object literal for the '{@link QualityMetamodel.QMM_OCL.impl.OclContextDefinitionImpl <em>Ocl Context Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QualityMetamodel.QMM_OCL.impl.OclContextDefinitionImpl
		 * @see QualityMetamodel.QMM_OCL.impl.QMM_OCLPackageImpl#getOclContextDefinition()
		 * @generated
		 */
		EClass OCL_CONTEXT_DEFINITION = eINSTANCE.getOclContextDefinition();

		/**
		 * The meta object literal for the '<em><b>Definition</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OCL_CONTEXT_DEFINITION__DEFINITION = eINSTANCE.getOclContextDefinition_Definition();

		/**
		 * The meta object literal for the '<em><b>Context </b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OCL_CONTEXT_DEFINITION__CONTEXT_ = eINSTANCE.getOclContextDefinition_Context_();

		/**
		 * The meta object literal for the '{@link QualityMetamodel.QMM_OCL.impl.OclFeatureImpl <em>Ocl Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QualityMetamodel.QMM_OCL.impl.OclFeatureImpl
		 * @see QualityMetamodel.QMM_OCL.impl.QMM_OCLPackageImpl#getOclFeature()
		 * @generated
		 */
		EClass OCL_FEATURE = eINSTANCE.getOclFeature();

		/**
		 * The meta object literal for the '<em><b>Definition</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OCL_FEATURE__DEFINITION = eINSTANCE.getOclFeature_Definition();

		/**
		 * The meta object literal for the '<em><b>Eq</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OCL_FEATURE__EQ = eINSTANCE.getOclFeature_Eq();

		/**
		 * The meta object literal for the '{@link QualityMetamodel.QMM_OCL.impl.AttributeImpl <em>Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QualityMetamodel.QMM_OCL.impl.AttributeImpl
		 * @see QualityMetamodel.QMM_OCL.impl.QMM_OCLPackageImpl#getAttribute()
		 * @generated
		 */
		EClass ATTRIBUTE = eINSTANCE.getAttribute();

		/**
		 * The meta object literal for the '<em><b>Init Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE__INIT_EXPRESSION = eINSTANCE.getAttribute_InitExpression();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE__TYPE = eINSTANCE.getAttribute_Type();

		/**
		 * The meta object literal for the '{@link QualityMetamodel.QMM_OCL.impl.OperationImpl <em>Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QualityMetamodel.QMM_OCL.impl.OperationImpl
		 * @see QualityMetamodel.QMM_OCL.impl.QMM_OCLPackageImpl#getOperation()
		 * @generated
		 */
		EClass OPERATION = eINSTANCE.getOperation();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION__PARAMETERS = eINSTANCE.getOperation_Parameters();

		/**
		 * The meta object literal for the '<em><b>Return Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION__RETURN_TYPE = eINSTANCE.getOperation_ReturnType();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION__BODY = eINSTANCE.getOperation_Body();

		/**
		 * The meta object literal for the '{@link QualityMetamodel.QMM_OCL.impl.OclModelImpl <em>Ocl Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QualityMetamodel.QMM_OCL.impl.OclModelImpl
		 * @see QualityMetamodel.QMM_OCL.impl.QMM_OCLPackageImpl#getOclModel()
		 * @generated
		 */
		EClass OCL_MODEL = eINSTANCE.getOclModel();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OCL_MODEL__ELEMENTS = eINSTANCE.getOclModel_Elements();

		/**
		 * The meta object literal for the '{@link QualityMetamodel.QMM_OCL.impl.OclMetamodelImpl <em>Ocl Metamodel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QualityMetamodel.QMM_OCL.impl.OclMetamodelImpl
		 * @see QualityMetamodel.QMM_OCL.impl.QMM_OCLPackageImpl#getOclMetamodel()
		 * @generated
		 */
		EClass OCL_METAMODEL = eINSTANCE.getOclMetamodel();

		/**
		 * The meta object literal for the '<em><b>Model</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OCL_METAMODEL__MODEL = eINSTANCE.getOclMetamodel_Model();

		/**
		 * The meta object literal for the '<em><b>Uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OCL_METAMODEL__URI = eINSTANCE.getOclMetamodel_Uri();

		/**
		 * The meta object literal for the '{@link QualityMetamodel.QMM_OCL.impl.OclInstanceModelImpl <em>Ocl Instance Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QualityMetamodel.QMM_OCL.impl.OclInstanceModelImpl
		 * @see QualityMetamodel.QMM_OCL.impl.QMM_OCLPackageImpl#getOclInstanceModel()
		 * @generated
		 */
		EClass OCL_INSTANCE_MODEL = eINSTANCE.getOclInstanceModel();

		/**
		 * The meta object literal for the '<em><b>Metamodel</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OCL_INSTANCE_MODEL__METAMODEL = eINSTANCE.getOclInstanceModel_Metamodel();

		/**
		 * The meta object literal for the '<em>Boolean</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QualityMetamodel.QMM_OCL.impl.QMM_OCLPackageImpl#getBoolean()
		 * @generated
		 */
		EDataType BOOLEAN = eINSTANCE.getBoolean();

		/**
		 * The meta object literal for the '<em>Double</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QualityMetamodel.QMM_OCL.impl.QMM_OCLPackageImpl#getDouble()
		 * @generated
		 */
		EDataType DOUBLE = eINSTANCE.getDouble();

		/**
		 * The meta object literal for the '<em>Integer</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QualityMetamodel.QMM_OCL.impl.QMM_OCLPackageImpl#getInteger()
		 * @generated
		 */
		EDataType INTEGER = eINSTANCE.getInteger();

		/**
		 * The meta object literal for the '<em>String</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see QualityMetamodel.QMM_OCL.impl.QMM_OCLPackageImpl#getString()
		 * @generated
		 */
		EDataType STRING = eINSTANCE.getString();

	}

} //QMM_OCLPackage
