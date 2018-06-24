/*
 * generated by Xtext
 */
package com.opcoach.datasample.xtext.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import com.opcoach.datasample.xtext.services.DataSampleDSLGrammarAccess;

public class DataSampleDSLParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private DataSampleDSLGrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	
	@Override
	protected com.opcoach.datasample.xtext.parser.antlr.internal.InternalDataSampleDSLParser createParser(XtextTokenStream stream) {
		return new com.opcoach.datasample.xtext.parser.antlr.internal.InternalDataSampleDSLParser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "DataSample";
	}
	
	public DataSampleDSLGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(DataSampleDSLGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}
