/**
 */
package QualityMetamodel.QMM_OCL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ocl Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link QualityMetamodel.QMM_OCL.OclType#getName <em>Name</em>}</li>
 *   <li>{@link QualityMetamodel.QMM_OCL.OclType#getDefinitions <em>Definitions</em>}</li>
 *   <li>{@link QualityMetamodel.QMM_OCL.OclType#getOclExpression <em>Ocl Expression</em>}</li>
 *   <li>{@link QualityMetamodel.QMM_OCL.OclType#getOperation <em>Operation</em>}</li>
 *   <li>{@link QualityMetamodel.QMM_OCL.OclType#getMapType2 <em>Map Type2</em>}</li>
 *   <li>{@link QualityMetamodel.QMM_OCL.OclType#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link QualityMetamodel.QMM_OCL.OclType#getMapType <em>Map Type</em>}</li>
 *   <li>{@link QualityMetamodel.QMM_OCL.OclType#getCollectionTypes <em>Collection Types</em>}</li>
 *   <li>{@link QualityMetamodel.QMM_OCL.OclType#getTupleTypeAttribute <em>Tuple Type Attribute</em>}</li>
 *   <li>{@link QualityMetamodel.QMM_OCL.OclType#getVariableDeclaration <em>Variable Declaration</em>}</li>
 *   <li>{@link QualityMetamodel.QMM_OCL.OclType#getLambdaReturnType <em>Lambda Return Type</em>}</li>
 *   <li>{@link QualityMetamodel.QMM_OCL.OclType#getLambdaArgType <em>Lambda Arg Type</em>}</li>
 *   <li>{@link QualityMetamodel.QMM_OCL.OclType#getStaticPropertyCall <em>Static Property Call</em>}</li>
 * </ul>
 *
 * @see QualityMetamodel.QMM_OCL.QMM_OCLPackage#getOclType()
 * @model
 * @generated
 */
public interface OclType extends LocatedElement {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>"OclType"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see QualityMetamodel.QMM_OCL.QMM_OCLPackage#getOclType_Name()
	 * @model default="OclType" unique="false" dataType="QualityMetamodel.QMM_OCL.String" required="true" ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link QualityMetamodel.QMM_OCL.OclType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Definitions</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link QualityMetamodel.QMM_OCL.OclContextDefinition#getContext_ <em>Context </em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Definitions</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Definitions</em>' container reference.
	 * @see #setDefinitions(OclContextDefinition)
	 * @see QualityMetamodel.QMM_OCL.QMM_OCLPackage#getOclType_Definitions()
	 * @see QualityMetamodel.QMM_OCL.OclContextDefinition#getContext_
	 * @model opposite="context_" transient="false" ordered="false"
	 * @generated
	 */
	OclContextDefinition getDefinitions();

	/**
	 * Sets the value of the '{@link QualityMetamodel.QMM_OCL.OclType#getDefinitions <em>Definitions</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Definitions</em>' container reference.
	 * @see #getDefinitions()
	 * @generated
	 */
	void setDefinitions(OclContextDefinition value);

	/**
	 * Returns the value of the '<em><b>Ocl Expression</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link QualityMetamodel.QMM_OCL.OclExpression#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ocl Expression</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ocl Expression</em>' container reference.
	 * @see #setOclExpression(OclExpression)
	 * @see QualityMetamodel.QMM_OCL.QMM_OCLPackage#getOclType_OclExpression()
	 * @see QualityMetamodel.QMM_OCL.OclExpression#getType
	 * @model opposite="type" transient="false" ordered="false"
	 * @generated
	 */
	OclExpression getOclExpression();

	/**
	 * Sets the value of the '{@link QualityMetamodel.QMM_OCL.OclType#getOclExpression <em>Ocl Expression</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ocl Expression</em>' container reference.
	 * @see #getOclExpression()
	 * @generated
	 */
	void setOclExpression(OclExpression value);

	/**
	 * Returns the value of the '<em><b>Operation</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link QualityMetamodel.QMM_OCL.Operation#getReturnType <em>Return Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operation</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation</em>' container reference.
	 * @see #setOperation(Operation)
	 * @see QualityMetamodel.QMM_OCL.QMM_OCLPackage#getOclType_Operation()
	 * @see QualityMetamodel.QMM_OCL.Operation#getReturnType
	 * @model opposite="returnType" transient="false" ordered="false"
	 * @generated
	 */
	Operation getOperation();

	/**
	 * Sets the value of the '{@link QualityMetamodel.QMM_OCL.OclType#getOperation <em>Operation</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation</em>' container reference.
	 * @see #getOperation()
	 * @generated
	 */
	void setOperation(Operation value);

	/**
	 * Returns the value of the '<em><b>Map Type2</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link QualityMetamodel.QMM_OCL.MapType#getValueType <em>Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Map Type2</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Map Type2</em>' container reference.
	 * @see #setMapType2(MapType)
	 * @see QualityMetamodel.QMM_OCL.QMM_OCLPackage#getOclType_MapType2()
	 * @see QualityMetamodel.QMM_OCL.MapType#getValueType
	 * @model opposite="valueType" transient="false" ordered="false"
	 * @generated
	 */
	MapType getMapType2();

	/**
	 * Sets the value of the '{@link QualityMetamodel.QMM_OCL.OclType#getMapType2 <em>Map Type2</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Map Type2</em>' container reference.
	 * @see #getMapType2()
	 * @generated
	 */
	void setMapType2(MapType value);

	/**
	 * Returns the value of the '<em><b>Attribute</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link QualityMetamodel.QMM_OCL.Attribute#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute</em>' container reference.
	 * @see #setAttribute(Attribute)
	 * @see QualityMetamodel.QMM_OCL.QMM_OCLPackage#getOclType_Attribute()
	 * @see QualityMetamodel.QMM_OCL.Attribute#getType
	 * @model opposite="type" transient="false" ordered="false"
	 * @generated
	 */
	Attribute getAttribute();

	/**
	 * Sets the value of the '{@link QualityMetamodel.QMM_OCL.OclType#getAttribute <em>Attribute</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute</em>' container reference.
	 * @see #getAttribute()
	 * @generated
	 */
	void setAttribute(Attribute value);

	/**
	 * Returns the value of the '<em><b>Map Type</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link QualityMetamodel.QMM_OCL.MapType#getKeyType <em>Key Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Map Type</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Map Type</em>' container reference.
	 * @see #setMapType(MapType)
	 * @see QualityMetamodel.QMM_OCL.QMM_OCLPackage#getOclType_MapType()
	 * @see QualityMetamodel.QMM_OCL.MapType#getKeyType
	 * @model opposite="keyType" transient="false" ordered="false"
	 * @generated
	 */
	MapType getMapType();

	/**
	 * Sets the value of the '{@link QualityMetamodel.QMM_OCL.OclType#getMapType <em>Map Type</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Map Type</em>' container reference.
	 * @see #getMapType()
	 * @generated
	 */
	void setMapType(MapType value);

	/**
	 * Returns the value of the '<em><b>Collection Types</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link QualityMetamodel.QMM_OCL.CollectionType#getElementType <em>Element Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Collection Types</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Collection Types</em>' container reference.
	 * @see #setCollectionTypes(CollectionType)
	 * @see QualityMetamodel.QMM_OCL.QMM_OCLPackage#getOclType_CollectionTypes()
	 * @see QualityMetamodel.QMM_OCL.CollectionType#getElementType
	 * @model opposite="elementType" transient="false" ordered="false"
	 * @generated
	 */
	CollectionType getCollectionTypes();

	/**
	 * Sets the value of the '{@link QualityMetamodel.QMM_OCL.OclType#getCollectionTypes <em>Collection Types</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Collection Types</em>' container reference.
	 * @see #getCollectionTypes()
	 * @generated
	 */
	void setCollectionTypes(CollectionType value);

	/**
	 * Returns the value of the '<em><b>Tuple Type Attribute</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link QualityMetamodel.QMM_OCL.TupleTypeAttribute#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tuple Type Attribute</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tuple Type Attribute</em>' container reference.
	 * @see #setTupleTypeAttribute(TupleTypeAttribute)
	 * @see QualityMetamodel.QMM_OCL.QMM_OCLPackage#getOclType_TupleTypeAttribute()
	 * @see QualityMetamodel.QMM_OCL.TupleTypeAttribute#getType
	 * @model opposite="type" transient="false" ordered="false"
	 * @generated
	 */
	TupleTypeAttribute getTupleTypeAttribute();

	/**
	 * Sets the value of the '{@link QualityMetamodel.QMM_OCL.OclType#getTupleTypeAttribute <em>Tuple Type Attribute</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tuple Type Attribute</em>' container reference.
	 * @see #getTupleTypeAttribute()
	 * @generated
	 */
	void setTupleTypeAttribute(TupleTypeAttribute value);

	/**
	 * Returns the value of the '<em><b>Variable Declaration</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link QualityMetamodel.QMM_OCL.VariableDeclaration#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variable Declaration</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable Declaration</em>' container reference.
	 * @see #setVariableDeclaration(VariableDeclaration)
	 * @see QualityMetamodel.QMM_OCL.QMM_OCLPackage#getOclType_VariableDeclaration()
	 * @see QualityMetamodel.QMM_OCL.VariableDeclaration#getType
	 * @model opposite="type" transient="false" ordered="false"
	 * @generated
	 */
	VariableDeclaration getVariableDeclaration();

	/**
	 * Sets the value of the '{@link QualityMetamodel.QMM_OCL.OclType#getVariableDeclaration <em>Variable Declaration</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable Declaration</em>' container reference.
	 * @see #getVariableDeclaration()
	 * @generated
	 */
	void setVariableDeclaration(VariableDeclaration value);

	/**
	 * Returns the value of the '<em><b>Lambda Return Type</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link QualityMetamodel.QMM_OCL.LambdaType#getReturnType <em>Return Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lambda Return Type</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lambda Return Type</em>' container reference.
	 * @see #setLambdaReturnType(LambdaType)
	 * @see QualityMetamodel.QMM_OCL.QMM_OCLPackage#getOclType_LambdaReturnType()
	 * @see QualityMetamodel.QMM_OCL.LambdaType#getReturnType
	 * @model opposite="returnType" transient="false"
	 * @generated
	 */
	LambdaType getLambdaReturnType();

	/**
	 * Sets the value of the '{@link QualityMetamodel.QMM_OCL.OclType#getLambdaReturnType <em>Lambda Return Type</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lambda Return Type</em>' container reference.
	 * @see #getLambdaReturnType()
	 * @generated
	 */
	void setLambdaReturnType(LambdaType value);

	/**
	 * Returns the value of the '<em><b>Lambda Arg Type</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link QualityMetamodel.QMM_OCL.LambdaType#getArgumentTypes <em>Argument Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lambda Arg Type</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lambda Arg Type</em>' container reference.
	 * @see #setLambdaArgType(LambdaType)
	 * @see QualityMetamodel.QMM_OCL.QMM_OCLPackage#getOclType_LambdaArgType()
	 * @see QualityMetamodel.QMM_OCL.LambdaType#getArgumentTypes
	 * @model opposite="argumentTypes" transient="false"
	 * @generated
	 */
	LambdaType getLambdaArgType();

	/**
	 * Sets the value of the '{@link QualityMetamodel.QMM_OCL.OclType#getLambdaArgType <em>Lambda Arg Type</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lambda Arg Type</em>' container reference.
	 * @see #getLambdaArgType()
	 * @generated
	 */
	void setLambdaArgType(LambdaType value);

	/**
	 * Returns the value of the '<em><b>Static Property Call</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link QualityMetamodel.QMM_OCL.StaticPropertyCallExp#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Static Property Call</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Static Property Call</em>' container reference.
	 * @see #setStaticPropertyCall(StaticPropertyCallExp)
	 * @see QualityMetamodel.QMM_OCL.QMM_OCLPackage#getOclType_StaticPropertyCall()
	 * @see QualityMetamodel.QMM_OCL.StaticPropertyCallExp#getSource
	 * @model opposite="source" transient="false"
	 * @generated
	 */
	StaticPropertyCallExp getStaticPropertyCall();

	/**
	 * Sets the value of the '{@link QualityMetamodel.QMM_OCL.OclType#getStaticPropertyCall <em>Static Property Call</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Static Property Call</em>' container reference.
	 * @see #getStaticPropertyCall()
	 * @generated
	 */
	void setStaticPropertyCall(StaticPropertyCallExp value);

} // OclType
