/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package QualityMetamodel.resource.qualitymetamodel.mopp;

public class QualitymetamodelTokenStyleInformationProvider {
	
	public static String TASK_ITEM_TOKEN_NAME = "TASK_ITEM";
	
	public QualityMetamodel.resource.qualitymetamodel.IQualitymetamodelTokenStyle getDefaultTokenStyle(String tokenName) {
		if ("NOTOP".equals(tokenName)) {
			return new QualityMetamodel.resource.qualitymetamodel.mopp.QualitymetamodelTokenStyle(new int[] {0x80, 0x00, 0x40}, null, true, false, false, false);
		}
		if ("BOOLOP".equals(tokenName)) {
			return new QualityMetamodel.resource.qualitymetamodel.mopp.QualitymetamodelTokenStyle(new int[] {0x80, 0x00, 0x40}, null, true, false, false, false);
		}
		if ("INTOP".equals(tokenName)) {
			return new QualityMetamodel.resource.qualitymetamodel.mopp.QualitymetamodelTokenStyle(new int[] {0x80, 0x00, 0x40}, null, true, false, false, false);
		}
		if ("static".equals(tokenName)) {
			return new QualityMetamodel.resource.qualitymetamodel.mopp.QualitymetamodelTokenStyle(new int[] {0x80, 0x00, 0x40}, null, true, false, false, false);
		}
		if ("COMMENT".equals(tokenName)) {
			return new QualityMetamodel.resource.qualitymetamodel.mopp.QualitymetamodelTokenStyle(new int[] {0x53, 0x87, 0x6D}, null, false, false, false, false);
		}
		if ("FLOAT".equals(tokenName)) {
			return new QualityMetamodel.resource.qualitymetamodel.mopp.QualitymetamodelTokenStyle(new int[] {0x2A, 0x00, 0xFF}, null, false, false, false, false);
		}
		if ("INTEGER".equals(tokenName)) {
			return new QualityMetamodel.resource.qualitymetamodel.mopp.QualitymetamodelTokenStyle(new int[] {0x2A, 0x00, 0xFF}, null, false, false, false, false);
		}
		if ("STRINGTYPE".equals(tokenName)) {
			return new QualityMetamodel.resource.qualitymetamodel.mopp.QualitymetamodelTokenStyle(new int[] {0x00, 0xC0, 0x00}, null, false, false, false, false);
		}
		if ("BOOLEANTYPE".equals(tokenName)) {
			return new QualityMetamodel.resource.qualitymetamodel.mopp.QualitymetamodelTokenStyle(new int[] {0x00, 0xC0, 0x00}, null, false, false, false, false);
		}
		if ("INTEGERTYPE".equals(tokenName)) {
			return new QualityMetamodel.resource.qualitymetamodel.mopp.QualitymetamodelTokenStyle(new int[] {0x00, 0xC0, 0x00}, null, false, false, false, false);
		}
		if ("REALTYPE".equals(tokenName)) {
			return new QualityMetamodel.resource.qualitymetamodel.mopp.QualitymetamodelTokenStyle(new int[] {0x00, 0xC0, 0x00}, null, false, false, false, false);
		}
		if ("COLLECTIONTYPE".equals(tokenName)) {
			return new QualityMetamodel.resource.qualitymetamodel.mopp.QualitymetamodelTokenStyle(new int[] {0x00, 0xC0, 0x00}, null, false, false, false, false);
		}
		if ("BAGTYPE".equals(tokenName)) {
			return new QualityMetamodel.resource.qualitymetamodel.mopp.QualitymetamodelTokenStyle(new int[] {0x00, 0xC0, 0x00}, null, false, false, false, false);
		}
		if ("ORDEREDSETTYPE".equals(tokenName)) {
			return new QualityMetamodel.resource.qualitymetamodel.mopp.QualitymetamodelTokenStyle(new int[] {0x00, 0xC0, 0x00}, null, false, false, false, false);
		}
		if ("SEQUENCETYPE".equals(tokenName)) {
			return new QualityMetamodel.resource.qualitymetamodel.mopp.QualitymetamodelTokenStyle(new int[] {0x00, 0xC0, 0x00}, null, false, false, false, false);
		}
		if ("SETTYPE".equals(tokenName)) {
			return new QualityMetamodel.resource.qualitymetamodel.mopp.QualitymetamodelTokenStyle(new int[] {0x00, 0xC0, 0x00}, null, false, false, false, false);
		}
		if ("OCLANYTYPE".equals(tokenName)) {
			return new QualityMetamodel.resource.qualitymetamodel.mopp.QualitymetamodelTokenStyle(new int[] {0x00, 0xC0, 0x00}, null, false, false, false, false);
		}
		if ("OCLTYPE".equals(tokenName)) {
			return new QualityMetamodel.resource.qualitymetamodel.mopp.QualitymetamodelTokenStyle(new int[] {0x00, 0xC0, 0x00}, null, false, false, false, false);
		}
		if ("TUPLE".equals(tokenName)) {
			return new QualityMetamodel.resource.qualitymetamodel.mopp.QualitymetamodelTokenStyle(new int[] {0x00, 0xC0, 0x00}, null, false, false, false, false);
		}
		if ("TUPLETYPE".equals(tokenName)) {
			return new QualityMetamodel.resource.qualitymetamodel.mopp.QualitymetamodelTokenStyle(new int[] {0x00, 0xC0, 0x00}, null, false, false, false, false);
		}
		if ("MAPTYPE".equals(tokenName)) {
			return new QualityMetamodel.resource.qualitymetamodel.mopp.QualitymetamodelTokenStyle(new int[] {0x00, 0xC0, 0x00}, null, false, false, false, false);
		}
		if ("LAMBDATYPE".equals(tokenName)) {
			return new QualityMetamodel.resource.qualitymetamodel.mopp.QualitymetamodelTokenStyle(new int[] {0x00, 0xC0, 0x00}, null, false, false, false, false);
		}
		if ("ENVTYPE".equals(tokenName)) {
			return new QualityMetamodel.resource.qualitymetamodel.mopp.QualitymetamodelTokenStyle(new int[] {0x00, 0xC0, 0x00}, null, false, false, false, false);
		}
		if ("true".equals(tokenName)) {
			return new QualityMetamodel.resource.qualitymetamodel.mopp.QualitymetamodelTokenStyle(new int[] {0x00, 0xD0, 0xFF}, null, false, false, false, false);
		}
		if ("false".equals(tokenName)) {
			return new QualityMetamodel.resource.qualitymetamodel.mopp.QualitymetamodelTokenStyle(new int[] {0x00, 0xD0, 0xFF}, null, false, false, false, false);
		}
		if ("iterate".equals(tokenName)) {
			return new QualityMetamodel.resource.qualitymetamodel.mopp.QualitymetamodelTokenStyle(new int[] {0x00, 0x00, 0x00}, null, false, false, false, false);
		}
		if ("UNSET".equals(tokenName)) {
			return new QualityMetamodel.resource.qualitymetamodel.mopp.QualitymetamodelTokenStyle(new int[] {0x01, 0xDF, 0x01}, null, false, false, false, false);
		}
		if ("name:".equals(tokenName)) {
			return new QualityMetamodel.resource.qualitymetamodel.mopp.QualitymetamodelTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("metricProviders:".equals(tokenName)) {
			return new QualityMetamodel.resource.qualitymetamodel.mopp.QualitymetamodelTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("qualityTypes:".equals(tokenName)) {
			return new QualityMetamodel.resource.qualitymetamodel.mopp.QualitymetamodelTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("qualityAttributes:".equals(tokenName)) {
			return new QualityMetamodel.resource.qualitymetamodel.mopp.QualitymetamodelTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("qualityValues:".equals(tokenName)) {
			return new QualityMetamodel.resource.qualitymetamodel.mopp.QualitymetamodelTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("values:".equals(tokenName)) {
			return new QualityMetamodel.resource.qualitymetamodel.mopp.QualitymetamodelTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("description:".equals(tokenName)) {
			return new QualityMetamodel.resource.qualitymetamodel.mopp.QualitymetamodelTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("id:".equals(tokenName)) {
			return new QualityMetamodel.resource.qualitymetamodel.mopp.QualitymetamodelTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("measuredBy:".equals(tokenName)) {
			return new QualityMetamodel.resource.qualitymetamodel.mopp.QualitymetamodelTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("type:".equals(tokenName)) {
			return new QualityMetamodel.resource.qualitymetamodel.mopp.QualitymetamodelTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("calculatedBy:".equals(tokenName)) {
			return new QualityMetamodel.resource.qualitymetamodel.mopp.QualitymetamodelTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("aggregatedValue:".equals(tokenName)) {
			return new QualityMetamodel.resource.qualitymetamodel.mopp.QualitymetamodelTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("expr:".equals(tokenName)) {
			return new QualityMetamodel.resource.qualitymetamodel.mopp.QualitymetamodelTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("value:".equals(tokenName)) {
			return new QualityMetamodel.resource.qualitymetamodel.mopp.QualitymetamodelTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("AggregatedValueMetric".equals(tokenName)) {
			return new QualityMetamodel.resource.qualitymetamodel.mopp.QualitymetamodelTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("set:".equals(tokenName)) {
			return new QualityMetamodel.resource.qualitymetamodel.mopp.QualitymetamodelTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("_type:".equals(tokenName)) {
			return new QualityMetamodel.resource.qualitymetamodel.mopp.QualitymetamodelTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("module".equals(tokenName)) {
			return new QualityMetamodel.resource.qualitymetamodel.mopp.QualitymetamodelTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("import".equals(tokenName)) {
			return new QualityMetamodel.resource.qualitymetamodel.mopp.QualitymetamodelTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("def".equals(tokenName)) {
			return new QualityMetamodel.resource.qualitymetamodel.mopp.QualitymetamodelTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("context".equals(tokenName)) {
			return new QualityMetamodel.resource.qualitymetamodel.mopp.QualitymetamodelTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("metamodel".equals(tokenName)) {
			return new QualityMetamodel.resource.qualitymetamodel.mopp.QualitymetamodelTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("super".equals(tokenName)) {
			return new QualityMetamodel.resource.qualitymetamodel.mopp.QualitymetamodelTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("self".equals(tokenName)) {
			return new QualityMetamodel.resource.qualitymetamodel.mopp.QualitymetamodelTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("env".equals(tokenName)) {
			return new QualityMetamodel.resource.qualitymetamodel.mopp.QualitymetamodelTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("Bag".equals(tokenName)) {
			return new QualityMetamodel.resource.qualitymetamodel.mopp.QualitymetamodelTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("OrderedSet".equals(tokenName)) {
			return new QualityMetamodel.resource.qualitymetamodel.mopp.QualitymetamodelTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("Sequence".equals(tokenName)) {
			return new QualityMetamodel.resource.qualitymetamodel.mopp.QualitymetamodelTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("Set".equals(tokenName)) {
			return new QualityMetamodel.resource.qualitymetamodel.mopp.QualitymetamodelTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("Tuple".equals(tokenName)) {
			return new QualityMetamodel.resource.qualitymetamodel.mopp.QualitymetamodelTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("Map".equals(tokenName)) {
			return new QualityMetamodel.resource.qualitymetamodel.mopp.QualitymetamodelTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("OclUndefined".equals(tokenName)) {
			return new QualityMetamodel.resource.qualitymetamodel.mopp.QualitymetamodelTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("let".equals(tokenName)) {
			return new QualityMetamodel.resource.qualitymetamodel.mopp.QualitymetamodelTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("in".equals(tokenName)) {
			return new QualityMetamodel.resource.qualitymetamodel.mopp.QualitymetamodelTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("if".equals(tokenName)) {
			return new QualityMetamodel.resource.qualitymetamodel.mopp.QualitymetamodelTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("then".equals(tokenName)) {
			return new QualityMetamodel.resource.qualitymetamodel.mopp.QualitymetamodelTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("else".equals(tokenName)) {
			return new QualityMetamodel.resource.qualitymetamodel.mopp.QualitymetamodelTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("endif".equals(tokenName)) {
			return new QualityMetamodel.resource.qualitymetamodel.mopp.QualitymetamodelTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("QUOTED_34_34_92".equals(tokenName)) {
			return new QualityMetamodel.resource.qualitymetamodel.mopp.QualitymetamodelTokenStyle(new int[] {0x2A, 0x00, 0xFF}, null, false, false, false, false);
		}
		if ("QUOTED_39_39_92".equals(tokenName)) {
			return new QualityMetamodel.resource.qualitymetamodel.mopp.QualitymetamodelTokenStyle(new int[] {0x2A, 0x00, 0xFF}, null, false, false, false, false);
		}
		if ("TASK_ITEM".equals(tokenName)) {
			return new QualityMetamodel.resource.qualitymetamodel.mopp.QualitymetamodelTokenStyle(new int[] {0x7F, 0x9F, 0xBF}, null, true, false, false, false);
		}
		return null;
	}
	
}
