/**
 */
package QualityMetamodel.QMM_OCL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Static Property Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link QualityMetamodel.QMM_OCL.StaticPropertyCall#getStaticCallExp <em>Static Call Exp</em>}</li>
 * </ul>
 *
 * @see QualityMetamodel.QMM_OCL.QMM_OCLPackage#getStaticPropertyCall()
 * @model abstract="true"
 * @generated
 */
public interface StaticPropertyCall extends LocatedElement {
	/**
	 * Returns the value of the '<em><b>Static Call Exp</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link QualityMetamodel.QMM_OCL.StaticPropertyCallExp#getStaticCall <em>Static Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Static Call Exp</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Static Call Exp</em>' container reference.
	 * @see #setStaticCallExp(StaticPropertyCallExp)
	 * @see QualityMetamodel.QMM_OCL.QMM_OCLPackage#getStaticPropertyCall_StaticCallExp()
	 * @see QualityMetamodel.QMM_OCL.StaticPropertyCallExp#getStaticCall
	 * @model opposite="staticCall" required="true" transient="false"
	 * @generated
	 */
	StaticPropertyCallExp getStaticCallExp();

	/**
	 * Sets the value of the '{@link QualityMetamodel.QMM_OCL.StaticPropertyCall#getStaticCallExp <em>Static Call Exp</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Static Call Exp</em>' container reference.
	 * @see #getStaticCallExp()
	 * @generated
	 */
	void setStaticCallExp(StaticPropertyCallExp value);

} // StaticPropertyCall
