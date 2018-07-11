package qualityMetamodel.engine;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;

import QualityMetamodel.AggregatedValue;
import QualityMetamodel.IntegerValueType;
import QualityMetamodel.QualityAttribute;
import QualityMetamodel.QualityModel;
import QualityMetamodel.RealValueType;
import QualityMetamodel.SingleValue;
import QualityMetamodel.QMM_OCL.AddOpCallExp;
import QualityMetamodel.QMM_OCL.Attribute;
import QualityMetamodel.QMM_OCL.BagExp;
import QualityMetamodel.QMM_OCL.BagType;
import QualityMetamodel.QMM_OCL.BooleanExp;
import QualityMetamodel.QMM_OCL.BooleanType;
import QualityMetamodel.QMM_OCL.BraceExp;
import QualityMetamodel.QMM_OCL.CollectionExp;
import QualityMetamodel.QMM_OCL.CollectionType;
import QualityMetamodel.QMM_OCL.EnumLiteralExp;
import QualityMetamodel.QMM_OCL.IfExp;
import QualityMetamodel.QMM_OCL.IntegerExp;
import QualityMetamodel.QMM_OCL.IntegerType;
import QualityMetamodel.QMM_OCL.IterateExp;
import QualityMetamodel.QMM_OCL.Iterator;
import QualityMetamodel.QMM_OCL.IteratorExp;
import QualityMetamodel.QMM_OCL.LetExp;
import QualityMetamodel.QMM_OCL.LoopExp;
import QualityMetamodel.QMM_OCL.MapElement;
import QualityMetamodel.QMM_OCL.MapExp;
import QualityMetamodel.QMM_OCL.MapType;
import QualityMetamodel.QMM_OCL.MulOpCallExp;
import QualityMetamodel.QMM_OCL.NumericExp;
import QualityMetamodel.QMM_OCL.NumericType;
import QualityMetamodel.QMM_OCL.OclAnyType;
import QualityMetamodel.QMM_OCL.OclContextDefinition;
import QualityMetamodel.QMM_OCL.OclExpression;
import QualityMetamodel.QMM_OCL.OclFeature;
import QualityMetamodel.QMM_OCL.OclFeatureDefinition;
import QualityMetamodel.QMM_OCL.OclModel;
import QualityMetamodel.QMM_OCL.OclModelElement;
import QualityMetamodel.QMM_OCL.OclType;
import QualityMetamodel.QMM_OCL.OclUndefinedExp;
import QualityMetamodel.QMM_OCL.Operation;
import QualityMetamodel.QMM_OCL.OperatorCallExp;
import QualityMetamodel.QMM_OCL.OrderedSetExp;
import QualityMetamodel.QMM_OCL.OrderedSetType;
import QualityMetamodel.QMM_OCL.Parameter;
import QualityMetamodel.QMM_OCL.Primitive;
import QualityMetamodel.QMM_OCL.PrimitiveExp;
import QualityMetamodel.QMM_OCL.PropertyCallExp;
import QualityMetamodel.QMM_OCL.RealExp;
import QualityMetamodel.QMM_OCL.RealType;
import QualityMetamodel.QMM_OCL.SequenceExp;
import QualityMetamodel.QMM_OCL.SequenceType;
import QualityMetamodel.QMM_OCL.SetExp;
import QualityMetamodel.QMM_OCL.SetType;
import QualityMetamodel.QMM_OCL.StringExp;
import QualityMetamodel.QMM_OCL.StringType;
import QualityMetamodel.QMM_OCL.SuperExp;
import QualityMetamodel.QMM_OCL.TupleExp;
import QualityMetamodel.QMM_OCL.TuplePart;
import QualityMetamodel.QMM_OCL.TupleType;
import QualityMetamodel.QMM_OCL.TupleTypeAttribute;
import QualityMetamodel.QMM_OCL.VariableDeclaration;
import QualityMetamodel.QMM_OCL.VariableExp;

public class AbstractVisitor {
	protected boolean _debug = false;
	protected EObject current;
	
