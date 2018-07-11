/**
 */
package QualityMetamodel.QMM_OCL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link QualityMetamodel.QMM_OCL.Operation#getParameters <em>Parameters</em>}</li>
 *   <li>{@link QualityMetamodel.QMM_OCL.Operation#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link QualityMetamodel.QMM_OCL.Operation#getBody <em>Body</em>}</li>
 * </ul>
 *
 * @see QualityMetamodel.QMM_OCL.QMM_OCLPackage#getOperation()
 * @model
 * @generated
 */
public interface Operation extends OclFeature {
	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link QualityMetamodel.QMM_OCL.Parameter}.
	 * It is bidirectional and its opposite is '{@link QualityMetamodel.QMM_OCL.Parameter#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see QualityMetamodel.QMM_OCL.QMM_OCLPackage#getOperation_Parameters()
	 * @see QualityMetamodel.QMM_OCL.Parameter#getOperation
	 * @model opposite="operation" containment="true"
	 * @generated
	 */
	EList<Parameter> getParameters();

	/**
	 * Returns the value of the '<em><b>Return Type</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link QualityMetamodel.QMM_OCL.OclType#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Return Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Type</em>' containment reference.
	 * @see #setReturnType(OclType)
	 * @see QualityMetamodel.QMM_OCL.QMM_OCLPackage#getOperation_ReturnType()
	 * @see QualityMetamodel.QMM_OCL.OclType#getOperation
	 * @model opposite="operation" containment="true" required="true" ordered="false"
	 * @generated
	 */
	OclType getReturnType();

	/**
	 * Sets the value of the '{@link QualityMetamodel.QMM_OCL.Operation#getReturnType <em>Return Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Type</em>' containment reference.
	 * @see #getReturnType()
	 * @generated
	 */
	void setReturnType(OclType value);

	/**
	 * Returns the value of the '<em><b>Body</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link QualityMetamodel.QMM_OCL.OclExpression#getOwningOperation <em>Owning Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Body</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' containment reference.
	 * @see #setBody(OclExpression)
	 * @see QualityMetamodel.QMM_OCL.QMM_OCLPackage#getOperation_Body()
	 * @see QualityMetamodel.QMM_OCL.OclExpression#getOwningOperation
	 * @model opposite="owningOperation" containment="true" required="true" ordered="false"
	 * @generated
	 */
	OclExpression getBody();

	/**
	 * Sets the value of the '{@link QualityMetamodel.QMM_OCL.Operation#getBody <em>Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' containment reference.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(OclExpression value);

} // Operation
