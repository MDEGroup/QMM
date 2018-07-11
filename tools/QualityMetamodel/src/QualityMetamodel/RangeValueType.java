/**
 */
package QualityMetamodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Range Value Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link QualityMetamodel.RangeValueType#getMin <em>Min</em>}</li>
 *   <li>{@link QualityMetamodel.RangeValueType#getMax <em>Max</em>}</li>
 * </ul>
 *
 * @see QualityMetamodel.QualityMetamodelPackage#getRangeValueType()
 * @model
 * @generated
 */
public interface RangeValueType extends ValueType {
	/**
	 * Returns the value of the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min</em>' attribute.
	 * @see #setMin(Integer)
	 * @see QualityMetamodel.QualityMetamodelPackage#getRangeValueType_Min()
	 * @model
	 * @generated
	 */
	Integer getMin();

	/**
	 * Sets the value of the '{@link QualityMetamodel.RangeValueType#getMin <em>Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min</em>' attribute.
	 * @see #getMin()
	 * @generated
	 */
	void setMin(Integer value);

	/**
	 * Returns the value of the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max</em>' attribute.
	 * @see #setMax(Integer)
	 * @see QualityMetamodel.QualityMetamodelPackage#getRangeValueType_Max()
	 * @model
	 * @generated
	 */
	Integer getMax();

	/**
	 * Sets the value of the '{@link QualityMetamodel.RangeValueType#getMax <em>Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max</em>' attribute.
	 * @see #getMax()
	 * @generated
	 */
	void setMax(Integer value);

} // RangeValueType