	@SuppressWarnings("rawtypes")
	public VisitingActions preStringToStringMap(java.util.Map.Entry self) { return new VisitingActions(); } 
	@SuppressWarnings("rawtypes")
	public void inStringToStringMap(java.util.Map.Entry self) { if ( _debug ) System.out.println("Visiting StringToStringMap"); }
	@SuppressWarnings("rawtypes")
	public void beforeStringToStringMap(java.util.Map.Entry self) { }
	@SuppressWarnings("rawtypes")
	public void afterStringToStringMap(java.util.Map.Entry self) { }
	public VisitingActions preIntegerExp(IntegerExp self) { return new VisitingActions(); } 
	public void inAggregatedValue(AggregatedValue self) { if ( _debug ) System.out.println("Visiting StringToStringMap"); }
	public void beforeAggregatedValue(AggregatedValue self) { }
	public void afterAggregatedValue(AggregatedValue self) { }
	public VisitingActions preAggregatedValue(AggregatedValue self) { return new VisitingActions("calculatedBy"); } 
	public void inSingleValue(SingleValue self) { if ( _debug ) System.out.println("Visiting StringToStringMap"); }
	public void beforeSingleValue(SingleValue self) { }
	public void afterSingleValue(SingleValue self) { }
	public VisitingActions preSingleValue(SingleValue self) { return new VisitingActions(); } 
	public void inBraceExp(BraceExp self) { if ( _debug ) System.out.println("Visiting StringToStringMap"); }
	public void beforeBraceExp(BraceExp self) { }
	public void afterBraceExp(BraceExp self) { }
	public VisitingActions preBraceExp(BraceExp self) { return new VisitingActions("exp"); } 
	public void inIntegerExp(IntegerExp self) { if ( _debug ) System.out.println("Visiting IntegerExp"); }
	public void beforeIntegerExp(IntegerExp self) { }
	public void afterIntegerExp(IntegerExp self) { }
	public VisitingActions preAddOpCallExp(AddOpCallExp self) { return new VisitingActions("source" , "argument"); }
	public VisitingActions preMulOpCallExp(MulOpCallExp self) { return new VisitingActions("source" , "argument"); }
	public VisitingActions preLetExp(LetExp self) { return new VisitingActions("annotations" , "type" , "variable" , "in_"); } 
	public void inLetExp(LetExp self) { if ( _debug ) System.out.println("Visiting LetExp"); }
	public void beforeLetExp(LetExp self) { }
	public void afterLetExp(LetExp self) { }
	public VisitingActions preBooleanType(BooleanType self) { return new VisitingActions("annotations" , "type"); } 
	public void inBooleanType(BooleanType self) { if ( _debug ) System.out.println("Visiting BooleanType"); }
	public void beforeBooleanType(BooleanType self) { }
	public void afterBooleanType(BooleanType self) { }
	public VisitingActions preTupleExp(TupleExp self) { return new VisitingActions("annotations" , "type" , "tuplePart"); } 
	public void inTupleExp(TupleExp self) { if ( _debug ) System.out.println("Visiting TupleExp"); }
	public void beforeTupleExp(TupleExp self) { }
	public void afterTupleExp(TupleExp self) { }
	public VisitingActions preOclType(OclType self) { return new VisitingActions("annotations" , "type"); } 
	public void inOclType(OclType self) { if ( _debug ) System.out.println("Visiting OclType"); }
	public void beforeOclType(OclType self) { }
	public void afterOclType(OclType self) { }
	public VisitingActions preOclModelElement(OclModelElement self) { return new VisitingActions("annotations" , "type"); } 
	public void inOclModelElement(OclModelElement self) { if ( _debug ) System.out.println("Visiting OclModelElement"); }
	public void beforeOclModelElement(OclModelElement self) { }
	public void afterOclModelElement(OclModelElement self) { }
	public VisitingActions preTuplePart(TuplePart self) { return new VisitingActions("annotations" , "type" , "initExpression"); } 
	public void inTuplePart(TuplePart self) { if ( _debug ) System.out.println("Visiting TuplePart"); }
	public void beforeTuplePart(TuplePart self) { }
	public void afterTuplePart(TuplePart self) { }
	public VisitingActions preIfExp(IfExp self) { return new VisitingActions("annotations" , "type" , "thenExpression" , "condition" , "elseExpression"); } 
	public void inIfExp(IfExp self) { if ( _debug ) System.out.println("Visiting IfExp"); }
	public void beforeIfExp(IfExp self) { }
	public void afterIfExp(IfExp self) { }
	public VisitingActions preMapType(MapType self) { return new VisitingActions("annotations" , "type" , "valueType" , "keyType"); } 
	public void inMapType(MapType self) { if ( _debug ) System.out.println("Visiting MapType"); }
	public void beforeMapType(MapType self) { }
	public void afterMapType(MapType self) { }
	public VisitingActions preIterator(Iterator self) { return new VisitingActions("annotations" , "type" , "initExpression"); } 
	public void inIterator(Iterator self) { if ( _debug ) System.out.println("Visiting Iterator"); }
	public void beforeIterator(Iterator self) { }
	public void afterIterator(Iterator self) { }
	public VisitingActions preSequenceType(SequenceType self) { return new VisitingActions("annotations" , "type" , "elementType"); } 
	public void inSequenceType(SequenceType self) { if ( _debug ) System.out.println("Visiting SequenceType"); }
	public void beforeSequenceType(SequenceType self) { }
	public void afterSequenceType(SequenceType self) { }
	public VisitingActions preOrderedSetType(OrderedSetType self) { return new VisitingActions("annotations" , "type" , "elementType"); } 
	public void inOrderedSetType(OrderedSetType self) { if ( _debug ) System.out.println("Visiting OrderedSetType"); }
	public void beforeOrderedSetType(OrderedSetType self) { }
	public void afterOrderedSetType(OrderedSetType self) { }
	public VisitingActions preOclAnyType(OclAnyType self) { return new VisitingActions("annotations" , "type"); } 
	public void inOclAnyType(OclAnyType self) { if ( _debug ) System.out.println("Visiting OclAnyType"); }
	public void beforeOclAnyType(OclAnyType self) { }
	public void afterOclAnyType(OclAnyType self) { }
	public VisitingActions prePropertyCallExp(PropertyCallExp self) { return new VisitingActions("source"); } 
	public void inPropertyCallExp(PropertyCallExp self) { if ( _debug ) System.out.println("Visiting PropertyCallExp"); }
	public void beforePropertyCallExp(PropertyCallExp self) { }
	public void afterPropertyCallExp(PropertyCallExp self) { }
	public VisitingActions preParameter(Parameter self) { return new VisitingActions("annotations" , "type" , "initExpression"); } 
	public void inParameter(Parameter self) { if ( _debug ) System.out.println("Visiting Parameter"); }
	public void beforeParameter(Parameter self) { }
	public void afterParameter(Parameter self) { }
	public VisitingActions preOclContextDefinition(OclContextDefinition self) { return new VisitingActions("annotations" , "context_"); } 
	public void inOclContextDefinition(OclContextDefinition self) { if ( _debug ) System.out.println("Visiting OclContextDefinition"); }
	public void beforeOclContextDefinition(OclContextDefinition self) { }
	public void afterOclContextDefinition(OclContextDefinition self) { }
	public VisitingActions preMapExp(MapExp self) { return new VisitingActions("annotations" , "type" , "elements"); } 
	public void inMapExp(MapExp self) { if ( _debug ) System.out.println("Visiting MapExp"); }
	public void beforeMapExp(MapExp self) { }
	public void afterMapExp(MapExp self) { }
	public VisitingActions preRealType(RealType self) { return new VisitingActions("annotations" , "type"); } 
	public void inRealType(RealType self) { if ( _debug ) System.out.println("Visiting RealType"); }
	public void beforeRealType(RealType self) { }
	public void afterRealType(RealType self) { }
	public VisitingActions prePrimitive(Primitive self) { return new VisitingActions("annotations" , "type"); } 
	public void inPrimitive(Primitive self) { if ( _debug ) System.out.println("Visiting Primitive"); }
	public void beforePrimitive(Primitive self) { }
	public void afterPrimitive(Primitive self) { }
	public VisitingActions preEnumLiteralExp(EnumLiteralExp self) { return new VisitingActions("annotations" , "type"); } 
	public void inEnumLiteralExp(EnumLiteralExp self) { if ( _debug ) System.out.println("Visiting EnumLiteralExp"); }
	public void beforeEnumLiteralExp(EnumLiteralExp self) { }
	public void afterEnumLiteralExp(EnumLiteralExp self) { }
	public VisitingActions preVariableDeclaration(VariableDeclaration self) { return new VisitingActions("annotations" , "type" , "initExpression"); } 
	public void inVariableDeclaration(VariableDeclaration self) { if ( _debug ) System.out.println("Visiting VariableDeclaration"); }
	public void beforeVariableDeclaration(VariableDeclaration self) { }
	public void afterVariableDeclaration(VariableDeclaration self) { }
	public VisitingActions preBagType(BagType self) { return new VisitingActions("annotations" , "type" , "elementType"); } 
	public void inBagType(BagType self) { if ( _debug ) System.out.println("Visiting BagType"); }
	public void beforeBagType(BagType self) { }
	public void afterBagType(BagType self) { }
	public VisitingActions preOclExpression(OclExpression self) { return new VisitingActions("annotations" , "type"); } 
	public void inOclExpression(OclExpression self) { if ( _debug ) System.out.println("Visiting OclExpression"); }
	public void beforeOclExpression(OclExpression self) { }
	public void afterOclExpression(OclExpression self) { }
	public VisitingActions preTupleTypeAttribute(TupleTypeAttribute self) { return new VisitingActions("annotations" , "type"); } 
	public void inTupleTypeAttribute(TupleTypeAttribute self) { if ( _debug ) System.out.println("Visiting TupleTypeAttribute"); }
	public void beforeTupleTypeAttribute(TupleTypeAttribute self) { }
	public void afterTupleTypeAttribute(TupleTypeAttribute self) { }
	public VisitingActions prePrimitiveExp(PrimitiveExp self) { return new VisitingActions("annotations" , "type"); } 
	public void inPrimitiveExp(PrimitiveExp self) { if ( _debug ) System.out.println("Visiting PrimitiveExp"); }
	public void beforePrimitiveExp(PrimitiveExp self) { }
	public void afterPrimitiveExp(PrimitiveExp self) { }
	public VisitingActions preRealExp(RealExp self) { return new VisitingActions(); } 
	public void inRealExp(RealExp self) { if ( _debug ) System.out.println("Visiting RealExp"); }
	public void beforeRealExp(RealExp self) { }
	public void afterRealExp(RealExp self) { }
	public VisitingActions preOclFeatureDefinition(OclFeatureDefinition self) { return new VisitingActions("annotations" , "feature" , "context_"); } 
	public void inOclFeatureDefinition(OclFeatureDefinition self) { if ( _debug ) System.out.println("Visiting OclFeatureDefinition"); }
	public void beforeOclFeatureDefinition(OclFeatureDefinition self) { }
	public void afterOclFeatureDefinition(OclFeatureDefinition self) { }
	public VisitingActions preIterateExp(IterateExp self) { return new VisitingActions("annotations" , "type" , "source" , "body" , "iterators" , "result"); } 
	public void inIterateExp(IterateExp self) { if ( _debug ) System.out.println("Visiting IterateExp"); }
	public void beforeIterateExp(IterateExp self) { }
	public void afterIterateExp(IterateExp self) { }
	public VisitingActions preOclUndefinedExp(OclUndefinedExp self) { return new VisitingActions("annotations" , "type"); } 
	public void inOclUndefinedExp(OclUndefinedExp self) { if ( _debug ) System.out.println("Visiting OclUndefinedExp"); }
	public void beforeOclUndefinedExp(OclUndefinedExp self) { }
	public void afterOclUndefinedExp(OclUndefinedExp self) { }
	public VisitingActions preAttribute(Attribute self) { return new VisitingActions("annotations" , "initExpression" , "type"); } 
	public void inAttribute(Attribute self) { if ( _debug ) System.out.println("Visiting Attribute"); }
	public void beforeAttribute(Attribute self) { }
	public void afterAttribute(Attribute self) { }
	public VisitingActions preTupleType(TupleType self) { return new VisitingActions("annotations" , "type" , "attributes"); } 
	public void inTupleType(TupleType self) { if ( _debug ) System.out.println("Visiting TupleType"); }
	public void beforeTupleType(TupleType self) { }
	public void afterTupleType(TupleType self) { }
	public VisitingActions preSuperExp(SuperExp self) { return new VisitingActions("annotations" , "type"); } 
	public void inSuperExp(SuperExp self) { if ( _debug ) System.out.println("Visiting SuperExp"); }
	public void beforeSuperExp(SuperExp self) { }
	public void afterSuperExp(SuperExp self) { }
	public VisitingActions preCollectionType(CollectionType self) { return new VisitingActions("annotations" , "type" , "elementType"); } 
	public void inCollectionType(CollectionType self) { if ( _debug ) System.out.println("Visiting CollectionType"); }
	public void beforeCollectionType(CollectionType self) { }
	public void afterCollectionType(CollectionType self) { }
	public VisitingActions preNumericType(NumericType self) { return new VisitingActions("annotations" , "type"); } 
	public void inNumericType(NumericType self) { if ( _debug ) System.out.println("Visiting NumericType"); }
	public void beforeNumericType(NumericType self) { }
	public void afterNumericType(NumericType self) { }
	public VisitingActions preSetType(SetType self) { return new VisitingActions("annotations" , "type" , "elementType"); } 
	public void inSetType(SetType self) { if ( _debug ) System.out.println("Visiting SetType"); }
	public void beforeSetType(SetType self) { }
	public void afterSetType(SetType self) { }
	public VisitingActions preBagExp(BagExp self) { return new VisitingActions("annotations" , "type" , "elements"); } 
	public void inBagExp(BagExp self) { if ( _debug ) System.out.println("Visiting BagExp"); }
	public void beforeBagExp(BagExp self) { }
	public void afterBagExp(BagExp self) { }
	public VisitingActions preNumericExp(NumericExp self) { return new VisitingActions("annotations" , "type"); } 
	public void inNumericExp(NumericExp self) { if ( _debug ) System.out.println("Visiting NumericExp"); }
	public void beforeNumericExp(NumericExp self) { }
	public void afterNumericExp(NumericExp self) { }

