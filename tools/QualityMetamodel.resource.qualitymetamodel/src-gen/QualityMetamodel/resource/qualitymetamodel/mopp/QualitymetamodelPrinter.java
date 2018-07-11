/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package QualityMetamodel.resource.qualitymetamodel.mopp;

public class QualitymetamodelPrinter implements QualityMetamodel.resource.qualitymetamodel.IQualitymetamodelTextPrinter {
	
	protected QualityMetamodel.resource.qualitymetamodel.IQualitymetamodelTokenResolverFactory tokenResolverFactory = new QualityMetamodel.resource.qualitymetamodel.mopp.QualitymetamodelTokenResolverFactory();
	
	protected java.io.OutputStream outputStream;
	
	/**
	 * Holds the resource that is associated with this printer. This may be null if
	 * the printer is used stand alone.
	 */
	private QualityMetamodel.resource.qualitymetamodel.IQualitymetamodelTextResource resource;
	
	private java.util.Map<?, ?> options;
	private String encoding = System.getProperty("file.encoding");
	
	public QualitymetamodelPrinter(java.io.OutputStream outputStream, QualityMetamodel.resource.qualitymetamodel.IQualitymetamodelTextResource resource) {
		super();
		this.outputStream = outputStream;
		this.resource = resource;
	}
	
	protected int matchCount(java.util.Map<String, Integer> featureCounter, java.util.Collection<String> needed) {
		int pos = 0;
		int neg = 0;
		
		for (String featureName : featureCounter.keySet()) {
			if (needed.contains(featureName)) {
				int value = featureCounter.get(featureName);
				if (value == 0) {
					neg += 1;
				} else {
					pos += 1;
				}
			}
		}
		return neg > 0 ? -neg : pos;
	}
	
	protected void doPrint(org.eclipse.emf.ecore.EObject element, java.io.PrintWriter out, String globaltab) {
		if (element == null) {
			throw new java.lang.IllegalArgumentException("Nothing to write.");
		}
		if (out == null) {
			throw new java.lang.IllegalArgumentException("Nothing to write on.");
		}
		
		if (element instanceof QualityMetamodel.QualityModel) {
			print_QualityMetamodel_QualityModel((QualityMetamodel.QualityModel) element, globaltab, out);
			return;
		}
		if (element instanceof QualityMetamodel.QualityAttribute) {
			print_QualityMetamodel_QualityAttribute((QualityMetamodel.QualityAttribute) element, globaltab, out);
			return;
		}
		if (element instanceof QualityMetamodel.MetricProvider) {
			print_QualityMetamodel_MetricProvider((QualityMetamodel.MetricProvider) element, globaltab, out);
			return;
		}
		if (element instanceof QualityMetamodel.SingleValue) {
			print_QualityMetamodel_SingleValue((QualityMetamodel.SingleValue) element, globaltab, out);
			return;
		}
		if (element instanceof QualityMetamodel.AggregatedValue) {
			print_QualityMetamodel_AggregatedValue((QualityMetamodel.AggregatedValue) element, globaltab, out);
			return;
		}
		if (element instanceof QualityMetamodel.Operation) {
			print_QualityMetamodel_Operation((QualityMetamodel.Operation) element, globaltab, out);
			return;
		}
		if (element instanceof QualityMetamodel.TextValueType) {
			print_QualityMetamodel_TextValueType((QualityMetamodel.TextValueType) element, globaltab, out);
			return;
		}
		if (element instanceof QualityMetamodel.AggregatedValueMetric) {
			print_QualityMetamodel_AggregatedValueMetric((QualityMetamodel.AggregatedValueMetric) element, globaltab, out);
			return;
		}
		if (element instanceof QualityMetamodel.EnumerationMetric) {
			print_QualityMetamodel_EnumerationMetric((QualityMetamodel.EnumerationMetric) element, globaltab, out);
			return;
		}
		if (element instanceof QualityMetamodel.EnumerationItem) {
			print_QualityMetamodel_EnumerationItem((QualityMetamodel.EnumerationItem) element, globaltab, out);
			return;
		}
		if (element instanceof QualityMetamodel.RealValueType) {
			print_QualityMetamodel_RealValueType((QualityMetamodel.RealValueType) element, globaltab, out);
			return;
		}
		if (element instanceof QualityMetamodel.BooleanValueType) {
			print_QualityMetamodel_BooleanValueType((QualityMetamodel.BooleanValueType) element, globaltab, out);
			return;
		}
		if (element instanceof QualityMetamodel.IntegerValueType) {
			print_QualityMetamodel_IntegerValueType((QualityMetamodel.IntegerValueType) element, globaltab, out);
			return;
		}
		if (element instanceof QualityMetamodel.QMM_OCL.Module) {
			print_QualityMetamodel_QMM_005fOCL_Module((QualityMetamodel.QMM_OCL.Module) element, globaltab, out);
			return;
		}
		if (element instanceof QualityMetamodel.QMM_OCL.Import) {
			print_QualityMetamodel_QMM_005fOCL_Import((QualityMetamodel.QMM_OCL.Import) element, globaltab, out);
			return;
		}
		if (element instanceof QualityMetamodel.QMM_OCL.OclFeatureDefinition) {
			print_QualityMetamodel_QMM_005fOCL_OclFeatureDefinition((QualityMetamodel.QMM_OCL.OclFeatureDefinition) element, globaltab, out);
			return;
		}
		if (element instanceof QualityMetamodel.QMM_OCL.OclContextDefinition) {
			print_QualityMetamodel_QMM_005fOCL_OclContextDefinition((QualityMetamodel.QMM_OCL.OclContextDefinition) element, globaltab, out);
			return;
		}
		if (element instanceof QualityMetamodel.QMM_OCL.OclMetamodel) {
			print_QualityMetamodel_QMM_005fOCL_OclMetamodel((QualityMetamodel.QMM_OCL.OclMetamodel) element, globaltab, out);
			return;
		}
		if (element instanceof QualityMetamodel.QMM_OCL.OclInstanceModel) {
			print_QualityMetamodel_QMM_005fOCL_OclInstanceModel((QualityMetamodel.QMM_OCL.OclInstanceModel) element, globaltab, out);
			return;
		}
		if (element instanceof QualityMetamodel.QMM_OCL.Attribute) {
			print_QualityMetamodel_QMM_005fOCL_Attribute((QualityMetamodel.QMM_OCL.Attribute) element, globaltab, out);
			return;
		}
		if (element instanceof QualityMetamodel.QMM_OCL.Operation) {
			print_QualityMetamodel_QMM_005fOCL_Operation((QualityMetamodel.QMM_OCL.Operation) element, globaltab, out);
			return;
		}
		if (element instanceof QualityMetamodel.QMM_OCL.Parameter) {
			print_QualityMetamodel_QMM_005fOCL_Parameter((QualityMetamodel.QMM_OCL.Parameter) element, globaltab, out);
			return;
		}
		if (element instanceof QualityMetamodel.QMM_OCL.OclModelElementExp) {
			print_QualityMetamodel_QMM_005fOCL_OclModelElementExp((QualityMetamodel.QMM_OCL.OclModelElementExp) element, globaltab, out);
			return;
		}
		if (element instanceof QualityMetamodel.QMM_OCL.LambdaCallExp) {
			print_QualityMetamodel_QMM_005fOCL_LambdaCallExp((QualityMetamodel.QMM_OCL.LambdaCallExp) element, globaltab, out);
			return;
		}
		if (element instanceof QualityMetamodel.QMM_OCL.VariableExp) {
			print_QualityMetamodel_QMM_005fOCL_VariableExp((QualityMetamodel.QMM_OCL.VariableExp) element, globaltab, out);
			return;
		}
		if (element instanceof QualityMetamodel.QMM_OCL.SuperExp) {
			print_QualityMetamodel_QMM_005fOCL_SuperExp((QualityMetamodel.QMM_OCL.SuperExp) element, globaltab, out);
			return;
		}
		if (element instanceof QualityMetamodel.QMM_OCL.SelfExp) {
			print_QualityMetamodel_QMM_005fOCL_SelfExp((QualityMetamodel.QMM_OCL.SelfExp) element, globaltab, out);
			return;
		}
		if (element instanceof QualityMetamodel.QMM_OCL.EnvExp) {
			print_QualityMetamodel_QMM_005fOCL_EnvExp((QualityMetamodel.QMM_OCL.EnvExp) element, globaltab, out);
			return;
		}
		if (element instanceof QualityMetamodel.QMM_OCL.StringExp) {
			print_QualityMetamodel_QMM_005fOCL_StringExp((QualityMetamodel.QMM_OCL.StringExp) element, globaltab, out);
			return;
		}
		if (element instanceof QualityMetamodel.QMM_OCL.BooleanExp) {
			print_QualityMetamodel_QMM_005fOCL_BooleanExp((QualityMetamodel.QMM_OCL.BooleanExp) element, globaltab, out);
			return;
		}
		if (element instanceof QualityMetamodel.QMM_OCL.RealExp) {
			print_QualityMetamodel_QMM_005fOCL_RealExp((QualityMetamodel.QMM_OCL.RealExp) element, globaltab, out);
			return;
		}
		if (element instanceof QualityMetamodel.QMM_OCL.IntegerExp) {
			print_QualityMetamodel_QMM_005fOCL_IntegerExp((QualityMetamodel.QMM_OCL.IntegerExp) element, globaltab, out);
			return;
		}
		if (element instanceof QualityMetamodel.QMM_OCL.CollectionRange) {
			print_QualityMetamodel_QMM_005fOCL_CollectionRange((QualityMetamodel.QMM_OCL.CollectionRange) element, globaltab, out);
			return;
		}
		if (element instanceof QualityMetamodel.QMM_OCL.CollectionItem) {
			print_QualityMetamodel_QMM_005fOCL_CollectionItem((QualityMetamodel.QMM_OCL.CollectionItem) element, globaltab, out);
			return;
		}
		if (element instanceof QualityMetamodel.QMM_OCL.BagExp) {
			print_QualityMetamodel_QMM_005fOCL_BagExp((QualityMetamodel.QMM_OCL.BagExp) element, globaltab, out);
			return;
		}
		if (element instanceof QualityMetamodel.QMM_OCL.OrderedSetExp) {
			print_QualityMetamodel_QMM_005fOCL_OrderedSetExp((QualityMetamodel.QMM_OCL.OrderedSetExp) element, globaltab, out);
			return;
		}
		if (element instanceof QualityMetamodel.QMM_OCL.SequenceExp) {
			print_QualityMetamodel_QMM_005fOCL_SequenceExp((QualityMetamodel.QMM_OCL.SequenceExp) element, globaltab, out);
			return;
		}
		if (element instanceof QualityMetamodel.QMM_OCL.SetExp) {
			print_QualityMetamodel_QMM_005fOCL_SetExp((QualityMetamodel.QMM_OCL.SetExp) element, globaltab, out);
			return;
		}
		if (element instanceof QualityMetamodel.QMM_OCL.TupleExp) {
			print_QualityMetamodel_QMM_005fOCL_TupleExp((QualityMetamodel.QMM_OCL.TupleExp) element, globaltab, out);
			return;
		}
		if (element instanceof QualityMetamodel.QMM_OCL.TuplePart) {
			print_QualityMetamodel_QMM_005fOCL_TuplePart((QualityMetamodel.QMM_OCL.TuplePart) element, globaltab, out);
			return;
		}
		if (element instanceof QualityMetamodel.QMM_OCL.MapExp) {
			print_QualityMetamodel_QMM_005fOCL_MapExp((QualityMetamodel.QMM_OCL.MapExp) element, globaltab, out);
			return;
		}
		if (element instanceof QualityMetamodel.QMM_OCL.MapElement) {
			print_QualityMetamodel_QMM_005fOCL_MapElement((QualityMetamodel.QMM_OCL.MapElement) element, globaltab, out);
			return;
		}
		if (element instanceof QualityMetamodel.QMM_OCL.EnumLiteralExp) {
			print_QualityMetamodel_QMM_005fOCL_EnumLiteralExp((QualityMetamodel.QMM_OCL.EnumLiteralExp) element, globaltab, out);
			return;
		}
		if (element instanceof QualityMetamodel.QMM_OCL.OclUndefinedExp) {
			print_QualityMetamodel_QMM_005fOCL_OclUndefinedExp((QualityMetamodel.QMM_OCL.OclUndefinedExp) element, globaltab, out);
			return;
		}
		if (element instanceof QualityMetamodel.QMM_OCL.LetExp) {
			print_QualityMetamodel_QMM_005fOCL_LetExp((QualityMetamodel.QMM_OCL.LetExp) element, globaltab, out);
			return;
		}
		if (element instanceof QualityMetamodel.QMM_OCL.IfExp) {
			print_QualityMetamodel_QMM_005fOCL_IfExp((QualityMetamodel.QMM_OCL.IfExp) element, globaltab, out);
			return;
		}
		if (element instanceof QualityMetamodel.QMM_OCL.BraceExp) {
			print_QualityMetamodel_QMM_005fOCL_BraceExp((QualityMetamodel.QMM_OCL.BraceExp) element, globaltab, out);
			return;
		}
		if (element instanceof QualityMetamodel.QMM_OCL.EqOpCallExp) {
			print_QualityMetamodel_QMM_005fOCL_EqOpCallExp((QualityMetamodel.QMM_OCL.EqOpCallExp) element, globaltab, out);
			return;
		}
		if (element instanceof QualityMetamodel.QMM_OCL.RelOpCallExp) {
			print_QualityMetamodel_QMM_005fOCL_RelOpCallExp((QualityMetamodel.QMM_OCL.RelOpCallExp) element, globaltab, out);
			return;
		}
		if (element instanceof QualityMetamodel.QMM_OCL.AddOpCallExp) {
			print_QualityMetamodel_QMM_005fOCL_AddOpCallExp((QualityMetamodel.QMM_OCL.AddOpCallExp) element, globaltab, out);
			return;
		}
		if (element instanceof QualityMetamodel.QMM_OCL.IntOpCallExp) {
			print_QualityMetamodel_QMM_005fOCL_IntOpCallExp((QualityMetamodel.QMM_OCL.IntOpCallExp) element, globaltab, out);
			return;
		}
		if (element instanceof QualityMetamodel.QMM_OCL.MulOpCallExp) {
			print_QualityMetamodel_QMM_005fOCL_MulOpCallExp((QualityMetamodel.QMM_OCL.MulOpCallExp) element, globaltab, out);
			return;
		}
		if (element instanceof QualityMetamodel.QMM_OCL.NotOpCallExp) {
			print_QualityMetamodel_QMM_005fOCL_NotOpCallExp((QualityMetamodel.QMM_OCL.NotOpCallExp) element, globaltab, out);
			return;
		}
		if (element instanceof QualityMetamodel.QMM_OCL.StaticPropertyCallExp) {
			print_QualityMetamodel_QMM_005fOCL_StaticPropertyCallExp((QualityMetamodel.QMM_OCL.StaticPropertyCallExp) element, globaltab, out);
			return;
		}
		if (element instanceof QualityMetamodel.QMM_OCL.StaticOperationCall) {
			print_QualityMetamodel_QMM_005fOCL_StaticOperationCall((QualityMetamodel.QMM_OCL.StaticOperationCall) element, globaltab, out);
			return;
		}
		if (element instanceof QualityMetamodel.QMM_OCL.StaticNavigationOrAttributeCall) {
			print_QualityMetamodel_QMM_005fOCL_StaticNavigationOrAttributeCall((QualityMetamodel.QMM_OCL.StaticNavigationOrAttributeCall) element, globaltab, out);
			return;
		}
		if (element instanceof QualityMetamodel.QMM_OCL.PropertyCallExp) {
			print_QualityMetamodel_QMM_005fOCL_PropertyCallExp((QualityMetamodel.QMM_OCL.PropertyCallExp) element, globaltab, out);
			return;
		}
		if (element instanceof QualityMetamodel.QMM_OCL.NavigationOrAttributeCall) {
			print_QualityMetamodel_QMM_005fOCL_NavigationOrAttributeCall((QualityMetamodel.QMM_OCL.NavigationOrAttributeCall) element, globaltab, out);
			return;
		}
		if (element instanceof QualityMetamodel.QMM_OCL.IterateExp) {
			print_QualityMetamodel_QMM_005fOCL_IterateExp((QualityMetamodel.QMM_OCL.IterateExp) element, globaltab, out);
			return;
		}
		if (element instanceof QualityMetamodel.QMM_OCL.IteratorExp) {
			print_QualityMetamodel_QMM_005fOCL_IteratorExp((QualityMetamodel.QMM_OCL.IteratorExp) element, globaltab, out);
			return;
		}
		if (element instanceof QualityMetamodel.QMM_OCL.Iterator) {
			print_QualityMetamodel_QMM_005fOCL_Iterator((QualityMetamodel.QMM_OCL.Iterator) element, globaltab, out);
			return;
		}
		if (element instanceof QualityMetamodel.QMM_OCL.CollectionOperationCall) {
			print_QualityMetamodel_QMM_005fOCL_CollectionOperationCall((QualityMetamodel.QMM_OCL.CollectionOperationCall) element, globaltab, out);
			return;
		}
		if (element instanceof QualityMetamodel.QMM_OCL.StringType) {
			print_QualityMetamodel_QMM_005fOCL_StringType((QualityMetamodel.QMM_OCL.StringType) element, globaltab, out);
			return;
		}
		if (element instanceof QualityMetamodel.QMM_OCL.BooleanType) {
			print_QualityMetamodel_QMM_005fOCL_BooleanType((QualityMetamodel.QMM_OCL.BooleanType) element, globaltab, out);
			return;
		}
		if (element instanceof QualityMetamodel.QMM_OCL.IntegerType) {
			print_QualityMetamodel_QMM_005fOCL_IntegerType((QualityMetamodel.QMM_OCL.IntegerType) element, globaltab, out);
			return;
		}
		if (element instanceof QualityMetamodel.QMM_OCL.RealType) {
			print_QualityMetamodel_QMM_005fOCL_RealType((QualityMetamodel.QMM_OCL.RealType) element, globaltab, out);
			return;
		}
		if (element instanceof QualityMetamodel.QMM_OCL.BagType) {
			print_QualityMetamodel_QMM_005fOCL_BagType((QualityMetamodel.QMM_OCL.BagType) element, globaltab, out);
			return;
		}
		if (element instanceof QualityMetamodel.QMM_OCL.OrderedSetType) {
			print_QualityMetamodel_QMM_005fOCL_OrderedSetType((QualityMetamodel.QMM_OCL.OrderedSetType) element, globaltab, out);
			return;
		}
		if (element instanceof QualityMetamodel.QMM_OCL.SequenceType) {
			print_QualityMetamodel_QMM_005fOCL_SequenceType((QualityMetamodel.QMM_OCL.SequenceType) element, globaltab, out);
			return;
		}
		if (element instanceof QualityMetamodel.QMM_OCL.SetType) {
			print_QualityMetamodel_QMM_005fOCL_SetType((QualityMetamodel.QMM_OCL.SetType) element, globaltab, out);
			return;
		}
		if (element instanceof QualityMetamodel.QMM_OCL.OclAnyType) {
			print_QualityMetamodel_QMM_005fOCL_OclAnyType((QualityMetamodel.QMM_OCL.OclAnyType) element, globaltab, out);
			return;
		}
		if (element instanceof QualityMetamodel.QMM_OCL.TupleType) {
			print_QualityMetamodel_QMM_005fOCL_TupleType((QualityMetamodel.QMM_OCL.TupleType) element, globaltab, out);
			return;
		}
		if (element instanceof QualityMetamodel.QMM_OCL.TupleTypeAttribute) {
			print_QualityMetamodel_QMM_005fOCL_TupleTypeAttribute((QualityMetamodel.QMM_OCL.TupleTypeAttribute) element, globaltab, out);
			return;
		}
		if (element instanceof QualityMetamodel.QMM_OCL.OclModelElement) {
			print_QualityMetamodel_QMM_005fOCL_OclModelElement((QualityMetamodel.QMM_OCL.OclModelElement) element, globaltab, out);
			return;
		}
		if (element instanceof QualityMetamodel.QMM_OCL.MapType) {
			print_QualityMetamodel_QMM_005fOCL_MapType((QualityMetamodel.QMM_OCL.MapType) element, globaltab, out);
			return;
		}
		if (element instanceof QualityMetamodel.QMM_OCL.LambdaType) {
			print_QualityMetamodel_QMM_005fOCL_LambdaType((QualityMetamodel.QMM_OCL.LambdaType) element, globaltab, out);
			return;
		}
		if (element instanceof QualityMetamodel.QMM_OCL.EnvType) {
			print_QualityMetamodel_QMM_005fOCL_EnvType((QualityMetamodel.QMM_OCL.EnvType) element, globaltab, out);
			return;
		}
		if (element instanceof QualityMetamodel.QMM_OCL.LocalVariable) {
			print_QualityMetamodel_QMM_005fOCL_LocalVariable((QualityMetamodel.QMM_OCL.LocalVariable) element, globaltab, out);
			return;
		}
		if (element instanceof QualityMetamodel.QMM_OCL.OperatorCallExp) {
			print_QualityMetamodel_QMM_005fOCL_OperatorCallExp((QualityMetamodel.QMM_OCL.OperatorCallExp) element, globaltab, out);
			return;
		}
		if (element instanceof QualityMetamodel.QMM_OCL.OperationCall) {
			print_QualityMetamodel_QMM_005fOCL_OperationCall((QualityMetamodel.QMM_OCL.OperationCall) element, globaltab, out);
			return;
		}
		if (element instanceof QualityMetamodel.QMM_OCL.CollectionType) {
			print_QualityMetamodel_QMM_005fOCL_CollectionType((QualityMetamodel.QMM_OCL.CollectionType) element, globaltab, out);
			return;
		}
		if (element instanceof QualityMetamodel.QMM_OCL.OclType) {
			print_QualityMetamodel_QMM_005fOCL_OclType((QualityMetamodel.QMM_OCL.OclType) element, globaltab, out);
			return;
		}
		
		addWarningToResource("The printer can not handle " + element.eClass().getName() + " elements", element);
	}
	
	protected QualityMetamodel.resource.qualitymetamodel.mopp.QualitymetamodelReferenceResolverSwitch getReferenceResolverSwitch() {
		return (QualityMetamodel.resource.qualitymetamodel.mopp.QualitymetamodelReferenceResolverSwitch) new QualityMetamodel.resource.qualitymetamodel.mopp.QualitymetamodelMetaInformation().getReferenceResolverSwitch();
	}
	
	protected void addWarningToResource(final String errorMessage, org.eclipse.emf.ecore.EObject cause) {
		QualityMetamodel.resource.qualitymetamodel.IQualitymetamodelTextResource resource = getResource();
		if (resource == null) {
			// the resource can be null if the printer is used stand alone
			return;
		}
		resource.addProblem(new QualityMetamodel.resource.qualitymetamodel.mopp.QualitymetamodelProblem(errorMessage, QualityMetamodel.resource.qualitymetamodel.QualitymetamodelEProblemType.PRINT_PROBLEM, QualityMetamodel.resource.qualitymetamodel.QualitymetamodelEProblemSeverity.WARNING), cause);
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		this.options = options;
	}
	
	public java.util.Map<?,?> getOptions() {
		return options;
	}
	
	public void setEncoding(String encoding) {
		if (encoding != null) {
			this.encoding = encoding;
		}
	}
	
	public String getEncoding() {
		return encoding;
	}
	
	public QualityMetamodel.resource.qualitymetamodel.IQualitymetamodelTextResource getResource() {
		return resource;
	}
	
