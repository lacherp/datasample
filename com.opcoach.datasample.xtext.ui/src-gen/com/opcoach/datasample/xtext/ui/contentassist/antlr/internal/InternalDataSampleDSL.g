/*
 * generated by Xtext
 */
grammar InternalDataSampleDSL;

options {
	superClass=AbstractInternalContentAssistParser;
	
}

@lexer::header {
package com.opcoach.datasample.xtext.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package com.opcoach.datasample.xtext.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import com.opcoach.datasample.xtext.services.DataSampleDSLGrammarAccess;

}

@parser::members {
 
 	private DataSampleDSLGrammarAccess grammarAccess;
 	
    public void setGrammarAccess(DataSampleDSLGrammarAccess grammarAccess) {
    	this.grammarAccess = grammarAccess;
    }
    
    @Override
    protected Grammar getGrammar() {
    	return grammarAccess.getGrammar();
    }
    
    @Override
    protected String getValueForTokenName(String tokenName) {
    	return tokenName;
    }

}




// Entry rule entryRuleDataSample
entryRuleDataSample 
:
{ before(grammarAccess.getDataSampleRule()); }
	 ruleDataSample
{ after(grammarAccess.getDataSampleRule()); } 
	 EOF 
;

// Rule DataSample
ruleDataSample
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getDataSampleAccess().getGroup()); }
(rule__DataSample__Group__0)
{ after(grammarAccess.getDataSampleAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleEString
entryRuleEString 
:
{ before(grammarAccess.getEStringRule()); }
	 ruleEString
{ after(grammarAccess.getEStringRule()); } 
	 EOF 
;

// Rule EString
ruleEString
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getEStringAccess().getAlternatives()); }
(rule__EString__Alternatives)
{ after(grammarAccess.getEStringAccess().getAlternatives()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleEInt
entryRuleEInt 
:
{ before(grammarAccess.getEIntRule()); }
	 ruleEInt
{ after(grammarAccess.getEIntRule()); } 
	 EOF 
;

// Rule EInt
ruleEInt
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getEIntAccess().getGroup()); }
(rule__EInt__Group__0)
{ after(grammarAccess.getEIntAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleEntityGenerator2
entryRuleEntityGenerator2 
:
{ before(grammarAccess.getEntityGenerator2Rule()); }
	 ruleEntityGenerator2
{ after(grammarAccess.getEntityGenerator2Rule()); } 
	 EOF 
;

// Rule EntityGenerator2
ruleEntityGenerator2
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getEntityGenerator2Access().getGroup()); }
(rule__EntityGenerator2__Group__0)
{ after(grammarAccess.getEntityGenerator2Access().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}





// Entry rule entryRuleFieldGenerator2
entryRuleFieldGenerator2 
:
{ before(grammarAccess.getFieldGenerator2Rule()); }
	 ruleFieldGenerator2
{ after(grammarAccess.getFieldGenerator2Rule()); } 
	 EOF 
;

// Rule FieldGenerator2
ruleFieldGenerator2
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getFieldGenerator2Access().getGroup()); }
(rule__FieldGenerator2__Group__0)
{ after(grammarAccess.getFieldGenerator2Access().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}






// Rule Language
ruleLanguage
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getLanguageAccess().getAlternatives()); }
(rule__Language__Alternatives)
{ after(grammarAccess.getLanguageAccess().getAlternatives()); }
)

;
finally {
	restoreStackSize(stackSize);
}



