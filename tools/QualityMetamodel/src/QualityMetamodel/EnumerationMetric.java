/**
 */
package QualityMetamodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enumeration Metric</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link QualityMetamodel.EnumerationMetric#getSet <em>Set</em>}</li>
 *   <li>{@link QualityMetamodel.EnumerationMetric#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see QualityMetamodel.QualityMetamodelPackage#getEnumerationMetric()
 * @model
 * @generated
 */
public interface EnumerationMetric extends ValueType {
	/**
	 * Returns the value of the '<em><b>Set</b></em>' containment reference list.
	 * The list contents are of type {@link QualityMetamodel.EnumerationItem}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Set</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Set</em>' containment reference list.
	 * @see QualityMetamodel.QualityMetamodelPackage#getEnumerationMetric_Set()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<EnumerationItem> getSet();

	/**
	 * Returns the value of the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' reference.
	 * @see #setValue(EnumerationItem)
	 * @see QualityMetamodel.QualityMetamodelPackage#getEnumerationMetric_Value()
	 * @model
	 * @generated
	 */
	EnumerationItem getValue();

	/**
	 * Sets the value of the '{@link QualityMetamodel.EnumerationMetric#getValue <em>Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(EnumerationItem value);

} // EnumerationMetric
