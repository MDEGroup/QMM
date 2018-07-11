/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package QualityMetamodel.resource.qualitymetamodel.mopp;

/**
 * The QualitymetamodelTokenResolverFactory class provides access to all generated
 * token resolvers. By giving the name of a defined token, the corresponding
 * resolve can be obtained. Despite the fact that this class is called
 * TokenResolverFactory is does NOT create new token resolvers whenever a client
 * calls methods to obtain a resolver. Rather, this class maintains a map of all
 * resolvers and creates each resolver at most once.
 */
public class QualitymetamodelTokenResolverFactory implements QualityMetamodel.resource.qualitymetamodel.IQualitymetamodelTokenResolverFactory {
	
	private java.util.Map<String, QualityMetamodel.resource.qualitymetamodel.IQualitymetamodelTokenResolver> tokenName2TokenResolver;
	private java.util.Map<String, QualityMetamodel.resource.qualitymetamodel.IQualitymetamodelTokenResolver> featureName2CollectInTokenResolver;
	private static QualityMetamodel.resource.qualitymetamodel.IQualitymetamodelTokenResolver defaultResolver = new QualityMetamodel.resource.qualitymetamodel.analysis.QualitymetamodelDefaultTokenResolver();
	
	public QualitymetamodelTokenResolverFactory() {
		tokenName2TokenResolver = new java.util.LinkedHashMap<String, QualityMetamodel.resource.qualitymetamodel.IQualitymetamodelTokenResolver>();
		featureName2CollectInTokenResolver = new java.util.LinkedHashMap<String, QualityMetamodel.resource.qualitymetamodel.IQualitymetamodelTokenResolver>();
		registerTokenResolver("NOTOP", new QualityMetamodel.resource.qualitymetamodel.analysis.QualitymetamodelNOTOPTokenResolver());
		registerTokenResolver("BOOLOP", new QualityMetamodel.resource.qualitymetamodel.analysis.QualitymetamodelBOOLOPTokenResolver());
		registerTokenResolver("INTOP", new QualityMetamodel.resource.qualitymetamodel.analysis.QualitymetamodelINTOPTokenResolver());
		registerTokenResolver("RELOP", new QualityMetamodel.resource.qualitymetamodel.analysis.QualitymetamodelRELOPTokenResolver());
		registerTokenResolver("EQ", new QualityMetamodel.resource.qualitymetamodel.analysis.QualitymetamodelEQTokenResolver());
		registerTokenResolver("NEQ", new QualityMetamodel.resource.qualitymetamodel.analysis.QualitymetamodelNEQTokenResolver());
		registerTokenResolver("ADDOP", new QualityMetamodel.resource.qualitymetamodel.analysis.QualitymetamodelADDOPTokenResolver());
		registerTokenResolver("MULOP", new QualityMetamodel.resource.qualitymetamodel.analysis.QualitymetamodelMULOPTokenResolver());
		registerTokenResolver("FLOAT", new QualityMetamodel.resource.qualitymetamodel.analysis.QualitymetamodelFLOATTokenResolver());
		registerTokenResolver("INTEGER", new QualityMetamodel.resource.qualitymetamodel.analysis.QualitymetamodelINTEGERTokenResolver());
		registerTokenResolver("STRINGTYPE", new QualityMetamodel.resource.qualitymetamodel.analysis.QualitymetamodelSTRINGTYPETokenResolver());
		registerTokenResolver("BOOLEANTYPE", new QualityMetamodel.resource.qualitymetamodel.analysis.QualitymetamodelBOOLEANTYPETokenResolver());
		registerTokenResolver("INTEGERTYPE", new QualityMetamodel.resource.qualitymetamodel.analysis.QualitymetamodelINTEGERTYPETokenResolver());
		registerTokenResolver("REALTYPE", new QualityMetamodel.resource.qualitymetamodel.analysis.QualitymetamodelREALTYPETokenResolver());
		registerTokenResolver("COLLECTIONTYPE", new QualityMetamodel.resource.qualitymetamodel.analysis.QualitymetamodelCOLLECTIONTYPETokenResolver());
		registerTokenResolver("BAGTYPE", new QualityMetamodel.resource.qualitymetamodel.analysis.QualitymetamodelBAGTYPETokenResolver());
		registerTokenResolver("ORDEREDSETTYPE", new QualityMetamodel.resource.qualitymetamodel.analysis.QualitymetamodelORDEREDSETTYPETokenResolver());
		registerTokenResolver("SEQUENCETYPE", new QualityMetamodel.resource.qualitymetamodel.analysis.QualitymetamodelSEQUENCETYPETokenResolver());
		registerTokenResolver("SETTYPE", new QualityMetamodel.resource.qualitymetamodel.analysis.QualitymetamodelSETTYPETokenResolver());
		registerTokenResolver("OCLANYTYPE", new QualityMetamodel.resource.qualitymetamodel.analysis.QualitymetamodelOCLANYTYPETokenResolver());
		registerTokenResolver("OCLTYPE", new QualityMetamodel.resource.qualitymetamodel.analysis.QualitymetamodelOCLTYPETokenResolver());
		registerTokenResolver("TUPLETYPE", new QualityMetamodel.resource.qualitymetamodel.analysis.QualitymetamodelTUPLETYPETokenResolver());
		registerTokenResolver("TUPLE", new QualityMetamodel.resource.qualitymetamodel.analysis.QualitymetamodelTUPLETokenResolver());
		registerTokenResolver("MAPTYPE", new QualityMetamodel.resource.qualitymetamodel.analysis.QualitymetamodelMAPTYPETokenResolver());
		registerTokenResolver("LAMBDATYPE", new QualityMetamodel.resource.qualitymetamodel.analysis.QualitymetamodelLAMBDATYPETokenResolver());
		registerTokenResolver("ENVTYPE", new QualityMetamodel.resource.qualitymetamodel.analysis.QualitymetamodelENVTYPETokenResolver());
		registerTokenResolver("TEXT", new QualityMetamodel.resource.qualitymetamodel.analysis.QualitymetamodelTEXTTokenResolver());
		registerTokenResolver("QUOTED_34_34_92", new QualityMetamodel.resource.qualitymetamodel.analysis.QualitymetamodelQUOTED_34_34_92TokenResolver());
		registerTokenResolver("QUOTED_39_39_92", new QualityMetamodel.resource.qualitymetamodel.analysis.QualitymetamodelQUOTED_39_39_92TokenResolver());
	}
	