rule__EString__Alternatives
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); }
	RULE_STRING
{ after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); }
)

    |(
{ before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); }
	RULE_ID
{ after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Language__Alternatives
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getLanguageAccess().getFrEnumLiteralDeclaration_0()); }
(	'fr' 
)
{ after(grammarAccess.getLanguageAccess().getFrEnumLiteralDeclaration_0()); }
)

    |(
{ before(grammarAccess.getLanguageAccess().getEnEnumLiteralDeclaration_1()); }
(	'en' 
)
{ after(grammarAccess.getLanguageAccess().getEnEnumLiteralDeclaration_1()); }
)

    |(
{ before(grammarAccess.getLanguageAccess().getDeEnumLiteralDeclaration_2()); }
(	'de' 
)
{ after(grammarAccess.getLanguageAccess().getDeEnumLiteralDeclaration_2()); }
)

    |(
{ before(grammarAccess.getLanguageAccess().getEsEnumLiteralDeclaration_3()); }
(	'es' 
)
{ after(grammarAccess.getLanguageAccess().getEsEnumLiteralDeclaration_3()); }
)

    |(
{ before(grammarAccess.getLanguageAccess().getItEnumLiteralDeclaration_4()); }
(	'it' 
)
{ after(grammarAccess.getLanguageAccess().getItEnumLiteralDeclaration_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}



rule__DataSample__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__DataSample__Group__0__Impl
	rule__DataSample__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DataSample__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDataSampleAccess().getDataSampleAction_0()); }
(

)
{ after(grammarAccess.getDataSampleAccess().getDataSampleAction_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__DataSample__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__DataSample__Group__1__Impl
	rule__DataSample__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__DataSample__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDataSampleAccess().getSampleKeyword_1()); }

	'Sample' 

{ after(grammarAccess.getDataSampleAccess().getSampleKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__DataSample__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__DataSample__Group__2__Impl
	rule__DataSample__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__DataSample__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDataSampleAccess().getNameAssignment_2()); }
(rule__DataSample__NameAssignment_2)
{ after(grammarAccess.getDataSampleAccess().getNameAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__DataSample__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__DataSample__Group__3__Impl
	rule__DataSample__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__DataSample__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDataSampleAccess().getForKeyword_3()); }

	'for ' 

{ after(grammarAccess.getDataSampleAccess().getForKeyword_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__DataSample__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__DataSample__Group__4__Impl
	rule__DataSample__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__DataSample__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDataSampleAccess().getPackageURIAssignment_4()); }
(rule__DataSample__PackageURIAssignment_4)
{ after(grammarAccess.getDataSampleAccess().getPackageURIAssignment_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__DataSample__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__DataSample__Group__5__Impl
	rule__DataSample__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__DataSample__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDataSampleAccess().getLeftCurlyBracketKeyword_5()); }

	'{' 

{ after(grammarAccess.getDataSampleAccess().getLeftCurlyBracketKeyword_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__DataSample__Group__6
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__DataSample__Group__6__Impl
	rule__DataSample__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__DataSample__Group__6__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDataSampleAccess().getSeedKeyword_6()); }

	'seed' 

{ after(grammarAccess.getDataSampleAccess().getSeedKeyword_6()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__DataSample__Group__7
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__DataSample__Group__7__Impl
	rule__DataSample__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__DataSample__Group__7__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDataSampleAccess().getSeedAssignment_7()); }
(rule__DataSample__SeedAssignment_7)
{ after(grammarAccess.getDataSampleAccess().getSeedAssignment_7()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__DataSample__Group__8
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__DataSample__Group__8__Impl
	rule__DataSample__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__DataSample__Group__8__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDataSampleAccess().getLanguageKeyword_8()); }

	'language' 

{ after(grammarAccess.getDataSampleAccess().getLanguageKeyword_8()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__DataSample__Group__9
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__DataSample__Group__9__Impl
	rule__DataSample__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__DataSample__Group__9__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDataSampleAccess().getLanguageAssignment_9()); }
(rule__DataSample__LanguageAssignment_9)
{ after(grammarAccess.getDataSampleAccess().getLanguageAssignment_9()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__DataSample__Group__10
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__DataSample__Group__10__Impl
	rule__DataSample__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__DataSample__Group__10__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDataSampleAccess().getGroup_10()); }
(rule__DataSample__Group_10__0)?
{ after(grammarAccess.getDataSampleAccess().getGroup_10()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__DataSample__Group__11
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__DataSample__Group__11__Impl
	rule__DataSample__Group__12
;
finally {
	restoreStackSize(stackSize);
}

rule__DataSample__Group__11__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDataSampleAccess().getInTheRootObjectGenerateKeyword_11()); }

	'In the root object generate ' 

