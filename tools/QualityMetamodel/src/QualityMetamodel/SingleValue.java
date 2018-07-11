/**
 */
package QualityMetamodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Single Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link QualityMetamodel.SingleValue#getMeasuredBy <em>Measured By</em>}</li>
 * </ul>
 *
 * @see QualityMetamodel.QualityMetamodelPackage#getSingleValue()
 * @model
 * @generated
 */
public interface SingleValue extends Value {
	/**
	 * Returns the value of the '<em><b>Measured By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Measured By</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Measured By</em>' reference.
	 * @see #setMeasuredBy(MetricProvider)
	 * @see QualityMetamodel.QualityMetamodelPackage#getSingleValue_MeasuredBy()
	 * @model required="true"
	 * @generated
	 */
	MetricProvider getMeasuredBy();

	/**
	 * Sets the value of the '{@link QualityMetamodel.SingleValue#getMeasuredBy <em>Measured By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Measured By</em>' reference.
	 * @see #getMeasuredBy()
	 * @generated
	 */
	void setMeasuredBy(MetricProvider value);

} // SingleValue
