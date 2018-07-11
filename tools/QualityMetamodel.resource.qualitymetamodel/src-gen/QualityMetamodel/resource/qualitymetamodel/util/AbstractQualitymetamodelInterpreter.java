/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package QualityMetamodel.resource.qualitymetamodel.util;

/**
 * This class provides basic infrastructure to interpret models. To implement
 * concrete interpreters, subclass this abstract interpreter and override the
 * interprete_* methods. The interpretation can be customized by binding the two
 * type parameters (ResultType, ContextType). The former is returned by all
 * interprete_* methods, while the latter is passed from method to method while
 * traversing the model. The concrete traversal strategy can also be exchanged.
 * One can use a static traversal strategy by pushing all objects to interpret on
 * the interpretation stack (using addObjectToInterprete()) before calling
 * interprete(). Alternatively, the traversal strategy can be dynamic by pushing
 * objects on the interpretation stack during interpretation.
 */
public class AbstractQualitymetamodelInterpreter<ResultType, ContextType> {
	
	private java.util.Stack<org.eclipse.emf.ecore.EObject> interpretationStack = new java.util.Stack<org.eclipse.emf.ecore.EObject>();
	private java.util.List<QualityMetamodel.resource.qualitymetamodel.IQualitymetamodelInterpreterListener> listeners = new java.util.ArrayList<QualityMetamodel.resource.qualitymetamodel.IQualitymetamodelInterpreterListener>();
	private org.eclipse.emf.ecore.EObject nextObjectToInterprete;
	private Object currentContext;
	
	public ResultType interprete(ContextType context) {
		ResultType result = null;
		org.eclipse.emf.ecore.EObject next = null;
		currentContext = context;
		while (!interpretationStack.empty()) {
			try {
				next = interpretationStack.pop();
			} catch (java.util.EmptyStackException ese) {
				// this can happen when the interpreter was terminated between the call to empty()
				// and pop()
				break;
			}
			nextObjectToInterprete = next;
			notifyListeners(next);
			result = interprete(next, context);
			if (!continueInterpretation(context, result)) {
				break;
			}
		}
		currentContext = null;
		return result;
	}
	
	/**
	 * Override this method to stop the overall interpretation depending on the result
	 * of the interpretation of a single model elements.
	 */
	public boolean continueInterpretation(ContextType context, ResultType result) {
		return true;
	}
	
