/**
 */
package QualityMetamodel.QMM_OCL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Located Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link QualityMetamodel.QMM_OCL.LocatedElement#getLine <em>Line</em>}</li>
 *   <li>{@link QualityMetamodel.QMM_OCL.LocatedElement#getColumn <em>Column</em>}</li>
 *   <li>{@link QualityMetamodel.QMM_OCL.LocatedElement#getCharStart <em>Char Start</em>}</li>
 *   <li>{@link QualityMetamodel.QMM_OCL.LocatedElement#getCharEnd <em>Char End</em>}</li>
 * </ul>
 *
 * @see QualityMetamodel.QMM_OCL.QMM_OCLPackage#getLocatedElement()
 * @model abstract="true"
 * @generated
 */
public interface LocatedElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Line</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Line</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line</em>' attribute.
	 * @see QualityMetamodel.QMM_OCL.QMM_OCLPackage#getLocatedElement_Line()
	 * @model default="-1" dataType="QualityMetamodel.QMM_OCL.Integer" required="true" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	int getLine();

	/**
	 * Returns the value of the '<em><b>Column</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Column</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Column</em>' attribute.
	 * @see QualityMetamodel.QMM_OCL.QMM_OCLPackage#getLocatedElement_Column()
	 * @model default="-1" dataType="QualityMetamodel.QMM_OCL.Integer" required="true" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	int getColumn();

	/**
	 * Returns the value of the '<em><b>Char Start</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Char Start</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Char Start</em>' attribute.
	 * @see QualityMetamodel.QMM_OCL.QMM_OCLPackage#getLocatedElement_CharStart()
	 * @model default="-1" dataType="QualityMetamodel.QMM_OCL.Integer" required="true" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	int getCharStart();

	/**
	 * Returns the value of the '<em><b>Char End</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Char End</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Char End</em>' attribute.
	 * @see QualityMetamodel.QMM_OCL.QMM_OCLPackage#getLocatedElement_CharEnd()
	 * @model default="-1" dataType="QualityMetamodel.QMM_OCL.Integer" required="true" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	int getCharEnd();

} // LocatedElement