	/**
	 * Calls {@link #doPrint(EObject, PrintWriter, String)} and writes the result to
	 * the underlying output stream.
	 */
	public void print(org.eclipse.emf.ecore.EObject element) throws java.io.IOException {
		java.io.PrintWriter out = new java.io.PrintWriter(new java.io.OutputStreamWriter(new java.io.BufferedOutputStream(outputStream), encoding));
		doPrint(element, out, "");
		out.flush();
		out.close();
	}
	
	public void print_QualityMetamodel_QualityModel(QualityMetamodel.QualityModel element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(12);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QualityMetamodelPackage.QUALITY_MODEL__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QualityMetamodelPackage.QUALITY_MODEL__METAMODELS));
		printCountingMap.put("metamodels", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QualityMetamodelPackage.QUALITY_MODEL__IMPORTS));
		printCountingMap.put("imports", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QualityMetamodelPackage.QUALITY_MODEL__ELEMENTS));
		printCountingMap.put("elements", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QualityMetamodelPackage.QUALITY_MODEL__METRIC_PROVIDERS));
		printCountingMap.put("metricProviders", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QualityMetamodelPackage.QUALITY_MODEL__QUALITY_TYPES));
		printCountingMap.put("qualityTypes", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QualityMetamodelPackage.QUALITY_MODEL__QUALITY_ATTRIBUTES));
		printCountingMap.put("qualityAttributes", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QualityMetamodelPackage.QUALITY_MODEL__QUALITY_VALUES));
		printCountingMap.put("qualityValues", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("{");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("name:");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QualityMetamodelPackage.QUALITY_MODEL__NAME));
			if (o != null) {
				QualityMetamodel.resource.qualitymetamodel.IQualitymetamodelTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(QualityMetamodel.QualityMetamodelPackage.QUALITY_MODEL__NAME), element));
				out.print(" ");
			}
			printCountingMap.put("name", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(",");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("metricProviders:");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("[");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("metricProviders");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QualityMetamodelPackage.QUALITY_MODEL__METRIC_PROVIDERS));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("metricProviders", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_QualityMetamodel_QualityModel_0(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("],");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("qualityTypes:");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("[");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("qualityTypes");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QualityMetamodelPackage.QUALITY_MODEL__QUALITY_TYPES));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			java.util.ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				Object o = it.next();
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("qualityTypes", 0);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_QualityMetamodel_QualityModel_1(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("],");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("qualityAttributes:");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("[");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("qualityAttributes");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QualityMetamodelPackage.QUALITY_MODEL__QUALITY_ATTRIBUTES));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			java.util.ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				Object o = it.next();
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("qualityAttributes", 0);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_QualityMetamodel_QualityModel_2(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("],");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("qualityValues:");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("[");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("qualityValues");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QualityMetamodelPackage.QUALITY_MODEL__QUALITY_VALUES));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			java.util.ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				Object o = it.next();
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("qualityValues", 0);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_QualityMetamodel_QualityModel_3(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("]");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("}");
		out.print(" ");
	}
	
	public void print_QualityMetamodel_QualityModel_0(QualityMetamodel.QualityModel element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print(",");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("metricProviders");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QualityMetamodelPackage.QUALITY_MODEL__METRIC_PROVIDERS));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			java.util.ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				Object o = it.next();
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("metricProviders", 0);
		}
	}
	
	public void print_QualityMetamodel_QualityModel_1(QualityMetamodel.QualityModel element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print(",");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("qualityTypes");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QualityMetamodelPackage.QUALITY_MODEL__QUALITY_TYPES));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			java.util.ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				Object o = it.next();
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("qualityTypes", 0);
		}
	}
	
	public void print_QualityMetamodel_QualityModel_2(QualityMetamodel.QualityModel element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print(",");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("qualityAttributes");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QualityMetamodelPackage.QUALITY_MODEL__QUALITY_ATTRIBUTES));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			java.util.ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				Object o = it.next();
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("qualityAttributes", 0);
		}
	}
	
	public void print_QualityMetamodel_QualityModel_3(QualityMetamodel.QualityModel element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print(",");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("qualityValues");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QualityMetamodelPackage.QUALITY_MODEL__QUALITY_VALUES));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			java.util.ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				Object o = it.next();
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("qualityValues", 0);
		}
	}
	
	
	public void print_QualityMetamodel_QualityAttribute(QualityMetamodel.QualityAttribute element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(9);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QualityMetamodelPackage.QUALITY_ATTRIBUTE__VAR_NAME));
		printCountingMap.put("varName", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QualityMetamodelPackage.QUALITY_ATTRIBUTE__TYPE));
		printCountingMap.put("type", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QualityMetamodelPackage.QUALITY_ATTRIBUTE__VARIABLE_EXP));
		printCountingMap.put("variableExp", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QualityMetamodelPackage.QUALITY_ATTRIBUTE__VALUE));
		printCountingMap.put("value", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QualityMetamodelPackage.QUALITY_ATTRIBUTE__QUALITY_ATTRIBUTES));
		printCountingMap.put("qualityAttributes", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("{");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("name:");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("varName");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QualityMetamodelPackage.QUALITY_ATTRIBUTE__VAR_NAME));
			if (o != null) {
				QualityMetamodel.resource.qualitymetamodel.IQualitymetamodelTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(QualityMetamodel.QualityMetamodelPackage.QUALITY_ATTRIBUTE__VAR_NAME), element));
				out.print(" ");
			}
			printCountingMap.put("varName", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(",");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("qualityAttributes:");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("[");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("qualityAttributes");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QualityMetamodelPackage.QUALITY_ATTRIBUTE__QUALITY_ATTRIBUTES));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				QualityMetamodel.resource.qualitymetamodel.IQualitymetamodelTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getQualityAttributeQualityAttributesReferenceResolver().deResolve((QualityMetamodel.QualityAttribute) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(QualityMetamodel.QualityMetamodelPackage.QUALITY_ATTRIBUTE__QUALITY_ATTRIBUTES)), element.eClass().getEStructuralFeature(QualityMetamodel.QualityMetamodelPackage.QUALITY_ATTRIBUTE__QUALITY_ATTRIBUTES), element));
				out.print(" ");
			}
			printCountingMap.put("qualityAttributes", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_QualityMetamodel_QualityAttribute_0(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("],");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("values:");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("value");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QualityMetamodelPackage.QUALITY_ATTRIBUTE__VALUE));
			if (o != null) {
				QualityMetamodel.resource.qualitymetamodel.IQualitymetamodelTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getQualityAttributeValueReferenceResolver().deResolve((QualityMetamodel.Value) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(QualityMetamodel.QualityMetamodelPackage.QUALITY_ATTRIBUTE__VALUE)), element.eClass().getEStructuralFeature(QualityMetamodel.QualityMetamodelPackage.QUALITY_ATTRIBUTE__VALUE), element));
				out.print(" ");
			}
			printCountingMap.put("value", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("}");
		out.print(" ");
	}
	
	public void print_QualityMetamodel_QualityAttribute_0(QualityMetamodel.QualityAttribute element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print(",");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("qualityAttributes");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QualityMetamodelPackage.QUALITY_ATTRIBUTE__QUALITY_ATTRIBUTES));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				QualityMetamodel.resource.qualitymetamodel.IQualitymetamodelTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getQualityAttributeQualityAttributesReferenceResolver().deResolve((QualityMetamodel.QualityAttribute) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(QualityMetamodel.QualityMetamodelPackage.QUALITY_ATTRIBUTE__QUALITY_ATTRIBUTES)), element.eClass().getEStructuralFeature(QualityMetamodel.QualityMetamodelPackage.QUALITY_ATTRIBUTE__QUALITY_ATTRIBUTES), element));
				out.print(" ");
			}
			printCountingMap.put("qualityAttributes", count - 1);
		}
	}
	
	
	public void print_QualityMetamodel_MetricProvider(QualityMetamodel.MetricProvider element, String outertab, java.io.PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(3);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QualityMetamodelPackage.METRIC_PROVIDER__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QualityMetamodelPackage.METRIC_PROVIDER__DESCRIPTION));
		printCountingMap.put("description", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QualityMetamodelPackage.METRIC_PROVIDER__ID));
		printCountingMap.put("id", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("{");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("name:");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QualityMetamodelPackage.METRIC_PROVIDER__NAME));
			if (o != null) {
				QualityMetamodel.resource.qualitymetamodel.IQualitymetamodelTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(QualityMetamodel.QualityMetamodelPackage.METRIC_PROVIDER__NAME), element));
				out.print(" ");
			}
			printCountingMap.put("name", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(",");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("description:");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderInQuotes)
		count = printCountingMap.get("description");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QualityMetamodelPackage.METRIC_PROVIDER__DESCRIPTION));
			if (o != null) {
				QualityMetamodel.resource.qualitymetamodel.IQualitymetamodelTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34_92");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(QualityMetamodel.QualityMetamodelPackage.METRIC_PROVIDER__DESCRIPTION), element));
				out.print(" ");
			}
			printCountingMap.put("description", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(",");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("id:");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("id");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QualityMetamodelPackage.METRIC_PROVIDER__ID));
			if (o != null) {
				QualityMetamodel.resource.qualitymetamodel.IQualitymetamodelTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(QualityMetamodel.QualityMetamodelPackage.METRIC_PROVIDER__ID), element));
				out.print(" ");
			}
			printCountingMap.put("id", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("}");
		out.print(" ");
	}
	
	
	public void print_QualityMetamodel_SingleValue(QualityMetamodel.SingleValue element, String outertab, java.io.PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(10);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QualityMetamodelPackage.SINGLE_VALUE__VAR_NAME));
		printCountingMap.put("varName", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QualityMetamodelPackage.SINGLE_VALUE__TYPE));
		printCountingMap.put("type", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QualityMetamodelPackage.SINGLE_VALUE__VARIABLE_EXP));
		printCountingMap.put("variableExp", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QualityMetamodelPackage.SINGLE_VALUE__VALUE_TYPE));
		printCountingMap.put("valueType", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QualityMetamodelPackage.SINGLE_VALUE__DESCRIPTION));
		printCountingMap.put("description", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QualityMetamodelPackage.SINGLE_VALUE__MEASURED_BY));
		printCountingMap.put("measuredBy", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("{");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("name:");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("varName");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QualityMetamodelPackage.SINGLE_VALUE__VAR_NAME));
			if (o != null) {
				QualityMetamodel.resource.qualitymetamodel.IQualitymetamodelTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(QualityMetamodel.QualityMetamodelPackage.SINGLE_VALUE__VAR_NAME), element));
				out.print(" ");
			}
			printCountingMap.put("varName", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(",");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("measuredBy:");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("measuredBy");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QualityMetamodelPackage.SINGLE_VALUE__MEASURED_BY));
			if (o != null) {
				QualityMetamodel.resource.qualitymetamodel.IQualitymetamodelTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getSingleValueMeasuredByReferenceResolver().deResolve((QualityMetamodel.MetricProvider) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(QualityMetamodel.QualityMetamodelPackage.SINGLE_VALUE__MEASURED_BY)), element.eClass().getEStructuralFeature(QualityMetamodel.QualityMetamodelPackage.SINGLE_VALUE__MEASURED_BY), element));
				out.print(" ");
			}
			printCountingMap.put("measuredBy", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(",");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("type:");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("valueType");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QualityMetamodelPackage.SINGLE_VALUE__VALUE_TYPE));
			if (o != null) {
				QualityMetamodel.resource.qualitymetamodel.IQualitymetamodelTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getValueValueTypeReferenceResolver().deResolve((QualityMetamodel.ValueType) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(QualityMetamodel.QualityMetamodelPackage.SINGLE_VALUE__VALUE_TYPE)), element.eClass().getEStructuralFeature(QualityMetamodel.QualityMetamodelPackage.SINGLE_VALUE__VALUE_TYPE), element));
				out.print(" ");
			}
			printCountingMap.put("valueType", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("}");
		out.print(" ");
	}
	
	
	public void print_QualityMetamodel_AggregatedValue(QualityMetamodel.AggregatedValue element, String outertab, java.io.PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(10);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QualityMetamodelPackage.AGGREGATED_VALUE__VAR_NAME));
		printCountingMap.put("varName", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QualityMetamodelPackage.AGGREGATED_VALUE__TYPE));
		printCountingMap.put("type", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QualityMetamodelPackage.AGGREGATED_VALUE__VARIABLE_EXP));
		printCountingMap.put("variableExp", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QualityMetamodelPackage.AGGREGATED_VALUE__VALUE_TYPE));
		printCountingMap.put("valueType", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QualityMetamodelPackage.AGGREGATED_VALUE__DESCRIPTION));
		printCountingMap.put("description", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QualityMetamodelPackage.AGGREGATED_VALUE__CALCULATED_BY));
		printCountingMap.put("calculatedBy", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("{");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("name:");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("varName");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QualityMetamodelPackage.AGGREGATED_VALUE__VAR_NAME));
			if (o != null) {
				QualityMetamodel.resource.qualitymetamodel.IQualitymetamodelTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(QualityMetamodel.QualityMetamodelPackage.AGGREGATED_VALUE__VAR_NAME), element));
				out.print(" ");
			}
			printCountingMap.put("varName", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(",");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("calculatedBy:");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("calculatedBy");
		if (count > 0) {
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(",");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("type:");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("valueType");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QualityMetamodelPackage.AGGREGATED_VALUE__VALUE_TYPE));
			if (o != null) {
				QualityMetamodel.resource.qualitymetamodel.IQualitymetamodelTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getValueValueTypeReferenceResolver().deResolve((QualityMetamodel.ValueType) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(QualityMetamodel.QualityMetamodelPackage.AGGREGATED_VALUE__VALUE_TYPE)), element.eClass().getEStructuralFeature(QualityMetamodel.QualityMetamodelPackage.AGGREGATED_VALUE__VALUE_TYPE), element));
				out.print(" ");
			}
			printCountingMap.put("valueType", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("}");
		out.print(" ");
	}
	
	
	public void print_QualityMetamodel_Operation(QualityMetamodel.Operation element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(4);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QualityMetamodelPackage.OPERATION__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QualityMetamodelPackage.OPERATION__AGGREGATED_VALUES));
		printCountingMap.put("aggregatedValues", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QualityMetamodelPackage.OPERATION__BODY));
		printCountingMap.put("body", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QualityMetamodelPackage.OPERATION__REF));
		printCountingMap.put("ref", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("{");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("name:");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QualityMetamodelPackage.OPERATION__NAME));
			if (o != null) {
				QualityMetamodel.resource.qualitymetamodel.IQualitymetamodelTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(QualityMetamodel.QualityMetamodelPackage.OPERATION__NAME), element));
				out.print(" ");
			}
			printCountingMap.put("name", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(",");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("aggregatedValue:");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("[");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("aggregatedValues");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QualityMetamodelPackage.OPERATION__AGGREGATED_VALUES));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				QualityMetamodel.resource.qualitymetamodel.IQualitymetamodelTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getOperationAggregatedValuesReferenceResolver().deResolve((QualityMetamodel.Value) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(QualityMetamodel.QualityMetamodelPackage.OPERATION__AGGREGATED_VALUES)), element.eClass().getEStructuralFeature(QualityMetamodel.QualityMetamodelPackage.OPERATION__AGGREGATED_VALUES), element));
				out.print(" ");
			}
			printCountingMap.put("aggregatedValues", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_QualityMetamodel_Operation_0(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_QualityMetamodel_Operation_1(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("]");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("expr:");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("ref");
		if (count > 0) {
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("}");
		out.print(" ");
	}
	
	public void print_QualityMetamodel_Operation_0(QualityMetamodel.Operation element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print(",");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("aggregatedValues");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QualityMetamodelPackage.OPERATION__AGGREGATED_VALUES));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				QualityMetamodel.resource.qualitymetamodel.IQualitymetamodelTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getOperationAggregatedValuesReferenceResolver().deResolve((QualityMetamodel.Value) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(QualityMetamodel.QualityMetamodelPackage.OPERATION__AGGREGATED_VALUES)), element.eClass().getEStructuralFeature(QualityMetamodel.QualityMetamodelPackage.OPERATION__AGGREGATED_VALUES), element));
				out.print(" ");
			}
			printCountingMap.put("aggregatedValues", count - 1);
		}
	}
	
	public void print_QualityMetamodel_Operation_1(QualityMetamodel.Operation element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		// DEFINITION PART BEGINS (CsString)
		out.print(",");
		out.print(" ");
	}
	
	
	public void print_QualityMetamodel_TextValueType(QualityMetamodel.TextValueType element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(9);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QualityMetamodelPackage.TEXT_VALUE_TYPE__VAR_NAME));
		printCountingMap.put("varName", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QualityMetamodelPackage.TEXT_VALUE_TYPE__TYPE));
		printCountingMap.put("type", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QualityMetamodelPackage.TEXT_VALUE_TYPE__VARIABLE_EXP));
		printCountingMap.put("variableExp", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QualityMetamodelPackage.TEXT_VALUE_TYPE__VAL));
		printCountingMap.put("val", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QualityMetamodelPackage.TEXT_VALUE_TYPE__VALUE));
		printCountingMap.put("value", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("{");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("name:");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("varName");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QualityMetamodelPackage.TEXT_VALUE_TYPE__VAR_NAME));
			if (o != null) {
				QualityMetamodel.resource.qualitymetamodel.IQualitymetamodelTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(QualityMetamodel.QualityMetamodelPackage.TEXT_VALUE_TYPE__VAR_NAME), element));
				out.print(" ");
			}
			printCountingMap.put("varName", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(",");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("type:");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("String,");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("value:");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_QualityMetamodel_TextValueType_0(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (CsString)
		out.print("}");
		out.print(" ");
	}
	
	public void print_QualityMetamodel_TextValueType_0(QualityMetamodel.TextValueType element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		int alt = -1;
		alt = 0;
		int matches = 		matchCount(printCountingMap, java.util.Arrays.asList(		"value"		));
		int tempMatchCount;
		tempMatchCount = 		0;
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (CsString)
				out.print("UNSET");
				out.print(" ");
			}
			break;
			default:			// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
			count = printCountingMap.get("value");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QualityMetamodelPackage.TEXT_VALUE_TYPE__VALUE));
				if (o != null) {
					QualityMetamodel.resource.qualitymetamodel.IQualitymetamodelTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
					resolver.setOptions(getOptions());
					out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(QualityMetamodel.QualityMetamodelPackage.TEXT_VALUE_TYPE__VALUE), element));
					out.print(" ");
				}
				printCountingMap.put("value", count - 1);
			}
		}
	}
	
	
	public void print_QualityMetamodel_AggregatedValueMetric(QualityMetamodel.AggregatedValueMetric element, String outertab, java.io.PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(13);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QualityMetamodelPackage.AGGREGATED_VALUE_METRIC__VAR_NAME));
		printCountingMap.put("varName", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QualityMetamodelPackage.AGGREGATED_VALUE_METRIC__TYPE));
		printCountingMap.put("type", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QualityMetamodelPackage.AGGREGATED_VALUE_METRIC__VARIABLE_EXP));
		printCountingMap.put("variableExp", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QualityMetamodelPackage.AGGREGATED_VALUE_METRIC__VAL));
		printCountingMap.put("val", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QualityMetamodelPackage.AGGREGATED_VALUE_METRIC__MINIMUM));
		printCountingMap.put("minimum", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QualityMetamodelPackage.AGGREGATED_VALUE_METRIC__MAXIMUM));
		printCountingMap.put("maximum", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QualityMetamodelPackage.AGGREGATED_VALUE_METRIC__AVERAGE));
		printCountingMap.put("average", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QualityMetamodelPackage.AGGREGATED_VALUE_METRIC__MEDIAN));
		printCountingMap.put("median", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QualityMetamodelPackage.AGGREGATED_VALUE_METRIC__STANDARD_DEVIATION));
		printCountingMap.put("standardDeviation", temp == null ? 0 : 1);
		// print collected hidden tokens
		// DEFINITION PART BEGINS (CsString)
		out.print("AggregatedValueMetric");
		out.print(" ");
	}
	
	
	public void print_QualityMetamodel_EnumerationMetric(QualityMetamodel.EnumerationMetric element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(10);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QualityMetamodelPackage.ENUMERATION_METRIC__VAR_NAME));
		printCountingMap.put("varName", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QualityMetamodelPackage.ENUMERATION_METRIC__TYPE));
		printCountingMap.put("type", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QualityMetamodelPackage.ENUMERATION_METRIC__VARIABLE_EXP));
		printCountingMap.put("variableExp", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QualityMetamodelPackage.ENUMERATION_METRIC__VAL));
		printCountingMap.put("val", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QualityMetamodelPackage.ENUMERATION_METRIC__SET));
		printCountingMap.put("set", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QualityMetamodelPackage.ENUMERATION_METRIC__VALUE));
		printCountingMap.put("value", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("{");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("name:");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("varName");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QualityMetamodelPackage.ENUMERATION_METRIC__VAR_NAME));
			if (o != null) {
				QualityMetamodel.resource.qualitymetamodel.IQualitymetamodelTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(QualityMetamodel.QualityMetamodelPackage.ENUMERATION_METRIC__VAR_NAME), element));
				out.print(" ");
			}
			printCountingMap.put("varName", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(",");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("set:");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("[");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("set");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QualityMetamodelPackage.ENUMERATION_METRIC__SET));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			java.util.ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				Object o = it.next();
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("set", 0);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_QualityMetamodel_EnumerationMetric_0(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("],");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("value:");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_QualityMetamodel_EnumerationMetric_1(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (CsString)
		out.print("}");
		out.print(" ");
	}
	
	public void print_QualityMetamodel_EnumerationMetric_0(QualityMetamodel.EnumerationMetric element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print(",");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("set");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QualityMetamodelPackage.ENUMERATION_METRIC__SET));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			java.util.ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				Object o = it.next();
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("set", 0);
		}
	}
	
	public void print_QualityMetamodel_EnumerationMetric_1(QualityMetamodel.EnumerationMetric element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		int alt = -1;
		alt = 0;
		int matches = 		matchCount(printCountingMap, java.util.Arrays.asList(		"value"		));
		int tempMatchCount;
		tempMatchCount = 		0;
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (CsString)
				out.print("UNSET");
				out.print(" ");
			}
			break;
			default:			// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
			count = printCountingMap.get("value");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QualityMetamodelPackage.ENUMERATION_METRIC__VALUE));
				if (o != null) {
					QualityMetamodel.resource.qualitymetamodel.IQualitymetamodelTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
					resolver.setOptions(getOptions());
					out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getEnumerationMetricValueReferenceResolver().deResolve((QualityMetamodel.EnumerationItem) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(QualityMetamodel.QualityMetamodelPackage.ENUMERATION_METRIC__VALUE)), element.eClass().getEStructuralFeature(QualityMetamodel.QualityMetamodelPackage.ENUMERATION_METRIC__VALUE), element));
					out.print(" ");
				}
				printCountingMap.put("value", count - 1);
			}
		}
	}
	
	
	public void print_QualityMetamodel_EnumerationItem(QualityMetamodel.EnumerationItem element, String outertab, java.io.PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(1);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QualityMetamodelPackage.ENUMERATION_ITEM__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("{");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("name:");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QualityMetamodelPackage.ENUMERATION_ITEM__NAME));
			if (o != null) {
				QualityMetamodel.resource.qualitymetamodel.IQualitymetamodelTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(QualityMetamodel.QualityMetamodelPackage.ENUMERATION_ITEM__NAME), element));
				out.print(" ");
			}
			printCountingMap.put("name", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("}");
		out.print(" ");
	}
	
	
	public void print_QualityMetamodel_RealValueType(QualityMetamodel.RealValueType element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(9);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QualityMetamodelPackage.REAL_VALUE_TYPE__VAR_NAME));
		printCountingMap.put("varName", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QualityMetamodelPackage.REAL_VALUE_TYPE__TYPE));
		printCountingMap.put("type", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QualityMetamodelPackage.REAL_VALUE_TYPE__VARIABLE_EXP));
		printCountingMap.put("variableExp", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QualityMetamodelPackage.REAL_VALUE_TYPE__VAL));
		printCountingMap.put("val", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QualityMetamodelPackage.REAL_VALUE_TYPE__VALUE));
		printCountingMap.put("value", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("{");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("name:");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("varName");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QualityMetamodelPackage.REAL_VALUE_TYPE__VAR_NAME));
			if (o != null) {
				QualityMetamodel.resource.qualitymetamodel.IQualitymetamodelTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(QualityMetamodel.QualityMetamodelPackage.REAL_VALUE_TYPE__VAR_NAME), element));
				out.print(" ");
			}
			printCountingMap.put("varName", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(",");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("_type:");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("Real,");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("value:");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_QualityMetamodel_RealValueType_0(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (CsString)
		out.print("}");
		out.print(" ");
	}
	
	public void print_QualityMetamodel_RealValueType_0(QualityMetamodel.RealValueType element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		int alt = -1;
		alt = 0;
		int matches = 		matchCount(printCountingMap, java.util.Arrays.asList(		"value"		));
		int tempMatchCount;
		tempMatchCount = 		0;
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (CsString)
				out.print("UNSET");
				out.print(" ");
			}
			break;
			default:			// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
			count = printCountingMap.get("value");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QualityMetamodelPackage.REAL_VALUE_TYPE__VALUE));
				if (o != null) {
					QualityMetamodel.resource.qualitymetamodel.IQualitymetamodelTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
					resolver.setOptions(getOptions());
					out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(QualityMetamodel.QualityMetamodelPackage.REAL_VALUE_TYPE__VALUE), element));
					out.print(" ");
				}
				printCountingMap.put("value", count - 1);
			}
		}
	}
	
	
	public void print_QualityMetamodel_BooleanValueType(QualityMetamodel.BooleanValueType element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(9);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QualityMetamodelPackage.BOOLEAN_VALUE_TYPE__VAR_NAME));
		printCountingMap.put("varName", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QualityMetamodelPackage.BOOLEAN_VALUE_TYPE__TYPE));
		printCountingMap.put("type", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QualityMetamodelPackage.BOOLEAN_VALUE_TYPE__VARIABLE_EXP));
		printCountingMap.put("variableExp", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QualityMetamodelPackage.BOOLEAN_VALUE_TYPE__VAL));
		printCountingMap.put("val", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QualityMetamodelPackage.BOOLEAN_VALUE_TYPE__VALUE));
		printCountingMap.put("value", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("{");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("name:");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("varName");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QualityMetamodelPackage.BOOLEAN_VALUE_TYPE__VAR_NAME));
			if (o != null) {
				QualityMetamodel.resource.qualitymetamodel.IQualitymetamodelTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(QualityMetamodel.QualityMetamodelPackage.BOOLEAN_VALUE_TYPE__VAR_NAME), element));
				out.print(" ");
			}
			printCountingMap.put("varName", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(",");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("type:");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("Boolean,");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("value:");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_QualityMetamodel_BooleanValueType_0(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (CsString)
		out.print("}");
		out.print(" ");
	}
	
	public void print_QualityMetamodel_BooleanValueType_0(QualityMetamodel.BooleanValueType element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		int alt = -1;
		alt = 0;
		int matches = 		matchCount(printCountingMap, java.util.Arrays.asList(		"value"		));
		int tempMatchCount;
		tempMatchCount = 		0;
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (CsString)
				out.print("UNSET");
				out.print(" ");
			}
			break;
			default:			// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
			count = printCountingMap.get("value");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QualityMetamodelPackage.BOOLEAN_VALUE_TYPE__VALUE));
				if (o != null) {
					QualityMetamodel.resource.qualitymetamodel.IQualitymetamodelTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
					resolver.setOptions(getOptions());
					out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(QualityMetamodel.QualityMetamodelPackage.BOOLEAN_VALUE_TYPE__VALUE), element));
					out.print(" ");
				}
				printCountingMap.put("value", count - 1);
			}
		}
	}
	
	
	public void print_QualityMetamodel_IntegerValueType(QualityMetamodel.IntegerValueType element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(9);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QualityMetamodelPackage.INTEGER_VALUE_TYPE__VAR_NAME));
		printCountingMap.put("varName", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QualityMetamodelPackage.INTEGER_VALUE_TYPE__TYPE));
		printCountingMap.put("type", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QualityMetamodelPackage.INTEGER_VALUE_TYPE__VARIABLE_EXP));
		printCountingMap.put("variableExp", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QualityMetamodelPackage.INTEGER_VALUE_TYPE__VAL));
		printCountingMap.put("val", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QualityMetamodelPackage.INTEGER_VALUE_TYPE__VALUE));
		printCountingMap.put("value", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("{");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("name:");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("varName");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QualityMetamodelPackage.INTEGER_VALUE_TYPE__VAR_NAME));
			if (o != null) {
				QualityMetamodel.resource.qualitymetamodel.IQualitymetamodelTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(QualityMetamodel.QualityMetamodelPackage.INTEGER_VALUE_TYPE__VAR_NAME), element));
				out.print(" ");
			}
			printCountingMap.put("varName", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(",");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("type:");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("Integer,");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("value:");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_QualityMetamodel_IntegerValueType_0(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (CsString)
		out.print("}");
		out.print(" ");
	}
	
	public void print_QualityMetamodel_IntegerValueType_0(QualityMetamodel.IntegerValueType element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		int alt = -1;
		alt = 0;
		int matches = 		matchCount(printCountingMap, java.util.Arrays.asList(		"value"		));
		int tempMatchCount;
		tempMatchCount = 		0;
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (CsString)
				out.print("UNSET");
				out.print(" ");
			}
			break;
			default:			// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
			count = printCountingMap.get("value");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QualityMetamodelPackage.INTEGER_VALUE_TYPE__VALUE));
				if (o != null) {
					QualityMetamodel.resource.qualitymetamodel.IQualitymetamodelTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
					resolver.setOptions(getOptions());
					out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(QualityMetamodel.QualityMetamodelPackage.INTEGER_VALUE_TYPE__VALUE), element));
					out.print(" ");
				}
				printCountingMap.put("value", count - 1);
			}
		}
	}
	
	
	public void print_QualityMetamodel_QMM_005fOCL_Module(QualityMetamodel.QMM_OCL.Module element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(8);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.MODULE__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.MODULE__METAMODELS));
		printCountingMap.put("metamodels", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.MODULE__IMPORTS));
		printCountingMap.put("imports", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.MODULE__ELEMENTS));
		printCountingMap.put("elements", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("module");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_QualityMetamodel_QMM_005fOCL_Module_0(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (CsString)
		out.print(";");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_QualityMetamodel_QMM_005fOCL_Module_1(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_QualityMetamodel_QMM_005fOCL_Module_2(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_QualityMetamodel_QMM_005fOCL_Module_3(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
	}
	
	public void print_QualityMetamodel_QMM_005fOCL_Module_0(QualityMetamodel.QMM_OCL.Module element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		int alt = -1;
		alt = 0;
		int matches = 		matchCount(printCountingMap, java.util.Arrays.asList(		"name"		));
		int tempMatchCount;
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"name"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (PlaceholderInQuotes)
				count = printCountingMap.get("name");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.MODULE__NAME));
					if (o != null) {
						QualityMetamodel.resource.qualitymetamodel.IQualitymetamodelTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34_92");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.MODULE__NAME), element));
						out.print(" ");
					}
					printCountingMap.put("name", count - 1);
				}
			}
			break;
			default:			// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
			count = printCountingMap.get("name");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.MODULE__NAME));
				if (o != null) {
					QualityMetamodel.resource.qualitymetamodel.IQualitymetamodelTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
					resolver.setOptions(getOptions());
					out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.MODULE__NAME), element));
					out.print(" ");
				}
				printCountingMap.put("name", count - 1);
			}
		}
	}
	
	public void print_QualityMetamodel_QMM_005fOCL_Module_1(QualityMetamodel.QMM_OCL.Module element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (LineBreak)
		out.println();
		out.print(localtab);
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("metamodels");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.MODULE__METAMODELS));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			java.util.ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				Object o = it.next();
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("metamodels", 0);
		}
	}
	
	public void print_QualityMetamodel_QMM_005fOCL_Module_2(QualityMetamodel.QMM_OCL.Module element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (LineBreak)
		out.println();
		out.print(localtab);
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("imports");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.MODULE__IMPORTS));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			java.util.ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				Object o = it.next();
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("imports", 0);
		}
	}
	
	public void print_QualityMetamodel_QMM_005fOCL_Module_3(QualityMetamodel.QMM_OCL.Module element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (LineBreak)
		out.println();
		out.print(localtab);
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("elements");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.MODULE__ELEMENTS));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			java.util.ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				Object o = it.next();
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("elements", 0);
		}
	}
	
	
	public void print_QualityMetamodel_QMM_005fOCL_Import(QualityMetamodel.QMM_OCL.Import element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(6);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.IMPORT__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.IMPORT__MODULE));
		printCountingMap.put("module", temp == null ? 0 : 1);
		// print collected hidden tokens
		// DEFINITION PART BEGINS (CsString)
		out.print("import");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_QualityMetamodel_QMM_005fOCL_Import_0(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (CsString)
		out.print(";");
		out.print(" ");
	}
	
	public void print_QualityMetamodel_QMM_005fOCL_Import_0(QualityMetamodel.QMM_OCL.Import element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		int alt = -1;
		alt = 0;
		int matches = 		matchCount(printCountingMap, java.util.Arrays.asList(		"name"		));
		int tempMatchCount;
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"name"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (PlaceholderInQuotes)
				count = printCountingMap.get("name");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.IMPORT__NAME));
					if (o != null) {
						QualityMetamodel.resource.qualitymetamodel.IQualitymetamodelTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34_92");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.IMPORT__NAME), element));
						out.print(" ");
					}
					printCountingMap.put("name", count - 1);
				}
			}
			break;
			default:			// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
			count = printCountingMap.get("name");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.IMPORT__NAME));
				if (o != null) {
					QualityMetamodel.resource.qualitymetamodel.IQualitymetamodelTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
					resolver.setOptions(getOptions());
					out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.IMPORT__NAME), element));
					out.print(" ");
				}
				printCountingMap.put("name", count - 1);
			}
		}
	}
	
	
	public void print_QualityMetamodel_QMM_005fOCL_OclFeatureDefinition(QualityMetamodel.QMM_OCL.OclFeatureDefinition element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(8);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.OCL_FEATURE_DEFINITION__MODULE));
		printCountingMap.put("module", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.OCL_FEATURE_DEFINITION__FEATURE));
		printCountingMap.put("feature", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.OCL_FEATURE_DEFINITION__CONTEXT_));
		printCountingMap.put("context_", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.OCL_FEATURE_DEFINITION__STATIC));
		printCountingMap.put("static", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("context_");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.OCL_FEATURE_DEFINITION__CONTEXT_));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("context_", count - 1);
		}
		// DEFINITION PART BEGINS (BooleanTerminal)
		count = printCountingMap.get("static");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.OCL_FEATURE_DEFINITION__STATIC));
			if (o != null) {
			}
			printCountingMap.put("static", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("def");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("feature");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.OCL_FEATURE_DEFINITION__FEATURE));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("feature", count - 1);
		}
	}
	
	
	public void print_QualityMetamodel_QMM_005fOCL_OclContextDefinition(QualityMetamodel.QMM_OCL.OclContextDefinition element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(6);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.OCL_CONTEXT_DEFINITION__DEFINITION));
		printCountingMap.put("definition", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.OCL_CONTEXT_DEFINITION__CONTEXT_));
		printCountingMap.put("context_", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("context");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("context_");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.OCL_CONTEXT_DEFINITION__CONTEXT_));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("context_", count - 1);
		}
	}
	
	
	public void print_QualityMetamodel_QMM_005fOCL_OclMetamodel(QualityMetamodel.QMM_OCL.OclMetamodel element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(8);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.OCL_METAMODEL__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.OCL_METAMODEL__ELEMENTS));
		printCountingMap.put("elements", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.OCL_METAMODEL__MODEL));
		printCountingMap.put("model", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.OCL_METAMODEL__URI));
		printCountingMap.put("uri", temp == null ? 0 : 1);
		// print collected hidden tokens
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("metamodel");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_QualityMetamodel_QMM_005fOCL_OclMetamodel_0(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_QualityMetamodel_QMM_005fOCL_OclMetamodel_1(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(";");
		out.print(" ");
	}
	
	public void print_QualityMetamodel_QMM_005fOCL_OclMetamodel_0(QualityMetamodel.QMM_OCL.OclMetamodel element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		int alt = -1;
		alt = 0;
		int matches = 		matchCount(printCountingMap, java.util.Arrays.asList(		"name"		));
		int tempMatchCount;
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"name"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (PlaceholderInQuotes)
				count = printCountingMap.get("name");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.OCL_METAMODEL__NAME));
					if (o != null) {
						QualityMetamodel.resource.qualitymetamodel.IQualitymetamodelTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34_92");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.OCL_METAMODEL__NAME), element));
						out.print(" ");
					}
					printCountingMap.put("name", count - 1);
				}
			}
			break;
			default:			// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
			count = printCountingMap.get("name");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.OCL_METAMODEL__NAME));
				if (o != null) {
					QualityMetamodel.resource.qualitymetamodel.IQualitymetamodelTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
					resolver.setOptions(getOptions());
					out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.OCL_METAMODEL__NAME), element));
					out.print(" ");
				}
				printCountingMap.put("name", count - 1);
			}
		}
	}
	
	public void print_QualityMetamodel_QMM_005fOCL_OclMetamodel_1(QualityMetamodel.QMM_OCL.OclMetamodel element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderInQuotes)
		count = printCountingMap.get("uri");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.OCL_METAMODEL__URI));
			if (o != null) {
				QualityMetamodel.resource.qualitymetamodel.IQualitymetamodelTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_39_39_92");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.OCL_METAMODEL__URI), element));
				out.print(" ");
			}
			printCountingMap.put("uri", count - 1);
		}
	}
	
	
	public void print_QualityMetamodel_QMM_005fOCL_OclInstanceModel(QualityMetamodel.QMM_OCL.OclInstanceModel element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(7);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.OCL_INSTANCE_MODEL__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.OCL_INSTANCE_MODEL__ELEMENTS));
		printCountingMap.put("elements", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.OCL_INSTANCE_MODEL__METAMODEL));
		printCountingMap.put("metamodel", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_QualityMetamodel_QMM_005fOCL_OclInstanceModel_0(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("metamodel");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.OCL_INSTANCE_MODEL__METAMODEL));
			if (o != null) {
				QualityMetamodel.resource.qualitymetamodel.IQualitymetamodelTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getOclInstanceModelMetamodelReferenceResolver().deResolve((QualityMetamodel.QMM_OCL.OclMetamodel) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.OCL_INSTANCE_MODEL__METAMODEL)), element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.OCL_INSTANCE_MODEL__METAMODEL), element));
				out.print(" ");
			}
			printCountingMap.put("metamodel", count - 1);
		}
	}
	
	public void print_QualityMetamodel_QMM_005fOCL_OclInstanceModel_0(QualityMetamodel.QMM_OCL.OclInstanceModel element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		int alt = -1;
		alt = 0;
		int matches = 		matchCount(printCountingMap, java.util.Arrays.asList(		"name"		));
		int tempMatchCount;
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"name"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (PlaceholderInQuotes)
				count = printCountingMap.get("name");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.OCL_INSTANCE_MODEL__NAME));
					if (o != null) {
						QualityMetamodel.resource.qualitymetamodel.IQualitymetamodelTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34_92");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.OCL_INSTANCE_MODEL__NAME), element));
						out.print(" ");
					}
					printCountingMap.put("name", count - 1);
				}
			}
			break;
			default:			// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
			count = printCountingMap.get("name");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.OCL_INSTANCE_MODEL__NAME));
				if (o != null) {
					QualityMetamodel.resource.qualitymetamodel.IQualitymetamodelTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
					resolver.setOptions(getOptions());
					out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.OCL_INSTANCE_MODEL__NAME), element));
					out.print(" ");
				}
				printCountingMap.put("name", count - 1);
			}
		}
	}
	
	
	public void print_QualityMetamodel_QMM_005fOCL_LocalVariable(QualityMetamodel.QMM_OCL.LocalVariable element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(11);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.LOCAL_VARIABLE__VAR_NAME));
		printCountingMap.put("varName", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.LOCAL_VARIABLE__TYPE));
		printCountingMap.put("type", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.LOCAL_VARIABLE__VARIABLE_EXP));
		printCountingMap.put("variableExp", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.LOCAL_VARIABLE__LET_EXP));
		printCountingMap.put("letExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.LOCAL_VARIABLE__INIT_EXPRESSION));
		printCountingMap.put("initExpression", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.LOCAL_VARIABLE__BASE_EXP));
		printCountingMap.put("baseExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.LOCAL_VARIABLE__EQ));
		printCountingMap.put("eq", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("varName");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.LOCAL_VARIABLE__VAR_NAME));
			if (o != null) {
				QualityMetamodel.resource.qualitymetamodel.IQualitymetamodelTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.LOCAL_VARIABLE__VAR_NAME), element));
				out.print(" ");
			}
			printCountingMap.put("varName", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_QualityMetamodel_QMM_005fOCL_LocalVariable_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("eq");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.LOCAL_VARIABLE__EQ));
			if (o != null) {
				QualityMetamodel.resource.qualitymetamodel.IQualitymetamodelTokenResolver resolver = tokenResolverFactory.createTokenResolver("EQ");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.LOCAL_VARIABLE__EQ), element));
				out.print(" ");
			}
			printCountingMap.put("eq", count - 1);
		}
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("initExpression");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.LOCAL_VARIABLE__INIT_EXPRESSION));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("initExpression", count - 1);
		}
	}
	
	public void print_QualityMetamodel_QMM_005fOCL_LocalVariable_0(QualityMetamodel.QMM_OCL.LocalVariable element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("type");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.LOCAL_VARIABLE__TYPE));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("type", count - 1);
		}
	}
	
	
	public void print_QualityMetamodel_QMM_005fOCL_Attribute(QualityMetamodel.QMM_OCL.Attribute element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(9);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.ATTRIBUTE__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.ATTRIBUTE__DEFINITION));
		printCountingMap.put("definition", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.ATTRIBUTE__EQ));
		printCountingMap.put("eq", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.ATTRIBUTE__INIT_EXPRESSION));
		printCountingMap.put("initExpression", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.ATTRIBUTE__TYPE));
		printCountingMap.put("type", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_QualityMetamodel_QMM_005fOCL_Attribute_0(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("type");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.ATTRIBUTE__TYPE));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("type", count - 1);
		}
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("eq");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.ATTRIBUTE__EQ));
			if (o != null) {
				QualityMetamodel.resource.qualitymetamodel.IQualitymetamodelTokenResolver resolver = tokenResolverFactory.createTokenResolver("EQ");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.ATTRIBUTE__EQ), element));
				out.print(" ");
			}
			printCountingMap.put("eq", count - 1);
		}
		// DEFINITION PART BEGINS (LineBreak)
		localtab += "	";
		out.println();
		out.print(localtab);
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("initExpression");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.ATTRIBUTE__INIT_EXPRESSION));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("initExpression", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(";");
		out.print(" ");
	}
	
	public void print_QualityMetamodel_QMM_005fOCL_Attribute_0(QualityMetamodel.QMM_OCL.Attribute element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		int alt = -1;
		alt = 0;
		int matches = 		matchCount(printCountingMap, java.util.Arrays.asList(		"name"		));
		int tempMatchCount;
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"name"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (PlaceholderInQuotes)
				count = printCountingMap.get("name");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.ATTRIBUTE__NAME));
					if (o != null) {
						QualityMetamodel.resource.qualitymetamodel.IQualitymetamodelTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34_92");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.ATTRIBUTE__NAME), element));
						out.print(" ");
					}
					printCountingMap.put("name", count - 1);
				}
			}
			break;
			default:			// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
			count = printCountingMap.get("name");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.ATTRIBUTE__NAME));
				if (o != null) {
					QualityMetamodel.resource.qualitymetamodel.IQualitymetamodelTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
					resolver.setOptions(getOptions());
					out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.ATTRIBUTE__NAME), element));
					out.print(" ");
				}
				printCountingMap.put("name", count - 1);
			}
		}
	}
	
	
	public void print_QualityMetamodel_QMM_005fOCL_Operation(QualityMetamodel.QMM_OCL.Operation element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(10);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.OPERATION__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.OPERATION__DEFINITION));
		printCountingMap.put("definition", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.OPERATION__EQ));
		printCountingMap.put("eq", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.OPERATION__PARAMETERS));
		printCountingMap.put("parameters", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.OPERATION__RETURN_TYPE));
		printCountingMap.put("returnType", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.OPERATION__BODY));
		printCountingMap.put("body", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_QualityMetamodel_QMM_005fOCL_Operation_0(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_QualityMetamodel_QMM_005fOCL_Operation_1(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("returnType");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.OPERATION__RETURN_TYPE));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("returnType", count - 1);
		}
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("eq");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.OPERATION__EQ));
			if (o != null) {
				QualityMetamodel.resource.qualitymetamodel.IQualitymetamodelTokenResolver resolver = tokenResolverFactory.createTokenResolver("EQ");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.OPERATION__EQ), element));
				out.print(" ");
			}
			printCountingMap.put("eq", count - 1);
		}
		// DEFINITION PART BEGINS (LineBreak)
		localtab += "	";
		out.println();
		out.print(localtab);
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("body");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.OPERATION__BODY));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("body", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(";");
		out.print(" ");
	}
	
	public void print_QualityMetamodel_QMM_005fOCL_Operation_0(QualityMetamodel.QMM_OCL.Operation element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		int alt = -1;
		alt = 0;
		int matches = 		matchCount(printCountingMap, java.util.Arrays.asList(		"name"		));
		int tempMatchCount;
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"name"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (PlaceholderInQuotes)
				count = printCountingMap.get("name");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.OPERATION__NAME));
					if (o != null) {
						QualityMetamodel.resource.qualitymetamodel.IQualitymetamodelTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34_92");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.OPERATION__NAME), element));
						out.print(" ");
					}
					printCountingMap.put("name", count - 1);
				}
			}
			break;
			default:			// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
			count = printCountingMap.get("name");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.OPERATION__NAME));
				if (o != null) {
					QualityMetamodel.resource.qualitymetamodel.IQualitymetamodelTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
					resolver.setOptions(getOptions());
					out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.OPERATION__NAME), element));
					out.print(" ");
				}
				printCountingMap.put("name", count - 1);
			}
		}
	}
	
	public void print_QualityMetamodel_QMM_005fOCL_Operation_1(QualityMetamodel.QMM_OCL.Operation element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("parameters");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.OPERATION__PARAMETERS));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("parameters", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_QualityMetamodel_QMM_005fOCL_Operation_1_0(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
	}
	
	public void print_QualityMetamodel_QMM_005fOCL_Operation_1_0(QualityMetamodel.QMM_OCL.Operation element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print(",");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("parameters");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.OPERATION__PARAMETERS));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("parameters", count - 1);
		}
	}
	
	
	public void print_QualityMetamodel_QMM_005fOCL_Parameter(QualityMetamodel.QMM_OCL.Parameter element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(8);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.PARAMETER__VAR_NAME));
		printCountingMap.put("varName", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.PARAMETER__TYPE));
		printCountingMap.put("type", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.PARAMETER__VARIABLE_EXP));
		printCountingMap.put("variableExp", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.PARAMETER__OPERATION));
		printCountingMap.put("operation", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("varName");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.PARAMETER__VAR_NAME));
			if (o != null) {
				QualityMetamodel.resource.qualitymetamodel.IQualitymetamodelTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.PARAMETER__VAR_NAME), element));
				out.print(" ");
			}
			printCountingMap.put("varName", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("type");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.PARAMETER__TYPE));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("type", count - 1);
		}
	}
	
	
	public void print_QualityMetamodel_QMM_005fOCL_OclModelElementExp(QualityMetamodel.QMM_OCL.OclModelElementExp element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(18);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.OCL_MODEL_ELEMENT_EXP__TYPE));
		printCountingMap.put("type", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.OCL_MODEL_ELEMENT_EXP__IF_EXP3));
		printCountingMap.put("ifExp3", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.OCL_MODEL_ELEMENT_EXP__APPLIED_PROPERTY));
		printCountingMap.put("appliedProperty", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.OCL_MODEL_ELEMENT_EXP__LET_EXP));
		printCountingMap.put("letExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.OCL_MODEL_ELEMENT_EXP__LOOP_EXP));
		printCountingMap.put("loopExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.OCL_MODEL_ELEMENT_EXP__PARENT_OPERATION));
		printCountingMap.put("parentOperation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.OCL_MODEL_ELEMENT_EXP__INITIALIZED_VARIABLE));
		printCountingMap.put("initializedVariable", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.OCL_MODEL_ELEMENT_EXP__IF_EXP2));
		printCountingMap.put("ifExp2", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.OCL_MODEL_ELEMENT_EXP__OWNING_OPERATION));
		printCountingMap.put("owningOperation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.OCL_MODEL_ELEMENT_EXP__IF_EXP1));
		printCountingMap.put("ifExp1", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.OCL_MODEL_ELEMENT_EXP__OWNING_ATTRIBUTE));
		printCountingMap.put("owningAttribute", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.OCL_MODEL_ELEMENT_EXP__APPLIED_OPERATOR));
		printCountingMap.put("appliedOperator", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.OCL_MODEL_ELEMENT_EXP__MODEL));
		printCountingMap.put("model", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.OCL_MODEL_ELEMENT_EXP__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("model");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.OCL_MODEL_ELEMENT_EXP__MODEL));
			if (o != null) {
				QualityMetamodel.resource.qualitymetamodel.IQualitymetamodelTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getOclModelElementExpModelReferenceResolver().deResolve((QualityMetamodel.QMM_OCL.OclModel) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.OCL_MODEL_ELEMENT_EXP__MODEL)), element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.OCL_MODEL_ELEMENT_EXP__MODEL), element));
				out.print(" ");
			}
			printCountingMap.put("model", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("!");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_QualityMetamodel_QMM_005fOCL_OclModelElementExp_0(element, localtab, out, printCountingMap);
	}
	
	public void print_QualityMetamodel_QMM_005fOCL_OclModelElementExp_0(QualityMetamodel.QMM_OCL.OclModelElementExp element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		int alt = -1;
		alt = 0;
		int matches = 		matchCount(printCountingMap, java.util.Arrays.asList(		"name"		));
		int tempMatchCount;
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"name"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (PlaceholderInQuotes)
				count = printCountingMap.get("name");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.OCL_MODEL_ELEMENT_EXP__NAME));
					if (o != null) {
						QualityMetamodel.resource.qualitymetamodel.IQualitymetamodelTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34_92");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.OCL_MODEL_ELEMENT_EXP__NAME), element));
						out.print(" ");
					}
					printCountingMap.put("name", count - 1);
				}
			}
			break;
			default:			// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
			count = printCountingMap.get("name");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.OCL_MODEL_ELEMENT_EXP__NAME));
				if (o != null) {
					QualityMetamodel.resource.qualitymetamodel.IQualitymetamodelTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
					resolver.setOptions(getOptions());
					out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.OCL_MODEL_ELEMENT_EXP__NAME), element));
					out.print(" ");
				}
				printCountingMap.put("name", count - 1);
			}
		}
	}
	
	
	public void print_QualityMetamodel_QMM_005fOCL_LambdaCallExp(QualityMetamodel.QMM_OCL.LambdaCallExp element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(18);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.LAMBDA_CALL_EXP__TYPE));
		printCountingMap.put("type", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.LAMBDA_CALL_EXP__IF_EXP3));
		printCountingMap.put("ifExp3", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.LAMBDA_CALL_EXP__APPLIED_PROPERTY));
		printCountingMap.put("appliedProperty", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.LAMBDA_CALL_EXP__LET_EXP));
		printCountingMap.put("letExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.LAMBDA_CALL_EXP__LOOP_EXP));
		printCountingMap.put("loopExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.LAMBDA_CALL_EXP__PARENT_OPERATION));
		printCountingMap.put("parentOperation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.LAMBDA_CALL_EXP__INITIALIZED_VARIABLE));
		printCountingMap.put("initializedVariable", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.LAMBDA_CALL_EXP__IF_EXP2));
		printCountingMap.put("ifExp2", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.LAMBDA_CALL_EXP__OWNING_OPERATION));
		printCountingMap.put("owningOperation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.LAMBDA_CALL_EXP__IF_EXP1));
		printCountingMap.put("ifExp1", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.LAMBDA_CALL_EXP__OWNING_ATTRIBUTE));
		printCountingMap.put("owningAttribute", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.LAMBDA_CALL_EXP__APPLIED_OPERATOR));
		printCountingMap.put("appliedOperator", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.LAMBDA_CALL_EXP__REFERRED_VARIABLE));
		printCountingMap.put("referredVariable", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.LAMBDA_CALL_EXP__ARGUMENTS));
		printCountingMap.put("arguments", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("referredVariable");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.LAMBDA_CALL_EXP__REFERRED_VARIABLE));
			if (o != null) {
				QualityMetamodel.resource.qualitymetamodel.IQualitymetamodelTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getVariableExpReferredVariableReferenceResolver().deResolve((QualityMetamodel.QMM_OCL.VariableDeclaration) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.LAMBDA_CALL_EXP__REFERRED_VARIABLE)), element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.LAMBDA_CALL_EXP__REFERRED_VARIABLE), element));
				out.print(" ");
			}
			printCountingMap.put("referredVariable", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_QualityMetamodel_QMM_005fOCL_LambdaCallExp_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
	}
	
	public void print_QualityMetamodel_QMM_005fOCL_LambdaCallExp_0(QualityMetamodel.QMM_OCL.LambdaCallExp element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("arguments");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.LAMBDA_CALL_EXP__ARGUMENTS));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("arguments", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_QualityMetamodel_QMM_005fOCL_LambdaCallExp_0_0(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
	}
	
	public void print_QualityMetamodel_QMM_005fOCL_LambdaCallExp_0_0(QualityMetamodel.QMM_OCL.LambdaCallExp element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print(",");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("arguments");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.LAMBDA_CALL_EXP__ARGUMENTS));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("arguments", count - 1);
		}
	}
	
	
	public void print_QualityMetamodel_QMM_005fOCL_VariableExp(QualityMetamodel.QMM_OCL.VariableExp element, String outertab, java.io.PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(17);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.VARIABLE_EXP__TYPE));
		printCountingMap.put("type", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.VARIABLE_EXP__IF_EXP3));
		printCountingMap.put("ifExp3", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.VARIABLE_EXP__APPLIED_PROPERTY));
		printCountingMap.put("appliedProperty", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.VARIABLE_EXP__LET_EXP));
		printCountingMap.put("letExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.VARIABLE_EXP__LOOP_EXP));
		printCountingMap.put("loopExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.VARIABLE_EXP__PARENT_OPERATION));
		printCountingMap.put("parentOperation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.VARIABLE_EXP__INITIALIZED_VARIABLE));
		printCountingMap.put("initializedVariable", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.VARIABLE_EXP__IF_EXP2));
		printCountingMap.put("ifExp2", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.VARIABLE_EXP__OWNING_OPERATION));
		printCountingMap.put("owningOperation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.VARIABLE_EXP__IF_EXP1));
		printCountingMap.put("ifExp1", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.VARIABLE_EXP__OWNING_ATTRIBUTE));
		printCountingMap.put("owningAttribute", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.VARIABLE_EXP__APPLIED_OPERATOR));
		printCountingMap.put("appliedOperator", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.VARIABLE_EXP__REFERRED_VARIABLE));
		printCountingMap.put("referredVariable", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("referredVariable");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.VARIABLE_EXP__REFERRED_VARIABLE));
			if (o != null) {
				QualityMetamodel.resource.qualitymetamodel.IQualitymetamodelTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getVariableExpReferredVariableReferenceResolver().deResolve((QualityMetamodel.QMM_OCL.VariableDeclaration) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.VARIABLE_EXP__REFERRED_VARIABLE)), element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.VARIABLE_EXP__REFERRED_VARIABLE), element));
				out.print(" ");
			}
			printCountingMap.put("referredVariable", count - 1);
		}
	}
	
	
	public void print_QualityMetamodel_QMM_005fOCL_SuperExp(QualityMetamodel.QMM_OCL.SuperExp element, String outertab, java.io.PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(16);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.SUPER_EXP__TYPE));
		printCountingMap.put("type", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.SUPER_EXP__IF_EXP3));
		printCountingMap.put("ifExp3", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.SUPER_EXP__APPLIED_PROPERTY));
		printCountingMap.put("appliedProperty", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.SUPER_EXP__LET_EXP));
		printCountingMap.put("letExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.SUPER_EXP__LOOP_EXP));
		printCountingMap.put("loopExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.SUPER_EXP__PARENT_OPERATION));
		printCountingMap.put("parentOperation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.SUPER_EXP__INITIALIZED_VARIABLE));
		printCountingMap.put("initializedVariable", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.SUPER_EXP__IF_EXP2));
		printCountingMap.put("ifExp2", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.SUPER_EXP__OWNING_OPERATION));
		printCountingMap.put("owningOperation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.SUPER_EXP__IF_EXP1));
		printCountingMap.put("ifExp1", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.SUPER_EXP__OWNING_ATTRIBUTE));
		printCountingMap.put("owningAttribute", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.SUPER_EXP__APPLIED_OPERATOR));
		printCountingMap.put("appliedOperator", temp == null ? 0 : 1);
		// print collected hidden tokens
		// DEFINITION PART BEGINS (CsString)
		out.print("super");
		out.print(" ");
	}
	
	
	public void print_QualityMetamodel_QMM_005fOCL_SelfExp(QualityMetamodel.QMM_OCL.SelfExp element, String outertab, java.io.PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(16);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.SELF_EXP__TYPE));
		printCountingMap.put("type", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.SELF_EXP__IF_EXP3));
		printCountingMap.put("ifExp3", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.SELF_EXP__APPLIED_PROPERTY));
		printCountingMap.put("appliedProperty", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.SELF_EXP__LET_EXP));
		printCountingMap.put("letExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.SELF_EXP__LOOP_EXP));
		printCountingMap.put("loopExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.SELF_EXP__PARENT_OPERATION));
		printCountingMap.put("parentOperation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.SELF_EXP__INITIALIZED_VARIABLE));
		printCountingMap.put("initializedVariable", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.SELF_EXP__IF_EXP2));
		printCountingMap.put("ifExp2", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.SELF_EXP__OWNING_OPERATION));
		printCountingMap.put("owningOperation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.SELF_EXP__IF_EXP1));
		printCountingMap.put("ifExp1", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.SELF_EXP__OWNING_ATTRIBUTE));
		printCountingMap.put("owningAttribute", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.SELF_EXP__APPLIED_OPERATOR));
		printCountingMap.put("appliedOperator", temp == null ? 0 : 1);
		// print collected hidden tokens
		// DEFINITION PART BEGINS (CsString)
		out.print("self");
		out.print(" ");
	}
	
	
	public void print_QualityMetamodel_QMM_005fOCL_EnvExp(QualityMetamodel.QMM_OCL.EnvExp element, String outertab, java.io.PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(16);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.ENV_EXP__TYPE));
		printCountingMap.put("type", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.ENV_EXP__IF_EXP3));
		printCountingMap.put("ifExp3", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.ENV_EXP__APPLIED_PROPERTY));
		printCountingMap.put("appliedProperty", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.ENV_EXP__LET_EXP));
		printCountingMap.put("letExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.ENV_EXP__LOOP_EXP));
		printCountingMap.put("loopExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.ENV_EXP__PARENT_OPERATION));
		printCountingMap.put("parentOperation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.ENV_EXP__INITIALIZED_VARIABLE));
		printCountingMap.put("initializedVariable", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.ENV_EXP__IF_EXP2));
		printCountingMap.put("ifExp2", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.ENV_EXP__OWNING_OPERATION));
		printCountingMap.put("owningOperation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.ENV_EXP__IF_EXP1));
		printCountingMap.put("ifExp1", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.ENV_EXP__OWNING_ATTRIBUTE));
		printCountingMap.put("owningAttribute", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.ENV_EXP__APPLIED_OPERATOR));
		printCountingMap.put("appliedOperator", temp == null ? 0 : 1);
		// print collected hidden tokens
		// DEFINITION PART BEGINS (CsString)
		out.print("env");
		out.print(" ");
	}
	
	
	public void print_QualityMetamodel_QMM_005fOCL_StringExp(QualityMetamodel.QMM_OCL.StringExp element, String outertab, java.io.PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(17);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.STRING_EXP__TYPE));
		printCountingMap.put("type", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.STRING_EXP__IF_EXP3));
		printCountingMap.put("ifExp3", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.STRING_EXP__APPLIED_PROPERTY));
		printCountingMap.put("appliedProperty", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.STRING_EXP__LET_EXP));
		printCountingMap.put("letExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.STRING_EXP__LOOP_EXP));
		printCountingMap.put("loopExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.STRING_EXP__PARENT_OPERATION));
		printCountingMap.put("parentOperation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.STRING_EXP__INITIALIZED_VARIABLE));
		printCountingMap.put("initializedVariable", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.STRING_EXP__IF_EXP2));
		printCountingMap.put("ifExp2", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.STRING_EXP__OWNING_OPERATION));
		printCountingMap.put("owningOperation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.STRING_EXP__IF_EXP1));
		printCountingMap.put("ifExp1", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.STRING_EXP__OWNING_ATTRIBUTE));
		printCountingMap.put("owningAttribute", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.STRING_EXP__APPLIED_OPERATOR));
		printCountingMap.put("appliedOperator", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.STRING_EXP__STRING_SYMBOL));
		printCountingMap.put("stringSymbol", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (PlaceholderInQuotes)
		count = printCountingMap.get("stringSymbol");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.STRING_EXP__STRING_SYMBOL));
			if (o != null) {
				QualityMetamodel.resource.qualitymetamodel.IQualitymetamodelTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_39_39_92");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.STRING_EXP__STRING_SYMBOL), element));
				out.print(" ");
			}
			printCountingMap.put("stringSymbol", count - 1);
		}
	}
	
	
	public void print_QualityMetamodel_QMM_005fOCL_BooleanExp(QualityMetamodel.QMM_OCL.BooleanExp element, String outertab, java.io.PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(17);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.BOOLEAN_EXP__TYPE));
		printCountingMap.put("type", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.BOOLEAN_EXP__IF_EXP3));
		printCountingMap.put("ifExp3", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.BOOLEAN_EXP__APPLIED_PROPERTY));
		printCountingMap.put("appliedProperty", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.BOOLEAN_EXP__LET_EXP));
		printCountingMap.put("letExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.BOOLEAN_EXP__LOOP_EXP));
		printCountingMap.put("loopExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.BOOLEAN_EXP__PARENT_OPERATION));
		printCountingMap.put("parentOperation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.BOOLEAN_EXP__INITIALIZED_VARIABLE));
		printCountingMap.put("initializedVariable", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.BOOLEAN_EXP__IF_EXP2));
		printCountingMap.put("ifExp2", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.BOOLEAN_EXP__OWNING_OPERATION));
		printCountingMap.put("owningOperation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.BOOLEAN_EXP__IF_EXP1));
		printCountingMap.put("ifExp1", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.BOOLEAN_EXP__OWNING_ATTRIBUTE));
		printCountingMap.put("owningAttribute", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.BOOLEAN_EXP__APPLIED_OPERATOR));
		printCountingMap.put("appliedOperator", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.BOOLEAN_EXP__BOOLEAN_SYMBOL));
		printCountingMap.put("booleanSymbol", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (BooleanTerminal)
		count = printCountingMap.get("booleanSymbol");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.BOOLEAN_EXP__BOOLEAN_SYMBOL));
			if (o != null) {
			}
			printCountingMap.put("booleanSymbol", count - 1);
		}
	}
	
	
	public void print_QualityMetamodel_QMM_005fOCL_RealExp(QualityMetamodel.QMM_OCL.RealExp element, String outertab, java.io.PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(17);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.REAL_EXP__TYPE));
		printCountingMap.put("type", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.REAL_EXP__IF_EXP3));
		printCountingMap.put("ifExp3", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.REAL_EXP__APPLIED_PROPERTY));
		printCountingMap.put("appliedProperty", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.REAL_EXP__LET_EXP));
		printCountingMap.put("letExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.REAL_EXP__LOOP_EXP));
		printCountingMap.put("loopExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.REAL_EXP__PARENT_OPERATION));
		printCountingMap.put("parentOperation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.REAL_EXP__INITIALIZED_VARIABLE));
		printCountingMap.put("initializedVariable", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.REAL_EXP__IF_EXP2));
		printCountingMap.put("ifExp2", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.REAL_EXP__OWNING_OPERATION));
		printCountingMap.put("owningOperation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.REAL_EXP__IF_EXP1));
		printCountingMap.put("ifExp1", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.REAL_EXP__OWNING_ATTRIBUTE));
		printCountingMap.put("owningAttribute", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.REAL_EXP__APPLIED_OPERATOR));
		printCountingMap.put("appliedOperator", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.REAL_EXP__REAL_SYMBOL));
		printCountingMap.put("realSymbol", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("realSymbol");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.REAL_EXP__REAL_SYMBOL));
			if (o != null) {
				QualityMetamodel.resource.qualitymetamodel.IQualitymetamodelTokenResolver resolver = tokenResolverFactory.createTokenResolver("FLOAT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.REAL_EXP__REAL_SYMBOL), element));
				out.print(" ");
			}
			printCountingMap.put("realSymbol", count - 1);
		}
	}
	
	
	public void print_QualityMetamodel_QMM_005fOCL_IntegerExp(QualityMetamodel.QMM_OCL.IntegerExp element, String outertab, java.io.PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(17);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.INTEGER_EXP__TYPE));
		printCountingMap.put("type", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.INTEGER_EXP__IF_EXP3));
		printCountingMap.put("ifExp3", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.INTEGER_EXP__APPLIED_PROPERTY));
		printCountingMap.put("appliedProperty", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.INTEGER_EXP__LET_EXP));
		printCountingMap.put("letExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.INTEGER_EXP__LOOP_EXP));
		printCountingMap.put("loopExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.INTEGER_EXP__PARENT_OPERATION));
		printCountingMap.put("parentOperation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.INTEGER_EXP__INITIALIZED_VARIABLE));
		printCountingMap.put("initializedVariable", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.INTEGER_EXP__IF_EXP2));
		printCountingMap.put("ifExp2", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.INTEGER_EXP__OWNING_OPERATION));
		printCountingMap.put("owningOperation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.INTEGER_EXP__IF_EXP1));
		printCountingMap.put("ifExp1", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.INTEGER_EXP__OWNING_ATTRIBUTE));
		printCountingMap.put("owningAttribute", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.INTEGER_EXP__APPLIED_OPERATOR));
		printCountingMap.put("appliedOperator", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.INTEGER_EXP__INTEGER_SYMBOL));
		printCountingMap.put("integerSymbol", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("integerSymbol");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.INTEGER_EXP__INTEGER_SYMBOL));
			if (o != null) {
				QualityMetamodel.resource.qualitymetamodel.IQualitymetamodelTokenResolver resolver = tokenResolverFactory.createTokenResolver("INTEGER");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.INTEGER_EXP__INTEGER_SYMBOL), element));
				out.print(" ");
			}
			printCountingMap.put("integerSymbol", count - 1);
		}
	}
	
	
	public void print_QualityMetamodel_QMM_005fOCL_CollectionRange(QualityMetamodel.QMM_OCL.CollectionRange element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(7);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.COLLECTION_RANGE__COLLECTION));
		printCountingMap.put("collection", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.COLLECTION_RANGE__FIRST));
		printCountingMap.put("first", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.COLLECTION_RANGE__LAST));
		printCountingMap.put("last", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("first");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.COLLECTION_RANGE__FIRST));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("first", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("..");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("last");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.COLLECTION_RANGE__LAST));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("last", count - 1);
		}
	}
	
	
	public void print_QualityMetamodel_QMM_005fOCL_CollectionItem(QualityMetamodel.QMM_OCL.CollectionItem element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(6);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.COLLECTION_ITEM__COLLECTION));
		printCountingMap.put("collection", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.COLLECTION_ITEM__ITEM));
		printCountingMap.put("item", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("item");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.COLLECTION_ITEM__ITEM));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("item", count - 1);
		}
	}
	
	
	public void print_QualityMetamodel_QMM_005fOCL_BagExp(QualityMetamodel.QMM_OCL.BagExp element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(17);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.BAG_EXP__TYPE));
		printCountingMap.put("type", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.BAG_EXP__IF_EXP3));
		printCountingMap.put("ifExp3", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.BAG_EXP__APPLIED_PROPERTY));
		printCountingMap.put("appliedProperty", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.BAG_EXP__LET_EXP));
		printCountingMap.put("letExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.BAG_EXP__LOOP_EXP));
		printCountingMap.put("loopExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.BAG_EXP__PARENT_OPERATION));
		printCountingMap.put("parentOperation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.BAG_EXP__INITIALIZED_VARIABLE));
		printCountingMap.put("initializedVariable", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.BAG_EXP__IF_EXP2));
		printCountingMap.put("ifExp2", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.BAG_EXP__OWNING_OPERATION));
		printCountingMap.put("owningOperation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.BAG_EXP__IF_EXP1));
		printCountingMap.put("ifExp1", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.BAG_EXP__OWNING_ATTRIBUTE));
		printCountingMap.put("owningAttribute", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.BAG_EXP__APPLIED_OPERATOR));
		printCountingMap.put("appliedOperator", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.BAG_EXP__PARTS));
		printCountingMap.put("parts", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("Bag");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("{");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_QualityMetamodel_QMM_005fOCL_BagExp_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("}");
		out.print(" ");
	}
	
	public void print_QualityMetamodel_QMM_005fOCL_BagExp_0(QualityMetamodel.QMM_OCL.BagExp element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("parts");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.BAG_EXP__PARTS));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("parts", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_QualityMetamodel_QMM_005fOCL_BagExp_0_0(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
	}
	
	public void print_QualityMetamodel_QMM_005fOCL_BagExp_0_0(QualityMetamodel.QMM_OCL.BagExp element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print(",");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("parts");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.BAG_EXP__PARTS));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("parts", count - 1);
		}
	}
	
	
	public void print_QualityMetamodel_QMM_005fOCL_OrderedSetExp(QualityMetamodel.QMM_OCL.OrderedSetExp element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(17);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.ORDERED_SET_EXP__TYPE));
		printCountingMap.put("type", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.ORDERED_SET_EXP__IF_EXP3));
		printCountingMap.put("ifExp3", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.ORDERED_SET_EXP__APPLIED_PROPERTY));
		printCountingMap.put("appliedProperty", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.ORDERED_SET_EXP__LET_EXP));
		printCountingMap.put("letExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.ORDERED_SET_EXP__LOOP_EXP));
		printCountingMap.put("loopExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.ORDERED_SET_EXP__PARENT_OPERATION));
		printCountingMap.put("parentOperation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.ORDERED_SET_EXP__INITIALIZED_VARIABLE));
		printCountingMap.put("initializedVariable", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.ORDERED_SET_EXP__IF_EXP2));
		printCountingMap.put("ifExp2", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.ORDERED_SET_EXP__OWNING_OPERATION));
		printCountingMap.put("owningOperation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.ORDERED_SET_EXP__IF_EXP1));
		printCountingMap.put("ifExp1", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.ORDERED_SET_EXP__OWNING_ATTRIBUTE));
		printCountingMap.put("owningAttribute", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.ORDERED_SET_EXP__APPLIED_OPERATOR));
		printCountingMap.put("appliedOperator", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.ORDERED_SET_EXP__PARTS));
		printCountingMap.put("parts", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("OrderedSet");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("{");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_QualityMetamodel_QMM_005fOCL_OrderedSetExp_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("}");
		out.print(" ");
	}
	
	public void print_QualityMetamodel_QMM_005fOCL_OrderedSetExp_0(QualityMetamodel.QMM_OCL.OrderedSetExp element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("parts");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.ORDERED_SET_EXP__PARTS));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("parts", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_QualityMetamodel_QMM_005fOCL_OrderedSetExp_0_0(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
	}
	
	public void print_QualityMetamodel_QMM_005fOCL_OrderedSetExp_0_0(QualityMetamodel.QMM_OCL.OrderedSetExp element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print(",");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("parts");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.ORDERED_SET_EXP__PARTS));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("parts", count - 1);
		}
	}
	
	
	public void print_QualityMetamodel_QMM_005fOCL_SequenceExp(QualityMetamodel.QMM_OCL.SequenceExp element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(17);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.SEQUENCE_EXP__TYPE));
		printCountingMap.put("type", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.SEQUENCE_EXP__IF_EXP3));
		printCountingMap.put("ifExp3", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.SEQUENCE_EXP__APPLIED_PROPERTY));
		printCountingMap.put("appliedProperty", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.SEQUENCE_EXP__LET_EXP));
		printCountingMap.put("letExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.SEQUENCE_EXP__LOOP_EXP));
		printCountingMap.put("loopExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.SEQUENCE_EXP__PARENT_OPERATION));
		printCountingMap.put("parentOperation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.SEQUENCE_EXP__INITIALIZED_VARIABLE));
		printCountingMap.put("initializedVariable", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.SEQUENCE_EXP__IF_EXP2));
		printCountingMap.put("ifExp2", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.SEQUENCE_EXP__OWNING_OPERATION));
		printCountingMap.put("owningOperation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.SEQUENCE_EXP__IF_EXP1));
		printCountingMap.put("ifExp1", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.SEQUENCE_EXP__OWNING_ATTRIBUTE));
		printCountingMap.put("owningAttribute", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.SEQUENCE_EXP__APPLIED_OPERATOR));
		printCountingMap.put("appliedOperator", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.SEQUENCE_EXP__PARTS));
		printCountingMap.put("parts", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("Sequence");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("{");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_QualityMetamodel_QMM_005fOCL_SequenceExp_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("}");
		out.print(" ");
	}
	
	public void print_QualityMetamodel_QMM_005fOCL_SequenceExp_0(QualityMetamodel.QMM_OCL.SequenceExp element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("parts");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.SEQUENCE_EXP__PARTS));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("parts", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_QualityMetamodel_QMM_005fOCL_SequenceExp_0_0(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
	}
	
	public void print_QualityMetamodel_QMM_005fOCL_SequenceExp_0_0(QualityMetamodel.QMM_OCL.SequenceExp element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print(",");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("parts");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.SEQUENCE_EXP__PARTS));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("parts", count - 1);
		}
	}
	
	
	public void print_QualityMetamodel_QMM_005fOCL_SetExp(QualityMetamodel.QMM_OCL.SetExp element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(17);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.SET_EXP__TYPE));
		printCountingMap.put("type", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.SET_EXP__IF_EXP3));
		printCountingMap.put("ifExp3", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.SET_EXP__APPLIED_PROPERTY));
		printCountingMap.put("appliedProperty", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.SET_EXP__LET_EXP));
		printCountingMap.put("letExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.SET_EXP__LOOP_EXP));
		printCountingMap.put("loopExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.SET_EXP__PARENT_OPERATION));
		printCountingMap.put("parentOperation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.SET_EXP__INITIALIZED_VARIABLE));
		printCountingMap.put("initializedVariable", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.SET_EXP__IF_EXP2));
		printCountingMap.put("ifExp2", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.SET_EXP__OWNING_OPERATION));
		printCountingMap.put("owningOperation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.SET_EXP__IF_EXP1));
		printCountingMap.put("ifExp1", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.SET_EXP__OWNING_ATTRIBUTE));
		printCountingMap.put("owningAttribute", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.SET_EXP__APPLIED_OPERATOR));
		printCountingMap.put("appliedOperator", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.SET_EXP__PARTS));
		printCountingMap.put("parts", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("Set");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("{");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_QualityMetamodel_QMM_005fOCL_SetExp_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("}");
		out.print(" ");
	}
	
	public void print_QualityMetamodel_QMM_005fOCL_SetExp_0(QualityMetamodel.QMM_OCL.SetExp element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("parts");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.SET_EXP__PARTS));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("parts", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_QualityMetamodel_QMM_005fOCL_SetExp_0_0(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
	}
	
	public void print_QualityMetamodel_QMM_005fOCL_SetExp_0_0(QualityMetamodel.QMM_OCL.SetExp element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print(",");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("parts");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.SET_EXP__PARTS));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("parts", count - 1);
		}
	}
	
	
	public void print_QualityMetamodel_QMM_005fOCL_TupleExp(QualityMetamodel.QMM_OCL.TupleExp element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(17);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.TUPLE_EXP__TYPE));
		printCountingMap.put("type", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.TUPLE_EXP__IF_EXP3));
		printCountingMap.put("ifExp3", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.TUPLE_EXP__APPLIED_PROPERTY));
		printCountingMap.put("appliedProperty", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.TUPLE_EXP__LET_EXP));
		printCountingMap.put("letExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.TUPLE_EXP__LOOP_EXP));
		printCountingMap.put("loopExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.TUPLE_EXP__PARENT_OPERATION));
		printCountingMap.put("parentOperation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.TUPLE_EXP__INITIALIZED_VARIABLE));
		printCountingMap.put("initializedVariable", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.TUPLE_EXP__IF_EXP2));
		printCountingMap.put("ifExp2", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.TUPLE_EXP__OWNING_OPERATION));
		printCountingMap.put("owningOperation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.TUPLE_EXP__IF_EXP1));
		printCountingMap.put("ifExp1", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.TUPLE_EXP__OWNING_ATTRIBUTE));
		printCountingMap.put("owningAttribute", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.TUPLE_EXP__APPLIED_OPERATOR));
		printCountingMap.put("appliedOperator", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.TUPLE_EXP__TUPLE_PART));
		printCountingMap.put("tuplePart", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("Tuple");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("{");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_QualityMetamodel_QMM_005fOCL_TupleExp_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("}");
		out.print(" ");
	}
	
	public void print_QualityMetamodel_QMM_005fOCL_TupleExp_0(QualityMetamodel.QMM_OCL.TupleExp element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("tuplePart");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.TUPLE_EXP__TUPLE_PART));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("tuplePart", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_QualityMetamodel_QMM_005fOCL_TupleExp_0_0(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
	}
	
	public void print_QualityMetamodel_QMM_005fOCL_TupleExp_0_0(QualityMetamodel.QMM_OCL.TupleExp element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print(",");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("tuplePart");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.TUPLE_EXP__TUPLE_PART));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("tuplePart", count - 1);
		}
	}
	
	
	public void print_QualityMetamodel_QMM_005fOCL_TuplePart(QualityMetamodel.QMM_OCL.TuplePart element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(12);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.TUPLE_PART__VAR_NAME));
		printCountingMap.put("varName", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.TUPLE_PART__TYPE));
		printCountingMap.put("type", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.TUPLE_PART__VARIABLE_EXP));
		printCountingMap.put("variableExp", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.TUPLE_PART__LET_EXP));
		printCountingMap.put("letExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.TUPLE_PART__INIT_EXPRESSION));
		printCountingMap.put("initExpression", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.TUPLE_PART__BASE_EXP));
		printCountingMap.put("baseExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.TUPLE_PART__EQ));
		printCountingMap.put("eq", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.TUPLE_PART__TUPLE));
		printCountingMap.put("tuple", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("varName");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.TUPLE_PART__VAR_NAME));
			if (o != null) {
				QualityMetamodel.resource.qualitymetamodel.IQualitymetamodelTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.TUPLE_PART__VAR_NAME), element));
				out.print(" ");
			}
			printCountingMap.put("varName", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_QualityMetamodel_QMM_005fOCL_TuplePart_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("eq");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.TUPLE_PART__EQ));
			if (o != null) {
				QualityMetamodel.resource.qualitymetamodel.IQualitymetamodelTokenResolver resolver = tokenResolverFactory.createTokenResolver("EQ");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.TUPLE_PART__EQ), element));
				out.print(" ");
			}
			printCountingMap.put("eq", count - 1);
		}
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("initExpression");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.TUPLE_PART__INIT_EXPRESSION));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("initExpression", count - 1);
		}
	}
	
	public void print_QualityMetamodel_QMM_005fOCL_TuplePart_0(QualityMetamodel.QMM_OCL.TuplePart element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("type");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.TUPLE_PART__TYPE));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("type", count - 1);
		}
	}
	
	
	public void print_QualityMetamodel_QMM_005fOCL_MapExp(QualityMetamodel.QMM_OCL.MapExp element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(17);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.MAP_EXP__TYPE));
		printCountingMap.put("type", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.MAP_EXP__IF_EXP3));
		printCountingMap.put("ifExp3", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.MAP_EXP__APPLIED_PROPERTY));
		printCountingMap.put("appliedProperty", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.MAP_EXP__LET_EXP));
		printCountingMap.put("letExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.MAP_EXP__LOOP_EXP));
		printCountingMap.put("loopExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.MAP_EXP__PARENT_OPERATION));
		printCountingMap.put("parentOperation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.MAP_EXP__INITIALIZED_VARIABLE));
		printCountingMap.put("initializedVariable", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.MAP_EXP__IF_EXP2));
		printCountingMap.put("ifExp2", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.MAP_EXP__OWNING_OPERATION));
		printCountingMap.put("owningOperation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.MAP_EXP__IF_EXP1));
		printCountingMap.put("ifExp1", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.MAP_EXP__OWNING_ATTRIBUTE));
		printCountingMap.put("owningAttribute", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.MAP_EXP__APPLIED_OPERATOR));
		printCountingMap.put("appliedOperator", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.MAP_EXP__ELEMENTS));
		printCountingMap.put("elements", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("Map");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("{");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_QualityMetamodel_QMM_005fOCL_MapExp_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("}");
		out.print(" ");
	}
	
	public void print_QualityMetamodel_QMM_005fOCL_MapExp_0(QualityMetamodel.QMM_OCL.MapExp element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("elements");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.MAP_EXP__ELEMENTS));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("elements", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_QualityMetamodel_QMM_005fOCL_MapExp_0_0(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
	}
	
	public void print_QualityMetamodel_QMM_005fOCL_MapExp_0_0(QualityMetamodel.QMM_OCL.MapExp element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print(",");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("elements");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.MAP_EXP__ELEMENTS));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("elements", count - 1);
		}
	}
	
	
	public void print_QualityMetamodel_QMM_005fOCL_MapElement(QualityMetamodel.QMM_OCL.MapElement element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(7);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.MAP_ELEMENT__MAP));
		printCountingMap.put("map", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.MAP_ELEMENT__KEY));
		printCountingMap.put("key", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.MAP_ELEMENT__VALUE));
		printCountingMap.put("value", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("key");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.MAP_ELEMENT__KEY));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("key", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(",");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("value");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.MAP_ELEMENT__VALUE));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("value", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
	}
	
	
	public void print_QualityMetamodel_QMM_005fOCL_EnumLiteralExp(QualityMetamodel.QMM_OCL.EnumLiteralExp element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(17);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.ENUM_LITERAL_EXP__TYPE));
		printCountingMap.put("type", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.ENUM_LITERAL_EXP__IF_EXP3));
		printCountingMap.put("ifExp3", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.ENUM_LITERAL_EXP__APPLIED_PROPERTY));
		printCountingMap.put("appliedProperty", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.ENUM_LITERAL_EXP__LET_EXP));
		printCountingMap.put("letExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.ENUM_LITERAL_EXP__LOOP_EXP));
		printCountingMap.put("loopExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.ENUM_LITERAL_EXP__PARENT_OPERATION));
		printCountingMap.put("parentOperation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.ENUM_LITERAL_EXP__INITIALIZED_VARIABLE));
		printCountingMap.put("initializedVariable", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.ENUM_LITERAL_EXP__IF_EXP2));
		printCountingMap.put("ifExp2", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.ENUM_LITERAL_EXP__OWNING_OPERATION));
		printCountingMap.put("owningOperation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.ENUM_LITERAL_EXP__IF_EXP1));
		printCountingMap.put("ifExp1", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.ENUM_LITERAL_EXP__OWNING_ATTRIBUTE));
		printCountingMap.put("owningAttribute", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.ENUM_LITERAL_EXP__APPLIED_OPERATOR));
		printCountingMap.put("appliedOperator", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.ENUM_LITERAL_EXP__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		// print collected hidden tokens
		// DEFINITION PART BEGINS (CsString)
		out.print("#");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_QualityMetamodel_QMM_005fOCL_EnumLiteralExp_0(element, localtab, out, printCountingMap);
	}
	
	public void print_QualityMetamodel_QMM_005fOCL_EnumLiteralExp_0(QualityMetamodel.QMM_OCL.EnumLiteralExp element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		int alt = -1;
		alt = 0;
		int matches = 		matchCount(printCountingMap, java.util.Arrays.asList(		"name"		));
		int tempMatchCount;
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"name"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (PlaceholderInQuotes)
				count = printCountingMap.get("name");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.ENUM_LITERAL_EXP__NAME));
					if (o != null) {
						QualityMetamodel.resource.qualitymetamodel.IQualitymetamodelTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34_92");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.ENUM_LITERAL_EXP__NAME), element));
						out.print(" ");
					}
					printCountingMap.put("name", count - 1);
				}
			}
			break;
			default:			// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
			count = printCountingMap.get("name");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.ENUM_LITERAL_EXP__NAME));
				if (o != null) {
					QualityMetamodel.resource.qualitymetamodel.IQualitymetamodelTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
					resolver.setOptions(getOptions());
					out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.ENUM_LITERAL_EXP__NAME), element));
					out.print(" ");
				}
				printCountingMap.put("name", count - 1);
			}
		}
	}
	
	
	public void print_QualityMetamodel_QMM_005fOCL_OclUndefinedExp(QualityMetamodel.QMM_OCL.OclUndefinedExp element, String outertab, java.io.PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(16);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.OCL_UNDEFINED_EXP__TYPE));
		printCountingMap.put("type", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.OCL_UNDEFINED_EXP__IF_EXP3));
		printCountingMap.put("ifExp3", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.OCL_UNDEFINED_EXP__APPLIED_PROPERTY));
		printCountingMap.put("appliedProperty", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.OCL_UNDEFINED_EXP__LET_EXP));
		printCountingMap.put("letExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.OCL_UNDEFINED_EXP__LOOP_EXP));
		printCountingMap.put("loopExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.OCL_UNDEFINED_EXP__PARENT_OPERATION));
		printCountingMap.put("parentOperation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.OCL_UNDEFINED_EXP__INITIALIZED_VARIABLE));
		printCountingMap.put("initializedVariable", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.OCL_UNDEFINED_EXP__IF_EXP2));
		printCountingMap.put("ifExp2", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.OCL_UNDEFINED_EXP__OWNING_OPERATION));
		printCountingMap.put("owningOperation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.OCL_UNDEFINED_EXP__IF_EXP1));
		printCountingMap.put("ifExp1", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.OCL_UNDEFINED_EXP__OWNING_ATTRIBUTE));
		printCountingMap.put("owningAttribute", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.OCL_UNDEFINED_EXP__APPLIED_OPERATOR));
		printCountingMap.put("appliedOperator", temp == null ? 0 : 1);
		// print collected hidden tokens
		// DEFINITION PART BEGINS (CsString)
		out.print("OclUndefined");
		out.print(" ");
	}
	
	
	public void print_QualityMetamodel_QMM_005fOCL_LetExp(QualityMetamodel.QMM_OCL.LetExp element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(18);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.LET_EXP__TYPE));
		printCountingMap.put("type", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.LET_EXP__IF_EXP3));
		printCountingMap.put("ifExp3", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.LET_EXP__APPLIED_PROPERTY));
		printCountingMap.put("appliedProperty", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.LET_EXP__LET_EXP));
		printCountingMap.put("letExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.LET_EXP__LOOP_EXP));
		printCountingMap.put("loopExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.LET_EXP__PARENT_OPERATION));
		printCountingMap.put("parentOperation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.LET_EXP__INITIALIZED_VARIABLE));
		printCountingMap.put("initializedVariable", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.LET_EXP__IF_EXP2));
		printCountingMap.put("ifExp2", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.LET_EXP__OWNING_OPERATION));
		printCountingMap.put("owningOperation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.LET_EXP__IF_EXP1));
		printCountingMap.put("ifExp1", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.LET_EXP__OWNING_ATTRIBUTE));
		printCountingMap.put("owningAttribute", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.LET_EXP__APPLIED_OPERATOR));
		printCountingMap.put("appliedOperator", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.LET_EXP__VARIABLE));
		printCountingMap.put("variable", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.LET_EXP__IN_));
		printCountingMap.put("in_", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("let");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("variable");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.LET_EXP__VARIABLE));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("variable", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("in");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("in_");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.LET_EXP__IN_));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("in_", count - 1);
		}
	}
	
	
	public void print_QualityMetamodel_QMM_005fOCL_IfExp(QualityMetamodel.QMM_OCL.IfExp element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(19);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.IF_EXP__TYPE));
		printCountingMap.put("type", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.IF_EXP__IF_EXP3));
		printCountingMap.put("ifExp3", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.IF_EXP__APPLIED_PROPERTY));
		printCountingMap.put("appliedProperty", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.IF_EXP__LET_EXP));
		printCountingMap.put("letExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.IF_EXP__LOOP_EXP));
		printCountingMap.put("loopExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.IF_EXP__PARENT_OPERATION));
		printCountingMap.put("parentOperation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.IF_EXP__INITIALIZED_VARIABLE));
		printCountingMap.put("initializedVariable", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.IF_EXP__IF_EXP2));
		printCountingMap.put("ifExp2", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.IF_EXP__OWNING_OPERATION));
		printCountingMap.put("owningOperation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.IF_EXP__IF_EXP1));
		printCountingMap.put("ifExp1", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.IF_EXP__OWNING_ATTRIBUTE));
		printCountingMap.put("owningAttribute", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.IF_EXP__APPLIED_OPERATOR));
		printCountingMap.put("appliedOperator", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.IF_EXP__THEN_EXPRESSION));
		printCountingMap.put("thenExpression", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.IF_EXP__CONDITION));
		printCountingMap.put("condition", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.IF_EXP__ELSE_EXPRESSION));
		printCountingMap.put("elseExpression", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("if");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("condition");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.IF_EXP__CONDITION));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("condition", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("then");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("thenExpression");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.IF_EXP__THEN_EXPRESSION));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("thenExpression", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("else");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("elseExpression");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.IF_EXP__ELSE_EXPRESSION));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("elseExpression", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("endif");
		out.print(" ");
	}
	
	
	public void print_QualityMetamodel_QMM_005fOCL_BraceExp(QualityMetamodel.QMM_OCL.BraceExp element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(17);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.BRACE_EXP__TYPE));
		printCountingMap.put("type", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.BRACE_EXP__IF_EXP3));
		printCountingMap.put("ifExp3", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.BRACE_EXP__APPLIED_PROPERTY));
		printCountingMap.put("appliedProperty", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.BRACE_EXP__LET_EXP));
		printCountingMap.put("letExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.BRACE_EXP__LOOP_EXP));
		printCountingMap.put("loopExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.BRACE_EXP__PARENT_OPERATION));
		printCountingMap.put("parentOperation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.BRACE_EXP__INITIALIZED_VARIABLE));
		printCountingMap.put("initializedVariable", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.BRACE_EXP__IF_EXP2));
		printCountingMap.put("ifExp2", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.BRACE_EXP__OWNING_OPERATION));
		printCountingMap.put("owningOperation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.BRACE_EXP__IF_EXP1));
		printCountingMap.put("ifExp1", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.BRACE_EXP__OWNING_ATTRIBUTE));
		printCountingMap.put("owningAttribute", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.BRACE_EXP__APPLIED_OPERATOR));
		printCountingMap.put("appliedOperator", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.BRACE_EXP__EXP));
		printCountingMap.put("exp", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("exp");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.BRACE_EXP__EXP));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("exp", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
	}
	
	
	public void print_QualityMetamodel_QMM_005fOCL_OperatorCallExp(QualityMetamodel.QMM_OCL.OperatorCallExp element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(19);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.OPERATOR_CALL_EXP__TYPE));
		printCountingMap.put("type", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.OPERATOR_CALL_EXP__IF_EXP3));
		printCountingMap.put("ifExp3", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.OPERATOR_CALL_EXP__APPLIED_PROPERTY));
		printCountingMap.put("appliedProperty", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.OPERATOR_CALL_EXP__LET_EXP));
		printCountingMap.put("letExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.OPERATOR_CALL_EXP__LOOP_EXP));
		printCountingMap.put("loopExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.OPERATOR_CALL_EXP__PARENT_OPERATION));
		printCountingMap.put("parentOperation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.OPERATOR_CALL_EXP__INITIALIZED_VARIABLE));
		printCountingMap.put("initializedVariable", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.OPERATOR_CALL_EXP__IF_EXP2));
		printCountingMap.put("ifExp2", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.OPERATOR_CALL_EXP__OWNING_OPERATION));
		printCountingMap.put("owningOperation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.OPERATOR_CALL_EXP__IF_EXP1));
		printCountingMap.put("ifExp1", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.OPERATOR_CALL_EXP__OWNING_ATTRIBUTE));
		printCountingMap.put("owningAttribute", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.OPERATOR_CALL_EXP__APPLIED_OPERATOR));
		printCountingMap.put("appliedOperator", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.OPERATOR_CALL_EXP__ARGUMENT));
		printCountingMap.put("argument", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.OPERATOR_CALL_EXP__OPERATION_NAME));
		printCountingMap.put("operationName", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.OPERATOR_CALL_EXP__SOURCE));
		printCountingMap.put("source", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("source");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.OPERATOR_CALL_EXP__SOURCE));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("source", count - 1);
		}
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("operationName");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.OPERATOR_CALL_EXP__OPERATION_NAME));
			if (o != null) {
				QualityMetamodel.resource.qualitymetamodel.IQualitymetamodelTokenResolver resolver = tokenResolverFactory.createTokenResolver("BOOLOP");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.OPERATOR_CALL_EXP__OPERATION_NAME), element));
				out.print(" ");
			}
			printCountingMap.put("operationName", count - 1);
		}
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("argument");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.OPERATOR_CALL_EXP__ARGUMENT));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("argument", count - 1);
		}
	}
	
	
	public void print_QualityMetamodel_QMM_005fOCL_EqOpCallExp(QualityMetamodel.QMM_OCL.EqOpCallExp element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(19);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.EQ_OP_CALL_EXP__TYPE));
		printCountingMap.put("type", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.EQ_OP_CALL_EXP__IF_EXP3));
		printCountingMap.put("ifExp3", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.EQ_OP_CALL_EXP__APPLIED_PROPERTY));
		printCountingMap.put("appliedProperty", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.EQ_OP_CALL_EXP__LET_EXP));
		printCountingMap.put("letExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.EQ_OP_CALL_EXP__LOOP_EXP));
		printCountingMap.put("loopExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.EQ_OP_CALL_EXP__PARENT_OPERATION));
		printCountingMap.put("parentOperation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.EQ_OP_CALL_EXP__INITIALIZED_VARIABLE));
		printCountingMap.put("initializedVariable", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.EQ_OP_CALL_EXP__IF_EXP2));
		printCountingMap.put("ifExp2", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.EQ_OP_CALL_EXP__OWNING_OPERATION));
		printCountingMap.put("owningOperation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.EQ_OP_CALL_EXP__IF_EXP1));
		printCountingMap.put("ifExp1", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.EQ_OP_CALL_EXP__OWNING_ATTRIBUTE));
		printCountingMap.put("owningAttribute", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.EQ_OP_CALL_EXP__APPLIED_OPERATOR));
		printCountingMap.put("appliedOperator", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.EQ_OP_CALL_EXP__ARGUMENT));
		printCountingMap.put("argument", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.EQ_OP_CALL_EXP__OPERATION_NAME));
		printCountingMap.put("operationName", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.EQ_OP_CALL_EXP__SOURCE));
		printCountingMap.put("source", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("source");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.EQ_OP_CALL_EXP__SOURCE));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("source", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_QualityMetamodel_QMM_005fOCL_EqOpCallExp_0(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("argument");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.EQ_OP_CALL_EXP__ARGUMENT));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("argument", count - 1);
		}
	}
	
	public void print_QualityMetamodel_QMM_005fOCL_EqOpCallExp_0(QualityMetamodel.QMM_OCL.EqOpCallExp element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		int alt = -1;
		alt = 0;
		int matches = 		matchCount(printCountingMap, java.util.Arrays.asList(		"operationName"		));
		int tempMatchCount;
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"operationName"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
				count = printCountingMap.get("operationName");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.EQ_OP_CALL_EXP__OPERATION_NAME));
					if (o != null) {
						QualityMetamodel.resource.qualitymetamodel.IQualitymetamodelTokenResolver resolver = tokenResolverFactory.createTokenResolver("NEQ");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.EQ_OP_CALL_EXP__OPERATION_NAME), element));
						out.print(" ");
					}
					printCountingMap.put("operationName", count - 1);
				}
			}
			break;
			default:			// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
			count = printCountingMap.get("operationName");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.EQ_OP_CALL_EXP__OPERATION_NAME));
				if (o != null) {
					QualityMetamodel.resource.qualitymetamodel.IQualitymetamodelTokenResolver resolver = tokenResolverFactory.createTokenResolver("EQ");
					resolver.setOptions(getOptions());
					out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.EQ_OP_CALL_EXP__OPERATION_NAME), element));
					out.print(" ");
				}
				printCountingMap.put("operationName", count - 1);
			}
		}
	}
	
	
	public void print_QualityMetamodel_QMM_005fOCL_RelOpCallExp(QualityMetamodel.QMM_OCL.RelOpCallExp element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(19);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.REL_OP_CALL_EXP__TYPE));
		printCountingMap.put("type", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.REL_OP_CALL_EXP__IF_EXP3));
		printCountingMap.put("ifExp3", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.REL_OP_CALL_EXP__APPLIED_PROPERTY));
		printCountingMap.put("appliedProperty", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.REL_OP_CALL_EXP__LET_EXP));
		printCountingMap.put("letExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.REL_OP_CALL_EXP__LOOP_EXP));
		printCountingMap.put("loopExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.REL_OP_CALL_EXP__PARENT_OPERATION));
		printCountingMap.put("parentOperation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.REL_OP_CALL_EXP__INITIALIZED_VARIABLE));
		printCountingMap.put("initializedVariable", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.REL_OP_CALL_EXP__IF_EXP2));
		printCountingMap.put("ifExp2", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.REL_OP_CALL_EXP__OWNING_OPERATION));
		printCountingMap.put("owningOperation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.REL_OP_CALL_EXP__IF_EXP1));
		printCountingMap.put("ifExp1", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.REL_OP_CALL_EXP__OWNING_ATTRIBUTE));
		printCountingMap.put("owningAttribute", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.REL_OP_CALL_EXP__APPLIED_OPERATOR));
		printCountingMap.put("appliedOperator", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.REL_OP_CALL_EXP__ARGUMENT));
		printCountingMap.put("argument", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.REL_OP_CALL_EXP__OPERATION_NAME));
		printCountingMap.put("operationName", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.REL_OP_CALL_EXP__SOURCE));
		printCountingMap.put("source", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("source");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.REL_OP_CALL_EXP__SOURCE));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("source", count - 1);
		}
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("operationName");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.REL_OP_CALL_EXP__OPERATION_NAME));
			if (o != null) {
				QualityMetamodel.resource.qualitymetamodel.IQualitymetamodelTokenResolver resolver = tokenResolverFactory.createTokenResolver("RELOP");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.REL_OP_CALL_EXP__OPERATION_NAME), element));
				out.print(" ");
			}
			printCountingMap.put("operationName", count - 1);
		}
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("argument");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.REL_OP_CALL_EXP__ARGUMENT));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("argument", count - 1);
		}
	}
	
	
	public void print_QualityMetamodel_QMM_005fOCL_AddOpCallExp(QualityMetamodel.QMM_OCL.AddOpCallExp element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(19);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.ADD_OP_CALL_EXP__TYPE));
		printCountingMap.put("type", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.ADD_OP_CALL_EXP__IF_EXP3));
		printCountingMap.put("ifExp3", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.ADD_OP_CALL_EXP__APPLIED_PROPERTY));
		printCountingMap.put("appliedProperty", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.ADD_OP_CALL_EXP__LET_EXP));
		printCountingMap.put("letExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.ADD_OP_CALL_EXP__LOOP_EXP));
		printCountingMap.put("loopExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.ADD_OP_CALL_EXP__PARENT_OPERATION));
		printCountingMap.put("parentOperation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.ADD_OP_CALL_EXP__INITIALIZED_VARIABLE));
		printCountingMap.put("initializedVariable", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.ADD_OP_CALL_EXP__IF_EXP2));
		printCountingMap.put("ifExp2", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.ADD_OP_CALL_EXP__OWNING_OPERATION));
		printCountingMap.put("owningOperation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.ADD_OP_CALL_EXP__IF_EXP1));
		printCountingMap.put("ifExp1", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.ADD_OP_CALL_EXP__OWNING_ATTRIBUTE));
		printCountingMap.put("owningAttribute", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.ADD_OP_CALL_EXP__APPLIED_OPERATOR));
		printCountingMap.put("appliedOperator", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.ADD_OP_CALL_EXP__ARGUMENT));
		printCountingMap.put("argument", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.ADD_OP_CALL_EXP__OPERATION_NAME));
		printCountingMap.put("operationName", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.ADD_OP_CALL_EXP__SOURCE));
		printCountingMap.put("source", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("source");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.ADD_OP_CALL_EXP__SOURCE));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("source", count - 1);
		}
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("operationName");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.ADD_OP_CALL_EXP__OPERATION_NAME));
			if (o != null) {
				QualityMetamodel.resource.qualitymetamodel.IQualitymetamodelTokenResolver resolver = tokenResolverFactory.createTokenResolver("ADDOP");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.ADD_OP_CALL_EXP__OPERATION_NAME), element));
				out.print(" ");
			}
			printCountingMap.put("operationName", count - 1);
		}
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("argument");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.ADD_OP_CALL_EXP__ARGUMENT));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("argument", count - 1);
		}
	}
	
	
	public void print_QualityMetamodel_QMM_005fOCL_IntOpCallExp(QualityMetamodel.QMM_OCL.IntOpCallExp element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(19);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.INT_OP_CALL_EXP__TYPE));
		printCountingMap.put("type", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.INT_OP_CALL_EXP__IF_EXP3));
		printCountingMap.put("ifExp3", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.INT_OP_CALL_EXP__APPLIED_PROPERTY));
		printCountingMap.put("appliedProperty", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.INT_OP_CALL_EXP__LET_EXP));
		printCountingMap.put("letExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.INT_OP_CALL_EXP__LOOP_EXP));
		printCountingMap.put("loopExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.INT_OP_CALL_EXP__PARENT_OPERATION));
		printCountingMap.put("parentOperation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.INT_OP_CALL_EXP__INITIALIZED_VARIABLE));
		printCountingMap.put("initializedVariable", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.INT_OP_CALL_EXP__IF_EXP2));
		printCountingMap.put("ifExp2", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.INT_OP_CALL_EXP__OWNING_OPERATION));
		printCountingMap.put("owningOperation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.INT_OP_CALL_EXP__IF_EXP1));
		printCountingMap.put("ifExp1", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.INT_OP_CALL_EXP__OWNING_ATTRIBUTE));
		printCountingMap.put("owningAttribute", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.INT_OP_CALL_EXP__APPLIED_OPERATOR));
		printCountingMap.put("appliedOperator", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.INT_OP_CALL_EXP__ARGUMENT));
		printCountingMap.put("argument", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.INT_OP_CALL_EXP__OPERATION_NAME));
		printCountingMap.put("operationName", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.INT_OP_CALL_EXP__SOURCE));
		printCountingMap.put("source", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("source");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.INT_OP_CALL_EXP__SOURCE));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("source", count - 1);
		}
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("operationName");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.INT_OP_CALL_EXP__OPERATION_NAME));
			if (o != null) {
				QualityMetamodel.resource.qualitymetamodel.IQualitymetamodelTokenResolver resolver = tokenResolverFactory.createTokenResolver("INTOP");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.INT_OP_CALL_EXP__OPERATION_NAME), element));
				out.print(" ");
			}
			printCountingMap.put("operationName", count - 1);
		}
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("argument");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.INT_OP_CALL_EXP__ARGUMENT));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("argument", count - 1);
		}
	}
	
	
	public void print_QualityMetamodel_QMM_005fOCL_MulOpCallExp(QualityMetamodel.QMM_OCL.MulOpCallExp element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(19);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.MUL_OP_CALL_EXP__TYPE));
		printCountingMap.put("type", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.MUL_OP_CALL_EXP__IF_EXP3));
		printCountingMap.put("ifExp3", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.MUL_OP_CALL_EXP__APPLIED_PROPERTY));
		printCountingMap.put("appliedProperty", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.MUL_OP_CALL_EXP__LET_EXP));
		printCountingMap.put("letExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.MUL_OP_CALL_EXP__LOOP_EXP));
		printCountingMap.put("loopExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.MUL_OP_CALL_EXP__PARENT_OPERATION));
		printCountingMap.put("parentOperation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.MUL_OP_CALL_EXP__INITIALIZED_VARIABLE));
		printCountingMap.put("initializedVariable", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.MUL_OP_CALL_EXP__IF_EXP2));
		printCountingMap.put("ifExp2", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.MUL_OP_CALL_EXP__OWNING_OPERATION));
		printCountingMap.put("owningOperation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.MUL_OP_CALL_EXP__IF_EXP1));
		printCountingMap.put("ifExp1", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.MUL_OP_CALL_EXP__OWNING_ATTRIBUTE));
		printCountingMap.put("owningAttribute", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.MUL_OP_CALL_EXP__APPLIED_OPERATOR));
		printCountingMap.put("appliedOperator", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.MUL_OP_CALL_EXP__ARGUMENT));
		printCountingMap.put("argument", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.MUL_OP_CALL_EXP__OPERATION_NAME));
		printCountingMap.put("operationName", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.MUL_OP_CALL_EXP__SOURCE));
		printCountingMap.put("source", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("source");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.MUL_OP_CALL_EXP__SOURCE));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("source", count - 1);
		}
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("operationName");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.MUL_OP_CALL_EXP__OPERATION_NAME));
			if (o != null) {
				QualityMetamodel.resource.qualitymetamodel.IQualitymetamodelTokenResolver resolver = tokenResolverFactory.createTokenResolver("MULOP");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.MUL_OP_CALL_EXP__OPERATION_NAME), element));
				out.print(" ");
			}
			printCountingMap.put("operationName", count - 1);
		}
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("argument");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.MUL_OP_CALL_EXP__ARGUMENT));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("argument", count - 1);
		}
	}
	
	
	public void print_QualityMetamodel_QMM_005fOCL_NotOpCallExp(QualityMetamodel.QMM_OCL.NotOpCallExp element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(19);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.NOT_OP_CALL_EXP__TYPE));
		printCountingMap.put("type", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.NOT_OP_CALL_EXP__IF_EXP3));
		printCountingMap.put("ifExp3", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.NOT_OP_CALL_EXP__APPLIED_PROPERTY));
		printCountingMap.put("appliedProperty", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.NOT_OP_CALL_EXP__LET_EXP));
		printCountingMap.put("letExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.NOT_OP_CALL_EXP__LOOP_EXP));
		printCountingMap.put("loopExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.NOT_OP_CALL_EXP__PARENT_OPERATION));
		printCountingMap.put("parentOperation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.NOT_OP_CALL_EXP__INITIALIZED_VARIABLE));
		printCountingMap.put("initializedVariable", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.NOT_OP_CALL_EXP__IF_EXP2));
		printCountingMap.put("ifExp2", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.NOT_OP_CALL_EXP__OWNING_OPERATION));
		printCountingMap.put("owningOperation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.NOT_OP_CALL_EXP__IF_EXP1));
		printCountingMap.put("ifExp1", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.NOT_OP_CALL_EXP__OWNING_ATTRIBUTE));
		printCountingMap.put("owningAttribute", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.NOT_OP_CALL_EXP__APPLIED_OPERATOR));
		printCountingMap.put("appliedOperator", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.NOT_OP_CALL_EXP__ARGUMENT));
		printCountingMap.put("argument", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.NOT_OP_CALL_EXP__OPERATION_NAME));
		printCountingMap.put("operationName", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.NOT_OP_CALL_EXP__SOURCE));
		printCountingMap.put("source", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("operationName");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.NOT_OP_CALL_EXP__OPERATION_NAME));
			if (o != null) {
				QualityMetamodel.resource.qualitymetamodel.IQualitymetamodelTokenResolver resolver = tokenResolverFactory.createTokenResolver("NOTOP");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.NOT_OP_CALL_EXP__OPERATION_NAME), element));
				out.print(" ");
			}
			printCountingMap.put("operationName", count - 1);
		}
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("source");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.NOT_OP_CALL_EXP__SOURCE));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("source", count - 1);
		}
	}
	
	
	public void print_QualityMetamodel_QMM_005fOCL_StaticPropertyCallExp(QualityMetamodel.QMM_OCL.StaticPropertyCallExp element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(18);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.STATIC_PROPERTY_CALL_EXP__TYPE));
		printCountingMap.put("type", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.STATIC_PROPERTY_CALL_EXP__IF_EXP3));
		printCountingMap.put("ifExp3", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.STATIC_PROPERTY_CALL_EXP__APPLIED_PROPERTY));
		printCountingMap.put("appliedProperty", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.STATIC_PROPERTY_CALL_EXP__LET_EXP));
		printCountingMap.put("letExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.STATIC_PROPERTY_CALL_EXP__LOOP_EXP));
		printCountingMap.put("loopExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.STATIC_PROPERTY_CALL_EXP__PARENT_OPERATION));
		printCountingMap.put("parentOperation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.STATIC_PROPERTY_CALL_EXP__INITIALIZED_VARIABLE));
		printCountingMap.put("initializedVariable", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.STATIC_PROPERTY_CALL_EXP__IF_EXP2));
		printCountingMap.put("ifExp2", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.STATIC_PROPERTY_CALL_EXP__OWNING_OPERATION));
		printCountingMap.put("owningOperation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.STATIC_PROPERTY_CALL_EXP__IF_EXP1));
		printCountingMap.put("ifExp1", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.STATIC_PROPERTY_CALL_EXP__OWNING_ATTRIBUTE));
		printCountingMap.put("owningAttribute", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.STATIC_PROPERTY_CALL_EXP__APPLIED_OPERATOR));
		printCountingMap.put("appliedOperator", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.STATIC_PROPERTY_CALL_EXP__SOURCE));
		printCountingMap.put("source", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.STATIC_PROPERTY_CALL_EXP__STATIC_CALL));
		printCountingMap.put("staticCall", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("source");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.STATIC_PROPERTY_CALL_EXP__SOURCE));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("source", count - 1);
		}
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("staticCall");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.STATIC_PROPERTY_CALL_EXP__STATIC_CALL));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("staticCall", count - 1);
		}
	}
	
	
	public void print_QualityMetamodel_QMM_005fOCL_StaticOperationCall(QualityMetamodel.QMM_OCL.StaticOperationCall element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(7);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.STATIC_OPERATION_CALL__STATIC_CALL_EXP));
		printCountingMap.put("staticCallExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.STATIC_OPERATION_CALL__ARGUMENTS));
		printCountingMap.put("arguments", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.STATIC_OPERATION_CALL__OPERATION_NAME));
		printCountingMap.put("operationName", temp == null ? 0 : 1);
		// print collected hidden tokens
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("::");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_QualityMetamodel_QMM_005fOCL_StaticOperationCall_0(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_QualityMetamodel_QMM_005fOCL_StaticOperationCall_1(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
	}
	
	public void print_QualityMetamodel_QMM_005fOCL_StaticOperationCall_0(QualityMetamodel.QMM_OCL.StaticOperationCall element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		int alt = -1;
		alt = 0;
		int matches = 		matchCount(printCountingMap, java.util.Arrays.asList(		"operationName"		));
		int tempMatchCount;
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"operationName"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (PlaceholderInQuotes)
				count = printCountingMap.get("operationName");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.STATIC_OPERATION_CALL__OPERATION_NAME));
					if (o != null) {
						QualityMetamodel.resource.qualitymetamodel.IQualitymetamodelTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34_92");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.STATIC_OPERATION_CALL__OPERATION_NAME), element));
						out.print(" ");
					}
					printCountingMap.put("operationName", count - 1);
				}
			}
			break;
			default:			// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
			count = printCountingMap.get("operationName");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.STATIC_OPERATION_CALL__OPERATION_NAME));
				if (o != null) {
					QualityMetamodel.resource.qualitymetamodel.IQualitymetamodelTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
					resolver.setOptions(getOptions());
					out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.STATIC_OPERATION_CALL__OPERATION_NAME), element));
					out.print(" ");
				}
				printCountingMap.put("operationName", count - 1);
			}
		}
	}
	
	public void print_QualityMetamodel_QMM_005fOCL_StaticOperationCall_1(QualityMetamodel.QMM_OCL.StaticOperationCall element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("arguments");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.STATIC_OPERATION_CALL__ARGUMENTS));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("arguments", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_QualityMetamodel_QMM_005fOCL_StaticOperationCall_1_0(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
	}
	
	public void print_QualityMetamodel_QMM_005fOCL_StaticOperationCall_1_0(QualityMetamodel.QMM_OCL.StaticOperationCall element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print(",");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("arguments");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.STATIC_OPERATION_CALL__ARGUMENTS));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("arguments", count - 1);
		}
	}
	
	
	public void print_QualityMetamodel_QMM_005fOCL_StaticNavigationOrAttributeCall(QualityMetamodel.QMM_OCL.StaticNavigationOrAttributeCall element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(6);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.STATIC_NAVIGATION_OR_ATTRIBUTE_CALL__STATIC_CALL_EXP));
		printCountingMap.put("staticCallExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.STATIC_NAVIGATION_OR_ATTRIBUTE_CALL__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		// print collected hidden tokens
		// DEFINITION PART BEGINS (CsString)
		out.print("::");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_QualityMetamodel_QMM_005fOCL_StaticNavigationOrAttributeCall_0(element, localtab, out, printCountingMap);
	}
	
	public void print_QualityMetamodel_QMM_005fOCL_StaticNavigationOrAttributeCall_0(QualityMetamodel.QMM_OCL.StaticNavigationOrAttributeCall element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		int alt = -1;
		alt = 0;
		int matches = 		matchCount(printCountingMap, java.util.Arrays.asList(		"name"		));
		int tempMatchCount;
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"name"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (PlaceholderInQuotes)
				count = printCountingMap.get("name");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.STATIC_NAVIGATION_OR_ATTRIBUTE_CALL__NAME));
					if (o != null) {
						QualityMetamodel.resource.qualitymetamodel.IQualitymetamodelTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34_92");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.STATIC_NAVIGATION_OR_ATTRIBUTE_CALL__NAME), element));
						out.print(" ");
					}
					printCountingMap.put("name", count - 1);
				}
			}
			break;
			default:			// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
			count = printCountingMap.get("name");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.STATIC_NAVIGATION_OR_ATTRIBUTE_CALL__NAME));
				if (o != null) {
					QualityMetamodel.resource.qualitymetamodel.IQualitymetamodelTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
					resolver.setOptions(getOptions());
					out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.STATIC_NAVIGATION_OR_ATTRIBUTE_CALL__NAME), element));
					out.print(" ");
				}
				printCountingMap.put("name", count - 1);
			}
		}
	}
	
	
	public void print_QualityMetamodel_QMM_005fOCL_PropertyCallExp(QualityMetamodel.QMM_OCL.PropertyCallExp element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(18);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.PROPERTY_CALL_EXP__TYPE));
		printCountingMap.put("type", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.PROPERTY_CALL_EXP__IF_EXP3));
		printCountingMap.put("ifExp3", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.PROPERTY_CALL_EXP__APPLIED_PROPERTY));
		printCountingMap.put("appliedProperty", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.PROPERTY_CALL_EXP__LET_EXP));
		printCountingMap.put("letExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.PROPERTY_CALL_EXP__LOOP_EXP));
		printCountingMap.put("loopExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.PROPERTY_CALL_EXP__PARENT_OPERATION));
		printCountingMap.put("parentOperation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.PROPERTY_CALL_EXP__INITIALIZED_VARIABLE));
		printCountingMap.put("initializedVariable", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.PROPERTY_CALL_EXP__IF_EXP2));
		printCountingMap.put("ifExp2", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.PROPERTY_CALL_EXP__OWNING_OPERATION));
		printCountingMap.put("owningOperation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.PROPERTY_CALL_EXP__IF_EXP1));
		printCountingMap.put("ifExp1", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.PROPERTY_CALL_EXP__OWNING_ATTRIBUTE));
		printCountingMap.put("owningAttribute", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.PROPERTY_CALL_EXP__APPLIED_OPERATOR));
		printCountingMap.put("appliedOperator", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.PROPERTY_CALL_EXP__CALLS));
		printCountingMap.put("calls", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.PROPERTY_CALL_EXP__SOURCE));
		printCountingMap.put("source", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("source");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.PROPERTY_CALL_EXP__SOURCE));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("source", count - 1);
		}
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("calls");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.PROPERTY_CALL_EXP__CALLS));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			java.util.ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				Object o = it.next();
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("calls", 0);
		}
	}
	
	
	public void print_QualityMetamodel_QMM_005fOCL_OperationCall(QualityMetamodel.QMM_OCL.OperationCall element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(7);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.OPERATION_CALL__CALL_EXP));
		printCountingMap.put("callExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.OPERATION_CALL__ARGUMENTS));
		printCountingMap.put("arguments", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.OPERATION_CALL__OPERATION_NAME));
		printCountingMap.put("operationName", temp == null ? 0 : 1);
		// print collected hidden tokens
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print(".");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_QualityMetamodel_QMM_005fOCL_OperationCall_0(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_QualityMetamodel_QMM_005fOCL_OperationCall_1(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
	}
	
	public void print_QualityMetamodel_QMM_005fOCL_OperationCall_0(QualityMetamodel.QMM_OCL.OperationCall element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		int alt = -1;
		alt = 0;
		int matches = 		matchCount(printCountingMap, java.util.Arrays.asList(		"operationName"		));
		int tempMatchCount;
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"operationName"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (PlaceholderInQuotes)
				count = printCountingMap.get("operationName");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.OPERATION_CALL__OPERATION_NAME));
					if (o != null) {
						QualityMetamodel.resource.qualitymetamodel.IQualitymetamodelTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34_92");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.OPERATION_CALL__OPERATION_NAME), element));
						out.print(" ");
					}
					printCountingMap.put("operationName", count - 1);
				}
			}
			break;
			default:			// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
			count = printCountingMap.get("operationName");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.OPERATION_CALL__OPERATION_NAME));
				if (o != null) {
					QualityMetamodel.resource.qualitymetamodel.IQualitymetamodelTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
					resolver.setOptions(getOptions());
					out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.OPERATION_CALL__OPERATION_NAME), element));
					out.print(" ");
				}
				printCountingMap.put("operationName", count - 1);
			}
		}
	}
	
	public void print_QualityMetamodel_QMM_005fOCL_OperationCall_1(QualityMetamodel.QMM_OCL.OperationCall element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("arguments");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.OPERATION_CALL__ARGUMENTS));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("arguments", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_QualityMetamodel_QMM_005fOCL_OperationCall_1_0(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
	}
	
	public void print_QualityMetamodel_QMM_005fOCL_OperationCall_1_0(QualityMetamodel.QMM_OCL.OperationCall element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print(",");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("arguments");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.OPERATION_CALL__ARGUMENTS));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("arguments", count - 1);
		}
	}
	
	
	public void print_QualityMetamodel_QMM_005fOCL_NavigationOrAttributeCall(QualityMetamodel.QMM_OCL.NavigationOrAttributeCall element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(6);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.NAVIGATION_OR_ATTRIBUTE_CALL__CALL_EXP));
		printCountingMap.put("callExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.NAVIGATION_OR_ATTRIBUTE_CALL__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		// print collected hidden tokens
		// DEFINITION PART BEGINS (CsString)
		out.print(".");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_QualityMetamodel_QMM_005fOCL_NavigationOrAttributeCall_0(element, localtab, out, printCountingMap);
	}
	
	public void print_QualityMetamodel_QMM_005fOCL_NavigationOrAttributeCall_0(QualityMetamodel.QMM_OCL.NavigationOrAttributeCall element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		int alt = -1;
		alt = 0;
		int matches = 		matchCount(printCountingMap, java.util.Arrays.asList(		"name"		));
		int tempMatchCount;
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"name"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (PlaceholderInQuotes)
				count = printCountingMap.get("name");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.NAVIGATION_OR_ATTRIBUTE_CALL__NAME));
					if (o != null) {
						QualityMetamodel.resource.qualitymetamodel.IQualitymetamodelTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34_92");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.NAVIGATION_OR_ATTRIBUTE_CALL__NAME), element));
						out.print(" ");
					}
					printCountingMap.put("name", count - 1);
				}
			}
			break;
			default:			// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
			count = printCountingMap.get("name");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.NAVIGATION_OR_ATTRIBUTE_CALL__NAME));
				if (o != null) {
					QualityMetamodel.resource.qualitymetamodel.IQualitymetamodelTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
					resolver.setOptions(getOptions());
					out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.NAVIGATION_OR_ATTRIBUTE_CALL__NAME), element));
					out.print(" ");
				}
				printCountingMap.put("name", count - 1);
			}
		}
	}
	
	
	public void print_QualityMetamodel_QMM_005fOCL_IterateExp(QualityMetamodel.QMM_OCL.IterateExp element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(8);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.ITERATE_EXP__CALL_EXP));
		printCountingMap.put("callExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.ITERATE_EXP__BODY));
		printCountingMap.put("body", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.ITERATE_EXP__ITERATORS));
		printCountingMap.put("iterators", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.ITERATE_EXP__RESULT));
		printCountingMap.put("result", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("->");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("iterate");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("iterators");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.ITERATE_EXP__ITERATORS));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("iterators", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_QualityMetamodel_QMM_005fOCL_IterateExp_0(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(";");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("result");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.ITERATE_EXP__RESULT));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("result", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("|");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("body");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.ITERATE_EXP__BODY));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("body", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
	}
	
	public void print_QualityMetamodel_QMM_005fOCL_IterateExp_0(QualityMetamodel.QMM_OCL.IterateExp element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print(",");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("iterators");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.ITERATE_EXP__ITERATORS));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("iterators", count - 1);
		}
	}
	
	
	public void print_QualityMetamodel_QMM_005fOCL_IteratorExp(QualityMetamodel.QMM_OCL.IteratorExp element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(8);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.ITERATOR_EXP__CALL_EXP));
		printCountingMap.put("callExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.ITERATOR_EXP__BODY));
		printCountingMap.put("body", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.ITERATOR_EXP__ITERATORS));
		printCountingMap.put("iterators", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.ITERATOR_EXP__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("->");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_QualityMetamodel_QMM_005fOCL_IteratorExp_0(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("iterators");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.ITERATOR_EXP__ITERATORS));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("iterators", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_QualityMetamodel_QMM_005fOCL_IteratorExp_1(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("|");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("body");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.ITERATOR_EXP__BODY));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("body", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
	}
	
	public void print_QualityMetamodel_QMM_005fOCL_IteratorExp_0(QualityMetamodel.QMM_OCL.IteratorExp element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		int alt = -1;
		alt = 0;
		int matches = 		matchCount(printCountingMap, java.util.Arrays.asList(		"name"		));
		int tempMatchCount;
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"name"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (PlaceholderInQuotes)
				count = printCountingMap.get("name");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.ITERATOR_EXP__NAME));
					if (o != null) {
						QualityMetamodel.resource.qualitymetamodel.IQualitymetamodelTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34_92");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.ITERATOR_EXP__NAME), element));
						out.print(" ");
					}
					printCountingMap.put("name", count - 1);
				}
			}
			break;
			default:			// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
			count = printCountingMap.get("name");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.ITERATOR_EXP__NAME));
				if (o != null) {
					QualityMetamodel.resource.qualitymetamodel.IQualitymetamodelTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
					resolver.setOptions(getOptions());
					out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.ITERATOR_EXP__NAME), element));
					out.print(" ");
				}
				printCountingMap.put("name", count - 1);
			}
		}
	}
	
	public void print_QualityMetamodel_QMM_005fOCL_IteratorExp_1(QualityMetamodel.QMM_OCL.IteratorExp element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print(",");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("iterators");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.ITERATOR_EXP__ITERATORS));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("iterators", count - 1);
		}
	}
	
	
	public void print_QualityMetamodel_QMM_005fOCL_Iterator(QualityMetamodel.QMM_OCL.Iterator element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(8);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.ITERATOR__VAR_NAME));
		printCountingMap.put("varName", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.ITERATOR__TYPE));
		printCountingMap.put("type", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.ITERATOR__VARIABLE_EXP));
		printCountingMap.put("variableExp", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.ITERATOR__LOOP_EXPR));
		printCountingMap.put("loopExpr", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("varName");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.ITERATOR__VAR_NAME));
			if (o != null) {
				QualityMetamodel.resource.qualitymetamodel.IQualitymetamodelTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.ITERATOR__VAR_NAME), element));
				out.print(" ");
			}
			printCountingMap.put("varName", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_QualityMetamodel_QMM_005fOCL_Iterator_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
	}
	
	public void print_QualityMetamodel_QMM_005fOCL_Iterator_0(QualityMetamodel.QMM_OCL.Iterator element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("type");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.ITERATOR__TYPE));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("type", count - 1);
		}
	}
	
	
	public void print_QualityMetamodel_QMM_005fOCL_CollectionOperationCall(QualityMetamodel.QMM_OCL.CollectionOperationCall element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(7);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.COLLECTION_OPERATION_CALL__CALL_EXP));
		printCountingMap.put("callExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.COLLECTION_OPERATION_CALL__ARGUMENTS));
		printCountingMap.put("arguments", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.COLLECTION_OPERATION_CALL__OPERATION_NAME));
		printCountingMap.put("operationName", temp == null ? 0 : 1);
		// print collected hidden tokens
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("->");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_QualityMetamodel_QMM_005fOCL_CollectionOperationCall_0(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_QualityMetamodel_QMM_005fOCL_CollectionOperationCall_1(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
	}
	
	public void print_QualityMetamodel_QMM_005fOCL_CollectionOperationCall_0(QualityMetamodel.QMM_OCL.CollectionOperationCall element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		int alt = -1;
		alt = 0;
		int matches = 		matchCount(printCountingMap, java.util.Arrays.asList(		"operationName"		));
		int tempMatchCount;
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"operationName"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (PlaceholderInQuotes)
				count = printCountingMap.get("operationName");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.COLLECTION_OPERATION_CALL__OPERATION_NAME));
					if (o != null) {
						QualityMetamodel.resource.qualitymetamodel.IQualitymetamodelTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34_92");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.COLLECTION_OPERATION_CALL__OPERATION_NAME), element));
						out.print(" ");
					}
					printCountingMap.put("operationName", count - 1);
				}
			}
			break;
			default:			// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
			count = printCountingMap.get("operationName");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.COLLECTION_OPERATION_CALL__OPERATION_NAME));
				if (o != null) {
					QualityMetamodel.resource.qualitymetamodel.IQualitymetamodelTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
					resolver.setOptions(getOptions());
					out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.COLLECTION_OPERATION_CALL__OPERATION_NAME), element));
					out.print(" ");
				}
				printCountingMap.put("operationName", count - 1);
			}
		}
	}
	
	public void print_QualityMetamodel_QMM_005fOCL_CollectionOperationCall_1(QualityMetamodel.QMM_OCL.CollectionOperationCall element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("arguments");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.COLLECTION_OPERATION_CALL__ARGUMENTS));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("arguments", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_QualityMetamodel_QMM_005fOCL_CollectionOperationCall_1_0(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
	}
	
	public void print_QualityMetamodel_QMM_005fOCL_CollectionOperationCall_1_0(QualityMetamodel.QMM_OCL.CollectionOperationCall element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print(",");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("arguments");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.COLLECTION_OPERATION_CALL__ARGUMENTS));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("arguments", count - 1);
		}
	}
	
	
	public void print_QualityMetamodel_QMM_005fOCL_CollectionType(QualityMetamodel.QMM_OCL.CollectionType element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(18);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.COLLECTION_TYPE__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.COLLECTION_TYPE__DEFINITIONS));
		printCountingMap.put("definitions", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.COLLECTION_TYPE__OCL_EXPRESSION));
		printCountingMap.put("oclExpression", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.COLLECTION_TYPE__OPERATION));
		printCountingMap.put("operation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.COLLECTION_TYPE__MAP_TYPE2));
		printCountingMap.put("mapType2", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.COLLECTION_TYPE__ATTRIBUTE));
		printCountingMap.put("attribute", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.COLLECTION_TYPE__MAP_TYPE));
		printCountingMap.put("mapType", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.COLLECTION_TYPE__COLLECTION_TYPES));
		printCountingMap.put("collectionTypes", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.COLLECTION_TYPE__TUPLE_TYPE_ATTRIBUTE));
		printCountingMap.put("tupleTypeAttribute", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.COLLECTION_TYPE__VARIABLE_DECLARATION));
		printCountingMap.put("variableDeclaration", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.COLLECTION_TYPE__LAMBDA_RETURN_TYPE));
		printCountingMap.put("lambdaReturnType", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.COLLECTION_TYPE__LAMBDA_ARG_TYPE));
		printCountingMap.put("lambdaArgType", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.COLLECTION_TYPE__STATIC_PROPERTY_CALL));
		printCountingMap.put("staticPropertyCall", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.COLLECTION_TYPE__ELEMENT_TYPE));
		printCountingMap.put("elementType", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.COLLECTION_TYPE__NAME));
			if (o != null) {
				QualityMetamodel.resource.qualitymetamodel.IQualitymetamodelTokenResolver resolver = tokenResolverFactory.createTokenResolver("COLLECTIONTYPE");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.COLLECTION_TYPE__NAME), element));
				out.print(" ");
			}
			printCountingMap.put("name", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("elementType");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.COLLECTION_TYPE__ELEMENT_TYPE));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("elementType", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
	}
	
	
	public void print_QualityMetamodel_QMM_005fOCL_StringType(QualityMetamodel.QMM_OCL.StringType element, String outertab, java.io.PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(17);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.STRING_TYPE__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.STRING_TYPE__DEFINITIONS));
		printCountingMap.put("definitions", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.STRING_TYPE__OCL_EXPRESSION));
		printCountingMap.put("oclExpression", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.STRING_TYPE__OPERATION));
		printCountingMap.put("operation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.STRING_TYPE__MAP_TYPE2));
		printCountingMap.put("mapType2", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.STRING_TYPE__ATTRIBUTE));
		printCountingMap.put("attribute", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.STRING_TYPE__MAP_TYPE));
		printCountingMap.put("mapType", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.STRING_TYPE__COLLECTION_TYPES));
		printCountingMap.put("collectionTypes", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.STRING_TYPE__TUPLE_TYPE_ATTRIBUTE));
		printCountingMap.put("tupleTypeAttribute", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.STRING_TYPE__VARIABLE_DECLARATION));
		printCountingMap.put("variableDeclaration", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.STRING_TYPE__LAMBDA_RETURN_TYPE));
		printCountingMap.put("lambdaReturnType", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.STRING_TYPE__LAMBDA_ARG_TYPE));
		printCountingMap.put("lambdaArgType", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.STRING_TYPE__STATIC_PROPERTY_CALL));
		printCountingMap.put("staticPropertyCall", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.STRING_TYPE__NAME));
			if (o != null) {
				QualityMetamodel.resource.qualitymetamodel.IQualitymetamodelTokenResolver resolver = tokenResolverFactory.createTokenResolver("STRINGTYPE");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.STRING_TYPE__NAME), element));
				out.print(" ");
			}
			printCountingMap.put("name", count - 1);
		}
	}
	
	
	public void print_QualityMetamodel_QMM_005fOCL_BooleanType(QualityMetamodel.QMM_OCL.BooleanType element, String outertab, java.io.PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(17);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.BOOLEAN_TYPE__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.BOOLEAN_TYPE__DEFINITIONS));
		printCountingMap.put("definitions", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.BOOLEAN_TYPE__OCL_EXPRESSION));
		printCountingMap.put("oclExpression", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.BOOLEAN_TYPE__OPERATION));
		printCountingMap.put("operation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.BOOLEAN_TYPE__MAP_TYPE2));
		printCountingMap.put("mapType2", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.BOOLEAN_TYPE__ATTRIBUTE));
		printCountingMap.put("attribute", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.BOOLEAN_TYPE__MAP_TYPE));
		printCountingMap.put("mapType", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.BOOLEAN_TYPE__COLLECTION_TYPES));
		printCountingMap.put("collectionTypes", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.BOOLEAN_TYPE__TUPLE_TYPE_ATTRIBUTE));
		printCountingMap.put("tupleTypeAttribute", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.BOOLEAN_TYPE__VARIABLE_DECLARATION));
		printCountingMap.put("variableDeclaration", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.BOOLEAN_TYPE__LAMBDA_RETURN_TYPE));
		printCountingMap.put("lambdaReturnType", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.BOOLEAN_TYPE__LAMBDA_ARG_TYPE));
		printCountingMap.put("lambdaArgType", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.BOOLEAN_TYPE__STATIC_PROPERTY_CALL));
		printCountingMap.put("staticPropertyCall", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.BOOLEAN_TYPE__NAME));
			if (o != null) {
				QualityMetamodel.resource.qualitymetamodel.IQualitymetamodelTokenResolver resolver = tokenResolverFactory.createTokenResolver("BOOLEANTYPE");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.BOOLEAN_TYPE__NAME), element));
				out.print(" ");
			}
			printCountingMap.put("name", count - 1);
		}
	}
	
	
	public void print_QualityMetamodel_QMM_005fOCL_IntegerType(QualityMetamodel.QMM_OCL.IntegerType element, String outertab, java.io.PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(17);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.INTEGER_TYPE__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.INTEGER_TYPE__DEFINITIONS));
		printCountingMap.put("definitions", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.INTEGER_TYPE__OCL_EXPRESSION));
		printCountingMap.put("oclExpression", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.INTEGER_TYPE__OPERATION));
		printCountingMap.put("operation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.INTEGER_TYPE__MAP_TYPE2));
		printCountingMap.put("mapType2", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.INTEGER_TYPE__ATTRIBUTE));
		printCountingMap.put("attribute", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.INTEGER_TYPE__MAP_TYPE));
		printCountingMap.put("mapType", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.INTEGER_TYPE__COLLECTION_TYPES));
		printCountingMap.put("collectionTypes", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.INTEGER_TYPE__TUPLE_TYPE_ATTRIBUTE));
		printCountingMap.put("tupleTypeAttribute", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.INTEGER_TYPE__VARIABLE_DECLARATION));
		printCountingMap.put("variableDeclaration", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.INTEGER_TYPE__LAMBDA_RETURN_TYPE));
		printCountingMap.put("lambdaReturnType", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.INTEGER_TYPE__LAMBDA_ARG_TYPE));
		printCountingMap.put("lambdaArgType", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.INTEGER_TYPE__STATIC_PROPERTY_CALL));
		printCountingMap.put("staticPropertyCall", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.INTEGER_TYPE__NAME));
			if (o != null) {
				QualityMetamodel.resource.qualitymetamodel.IQualitymetamodelTokenResolver resolver = tokenResolverFactory.createTokenResolver("INTEGERTYPE");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.INTEGER_TYPE__NAME), element));
				out.print(" ");
			}
			printCountingMap.put("name", count - 1);
		}
	}
	
	
	public void print_QualityMetamodel_QMM_005fOCL_RealType(QualityMetamodel.QMM_OCL.RealType element, String outertab, java.io.PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(17);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.REAL_TYPE__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.REAL_TYPE__DEFINITIONS));
		printCountingMap.put("definitions", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.REAL_TYPE__OCL_EXPRESSION));
		printCountingMap.put("oclExpression", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.REAL_TYPE__OPERATION));
		printCountingMap.put("operation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.REAL_TYPE__MAP_TYPE2));
		printCountingMap.put("mapType2", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.REAL_TYPE__ATTRIBUTE));
		printCountingMap.put("attribute", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.REAL_TYPE__MAP_TYPE));
		printCountingMap.put("mapType", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.REAL_TYPE__COLLECTION_TYPES));
		printCountingMap.put("collectionTypes", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.REAL_TYPE__TUPLE_TYPE_ATTRIBUTE));
		printCountingMap.put("tupleTypeAttribute", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.REAL_TYPE__VARIABLE_DECLARATION));
		printCountingMap.put("variableDeclaration", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.REAL_TYPE__LAMBDA_RETURN_TYPE));
		printCountingMap.put("lambdaReturnType", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.REAL_TYPE__LAMBDA_ARG_TYPE));
		printCountingMap.put("lambdaArgType", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.REAL_TYPE__STATIC_PROPERTY_CALL));
		printCountingMap.put("staticPropertyCall", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.REAL_TYPE__NAME));
			if (o != null) {
				QualityMetamodel.resource.qualitymetamodel.IQualitymetamodelTokenResolver resolver = tokenResolverFactory.createTokenResolver("REALTYPE");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.REAL_TYPE__NAME), element));
				out.print(" ");
			}
			printCountingMap.put("name", count - 1);
		}
	}
	
	
	public void print_QualityMetamodel_QMM_005fOCL_BagType(QualityMetamodel.QMM_OCL.BagType element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(18);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.BAG_TYPE__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.BAG_TYPE__DEFINITIONS));
		printCountingMap.put("definitions", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.BAG_TYPE__OCL_EXPRESSION));
		printCountingMap.put("oclExpression", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.BAG_TYPE__OPERATION));
		printCountingMap.put("operation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.BAG_TYPE__MAP_TYPE2));
		printCountingMap.put("mapType2", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.BAG_TYPE__ATTRIBUTE));
		printCountingMap.put("attribute", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.BAG_TYPE__MAP_TYPE));
		printCountingMap.put("mapType", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.BAG_TYPE__COLLECTION_TYPES));
		printCountingMap.put("collectionTypes", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.BAG_TYPE__TUPLE_TYPE_ATTRIBUTE));
		printCountingMap.put("tupleTypeAttribute", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.BAG_TYPE__VARIABLE_DECLARATION));
		printCountingMap.put("variableDeclaration", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.BAG_TYPE__LAMBDA_RETURN_TYPE));
		printCountingMap.put("lambdaReturnType", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.BAG_TYPE__LAMBDA_ARG_TYPE));
		printCountingMap.put("lambdaArgType", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.BAG_TYPE__STATIC_PROPERTY_CALL));
		printCountingMap.put("staticPropertyCall", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.BAG_TYPE__ELEMENT_TYPE));
		printCountingMap.put("elementType", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.BAG_TYPE__NAME));
			if (o != null) {
				QualityMetamodel.resource.qualitymetamodel.IQualitymetamodelTokenResolver resolver = tokenResolverFactory.createTokenResolver("BAGTYPE");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.BAG_TYPE__NAME), element));
				out.print(" ");
			}
			printCountingMap.put("name", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("elementType");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.BAG_TYPE__ELEMENT_TYPE));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("elementType", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
	}
	
	
	public void print_QualityMetamodel_QMM_005fOCL_OrderedSetType(QualityMetamodel.QMM_OCL.OrderedSetType element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(18);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.ORDERED_SET_TYPE__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.ORDERED_SET_TYPE__DEFINITIONS));
		printCountingMap.put("definitions", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.ORDERED_SET_TYPE__OCL_EXPRESSION));
		printCountingMap.put("oclExpression", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.ORDERED_SET_TYPE__OPERATION));
		printCountingMap.put("operation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.ORDERED_SET_TYPE__MAP_TYPE2));
		printCountingMap.put("mapType2", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.ORDERED_SET_TYPE__ATTRIBUTE));
		printCountingMap.put("attribute", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.ORDERED_SET_TYPE__MAP_TYPE));
		printCountingMap.put("mapType", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.ORDERED_SET_TYPE__COLLECTION_TYPES));
		printCountingMap.put("collectionTypes", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.ORDERED_SET_TYPE__TUPLE_TYPE_ATTRIBUTE));
		printCountingMap.put("tupleTypeAttribute", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.ORDERED_SET_TYPE__VARIABLE_DECLARATION));
		printCountingMap.put("variableDeclaration", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.ORDERED_SET_TYPE__LAMBDA_RETURN_TYPE));
		printCountingMap.put("lambdaReturnType", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.ORDERED_SET_TYPE__LAMBDA_ARG_TYPE));
		printCountingMap.put("lambdaArgType", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.ORDERED_SET_TYPE__STATIC_PROPERTY_CALL));
		printCountingMap.put("staticPropertyCall", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.ORDERED_SET_TYPE__ELEMENT_TYPE));
		printCountingMap.put("elementType", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.ORDERED_SET_TYPE__NAME));
			if (o != null) {
				QualityMetamodel.resource.qualitymetamodel.IQualitymetamodelTokenResolver resolver = tokenResolverFactory.createTokenResolver("ORDEREDSETTYPE");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.ORDERED_SET_TYPE__NAME), element));
				out.print(" ");
			}
			printCountingMap.put("name", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("elementType");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.ORDERED_SET_TYPE__ELEMENT_TYPE));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("elementType", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
	}
	
	
	public void print_QualityMetamodel_QMM_005fOCL_SequenceType(QualityMetamodel.QMM_OCL.SequenceType element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(18);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.SEQUENCE_TYPE__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.SEQUENCE_TYPE__DEFINITIONS));
		printCountingMap.put("definitions", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.SEQUENCE_TYPE__OCL_EXPRESSION));
		printCountingMap.put("oclExpression", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.SEQUENCE_TYPE__OPERATION));
		printCountingMap.put("operation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.SEQUENCE_TYPE__MAP_TYPE2));
		printCountingMap.put("mapType2", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.SEQUENCE_TYPE__ATTRIBUTE));
		printCountingMap.put("attribute", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.SEQUENCE_TYPE__MAP_TYPE));
		printCountingMap.put("mapType", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.SEQUENCE_TYPE__COLLECTION_TYPES));
		printCountingMap.put("collectionTypes", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.SEQUENCE_TYPE__TUPLE_TYPE_ATTRIBUTE));
		printCountingMap.put("tupleTypeAttribute", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.SEQUENCE_TYPE__VARIABLE_DECLARATION));
		printCountingMap.put("variableDeclaration", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.SEQUENCE_TYPE__LAMBDA_RETURN_TYPE));
		printCountingMap.put("lambdaReturnType", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.SEQUENCE_TYPE__LAMBDA_ARG_TYPE));
		printCountingMap.put("lambdaArgType", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.SEQUENCE_TYPE__STATIC_PROPERTY_CALL));
		printCountingMap.put("staticPropertyCall", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.SEQUENCE_TYPE__ELEMENT_TYPE));
		printCountingMap.put("elementType", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.SEQUENCE_TYPE__NAME));
			if (o != null) {
				QualityMetamodel.resource.qualitymetamodel.IQualitymetamodelTokenResolver resolver = tokenResolverFactory.createTokenResolver("SEQUENCETYPE");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.SEQUENCE_TYPE__NAME), element));
				out.print(" ");
			}
			printCountingMap.put("name", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("elementType");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.SEQUENCE_TYPE__ELEMENT_TYPE));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("elementType", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
	}
	
	
	public void print_QualityMetamodel_QMM_005fOCL_SetType(QualityMetamodel.QMM_OCL.SetType element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(18);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.SET_TYPE__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.SET_TYPE__DEFINITIONS));
		printCountingMap.put("definitions", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.SET_TYPE__OCL_EXPRESSION));
		printCountingMap.put("oclExpression", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.SET_TYPE__OPERATION));
		printCountingMap.put("operation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.SET_TYPE__MAP_TYPE2));
		printCountingMap.put("mapType2", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.SET_TYPE__ATTRIBUTE));
		printCountingMap.put("attribute", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.SET_TYPE__MAP_TYPE));
		printCountingMap.put("mapType", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.SET_TYPE__COLLECTION_TYPES));
		printCountingMap.put("collectionTypes", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.SET_TYPE__TUPLE_TYPE_ATTRIBUTE));
		printCountingMap.put("tupleTypeAttribute", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.SET_TYPE__VARIABLE_DECLARATION));
		printCountingMap.put("variableDeclaration", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.SET_TYPE__LAMBDA_RETURN_TYPE));
		printCountingMap.put("lambdaReturnType", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.SET_TYPE__LAMBDA_ARG_TYPE));
		printCountingMap.put("lambdaArgType", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.SET_TYPE__STATIC_PROPERTY_CALL));
		printCountingMap.put("staticPropertyCall", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.SET_TYPE__ELEMENT_TYPE));
		printCountingMap.put("elementType", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.SET_TYPE__NAME));
			if (o != null) {
				QualityMetamodel.resource.qualitymetamodel.IQualitymetamodelTokenResolver resolver = tokenResolverFactory.createTokenResolver("SETTYPE");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.SET_TYPE__NAME), element));
				out.print(" ");
			}
			printCountingMap.put("name", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("elementType");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.SET_TYPE__ELEMENT_TYPE));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("elementType", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
	}
	
	
	public void print_QualityMetamodel_QMM_005fOCL_OclAnyType(QualityMetamodel.QMM_OCL.OclAnyType element, String outertab, java.io.PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(17);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.OCL_ANY_TYPE__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.OCL_ANY_TYPE__DEFINITIONS));
		printCountingMap.put("definitions", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.OCL_ANY_TYPE__OCL_EXPRESSION));
		printCountingMap.put("oclExpression", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.OCL_ANY_TYPE__OPERATION));
		printCountingMap.put("operation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.OCL_ANY_TYPE__MAP_TYPE2));
		printCountingMap.put("mapType2", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.OCL_ANY_TYPE__ATTRIBUTE));
		printCountingMap.put("attribute", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.OCL_ANY_TYPE__MAP_TYPE));
		printCountingMap.put("mapType", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.OCL_ANY_TYPE__COLLECTION_TYPES));
		printCountingMap.put("collectionTypes", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.OCL_ANY_TYPE__TUPLE_TYPE_ATTRIBUTE));
		printCountingMap.put("tupleTypeAttribute", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.OCL_ANY_TYPE__VARIABLE_DECLARATION));
		printCountingMap.put("variableDeclaration", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.OCL_ANY_TYPE__LAMBDA_RETURN_TYPE));
		printCountingMap.put("lambdaReturnType", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.OCL_ANY_TYPE__LAMBDA_ARG_TYPE));
		printCountingMap.put("lambdaArgType", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.OCL_ANY_TYPE__STATIC_PROPERTY_CALL));
		printCountingMap.put("staticPropertyCall", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.OCL_ANY_TYPE__NAME));
			if (o != null) {
				QualityMetamodel.resource.qualitymetamodel.IQualitymetamodelTokenResolver resolver = tokenResolverFactory.createTokenResolver("OCLANYTYPE");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.OCL_ANY_TYPE__NAME), element));
				out.print(" ");
			}
			printCountingMap.put("name", count - 1);
		}
	}
	
	
	public void print_QualityMetamodel_QMM_005fOCL_OclType(QualityMetamodel.QMM_OCL.OclType element, String outertab, java.io.PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(17);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.OCL_TYPE__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.OCL_TYPE__DEFINITIONS));
		printCountingMap.put("definitions", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.OCL_TYPE__OCL_EXPRESSION));
		printCountingMap.put("oclExpression", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.OCL_TYPE__OPERATION));
		printCountingMap.put("operation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.OCL_TYPE__MAP_TYPE2));
		printCountingMap.put("mapType2", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.OCL_TYPE__ATTRIBUTE));
		printCountingMap.put("attribute", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.OCL_TYPE__MAP_TYPE));
		printCountingMap.put("mapType", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.OCL_TYPE__COLLECTION_TYPES));
		printCountingMap.put("collectionTypes", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.OCL_TYPE__TUPLE_TYPE_ATTRIBUTE));
		printCountingMap.put("tupleTypeAttribute", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.OCL_TYPE__VARIABLE_DECLARATION));
		printCountingMap.put("variableDeclaration", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.OCL_TYPE__LAMBDA_RETURN_TYPE));
		printCountingMap.put("lambdaReturnType", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.OCL_TYPE__LAMBDA_ARG_TYPE));
		printCountingMap.put("lambdaArgType", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.OCL_TYPE__STATIC_PROPERTY_CALL));
		printCountingMap.put("staticPropertyCall", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.OCL_TYPE__NAME));
			if (o != null) {
				QualityMetamodel.resource.qualitymetamodel.IQualitymetamodelTokenResolver resolver = tokenResolverFactory.createTokenResolver("OCLTYPE");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.OCL_TYPE__NAME), element));
				out.print(" ");
			}
			printCountingMap.put("name", count - 1);
		}
	}
	
	
	public void print_QualityMetamodel_QMM_005fOCL_TupleType(QualityMetamodel.QMM_OCL.TupleType element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(18);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.TUPLE_TYPE__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.TUPLE_TYPE__DEFINITIONS));
		printCountingMap.put("definitions", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.TUPLE_TYPE__OCL_EXPRESSION));
		printCountingMap.put("oclExpression", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.TUPLE_TYPE__OPERATION));
		printCountingMap.put("operation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.TUPLE_TYPE__MAP_TYPE2));
		printCountingMap.put("mapType2", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.TUPLE_TYPE__ATTRIBUTE));
		printCountingMap.put("attribute", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.TUPLE_TYPE__MAP_TYPE));
		printCountingMap.put("mapType", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.TUPLE_TYPE__COLLECTION_TYPES));
		printCountingMap.put("collectionTypes", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.TUPLE_TYPE__TUPLE_TYPE_ATTRIBUTE));
		printCountingMap.put("tupleTypeAttribute", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.TUPLE_TYPE__VARIABLE_DECLARATION));
		printCountingMap.put("variableDeclaration", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.TUPLE_TYPE__LAMBDA_RETURN_TYPE));
		printCountingMap.put("lambdaReturnType", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.TUPLE_TYPE__LAMBDA_ARG_TYPE));
		printCountingMap.put("lambdaArgType", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.TUPLE_TYPE__STATIC_PROPERTY_CALL));
		printCountingMap.put("staticPropertyCall", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.TUPLE_TYPE__ATTRIBUTES));
		printCountingMap.put("attributes", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_QualityMetamodel_QMM_005fOCL_TupleType_0(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_QualityMetamodel_QMM_005fOCL_TupleType_1(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
	}
	
	public void print_QualityMetamodel_QMM_005fOCL_TupleType_0(QualityMetamodel.QMM_OCL.TupleType element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		int alt = -1;
		alt = 0;
		int matches = 		matchCount(printCountingMap, java.util.Arrays.asList(		"name"		));
		int tempMatchCount;
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"name"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
				count = printCountingMap.get("name");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.TUPLE_TYPE__NAME));
					if (o != null) {
						QualityMetamodel.resource.qualitymetamodel.IQualitymetamodelTokenResolver resolver = tokenResolverFactory.createTokenResolver("TUPLE");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.TUPLE_TYPE__NAME), element));
						out.print(" ");
					}
					printCountingMap.put("name", count - 1);
				}
			}
			break;
			default:			// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
			count = printCountingMap.get("name");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.TUPLE_TYPE__NAME));
				if (o != null) {
					QualityMetamodel.resource.qualitymetamodel.IQualitymetamodelTokenResolver resolver = tokenResolverFactory.createTokenResolver("TUPLETYPE");
					resolver.setOptions(getOptions());
					out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.TUPLE_TYPE__NAME), element));
					out.print(" ");
				}
				printCountingMap.put("name", count - 1);
			}
		}
	}
	
	public void print_QualityMetamodel_QMM_005fOCL_TupleType_1(QualityMetamodel.QMM_OCL.TupleType element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("attributes");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.TUPLE_TYPE__ATTRIBUTES));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("attributes", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_QualityMetamodel_QMM_005fOCL_TupleType_1_0(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
	}
	
	public void print_QualityMetamodel_QMM_005fOCL_TupleType_1_0(QualityMetamodel.QMM_OCL.TupleType element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print(",");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("attributes");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.TUPLE_TYPE__ATTRIBUTES));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("attributes", count - 1);
		}
	}
	
	
	public void print_QualityMetamodel_QMM_005fOCL_TupleTypeAttribute(QualityMetamodel.QMM_OCL.TupleTypeAttribute element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(7);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.TUPLE_TYPE_ATTRIBUTE__TYPE));
		printCountingMap.put("type", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.TUPLE_TYPE_ATTRIBUTE__TUPLE_TYPE));
		printCountingMap.put("tupleType", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.TUPLE_TYPE_ATTRIBUTE__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_QualityMetamodel_QMM_005fOCL_TupleTypeAttribute_0(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("type");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.TUPLE_TYPE_ATTRIBUTE__TYPE));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("type", count - 1);
		}
	}
	
	public void print_QualityMetamodel_QMM_005fOCL_TupleTypeAttribute_0(QualityMetamodel.QMM_OCL.TupleTypeAttribute element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		int alt = -1;
		alt = 0;
		int matches = 		matchCount(printCountingMap, java.util.Arrays.asList(		"name"		));
		int tempMatchCount;
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"name"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (PlaceholderInQuotes)
				count = printCountingMap.get("name");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.TUPLE_TYPE_ATTRIBUTE__NAME));
					if (o != null) {
						QualityMetamodel.resource.qualitymetamodel.IQualitymetamodelTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34_92");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.TUPLE_TYPE_ATTRIBUTE__NAME), element));
						out.print(" ");
					}
					printCountingMap.put("name", count - 1);
				}
			}
			break;
			default:			// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
			count = printCountingMap.get("name");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.TUPLE_TYPE_ATTRIBUTE__NAME));
				if (o != null) {
					QualityMetamodel.resource.qualitymetamodel.IQualitymetamodelTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
					resolver.setOptions(getOptions());
					out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.TUPLE_TYPE_ATTRIBUTE__NAME), element));
					out.print(" ");
				}
				printCountingMap.put("name", count - 1);
			}
		}
	}
	
	
	public void print_QualityMetamodel_QMM_005fOCL_OclModelElement(QualityMetamodel.QMM_OCL.OclModelElement element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(18);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.OCL_MODEL_ELEMENT__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.OCL_MODEL_ELEMENT__DEFINITIONS));
		printCountingMap.put("definitions", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.OCL_MODEL_ELEMENT__OCL_EXPRESSION));
		printCountingMap.put("oclExpression", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.OCL_MODEL_ELEMENT__OPERATION));
		printCountingMap.put("operation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.OCL_MODEL_ELEMENT__MAP_TYPE2));
		printCountingMap.put("mapType2", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.OCL_MODEL_ELEMENT__ATTRIBUTE));
		printCountingMap.put("attribute", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.OCL_MODEL_ELEMENT__MAP_TYPE));
		printCountingMap.put("mapType", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.OCL_MODEL_ELEMENT__COLLECTION_TYPES));
		printCountingMap.put("collectionTypes", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.OCL_MODEL_ELEMENT__TUPLE_TYPE_ATTRIBUTE));
		printCountingMap.put("tupleTypeAttribute", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.OCL_MODEL_ELEMENT__VARIABLE_DECLARATION));
		printCountingMap.put("variableDeclaration", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.OCL_MODEL_ELEMENT__LAMBDA_RETURN_TYPE));
		printCountingMap.put("lambdaReturnType", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.OCL_MODEL_ELEMENT__LAMBDA_ARG_TYPE));
		printCountingMap.put("lambdaArgType", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.OCL_MODEL_ELEMENT__STATIC_PROPERTY_CALL));
		printCountingMap.put("staticPropertyCall", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.OCL_MODEL_ELEMENT__MODEL));
		printCountingMap.put("model", temp == null ? 0 : 1);
		// print collected hidden tokens
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_QualityMetamodel_QMM_005fOCL_OclModelElement_0(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (CsString)
		out.print("!");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_QualityMetamodel_QMM_005fOCL_OclModelElement_1(element, localtab, out, printCountingMap);
	}
	
	public void print_QualityMetamodel_QMM_005fOCL_OclModelElement_0(QualityMetamodel.QMM_OCL.OclModelElement element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		int alt = -1;
		alt = 0;
		int matches = 		matchCount(printCountingMap, java.util.Arrays.asList(		"model"		));
		int tempMatchCount;
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"model"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (PlaceholderInQuotes)
				count = printCountingMap.get("model");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.OCL_MODEL_ELEMENT__MODEL));
					if (o != null) {
						QualityMetamodel.resource.qualitymetamodel.IQualitymetamodelTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34_92");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getOclModelElementModelReferenceResolver().deResolve((QualityMetamodel.QMM_OCL.OclModel) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.OCL_MODEL_ELEMENT__MODEL)), element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.OCL_MODEL_ELEMENT__MODEL), element));
						out.print(" ");
					}
					printCountingMap.put("model", count - 1);
				}
			}
			break;
			default:			// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
			count = printCountingMap.get("model");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.OCL_MODEL_ELEMENT__MODEL));
				if (o != null) {
					QualityMetamodel.resource.qualitymetamodel.IQualitymetamodelTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
					resolver.setOptions(getOptions());
					out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getOclModelElementModelReferenceResolver().deResolve((QualityMetamodel.QMM_OCL.OclModel) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.OCL_MODEL_ELEMENT__MODEL)), element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.OCL_MODEL_ELEMENT__MODEL), element));
					out.print(" ");
				}
				printCountingMap.put("model", count - 1);
			}
		}
	}
	
	public void print_QualityMetamodel_QMM_005fOCL_OclModelElement_1(QualityMetamodel.QMM_OCL.OclModelElement element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		int alt = -1;
		alt = 0;
		int matches = 		matchCount(printCountingMap, java.util.Arrays.asList(		"name"		));
		int tempMatchCount;
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"name"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (PlaceholderInQuotes)
				count = printCountingMap.get("name");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.OCL_MODEL_ELEMENT__NAME));
					if (o != null) {
						QualityMetamodel.resource.qualitymetamodel.IQualitymetamodelTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34_92");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.OCL_MODEL_ELEMENT__NAME), element));
						out.print(" ");
					}
					printCountingMap.put("name", count - 1);
				}
			}
			break;
			default:			// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
			count = printCountingMap.get("name");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.OCL_MODEL_ELEMENT__NAME));
				if (o != null) {
					QualityMetamodel.resource.qualitymetamodel.IQualitymetamodelTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
					resolver.setOptions(getOptions());
					out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.OCL_MODEL_ELEMENT__NAME), element));
					out.print(" ");
				}
				printCountingMap.put("name", count - 1);
			}
		}
	}
	
	
	public void print_QualityMetamodel_QMM_005fOCL_MapType(QualityMetamodel.QMM_OCL.MapType element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(19);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.MAP_TYPE__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.MAP_TYPE__DEFINITIONS));
		printCountingMap.put("definitions", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.MAP_TYPE__OCL_EXPRESSION));
		printCountingMap.put("oclExpression", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.MAP_TYPE__OPERATION));
		printCountingMap.put("operation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.MAP_TYPE__MAP_TYPE2));
		printCountingMap.put("mapType2", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.MAP_TYPE__ATTRIBUTE));
		printCountingMap.put("attribute", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.MAP_TYPE__MAP_TYPE));
		printCountingMap.put("mapType", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.MAP_TYPE__COLLECTION_TYPES));
		printCountingMap.put("collectionTypes", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.MAP_TYPE__TUPLE_TYPE_ATTRIBUTE));
		printCountingMap.put("tupleTypeAttribute", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.MAP_TYPE__VARIABLE_DECLARATION));
		printCountingMap.put("variableDeclaration", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.MAP_TYPE__LAMBDA_RETURN_TYPE));
		printCountingMap.put("lambdaReturnType", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.MAP_TYPE__LAMBDA_ARG_TYPE));
		printCountingMap.put("lambdaArgType", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.MAP_TYPE__STATIC_PROPERTY_CALL));
		printCountingMap.put("staticPropertyCall", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.MAP_TYPE__VALUE_TYPE));
		printCountingMap.put("valueType", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.MAP_TYPE__KEY_TYPE));
		printCountingMap.put("keyType", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.MAP_TYPE__NAME));
			if (o != null) {
				QualityMetamodel.resource.qualitymetamodel.IQualitymetamodelTokenResolver resolver = tokenResolverFactory.createTokenResolver("MAPTYPE");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.MAP_TYPE__NAME), element));
				out.print(" ");
			}
			printCountingMap.put("name", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("keyType");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.MAP_TYPE__KEY_TYPE));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("keyType", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(",");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("valueType");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.MAP_TYPE__VALUE_TYPE));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("valueType", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
	}
	
	
	public void print_QualityMetamodel_QMM_005fOCL_LambdaType(QualityMetamodel.QMM_OCL.LambdaType element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(19);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.LAMBDA_TYPE__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.LAMBDA_TYPE__DEFINITIONS));
		printCountingMap.put("definitions", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.LAMBDA_TYPE__OCL_EXPRESSION));
		printCountingMap.put("oclExpression", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.LAMBDA_TYPE__OPERATION));
		printCountingMap.put("operation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.LAMBDA_TYPE__MAP_TYPE2));
		printCountingMap.put("mapType2", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.LAMBDA_TYPE__ATTRIBUTE));
		printCountingMap.put("attribute", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.LAMBDA_TYPE__MAP_TYPE));
		printCountingMap.put("mapType", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.LAMBDA_TYPE__COLLECTION_TYPES));
		printCountingMap.put("collectionTypes", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.LAMBDA_TYPE__TUPLE_TYPE_ATTRIBUTE));
		printCountingMap.put("tupleTypeAttribute", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.LAMBDA_TYPE__VARIABLE_DECLARATION));
		printCountingMap.put("variableDeclaration", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.LAMBDA_TYPE__LAMBDA_RETURN_TYPE));
		printCountingMap.put("lambdaReturnType", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.LAMBDA_TYPE__LAMBDA_ARG_TYPE));
		printCountingMap.put("lambdaArgType", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.LAMBDA_TYPE__STATIC_PROPERTY_CALL));
		printCountingMap.put("staticPropertyCall", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.LAMBDA_TYPE__RETURN_TYPE));
		printCountingMap.put("returnType", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.LAMBDA_TYPE__ARGUMENT_TYPES));
		printCountingMap.put("argumentTypes", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.LAMBDA_TYPE__NAME));
			if (o != null) {
				QualityMetamodel.resource.qualitymetamodel.IQualitymetamodelTokenResolver resolver = tokenResolverFactory.createTokenResolver("LAMBDATYPE");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.LAMBDA_TYPE__NAME), element));
				out.print(" ");
			}
			printCountingMap.put("name", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_QualityMetamodel_QMM_005fOCL_LambdaType_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("returnType");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.LAMBDA_TYPE__RETURN_TYPE));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("returnType", count - 1);
		}
	}
	
	public void print_QualityMetamodel_QMM_005fOCL_LambdaType_0(QualityMetamodel.QMM_OCL.LambdaType element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("argumentTypes");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.LAMBDA_TYPE__ARGUMENT_TYPES));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("argumentTypes", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_QualityMetamodel_QMM_005fOCL_LambdaType_0_0(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
	}
	
	public void print_QualityMetamodel_QMM_005fOCL_LambdaType_0_0(QualityMetamodel.QMM_OCL.LambdaType element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print(",");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("argumentTypes");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.LAMBDA_TYPE__ARGUMENT_TYPES));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("argumentTypes", count - 1);
		}
	}
	
	
	public void print_QualityMetamodel_QMM_005fOCL_EnvType(QualityMetamodel.QMM_OCL.EnvType element, String outertab, java.io.PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(17);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.ENV_TYPE__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.ENV_TYPE__DEFINITIONS));
		printCountingMap.put("definitions", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.ENV_TYPE__OCL_EXPRESSION));
		printCountingMap.put("oclExpression", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.ENV_TYPE__OPERATION));
		printCountingMap.put("operation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.ENV_TYPE__MAP_TYPE2));
		printCountingMap.put("mapType2", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.ENV_TYPE__ATTRIBUTE));
		printCountingMap.put("attribute", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.ENV_TYPE__MAP_TYPE));
		printCountingMap.put("mapType", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.ENV_TYPE__COLLECTION_TYPES));
		printCountingMap.put("collectionTypes", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.ENV_TYPE__TUPLE_TYPE_ATTRIBUTE));
		printCountingMap.put("tupleTypeAttribute", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.ENV_TYPE__VARIABLE_DECLARATION));
		printCountingMap.put("variableDeclaration", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.ENV_TYPE__LAMBDA_RETURN_TYPE));
		printCountingMap.put("lambdaReturnType", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.ENV_TYPE__LAMBDA_ARG_TYPE));
		printCountingMap.put("lambdaArgType", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.ENV_TYPE__STATIC_PROPERTY_CALL));
		printCountingMap.put("staticPropertyCall", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.ENV_TYPE__NAME));
			if (o != null) {
				QualityMetamodel.resource.qualitymetamodel.IQualitymetamodelTokenResolver resolver = tokenResolverFactory.createTokenResolver("ENVTYPE");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(QualityMetamodel.QMM_OCL.QMM_OCLPackage.ENV_TYPE__NAME), element));
				out.print(" ");
			}
			printCountingMap.put("name", count - 1);
		}
	}
	
	
}
