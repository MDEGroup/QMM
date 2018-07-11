/**
 */
package QualityMetamodel;

import QualityMetamodel.QMM_OCL.VariableDeclaration;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Value Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link QualityMetamodel.ValueType#getVal <em>Val</em>}</li>
 * </ul>
 *
 * @see QualityMetamodel.QualityMetamodelPackage#getValueType()
 * @model abstract="true"
 * @generated
 */
public interface ValueType extends VariableDeclaration {
	/**
	 * Returns the value of the '<em><b>Val</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link QualityMetamodel.Value#getValueType <em>Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Val</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Val</em>' reference.
	 * @see #setVal(Value)
	 * @see QualityMetamodel.QualityMetamodelPackage#getValueType_Val()
	 * @see QualityMetamodel.Value#getValueType
	 * @model opposite="valueType" required="true"
	 * @generated
	 */
	Value getVal();

	/**
	 * Sets the value of the '{@link QualityMetamodel.ValueType#getVal <em>Val</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Val</em>' reference.
	 * @see #getVal()
	 * @generated
	 */
	void setVal(Value value);

} // ValueType
