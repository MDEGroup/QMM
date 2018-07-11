/**
 */
package QualityMetamodel.QMM_OCL.impl;

import QualityMetamodel.QMM_OCL.AddOpCallExp;
import QualityMetamodel.QMM_OCL.Attribute;
import QualityMetamodel.QMM_OCL.BagExp;
import QualityMetamodel.QMM_OCL.BagType;
import QualityMetamodel.QMM_OCL.BooleanExp;
import QualityMetamodel.QMM_OCL.BooleanType;
import QualityMetamodel.QMM_OCL.BraceExp;
import QualityMetamodel.QMM_OCL.CollectionExp;
import QualityMetamodel.QMM_OCL.CollectionItem;
import QualityMetamodel.QMM_OCL.CollectionOperationCall;
import QualityMetamodel.QMM_OCL.CollectionPart;
import QualityMetamodel.QMM_OCL.CollectionRange;
import QualityMetamodel.QMM_OCL.CollectionType;
import QualityMetamodel.QMM_OCL.EnumLiteralExp;
import QualityMetamodel.QMM_OCL.EnvExp;
import QualityMetamodel.QMM_OCL.EnvType;
import QualityMetamodel.QMM_OCL.EqOpCallExp;
import QualityMetamodel.QMM_OCL.IfExp;
import QualityMetamodel.QMM_OCL.Import;
import QualityMetamodel.QMM_OCL.IntOpCallExp;
import QualityMetamodel.QMM_OCL.IntegerExp;
import QualityMetamodel.QMM_OCL.IntegerType;
import QualityMetamodel.QMM_OCL.IterateExp;
import QualityMetamodel.QMM_OCL.Iterator;
import QualityMetamodel.QMM_OCL.IteratorExp;
import QualityMetamodel.QMM_OCL.LambdaCallExp;
import QualityMetamodel.QMM_OCL.LambdaType;
import QualityMetamodel.QMM_OCL.LetExp;
import QualityMetamodel.QMM_OCL.LocalVariable;
import QualityMetamodel.QMM_OCL.LocatedElement;
import QualityMetamodel.QMM_OCL.LoopExp;
import QualityMetamodel.QMM_OCL.MapElement;
import QualityMetamodel.QMM_OCL.MapExp;
import QualityMetamodel.QMM_OCL.MapType;
import QualityMetamodel.QMM_OCL.Module;
import QualityMetamodel.QMM_OCL.ModuleElement;
import QualityMetamodel.QMM_OCL.MulOpCallExp;
import QualityMetamodel.QMM_OCL.NamedElement;
import QualityMetamodel.QMM_OCL.NavigationOrAttributeCall;
import QualityMetamodel.QMM_OCL.NotOpCallExp;
import QualityMetamodel.QMM_OCL.NumericExp;
import QualityMetamodel.QMM_OCL.NumericType;
import QualityMetamodel.QMM_OCL.OclAnyType;
import QualityMetamodel.QMM_OCL.OclContextDefinition;
import QualityMetamodel.QMM_OCL.OclExpression;
import QualityMetamodel.QMM_OCL.OclFeature;
import QualityMetamodel.QMM_OCL.OclFeatureDefinition;
import QualityMetamodel.QMM_OCL.OclInstanceModel;
import QualityMetamodel.QMM_OCL.OclMetamodel;
import QualityMetamodel.QMM_OCL.OclModel;
import QualityMetamodel.QMM_OCL.OclModelElement;
import QualityMetamodel.QMM_OCL.OclModelElementExp;
import QualityMetamodel.QMM_OCL.OclType;
import QualityMetamodel.QMM_OCL.OclUndefinedExp;
import QualityMetamodel.QMM_OCL.Operation;
import QualityMetamodel.QMM_OCL.OperationCall;
import QualityMetamodel.QMM_OCL.OperatorCallExp;
import QualityMetamodel.QMM_OCL.OrderedSetExp;
import QualityMetamodel.QMM_OCL.OrderedSetType;
import QualityMetamodel.QMM_OCL.Parameter;
import QualityMetamodel.QMM_OCL.Primitive;
import QualityMetamodel.QMM_OCL.PrimitiveExp;
import QualityMetamodel.QMM_OCL.PropertyCall;
import QualityMetamodel.QMM_OCL.PropertyCallExp;
import QualityMetamodel.QMM_OCL.QMM_OCLFactory;
import QualityMetamodel.QMM_OCL.QMM_OCLPackage;
import QualityMetamodel.QMM_OCL.RealExp;
import QualityMetamodel.QMM_OCL.RealType;
import QualityMetamodel.QMM_OCL.RelOpCallExp;
import QualityMetamodel.QMM_OCL.SelfExp;
import QualityMetamodel.QMM_OCL.SequenceExp;
import QualityMetamodel.QMM_OCL.SequenceType;
import QualityMetamodel.QMM_OCL.SetExp;
import QualityMetamodel.QMM_OCL.SetType;
import QualityMetamodel.QMM_OCL.StaticNavigationOrAttributeCall;
import QualityMetamodel.QMM_OCL.StaticOperationCall;
import QualityMetamodel.QMM_OCL.StaticPropertyCall;
import QualityMetamodel.QMM_OCL.StaticPropertyCallExp;
import QualityMetamodel.QMM_OCL.StringExp;
import QualityMetamodel.QMM_OCL.StringType;
import QualityMetamodel.QMM_OCL.SuperExp;
import QualityMetamodel.QMM_OCL.TupleExp;
import QualityMetamodel.QMM_OCL.TuplePart;
import QualityMetamodel.QMM_OCL.TupleType;
import QualityMetamodel.QMM_OCL.TupleTypeAttribute;
import QualityMetamodel.QMM_OCL.VariableDeclaration;
import QualityMetamodel.QMM_OCL.VariableExp;

import QualityMetamodel.QualityMetamodelPackage;

