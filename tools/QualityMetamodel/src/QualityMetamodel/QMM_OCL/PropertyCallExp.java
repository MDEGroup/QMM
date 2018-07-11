/**
 */
package QualityMetamodel.QMM_OCL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property Call Exp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link QualityMetamodel.QMM_OCL.PropertyCallExp#getCalls <em>Calls</em>}</li>
 *   <li>{@link QualityMetamodel.QMM_OCL.PropertyCallExp#getSource <em>Source</em>}</li>
 * </ul>
 *
 * @see QualityMetamodel.QMM_OCL.QMM_OCLPackage#getPropertyCallExp()
 * @model
 * @generated
 */
public interface PropertyCallExp extends OclExpression {
	/**
	 * Returns the value of the '<em><b>Calls</b></em>' containment reference list.
	 * The list contents are of type {@link QualityMetamodel.QMM_OCL.PropertyCall}.
	 * It is bidirectional and its opposite is '{@link QualityMetamodel.QMM_OCL.PropertyCall#getCallExp <em>Call Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Calls</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Calls</em>' containment reference list.
	 * @see QualityMetamodel.QMM_OCL.QMM_OCLPackage#getPropertyCallExp_Calls()
	 * @see QualityMetamodel.QMM_OCL.PropertyCall#getCallExp
	 * @model opposite="callExp" containment="true" required="true"
	 * @generated
	 */
	EList<PropertyCall> getCalls();

	/**
	 * Returns the value of the '<em><b>Source</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link QualityMetamodel.QMM_OCL.OclExpression#getAppliedProperty <em>Applied Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' containment reference.
	 * @see #setSource(OclExpression)
	 * @see QualityMetamodel.QMM_OCL.QMM_OCLPackage#getPropertyCallExp_Source()
	 * @see QualityMetamodel.QMM_OCL.OclExpression#getAppliedProperty
	 * @model opposite="appliedProperty" containment="true" required="true" ordered="false"
	 * @generated
	 */
	OclExpression getSource();

	/**
	 * Sets the value of the '{@link QualityMetamodel.QMM_OCL.PropertyCallExp#getSource <em>Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' containment reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(OclExpression value);

} // PropertyCallExp
