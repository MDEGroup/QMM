/**
 */
package QualityMetamodel.QMM_OCL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Real Exp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link QualityMetamodel.QMM_OCL.RealExp#getRealSymbol <em>Real Symbol</em>}</li>
 * </ul>
 *
 * @see QualityMetamodel.QMM_OCL.QMM_OCLPackage#getRealExp()
 * @model
 * @generated
 */
public interface RealExp extends NumericExp {
	/**
	 * Returns the value of the '<em><b>Real Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Real Symbol</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Real Symbol</em>' attribute.
	 * @see #setRealSymbol(double)
	 * @see QualityMetamodel.QMM_OCL.QMM_OCLPackage#getRealExp_RealSymbol()
	 * @model unique="false" dataType="QualityMetamodel.QMM_OCL.Double" required="true" ordered="false"
	 * @generated
	 */
	double getRealSymbol();

	/**
	 * Sets the value of the '{@link QualityMetamodel.QMM_OCL.RealExp#getRealSymbol <em>Real Symbol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Real Symbol</em>' attribute.
	 * @see #getRealSymbol()
	 * @generated
	 */
	void setRealSymbol(double value);

} // RealExp
