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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDataSampleDSLParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'fr'", "'en'", "'de'", "'es'", "'it'", "'Sample'", "'for'", "'generateRootObject'", "'seed'", "'language'", "'-'", "'generate'", "'instancesOf'", "'{'", "'}'", "'forTheField'", "'use'", "'cardinality'", "'('", "')'", "','", "'withErrorRate='", "'generatedWith'", "'forTheComposition'", "'forTheAssociation'", "'='"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalDataSampleDSLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDataSampleDSLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDataSampleDSLParser.tokenNames; }
    public String getGrammarFileName() { return "InternalDataSampleDSL.g"; }


     
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




    // $ANTLR start "entryRuleDataSample"
    // InternalDataSampleDSL.g:60:1: entryRuleDataSample : ruleDataSample EOF ;
    public final void entryRuleDataSample() throws RecognitionException {
        try {
            // InternalDataSampleDSL.g:61:1: ( ruleDataSample EOF )
            // InternalDataSampleDSL.g:62:1: ruleDataSample EOF
            {
             before(grammarAccess.getDataSampleRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleDataSample();

            state._fsp--;

             after(grammarAccess.getDataSampleRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDataSample"


    // $ANTLR start "ruleDataSample"
    // InternalDataSampleDSL.g:69:1: ruleDataSample : ( ( rule__DataSample__Group__0 ) ) ;
    public final void ruleDataSample() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:73:2: ( ( ( rule__DataSample__Group__0 ) ) )
            // InternalDataSampleDSL.g:74:1: ( ( rule__DataSample__Group__0 ) )
            {
            // InternalDataSampleDSL.g:74:1: ( ( rule__DataSample__Group__0 ) )
            // InternalDataSampleDSL.g:75:1: ( rule__DataSample__Group__0 )
            {
             before(grammarAccess.getDataSampleAccess().getGroup()); 
            // InternalDataSampleDSL.g:76:1: ( rule__DataSample__Group__0 )
            // InternalDataSampleDSL.g:76:2: rule__DataSample__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__DataSample__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDataSampleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDataSample"


    // $ANTLR start "entryRuleEString"
    // InternalDataSampleDSL.g:88:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalDataSampleDSL.g:89:1: ( ruleEString EOF )
            // InternalDataSampleDSL.g:90:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalDataSampleDSL.g:97:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:101:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalDataSampleDSL.g:102:1: ( ( rule__EString__Alternatives ) )
            {
            // InternalDataSampleDSL.g:102:1: ( ( rule__EString__Alternatives ) )
            // InternalDataSampleDSL.g:103:1: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalDataSampleDSL.g:104:1: ( rule__EString__Alternatives )
            // InternalDataSampleDSL.g:104:2: rule__EString__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleEInt"
    // InternalDataSampleDSL.g:116:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // InternalDataSampleDSL.g:117:1: ( ruleEInt EOF )
            // InternalDataSampleDSL.g:118:1: ruleEInt EOF
            {
             before(grammarAccess.getEIntRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getEIntRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalDataSampleDSL.g:125:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:129:2: ( ( ( rule__EInt__Group__0 ) ) )
            // InternalDataSampleDSL.g:130:1: ( ( rule__EInt__Group__0 ) )
            {
            // InternalDataSampleDSL.g:130:1: ( ( rule__EInt__Group__0 ) )
            // InternalDataSampleDSL.g:131:1: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // InternalDataSampleDSL.g:132:1: ( rule__EInt__Group__0 )
            // InternalDataSampleDSL.g:132:2: rule__EInt__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__EInt__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEIntAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleEntityGenerator"
    // InternalDataSampleDSL.g:144:1: entryRuleEntityGenerator : ruleEntityGenerator EOF ;
    public final void entryRuleEntityGenerator() throws RecognitionException {
        try {
            // InternalDataSampleDSL.g:145:1: ( ruleEntityGenerator EOF )
            // InternalDataSampleDSL.g:146:1: ruleEntityGenerator EOF
            {
             before(grammarAccess.getEntityGeneratorRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleEntityGenerator();

            state._fsp--;

             after(grammarAccess.getEntityGeneratorRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEntityGenerator"


    // $ANTLR start "ruleEntityGenerator"
    // InternalDataSampleDSL.g:153:1: ruleEntityGenerator : ( ( rule__EntityGenerator__Group__0 ) ) ;
    public final void ruleEntityGenerator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:157:2: ( ( ( rule__EntityGenerator__Group__0 ) ) )
            // InternalDataSampleDSL.g:158:1: ( ( rule__EntityGenerator__Group__0 ) )
            {
            // InternalDataSampleDSL.g:158:1: ( ( rule__EntityGenerator__Group__0 ) )
            // InternalDataSampleDSL.g:159:1: ( rule__EntityGenerator__Group__0 )
            {
             before(grammarAccess.getEntityGeneratorAccess().getGroup()); 
            // InternalDataSampleDSL.g:160:1: ( rule__EntityGenerator__Group__0 )
            // InternalDataSampleDSL.g:160:2: rule__EntityGenerator__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__EntityGenerator__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEntityGeneratorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEntityGenerator"


    // $ANTLR start "entryRuleFieldGenerator"
    // InternalDataSampleDSL.g:172:1: entryRuleFieldGenerator : ruleFieldGenerator EOF ;
    public final void entryRuleFieldGenerator() throws RecognitionException {
        try {
            // InternalDataSampleDSL.g:173:1: ( ruleFieldGenerator EOF )
            // InternalDataSampleDSL.g:174:1: ruleFieldGenerator EOF
            {
             before(grammarAccess.getFieldGeneratorRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleFieldGenerator();

            state._fsp--;

             after(grammarAccess.getFieldGeneratorRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFieldGenerator"


    // $ANTLR start "ruleFieldGenerator"
    // InternalDataSampleDSL.g:181:1: ruleFieldGenerator : ( ( rule__FieldGenerator__Group__0 ) ) ;
    public final void ruleFieldGenerator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:185:2: ( ( ( rule__FieldGenerator__Group__0 ) ) )
            // InternalDataSampleDSL.g:186:1: ( ( rule__FieldGenerator__Group__0 ) )
            {
            // InternalDataSampleDSL.g:186:1: ( ( rule__FieldGenerator__Group__0 ) )
            // InternalDataSampleDSL.g:187:1: ( rule__FieldGenerator__Group__0 )
            {
             before(grammarAccess.getFieldGeneratorAccess().getGroup()); 
            // InternalDataSampleDSL.g:188:1: ( rule__FieldGenerator__Group__0 )
            // InternalDataSampleDSL.g:188:2: rule__FieldGenerator__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__FieldGenerator__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFieldGeneratorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFieldGenerator"


    // $ANTLR start "entryRuleChildrenGenerator"
    // InternalDataSampleDSL.g:200:1: entryRuleChildrenGenerator : ruleChildrenGenerator EOF ;
    public final void entryRuleChildrenGenerator() throws RecognitionException {
        try {
            // InternalDataSampleDSL.g:201:1: ( ruleChildrenGenerator EOF )
            // InternalDataSampleDSL.g:202:1: ruleChildrenGenerator EOF
            {
             before(grammarAccess.getChildrenGeneratorRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleChildrenGenerator();

            state._fsp--;

             after(grammarAccess.getChildrenGeneratorRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleChildrenGenerator"


    // $ANTLR start "ruleChildrenGenerator"
    // InternalDataSampleDSL.g:209:1: ruleChildrenGenerator : ( ( rule__ChildrenGenerator__Group__0 ) ) ;
    public final void ruleChildrenGenerator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:213:2: ( ( ( rule__ChildrenGenerator__Group__0 ) ) )
            // InternalDataSampleDSL.g:214:1: ( ( rule__ChildrenGenerator__Group__0 ) )
            {
            // InternalDataSampleDSL.g:214:1: ( ( rule__ChildrenGenerator__Group__0 ) )
            // InternalDataSampleDSL.g:215:1: ( rule__ChildrenGenerator__Group__0 )
            {
             before(grammarAccess.getChildrenGeneratorAccess().getGroup()); 
            // InternalDataSampleDSL.g:216:1: ( rule__ChildrenGenerator__Group__0 )
            // InternalDataSampleDSL.g:216:2: rule__ChildrenGenerator__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ChildrenGenerator__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getChildrenGeneratorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleChildrenGenerator"


    // $ANTLR start "entryRuleAssociationGenerator"
    // InternalDataSampleDSL.g:228:1: entryRuleAssociationGenerator : ruleAssociationGenerator EOF ;
    public final void entryRuleAssociationGenerator() throws RecognitionException {
        try {
            // InternalDataSampleDSL.g:229:1: ( ruleAssociationGenerator EOF )
            // InternalDataSampleDSL.g:230:1: ruleAssociationGenerator EOF
            {
             before(grammarAccess.getAssociationGeneratorRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleAssociationGenerator();

            state._fsp--;

             after(grammarAccess.getAssociationGeneratorRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAssociationGenerator"


    // $ANTLR start "ruleAssociationGenerator"
    // InternalDataSampleDSL.g:237:1: ruleAssociationGenerator : ( ( rule__AssociationGenerator__Group__0 ) ) ;
    public final void ruleAssociationGenerator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:241:2: ( ( ( rule__AssociationGenerator__Group__0 ) ) )
            // InternalDataSampleDSL.g:242:1: ( ( rule__AssociationGenerator__Group__0 ) )
            {
            // InternalDataSampleDSL.g:242:1: ( ( rule__AssociationGenerator__Group__0 ) )
            // InternalDataSampleDSL.g:243:1: ( rule__AssociationGenerator__Group__0 )
            {
             before(grammarAccess.getAssociationGeneratorAccess().getGroup()); 
            // InternalDataSampleDSL.g:244:1: ( rule__AssociationGenerator__Group__0 )
            // InternalDataSampleDSL.g:244:2: rule__AssociationGenerator__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AssociationGenerator__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAssociationGeneratorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAssociationGenerator"


    // $ANTLR start "entryRuleParameter"
    // InternalDataSampleDSL.g:256:1: entryRuleParameter : ruleParameter EOF ;
    public final void entryRuleParameter() throws RecognitionException {
        try {
            // InternalDataSampleDSL.g:257:1: ( ruleParameter EOF )
            // InternalDataSampleDSL.g:258:1: ruleParameter EOF
            {
             before(grammarAccess.getParameterRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getParameterRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // InternalDataSampleDSL.g:265:1: ruleParameter : ( ( rule__Parameter__Group__0 ) ) ;
    public final void ruleParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:269:2: ( ( ( rule__Parameter__Group__0 ) ) )
            // InternalDataSampleDSL.g:270:1: ( ( rule__Parameter__Group__0 ) )
            {
            // InternalDataSampleDSL.g:270:1: ( ( rule__Parameter__Group__0 ) )
            // InternalDataSampleDSL.g:271:1: ( rule__Parameter__Group__0 )
            {
             before(grammarAccess.getParameterAccess().getGroup()); 
            // InternalDataSampleDSL.g:272:1: ( rule__Parameter__Group__0 )
            // InternalDataSampleDSL.g:272:2: rule__Parameter__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Parameter__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParameter"


    // $ANTLR start "ruleLanguage"
    // InternalDataSampleDSL.g:285:1: ruleLanguage : ( ( rule__Language__Alternatives ) ) ;
    public final void ruleLanguage() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:289:1: ( ( ( rule__Language__Alternatives ) ) )
            // InternalDataSampleDSL.g:290:1: ( ( rule__Language__Alternatives ) )
            {
            // InternalDataSampleDSL.g:290:1: ( ( rule__Language__Alternatives ) )
            // InternalDataSampleDSL.g:291:1: ( rule__Language__Alternatives )
            {
             before(grammarAccess.getLanguageAccess().getAlternatives()); 
            // InternalDataSampleDSL.g:292:1: ( rule__Language__Alternatives )
            // InternalDataSampleDSL.g:292:2: rule__Language__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Language__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getLanguageAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLanguage"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalDataSampleDSL.g:303:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:307:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_STRING) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_ID) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalDataSampleDSL.g:308:1: ( RULE_STRING )
                    {
                    // InternalDataSampleDSL.g:308:1: ( RULE_STRING )
                    // InternalDataSampleDSL.g:309:1: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDataSampleDSL.g:314:6: ( RULE_ID )
                    {
                    // InternalDataSampleDSL.g:314:6: ( RULE_ID )
                    // InternalDataSampleDSL.g:315:1: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__Language__Alternatives"
    // InternalDataSampleDSL.g:325:1: rule__Language__Alternatives : ( ( ( 'fr' ) ) | ( ( 'en' ) ) | ( ( 'de' ) ) | ( ( 'es' ) ) | ( ( 'it' ) ) );
    public final void rule__Language__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:329:1: ( ( ( 'fr' ) ) | ( ( 'en' ) ) | ( ( 'de' ) ) | ( ( 'es' ) ) | ( ( 'it' ) ) )
            int alt2=5;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt2=1;
                }
                break;
            case 12:
                {
                alt2=2;
                }
                break;
            case 13:
                {
                alt2=3;
                }
                break;
            case 14:
                {
                alt2=4;
                }
                break;
            case 15:
                {
                alt2=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalDataSampleDSL.g:330:1: ( ( 'fr' ) )
                    {
                    // InternalDataSampleDSL.g:330:1: ( ( 'fr' ) )
                    // InternalDataSampleDSL.g:331:1: ( 'fr' )
                    {
                     before(grammarAccess.getLanguageAccess().getFrEnumLiteralDeclaration_0()); 
                    // InternalDataSampleDSL.g:332:1: ( 'fr' )
                    // InternalDataSampleDSL.g:332:3: 'fr'
                    {
                    match(input,11,FollowSets000.FOLLOW_2); 

                    }

                     after(grammarAccess.getLanguageAccess().getFrEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDataSampleDSL.g:337:6: ( ( 'en' ) )
                    {
                    // InternalDataSampleDSL.g:337:6: ( ( 'en' ) )
                    // InternalDataSampleDSL.g:338:1: ( 'en' )
                    {
                     before(grammarAccess.getLanguageAccess().getEnEnumLiteralDeclaration_1()); 
                    // InternalDataSampleDSL.g:339:1: ( 'en' )
                    // InternalDataSampleDSL.g:339:3: 'en'
                    {
                    match(input,12,FollowSets000.FOLLOW_2); 

                    }

                     after(grammarAccess.getLanguageAccess().getEnEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDataSampleDSL.g:344:6: ( ( 'de' ) )
                    {
                    // InternalDataSampleDSL.g:344:6: ( ( 'de' ) )
                    // InternalDataSampleDSL.g:345:1: ( 'de' )
                    {
                     before(grammarAccess.getLanguageAccess().getDeEnumLiteralDeclaration_2()); 
                    // InternalDataSampleDSL.g:346:1: ( 'de' )
                    // InternalDataSampleDSL.g:346:3: 'de'
                    {
                    match(input,13,FollowSets000.FOLLOW_2); 

                    }

                     after(grammarAccess.getLanguageAccess().getDeEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalDataSampleDSL.g:351:6: ( ( 'es' ) )
                    {
                    // InternalDataSampleDSL.g:351:6: ( ( 'es' ) )
                    // InternalDataSampleDSL.g:352:1: ( 'es' )
                    {
                     before(grammarAccess.getLanguageAccess().getEsEnumLiteralDeclaration_3()); 
                    // InternalDataSampleDSL.g:353:1: ( 'es' )
                    // InternalDataSampleDSL.g:353:3: 'es'
                    {
                    match(input,14,FollowSets000.FOLLOW_2); 

                    }

                     after(grammarAccess.getLanguageAccess().getEsEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalDataSampleDSL.g:358:6: ( ( 'it' ) )
                    {
                    // InternalDataSampleDSL.g:358:6: ( ( 'it' ) )
                    // InternalDataSampleDSL.g:359:1: ( 'it' )
                    {
                     before(grammarAccess.getLanguageAccess().getItEnumLiteralDeclaration_4()); 
                    // InternalDataSampleDSL.g:360:1: ( 'it' )
                    // InternalDataSampleDSL.g:360:3: 'it'
                    {
                    match(input,15,FollowSets000.FOLLOW_2); 

                    }

                     after(grammarAccess.getLanguageAccess().getItEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Language__Alternatives"


    // $ANTLR start "rule__DataSample__Group__0"
    // InternalDataSampleDSL.g:372:1: rule__DataSample__Group__0 : rule__DataSample__Group__0__Impl rule__DataSample__Group__1 ;
    public final void rule__DataSample__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:376:1: ( rule__DataSample__Group__0__Impl rule__DataSample__Group__1 )
            // InternalDataSampleDSL.g:377:2: rule__DataSample__Group__0__Impl rule__DataSample__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_3);
            rule__DataSample__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__DataSample__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSample__Group__0"


    // $ANTLR start "rule__DataSample__Group__0__Impl"
    // InternalDataSampleDSL.g:384:1: rule__DataSample__Group__0__Impl : ( () ) ;
    public final void rule__DataSample__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:388:1: ( ( () ) )
            // InternalDataSampleDSL.g:389:1: ( () )
            {
            // InternalDataSampleDSL.g:389:1: ( () )
            // InternalDataSampleDSL.g:390:1: ()
            {
             before(grammarAccess.getDataSampleAccess().getDataSampleAction_0()); 
            // InternalDataSampleDSL.g:391:1: ()
            // InternalDataSampleDSL.g:393:1: 
            {
            }

             after(grammarAccess.getDataSampleAccess().getDataSampleAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSample__Group__0__Impl"


    // $ANTLR start "rule__DataSample__Group__1"
    // InternalDataSampleDSL.g:403:1: rule__DataSample__Group__1 : rule__DataSample__Group__1__Impl rule__DataSample__Group__2 ;
    public final void rule__DataSample__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:407:1: ( rule__DataSample__Group__1__Impl rule__DataSample__Group__2 )
            // InternalDataSampleDSL.g:408:2: rule__DataSample__Group__1__Impl rule__DataSample__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_4);
            rule__DataSample__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__DataSample__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSample__Group__1"


    // $ANTLR start "rule__DataSample__Group__1__Impl"
    // InternalDataSampleDSL.g:415:1: rule__DataSample__Group__1__Impl : ( 'Sample' ) ;
    public final void rule__DataSample__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:419:1: ( ( 'Sample' ) )
            // InternalDataSampleDSL.g:420:1: ( 'Sample' )
            {
            // InternalDataSampleDSL.g:420:1: ( 'Sample' )
            // InternalDataSampleDSL.g:421:1: 'Sample'
            {
             before(grammarAccess.getDataSampleAccess().getSampleKeyword_1()); 
            match(input,16,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getDataSampleAccess().getSampleKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSample__Group__1__Impl"


    // $ANTLR start "rule__DataSample__Group__2"
    // InternalDataSampleDSL.g:434:1: rule__DataSample__Group__2 : rule__DataSample__Group__2__Impl rule__DataSample__Group__3 ;
    public final void rule__DataSample__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:438:1: ( rule__DataSample__Group__2__Impl rule__DataSample__Group__3 )
            // InternalDataSampleDSL.g:439:2: rule__DataSample__Group__2__Impl rule__DataSample__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__DataSample__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__DataSample__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSample__Group__2"


    // $ANTLR start "rule__DataSample__Group__2__Impl"
    // InternalDataSampleDSL.g:446:1: rule__DataSample__Group__2__Impl : ( ( rule__DataSample__NameAssignment_2 ) ) ;
    public final void rule__DataSample__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:450:1: ( ( ( rule__DataSample__NameAssignment_2 ) ) )
            // InternalDataSampleDSL.g:451:1: ( ( rule__DataSample__NameAssignment_2 ) )
            {
            // InternalDataSampleDSL.g:451:1: ( ( rule__DataSample__NameAssignment_2 ) )
            // InternalDataSampleDSL.g:452:1: ( rule__DataSample__NameAssignment_2 )
            {
             before(grammarAccess.getDataSampleAccess().getNameAssignment_2()); 
            // InternalDataSampleDSL.g:453:1: ( rule__DataSample__NameAssignment_2 )
            // InternalDataSampleDSL.g:453:2: rule__DataSample__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__DataSample__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDataSampleAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSample__Group__2__Impl"


    // $ANTLR start "rule__DataSample__Group__3"
    // InternalDataSampleDSL.g:463:1: rule__DataSample__Group__3 : rule__DataSample__Group__3__Impl rule__DataSample__Group__4 ;
    public final void rule__DataSample__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:467:1: ( rule__DataSample__Group__3__Impl rule__DataSample__Group__4 )
            // InternalDataSampleDSL.g:468:2: rule__DataSample__Group__3__Impl rule__DataSample__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_4);
            rule__DataSample__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__DataSample__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSample__Group__3"


    // $ANTLR start "rule__DataSample__Group__3__Impl"
    // InternalDataSampleDSL.g:475:1: rule__DataSample__Group__3__Impl : ( 'for' ) ;
    public final void rule__DataSample__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:479:1: ( ( 'for' ) )
            // InternalDataSampleDSL.g:480:1: ( 'for' )
            {
            // InternalDataSampleDSL.g:480:1: ( 'for' )
            // InternalDataSampleDSL.g:481:1: 'for'
            {
             before(grammarAccess.getDataSampleAccess().getForKeyword_3()); 
            match(input,17,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getDataSampleAccess().getForKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSample__Group__3__Impl"


    // $ANTLR start "rule__DataSample__Group__4"
    // InternalDataSampleDSL.g:494:1: rule__DataSample__Group__4 : rule__DataSample__Group__4__Impl rule__DataSample__Group__5 ;
    public final void rule__DataSample__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:498:1: ( rule__DataSample__Group__4__Impl rule__DataSample__Group__5 )
            // InternalDataSampleDSL.g:499:2: rule__DataSample__Group__4__Impl rule__DataSample__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_6);
            rule__DataSample__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__DataSample__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSample__Group__4"


    // $ANTLR start "rule__DataSample__Group__4__Impl"
    // InternalDataSampleDSL.g:506:1: rule__DataSample__Group__4__Impl : ( ( rule__DataSample__PackageURIAssignment_4 ) ) ;
    public final void rule__DataSample__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:510:1: ( ( ( rule__DataSample__PackageURIAssignment_4 ) ) )
            // InternalDataSampleDSL.g:511:1: ( ( rule__DataSample__PackageURIAssignment_4 ) )
            {
            // InternalDataSampleDSL.g:511:1: ( ( rule__DataSample__PackageURIAssignment_4 ) )
            // InternalDataSampleDSL.g:512:1: ( rule__DataSample__PackageURIAssignment_4 )
            {
             before(grammarAccess.getDataSampleAccess().getPackageURIAssignment_4()); 
            // InternalDataSampleDSL.g:513:1: ( rule__DataSample__PackageURIAssignment_4 )
            // InternalDataSampleDSL.g:513:2: rule__DataSample__PackageURIAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__DataSample__PackageURIAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getDataSampleAccess().getPackageURIAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSample__Group__4__Impl"


    // $ANTLR start "rule__DataSample__Group__5"
    // InternalDataSampleDSL.g:523:1: rule__DataSample__Group__5 : rule__DataSample__Group__5__Impl rule__DataSample__Group__6 ;
    public final void rule__DataSample__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:527:1: ( rule__DataSample__Group__5__Impl rule__DataSample__Group__6 )
            // InternalDataSampleDSL.g:528:2: rule__DataSample__Group__5__Impl rule__DataSample__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_4);
            rule__DataSample__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__DataSample__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSample__Group__5"


    // $ANTLR start "rule__DataSample__Group__5__Impl"
    // InternalDataSampleDSL.g:535:1: rule__DataSample__Group__5__Impl : ( 'generateRootObject' ) ;
    public final void rule__DataSample__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:539:1: ( ( 'generateRootObject' ) )
            // InternalDataSampleDSL.g:540:1: ( 'generateRootObject' )
            {
            // InternalDataSampleDSL.g:540:1: ( 'generateRootObject' )
            // InternalDataSampleDSL.g:541:1: 'generateRootObject'
            {
             before(grammarAccess.getDataSampleAccess().getGenerateRootObjectKeyword_5()); 
            match(input,18,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getDataSampleAccess().getGenerateRootObjectKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSample__Group__5__Impl"


    // $ANTLR start "rule__DataSample__Group__6"
    // InternalDataSampleDSL.g:554:1: rule__DataSample__Group__6 : rule__DataSample__Group__6__Impl rule__DataSample__Group__7 ;
    public final void rule__DataSample__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:558:1: ( rule__DataSample__Group__6__Impl rule__DataSample__Group__7 )
            // InternalDataSampleDSL.g:559:2: rule__DataSample__Group__6__Impl rule__DataSample__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__DataSample__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__DataSample__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSample__Group__6"


    // $ANTLR start "rule__DataSample__Group__6__Impl"
    // InternalDataSampleDSL.g:566:1: rule__DataSample__Group__6__Impl : ( ( rule__DataSample__RootEntityNameAssignment_6 ) ) ;
    public final void rule__DataSample__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:570:1: ( ( ( rule__DataSample__RootEntityNameAssignment_6 ) ) )
            // InternalDataSampleDSL.g:571:1: ( ( rule__DataSample__RootEntityNameAssignment_6 ) )
            {
            // InternalDataSampleDSL.g:571:1: ( ( rule__DataSample__RootEntityNameAssignment_6 ) )
            // InternalDataSampleDSL.g:572:1: ( rule__DataSample__RootEntityNameAssignment_6 )
            {
             before(grammarAccess.getDataSampleAccess().getRootEntityNameAssignment_6()); 
            // InternalDataSampleDSL.g:573:1: ( rule__DataSample__RootEntityNameAssignment_6 )
            // InternalDataSampleDSL.g:573:2: rule__DataSample__RootEntityNameAssignment_6
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__DataSample__RootEntityNameAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getDataSampleAccess().getRootEntityNameAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSample__Group__6__Impl"


    // $ANTLR start "rule__DataSample__Group__7"
    // InternalDataSampleDSL.g:583:1: rule__DataSample__Group__7 : rule__DataSample__Group__7__Impl rule__DataSample__Group__8 ;
    public final void rule__DataSample__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:587:1: ( rule__DataSample__Group__7__Impl rule__DataSample__Group__8 )
            // InternalDataSampleDSL.g:588:2: rule__DataSample__Group__7__Impl rule__DataSample__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_8);
            rule__DataSample__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__DataSample__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSample__Group__7"


    // $ANTLR start "rule__DataSample__Group__7__Impl"
    // InternalDataSampleDSL.g:595:1: rule__DataSample__Group__7__Impl : ( 'seed' ) ;
    public final void rule__DataSample__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:599:1: ( ( 'seed' ) )
            // InternalDataSampleDSL.g:600:1: ( 'seed' )
            {
            // InternalDataSampleDSL.g:600:1: ( 'seed' )
            // InternalDataSampleDSL.g:601:1: 'seed'
            {
             before(grammarAccess.getDataSampleAccess().getSeedKeyword_7()); 
            match(input,19,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getDataSampleAccess().getSeedKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSample__Group__7__Impl"


    // $ANTLR start "rule__DataSample__Group__8"
    // InternalDataSampleDSL.g:614:1: rule__DataSample__Group__8 : rule__DataSample__Group__8__Impl rule__DataSample__Group__9 ;
    public final void rule__DataSample__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:618:1: ( rule__DataSample__Group__8__Impl rule__DataSample__Group__9 )
            // InternalDataSampleDSL.g:619:2: rule__DataSample__Group__8__Impl rule__DataSample__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_9);
            rule__DataSample__Group__8__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__DataSample__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSample__Group__8"


    // $ANTLR start "rule__DataSample__Group__8__Impl"
    // InternalDataSampleDSL.g:626:1: rule__DataSample__Group__8__Impl : ( ( rule__DataSample__SeedAssignment_8 ) ) ;
    public final void rule__DataSample__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:630:1: ( ( ( rule__DataSample__SeedAssignment_8 ) ) )
            // InternalDataSampleDSL.g:631:1: ( ( rule__DataSample__SeedAssignment_8 ) )
            {
            // InternalDataSampleDSL.g:631:1: ( ( rule__DataSample__SeedAssignment_8 ) )
            // InternalDataSampleDSL.g:632:1: ( rule__DataSample__SeedAssignment_8 )
            {
             before(grammarAccess.getDataSampleAccess().getSeedAssignment_8()); 
            // InternalDataSampleDSL.g:633:1: ( rule__DataSample__SeedAssignment_8 )
            // InternalDataSampleDSL.g:633:2: rule__DataSample__SeedAssignment_8
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__DataSample__SeedAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getDataSampleAccess().getSeedAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSample__Group__8__Impl"


    // $ANTLR start "rule__DataSample__Group__9"
    // InternalDataSampleDSL.g:643:1: rule__DataSample__Group__9 : rule__DataSample__Group__9__Impl rule__DataSample__Group__10 ;
    public final void rule__DataSample__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:647:1: ( rule__DataSample__Group__9__Impl rule__DataSample__Group__10 )
            // InternalDataSampleDSL.g:648:2: rule__DataSample__Group__9__Impl rule__DataSample__Group__10
            {
            pushFollow(FollowSets000.FOLLOW_10);
            rule__DataSample__Group__9__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__DataSample__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSample__Group__9"


    // $ANTLR start "rule__DataSample__Group__9__Impl"
    // InternalDataSampleDSL.g:655:1: rule__DataSample__Group__9__Impl : ( 'language' ) ;
    public final void rule__DataSample__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:659:1: ( ( 'language' ) )
            // InternalDataSampleDSL.g:660:1: ( 'language' )
            {
            // InternalDataSampleDSL.g:660:1: ( 'language' )
            // InternalDataSampleDSL.g:661:1: 'language'
            {
             before(grammarAccess.getDataSampleAccess().getLanguageKeyword_9()); 
            match(input,20,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getDataSampleAccess().getLanguageKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSample__Group__9__Impl"


    // $ANTLR start "rule__DataSample__Group__10"
    // InternalDataSampleDSL.g:674:1: rule__DataSample__Group__10 : rule__DataSample__Group__10__Impl rule__DataSample__Group__11 ;
    public final void rule__DataSample__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:678:1: ( rule__DataSample__Group__10__Impl rule__DataSample__Group__11 )
            // InternalDataSampleDSL.g:679:2: rule__DataSample__Group__10__Impl rule__DataSample__Group__11
            {
            pushFollow(FollowSets000.FOLLOW_11);
            rule__DataSample__Group__10__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__DataSample__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSample__Group__10"


    // $ANTLR start "rule__DataSample__Group__10__Impl"
    // InternalDataSampleDSL.g:686:1: rule__DataSample__Group__10__Impl : ( ( rule__DataSample__LanguageAssignment_10 ) ) ;
    public final void rule__DataSample__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:690:1: ( ( ( rule__DataSample__LanguageAssignment_10 ) ) )
            // InternalDataSampleDSL.g:691:1: ( ( rule__DataSample__LanguageAssignment_10 ) )
            {
            // InternalDataSampleDSL.g:691:1: ( ( rule__DataSample__LanguageAssignment_10 ) )
            // InternalDataSampleDSL.g:692:1: ( rule__DataSample__LanguageAssignment_10 )
            {
             before(grammarAccess.getDataSampleAccess().getLanguageAssignment_10()); 
            // InternalDataSampleDSL.g:693:1: ( rule__DataSample__LanguageAssignment_10 )
            // InternalDataSampleDSL.g:693:2: rule__DataSample__LanguageAssignment_10
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__DataSample__LanguageAssignment_10();

            state._fsp--;


            }

             after(grammarAccess.getDataSampleAccess().getLanguageAssignment_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSample__Group__10__Impl"


    // $ANTLR start "rule__DataSample__Group__11"
    // InternalDataSampleDSL.g:703:1: rule__DataSample__Group__11 : rule__DataSample__Group__11__Impl ;
    public final void rule__DataSample__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:707:1: ( rule__DataSample__Group__11__Impl )
            // InternalDataSampleDSL.g:708:2: rule__DataSample__Group__11__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__DataSample__Group__11__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSample__Group__11"


    // $ANTLR start "rule__DataSample__Group__11__Impl"
    // InternalDataSampleDSL.g:714:1: rule__DataSample__Group__11__Impl : ( ( rule__DataSample__EntityGeneratorsAssignment_11 )* ) ;
    public final void rule__DataSample__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:718:1: ( ( ( rule__DataSample__EntityGeneratorsAssignment_11 )* ) )
            // InternalDataSampleDSL.g:719:1: ( ( rule__DataSample__EntityGeneratorsAssignment_11 )* )
            {
            // InternalDataSampleDSL.g:719:1: ( ( rule__DataSample__EntityGeneratorsAssignment_11 )* )
            // InternalDataSampleDSL.g:720:1: ( rule__DataSample__EntityGeneratorsAssignment_11 )*
            {
             before(grammarAccess.getDataSampleAccess().getEntityGeneratorsAssignment_11()); 
            // InternalDataSampleDSL.g:721:1: ( rule__DataSample__EntityGeneratorsAssignment_11 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==22) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalDataSampleDSL.g:721:2: rule__DataSample__EntityGeneratorsAssignment_11
            	    {
            	    pushFollow(FollowSets000.FOLLOW_12);
            	    rule__DataSample__EntityGeneratorsAssignment_11();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getDataSampleAccess().getEntityGeneratorsAssignment_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSample__Group__11__Impl"


    // $ANTLR start "rule__EInt__Group__0"
    // InternalDataSampleDSL.g:755:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:759:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalDataSampleDSL.g:760:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_8);
            rule__EInt__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__EInt__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__0"


    // $ANTLR start "rule__EInt__Group__0__Impl"
    // InternalDataSampleDSL.g:767:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:771:1: ( ( ( '-' )? ) )
            // InternalDataSampleDSL.g:772:1: ( ( '-' )? )
            {
            // InternalDataSampleDSL.g:772:1: ( ( '-' )? )
            // InternalDataSampleDSL.g:773:1: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // InternalDataSampleDSL.g:774:1: ( '-' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==21) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalDataSampleDSL.g:775:2: '-'
                    {
                    match(input,21,FollowSets000.FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__0__Impl"


    // $ANTLR start "rule__EInt__Group__1"
    // InternalDataSampleDSL.g:786:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:790:1: ( rule__EInt__Group__1__Impl )
            // InternalDataSampleDSL.g:791:2: rule__EInt__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__EInt__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__1"


    // $ANTLR start "rule__EInt__Group__1__Impl"
    // InternalDataSampleDSL.g:797:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:801:1: ( ( RULE_INT ) )
            // InternalDataSampleDSL.g:802:1: ( RULE_INT )
            {
            // InternalDataSampleDSL.g:802:1: ( RULE_INT )
            // InternalDataSampleDSL.g:803:1: RULE_INT
            {
             before(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__1__Impl"


    // $ANTLR start "rule__EntityGenerator__Group__0"
    // InternalDataSampleDSL.g:818:1: rule__EntityGenerator__Group__0 : rule__EntityGenerator__Group__0__Impl rule__EntityGenerator__Group__1 ;
    public final void rule__EntityGenerator__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:822:1: ( rule__EntityGenerator__Group__0__Impl rule__EntityGenerator__Group__1 )
            // InternalDataSampleDSL.g:823:2: rule__EntityGenerator__Group__0__Impl rule__EntityGenerator__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_11);
            rule__EntityGenerator__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__EntityGenerator__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityGenerator__Group__0"


    // $ANTLR start "rule__EntityGenerator__Group__0__Impl"
    // InternalDataSampleDSL.g:830:1: rule__EntityGenerator__Group__0__Impl : ( () ) ;
    public final void rule__EntityGenerator__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:834:1: ( ( () ) )
            // InternalDataSampleDSL.g:835:1: ( () )
            {
            // InternalDataSampleDSL.g:835:1: ( () )
            // InternalDataSampleDSL.g:836:1: ()
            {
             before(grammarAccess.getEntityGeneratorAccess().getEntityGeneratorAction_0()); 
            // InternalDataSampleDSL.g:837:1: ()
            // InternalDataSampleDSL.g:839:1: 
            {
            }

             after(grammarAccess.getEntityGeneratorAccess().getEntityGeneratorAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityGenerator__Group__0__Impl"


    // $ANTLR start "rule__EntityGenerator__Group__1"
    // InternalDataSampleDSL.g:849:1: rule__EntityGenerator__Group__1 : rule__EntityGenerator__Group__1__Impl rule__EntityGenerator__Group__2 ;
    public final void rule__EntityGenerator__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:853:1: ( rule__EntityGenerator__Group__1__Impl rule__EntityGenerator__Group__2 )
            // InternalDataSampleDSL.g:854:2: rule__EntityGenerator__Group__1__Impl rule__EntityGenerator__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_8);
            rule__EntityGenerator__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__EntityGenerator__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityGenerator__Group__1"


    // $ANTLR start "rule__EntityGenerator__Group__1__Impl"
    // InternalDataSampleDSL.g:861:1: rule__EntityGenerator__Group__1__Impl : ( 'generate' ) ;
    public final void rule__EntityGenerator__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:865:1: ( ( 'generate' ) )
            // InternalDataSampleDSL.g:866:1: ( 'generate' )
            {
            // InternalDataSampleDSL.g:866:1: ( 'generate' )
            // InternalDataSampleDSL.g:867:1: 'generate'
            {
             before(grammarAccess.getEntityGeneratorAccess().getGenerateKeyword_1()); 
            match(input,22,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getEntityGeneratorAccess().getGenerateKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityGenerator__Group__1__Impl"


    // $ANTLR start "rule__EntityGenerator__Group__2"
    // InternalDataSampleDSL.g:880:1: rule__EntityGenerator__Group__2 : rule__EntityGenerator__Group__2__Impl rule__EntityGenerator__Group__3 ;
    public final void rule__EntityGenerator__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:884:1: ( rule__EntityGenerator__Group__2__Impl rule__EntityGenerator__Group__3 )
            // InternalDataSampleDSL.g:885:2: rule__EntityGenerator__Group__2__Impl rule__EntityGenerator__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_13);
            rule__EntityGenerator__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__EntityGenerator__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityGenerator__Group__2"


    // $ANTLR start "rule__EntityGenerator__Group__2__Impl"
    // InternalDataSampleDSL.g:892:1: rule__EntityGenerator__Group__2__Impl : ( ( rule__EntityGenerator__NumberAssignment_2 ) ) ;
    public final void rule__EntityGenerator__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:896:1: ( ( ( rule__EntityGenerator__NumberAssignment_2 ) ) )
            // InternalDataSampleDSL.g:897:1: ( ( rule__EntityGenerator__NumberAssignment_2 ) )
            {
            // InternalDataSampleDSL.g:897:1: ( ( rule__EntityGenerator__NumberAssignment_2 ) )
            // InternalDataSampleDSL.g:898:1: ( rule__EntityGenerator__NumberAssignment_2 )
            {
             before(grammarAccess.getEntityGeneratorAccess().getNumberAssignment_2()); 
            // InternalDataSampleDSL.g:899:1: ( rule__EntityGenerator__NumberAssignment_2 )
            // InternalDataSampleDSL.g:899:2: rule__EntityGenerator__NumberAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__EntityGenerator__NumberAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getEntityGeneratorAccess().getNumberAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityGenerator__Group__2__Impl"


    // $ANTLR start "rule__EntityGenerator__Group__3"
    // InternalDataSampleDSL.g:909:1: rule__EntityGenerator__Group__3 : rule__EntityGenerator__Group__3__Impl rule__EntityGenerator__Group__4 ;
    public final void rule__EntityGenerator__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:913:1: ( rule__EntityGenerator__Group__3__Impl rule__EntityGenerator__Group__4 )
            // InternalDataSampleDSL.g:914:2: rule__EntityGenerator__Group__3__Impl rule__EntityGenerator__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_4);
            rule__EntityGenerator__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__EntityGenerator__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityGenerator__Group__3"


    // $ANTLR start "rule__EntityGenerator__Group__3__Impl"
    // InternalDataSampleDSL.g:921:1: rule__EntityGenerator__Group__3__Impl : ( 'instancesOf' ) ;
    public final void rule__EntityGenerator__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:925:1: ( ( 'instancesOf' ) )
            // InternalDataSampleDSL.g:926:1: ( 'instancesOf' )
            {
            // InternalDataSampleDSL.g:926:1: ( 'instancesOf' )
            // InternalDataSampleDSL.g:927:1: 'instancesOf'
            {
             before(grammarAccess.getEntityGeneratorAccess().getInstancesOfKeyword_3()); 
            match(input,23,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getEntityGeneratorAccess().getInstancesOfKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityGenerator__Group__3__Impl"


    // $ANTLR start "rule__EntityGenerator__Group__4"
    // InternalDataSampleDSL.g:940:1: rule__EntityGenerator__Group__4 : rule__EntityGenerator__Group__4__Impl rule__EntityGenerator__Group__5 ;
    public final void rule__EntityGenerator__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:944:1: ( rule__EntityGenerator__Group__4__Impl rule__EntityGenerator__Group__5 )
            // InternalDataSampleDSL.g:945:2: rule__EntityGenerator__Group__4__Impl rule__EntityGenerator__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_14);
            rule__EntityGenerator__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__EntityGenerator__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityGenerator__Group__4"


    // $ANTLR start "rule__EntityGenerator__Group__4__Impl"
    // InternalDataSampleDSL.g:952:1: rule__EntityGenerator__Group__4__Impl : ( ( rule__EntityGenerator__EntityNameAssignment_4 ) ) ;
    public final void rule__EntityGenerator__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:956:1: ( ( ( rule__EntityGenerator__EntityNameAssignment_4 ) ) )
            // InternalDataSampleDSL.g:957:1: ( ( rule__EntityGenerator__EntityNameAssignment_4 ) )
            {
            // InternalDataSampleDSL.g:957:1: ( ( rule__EntityGenerator__EntityNameAssignment_4 ) )
            // InternalDataSampleDSL.g:958:1: ( rule__EntityGenerator__EntityNameAssignment_4 )
            {
             before(grammarAccess.getEntityGeneratorAccess().getEntityNameAssignment_4()); 
            // InternalDataSampleDSL.g:959:1: ( rule__EntityGenerator__EntityNameAssignment_4 )
            // InternalDataSampleDSL.g:959:2: rule__EntityGenerator__EntityNameAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__EntityGenerator__EntityNameAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getEntityGeneratorAccess().getEntityNameAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityGenerator__Group__4__Impl"


    // $ANTLR start "rule__EntityGenerator__Group__5"
    // InternalDataSampleDSL.g:969:1: rule__EntityGenerator__Group__5 : rule__EntityGenerator__Group__5__Impl rule__EntityGenerator__Group__6 ;
    public final void rule__EntityGenerator__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:973:1: ( rule__EntityGenerator__Group__5__Impl rule__EntityGenerator__Group__6 )
            // InternalDataSampleDSL.g:974:2: rule__EntityGenerator__Group__5__Impl rule__EntityGenerator__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_15);
            rule__EntityGenerator__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__EntityGenerator__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityGenerator__Group__5"


    // $ANTLR start "rule__EntityGenerator__Group__5__Impl"
    // InternalDataSampleDSL.g:981:1: rule__EntityGenerator__Group__5__Impl : ( '{' ) ;
    public final void rule__EntityGenerator__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:985:1: ( ( '{' ) )
            // InternalDataSampleDSL.g:986:1: ( '{' )
            {
            // InternalDataSampleDSL.g:986:1: ( '{' )
            // InternalDataSampleDSL.g:987:1: '{'
            {
             before(grammarAccess.getEntityGeneratorAccess().getLeftCurlyBracketKeyword_5()); 
            match(input,24,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getEntityGeneratorAccess().getLeftCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityGenerator__Group__5__Impl"


    // $ANTLR start "rule__EntityGenerator__Group__6"
    // InternalDataSampleDSL.g:1000:1: rule__EntityGenerator__Group__6 : rule__EntityGenerator__Group__6__Impl rule__EntityGenerator__Group__7 ;
    public final void rule__EntityGenerator__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:1004:1: ( rule__EntityGenerator__Group__6__Impl rule__EntityGenerator__Group__7 )
            // InternalDataSampleDSL.g:1005:2: rule__EntityGenerator__Group__6__Impl rule__EntityGenerator__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_15);
            rule__EntityGenerator__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__EntityGenerator__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityGenerator__Group__6"


    // $ANTLR start "rule__EntityGenerator__Group__6__Impl"
    // InternalDataSampleDSL.g:1012:1: rule__EntityGenerator__Group__6__Impl : ( ( rule__EntityGenerator__FieldGeneratorsAssignment_6 )* ) ;
    public final void rule__EntityGenerator__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:1016:1: ( ( ( rule__EntityGenerator__FieldGeneratorsAssignment_6 )* ) )
            // InternalDataSampleDSL.g:1017:1: ( ( rule__EntityGenerator__FieldGeneratorsAssignment_6 )* )
            {
            // InternalDataSampleDSL.g:1017:1: ( ( rule__EntityGenerator__FieldGeneratorsAssignment_6 )* )
            // InternalDataSampleDSL.g:1018:1: ( rule__EntityGenerator__FieldGeneratorsAssignment_6 )*
            {
             before(grammarAccess.getEntityGeneratorAccess().getFieldGeneratorsAssignment_6()); 
            // InternalDataSampleDSL.g:1019:1: ( rule__EntityGenerator__FieldGeneratorsAssignment_6 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==26) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalDataSampleDSL.g:1019:2: rule__EntityGenerator__FieldGeneratorsAssignment_6
            	    {
            	    pushFollow(FollowSets000.FOLLOW_16);
            	    rule__EntityGenerator__FieldGeneratorsAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getEntityGeneratorAccess().getFieldGeneratorsAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityGenerator__Group__6__Impl"


    // $ANTLR start "rule__EntityGenerator__Group__7"
    // InternalDataSampleDSL.g:1029:1: rule__EntityGenerator__Group__7 : rule__EntityGenerator__Group__7__Impl rule__EntityGenerator__Group__8 ;
    public final void rule__EntityGenerator__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:1033:1: ( rule__EntityGenerator__Group__7__Impl rule__EntityGenerator__Group__8 )
            // InternalDataSampleDSL.g:1034:2: rule__EntityGenerator__Group__7__Impl rule__EntityGenerator__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_15);
            rule__EntityGenerator__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__EntityGenerator__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityGenerator__Group__7"


    // $ANTLR start "rule__EntityGenerator__Group__7__Impl"
    // InternalDataSampleDSL.g:1041:1: rule__EntityGenerator__Group__7__Impl : ( ( rule__EntityGenerator__ChildGeneratorsAssignment_7 )* ) ;
    public final void rule__EntityGenerator__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:1045:1: ( ( ( rule__EntityGenerator__ChildGeneratorsAssignment_7 )* ) )
            // InternalDataSampleDSL.g:1046:1: ( ( rule__EntityGenerator__ChildGeneratorsAssignment_7 )* )
            {
            // InternalDataSampleDSL.g:1046:1: ( ( rule__EntityGenerator__ChildGeneratorsAssignment_7 )* )
            // InternalDataSampleDSL.g:1047:1: ( rule__EntityGenerator__ChildGeneratorsAssignment_7 )*
            {
             before(grammarAccess.getEntityGeneratorAccess().getChildGeneratorsAssignment_7()); 
            // InternalDataSampleDSL.g:1048:1: ( rule__EntityGenerator__ChildGeneratorsAssignment_7 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==34) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalDataSampleDSL.g:1048:2: rule__EntityGenerator__ChildGeneratorsAssignment_7
            	    {
            	    pushFollow(FollowSets000.FOLLOW_17);
            	    rule__EntityGenerator__ChildGeneratorsAssignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getEntityGeneratorAccess().getChildGeneratorsAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityGenerator__Group__7__Impl"


    // $ANTLR start "rule__EntityGenerator__Group__8"
    // InternalDataSampleDSL.g:1058:1: rule__EntityGenerator__Group__8 : rule__EntityGenerator__Group__8__Impl rule__EntityGenerator__Group__9 ;
    public final void rule__EntityGenerator__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:1062:1: ( rule__EntityGenerator__Group__8__Impl rule__EntityGenerator__Group__9 )
            // InternalDataSampleDSL.g:1063:2: rule__EntityGenerator__Group__8__Impl rule__EntityGenerator__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_15);
            rule__EntityGenerator__Group__8__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__EntityGenerator__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityGenerator__Group__8"


    // $ANTLR start "rule__EntityGenerator__Group__8__Impl"
    // InternalDataSampleDSL.g:1070:1: rule__EntityGenerator__Group__8__Impl : ( ( rule__EntityGenerator__AssociationGeneratorsAssignment_8 )* ) ;
    public final void rule__EntityGenerator__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:1074:1: ( ( ( rule__EntityGenerator__AssociationGeneratorsAssignment_8 )* ) )
            // InternalDataSampleDSL.g:1075:1: ( ( rule__EntityGenerator__AssociationGeneratorsAssignment_8 )* )
            {
            // InternalDataSampleDSL.g:1075:1: ( ( rule__EntityGenerator__AssociationGeneratorsAssignment_8 )* )
            // InternalDataSampleDSL.g:1076:1: ( rule__EntityGenerator__AssociationGeneratorsAssignment_8 )*
            {
             before(grammarAccess.getEntityGeneratorAccess().getAssociationGeneratorsAssignment_8()); 
            // InternalDataSampleDSL.g:1077:1: ( rule__EntityGenerator__AssociationGeneratorsAssignment_8 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==35) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalDataSampleDSL.g:1077:2: rule__EntityGenerator__AssociationGeneratorsAssignment_8
            	    {
            	    pushFollow(FollowSets000.FOLLOW_18);
            	    rule__EntityGenerator__AssociationGeneratorsAssignment_8();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getEntityGeneratorAccess().getAssociationGeneratorsAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityGenerator__Group__8__Impl"


    // $ANTLR start "rule__EntityGenerator__Group__9"
    // InternalDataSampleDSL.g:1087:1: rule__EntityGenerator__Group__9 : rule__EntityGenerator__Group__9__Impl ;
    public final void rule__EntityGenerator__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:1091:1: ( rule__EntityGenerator__Group__9__Impl )
            // InternalDataSampleDSL.g:1092:2: rule__EntityGenerator__Group__9__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__EntityGenerator__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityGenerator__Group__9"


    // $ANTLR start "rule__EntityGenerator__Group__9__Impl"
    // InternalDataSampleDSL.g:1098:1: rule__EntityGenerator__Group__9__Impl : ( '}' ) ;
    public final void rule__EntityGenerator__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:1102:1: ( ( '}' ) )
            // InternalDataSampleDSL.g:1103:1: ( '}' )
            {
            // InternalDataSampleDSL.g:1103:1: ( '}' )
            // InternalDataSampleDSL.g:1104:1: '}'
            {
             before(grammarAccess.getEntityGeneratorAccess().getRightCurlyBracketKeyword_9()); 
            match(input,25,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getEntityGeneratorAccess().getRightCurlyBracketKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityGenerator__Group__9__Impl"


    // $ANTLR start "rule__FieldGenerator__Group__0"
    // InternalDataSampleDSL.g:1137:1: rule__FieldGenerator__Group__0 : rule__FieldGenerator__Group__0__Impl rule__FieldGenerator__Group__1 ;
    public final void rule__FieldGenerator__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:1141:1: ( rule__FieldGenerator__Group__0__Impl rule__FieldGenerator__Group__1 )
            // InternalDataSampleDSL.g:1142:2: rule__FieldGenerator__Group__0__Impl rule__FieldGenerator__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_19);
            rule__FieldGenerator__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__FieldGenerator__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldGenerator__Group__0"


    // $ANTLR start "rule__FieldGenerator__Group__0__Impl"
    // InternalDataSampleDSL.g:1149:1: rule__FieldGenerator__Group__0__Impl : ( () ) ;
    public final void rule__FieldGenerator__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:1153:1: ( ( () ) )
            // InternalDataSampleDSL.g:1154:1: ( () )
            {
            // InternalDataSampleDSL.g:1154:1: ( () )
            // InternalDataSampleDSL.g:1155:1: ()
            {
             before(grammarAccess.getFieldGeneratorAccess().getFieldGeneratorAction_0()); 
            // InternalDataSampleDSL.g:1156:1: ()
            // InternalDataSampleDSL.g:1158:1: 
            {
            }

             after(grammarAccess.getFieldGeneratorAccess().getFieldGeneratorAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldGenerator__Group__0__Impl"


    // $ANTLR start "rule__FieldGenerator__Group__1"
    // InternalDataSampleDSL.g:1168:1: rule__FieldGenerator__Group__1 : rule__FieldGenerator__Group__1__Impl rule__FieldGenerator__Group__2 ;
    public final void rule__FieldGenerator__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:1172:1: ( rule__FieldGenerator__Group__1__Impl rule__FieldGenerator__Group__2 )
            // InternalDataSampleDSL.g:1173:2: rule__FieldGenerator__Group__1__Impl rule__FieldGenerator__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_4);
            rule__FieldGenerator__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__FieldGenerator__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldGenerator__Group__1"


    // $ANTLR start "rule__FieldGenerator__Group__1__Impl"
    // InternalDataSampleDSL.g:1180:1: rule__FieldGenerator__Group__1__Impl : ( 'forTheField' ) ;
    public final void rule__FieldGenerator__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:1184:1: ( ( 'forTheField' ) )
            // InternalDataSampleDSL.g:1185:1: ( 'forTheField' )
            {
            // InternalDataSampleDSL.g:1185:1: ( 'forTheField' )
            // InternalDataSampleDSL.g:1186:1: 'forTheField'
            {
             before(grammarAccess.getFieldGeneratorAccess().getForTheFieldKeyword_1()); 
            match(input,26,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getFieldGeneratorAccess().getForTheFieldKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldGenerator__Group__1__Impl"


    // $ANTLR start "rule__FieldGenerator__Group__2"
    // InternalDataSampleDSL.g:1199:1: rule__FieldGenerator__Group__2 : rule__FieldGenerator__Group__2__Impl rule__FieldGenerator__Group__3 ;
    public final void rule__FieldGenerator__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:1203:1: ( rule__FieldGenerator__Group__2__Impl rule__FieldGenerator__Group__3 )
            // InternalDataSampleDSL.g:1204:2: rule__FieldGenerator__Group__2__Impl rule__FieldGenerator__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_20);
            rule__FieldGenerator__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__FieldGenerator__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldGenerator__Group__2"


    // $ANTLR start "rule__FieldGenerator__Group__2__Impl"
    // InternalDataSampleDSL.g:1211:1: rule__FieldGenerator__Group__2__Impl : ( ( rule__FieldGenerator__FieldNameAssignment_2 ) ) ;
    public final void rule__FieldGenerator__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:1215:1: ( ( ( rule__FieldGenerator__FieldNameAssignment_2 ) ) )
            // InternalDataSampleDSL.g:1216:1: ( ( rule__FieldGenerator__FieldNameAssignment_2 ) )
            {
            // InternalDataSampleDSL.g:1216:1: ( ( rule__FieldGenerator__FieldNameAssignment_2 ) )
            // InternalDataSampleDSL.g:1217:1: ( rule__FieldGenerator__FieldNameAssignment_2 )
            {
             before(grammarAccess.getFieldGeneratorAccess().getFieldNameAssignment_2()); 
            // InternalDataSampleDSL.g:1218:1: ( rule__FieldGenerator__FieldNameAssignment_2 )
            // InternalDataSampleDSL.g:1218:2: rule__FieldGenerator__FieldNameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__FieldGenerator__FieldNameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getFieldGeneratorAccess().getFieldNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldGenerator__Group__2__Impl"


    // $ANTLR start "rule__FieldGenerator__Group__3"
    // InternalDataSampleDSL.g:1228:1: rule__FieldGenerator__Group__3 : rule__FieldGenerator__Group__3__Impl rule__FieldGenerator__Group__4 ;
    public final void rule__FieldGenerator__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:1232:1: ( rule__FieldGenerator__Group__3__Impl rule__FieldGenerator__Group__4 )
            // InternalDataSampleDSL.g:1233:2: rule__FieldGenerator__Group__3__Impl rule__FieldGenerator__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_4);
            rule__FieldGenerator__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__FieldGenerator__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldGenerator__Group__3"


    // $ANTLR start "rule__FieldGenerator__Group__3__Impl"
    // InternalDataSampleDSL.g:1240:1: rule__FieldGenerator__Group__3__Impl : ( 'use' ) ;
    public final void rule__FieldGenerator__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:1244:1: ( ( 'use' ) )
            // InternalDataSampleDSL.g:1245:1: ( 'use' )
            {
            // InternalDataSampleDSL.g:1245:1: ( 'use' )
            // InternalDataSampleDSL.g:1246:1: 'use'
            {
             before(grammarAccess.getFieldGeneratorAccess().getUseKeyword_3()); 
            match(input,27,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getFieldGeneratorAccess().getUseKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldGenerator__Group__3__Impl"


    // $ANTLR start "rule__FieldGenerator__Group__4"
    // InternalDataSampleDSL.g:1259:1: rule__FieldGenerator__Group__4 : rule__FieldGenerator__Group__4__Impl rule__FieldGenerator__Group__5 ;
    public final void rule__FieldGenerator__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:1263:1: ( rule__FieldGenerator__Group__4__Impl rule__FieldGenerator__Group__5 )
            // InternalDataSampleDSL.g:1264:2: rule__FieldGenerator__Group__4__Impl rule__FieldGenerator__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_21);
            rule__FieldGenerator__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__FieldGenerator__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldGenerator__Group__4"


    // $ANTLR start "rule__FieldGenerator__Group__4__Impl"
    // InternalDataSampleDSL.g:1271:1: rule__FieldGenerator__Group__4__Impl : ( ( rule__FieldGenerator__GeneratorNameAssignment_4 ) ) ;
    public final void rule__FieldGenerator__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:1275:1: ( ( ( rule__FieldGenerator__GeneratorNameAssignment_4 ) ) )
            // InternalDataSampleDSL.g:1276:1: ( ( rule__FieldGenerator__GeneratorNameAssignment_4 ) )
            {
            // InternalDataSampleDSL.g:1276:1: ( ( rule__FieldGenerator__GeneratorNameAssignment_4 ) )
            // InternalDataSampleDSL.g:1277:1: ( rule__FieldGenerator__GeneratorNameAssignment_4 )
            {
             before(grammarAccess.getFieldGeneratorAccess().getGeneratorNameAssignment_4()); 
            // InternalDataSampleDSL.g:1278:1: ( rule__FieldGenerator__GeneratorNameAssignment_4 )
            // InternalDataSampleDSL.g:1278:2: rule__FieldGenerator__GeneratorNameAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__FieldGenerator__GeneratorNameAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getFieldGeneratorAccess().getGeneratorNameAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldGenerator__Group__4__Impl"


    // $ANTLR start "rule__FieldGenerator__Group__5"
    // InternalDataSampleDSL.g:1288:1: rule__FieldGenerator__Group__5 : rule__FieldGenerator__Group__5__Impl rule__FieldGenerator__Group__6 ;
    public final void rule__FieldGenerator__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:1292:1: ( rule__FieldGenerator__Group__5__Impl rule__FieldGenerator__Group__6 )
            // InternalDataSampleDSL.g:1293:2: rule__FieldGenerator__Group__5__Impl rule__FieldGenerator__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_21);
            rule__FieldGenerator__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__FieldGenerator__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldGenerator__Group__5"


    // $ANTLR start "rule__FieldGenerator__Group__5__Impl"
    // InternalDataSampleDSL.g:1300:1: rule__FieldGenerator__Group__5__Impl : ( ( rule__FieldGenerator__Group_5__0 )? ) ;
    public final void rule__FieldGenerator__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:1304:1: ( ( ( rule__FieldGenerator__Group_5__0 )? ) )
            // InternalDataSampleDSL.g:1305:1: ( ( rule__FieldGenerator__Group_5__0 )? )
            {
            // InternalDataSampleDSL.g:1305:1: ( ( rule__FieldGenerator__Group_5__0 )? )
            // InternalDataSampleDSL.g:1306:1: ( rule__FieldGenerator__Group_5__0 )?
            {
             before(grammarAccess.getFieldGeneratorAccess().getGroup_5()); 
            // InternalDataSampleDSL.g:1307:1: ( rule__FieldGenerator__Group_5__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==28) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalDataSampleDSL.g:1307:2: rule__FieldGenerator__Group_5__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__FieldGenerator__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFieldGeneratorAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldGenerator__Group__5__Impl"


    // $ANTLR start "rule__FieldGenerator__Group__6"
    // InternalDataSampleDSL.g:1317:1: rule__FieldGenerator__Group__6 : rule__FieldGenerator__Group__6__Impl rule__FieldGenerator__Group__7 ;
    public final void rule__FieldGenerator__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:1321:1: ( rule__FieldGenerator__Group__6__Impl rule__FieldGenerator__Group__7 )
            // InternalDataSampleDSL.g:1322:2: rule__FieldGenerator__Group__6__Impl rule__FieldGenerator__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_21);
            rule__FieldGenerator__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__FieldGenerator__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldGenerator__Group__6"


    // $ANTLR start "rule__FieldGenerator__Group__6__Impl"
    // InternalDataSampleDSL.g:1329:1: rule__FieldGenerator__Group__6__Impl : ( ( rule__FieldGenerator__Group_6__0 )? ) ;
    public final void rule__FieldGenerator__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:1333:1: ( ( ( rule__FieldGenerator__Group_6__0 )? ) )
            // InternalDataSampleDSL.g:1334:1: ( ( rule__FieldGenerator__Group_6__0 )? )
            {
            // InternalDataSampleDSL.g:1334:1: ( ( rule__FieldGenerator__Group_6__0 )? )
            // InternalDataSampleDSL.g:1335:1: ( rule__FieldGenerator__Group_6__0 )?
            {
             before(grammarAccess.getFieldGeneratorAccess().getGroup_6()); 
            // InternalDataSampleDSL.g:1336:1: ( rule__FieldGenerator__Group_6__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==29) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalDataSampleDSL.g:1336:2: rule__FieldGenerator__Group_6__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__FieldGenerator__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFieldGeneratorAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldGenerator__Group__6__Impl"


    // $ANTLR start "rule__FieldGenerator__Group__7"
    // InternalDataSampleDSL.g:1346:1: rule__FieldGenerator__Group__7 : rule__FieldGenerator__Group__7__Impl ;
    public final void rule__FieldGenerator__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:1350:1: ( rule__FieldGenerator__Group__7__Impl )
            // InternalDataSampleDSL.g:1351:2: rule__FieldGenerator__Group__7__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__FieldGenerator__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldGenerator__Group__7"


    // $ANTLR start "rule__FieldGenerator__Group__7__Impl"
    // InternalDataSampleDSL.g:1357:1: rule__FieldGenerator__Group__7__Impl : ( ( rule__FieldGenerator__Group_7__0 )? ) ;
    public final void rule__FieldGenerator__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:1361:1: ( ( ( rule__FieldGenerator__Group_7__0 )? ) )
            // InternalDataSampleDSL.g:1362:1: ( ( rule__FieldGenerator__Group_7__0 )? )
            {
            // InternalDataSampleDSL.g:1362:1: ( ( rule__FieldGenerator__Group_7__0 )? )
            // InternalDataSampleDSL.g:1363:1: ( rule__FieldGenerator__Group_7__0 )?
            {
             before(grammarAccess.getFieldGeneratorAccess().getGroup_7()); 
            // InternalDataSampleDSL.g:1364:1: ( rule__FieldGenerator__Group_7__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==32) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalDataSampleDSL.g:1364:2: rule__FieldGenerator__Group_7__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__FieldGenerator__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFieldGeneratorAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldGenerator__Group__7__Impl"


    // $ANTLR start "rule__FieldGenerator__Group_5__0"
    // InternalDataSampleDSL.g:1390:1: rule__FieldGenerator__Group_5__0 : rule__FieldGenerator__Group_5__0__Impl rule__FieldGenerator__Group_5__1 ;
    public final void rule__FieldGenerator__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:1394:1: ( rule__FieldGenerator__Group_5__0__Impl rule__FieldGenerator__Group_5__1 )
            // InternalDataSampleDSL.g:1395:2: rule__FieldGenerator__Group_5__0__Impl rule__FieldGenerator__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_8);
            rule__FieldGenerator__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__FieldGenerator__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldGenerator__Group_5__0"


    // $ANTLR start "rule__FieldGenerator__Group_5__0__Impl"
    // InternalDataSampleDSL.g:1402:1: rule__FieldGenerator__Group_5__0__Impl : ( 'cardinality' ) ;
    public final void rule__FieldGenerator__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:1406:1: ( ( 'cardinality' ) )
            // InternalDataSampleDSL.g:1407:1: ( 'cardinality' )
            {
            // InternalDataSampleDSL.g:1407:1: ( 'cardinality' )
            // InternalDataSampleDSL.g:1408:1: 'cardinality'
            {
             before(grammarAccess.getFieldGeneratorAccess().getCardinalityKeyword_5_0()); 
            match(input,28,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getFieldGeneratorAccess().getCardinalityKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldGenerator__Group_5__0__Impl"


    // $ANTLR start "rule__FieldGenerator__Group_5__1"
    // InternalDataSampleDSL.g:1421:1: rule__FieldGenerator__Group_5__1 : rule__FieldGenerator__Group_5__1__Impl ;
    public final void rule__FieldGenerator__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:1425:1: ( rule__FieldGenerator__Group_5__1__Impl )
            // InternalDataSampleDSL.g:1426:2: rule__FieldGenerator__Group_5__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__FieldGenerator__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldGenerator__Group_5__1"


    // $ANTLR start "rule__FieldGenerator__Group_5__1__Impl"
    // InternalDataSampleDSL.g:1432:1: rule__FieldGenerator__Group_5__1__Impl : ( ( rule__FieldGenerator__NumberAssignment_5_1 ) ) ;
    public final void rule__FieldGenerator__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:1436:1: ( ( ( rule__FieldGenerator__NumberAssignment_5_1 ) ) )
            // InternalDataSampleDSL.g:1437:1: ( ( rule__FieldGenerator__NumberAssignment_5_1 ) )
            {
            // InternalDataSampleDSL.g:1437:1: ( ( rule__FieldGenerator__NumberAssignment_5_1 ) )
            // InternalDataSampleDSL.g:1438:1: ( rule__FieldGenerator__NumberAssignment_5_1 )
            {
             before(grammarAccess.getFieldGeneratorAccess().getNumberAssignment_5_1()); 
            // InternalDataSampleDSL.g:1439:1: ( rule__FieldGenerator__NumberAssignment_5_1 )
            // InternalDataSampleDSL.g:1439:2: rule__FieldGenerator__NumberAssignment_5_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__FieldGenerator__NumberAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getFieldGeneratorAccess().getNumberAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldGenerator__Group_5__1__Impl"


    // $ANTLR start "rule__FieldGenerator__Group_6__0"
    // InternalDataSampleDSL.g:1453:1: rule__FieldGenerator__Group_6__0 : rule__FieldGenerator__Group_6__0__Impl rule__FieldGenerator__Group_6__1 ;
    public final void rule__FieldGenerator__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:1457:1: ( rule__FieldGenerator__Group_6__0__Impl rule__FieldGenerator__Group_6__1 )
            // InternalDataSampleDSL.g:1458:2: rule__FieldGenerator__Group_6__0__Impl rule__FieldGenerator__Group_6__1
            {
            pushFollow(FollowSets000.FOLLOW_22);
            rule__FieldGenerator__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__FieldGenerator__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldGenerator__Group_6__0"


    // $ANTLR start "rule__FieldGenerator__Group_6__0__Impl"
    // InternalDataSampleDSL.g:1465:1: rule__FieldGenerator__Group_6__0__Impl : ( '(' ) ;
    public final void rule__FieldGenerator__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:1469:1: ( ( '(' ) )
            // InternalDataSampleDSL.g:1470:1: ( '(' )
            {
            // InternalDataSampleDSL.g:1470:1: ( '(' )
            // InternalDataSampleDSL.g:1471:1: '('
            {
             before(grammarAccess.getFieldGeneratorAccess().getLeftParenthesisKeyword_6_0()); 
            match(input,29,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getFieldGeneratorAccess().getLeftParenthesisKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldGenerator__Group_6__0__Impl"


    // $ANTLR start "rule__FieldGenerator__Group_6__1"
    // InternalDataSampleDSL.g:1484:1: rule__FieldGenerator__Group_6__1 : rule__FieldGenerator__Group_6__1__Impl rule__FieldGenerator__Group_6__2 ;
    public final void rule__FieldGenerator__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:1488:1: ( rule__FieldGenerator__Group_6__1__Impl rule__FieldGenerator__Group_6__2 )
            // InternalDataSampleDSL.g:1489:2: rule__FieldGenerator__Group_6__1__Impl rule__FieldGenerator__Group_6__2
            {
            pushFollow(FollowSets000.FOLLOW_23);
            rule__FieldGenerator__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__FieldGenerator__Group_6__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldGenerator__Group_6__1"


    // $ANTLR start "rule__FieldGenerator__Group_6__1__Impl"
    // InternalDataSampleDSL.g:1496:1: rule__FieldGenerator__Group_6__1__Impl : ( ( rule__FieldGenerator__ParametersAssignment_6_1 ) ) ;
    public final void rule__FieldGenerator__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:1500:1: ( ( ( rule__FieldGenerator__ParametersAssignment_6_1 ) ) )
            // InternalDataSampleDSL.g:1501:1: ( ( rule__FieldGenerator__ParametersAssignment_6_1 ) )
            {
            // InternalDataSampleDSL.g:1501:1: ( ( rule__FieldGenerator__ParametersAssignment_6_1 ) )
            // InternalDataSampleDSL.g:1502:1: ( rule__FieldGenerator__ParametersAssignment_6_1 )
            {
             before(grammarAccess.getFieldGeneratorAccess().getParametersAssignment_6_1()); 
            // InternalDataSampleDSL.g:1503:1: ( rule__FieldGenerator__ParametersAssignment_6_1 )
            // InternalDataSampleDSL.g:1503:2: rule__FieldGenerator__ParametersAssignment_6_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__FieldGenerator__ParametersAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getFieldGeneratorAccess().getParametersAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldGenerator__Group_6__1__Impl"


    // $ANTLR start "rule__FieldGenerator__Group_6__2"
    // InternalDataSampleDSL.g:1513:1: rule__FieldGenerator__Group_6__2 : rule__FieldGenerator__Group_6__2__Impl rule__FieldGenerator__Group_6__3 ;
    public final void rule__FieldGenerator__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:1517:1: ( rule__FieldGenerator__Group_6__2__Impl rule__FieldGenerator__Group_6__3 )
            // InternalDataSampleDSL.g:1518:2: rule__FieldGenerator__Group_6__2__Impl rule__FieldGenerator__Group_6__3
            {
            pushFollow(FollowSets000.FOLLOW_23);
            rule__FieldGenerator__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__FieldGenerator__Group_6__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldGenerator__Group_6__2"


    // $ANTLR start "rule__FieldGenerator__Group_6__2__Impl"
    // InternalDataSampleDSL.g:1525:1: rule__FieldGenerator__Group_6__2__Impl : ( ( rule__FieldGenerator__Group_6_2__0 )* ) ;
    public final void rule__FieldGenerator__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:1529:1: ( ( ( rule__FieldGenerator__Group_6_2__0 )* ) )
            // InternalDataSampleDSL.g:1530:1: ( ( rule__FieldGenerator__Group_6_2__0 )* )
            {
            // InternalDataSampleDSL.g:1530:1: ( ( rule__FieldGenerator__Group_6_2__0 )* )
            // InternalDataSampleDSL.g:1531:1: ( rule__FieldGenerator__Group_6_2__0 )*
            {
             before(grammarAccess.getFieldGeneratorAccess().getGroup_6_2()); 
            // InternalDataSampleDSL.g:1532:1: ( rule__FieldGenerator__Group_6_2__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==31) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalDataSampleDSL.g:1532:2: rule__FieldGenerator__Group_6_2__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_24);
            	    rule__FieldGenerator__Group_6_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getFieldGeneratorAccess().getGroup_6_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldGenerator__Group_6__2__Impl"


    // $ANTLR start "rule__FieldGenerator__Group_6__3"
    // InternalDataSampleDSL.g:1542:1: rule__FieldGenerator__Group_6__3 : rule__FieldGenerator__Group_6__3__Impl ;
    public final void rule__FieldGenerator__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:1546:1: ( rule__FieldGenerator__Group_6__3__Impl )
            // InternalDataSampleDSL.g:1547:2: rule__FieldGenerator__Group_6__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__FieldGenerator__Group_6__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldGenerator__Group_6__3"


    // $ANTLR start "rule__FieldGenerator__Group_6__3__Impl"
    // InternalDataSampleDSL.g:1553:1: rule__FieldGenerator__Group_6__3__Impl : ( ')' ) ;
    public final void rule__FieldGenerator__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:1557:1: ( ( ')' ) )
            // InternalDataSampleDSL.g:1558:1: ( ')' )
            {
            // InternalDataSampleDSL.g:1558:1: ( ')' )
            // InternalDataSampleDSL.g:1559:1: ')'
            {
             before(grammarAccess.getFieldGeneratorAccess().getRightParenthesisKeyword_6_3()); 
            match(input,30,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getFieldGeneratorAccess().getRightParenthesisKeyword_6_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldGenerator__Group_6__3__Impl"


    // $ANTLR start "rule__FieldGenerator__Group_6_2__0"
    // InternalDataSampleDSL.g:1580:1: rule__FieldGenerator__Group_6_2__0 : rule__FieldGenerator__Group_6_2__0__Impl rule__FieldGenerator__Group_6_2__1 ;
    public final void rule__FieldGenerator__Group_6_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:1584:1: ( rule__FieldGenerator__Group_6_2__0__Impl rule__FieldGenerator__Group_6_2__1 )
            // InternalDataSampleDSL.g:1585:2: rule__FieldGenerator__Group_6_2__0__Impl rule__FieldGenerator__Group_6_2__1
            {
            pushFollow(FollowSets000.FOLLOW_22);
            rule__FieldGenerator__Group_6_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__FieldGenerator__Group_6_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldGenerator__Group_6_2__0"


    // $ANTLR start "rule__FieldGenerator__Group_6_2__0__Impl"
    // InternalDataSampleDSL.g:1592:1: rule__FieldGenerator__Group_6_2__0__Impl : ( ',' ) ;
    public final void rule__FieldGenerator__Group_6_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:1596:1: ( ( ',' ) )
            // InternalDataSampleDSL.g:1597:1: ( ',' )
            {
            // InternalDataSampleDSL.g:1597:1: ( ',' )
            // InternalDataSampleDSL.g:1598:1: ','
            {
             before(grammarAccess.getFieldGeneratorAccess().getCommaKeyword_6_2_0()); 
            match(input,31,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getFieldGeneratorAccess().getCommaKeyword_6_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldGenerator__Group_6_2__0__Impl"


    // $ANTLR start "rule__FieldGenerator__Group_6_2__1"
    // InternalDataSampleDSL.g:1611:1: rule__FieldGenerator__Group_6_2__1 : rule__FieldGenerator__Group_6_2__1__Impl ;
    public final void rule__FieldGenerator__Group_6_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:1615:1: ( rule__FieldGenerator__Group_6_2__1__Impl )
            // InternalDataSampleDSL.g:1616:2: rule__FieldGenerator__Group_6_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__FieldGenerator__Group_6_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldGenerator__Group_6_2__1"


    // $ANTLR start "rule__FieldGenerator__Group_6_2__1__Impl"
    // InternalDataSampleDSL.g:1622:1: rule__FieldGenerator__Group_6_2__1__Impl : ( ( rule__FieldGenerator__ParametersAssignment_6_2_1 ) ) ;
    public final void rule__FieldGenerator__Group_6_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:1626:1: ( ( ( rule__FieldGenerator__ParametersAssignment_6_2_1 ) ) )
            // InternalDataSampleDSL.g:1627:1: ( ( rule__FieldGenerator__ParametersAssignment_6_2_1 ) )
            {
            // InternalDataSampleDSL.g:1627:1: ( ( rule__FieldGenerator__ParametersAssignment_6_2_1 ) )
            // InternalDataSampleDSL.g:1628:1: ( rule__FieldGenerator__ParametersAssignment_6_2_1 )
            {
             before(grammarAccess.getFieldGeneratorAccess().getParametersAssignment_6_2_1()); 
            // InternalDataSampleDSL.g:1629:1: ( rule__FieldGenerator__ParametersAssignment_6_2_1 )
            // InternalDataSampleDSL.g:1629:2: rule__FieldGenerator__ParametersAssignment_6_2_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__FieldGenerator__ParametersAssignment_6_2_1();

            state._fsp--;


            }

             after(grammarAccess.getFieldGeneratorAccess().getParametersAssignment_6_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldGenerator__Group_6_2__1__Impl"


    // $ANTLR start "rule__FieldGenerator__Group_7__0"
    // InternalDataSampleDSL.g:1643:1: rule__FieldGenerator__Group_7__0 : rule__FieldGenerator__Group_7__0__Impl rule__FieldGenerator__Group_7__1 ;
    public final void rule__FieldGenerator__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:1647:1: ( rule__FieldGenerator__Group_7__0__Impl rule__FieldGenerator__Group_7__1 )
            // InternalDataSampleDSL.g:1648:2: rule__FieldGenerator__Group_7__0__Impl rule__FieldGenerator__Group_7__1
            {
            pushFollow(FollowSets000.FOLLOW_8);
            rule__FieldGenerator__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__FieldGenerator__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldGenerator__Group_7__0"


    // $ANTLR start "rule__FieldGenerator__Group_7__0__Impl"
    // InternalDataSampleDSL.g:1655:1: rule__FieldGenerator__Group_7__0__Impl : ( 'withErrorRate=' ) ;
    public final void rule__FieldGenerator__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:1659:1: ( ( 'withErrorRate=' ) )
            // InternalDataSampleDSL.g:1660:1: ( 'withErrorRate=' )
            {
            // InternalDataSampleDSL.g:1660:1: ( 'withErrorRate=' )
            // InternalDataSampleDSL.g:1661:1: 'withErrorRate='
            {
             before(grammarAccess.getFieldGeneratorAccess().getWithErrorRateKeyword_7_0()); 
            match(input,32,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getFieldGeneratorAccess().getWithErrorRateKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldGenerator__Group_7__0__Impl"


    // $ANTLR start "rule__FieldGenerator__Group_7__1"
    // InternalDataSampleDSL.g:1674:1: rule__FieldGenerator__Group_7__1 : rule__FieldGenerator__Group_7__1__Impl rule__FieldGenerator__Group_7__2 ;
    public final void rule__FieldGenerator__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:1678:1: ( rule__FieldGenerator__Group_7__1__Impl rule__FieldGenerator__Group_7__2 )
            // InternalDataSampleDSL.g:1679:2: rule__FieldGenerator__Group_7__1__Impl rule__FieldGenerator__Group_7__2
            {
            pushFollow(FollowSets000.FOLLOW_25);
            rule__FieldGenerator__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__FieldGenerator__Group_7__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldGenerator__Group_7__1"


    // $ANTLR start "rule__FieldGenerator__Group_7__1__Impl"
    // InternalDataSampleDSL.g:1686:1: rule__FieldGenerator__Group_7__1__Impl : ( ( rule__FieldGenerator__ErrorRateAssignment_7_1 ) ) ;
    public final void rule__FieldGenerator__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:1690:1: ( ( ( rule__FieldGenerator__ErrorRateAssignment_7_1 ) ) )
            // InternalDataSampleDSL.g:1691:1: ( ( rule__FieldGenerator__ErrorRateAssignment_7_1 ) )
            {
            // InternalDataSampleDSL.g:1691:1: ( ( rule__FieldGenerator__ErrorRateAssignment_7_1 ) )
            // InternalDataSampleDSL.g:1692:1: ( rule__FieldGenerator__ErrorRateAssignment_7_1 )
            {
             before(grammarAccess.getFieldGeneratorAccess().getErrorRateAssignment_7_1()); 
            // InternalDataSampleDSL.g:1693:1: ( rule__FieldGenerator__ErrorRateAssignment_7_1 )
            // InternalDataSampleDSL.g:1693:2: rule__FieldGenerator__ErrorRateAssignment_7_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__FieldGenerator__ErrorRateAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getFieldGeneratorAccess().getErrorRateAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldGenerator__Group_7__1__Impl"


    // $ANTLR start "rule__FieldGenerator__Group_7__2"
    // InternalDataSampleDSL.g:1703:1: rule__FieldGenerator__Group_7__2 : rule__FieldGenerator__Group_7__2__Impl rule__FieldGenerator__Group_7__3 ;
    public final void rule__FieldGenerator__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:1707:1: ( rule__FieldGenerator__Group_7__2__Impl rule__FieldGenerator__Group_7__3 )
            // InternalDataSampleDSL.g:1708:2: rule__FieldGenerator__Group_7__2__Impl rule__FieldGenerator__Group_7__3
            {
            pushFollow(FollowSets000.FOLLOW_4);
            rule__FieldGenerator__Group_7__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__FieldGenerator__Group_7__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldGenerator__Group_7__2"


    // $ANTLR start "rule__FieldGenerator__Group_7__2__Impl"
    // InternalDataSampleDSL.g:1715:1: rule__FieldGenerator__Group_7__2__Impl : ( 'generatedWith' ) ;
    public final void rule__FieldGenerator__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:1719:1: ( ( 'generatedWith' ) )
            // InternalDataSampleDSL.g:1720:1: ( 'generatedWith' )
            {
            // InternalDataSampleDSL.g:1720:1: ( 'generatedWith' )
            // InternalDataSampleDSL.g:1721:1: 'generatedWith'
            {
             before(grammarAccess.getFieldGeneratorAccess().getGeneratedWithKeyword_7_2()); 
            match(input,33,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getFieldGeneratorAccess().getGeneratedWithKeyword_7_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldGenerator__Group_7__2__Impl"


    // $ANTLR start "rule__FieldGenerator__Group_7__3"
    // InternalDataSampleDSL.g:1734:1: rule__FieldGenerator__Group_7__3 : rule__FieldGenerator__Group_7__3__Impl ;
    public final void rule__FieldGenerator__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:1738:1: ( rule__FieldGenerator__Group_7__3__Impl )
            // InternalDataSampleDSL.g:1739:2: rule__FieldGenerator__Group_7__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__FieldGenerator__Group_7__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldGenerator__Group_7__3"


    // $ANTLR start "rule__FieldGenerator__Group_7__3__Impl"
    // InternalDataSampleDSL.g:1745:1: rule__FieldGenerator__Group_7__3__Impl : ( ( rule__FieldGenerator__ErrorGeneratorNameAssignment_7_3 ) ) ;
    public final void rule__FieldGenerator__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:1749:1: ( ( ( rule__FieldGenerator__ErrorGeneratorNameAssignment_7_3 ) ) )
            // InternalDataSampleDSL.g:1750:1: ( ( rule__FieldGenerator__ErrorGeneratorNameAssignment_7_3 ) )
            {
            // InternalDataSampleDSL.g:1750:1: ( ( rule__FieldGenerator__ErrorGeneratorNameAssignment_7_3 ) )
            // InternalDataSampleDSL.g:1751:1: ( rule__FieldGenerator__ErrorGeneratorNameAssignment_7_3 )
            {
             before(grammarAccess.getFieldGeneratorAccess().getErrorGeneratorNameAssignment_7_3()); 
            // InternalDataSampleDSL.g:1752:1: ( rule__FieldGenerator__ErrorGeneratorNameAssignment_7_3 )
            // InternalDataSampleDSL.g:1752:2: rule__FieldGenerator__ErrorGeneratorNameAssignment_7_3
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__FieldGenerator__ErrorGeneratorNameAssignment_7_3();

            state._fsp--;


            }

             after(grammarAccess.getFieldGeneratorAccess().getErrorGeneratorNameAssignment_7_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldGenerator__Group_7__3__Impl"


    // $ANTLR start "rule__ChildrenGenerator__Group__0"
    // InternalDataSampleDSL.g:1770:1: rule__ChildrenGenerator__Group__0 : rule__ChildrenGenerator__Group__0__Impl rule__ChildrenGenerator__Group__1 ;
    public final void rule__ChildrenGenerator__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:1774:1: ( rule__ChildrenGenerator__Group__0__Impl rule__ChildrenGenerator__Group__1 )
            // InternalDataSampleDSL.g:1775:2: rule__ChildrenGenerator__Group__0__Impl rule__ChildrenGenerator__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_26);
            rule__ChildrenGenerator__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__ChildrenGenerator__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChildrenGenerator__Group__0"


    // $ANTLR start "rule__ChildrenGenerator__Group__0__Impl"
    // InternalDataSampleDSL.g:1782:1: rule__ChildrenGenerator__Group__0__Impl : ( () ) ;
    public final void rule__ChildrenGenerator__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:1786:1: ( ( () ) )
            // InternalDataSampleDSL.g:1787:1: ( () )
            {
            // InternalDataSampleDSL.g:1787:1: ( () )
            // InternalDataSampleDSL.g:1788:1: ()
            {
             before(grammarAccess.getChildrenGeneratorAccess().getChildrenGeneratorAction_0()); 
            // InternalDataSampleDSL.g:1789:1: ()
            // InternalDataSampleDSL.g:1791:1: 
            {
            }

             after(grammarAccess.getChildrenGeneratorAccess().getChildrenGeneratorAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChildrenGenerator__Group__0__Impl"


    // $ANTLR start "rule__ChildrenGenerator__Group__1"
    // InternalDataSampleDSL.g:1801:1: rule__ChildrenGenerator__Group__1 : rule__ChildrenGenerator__Group__1__Impl rule__ChildrenGenerator__Group__2 ;
    public final void rule__ChildrenGenerator__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:1805:1: ( rule__ChildrenGenerator__Group__1__Impl rule__ChildrenGenerator__Group__2 )
            // InternalDataSampleDSL.g:1806:2: rule__ChildrenGenerator__Group__1__Impl rule__ChildrenGenerator__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_4);
            rule__ChildrenGenerator__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__ChildrenGenerator__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChildrenGenerator__Group__1"


    // $ANTLR start "rule__ChildrenGenerator__Group__1__Impl"
    // InternalDataSampleDSL.g:1813:1: rule__ChildrenGenerator__Group__1__Impl : ( 'forTheComposition' ) ;
    public final void rule__ChildrenGenerator__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:1817:1: ( ( 'forTheComposition' ) )
            // InternalDataSampleDSL.g:1818:1: ( 'forTheComposition' )
            {
            // InternalDataSampleDSL.g:1818:1: ( 'forTheComposition' )
            // InternalDataSampleDSL.g:1819:1: 'forTheComposition'
            {
             before(grammarAccess.getChildrenGeneratorAccess().getForTheCompositionKeyword_1()); 
            match(input,34,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getChildrenGeneratorAccess().getForTheCompositionKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChildrenGenerator__Group__1__Impl"


    // $ANTLR start "rule__ChildrenGenerator__Group__2"
    // InternalDataSampleDSL.g:1832:1: rule__ChildrenGenerator__Group__2 : rule__ChildrenGenerator__Group__2__Impl rule__ChildrenGenerator__Group__3 ;
    public final void rule__ChildrenGenerator__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:1836:1: ( rule__ChildrenGenerator__Group__2__Impl rule__ChildrenGenerator__Group__3 )
            // InternalDataSampleDSL.g:1837:2: rule__ChildrenGenerator__Group__2__Impl rule__ChildrenGenerator__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_20);
            rule__ChildrenGenerator__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__ChildrenGenerator__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChildrenGenerator__Group__2"


    // $ANTLR start "rule__ChildrenGenerator__Group__2__Impl"
    // InternalDataSampleDSL.g:1844:1: rule__ChildrenGenerator__Group__2__Impl : ( ( rule__ChildrenGenerator__FieldNameAssignment_2 ) ) ;
    public final void rule__ChildrenGenerator__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:1848:1: ( ( ( rule__ChildrenGenerator__FieldNameAssignment_2 ) ) )
            // InternalDataSampleDSL.g:1849:1: ( ( rule__ChildrenGenerator__FieldNameAssignment_2 ) )
            {
            // InternalDataSampleDSL.g:1849:1: ( ( rule__ChildrenGenerator__FieldNameAssignment_2 ) )
            // InternalDataSampleDSL.g:1850:1: ( rule__ChildrenGenerator__FieldNameAssignment_2 )
            {
             before(grammarAccess.getChildrenGeneratorAccess().getFieldNameAssignment_2()); 
            // InternalDataSampleDSL.g:1851:1: ( rule__ChildrenGenerator__FieldNameAssignment_2 )
            // InternalDataSampleDSL.g:1851:2: rule__ChildrenGenerator__FieldNameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ChildrenGenerator__FieldNameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getChildrenGeneratorAccess().getFieldNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChildrenGenerator__Group__2__Impl"


    // $ANTLR start "rule__ChildrenGenerator__Group__3"
    // InternalDataSampleDSL.g:1861:1: rule__ChildrenGenerator__Group__3 : rule__ChildrenGenerator__Group__3__Impl rule__ChildrenGenerator__Group__4 ;
    public final void rule__ChildrenGenerator__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:1865:1: ( rule__ChildrenGenerator__Group__3__Impl rule__ChildrenGenerator__Group__4 )
            // InternalDataSampleDSL.g:1866:2: rule__ChildrenGenerator__Group__3__Impl rule__ChildrenGenerator__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_4);
            rule__ChildrenGenerator__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__ChildrenGenerator__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChildrenGenerator__Group__3"


    // $ANTLR start "rule__ChildrenGenerator__Group__3__Impl"
    // InternalDataSampleDSL.g:1873:1: rule__ChildrenGenerator__Group__3__Impl : ( 'use' ) ;
    public final void rule__ChildrenGenerator__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:1877:1: ( ( 'use' ) )
            // InternalDataSampleDSL.g:1878:1: ( 'use' )
            {
            // InternalDataSampleDSL.g:1878:1: ( 'use' )
            // InternalDataSampleDSL.g:1879:1: 'use'
            {
             before(grammarAccess.getChildrenGeneratorAccess().getUseKeyword_3()); 
            match(input,27,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getChildrenGeneratorAccess().getUseKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChildrenGenerator__Group__3__Impl"


    // $ANTLR start "rule__ChildrenGenerator__Group__4"
    // InternalDataSampleDSL.g:1892:1: rule__ChildrenGenerator__Group__4 : rule__ChildrenGenerator__Group__4__Impl rule__ChildrenGenerator__Group__5 ;
    public final void rule__ChildrenGenerator__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:1896:1: ( rule__ChildrenGenerator__Group__4__Impl rule__ChildrenGenerator__Group__5 )
            // InternalDataSampleDSL.g:1897:2: rule__ChildrenGenerator__Group__4__Impl rule__ChildrenGenerator__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_21);
            rule__ChildrenGenerator__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__ChildrenGenerator__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChildrenGenerator__Group__4"


    // $ANTLR start "rule__ChildrenGenerator__Group__4__Impl"
    // InternalDataSampleDSL.g:1904:1: rule__ChildrenGenerator__Group__4__Impl : ( ( rule__ChildrenGenerator__GeneratorNameAssignment_4 ) ) ;
    public final void rule__ChildrenGenerator__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:1908:1: ( ( ( rule__ChildrenGenerator__GeneratorNameAssignment_4 ) ) )
            // InternalDataSampleDSL.g:1909:1: ( ( rule__ChildrenGenerator__GeneratorNameAssignment_4 ) )
            {
            // InternalDataSampleDSL.g:1909:1: ( ( rule__ChildrenGenerator__GeneratorNameAssignment_4 ) )
            // InternalDataSampleDSL.g:1910:1: ( rule__ChildrenGenerator__GeneratorNameAssignment_4 )
            {
             before(grammarAccess.getChildrenGeneratorAccess().getGeneratorNameAssignment_4()); 
            // InternalDataSampleDSL.g:1911:1: ( rule__ChildrenGenerator__GeneratorNameAssignment_4 )
            // InternalDataSampleDSL.g:1911:2: rule__ChildrenGenerator__GeneratorNameAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ChildrenGenerator__GeneratorNameAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getChildrenGeneratorAccess().getGeneratorNameAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChildrenGenerator__Group__4__Impl"


    // $ANTLR start "rule__ChildrenGenerator__Group__5"
    // InternalDataSampleDSL.g:1921:1: rule__ChildrenGenerator__Group__5 : rule__ChildrenGenerator__Group__5__Impl rule__ChildrenGenerator__Group__6 ;
    public final void rule__ChildrenGenerator__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:1925:1: ( rule__ChildrenGenerator__Group__5__Impl rule__ChildrenGenerator__Group__6 )
            // InternalDataSampleDSL.g:1926:2: rule__ChildrenGenerator__Group__5__Impl rule__ChildrenGenerator__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_21);
            rule__ChildrenGenerator__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__ChildrenGenerator__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChildrenGenerator__Group__5"


    // $ANTLR start "rule__ChildrenGenerator__Group__5__Impl"
    // InternalDataSampleDSL.g:1933:1: rule__ChildrenGenerator__Group__5__Impl : ( ( rule__ChildrenGenerator__Group_5__0 )? ) ;
    public final void rule__ChildrenGenerator__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:1937:1: ( ( ( rule__ChildrenGenerator__Group_5__0 )? ) )
            // InternalDataSampleDSL.g:1938:1: ( ( rule__ChildrenGenerator__Group_5__0 )? )
            {
            // InternalDataSampleDSL.g:1938:1: ( ( rule__ChildrenGenerator__Group_5__0 )? )
            // InternalDataSampleDSL.g:1939:1: ( rule__ChildrenGenerator__Group_5__0 )?
            {
             before(grammarAccess.getChildrenGeneratorAccess().getGroup_5()); 
            // InternalDataSampleDSL.g:1940:1: ( rule__ChildrenGenerator__Group_5__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==28) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalDataSampleDSL.g:1940:2: rule__ChildrenGenerator__Group_5__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__ChildrenGenerator__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getChildrenGeneratorAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChildrenGenerator__Group__5__Impl"


    // $ANTLR start "rule__ChildrenGenerator__Group__6"
    // InternalDataSampleDSL.g:1950:1: rule__ChildrenGenerator__Group__6 : rule__ChildrenGenerator__Group__6__Impl rule__ChildrenGenerator__Group__7 ;
    public final void rule__ChildrenGenerator__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:1954:1: ( rule__ChildrenGenerator__Group__6__Impl rule__ChildrenGenerator__Group__7 )
            // InternalDataSampleDSL.g:1955:2: rule__ChildrenGenerator__Group__6__Impl rule__ChildrenGenerator__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_21);
            rule__ChildrenGenerator__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__ChildrenGenerator__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChildrenGenerator__Group__6"


    // $ANTLR start "rule__ChildrenGenerator__Group__6__Impl"
    // InternalDataSampleDSL.g:1962:1: rule__ChildrenGenerator__Group__6__Impl : ( ( rule__ChildrenGenerator__Group_6__0 )? ) ;
    public final void rule__ChildrenGenerator__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:1966:1: ( ( ( rule__ChildrenGenerator__Group_6__0 )? ) )
            // InternalDataSampleDSL.g:1967:1: ( ( rule__ChildrenGenerator__Group_6__0 )? )
            {
            // InternalDataSampleDSL.g:1967:1: ( ( rule__ChildrenGenerator__Group_6__0 )? )
            // InternalDataSampleDSL.g:1968:1: ( rule__ChildrenGenerator__Group_6__0 )?
            {
             before(grammarAccess.getChildrenGeneratorAccess().getGroup_6()); 
            // InternalDataSampleDSL.g:1969:1: ( rule__ChildrenGenerator__Group_6__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==29) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalDataSampleDSL.g:1969:2: rule__ChildrenGenerator__Group_6__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__ChildrenGenerator__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getChildrenGeneratorAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChildrenGenerator__Group__6__Impl"


    // $ANTLR start "rule__ChildrenGenerator__Group__7"
    // InternalDataSampleDSL.g:1979:1: rule__ChildrenGenerator__Group__7 : rule__ChildrenGenerator__Group__7__Impl ;
    public final void rule__ChildrenGenerator__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:1983:1: ( rule__ChildrenGenerator__Group__7__Impl )
            // InternalDataSampleDSL.g:1984:2: rule__ChildrenGenerator__Group__7__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ChildrenGenerator__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChildrenGenerator__Group__7"


    // $ANTLR start "rule__ChildrenGenerator__Group__7__Impl"
    // InternalDataSampleDSL.g:1990:1: rule__ChildrenGenerator__Group__7__Impl : ( ( rule__ChildrenGenerator__Group_7__0 )? ) ;
    public final void rule__ChildrenGenerator__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:1994:1: ( ( ( rule__ChildrenGenerator__Group_7__0 )? ) )
            // InternalDataSampleDSL.g:1995:1: ( ( rule__ChildrenGenerator__Group_7__0 )? )
            {
            // InternalDataSampleDSL.g:1995:1: ( ( rule__ChildrenGenerator__Group_7__0 )? )
            // InternalDataSampleDSL.g:1996:1: ( rule__ChildrenGenerator__Group_7__0 )?
            {
             before(grammarAccess.getChildrenGeneratorAccess().getGroup_7()); 
            // InternalDataSampleDSL.g:1997:1: ( rule__ChildrenGenerator__Group_7__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==32) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalDataSampleDSL.g:1997:2: rule__ChildrenGenerator__Group_7__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__ChildrenGenerator__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getChildrenGeneratorAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChildrenGenerator__Group__7__Impl"


    // $ANTLR start "rule__ChildrenGenerator__Group_5__0"
    // InternalDataSampleDSL.g:2023:1: rule__ChildrenGenerator__Group_5__0 : rule__ChildrenGenerator__Group_5__0__Impl rule__ChildrenGenerator__Group_5__1 ;
    public final void rule__ChildrenGenerator__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:2027:1: ( rule__ChildrenGenerator__Group_5__0__Impl rule__ChildrenGenerator__Group_5__1 )
            // InternalDataSampleDSL.g:2028:2: rule__ChildrenGenerator__Group_5__0__Impl rule__ChildrenGenerator__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_8);
            rule__ChildrenGenerator__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__ChildrenGenerator__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChildrenGenerator__Group_5__0"


    // $ANTLR start "rule__ChildrenGenerator__Group_5__0__Impl"
    // InternalDataSampleDSL.g:2035:1: rule__ChildrenGenerator__Group_5__0__Impl : ( 'cardinality' ) ;
    public final void rule__ChildrenGenerator__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:2039:1: ( ( 'cardinality' ) )
            // InternalDataSampleDSL.g:2040:1: ( 'cardinality' )
            {
            // InternalDataSampleDSL.g:2040:1: ( 'cardinality' )
            // InternalDataSampleDSL.g:2041:1: 'cardinality'
            {
             before(grammarAccess.getChildrenGeneratorAccess().getCardinalityKeyword_5_0()); 
            match(input,28,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getChildrenGeneratorAccess().getCardinalityKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChildrenGenerator__Group_5__0__Impl"


    // $ANTLR start "rule__ChildrenGenerator__Group_5__1"
    // InternalDataSampleDSL.g:2054:1: rule__ChildrenGenerator__Group_5__1 : rule__ChildrenGenerator__Group_5__1__Impl ;
    public final void rule__ChildrenGenerator__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:2058:1: ( rule__ChildrenGenerator__Group_5__1__Impl )
            // InternalDataSampleDSL.g:2059:2: rule__ChildrenGenerator__Group_5__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ChildrenGenerator__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChildrenGenerator__Group_5__1"


    // $ANTLR start "rule__ChildrenGenerator__Group_5__1__Impl"
    // InternalDataSampleDSL.g:2065:1: rule__ChildrenGenerator__Group_5__1__Impl : ( ( rule__ChildrenGenerator__NumberAssignment_5_1 ) ) ;
    public final void rule__ChildrenGenerator__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:2069:1: ( ( ( rule__ChildrenGenerator__NumberAssignment_5_1 ) ) )
            // InternalDataSampleDSL.g:2070:1: ( ( rule__ChildrenGenerator__NumberAssignment_5_1 ) )
            {
            // InternalDataSampleDSL.g:2070:1: ( ( rule__ChildrenGenerator__NumberAssignment_5_1 ) )
            // InternalDataSampleDSL.g:2071:1: ( rule__ChildrenGenerator__NumberAssignment_5_1 )
            {
             before(grammarAccess.getChildrenGeneratorAccess().getNumberAssignment_5_1()); 
            // InternalDataSampleDSL.g:2072:1: ( rule__ChildrenGenerator__NumberAssignment_5_1 )
            // InternalDataSampleDSL.g:2072:2: rule__ChildrenGenerator__NumberAssignment_5_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ChildrenGenerator__NumberAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getChildrenGeneratorAccess().getNumberAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChildrenGenerator__Group_5__1__Impl"


    // $ANTLR start "rule__ChildrenGenerator__Group_6__0"
    // InternalDataSampleDSL.g:2086:1: rule__ChildrenGenerator__Group_6__0 : rule__ChildrenGenerator__Group_6__0__Impl rule__ChildrenGenerator__Group_6__1 ;
    public final void rule__ChildrenGenerator__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:2090:1: ( rule__ChildrenGenerator__Group_6__0__Impl rule__ChildrenGenerator__Group_6__1 )
            // InternalDataSampleDSL.g:2091:2: rule__ChildrenGenerator__Group_6__0__Impl rule__ChildrenGenerator__Group_6__1
            {
            pushFollow(FollowSets000.FOLLOW_22);
            rule__ChildrenGenerator__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__ChildrenGenerator__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChildrenGenerator__Group_6__0"


    // $ANTLR start "rule__ChildrenGenerator__Group_6__0__Impl"
    // InternalDataSampleDSL.g:2098:1: rule__ChildrenGenerator__Group_6__0__Impl : ( '(' ) ;
    public final void rule__ChildrenGenerator__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:2102:1: ( ( '(' ) )
            // InternalDataSampleDSL.g:2103:1: ( '(' )
            {
            // InternalDataSampleDSL.g:2103:1: ( '(' )
            // InternalDataSampleDSL.g:2104:1: '('
            {
             before(grammarAccess.getChildrenGeneratorAccess().getLeftParenthesisKeyword_6_0()); 
            match(input,29,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getChildrenGeneratorAccess().getLeftParenthesisKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChildrenGenerator__Group_6__0__Impl"


    // $ANTLR start "rule__ChildrenGenerator__Group_6__1"
    // InternalDataSampleDSL.g:2117:1: rule__ChildrenGenerator__Group_6__1 : rule__ChildrenGenerator__Group_6__1__Impl rule__ChildrenGenerator__Group_6__2 ;
    public final void rule__ChildrenGenerator__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:2121:1: ( rule__ChildrenGenerator__Group_6__1__Impl rule__ChildrenGenerator__Group_6__2 )
            // InternalDataSampleDSL.g:2122:2: rule__ChildrenGenerator__Group_6__1__Impl rule__ChildrenGenerator__Group_6__2
            {
            pushFollow(FollowSets000.FOLLOW_23);
            rule__ChildrenGenerator__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__ChildrenGenerator__Group_6__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChildrenGenerator__Group_6__1"


    // $ANTLR start "rule__ChildrenGenerator__Group_6__1__Impl"
    // InternalDataSampleDSL.g:2129:1: rule__ChildrenGenerator__Group_6__1__Impl : ( ( rule__ChildrenGenerator__ParametersAssignment_6_1 ) ) ;
    public final void rule__ChildrenGenerator__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:2133:1: ( ( ( rule__ChildrenGenerator__ParametersAssignment_6_1 ) ) )
            // InternalDataSampleDSL.g:2134:1: ( ( rule__ChildrenGenerator__ParametersAssignment_6_1 ) )
            {
            // InternalDataSampleDSL.g:2134:1: ( ( rule__ChildrenGenerator__ParametersAssignment_6_1 ) )
            // InternalDataSampleDSL.g:2135:1: ( rule__ChildrenGenerator__ParametersAssignment_6_1 )
            {
             before(grammarAccess.getChildrenGeneratorAccess().getParametersAssignment_6_1()); 
            // InternalDataSampleDSL.g:2136:1: ( rule__ChildrenGenerator__ParametersAssignment_6_1 )
            // InternalDataSampleDSL.g:2136:2: rule__ChildrenGenerator__ParametersAssignment_6_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ChildrenGenerator__ParametersAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getChildrenGeneratorAccess().getParametersAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChildrenGenerator__Group_6__1__Impl"


    // $ANTLR start "rule__ChildrenGenerator__Group_6__2"
    // InternalDataSampleDSL.g:2146:1: rule__ChildrenGenerator__Group_6__2 : rule__ChildrenGenerator__Group_6__2__Impl rule__ChildrenGenerator__Group_6__3 ;
    public final void rule__ChildrenGenerator__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:2150:1: ( rule__ChildrenGenerator__Group_6__2__Impl rule__ChildrenGenerator__Group_6__3 )
            // InternalDataSampleDSL.g:2151:2: rule__ChildrenGenerator__Group_6__2__Impl rule__ChildrenGenerator__Group_6__3
            {
            pushFollow(FollowSets000.FOLLOW_23);
            rule__ChildrenGenerator__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__ChildrenGenerator__Group_6__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChildrenGenerator__Group_6__2"


    // $ANTLR start "rule__ChildrenGenerator__Group_6__2__Impl"
    // InternalDataSampleDSL.g:2158:1: rule__ChildrenGenerator__Group_6__2__Impl : ( ( rule__ChildrenGenerator__Group_6_2__0 )* ) ;
    public final void rule__ChildrenGenerator__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:2162:1: ( ( ( rule__ChildrenGenerator__Group_6_2__0 )* ) )
            // InternalDataSampleDSL.g:2163:1: ( ( rule__ChildrenGenerator__Group_6_2__0 )* )
            {
            // InternalDataSampleDSL.g:2163:1: ( ( rule__ChildrenGenerator__Group_6_2__0 )* )
            // InternalDataSampleDSL.g:2164:1: ( rule__ChildrenGenerator__Group_6_2__0 )*
            {
             before(grammarAccess.getChildrenGeneratorAccess().getGroup_6_2()); 
            // InternalDataSampleDSL.g:2165:1: ( rule__ChildrenGenerator__Group_6_2__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==31) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalDataSampleDSL.g:2165:2: rule__ChildrenGenerator__Group_6_2__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_24);
            	    rule__ChildrenGenerator__Group_6_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getChildrenGeneratorAccess().getGroup_6_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChildrenGenerator__Group_6__2__Impl"


    // $ANTLR start "rule__ChildrenGenerator__Group_6__3"
    // InternalDataSampleDSL.g:2175:1: rule__ChildrenGenerator__Group_6__3 : rule__ChildrenGenerator__Group_6__3__Impl ;
    public final void rule__ChildrenGenerator__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:2179:1: ( rule__ChildrenGenerator__Group_6__3__Impl )
            // InternalDataSampleDSL.g:2180:2: rule__ChildrenGenerator__Group_6__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ChildrenGenerator__Group_6__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChildrenGenerator__Group_6__3"


    // $ANTLR start "rule__ChildrenGenerator__Group_6__3__Impl"
    // InternalDataSampleDSL.g:2186:1: rule__ChildrenGenerator__Group_6__3__Impl : ( ')' ) ;
    public final void rule__ChildrenGenerator__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:2190:1: ( ( ')' ) )
            // InternalDataSampleDSL.g:2191:1: ( ')' )
            {
            // InternalDataSampleDSL.g:2191:1: ( ')' )
            // InternalDataSampleDSL.g:2192:1: ')'
            {
             before(grammarAccess.getChildrenGeneratorAccess().getRightParenthesisKeyword_6_3()); 
            match(input,30,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getChildrenGeneratorAccess().getRightParenthesisKeyword_6_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChildrenGenerator__Group_6__3__Impl"


    // $ANTLR start "rule__ChildrenGenerator__Group_6_2__0"
    // InternalDataSampleDSL.g:2213:1: rule__ChildrenGenerator__Group_6_2__0 : rule__ChildrenGenerator__Group_6_2__0__Impl rule__ChildrenGenerator__Group_6_2__1 ;
    public final void rule__ChildrenGenerator__Group_6_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:2217:1: ( rule__ChildrenGenerator__Group_6_2__0__Impl rule__ChildrenGenerator__Group_6_2__1 )
            // InternalDataSampleDSL.g:2218:2: rule__ChildrenGenerator__Group_6_2__0__Impl rule__ChildrenGenerator__Group_6_2__1
            {
            pushFollow(FollowSets000.FOLLOW_22);
            rule__ChildrenGenerator__Group_6_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__ChildrenGenerator__Group_6_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChildrenGenerator__Group_6_2__0"


    // $ANTLR start "rule__ChildrenGenerator__Group_6_2__0__Impl"
    // InternalDataSampleDSL.g:2225:1: rule__ChildrenGenerator__Group_6_2__0__Impl : ( ',' ) ;
    public final void rule__ChildrenGenerator__Group_6_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:2229:1: ( ( ',' ) )
            // InternalDataSampleDSL.g:2230:1: ( ',' )
            {
            // InternalDataSampleDSL.g:2230:1: ( ',' )
            // InternalDataSampleDSL.g:2231:1: ','
            {
             before(grammarAccess.getChildrenGeneratorAccess().getCommaKeyword_6_2_0()); 
            match(input,31,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getChildrenGeneratorAccess().getCommaKeyword_6_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChildrenGenerator__Group_6_2__0__Impl"


    // $ANTLR start "rule__ChildrenGenerator__Group_6_2__1"
    // InternalDataSampleDSL.g:2244:1: rule__ChildrenGenerator__Group_6_2__1 : rule__ChildrenGenerator__Group_6_2__1__Impl ;
    public final void rule__ChildrenGenerator__Group_6_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:2248:1: ( rule__ChildrenGenerator__Group_6_2__1__Impl )
            // InternalDataSampleDSL.g:2249:2: rule__ChildrenGenerator__Group_6_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ChildrenGenerator__Group_6_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChildrenGenerator__Group_6_2__1"


    // $ANTLR start "rule__ChildrenGenerator__Group_6_2__1__Impl"
    // InternalDataSampleDSL.g:2255:1: rule__ChildrenGenerator__Group_6_2__1__Impl : ( ( rule__ChildrenGenerator__ParametersAssignment_6_2_1 ) ) ;
    public final void rule__ChildrenGenerator__Group_6_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:2259:1: ( ( ( rule__ChildrenGenerator__ParametersAssignment_6_2_1 ) ) )
            // InternalDataSampleDSL.g:2260:1: ( ( rule__ChildrenGenerator__ParametersAssignment_6_2_1 ) )
            {
            // InternalDataSampleDSL.g:2260:1: ( ( rule__ChildrenGenerator__ParametersAssignment_6_2_1 ) )
            // InternalDataSampleDSL.g:2261:1: ( rule__ChildrenGenerator__ParametersAssignment_6_2_1 )
            {
             before(grammarAccess.getChildrenGeneratorAccess().getParametersAssignment_6_2_1()); 
            // InternalDataSampleDSL.g:2262:1: ( rule__ChildrenGenerator__ParametersAssignment_6_2_1 )
            // InternalDataSampleDSL.g:2262:2: rule__ChildrenGenerator__ParametersAssignment_6_2_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ChildrenGenerator__ParametersAssignment_6_2_1();

            state._fsp--;


            }

             after(grammarAccess.getChildrenGeneratorAccess().getParametersAssignment_6_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChildrenGenerator__Group_6_2__1__Impl"


    // $ANTLR start "rule__ChildrenGenerator__Group_7__0"
    // InternalDataSampleDSL.g:2276:1: rule__ChildrenGenerator__Group_7__0 : rule__ChildrenGenerator__Group_7__0__Impl rule__ChildrenGenerator__Group_7__1 ;
    public final void rule__ChildrenGenerator__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:2280:1: ( rule__ChildrenGenerator__Group_7__0__Impl rule__ChildrenGenerator__Group_7__1 )
            // InternalDataSampleDSL.g:2281:2: rule__ChildrenGenerator__Group_7__0__Impl rule__ChildrenGenerator__Group_7__1
            {
            pushFollow(FollowSets000.FOLLOW_8);
            rule__ChildrenGenerator__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__ChildrenGenerator__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChildrenGenerator__Group_7__0"


    // $ANTLR start "rule__ChildrenGenerator__Group_7__0__Impl"
    // InternalDataSampleDSL.g:2288:1: rule__ChildrenGenerator__Group_7__0__Impl : ( 'withErrorRate=' ) ;
    public final void rule__ChildrenGenerator__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:2292:1: ( ( 'withErrorRate=' ) )
            // InternalDataSampleDSL.g:2293:1: ( 'withErrorRate=' )
            {
            // InternalDataSampleDSL.g:2293:1: ( 'withErrorRate=' )
            // InternalDataSampleDSL.g:2294:1: 'withErrorRate='
            {
             before(grammarAccess.getChildrenGeneratorAccess().getWithErrorRateKeyword_7_0()); 
            match(input,32,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getChildrenGeneratorAccess().getWithErrorRateKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChildrenGenerator__Group_7__0__Impl"


    // $ANTLR start "rule__ChildrenGenerator__Group_7__1"
    // InternalDataSampleDSL.g:2307:1: rule__ChildrenGenerator__Group_7__1 : rule__ChildrenGenerator__Group_7__1__Impl rule__ChildrenGenerator__Group_7__2 ;
    public final void rule__ChildrenGenerator__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:2311:1: ( rule__ChildrenGenerator__Group_7__1__Impl rule__ChildrenGenerator__Group_7__2 )
            // InternalDataSampleDSL.g:2312:2: rule__ChildrenGenerator__Group_7__1__Impl rule__ChildrenGenerator__Group_7__2
            {
            pushFollow(FollowSets000.FOLLOW_25);
            rule__ChildrenGenerator__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__ChildrenGenerator__Group_7__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChildrenGenerator__Group_7__1"


    // $ANTLR start "rule__ChildrenGenerator__Group_7__1__Impl"
    // InternalDataSampleDSL.g:2319:1: rule__ChildrenGenerator__Group_7__1__Impl : ( ( rule__ChildrenGenerator__ErrorRateAssignment_7_1 ) ) ;
    public final void rule__ChildrenGenerator__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:2323:1: ( ( ( rule__ChildrenGenerator__ErrorRateAssignment_7_1 ) ) )
            // InternalDataSampleDSL.g:2324:1: ( ( rule__ChildrenGenerator__ErrorRateAssignment_7_1 ) )
            {
            // InternalDataSampleDSL.g:2324:1: ( ( rule__ChildrenGenerator__ErrorRateAssignment_7_1 ) )
            // InternalDataSampleDSL.g:2325:1: ( rule__ChildrenGenerator__ErrorRateAssignment_7_1 )
            {
             before(grammarAccess.getChildrenGeneratorAccess().getErrorRateAssignment_7_1()); 
            // InternalDataSampleDSL.g:2326:1: ( rule__ChildrenGenerator__ErrorRateAssignment_7_1 )
            // InternalDataSampleDSL.g:2326:2: rule__ChildrenGenerator__ErrorRateAssignment_7_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ChildrenGenerator__ErrorRateAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getChildrenGeneratorAccess().getErrorRateAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChildrenGenerator__Group_7__1__Impl"


    // $ANTLR start "rule__ChildrenGenerator__Group_7__2"
    // InternalDataSampleDSL.g:2336:1: rule__ChildrenGenerator__Group_7__2 : rule__ChildrenGenerator__Group_7__2__Impl rule__ChildrenGenerator__Group_7__3 ;
    public final void rule__ChildrenGenerator__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:2340:1: ( rule__ChildrenGenerator__Group_7__2__Impl rule__ChildrenGenerator__Group_7__3 )
            // InternalDataSampleDSL.g:2341:2: rule__ChildrenGenerator__Group_7__2__Impl rule__ChildrenGenerator__Group_7__3
            {
            pushFollow(FollowSets000.FOLLOW_4);
            rule__ChildrenGenerator__Group_7__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__ChildrenGenerator__Group_7__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChildrenGenerator__Group_7__2"


    // $ANTLR start "rule__ChildrenGenerator__Group_7__2__Impl"
    // InternalDataSampleDSL.g:2348:1: rule__ChildrenGenerator__Group_7__2__Impl : ( 'generatedWith' ) ;
    public final void rule__ChildrenGenerator__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:2352:1: ( ( 'generatedWith' ) )
            // InternalDataSampleDSL.g:2353:1: ( 'generatedWith' )
            {
            // InternalDataSampleDSL.g:2353:1: ( 'generatedWith' )
            // InternalDataSampleDSL.g:2354:1: 'generatedWith'
            {
             before(grammarAccess.getChildrenGeneratorAccess().getGeneratedWithKeyword_7_2()); 
            match(input,33,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getChildrenGeneratorAccess().getGeneratedWithKeyword_7_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChildrenGenerator__Group_7__2__Impl"


    // $ANTLR start "rule__ChildrenGenerator__Group_7__3"
    // InternalDataSampleDSL.g:2367:1: rule__ChildrenGenerator__Group_7__3 : rule__ChildrenGenerator__Group_7__3__Impl ;
    public final void rule__ChildrenGenerator__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:2371:1: ( rule__ChildrenGenerator__Group_7__3__Impl )
            // InternalDataSampleDSL.g:2372:2: rule__ChildrenGenerator__Group_7__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ChildrenGenerator__Group_7__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChildrenGenerator__Group_7__3"


    // $ANTLR start "rule__ChildrenGenerator__Group_7__3__Impl"
    // InternalDataSampleDSL.g:2378:1: rule__ChildrenGenerator__Group_7__3__Impl : ( ( rule__ChildrenGenerator__ErrorGeneratorNameAssignment_7_3 ) ) ;
    public final void rule__ChildrenGenerator__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:2382:1: ( ( ( rule__ChildrenGenerator__ErrorGeneratorNameAssignment_7_3 ) ) )
            // InternalDataSampleDSL.g:2383:1: ( ( rule__ChildrenGenerator__ErrorGeneratorNameAssignment_7_3 ) )
            {
            // InternalDataSampleDSL.g:2383:1: ( ( rule__ChildrenGenerator__ErrorGeneratorNameAssignment_7_3 ) )
            // InternalDataSampleDSL.g:2384:1: ( rule__ChildrenGenerator__ErrorGeneratorNameAssignment_7_3 )
            {
             before(grammarAccess.getChildrenGeneratorAccess().getErrorGeneratorNameAssignment_7_3()); 
            // InternalDataSampleDSL.g:2385:1: ( rule__ChildrenGenerator__ErrorGeneratorNameAssignment_7_3 )
            // InternalDataSampleDSL.g:2385:2: rule__ChildrenGenerator__ErrorGeneratorNameAssignment_7_3
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ChildrenGenerator__ErrorGeneratorNameAssignment_7_3();

            state._fsp--;


            }

             after(grammarAccess.getChildrenGeneratorAccess().getErrorGeneratorNameAssignment_7_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChildrenGenerator__Group_7__3__Impl"


    // $ANTLR start "rule__AssociationGenerator__Group__0"
    // InternalDataSampleDSL.g:2403:1: rule__AssociationGenerator__Group__0 : rule__AssociationGenerator__Group__0__Impl rule__AssociationGenerator__Group__1 ;
    public final void rule__AssociationGenerator__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:2407:1: ( rule__AssociationGenerator__Group__0__Impl rule__AssociationGenerator__Group__1 )
            // InternalDataSampleDSL.g:2408:2: rule__AssociationGenerator__Group__0__Impl rule__AssociationGenerator__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_27);
            rule__AssociationGenerator__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__AssociationGenerator__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationGenerator__Group__0"


    // $ANTLR start "rule__AssociationGenerator__Group__0__Impl"
    // InternalDataSampleDSL.g:2415:1: rule__AssociationGenerator__Group__0__Impl : ( () ) ;
    public final void rule__AssociationGenerator__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:2419:1: ( ( () ) )
            // InternalDataSampleDSL.g:2420:1: ( () )
            {
            // InternalDataSampleDSL.g:2420:1: ( () )
            // InternalDataSampleDSL.g:2421:1: ()
            {
             before(grammarAccess.getAssociationGeneratorAccess().getAssociationGeneratorAction_0()); 
            // InternalDataSampleDSL.g:2422:1: ()
            // InternalDataSampleDSL.g:2424:1: 
            {
            }

             after(grammarAccess.getAssociationGeneratorAccess().getAssociationGeneratorAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationGenerator__Group__0__Impl"


    // $ANTLR start "rule__AssociationGenerator__Group__1"
    // InternalDataSampleDSL.g:2434:1: rule__AssociationGenerator__Group__1 : rule__AssociationGenerator__Group__1__Impl rule__AssociationGenerator__Group__2 ;
    public final void rule__AssociationGenerator__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:2438:1: ( rule__AssociationGenerator__Group__1__Impl rule__AssociationGenerator__Group__2 )
            // InternalDataSampleDSL.g:2439:2: rule__AssociationGenerator__Group__1__Impl rule__AssociationGenerator__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_4);
            rule__AssociationGenerator__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__AssociationGenerator__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationGenerator__Group__1"


    // $ANTLR start "rule__AssociationGenerator__Group__1__Impl"
    // InternalDataSampleDSL.g:2446:1: rule__AssociationGenerator__Group__1__Impl : ( 'forTheAssociation' ) ;
    public final void rule__AssociationGenerator__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:2450:1: ( ( 'forTheAssociation' ) )
            // InternalDataSampleDSL.g:2451:1: ( 'forTheAssociation' )
            {
            // InternalDataSampleDSL.g:2451:1: ( 'forTheAssociation' )
            // InternalDataSampleDSL.g:2452:1: 'forTheAssociation'
            {
             before(grammarAccess.getAssociationGeneratorAccess().getForTheAssociationKeyword_1()); 
            match(input,35,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getAssociationGeneratorAccess().getForTheAssociationKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationGenerator__Group__1__Impl"


    // $ANTLR start "rule__AssociationGenerator__Group__2"
    // InternalDataSampleDSL.g:2465:1: rule__AssociationGenerator__Group__2 : rule__AssociationGenerator__Group__2__Impl rule__AssociationGenerator__Group__3 ;
    public final void rule__AssociationGenerator__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:2469:1: ( rule__AssociationGenerator__Group__2__Impl rule__AssociationGenerator__Group__3 )
            // InternalDataSampleDSL.g:2470:2: rule__AssociationGenerator__Group__2__Impl rule__AssociationGenerator__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_20);
            rule__AssociationGenerator__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__AssociationGenerator__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationGenerator__Group__2"


    // $ANTLR start "rule__AssociationGenerator__Group__2__Impl"
    // InternalDataSampleDSL.g:2477:1: rule__AssociationGenerator__Group__2__Impl : ( ( rule__AssociationGenerator__FieldNameAssignment_2 ) ) ;
    public final void rule__AssociationGenerator__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:2481:1: ( ( ( rule__AssociationGenerator__FieldNameAssignment_2 ) ) )
            // InternalDataSampleDSL.g:2482:1: ( ( rule__AssociationGenerator__FieldNameAssignment_2 ) )
            {
            // InternalDataSampleDSL.g:2482:1: ( ( rule__AssociationGenerator__FieldNameAssignment_2 ) )
            // InternalDataSampleDSL.g:2483:1: ( rule__AssociationGenerator__FieldNameAssignment_2 )
            {
             before(grammarAccess.getAssociationGeneratorAccess().getFieldNameAssignment_2()); 
            // InternalDataSampleDSL.g:2484:1: ( rule__AssociationGenerator__FieldNameAssignment_2 )
            // InternalDataSampleDSL.g:2484:2: rule__AssociationGenerator__FieldNameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AssociationGenerator__FieldNameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAssociationGeneratorAccess().getFieldNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationGenerator__Group__2__Impl"


    // $ANTLR start "rule__AssociationGenerator__Group__3"
    // InternalDataSampleDSL.g:2494:1: rule__AssociationGenerator__Group__3 : rule__AssociationGenerator__Group__3__Impl rule__AssociationGenerator__Group__4 ;
    public final void rule__AssociationGenerator__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:2498:1: ( rule__AssociationGenerator__Group__3__Impl rule__AssociationGenerator__Group__4 )
            // InternalDataSampleDSL.g:2499:2: rule__AssociationGenerator__Group__3__Impl rule__AssociationGenerator__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_4);
            rule__AssociationGenerator__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__AssociationGenerator__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationGenerator__Group__3"


    // $ANTLR start "rule__AssociationGenerator__Group__3__Impl"
    // InternalDataSampleDSL.g:2506:1: rule__AssociationGenerator__Group__3__Impl : ( 'use' ) ;
    public final void rule__AssociationGenerator__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:2510:1: ( ( 'use' ) )
            // InternalDataSampleDSL.g:2511:1: ( 'use' )
            {
            // InternalDataSampleDSL.g:2511:1: ( 'use' )
            // InternalDataSampleDSL.g:2512:1: 'use'
            {
             before(grammarAccess.getAssociationGeneratorAccess().getUseKeyword_3()); 
            match(input,27,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getAssociationGeneratorAccess().getUseKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationGenerator__Group__3__Impl"


    // $ANTLR start "rule__AssociationGenerator__Group__4"
    // InternalDataSampleDSL.g:2525:1: rule__AssociationGenerator__Group__4 : rule__AssociationGenerator__Group__4__Impl rule__AssociationGenerator__Group__5 ;
    public final void rule__AssociationGenerator__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:2529:1: ( rule__AssociationGenerator__Group__4__Impl rule__AssociationGenerator__Group__5 )
            // InternalDataSampleDSL.g:2530:2: rule__AssociationGenerator__Group__4__Impl rule__AssociationGenerator__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_21);
            rule__AssociationGenerator__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__AssociationGenerator__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationGenerator__Group__4"


    // $ANTLR start "rule__AssociationGenerator__Group__4__Impl"
    // InternalDataSampleDSL.g:2537:1: rule__AssociationGenerator__Group__4__Impl : ( ( rule__AssociationGenerator__GeneratorNameAssignment_4 ) ) ;
    public final void rule__AssociationGenerator__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:2541:1: ( ( ( rule__AssociationGenerator__GeneratorNameAssignment_4 ) ) )
            // InternalDataSampleDSL.g:2542:1: ( ( rule__AssociationGenerator__GeneratorNameAssignment_4 ) )
            {
            // InternalDataSampleDSL.g:2542:1: ( ( rule__AssociationGenerator__GeneratorNameAssignment_4 ) )
            // InternalDataSampleDSL.g:2543:1: ( rule__AssociationGenerator__GeneratorNameAssignment_4 )
            {
             before(grammarAccess.getAssociationGeneratorAccess().getGeneratorNameAssignment_4()); 
            // InternalDataSampleDSL.g:2544:1: ( rule__AssociationGenerator__GeneratorNameAssignment_4 )
            // InternalDataSampleDSL.g:2544:2: rule__AssociationGenerator__GeneratorNameAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AssociationGenerator__GeneratorNameAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getAssociationGeneratorAccess().getGeneratorNameAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationGenerator__Group__4__Impl"


    // $ANTLR start "rule__AssociationGenerator__Group__5"
    // InternalDataSampleDSL.g:2554:1: rule__AssociationGenerator__Group__5 : rule__AssociationGenerator__Group__5__Impl rule__AssociationGenerator__Group__6 ;
    public final void rule__AssociationGenerator__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:2558:1: ( rule__AssociationGenerator__Group__5__Impl rule__AssociationGenerator__Group__6 )
            // InternalDataSampleDSL.g:2559:2: rule__AssociationGenerator__Group__5__Impl rule__AssociationGenerator__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_21);
            rule__AssociationGenerator__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__AssociationGenerator__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationGenerator__Group__5"


    // $ANTLR start "rule__AssociationGenerator__Group__5__Impl"
    // InternalDataSampleDSL.g:2566:1: rule__AssociationGenerator__Group__5__Impl : ( ( rule__AssociationGenerator__Group_5__0 )? ) ;
    public final void rule__AssociationGenerator__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:2570:1: ( ( ( rule__AssociationGenerator__Group_5__0 )? ) )
            // InternalDataSampleDSL.g:2571:1: ( ( rule__AssociationGenerator__Group_5__0 )? )
            {
            // InternalDataSampleDSL.g:2571:1: ( ( rule__AssociationGenerator__Group_5__0 )? )
            // InternalDataSampleDSL.g:2572:1: ( rule__AssociationGenerator__Group_5__0 )?
            {
             before(grammarAccess.getAssociationGeneratorAccess().getGroup_5()); 
            // InternalDataSampleDSL.g:2573:1: ( rule__AssociationGenerator__Group_5__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==28) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalDataSampleDSL.g:2573:2: rule__AssociationGenerator__Group_5__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__AssociationGenerator__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAssociationGeneratorAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationGenerator__Group__5__Impl"


    // $ANTLR start "rule__AssociationGenerator__Group__6"
    // InternalDataSampleDSL.g:2583:1: rule__AssociationGenerator__Group__6 : rule__AssociationGenerator__Group__6__Impl rule__AssociationGenerator__Group__7 ;
    public final void rule__AssociationGenerator__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:2587:1: ( rule__AssociationGenerator__Group__6__Impl rule__AssociationGenerator__Group__7 )
            // InternalDataSampleDSL.g:2588:2: rule__AssociationGenerator__Group__6__Impl rule__AssociationGenerator__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_21);
            rule__AssociationGenerator__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__AssociationGenerator__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationGenerator__Group__6"


    // $ANTLR start "rule__AssociationGenerator__Group__6__Impl"
    // InternalDataSampleDSL.g:2595:1: rule__AssociationGenerator__Group__6__Impl : ( ( rule__AssociationGenerator__Group_6__0 )? ) ;
    public final void rule__AssociationGenerator__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:2599:1: ( ( ( rule__AssociationGenerator__Group_6__0 )? ) )
            // InternalDataSampleDSL.g:2600:1: ( ( rule__AssociationGenerator__Group_6__0 )? )
            {
            // InternalDataSampleDSL.g:2600:1: ( ( rule__AssociationGenerator__Group_6__0 )? )
            // InternalDataSampleDSL.g:2601:1: ( rule__AssociationGenerator__Group_6__0 )?
            {
             before(grammarAccess.getAssociationGeneratorAccess().getGroup_6()); 
            // InternalDataSampleDSL.g:2602:1: ( rule__AssociationGenerator__Group_6__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==29) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalDataSampleDSL.g:2602:2: rule__AssociationGenerator__Group_6__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__AssociationGenerator__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAssociationGeneratorAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationGenerator__Group__6__Impl"


    // $ANTLR start "rule__AssociationGenerator__Group__7"
    // InternalDataSampleDSL.g:2612:1: rule__AssociationGenerator__Group__7 : rule__AssociationGenerator__Group__7__Impl ;
    public final void rule__AssociationGenerator__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:2616:1: ( rule__AssociationGenerator__Group__7__Impl )
            // InternalDataSampleDSL.g:2617:2: rule__AssociationGenerator__Group__7__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AssociationGenerator__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationGenerator__Group__7"


    // $ANTLR start "rule__AssociationGenerator__Group__7__Impl"
    // InternalDataSampleDSL.g:2623:1: rule__AssociationGenerator__Group__7__Impl : ( ( rule__AssociationGenerator__Group_7__0 )? ) ;
    public final void rule__AssociationGenerator__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:2627:1: ( ( ( rule__AssociationGenerator__Group_7__0 )? ) )
            // InternalDataSampleDSL.g:2628:1: ( ( rule__AssociationGenerator__Group_7__0 )? )
            {
            // InternalDataSampleDSL.g:2628:1: ( ( rule__AssociationGenerator__Group_7__0 )? )
            // InternalDataSampleDSL.g:2629:1: ( rule__AssociationGenerator__Group_7__0 )?
            {
             before(grammarAccess.getAssociationGeneratorAccess().getGroup_7()); 
            // InternalDataSampleDSL.g:2630:1: ( rule__AssociationGenerator__Group_7__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==32) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalDataSampleDSL.g:2630:2: rule__AssociationGenerator__Group_7__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__AssociationGenerator__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAssociationGeneratorAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationGenerator__Group__7__Impl"


    // $ANTLR start "rule__AssociationGenerator__Group_5__0"
    // InternalDataSampleDSL.g:2656:1: rule__AssociationGenerator__Group_5__0 : rule__AssociationGenerator__Group_5__0__Impl rule__AssociationGenerator__Group_5__1 ;
    public final void rule__AssociationGenerator__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:2660:1: ( rule__AssociationGenerator__Group_5__0__Impl rule__AssociationGenerator__Group_5__1 )
            // InternalDataSampleDSL.g:2661:2: rule__AssociationGenerator__Group_5__0__Impl rule__AssociationGenerator__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_8);
            rule__AssociationGenerator__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__AssociationGenerator__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationGenerator__Group_5__0"


    // $ANTLR start "rule__AssociationGenerator__Group_5__0__Impl"
    // InternalDataSampleDSL.g:2668:1: rule__AssociationGenerator__Group_5__0__Impl : ( 'cardinality' ) ;
    public final void rule__AssociationGenerator__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:2672:1: ( ( 'cardinality' ) )
            // InternalDataSampleDSL.g:2673:1: ( 'cardinality' )
            {
            // InternalDataSampleDSL.g:2673:1: ( 'cardinality' )
            // InternalDataSampleDSL.g:2674:1: 'cardinality'
            {
             before(grammarAccess.getAssociationGeneratorAccess().getCardinalityKeyword_5_0()); 
            match(input,28,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getAssociationGeneratorAccess().getCardinalityKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationGenerator__Group_5__0__Impl"


    // $ANTLR start "rule__AssociationGenerator__Group_5__1"
    // InternalDataSampleDSL.g:2687:1: rule__AssociationGenerator__Group_5__1 : rule__AssociationGenerator__Group_5__1__Impl ;
    public final void rule__AssociationGenerator__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:2691:1: ( rule__AssociationGenerator__Group_5__1__Impl )
            // InternalDataSampleDSL.g:2692:2: rule__AssociationGenerator__Group_5__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AssociationGenerator__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationGenerator__Group_5__1"


    // $ANTLR start "rule__AssociationGenerator__Group_5__1__Impl"
    // InternalDataSampleDSL.g:2698:1: rule__AssociationGenerator__Group_5__1__Impl : ( ( rule__AssociationGenerator__NumberAssignment_5_1 ) ) ;
    public final void rule__AssociationGenerator__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:2702:1: ( ( ( rule__AssociationGenerator__NumberAssignment_5_1 ) ) )
            // InternalDataSampleDSL.g:2703:1: ( ( rule__AssociationGenerator__NumberAssignment_5_1 ) )
            {
            // InternalDataSampleDSL.g:2703:1: ( ( rule__AssociationGenerator__NumberAssignment_5_1 ) )
            // InternalDataSampleDSL.g:2704:1: ( rule__AssociationGenerator__NumberAssignment_5_1 )
            {
             before(grammarAccess.getAssociationGeneratorAccess().getNumberAssignment_5_1()); 
            // InternalDataSampleDSL.g:2705:1: ( rule__AssociationGenerator__NumberAssignment_5_1 )
            // InternalDataSampleDSL.g:2705:2: rule__AssociationGenerator__NumberAssignment_5_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AssociationGenerator__NumberAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getAssociationGeneratorAccess().getNumberAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationGenerator__Group_5__1__Impl"


    // $ANTLR start "rule__AssociationGenerator__Group_6__0"
    // InternalDataSampleDSL.g:2719:1: rule__AssociationGenerator__Group_6__0 : rule__AssociationGenerator__Group_6__0__Impl rule__AssociationGenerator__Group_6__1 ;
    public final void rule__AssociationGenerator__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:2723:1: ( rule__AssociationGenerator__Group_6__0__Impl rule__AssociationGenerator__Group_6__1 )
            // InternalDataSampleDSL.g:2724:2: rule__AssociationGenerator__Group_6__0__Impl rule__AssociationGenerator__Group_6__1
            {
            pushFollow(FollowSets000.FOLLOW_22);
            rule__AssociationGenerator__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__AssociationGenerator__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationGenerator__Group_6__0"


    // $ANTLR start "rule__AssociationGenerator__Group_6__0__Impl"
    // InternalDataSampleDSL.g:2731:1: rule__AssociationGenerator__Group_6__0__Impl : ( '(' ) ;
    public final void rule__AssociationGenerator__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:2735:1: ( ( '(' ) )
            // InternalDataSampleDSL.g:2736:1: ( '(' )
            {
            // InternalDataSampleDSL.g:2736:1: ( '(' )
            // InternalDataSampleDSL.g:2737:1: '('
            {
             before(grammarAccess.getAssociationGeneratorAccess().getLeftParenthesisKeyword_6_0()); 
            match(input,29,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getAssociationGeneratorAccess().getLeftParenthesisKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationGenerator__Group_6__0__Impl"


    // $ANTLR start "rule__AssociationGenerator__Group_6__1"
    // InternalDataSampleDSL.g:2750:1: rule__AssociationGenerator__Group_6__1 : rule__AssociationGenerator__Group_6__1__Impl rule__AssociationGenerator__Group_6__2 ;
    public final void rule__AssociationGenerator__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:2754:1: ( rule__AssociationGenerator__Group_6__1__Impl rule__AssociationGenerator__Group_6__2 )
            // InternalDataSampleDSL.g:2755:2: rule__AssociationGenerator__Group_6__1__Impl rule__AssociationGenerator__Group_6__2
            {
            pushFollow(FollowSets000.FOLLOW_23);
            rule__AssociationGenerator__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__AssociationGenerator__Group_6__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationGenerator__Group_6__1"


    // $ANTLR start "rule__AssociationGenerator__Group_6__1__Impl"
    // InternalDataSampleDSL.g:2762:1: rule__AssociationGenerator__Group_6__1__Impl : ( ( rule__AssociationGenerator__ParametersAssignment_6_1 ) ) ;
    public final void rule__AssociationGenerator__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:2766:1: ( ( ( rule__AssociationGenerator__ParametersAssignment_6_1 ) ) )
            // InternalDataSampleDSL.g:2767:1: ( ( rule__AssociationGenerator__ParametersAssignment_6_1 ) )
            {
            // InternalDataSampleDSL.g:2767:1: ( ( rule__AssociationGenerator__ParametersAssignment_6_1 ) )
            // InternalDataSampleDSL.g:2768:1: ( rule__AssociationGenerator__ParametersAssignment_6_1 )
            {
             before(grammarAccess.getAssociationGeneratorAccess().getParametersAssignment_6_1()); 
            // InternalDataSampleDSL.g:2769:1: ( rule__AssociationGenerator__ParametersAssignment_6_1 )
            // InternalDataSampleDSL.g:2769:2: rule__AssociationGenerator__ParametersAssignment_6_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AssociationGenerator__ParametersAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getAssociationGeneratorAccess().getParametersAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationGenerator__Group_6__1__Impl"


    // $ANTLR start "rule__AssociationGenerator__Group_6__2"
    // InternalDataSampleDSL.g:2779:1: rule__AssociationGenerator__Group_6__2 : rule__AssociationGenerator__Group_6__2__Impl rule__AssociationGenerator__Group_6__3 ;
    public final void rule__AssociationGenerator__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:2783:1: ( rule__AssociationGenerator__Group_6__2__Impl rule__AssociationGenerator__Group_6__3 )
            // InternalDataSampleDSL.g:2784:2: rule__AssociationGenerator__Group_6__2__Impl rule__AssociationGenerator__Group_6__3
            {
            pushFollow(FollowSets000.FOLLOW_23);
            rule__AssociationGenerator__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__AssociationGenerator__Group_6__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationGenerator__Group_6__2"


    // $ANTLR start "rule__AssociationGenerator__Group_6__2__Impl"
    // InternalDataSampleDSL.g:2791:1: rule__AssociationGenerator__Group_6__2__Impl : ( ( rule__AssociationGenerator__Group_6_2__0 )* ) ;
    public final void rule__AssociationGenerator__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:2795:1: ( ( ( rule__AssociationGenerator__Group_6_2__0 )* ) )
            // InternalDataSampleDSL.g:2796:1: ( ( rule__AssociationGenerator__Group_6_2__0 )* )
            {
            // InternalDataSampleDSL.g:2796:1: ( ( rule__AssociationGenerator__Group_6_2__0 )* )
            // InternalDataSampleDSL.g:2797:1: ( rule__AssociationGenerator__Group_6_2__0 )*
            {
             before(grammarAccess.getAssociationGeneratorAccess().getGroup_6_2()); 
            // InternalDataSampleDSL.g:2798:1: ( rule__AssociationGenerator__Group_6_2__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==31) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalDataSampleDSL.g:2798:2: rule__AssociationGenerator__Group_6_2__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_24);
            	    rule__AssociationGenerator__Group_6_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getAssociationGeneratorAccess().getGroup_6_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationGenerator__Group_6__2__Impl"


    // $ANTLR start "rule__AssociationGenerator__Group_6__3"
    // InternalDataSampleDSL.g:2808:1: rule__AssociationGenerator__Group_6__3 : rule__AssociationGenerator__Group_6__3__Impl ;
    public final void rule__AssociationGenerator__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:2812:1: ( rule__AssociationGenerator__Group_6__3__Impl )
            // InternalDataSampleDSL.g:2813:2: rule__AssociationGenerator__Group_6__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AssociationGenerator__Group_6__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationGenerator__Group_6__3"


    // $ANTLR start "rule__AssociationGenerator__Group_6__3__Impl"
    // InternalDataSampleDSL.g:2819:1: rule__AssociationGenerator__Group_6__3__Impl : ( ')' ) ;
    public final void rule__AssociationGenerator__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:2823:1: ( ( ')' ) )
            // InternalDataSampleDSL.g:2824:1: ( ')' )
            {
            // InternalDataSampleDSL.g:2824:1: ( ')' )
            // InternalDataSampleDSL.g:2825:1: ')'
            {
             before(grammarAccess.getAssociationGeneratorAccess().getRightParenthesisKeyword_6_3()); 
            match(input,30,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getAssociationGeneratorAccess().getRightParenthesisKeyword_6_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationGenerator__Group_6__3__Impl"


    // $ANTLR start "rule__AssociationGenerator__Group_6_2__0"
    // InternalDataSampleDSL.g:2846:1: rule__AssociationGenerator__Group_6_2__0 : rule__AssociationGenerator__Group_6_2__0__Impl rule__AssociationGenerator__Group_6_2__1 ;
    public final void rule__AssociationGenerator__Group_6_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:2850:1: ( rule__AssociationGenerator__Group_6_2__0__Impl rule__AssociationGenerator__Group_6_2__1 )
            // InternalDataSampleDSL.g:2851:2: rule__AssociationGenerator__Group_6_2__0__Impl rule__AssociationGenerator__Group_6_2__1
            {
            pushFollow(FollowSets000.FOLLOW_22);
            rule__AssociationGenerator__Group_6_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__AssociationGenerator__Group_6_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationGenerator__Group_6_2__0"


    // $ANTLR start "rule__AssociationGenerator__Group_6_2__0__Impl"
    // InternalDataSampleDSL.g:2858:1: rule__AssociationGenerator__Group_6_2__0__Impl : ( ',' ) ;
    public final void rule__AssociationGenerator__Group_6_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:2862:1: ( ( ',' ) )
            // InternalDataSampleDSL.g:2863:1: ( ',' )
            {
            // InternalDataSampleDSL.g:2863:1: ( ',' )
            // InternalDataSampleDSL.g:2864:1: ','
            {
             before(grammarAccess.getAssociationGeneratorAccess().getCommaKeyword_6_2_0()); 
            match(input,31,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getAssociationGeneratorAccess().getCommaKeyword_6_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationGenerator__Group_6_2__0__Impl"


    // $ANTLR start "rule__AssociationGenerator__Group_6_2__1"
    // InternalDataSampleDSL.g:2877:1: rule__AssociationGenerator__Group_6_2__1 : rule__AssociationGenerator__Group_6_2__1__Impl ;
    public final void rule__AssociationGenerator__Group_6_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:2881:1: ( rule__AssociationGenerator__Group_6_2__1__Impl )
            // InternalDataSampleDSL.g:2882:2: rule__AssociationGenerator__Group_6_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AssociationGenerator__Group_6_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationGenerator__Group_6_2__1"


    // $ANTLR start "rule__AssociationGenerator__Group_6_2__1__Impl"
    // InternalDataSampleDSL.g:2888:1: rule__AssociationGenerator__Group_6_2__1__Impl : ( ( rule__AssociationGenerator__ParametersAssignment_6_2_1 ) ) ;
    public final void rule__AssociationGenerator__Group_6_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:2892:1: ( ( ( rule__AssociationGenerator__ParametersAssignment_6_2_1 ) ) )
            // InternalDataSampleDSL.g:2893:1: ( ( rule__AssociationGenerator__ParametersAssignment_6_2_1 ) )
            {
            // InternalDataSampleDSL.g:2893:1: ( ( rule__AssociationGenerator__ParametersAssignment_6_2_1 ) )
            // InternalDataSampleDSL.g:2894:1: ( rule__AssociationGenerator__ParametersAssignment_6_2_1 )
            {
             before(grammarAccess.getAssociationGeneratorAccess().getParametersAssignment_6_2_1()); 
            // InternalDataSampleDSL.g:2895:1: ( rule__AssociationGenerator__ParametersAssignment_6_2_1 )
            // InternalDataSampleDSL.g:2895:2: rule__AssociationGenerator__ParametersAssignment_6_2_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AssociationGenerator__ParametersAssignment_6_2_1();

            state._fsp--;


            }

             after(grammarAccess.getAssociationGeneratorAccess().getParametersAssignment_6_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationGenerator__Group_6_2__1__Impl"


    // $ANTLR start "rule__AssociationGenerator__Group_7__0"
    // InternalDataSampleDSL.g:2909:1: rule__AssociationGenerator__Group_7__0 : rule__AssociationGenerator__Group_7__0__Impl rule__AssociationGenerator__Group_7__1 ;
    public final void rule__AssociationGenerator__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:2913:1: ( rule__AssociationGenerator__Group_7__0__Impl rule__AssociationGenerator__Group_7__1 )
            // InternalDataSampleDSL.g:2914:2: rule__AssociationGenerator__Group_7__0__Impl rule__AssociationGenerator__Group_7__1
            {
            pushFollow(FollowSets000.FOLLOW_8);
            rule__AssociationGenerator__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__AssociationGenerator__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationGenerator__Group_7__0"


    // $ANTLR start "rule__AssociationGenerator__Group_7__0__Impl"
    // InternalDataSampleDSL.g:2921:1: rule__AssociationGenerator__Group_7__0__Impl : ( 'withErrorRate=' ) ;
    public final void rule__AssociationGenerator__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:2925:1: ( ( 'withErrorRate=' ) )
            // InternalDataSampleDSL.g:2926:1: ( 'withErrorRate=' )
            {
            // InternalDataSampleDSL.g:2926:1: ( 'withErrorRate=' )
            // InternalDataSampleDSL.g:2927:1: 'withErrorRate='
            {
             before(grammarAccess.getAssociationGeneratorAccess().getWithErrorRateKeyword_7_0()); 
            match(input,32,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getAssociationGeneratorAccess().getWithErrorRateKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationGenerator__Group_7__0__Impl"


    // $ANTLR start "rule__AssociationGenerator__Group_7__1"
    // InternalDataSampleDSL.g:2940:1: rule__AssociationGenerator__Group_7__1 : rule__AssociationGenerator__Group_7__1__Impl rule__AssociationGenerator__Group_7__2 ;
    public final void rule__AssociationGenerator__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:2944:1: ( rule__AssociationGenerator__Group_7__1__Impl rule__AssociationGenerator__Group_7__2 )
            // InternalDataSampleDSL.g:2945:2: rule__AssociationGenerator__Group_7__1__Impl rule__AssociationGenerator__Group_7__2
            {
            pushFollow(FollowSets000.FOLLOW_25);
            rule__AssociationGenerator__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__AssociationGenerator__Group_7__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationGenerator__Group_7__1"


    // $ANTLR start "rule__AssociationGenerator__Group_7__1__Impl"
    // InternalDataSampleDSL.g:2952:1: rule__AssociationGenerator__Group_7__1__Impl : ( ( rule__AssociationGenerator__ErrorRateAssignment_7_1 ) ) ;
    public final void rule__AssociationGenerator__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:2956:1: ( ( ( rule__AssociationGenerator__ErrorRateAssignment_7_1 ) ) )
            // InternalDataSampleDSL.g:2957:1: ( ( rule__AssociationGenerator__ErrorRateAssignment_7_1 ) )
            {
            // InternalDataSampleDSL.g:2957:1: ( ( rule__AssociationGenerator__ErrorRateAssignment_7_1 ) )
            // InternalDataSampleDSL.g:2958:1: ( rule__AssociationGenerator__ErrorRateAssignment_7_1 )
            {
             before(grammarAccess.getAssociationGeneratorAccess().getErrorRateAssignment_7_1()); 
            // InternalDataSampleDSL.g:2959:1: ( rule__AssociationGenerator__ErrorRateAssignment_7_1 )
            // InternalDataSampleDSL.g:2959:2: rule__AssociationGenerator__ErrorRateAssignment_7_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AssociationGenerator__ErrorRateAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getAssociationGeneratorAccess().getErrorRateAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationGenerator__Group_7__1__Impl"


    // $ANTLR start "rule__AssociationGenerator__Group_7__2"
    // InternalDataSampleDSL.g:2969:1: rule__AssociationGenerator__Group_7__2 : rule__AssociationGenerator__Group_7__2__Impl rule__AssociationGenerator__Group_7__3 ;
    public final void rule__AssociationGenerator__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:2973:1: ( rule__AssociationGenerator__Group_7__2__Impl rule__AssociationGenerator__Group_7__3 )
            // InternalDataSampleDSL.g:2974:2: rule__AssociationGenerator__Group_7__2__Impl rule__AssociationGenerator__Group_7__3
            {
            pushFollow(FollowSets000.FOLLOW_4);
            rule__AssociationGenerator__Group_7__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__AssociationGenerator__Group_7__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationGenerator__Group_7__2"


    // $ANTLR start "rule__AssociationGenerator__Group_7__2__Impl"
    // InternalDataSampleDSL.g:2981:1: rule__AssociationGenerator__Group_7__2__Impl : ( 'generatedWith' ) ;
    public final void rule__AssociationGenerator__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:2985:1: ( ( 'generatedWith' ) )
            // InternalDataSampleDSL.g:2986:1: ( 'generatedWith' )
            {
            // InternalDataSampleDSL.g:2986:1: ( 'generatedWith' )
            // InternalDataSampleDSL.g:2987:1: 'generatedWith'
            {
             before(grammarAccess.getAssociationGeneratorAccess().getGeneratedWithKeyword_7_2()); 
            match(input,33,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getAssociationGeneratorAccess().getGeneratedWithKeyword_7_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationGenerator__Group_7__2__Impl"


    // $ANTLR start "rule__AssociationGenerator__Group_7__3"
    // InternalDataSampleDSL.g:3000:1: rule__AssociationGenerator__Group_7__3 : rule__AssociationGenerator__Group_7__3__Impl ;
    public final void rule__AssociationGenerator__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:3004:1: ( rule__AssociationGenerator__Group_7__3__Impl )
            // InternalDataSampleDSL.g:3005:2: rule__AssociationGenerator__Group_7__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AssociationGenerator__Group_7__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationGenerator__Group_7__3"


    // $ANTLR start "rule__AssociationGenerator__Group_7__3__Impl"
    // InternalDataSampleDSL.g:3011:1: rule__AssociationGenerator__Group_7__3__Impl : ( ( rule__AssociationGenerator__ErrorGeneratorNameAssignment_7_3 ) ) ;
    public final void rule__AssociationGenerator__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:3015:1: ( ( ( rule__AssociationGenerator__ErrorGeneratorNameAssignment_7_3 ) ) )
            // InternalDataSampleDSL.g:3016:1: ( ( rule__AssociationGenerator__ErrorGeneratorNameAssignment_7_3 ) )
            {
            // InternalDataSampleDSL.g:3016:1: ( ( rule__AssociationGenerator__ErrorGeneratorNameAssignment_7_3 ) )
            // InternalDataSampleDSL.g:3017:1: ( rule__AssociationGenerator__ErrorGeneratorNameAssignment_7_3 )
            {
             before(grammarAccess.getAssociationGeneratorAccess().getErrorGeneratorNameAssignment_7_3()); 
            // InternalDataSampleDSL.g:3018:1: ( rule__AssociationGenerator__ErrorGeneratorNameAssignment_7_3 )
            // InternalDataSampleDSL.g:3018:2: rule__AssociationGenerator__ErrorGeneratorNameAssignment_7_3
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AssociationGenerator__ErrorGeneratorNameAssignment_7_3();

            state._fsp--;


            }

             after(grammarAccess.getAssociationGeneratorAccess().getErrorGeneratorNameAssignment_7_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationGenerator__Group_7__3__Impl"


    // $ANTLR start "rule__Parameter__Group__0"
    // InternalDataSampleDSL.g:3036:1: rule__Parameter__Group__0 : rule__Parameter__Group__0__Impl rule__Parameter__Group__1 ;
    public final void rule__Parameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:3040:1: ( rule__Parameter__Group__0__Impl rule__Parameter__Group__1 )
            // InternalDataSampleDSL.g:3041:2: rule__Parameter__Group__0__Impl rule__Parameter__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_28);
            rule__Parameter__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Parameter__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__0"


    // $ANTLR start "rule__Parameter__Group__0__Impl"
    // InternalDataSampleDSL.g:3048:1: rule__Parameter__Group__0__Impl : ( ( rule__Parameter__NameAssignment_0 ) ) ;
    public final void rule__Parameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:3052:1: ( ( ( rule__Parameter__NameAssignment_0 ) ) )
            // InternalDataSampleDSL.g:3053:1: ( ( rule__Parameter__NameAssignment_0 ) )
            {
            // InternalDataSampleDSL.g:3053:1: ( ( rule__Parameter__NameAssignment_0 ) )
            // InternalDataSampleDSL.g:3054:1: ( rule__Parameter__NameAssignment_0 )
            {
             before(grammarAccess.getParameterAccess().getNameAssignment_0()); 
            // InternalDataSampleDSL.g:3055:1: ( rule__Parameter__NameAssignment_0 )
            // InternalDataSampleDSL.g:3055:2: rule__Parameter__NameAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Parameter__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__0__Impl"


    // $ANTLR start "rule__Parameter__Group__1"
    // InternalDataSampleDSL.g:3065:1: rule__Parameter__Group__1 : rule__Parameter__Group__1__Impl rule__Parameter__Group__2 ;
    public final void rule__Parameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:3069:1: ( rule__Parameter__Group__1__Impl rule__Parameter__Group__2 )
            // InternalDataSampleDSL.g:3070:2: rule__Parameter__Group__1__Impl rule__Parameter__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_4);
            rule__Parameter__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Parameter__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__1"


    // $ANTLR start "rule__Parameter__Group__1__Impl"
    // InternalDataSampleDSL.g:3077:1: rule__Parameter__Group__1__Impl : ( '=' ) ;
    public final void rule__Parameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:3081:1: ( ( '=' ) )
            // InternalDataSampleDSL.g:3082:1: ( '=' )
            {
            // InternalDataSampleDSL.g:3082:1: ( '=' )
            // InternalDataSampleDSL.g:3083:1: '='
            {
             before(grammarAccess.getParameterAccess().getEqualsSignKeyword_1()); 
            match(input,36,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getParameterAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__1__Impl"


    // $ANTLR start "rule__Parameter__Group__2"
    // InternalDataSampleDSL.g:3096:1: rule__Parameter__Group__2 : rule__Parameter__Group__2__Impl ;
    public final void rule__Parameter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:3100:1: ( rule__Parameter__Group__2__Impl )
            // InternalDataSampleDSL.g:3101:2: rule__Parameter__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Parameter__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__2"


    // $ANTLR start "rule__Parameter__Group__2__Impl"
    // InternalDataSampleDSL.g:3107:1: rule__Parameter__Group__2__Impl : ( ( rule__Parameter__ValueAssignment_2 ) ) ;
    public final void rule__Parameter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:3111:1: ( ( ( rule__Parameter__ValueAssignment_2 ) ) )
            // InternalDataSampleDSL.g:3112:1: ( ( rule__Parameter__ValueAssignment_2 ) )
            {
            // InternalDataSampleDSL.g:3112:1: ( ( rule__Parameter__ValueAssignment_2 ) )
            // InternalDataSampleDSL.g:3113:1: ( rule__Parameter__ValueAssignment_2 )
            {
             before(grammarAccess.getParameterAccess().getValueAssignment_2()); 
            // InternalDataSampleDSL.g:3114:1: ( rule__Parameter__ValueAssignment_2 )
            // InternalDataSampleDSL.g:3114:2: rule__Parameter__ValueAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Parameter__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__2__Impl"


    // $ANTLR start "rule__DataSample__NameAssignment_2"
    // InternalDataSampleDSL.g:3131:1: rule__DataSample__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__DataSample__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:3135:1: ( ( ruleEString ) )
            // InternalDataSampleDSL.g:3136:1: ( ruleEString )
            {
            // InternalDataSampleDSL.g:3136:1: ( ruleEString )
            // InternalDataSampleDSL.g:3137:1: ruleEString
            {
             before(grammarAccess.getDataSampleAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getDataSampleAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSample__NameAssignment_2"


    // $ANTLR start "rule__DataSample__PackageURIAssignment_4"
    // InternalDataSampleDSL.g:3146:1: rule__DataSample__PackageURIAssignment_4 : ( ruleEString ) ;
    public final void rule__DataSample__PackageURIAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:3150:1: ( ( ruleEString ) )
            // InternalDataSampleDSL.g:3151:1: ( ruleEString )
            {
            // InternalDataSampleDSL.g:3151:1: ( ruleEString )
            // InternalDataSampleDSL.g:3152:1: ruleEString
            {
             before(grammarAccess.getDataSampleAccess().getPackageURIEStringParserRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getDataSampleAccess().getPackageURIEStringParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSample__PackageURIAssignment_4"


    // $ANTLR start "rule__DataSample__RootEntityNameAssignment_6"
    // InternalDataSampleDSL.g:3161:1: rule__DataSample__RootEntityNameAssignment_6 : ( ruleEString ) ;
    public final void rule__DataSample__RootEntityNameAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:3165:1: ( ( ruleEString ) )
            // InternalDataSampleDSL.g:3166:1: ( ruleEString )
            {
            // InternalDataSampleDSL.g:3166:1: ( ruleEString )
            // InternalDataSampleDSL.g:3167:1: ruleEString
            {
             before(grammarAccess.getDataSampleAccess().getRootEntityNameEStringParserRuleCall_6_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getDataSampleAccess().getRootEntityNameEStringParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSample__RootEntityNameAssignment_6"


    // $ANTLR start "rule__DataSample__SeedAssignment_8"
    // InternalDataSampleDSL.g:3176:1: rule__DataSample__SeedAssignment_8 : ( ruleEInt ) ;
    public final void rule__DataSample__SeedAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:3180:1: ( ( ruleEInt ) )
            // InternalDataSampleDSL.g:3181:1: ( ruleEInt )
            {
            // InternalDataSampleDSL.g:3181:1: ( ruleEInt )
            // InternalDataSampleDSL.g:3182:1: ruleEInt
            {
             before(grammarAccess.getDataSampleAccess().getSeedEIntParserRuleCall_8_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getDataSampleAccess().getSeedEIntParserRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSample__SeedAssignment_8"


    // $ANTLR start "rule__DataSample__LanguageAssignment_10"
    // InternalDataSampleDSL.g:3191:1: rule__DataSample__LanguageAssignment_10 : ( ruleLanguage ) ;
    public final void rule__DataSample__LanguageAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:3195:1: ( ( ruleLanguage ) )
            // InternalDataSampleDSL.g:3196:1: ( ruleLanguage )
            {
            // InternalDataSampleDSL.g:3196:1: ( ruleLanguage )
            // InternalDataSampleDSL.g:3197:1: ruleLanguage
            {
             before(grammarAccess.getDataSampleAccess().getLanguageLanguageEnumRuleCall_10_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleLanguage();

            state._fsp--;

             after(grammarAccess.getDataSampleAccess().getLanguageLanguageEnumRuleCall_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSample__LanguageAssignment_10"


    // $ANTLR start "rule__DataSample__EntityGeneratorsAssignment_11"
    // InternalDataSampleDSL.g:3206:1: rule__DataSample__EntityGeneratorsAssignment_11 : ( ruleEntityGenerator ) ;
    public final void rule__DataSample__EntityGeneratorsAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:3210:1: ( ( ruleEntityGenerator ) )
            // InternalDataSampleDSL.g:3211:1: ( ruleEntityGenerator )
            {
            // InternalDataSampleDSL.g:3211:1: ( ruleEntityGenerator )
            // InternalDataSampleDSL.g:3212:1: ruleEntityGenerator
            {
             before(grammarAccess.getDataSampleAccess().getEntityGeneratorsEntityGeneratorParserRuleCall_11_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleEntityGenerator();

            state._fsp--;

             after(grammarAccess.getDataSampleAccess().getEntityGeneratorsEntityGeneratorParserRuleCall_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSample__EntityGeneratorsAssignment_11"


    // $ANTLR start "rule__EntityGenerator__NumberAssignment_2"
    // InternalDataSampleDSL.g:3221:1: rule__EntityGenerator__NumberAssignment_2 : ( ruleEInt ) ;
    public final void rule__EntityGenerator__NumberAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:3225:1: ( ( ruleEInt ) )
            // InternalDataSampleDSL.g:3226:1: ( ruleEInt )
            {
            // InternalDataSampleDSL.g:3226:1: ( ruleEInt )
            // InternalDataSampleDSL.g:3227:1: ruleEInt
            {
             before(grammarAccess.getEntityGeneratorAccess().getNumberEIntParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getEntityGeneratorAccess().getNumberEIntParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityGenerator__NumberAssignment_2"


    // $ANTLR start "rule__EntityGenerator__EntityNameAssignment_4"
    // InternalDataSampleDSL.g:3236:1: rule__EntityGenerator__EntityNameAssignment_4 : ( ruleEString ) ;
    public final void rule__EntityGenerator__EntityNameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:3240:1: ( ( ruleEString ) )
            // InternalDataSampleDSL.g:3241:1: ( ruleEString )
            {
            // InternalDataSampleDSL.g:3241:1: ( ruleEString )
            // InternalDataSampleDSL.g:3242:1: ruleEString
            {
             before(grammarAccess.getEntityGeneratorAccess().getEntityNameEStringParserRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEntityGeneratorAccess().getEntityNameEStringParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityGenerator__EntityNameAssignment_4"


    // $ANTLR start "rule__EntityGenerator__FieldGeneratorsAssignment_6"
    // InternalDataSampleDSL.g:3251:1: rule__EntityGenerator__FieldGeneratorsAssignment_6 : ( ruleFieldGenerator ) ;
    public final void rule__EntityGenerator__FieldGeneratorsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:3255:1: ( ( ruleFieldGenerator ) )
            // InternalDataSampleDSL.g:3256:1: ( ruleFieldGenerator )
            {
            // InternalDataSampleDSL.g:3256:1: ( ruleFieldGenerator )
            // InternalDataSampleDSL.g:3257:1: ruleFieldGenerator
            {
             before(grammarAccess.getEntityGeneratorAccess().getFieldGeneratorsFieldGeneratorParserRuleCall_6_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleFieldGenerator();

            state._fsp--;

             after(grammarAccess.getEntityGeneratorAccess().getFieldGeneratorsFieldGeneratorParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityGenerator__FieldGeneratorsAssignment_6"


    // $ANTLR start "rule__EntityGenerator__ChildGeneratorsAssignment_7"
    // InternalDataSampleDSL.g:3266:1: rule__EntityGenerator__ChildGeneratorsAssignment_7 : ( ruleChildrenGenerator ) ;
    public final void rule__EntityGenerator__ChildGeneratorsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:3270:1: ( ( ruleChildrenGenerator ) )
            // InternalDataSampleDSL.g:3271:1: ( ruleChildrenGenerator )
            {
            // InternalDataSampleDSL.g:3271:1: ( ruleChildrenGenerator )
            // InternalDataSampleDSL.g:3272:1: ruleChildrenGenerator
            {
             before(grammarAccess.getEntityGeneratorAccess().getChildGeneratorsChildrenGeneratorParserRuleCall_7_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleChildrenGenerator();

            state._fsp--;

             after(grammarAccess.getEntityGeneratorAccess().getChildGeneratorsChildrenGeneratorParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityGenerator__ChildGeneratorsAssignment_7"


    // $ANTLR start "rule__EntityGenerator__AssociationGeneratorsAssignment_8"
    // InternalDataSampleDSL.g:3281:1: rule__EntityGenerator__AssociationGeneratorsAssignment_8 : ( ruleAssociationGenerator ) ;
    public final void rule__EntityGenerator__AssociationGeneratorsAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:3285:1: ( ( ruleAssociationGenerator ) )
            // InternalDataSampleDSL.g:3286:1: ( ruleAssociationGenerator )
            {
            // InternalDataSampleDSL.g:3286:1: ( ruleAssociationGenerator )
            // InternalDataSampleDSL.g:3287:1: ruleAssociationGenerator
            {
             before(grammarAccess.getEntityGeneratorAccess().getAssociationGeneratorsAssociationGeneratorParserRuleCall_8_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleAssociationGenerator();

            state._fsp--;

             after(grammarAccess.getEntityGeneratorAccess().getAssociationGeneratorsAssociationGeneratorParserRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityGenerator__AssociationGeneratorsAssignment_8"


    // $ANTLR start "rule__FieldGenerator__FieldNameAssignment_2"
    // InternalDataSampleDSL.g:3296:1: rule__FieldGenerator__FieldNameAssignment_2 : ( ruleEString ) ;
    public final void rule__FieldGenerator__FieldNameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:3300:1: ( ( ruleEString ) )
            // InternalDataSampleDSL.g:3301:1: ( ruleEString )
            {
            // InternalDataSampleDSL.g:3301:1: ( ruleEString )
            // InternalDataSampleDSL.g:3302:1: ruleEString
            {
             before(grammarAccess.getFieldGeneratorAccess().getFieldNameEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getFieldGeneratorAccess().getFieldNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldGenerator__FieldNameAssignment_2"


    // $ANTLR start "rule__FieldGenerator__GeneratorNameAssignment_4"
    // InternalDataSampleDSL.g:3311:1: rule__FieldGenerator__GeneratorNameAssignment_4 : ( ruleEString ) ;
    public final void rule__FieldGenerator__GeneratorNameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:3315:1: ( ( ruleEString ) )
            // InternalDataSampleDSL.g:3316:1: ( ruleEString )
            {
            // InternalDataSampleDSL.g:3316:1: ( ruleEString )
            // InternalDataSampleDSL.g:3317:1: ruleEString
            {
             before(grammarAccess.getFieldGeneratorAccess().getGeneratorNameEStringParserRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getFieldGeneratorAccess().getGeneratorNameEStringParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldGenerator__GeneratorNameAssignment_4"


    // $ANTLR start "rule__FieldGenerator__NumberAssignment_5_1"
    // InternalDataSampleDSL.g:3326:1: rule__FieldGenerator__NumberAssignment_5_1 : ( ruleEInt ) ;
    public final void rule__FieldGenerator__NumberAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:3330:1: ( ( ruleEInt ) )
            // InternalDataSampleDSL.g:3331:1: ( ruleEInt )
            {
            // InternalDataSampleDSL.g:3331:1: ( ruleEInt )
            // InternalDataSampleDSL.g:3332:1: ruleEInt
            {
             before(grammarAccess.getFieldGeneratorAccess().getNumberEIntParserRuleCall_5_1_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getFieldGeneratorAccess().getNumberEIntParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldGenerator__NumberAssignment_5_1"


    // $ANTLR start "rule__FieldGenerator__ParametersAssignment_6_1"
    // InternalDataSampleDSL.g:3341:1: rule__FieldGenerator__ParametersAssignment_6_1 : ( ruleParameter ) ;
    public final void rule__FieldGenerator__ParametersAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:3345:1: ( ( ruleParameter ) )
            // InternalDataSampleDSL.g:3346:1: ( ruleParameter )
            {
            // InternalDataSampleDSL.g:3346:1: ( ruleParameter )
            // InternalDataSampleDSL.g:3347:1: ruleParameter
            {
             before(grammarAccess.getFieldGeneratorAccess().getParametersParameterParserRuleCall_6_1_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getFieldGeneratorAccess().getParametersParameterParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldGenerator__ParametersAssignment_6_1"


    // $ANTLR start "rule__FieldGenerator__ParametersAssignment_6_2_1"
    // InternalDataSampleDSL.g:3356:1: rule__FieldGenerator__ParametersAssignment_6_2_1 : ( ruleParameter ) ;
    public final void rule__FieldGenerator__ParametersAssignment_6_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:3360:1: ( ( ruleParameter ) )
            // InternalDataSampleDSL.g:3361:1: ( ruleParameter )
            {
            // InternalDataSampleDSL.g:3361:1: ( ruleParameter )
            // InternalDataSampleDSL.g:3362:1: ruleParameter
            {
             before(grammarAccess.getFieldGeneratorAccess().getParametersParameterParserRuleCall_6_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getFieldGeneratorAccess().getParametersParameterParserRuleCall_6_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldGenerator__ParametersAssignment_6_2_1"


    // $ANTLR start "rule__FieldGenerator__ErrorRateAssignment_7_1"
    // InternalDataSampleDSL.g:3371:1: rule__FieldGenerator__ErrorRateAssignment_7_1 : ( ruleEInt ) ;
    public final void rule__FieldGenerator__ErrorRateAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:3375:1: ( ( ruleEInt ) )
            // InternalDataSampleDSL.g:3376:1: ( ruleEInt )
            {
            // InternalDataSampleDSL.g:3376:1: ( ruleEInt )
            // InternalDataSampleDSL.g:3377:1: ruleEInt
            {
             before(grammarAccess.getFieldGeneratorAccess().getErrorRateEIntParserRuleCall_7_1_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getFieldGeneratorAccess().getErrorRateEIntParserRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldGenerator__ErrorRateAssignment_7_1"


    // $ANTLR start "rule__FieldGenerator__ErrorGeneratorNameAssignment_7_3"
    // InternalDataSampleDSL.g:3386:1: rule__FieldGenerator__ErrorGeneratorNameAssignment_7_3 : ( ruleEString ) ;
    public final void rule__FieldGenerator__ErrorGeneratorNameAssignment_7_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:3390:1: ( ( ruleEString ) )
            // InternalDataSampleDSL.g:3391:1: ( ruleEString )
            {
            // InternalDataSampleDSL.g:3391:1: ( ruleEString )
            // InternalDataSampleDSL.g:3392:1: ruleEString
            {
             before(grammarAccess.getFieldGeneratorAccess().getErrorGeneratorNameEStringParserRuleCall_7_3_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getFieldGeneratorAccess().getErrorGeneratorNameEStringParserRuleCall_7_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldGenerator__ErrorGeneratorNameAssignment_7_3"


    // $ANTLR start "rule__ChildrenGenerator__FieldNameAssignment_2"
    // InternalDataSampleDSL.g:3401:1: rule__ChildrenGenerator__FieldNameAssignment_2 : ( ruleEString ) ;
    public final void rule__ChildrenGenerator__FieldNameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:3405:1: ( ( ruleEString ) )
            // InternalDataSampleDSL.g:3406:1: ( ruleEString )
            {
            // InternalDataSampleDSL.g:3406:1: ( ruleEString )
            // InternalDataSampleDSL.g:3407:1: ruleEString
            {
             before(grammarAccess.getChildrenGeneratorAccess().getFieldNameEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getChildrenGeneratorAccess().getFieldNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChildrenGenerator__FieldNameAssignment_2"


    // $ANTLR start "rule__ChildrenGenerator__GeneratorNameAssignment_4"
    // InternalDataSampleDSL.g:3416:1: rule__ChildrenGenerator__GeneratorNameAssignment_4 : ( ruleEString ) ;
    public final void rule__ChildrenGenerator__GeneratorNameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:3420:1: ( ( ruleEString ) )
            // InternalDataSampleDSL.g:3421:1: ( ruleEString )
            {
            // InternalDataSampleDSL.g:3421:1: ( ruleEString )
            // InternalDataSampleDSL.g:3422:1: ruleEString
            {
             before(grammarAccess.getChildrenGeneratorAccess().getGeneratorNameEStringParserRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getChildrenGeneratorAccess().getGeneratorNameEStringParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChildrenGenerator__GeneratorNameAssignment_4"


    // $ANTLR start "rule__ChildrenGenerator__NumberAssignment_5_1"
    // InternalDataSampleDSL.g:3431:1: rule__ChildrenGenerator__NumberAssignment_5_1 : ( ruleEInt ) ;
    public final void rule__ChildrenGenerator__NumberAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:3435:1: ( ( ruleEInt ) )
            // InternalDataSampleDSL.g:3436:1: ( ruleEInt )
            {
            // InternalDataSampleDSL.g:3436:1: ( ruleEInt )
            // InternalDataSampleDSL.g:3437:1: ruleEInt
            {
             before(grammarAccess.getChildrenGeneratorAccess().getNumberEIntParserRuleCall_5_1_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getChildrenGeneratorAccess().getNumberEIntParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChildrenGenerator__NumberAssignment_5_1"


    // $ANTLR start "rule__ChildrenGenerator__ParametersAssignment_6_1"
    // InternalDataSampleDSL.g:3446:1: rule__ChildrenGenerator__ParametersAssignment_6_1 : ( ruleParameter ) ;
    public final void rule__ChildrenGenerator__ParametersAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:3450:1: ( ( ruleParameter ) )
            // InternalDataSampleDSL.g:3451:1: ( ruleParameter )
            {
            // InternalDataSampleDSL.g:3451:1: ( ruleParameter )
            // InternalDataSampleDSL.g:3452:1: ruleParameter
            {
             before(grammarAccess.getChildrenGeneratorAccess().getParametersParameterParserRuleCall_6_1_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getChildrenGeneratorAccess().getParametersParameterParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChildrenGenerator__ParametersAssignment_6_1"


    // $ANTLR start "rule__ChildrenGenerator__ParametersAssignment_6_2_1"
    // InternalDataSampleDSL.g:3461:1: rule__ChildrenGenerator__ParametersAssignment_6_2_1 : ( ruleParameter ) ;
    public final void rule__ChildrenGenerator__ParametersAssignment_6_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:3465:1: ( ( ruleParameter ) )
            // InternalDataSampleDSL.g:3466:1: ( ruleParameter )
            {
            // InternalDataSampleDSL.g:3466:1: ( ruleParameter )
            // InternalDataSampleDSL.g:3467:1: ruleParameter
            {
             before(grammarAccess.getChildrenGeneratorAccess().getParametersParameterParserRuleCall_6_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getChildrenGeneratorAccess().getParametersParameterParserRuleCall_6_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChildrenGenerator__ParametersAssignment_6_2_1"


    // $ANTLR start "rule__ChildrenGenerator__ErrorRateAssignment_7_1"
    // InternalDataSampleDSL.g:3476:1: rule__ChildrenGenerator__ErrorRateAssignment_7_1 : ( ruleEInt ) ;
    public final void rule__ChildrenGenerator__ErrorRateAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:3480:1: ( ( ruleEInt ) )
            // InternalDataSampleDSL.g:3481:1: ( ruleEInt )
            {
            // InternalDataSampleDSL.g:3481:1: ( ruleEInt )
            // InternalDataSampleDSL.g:3482:1: ruleEInt
            {
             before(grammarAccess.getChildrenGeneratorAccess().getErrorRateEIntParserRuleCall_7_1_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getChildrenGeneratorAccess().getErrorRateEIntParserRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChildrenGenerator__ErrorRateAssignment_7_1"


    // $ANTLR start "rule__ChildrenGenerator__ErrorGeneratorNameAssignment_7_3"
    // InternalDataSampleDSL.g:3491:1: rule__ChildrenGenerator__ErrorGeneratorNameAssignment_7_3 : ( ruleEString ) ;
    public final void rule__ChildrenGenerator__ErrorGeneratorNameAssignment_7_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:3495:1: ( ( ruleEString ) )
            // InternalDataSampleDSL.g:3496:1: ( ruleEString )
            {
            // InternalDataSampleDSL.g:3496:1: ( ruleEString )
            // InternalDataSampleDSL.g:3497:1: ruleEString
            {
             before(grammarAccess.getChildrenGeneratorAccess().getErrorGeneratorNameEStringParserRuleCall_7_3_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getChildrenGeneratorAccess().getErrorGeneratorNameEStringParserRuleCall_7_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChildrenGenerator__ErrorGeneratorNameAssignment_7_3"


    // $ANTLR start "rule__AssociationGenerator__FieldNameAssignment_2"
    // InternalDataSampleDSL.g:3506:1: rule__AssociationGenerator__FieldNameAssignment_2 : ( ruleEString ) ;
    public final void rule__AssociationGenerator__FieldNameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:3510:1: ( ( ruleEString ) )
            // InternalDataSampleDSL.g:3511:1: ( ruleEString )
            {
            // InternalDataSampleDSL.g:3511:1: ( ruleEString )
            // InternalDataSampleDSL.g:3512:1: ruleEString
            {
             before(grammarAccess.getAssociationGeneratorAccess().getFieldNameEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAssociationGeneratorAccess().getFieldNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationGenerator__FieldNameAssignment_2"


    // $ANTLR start "rule__AssociationGenerator__GeneratorNameAssignment_4"
    // InternalDataSampleDSL.g:3521:1: rule__AssociationGenerator__GeneratorNameAssignment_4 : ( ruleEString ) ;
    public final void rule__AssociationGenerator__GeneratorNameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:3525:1: ( ( ruleEString ) )
            // InternalDataSampleDSL.g:3526:1: ( ruleEString )
            {
            // InternalDataSampleDSL.g:3526:1: ( ruleEString )
            // InternalDataSampleDSL.g:3527:1: ruleEString
            {
             before(grammarAccess.getAssociationGeneratorAccess().getGeneratorNameEStringParserRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAssociationGeneratorAccess().getGeneratorNameEStringParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationGenerator__GeneratorNameAssignment_4"


    // $ANTLR start "rule__AssociationGenerator__NumberAssignment_5_1"
    // InternalDataSampleDSL.g:3536:1: rule__AssociationGenerator__NumberAssignment_5_1 : ( ruleEInt ) ;
    public final void rule__AssociationGenerator__NumberAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:3540:1: ( ( ruleEInt ) )
            // InternalDataSampleDSL.g:3541:1: ( ruleEInt )
            {
            // InternalDataSampleDSL.g:3541:1: ( ruleEInt )
            // InternalDataSampleDSL.g:3542:1: ruleEInt
            {
             before(grammarAccess.getAssociationGeneratorAccess().getNumberEIntParserRuleCall_5_1_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getAssociationGeneratorAccess().getNumberEIntParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationGenerator__NumberAssignment_5_1"


    // $ANTLR start "rule__AssociationGenerator__ParametersAssignment_6_1"
    // InternalDataSampleDSL.g:3551:1: rule__AssociationGenerator__ParametersAssignment_6_1 : ( ruleParameter ) ;
    public final void rule__AssociationGenerator__ParametersAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:3555:1: ( ( ruleParameter ) )
            // InternalDataSampleDSL.g:3556:1: ( ruleParameter )
            {
            // InternalDataSampleDSL.g:3556:1: ( ruleParameter )
            // InternalDataSampleDSL.g:3557:1: ruleParameter
            {
             before(grammarAccess.getAssociationGeneratorAccess().getParametersParameterParserRuleCall_6_1_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getAssociationGeneratorAccess().getParametersParameterParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationGenerator__ParametersAssignment_6_1"


    // $ANTLR start "rule__AssociationGenerator__ParametersAssignment_6_2_1"
    // InternalDataSampleDSL.g:3566:1: rule__AssociationGenerator__ParametersAssignment_6_2_1 : ( ruleParameter ) ;
    public final void rule__AssociationGenerator__ParametersAssignment_6_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:3570:1: ( ( ruleParameter ) )
            // InternalDataSampleDSL.g:3571:1: ( ruleParameter )
            {
            // InternalDataSampleDSL.g:3571:1: ( ruleParameter )
            // InternalDataSampleDSL.g:3572:1: ruleParameter
            {
             before(grammarAccess.getAssociationGeneratorAccess().getParametersParameterParserRuleCall_6_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getAssociationGeneratorAccess().getParametersParameterParserRuleCall_6_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationGenerator__ParametersAssignment_6_2_1"


    // $ANTLR start "rule__AssociationGenerator__ErrorRateAssignment_7_1"
    // InternalDataSampleDSL.g:3581:1: rule__AssociationGenerator__ErrorRateAssignment_7_1 : ( ruleEInt ) ;
    public final void rule__AssociationGenerator__ErrorRateAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:3585:1: ( ( ruleEInt ) )
            // InternalDataSampleDSL.g:3586:1: ( ruleEInt )
            {
            // InternalDataSampleDSL.g:3586:1: ( ruleEInt )
            // InternalDataSampleDSL.g:3587:1: ruleEInt
            {
             before(grammarAccess.getAssociationGeneratorAccess().getErrorRateEIntParserRuleCall_7_1_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getAssociationGeneratorAccess().getErrorRateEIntParserRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationGenerator__ErrorRateAssignment_7_1"


    // $ANTLR start "rule__AssociationGenerator__ErrorGeneratorNameAssignment_7_3"
    // InternalDataSampleDSL.g:3596:1: rule__AssociationGenerator__ErrorGeneratorNameAssignment_7_3 : ( ruleEString ) ;
    public final void rule__AssociationGenerator__ErrorGeneratorNameAssignment_7_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:3600:1: ( ( ruleEString ) )
            // InternalDataSampleDSL.g:3601:1: ( ruleEString )
            {
            // InternalDataSampleDSL.g:3601:1: ( ruleEString )
            // InternalDataSampleDSL.g:3602:1: ruleEString
            {
             before(grammarAccess.getAssociationGeneratorAccess().getErrorGeneratorNameEStringParserRuleCall_7_3_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAssociationGeneratorAccess().getErrorGeneratorNameEStringParserRuleCall_7_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationGenerator__ErrorGeneratorNameAssignment_7_3"


    // $ANTLR start "rule__Parameter__NameAssignment_0"
    // InternalDataSampleDSL.g:3611:1: rule__Parameter__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Parameter__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:3615:1: ( ( RULE_ID ) )
            // InternalDataSampleDSL.g:3616:1: ( RULE_ID )
            {
            // InternalDataSampleDSL.g:3616:1: ( RULE_ID )
            // InternalDataSampleDSL.g:3617:1: RULE_ID
            {
             before(grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__NameAssignment_0"


    // $ANTLR start "rule__Parameter__ValueAssignment_2"
    // InternalDataSampleDSL.g:3626:1: rule__Parameter__ValueAssignment_2 : ( ruleEString ) ;
    public final void rule__Parameter__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDataSampleDSL.g:3630:1: ( ( ruleEString ) )
            // InternalDataSampleDSL.g:3631:1: ( ruleEString )
            {
            // InternalDataSampleDSL.g:3631:1: ( ruleEString )
            // InternalDataSampleDSL.g:3632:1: ruleEString
            {
             before(grammarAccess.getParameterAccess().getValueEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getParameterAccess().getValueEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__ValueAssignment_2"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000200040L});
        public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x000000000000F800L});
        public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000400002L});
        public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000C06000000L});
        public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000004000002L});
        public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000400000002L});
        public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000800000002L});
        public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000130000000L});
        public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x00000000C0000000L});
        public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000080000002L});
        public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000001000000000L});
    }


}