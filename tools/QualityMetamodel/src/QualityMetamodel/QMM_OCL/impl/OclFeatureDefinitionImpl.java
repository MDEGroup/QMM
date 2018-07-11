/**
 */
package QualityMetamodel.QMM_OCL.impl;

import QualityMetamodel.QMM_OCL.OclContextDefinition;
import QualityMetamodel.QMM_OCL.OclFeature;
import QualityMetamodel.QMM_OCL.OclFeatureDefinition;
import QualityMetamodel.QMM_OCL.QMM_OCLPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ocl Feature Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link QualityMetamodel.QMM_OCL.impl.OclFeatureDefinitionImpl#getFeature <em>Feature</em>}</li>
 *   <li>{@link QualityMetamodel.QMM_OCL.impl.OclFeatureDefinitionImpl#getContext_ <em>Context </em>}</li>
 *   <li>{@link QualityMetamodel.QMM_OCL.impl.OclFeatureDefinitionImpl#isStatic <em>Static</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OclFeatureDefinitionImpl extends ModuleElementImpl implements OclFeatureDefinition {
	/**
	 * The cached value of the '{@link #getFeature() <em>Feature</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeature()
	 * @generated
	 * @ordered
	 */
	protected OclFeature feature;

	/**
	 * The cached value of the '{@link #getContext_() <em>Context </em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContext_()
	 * @generated
	 * @ordered
	 */
	protected OclContextDefinition context_;

	/**
	 * The default value of the '{@link #isStatic() <em>Static</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStatic()
	 * @generated
	 * @ordered
	 */
	protected static final boolean STATIC_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isStatic() <em>Static</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStatic()
	 * @generated
	 * @ordered
	 */
	protected boolean static_ = STATIC_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OclFeatureDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QMM_OCLPackage.Literals.OCL_FEATURE_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OclFeature getFeature() {
		return feature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFeature(OclFeature newFeature, NotificationChain msgs) {
		OclFeature oldFeature = feature;
		feature = newFeature;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QMM_OCLPackage.OCL_FEATURE_DEFINITION__FEATURE, oldFeature, newFeature);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFeature(OclFeature newFeature) {
		if (newFeature != feature) {
			NotificationChain msgs = null;
			if (feature != null)
				msgs = ((InternalEObject)feature).eInverseRemove(this, QMM_OCLPackage.OCL_FEATURE__DEFINITION, OclFeature.class, msgs);
			if (newFeature != null)
				msgs = ((InternalEObject)newFeature).eInverseAdd(this, QMM_OCLPackage.OCL_FEATURE__DEFINITION, OclFeature.class, msgs);
			msgs = basicSetFeature(newFeature, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QMM_OCLPackage.OCL_FEATURE_DEFINITION__FEATURE, newFeature, newFeature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OclContextDefinition getContext_() {
		return context_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContext_(OclContextDefinition newContext_, NotificationChain msgs) {
		OclContextDefinition oldContext_ = context_;
		context_ = newContext_;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QMM_OCLPackage.OCL_FEATURE_DEFINITION__CONTEXT_, oldContext_, newContext_);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContext_(OclContextDefinition newContext_) {
		if (newContext_ != context_) {
			NotificationChain msgs = null;
			if (context_ != null)
				msgs = ((InternalEObject)context_).eInverseRemove(this, QMM_OCLPackage.OCL_CONTEXT_DEFINITION__DEFINITION, OclContextDefinition.class, msgs);
			if (newContext_ != null)
				msgs = ((InternalEObject)newContext_).eInverseAdd(this, QMM_OCLPackage.OCL_CONTEXT_DEFINITION__DEFINITION, OclContextDefinition.class, msgs);
			msgs = basicSetContext_(newContext_, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QMM_OCLPackage.OCL_FEATURE_DEFINITION__CONTEXT_, newContext_, newContext_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isStatic() {
		return static_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatic(boolean newStatic) {
		boolean oldStatic = static_;
		static_ = newStatic;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QMM_OCLPackage.OCL_FEATURE_DEFINITION__STATIC, oldStatic, static_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QMM_OCLPackage.OCL_FEATURE_DEFINITION__FEATURE:
				if (feature != null)
					msgs = ((InternalEObject)feature).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QMM_OCLPackage.OCL_FEATURE_DEFINITION__FEATURE, null, msgs);
				return basicSetFeature((OclFeature)otherEnd, msgs);
			case QMM_OCLPackage.OCL_FEATURE_DEFINITION__CONTEXT_:
				if (context_ != null)
					msgs = ((InternalEObject)context_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QMM_OCLPackage.OCL_FEATURE_DEFINITION__CONTEXT_, null, msgs);
				return basicSetContext_((OclContextDefinition)otherEnd, msgs);
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
			case QMM_OCLPackage.OCL_FEATURE_DEFINITION__FEATURE:
				return basicSetFeature(null, msgs);
			case QMM_OCLPackage.OCL_FEATURE_DEFINITION__CONTEXT_:
				return basicSetContext_(null, msgs);
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
			case QMM_OCLPackage.OCL_FEATURE_DEFINITION__FEATURE:
				return getFeature();
			case QMM_OCLPackage.OCL_FEATURE_DEFINITION__CONTEXT_:
				return getContext_();
			case QMM_OCLPackage.OCL_FEATURE_DEFINITION__STATIC:
				return isStatic();
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
			case QMM_OCLPackage.OCL_FEATURE_DEFINITION__FEATURE:
				setFeature((OclFeature)newValue);
				return;
			case QMM_OCLPackage.OCL_FEATURE_DEFINITION__CONTEXT_:
				setContext_((OclContextDefinition)newValue);
				return;
			case QMM_OCLPackage.OCL_FEATURE_DEFINITION__STATIC:
				setStatic((Boolean)newValue);
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
			case QMM_OCLPackage.OCL_FEATURE_DEFINITION__FEATURE:
				setFeature((OclFeature)null);
				return;
			case QMM_OCLPackage.OCL_FEATURE_DEFINITION__CONTEXT_:
				setContext_((OclContextDefinition)null);
				return;
			case QMM_OCLPackage.OCL_FEATURE_DEFINITION__STATIC:
				setStatic(STATIC_EDEFAULT);
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
			case QMM_OCLPackage.OCL_FEATURE_DEFINITION__FEATURE:
				return feature != null;
			case QMM_OCLPackage.OCL_FEATURE_DEFINITION__CONTEXT_:
				return context_ != null;
			case QMM_OCLPackage.OCL_FEATURE_DEFINITION__STATIC:
				return static_ != STATIC_EDEFAULT;
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
		result.append(" (static: ");
		result.append(static_);
		result.append(')');
		return result.toString();
	}

} //OclFeatureDefinitionImpl