	public VisitingActions preBooleanExp(BooleanExp self) { return new VisitingActions("annotations" , "type"); } 
	public void inBooleanExp(BooleanExp self) { if ( _debug ) System.out.println("Visiting BooleanExp"); }
	public void beforeBooleanExp(BooleanExp self) { }
	public void afterBooleanExp(BooleanExp self) { }
	public VisitingActions preSetExp(SetExp self) { return new VisitingActions("annotations" , "type" , "elements"); } 
	public void inSetExp(SetExp self) { if ( _debug ) System.out.println("Visiting SetExp"); }
	public void beforeSetExp(SetExp self) { }
	public void afterSetExp(SetExp self) { }
	public VisitingActions preOperatorCallExp(OperatorCallExp self) { return new VisitingActions("annotations" , "type" , "source" , "arguments" , "resolveTempResolvedBy"); } 
	public void inOperatorCallExp(OperatorCallExp self) { if ( _debug ) System.out.println("Visiting OperatorCallExp"); }
	public void beforeOperatorCallExp(OperatorCallExp self) { }
	public void afterOperatorCallExp(OperatorCallExp self) { }
	public VisitingActions preSequenceExp(SequenceExp self) { return new VisitingActions("annotations" , "type" , "elements"); } 
	public void inSequenceExp(SequenceExp self) { if ( _debug ) System.out.println("Visiting SequenceExp"); }
	public void beforeSequenceExp(SequenceExp self) { }
	public void afterSequenceExp(SequenceExp self) { }
	public VisitingActions preMapElement(MapElement self) { return new VisitingActions("annotations" , "key" , "value"); } 
	public void inMapElement(MapElement self) { if ( _debug ) System.out.println("Visiting MapElement"); }
	public void beforeMapElement(MapElement self) { }
	public void afterMapElement(MapElement self) { }
	public VisitingActions preVariableExp(VariableExp self) { return new VisitingActions("referredVariable"); } 
	public void inVariableExp(VariableExp self) { if ( _debug ) System.out.println("Visiting VariableExp"); }
	public void beforeVariableExp(VariableExp self) { }
	public void afterVariableExp(VariableExp self) { }
	public VisitingActions preCollectionExp(CollectionExp self) { return new VisitingActions("annotations" , "type" , "elements"); } 
	public void inCollectionExp(CollectionExp self) { if ( _debug ) System.out.println("Visiting CollectionExp"); }
	public void beforeCollectionExp(CollectionExp self) { }
	public void afterCollectionExp(CollectionExp self) { }
	public VisitingActions preIteratorExp(IteratorExp self) { return new VisitingActions("annotations" , "type" , "source" , "body" , "iterators"); } 
	public void inIteratorExp(IteratorExp self) { if ( _debug ) System.out.println("Visiting IteratorExp"); }
	public void beforeIteratorExp(IteratorExp self) { }
	public void afterIteratorExp(IteratorExp self) { }
	public VisitingActions preIntegerType(IntegerType self) { return new VisitingActions("annotations" , "type"); } 
	public void inIntegerType(IntegerType self) { if ( _debug ) System.out.println("Visiting IntegerType"); }
	public void beforeIntegerType(IntegerType self) { }
	public void afterIntegerType(IntegerType self) { }
	public VisitingActions preOclModel(OclModel self) { return new VisitingActions("annotations"); } 
	public void inOclModel(OclModel self) { if ( _debug ) System.out.println("Visiting OclModel"); }
	public void beforeOclModel(OclModel self) { }
	public void afterOclModel(OclModel self) { }
	public VisitingActions preStringType(StringType self) { return new VisitingActions("annotations" , "type"); } 
	public void inStringType(StringType self) { if ( _debug ) System.out.println("Visiting StringType"); }
	public void beforeStringType(StringType self) { }
	public void afterStringType(StringType self) { }
	public VisitingActions preStringExp(StringExp self) { return new VisitingActions("annotations" , "type"); } 
	public void inStringExp(StringExp self) { if ( _debug ) System.out.println("Visiting StringExp"); }
	public void beforeStringExp(StringExp self) { }
	public void afterStringExp(StringExp self) { }
	public VisitingActions preLoopExp(LoopExp self) { return new VisitingActions("annotations" , "type" , "source" , "body" , "iterators"); } 
	public void inLoopExp(LoopExp self) { if ( _debug ) System.out.println("Visiting LoopExp"); }
	public void beforeLoopExp(LoopExp self) { }
	public void afterLoopExp(LoopExp self) { }
	public VisitingActions preOclFeature(OclFeature self) { return new VisitingActions("annotations"); } 
	public void inOclFeature(OclFeature self) { if ( _debug ) System.out.println("Visiting OclFeature"); }
	public void beforeOclFeature(OclFeature self) { }
	public void afterOclFeature(OclFeature self) { }
	public VisitingActions preOrderedSetExp(OrderedSetExp self) { return new VisitingActions("annotations" , "type" , "elements"); } 
	public void inOrderedSetExp(OrderedSetExp self) { if ( _debug ) System.out.println("Visiting OrderedSetExp"); }
	public void beforeOrderedSetExp(OrderedSetExp self) { }
	public void afterOrderedSetExp(OrderedSetExp self) { }
	public VisitingActions preOperation(Operation self) { return new VisitingActions("annotations" , "parameters" , "returnType" , "body"); } 
	public void inOperation(Operation self) { if ( _debug ) System.out.println("Visiting Operation"); }
	public void inAddOpCallExp(AddOpCallExp self) { if ( _debug ) System.out.println("Visiting Operation"); }
	public void inMulOpCallExp(MulOpCallExp self) { if ( _debug ) System.out.println("Visiting Operation"); }
	public void beforeOperation(Operation self) { }
	public void beforeAddOpCallExp(AddOpCallExp self) { }
	public void beforeMulOpCallExp(MulOpCallExp self) { }
	public void afterOperation(Operation self) { }
	public void afterAddOpCallExp(AddOpCallExp self) { }
	public void afterMulOpCallExp(MulOpCallExp self) { }
	public VisitingActions preOperation(QualityMetamodel.Operation self) { return new VisitingActions("ref"); } 
	public void inOperation(QualityMetamodel.Operation self) { if ( _debug ) System.out.println("Visiting Operation"); }
	public void beforeOperation(QualityMetamodel.Operation self) { }
	public void afterOperation(QualityMetamodel.Operation self) { }
	public VisitingActions preQualityModel(QualityModel self) { return new VisitingActions("qualityTypes", "qualityAttributes", "qualityValues"); } 
	public void inQualityModel(QualityModel self) { if ( _debug ) System.out.println("Visiting Operation"); }
	public void beforeQualityModel(QualityModel self) { }
	public void afterQualityModel(QualityModel self) { }
	
