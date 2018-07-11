/**
 */
package QualityMetamodel.QMM_OCL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Iterator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link QualityMetamodel.QMM_OCL.Iterator#getLoopExpr <em>Loop Expr</em>}</li>
 * </ul>
 *
 * @see QualityMetamodel.QMM_OCL.QMM_OCLPackage#getIterator()
 * @model
 * @generated
 */
public interface Iterator extends VariableDeclaration {
	/**
	 * Returns the value of the '<em><b>Loop Expr</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link QualityMetamodel.QMM_OCL.LoopExp#getIterators <em>Iterators</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Loop Expr</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Loop Expr</em>' container reference.
	 * @see #setLoopExpr(LoopExp)
	 * @see QualityMetamodel.QMM_OCL.QMM_OCLPackage#getIterator_LoopExpr()
	 * @see QualityMetamodel.QMM_OCL.LoopExp#getIterators
	 * @model opposite="iterators" transient="false" ordered="false"
	 * @generated
	 */
	LoopExp getLoopExpr();

	/**
	 * Sets the value of the '{@link QualityMetamodel.QMM_OCL.Iterator#getLoopExpr <em>Loop Expr</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Loop Expr</em>' container reference.
	 * @see #getLoopExpr()
	 * @generated
	 */
	void setLoopExpr(LoopExp value);

} // Iterator
