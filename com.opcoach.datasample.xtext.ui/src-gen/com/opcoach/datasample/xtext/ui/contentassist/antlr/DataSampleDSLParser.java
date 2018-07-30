/*
 * generated by Xtext
 */
package com.opcoach.datasample.xtext.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import com.opcoach.datasample.xtext.services.DataSampleDSLGrammarAccess;

public class DataSampleDSLParser extends AbstractContentAssistParser {
	
	@Inject
	private DataSampleDSLGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected com.opcoach.datasample.xtext.ui.contentassist.antlr.internal.InternalDataSampleDSLParser createParser() {
		com.opcoach.datasample.xtext.ui.contentassist.antlr.internal.InternalDataSampleDSLParser result = new com.opcoach.datasample.xtext.ui.contentassist.antlr.internal.InternalDataSampleDSLParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getEStringAccess().getAlternatives(), "rule__EString__Alternatives");
					put(grammarAccess.getLanguageAccess().getAlternatives(), "rule__Language__Alternatives");
					put(grammarAccess.getDataSampleAccess().getGroup(), "rule__DataSample__Group__0");
					put(grammarAccess.getEIntAccess().getGroup(), "rule__EInt__Group__0");
					put(grammarAccess.getEntityGeneratorAccess().getGroup(), "rule__EntityGenerator__Group__0");
					put(grammarAccess.getFieldGeneratorAccess().getGroup(), "rule__FieldGenerator__Group__0");
					put(grammarAccess.getFieldGeneratorAccess().getGroup_5(), "rule__FieldGenerator__Group_5__0");
					put(grammarAccess.getFieldGeneratorAccess().getGroup_6(), "rule__FieldGenerator__Group_6__0");
					put(grammarAccess.getFieldGeneratorAccess().getGroup_6_2(), "rule__FieldGenerator__Group_6_2__0");
					put(grammarAccess.getFieldGeneratorAccess().getGroup_7(), "rule__FieldGenerator__Group_7__0");
					put(grammarAccess.getChildrenGeneratorAccess().getGroup(), "rule__ChildrenGenerator__Group__0");
					put(grammarAccess.getChildrenGeneratorAccess().getGroup_5(), "rule__ChildrenGenerator__Group_5__0");
					put(grammarAccess.getChildrenGeneratorAccess().getGroup_6(), "rule__ChildrenGenerator__Group_6__0");
					put(grammarAccess.getChildrenGeneratorAccess().getGroup_6_2(), "rule__ChildrenGenerator__Group_6_2__0");
					put(grammarAccess.getChildrenGeneratorAccess().getGroup_7(), "rule__ChildrenGenerator__Group_7__0");
					put(grammarAccess.getAssociationGeneratorAccess().getGroup(), "rule__AssociationGenerator__Group__0");
					put(grammarAccess.getAssociationGeneratorAccess().getGroup_5(), "rule__AssociationGenerator__Group_5__0");
					put(grammarAccess.getAssociationGeneratorAccess().getGroup_6(), "rule__AssociationGenerator__Group_6__0");
					put(grammarAccess.getAssociationGeneratorAccess().getGroup_6_2(), "rule__AssociationGenerator__Group_6_2__0");
					put(grammarAccess.getAssociationGeneratorAccess().getGroup_7(), "rule__AssociationGenerator__Group_7__0");
					put(grammarAccess.getParameterAccess().getGroup(), "rule__Parameter__Group__0");
					put(grammarAccess.getDataSampleAccess().getNameAssignment_2(), "rule__DataSample__NameAssignment_2");
					put(grammarAccess.getDataSampleAccess().getPackageURIAssignment_4(), "rule__DataSample__PackageURIAssignment_4");
					put(grammarAccess.getDataSampleAccess().getRootEntityNameAssignment_6(), "rule__DataSample__RootEntityNameAssignment_6");
					put(grammarAccess.getDataSampleAccess().getSeedAssignment_8(), "rule__DataSample__SeedAssignment_8");
					put(grammarAccess.getDataSampleAccess().getLanguageAssignment_10(), "rule__DataSample__LanguageAssignment_10");
					put(grammarAccess.getDataSampleAccess().getEntityGeneratorsAssignment_11(), "rule__DataSample__EntityGeneratorsAssignment_11");
					put(grammarAccess.getEntityGeneratorAccess().getNumberAssignment_2(), "rule__EntityGenerator__NumberAssignment_2");
					put(grammarAccess.getEntityGeneratorAccess().getEntityNameAssignment_4(), "rule__EntityGenerator__EntityNameAssignment_4");
					put(grammarAccess.getEntityGeneratorAccess().getFieldGeneratorsAssignment_6(), "rule__EntityGenerator__FieldGeneratorsAssignment_6");
					put(grammarAccess.getEntityGeneratorAccess().getChildGeneratorsAssignment_7(), "rule__EntityGenerator__ChildGeneratorsAssignment_7");
					put(grammarAccess.getEntityGeneratorAccess().getAssociationGeneratorsAssignment_8(), "rule__EntityGenerator__AssociationGeneratorsAssignment_8");
					put(grammarAccess.getFieldGeneratorAccess().getFieldNameAssignment_2(), "rule__FieldGenerator__FieldNameAssignment_2");
					put(grammarAccess.getFieldGeneratorAccess().getGeneratorNameAssignment_4(), "rule__FieldGenerator__GeneratorNameAssignment_4");
					put(grammarAccess.getFieldGeneratorAccess().getNumberAssignment_5_1(), "rule__FieldGenerator__NumberAssignment_5_1");
					put(grammarAccess.getFieldGeneratorAccess().getParametersAssignment_6_1(), "rule__FieldGenerator__ParametersAssignment_6_1");
					put(grammarAccess.getFieldGeneratorAccess().getParametersAssignment_6_2_1(), "rule__FieldGenerator__ParametersAssignment_6_2_1");
					put(grammarAccess.getFieldGeneratorAccess().getErrorRateAssignment_7_1(), "rule__FieldGenerator__ErrorRateAssignment_7_1");
					put(grammarAccess.getFieldGeneratorAccess().getErrorGeneratorNameAssignment_7_3(), "rule__FieldGenerator__ErrorGeneratorNameAssignment_7_3");
					put(grammarAccess.getChildrenGeneratorAccess().getFieldNameAssignment_2(), "rule__ChildrenGenerator__FieldNameAssignment_2");
					put(grammarAccess.getChildrenGeneratorAccess().getGeneratorNameAssignment_4(), "rule__ChildrenGenerator__GeneratorNameAssignment_4");
					put(grammarAccess.getChildrenGeneratorAccess().getNumberAssignment_5_1(), "rule__ChildrenGenerator__NumberAssignment_5_1");
					put(grammarAccess.getChildrenGeneratorAccess().getParametersAssignment_6_1(), "rule__ChildrenGenerator__ParametersAssignment_6_1");
					put(grammarAccess.getChildrenGeneratorAccess().getParametersAssignment_6_2_1(), "rule__ChildrenGenerator__ParametersAssignment_6_2_1");
					put(grammarAccess.getChildrenGeneratorAccess().getErrorRateAssignment_7_1(), "rule__ChildrenGenerator__ErrorRateAssignment_7_1");
					put(grammarAccess.getChildrenGeneratorAccess().getErrorGeneratorNameAssignment_7_3(), "rule__ChildrenGenerator__ErrorGeneratorNameAssignment_7_3");
					put(grammarAccess.getAssociationGeneratorAccess().getFieldNameAssignment_2(), "rule__AssociationGenerator__FieldNameAssignment_2");
					put(grammarAccess.getAssociationGeneratorAccess().getGeneratorNameAssignment_4(), "rule__AssociationGenerator__GeneratorNameAssignment_4");
					put(grammarAccess.getAssociationGeneratorAccess().getNumberAssignment_5_1(), "rule__AssociationGenerator__NumberAssignment_5_1");
					put(grammarAccess.getAssociationGeneratorAccess().getParametersAssignment_6_1(), "rule__AssociationGenerator__ParametersAssignment_6_1");
					put(grammarAccess.getAssociationGeneratorAccess().getParametersAssignment_6_2_1(), "rule__AssociationGenerator__ParametersAssignment_6_2_1");
					put(grammarAccess.getAssociationGeneratorAccess().getErrorRateAssignment_7_1(), "rule__AssociationGenerator__ErrorRateAssignment_7_1");
					put(grammarAccess.getAssociationGeneratorAccess().getErrorGeneratorNameAssignment_7_3(), "rule__AssociationGenerator__ErrorGeneratorNameAssignment_7_3");
					put(grammarAccess.getParameterAccess().getNameAssignment_0(), "rule__Parameter__NameAssignment_0");
					put(grammarAccess.getParameterAccess().getValueAssignment_2(), "rule__Parameter__ValueAssignment_2");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			com.opcoach.datasample.xtext.ui.contentassist.antlr.internal.InternalDataSampleDSLParser typedParser = (com.opcoach.datasample.xtext.ui.contentassist.antlr.internal.InternalDataSampleDSLParser) parser;
			typedParser.entryRuleDataSample();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public DataSampleDSLGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(DataSampleDSLGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
