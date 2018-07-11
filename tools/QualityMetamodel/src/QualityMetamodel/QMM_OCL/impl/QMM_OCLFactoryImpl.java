/**
 */
package QualityMetamodel.QMM_OCL.impl;

import QualityMetamodel.QMM_OCL.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
public class QMM_OCLFactoryImpl extends EFactoryImpl implements QMM_OCLFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static QMM_OCLFactory init() {
		try {
			QMM_OCLFactory theQMM_OCLFactory = (QMM_OCLFactory)EPackage.Registry.INSTANCE.getEFactory(QMM_OCLPackage.eNS_URI);
			if (theQMM_OCLFactory != null) {
				return theQMM_OCLFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new QMM_OCLFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QMM_OCLFactoryImpl() {
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
			case QMM_OCLPackage.MODULE: return createModule();
			case QMM_OCLPackage.IMPORT: return createImport();
			case QMM_OCLPackage.VARIABLE_EXP: return createVariableExp();
			case QMM_OCLPackage.SUPER_EXP: return createSuperExp();
			case QMM_OCLPackage.SELF_EXP: return createSelfExp();
			case QMM_OCLPackage.ENV_EXP: return createEnvExp();
			case QMM_OCLPackage.STRING_EXP: return createStringExp();
			case QMM_OCLPackage.BOOLEAN_EXP: return createBooleanExp();
			case QMM_OCLPackage.REAL_EXP: return createRealExp();
			case QMM_OCLPackage.INTEGER_EXP: return createIntegerExp();
			case QMM_OCLPackage.COLLECTION_RANGE: return createCollectionRange();
			case QMM_OCLPackage.COLLECTION_ITEM: return createCollectionItem();
			case QMM_OCLPackage.BAG_EXP: return createBagExp();
			case QMM_OCLPackage.ORDERED_SET_EXP: return createOrderedSetExp();
			case QMM_OCLPackage.SEQUENCE_EXP: return createSequenceExp();
			case QMM_OCLPackage.SET_EXP: return createSetExp();
			case QMM_OCLPackage.TUPLE_EXP: return createTupleExp();
			case QMM_OCLPackage.TUPLE_PART: return createTuplePart();
			case QMM_OCLPackage.MAP_EXP: return createMapExp();
			case QMM_OCLPackage.MAP_ELEMENT: return createMapElement();
			case QMM_OCLPackage.ENUM_LITERAL_EXP: return createEnumLiteralExp();
			case QMM_OCLPackage.OCL_UNDEFINED_EXP: return createOclUndefinedExp();
			case QMM_OCLPackage.STATIC_PROPERTY_CALL_EXP: return createStaticPropertyCallExp();
			case QMM_OCLPackage.STATIC_NAVIGATION_OR_ATTRIBUTE_CALL: return createStaticNavigationOrAttributeCall();
			case QMM_OCLPackage.STATIC_OPERATION_CALL: return createStaticOperationCall();
			case QMM_OCLPackage.PROPERTY_CALL_EXP: return createPropertyCallExp();
			case QMM_OCLPackage.NAVIGATION_OR_ATTRIBUTE_CALL: return createNavigationOrAttributeCall();
			case QMM_OCLPackage.OPERATION_CALL: return createOperationCall();
			case QMM_OCLPackage.OPERATOR_CALL_EXP: return createOperatorCallExp();
			case QMM_OCLPackage.NOT_OP_CALL_EXP: return createNotOpCallExp();
			case QMM_OCLPackage.REL_OP_CALL_EXP: return createRelOpCallExp();
			case QMM_OCLPackage.EQ_OP_CALL_EXP: return createEqOpCallExp();
			case QMM_OCLPackage.ADD_OP_CALL_EXP: return createAddOpCallExp();
			case QMM_OCLPackage.INT_OP_CALL_EXP: return createIntOpCallExp();
			case QMM_OCLPackage.MUL_OP_CALL_EXP: return createMulOpCallExp();
			case QMM_OCLPackage.LAMBDA_CALL_EXP: return createLambdaCallExp();
			case QMM_OCLPackage.BRACE_EXP: return createBraceExp();
			case QMM_OCLPackage.COLLECTION_OPERATION_CALL: return createCollectionOperationCall();
			case QMM_OCLPackage.ITERATE_EXP: return createIterateExp();
			case QMM_OCLPackage.ITERATOR_EXP: return createIteratorExp();
			case QMM_OCLPackage.LET_EXP: return createLetExp();
			case QMM_OCLPackage.IF_EXP: return createIfExp();
			case QMM_OCLPackage.LOCAL_VARIABLE: return createLocalVariable();
			case QMM_OCLPackage.ITERATOR: return createIterator();
			case QMM_OCLPackage.PARAMETER: return createParameter();
			case QMM_OCLPackage.COLLECTION_TYPE: return createCollectionType();
			case QMM_OCLPackage.OCL_TYPE: return createOclType();
			case QMM_OCLPackage.OCL_MODEL_ELEMENT_EXP: return createOclModelElementExp();
			case QMM_OCLPackage.STRING_TYPE: return createStringType();
			case QMM_OCLPackage.BOOLEAN_TYPE: return createBooleanType();
			case QMM_OCLPackage.INTEGER_TYPE: return createIntegerType();
			case QMM_OCLPackage.REAL_TYPE: return createRealType();
			case QMM_OCLPackage.BAG_TYPE: return createBagType();
			case QMM_OCLPackage.ORDERED_SET_TYPE: return createOrderedSetType();
			case QMM_OCLPackage.SEQUENCE_TYPE: return createSequenceType();
			case QMM_OCLPackage.SET_TYPE: return createSetType();
			case QMM_OCLPackage.OCL_ANY_TYPE: return createOclAnyType();
			case QMM_OCLPackage.TUPLE_TYPE: return createTupleType();
			case QMM_OCLPackage.TUPLE_TYPE_ATTRIBUTE: return createTupleTypeAttribute();
			case QMM_OCLPackage.OCL_MODEL_ELEMENT: return createOclModelElement();
			case QMM_OCLPackage.MAP_TYPE: return createMapType();
			case QMM_OCLPackage.LAMBDA_TYPE: return createLambdaType();
			case QMM_OCLPackage.ENV_TYPE: return createEnvType();
			case QMM_OCLPackage.OCL_FEATURE_DEFINITION: return createOclFeatureDefinition();
			case QMM_OCLPackage.OCL_CONTEXT_DEFINITION: return createOclContextDefinition();
			case QMM_OCLPackage.ATTRIBUTE: return createAttribute();
			case QMM_OCLPackage.OPERATION: return createOperation();
			case QMM_OCLPackage.OCL_METAMODEL: return createOclMetamodel();
			case QMM_OCLPackage.OCL_INSTANCE_MODEL: return createOclInstanceModel();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case QMM_OCLPackage.BOOLEAN:
				return createBooleanFromString(eDataType, initialValue);
			case QMM_OCLPackage.DOUBLE:
				return createDoubleFromString(eDataType, initialValue);
			case QMM_OCLPackage.INTEGER:
				return createIntegerFromString(eDataType, initialValue);
			case QMM_OCLPackage.STRING:
				return createStringFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case QMM_OCLPackage.BOOLEAN:
				return convertBooleanToString(eDataType, instanceValue);
			case QMM_OCLPackage.DOUBLE:
				return convertDoubleToString(eDataType, instanceValue);
			case QMM_OCLPackage.INTEGER:
				return convertIntegerToString(eDataType, instanceValue);
			case QMM_OCLPackage.STRING:
				return convertStringToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Module createModule() {
		ModuleImpl module = new ModuleImpl();
		return module;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Import createImport() {
		ImportImpl import_ = new ImportImpl();
		return import_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableExp createVariableExp() {
		VariableExpImpl variableExp = new VariableExpImpl();
		return variableExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SuperExp createSuperExp() {
		SuperExpImpl superExp = new SuperExpImpl();
		return superExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SelfExp createSelfExp() {
		SelfExpImpl selfExp = new SelfExpImpl();
		return selfExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnvExp createEnvExp() {
		EnvExpImpl envExp = new EnvExpImpl();
		return envExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringExp createStringExp() {
		StringExpImpl stringExp = new StringExpImpl();
		return stringExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanExp createBooleanExp() {
		BooleanExpImpl booleanExp = new BooleanExpImpl();
		return booleanExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RealExp createRealExp() {
		RealExpImpl realExp = new RealExpImpl();
		return realExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerExp createIntegerExp() {
		IntegerExpImpl integerExp = new IntegerExpImpl();
		return integerExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollectionRange createCollectionRange() {
		CollectionRangeImpl collectionRange = new CollectionRangeImpl();
		return collectionRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollectionItem createCollectionItem() {
		CollectionItemImpl collectionItem = new CollectionItemImpl();
		return collectionItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BagExp createBagExp() {
		BagExpImpl bagExp = new BagExpImpl();
		return bagExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrderedSetExp createOrderedSetExp() {
		OrderedSetExpImpl orderedSetExp = new OrderedSetExpImpl();
		return orderedSetExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SequenceExp createSequenceExp() {
		SequenceExpImpl sequenceExp = new SequenceExpImpl();
		return sequenceExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SetExp createSetExp() {
		SetExpImpl setExp = new SetExpImpl();
		return setExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TupleExp createTupleExp() {
		TupleExpImpl tupleExp = new TupleExpImpl();
		return tupleExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TuplePart createTuplePart() {
		TuplePartImpl tuplePart = new TuplePartImpl();
		return tuplePart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MapExp createMapExp() {
		MapExpImpl mapExp = new MapExpImpl();
		return mapExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MapElement createMapElement() {
		MapElementImpl mapElement = new MapElementImpl();
		return mapElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumLiteralExp createEnumLiteralExp() {
		EnumLiteralExpImpl enumLiteralExp = new EnumLiteralExpImpl();
		return enumLiteralExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OclUndefinedExp createOclUndefinedExp() {
		OclUndefinedExpImpl oclUndefinedExp = new OclUndefinedExpImpl();
		return oclUndefinedExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StaticPropertyCallExp createStaticPropertyCallExp() {
		StaticPropertyCallExpImpl staticPropertyCallExp = new StaticPropertyCallExpImpl();
		return staticPropertyCallExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StaticNavigationOrAttributeCall createStaticNavigationOrAttributeCall() {
		StaticNavigationOrAttributeCallImpl staticNavigationOrAttributeCall = new StaticNavigationOrAttributeCallImpl();
		return staticNavigationOrAttributeCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StaticOperationCall createStaticOperationCall() {
		StaticOperationCallImpl staticOperationCall = new StaticOperationCallImpl();
		return staticOperationCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyCallExp createPropertyCallExp() {
		PropertyCallExpImpl propertyCallExp = new PropertyCallExpImpl();
		return propertyCallExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NavigationOrAttributeCall createNavigationOrAttributeCall() {
		NavigationOrAttributeCallImpl navigationOrAttributeCall = new NavigationOrAttributeCallImpl();
		return navigationOrAttributeCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationCall createOperationCall() {
		OperationCallImpl operationCall = new OperationCallImpl();
		return operationCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperatorCallExp createOperatorCallExp() {
		OperatorCallExpImpl operatorCallExp = new OperatorCallExpImpl();
		return operatorCallExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotOpCallExp createNotOpCallExp() {
		NotOpCallExpImpl notOpCallExp = new NotOpCallExpImpl();
		return notOpCallExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelOpCallExp createRelOpCallExp() {
		RelOpCallExpImpl relOpCallExp = new RelOpCallExpImpl();
		return relOpCallExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EqOpCallExp createEqOpCallExp() {
		EqOpCallExpImpl eqOpCallExp = new EqOpCallExpImpl();
		return eqOpCallExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddOpCallExp createAddOpCallExp() {
		AddOpCallExpImpl addOpCallExp = new AddOpCallExpImpl();
		return addOpCallExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntOpCallExp createIntOpCallExp() {
		IntOpCallExpImpl intOpCallExp = new IntOpCallExpImpl();
		return intOpCallExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MulOpCallExp createMulOpCallExp() {
		MulOpCallExpImpl mulOpCallExp = new MulOpCallExpImpl();
		return mulOpCallExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LambdaCallExp createLambdaCallExp() {
		LambdaCallExpImpl lambdaCallExp = new LambdaCallExpImpl();
		return lambdaCallExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BraceExp createBraceExp() {
		BraceExpImpl braceExp = new BraceExpImpl();
		return braceExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollectionOperationCall createCollectionOperationCall() {
		CollectionOperationCallImpl collectionOperationCall = new CollectionOperationCallImpl();
		return collectionOperationCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IterateExp createIterateExp() {
		IterateExpImpl iterateExp = new IterateExpImpl();
		return iterateExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IteratorExp createIteratorExp() {
		IteratorExpImpl iteratorExp = new IteratorExpImpl();
		return iteratorExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LetExp createLetExp() {
		LetExpImpl letExp = new LetExpImpl();
		return letExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfExp createIfExp() {
		IfExpImpl ifExp = new IfExpImpl();
		return ifExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocalVariable createLocalVariable() {
		LocalVariableImpl localVariable = new LocalVariableImpl();
		return localVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Iterator createIterator() {
		IteratorImpl iterator = new IteratorImpl();
		return iterator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter createParameter() {
		ParameterImpl parameter = new ParameterImpl();
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollectionType createCollectionType() {
		CollectionTypeImpl collectionType = new CollectionTypeImpl();
		return collectionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OclType createOclType() {
		OclTypeImpl oclType = new OclTypeImpl();
		return oclType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OclModelElementExp createOclModelElementExp() {
		OclModelElementExpImpl oclModelElementExp = new OclModelElementExpImpl();
		return oclModelElementExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringType createStringType() {
		StringTypeImpl stringType = new StringTypeImpl();
		return stringType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanType createBooleanType() {
		BooleanTypeImpl booleanType = new BooleanTypeImpl();
		return booleanType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerType createIntegerType() {
		IntegerTypeImpl integerType = new IntegerTypeImpl();
		return integerType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RealType createRealType() {
		RealTypeImpl realType = new RealTypeImpl();
		return realType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BagType createBagType() {
		BagTypeImpl bagType = new BagTypeImpl();
		return bagType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrderedSetType createOrderedSetType() {
		OrderedSetTypeImpl orderedSetType = new OrderedSetTypeImpl();
		return orderedSetType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SequenceType createSequenceType() {
		SequenceTypeImpl sequenceType = new SequenceTypeImpl();
		return sequenceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SetType createSetType() {
		SetTypeImpl setType = new SetTypeImpl();
		return setType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OclAnyType createOclAnyType() {
		OclAnyTypeImpl oclAnyType = new OclAnyTypeImpl();
		return oclAnyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TupleType createTupleType() {
		TupleTypeImpl tupleType = new TupleTypeImpl();
		return tupleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TupleTypeAttribute createTupleTypeAttribute() {
		TupleTypeAttributeImpl tupleTypeAttribute = new TupleTypeAttributeImpl();
		return tupleTypeAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OclModelElement createOclModelElement() {
		OclModelElementImpl oclModelElement = new OclModelElementImpl();
		return oclModelElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MapType createMapType() {
		MapTypeImpl mapType = new MapTypeImpl();
		return mapType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LambdaType createLambdaType() {
		LambdaTypeImpl lambdaType = new LambdaTypeImpl();
		return lambdaType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnvType createEnvType() {
		EnvTypeImpl envType = new EnvTypeImpl();
		return envType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OclFeatureDefinition createOclFeatureDefinition() {
		OclFeatureDefinitionImpl oclFeatureDefinition = new OclFeatureDefinitionImpl();
		return oclFeatureDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OclContextDefinition createOclContextDefinition() {
		OclContextDefinitionImpl oclContextDefinition = new OclContextDefinitionImpl();
		return oclContextDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute createAttribute() {
		AttributeImpl attribute = new AttributeImpl();
		return attribute;
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
	public OclMetamodel createOclMetamodel() {
		OclMetamodelImpl oclMetamodel = new OclMetamodelImpl();
		return oclMetamodel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OclInstanceModel createOclInstanceModel() {
		OclInstanceModelImpl oclInstanceModel = new OclInstanceModelImpl();
		return oclInstanceModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean createBooleanFromString(EDataType eDataType, String initialValue) {
		return (Boolean)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBooleanToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createDoubleFromString(EDataType eDataType, String initialValue) {
		return (Double)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDoubleToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer createIntegerFromString(EDataType eDataType, String initialValue) {
		return (Integer)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIntegerToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createStringFromString(EDataType eDataType, String initialValue) {
		return (String)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStringToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QMM_OCLPackage getQMM_OCLPackage() {
		return (QMM_OCLPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static QMM_OCLPackage getPackage() {
		return QMM_OCLPackage.eINSTANCE;
	}

} //QMM_OCLFactoryImpl