	public VisitingActions preRealValueType(RealValueType self) { return new VisitingActions(); } 
	public void inRealValueType(RealValueType self) { if ( _debug ) System.out.println("Visiting Operation"); }
	public void beforeRealValueType(RealValueType self) { }
	public void afterRealValueType(RealValueType self) { }
	public VisitingActions preIntegerValueType(IntegerValueType self) { return new VisitingActions(); } 
	public void inIntegerValueType(IntegerValueType self) { if ( _debug ) System.out.println("Visiting Operation"); }
	public void beforeIntegerValueType(IntegerValueType self) { }
	public void afterIntegerValueType(IntegerValueType self) { }
	
	public VisitingActions preQualityAttribute(QualityAttribute self) { return new VisitingActions("value"); } 
	public void inQualityAttribute(QualityAttribute self) { if ( _debug ) System.out.println("Visiting Operation"); }
	public void beforeQualityAttribute(QualityAttribute self) { }
	public void afterQualityAttribute(QualityAttribute self) { }

	protected VisitingActions actions(Object... things) {
		return new VisitingActions(things);
	}

	public void startVisiting(EObject init) {
		visit(init);
	}	
	
	public EObject getCurrent() { return current; }
	protected void setCurrent(EObject o) { current = o; }
	
	protected void visitQualityAttribute(QualityAttribute this_) {
		AbstractVisitor visitor = this;
		VisitingActions v = visitor.preQualityAttribute(this_);
		if ( v == null ) {
			return;
		}
	
		EObject pop = visitor.getCurrent();
		visitor.setCurrent(this_);
		visitor.beforeQualityAttribute(this_);
		
		visitActions(v, this_);		
					
		visitor.inQualityAttribute(this_);
		visitor.afterQualityAttribute(this_);
		visitor.setCurrent(pop);	
	}
	
	
	protected void visitIntegerExp(IntegerExp this_) {
		AbstractVisitor visitor = this;
		VisitingActions v = visitor.preIntegerExp(this_);
		if ( v == null ) {
			return;
		}
	
		EObject pop = visitor.getCurrent();
		visitor.setCurrent(this_);
		visitor.beforeIntegerExp(this_);
		
		visitActions(v, this_);		
					
		visitor.inIntegerExp(this_);
		visitor.afterIntegerExp(this_);
		visitor.setCurrent(pop);	
	}
	
	protected void visitRealValueType(RealValueType this_) {
		AbstractVisitor visitor = this;
		VisitingActions v = visitor.preRealValueType(this_);
		if ( v == null ) {
			return;
		}
	
		EObject pop = visitor.getCurrent();
		visitor.setCurrent(this_);
		visitor.beforeRealValueType(this_);
		
		visitActions(v, this_);		
					
		visitor.inRealValueType(this_);
		visitor.afterRealValueType(this_);
		visitor.setCurrent(pop);	
	}
	protected void visitIntegerValueType(IntegerValueType this_) {
		AbstractVisitor visitor = this;
		VisitingActions v = visitor.preIntegerValueType(this_);
		if ( v == null ) {
			return;
		}
	
		EObject pop = visitor.getCurrent();
		visitor.setCurrent(this_);
		visitor.beforeIntegerValueType(this_);
		
		visitActions(v, this_);		
					
		visitor.inIntegerValueType(this_);
		visitor.afterIntegerValueType(this_);
		visitor.setCurrent(pop);	
	}
	
	protected void visitAggregatedValue(AggregatedValue this_) {
		AbstractVisitor visitor = this;
		VisitingActions v = visitor.preAggregatedValue(this_);
		if ( v == null ) {
			return;
		}
	
		EObject pop = visitor.getCurrent();
		visitor.setCurrent(this_);
		visitor.beforeAggregatedValue(this_);
		
		visitActions(v, this_);		
					
		visitor.inAggregatedValue(this_);
		visitor.afterAggregatedValue(this_);
		visitor.setCurrent(pop);	
	} 
	protected void visitSingleValue(SingleValue this_) {
		AbstractVisitor visitor = this;
		VisitingActions v = visitor.preSingleValue(this_);
		if ( v == null ) {
			return;
		}
	
		EObject pop = visitor.getCurrent();
		visitor.setCurrent(this_);
		visitor.beforeSingleValue(this_);
		
		visitActions(v, this_);		
					
		visitor.inSingleValue(this_);
		visitor.afterSingleValue(this_);
		visitor.setCurrent(pop);	
	}
	
	protected void visitQualityModel(QualityModel this_) {
		AbstractVisitor visitor = this;
		VisitingActions v = visitor.preQualityModel(this_);
		if ( v == null ) {
			return;
		}
	
		EObject pop = visitor.getCurrent();
		visitor.setCurrent(this_);
		visitor.beforeQualityModel(this_);
		
		visitActions(v, this_);		
					
		visitor.inQualityModel(this_);
		visitor.afterQualityModel(this_);
		visitor.setCurrent(pop);	
	}
 
	protected void visitLetExp(LetExp this_) {
		AbstractVisitor visitor = this;
		VisitingActions v = visitor.preLetExp(this_);
		if ( v == null ) {
			return;
		}
	
		EObject pop = visitor.getCurrent();
		visitor.setCurrent(this_);
		visitor.beforeLetExp(this_);
		
		visitActions(v, this_);		
					
		visitor.inLetExp(this_);
		visitor.afterLetExp(this_);
		visitor.setCurrent(pop);	
	} 
	protected void visitBooleanType(BooleanType this_) {
		AbstractVisitor visitor = this;
		VisitingActions v = visitor.preBooleanType(this_);
		if ( v == null ) {
			return;
		}
	
		EObject pop = visitor.getCurrent();
		visitor.setCurrent(this_);
		visitor.beforeBooleanType(this_);
		
		visitActions(v, this_);		
					
		visitor.inBooleanType(this_);
		visitor.afterBooleanType(this_);
		visitor.setCurrent(pop);	
	} 
	protected void visitTupleExp(TupleExp this_) {
		AbstractVisitor visitor = this;
		VisitingActions v = visitor.preTupleExp(this_);
		if ( v == null ) {
			return;
		}
	
		EObject pop = visitor.getCurrent();
		visitor.setCurrent(this_);
		visitor.beforeTupleExp(this_);
		
		visitActions(v, this_);		
					
		visitor.inTupleExp(this_);
		visitor.afterTupleExp(this_);
		visitor.setCurrent(pop);	
	} 

	protected void visitOclType(OclType this_) {
		AbstractVisitor visitor = this;
		VisitingActions v = visitor.preOclType(this_);
		if ( v == null ) {
			return;
		}
	
		EObject pop = visitor.getCurrent();
		visitor.setCurrent(this_);
		visitor.beforeOclType(this_);
		
		visitActions(v, this_);		
					
		visitor.inOclType(this_);
		visitor.afterOclType(this_);
		visitor.setCurrent(pop);	
	} 
	
	protected void visitPropertyCallExp(PropertyCallExp this_) {
		AbstractVisitor visitor = this;
		VisitingActions v = visitor.prePropertyCallExp(this_);
		if ( v == null ) {
			return;
		}
	
		EObject pop = visitor.getCurrent();
		visitor.setCurrent(this_);
		visitor.beforePropertyCallExp(this_);
		
		visitActions(v, this_);		
					
		visitor.inPropertyCallExp(this_);
		visitor.afterPropertyCallExp(this_);
		visitor.setCurrent(pop);	
	} 
	protected void visitOclModelElement(OclModelElement this_) {
		AbstractVisitor visitor = this;
		VisitingActions v = visitor.preOclModelElement(this_);
		if ( v == null ) {
			return;
		}
	
		EObject pop = visitor.getCurrent();
		visitor.setCurrent(this_);
		visitor.beforeOclModelElement(this_);
		
		visitActions(v, this_);		
					
		visitor.inOclModelElement(this_);
		visitor.afterOclModelElement(this_);
		visitor.setCurrent(pop);	
	} 

