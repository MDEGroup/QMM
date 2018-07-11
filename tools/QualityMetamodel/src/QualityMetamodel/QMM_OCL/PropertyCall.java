/**
 */
package QualityMetamodel.QMM_OCL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link QualityMetamodel.QMM_OCL.PropertyCall#getCallExp <em>Call Exp</em>}</li>
 * </ul>
 *
 * @see QualityMetamodel.QMM_OCL.QMM_OCLPackage#getPropertyCall()
 * @model abstract="true"
 * @generated
 */
public interface PropertyCall extends LocatedElement {
	/**
	 * Returns the value of the '<em><b>Call Exp</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link QualityMetamodel.QMM_OCL.PropertyCallExp#getCalls <em>Calls</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Call Exp</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Call Exp</em>' container reference.
	 * @see #setCallExp(PropertyCallExp)
	 * @see QualityMetamodel.QMM_OCL.QMM_OCLPackage#getPropertyCall_CallExp()
	 * @see QualityMetamodel.QMM_OCL.PropertyCallExp#getCalls
	 * @model opposite="calls" required="true" transient="false"
	 * @generated
	 */
	PropertyCallExp getCallExp();

	/**
	 * Sets the value of the '{@link QualityMetamodel.QMM_OCL.PropertyCall#getCallExp <em>Call Exp</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Call Exp</em>' container reference.
	 * @see #getCallExp()
	 * @generated
	 */
	void setCallExp(PropertyCallExp value);

} // PropertyCall
