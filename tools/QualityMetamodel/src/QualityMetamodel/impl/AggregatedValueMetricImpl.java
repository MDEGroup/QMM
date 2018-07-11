/**
 */
package QualityMetamodel.impl;

import QualityMetamodel.AggregatedValueMetric;
import QualityMetamodel.QualityMetamodelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Aggregated Value Metric</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link QualityMetamodel.impl.AggregatedValueMetricImpl#getMinimum <em>Minimum</em>}</li>
 *   <li>{@link QualityMetamodel.impl.AggregatedValueMetricImpl#getMaximum <em>Maximum</em>}</li>
 *   <li>{@link QualityMetamodel.impl.AggregatedValueMetricImpl#getAverage <em>Average</em>}</li>
 *   <li>{@link QualityMetamodel.impl.AggregatedValueMetricImpl#getMedian <em>Median</em>}</li>
 *   <li>{@link QualityMetamodel.impl.AggregatedValueMetricImpl#getStandardDeviation <em>Standard Deviation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AggregatedValueMetricImpl extends ValueTypeImpl implements AggregatedValueMetric {
	/**
	 * The default value of the '{@link #getMinimum() <em>Minimum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimum()
	 * @generated
	 * @ordered
	 */
	protected static final String MINIMUM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMinimum() <em>Minimum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimum()
	 * @generated
	 * @ordered
	 */
	protected String minimum = MINIMUM_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaximum() <em>Maximum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximum()
	 * @generated
	 * @ordered
	 */
	protected static final String MAXIMUM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaximum() <em>Maximum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximum()
	 * @generated
	 * @ordered
	 */
	protected String maximum = MAXIMUM_EDEFAULT;

	/**
	 * The default value of the '{@link #getAverage() <em>Average</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAverage()
	 * @generated
	 * @ordered
	 */
	protected static final String AVERAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAverage() <em>Average</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAverage()
	 * @generated
	 * @ordered
	 */
	protected String average = AVERAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMedian() <em>Median</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedian()
	 * @generated
	 * @ordered
	 */
	protected static final String MEDIAN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMedian() <em>Median</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedian()
	 * @generated
	 * @ordered
	 */
	protected String median = MEDIAN_EDEFAULT;

	/**
	 * The default value of the '{@link #getStandardDeviation() <em>Standard Deviation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStandardDeviation()
	 * @generated
	 * @ordered
	 */
	protected static final String STANDARD_DEVIATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStandardDeviation() <em>Standard Deviation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStandardDeviation()
	 * @generated
	 * @ordered
	 */
	protected String standardDeviation = STANDARD_DEVIATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AggregatedValueMetricImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QualityMetamodelPackage.Literals.AGGREGATED_VALUE_METRIC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMinimum() {
		return minimum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinimum(String newMinimum) {
		String oldMinimum = minimum;
		minimum = newMinimum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QualityMetamodelPackage.AGGREGATED_VALUE_METRIC__MINIMUM, oldMinimum, minimum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMaximum() {
		return maximum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaximum(String newMaximum) {
		String oldMaximum = maximum;
		maximum = newMaximum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QualityMetamodelPackage.AGGREGATED_VALUE_METRIC__MAXIMUM, oldMaximum, maximum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAverage() {
		return average;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAverage(String newAverage) {
		String oldAverage = average;
		average = newAverage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QualityMetamodelPackage.AGGREGATED_VALUE_METRIC__AVERAGE, oldAverage, average));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMedian() {
		return median;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMedian(String newMedian) {
		String oldMedian = median;
		median = newMedian;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QualityMetamodelPackage.AGGREGATED_VALUE_METRIC__MEDIAN, oldMedian, median));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStandardDeviation() {
		return standardDeviation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStandardDeviation(String newStandardDeviation) {
		String oldStandardDeviation = standardDeviation;
		standardDeviation = newStandardDeviation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QualityMetamodelPackage.AGGREGATED_VALUE_METRIC__STANDARD_DEVIATION, oldStandardDeviation, standardDeviation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QualityMetamodelPackage.AGGREGATED_VALUE_METRIC__MINIMUM:
				return getMinimum();
			case QualityMetamodelPackage.AGGREGATED_VALUE_METRIC__MAXIMUM:
				return getMaximum();
			case QualityMetamodelPackage.AGGREGATED_VALUE_METRIC__AVERAGE:
				return getAverage();
			case QualityMetamodelPackage.AGGREGATED_VALUE_METRIC__MEDIAN:
				return getMedian();
			case QualityMetamodelPackage.AGGREGATED_VALUE_METRIC__STANDARD_DEVIATION:
				return getStandardDeviation();
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
			case QualityMetamodelPackage.AGGREGATED_VALUE_METRIC__MINIMUM:
				setMinimum((String)newValue);
				return;
			case QualityMetamodelPackage.AGGREGATED_VALUE_METRIC__MAXIMUM:
				setMaximum((String)newValue);
				return;
			case QualityMetamodelPackage.AGGREGATED_VALUE_METRIC__AVERAGE:
				setAverage((String)newValue);
				return;
			case QualityMetamodelPackage.AGGREGATED_VALUE_METRIC__MEDIAN:
				setMedian((String)newValue);
				return;
			case QualityMetamodelPackage.AGGREGATED_VALUE_METRIC__STANDARD_DEVIATION:
				setStandardDeviation((String)newValue);
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
			case QualityMetamodelPackage.AGGREGATED_VALUE_METRIC__MINIMUM:
				setMinimum(MINIMUM_EDEFAULT);
				return;
			case QualityMetamodelPackage.AGGREGATED_VALUE_METRIC__MAXIMUM:
				setMaximum(MAXIMUM_EDEFAULT);
				return;
			case QualityMetamodelPackage.AGGREGATED_VALUE_METRIC__AVERAGE:
				setAverage(AVERAGE_EDEFAULT);
				return;
			case QualityMetamodelPackage.AGGREGATED_VALUE_METRIC__MEDIAN:
				setMedian(MEDIAN_EDEFAULT);
				return;
			case QualityMetamodelPackage.AGGREGATED_VALUE_METRIC__STANDARD_DEVIATION:
				setStandardDeviation(STANDARD_DEVIATION_EDEFAULT);
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
			case QualityMetamodelPackage.AGGREGATED_VALUE_METRIC__MINIMUM:
				return MINIMUM_EDEFAULT == null ? minimum != null : !MINIMUM_EDEFAULT.equals(minimum);
			case QualityMetamodelPackage.AGGREGATED_VALUE_METRIC__MAXIMUM:
				return MAXIMUM_EDEFAULT == null ? maximum != null : !MAXIMUM_EDEFAULT.equals(maximum);
			case QualityMetamodelPackage.AGGREGATED_VALUE_METRIC__AVERAGE:
				return AVERAGE_EDEFAULT == null ? average != null : !AVERAGE_EDEFAULT.equals(average);
			case QualityMetamodelPackage.AGGREGATED_VALUE_METRIC__MEDIAN:
				return MEDIAN_EDEFAULT == null ? median != null : !MEDIAN_EDEFAULT.equals(median);
			case QualityMetamodelPackage.AGGREGATED_VALUE_METRIC__STANDARD_DEVIATION:
				return STANDARD_DEVIATION_EDEFAULT == null ? standardDeviation != null : !STANDARD_DEVIATION_EDEFAULT.equals(standardDeviation);
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
		result.append(" (minimum: ");
		result.append(minimum);
		result.append(", maximum: ");
		result.append(maximum);
		result.append(", average: ");
		result.append(average);
		result.append(", median: ");
		result.append(median);
		result.append(", standardDeviation: ");
		result.append(standardDeviation);
		result.append(')');
		return result.toString();
	}

} //AggregatedValueMetricImpl