	protected void visitTuplePart(TuplePart this_) {
		AbstractVisitor visitor = this;
		VisitingActions v = visitor.preTuplePart(this_);
		if ( v == null ) {
			return;
		}
	
		EObject pop = visitor.getCurrent();
		visitor.setCurrent(this_);
		visitor.beforeTuplePart(this_);
		
		visitActions(v, this_);		
					
		visitor.inTuplePart(this_);
		visitor.afterTuplePart(this_);
		visitor.setCurrent(pop);	
	} 
	
	protected void visitIfExp(IfExp this_) {
		AbstractVisitor visitor = this;
		VisitingActions v = visitor.preIfExp(this_);
		if ( v == null ) {
			return;
		}
	
		EObject pop = visitor.getCurrent();
		visitor.setCurrent(this_);
		visitor.beforeIfExp(this_);
		
		visitActions(v, this_);		
					
		visitor.inIfExp(this_);
		visitor.afterIfExp(this_);
		visitor.setCurrent(pop);	
	} 
	protected void visitMapType(MapType this_) {
		AbstractVisitor visitor = this;
		VisitingActions v = visitor.preMapType(this_);
		if ( v == null ) {
			return;
		}
	
		EObject pop = visitor.getCurrent();
		visitor.setCurrent(this_);
		visitor.beforeMapType(this_);
		
		visitActions(v, this_);		
					
		visitor.inMapType(this_);
		visitor.afterMapType(this_);
		visitor.setCurrent(pop);	
	} 
	protected void visitIterator(Iterator this_) {
		AbstractVisitor visitor = this;
		VisitingActions v = visitor.preIterator(this_);
		if ( v == null ) {
			return;
		}
	
		EObject pop = visitor.getCurrent();
		visitor.setCurrent(this_);
		visitor.beforeIterator(this_);
		
		visitActions(v, this_);		
					
		visitor.inIterator(this_);
		visitor.afterIterator(this_);
		visitor.setCurrent(pop);	
	} 

	 
	protected void visitSequenceType(SequenceType this_) {
		AbstractVisitor visitor = this;
		VisitingActions v = visitor.preSequenceType(this_);
		if ( v == null ) {
			return;
		}
	
		EObject pop = visitor.getCurrent();
		visitor.setCurrent(this_);
		visitor.beforeSequenceType(this_);
		
		visitActions(v, this_);		
					
		visitor.inSequenceType(this_);
		visitor.afterSequenceType(this_);
		visitor.setCurrent(pop);	
	} 
	
	protected void visitOrderedSetType(OrderedSetType this_) {
		AbstractVisitor visitor = this;
		VisitingActions v = visitor.preOrderedSetType(this_);
		if ( v == null ) {
			return;
		}
	
		EObject pop = visitor.getCurrent();
		visitor.setCurrent(this_);
		visitor.beforeOrderedSetType(this_);
		
		visitActions(v, this_);		
					
		visitor.inOrderedSetType(this_);
		visitor.afterOrderedSetType(this_);
		visitor.setCurrent(pop);	
	} 
	protected void visitOclAnyType(OclAnyType this_) {
		AbstractVisitor visitor = this;
		VisitingActions v = visitor.preOclAnyType(this_);
		if ( v == null ) {
			return;
		}
	
		EObject pop = visitor.getCurrent();
		visitor.setCurrent(this_);
		visitor.beforeOclAnyType(this_);
		
		visitActions(v, this_);		
					
		visitor.inOclAnyType(this_);
		visitor.afterOclAnyType(this_);
		visitor.setCurrent(pop);	
	} 
	
	protected void visitParameter(Parameter this_) {
		AbstractVisitor visitor = this;
		VisitingActions v = visitor.preParameter(this_);
		if ( v == null ) {
			return;
		}
	
		EObject pop = visitor.getCurrent();
		visitor.setCurrent(this_);
		visitor.beforeParameter(this_);
		
		visitActions(v, this_);		
					
		visitor.inParameter(this_);
		visitor.afterParameter(this_);
		visitor.setCurrent(pop);	
	} 
	
	protected void visitOclContextDefinition(OclContextDefinition this_) {
		AbstractVisitor visitor = this;
		VisitingActions v = visitor.preOclContextDefinition(this_);
		if ( v == null ) {
			return;
		}
	
		EObject pop = visitor.getCurrent();
		visitor.setCurrent(this_);
		visitor.beforeOclContextDefinition(this_);
		
		visitActions(v, this_);		
					
		visitor.inOclContextDefinition(this_);
		visitor.afterOclContextDefinition(this_);
		visitor.setCurrent(pop);	
	} 
	

	protected void visitMapExp(MapExp this_) {
		AbstractVisitor visitor = this;
		VisitingActions v = visitor.preMapExp(this_);
		if ( v == null ) {
			return;
		}
	
		EObject pop = visitor.getCurrent();
		visitor.setCurrent(this_);
		visitor.beforeMapExp(this_);
		
		visitActions(v, this_);		
					
		visitor.inMapExp(this_);
		visitor.afterMapExp(this_);
		visitor.setCurrent(pop);	
	} 
	protected void visitRealType(RealType this_) {
		AbstractVisitor visitor = this;
		VisitingActions v = visitor.preRealType(this_);
		if ( v == null ) {
			return;
		}
	
		EObject pop = visitor.getCurrent();
		visitor.setCurrent(this_);
		visitor.beforeRealType(this_);
		
		visitActions(v, this_);		
					
		visitor.inRealType(this_);
		visitor.afterRealType(this_);
		visitor.setCurrent(pop);	
	} 
	
	protected void visitEnumLiteralExp(EnumLiteralExp this_) {
		AbstractVisitor visitor = this;
		VisitingActions v = visitor.preEnumLiteralExp(this_);
		if ( v == null ) {
			return;
		}
	
		EObject pop = visitor.getCurrent();
		visitor.setCurrent(this_);
		visitor.beforeEnumLiteralExp(this_);
		
		visitActions(v, this_);		
					
		visitor.inEnumLiteralExp(this_);
		visitor.afterEnumLiteralExp(this_);
		visitor.setCurrent(pop);	
	} 
	protected void visitVariableDeclaration(VariableDeclaration this_) {
		AbstractVisitor visitor = this;
		VisitingActions v = visitor.preVariableDeclaration(this_);
		if ( v == null ) {
			return;
		}
	
		EObject pop = visitor.getCurrent();
		visitor.setCurrent(this_);
		visitor.beforeVariableDeclaration(this_);
		
		visitActions(v, this_);		
					
		visitor.inVariableDeclaration(this_);
		visitor.afterVariableDeclaration(this_);
		visitor.setCurrent(pop);	
	} 
	protected void visitBagType(BagType this_) {
		AbstractVisitor visitor = this;
		VisitingActions v = visitor.preBagType(this_);
		if ( v == null ) {
			return;
		}
	
		EObject pop = visitor.getCurrent();
		visitor.setCurrent(this_);
		visitor.beforeBagType(this_);
		
		visitActions(v, this_);		
					
		visitor.inBagType(this_);
		visitor.afterBagType(this_);
		visitor.setCurrent(pop);	
	} 
	