{ after(grammarAccess.getDataSampleAccess().getInTheRootObjectGenerateKeyword_11()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__DataSample__Group__12
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__DataSample__Group__12__Impl
	rule__DataSample__Group__13
;
finally {
	restoreStackSize(stackSize);
}

rule__DataSample__Group__12__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDataSampleAccess().getEntityGeneratorsAssignment_12()); }
(rule__DataSample__EntityGeneratorsAssignment_12)
{ after(grammarAccess.getDataSampleAccess().getEntityGeneratorsAssignment_12()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__DataSample__Group__13
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__DataSample__Group__13__Impl
	rule__DataSample__Group__14
;
finally {
	restoreStackSize(stackSize);
}

rule__DataSample__Group__13__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDataSampleAccess().getGroup_13()); }
(rule__DataSample__Group_13__0)*
{ after(grammarAccess.getDataSampleAccess().getGroup_13()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__DataSample__Group__14
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__DataSample__Group__14__Impl
	rule__DataSample__Group__15
;
finally {
	restoreStackSize(stackSize);
}

rule__DataSample__Group__14__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDataSampleAccess().getFieldGeneratorsAssignment_14()); }
(rule__DataSample__FieldGeneratorsAssignment_14)
{ after(grammarAccess.getDataSampleAccess().getFieldGeneratorsAssignment_14()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__DataSample__Group__15
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__DataSample__Group__15__Impl
	rule__DataSample__Group__16
;
finally {
	restoreStackSize(stackSize);
}

rule__DataSample__Group__15__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDataSampleAccess().getGroup_15()); }
(rule__DataSample__Group_15__0)*
{ after(grammarAccess.getDataSampleAccess().getGroup_15()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__DataSample__Group__16
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__DataSample__Group__16__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DataSample__Group__16__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDataSampleAccess().getRightCurlyBracketKeyword_16()); }

	'}' 

{ after(grammarAccess.getDataSampleAccess().getRightCurlyBracketKeyword_16()); }
)

;
finally {
	restoreStackSize(stackSize);
}




































rule__DataSample__Group_10__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__DataSample__Group_10__0__Impl
	rule__DataSample__Group_10__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DataSample__Group_10__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDataSampleAccess().getBadValueGeneratorNamesKeyword_10_0()); }

	'badValueGeneratorNames' 

{ after(grammarAccess.getDataSampleAccess().getBadValueGeneratorNamesKeyword_10_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__DataSample__Group_10__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__DataSample__Group_10__1__Impl
	rule__DataSample__Group_10__2
;
finally {
	restoreStackSize(stackSize);
}

rule__DataSample__Group_10__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDataSampleAccess().getLeftCurlyBracketKeyword_10_1()); }

	'{' 

{ after(grammarAccess.getDataSampleAccess().getLeftCurlyBracketKeyword_10_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__DataSample__Group_10__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__DataSample__Group_10__2__Impl
	rule__DataSample__Group_10__3
;
finally {
	restoreStackSize(stackSize);
}

rule__DataSample__Group_10__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDataSampleAccess().getBadValueGeneratorNamesAssignment_10_2()); }
(rule__DataSample__BadValueGeneratorNamesAssignment_10_2)
{ after(grammarAccess.getDataSampleAccess().getBadValueGeneratorNamesAssignment_10_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__DataSample__Group_10__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__DataSample__Group_10__3__Impl
	rule__DataSample__Group_10__4
;
finally {
	restoreStackSize(stackSize);
}

rule__DataSample__Group_10__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDataSampleAccess().getGroup_10_3()); }
(rule__DataSample__Group_10_3__0)*
{ after(grammarAccess.getDataSampleAccess().getGroup_10_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__DataSample__Group_10__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__DataSample__Group_10__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DataSample__Group_10__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDataSampleAccess().getRightCurlyBracketKeyword_10_4()); }

	'}' 

