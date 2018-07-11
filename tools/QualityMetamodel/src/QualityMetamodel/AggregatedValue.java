/**
 */
package QualityMetamodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Aggregated Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link QualityMetamodel.AggregatedValue#getCalculatedBy <em>Calculated By</em>}</li>
 * </ul>
 *
 * @see QualityMetamodel.QualityMetamodelPackage#getAggregatedValue()
 * @model
 * @generated
 */
public interface AggregatedValue extends Value {
	/**
	 * Returns the value of the '<em><b>Calculated By</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Calculated By</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Calculated By</em>' containment reference.
	 * @see #setCalculatedBy(Operation)
	 * @see QualityMetamodel.QualityMetamodelPackage#getAggregatedValue_CalculatedBy()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Operation getCalculatedBy();

	/**
	 * Sets the value of the '{@link QualityMetamodel.AggregatedValue#getCalculatedBy <em>Calculated By</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Calculated By</em>' containment reference.
	 * @see #getCalculatedBy()
	 * @generated
	 */
	void setCalculatedBy(Operation value);

} // AggregatedValue
