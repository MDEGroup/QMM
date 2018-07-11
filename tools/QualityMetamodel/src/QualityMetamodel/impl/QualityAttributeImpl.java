/**
 */
package QualityMetamodel.impl;

import QualityMetamodel.QMM_OCL.impl.VariableDeclarationImpl;

import QualityMetamodel.QualityAttribute;
import QualityMetamodel.QualityMetamodelPackage;
import QualityMetamodel.Value;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Quality Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link QualityMetamodel.impl.QualityAttributeImpl#getValue <em>Value</em>}</li>
 *   <li>{@link QualityMetamodel.impl.QualityAttributeImpl#getQualityAttributes <em>Quality Attributes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QualityAttributeImpl extends VariableDeclarationImpl implements QualityAttribute {
	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected Value value;

	/**
	 * The cached value of the '{@link #getQualityAttributes() <em>Quality Attributes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualityAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<QualityAttribute> qualityAttributes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QualityAttributeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QualityMetamodelPackage.Literals.QUALITY_ATTRIBUTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Value getValue() {
		if (value != null && value.eIsProxy()) {
			InternalEObject oldValue = (InternalEObject)value;
			value = (Value)eResolveProxy(oldValue);
			if (value != oldValue) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, QualityMetamodelPackage.QUALITY_ATTRIBUTE__VALUE, oldValue, value));
			}
		}
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Value basicGetValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(Value newValue) {
		Value oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QualityMetamodelPackage.QUALITY_ATTRIBUTE__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<QualityAttribute> getQualityAttributes() {
		if (qualityAttributes == null) {
			qualityAttributes = new EObjectResolvingEList<QualityAttribute>(QualityAttribute.class, this, QualityMetamodelPackage.QUALITY_ATTRIBUTE__QUALITY_ATTRIBUTES);
		}
		return qualityAttributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QualityMetamodelPackage.QUALITY_ATTRIBUTE__VALUE:
				if (resolve) return getValue();
				return basicGetValue();
			case QualityMetamodelPackage.QUALITY_ATTRIBUTE__QUALITY_ATTRIBUTES:
				return getQualityAttributes();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case QualityMetamodelPackage.QUALITY_ATTRIBUTE__VALUE:
				setValue((Value)newValue);
				return;
			case QualityMetamodelPackage.QUALITY_ATTRIBUTE__QUALITY_ATTRIBUTES:
				getQualityAttributes().clear();
				getQualityAttributes().addAll((Collection<? extends QualityAttribute>)newValue);
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
			case QualityMetamodelPackage.QUALITY_ATTRIBUTE__VALUE:
				setValue((Value)null);
				return;
			case QualityMetamodelPackage.QUALITY_ATTRIBUTE__QUALITY_ATTRIBUTES:
				getQualityAttributes().clear();
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
			case QualityMetamodelPackage.QUALITY_ATTRIBUTE__VALUE:
				return value != null;
			case QualityMetamodelPackage.QUALITY_ATTRIBUTE__QUALITY_ATTRIBUTES:
				return qualityAttributes != null && !qualityAttributes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //QualityAttributeImpl