{ after(grammarAccess.getDataSampleAccess().getRightCurlyBracketKeyword_10_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}












rule__DataSample__Group_10_3__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__DataSample__Group_10_3__0__Impl
	rule__DataSample__Group_10_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DataSample__Group_10_3__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDataSampleAccess().getCommaKeyword_10_3_0()); }

	',' 

{ after(grammarAccess.getDataSampleAccess().getCommaKeyword_10_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__DataSample__Group_10_3__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__DataSample__Group_10_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DataSample__Group_10_3__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDataSampleAccess().getBadValueGeneratorNamesAssignment_10_3_1()); }
(rule__DataSample__BadValueGeneratorNamesAssignment_10_3_1)
{ after(grammarAccess.getDataSampleAccess().getBadValueGeneratorNamesAssignment_10_3_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__DataSample__Group_13__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__DataSample__Group_13__0__Impl
	rule__DataSample__Group_13__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DataSample__Group_13__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDataSampleAccess().getCommaKeyword_13_0()); }

	',' 

{ after(grammarAccess.getDataSampleAccess().getCommaKeyword_13_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__DataSample__Group_13__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__DataSample__Group_13__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DataSample__Group_13__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDataSampleAccess().getEntityGeneratorsAssignment_13_1()); }
(rule__DataSample__EntityGeneratorsAssignment_13_1)
{ after(grammarAccess.getDataSampleAccess().getEntityGeneratorsAssignment_13_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__DataSample__Group_15__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__DataSample__Group_15__0__Impl
	rule__DataSample__Group_15__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DataSample__Group_15__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDataSampleAccess().getCommaKeyword_15_0()); }

	',' 

{ after(grammarAccess.getDataSampleAccess().getCommaKeyword_15_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__DataSample__Group_15__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__DataSample__Group_15__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DataSample__Group_15__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDataSampleAccess().getFieldGeneratorsAssignment_15_1()); }
(rule__DataSample__FieldGeneratorsAssignment_15_1)
{ after(grammarAccess.getDataSampleAccess().getFieldGeneratorsAssignment_15_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__EInt__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__EInt__Group__0__Impl
	rule__EInt__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__EInt__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); }
(
	'-' 
)?
{ after(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__EInt__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__EInt__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__EInt__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); }
	RULE_INT
{ after(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__EntityGenerator2__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__EntityGenerator2__Group__0__Impl
	rule__EntityGenerator2__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__EntityGenerator2__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEntityGenerator2Access().getEntityGeneratorAction_0()); }
(

)
{ after(grammarAccess.getEntityGenerator2Access().getEntityGeneratorAction_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__EntityGenerator2__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__EntityGenerator2__Group__1__Impl
	rule__EntityGenerator2__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__EntityGenerator2__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEntityGenerator2Access().getNumberAssignment_1()); }
(rule__EntityGenerator2__NumberAssignment_1)
{ after(grammarAccess.getEntityGenerator2Access().getNumberAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__EntityGenerator2__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__EntityGenerator2__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__EntityGenerator2__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEntityGenerator2Access().getEntityNameAssignment_2()); }
(rule__EntityGenerator2__EntityNameAssignment_2)
{ after(grammarAccess.getEntityGenerator2Access().getEntityNameAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}












rule__FieldGenerator2__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__FieldGenerator2__Group__0__Impl
	rule__FieldGenerator2__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__FieldGenerator2__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFieldGenerator2Access().getForFieldKeyword_0()); }

	'forField' 

{ after(grammarAccess.getFieldGenerator2Access().getForFieldKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__FieldGenerator2__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__FieldGenerator2__Group__1__Impl
	rule__FieldGenerator2__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__FieldGenerator2__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFieldGenerator2Access().getEntityNameAssignment_1()); }
(rule__FieldGenerator2__EntityNameAssignment_1)
{ after(grammarAccess.getFieldGenerator2Access().getEntityNameAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__FieldGenerator2__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__FieldGenerator2__Group__2__Impl
	rule__FieldGenerator2__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__FieldGenerator2__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFieldGenerator2Access().getFullStopKeyword_2()); }

	'.' 

