/**
 */
package QualityMetamodel.impl;

import QualityMetamodel.MetricProvider;

import QualityMetamodel.QMM_OCL.impl.ModuleImpl;

import QualityMetamodel.QualityAttribute;
import QualityMetamodel.QualityMetamodelPackage;
import QualityMetamodel.QualityModel;
import QualityMetamodel.Value;
import QualityMetamodel.ValueType;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Quality Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link QualityMetamodel.impl.QualityModelImpl#getMetricProviders <em>Metric Providers</em>}</li>
 *   <li>{@link QualityMetamodel.impl.QualityModelImpl#getQualityTypes <em>Quality Types</em>}</li>
 *   <li>{@link QualityMetamodel.impl.QualityModelImpl#getQualityAttributes <em>Quality Attributes</em>}</li>
 *   <li>{@link QualityMetamodel.impl.QualityModelImpl#getQualityValues <em>Quality Values</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QualityModelImpl extends ModuleImpl implements QualityModel {
	/**
	 * The cached value of the '{@link #getMetricProviders() <em>Metric Providers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetricProviders()
	 * @generated
	 * @ordered
	 */
	protected EList<MetricProvider> metricProviders;

	/**
	 * The cached value of the '{@link #getQualityTypes() <em>Quality Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualityTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<ValueType> qualityTypes;

	/**
	 * The cached value of the '{@link #getQualityAttributes() <em>Quality Attributes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualityAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<QualityAttribute> qualityAttributes;

	/**
	 * The cached value of the '{@link #getQualityValues() <em>Quality Values</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualityValues()
	 * @generated
	 * @ordered
	 */
	protected EList<Value> qualityValues;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QualityModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QualityMetamodelPackage.Literals.QUALITY_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MetricProvider> getMetricProviders() {
		if (metricProviders == null) {
			metricProviders = new EObjectContainmentEList<MetricProvider>(MetricProvider.class, this, QualityMetamodelPackage.QUALITY_MODEL__METRIC_PROVIDERS);
		}
		return metricProviders;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ValueType> getQualityTypes() {
		if (qualityTypes == null) {
			qualityTypes = new EObjectContainmentEList<ValueType>(ValueType.class, this, QualityMetamodelPackage.QUALITY_MODEL__QUALITY_TYPES);
		}
		return qualityTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<QualityAttribute> getQualityAttributes() {
		if (qualityAttributes == null) {
			qualityAttributes = new EObjectContainmentEList<QualityAttribute>(QualityAttribute.class, this, QualityMetamodelPackage.QUALITY_MODEL__QUALITY_ATTRIBUTES);
		}
		return qualityAttributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Value> getQualityValues() {
		if (qualityValues == null) {
			qualityValues = new EObjectContainmentEList<Value>(Value.class, this, QualityMetamodelPackage.QUALITY_MODEL__QUALITY_VALUES);
		}
		return qualityValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QualityMetamodelPackage.QUALITY_MODEL__METRIC_PROVIDERS:
				return ((InternalEList<?>)getMetricProviders()).basicRemove(otherEnd, msgs);
			case QualityMetamodelPackage.QUALITY_MODEL__QUALITY_TYPES:
				return ((InternalEList<?>)getQualityTypes()).basicRemove(otherEnd, msgs);
			case QualityMetamodelPackage.QUALITY_MODEL__QUALITY_ATTRIBUTES:
				return ((InternalEList<?>)getQualityAttributes()).basicRemove(otherEnd, msgs);
			case QualityMetamodelPackage.QUALITY_MODEL__QUALITY_VALUES:
				return ((InternalEList<?>)getQualityValues()).basicRemove(otherEnd, msgs);
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
			case QualityMetamodelPackage.QUALITY_MODEL__METRIC_PROVIDERS:
				return getMetricProviders();
			case QualityMetamodelPackage.QUALITY_MODEL__QUALITY_TYPES:
				return getQualityTypes();
			case QualityMetamodelPackage.QUALITY_MODEL__QUALITY_ATTRIBUTES:
				return getQualityAttributes();
			case QualityMetamodelPackage.QUALITY_MODEL__QUALITY_VALUES:
				return getQualityValues();
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
			case QualityMetamodelPackage.QUALITY_MODEL__METRIC_PROVIDERS:
				getMetricProviders().clear();
				getMetricProviders().addAll((Collection<? extends MetricProvider>)newValue);
				return;
			case QualityMetamodelPackage.QUALITY_MODEL__QUALITY_TYPES:
				getQualityTypes().clear();
				getQualityTypes().addAll((Collection<? extends ValueType>)newValue);
				return;
			case QualityMetamodelPackage.QUALITY_MODEL__QUALITY_ATTRIBUTES:
				getQualityAttributes().clear();
				getQualityAttributes().addAll((Collection<? extends QualityAttribute>)newValue);
				return;
			case QualityMetamodelPackage.QUALITY_MODEL__QUALITY_VALUES:
				getQualityValues().clear();
				getQualityValues().addAll((Collection<? extends Value>)newValue);
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
			case QualityMetamodelPackage.QUALITY_MODEL__METRIC_PROVIDERS:
				getMetricProviders().clear();
				return;
			case QualityMetamodelPackage.QUALITY_MODEL__QUALITY_TYPES:
				getQualityTypes().clear();
				return;
			case QualityMetamodelPackage.QUALITY_MODEL__QUALITY_ATTRIBUTES:
				getQualityAttributes().clear();
				return;
			case QualityMetamodelPackage.QUALITY_MODEL__QUALITY_VALUES:
				getQualityValues().clear();
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
			case QualityMetamodelPackage.QUALITY_MODEL__METRIC_PROVIDERS:
				return metricProviders != null && !metricProviders.isEmpty();
			case QualityMetamodelPackage.QUALITY_MODEL__QUALITY_TYPES:
				return qualityTypes != null && !qualityTypes.isEmpty();
			case QualityMetamodelPackage.QUALITY_MODEL__QUALITY_ATTRIBUTES:
				return qualityAttributes != null && !qualityAttributes.isEmpty();
			case QualityMetamodelPackage.QUALITY_MODEL__QUALITY_VALUES:
				return qualityValues != null && !qualityValues.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //QualityModelImpl
