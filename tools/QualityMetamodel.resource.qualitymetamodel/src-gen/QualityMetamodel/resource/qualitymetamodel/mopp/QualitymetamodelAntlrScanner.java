/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package QualityMetamodel.resource.qualitymetamodel.mopp;

public class QualitymetamodelAntlrScanner implements QualityMetamodel.resource.qualitymetamodel.IQualitymetamodelTextScanner {
	
	private org.antlr.runtime3_4_0.Lexer antlrLexer;
	
	public QualitymetamodelAntlrScanner(org.antlr.runtime3_4_0.Lexer antlrLexer) {
		this.antlrLexer = antlrLexer;
	}
	
	public QualityMetamodel.resource.qualitymetamodel.IQualitymetamodelTextToken getNextToken() {
		if (antlrLexer.getCharStream() == null) {
			return null;
		}
		final org.antlr.runtime3_4_0.Token current = antlrLexer.nextToken();
		if (current == null || current.getType() < 0) {
			return null;
		}
		QualityMetamodel.resource.qualitymetamodel.IQualitymetamodelTextToken result = new QualityMetamodel.resource.qualitymetamodel.mopp.QualitymetamodelANTLRTextToken(current);
		return result;
	}
	
	public void setText(String text) {
		antlrLexer.setCharStream(new org.antlr.runtime3_4_0.ANTLRStringStream(text));
	}
	
}
