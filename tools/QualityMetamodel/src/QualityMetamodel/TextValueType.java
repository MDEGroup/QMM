/**
 */
package QualityMetamodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Text Value Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link QualityMetamodel.TextValueType#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see QualityMetamodel.QualityMetamodelPackage#getTextValueType()
 * @model
 * @generated
 */
public interface TextValueType extends ValueType {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see QualityMetamodel.QualityMetamodelPackage#getTextValueType_Value()
	 * @model
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link QualityMetamodel.TextValueType#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

} // TextValueType
