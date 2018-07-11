/**
 */
package QualityMetamodel;

import QualityMetamodel.QMM_OCL.VariableDeclaration;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Quality Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link QualityMetamodel.QualityAttribute#getValue <em>Value</em>}</li>
 *   <li>{@link QualityMetamodel.QualityAttribute#getQualityAttributes <em>Quality Attributes</em>}</li>
 * </ul>
 *
 * @see QualityMetamodel.QualityMetamodelPackage#getQualityAttribute()
 * @model
 * @generated
 */
public interface QualityAttribute extends VariableDeclaration {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' reference.
	 * @see #setValue(Value)
	 * @see QualityMetamodel.QualityMetamodelPackage#getQualityAttribute_Value()
	 * @model required="true"
	 * @generated
	 */
	Value getValue();

	/**
	 * Sets the value of the '{@link QualityMetamodel.QualityAttribute#getValue <em>Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Value value);

	/**
	 * Returns the value of the '<em><b>Quality Attributes</b></em>' reference list.
	 * The list contents are of type {@link QualityMetamodel.QualityAttribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quality Attributes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quality Attributes</em>' reference list.
	 * @see QualityMetamodel.QualityMetamodelPackage#getQualityAttribute_QualityAttributes()
	 * @model
	 * @generated
	 */
	EList<QualityAttribute> getQualityAttributes();

} // QualityAttribute