{ after(grammarAccess.getFieldGenerator2Access().getFullStopKeyword_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__FieldGenerator2__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__FieldGenerator2__Group__3__Impl
	rule__FieldGenerator2__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__FieldGenerator2__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFieldGenerator2Access().getFieldNameAssignment_3()); }
(rule__FieldGenerator2__FieldNameAssignment_3)
{ after(grammarAccess.getFieldGenerator2Access().getFieldNameAssignment_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__FieldGenerator2__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__FieldGenerator2__Group__4__Impl
	rule__FieldGenerator2__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__FieldGenerator2__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFieldGenerator2Access().getUseKeyword_4()); }

	'use' 

{ after(grammarAccess.getFieldGenerator2Access().getUseKeyword_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__FieldGenerator2__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__FieldGenerator2__Group__5__Impl
	rule__FieldGenerator2__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__FieldGenerator2__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFieldGenerator2Access().getGeneratorNameAssignment_5()); }
(rule__FieldGenerator2__GeneratorNameAssignment_5)
{ after(grammarAccess.getFieldGenerator2Access().getGeneratorNameAssignment_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__FieldGenerator2__Group__6
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__FieldGenerator2__Group__6__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__FieldGenerator2__Group__6__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFieldGenerator2Access().getGroup_6()); }
(rule__FieldGenerator2__Group_6__0)?
{ after(grammarAccess.getFieldGenerator2Access().getGroup_6()); }
)

;
finally {
	restoreStackSize(stackSize);
}
















rule__FieldGenerator2__Group_6__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__FieldGenerator2__Group_6__0__Impl
	rule__FieldGenerator2__Group_6__1
;
finally {
	restoreStackSize(stackSize);
}

rule__FieldGenerator2__Group_6__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFieldGenerator2Access().getWithErrorRateKeyword_6_0()); }

	'with errorRate=' 

{ after(grammarAccess.getFieldGenerator2Access().getWithErrorRateKeyword_6_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__FieldGenerator2__Group_6__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__FieldGenerator2__Group_6__1__Impl
	rule__FieldGenerator2__Group_6__2
;
finally {
	restoreStackSize(stackSize);
}

rule__FieldGenerator2__Group_6__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFieldGenerator2Access().getErrorRateAssignment_6_1()); }
(rule__FieldGenerator2__ErrorRateAssignment_6_1)
{ after(grammarAccess.getFieldGenerator2Access().getErrorRateAssignment_6_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__FieldGenerator2__Group_6__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__FieldGenerator2__Group_6__2__Impl
	rule__FieldGenerator2__Group_6__3
;
finally {
	restoreStackSize(stackSize);
}

rule__FieldGenerator2__Group_6__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFieldGenerator2Access().getGeneratedWithKeyword_6_2()); }

	'% generated with ' 

