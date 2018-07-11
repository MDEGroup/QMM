/**
 */
package QualityMetamodel.QMM_OCL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ocl Metamodel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link QualityMetamodel.QMM_OCL.OclMetamodel#getModel <em>Model</em>}</li>
 *   <li>{@link QualityMetamodel.QMM_OCL.OclMetamodel#getUri <em>Uri</em>}</li>
 * </ul>
 *
 * @see QualityMetamodel.QMM_OCL.QMM_OCLPackage#getOclMetamodel()
 * @model
 * @generated
 */
public interface OclMetamodel extends OclModel {
	/**
	 * Returns the value of the '<em><b>Model</b></em>' reference list.
	 * The list contents are of type {@link QualityMetamodel.QMM_OCL.OclInstanceModel}.
	 * It is bidirectional and its opposite is '{@link QualityMetamodel.QMM_OCL.OclInstanceModel#getMetamodel <em>Metamodel</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model</em>' reference list.
	 * @see QualityMetamodel.QMM_OCL.QMM_OCLPackage#getOclMetamodel_Model()
	 * @see QualityMetamodel.QMM_OCL.OclInstanceModel#getMetamodel
	 * @model opposite="metamodel" ordered="false"
	 * @generated
	 */
	EList<OclInstanceModel> getModel();

	/**
	 * Returns the value of the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uri</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uri</em>' attribute.
	 * @see #setUri(String)
	 * @see QualityMetamodel.QMM_OCL.QMM_OCLPackage#getOclMetamodel_Uri()
	 * @model dataType="QualityMetamodel.QMM_OCL.String"
	 * @generated
	 */
	String getUri();

	/**
	 * Sets the value of the '{@link QualityMetamodel.QMM_OCL.OclMetamodel#getUri <em>Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uri</em>' attribute.
	 * @see #getUri()
	 * @generated
	 */
	void setUri(String value);

} // OclMetamodel
