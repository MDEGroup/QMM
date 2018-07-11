/**
 */
package QualityMetamodel.QMM_OCL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Static Property Call Exp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link QualityMetamodel.QMM_OCL.StaticPropertyCallExp#getSource <em>Source</em>}</li>
 *   <li>{@link QualityMetamodel.QMM_OCL.StaticPropertyCallExp#getStaticCall <em>Static Call</em>}</li>
 * </ul>
 *
 * @see QualityMetamodel.QMM_OCL.QMM_OCLPackage#getStaticPropertyCallExp()
 * @model
 * @generated
 */
public interface StaticPropertyCallExp extends OclExpression {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link QualityMetamodel.QMM_OCL.OclType#getStaticPropertyCall <em>Static Property Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' containment reference.
	 * @see #setSource(OclType)
	 * @see QualityMetamodel.QMM_OCL.QMM_OCLPackage#getStaticPropertyCallExp_Source()
	 * @see QualityMetamodel.QMM_OCL.OclType#getStaticPropertyCall
	 * @model opposite="staticPropertyCall" containment="true" required="true"
	 * @generated
	 */
	OclType getSource();

	/**
	 * Sets the value of the '{@link QualityMetamodel.QMM_OCL.StaticPropertyCallExp#getSource <em>Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' containment reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(OclType value);

	/**
	 * Returns the value of the '<em><b>Static Call</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link QualityMetamodel.QMM_OCL.StaticPropertyCall#getStaticCallExp <em>Static Call Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Static Call</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Static Call</em>' containment reference.
	 * @see #setStaticCall(StaticPropertyCall)
	 * @see QualityMetamodel.QMM_OCL.QMM_OCLPackage#getStaticPropertyCallExp_StaticCall()
	 * @see QualityMetamodel.QMM_OCL.StaticPropertyCall#getStaticCallExp
	 * @model opposite="staticCallExp" containment="true" required="true"
	 * @generated
	 */
	StaticPropertyCall getStaticCall();

	/**
	 * Sets the value of the '{@link QualityMetamodel.QMM_OCL.StaticPropertyCallExp#getStaticCall <em>Static Call</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Static Call</em>' containment reference.
	 * @see #getStaticCall()
	 * @generated
	 */
	void setStaticCall(StaticPropertyCall value);

} // StaticPropertyCallExp
