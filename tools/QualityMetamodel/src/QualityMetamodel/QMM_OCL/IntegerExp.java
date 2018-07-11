/**
 */
package QualityMetamodel.QMM_OCL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Integer Exp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link QualityMetamodel.QMM_OCL.IntegerExp#getIntegerSymbol <em>Integer Symbol</em>}</li>
 * </ul>
 *
 * @see QualityMetamodel.QMM_OCL.QMM_OCLPackage#getIntegerExp()
 * @model
 * @generated
 */
public interface IntegerExp extends NumericExp {
	/**
	 * Returns the value of the '<em><b>Integer Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Integer Symbol</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Integer Symbol</em>' attribute.
	 * @see #setIntegerSymbol(int)
	 * @see QualityMetamodel.QMM_OCL.QMM_OCLPackage#getIntegerExp_IntegerSymbol()
	 * @model unique="false" dataType="QualityMetamodel.QMM_OCL.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getIntegerSymbol();

	/**
	 * Sets the value of the '{@link QualityMetamodel.QMM_OCL.IntegerExp#getIntegerSymbol <em>Integer Symbol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Integer Symbol</em>' attribute.
	 * @see #getIntegerSymbol()
	 * @generated
	 */
	void setIntegerSymbol(int value);

} // IntegerExp
