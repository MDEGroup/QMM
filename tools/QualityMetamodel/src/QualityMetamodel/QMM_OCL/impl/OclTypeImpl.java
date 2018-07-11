/**
 */
package QualityMetamodel.QMM_OCL.impl;

import QualityMetamodel.QMM_OCL.Attribute;
import QualityMetamodel.QMM_OCL.CollectionType;
import QualityMetamodel.QMM_OCL.LambdaType;
import QualityMetamodel.QMM_OCL.MapType;
import QualityMetamodel.QMM_OCL.OclContextDefinition;
import QualityMetamodel.QMM_OCL.OclExpression;
import QualityMetamodel.QMM_OCL.OclType;
import QualityMetamodel.QMM_OCL.Operation;
import QualityMetamodel.QMM_OCL.QMM_OCLPackage;
import QualityMetamodel.QMM_OCL.StaticPropertyCallExp;
import QualityMetamodel.QMM_OCL.TupleTypeAttribute;
import QualityMetamodel.QMM_OCL.VariableDeclaration;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ocl Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link QualityMetamodel.QMM_OCL.impl.OclTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link QualityMetamodel.QMM_OCL.impl.OclTypeImpl#getDefinitions <em>Definitions</em>}</li>
 *   <li>{@link QualityMetamodel.QMM_OCL.impl.OclTypeImpl#getOclExpression <em>Ocl Expression</em>}</li>
 *   <li>{@link QualityMetamodel.QMM_OCL.impl.OclTypeImpl#getOperation <em>Operation</em>}</li>
 *   <li>{@link QualityMetamodel.QMM_OCL.impl.OclTypeImpl#getMapType2 <em>Map Type2</em>}</li>
 *   <li>{@link QualityMetamodel.QMM_OCL.impl.OclTypeImpl#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link QualityMetamodel.QMM_OCL.impl.OclTypeImpl#getMapType <em>Map Type</em>}</li>
 *   <li>{@link QualityMetamodel.QMM_OCL.impl.OclTypeImpl#getCollectionTypes <em>Collection Types</em>}</li>
 *   <li>{@link QualityMetamodel.QMM_OCL.impl.OclTypeImpl#getTupleTypeAttribute <em>Tuple Type Attribute</em>}</li>
 *   <li>{@link QualityMetamodel.QMM_OCL.impl.OclTypeImpl#getVariableDeclaration <em>Variable Declaration</em>}</li>
 *   <li>{@link QualityMetamodel.QMM_OCL.impl.OclTypeImpl#getLambdaReturnType <em>Lambda Return Type</em>}</li>
 *   <li>{@link QualityMetamodel.QMM_OCL.impl.OclTypeImpl#getLambdaArgType <em>Lambda Arg Type</em>}</li>
 *   <li>{@link QualityMetamodel.QMM_OCL.impl.OclTypeImpl#getStaticPropertyCall <em>Static Property Call</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OclTypeImpl extends LocatedElementImpl implements OclType {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = "OclType";

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OclTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QMM_OCLPackage.Literals.OCL_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QMM_OCLPackage.OCL_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OclContextDefinition getDefinitions() {
		if (eContainerFeatureID() != QMM_OCLPackage.OCL_TYPE__DEFINITIONS) return null;
		return (OclContextDefinition)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefinitions(OclContextDefinition newDefinitions, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newDefinitions, QMM_OCLPackage.OCL_TYPE__DEFINITIONS, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefinitions(OclContextDefinition newDefinitions) {
		if (newDefinitions != eInternalContainer() || (eContainerFeatureID() != QMM_OCLPackage.OCL_TYPE__DEFINITIONS && newDefinitions != null)) {
			if (EcoreUtil.isAncestor(this, newDefinitions))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newDefinitions != null)
				msgs = ((InternalEObject)newDefinitions).eInverseAdd(this, QMM_OCLPackage.OCL_CONTEXT_DEFINITION__CONTEXT_, OclContextDefinition.class, msgs);
			msgs = basicSetDefinitions(newDefinitions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QMM_OCLPackage.OCL_TYPE__DEFINITIONS, newDefinitions, newDefinitions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OclExpression getOclExpression() {
		if (eContainerFeatureID() != QMM_OCLPackage.OCL_TYPE__OCL_EXPRESSION) return null;
		return (OclExpression)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOclExpression(OclExpression newOclExpression, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOclExpression, QMM_OCLPackage.OCL_TYPE__OCL_EXPRESSION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOclExpression(OclExpression newOclExpression) {
		if (newOclExpression != eInternalContainer() || (eContainerFeatureID() != QMM_OCLPackage.OCL_TYPE__OCL_EXPRESSION && newOclExpression != null)) {
			if (EcoreUtil.isAncestor(this, newOclExpression))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOclExpression != null)
				msgs = ((InternalEObject)newOclExpression).eInverseAdd(this, QMM_OCLPackage.OCL_EXPRESSION__TYPE, OclExpression.class, msgs);
			msgs = basicSetOclExpression(newOclExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QMM_OCLPackage.OCL_TYPE__OCL_EXPRESSION, newOclExpression, newOclExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation getOperation() {
		if (eContainerFeatureID() != QMM_OCLPackage.OCL_TYPE__OPERATION) return null;
		return (Operation)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOperation(Operation newOperation, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOperation, QMM_OCLPackage.OCL_TYPE__OPERATION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperation(Operation newOperation) {
		if (newOperation != eInternalContainer() || (eContainerFeatureID() != QMM_OCLPackage.OCL_TYPE__OPERATION && newOperation != null)) {
			if (EcoreUtil.isAncestor(this, newOperation))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOperation != null)
				msgs = ((InternalEObject)newOperation).eInverseAdd(this, QMM_OCLPackage.OPERATION__RETURN_TYPE, Operation.class, msgs);
			msgs = basicSetOperation(newOperation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QMM_OCLPackage.OCL_TYPE__OPERATION, newOperation, newOperation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MapType getMapType2() {
		if (eContainerFeatureID() != QMM_OCLPackage.OCL_TYPE__MAP_TYPE2) return null;
		return (MapType)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMapType2(MapType newMapType2, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newMapType2, QMM_OCLPackage.OCL_TYPE__MAP_TYPE2, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMapType2(MapType newMapType2) {
		if (newMapType2 != eInternalContainer() || (eContainerFeatureID() != QMM_OCLPackage.OCL_TYPE__MAP_TYPE2 && newMapType2 != null)) {
			if (EcoreUtil.isAncestor(this, newMapType2))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newMapType2 != null)
				msgs = ((InternalEObject)newMapType2).eInverseAdd(this, QMM_OCLPackage.MAP_TYPE__VALUE_TYPE, MapType.class, msgs);
			msgs = basicSetMapType2(newMapType2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QMM_OCLPackage.OCL_TYPE__MAP_TYPE2, newMapType2, newMapType2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute getAttribute() {
		if (eContainerFeatureID() != QMM_OCLPackage.OCL_TYPE__ATTRIBUTE) return null;
		return (Attribute)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAttribute(Attribute newAttribute, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newAttribute, QMM_OCLPackage.OCL_TYPE__ATTRIBUTE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttribute(Attribute newAttribute) {
		if (newAttribute != eInternalContainer() || (eContainerFeatureID() != QMM_OCLPackage.OCL_TYPE__ATTRIBUTE && newAttribute != null)) {
			if (EcoreUtil.isAncestor(this, newAttribute))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newAttribute != null)
				msgs = ((InternalEObject)newAttribute).eInverseAdd(this, QMM_OCLPackage.ATTRIBUTE__TYPE, Attribute.class, msgs);
			msgs = basicSetAttribute(newAttribute, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QMM_OCLPackage.OCL_TYPE__ATTRIBUTE, newAttribute, newAttribute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MapType getMapType() {
		if (eContainerFeatureID() != QMM_OCLPackage.OCL_TYPE__MAP_TYPE) return null;
		return (MapType)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMapType(MapType newMapType, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newMapType, QMM_OCLPackage.OCL_TYPE__MAP_TYPE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMapType(MapType newMapType) {
		if (newMapType != eInternalContainer() || (eContainerFeatureID() != QMM_OCLPackage.OCL_TYPE__MAP_TYPE && newMapType != null)) {
			if (EcoreUtil.isAncestor(this, newMapType))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newMapType != null)
				msgs = ((InternalEObject)newMapType).eInverseAdd(this, QMM_OCLPackage.MAP_TYPE__KEY_TYPE, MapType.class, msgs);
			msgs = basicSetMapType(newMapType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QMM_OCLPackage.OCL_TYPE__MAP_TYPE, newMapType, newMapType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollectionType getCollectionTypes() {
		if (eContainerFeatureID() != QMM_OCLPackage.OCL_TYPE__COLLECTION_TYPES) return null;
		return (CollectionType)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCollectionTypes(CollectionType newCollectionTypes, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newCollectionTypes, QMM_OCLPackage.OCL_TYPE__COLLECTION_TYPES, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCollectionTypes(CollectionType newCollectionTypes) {
		if (newCollectionTypes != eInternalContainer() || (eContainerFeatureID() != QMM_OCLPackage.OCL_TYPE__COLLECTION_TYPES && newCollectionTypes != null)) {
			if (EcoreUtil.isAncestor(this, newCollectionTypes))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newCollectionTypes != null)
				msgs = ((InternalEObject)newCollectionTypes).eInverseAdd(this, QMM_OCLPackage.COLLECTION_TYPE__ELEMENT_TYPE, CollectionType.class, msgs);
			msgs = basicSetCollectionTypes(newCollectionTypes, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QMM_OCLPackage.OCL_TYPE__COLLECTION_TYPES, newCollectionTypes, newCollectionTypes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TupleTypeAttribute getTupleTypeAttribute() {
		if (eContainerFeatureID() != QMM_OCLPackage.OCL_TYPE__TUPLE_TYPE_ATTRIBUTE) return null;
		return (TupleTypeAttribute)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTupleTypeAttribute(TupleTypeAttribute newTupleTypeAttribute, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newTupleTypeAttribute, QMM_OCLPackage.OCL_TYPE__TUPLE_TYPE_ATTRIBUTE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTupleTypeAttribute(TupleTypeAttribute newTupleTypeAttribute) {
		if (newTupleTypeAttribute != eInternalContainer() || (eContainerFeatureID() != QMM_OCLPackage.OCL_TYPE__TUPLE_TYPE_ATTRIBUTE && newTupleTypeAttribute != null)) {
			if (EcoreUtil.isAncestor(this, newTupleTypeAttribute))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newTupleTypeAttribute != null)
				msgs = ((InternalEObject)newTupleTypeAttribute).eInverseAdd(this, QMM_OCLPackage.TUPLE_TYPE_ATTRIBUTE__TYPE, TupleTypeAttribute.class, msgs);
			msgs = basicSetTupleTypeAttribute(newTupleTypeAttribute, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QMM_OCLPackage.OCL_TYPE__TUPLE_TYPE_ATTRIBUTE, newTupleTypeAttribute, newTupleTypeAttribute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableDeclaration getVariableDeclaration() {
		if (eContainerFeatureID() != QMM_OCLPackage.OCL_TYPE__VARIABLE_DECLARATION) return null;
		return (VariableDeclaration)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVariableDeclaration(VariableDeclaration newVariableDeclaration, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newVariableDeclaration, QMM_OCLPackage.OCL_TYPE__VARIABLE_DECLARATION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVariableDeclaration(VariableDeclaration newVariableDeclaration) {
		if (newVariableDeclaration != eInternalContainer() || (eContainerFeatureID() != QMM_OCLPackage.OCL_TYPE__VARIABLE_DECLARATION && newVariableDeclaration != null)) {
			if (EcoreUtil.isAncestor(this, newVariableDeclaration))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newVariableDeclaration != null)
				msgs = ((InternalEObject)newVariableDeclaration).eInverseAdd(this, QMM_OCLPackage.VARIABLE_DECLARATION__TYPE, VariableDeclaration.class, msgs);
			msgs = basicSetVariableDeclaration(newVariableDeclaration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QMM_OCLPackage.OCL_TYPE__VARIABLE_DECLARATION, newVariableDeclaration, newVariableDeclaration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LambdaType getLambdaReturnType() {
		if (eContainerFeatureID() != QMM_OCLPackage.OCL_TYPE__LAMBDA_RETURN_TYPE) return null;
		return (LambdaType)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLambdaReturnType(LambdaType newLambdaReturnType, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newLambdaReturnType, QMM_OCLPackage.OCL_TYPE__LAMBDA_RETURN_TYPE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLambdaReturnType(LambdaType newLambdaReturnType) {
		if (newLambdaReturnType != eInternalContainer() || (eContainerFeatureID() != QMM_OCLPackage.OCL_TYPE__LAMBDA_RETURN_TYPE && newLambdaReturnType != null)) {
			if (EcoreUtil.isAncestor(this, newLambdaReturnType))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newLambdaReturnType != null)
				msgs = ((InternalEObject)newLambdaReturnType).eInverseAdd(this, QMM_OCLPackage.LAMBDA_TYPE__RETURN_TYPE, LambdaType.class, msgs);
			msgs = basicSetLambdaReturnType(newLambdaReturnType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QMM_OCLPackage.OCL_TYPE__LAMBDA_RETURN_TYPE, newLambdaReturnType, newLambdaReturnType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LambdaType getLambdaArgType() {
		if (eContainerFeatureID() != QMM_OCLPackage.OCL_TYPE__LAMBDA_ARG_TYPE) return null;
		return (LambdaType)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLambdaArgType(LambdaType newLambdaArgType, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newLambdaArgType, QMM_OCLPackage.OCL_TYPE__LAMBDA_ARG_TYPE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLambdaArgType(LambdaType newLambdaArgType) {
		if (newLambdaArgType != eInternalContainer() || (eContainerFeatureID() != QMM_OCLPackage.OCL_TYPE__LAMBDA_ARG_TYPE && newLambdaArgType != null)) {
			if (EcoreUtil.isAncestor(this, newLambdaArgType))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newLambdaArgType != null)
				msgs = ((InternalEObject)newLambdaArgType).eInverseAdd(this, QMM_OCLPackage.LAMBDA_TYPE__ARGUMENT_TYPES, LambdaType.class, msgs);
			msgs = basicSetLambdaArgType(newLambdaArgType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QMM_OCLPackage.OCL_TYPE__LAMBDA_ARG_TYPE, newLambdaArgType, newLambdaArgType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StaticPropertyCallExp getStaticPropertyCall() {
		if (eContainerFeatureID() != QMM_OCLPackage.OCL_TYPE__STATIC_PROPERTY_CALL) return null;
		return (StaticPropertyCallExp)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStaticPropertyCall(StaticPropertyCallExp newStaticPropertyCall, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newStaticPropertyCall, QMM_OCLPackage.OCL_TYPE__STATIC_PROPERTY_CALL, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStaticPropertyCall(StaticPropertyCallExp newStaticPropertyCall) {
		if (newStaticPropertyCall != eInternalContainer() || (eContainerFeatureID() != QMM_OCLPackage.OCL_TYPE__STATIC_PROPERTY_CALL && newStaticPropertyCall != null)) {
			if (EcoreUtil.isAncestor(this, newStaticPropertyCall))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newStaticPropertyCall != null)
				msgs = ((InternalEObject)newStaticPropertyCall).eInverseAdd(this, QMM_OCLPackage.STATIC_PROPERTY_CALL_EXP__SOURCE, StaticPropertyCallExp.class, msgs);
			msgs = basicSetStaticPropertyCall(newStaticPropertyCall, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QMM_OCLPackage.OCL_TYPE__STATIC_PROPERTY_CALL, newStaticPropertyCall, newStaticPropertyCall));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QMM_OCLPackage.OCL_TYPE__DEFINITIONS:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetDefinitions((OclContextDefinition)otherEnd, msgs);
			case QMM_OCLPackage.OCL_TYPE__OCL_EXPRESSION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOclExpression((OclExpression)otherEnd, msgs);
			case QMM_OCLPackage.OCL_TYPE__OPERATION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOperation((Operation)otherEnd, msgs);
			case QMM_OCLPackage.OCL_TYPE__MAP_TYPE2:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetMapType2((MapType)otherEnd, msgs);
			case QMM_OCLPackage.OCL_TYPE__ATTRIBUTE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetAttribute((Attribute)otherEnd, msgs);
			case QMM_OCLPackage.OCL_TYPE__MAP_TYPE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetMapType((MapType)otherEnd, msgs);
			case QMM_OCLPackage.OCL_TYPE__COLLECTION_TYPES:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetCollectionTypes((CollectionType)otherEnd, msgs);
			case QMM_OCLPackage.OCL_TYPE__TUPLE_TYPE_ATTRIBUTE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetTupleTypeAttribute((TupleTypeAttribute)otherEnd, msgs);
			case QMM_OCLPackage.OCL_TYPE__VARIABLE_DECLARATION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetVariableDeclaration((VariableDeclaration)otherEnd, msgs);
			case QMM_OCLPackage.OCL_TYPE__LAMBDA_RETURN_TYPE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetLambdaReturnType((LambdaType)otherEnd, msgs);
			case QMM_OCLPackage.OCL_TYPE__LAMBDA_ARG_TYPE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetLambdaArgType((LambdaType)otherEnd, msgs);
			case QMM_OCLPackage.OCL_TYPE__STATIC_PROPERTY_CALL:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetStaticPropertyCall((StaticPropertyCallExp)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QMM_OCLPackage.OCL_TYPE__DEFINITIONS:
				return basicSetDefinitions(null, msgs);
			case QMM_OCLPackage.OCL_TYPE__OCL_EXPRESSION:
				return basicSetOclExpression(null, msgs);
			case QMM_OCLPackage.OCL_TYPE__OPERATION:
				return basicSetOperation(null, msgs);
			case QMM_OCLPackage.OCL_TYPE__MAP_TYPE2:
				return basicSetMapType2(null, msgs);
			case QMM_OCLPackage.OCL_TYPE__ATTRIBUTE:
				return basicSetAttribute(null, msgs);
			case QMM_OCLPackage.OCL_TYPE__MAP_TYPE:
				return basicSetMapType(null, msgs);
			case QMM_OCLPackage.OCL_TYPE__COLLECTION_TYPES:
				return basicSetCollectionTypes(null, msgs);
			case QMM_OCLPackage.OCL_TYPE__TUPLE_TYPE_ATTRIBUTE:
				return basicSetTupleTypeAttribute(null, msgs);
			case QMM_OCLPackage.OCL_TYPE__VARIABLE_DECLARATION:
				return basicSetVariableDeclaration(null, msgs);
			case QMM_OCLPackage.OCL_TYPE__LAMBDA_RETURN_TYPE:
				return basicSetLambdaReturnType(null, msgs);
			case QMM_OCLPackage.OCL_TYPE__LAMBDA_ARG_TYPE:
				return basicSetLambdaArgType(null, msgs);
			case QMM_OCLPackage.OCL_TYPE__STATIC_PROPERTY_CALL:
				return basicSetStaticPropertyCall(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case QMM_OCLPackage.OCL_TYPE__DEFINITIONS:
				return eInternalContainer().eInverseRemove(this, QMM_OCLPackage.OCL_CONTEXT_DEFINITION__CONTEXT_, OclContextDefinition.class, msgs);
			case QMM_OCLPackage.OCL_TYPE__OCL_EXPRESSION:
				return eInternalContainer().eInverseRemove(this, QMM_OCLPackage.OCL_EXPRESSION__TYPE, OclExpression.class, msgs);
			case QMM_OCLPackage.OCL_TYPE__OPERATION:
				return eInternalContainer().eInverseRemove(this, QMM_OCLPackage.OPERATION__RETURN_TYPE, Operation.class, msgs);
			case QMM_OCLPackage.OCL_TYPE__MAP_TYPE2:
				return eInternalContainer().eInverseRemove(this, QMM_OCLPackage.MAP_TYPE__VALUE_TYPE, MapType.class, msgs);
			case QMM_OCLPackage.OCL_TYPE__ATTRIBUTE:
				return eInternalContainer().eInverseRemove(this, QMM_OCLPackage.ATTRIBUTE__TYPE, Attribute.class, msgs);
			case QMM_OCLPackage.OCL_TYPE__MAP_TYPE:
				return eInternalContainer().eInverseRemove(this, QMM_OCLPackage.MAP_TYPE__KEY_TYPE, MapType.class, msgs);
			case QMM_OCLPackage.OCL_TYPE__COLLECTION_TYPES:
				return eInternalContainer().eInverseRemove(this, QMM_OCLPackage.COLLECTION_TYPE__ELEMENT_TYPE, CollectionType.class, msgs);
			case QMM_OCLPackage.OCL_TYPE__TUPLE_TYPE_ATTRIBUTE:
				return eInternalContainer().eInverseRemove(this, QMM_OCLPackage.TUPLE_TYPE_ATTRIBUTE__TYPE, TupleTypeAttribute.class, msgs);
			case QMM_OCLPackage.OCL_TYPE__VARIABLE_DECLARATION:
				return eInternalContainer().eInverseRemove(this, QMM_OCLPackage.VARIABLE_DECLARATION__TYPE, VariableDeclaration.class, msgs);
			case QMM_OCLPackage.OCL_TYPE__LAMBDA_RETURN_TYPE:
				return eInternalContainer().eInverseRemove(this, QMM_OCLPackage.LAMBDA_TYPE__RETURN_TYPE, LambdaType.class, msgs);
			case QMM_OCLPackage.OCL_TYPE__LAMBDA_ARG_TYPE:
				return eInternalContainer().eInverseRemove(this, QMM_OCLPackage.LAMBDA_TYPE__ARGUMENT_TYPES, LambdaType.class, msgs);
			case QMM_OCLPackage.OCL_TYPE__STATIC_PROPERTY_CALL:
				return eInternalContainer().eInverseRemove(this, QMM_OCLPackage.STATIC_PROPERTY_CALL_EXP__SOURCE, StaticPropertyCallExp.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QMM_OCLPackage.OCL_TYPE__NAME:
				return getName();
			case QMM_OCLPackage.OCL_TYPE__DEFINITIONS:
				return getDefinitions();
			case QMM_OCLPackage.OCL_TYPE__OCL_EXPRESSION:
				return getOclExpression();
			case QMM_OCLPackage.OCL_TYPE__OPERATION:
				return getOperation();
			case QMM_OCLPackage.OCL_TYPE__MAP_TYPE2:
				return getMapType2();
			case QMM_OCLPackage.OCL_TYPE__ATTRIBUTE:
				return getAttribute();
			case QMM_OCLPackage.OCL_TYPE__MAP_TYPE:
				return getMapType();
			case QMM_OCLPackage.OCL_TYPE__COLLECTION_TYPES:
				return getCollectionTypes();
			case QMM_OCLPackage.OCL_TYPE__TUPLE_TYPE_ATTRIBUTE:
				return getTupleTypeAttribute();
			case QMM_OCLPackage.OCL_TYPE__VARIABLE_DECLARATION:
				return getVariableDeclaration();
			case QMM_OCLPackage.OCL_TYPE__LAMBDA_RETURN_TYPE:
				return getLambdaReturnType();
			case QMM_OCLPackage.OCL_TYPE__LAMBDA_ARG_TYPE:
				return getLambdaArgType();
			case QMM_OCLPackage.OCL_TYPE__STATIC_PROPERTY_CALL:
				return getStaticPropertyCall();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case QMM_OCLPackage.OCL_TYPE__NAME:
				setName((String)newValue);
				return;
			case QMM_OCLPackage.OCL_TYPE__DEFINITIONS:
				setDefinitions((OclContextDefinition)newValue);
				return;
			case QMM_OCLPackage.OCL_TYPE__OCL_EXPRESSION:
				setOclExpression((OclExpression)newValue);
				return;
			case QMM_OCLPackage.OCL_TYPE__OPERATION:
				setOperation((Operation)newValue);
				return;
			case QMM_OCLPackage.OCL_TYPE__MAP_TYPE2:
				setMapType2((MapType)newValue);
				return;
			case QMM_OCLPackage.OCL_TYPE__ATTRIBUTE:
				setAttribute((Attribute)newValue);
				return;
			case QMM_OCLPackage.OCL_TYPE__MAP_TYPE:
				setMapType((MapType)newValue);
				return;
			case QMM_OCLPackage.OCL_TYPE__COLLECTION_TYPES:
				setCollectionTypes((CollectionType)newValue);
				return;
			case QMM_OCLPackage.OCL_TYPE__TUPLE_TYPE_ATTRIBUTE:
				setTupleTypeAttribute((TupleTypeAttribute)newValue);
				return;
			case QMM_OCLPackage.OCL_TYPE__VARIABLE_DECLARATION:
				setVariableDeclaration((VariableDeclaration)newValue);
				return;
			case QMM_OCLPackage.OCL_TYPE__LAMBDA_RETURN_TYPE:
				setLambdaReturnType((LambdaType)newValue);
				return;
			case QMM_OCLPackage.OCL_TYPE__LAMBDA_ARG_TYPE:
				setLambdaArgType((LambdaType)newValue);
				return;
			case QMM_OCLPackage.OCL_TYPE__STATIC_PROPERTY_CALL:
				setStaticPropertyCall((StaticPropertyCallExp)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case QMM_OCLPackage.OCL_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case QMM_OCLPackage.OCL_TYPE__DEFINITIONS:
				setDefinitions((OclContextDefinition)null);
				return;
			case QMM_OCLPackage.OCL_TYPE__OCL_EXPRESSION:
				setOclExpression((OclExpression)null);
				return;
			case QMM_OCLPackage.OCL_TYPE__OPERATION:
				setOperation((Operation)null);
				return;
			case QMM_OCLPackage.OCL_TYPE__MAP_TYPE2:
				setMapType2((MapType)null);
				return;
			case QMM_OCLPackage.OCL_TYPE__ATTRIBUTE:
				setAttribute((Attribute)null);
				return;
			case QMM_OCLPackage.OCL_TYPE__MAP_TYPE:
				setMapType((MapType)null);
				return;
			case QMM_OCLPackage.OCL_TYPE__COLLECTION_TYPES:
				setCollectionTypes((CollectionType)null);
				return;
			case QMM_OCLPackage.OCL_TYPE__TUPLE_TYPE_ATTRIBUTE:
				setTupleTypeAttribute((TupleTypeAttribute)null);
				return;
			case QMM_OCLPackage.OCL_TYPE__VARIABLE_DECLARATION:
				setVariableDeclaration((VariableDeclaration)null);
				return;
			case QMM_OCLPackage.OCL_TYPE__LAMBDA_RETURN_TYPE:
				setLambdaReturnType((LambdaType)null);
				return;
			case QMM_OCLPackage.OCL_TYPE__LAMBDA_ARG_TYPE:
				setLambdaArgType((LambdaType)null);
				return;
			case QMM_OCLPackage.OCL_TYPE__STATIC_PROPERTY_CALL:
				setStaticPropertyCall((StaticPropertyCallExp)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case QMM_OCLPackage.OCL_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case QMM_OCLPackage.OCL_TYPE__DEFINITIONS:
				return getDefinitions() != null;
			case QMM_OCLPackage.OCL_TYPE__OCL_EXPRESSION:
				return getOclExpression() != null;
			case QMM_OCLPackage.OCL_TYPE__OPERATION:
				return getOperation() != null;
			case QMM_OCLPackage.OCL_TYPE__MAP_TYPE2:
				return getMapType2() != null;
			case QMM_OCLPackage.OCL_TYPE__ATTRIBUTE:
				return getAttribute() != null;
			case QMM_OCLPackage.OCL_TYPE__MAP_TYPE:
				return getMapType() != null;
			case QMM_OCLPackage.OCL_TYPE__COLLECTION_TYPES:
				return getCollectionTypes() != null;
			case QMM_OCLPackage.OCL_TYPE__TUPLE_TYPE_ATTRIBUTE:
				return getTupleTypeAttribute() != null;
			case QMM_OCLPackage.OCL_TYPE__VARIABLE_DECLARATION:
				return getVariableDeclaration() != null;
			case QMM_OCLPackage.OCL_TYPE__LAMBDA_RETURN_TYPE:
				return getLambdaReturnType() != null;
			case QMM_OCLPackage.OCL_TYPE__LAMBDA_ARG_TYPE:
				return getLambdaArgType() != null;
			case QMM_OCLPackage.OCL_TYPE__STATIC_PROPERTY_CALL:
				return getStaticPropertyCall() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //OclTypeImpl
