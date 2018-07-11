/**
 */
package QualityMetamodel;

import QualityMetamodel.QMM_OCL.VariableDeclaration;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link QualityMetamodel.Value#getValueType <em>Value Type</em>}</li>
 *   <li>{@link QualityMetamodel.Value#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see QualityMetamodel.QualityMetamodelPackage#getValue()
 * @model abstract="true"
 * @generated
 */
public interface Value extends VariableDeclaration {
	/**
	 * Returns the value of the '<em><b>Value Type</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link QualityMetamodel.ValueType#getVal <em>Val</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Type</em>' reference.
	 * @see #setValueType(ValueType)
	 * @see QualityMetamodel.QualityMetamodelPackage#getValue_ValueType()
	 * @see QualityMetamodel.ValueType#getVal
	 * @model opposite="val" required="true"
	 * @generated
	 */
	ValueType getValueType();

	/**
	 * Sets the value of the '{@link QualityMetamodel.Value#getValueType <em>Value Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Type</em>' reference.
	 * @see #getValueType()
	 * @generated
	 */
	void setValueType(ValueType value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see QualityMetamodel.QualityMetamodelPackage#getValue_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link QualityMetamodel.Value#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

} // Value
