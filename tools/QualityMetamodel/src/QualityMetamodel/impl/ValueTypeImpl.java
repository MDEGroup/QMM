/**
 */
package QualityMetamodel.impl;

import QualityMetamodel.QMM_OCL.impl.VariableDeclarationImpl;

import QualityMetamodel.QualityMetamodelPackage;
import QualityMetamodel.Value;
import QualityMetamodel.ValueType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Value Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link QualityMetamodel.impl.ValueTypeImpl#getVal <em>Val</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ValueTypeImpl extends VariableDeclarationImpl implements ValueType {
	/**
	 * The cached value of the '{@link #getVal() <em>Val</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVal()
	 * @generated
	 * @ordered
	 */
	protected Value val;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ValueTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QualityMetamodelPackage.Literals.VALUE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Value getVal() {
		if (val != null && val.eIsProxy()) {
			InternalEObject oldVal = (InternalEObject)val;
			val = (Value)eResolveProxy(oldVal);
			if (val != oldVal) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, QualityMetamodelPackage.VALUE_TYPE__VAL, oldVal, val));
			}
		}
		return val;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Value basicGetVal() {
		return val;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVal(Value newVal, NotificationChain msgs) {
		Value oldVal = val;
		val = newVal;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QualityMetamodelPackage.VALUE_TYPE__VAL, oldVal, newVal);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVal(Value newVal) {
		if (newVal != val) {
			NotificationChain msgs = null;
			if (val != null)
				msgs = ((InternalEObject)val).eInverseRemove(this, QualityMetamodelPackage.VALUE__VALUE_TYPE, Value.class, msgs);
			if (newVal != null)
				msgs = ((InternalEObject)newVal).eInverseAdd(this, QualityMetamodelPackage.VALUE__VALUE_TYPE, Value.class, msgs);
			msgs = basicSetVal(newVal, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QualityMetamodelPackage.VALUE_TYPE__VAL, newVal, newVal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QualityMetamodelPackage.VALUE_TYPE__VAL:
				if (val != null)
					msgs = ((InternalEObject)val).eInverseRemove(this, QualityMetamodelPackage.VALUE__VALUE_TYPE, Value.class, msgs);
				return basicSetVal((Value)otherEnd, msgs);
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
			case QualityMetamodelPackage.VALUE_TYPE__VAL:
				return basicSetVal(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QualityMetamodelPackage.VALUE_TYPE__VAL:
				if (resolve) return getVal();
				return basicGetVal();
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
			case QualityMetamodelPackage.VALUE_TYPE__VAL:
				setVal((Value)newValue);
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
			case QualityMetamodelPackage.VALUE_TYPE__VAL:
				setVal((Value)null);
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
			case QualityMetamodelPackage.VALUE_TYPE__VAL:
				return val != null;
		}
		return super.eIsSet(featureID);
	}

} //ValueTypeImpl
