/**
 */
package QualityMetamodel.QMM_OCL.impl;

import QualityMetamodel.QMM_OCL.OclType;
import QualityMetamodel.QMM_OCL.QMM_OCLPackage;
import QualityMetamodel.QMM_OCL.StaticPropertyCall;
import QualityMetamodel.QMM_OCL.StaticPropertyCallExp;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Static Property Call Exp</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link QualityMetamodel.QMM_OCL.impl.StaticPropertyCallExpImpl#getSource <em>Source</em>}</li>
 *   <li>{@link QualityMetamodel.QMM_OCL.impl.StaticPropertyCallExpImpl#getStaticCall <em>Static Call</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StaticPropertyCallExpImpl extends OclExpressionImpl implements StaticPropertyCallExp {
	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected OclType source;

	/**
	 * The cached value of the '{@link #getStaticCall() <em>Static Call</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStaticCall()
	 * @generated
	 * @ordered
	 */
	protected StaticPropertyCall staticCall;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StaticPropertyCallExpImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QMM_OCLPackage.Literals.STATIC_PROPERTY_CALL_EXP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OclType getSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSource(OclType newSource, NotificationChain msgs) {
		OclType oldSource = source;
		source = newSource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QMM_OCLPackage.STATIC_PROPERTY_CALL_EXP__SOURCE, oldSource, newSource);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(OclType newSource) {
		if (newSource != source) {
			NotificationChain msgs = null;
			if (source != null)
				msgs = ((InternalEObject)source).eInverseRemove(this, QMM_OCLPackage.OCL_TYPE__STATIC_PROPERTY_CALL, OclType.class, msgs);
			if (newSource != null)
				msgs = ((InternalEObject)newSource).eInverseAdd(this, QMM_OCLPackage.OCL_TYPE__STATIC_PROPERTY_CALL, OclType.class, msgs);
			msgs = basicSetSource(newSource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QMM_OCLPackage.STATIC_PROPERTY_CALL_EXP__SOURCE, newSource, newSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StaticPropertyCall getStaticCall() {
		return staticCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStaticCall(StaticPropertyCall newStaticCall, NotificationChain msgs) {
		StaticPropertyCall oldStaticCall = staticCall;
		staticCall = newStaticCall;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QMM_OCLPackage.STATIC_PROPERTY_CALL_EXP__STATIC_CALL, oldStaticCall, newStaticCall);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStaticCall(StaticPropertyCall newStaticCall) {
		if (newStaticCall != staticCall) {
			NotificationChain msgs = null;
			if (staticCall != null)
				msgs = ((InternalEObject)staticCall).eInverseRemove(this, QMM_OCLPackage.STATIC_PROPERTY_CALL__STATIC_CALL_EXP, StaticPropertyCall.class, msgs);
			if (newStaticCall != null)
				msgs = ((InternalEObject)newStaticCall).eInverseAdd(this, QMM_OCLPackage.STATIC_PROPERTY_CALL__STATIC_CALL_EXP, StaticPropertyCall.class, msgs);
			msgs = basicSetStaticCall(newStaticCall, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QMM_OCLPackage.STATIC_PROPERTY_CALL_EXP__STATIC_CALL, newStaticCall, newStaticCall));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QMM_OCLPackage.STATIC_PROPERTY_CALL_EXP__SOURCE:
				if (source != null)
					msgs = ((InternalEObject)source).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QMM_OCLPackage.STATIC_PROPERTY_CALL_EXP__SOURCE, null, msgs);
				return basicSetSource((OclType)otherEnd, msgs);
			case QMM_OCLPackage.STATIC_PROPERTY_CALL_EXP__STATIC_CALL:
				if (staticCall != null)
					msgs = ((InternalEObject)staticCall).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QMM_OCLPackage.STATIC_PROPERTY_CALL_EXP__STATIC_CALL, null, msgs);
				return basicSetStaticCall((StaticPropertyCall)otherEnd, msgs);
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
			case QMM_OCLPackage.STATIC_PROPERTY_CALL_EXP__SOURCE:
				return basicSetSource(null, msgs);
			case QMM_OCLPackage.STATIC_PROPERTY_CALL_EXP__STATIC_CALL:
				return basicSetStaticCall(null, msgs);
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
			case QMM_OCLPackage.STATIC_PROPERTY_CALL_EXP__SOURCE:
				return getSource();
			case QMM_OCLPackage.STATIC_PROPERTY_CALL_EXP__STATIC_CALL:
				return getStaticCall();
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
			case QMM_OCLPackage.STATIC_PROPERTY_CALL_EXP__SOURCE:
				setSource((OclType)newValue);
				return;
			case QMM_OCLPackage.STATIC_PROPERTY_CALL_EXP__STATIC_CALL:
				setStaticCall((StaticPropertyCall)newValue);
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
			case QMM_OCLPackage.STATIC_PROPERTY_CALL_EXP__SOURCE:
				setSource((OclType)null);
				return;
			case QMM_OCLPackage.STATIC_PROPERTY_CALL_EXP__STATIC_CALL:
				setStaticCall((StaticPropertyCall)null);
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
			case QMM_OCLPackage.STATIC_PROPERTY_CALL_EXP__SOURCE:
				return source != null;
			case QMM_OCLPackage.STATIC_PROPERTY_CALL_EXP__STATIC_CALL:
				return staticCall != null;
		}
		return super.eIsSet(featureID);
	}

} //StaticPropertyCallExpImpl
