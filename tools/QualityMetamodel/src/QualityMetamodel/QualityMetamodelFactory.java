/**
 */
package QualityMetamodel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see QualityMetamodel.QualityMetamodelPackage
 * @generated
 */
public interface QualityMetamodelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	QualityMetamodelFactory eINSTANCE = QualityMetamodel.impl.QualityMetamodelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Quality Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Quality Model</em>'.
	 * @generated
	 */
	QualityModel createQualityModel();

	/**
	 * Returns a new object of class '<em>Quality Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Quality Attribute</em>'.
	 * @generated
	 */
	QualityAttribute createQualityAttribute();

	/**
	 * Returns a new object of class '<em>Single Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Single Value</em>'.
	 * @generated
	 */
	SingleValue createSingleValue();

	/**
	 * Returns a new object of class '<em>Aggregated Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Aggregated Value</em>'.
	 * @generated
	 */
	AggregatedValue createAggregatedValue();

	/**
	 * Returns a new object of class '<em>Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Operation</em>'.
	 * @generated
	 */
	Operation createOperation();

	/**
	 * Returns a new object of class '<em>Metric Provider</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Metric Provider</em>'.
	 * @generated
	 */
	MetricProvider createMetricProvider();

	/**
	 * Returns a new object of class '<em>Text Value Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Text Value Type</em>'.
	 * @generated
	 */
	TextValueType createTextValueType();

	/**
	 * Returns a new object of class '<em>Range Value Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Range Value Type</em>'.
	 * @generated
	 */
	RangeValueType createRangeValueType();

	/**
	 * Returns a new object of class '<em>Aggregated Value Metric</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Aggregated Value Metric</em>'.
	 * @generated
	 */
	AggregatedValueMetric createAggregatedValueMetric();

	/**
	 * Returns a new object of class '<em>Enumeration Metric</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Enumeration Metric</em>'.
	 * @generated
	 */
	EnumerationMetric createEnumerationMetric();

	/**
	 * Returns a new object of class '<em>Enumeration Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Enumeration Item</em>'.
	 * @generated
	 */
	EnumerationItem createEnumerationItem();

	/**
	 * Returns a new object of class '<em>Real Value Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Real Value Type</em>'.
	 * @generated
	 */
	RealValueType createRealValueType();

	/**
	 * Returns a new object of class '<em>Boolean Value Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Boolean Value Type</em>'.
	 * @generated
	 */
	BooleanValueType createBooleanValueType();

	/**
	 * Returns a new object of class '<em>Integer Value Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Integer Value Type</em>'.
	 * @generated
	 */
	IntegerValueType createIntegerValueType();

	/**
	 * Returns a new object of class '<em>List Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>List Value</em>'.
	 * @generated
	 */
	ListValue createListValue();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	QualityMetamodelPackage getQualityMetamodelPackage();

} //QualityMetamodelFactory
