/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package QualityMetamodel.resource.qualitymetamodel.mopp;

public class QualitymetamodelSyntaxCoverageInformationProvider {
	
	public org.eclipse.emf.ecore.EClass[] getClassesWithSyntax() {
		return new org.eclipse.emf.ecore.EClass[] {
			QualityMetamodel.QualityMetamodelPackage.eINSTANCE.getQualityModel(),
			QualityMetamodel.QualityMetamodelPackage.eINSTANCE.getQualityAttribute(),
			QualityMetamodel.QualityMetamodelPackage.eINSTANCE.getMetricProvider(),
			QualityMetamodel.QualityMetamodelPackage.eINSTANCE.getSingleValue(),
			QualityMetamodel.QualityMetamodelPackage.eINSTANCE.getAggregatedValue(),
			QualityMetamodel.QualityMetamodelPackage.eINSTANCE.getOperation(),
			QualityMetamodel.QualityMetamodelPackage.eINSTANCE.getTextValueType(),
			QualityMetamodel.QualityMetamodelPackage.eINSTANCE.getAggregatedValueMetric(),
			QualityMetamodel.QualityMetamodelPackage.eINSTANCE.getEnumerationMetric(),
			QualityMetamodel.QualityMetamodelPackage.eINSTANCE.getEnumerationItem(),
			QualityMetamodel.QualityMetamodelPackage.eINSTANCE.getRealValueType(),
			QualityMetamodel.QualityMetamodelPackage.eINSTANCE.getBooleanValueType(),
			QualityMetamodel.QualityMetamodelPackage.eINSTANCE.getIntegerValueType(),
			QualityMetamodel.QMM_OCL.QMM_OCLPackage.eINSTANCE.getModule(),
			QualityMetamodel.QMM_OCL.QMM_OCLPackage.eINSTANCE.getImport(),
			QualityMetamodel.QMM_OCL.QMM_OCLPackage.eINSTANCE.getOclFeatureDefinition(),
			QualityMetamodel.QMM_OCL.QMM_OCLPackage.eINSTANCE.getOclContextDefinition(),
			QualityMetamodel.QMM_OCL.QMM_OCLPackage.eINSTANCE.getOclMetamodel(),
			QualityMetamodel.QMM_OCL.QMM_OCLPackage.eINSTANCE.getOclInstanceModel(),
			QualityMetamodel.QMM_OCL.QMM_OCLPackage.eINSTANCE.getLocalVariable(),
			QualityMetamodel.QMM_OCL.QMM_OCLPackage.eINSTANCE.getAttribute(),
			QualityMetamodel.QMM_OCL.QMM_OCLPackage.eINSTANCE.getOperation(),
			QualityMetamodel.QMM_OCL.QMM_OCLPackage.eINSTANCE.getParameter(),
			QualityMetamodel.QMM_OCL.QMM_OCLPackage.eINSTANCE.getOclModelElementExp(),
			QualityMetamodel.QMM_OCL.QMM_OCLPackage.eINSTANCE.getLambdaCallExp(),
			QualityMetamodel.QMM_OCL.QMM_OCLPackage.eINSTANCE.getVariableExp(),
			QualityMetamodel.QMM_OCL.QMM_OCLPackage.eINSTANCE.getSuperExp(),
			QualityMetamodel.QMM_OCL.QMM_OCLPackage.eINSTANCE.getSelfExp(),
			QualityMetamodel.QMM_OCL.QMM_OCLPackage.eINSTANCE.getEnvExp(),
			QualityMetamodel.QMM_OCL.QMM_OCLPackage.eINSTANCE.getStringExp(),
			QualityMetamodel.QMM_OCL.QMM_OCLPackage.eINSTANCE.getBooleanExp(),
			QualityMetamodel.QMM_OCL.QMM_OCLPackage.eINSTANCE.getRealExp(),
			QualityMetamodel.QMM_OCL.QMM_OCLPackage.eINSTANCE.getIntegerExp(),
			QualityMetamodel.QMM_OCL.QMM_OCLPackage.eINSTANCE.getCollectionRange(),
			QualityMetamodel.QMM_OCL.QMM_OCLPackage.eINSTANCE.getCollectionItem(),
			QualityMetamodel.QMM_OCL.QMM_OCLPackage.eINSTANCE.getBagExp(),
			QualityMetamodel.QMM_OCL.QMM_OCLPackage.eINSTANCE.getOrderedSetExp(),
			QualityMetamodel.QMM_OCL.QMM_OCLPackage.eINSTANCE.getSequenceExp(),
			QualityMetamodel.QMM_OCL.QMM_OCLPackage.eINSTANCE.getSetExp(),
			QualityMetamodel.QMM_OCL.QMM_OCLPackage.eINSTANCE.getTupleExp(),
			QualityMetamodel.QMM_OCL.QMM_OCLPackage.eINSTANCE.getTuplePart(),
			QualityMetamodel.QMM_OCL.QMM_OCLPackage.eINSTANCE.getMapExp(),
			QualityMetamodel.QMM_OCL.QMM_OCLPackage.eINSTANCE.getMapElement(),
			QualityMetamodel.QMM_OCL.QMM_OCLPackage.eINSTANCE.getEnumLiteralExp(),
			QualityMetamodel.QMM_OCL.QMM_OCLPackage.eINSTANCE.getOclUndefinedExp(),
			QualityMetamodel.QMM_OCL.QMM_OCLPackage.eINSTANCE.getLetExp(),
			QualityMetamodel.QMM_OCL.QMM_OCLPackage.eINSTANCE.getIfExp(),
			QualityMetamodel.QMM_OCL.QMM_OCLPackage.eINSTANCE.getBraceExp(),
			QualityMetamodel.QMM_OCL.QMM_OCLPackage.eINSTANCE.getOperatorCallExp(),
			QualityMetamodel.QMM_OCL.QMM_OCLPackage.eINSTANCE.getEqOpCallExp(),
			QualityMetamodel.QMM_OCL.QMM_OCLPackage.eINSTANCE.getRelOpCallExp(),
			QualityMetamodel.QMM_OCL.QMM_OCLPackage.eINSTANCE.getAddOpCallExp(),
			QualityMetamodel.QMM_OCL.QMM_OCLPackage.eINSTANCE.getIntOpCallExp(),
			QualityMetamodel.QMM_OCL.QMM_OCLPackage.eINSTANCE.getMulOpCallExp(),
			QualityMetamodel.QMM_OCL.QMM_OCLPackage.eINSTANCE.getNotOpCallExp(),
			QualityMetamodel.QMM_OCL.QMM_OCLPackage.eINSTANCE.getStaticPropertyCallExp(),
			QualityMetamodel.QMM_OCL.QMM_OCLPackage.eINSTANCE.getStaticOperationCall(),
			QualityMetamodel.QMM_OCL.QMM_OCLPackage.eINSTANCE.getStaticNavigationOrAttributeCall(),
			QualityMetamodel.QMM_OCL.QMM_OCLPackage.eINSTANCE.getPropertyCallExp(),
			QualityMetamodel.QMM_OCL.QMM_OCLPackage.eINSTANCE.getOperationCall(),
			QualityMetamodel.QMM_OCL.QMM_OCLPackage.eINSTANCE.getNavigationOrAttributeCall(),
			QualityMetamodel.QMM_OCL.QMM_OCLPackage.eINSTANCE.getIterateExp(),
			QualityMetamodel.QMM_OCL.QMM_OCLPackage.eINSTANCE.getIteratorExp(),
			QualityMetamodel.QMM_OCL.QMM_OCLPackage.eINSTANCE.getIterator(),
			QualityMetamodel.QMM_OCL.QMM_OCLPackage.eINSTANCE.getCollectionOperationCall(),
			QualityMetamodel.QMM_OCL.QMM_OCLPackage.eINSTANCE.getCollectionType(),
			QualityMetamodel.QMM_OCL.QMM_OCLPackage.eINSTANCE.getStringType(),
			QualityMetamodel.QMM_OCL.QMM_OCLPackage.eINSTANCE.getBooleanType(),
			QualityMetamodel.QMM_OCL.QMM_OCLPackage.eINSTANCE.getIntegerType(),
			QualityMetamodel.QMM_OCL.QMM_OCLPackage.eINSTANCE.getRealType(),
			QualityMetamodel.QMM_OCL.QMM_OCLPackage.eINSTANCE.getBagType(),
			QualityMetamodel.QMM_OCL.QMM_OCLPackage.eINSTANCE.getOrderedSetType(),
			QualityMetamodel.QMM_OCL.QMM_OCLPackage.eINSTANCE.getSequenceType(),
			QualityMetamodel.QMM_OCL.QMM_OCLPackage.eINSTANCE.getSetType(),
			QualityMetamodel.QMM_OCL.QMM_OCLPackage.eINSTANCE.getOclAnyType(),
			QualityMetamodel.QMM_OCL.QMM_OCLPackage.eINSTANCE.getOclType(),
			QualityMetamodel.QMM_OCL.QMM_OCLPackage.eINSTANCE.getTupleType(),
			QualityMetamodel.QMM_OCL.QMM_OCLPackage.eINSTANCE.getTupleTypeAttribute(),
			QualityMetamodel.QMM_OCL.QMM_OCLPackage.eINSTANCE.getOclModelElement(),
			QualityMetamodel.QMM_OCL.QMM_OCLPackage.eINSTANCE.getMapType(),
			QualityMetamodel.QMM_OCL.QMM_OCLPackage.eINSTANCE.getLambdaType(),
			QualityMetamodel.QMM_OCL.QMM_OCLPackage.eINSTANCE.getEnvType(),
		};
	}
	
	public org.eclipse.emf.ecore.EClass[] getStartSymbols() {
		return new org.eclipse.emf.ecore.EClass[] {
			QualityMetamodel.QualityMetamodelPackage.eINSTANCE.getQualityModel(),
		};
	}
	
}
