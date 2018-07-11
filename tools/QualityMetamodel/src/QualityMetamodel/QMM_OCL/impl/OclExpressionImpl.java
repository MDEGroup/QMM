/**
 */
package QualityMetamodel.QMM_OCL.impl;

import QualityMetamodel.QMM_OCL.Attribute;
import QualityMetamodel.QMM_OCL.IfExp;
import QualityMetamodel.QMM_OCL.LetExp;
import QualityMetamodel.QMM_OCL.LocalVariable;
import QualityMetamodel.QMM_OCL.LoopExp;
import QualityMetamodel.QMM_OCL.OclExpression;
import QualityMetamodel.QMM_OCL.OclType;
import QualityMetamodel.QMM_OCL.Operation;
import QualityMetamodel.QMM_OCL.OperationCall;
import QualityMetamodel.QMM_OCL.OperatorCallExp;
import QualityMetamodel.QMM_OCL.PropertyCallExp;
import QualityMetamodel.QMM_OCL.QMM_OCLPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ocl Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link QualityMetamodel.QMM_OCL.impl.OclExpressionImpl#getType <em>Type</em>}</li>
 *   <li>{@link QualityMetamodel.QMM_OCL.impl.OclExpressionImpl#getIfExp3 <em>If Exp3</em>}</li>
 *   <li>{@link QualityMetamodel.QMM_OCL.impl.OclExpressionImpl#getAppliedProperty <em>Applied Property</em>}</li>
 *   <li>{@link QualityMetamodel.QMM_OCL.impl.OclExpressionImpl#getLetExp <em>Let Exp</em>}</li>
 *   <li>{@link QualityMetamodel.QMM_OCL.impl.OclExpressionImpl#getLoopExp <em>Loop Exp</em>}</li>
 *   <li>{@link QualityMetamodel.QMM_OCL.impl.OclExpressionImpl#getParentOperation <em>Parent Operation</em>}</li>
 *   <li>{@link QualityMetamodel.QMM_OCL.impl.OclExpressionImpl#getInitializedVariable <em>Initialized Variable</em>}</li>
 *   <li>{@link QualityMetamodel.QMM_OCL.impl.OclExpressionImpl#getIfExp2 <em>If Exp2</em>}</li>
 *   <li>{@link QualityMetamodel.QMM_OCL.impl.OclExpressionImpl#getOwningOperation <em>Owning Operation</em>}</li>
 *   <li>{@link QualityMetamodel.QMM_OCL.impl.OclExpressionImpl#getIfExp1 <em>If Exp1</em>}</li>
 *   <li>{@link QualityMetamodel.QMM_OCL.impl.OclExpressionImpl#getOwningAttribute <em>Owning Attribute</em>}</li>
 *   <li>{@link QualityMetamodel.QMM_OCL.impl.OclExpressionImpl#getAppliedOperator <em>Applied Operator</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class OclExpressionImpl extends LocatedElementImpl implements OclExpression {
	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected OclType type;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OclExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QMM_OCLPackage.Literals.OCL_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OclType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(OclType newType, NotificationChain msgs) {
		OclType oldType = type;
		type = newType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QMM_OCLPackage.OCL_EXPRESSION__TYPE, oldType, newType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(OclType newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject)type).eInverseRemove(this, QMM_OCLPackage.OCL_TYPE__OCL_EXPRESSION, OclType.class, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, QMM_OCLPackage.OCL_TYPE__OCL_EXPRESSION, OclType.class, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QMM_OCLPackage.OCL_EXPRESSION__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfExp getIfExp3() {
		if (eContainerFeatureID() != QMM_OCLPackage.OCL_EXPRESSION__IF_EXP3) return null;
		return (IfExp)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfExp3(IfExp newIfExp3, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newIfExp3, QMM_OCLPackage.OCL_EXPRESSION__IF_EXP3, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfExp3(IfExp newIfExp3) {
		if (newIfExp3 != eInternalContainer() || (eContainerFeatureID() != QMM_OCLPackage.OCL_EXPRESSION__IF_EXP3 && newIfExp3 != null)) {
			if (EcoreUtil.isAncestor(this, newIfExp3))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newIfExp3 != null)
				msgs = ((InternalEObject)newIfExp3).eInverseAdd(this, QMM_OCLPackage.IF_EXP__ELSE_EXPRESSION, IfExp.class, msgs);
			msgs = basicSetIfExp3(newIfExp3, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QMM_OCLPackage.OCL_EXPRESSION__IF_EXP3, newIfExp3, newIfExp3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyCallExp getAppliedProperty() {
		if (eContainerFeatureID() != QMM_OCLPackage.OCL_EXPRESSION__APPLIED_PROPERTY) return null;
		return (PropertyCallExp)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAppliedProperty(PropertyCallExp newAppliedProperty, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newAppliedProperty, QMM_OCLPackage.OCL_EXPRESSION__APPLIED_PROPERTY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAppliedProperty(PropertyCallExp newAppliedProperty) {
		if (newAppliedProperty != eInternalContainer() || (eContainerFeatureID() != QMM_OCLPackage.OCL_EXPRESSION__APPLIED_PROPERTY && newAppliedProperty != null)) {
			if (EcoreUtil.isAncestor(this, newAppliedProperty))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newAppliedProperty != null)
				msgs = ((InternalEObject)newAppliedProperty).eInverseAdd(this, QMM_OCLPackage.PROPERTY_CALL_EXP__SOURCE, PropertyCallExp.class, msgs);
			msgs = basicSetAppliedProperty(newAppliedProperty, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QMM_OCLPackage.OCL_EXPRESSION__APPLIED_PROPERTY, newAppliedProperty, newAppliedProperty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LetExp getLetExp() {
		if (eContainerFeatureID() != QMM_OCLPackage.OCL_EXPRESSION__LET_EXP) return null;
		return (LetExp)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLetExp(LetExp newLetExp, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newLetExp, QMM_OCLPackage.OCL_EXPRESSION__LET_EXP, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLetExp(LetExp newLetExp) {
		if (newLetExp != eInternalContainer() || (eContainerFeatureID() != QMM_OCLPackage.OCL_EXPRESSION__LET_EXP && newLetExp != null)) {
			if (EcoreUtil.isAncestor(this, newLetExp))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newLetExp != null)
				msgs = ((InternalEObject)newLetExp).eInverseAdd(this, QMM_OCLPackage.LET_EXP__IN_, LetExp.class, msgs);
			msgs = basicSetLetExp(newLetExp, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QMM_OCLPackage.OCL_EXPRESSION__LET_EXP, newLetExp, newLetExp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoopExp getLoopExp() {
		if (eContainerFeatureID() != QMM_OCLPackage.OCL_EXPRESSION__LOOP_EXP) return null;
		return (LoopExp)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLoopExp(LoopExp newLoopExp, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newLoopExp, QMM_OCLPackage.OCL_EXPRESSION__LOOP_EXP, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLoopExp(LoopExp newLoopExp) {
		if (newLoopExp != eInternalContainer() || (eContainerFeatureID() != QMM_OCLPackage.OCL_EXPRESSION__LOOP_EXP && newLoopExp != null)) {
			if (EcoreUtil.isAncestor(this, newLoopExp))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newLoopExp != null)
				msgs = ((InternalEObject)newLoopExp).eInverseAdd(this, QMM_OCLPackage.LOOP_EXP__BODY, LoopExp.class, msgs);
			msgs = basicSetLoopExp(newLoopExp, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QMM_OCLPackage.OCL_EXPRESSION__LOOP_EXP, newLoopExp, newLoopExp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationCall getParentOperation() {
		if (eContainerFeatureID() != QMM_OCLPackage.OCL_EXPRESSION__PARENT_OPERATION) return null;
		return (OperationCall)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentOperation(OperationCall newParentOperation, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParentOperation, QMM_OCLPackage.OCL_EXPRESSION__PARENT_OPERATION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentOperation(OperationCall newParentOperation) {
		if (newParentOperation != eInternalContainer() || (eContainerFeatureID() != QMM_OCLPackage.OCL_EXPRESSION__PARENT_OPERATION && newParentOperation != null)) {
			if (EcoreUtil.isAncestor(this, newParentOperation))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParentOperation != null)
				msgs = ((InternalEObject)newParentOperation).eInverseAdd(this, QMM_OCLPackage.OPERATION_CALL__ARGUMENTS, OperationCall.class, msgs);
			msgs = basicSetParentOperation(newParentOperation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QMM_OCLPackage.OCL_EXPRESSION__PARENT_OPERATION, newParentOperation, newParentOperation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocalVariable getInitializedVariable() {
		if (eContainerFeatureID() != QMM_OCLPackage.OCL_EXPRESSION__INITIALIZED_VARIABLE) return null;
		return (LocalVariable)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInitializedVariable(LocalVariable newInitializedVariable, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newInitializedVariable, QMM_OCLPackage.OCL_EXPRESSION__INITIALIZED_VARIABLE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitializedVariable(LocalVariable newInitializedVariable) {
		if (newInitializedVariable != eInternalContainer() || (eContainerFeatureID() != QMM_OCLPackage.OCL_EXPRESSION__INITIALIZED_VARIABLE && newInitializedVariable != null)) {
			if (EcoreUtil.isAncestor(this, newInitializedVariable))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newInitializedVariable != null)
				msgs = ((InternalEObject)newInitializedVariable).eInverseAdd(this, QMM_OCLPackage.LOCAL_VARIABLE__INIT_EXPRESSION, LocalVariable.class, msgs);
			msgs = basicSetInitializedVariable(newInitializedVariable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QMM_OCLPackage.OCL_EXPRESSION__INITIALIZED_VARIABLE, newInitializedVariable, newInitializedVariable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfExp getIfExp2() {
		if (eContainerFeatureID() != QMM_OCLPackage.OCL_EXPRESSION__IF_EXP2) return null;
		return (IfExp)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfExp2(IfExp newIfExp2, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newIfExp2, QMM_OCLPackage.OCL_EXPRESSION__IF_EXP2, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfExp2(IfExp newIfExp2) {
		if (newIfExp2 != eInternalContainer() || (eContainerFeatureID() != QMM_OCLPackage.OCL_EXPRESSION__IF_EXP2 && newIfExp2 != null)) {
			if (EcoreUtil.isAncestor(this, newIfExp2))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newIfExp2 != null)
				msgs = ((InternalEObject)newIfExp2).eInverseAdd(this, QMM_OCLPackage.IF_EXP__THEN_EXPRESSION, IfExp.class, msgs);
			msgs = basicSetIfExp2(newIfExp2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QMM_OCLPackage.OCL_EXPRESSION__IF_EXP2, newIfExp2, newIfExp2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation getOwningOperation() {
		if (eContainerFeatureID() != QMM_OCLPackage.OCL_EXPRESSION__OWNING_OPERATION) return null;
		return (Operation)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwningOperation(Operation newOwningOperation, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwningOperation, QMM_OCLPackage.OCL_EXPRESSION__OWNING_OPERATION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwningOperation(Operation newOwningOperation) {
		if (newOwningOperation != eInternalContainer() || (eContainerFeatureID() != QMM_OCLPackage.OCL_EXPRESSION__OWNING_OPERATION && newOwningOperation != null)) {
			if (EcoreUtil.isAncestor(this, newOwningOperation))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwningOperation != null)
				msgs = ((InternalEObject)newOwningOperation).eInverseAdd(this, QMM_OCLPackage.OPERATION__BODY, Operation.class, msgs);
			msgs = basicSetOwningOperation(newOwningOperation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QMM_OCLPackage.OCL_EXPRESSION__OWNING_OPERATION, newOwningOperation, newOwningOperation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfExp getIfExp1() {
		if (eContainerFeatureID() != QMM_OCLPackage.OCL_EXPRESSION__IF_EXP1) return null;
		return (IfExp)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfExp1(IfExp newIfExp1, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newIfExp1, QMM_OCLPackage.OCL_EXPRESSION__IF_EXP1, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfExp1(IfExp newIfExp1) {
		if (newIfExp1 != eInternalContainer() || (eContainerFeatureID() != QMM_OCLPackage.OCL_EXPRESSION__IF_EXP1 && newIfExp1 != null)) {
			if (EcoreUtil.isAncestor(this, newIfExp1))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newIfExp1 != null)
				msgs = ((InternalEObject)newIfExp1).eInverseAdd(this, QMM_OCLPackage.IF_EXP__CONDITION, IfExp.class, msgs);
			msgs = basicSetIfExp1(newIfExp1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QMM_OCLPackage.OCL_EXPRESSION__IF_EXP1, newIfExp1, newIfExp1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute getOwningAttribute() {
		if (eContainerFeatureID() != QMM_OCLPackage.OCL_EXPRESSION__OWNING_ATTRIBUTE) return null;
		return (Attribute)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwningAttribute(Attribute newOwningAttribute, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwningAttribute, QMM_OCLPackage.OCL_EXPRESSION__OWNING_ATTRIBUTE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwningAttribute(Attribute newOwningAttribute) {
		if (newOwningAttribute != eInternalContainer() || (eContainerFeatureID() != QMM_OCLPackage.OCL_EXPRESSION__OWNING_ATTRIBUTE && newOwningAttribute != null)) {
			if (EcoreUtil.isAncestor(this, newOwningAttribute))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwningAttribute != null)
				msgs = ((InternalEObject)newOwningAttribute).eInverseAdd(this, QMM_OCLPackage.ATTRIBUTE__INIT_EXPRESSION, Attribute.class, msgs);
			msgs = basicSetOwningAttribute(newOwningAttribute, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QMM_OCLPackage.OCL_EXPRESSION__OWNING_ATTRIBUTE, newOwningAttribute, newOwningAttribute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperatorCallExp getAppliedOperator() {
		if (eContainerFeatureID() != QMM_OCLPackage.OCL_EXPRESSION__APPLIED_OPERATOR) return null;
		return (OperatorCallExp)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAppliedOperator(OperatorCallExp newAppliedOperator, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newAppliedOperator, QMM_OCLPackage.OCL_EXPRESSION__APPLIED_OPERATOR, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAppliedOperator(OperatorCallExp newAppliedOperator) {
		if (newAppliedOperator != eInternalContainer() || (eContainerFeatureID() != QMM_OCLPackage.OCL_EXPRESSION__APPLIED_OPERATOR && newAppliedOperator != null)) {
			if (EcoreUtil.isAncestor(this, newAppliedOperator))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newAppliedOperator != null)
				msgs = ((InternalEObject)newAppliedOperator).eInverseAdd(this, QMM_OCLPackage.OPERATOR_CALL_EXP__SOURCE, OperatorCallExp.class, msgs);
			msgs = basicSetAppliedOperator(newAppliedOperator, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QMM_OCLPackage.OCL_EXPRESSION__APPLIED_OPERATOR, newAppliedOperator, newAppliedOperator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QMM_OCLPackage.OCL_EXPRESSION__TYPE:
				if (type != null)
					msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QMM_OCLPackage.OCL_EXPRESSION__TYPE, null, msgs);
				return basicSetType((OclType)otherEnd, msgs);
			case QMM_OCLPackage.OCL_EXPRESSION__IF_EXP3:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetIfExp3((IfExp)otherEnd, msgs);
			case QMM_OCLPackage.OCL_EXPRESSION__APPLIED_PROPERTY:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetAppliedProperty((PropertyCallExp)otherEnd, msgs);
			case QMM_OCLPackage.OCL_EXPRESSION__LET_EXP:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetLetExp((LetExp)otherEnd, msgs);
			case QMM_OCLPackage.OCL_EXPRESSION__LOOP_EXP:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetLoopExp((LoopExp)otherEnd, msgs);
			case QMM_OCLPackage.OCL_EXPRESSION__PARENT_OPERATION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParentOperation((OperationCall)otherEnd, msgs);
			case QMM_OCLPackage.OCL_EXPRESSION__INITIALIZED_VARIABLE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetInitializedVariable((LocalVariable)otherEnd, msgs);
			case QMM_OCLPackage.OCL_EXPRESSION__IF_EXP2:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetIfExp2((IfExp)otherEnd, msgs);
			case QMM_OCLPackage.OCL_EXPRESSION__OWNING_OPERATION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwningOperation((Operation)otherEnd, msgs);
			case QMM_OCLPackage.OCL_EXPRESSION__IF_EXP1:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetIfExp1((IfExp)otherEnd, msgs);
			case QMM_OCLPackage.OCL_EXPRESSION__OWNING_ATTRIBUTE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwningAttribute((Attribute)otherEnd, msgs);
			case QMM_OCLPackage.OCL_EXPRESSION__APPLIED_OPERATOR:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetAppliedOperator((OperatorCallExp)otherEnd, msgs);
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
			case QMM_OCLPackage.OCL_EXPRESSION__TYPE:
				return basicSetType(null, msgs);
			case QMM_OCLPackage.OCL_EXPRESSION__IF_EXP3:
				return basicSetIfExp3(null, msgs);
			case QMM_OCLPackage.OCL_EXPRESSION__APPLIED_PROPERTY:
				return basicSetAppliedProperty(null, msgs);
			case QMM_OCLPackage.OCL_EXPRESSION__LET_EXP:
				return basicSetLetExp(null, msgs);
			case QMM_OCLPackage.OCL_EXPRESSION__LOOP_EXP:
				return basicSetLoopExp(null, msgs);
			case QMM_OCLPackage.OCL_EXPRESSION__PARENT_OPERATION:
				return basicSetParentOperation(null, msgs);
			case QMM_OCLPackage.OCL_EXPRESSION__INITIALIZED_VARIABLE:
				return basicSetInitializedVariable(null, msgs);
			case QMM_OCLPackage.OCL_EXPRESSION__IF_EXP2:
				return basicSetIfExp2(null, msgs);
			case QMM_OCLPackage.OCL_EXPRESSION__OWNING_OPERATION:
				return basicSetOwningOperation(null, msgs);
			case QMM_OCLPackage.OCL_EXPRESSION__IF_EXP1:
				return basicSetIfExp1(null, msgs);
			case QMM_OCLPackage.OCL_EXPRESSION__OWNING_ATTRIBUTE:
				return basicSetOwningAttribute(null, msgs);
			case QMM_OCLPackage.OCL_EXPRESSION__APPLIED_OPERATOR:
				return basicSetAppliedOperator(null, msgs);
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
			case QMM_OCLPackage.OCL_EXPRESSION__IF_EXP3:
				return eInternalContainer().eInverseRemove(this, QMM_OCLPackage.IF_EXP__ELSE_EXPRESSION, IfExp.class, msgs);
			case QMM_OCLPackage.OCL_EXPRESSION__APPLIED_PROPERTY:
				return eInternalContainer().eInverseRemove(this, QMM_OCLPackage.PROPERTY_CALL_EXP__SOURCE, PropertyCallExp.class, msgs);
			case QMM_OCLPackage.OCL_EXPRESSION__LET_EXP:
				return eInternalContainer().eInverseRemove(this, QMM_OCLPackage.LET_EXP__IN_, LetExp.class, msgs);
			case QMM_OCLPackage.OCL_EXPRESSION__LOOP_EXP:
				return eInternalContainer().eInverseRemove(this, QMM_OCLPackage.LOOP_EXP__BODY, LoopExp.class, msgs);
			case QMM_OCLPackage.OCL_EXPRESSION__PARENT_OPERATION:
				return eInternalContainer().eInverseRemove(this, QMM_OCLPackage.OPERATION_CALL__ARGUMENTS, OperationCall.class, msgs);
			case QMM_OCLPackage.OCL_EXPRESSION__INITIALIZED_VARIABLE:
				return eInternalContainer().eInverseRemove(this, QMM_OCLPackage.LOCAL_VARIABLE__INIT_EXPRESSION, LocalVariable.class, msgs);
			case QMM_OCLPackage.OCL_EXPRESSION__IF_EXP2:
				return eInternalContainer().eInverseRemove(this, QMM_OCLPackage.IF_EXP__THEN_EXPRESSION, IfExp.class, msgs);
			case QMM_OCLPackage.OCL_EXPRESSION__OWNING_OPERATION:
				return eInternalContainer().eInverseRemove(this, QMM_OCLPackage.OPERATION__BODY, Operation.class, msgs);
			case QMM_OCLPackage.OCL_EXPRESSION__IF_EXP1:
				return eInternalContainer().eInverseRemove(this, QMM_OCLPackage.IF_EXP__CONDITION, IfExp.class, msgs);
			case QMM_OCLPackage.OCL_EXPRESSION__OWNING_ATTRIBUTE:
				return eInternalContainer().eInverseRemove(this, QMM_OCLPackage.ATTRIBUTE__INIT_EXPRESSION, Attribute.class, msgs);
			case QMM_OCLPackage.OCL_EXPRESSION__APPLIED_OPERATOR:
				return eInternalContainer().eInverseRemove(this, QMM_OCLPackage.OPERATOR_CALL_EXP__SOURCE, OperatorCallExp.class, msgs);
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
			case QMM_OCLPackage.OCL_EXPRESSION__TYPE:
				return getType();
			case QMM_OCLPackage.OCL_EXPRESSION__IF_EXP3:
				return getIfExp3();
			case QMM_OCLPackage.OCL_EXPRESSION__APPLIED_PROPERTY:
				return getAppliedProperty();
			case QMM_OCLPackage.OCL_EXPRESSION__LET_EXP:
				return getLetExp();
			case QMM_OCLPackage.OCL_EXPRESSION__LOOP_EXP:
				return getLoopExp();
			case QMM_OCLPackage.OCL_EXPRESSION__PARENT_OPERATION:
				return getParentOperation();
			case QMM_OCLPackage.OCL_EXPRESSION__INITIALIZED_VARIABLE:
				return getInitializedVariable();
			case QMM_OCLPackage.OCL_EXPRESSION__IF_EXP2:
				return getIfExp2();
			case QMM_OCLPackage.OCL_EXPRESSION__OWNING_OPERATION:
				return getOwningOperation();
			case QMM_OCLPackage.OCL_EXPRESSION__IF_EXP1:
				return getIfExp1();
			case QMM_OCLPackage.OCL_EXPRESSION__OWNING_ATTRIBUTE:
				return getOwningAttribute();
			case QMM_OCLPackage.OCL_EXPRESSION__APPLIED_OPERATOR:
				return getAppliedOperator();
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
			case QMM_OCLPackage.OCL_EXPRESSION__TYPE:
				setType((OclType)newValue);
				return;
			case QMM_OCLPackage.OCL_EXPRESSION__IF_EXP3:
				setIfExp3((IfExp)newValue);
				return;
			case QMM_OCLPackage.OCL_EXPRESSION__APPLIED_PROPERTY:
				setAppliedProperty((PropertyCallExp)newValue);
				return;
			case QMM_OCLPackage.OCL_EXPRESSION__LET_EXP:
				setLetExp((LetExp)newValue);
				return;
			case QMM_OCLPackage.OCL_EXPRESSION__LOOP_EXP:
				setLoopExp((LoopExp)newValue);
				return;
			case QMM_OCLPackage.OCL_EXPRESSION__PARENT_OPERATION:
				setParentOperation((OperationCall)newValue);
				return;
			case QMM_OCLPackage.OCL_EXPRESSION__INITIALIZED_VARIABLE:
				setInitializedVariable((LocalVariable)newValue);
				return;
			case QMM_OCLPackage.OCL_EXPRESSION__IF_EXP2:
				setIfExp2((IfExp)newValue);
				return;
			case QMM_OCLPackage.OCL_EXPRESSION__OWNING_OPERATION:
				setOwningOperation((Operation)newValue);
				return;
			case QMM_OCLPackage.OCL_EXPRESSION__IF_EXP1:
				setIfExp1((IfExp)newValue);
				return;
			case QMM_OCLPackage.OCL_EXPRESSION__OWNING_ATTRIBUTE:
				setOwningAttribute((Attribute)newValue);
				return;
			case QMM_OCLPackage.OCL_EXPRESSION__APPLIED_OPERATOR:
				setAppliedOperator((OperatorCallExp)newValue);
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
			case QMM_OCLPackage.OCL_EXPRESSION__TYPE:
				setType((OclType)null);
				return;
			case QMM_OCLPackage.OCL_EXPRESSION__IF_EXP3:
				setIfExp3((IfExp)null);
				return;
			case QMM_OCLPackage.OCL_EXPRESSION__APPLIED_PROPERTY:
				setAppliedProperty((PropertyCallExp)null);
				return;
			case QMM_OCLPackage.OCL_EXPRESSION__LET_EXP:
				setLetExp((LetExp)null);
				return;
			case QMM_OCLPackage.OCL_EXPRESSION__LOOP_EXP:
				setLoopExp((LoopExp)null);
				return;
			case QMM_OCLPackage.OCL_EXPRESSION__PARENT_OPERATION:
				setParentOperation((OperationCall)null);
				return;
			case QMM_OCLPackage.OCL_EXPRESSION__INITIALIZED_VARIABLE:
				setInitializedVariable((LocalVariable)null);
				return;
			case QMM_OCLPackage.OCL_EXPRESSION__IF_EXP2:
				setIfExp2((IfExp)null);
				return;
			case QMM_OCLPackage.OCL_EXPRESSION__OWNING_OPERATION:
				setOwningOperation((Operation)null);
				return;
			case QMM_OCLPackage.OCL_EXPRESSION__IF_EXP1:
				setIfExp1((IfExp)null);
				return;
			case QMM_OCLPackage.OCL_EXPRESSION__OWNING_ATTRIBUTE:
				setOwningAttribute((Attribute)null);
				return;
			case QMM_OCLPackage.OCL_EXPRESSION__APPLIED_OPERATOR:
				setAppliedOperator((OperatorCallExp)null);
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
			case QMM_OCLPackage.OCL_EXPRESSION__TYPE:
				return type != null;
			case QMM_OCLPackage.OCL_EXPRESSION__IF_EXP3:
				return getIfExp3() != null;
			case QMM_OCLPackage.OCL_EXPRESSION__APPLIED_PROPERTY:
				return getAppliedProperty() != null;
			case QMM_OCLPackage.OCL_EXPRESSION__LET_EXP:
				return getLetExp() != null;
			case QMM_OCLPackage.OCL_EXPRESSION__LOOP_EXP:
				return getLoopExp() != null;
			case QMM_OCLPackage.OCL_EXPRESSION__PARENT_OPERATION:
				return getParentOperation() != null;
			case QMM_OCLPackage.OCL_EXPRESSION__INITIALIZED_VARIABLE:
				return getInitializedVariable() != null;
			case QMM_OCLPackage.OCL_EXPRESSION__IF_EXP2:
				return getIfExp2() != null;
			case QMM_OCLPackage.OCL_EXPRESSION__OWNING_OPERATION:
				return getOwningOperation() != null;
			case QMM_OCLPackage.OCL_EXPRESSION__IF_EXP1:
				return getIfExp1() != null;
			case QMM_OCLPackage.OCL_EXPRESSION__OWNING_ATTRIBUTE:
				return getOwningAttribute() != null;
			case QMM_OCLPackage.OCL_EXPRESSION__APPLIED_OPERATOR:
				return getAppliedOperator() != null;
		}
		return super.eIsSet(featureID);
	}

} //OclExpressionImpl