	protected void visitTupleTypeAttribute(TupleTypeAttribute this_) {
		AbstractVisitor visitor = this;
		VisitingActions v = visitor.preTupleTypeAttribute(this_);
		if ( v == null ) {
			return;
		}
	
		EObject pop = visitor.getCurrent();
		visitor.setCurrent(this_);
		visitor.beforeTupleTypeAttribute(this_);
		
		visitActions(v, this_);		
					
		visitor.inTupleTypeAttribute(this_);
		visitor.afterTupleTypeAttribute(this_);
		visitor.setCurrent(pop);	
	} 
	protected void visitRealExp(RealExp this_) {
		AbstractVisitor visitor = this;
		VisitingActions v = visitor.preRealExp(this_);
		if ( v == null ) {
			return;
		}
	
		EObject pop = visitor.getCurrent();
		visitor.setCurrent(this_);
		visitor.beforeRealExp(this_);
		
		visitActions(v, this_);		
					
		visitor.inRealExp(this_);
		visitor.afterRealExp(this_);
		visitor.setCurrent(pop);	
	} 
	protected void visitOclFeatureDefinition(OclFeatureDefinition this_) {
		AbstractVisitor visitor = this;
		VisitingActions v = visitor.preOclFeatureDefinition(this_);
		if ( v == null ) {
			return;
		}
	
		EObject pop = visitor.getCurrent();
		visitor.setCurrent(this_);
		visitor.beforeOclFeatureDefinition(this_);
		
		visitActions(v, this_);		
					
		visitor.inOclFeatureDefinition(this_);
		visitor.afterOclFeatureDefinition(this_);
		visitor.setCurrent(pop);	
	} 
	protected void visitIterateExp(IterateExp this_) {
		AbstractVisitor visitor = this;
		VisitingActions v = visitor.preIterateExp(this_);
		if ( v == null ) {
			return;
		}
	
		EObject pop = visitor.getCurrent();
		visitor.setCurrent(this_);
		visitor.beforeIterateExp(this_);
		
		visitActions(v, this_);		
					
		visitor.inIterateExp(this_);
		visitor.afterIterateExp(this_);
		visitor.setCurrent(pop);	
	} 
	protected void visitOclUndefinedExp(OclUndefinedExp this_) {
		AbstractVisitor visitor = this;
		VisitingActions v = visitor.preOclUndefinedExp(this_);
		if ( v == null ) {
			return;
		}
	
		EObject pop = visitor.getCurrent();
		visitor.setCurrent(this_);
		visitor.beforeOclUndefinedExp(this_);
		
		visitActions(v, this_);		
					
		visitor.inOclUndefinedExp(this_);
		visitor.afterOclUndefinedExp(this_);
		visitor.setCurrent(pop);	
	} 
	
	protected void visitAttribute(Attribute this_) {
		AbstractVisitor visitor = this;
		VisitingActions v = visitor.preAttribute(this_);
		if ( v == null ) {
			return;
		}
	
		EObject pop = visitor.getCurrent();
		visitor.setCurrent(this_);
		visitor.beforeAttribute(this_);
		
		visitActions(v, this_);		
					
		visitor.inAttribute(this_);
		visitor.afterAttribute(this_);
		visitor.setCurrent(pop);	
	} 
	protected void visitTupleType(TupleType this_) {
		AbstractVisitor visitor = this;
		VisitingActions v = visitor.preTupleType(this_);
		if ( v == null ) {
			return;
		}
	
		EObject pop = visitor.getCurrent();
		visitor.setCurrent(this_);
		visitor.beforeTupleType(this_);
		
		visitActions(v, this_);		
					
		visitor.inTupleType(this_);
		visitor.afterTupleType(this_);
		visitor.setCurrent(pop);	
	} 
	protected void visitSuperExp(SuperExp this_) {
		AbstractVisitor visitor = this;
		VisitingActions v = visitor.preSuperExp(this_);
		if ( v == null ) {
			return;
		}
	
		EObject pop = visitor.getCurrent();
		visitor.setCurrent(this_);
		visitor.beforeSuperExp(this_);
		
		visitActions(v, this_);		
					
		visitor.inSuperExp(this_);
		visitor.afterSuperExp(this_);
		visitor.setCurrent(pop);	
	} 
	protected void visitCollectionType(CollectionType this_) {
		AbstractVisitor visitor = this;
		VisitingActions v = visitor.preCollectionType(this_);
		if ( v == null ) {
			return;
		}
	
		EObject pop = visitor.getCurrent();
		visitor.setCurrent(this_);
		visitor.beforeCollectionType(this_);
		
		visitActions(v, this_);		
					
		visitor.inCollectionType(this_);
		visitor.afterCollectionType(this_);
		visitor.setCurrent(pop);	
	} 
	protected void visitSetType(SetType this_) {
		AbstractVisitor visitor = this;
		VisitingActions v = visitor.preSetType(this_);
		if ( v == null ) {
			return;
		}
	
		EObject pop = visitor.getCurrent();
		visitor.setCurrent(this_);
		visitor.beforeSetType(this_);
		
		visitActions(v, this_);		
					
		visitor.inSetType(this_);
		visitor.afterSetType(this_);
		visitor.setCurrent(pop);	
	} 
	protected void visitBagExp(BagExp this_) {
		AbstractVisitor visitor = this;
		VisitingActions v = visitor.preBagExp(this_);
		if ( v == null ) {
			return;
		}
	
		EObject pop = visitor.getCurrent();
		visitor.setCurrent(this_);
		visitor.beforeBagExp(this_);
		
		visitActions(v, this_);		
					
		visitor.inBagExp(this_);
		visitor.afterBagExp(this_);
		visitor.setCurrent(pop);	
	} 
	
	protected void visitBooleanExp(BooleanExp this_) {
		AbstractVisitor visitor = this;
		VisitingActions v = visitor.preBooleanExp(this_);
		if ( v == null ) {
			return;
		}
	
		EObject pop = visitor.getCurrent();
		visitor.setCurrent(this_);
		visitor.beforeBooleanExp(this_);
		
		visitActions(v, this_);		
					
		visitor.inBooleanExp(this_);
		visitor.afterBooleanExp(this_);
		visitor.setCurrent(pop);	
	} 
	protected void visitSetExp(SetExp this_) {
		AbstractVisitor visitor = this;
		VisitingActions v = visitor.preSetExp(this_);
		if ( v == null ) {
			return;
		}
	
		EObject pop = visitor.getCurrent();
		visitor.setCurrent(this_);
		visitor.beforeSetExp(this_);
		
		visitActions(v, this_);		
					
		visitor.inSetExp(this_);
		visitor.afterSetExp(this_);
		visitor.setCurrent(pop);	
	} 
	protected void visitOperatorCallExp(OperatorCallExp this_) {
		AbstractVisitor visitor = this;
		VisitingActions v = visitor.preOperatorCallExp(this_);
		if ( v == null ) {
			return;
		}
	
		EObject pop = visitor.getCurrent();
		visitor.setCurrent(this_);
		visitor.beforeOperatorCallExp(this_);
		
		visitActions(v, this_);		
					
		visitor.inOperatorCallExp(this_);
		visitor.afterOperatorCallExp(this_);
		visitor.setCurrent(pop);	
	} 
	protected void visitSequenceExp(SequenceExp this_) {
		AbstractVisitor visitor = this;
		VisitingActions v = visitor.preSequenceExp(this_);
		if ( v == null ) {
			return;
		}
	
		EObject pop = visitor.getCurrent();
		visitor.setCurrent(this_);
		visitor.beforeSequenceExp(this_);
		
		visitActions(v, this_);		
					
		visitor.inSequenceExp(this_);
		visitor.afterSequenceExp(this_);
		visitor.setCurrent(pop);	
	} 
	protected void visitMapElement(MapElement this_) {
		AbstractVisitor visitor = this;
		VisitingActions v = visitor.preMapElement(this_);
		if ( v == null ) {
			return;
		}
	
		EObject pop = visitor.getCurrent();
		visitor.setCurrent(this_);
		visitor.beforeMapElement(this_);
		
		visitActions(v, this_);		
					
		visitor.inMapElement(this_);
		visitor.afterMapElement(this_);
		visitor.setCurrent(pop);	
	} 
	protected void visitVariableExp(VariableExp this_) {
		AbstractVisitor visitor = this;
		VisitingActions v = visitor.preVariableExp(this_);
		if ( v == null ) {
			return;
		}
	
		EObject pop = visitor.getCurrent();
		visitor.setCurrent(this_);
		visitor.beforeVariableExp(this_);
		
		visitActions(v, this_);		
					
		visitor.inVariableExp(this_);
		visitor.afterVariableExp(this_);
		visitor.setCurrent(pop);	
	} 
	protected void visitIteratorExp(IteratorExp this_) {
		AbstractVisitor visitor = this;
		VisitingActions v = visitor.preIteratorExp(this_);
		if ( v == null ) {
			return;
		}
	
		EObject pop = visitor.getCurrent();
		visitor.setCurrent(this_);
		visitor.beforeIteratorExp(this_);
		
		visitActions(v, this_);		
					
		visitor.inIteratorExp(this_);
		visitor.afterIteratorExp(this_);
		visitor.setCurrent(pop);	
	} 
	protected void visitIntegerType(IntegerType this_) {
		AbstractVisitor visitor = this;
		VisitingActions v = visitor.preIntegerType(this_);
		if ( v == null ) {
			return;
		}
	
		EObject pop = visitor.getCurrent();
		visitor.setCurrent(this_);
		visitor.beforeIntegerType(this_);
		
		visitActions(v, this_);		
					
		visitor.inIntegerType(this_);
		visitor.afterIntegerType(this_);
		visitor.setCurrent(pop);	
	} 
	protected void visitOclModel(OclModel this_) {
		AbstractVisitor visitor = this;
		VisitingActions v = visitor.preOclModel(this_);
		if ( v == null ) {
			return;
		}
	
		EObject pop = visitor.getCurrent();
		visitor.setCurrent(this_);
		visitor.beforeOclModel(this_);
		
		visitActions(v, this_);		
					
		visitor.inOclModel(this_);
		visitor.afterOclModel(this_);
		visitor.setCurrent(pop);	
	} 
	protected void visitStringType(StringType this_) {
		AbstractVisitor visitor = this;
		VisitingActions v = visitor.preStringType(this_);
		if ( v == null ) {
			return;
		}
	
		EObject pop = visitor.getCurrent();
		visitor.setCurrent(this_);
		visitor.beforeStringType(this_);
		
		visitActions(v, this_);		
					
		visitor.inStringType(this_);
		visitor.afterStringType(this_);
		visitor.setCurrent(pop);	
	} 
	

