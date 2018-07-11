/**
 */
package QualityMetamodel;

import QualityMetamodel.QMM_OCL.Module;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Quality Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link QualityMetamodel.QualityModel#getMetricProviders <em>Metric Providers</em>}</li>
 *   <li>{@link QualityMetamodel.QualityModel#getQualityTypes <em>Quality Types</em>}</li>
 *   <li>{@link QualityMetamodel.QualityModel#getQualityAttributes <em>Quality Attributes</em>}</li>
 *   <li>{@link QualityMetamodel.QualityModel#getQualityValues <em>Quality Values</em>}</li>
 * </ul>
 *
 * @see QualityMetamodel.QualityMetamodelPackage#getQualityModel()
 * @model
 * @generated
 */
public interface QualityModel extends Module {
	/**
	 * Returns the value of the '<em><b>Metric Providers</b></em>' containment reference list.
	 * The list contents are of type {@link QualityMetamodel.MetricProvider}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Metric Providers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metric Providers</em>' containment reference list.
	 * @see QualityMetamodel.QualityMetamodelPackage#getQualityModel_MetricProviders()
	 * @model containment="true"
	 * @generated
	 */
	EList<MetricProvider> getMetricProviders();

	/**
	 * Returns the value of the '<em><b>Quality Types</b></em>' containment reference list.
	 * The list contents are of type {@link QualityMetamodel.ValueType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quality Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quality Types</em>' containment reference list.
	 * @see QualityMetamodel.QualityMetamodelPackage#getQualityModel_QualityTypes()
	 * @model containment="true"
	 * @generated
	 */
	EList<ValueType> getQualityTypes();

	/**
	 * Returns the value of the '<em><b>Quality Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link QualityMetamodel.QualityAttribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quality Attributes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quality Attributes</em>' containment reference list.
	 * @see QualityMetamodel.QualityMetamodelPackage#getQualityModel_QualityAttributes()
	 * @model containment="true"
	 * @generated
	 */
	EList<QualityAttribute> getQualityAttributes();

	/**
	 * Returns the value of the '<em><b>Quality Values</b></em>' containment reference list.
	 * The list contents are of type {@link QualityMetamodel.Value}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quality Values</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quality Values</em>' containment reference list.
	 * @see QualityMetamodel.QualityMetamodelPackage#getQualityModel_QualityValues()
	 * @model containment="true"
	 * @generated
	 */
	EList<Value> getQualityValues();

} // QualityModel