	public ResultType interprete(org.eclipse.emf.ecore.EObject object, ContextType context) {
		ResultType result = null;
		if (object instanceof QualityMetamodel.QualityModel) {
			result = interprete_QualityMetamodel_QualityModel((QualityMetamodel.QualityModel) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof QualityMetamodel.QualityAttribute) {
			result = interprete_QualityMetamodel_QualityAttribute((QualityMetamodel.QualityAttribute) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof QualityMetamodel.Value) {
			result = interprete_QualityMetamodel_Value((QualityMetamodel.Value) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof QualityMetamodel.ValueType) {
			result = interprete_QualityMetamodel_ValueType((QualityMetamodel.ValueType) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof QualityMetamodel.SingleValue) {
			result = interprete_QualityMetamodel_SingleValue((QualityMetamodel.SingleValue) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof QualityMetamodel.AggregatedValue) {
			result = interprete_QualityMetamodel_AggregatedValue((QualityMetamodel.AggregatedValue) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof QualityMetamodel.Operation) {
			result = interprete_QualityMetamodel_Operation((QualityMetamodel.Operation) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof QualityMetamodel.MetricProvider) {
			result = interprete_QualityMetamodel_MetricProvider((QualityMetamodel.MetricProvider) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof QualityMetamodel.TextValueType) {
			result = interprete_QualityMetamodel_TextValueType((QualityMetamodel.TextValueType) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof QualityMetamodel.RangeValueType) {
			result = interprete_QualityMetamodel_RangeValueType((QualityMetamodel.RangeValueType) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof QualityMetamodel.AggregatedValueMetric) {
			result = interprete_QualityMetamodel_AggregatedValueMetric((QualityMetamodel.AggregatedValueMetric) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof QualityMetamodel.EnumerationMetric) {
			result = interprete_QualityMetamodel_EnumerationMetric((QualityMetamodel.EnumerationMetric) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof QualityMetamodel.EnumerationItem) {
			result = interprete_QualityMetamodel_EnumerationItem((QualityMetamodel.EnumerationItem) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof QualityMetamodel.RealValueType) {
			result = interprete_QualityMetamodel_RealValueType((QualityMetamodel.RealValueType) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof QualityMetamodel.BooleanValueType) {
			result = interprete_QualityMetamodel_BooleanValueType((QualityMetamodel.BooleanValueType) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof QualityMetamodel.IntegerValueType) {
			result = interprete_QualityMetamodel_IntegerValueType((QualityMetamodel.IntegerValueType) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof QualityMetamodel.ListValue) {
			result = interprete_QualityMetamodel_ListValue((QualityMetamodel.ListValue) object, context);
		}
		if (result != null) {
			return result;
		}
		return result;
	}
	
	public ResultType interprete_QualityMetamodel_QualityModel(QualityMetamodel.QualityModel qualityModel, ContextType context) {
		return null;
	}
	
	public ResultType interprete_QualityMetamodel_QualityAttribute(QualityMetamodel.QualityAttribute qualityAttribute, ContextType context) {
		return null;
	}
	
	public ResultType interprete_QualityMetamodel_Value(QualityMetamodel.Value value, ContextType context) {
		return null;
	}
	
	public ResultType interprete_QualityMetamodel_ValueType(QualityMetamodel.ValueType valueType, ContextType context) {
		return null;
	}
	
	public ResultType interprete_QualityMetamodel_SingleValue(QualityMetamodel.SingleValue singleValue, ContextType context) {
		return null;
	}
	
	public ResultType interprete_QualityMetamodel_AggregatedValue(QualityMetamodel.AggregatedValue aggregatedValue, ContextType context) {
		return null;
	}
	
	public ResultType interprete_QualityMetamodel_Operation(QualityMetamodel.Operation operation, ContextType context) {
		return null;
	}
	
	public ResultType interprete_QualityMetamodel_MetricProvider(QualityMetamodel.MetricProvider metricProvider, ContextType context) {
		return null;
	}
	
	public ResultType interprete_QualityMetamodel_TextValueType(QualityMetamodel.TextValueType textValueType, ContextType context) {
		return null;
	}
	
	public ResultType interprete_QualityMetamodel_RangeValueType(QualityMetamodel.RangeValueType rangeValueType, ContextType context) {
		return null;
	}
	
	public ResultType interprete_QualityMetamodel_AggregatedValueMetric(QualityMetamodel.AggregatedValueMetric aggregatedValueMetric, ContextType context) {
		return null;
	}
	
	public ResultType interprete_QualityMetamodel_EnumerationMetric(QualityMetamodel.EnumerationMetric enumerationMetric, ContextType context) {
		return null;
	}
	
	public ResultType interprete_QualityMetamodel_EnumerationItem(QualityMetamodel.EnumerationItem enumerationItem, ContextType context) {
		return null;
	}
	
	public ResultType interprete_QualityMetamodel_RealValueType(QualityMetamodel.RealValueType realValueType, ContextType context) {
		return null;
	}
	
	public ResultType interprete_QualityMetamodel_BooleanValueType(QualityMetamodel.BooleanValueType booleanValueType, ContextType context) {
		return null;
	}
	
	public ResultType interprete_QualityMetamodel_IntegerValueType(QualityMetamodel.IntegerValueType integerValueType, ContextType context) {
		return null;
	}
	
	public ResultType interprete_QualityMetamodel_ListValue(QualityMetamodel.ListValue listValue, ContextType context) {
		return null;
	}
	
	private void notifyListeners(org.eclipse.emf.ecore.EObject element) {
		for (QualityMetamodel.resource.qualitymetamodel.IQualitymetamodelInterpreterListener listener : listeners) {
			listener.handleInterpreteObject(element);
		}
	}
	
	/**
	 * Adds the given object to the interpretation stack. Attention: Objects that are
	 * added first, are interpret last.
	 */
	public void addObjectToInterprete(org.eclipse.emf.ecore.EObject object) {
		interpretationStack.push(object);
	}
	
	/**
	 * Adds the given collection of objects to the interpretation stack. Attention:
	 * Collections that are added first, are interpret last.
	 */
	public void addObjectsToInterprete(java.util.Collection<? extends org.eclipse.emf.ecore.EObject> objects) {
		for (org.eclipse.emf.ecore.EObject object : objects) {
			addObjectToInterprete(object);
		}
	}
	
	/**
	 * Adds the given collection of objects in reverse order to the interpretation
	 * stack.
	 */
	public void addObjectsToInterpreteInReverseOrder(java.util.Collection<? extends org.eclipse.emf.ecore.EObject> objects) {
		java.util.List<org.eclipse.emf.ecore.EObject> reverse = new java.util.ArrayList<org.eclipse.emf.ecore.EObject>(objects.size());
		reverse.addAll(objects);
		java.util.Collections.reverse(reverse);
		addObjectsToInterprete(reverse);
	}
	
	/**
	 * Adds the given object and all its children to the interpretation stack such
	 * that they are interpret in top down order.
	 */
	public void addObjectTreeToInterpreteTopDown(org.eclipse.emf.ecore.EObject root) {
		java.util.List<org.eclipse.emf.ecore.EObject> objects = new java.util.ArrayList<org.eclipse.emf.ecore.EObject>();
		objects.add(root);
		java.util.Iterator<org.eclipse.emf.ecore.EObject> it = root.eAllContents();
		while (it.hasNext()) {
			org.eclipse.emf.ecore.EObject eObject = (org.eclipse.emf.ecore.EObject) it.next();
			objects.add(eObject);
		}
		addObjectsToInterpreteInReverseOrder(objects);
	}
	
	public void addListener(QualityMetamodel.resource.qualitymetamodel.IQualitymetamodelInterpreterListener newListener) {
		listeners.add(newListener);
	}
	
	public boolean removeListener(QualityMetamodel.resource.qualitymetamodel.IQualitymetamodelInterpreterListener listener) {
		return listeners.remove(listener);
	}
	
	public org.eclipse.emf.ecore.EObject getNextObjectToInterprete() {
		return nextObjectToInterprete;
	}
	
	public java.util.Stack<org.eclipse.emf.ecore.EObject> getInterpretationStack() {
		return interpretationStack;
	}
	
	public void terminate() {
		interpretationStack.clear();
	}
	
	public Object getCurrentContext() {
		return currentContext;
	}
	
}