import QualityMetamodel.impl.QualityMetamodelPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class QMM_OCLPackageImpl extends EPackageImpl implements QMM_OCLPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass locatedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass moduleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass moduleElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass importEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oclExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableExpEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass superExpEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass selfExpEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass envExpEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass primitiveExpEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringExpEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanExpEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass numericExpEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass realExpEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integerExpEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass collectionExpEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass collectionPartEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass collectionRangeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass collectionItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bagExpEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orderedSetExpEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sequenceExpEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass setExpEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tupleExpEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tuplePartEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mapExpEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mapElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumLiteralExpEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oclUndefinedExpEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass staticPropertyCallExpEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass staticPropertyCallEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass staticNavigationOrAttributeCallEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass staticOperationCallEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyCallExpEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyCallEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass navigationOrAttributeCallEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationCallEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operatorCallExpEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass notOpCallExpEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relOpCallExpEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eqOpCallExpEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass addOpCallExpEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass intOpCallExpEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mulOpCallExpEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lambdaCallExpEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass braceExpEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass collectionOperationCallEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass loopExpEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iterateExpEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iteratorExpEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass letExpEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ifExpEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableDeclarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass localVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iteratorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass collectionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oclTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oclModelElementExpEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass primitiveEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass numericTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integerTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass realTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bagTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orderedSetTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sequenceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass setTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oclAnyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tupleTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tupleTypeAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oclModelElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mapTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lambdaTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass envTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oclFeatureDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oclContextDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oclFeatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeEClass = null;

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
	private EClass oclModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oclMetamodelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oclInstanceModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType booleanEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType doubleEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType integerEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType stringEDataType = null;

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
	 * @see QualityMetamodel.QMM_OCL.QMM_OCLPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private QMM_OCLPackageImpl() {
		super(eNS_URI, QMM_OCLFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link QMM_OCLPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static QMM_OCLPackage init() {
		if (isInited) return (QMM_OCLPackage)EPackage.Registry.INSTANCE.getEPackage(QMM_OCLPackage.eNS_URI);

		// Obtain or create and register package
		QMM_OCLPackageImpl theQMM_OCLPackage = (QMM_OCLPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof QMM_OCLPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new QMM_OCLPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		QualityMetamodelPackageImpl theQualityMetamodelPackage = (QualityMetamodelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(QualityMetamodelPackage.eNS_URI) instanceof QualityMetamodelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(QualityMetamodelPackage.eNS_URI) : QualityMetamodelPackage.eINSTANCE);

		// Create package meta-data objects
		theQMM_OCLPackage.createPackageContents();
		theQualityMetamodelPackage.createPackageContents();

		// Initialize created meta-data
		theQMM_OCLPackage.initializePackageContents();
		theQualityMetamodelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theQMM_OCLPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(QMM_OCLPackage.eNS_URI, theQMM_OCLPackage);
		return theQMM_OCLPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLocatedElement() {
		return locatedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocatedElement_Line() {
		return (EAttribute)locatedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocatedElement_Column() {
		return (EAttribute)locatedElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocatedElement_CharStart() {
		return (EAttribute)locatedElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocatedElement_CharEnd() {
		return (EAttribute)locatedElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamedElement() {
		return namedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamedElement_Name() {
		return (EAttribute)namedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModule() {
		return moduleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModule_Metamodels() {
		return (EReference)moduleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModule_Imports() {
		return (EReference)moduleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModule_Elements() {
		return (EReference)moduleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModuleElement() {
		return moduleElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModuleElement_Module() {
		return (EReference)moduleElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImport() {
		return importEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImport_Module() {
		return (EReference)importEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOclExpression() {
		return oclExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOclExpression_Type() {
		return (EReference)oclExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOclExpression_IfExp3() {
		return (EReference)oclExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOclExpression_AppliedProperty() {
		return (EReference)oclExpressionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOclExpression_LetExp() {
		return (EReference)oclExpressionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOclExpression_LoopExp() {
		return (EReference)oclExpressionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOclExpression_ParentOperation() {
		return (EReference)oclExpressionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOclExpression_InitializedVariable() {
		return (EReference)oclExpressionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOclExpression_IfExp2() {
		return (EReference)oclExpressionEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOclExpression_OwningOperation() {
		return (EReference)oclExpressionEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOclExpression_IfExp1() {
		return (EReference)oclExpressionEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOclExpression_OwningAttribute() {
		return (EReference)oclExpressionEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOclExpression_AppliedOperator() {
		return (EReference)oclExpressionEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariableExp() {
		return variableExpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariableExp_ReferredVariable() {
		return (EReference)variableExpEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSuperExp() {
		return superExpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSelfExp() {
		return selfExpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnvExp() {
		return envExpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrimitiveExp() {
		return primitiveExpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStringExp() {
		return stringExpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStringExp_StringSymbol() {
		return (EAttribute)stringExpEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooleanExp() {
		return booleanExpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooleanExp_BooleanSymbol() {
		return (EAttribute)booleanExpEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNumericExp() {
		return numericExpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRealExp() {
		return realExpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRealExp_RealSymbol() {
		return (EAttribute)realExpEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntegerExp() {
		return integerExpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntegerExp_IntegerSymbol() {
		return (EAttribute)integerExpEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCollectionExp() {
		return collectionExpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCollectionExp_Parts() {
		return (EReference)collectionExpEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCollectionPart() {
		return collectionPartEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCollectionPart_Collection() {
		return (EReference)collectionPartEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCollectionRange() {
		return collectionRangeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCollectionRange_First() {
		return (EReference)collectionRangeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCollectionRange_Last() {
		return (EReference)collectionRangeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCollectionItem() {
		return collectionItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCollectionItem_Item() {
		return (EReference)collectionItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBagExp() {
		return bagExpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOrderedSetExp() {
		return orderedSetExpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSequenceExp() {
		return sequenceExpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSetExp() {
		return setExpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTupleExp() {
		return tupleExpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTupleExp_TuplePart() {
		return (EReference)tupleExpEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTuplePart() {
		return tuplePartEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTuplePart_Tuple() {
		return (EReference)tuplePartEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMapExp() {
		return mapExpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMapExp_Elements() {
		return (EReference)mapExpEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMapElement() {
		return mapElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMapElement_Map() {
		return (EReference)mapElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMapElement_Key() {
		return (EReference)mapElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMapElement_Value() {
		return (EReference)mapElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnumLiteralExp() {
		return enumLiteralExpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnumLiteralExp_Name() {
		return (EAttribute)enumLiteralExpEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOclUndefinedExp() {
		return oclUndefinedExpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStaticPropertyCallExp() {
		return staticPropertyCallExpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStaticPropertyCallExp_Source() {
		return (EReference)staticPropertyCallExpEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStaticPropertyCallExp_StaticCall() {
		return (EReference)staticPropertyCallExpEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStaticPropertyCall() {
		return staticPropertyCallEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStaticPropertyCall_StaticCallExp() {
		return (EReference)staticPropertyCallEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStaticNavigationOrAttributeCall() {
		return staticNavigationOrAttributeCallEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStaticNavigationOrAttributeCall_Name() {
		return (EAttribute)staticNavigationOrAttributeCallEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStaticOperationCall() {
		return staticOperationCallEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStaticOperationCall_Arguments() {
		return (EReference)staticOperationCallEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStaticOperationCall_OperationName() {
		return (EAttribute)staticOperationCallEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPropertyCallExp() {
		return propertyCallExpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPropertyCallExp_Calls() {
		return (EReference)propertyCallExpEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPropertyCallExp_Source() {
		return (EReference)propertyCallExpEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPropertyCall() {
		return propertyCallEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPropertyCall_CallExp() {
		return (EReference)propertyCallEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNavigationOrAttributeCall() {
		return navigationOrAttributeCallEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNavigationOrAttributeCall_Name() {
		return (EAttribute)navigationOrAttributeCallEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperationCall() {
		return operationCallEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationCall_Arguments() {
		return (EReference)operationCallEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperationCall_OperationName() {
		return (EAttribute)operationCallEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperatorCallExp() {
		return operatorCallExpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperatorCallExp_Argument() {
		return (EReference)operatorCallExpEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperatorCallExp_OperationName() {
		return (EAttribute)operatorCallExpEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperatorCallExp_Source() {
		return (EReference)operatorCallExpEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNotOpCallExp() {
		return notOpCallExpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelOpCallExp() {
		return relOpCallExpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEqOpCallExp() {
		return eqOpCallExpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAddOpCallExp() {
		return addOpCallExpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntOpCallExp() {
		return intOpCallExpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMulOpCallExp() {
		return mulOpCallExpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLambdaCallExp() {
		return lambdaCallExpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLambdaCallExp_Arguments() {
		return (EReference)lambdaCallExpEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBraceExp() {
		return braceExpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBraceExp_Exp() {
		return (EReference)braceExpEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCollectionOperationCall() {
		return collectionOperationCallEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLoopExp() {
		return loopExpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLoopExp_Body() {
		return (EReference)loopExpEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLoopExp_Iterators() {
		return (EReference)loopExpEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIterateExp() {
		return iterateExpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIterateExp_Result() {
		return (EReference)iterateExpEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIteratorExp() {
		return iteratorExpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIteratorExp_Name() {
		return (EAttribute)iteratorExpEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLetExp() {
		return letExpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLetExp_Variable() {
		return (EReference)letExpEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLetExp_In_() {
		return (EReference)letExpEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIfExp() {
		return ifExpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIfExp_ThenExpression() {
		return (EReference)ifExpEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIfExp_Condition() {
		return (EReference)ifExpEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIfExp_ElseExpression() {
		return (EReference)ifExpEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariableDeclaration() {
		return variableDeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariableDeclaration_VarName() {
		return (EAttribute)variableDeclarationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariableDeclaration_Type() {
		return (EReference)variableDeclarationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariableDeclaration_VariableExp() {
		return (EReference)variableDeclarationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLocalVariable() {
		return localVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocalVariable_LetExp() {
		return (EReference)localVariableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocalVariable_InitExpression() {
		return (EReference)localVariableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocalVariable_BaseExp() {
		return (EReference)localVariableEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocalVariable_Eq() {
		return (EAttribute)localVariableEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIterator() {
		return iteratorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIterator_LoopExpr() {
		return (EReference)iteratorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameter() {
		return parameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameter_Operation() {
		return (EReference)parameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCollectionType() {
		return collectionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCollectionType_ElementType() {
		return (EReference)collectionTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOclType() {
		return oclTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOclType_Name() {
		return (EAttribute)oclTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOclType_Definitions() {
		return (EReference)oclTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOclType_OclExpression() {
		return (EReference)oclTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOclType_Operation() {
		return (EReference)oclTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOclType_MapType2() {
		return (EReference)oclTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOclType_Attribute() {
		return (EReference)oclTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOclType_MapType() {
		return (EReference)oclTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOclType_CollectionTypes() {
		return (EReference)oclTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOclType_TupleTypeAttribute() {
		return (EReference)oclTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOclType_VariableDeclaration() {
		return (EReference)oclTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOclType_LambdaReturnType() {
		return (EReference)oclTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOclType_LambdaArgType() {
		return (EReference)oclTypeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOclType_StaticPropertyCall() {
		return (EReference)oclTypeEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOclModelElementExp() {
		return oclModelElementExpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOclModelElementExp_Model() {
		return (EReference)oclModelElementExpEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOclModelElementExp_Name() {
		return (EAttribute)oclModelElementExpEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrimitive() {
		return primitiveEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStringType() {
		return stringTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooleanType() {
		return booleanTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNumericType() {
		return numericTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntegerType() {
		return integerTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRealType() {
		return realTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBagType() {
		return bagTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOrderedSetType() {
		return orderedSetTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSequenceType() {
		return sequenceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSetType() {
		return setTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOclAnyType() {
		return oclAnyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTupleType() {
		return tupleTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTupleType_Attributes() {
		return (EReference)tupleTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTupleTypeAttribute() {
		return tupleTypeAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTupleTypeAttribute_Type() {
		return (EReference)tupleTypeAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTupleTypeAttribute_TupleType() {
		return (EReference)tupleTypeAttributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTupleTypeAttribute_Name() {
		return (EAttribute)tupleTypeAttributeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOclModelElement() {
		return oclModelElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOclModelElement_Model() {
		return (EReference)oclModelElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMapType() {
		return mapTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMapType_ValueType() {
		return (EReference)mapTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMapType_KeyType() {
		return (EReference)mapTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLambdaType() {
		return lambdaTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLambdaType_ReturnType() {
		return (EReference)lambdaTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLambdaType_ArgumentTypes() {
		return (EReference)lambdaTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnvType() {
		return envTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOclFeatureDefinition() {
		return oclFeatureDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOclFeatureDefinition_Feature() {
		return (EReference)oclFeatureDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOclFeatureDefinition_Context_() {
		return (EReference)oclFeatureDefinitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOclFeatureDefinition_Static() {
		return (EAttribute)oclFeatureDefinitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOclContextDefinition() {
		return oclContextDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOclContextDefinition_Definition() {
		return (EReference)oclContextDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOclContextDefinition_Context_() {
		return (EReference)oclContextDefinitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOclFeature() {
		return oclFeatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOclFeature_Definition() {
		return (EReference)oclFeatureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOclFeature_Eq() {
		return (EAttribute)oclFeatureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttribute() {
		return attributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttribute_InitExpression() {
		return (EReference)attributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttribute_Type() {
		return (EReference)attributeEClass.getEStructuralFeatures().get(1);
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
	public EReference getOperation_Parameters() {
		return (EReference)operationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperation_ReturnType() {
		return (EReference)operationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperation_Body() {
		return (EReference)operationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOclModel() {
		return oclModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOclModel_Elements() {
		return (EReference)oclModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOclMetamodel() {
		return oclMetamodelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOclMetamodel_Model() {
		return (EReference)oclMetamodelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOclMetamodel_Uri() {
		return (EAttribute)oclMetamodelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOclInstanceModel() {
		return oclInstanceModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOclInstanceModel_Metamodel() {
		return (EReference)oclInstanceModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getBoolean() {
		return booleanEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDouble() {
		return doubleEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getInteger() {
		return integerEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getString() {
		return stringEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QMM_OCLFactory getQMM_OCLFactory() {
		return (QMM_OCLFactory)getEFactoryInstance();
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
		locatedElementEClass = createEClass(LOCATED_ELEMENT);
		createEAttribute(locatedElementEClass, LOCATED_ELEMENT__LINE);
		createEAttribute(locatedElementEClass, LOCATED_ELEMENT__COLUMN);
		createEAttribute(locatedElementEClass, LOCATED_ELEMENT__CHAR_START);
		createEAttribute(locatedElementEClass, LOCATED_ELEMENT__CHAR_END);

		namedElementEClass = createEClass(NAMED_ELEMENT);
		createEAttribute(namedElementEClass, NAMED_ELEMENT__NAME);

		moduleEClass = createEClass(MODULE);
		createEReference(moduleEClass, MODULE__METAMODELS);
		createEReference(moduleEClass, MODULE__IMPORTS);
		createEReference(moduleEClass, MODULE__ELEMENTS);

		moduleElementEClass = createEClass(MODULE_ELEMENT);
		createEReference(moduleElementEClass, MODULE_ELEMENT__MODULE);

		importEClass = createEClass(IMPORT);
		createEReference(importEClass, IMPORT__MODULE);

		oclExpressionEClass = createEClass(OCL_EXPRESSION);
		createEReference(oclExpressionEClass, OCL_EXPRESSION__TYPE);
		createEReference(oclExpressionEClass, OCL_EXPRESSION__IF_EXP3);
		createEReference(oclExpressionEClass, OCL_EXPRESSION__APPLIED_PROPERTY);
		createEReference(oclExpressionEClass, OCL_EXPRESSION__LET_EXP);
		createEReference(oclExpressionEClass, OCL_EXPRESSION__LOOP_EXP);
		createEReference(oclExpressionEClass, OCL_EXPRESSION__PARENT_OPERATION);
		createEReference(oclExpressionEClass, OCL_EXPRESSION__INITIALIZED_VARIABLE);
		createEReference(oclExpressionEClass, OCL_EXPRESSION__IF_EXP2);
		createEReference(oclExpressionEClass, OCL_EXPRESSION__OWNING_OPERATION);
		createEReference(oclExpressionEClass, OCL_EXPRESSION__IF_EXP1);
		createEReference(oclExpressionEClass, OCL_EXPRESSION__OWNING_ATTRIBUTE);
		createEReference(oclExpressionEClass, OCL_EXPRESSION__APPLIED_OPERATOR);

		variableExpEClass = createEClass(VARIABLE_EXP);
		createEReference(variableExpEClass, VARIABLE_EXP__REFERRED_VARIABLE);

		superExpEClass = createEClass(SUPER_EXP);

		selfExpEClass = createEClass(SELF_EXP);

		envExpEClass = createEClass(ENV_EXP);

		primitiveExpEClass = createEClass(PRIMITIVE_EXP);

		stringExpEClass = createEClass(STRING_EXP);
		createEAttribute(stringExpEClass, STRING_EXP__STRING_SYMBOL);

		booleanExpEClass = createEClass(BOOLEAN_EXP);
		createEAttribute(booleanExpEClass, BOOLEAN_EXP__BOOLEAN_SYMBOL);

		numericExpEClass = createEClass(NUMERIC_EXP);

		realExpEClass = createEClass(REAL_EXP);
		createEAttribute(realExpEClass, REAL_EXP__REAL_SYMBOL);

		integerExpEClass = createEClass(INTEGER_EXP);
		createEAttribute(integerExpEClass, INTEGER_EXP__INTEGER_SYMBOL);

		collectionExpEClass = createEClass(COLLECTION_EXP);
		createEReference(collectionExpEClass, COLLECTION_EXP__PARTS);

		collectionPartEClass = createEClass(COLLECTION_PART);
		createEReference(collectionPartEClass, COLLECTION_PART__COLLECTION);

		collectionRangeEClass = createEClass(COLLECTION_RANGE);
		createEReference(collectionRangeEClass, COLLECTION_RANGE__FIRST);
		createEReference(collectionRangeEClass, COLLECTION_RANGE__LAST);

		collectionItemEClass = createEClass(COLLECTION_ITEM);
		createEReference(collectionItemEClass, COLLECTION_ITEM__ITEM);

		bagExpEClass = createEClass(BAG_EXP);

		orderedSetExpEClass = createEClass(ORDERED_SET_EXP);

		sequenceExpEClass = createEClass(SEQUENCE_EXP);

		setExpEClass = createEClass(SET_EXP);

		tupleExpEClass = createEClass(TUPLE_EXP);
		createEReference(tupleExpEClass, TUPLE_EXP__TUPLE_PART);

		tuplePartEClass = createEClass(TUPLE_PART);
		createEReference(tuplePartEClass, TUPLE_PART__TUPLE);

		mapExpEClass = createEClass(MAP_EXP);
		createEReference(mapExpEClass, MAP_EXP__ELEMENTS);

		mapElementEClass = createEClass(MAP_ELEMENT);
		createEReference(mapElementEClass, MAP_ELEMENT__MAP);
		createEReference(mapElementEClass, MAP_ELEMENT__KEY);
		createEReference(mapElementEClass, MAP_ELEMENT__VALUE);

		enumLiteralExpEClass = createEClass(ENUM_LITERAL_EXP);
		createEAttribute(enumLiteralExpEClass, ENUM_LITERAL_EXP__NAME);

		oclUndefinedExpEClass = createEClass(OCL_UNDEFINED_EXP);

		staticPropertyCallExpEClass = createEClass(STATIC_PROPERTY_CALL_EXP);
		createEReference(staticPropertyCallExpEClass, STATIC_PROPERTY_CALL_EXP__SOURCE);
		createEReference(staticPropertyCallExpEClass, STATIC_PROPERTY_CALL_EXP__STATIC_CALL);

		staticPropertyCallEClass = createEClass(STATIC_PROPERTY_CALL);
		createEReference(staticPropertyCallEClass, STATIC_PROPERTY_CALL__STATIC_CALL_EXP);

		staticNavigationOrAttributeCallEClass = createEClass(STATIC_NAVIGATION_OR_ATTRIBUTE_CALL);
		createEAttribute(staticNavigationOrAttributeCallEClass, STATIC_NAVIGATION_OR_ATTRIBUTE_CALL__NAME);

		staticOperationCallEClass = createEClass(STATIC_OPERATION_CALL);
		createEReference(staticOperationCallEClass, STATIC_OPERATION_CALL__ARGUMENTS);
		createEAttribute(staticOperationCallEClass, STATIC_OPERATION_CALL__OPERATION_NAME);

		propertyCallExpEClass = createEClass(PROPERTY_CALL_EXP);
		createEReference(propertyCallExpEClass, PROPERTY_CALL_EXP__CALLS);
		createEReference(propertyCallExpEClass, PROPERTY_CALL_EXP__SOURCE);

		propertyCallEClass = createEClass(PROPERTY_CALL);
		createEReference(propertyCallEClass, PROPERTY_CALL__CALL_EXP);

		navigationOrAttributeCallEClass = createEClass(NAVIGATION_OR_ATTRIBUTE_CALL);
		createEAttribute(navigationOrAttributeCallEClass, NAVIGATION_OR_ATTRIBUTE_CALL__NAME);

		operationCallEClass = createEClass(OPERATION_CALL);
		createEReference(operationCallEClass, OPERATION_CALL__ARGUMENTS);
		createEAttribute(operationCallEClass, OPERATION_CALL__OPERATION_NAME);

		operatorCallExpEClass = createEClass(OPERATOR_CALL_EXP);
		createEReference(operatorCallExpEClass, OPERATOR_CALL_EXP__ARGUMENT);
		createEAttribute(operatorCallExpEClass, OPERATOR_CALL_EXP__OPERATION_NAME);
		createEReference(operatorCallExpEClass, OPERATOR_CALL_EXP__SOURCE);

		notOpCallExpEClass = createEClass(NOT_OP_CALL_EXP);

		relOpCallExpEClass = createEClass(REL_OP_CALL_EXP);

		eqOpCallExpEClass = createEClass(EQ_OP_CALL_EXP);

		addOpCallExpEClass = createEClass(ADD_OP_CALL_EXP);

		intOpCallExpEClass = createEClass(INT_OP_CALL_EXP);

		mulOpCallExpEClass = createEClass(MUL_OP_CALL_EXP);

		lambdaCallExpEClass = createEClass(LAMBDA_CALL_EXP);
		createEReference(lambdaCallExpEClass, LAMBDA_CALL_EXP__ARGUMENTS);

		braceExpEClass = createEClass(BRACE_EXP);
		createEReference(braceExpEClass, BRACE_EXP__EXP);

		collectionOperationCallEClass = createEClass(COLLECTION_OPERATION_CALL);

		loopExpEClass = createEClass(LOOP_EXP);
		createEReference(loopExpEClass, LOOP_EXP__BODY);
		createEReference(loopExpEClass, LOOP_EXP__ITERATORS);

		iterateExpEClass = createEClass(ITERATE_EXP);
		createEReference(iterateExpEClass, ITERATE_EXP__RESULT);

		iteratorExpEClass = createEClass(ITERATOR_EXP);
		createEAttribute(iteratorExpEClass, ITERATOR_EXP__NAME);

		letExpEClass = createEClass(LET_EXP);
		createEReference(letExpEClass, LET_EXP__VARIABLE);
		createEReference(letExpEClass, LET_EXP__IN_);

		ifExpEClass = createEClass(IF_EXP);
		createEReference(ifExpEClass, IF_EXP__THEN_EXPRESSION);
		createEReference(ifExpEClass, IF_EXP__CONDITION);
		createEReference(ifExpEClass, IF_EXP__ELSE_EXPRESSION);

		variableDeclarationEClass = createEClass(VARIABLE_DECLARATION);
		createEAttribute(variableDeclarationEClass, VARIABLE_DECLARATION__VAR_NAME);
		createEReference(variableDeclarationEClass, VARIABLE_DECLARATION__TYPE);
		createEReference(variableDeclarationEClass, VARIABLE_DECLARATION__VARIABLE_EXP);

		localVariableEClass = createEClass(LOCAL_VARIABLE);
		createEReference(localVariableEClass, LOCAL_VARIABLE__LET_EXP);
		createEReference(localVariableEClass, LOCAL_VARIABLE__INIT_EXPRESSION);
		createEReference(localVariableEClass, LOCAL_VARIABLE__BASE_EXP);
		createEAttribute(localVariableEClass, LOCAL_VARIABLE__EQ);

		iteratorEClass = createEClass(ITERATOR);
		createEReference(iteratorEClass, ITERATOR__LOOP_EXPR);

		parameterEClass = createEClass(PARAMETER);
		createEReference(parameterEClass, PARAMETER__OPERATION);

		collectionTypeEClass = createEClass(COLLECTION_TYPE);
		createEReference(collectionTypeEClass, COLLECTION_TYPE__ELEMENT_TYPE);

		oclTypeEClass = createEClass(OCL_TYPE);
		createEAttribute(oclTypeEClass, OCL_TYPE__NAME);
		createEReference(oclTypeEClass, OCL_TYPE__DEFINITIONS);
		createEReference(oclTypeEClass, OCL_TYPE__OCL_EXPRESSION);
		createEReference(oclTypeEClass, OCL_TYPE__OPERATION);
		createEReference(oclTypeEClass, OCL_TYPE__MAP_TYPE2);
		createEReference(oclTypeEClass, OCL_TYPE__ATTRIBUTE);
		createEReference(oclTypeEClass, OCL_TYPE__MAP_TYPE);
		createEReference(oclTypeEClass, OCL_TYPE__COLLECTION_TYPES);
		createEReference(oclTypeEClass, OCL_TYPE__TUPLE_TYPE_ATTRIBUTE);
		createEReference(oclTypeEClass, OCL_TYPE__VARIABLE_DECLARATION);
		createEReference(oclTypeEClass, OCL_TYPE__LAMBDA_RETURN_TYPE);
		createEReference(oclTypeEClass, OCL_TYPE__LAMBDA_ARG_TYPE);
		createEReference(oclTypeEClass, OCL_TYPE__STATIC_PROPERTY_CALL);

		oclModelElementExpEClass = createEClass(OCL_MODEL_ELEMENT_EXP);
		createEReference(oclModelElementExpEClass, OCL_MODEL_ELEMENT_EXP__MODEL);
		createEAttribute(oclModelElementExpEClass, OCL_MODEL_ELEMENT_EXP__NAME);

		primitiveEClass = createEClass(PRIMITIVE);

		stringTypeEClass = createEClass(STRING_TYPE);

		booleanTypeEClass = createEClass(BOOLEAN_TYPE);

		numericTypeEClass = createEClass(NUMERIC_TYPE);

		integerTypeEClass = createEClass(INTEGER_TYPE);

		realTypeEClass = createEClass(REAL_TYPE);

		bagTypeEClass = createEClass(BAG_TYPE);

		orderedSetTypeEClass = createEClass(ORDERED_SET_TYPE);

		sequenceTypeEClass = createEClass(SEQUENCE_TYPE);

		setTypeEClass = createEClass(SET_TYPE);

		oclAnyTypeEClass = createEClass(OCL_ANY_TYPE);

		tupleTypeEClass = createEClass(TUPLE_TYPE);
		createEReference(tupleTypeEClass, TUPLE_TYPE__ATTRIBUTES);

		tupleTypeAttributeEClass = createEClass(TUPLE_TYPE_ATTRIBUTE);
		createEReference(tupleTypeAttributeEClass, TUPLE_TYPE_ATTRIBUTE__TYPE);
		createEReference(tupleTypeAttributeEClass, TUPLE_TYPE_ATTRIBUTE__TUPLE_TYPE);
		createEAttribute(tupleTypeAttributeEClass, TUPLE_TYPE_ATTRIBUTE__NAME);

		oclModelElementEClass = createEClass(OCL_MODEL_ELEMENT);
		createEReference(oclModelElementEClass, OCL_MODEL_ELEMENT__MODEL);

		mapTypeEClass = createEClass(MAP_TYPE);
		createEReference(mapTypeEClass, MAP_TYPE__VALUE_TYPE);
		createEReference(mapTypeEClass, MAP_TYPE__KEY_TYPE);

		lambdaTypeEClass = createEClass(LAMBDA_TYPE);
		createEReference(lambdaTypeEClass, LAMBDA_TYPE__RETURN_TYPE);
		createEReference(lambdaTypeEClass, LAMBDA_TYPE__ARGUMENT_TYPES);

		envTypeEClass = createEClass(ENV_TYPE);

		oclFeatureDefinitionEClass = createEClass(OCL_FEATURE_DEFINITION);
		createEReference(oclFeatureDefinitionEClass, OCL_FEATURE_DEFINITION__FEATURE);
		createEReference(oclFeatureDefinitionEClass, OCL_FEATURE_DEFINITION__CONTEXT_);
		createEAttribute(oclFeatureDefinitionEClass, OCL_FEATURE_DEFINITION__STATIC);

		oclContextDefinitionEClass = createEClass(OCL_CONTEXT_DEFINITION);
		createEReference(oclContextDefinitionEClass, OCL_CONTEXT_DEFINITION__DEFINITION);
		createEReference(oclContextDefinitionEClass, OCL_CONTEXT_DEFINITION__CONTEXT_);

		oclFeatureEClass = createEClass(OCL_FEATURE);
		createEReference(oclFeatureEClass, OCL_FEATURE__DEFINITION);
		createEAttribute(oclFeatureEClass, OCL_FEATURE__EQ);

		attributeEClass = createEClass(ATTRIBUTE);
		createEReference(attributeEClass, ATTRIBUTE__INIT_EXPRESSION);
		createEReference(attributeEClass, ATTRIBUTE__TYPE);

		operationEClass = createEClass(OPERATION);
		createEReference(operationEClass, OPERATION__PARAMETERS);
		createEReference(operationEClass, OPERATION__RETURN_TYPE);
		createEReference(operationEClass, OPERATION__BODY);

		oclModelEClass = createEClass(OCL_MODEL);
		createEReference(oclModelEClass, OCL_MODEL__ELEMENTS);

		oclMetamodelEClass = createEClass(OCL_METAMODEL);
		createEReference(oclMetamodelEClass, OCL_METAMODEL__MODEL);
		createEAttribute(oclMetamodelEClass, OCL_METAMODEL__URI);

		oclInstanceModelEClass = createEClass(OCL_INSTANCE_MODEL);
		createEReference(oclInstanceModelEClass, OCL_INSTANCE_MODEL__METAMODEL);

		// Create data types
		booleanEDataType = createEDataType(BOOLEAN);
		doubleEDataType = createEDataType(DOUBLE);
		integerEDataType = createEDataType(INTEGER);
		stringEDataType = createEDataType(STRING);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		namedElementEClass.getESuperTypes().add(this.getLocatedElement());
		moduleEClass.getESuperTypes().add(this.getNamedElement());
		moduleElementEClass.getESuperTypes().add(this.getLocatedElement());
		importEClass.getESuperTypes().add(this.getNamedElement());
		oclExpressionEClass.getESuperTypes().add(this.getLocatedElement());
		variableExpEClass.getESuperTypes().add(this.getOclExpression());
		superExpEClass.getESuperTypes().add(this.getOclExpression());
		selfExpEClass.getESuperTypes().add(this.getOclExpression());
		envExpEClass.getESuperTypes().add(this.getOclExpression());
		primitiveExpEClass.getESuperTypes().add(this.getOclExpression());
		stringExpEClass.getESuperTypes().add(this.getPrimitiveExp());
		booleanExpEClass.getESuperTypes().add(this.getPrimitiveExp());
		numericExpEClass.getESuperTypes().add(this.getPrimitiveExp());
		realExpEClass.getESuperTypes().add(this.getNumericExp());
		integerExpEClass.getESuperTypes().add(this.getNumericExp());
		collectionExpEClass.getESuperTypes().add(this.getOclExpression());
		collectionPartEClass.getESuperTypes().add(this.getLocatedElement());
		collectionRangeEClass.getESuperTypes().add(this.getCollectionPart());
		collectionItemEClass.getESuperTypes().add(this.getCollectionPart());
		bagExpEClass.getESuperTypes().add(this.getCollectionExp());
		orderedSetExpEClass.getESuperTypes().add(this.getCollectionExp());
		sequenceExpEClass.getESuperTypes().add(this.getCollectionExp());
		setExpEClass.getESuperTypes().add(this.getCollectionExp());
		tupleExpEClass.getESuperTypes().add(this.getOclExpression());
		tuplePartEClass.getESuperTypes().add(this.getLocalVariable());
		mapExpEClass.getESuperTypes().add(this.getOclExpression());
		mapElementEClass.getESuperTypes().add(this.getLocatedElement());
		enumLiteralExpEClass.getESuperTypes().add(this.getOclExpression());
		oclUndefinedExpEClass.getESuperTypes().add(this.getOclExpression());
		staticPropertyCallExpEClass.getESuperTypes().add(this.getOclExpression());
		staticPropertyCallEClass.getESuperTypes().add(this.getLocatedElement());
		staticNavigationOrAttributeCallEClass.getESuperTypes().add(this.getStaticPropertyCall());
		staticOperationCallEClass.getESuperTypes().add(this.getStaticPropertyCall());
		propertyCallExpEClass.getESuperTypes().add(this.getOclExpression());
		propertyCallEClass.getESuperTypes().add(this.getLocatedElement());
		navigationOrAttributeCallEClass.getESuperTypes().add(this.getPropertyCall());
		operationCallEClass.getESuperTypes().add(this.getPropertyCall());
		operatorCallExpEClass.getESuperTypes().add(this.getOclExpression());
		notOpCallExpEClass.getESuperTypes().add(this.getOperatorCallExp());
		relOpCallExpEClass.getESuperTypes().add(this.getOperatorCallExp());
		eqOpCallExpEClass.getESuperTypes().add(this.getOperatorCallExp());
		addOpCallExpEClass.getESuperTypes().add(this.getOperatorCallExp());
		intOpCallExpEClass.getESuperTypes().add(this.getOperatorCallExp());
		mulOpCallExpEClass.getESuperTypes().add(this.getOperatorCallExp());
		lambdaCallExpEClass.getESuperTypes().add(this.getVariableExp());
		braceExpEClass.getESuperTypes().add(this.getOclExpression());
		collectionOperationCallEClass.getESuperTypes().add(this.getOperationCall());
		loopExpEClass.getESuperTypes().add(this.getPropertyCall());
		iterateExpEClass.getESuperTypes().add(this.getLoopExp());
		iteratorExpEClass.getESuperTypes().add(this.getLoopExp());
		letExpEClass.getESuperTypes().add(this.getOclExpression());
		ifExpEClass.getESuperTypes().add(this.getOclExpression());
		variableDeclarationEClass.getESuperTypes().add(this.getLocatedElement());
		localVariableEClass.getESuperTypes().add(this.getVariableDeclaration());
		iteratorEClass.getESuperTypes().add(this.getVariableDeclaration());
		parameterEClass.getESuperTypes().add(this.getVariableDeclaration());
		collectionTypeEClass.getESuperTypes().add(this.getOclType());
		oclTypeEClass.getESuperTypes().add(this.getLocatedElement());
		oclModelElementExpEClass.getESuperTypes().add(this.getOclExpression());
		primitiveEClass.getESuperTypes().add(this.getOclType());
		stringTypeEClass.getESuperTypes().add(this.getPrimitive());
		booleanTypeEClass.getESuperTypes().add(this.getPrimitive());
		numericTypeEClass.getESuperTypes().add(this.getPrimitive());
		integerTypeEClass.getESuperTypes().add(this.getNumericType());
		realTypeEClass.getESuperTypes().add(this.getNumericType());
		bagTypeEClass.getESuperTypes().add(this.getCollectionType());
		orderedSetTypeEClass.getESuperTypes().add(this.getCollectionType());
		sequenceTypeEClass.getESuperTypes().add(this.getCollectionType());
		setTypeEClass.getESuperTypes().add(this.getCollectionType());
		oclAnyTypeEClass.getESuperTypes().add(this.getOclType());
		tupleTypeEClass.getESuperTypes().add(this.getOclType());
		tupleTypeAttributeEClass.getESuperTypes().add(this.getLocatedElement());
		oclModelElementEClass.getESuperTypes().add(this.getOclType());
		mapTypeEClass.getESuperTypes().add(this.getOclType());
		lambdaTypeEClass.getESuperTypes().add(this.getOclType());
		envTypeEClass.getESuperTypes().add(this.getOclType());
		oclFeatureDefinitionEClass.getESuperTypes().add(this.getModuleElement());
		oclContextDefinitionEClass.getESuperTypes().add(this.getLocatedElement());
		oclFeatureEClass.getESuperTypes().add(this.getNamedElement());
		attributeEClass.getESuperTypes().add(this.getOclFeature());
		operationEClass.getESuperTypes().add(this.getOclFeature());
		oclModelEClass.getESuperTypes().add(this.getNamedElement());
		oclMetamodelEClass.getESuperTypes().add(this.getOclModel());
		oclInstanceModelEClass.getESuperTypes().add(this.getOclModel());

		// Initialize classes, features, and operations; add parameters
		initEClass(locatedElementEClass, LocatedElement.class, "LocatedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLocatedElement_Line(), this.getInteger(), "line", "-1", 1, 1, LocatedElement.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getLocatedElement_Column(), this.getInteger(), "column", "-1", 1, 1, LocatedElement.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getLocatedElement_CharStart(), this.getInteger(), "charStart", "-1", 1, 1, LocatedElement.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getLocatedElement_CharEnd(), this.getInteger(), "charEnd", "-1", 1, 1, LocatedElement.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(namedElementEClass, NamedElement.class, "NamedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamedElement_Name(), ecorePackage.getEString(), "name", null, 1, 1, NamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(moduleEClass, Module.class, "Module", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModule_Metamodels(), this.getOclMetamodel(), null, "metamodels", null, 0, -1, Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModule_Imports(), this.getImport(), this.getImport_Module(), "imports", null, 0, -1, Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModule_Elements(), this.getModuleElement(), this.getModuleElement_Module(), "elements", null, 0, -1, Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(moduleElementEClass, ModuleElement.class, "ModuleElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModuleElement_Module(), this.getModule(), this.getModule_Elements(), "module", null, 1, 1, ModuleElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(importEClass, Import.class, "Import", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getImport_Module(), this.getModule(), this.getModule_Imports(), "module", null, 1, 1, Import.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(oclExpressionEClass, OclExpression.class, "OclExpression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOclExpression_Type(), this.getOclType(), this.getOclType_OclExpression(), "type", null, 0, 1, OclExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getOclExpression_IfExp3(), this.getIfExp(), this.getIfExp_ElseExpression(), "ifExp3", null, 0, 1, OclExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getOclExpression_AppliedProperty(), this.getPropertyCallExp(), this.getPropertyCallExp_Source(), "appliedProperty", null, 0, 1, OclExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getOclExpression_LetExp(), this.getLetExp(), this.getLetExp_In_(), "letExp", null, 0, 1, OclExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getOclExpression_LoopExp(), this.getLoopExp(), this.getLoopExp_Body(), "loopExp", null, 0, 1, OclExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getOclExpression_ParentOperation(), this.getOperationCall(), this.getOperationCall_Arguments(), "parentOperation", null, 0, 1, OclExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getOclExpression_InitializedVariable(), this.getLocalVariable(), this.getLocalVariable_InitExpression(), "initializedVariable", null, 0, 1, OclExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getOclExpression_IfExp2(), this.getIfExp(), this.getIfExp_ThenExpression(), "ifExp2", null, 0, 1, OclExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getOclExpression_OwningOperation(), this.getOperation(), this.getOperation_Body(), "owningOperation", null, 0, 1, OclExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getOclExpression_IfExp1(), this.getIfExp(), this.getIfExp_Condition(), "ifExp1", null, 0, 1, OclExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getOclExpression_OwningAttribute(), this.getAttribute(), this.getAttribute_InitExpression(), "owningAttribute", null, 0, 1, OclExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getOclExpression_AppliedOperator(), this.getOperatorCallExp(), this.getOperatorCallExp_Source(), "appliedOperator", null, 0, 1, OclExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(variableExpEClass, VariableExp.class, "VariableExp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVariableExp_ReferredVariable(), this.getVariableDeclaration(), this.getVariableDeclaration_VariableExp(), "referredVariable", null, 1, 1, VariableExp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(superExpEClass, SuperExp.class, "SuperExp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(selfExpEClass, SelfExp.class, "SelfExp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(envExpEClass, EnvExp.class, "EnvExp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(primitiveExpEClass, PrimitiveExp.class, "PrimitiveExp", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(stringExpEClass, StringExp.class, "StringExp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStringExp_StringSymbol(), this.getString(), "stringSymbol", null, 1, 1, StringExp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(booleanExpEClass, BooleanExp.class, "BooleanExp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBooleanExp_BooleanSymbol(), this.getBoolean(), "booleanSymbol", null, 1, 1, BooleanExp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(numericExpEClass, NumericExp.class, "NumericExp", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(realExpEClass, RealExp.class, "RealExp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRealExp_RealSymbol(), this.getDouble(), "realSymbol", null, 1, 1, RealExp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(integerExpEClass, IntegerExp.class, "IntegerExp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIntegerExp_IntegerSymbol(), this.getInteger(), "integerSymbol", null, 1, 1, IntegerExp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(collectionExpEClass, CollectionExp.class, "CollectionExp", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCollectionExp_Parts(), this.getCollectionPart(), this.getCollectionPart_Collection(), "parts", null, 0, -1, CollectionExp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(collectionPartEClass, CollectionPart.class, "CollectionPart", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCollectionPart_Collection(), this.getCollectionExp(), this.getCollectionExp_Parts(), "collection", null, 0, 1, CollectionPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(collectionRangeEClass, CollectionRange.class, "CollectionRange", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCollectionRange_First(), this.getOclExpression(), null, "first", null, 1, 1, CollectionRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCollectionRange_Last(), this.getOclExpression(), null, "last", null, 1, 1, CollectionRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(collectionItemEClass, CollectionItem.class, "CollectionItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCollectionItem_Item(), this.getOclExpression(), null, "item", null, 1, 1, CollectionItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bagExpEClass, BagExp.class, "BagExp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(orderedSetExpEClass, OrderedSetExp.class, "OrderedSetExp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sequenceExpEClass, SequenceExp.class, "SequenceExp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(setExpEClass, SetExp.class, "SetExp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tupleExpEClass, TupleExp.class, "TupleExp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTupleExp_TuplePart(), this.getTuplePart(), this.getTuplePart_Tuple(), "tuplePart", null, 0, -1, TupleExp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tuplePartEClass, TuplePart.class, "TuplePart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTuplePart_Tuple(), this.getTupleExp(), this.getTupleExp_TuplePart(), "tuple", null, 1, 1, TuplePart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(mapExpEClass, MapExp.class, "MapExp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMapExp_Elements(), this.getMapElement(), this.getMapElement_Map(), "elements", null, 0, -1, MapExp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mapElementEClass, MapElement.class, "MapElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMapElement_Map(), this.getMapExp(), this.getMapExp_Elements(), "map", null, 1, 1, MapElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getMapElement_Key(), this.getOclExpression(), null, "key", null, 1, 1, MapElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getMapElement_Value(), this.getOclExpression(), null, "value", null, 1, 1, MapElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(enumLiteralExpEClass, EnumLiteralExp.class, "EnumLiteralExp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEnumLiteralExp_Name(), this.getString(), "name", null, 1, 1, EnumLiteralExp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(oclUndefinedExpEClass, OclUndefinedExp.class, "OclUndefinedExp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(staticPropertyCallExpEClass, StaticPropertyCallExp.class, "StaticPropertyCallExp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStaticPropertyCallExp_Source(), this.getOclType(), this.getOclType_StaticPropertyCall(), "source", null, 1, 1, StaticPropertyCallExp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStaticPropertyCallExp_StaticCall(), this.getStaticPropertyCall(), this.getStaticPropertyCall_StaticCallExp(), "staticCall", null, 1, 1, StaticPropertyCallExp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(staticPropertyCallEClass, StaticPropertyCall.class, "StaticPropertyCall", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStaticPropertyCall_StaticCallExp(), this.getStaticPropertyCallExp(), this.getStaticPropertyCallExp_StaticCall(), "staticCallExp", null, 1, 1, StaticPropertyCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(staticNavigationOrAttributeCallEClass, StaticNavigationOrAttributeCall.class, "StaticNavigationOrAttributeCall", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStaticNavigationOrAttributeCall_Name(), this.getString(), "name", "StaticNavigationOrAttributeCall", 1, 1, StaticNavigationOrAttributeCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(staticOperationCallEClass, StaticOperationCall.class, "StaticOperationCall", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStaticOperationCall_Arguments(), this.getOclExpression(), null, "arguments", null, 0, -1, StaticOperationCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStaticOperationCall_OperationName(), this.getString(), "operationName", "StaticOperationCall", 1, 1, StaticOperationCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(propertyCallExpEClass, PropertyCallExp.class, "PropertyCallExp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPropertyCallExp_Calls(), this.getPropertyCall(), this.getPropertyCall_CallExp(), "calls", null, 1, -1, PropertyCallExp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPropertyCallExp_Source(), this.getOclExpression(), this.getOclExpression_AppliedProperty(), "source", null, 1, 1, PropertyCallExp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(propertyCallEClass, PropertyCall.class, "PropertyCall", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPropertyCall_CallExp(), this.getPropertyCallExp(), this.getPropertyCallExp_Calls(), "callExp", null, 1, 1, PropertyCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(navigationOrAttributeCallEClass, NavigationOrAttributeCall.class, "NavigationOrAttributeCall", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNavigationOrAttributeCall_Name(), this.getString(), "name", "NavigationOrAttributeCall", 1, 1, NavigationOrAttributeCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(operationCallEClass, OperationCall.class, "OperationCall", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOperationCall_Arguments(), this.getOclExpression(), this.getOclExpression_ParentOperation(), "arguments", null, 0, -1, OperationCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOperationCall_OperationName(), this.getString(), "operationName", "OperationCall", 1, 1, OperationCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(operatorCallExpEClass, OperatorCallExp.class, "OperatorCallExp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOperatorCallExp_Argument(), this.getOclExpression(), null, "argument", null, 0, 1, OperatorCallExp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOperatorCallExp_OperationName(), this.getString(), "operationName", null, 1, 1, OperatorCallExp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getOperatorCallExp_Source(), this.getOclExpression(), this.getOclExpression_AppliedOperator(), "source", null, 1, 1, OperatorCallExp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(notOpCallExpEClass, NotOpCallExp.class, "NotOpCallExp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(relOpCallExpEClass, RelOpCallExp.class, "RelOpCallExp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(eqOpCallExpEClass, EqOpCallExp.class, "EqOpCallExp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(addOpCallExpEClass, AddOpCallExp.class, "AddOpCallExp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(intOpCallExpEClass, IntOpCallExp.class, "IntOpCallExp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mulOpCallExpEClass, MulOpCallExp.class, "MulOpCallExp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(lambdaCallExpEClass, LambdaCallExp.class, "LambdaCallExp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLambdaCallExp_Arguments(), this.getOclExpression(), null, "arguments", null, 0, -1, LambdaCallExp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(braceExpEClass, BraceExp.class, "BraceExp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBraceExp_Exp(), this.getOclExpression(), null, "exp", null, 1, 1, BraceExp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(collectionOperationCallEClass, CollectionOperationCall.class, "CollectionOperationCall", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(loopExpEClass, LoopExp.class, "LoopExp", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLoopExp_Body(), this.getOclExpression(), this.getOclExpression_LoopExp(), "body", null, 1, 1, LoopExp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getLoopExp_Iterators(), this.getIterator(), this.getIterator_LoopExpr(), "iterators", null, 1, -1, LoopExp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(iterateExpEClass, IterateExp.class, "IterateExp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIterateExp_Result(), this.getLocalVariable(), this.getLocalVariable_BaseExp(), "result", null, 1, 1, IterateExp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(iteratorExpEClass, IteratorExp.class, "IteratorExp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIteratorExp_Name(), this.getString(), "name", "IteratorExp", 1, 1, IteratorExp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(letExpEClass, LetExp.class, "LetExp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLetExp_Variable(), this.getLocalVariable(), this.getLocalVariable_LetExp(), "variable", null, 1, 1, LetExp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getLetExp_In_(), this.getOclExpression(), this.getOclExpression_LetExp(), "in_", null, 1, 1, LetExp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(ifExpEClass, IfExp.class, "IfExp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIfExp_ThenExpression(), this.getOclExpression(), this.getOclExpression_IfExp2(), "thenExpression", null, 1, 1, IfExp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getIfExp_Condition(), this.getOclExpression(), this.getOclExpression_IfExp1(), "condition", null, 1, 1, IfExp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getIfExp_ElseExpression(), this.getOclExpression(), this.getOclExpression_IfExp3(), "elseExpression", null, 1, 1, IfExp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(variableDeclarationEClass, VariableDeclaration.class, "VariableDeclaration", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVariableDeclaration_VarName(), this.getString(), "varName", null, 1, 1, VariableDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getVariableDeclaration_Type(), this.getOclType(), this.getOclType_VariableDeclaration(), "type", null, 0, 1, VariableDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getVariableDeclaration_VariableExp(), this.getVariableExp(), this.getVariableExp_ReferredVariable(), "variableExp", null, 0, -1, VariableDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(localVariableEClass, LocalVariable.class, "LocalVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLocalVariable_LetExp(), this.getLetExp(), this.getLetExp_Variable(), "letExp", null, 0, 1, LocalVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getLocalVariable_InitExpression(), this.getOclExpression(), this.getOclExpression_InitializedVariable(), "initExpression", null, 1, 1, LocalVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getLocalVariable_BaseExp(), this.getIterateExp(), this.getIterateExp_Result(), "baseExp", null, 0, 1, LocalVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getLocalVariable_Eq(), this.getString(), "eq", null, 1, 1, LocalVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iteratorEClass, Iterator.class, "Iterator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIterator_LoopExpr(), this.getLoopExp(), this.getLoopExp_Iterators(), "loopExpr", null, 0, 1, Iterator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(parameterEClass, Parameter.class, "Parameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getParameter_Operation(), this.getOperation(), this.getOperation_Parameters(), "operation", null, 1, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(collectionTypeEClass, CollectionType.class, "CollectionType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCollectionType_ElementType(), this.getOclType(), this.getOclType_CollectionTypes(), "elementType", null, 1, 1, CollectionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(oclTypeEClass, OclType.class, "OclType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOclType_Name(), this.getString(), "name", "OclType", 1, 1, OclType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getOclType_Definitions(), this.getOclContextDefinition(), this.getOclContextDefinition_Context_(), "definitions", null, 0, 1, OclType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getOclType_OclExpression(), this.getOclExpression(), this.getOclExpression_Type(), "oclExpression", null, 0, 1, OclType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getOclType_Operation(), this.getOperation(), this.getOperation_ReturnType(), "operation", null, 0, 1, OclType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getOclType_MapType2(), this.getMapType(), this.getMapType_ValueType(), "mapType2", null, 0, 1, OclType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getOclType_Attribute(), this.getAttribute(), this.getAttribute_Type(), "attribute", null, 0, 1, OclType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getOclType_MapType(), this.getMapType(), this.getMapType_KeyType(), "mapType", null, 0, 1, OclType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getOclType_CollectionTypes(), this.getCollectionType(), this.getCollectionType_ElementType(), "collectionTypes", null, 0, 1, OclType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getOclType_TupleTypeAttribute(), this.getTupleTypeAttribute(), this.getTupleTypeAttribute_Type(), "tupleTypeAttribute", null, 0, 1, OclType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getOclType_VariableDeclaration(), this.getVariableDeclaration(), this.getVariableDeclaration_Type(), "variableDeclaration", null, 0, 1, OclType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getOclType_LambdaReturnType(), this.getLambdaType(), this.getLambdaType_ReturnType(), "lambdaReturnType", null, 0, 1, OclType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOclType_LambdaArgType(), this.getLambdaType(), this.getLambdaType_ArgumentTypes(), "lambdaArgType", null, 0, 1, OclType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOclType_StaticPropertyCall(), this.getStaticPropertyCallExp(), this.getStaticPropertyCallExp_Source(), "staticPropertyCall", null, 0, 1, OclType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(oclModelElementExpEClass, OclModelElementExp.class, "OclModelElementExp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOclModelElementExp_Model(), this.getOclModel(), null, "model", null, 1, 1, OclModelElementExp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOclModelElementExp_Name(), this.getString(), "name", "OclType", 1, 1, OclModelElementExp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(primitiveEClass, Primitive.class, "Primitive", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(stringTypeEClass, StringType.class, "StringType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(booleanTypeEClass, BooleanType.class, "BooleanType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(numericTypeEClass, NumericType.class, "NumericType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(integerTypeEClass, IntegerType.class, "IntegerType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(realTypeEClass, RealType.class, "RealType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(bagTypeEClass, BagType.class, "BagType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(orderedSetTypeEClass, OrderedSetType.class, "OrderedSetType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sequenceTypeEClass, SequenceType.class, "SequenceType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(setTypeEClass, SetType.class, "SetType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(oclAnyTypeEClass, OclAnyType.class, "OclAnyType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tupleTypeEClass, TupleType.class, "TupleType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTupleType_Attributes(), this.getTupleTypeAttribute(), this.getTupleTypeAttribute_TupleType(), "attributes", null, 0, -1, TupleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tupleTypeAttributeEClass, TupleTypeAttribute.class, "TupleTypeAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTupleTypeAttribute_Type(), this.getOclType(), this.getOclType_TupleTypeAttribute(), "type", null, 1, 1, TupleTypeAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTupleTypeAttribute_TupleType(), this.getTupleType(), this.getTupleType_Attributes(), "tupleType", null, 1, 1, TupleTypeAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTupleTypeAttribute_Name(), this.getString(), "name", null, 1, 1, TupleTypeAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(oclModelElementEClass, OclModelElement.class, "OclModelElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOclModelElement_Model(), this.getOclModel(), this.getOclModel_Elements(), "model", null, 1, 1, OclModelElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(mapTypeEClass, MapType.class, "MapType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMapType_ValueType(), this.getOclType(), this.getOclType_MapType2(), "valueType", null, 1, 1, MapType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getMapType_KeyType(), this.getOclType(), this.getOclType_MapType(), "keyType", null, 1, 1, MapType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(lambdaTypeEClass, LambdaType.class, "LambdaType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLambdaType_ReturnType(), this.getOclType(), this.getOclType_LambdaReturnType(), "returnType", null, 1, 1, LambdaType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLambdaType_ArgumentTypes(), this.getOclType(), this.getOclType_LambdaArgType(), "argumentTypes", null, 0, -1, LambdaType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(envTypeEClass, EnvType.class, "EnvType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(oclFeatureDefinitionEClass, OclFeatureDefinition.class, "OclFeatureDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOclFeatureDefinition_Feature(), this.getOclFeature(), this.getOclFeature_Definition(), "feature", null, 1, 1, OclFeatureDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getOclFeatureDefinition_Context_(), this.getOclContextDefinition(), this.getOclContextDefinition_Definition(), "context_", null, 0, 1, OclFeatureDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getOclFeatureDefinition_Static(), this.getBoolean(), "static", null, 1, 1, OclFeatureDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(oclContextDefinitionEClass, OclContextDefinition.class, "OclContextDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOclContextDefinition_Definition(), this.getOclFeatureDefinition(), this.getOclFeatureDefinition_Context_(), "definition", null, 1, 1, OclContextDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getOclContextDefinition_Context_(), this.getOclType(), this.getOclType_Definitions(), "context_", null, 1, 1, OclContextDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(oclFeatureEClass, OclFeature.class, "OclFeature", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOclFeature_Definition(), this.getOclFeatureDefinition(), this.getOclFeatureDefinition_Feature(), "definition", null, 0, 1, OclFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getOclFeature_Eq(), this.getString(), "eq", null, 1, 1, OclFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attributeEClass, Attribute.class, "Attribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAttribute_InitExpression(), this.getOclExpression(), this.getOclExpression_OwningAttribute(), "initExpression", null, 1, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAttribute_Type(), this.getOclType(), this.getOclType_Attribute(), "type", null, 1, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(operationEClass, Operation.class, "Operation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOperation_Parameters(), this.getParameter(), this.getParameter_Operation(), "parameters", null, 0, -1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperation_ReturnType(), this.getOclType(), this.getOclType_Operation(), "returnType", null, 1, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getOperation_Body(), this.getOclExpression(), this.getOclExpression_OwningOperation(), "body", null, 1, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(oclModelEClass, OclModel.class, "OclModel", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOclModel_Elements(), this.getOclModelElement(), this.getOclModelElement_Model(), "elements", null, 0, -1, OclModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(oclMetamodelEClass, OclMetamodel.class, "OclMetamodel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOclMetamodel_Model(), this.getOclInstanceModel(), this.getOclInstanceModel_Metamodel(), "model", null, 0, -1, OclMetamodel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getOclMetamodel_Uri(), this.getString(), "uri", null, 0, 1, OclMetamodel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(oclInstanceModelEClass, OclInstanceModel.class, "OclInstanceModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOclInstanceModel_Metamodel(), this.getOclMetamodel(), this.getOclMetamodel_Model(), "metamodel", null, 1, 1, OclInstanceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		// Initialize data types
		initEDataType(booleanEDataType, boolean.class, "Boolean", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(doubleEDataType, double.class, "Double", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(integerEDataType, int.class, "Integer", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(stringEDataType, String.class, "String", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
	}

} //QMM_OCLPackageImpl
