/**
 */
package QualityMetamodel.QMM_OCL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lambda Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link QualityMetamodel.QMM_OCL.LambdaType#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link QualityMetamodel.QMM_OCL.LambdaType#getArgumentTypes <em>Argument Types</em>}</li>
 * </ul>
 *
 * @see QualityMetamodel.QMM_OCL.QMM_OCLPackage#getLambdaType()
 * @model
 * @generated
 */
public interface LambdaType extends OclType {
	/**
	 * Returns the value of the '<em><b>Return Type</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link QualityMetamodel.QMM_OCL.OclType#getLambdaReturnType <em>Lambda Return Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Return Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Type</em>' containment reference.
	 * @see #setReturnType(OclType)
	 * @see QualityMetamodel.QMM_OCL.QMM_OCLPackage#getLambdaType_ReturnType()
	 * @see QualityMetamodel.QMM_OCL.OclType#getLambdaReturnType
	 * @model opposite="lambdaReturnType" containment="true" required="true"
	 * @generated
	 */
	OclType getReturnType();

	/**
	 * Sets the value of the '{@link QualityMetamodel.QMM_OCL.LambdaType#getReturnType <em>Return Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Type</em>' containment reference.
	 * @see #getReturnType()
	 * @generated
	 */
	void setReturnType(OclType value);

	/**
	 * Returns the value of the '<em><b>Argument Types</b></em>' containment reference list.
	 * The list contents are of type {@link QualityMetamodel.QMM_OCL.OclType}.
	 * It is bidirectional and its opposite is '{@link QualityMetamodel.QMM_OCL.OclType#getLambdaArgType <em>Lambda Arg Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Argument Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Argument Types</em>' containment reference list.
	 * @see QualityMetamodel.QMM_OCL.QMM_OCLPackage#getLambdaType_ArgumentTypes()
	 * @see QualityMetamodel.QMM_OCL.OclType#getLambdaArgType
	 * @model opposite="lambdaArgType" containment="true"
	 * @generated
	 */
	EList<OclType> getArgumentTypes();

} // LambdaType
