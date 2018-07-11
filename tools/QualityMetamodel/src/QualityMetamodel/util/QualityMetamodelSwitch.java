/**
 */
package QualityMetamodel.util;

import QualityMetamodel.*;

import QualityMetamodel.QMM_OCL.LocatedElement;
import QualityMetamodel.QMM_OCL.Module;
import QualityMetamodel.QMM_OCL.NamedElement;
import QualityMetamodel.QMM_OCL.VariableDeclaration;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see QualityMetamodel.QualityMetamodelPackage
 * @generated
 */
public class QualityMetamodelSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static QualityMetamodelPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QualityMetamodelSwitch() {
		if (modelPackage == null) {
			modelPackage = QualityMetamodelPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case QualityMetamodelPackage.QUALITY_MODEL: {
				QualityModel qualityModel = (QualityModel)theEObject;
				T result = caseQualityModel(qualityModel);
				if (result == null) result = caseModule(qualityModel);
				if (result == null) result = caseNamedElement(qualityModel);
				if (result == null) result = caseLocatedElement(qualityModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QualityMetamodelPackage.QUALITY_ATTRIBUTE: {
				QualityAttribute qualityAttribute = (QualityAttribute)theEObject;
				T result = caseQualityAttribute(qualityAttribute);
				if (result == null) result = caseVariableDeclaration(qualityAttribute);
				if (result == null) result = caseLocatedElement(qualityAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QualityMetamodelPackage.VALUE: {
				Value value = (Value)theEObject;
				T result = caseValue(value);
				if (result == null) result = caseVariableDeclaration(value);
				if (result == null) result = caseLocatedElement(value);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QualityMetamodelPackage.VALUE_TYPE: {
				ValueType valueType = (ValueType)theEObject;
				T result = caseValueType(valueType);
				if (result == null) result = caseVariableDeclaration(valueType);
				if (result == null) result = caseLocatedElement(valueType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QualityMetamodelPackage.SINGLE_VALUE: {
				SingleValue singleValue = (SingleValue)theEObject;
				T result = caseSingleValue(singleValue);
				if (result == null) result = caseValue(singleValue);
				if (result == null) result = caseVariableDeclaration(singleValue);
				if (result == null) result = caseLocatedElement(singleValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QualityMetamodelPackage.AGGREGATED_VALUE: {
				AggregatedValue aggregatedValue = (AggregatedValue)theEObject;
				T result = caseAggregatedValue(aggregatedValue);
				if (result == null) result = caseValue(aggregatedValue);
				if (result == null) result = caseVariableDeclaration(aggregatedValue);
				if (result == null) result = caseLocatedElement(aggregatedValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QualityMetamodelPackage.OPERATION: {
				Operation operation = (Operation)theEObject;
				T result = caseOperation(operation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QualityMetamodelPackage.METRIC_PROVIDER: {
				MetricProvider metricProvider = (MetricProvider)theEObject;
				T result = caseMetricProvider(metricProvider);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QualityMetamodelPackage.TEXT_VALUE_TYPE: {
				TextValueType textValueType = (TextValueType)theEObject;
				T result = caseTextValueType(textValueType);
				if (result == null) result = caseValueType(textValueType);
				if (result == null) result = caseVariableDeclaration(textValueType);
				if (result == null) result = caseLocatedElement(textValueType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QualityMetamodelPackage.RANGE_VALUE_TYPE: {
				RangeValueType rangeValueType = (RangeValueType)theEObject;
				T result = caseRangeValueType(rangeValueType);
				if (result == null) result = caseValueType(rangeValueType);
				if (result == null) result = caseVariableDeclaration(rangeValueType);
				if (result == null) result = caseLocatedElement(rangeValueType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QualityMetamodelPackage.AGGREGATED_VALUE_METRIC: {
				AggregatedValueMetric aggregatedValueMetric = (AggregatedValueMetric)theEObject;
				T result = caseAggregatedValueMetric(aggregatedValueMetric);
				if (result == null) result = caseValueType(aggregatedValueMetric);
				if (result == null) result = caseVariableDeclaration(aggregatedValueMetric);
				if (result == null) result = caseLocatedElement(aggregatedValueMetric);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QualityMetamodelPackage.ENUMERATION_METRIC: {
				EnumerationMetric enumerationMetric = (EnumerationMetric)theEObject;
				T result = caseEnumerationMetric(enumerationMetric);
				if (result == null) result = caseValueType(enumerationMetric);
				if (result == null) result = caseVariableDeclaration(enumerationMetric);
				if (result == null) result = caseLocatedElement(enumerationMetric);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QualityMetamodelPackage.ENUMERATION_ITEM: {
				EnumerationItem enumerationItem = (EnumerationItem)theEObject;
				T result = caseEnumerationItem(enumerationItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QualityMetamodelPackage.REAL_VALUE_TYPE: {
				RealValueType realValueType = (RealValueType)theEObject;
				T result = caseRealValueType(realValueType);
				if (result == null) result = caseValueType(realValueType);
				if (result == null) result = caseVariableDeclaration(realValueType);
				if (result == null) result = caseLocatedElement(realValueType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QualityMetamodelPackage.BOOLEAN_VALUE_TYPE: {
				BooleanValueType booleanValueType = (BooleanValueType)theEObject;
				T result = caseBooleanValueType(booleanValueType);
				if (result == null) result = caseValueType(booleanValueType);
				if (result == null) result = caseVariableDeclaration(booleanValueType);
				if (result == null) result = caseLocatedElement(booleanValueType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QualityMetamodelPackage.INTEGER_VALUE_TYPE: {
				IntegerValueType integerValueType = (IntegerValueType)theEObject;
				T result = caseIntegerValueType(integerValueType);
				if (result == null) result = caseValueType(integerValueType);
				if (result == null) result = caseVariableDeclaration(integerValueType);
				if (result == null) result = caseLocatedElement(integerValueType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QualityMetamodelPackage.LIST_VALUE: {
				ListValue listValue = (ListValue)theEObject;
				T result = caseListValue(listValue);
				if (result == null) result = caseValueType(listValue);
				if (result == null) result = caseVariableDeclaration(listValue);
				if (result == null) result = caseLocatedElement(listValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Quality Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Quality Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQualityModel(QualityModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Quality Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Quality Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQualityAttribute(QualityAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValue(Value object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValueType(ValueType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Single Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Single Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSingleValue(SingleValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Aggregated Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Aggregated Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAggregatedValue(AggregatedValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperation(Operation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Metric Provider</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Metric Provider</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMetricProvider(MetricProvider object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Text Value Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Text Value Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTextValueType(TextValueType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Range Value Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Range Value Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRangeValueType(RangeValueType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Aggregated Value Metric</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Aggregated Value Metric</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAggregatedValueMetric(AggregatedValueMetric object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enumeration Metric</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enumeration Metric</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnumerationMetric(EnumerationMetric object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enumeration Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enumeration Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnumerationItem(EnumerationItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Real Value Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Real Value Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRealValueType(RealValueType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Value Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Value Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBooleanValueType(BooleanValueType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer Value Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer Value Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntegerValueType(IntegerValueType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListValue(ListValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Located Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Located Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLocatedElement(LocatedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElement(NamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Module</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Module</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModule(Module object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariableDeclaration(VariableDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //QualityMetamodelSwitch
