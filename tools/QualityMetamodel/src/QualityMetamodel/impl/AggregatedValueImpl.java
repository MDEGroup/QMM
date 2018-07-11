/**
 */
package QualityMetamodel.impl;

import QualityMetamodel.AggregatedValue;
import QualityMetamodel.Operation;
import QualityMetamodel.QualityMetamodelPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Aggregated Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link QualityMetamodel.impl.AggregatedValueImpl#getCalculatedBy <em>Calculated By</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AggregatedValueImpl extends ValueImpl implements AggregatedValue {
	/**
	 * The cached value of the '{@link #getCalculatedBy() <em>Calculated By</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCalculatedBy()
	 * @generated
	 * @ordered
	 */
	protected Operation calculatedBy;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AggregatedValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QualityMetamodelPackage.Literals.AGGREGATED_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation getCalculatedBy() {
		return calculatedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCalculatedBy(Operation newCalculatedBy, NotificationChain msgs) {
		Operation oldCalculatedBy = calculatedBy;
		calculatedBy = newCalculatedBy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QualityMetamodelPackage.AGGREGATED_VALUE__CALCULATED_BY, oldCalculatedBy, newCalculatedBy);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCalculatedBy(Operation newCalculatedBy) {
		if (newCalculatedBy != calculatedBy) {
			NotificationChain msgs = null;
			if (calculatedBy != null)
				msgs = ((InternalEObject)calculatedBy).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QualityMetamodelPackage.AGGREGATED_VALUE__CALCULATED_BY, null, msgs);
			if (newCalculatedBy != null)
				msgs = ((InternalEObject)newCalculatedBy).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QualityMetamodelPackage.AGGREGATED_VALUE__CALCULATED_BY, null, msgs);
			msgs = basicSetCalculatedBy(newCalculatedBy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QualityMetamodelPackage.AGGREGATED_VALUE__CALCULATED_BY, newCalculatedBy, newCalculatedBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QualityMetamodelPackage.AGGREGATED_VALUE__CALCULATED_BY:
				return basicSetCalculatedBy(null, msgs);
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
			case QualityMetamodelPackage.AGGREGATED_VALUE__CALCULATED_BY:
				return getCalculatedBy();
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
			case QualityMetamodelPackage.AGGREGATED_VALUE__CALCULATED_BY:
				setCalculatedBy((Operation)newValue);
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
			case QualityMetamodelPackage.AGGREGATED_VALUE__CALCULATED_BY:
				setCalculatedBy((Operation)null);
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
			case QualityMetamodelPackage.AGGREGATED_VALUE__CALCULATED_BY:
				return calculatedBy != null;
		}
		return super.eIsSet(featureID);
	}

} //AggregatedValueImpl