	public QualityMetamodel.resource.qualitymetamodel.IQualitymetamodelTokenResolver createTokenResolver(String tokenName) {
		return internalCreateResolver(tokenName2TokenResolver, tokenName);
	}
	
	public QualityMetamodel.resource.qualitymetamodel.IQualitymetamodelTokenResolver createCollectInTokenResolver(String featureName) {
		return internalCreateResolver(featureName2CollectInTokenResolver, featureName);
	}
	
	protected boolean registerTokenResolver(String tokenName, QualityMetamodel.resource.qualitymetamodel.IQualitymetamodelTokenResolver resolver){
		return internalRegisterTokenResolver(tokenName2TokenResolver, tokenName, resolver);
	}
	
	protected boolean registerCollectInTokenResolver(String featureName, QualityMetamodel.resource.qualitymetamodel.IQualitymetamodelTokenResolver resolver){
		return internalRegisterTokenResolver(featureName2CollectInTokenResolver, featureName, resolver);
	}
	
	protected QualityMetamodel.resource.qualitymetamodel.IQualitymetamodelTokenResolver deRegisterTokenResolver(String tokenName){
		return tokenName2TokenResolver.remove(tokenName);
	}
	
	private QualityMetamodel.resource.qualitymetamodel.IQualitymetamodelTokenResolver internalCreateResolver(java.util.Map<String, QualityMetamodel.resource.qualitymetamodel.IQualitymetamodelTokenResolver> resolverMap, String key) {
		if (resolverMap.containsKey(key)){
			return resolverMap.get(key);
		} else {
			return defaultResolver;
		}
	}
	
	private boolean internalRegisterTokenResolver(java.util.Map<String, QualityMetamodel.resource.qualitymetamodel.IQualitymetamodelTokenResolver> resolverMap, String key, QualityMetamodel.resource.qualitymetamodel.IQualitymetamodelTokenResolver resolver) {
		if (!resolverMap.containsKey(key)) {
			resolverMap.put(key,resolver);
			return true;
		}
		return false;
	}
	
}