	protected void visitStringExp(StringExp this_) {
		AbstractVisitor visitor = this;
		VisitingActions v = visitor.preStringExp(this_);
		if ( v == null ) {
			return;
		}
	
		EObject pop = visitor.getCurrent();
		visitor.setCurrent(this_);
		visitor.beforeStringExp(this_);
		
		visitActions(v, this_);		
					
		visitor.inStringExp(this_);
		visitor.afterStringExp(this_);
		visitor.setCurrent(pop);	
	} 
	
	protected void visitOrderedSetExp(OrderedSetExp this_) {
		AbstractVisitor visitor = this;
		VisitingActions v = visitor.preOrderedSetExp(this_);
		if ( v == null ) {
			return;
		}
	
		EObject pop = visitor.getCurrent();
		visitor.setCurrent(this_);
		visitor.beforeOrderedSetExp(this_);
		
		visitActions(v, this_);		
					
		visitor.inOrderedSetExp(this_);
		visitor.afterOrderedSetExp(this_);
		visitor.setCurrent(pop);	
	} 
	protected void visitOperation(Operation this_) {
		AbstractVisitor visitor = this;
		VisitingActions v = visitor.preOperation(this_);
		if ( v == null ) {
			return;
		}
	
		EObject pop = visitor.getCurrent();
		visitor.setCurrent(this_);
		visitor.beforeOperation(this_);
		
		visitActions(v, this_);		
					
		visitor.inOperation(this_);
		visitor.afterOperation(this_);
		visitor.setCurrent(pop);	
	}
	protected void visitOperation(QualityMetamodel.Operation this_) {
		AbstractVisitor visitor = this;
		VisitingActions v = visitor.preOperation(this_);
		if ( v == null ) {
			return;
		}
	
		EObject pop = visitor.getCurrent();
		visitor.setCurrent(this_);
		visitor.beforeOperation(this_);
		
		visitActions(v, this_);		
					
		visitor.inOperation(this_);
		visitor.afterOperation(this_);
		visitor.setCurrent(pop);	
	}
	protected void visitAddOpCallExp(AddOpCallExp this_) {
		AbstractVisitor visitor = this;
		VisitingActions v = visitor.preAddOpCallExp(this_);
		if ( v == null ) {
			return;
		}
	
		EObject pop = visitor.getCurrent();
		visitor.setCurrent(this_);
		visitor.beforeAddOpCallExp(this_);
		
		visitActions(v, this_);		
					
		visitor.inAddOpCallExp(this_);
		visitor.afterAddOpCallExp(this_);
		visitor.setCurrent(pop);	
	}
	protected void visitMulOpCallExp(MulOpCallExp this_) {
		AbstractVisitor visitor = this;
		VisitingActions v = visitor.preMulOpCallExp(this_);
		if ( v == null ) {
			return;
		}
	
		EObject pop = visitor.getCurrent();
		visitor.setCurrent(this_);
		visitor.beforeMulOpCallExp(this_);
		
		visitActions(v, this_);		
					
		visitor.inMulOpCallExp(this_);
		visitor.afterMulOpCallExp(this_);
		visitor.setCurrent(pop);	
	}
	protected void visitBraceExp(BraceExp this_) {
		AbstractVisitor visitor = this;
		VisitingActions v = visitor.preBraceExp(this_);
		if ( v == null ) {
			return;
		}
	
		EObject pop = visitor.getCurrent();
		visitor.setCurrent(this_);
		visitor.beforeBraceExp(this_);
		
		visitActions(v, this_);		
					
		visitor.inBraceExp(this_);
		visitor.afterBraceExp(this_);
		visitor.setCurrent(pop);	
	}
	private void visitActions(VisitingActions v, EObject this_) {
		//AbstractVisitor visitor = this;
		
		for(VisitingAction va : v.getActions(this_)) {
			if ( va.isMethodCall() ) {
				va.performMethodCall();		
			} else if ( va.isFilter() ) {
				Object res = va.performMethodCall();
				if ( res instanceof java.util.Collection ) {
					for(Object o : (java.util.Collection<?>) res) {
						visit((EObject) o);
					}
				} else {
					visit((EObject) res);
				}
			} else if ( va.isReference() ) {
				EReference r = va.getEReference();
				Object refObj   = this_.eGet(r);
				if ( refObj == null ) continue;
				if ( refObj instanceof java.util.Collection ) {
					for(Object o : (java.util.Collection<?>) refObj) {
						visit((EObject) o);
					}
				} else {
					visit((EObject) refObj);
				}
			}
		}
	
	}
	