{ after(grammarAccess.getFieldGenerator2Access().getGeneratedWithKeyword_6_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__FieldGenerator2__Group_6__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__FieldGenerator2__Group_6__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__FieldGenerator2__Group_6__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFieldGenerator2Access().getErrorGeneratorNameAssignment_6_3()); }
(rule__FieldGenerator2__ErrorGeneratorNameAssignment_6_3)
{ after(grammarAccess.getFieldGenerator2Access().getErrorGeneratorNameAssignment_6_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}

















rule__DataSample__NameAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDataSampleAccess().getNameEStringParserRuleCall_2_0()); }
	ruleEString{ after(grammarAccess.getDataSampleAccess().getNameEStringParserRuleCall_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__DataSample__PackageURIAssignment_4
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDataSampleAccess().getPackageURIEStringParserRuleCall_4_0()); }
	ruleEString{ after(grammarAccess.getDataSampleAccess().getPackageURIEStringParserRuleCall_4_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__DataSample__SeedAssignment_7
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDataSampleAccess().getSeedEIntParserRuleCall_7_0()); }
	ruleEInt{ after(grammarAccess.getDataSampleAccess().getSeedEIntParserRuleCall_7_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__DataSample__LanguageAssignment_9
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDataSampleAccess().getLanguageLanguageEnumRuleCall_9_0()); }
	ruleLanguage{ after(grammarAccess.getDataSampleAccess().getLanguageLanguageEnumRuleCall_9_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__DataSample__BadValueGeneratorNamesAssignment_10_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDataSampleAccess().getBadValueGeneratorNamesEStringParserRuleCall_10_2_0()); }
	ruleEString{ after(grammarAccess.getDataSampleAccess().getBadValueGeneratorNamesEStringParserRuleCall_10_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__DataSample__BadValueGeneratorNamesAssignment_10_3_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDataSampleAccess().getBadValueGeneratorNamesEStringParserRuleCall_10_3_1_0()); }
	ruleEString{ after(grammarAccess.getDataSampleAccess().getBadValueGeneratorNamesEStringParserRuleCall_10_3_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__DataSample__EntityGeneratorsAssignment_12
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDataSampleAccess().getEntityGeneratorsEntityGenerator2ParserRuleCall_12_0()); }
	ruleEntityGenerator2{ after(grammarAccess.getDataSampleAccess().getEntityGeneratorsEntityGenerator2ParserRuleCall_12_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__DataSample__EntityGeneratorsAssignment_13_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDataSampleAccess().getEntityGeneratorsEntityGenerator2ParserRuleCall_13_1_0()); }
	ruleEntityGenerator2{ after(grammarAccess.getDataSampleAccess().getEntityGeneratorsEntityGenerator2ParserRuleCall_13_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__DataSample__FieldGeneratorsAssignment_14
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDataSampleAccess().getFieldGeneratorsFieldGenerator2ParserRuleCall_14_0()); }
	ruleFieldGenerator2{ after(grammarAccess.getDataSampleAccess().getFieldGeneratorsFieldGenerator2ParserRuleCall_14_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__DataSample__FieldGeneratorsAssignment_15_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDataSampleAccess().getFieldGeneratorsFieldGenerator2ParserRuleCall_15_1_0()); }
	ruleFieldGenerator2{ after(grammarAccess.getDataSampleAccess().getFieldGeneratorsFieldGenerator2ParserRuleCall_15_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__EntityGenerator2__NumberAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEntityGenerator2Access().getNumberEIntParserRuleCall_1_0()); }
	ruleEInt{ after(grammarAccess.getEntityGenerator2Access().getNumberEIntParserRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__EntityGenerator2__EntityNameAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEntityGenerator2Access().getEntityNameEStringParserRuleCall_2_0()); }
	ruleEString{ after(grammarAccess.getEntityGenerator2Access().getEntityNameEStringParserRuleCall_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}




rule__FieldGenerator2__EntityNameAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFieldGenerator2Access().getEntityNameEStringParserRuleCall_1_0()); }
	ruleEString{ after(grammarAccess.getFieldGenerator2Access().getEntityNameEStringParserRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__FieldGenerator2__FieldNameAssignment_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFieldGenerator2Access().getFieldNameEStringParserRuleCall_3_0()); }
	ruleEString{ after(grammarAccess.getFieldGenerator2Access().getFieldNameEStringParserRuleCall_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__FieldGenerator2__GeneratorNameAssignment_5
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFieldGenerator2Access().getGeneratorNameEStringParserRuleCall_5_0()); }
	ruleEString{ after(grammarAccess.getFieldGenerator2Access().getGeneratorNameEStringParserRuleCall_5_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__FieldGenerator2__ErrorRateAssignment_6_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFieldGenerator2Access().getErrorRateEIntParserRuleCall_6_1_0()); }
	ruleEInt{ after(grammarAccess.getFieldGenerator2Access().getErrorRateEIntParserRuleCall_6_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__FieldGenerator2__ErrorGeneratorNameAssignment_6_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFieldGenerator2Access().getErrorGeneratorNameEStringParserRuleCall_6_3_0()); }
	ruleEString{ after(grammarAccess.getFieldGenerator2Access().getErrorGeneratorNameEStringParserRuleCall_6_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}








RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;


