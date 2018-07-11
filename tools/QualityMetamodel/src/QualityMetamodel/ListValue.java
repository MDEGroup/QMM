/**
 */
package QualityMetamodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link QualityMetamodel.ListValue#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @see QualityMetamodel.QualityMetamodelPackage#getListValue()
 * @model
 * @generated
 */
public interface ListValue extends ValueType {
	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link QualityMetamodel.ValueType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see QualityMetamodel.QualityMetamodelPackage#getListValue_Elements()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ValueType> getElements();

} // ListValue