	private void visit(EObject obj) {	
		if ( obj.eClass().getName().equals("IntegerExp") ) { visitIntegerExp((IntegerExp) obj); return; }
		if ( obj.eClass().getName().equals("LetExp") ) { visitLetExp((LetExp) obj); return; }
		if ( obj.eClass().getName().equals("BooleanType") ) { visitBooleanType((BooleanType) obj); return; }
		if ( obj.eClass().getName().equals("TupleExp") ) { visitTupleExp((TupleExp) obj); return; }
		if ( obj.eClass().getName().equals("OclType") ) { visitOclType((OclType) obj); return; }
		if ( obj.eClass().getName().equals("OclModelElement") ) { visitOclModelElement((OclModelElement) obj); return; }
		if ( obj.eClass().getName().equals("TuplePart") ) { visitTuplePart((TuplePart) obj); return; }
		if ( obj.eClass().getName().equals("IfExp") ) { visitIfExp((IfExp) obj); return; }
		if ( obj.eClass().getName().equals("MapType") ) { visitMapType((MapType) obj); return; }
		if ( obj.eClass().getName().equals("Iterator") ) { visitIterator((Iterator) obj); return; }
		if ( obj.eClass().getName().equals("SequenceType") ) { visitSequenceType((SequenceType) obj); return; }
		if ( obj.eClass().getName().equals("OrderedSetType") ) { visitOrderedSetType((OrderedSetType) obj); return; }
		if ( obj.eClass().getName().equals("OclAnyType") ) { visitOclAnyType((OclAnyType) obj); return; }
		if ( obj.eClass().getName().equals("Parameter") ) { visitParameter((Parameter) obj); return; }
		if ( obj.eClass().getName().equals("OclContextDefinition") ) { visitOclContextDefinition((OclContextDefinition) obj); return; }
		if ( obj.eClass().getName().equals("PropertyCallExp") ) { visitPropertyCallExp((PropertyCallExp) obj); return; }
		if ( obj.eClass().getName().equals("AggregatedValue") ) { visitAggregatedValue((AggregatedValue) obj); return; }
		if ( obj.eClass().getName().equals("SingleValue") ) { visitSingleValue((SingleValue) obj); return; }
		if ( obj.eClass().getName().equals("BraceExp") ) { visitBraceExp((BraceExp) obj); return; }
		
		if ( obj.eClass().getName().equals("MapExp") ) { visitMapExp((MapExp) obj); return; }
		if ( obj.eClass().getName().equals("RealType") ) { visitRealType((RealType) obj); return; }
		if ( obj.eClass().getName().equals("EnumLiteralExp") ) { visitEnumLiteralExp((EnumLiteralExp) obj); return; }
		if ( obj.eClass().getName().equals("VariableDeclaration") ) { visitVariableDeclaration((VariableDeclaration) obj); return; }
		if ( obj.eClass().getName().equals("BagType") ) { visitBagType((BagType) obj); return; }
		if ( obj.eClass().getName().equals("TupleTypeAttribute") ) { visitTupleTypeAttribute((TupleTypeAttribute) obj); return; }
		if ( obj.eClass().getName().equals("RealExp") ) { visitRealExp((RealExp) obj); return; }
		if ( obj.eClass().getName().equals("OclFeatureDefinition") ) { visitOclFeatureDefinition((OclFeatureDefinition) obj); return; }
		if ( obj.eClass().getName().equals("IterateExp") ) { visitIterateExp((IterateExp) obj); return; }
		if ( obj.eClass().getName().equals("OclUndefinedExp") ) { visitOclUndefinedExp((OclUndefinedExp) obj); return; }
		if ( obj.eClass().getName().equals("Attribute") ) { visitAttribute((Attribute) obj); return; }
		if ( obj.eClass().getName().equals("TupleType") ) { visitTupleType((TupleType) obj); return; }
		if ( obj.eClass().getName().equals("SuperExp") ) { visitSuperExp((SuperExp) obj); return; }
		if ( obj.eClass().getName().equals("CollectionType") ) { visitCollectionType((CollectionType) obj); return; }
		if ( obj.eClass().getName().equals("SetType") ) { visitSetType((SetType) obj); return; }
		if ( obj.eClass().getName().equals("BagExp") ) { visitBagExp((BagExp) obj); return; }
		if ( obj.eClass().getName().equals("BooleanExp") ) { visitBooleanExp((BooleanExp) obj); return; }
		if ( obj.eClass().getName().equals("SetExp") ) { visitSetExp((SetExp) obj); return; }
		if ( obj.eClass().getName().equals("OperatorCallExp") ) { visitOperatorCallExp((OperatorCallExp) obj); return; }
		if ( obj.eClass().getName().equals("SequenceExp") ) { visitSequenceExp((SequenceExp) obj); return; }
		if ( obj.eClass().getName().equals("MapElement") ) { visitMapElement((MapElement) obj); return; }
		if ( obj.eClass().getName().equals("VariableExp") ) { visitVariableExp((VariableExp) obj); return; }
		if ( obj.eClass().getName().equals("IteratorExp") ) { visitIteratorExp((IteratorExp) obj); return; }
		if ( obj.eClass().getName().equals("IntegerType") ) { visitIntegerType((IntegerType) obj); return; }
		if ( obj.eClass().getName().equals("OclModel") ) { visitOclModel((OclModel) obj); return; }
		if ( obj.eClass().getName().equals("StringType") ) { visitStringType((StringType) obj); return; }
		if ( obj.eClass().getName().equals("StringExp") ) { visitStringExp((StringExp) obj); return; }
		if ( obj.eClass().getName().equals("OrderedSetExp") ) { visitOrderedSetExp((OrderedSetExp) obj); return; }
		if ((obj.eClass().getEPackage().getName() + "." + obj.eClass().getName()).equals("QualityMetamodel.QMM_OCL.Operation")) { visitOperation((Operation) obj); return; }
		if ((obj.eClass().getEPackage().getName() + "." + obj.eClass().getName()).equals("QualityMetamodel.Operation")) { visitOperation((QualityMetamodel.Operation) obj); return; }
		if ( obj.eClass().getName().equals("AddOpCallExp") ) { visitAddOpCallExp((AddOpCallExp) obj); return; }
		if ( obj.eClass().getName().equals("MulOpCallExp") ) { visitMulOpCallExp((MulOpCallExp) obj); return; }
		if ( obj.eClass().getName().equals("QualityModel") ) { visitQualityModel((QualityModel) obj); return; }
		if ( obj.eClass().getName().equals("RealValueType") ) { visitRealValueType((RealValueType) obj); return; }
		if ( obj.eClass().getName().equals("IntegerValueType") ) { visitIntegerValueType((IntegerValueType) obj); return; }
		if ( obj.eClass().getName().equals("QualityAttribute") ) { visitQualityAttribute((QualityAttribute) obj); return; }
		if ( obj.eClass().getName().equals("StringToStringMap") ) { return; }
		
		throw new IllegalStateException("Cannot handle class: " + obj.eClass().getName());
		
	}
	
	//
	// Framework code inlined as a template
	//
	
	public static class VisitingActions {
		private Object[] actions;
		public VisitingActions(Object... actions) {
			this.actions = actions;
		}
		
		public VisitingAction[] getActions(EObject obj) {
			VisitingAction[] result = new VisitingAction[actions.length];
			EClass  eclass      = obj.eClass();
			
			for(int i = 0; i < actions.length; i++) {
				if ( actions[i] instanceof String ) {
					String refName = (String) actions[i];
					result[i] = new VisitingAction((EReference) eclass.getEStructuralFeature(refName));
				} else if ( actions[i] instanceof VisitingAction ) {
					result[i] = (VisitingAction) actions[i];
				}
			}
			return result;
		}
	}
	
	public static class VisitingAction {
		public static final int REFERENCE = 0;
		public static final int METHOD_CALL = 1;
		public static final int FILTER_CALL = 2;
		
		private int actionType = -1;

		// For references
		private EReference	reference;
		
		// For method calls
		private Object[]	arguments;
		private java.lang.reflect.Method	method;
		private AbstractVisitor receptor;
		
		public VisitingAction(AbstractVisitor receptor, java.lang.reflect.Method method, Object[] arguments) {
			actionType = METHOD_CALL;
			this.receptor = receptor;
			this.method = method;
			this.arguments = arguments;
		}

		public static VisitingAction createFilter(AbstractVisitor  receptor, java.lang.reflect.Method method, Object[] arguments) {
			VisitingAction va = new VisitingAction(receptor, method, arguments);
			va.actionType = FILTER_CALL;
			return va;
		}
		
		public VisitingAction(EReference r) {
			actionType = REFERENCE;
			this.reference = r;
		}

		public int getActionType() {
			return actionType;
		}
		
		public boolean isReference() {
			return getActionType() == REFERENCE;
		}
		
		public EReference getEReference() {
			return this.reference;
		}
		
		public boolean isMethodCall() {
			return getActionType() == METHOD_CALL;
		}
		
		public boolean isFilter() {
			return getActionType() == FILTER_CALL;
		}
		
		public Object performMethodCall() {
			try {
				return method.invoke(receptor, arguments);
			} catch ( Exception e ) {
				throw new RuntimeException(e);
			}	
		}
	}
	

	private java.util.HashMap<String, java.lang.reflect.Method> allMethods = null;
	public java.util.HashMap<String, java.lang.reflect.Method> getAllMethods() {
		if ( allMethods == null ) {
			allMethods = new java.util.HashMap<String, java.lang.reflect.Method>();
			for(java.lang.reflect.Method m : this.getClass().getMethods()) {
				allMethods.put(getMethodKey(m.getName(), m.getParameterCount()), m);
			}
		}
		return allMethods;
	}
	
	private final String getMethodKey(String name, int paramCount) {
		return name + "/" + paramCount;
	}
	
	public VisitingAction method(String methodName, Object... arguments) {
		String key = getMethodKey(methodName, arguments.length);
		if ( getAllMethods().containsKey(key) ) {
			return new VisitingAction(this, getAllMethods().get(key), arguments);			
		}
		
		throw new RuntimeException("No method " + methodName + " found in " + this.getClass().getName());
	}

	public VisitingAction filter(String methodName, Object... arguments) {
		String key = getMethodKey(methodName, arguments.length);
		if ( getAllMethods().containsKey(key) ) {
			return VisitingAction.createFilter(this, getAllMethods().get(key), arguments);
		}
		
		throw new RuntimeException("No method " + methodName + " found in " + this.getClass().getName());
	}	
}
