/**
 */
package QualityMetamodel.util;

import QualityMetamodel.*;

import QualityMetamodel.QMM_OCL.LocatedElement;
import QualityMetamodel.QMM_OCL.Module;
import QualityMetamodel.QMM_OCL.NamedElement;
import QualityMetamodel.QMM_OCL.VariableDeclaration;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see QualityMetamodel.QualityMetamodelPackage
 * @generated
 */
public class QualityMetamodelAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static QualityMetamodelPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QualityMetamodelAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = QualityMetamodelPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QualityMetamodelSwitch<Adapter> modelSwitch =
		new QualityMetamodelSwitch<Adapter>() {
			@Override
			public Adapter caseQualityModel(QualityModel object) {
				return createQualityModelAdapter();
			}
			@Override
			public Adapter caseQualityAttribute(QualityAttribute object) {
				return createQualityAttributeAdapter();
			}
			@Override
			public Adapter caseValue(Value object) {
				return createValueAdapter();
			}
			@Override
			public Adapter caseValueType(ValueType object) {
				return createValueTypeAdapter();
			}
			@Override
			public Adapter caseSingleValue(SingleValue object) {
				return createSingleValueAdapter();
			}
			@Override
			public Adapter caseAggregatedValue(AggregatedValue object) {
				return createAggregatedValueAdapter();
			}
			@Override
			public Adapter caseOperation(Operation object) {
				return createOperationAdapter();
			}
			@Override
			public Adapter caseMetricProvider(MetricProvider object) {
				return createMetricProviderAdapter();
			}
			@Override
			public Adapter caseTextValueType(TextValueType object) {
				return createTextValueTypeAdapter();
			}
			@Override
			public Adapter caseRangeValueType(RangeValueType object) {
				return createRangeValueTypeAdapter();
			}
			@Override
			public Adapter caseAggregatedValueMetric(AggregatedValueMetric object) {
				return createAggregatedValueMetricAdapter();
			}
			@Override
			public Adapter caseEnumerationMetric(EnumerationMetric object) {
				return createEnumerationMetricAdapter();
			}
			@Override
			public Adapter caseEnumerationItem(EnumerationItem object) {
				return createEnumerationItemAdapter();
			}
			@Override
			public Adapter caseRealValueType(RealValueType object) {
				return createRealValueTypeAdapter();
			}
			@Override
			public Adapter caseBooleanValueType(BooleanValueType object) {
				return createBooleanValueTypeAdapter();
			}
			@Override
			public Adapter caseIntegerValueType(IntegerValueType object) {
				return createIntegerValueTypeAdapter();
			}
			@Override
			public Adapter caseListValue(ListValue object) {
				return createListValueAdapter();
			}
			@Override
			public Adapter caseLocatedElement(LocatedElement object) {
				return createLocatedElementAdapter();
			}
			@Override
			public Adapter caseNamedElement(NamedElement object) {
				return createNamedElementAdapter();
			}
			@Override
			public Adapter caseModule(Module object) {
				return createModuleAdapter();
			}
			@Override
			public Adapter caseVariableDeclaration(VariableDeclaration object) {
				return createVariableDeclarationAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link QualityMetamodel.QualityModel <em>Quality Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see QualityMetamodel.QualityModel
	 * @generated
	 */
	public Adapter createQualityModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link QualityMetamodel.QualityAttribute <em>Quality Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see QualityMetamodel.QualityAttribute
	 * @generated
	 */
	public Adapter createQualityAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link QualityMetamodel.Value <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see QualityMetamodel.Value
	 * @generated
	 */
	public Adapter createValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link QualityMetamodel.ValueType <em>Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see QualityMetamodel.ValueType
	 * @generated
	 */
	public Adapter createValueTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link QualityMetamodel.SingleValue <em>Single Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see QualityMetamodel.SingleValue
	 * @generated
	 */
	public Adapter createSingleValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link QualityMetamodel.AggregatedValue <em>Aggregated Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see QualityMetamodel.AggregatedValue
	 * @generated
	 */
	public Adapter createAggregatedValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link QualityMetamodel.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see QualityMetamodel.Operation
	 * @generated
	 */
	public Adapter createOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link QualityMetamodel.MetricProvider <em>Metric Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see QualityMetamodel.MetricProvider
	 * @generated
	 */
	public Adapter createMetricProviderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link QualityMetamodel.TextValueType <em>Text Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see QualityMetamodel.TextValueType
	 * @generated
	 */
	public Adapter createTextValueTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link QualityMetamodel.RangeValueType <em>Range Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see QualityMetamodel.RangeValueType
	 * @generated
	 */
	public Adapter createRangeValueTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link QualityMetamodel.AggregatedValueMetric <em>Aggregated Value Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see QualityMetamodel.AggregatedValueMetric
	 * @generated
	 */
	public Adapter createAggregatedValueMetricAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link QualityMetamodel.EnumerationMetric <em>Enumeration Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see QualityMetamodel.EnumerationMetric
	 * @generated
	 */
	public Adapter createEnumerationMetricAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link QualityMetamodel.EnumerationItem <em>Enumeration Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see QualityMetamodel.EnumerationItem
	 * @generated
	 */
	public Adapter createEnumerationItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link QualityMetamodel.RealValueType <em>Real Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see QualityMetamodel.RealValueType
	 * @generated
	 */
	public Adapter createRealValueTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link QualityMetamodel.BooleanValueType <em>Boolean Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see QualityMetamodel.BooleanValueType
	 * @generated
	 */
	public Adapter createBooleanValueTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link QualityMetamodel.IntegerValueType <em>Integer Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see QualityMetamodel.IntegerValueType
	 * @generated
	 */
	public Adapter createIntegerValueTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link QualityMetamodel.ListValue <em>List Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see QualityMetamodel.ListValue
	 * @generated
	 */
	public Adapter createListValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link QualityMetamodel.QMM_OCL.LocatedElement <em>Located Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see QualityMetamodel.QMM_OCL.LocatedElement
	 * @generated
	 */
	public Adapter createLocatedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link QualityMetamodel.QMM_OCL.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see QualityMetamodel.QMM_OCL.NamedElement
	 * @generated
	 */
	public Adapter createNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link QualityMetamodel.QMM_OCL.Module <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see QualityMetamodel.QMM_OCL.Module
	 * @generated
	 */
	public Adapter createModuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link QualityMetamodel.QMM_OCL.VariableDeclaration <em>Variable Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see QualityMetamodel.QMM_OCL.VariableDeclaration
	 * @generated
	 */
	public Adapter createVariableDeclarationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //QualityMetamodelAdapterFactory
