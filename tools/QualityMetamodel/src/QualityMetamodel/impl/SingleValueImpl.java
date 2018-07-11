/**
 */
package QualityMetamodel.impl;

import QualityMetamodel.MetricProvider;
import QualityMetamodel.QualityMetamodelPackage;
import QualityMetamodel.SingleValue;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Single Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link QualityMetamodel.impl.SingleValueImpl#getMeasuredBy <em>Measured By</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SingleValueImpl extends ValueImpl implements SingleValue {
	/**
	 * The cached value of the '{@link #getMeasuredBy() <em>Measured By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasuredBy()
	 * @generated
	 * @ordered
	 */
	protected MetricProvider measuredBy;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SingleValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QualityMetamodelPackage.Literals.SINGLE_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetricProvider getMeasuredBy() {
		if (measuredBy != null && measuredBy.eIsProxy()) {
			InternalEObject oldMeasuredBy = (InternalEObject)measuredBy;
			measuredBy = (MetricProvider)eResolveProxy(oldMeasuredBy);
			if (measuredBy != oldMeasuredBy) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, QualityMetamodelPackage.SINGLE_VALUE__MEASURED_BY, oldMeasuredBy, measuredBy));
			}
		}
		return measuredBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetricProvider basicGetMeasuredBy() {
		return measuredBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMeasuredBy(MetricProvider newMeasuredBy) {
		MetricProvider oldMeasuredBy = measuredBy;
		measuredBy = newMeasuredBy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QualityMetamodelPackage.SINGLE_VALUE__MEASURED_BY, oldMeasuredBy, measuredBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QualityMetamodelPackage.SINGLE_VALUE__MEASURED_BY:
				if (resolve) return getMeasuredBy();
				return basicGetMeasuredBy();
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
			case QualityMetamodelPackage.SINGLE_VALUE__MEASURED_BY:
				setMeasuredBy((MetricProvider)newValue);
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
			case QualityMetamodelPackage.SINGLE_VALUE__MEASURED_BY:
				setMeasuredBy((MetricProvider)null);
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
			case QualityMetamodelPackage.SINGLE_VALUE__MEASURED_BY:
				return measuredBy != null;
		}
		return super.eIsSet(featureID);
	}

} //SingleValueImpl
