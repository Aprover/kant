package it.unimi.xtext.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import it.unimi.xtext.services.KantGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalKantParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "'const'", "'fresh'", "'forall'", "':'", "','", "'function'", "'('", "')'", "'with'", "'->'", "'way'", "'='", "'{'", "'}'", "'property'", "'equals'", "'invert'", "'knowledge'", "'principal'", "'know'", "'['", "']'", "'...'", "'_'", "'.'", "'gen'", "'optionally'", "'alternatively'", "'or'", "'check'", "'should'", "'be'", "'equal'", "'linked'", "'authenticate'", "'randomized'", "'one'", "'?'", "'shared'", "'here'", "'only'", "'not'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__10=10;
    public static final int T__9=9;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=6;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=7;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=8;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalKantParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalKantParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalKantParser.tokenNames; }
    public String getGrammarFileName() { return "InternalKant.g"; }


    	private KantGrammarAccess grammarAccess;

    	public void setGrammarAccess(KantGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleProtocol"
    // InternalKant.g:53:1: entryRuleProtocol : ruleProtocol EOF ;
    public final void entryRuleProtocol() throws RecognitionException {
        try {
            // InternalKant.g:54:1: ( ruleProtocol EOF )
            // InternalKant.g:55:1: ruleProtocol EOF
            {
             before(grammarAccess.getProtocolRule()); 
            pushFollow(FOLLOW_1);
            ruleProtocol();

            state._fsp--;

             after(grammarAccess.getProtocolRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleProtocol"


    // $ANTLR start "ruleProtocol"
    // InternalKant.g:62:1: ruleProtocol : ( ( rule__Protocol__ElementsAssignment )* ) ;
    public final void ruleProtocol() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:66:2: ( ( ( rule__Protocol__ElementsAssignment )* ) )
            // InternalKant.g:67:2: ( ( rule__Protocol__ElementsAssignment )* )
            {
            // InternalKant.g:67:2: ( ( rule__Protocol__ElementsAssignment )* )
            // InternalKant.g:68:3: ( rule__Protocol__ElementsAssignment )*
            {
             before(grammarAccess.getProtocolAccess().getElementsAssignment()); 
            // InternalKant.g:69:3: ( rule__Protocol__ElementsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID||LA1_0==14||LA1_0==23||(LA1_0>=26 && LA1_0<=27)||(LA1_0>=35 && LA1_0<=36)||LA1_0==38||LA1_0==47) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalKant.g:69:4: rule__Protocol__ElementsAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Protocol__ElementsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getProtocolAccess().getElementsAssignment()); 

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
    // $ANTLR end "ruleProtocol"


    // $ANTLR start "entryRuleElement"
    // InternalKant.g:78:1: entryRuleElement : ruleElement EOF ;
    public final void entryRuleElement() throws RecognitionException {
        try {
            // InternalKant.g:79:1: ( ruleElement EOF )
            // InternalKant.g:80:1: ruleElement EOF
            {
             before(grammarAccess.getElementRule()); 
            pushFollow(FOLLOW_1);
            ruleElement();

            state._fsp--;

             after(grammarAccess.getElementRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleElement"


    // $ANTLR start "ruleElement"
    // InternalKant.g:87:1: ruleElement : ( ( rule__Element__Alternatives ) ) ;
    public final void ruleElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:91:2: ( ( ( rule__Element__Alternatives ) ) )
            // InternalKant.g:92:2: ( ( rule__Element__Alternatives ) )
            {
            // InternalKant.g:92:2: ( ( rule__Element__Alternatives ) )
            // InternalKant.g:93:3: ( rule__Element__Alternatives )
            {
             before(grammarAccess.getElementAccess().getAlternatives()); 
            // InternalKant.g:94:3: ( rule__Element__Alternatives )
            // InternalKant.g:94:4: rule__Element__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Element__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getElementAccess().getAlternatives()); 

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
    // $ANTLR end "ruleElement"


    // $ANTLR start "entryRuleUniversalIntroduction"
    // InternalKant.g:103:1: entryRuleUniversalIntroduction : ruleUniversalIntroduction EOF ;
    public final void entryRuleUniversalIntroduction() throws RecognitionException {
        try {
            // InternalKant.g:104:1: ( ruleUniversalIntroduction EOF )
            // InternalKant.g:105:1: ruleUniversalIntroduction EOF
            {
             before(grammarAccess.getUniversalIntroductionRule()); 
            pushFollow(FOLLOW_1);
            ruleUniversalIntroduction();

            state._fsp--;

             after(grammarAccess.getUniversalIntroductionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleUniversalIntroduction"


    // $ANTLR start "ruleUniversalIntroduction"
    // InternalKant.g:112:1: ruleUniversalIntroduction : ( ( rule__UniversalIntroduction__Group__0 ) ) ;
    public final void ruleUniversalIntroduction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:116:2: ( ( ( rule__UniversalIntroduction__Group__0 ) ) )
            // InternalKant.g:117:2: ( ( rule__UniversalIntroduction__Group__0 ) )
            {
            // InternalKant.g:117:2: ( ( rule__UniversalIntroduction__Group__0 ) )
            // InternalKant.g:118:3: ( rule__UniversalIntroduction__Group__0 )
            {
             before(grammarAccess.getUniversalIntroductionAccess().getGroup()); 
            // InternalKant.g:119:3: ( rule__UniversalIntroduction__Group__0 )
            // InternalKant.g:119:4: rule__UniversalIntroduction__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__UniversalIntroduction__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUniversalIntroductionAccess().getGroup()); 

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
    // $ANTLR end "ruleUniversalIntroduction"


    // $ANTLR start "entryRuleFunctionDef"
    // InternalKant.g:128:1: entryRuleFunctionDef : ruleFunctionDef EOF ;
    public final void entryRuleFunctionDef() throws RecognitionException {
        try {
            // InternalKant.g:129:1: ( ruleFunctionDef EOF )
            // InternalKant.g:130:1: ruleFunctionDef EOF
            {
             before(grammarAccess.getFunctionDefRule()); 
            pushFollow(FOLLOW_1);
            ruleFunctionDef();

            state._fsp--;

             after(grammarAccess.getFunctionDefRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleFunctionDef"


    // $ANTLR start "ruleFunctionDef"
    // InternalKant.g:137:1: ruleFunctionDef : ( ( rule__FunctionDef__Group__0 ) ) ;
    public final void ruleFunctionDef() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:141:2: ( ( ( rule__FunctionDef__Group__0 ) ) )
            // InternalKant.g:142:2: ( ( rule__FunctionDef__Group__0 ) )
            {
            // InternalKant.g:142:2: ( ( rule__FunctionDef__Group__0 ) )
            // InternalKant.g:143:3: ( rule__FunctionDef__Group__0 )
            {
             before(grammarAccess.getFunctionDefAccess().getGroup()); 
            // InternalKant.g:144:3: ( rule__FunctionDef__Group__0 )
            // InternalKant.g:144:4: rule__FunctionDef__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FunctionDef__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFunctionDefAccess().getGroup()); 

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
    // $ANTLR end "ruleFunctionDef"


    // $ANTLR start "entryRuleFunctionParam"
    // InternalKant.g:153:1: entryRuleFunctionParam : ruleFunctionParam EOF ;
    public final void entryRuleFunctionParam() throws RecognitionException {
        try {
            // InternalKant.g:154:1: ( ruleFunctionParam EOF )
            // InternalKant.g:155:1: ruleFunctionParam EOF
            {
             before(grammarAccess.getFunctionParamRule()); 
            pushFollow(FOLLOW_1);
            ruleFunctionParam();

            state._fsp--;

             after(grammarAccess.getFunctionParamRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleFunctionParam"


    // $ANTLR start "ruleFunctionParam"
    // InternalKant.g:162:1: ruleFunctionParam : ( ( rule__FunctionParam__Group__0 ) ) ;
    public final void ruleFunctionParam() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:166:2: ( ( ( rule__FunctionParam__Group__0 ) ) )
            // InternalKant.g:167:2: ( ( rule__FunctionParam__Group__0 ) )
            {
            // InternalKant.g:167:2: ( ( rule__FunctionParam__Group__0 ) )
            // InternalKant.g:168:3: ( rule__FunctionParam__Group__0 )
            {
             before(grammarAccess.getFunctionParamAccess().getGroup()); 
            // InternalKant.g:169:3: ( rule__FunctionParam__Group__0 )
            // InternalKant.g:169:4: rule__FunctionParam__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FunctionParam__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFunctionParamAccess().getGroup()); 

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
    // $ANTLR end "ruleFunctionParam"


    // $ANTLR start "entryRuleFunctionKey"
    // InternalKant.g:178:1: entryRuleFunctionKey : ruleFunctionKey EOF ;
    public final void entryRuleFunctionKey() throws RecognitionException {
        try {
            // InternalKant.g:179:1: ( ruleFunctionKey EOF )
            // InternalKant.g:180:1: ruleFunctionKey EOF
            {
             before(grammarAccess.getFunctionKeyRule()); 
            pushFollow(FOLLOW_1);
            ruleFunctionKey();

            state._fsp--;

             after(grammarAccess.getFunctionKeyRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleFunctionKey"


    // $ANTLR start "ruleFunctionKey"
    // InternalKant.g:187:1: ruleFunctionKey : ( ( rule__FunctionKey__Alternatives ) ) ;
    public final void ruleFunctionKey() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:191:2: ( ( ( rule__FunctionKey__Alternatives ) ) )
            // InternalKant.g:192:2: ( ( rule__FunctionKey__Alternatives ) )
            {
            // InternalKant.g:192:2: ( ( rule__FunctionKey__Alternatives ) )
            // InternalKant.g:193:3: ( rule__FunctionKey__Alternatives )
            {
             before(grammarAccess.getFunctionKeyAccess().getAlternatives()); 
            // InternalKant.g:194:3: ( rule__FunctionKey__Alternatives )
            // InternalKant.g:194:4: rule__FunctionKey__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__FunctionKey__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getFunctionKeyAccess().getAlternatives()); 

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
    // $ANTLR end "ruleFunctionKey"


    // $ANTLR start "entryRuleFunctionKeyElement"
    // InternalKant.g:203:1: entryRuleFunctionKeyElement : ruleFunctionKeyElement EOF ;
    public final void entryRuleFunctionKeyElement() throws RecognitionException {
        try {
            // InternalKant.g:204:1: ( ruleFunctionKeyElement EOF )
            // InternalKant.g:205:1: ruleFunctionKeyElement EOF
            {
             before(grammarAccess.getFunctionKeyElementRule()); 
            pushFollow(FOLLOW_1);
            ruleFunctionKeyElement();

            state._fsp--;

             after(grammarAccess.getFunctionKeyElementRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleFunctionKeyElement"


    // $ANTLR start "ruleFunctionKeyElement"
    // InternalKant.g:212:1: ruleFunctionKeyElement : ( ( rule__FunctionKeyElement__Group__0 ) ) ;
    public final void ruleFunctionKeyElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:216:2: ( ( ( rule__FunctionKeyElement__Group__0 ) ) )
            // InternalKant.g:217:2: ( ( rule__FunctionKeyElement__Group__0 ) )
            {
            // InternalKant.g:217:2: ( ( rule__FunctionKeyElement__Group__0 ) )
            // InternalKant.g:218:3: ( rule__FunctionKeyElement__Group__0 )
            {
             before(grammarAccess.getFunctionKeyElementAccess().getGroup()); 
            // InternalKant.g:219:3: ( rule__FunctionKeyElement__Group__0 )
            // InternalKant.g:219:4: rule__FunctionKeyElement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FunctionKeyElement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFunctionKeyElementAccess().getGroup()); 

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
    // $ANTLR end "ruleFunctionKeyElement"


    // $ANTLR start "entryRuleFunctionReturn"
    // InternalKant.g:228:1: entryRuleFunctionReturn : ruleFunctionReturn EOF ;
    public final void entryRuleFunctionReturn() throws RecognitionException {
        try {
            // InternalKant.g:229:1: ( ruleFunctionReturn EOF )
            // InternalKant.g:230:1: ruleFunctionReturn EOF
            {
             before(grammarAccess.getFunctionReturnRule()); 
            pushFollow(FOLLOW_1);
            ruleFunctionReturn();

            state._fsp--;

             after(grammarAccess.getFunctionReturnRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleFunctionReturn"


    // $ANTLR start "ruleFunctionReturn"
    // InternalKant.g:237:1: ruleFunctionReturn : ( ( rule__FunctionReturn__Alternatives ) ) ;
    public final void ruleFunctionReturn() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:241:2: ( ( ( rule__FunctionReturn__Alternatives ) ) )
            // InternalKant.g:242:2: ( ( rule__FunctionReturn__Alternatives ) )
            {
            // InternalKant.g:242:2: ( ( rule__FunctionReturn__Alternatives ) )
            // InternalKant.g:243:3: ( rule__FunctionReturn__Alternatives )
            {
             before(grammarAccess.getFunctionReturnAccess().getAlternatives()); 
            // InternalKant.g:244:3: ( rule__FunctionReturn__Alternatives )
            // InternalKant.g:244:4: rule__FunctionReturn__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__FunctionReturn__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getFunctionReturnAccess().getAlternatives()); 

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
    // $ANTLR end "ruleFunctionReturn"


    // $ANTLR start "entryRuleFunctionReturnElement"
    // InternalKant.g:253:1: entryRuleFunctionReturnElement : ruleFunctionReturnElement EOF ;
    public final void entryRuleFunctionReturnElement() throws RecognitionException {
        try {
            // InternalKant.g:254:1: ( ruleFunctionReturnElement EOF )
            // InternalKant.g:255:1: ruleFunctionReturnElement EOF
            {
             before(grammarAccess.getFunctionReturnElementRule()); 
            pushFollow(FOLLOW_1);
            ruleFunctionReturnElement();

            state._fsp--;

             after(grammarAccess.getFunctionReturnElementRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleFunctionReturnElement"


    // $ANTLR start "ruleFunctionReturnElement"
    // InternalKant.g:262:1: ruleFunctionReturnElement : ( ( rule__FunctionReturnElement__Group__0 ) ) ;
    public final void ruleFunctionReturnElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:266:2: ( ( ( rule__FunctionReturnElement__Group__0 ) ) )
            // InternalKant.g:267:2: ( ( rule__FunctionReturnElement__Group__0 ) )
            {
            // InternalKant.g:267:2: ( ( rule__FunctionReturnElement__Group__0 ) )
            // InternalKant.g:268:3: ( rule__FunctionReturnElement__Group__0 )
            {
             before(grammarAccess.getFunctionReturnElementAccess().getGroup()); 
            // InternalKant.g:269:3: ( rule__FunctionReturnElement__Group__0 )
            // InternalKant.g:269:4: rule__FunctionReturnElement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FunctionReturnElement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFunctionReturnElementAccess().getGroup()); 

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
    // $ANTLR end "ruleFunctionReturnElement"


    // $ANTLR start "entryRulePropertyDef"
    // InternalKant.g:278:1: entryRulePropertyDef : rulePropertyDef EOF ;
    public final void entryRulePropertyDef() throws RecognitionException {
        try {
            // InternalKant.g:279:1: ( rulePropertyDef EOF )
            // InternalKant.g:280:1: rulePropertyDef EOF
            {
             before(grammarAccess.getPropertyDefRule()); 
            pushFollow(FOLLOW_1);
            rulePropertyDef();

            state._fsp--;

             after(grammarAccess.getPropertyDefRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulePropertyDef"


    // $ANTLR start "rulePropertyDef"
    // InternalKant.g:287:1: rulePropertyDef : ( ( rule__PropertyDef__Group__0 ) ) ;
    public final void rulePropertyDef() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:291:2: ( ( ( rule__PropertyDef__Group__0 ) ) )
            // InternalKant.g:292:2: ( ( rule__PropertyDef__Group__0 ) )
            {
            // InternalKant.g:292:2: ( ( rule__PropertyDef__Group__0 ) )
            // InternalKant.g:293:3: ( rule__PropertyDef__Group__0 )
            {
             before(grammarAccess.getPropertyDefAccess().getGroup()); 
            // InternalKant.g:294:3: ( rule__PropertyDef__Group__0 )
            // InternalKant.g:294:4: rule__PropertyDef__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PropertyDef__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPropertyDefAccess().getGroup()); 

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
    // $ANTLR end "rulePropertyDef"


    // $ANTLR start "entryRuleKnowledgeEqualityDef"
    // InternalKant.g:303:1: entryRuleKnowledgeEqualityDef : ruleKnowledgeEqualityDef EOF ;
    public final void entryRuleKnowledgeEqualityDef() throws RecognitionException {
        try {
            // InternalKant.g:304:1: ( ruleKnowledgeEqualityDef EOF )
            // InternalKant.g:305:1: ruleKnowledgeEqualityDef EOF
            {
             before(grammarAccess.getKnowledgeEqualityDefRule()); 
            pushFollow(FOLLOW_1);
            ruleKnowledgeEqualityDef();

            state._fsp--;

             after(grammarAccess.getKnowledgeEqualityDefRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleKnowledgeEqualityDef"


    // $ANTLR start "ruleKnowledgeEqualityDef"
    // InternalKant.g:312:1: ruleKnowledgeEqualityDef : ( ( rule__KnowledgeEqualityDef__Group__0 ) ) ;
    public final void ruleKnowledgeEqualityDef() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:316:2: ( ( ( rule__KnowledgeEqualityDef__Group__0 ) ) )
            // InternalKant.g:317:2: ( ( rule__KnowledgeEqualityDef__Group__0 ) )
            {
            // InternalKant.g:317:2: ( ( rule__KnowledgeEqualityDef__Group__0 ) )
            // InternalKant.g:318:3: ( rule__KnowledgeEqualityDef__Group__0 )
            {
             before(grammarAccess.getKnowledgeEqualityDefAccess().getGroup()); 
            // InternalKant.g:319:3: ( rule__KnowledgeEqualityDef__Group__0 )
            // InternalKant.g:319:4: rule__KnowledgeEqualityDef__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__KnowledgeEqualityDef__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getKnowledgeEqualityDefAccess().getGroup()); 

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
    // $ANTLR end "ruleKnowledgeEqualityDef"


    // $ANTLR start "entryRuleFunctionInversionDef"
    // InternalKant.g:328:1: entryRuleFunctionInversionDef : ruleFunctionInversionDef EOF ;
    public final void entryRuleFunctionInversionDef() throws RecognitionException {
        try {
            // InternalKant.g:329:1: ( ruleFunctionInversionDef EOF )
            // InternalKant.g:330:1: ruleFunctionInversionDef EOF
            {
             before(grammarAccess.getFunctionInversionDefRule()); 
            pushFollow(FOLLOW_1);
            ruleFunctionInversionDef();

            state._fsp--;

             after(grammarAccess.getFunctionInversionDefRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleFunctionInversionDef"


    // $ANTLR start "ruleFunctionInversionDef"
    // InternalKant.g:337:1: ruleFunctionInversionDef : ( ( rule__FunctionInversionDef__Group__0 ) ) ;
    public final void ruleFunctionInversionDef() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:341:2: ( ( ( rule__FunctionInversionDef__Group__0 ) ) )
            // InternalKant.g:342:2: ( ( rule__FunctionInversionDef__Group__0 ) )
            {
            // InternalKant.g:342:2: ( ( rule__FunctionInversionDef__Group__0 ) )
            // InternalKant.g:343:3: ( rule__FunctionInversionDef__Group__0 )
            {
             before(grammarAccess.getFunctionInversionDefAccess().getGroup()); 
            // InternalKant.g:344:3: ( rule__FunctionInversionDef__Group__0 )
            // InternalKant.g:344:4: rule__FunctionInversionDef__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FunctionInversionDef__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFunctionInversionDefAccess().getGroup()); 

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
    // $ANTLR end "ruleFunctionInversionDef"


    // $ANTLR start "entryRuleKnowledgeBase"
    // InternalKant.g:353:1: entryRuleKnowledgeBase : ruleKnowledgeBase EOF ;
    public final void entryRuleKnowledgeBase() throws RecognitionException {
        try {
            // InternalKant.g:354:1: ( ruleKnowledgeBase EOF )
            // InternalKant.g:355:1: ruleKnowledgeBase EOF
            {
             before(grammarAccess.getKnowledgeBaseRule()); 
            pushFollow(FOLLOW_1);
            ruleKnowledgeBase();

            state._fsp--;

             after(grammarAccess.getKnowledgeBaseRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleKnowledgeBase"


    // $ANTLR start "ruleKnowledgeBase"
    // InternalKant.g:362:1: ruleKnowledgeBase : ( ( rule__KnowledgeBase__Group__0 ) ) ;
    public final void ruleKnowledgeBase() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:366:2: ( ( ( rule__KnowledgeBase__Group__0 ) ) )
            // InternalKant.g:367:2: ( ( rule__KnowledgeBase__Group__0 ) )
            {
            // InternalKant.g:367:2: ( ( rule__KnowledgeBase__Group__0 ) )
            // InternalKant.g:368:3: ( rule__KnowledgeBase__Group__0 )
            {
             before(grammarAccess.getKnowledgeBaseAccess().getGroup()); 
            // InternalKant.g:369:3: ( rule__KnowledgeBase__Group__0 )
            // InternalKant.g:369:4: rule__KnowledgeBase__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__KnowledgeBase__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getKnowledgeBaseAccess().getGroup()); 

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
    // $ANTLR end "ruleKnowledgeBase"


    // $ANTLR start "entryRulePrincipal"
    // InternalKant.g:378:1: entryRulePrincipal : rulePrincipal EOF ;
    public final void entryRulePrincipal() throws RecognitionException {
        try {
            // InternalKant.g:379:1: ( rulePrincipal EOF )
            // InternalKant.g:380:1: rulePrincipal EOF
            {
             before(grammarAccess.getPrincipalRule()); 
            pushFollow(FOLLOW_1);
            rulePrincipal();

            state._fsp--;

             after(grammarAccess.getPrincipalRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulePrincipal"


    // $ANTLR start "rulePrincipal"
    // InternalKant.g:387:1: rulePrincipal : ( ( rule__Principal__Group__0 ) ) ;
    public final void rulePrincipal() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:391:2: ( ( ( rule__Principal__Group__0 ) ) )
            // InternalKant.g:392:2: ( ( rule__Principal__Group__0 ) )
            {
            // InternalKant.g:392:2: ( ( rule__Principal__Group__0 ) )
            // InternalKant.g:393:3: ( rule__Principal__Group__0 )
            {
             before(grammarAccess.getPrincipalAccess().getGroup()); 
            // InternalKant.g:394:3: ( rule__Principal__Group__0 )
            // InternalKant.g:394:4: rule__Principal__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Principal__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPrincipalAccess().getGroup()); 

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
    // $ANTLR end "rulePrincipal"


    // $ANTLR start "entryRuleKnowledge"
    // InternalKant.g:403:1: entryRuleKnowledge : ruleKnowledge EOF ;
    public final void entryRuleKnowledge() throws RecognitionException {
        try {
            // InternalKant.g:404:1: ( ruleKnowledge EOF )
            // InternalKant.g:405:1: ruleKnowledge EOF
            {
             before(grammarAccess.getKnowledgeRule()); 
            pushFollow(FOLLOW_1);
            ruleKnowledge();

            state._fsp--;

             after(grammarAccess.getKnowledgeRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleKnowledge"


    // $ANTLR start "ruleKnowledge"
    // InternalKant.g:412:1: ruleKnowledge : ( ( rule__Knowledge__Alternatives ) ) ;
    public final void ruleKnowledge() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:416:2: ( ( ( rule__Knowledge__Alternatives ) ) )
            // InternalKant.g:417:2: ( ( rule__Knowledge__Alternatives ) )
            {
            // InternalKant.g:417:2: ( ( rule__Knowledge__Alternatives ) )
            // InternalKant.g:418:3: ( rule__Knowledge__Alternatives )
            {
             before(grammarAccess.getKnowledgeAccess().getAlternatives()); 
            // InternalKant.g:419:3: ( rule__Knowledge__Alternatives )
            // InternalKant.g:419:4: rule__Knowledge__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Knowledge__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getKnowledgeAccess().getAlternatives()); 

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
    // $ANTLR end "ruleKnowledge"


    // $ANTLR start "entryRuleKnowledgeDef"
    // InternalKant.g:428:1: entryRuleKnowledgeDef : ruleKnowledgeDef EOF ;
    public final void entryRuleKnowledgeDef() throws RecognitionException {
        try {
            // InternalKant.g:429:1: ( ruleKnowledgeDef EOF )
            // InternalKant.g:430:1: ruleKnowledgeDef EOF
            {
             before(grammarAccess.getKnowledgeDefRule()); 
            pushFollow(FOLLOW_1);
            ruleKnowledgeDef();

            state._fsp--;

             after(grammarAccess.getKnowledgeDefRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleKnowledgeDef"


    // $ANTLR start "ruleKnowledgeDef"
    // InternalKant.g:437:1: ruleKnowledgeDef : ( ( rule__KnowledgeDef__Alternatives ) ) ;
    public final void ruleKnowledgeDef() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:441:2: ( ( ( rule__KnowledgeDef__Alternatives ) ) )
            // InternalKant.g:442:2: ( ( rule__KnowledgeDef__Alternatives ) )
            {
            // InternalKant.g:442:2: ( ( rule__KnowledgeDef__Alternatives ) )
            // InternalKant.g:443:3: ( rule__KnowledgeDef__Alternatives )
            {
             before(grammarAccess.getKnowledgeDefAccess().getAlternatives()); 
            // InternalKant.g:444:3: ( rule__KnowledgeDef__Alternatives )
            // InternalKant.g:444:4: rule__KnowledgeDef__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__KnowledgeDef__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getKnowledgeDefAccess().getAlternatives()); 

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
    // $ANTLR end "ruleKnowledgeDef"


    // $ANTLR start "entryRuleKnowledgeDefDestructuring"
    // InternalKant.g:453:1: entryRuleKnowledgeDefDestructuring : ruleKnowledgeDefDestructuring EOF ;
    public final void entryRuleKnowledgeDefDestructuring() throws RecognitionException {
        try {
            // InternalKant.g:454:1: ( ruleKnowledgeDefDestructuring EOF )
            // InternalKant.g:455:1: ruleKnowledgeDefDestructuring EOF
            {
             before(grammarAccess.getKnowledgeDefDestructuringRule()); 
            pushFollow(FOLLOW_1);
            ruleKnowledgeDefDestructuring();

            state._fsp--;

             after(grammarAccess.getKnowledgeDefDestructuringRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleKnowledgeDefDestructuring"


    // $ANTLR start "ruleKnowledgeDefDestructuring"
    // InternalKant.g:462:1: ruleKnowledgeDefDestructuring : ( ( rule__KnowledgeDefDestructuring__Alternatives ) ) ;
    public final void ruleKnowledgeDefDestructuring() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:466:2: ( ( ( rule__KnowledgeDefDestructuring__Alternatives ) ) )
            // InternalKant.g:467:2: ( ( rule__KnowledgeDefDestructuring__Alternatives ) )
            {
            // InternalKant.g:467:2: ( ( rule__KnowledgeDefDestructuring__Alternatives ) )
            // InternalKant.g:468:3: ( rule__KnowledgeDefDestructuring__Alternatives )
            {
             before(grammarAccess.getKnowledgeDefDestructuringAccess().getAlternatives()); 
            // InternalKant.g:469:3: ( rule__KnowledgeDefDestructuring__Alternatives )
            // InternalKant.g:469:4: rule__KnowledgeDefDestructuring__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__KnowledgeDefDestructuring__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getKnowledgeDefDestructuringAccess().getAlternatives()); 

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
    // $ANTLR end "ruleKnowledgeDefDestructuring"


    // $ANTLR start "entryRuleKnowledgeDefSetDestructuring"
    // InternalKant.g:478:1: entryRuleKnowledgeDefSetDestructuring : ruleKnowledgeDefSetDestructuring EOF ;
    public final void entryRuleKnowledgeDefSetDestructuring() throws RecognitionException {
        try {
            // InternalKant.g:479:1: ( ruleKnowledgeDefSetDestructuring EOF )
            // InternalKant.g:480:1: ruleKnowledgeDefSetDestructuring EOF
            {
             before(grammarAccess.getKnowledgeDefSetDestructuringRule()); 
            pushFollow(FOLLOW_1);
            ruleKnowledgeDefSetDestructuring();

            state._fsp--;

             after(grammarAccess.getKnowledgeDefSetDestructuringRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleKnowledgeDefSetDestructuring"


    // $ANTLR start "ruleKnowledgeDefSetDestructuring"
    // InternalKant.g:487:1: ruleKnowledgeDefSetDestructuring : ( ( rule__KnowledgeDefSetDestructuring__Group__0 ) ) ;
    public final void ruleKnowledgeDefSetDestructuring() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:491:2: ( ( ( rule__KnowledgeDefSetDestructuring__Group__0 ) ) )
            // InternalKant.g:492:2: ( ( rule__KnowledgeDefSetDestructuring__Group__0 ) )
            {
            // InternalKant.g:492:2: ( ( rule__KnowledgeDefSetDestructuring__Group__0 ) )
            // InternalKant.g:493:3: ( rule__KnowledgeDefSetDestructuring__Group__0 )
            {
             before(grammarAccess.getKnowledgeDefSetDestructuringAccess().getGroup()); 
            // InternalKant.g:494:3: ( rule__KnowledgeDefSetDestructuring__Group__0 )
            // InternalKant.g:494:4: rule__KnowledgeDefSetDestructuring__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__KnowledgeDefSetDestructuring__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getKnowledgeDefSetDestructuringAccess().getGroup()); 

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
    // $ANTLR end "ruleKnowledgeDefSetDestructuring"


    // $ANTLR start "entryRuleKnowledgeDefSetDesctructuringAssignment"
    // InternalKant.g:503:1: entryRuleKnowledgeDefSetDesctructuringAssignment : ruleKnowledgeDefSetDesctructuringAssignment EOF ;
    public final void entryRuleKnowledgeDefSetDesctructuringAssignment() throws RecognitionException {
        try {
            // InternalKant.g:504:1: ( ruleKnowledgeDefSetDesctructuringAssignment EOF )
            // InternalKant.g:505:1: ruleKnowledgeDefSetDesctructuringAssignment EOF
            {
             before(grammarAccess.getKnowledgeDefSetDesctructuringAssignmentRule()); 
            pushFollow(FOLLOW_1);
            ruleKnowledgeDefSetDesctructuringAssignment();

            state._fsp--;

             after(grammarAccess.getKnowledgeDefSetDesctructuringAssignmentRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleKnowledgeDefSetDesctructuringAssignment"


    // $ANTLR start "ruleKnowledgeDefSetDesctructuringAssignment"
    // InternalKant.g:512:1: ruleKnowledgeDefSetDesctructuringAssignment : ( ( rule__KnowledgeDefSetDesctructuringAssignment__Group__0 ) ) ;
    public final void ruleKnowledgeDefSetDesctructuringAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:516:2: ( ( ( rule__KnowledgeDefSetDesctructuringAssignment__Group__0 ) ) )
            // InternalKant.g:517:2: ( ( rule__KnowledgeDefSetDesctructuringAssignment__Group__0 ) )
            {
            // InternalKant.g:517:2: ( ( rule__KnowledgeDefSetDesctructuringAssignment__Group__0 ) )
            // InternalKant.g:518:3: ( rule__KnowledgeDefSetDesctructuringAssignment__Group__0 )
            {
             before(grammarAccess.getKnowledgeDefSetDesctructuringAssignmentAccess().getGroup()); 
            // InternalKant.g:519:3: ( rule__KnowledgeDefSetDesctructuringAssignment__Group__0 )
            // InternalKant.g:519:4: rule__KnowledgeDefSetDesctructuringAssignment__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__KnowledgeDefSetDesctructuringAssignment__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getKnowledgeDefSetDesctructuringAssignmentAccess().getGroup()); 

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
    // $ANTLR end "ruleKnowledgeDefSetDesctructuringAssignment"


    // $ANTLR start "entryRuleKnowledgeDefListDestructuring"
    // InternalKant.g:528:1: entryRuleKnowledgeDefListDestructuring : ruleKnowledgeDefListDestructuring EOF ;
    public final void entryRuleKnowledgeDefListDestructuring() throws RecognitionException {
        try {
            // InternalKant.g:529:1: ( ruleKnowledgeDefListDestructuring EOF )
            // InternalKant.g:530:1: ruleKnowledgeDefListDestructuring EOF
            {
             before(grammarAccess.getKnowledgeDefListDestructuringRule()); 
            pushFollow(FOLLOW_1);
            ruleKnowledgeDefListDestructuring();

            state._fsp--;

             after(grammarAccess.getKnowledgeDefListDestructuringRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleKnowledgeDefListDestructuring"


    // $ANTLR start "ruleKnowledgeDefListDestructuring"
    // InternalKant.g:537:1: ruleKnowledgeDefListDestructuring : ( ( rule__KnowledgeDefListDestructuring__Group__0 ) ) ;
    public final void ruleKnowledgeDefListDestructuring() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:541:2: ( ( ( rule__KnowledgeDefListDestructuring__Group__0 ) ) )
            // InternalKant.g:542:2: ( ( rule__KnowledgeDefListDestructuring__Group__0 ) )
            {
            // InternalKant.g:542:2: ( ( rule__KnowledgeDefListDestructuring__Group__0 ) )
            // InternalKant.g:543:3: ( rule__KnowledgeDefListDestructuring__Group__0 )
            {
             before(grammarAccess.getKnowledgeDefListDestructuringAccess().getGroup()); 
            // InternalKant.g:544:3: ( rule__KnowledgeDefListDestructuring__Group__0 )
            // InternalKant.g:544:4: rule__KnowledgeDefListDestructuring__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__KnowledgeDefListDestructuring__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getKnowledgeDefListDestructuringAccess().getGroup()); 

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
    // $ANTLR end "ruleKnowledgeDefListDestructuring"


    // $ANTLR start "entryRuleKnowledgeDefListDesctructuringAssignment"
    // InternalKant.g:553:1: entryRuleKnowledgeDefListDesctructuringAssignment : ruleKnowledgeDefListDesctructuringAssignment EOF ;
    public final void entryRuleKnowledgeDefListDesctructuringAssignment() throws RecognitionException {
        try {
            // InternalKant.g:554:1: ( ruleKnowledgeDefListDesctructuringAssignment EOF )
            // InternalKant.g:555:1: ruleKnowledgeDefListDesctructuringAssignment EOF
            {
             before(grammarAccess.getKnowledgeDefListDesctructuringAssignmentRule()); 
            pushFollow(FOLLOW_1);
            ruleKnowledgeDefListDesctructuringAssignment();

            state._fsp--;

             after(grammarAccess.getKnowledgeDefListDesctructuringAssignmentRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleKnowledgeDefListDesctructuringAssignment"


    // $ANTLR start "ruleKnowledgeDefListDesctructuringAssignment"
    // InternalKant.g:562:1: ruleKnowledgeDefListDesctructuringAssignment : ( ( rule__KnowledgeDefListDesctructuringAssignment__Alternatives ) ) ;
    public final void ruleKnowledgeDefListDesctructuringAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:566:2: ( ( ( rule__KnowledgeDefListDesctructuringAssignment__Alternatives ) ) )
            // InternalKant.g:567:2: ( ( rule__KnowledgeDefListDesctructuringAssignment__Alternatives ) )
            {
            // InternalKant.g:567:2: ( ( rule__KnowledgeDefListDesctructuringAssignment__Alternatives ) )
            // InternalKant.g:568:3: ( rule__KnowledgeDefListDesctructuringAssignment__Alternatives )
            {
             before(grammarAccess.getKnowledgeDefListDesctructuringAssignmentAccess().getAlternatives()); 
            // InternalKant.g:569:3: ( rule__KnowledgeDefListDesctructuringAssignment__Alternatives )
            // InternalKant.g:569:4: rule__KnowledgeDefListDesctructuringAssignment__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__KnowledgeDefListDesctructuringAssignment__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getKnowledgeDefListDesctructuringAssignmentAccess().getAlternatives()); 

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
    // $ANTLR end "ruleKnowledgeDefListDesctructuringAssignment"


    // $ANTLR start "entryRuleKnowledgeValue"
    // InternalKant.g:578:1: entryRuleKnowledgeValue : ruleKnowledgeValue EOF ;
    public final void entryRuleKnowledgeValue() throws RecognitionException {
        try {
            // InternalKant.g:579:1: ( ruleKnowledgeValue EOF )
            // InternalKant.g:580:1: ruleKnowledgeValue EOF
            {
             before(grammarAccess.getKnowledgeValueRule()); 
            pushFollow(FOLLOW_1);
            ruleKnowledgeValue();

            state._fsp--;

             after(grammarAccess.getKnowledgeValueRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleKnowledgeValue"


    // $ANTLR start "ruleKnowledgeValue"
    // InternalKant.g:587:1: ruleKnowledgeValue : ( ( rule__KnowledgeValue__Alternatives ) ) ;
    public final void ruleKnowledgeValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:591:2: ( ( ( rule__KnowledgeValue__Alternatives ) ) )
            // InternalKant.g:592:2: ( ( rule__KnowledgeValue__Alternatives ) )
            {
            // InternalKant.g:592:2: ( ( rule__KnowledgeValue__Alternatives ) )
            // InternalKant.g:593:3: ( rule__KnowledgeValue__Alternatives )
            {
             before(grammarAccess.getKnowledgeValueAccess().getAlternatives()); 
            // InternalKant.g:594:3: ( rule__KnowledgeValue__Alternatives )
            // InternalKant.g:594:4: rule__KnowledgeValue__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__KnowledgeValue__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getKnowledgeValueAccess().getAlternatives()); 

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
    // $ANTLR end "ruleKnowledgeValue"


    // $ANTLR start "entryRuleKnowledgeList"
    // InternalKant.g:603:1: entryRuleKnowledgeList : ruleKnowledgeList EOF ;
    public final void entryRuleKnowledgeList() throws RecognitionException {
        try {
            // InternalKant.g:604:1: ( ruleKnowledgeList EOF )
            // InternalKant.g:605:1: ruleKnowledgeList EOF
            {
             before(grammarAccess.getKnowledgeListRule()); 
            pushFollow(FOLLOW_1);
            ruleKnowledgeList();

            state._fsp--;

             after(grammarAccess.getKnowledgeListRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleKnowledgeList"


    // $ANTLR start "ruleKnowledgeList"
    // InternalKant.g:612:1: ruleKnowledgeList : ( ( rule__KnowledgeList__Group__0 ) ) ;
    public final void ruleKnowledgeList() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:616:2: ( ( ( rule__KnowledgeList__Group__0 ) ) )
            // InternalKant.g:617:2: ( ( rule__KnowledgeList__Group__0 ) )
            {
            // InternalKant.g:617:2: ( ( rule__KnowledgeList__Group__0 ) )
            // InternalKant.g:618:3: ( rule__KnowledgeList__Group__0 )
            {
             before(grammarAccess.getKnowledgeListAccess().getGroup()); 
            // InternalKant.g:619:3: ( rule__KnowledgeList__Group__0 )
            // InternalKant.g:619:4: rule__KnowledgeList__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__KnowledgeList__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getKnowledgeListAccess().getGroup()); 

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
    // $ANTLR end "ruleKnowledgeList"


    // $ANTLR start "entryRuleKnowledgeRef"
    // InternalKant.g:628:1: entryRuleKnowledgeRef : ruleKnowledgeRef EOF ;
    public final void entryRuleKnowledgeRef() throws RecognitionException {
        try {
            // InternalKant.g:629:1: ( ruleKnowledgeRef EOF )
            // InternalKant.g:630:1: ruleKnowledgeRef EOF
            {
             before(grammarAccess.getKnowledgeRefRule()); 
            pushFollow(FOLLOW_1);
            ruleKnowledgeRef();

            state._fsp--;

             after(grammarAccess.getKnowledgeRefRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleKnowledgeRef"


    // $ANTLR start "ruleKnowledgeRef"
    // InternalKant.g:637:1: ruleKnowledgeRef : ( ( rule__KnowledgeRef__Group__0 ) ) ;
    public final void ruleKnowledgeRef() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:641:2: ( ( ( rule__KnowledgeRef__Group__0 ) ) )
            // InternalKant.g:642:2: ( ( rule__KnowledgeRef__Group__0 ) )
            {
            // InternalKant.g:642:2: ( ( rule__KnowledgeRef__Group__0 ) )
            // InternalKant.g:643:3: ( rule__KnowledgeRef__Group__0 )
            {
             before(grammarAccess.getKnowledgeRefAccess().getGroup()); 
            // InternalKant.g:644:3: ( rule__KnowledgeRef__Group__0 )
            // InternalKant.g:644:4: rule__KnowledgeRef__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__KnowledgeRef__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getKnowledgeRefAccess().getGroup()); 

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
    // $ANTLR end "ruleKnowledgeRef"


    // $ANTLR start "entryRuleKnowledgeSet"
    // InternalKant.g:653:1: entryRuleKnowledgeSet : ruleKnowledgeSet EOF ;
    public final void entryRuleKnowledgeSet() throws RecognitionException {
        try {
            // InternalKant.g:654:1: ( ruleKnowledgeSet EOF )
            // InternalKant.g:655:1: ruleKnowledgeSet EOF
            {
             before(grammarAccess.getKnowledgeSetRule()); 
            pushFollow(FOLLOW_1);
            ruleKnowledgeSet();

            state._fsp--;

             after(grammarAccess.getKnowledgeSetRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleKnowledgeSet"


    // $ANTLR start "ruleKnowledgeSet"
    // InternalKant.g:662:1: ruleKnowledgeSet : ( ( rule__KnowledgeSet__Group__0 ) ) ;
    public final void ruleKnowledgeSet() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:666:2: ( ( ( rule__KnowledgeSet__Group__0 ) ) )
            // InternalKant.g:667:2: ( ( rule__KnowledgeSet__Group__0 ) )
            {
            // InternalKant.g:667:2: ( ( rule__KnowledgeSet__Group__0 ) )
            // InternalKant.g:668:3: ( rule__KnowledgeSet__Group__0 )
            {
             before(grammarAccess.getKnowledgeSetAccess().getGroup()); 
            // InternalKant.g:669:3: ( rule__KnowledgeSet__Group__0 )
            // InternalKant.g:669:4: rule__KnowledgeSet__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__KnowledgeSet__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getKnowledgeSetAccess().getGroup()); 

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
    // $ANTLR end "ruleKnowledgeSet"


    // $ANTLR start "entryRuleKnowledgeSpreading"
    // InternalKant.g:678:1: entryRuleKnowledgeSpreading : ruleKnowledgeSpreading EOF ;
    public final void entryRuleKnowledgeSpreading() throws RecognitionException {
        try {
            // InternalKant.g:679:1: ( ruleKnowledgeSpreading EOF )
            // InternalKant.g:680:1: ruleKnowledgeSpreading EOF
            {
             before(grammarAccess.getKnowledgeSpreadingRule()); 
            pushFollow(FOLLOW_1);
            ruleKnowledgeSpreading();

            state._fsp--;

             after(grammarAccess.getKnowledgeSpreadingRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleKnowledgeSpreading"


    // $ANTLR start "ruleKnowledgeSpreading"
    // InternalKant.g:687:1: ruleKnowledgeSpreading : ( ( rule__KnowledgeSpreading__Group__0 ) ) ;
    public final void ruleKnowledgeSpreading() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:691:2: ( ( ( rule__KnowledgeSpreading__Group__0 ) ) )
            // InternalKant.g:692:2: ( ( rule__KnowledgeSpreading__Group__0 ) )
            {
            // InternalKant.g:692:2: ( ( rule__KnowledgeSpreading__Group__0 ) )
            // InternalKant.g:693:3: ( rule__KnowledgeSpreading__Group__0 )
            {
             before(grammarAccess.getKnowledgeSpreadingAccess().getGroup()); 
            // InternalKant.g:694:3: ( rule__KnowledgeSpreading__Group__0 )
            // InternalKant.g:694:4: rule__KnowledgeSpreading__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__KnowledgeSpreading__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getKnowledgeSpreadingAccess().getGroup()); 

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
    // $ANTLR end "ruleKnowledgeSpreading"


    // $ANTLR start "entryRuleKnowledgeGenerator"
    // InternalKant.g:703:1: entryRuleKnowledgeGenerator : ruleKnowledgeGenerator EOF ;
    public final void entryRuleKnowledgeGenerator() throws RecognitionException {
        try {
            // InternalKant.g:704:1: ( ruleKnowledgeGenerator EOF )
            // InternalKant.g:705:1: ruleKnowledgeGenerator EOF
            {
             before(grammarAccess.getKnowledgeGeneratorRule()); 
            pushFollow(FOLLOW_1);
            ruleKnowledgeGenerator();

            state._fsp--;

             after(grammarAccess.getKnowledgeGeneratorRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleKnowledgeGenerator"


    // $ANTLR start "ruleKnowledgeGenerator"
    // InternalKant.g:712:1: ruleKnowledgeGenerator : ( ( rule__KnowledgeGenerator__Group__0 ) ) ;
    public final void ruleKnowledgeGenerator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:716:2: ( ( ( rule__KnowledgeGenerator__Group__0 ) ) )
            // InternalKant.g:717:2: ( ( rule__KnowledgeGenerator__Group__0 ) )
            {
            // InternalKant.g:717:2: ( ( rule__KnowledgeGenerator__Group__0 ) )
            // InternalKant.g:718:3: ( rule__KnowledgeGenerator__Group__0 )
            {
             before(grammarAccess.getKnowledgeGeneratorAccess().getGroup()); 
            // InternalKant.g:719:3: ( rule__KnowledgeGenerator__Group__0 )
            // InternalKant.g:719:4: rule__KnowledgeGenerator__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__KnowledgeGenerator__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getKnowledgeGeneratorAccess().getGroup()); 

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
    // $ANTLR end "ruleKnowledgeGenerator"


    // $ANTLR start "entryRuleKnowledgeFromFunction"
    // InternalKant.g:728:1: entryRuleKnowledgeFromFunction : ruleKnowledgeFromFunction EOF ;
    public final void entryRuleKnowledgeFromFunction() throws RecognitionException {
        try {
            // InternalKant.g:729:1: ( ruleKnowledgeFromFunction EOF )
            // InternalKant.g:730:1: ruleKnowledgeFromFunction EOF
            {
             before(grammarAccess.getKnowledgeFromFunctionRule()); 
            pushFollow(FOLLOW_1);
            ruleKnowledgeFromFunction();

            state._fsp--;

             after(grammarAccess.getKnowledgeFromFunctionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleKnowledgeFromFunction"


    // $ANTLR start "ruleKnowledgeFromFunction"
    // InternalKant.g:737:1: ruleKnowledgeFromFunction : ( ( rule__KnowledgeFromFunction__Group__0 ) ) ;
    public final void ruleKnowledgeFromFunction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:741:2: ( ( ( rule__KnowledgeFromFunction__Group__0 ) ) )
            // InternalKant.g:742:2: ( ( rule__KnowledgeFromFunction__Group__0 ) )
            {
            // InternalKant.g:742:2: ( ( rule__KnowledgeFromFunction__Group__0 ) )
            // InternalKant.g:743:3: ( rule__KnowledgeFromFunction__Group__0 )
            {
             before(grammarAccess.getKnowledgeFromFunctionAccess().getGroup()); 
            // InternalKant.g:744:3: ( rule__KnowledgeFromFunction__Group__0 )
            // InternalKant.g:744:4: rule__KnowledgeFromFunction__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__KnowledgeFromFunction__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getKnowledgeFromFunctionAccess().getGroup()); 

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
    // $ANTLR end "ruleKnowledgeFromFunction"


    // $ANTLR start "entryRuleKnowledgeFromFunctionArg"
    // InternalKant.g:753:1: entryRuleKnowledgeFromFunctionArg : ruleKnowledgeFromFunctionArg EOF ;
    public final void entryRuleKnowledgeFromFunctionArg() throws RecognitionException {
        try {
            // InternalKant.g:754:1: ( ruleKnowledgeFromFunctionArg EOF )
            // InternalKant.g:755:1: ruleKnowledgeFromFunctionArg EOF
            {
             before(grammarAccess.getKnowledgeFromFunctionArgRule()); 
            pushFollow(FOLLOW_1);
            ruleKnowledgeFromFunctionArg();

            state._fsp--;

             after(grammarAccess.getKnowledgeFromFunctionArgRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleKnowledgeFromFunctionArg"


    // $ANTLR start "ruleKnowledgeFromFunctionArg"
    // InternalKant.g:762:1: ruleKnowledgeFromFunctionArg : ( ( rule__KnowledgeFromFunctionArg__Alternatives ) ) ;
    public final void ruleKnowledgeFromFunctionArg() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:766:2: ( ( ( rule__KnowledgeFromFunctionArg__Alternatives ) ) )
            // InternalKant.g:767:2: ( ( rule__KnowledgeFromFunctionArg__Alternatives ) )
            {
            // InternalKant.g:767:2: ( ( rule__KnowledgeFromFunctionArg__Alternatives ) )
            // InternalKant.g:768:3: ( rule__KnowledgeFromFunctionArg__Alternatives )
            {
             before(grammarAccess.getKnowledgeFromFunctionArgAccess().getAlternatives()); 
            // InternalKant.g:769:3: ( rule__KnowledgeFromFunctionArg__Alternatives )
            // InternalKant.g:769:4: rule__KnowledgeFromFunctionArg__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__KnowledgeFromFunctionArg__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getKnowledgeFromFunctionArgAccess().getAlternatives()); 

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
    // $ANTLR end "ruleKnowledgeFromFunctionArg"


    // $ANTLR start "entryRuleCommunication"
    // InternalKant.g:778:1: entryRuleCommunication : ruleCommunication EOF ;
    public final void entryRuleCommunication() throws RecognitionException {
        try {
            // InternalKant.g:779:1: ( ruleCommunication EOF )
            // InternalKant.g:780:1: ruleCommunication EOF
            {
             before(grammarAccess.getCommunicationRule()); 
            pushFollow(FOLLOW_1);
            ruleCommunication();

            state._fsp--;

             after(grammarAccess.getCommunicationRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleCommunication"


    // $ANTLR start "ruleCommunication"
    // InternalKant.g:787:1: ruleCommunication : ( ( rule__Communication__Group__0 ) ) ;
    public final void ruleCommunication() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:791:2: ( ( ( rule__Communication__Group__0 ) ) )
            // InternalKant.g:792:2: ( ( rule__Communication__Group__0 ) )
            {
            // InternalKant.g:792:2: ( ( rule__Communication__Group__0 ) )
            // InternalKant.g:793:3: ( rule__Communication__Group__0 )
            {
             before(grammarAccess.getCommunicationAccess().getGroup()); 
            // InternalKant.g:794:3: ( rule__Communication__Group__0 )
            // InternalKant.g:794:4: rule__Communication__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Communication__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCommunicationAccess().getGroup()); 

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
    // $ANTLR end "ruleCommunication"


    // $ANTLR start "entryRuleScenarioBranching"
    // InternalKant.g:803:1: entryRuleScenarioBranching : ruleScenarioBranching EOF ;
    public final void entryRuleScenarioBranching() throws RecognitionException {
        try {
            // InternalKant.g:804:1: ( ruleScenarioBranching EOF )
            // InternalKant.g:805:1: ruleScenarioBranching EOF
            {
             before(grammarAccess.getScenarioBranchingRule()); 
            pushFollow(FOLLOW_1);
            ruleScenarioBranching();

            state._fsp--;

             after(grammarAccess.getScenarioBranchingRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleScenarioBranching"


    // $ANTLR start "ruleScenarioBranching"
    // InternalKant.g:812:1: ruleScenarioBranching : ( ( rule__ScenarioBranching__Alternatives ) ) ;
    public final void ruleScenarioBranching() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:816:2: ( ( ( rule__ScenarioBranching__Alternatives ) ) )
            // InternalKant.g:817:2: ( ( rule__ScenarioBranching__Alternatives ) )
            {
            // InternalKant.g:817:2: ( ( rule__ScenarioBranching__Alternatives ) )
            // InternalKant.g:818:3: ( rule__ScenarioBranching__Alternatives )
            {
             before(grammarAccess.getScenarioBranchingAccess().getAlternatives()); 
            // InternalKant.g:819:3: ( rule__ScenarioBranching__Alternatives )
            // InternalKant.g:819:4: rule__ScenarioBranching__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ScenarioBranching__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getScenarioBranchingAccess().getAlternatives()); 

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
    // $ANTLR end "ruleScenarioBranching"


    // $ANTLR start "entryRuleScenarioOptional"
    // InternalKant.g:828:1: entryRuleScenarioOptional : ruleScenarioOptional EOF ;
    public final void entryRuleScenarioOptional() throws RecognitionException {
        try {
            // InternalKant.g:829:1: ( ruleScenarioOptional EOF )
            // InternalKant.g:830:1: ruleScenarioOptional EOF
            {
             before(grammarAccess.getScenarioOptionalRule()); 
            pushFollow(FOLLOW_1);
            ruleScenarioOptional();

            state._fsp--;

             after(grammarAccess.getScenarioOptionalRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleScenarioOptional"


    // $ANTLR start "ruleScenarioOptional"
    // InternalKant.g:837:1: ruleScenarioOptional : ( ( rule__ScenarioOptional__Group__0 ) ) ;
    public final void ruleScenarioOptional() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:841:2: ( ( ( rule__ScenarioOptional__Group__0 ) ) )
            // InternalKant.g:842:2: ( ( rule__ScenarioOptional__Group__0 ) )
            {
            // InternalKant.g:842:2: ( ( rule__ScenarioOptional__Group__0 ) )
            // InternalKant.g:843:3: ( rule__ScenarioOptional__Group__0 )
            {
             before(grammarAccess.getScenarioOptionalAccess().getGroup()); 
            // InternalKant.g:844:3: ( rule__ScenarioOptional__Group__0 )
            // InternalKant.g:844:4: rule__ScenarioOptional__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ScenarioOptional__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getScenarioOptionalAccess().getGroup()); 

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
    // $ANTLR end "ruleScenarioOptional"


    // $ANTLR start "entryRuleScenarioAlternatives"
    // InternalKant.g:853:1: entryRuleScenarioAlternatives : ruleScenarioAlternatives EOF ;
    public final void entryRuleScenarioAlternatives() throws RecognitionException {
        try {
            // InternalKant.g:854:1: ( ruleScenarioAlternatives EOF )
            // InternalKant.g:855:1: ruleScenarioAlternatives EOF
            {
             before(grammarAccess.getScenarioAlternativesRule()); 
            pushFollow(FOLLOW_1);
            ruleScenarioAlternatives();

            state._fsp--;

             after(grammarAccess.getScenarioAlternativesRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleScenarioAlternatives"


    // $ANTLR start "ruleScenarioAlternatives"
    // InternalKant.g:862:1: ruleScenarioAlternatives : ( ( rule__ScenarioAlternatives__Group__0 ) ) ;
    public final void ruleScenarioAlternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:866:2: ( ( ( rule__ScenarioAlternatives__Group__0 ) ) )
            // InternalKant.g:867:2: ( ( rule__ScenarioAlternatives__Group__0 ) )
            {
            // InternalKant.g:867:2: ( ( rule__ScenarioAlternatives__Group__0 ) )
            // InternalKant.g:868:3: ( rule__ScenarioAlternatives__Group__0 )
            {
             before(grammarAccess.getScenarioAlternativesAccess().getGroup()); 
            // InternalKant.g:869:3: ( rule__ScenarioAlternatives__Group__0 )
            // InternalKant.g:869:4: rule__ScenarioAlternatives__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ScenarioAlternatives__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getScenarioAlternativesAccess().getGroup()); 

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
    // $ANTLR end "ruleScenarioAlternatives"


    // $ANTLR start "entryRuleScenario"
    // InternalKant.g:878:1: entryRuleScenario : ruleScenario EOF ;
    public final void entryRuleScenario() throws RecognitionException {
        try {
            // InternalKant.g:879:1: ( ruleScenario EOF )
            // InternalKant.g:880:1: ruleScenario EOF
            {
             before(grammarAccess.getScenarioRule()); 
            pushFollow(FOLLOW_1);
            ruleScenario();

            state._fsp--;

             after(grammarAccess.getScenarioRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleScenario"


    // $ANTLR start "ruleScenario"
    // InternalKant.g:887:1: ruleScenario : ( ( rule__Scenario__Group__0 ) ) ;
    public final void ruleScenario() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:891:2: ( ( ( rule__Scenario__Group__0 ) ) )
            // InternalKant.g:892:2: ( ( rule__Scenario__Group__0 ) )
            {
            // InternalKant.g:892:2: ( ( rule__Scenario__Group__0 ) )
            // InternalKant.g:893:3: ( rule__Scenario__Group__0 )
            {
             before(grammarAccess.getScenarioAccess().getGroup()); 
            // InternalKant.g:894:3: ( rule__Scenario__Group__0 )
            // InternalKant.g:894:4: rule__Scenario__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Scenario__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getScenarioAccess().getGroup()); 

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
    // $ANTLR end "ruleScenario"


    // $ANTLR start "entryRuleCheck"
    // InternalKant.g:903:1: entryRuleCheck : ruleCheck EOF ;
    public final void entryRuleCheck() throws RecognitionException {
        try {
            // InternalKant.g:904:1: ( ruleCheck EOF )
            // InternalKant.g:905:1: ruleCheck EOF
            {
             before(grammarAccess.getCheckRule()); 
            pushFollow(FOLLOW_1);
            ruleCheck();

            state._fsp--;

             after(grammarAccess.getCheckRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleCheck"


    // $ANTLR start "ruleCheck"
    // InternalKant.g:912:1: ruleCheck : ( ( rule__Check__Group__0 ) ) ;
    public final void ruleCheck() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:916:2: ( ( ( rule__Check__Group__0 ) ) )
            // InternalKant.g:917:2: ( ( rule__Check__Group__0 ) )
            {
            // InternalKant.g:917:2: ( ( rule__Check__Group__0 ) )
            // InternalKant.g:918:3: ( rule__Check__Group__0 )
            {
             before(grammarAccess.getCheckAccess().getGroup()); 
            // InternalKant.g:919:3: ( rule__Check__Group__0 )
            // InternalKant.g:919:4: rule__Check__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Check__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCheckAccess().getGroup()); 

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
    // $ANTLR end "ruleCheck"


    // $ANTLR start "entryRuleKnowledgeCheck"
    // InternalKant.g:928:1: entryRuleKnowledgeCheck : ruleKnowledgeCheck EOF ;
    public final void entryRuleKnowledgeCheck() throws RecognitionException {
        try {
            // InternalKant.g:929:1: ( ruleKnowledgeCheck EOF )
            // InternalKant.g:930:1: ruleKnowledgeCheck EOF
            {
             before(grammarAccess.getKnowledgeCheckRule()); 
            pushFollow(FOLLOW_1);
            ruleKnowledgeCheck();

            state._fsp--;

             after(grammarAccess.getKnowledgeCheckRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleKnowledgeCheck"


    // $ANTLR start "ruleKnowledgeCheck"
    // InternalKant.g:937:1: ruleKnowledgeCheck : ( ( rule__KnowledgeCheck__Group__0 ) ) ;
    public final void ruleKnowledgeCheck() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:941:2: ( ( ( rule__KnowledgeCheck__Group__0 ) ) )
            // InternalKant.g:942:2: ( ( rule__KnowledgeCheck__Group__0 ) )
            {
            // InternalKant.g:942:2: ( ( rule__KnowledgeCheck__Group__0 ) )
            // InternalKant.g:943:3: ( rule__KnowledgeCheck__Group__0 )
            {
             before(grammarAccess.getKnowledgeCheckAccess().getGroup()); 
            // InternalKant.g:944:3: ( rule__KnowledgeCheck__Group__0 )
            // InternalKant.g:944:4: rule__KnowledgeCheck__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__KnowledgeCheck__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getKnowledgeCheckAccess().getGroup()); 

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
    // $ANTLR end "ruleKnowledgeCheck"


    // $ANTLR start "entryRuleEqualityCheck"
    // InternalKant.g:953:1: entryRuleEqualityCheck : ruleEqualityCheck EOF ;
    public final void entryRuleEqualityCheck() throws RecognitionException {
        try {
            // InternalKant.g:954:1: ( ruleEqualityCheck EOF )
            // InternalKant.g:955:1: ruleEqualityCheck EOF
            {
             before(grammarAccess.getEqualityCheckRule()); 
            pushFollow(FOLLOW_1);
            ruleEqualityCheck();

            state._fsp--;

             after(grammarAccess.getEqualityCheckRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEqualityCheck"


    // $ANTLR start "ruleEqualityCheck"
    // InternalKant.g:962:1: ruleEqualityCheck : ( ( rule__EqualityCheck__Group__0 ) ) ;
    public final void ruleEqualityCheck() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:966:2: ( ( ( rule__EqualityCheck__Group__0 ) ) )
            // InternalKant.g:967:2: ( ( rule__EqualityCheck__Group__0 ) )
            {
            // InternalKant.g:967:2: ( ( rule__EqualityCheck__Group__0 ) )
            // InternalKant.g:968:3: ( rule__EqualityCheck__Group__0 )
            {
             before(grammarAccess.getEqualityCheckAccess().getGroup()); 
            // InternalKant.g:969:3: ( rule__EqualityCheck__Group__0 )
            // InternalKant.g:969:4: rule__EqualityCheck__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EqualityCheck__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEqualityCheckAccess().getGroup()); 

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
    // $ANTLR end "ruleEqualityCheck"


    // $ANTLR start "entryRuleFreshnessCheck"
    // InternalKant.g:978:1: entryRuleFreshnessCheck : ruleFreshnessCheck EOF ;
    public final void entryRuleFreshnessCheck() throws RecognitionException {
        try {
            // InternalKant.g:979:1: ( ruleFreshnessCheck EOF )
            // InternalKant.g:980:1: ruleFreshnessCheck EOF
            {
             before(grammarAccess.getFreshnessCheckRule()); 
            pushFollow(FOLLOW_1);
            ruleFreshnessCheck();

            state._fsp--;

             after(grammarAccess.getFreshnessCheckRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleFreshnessCheck"


    // $ANTLR start "ruleFreshnessCheck"
    // InternalKant.g:987:1: ruleFreshnessCheck : ( ( rule__FreshnessCheck__Group__0 ) ) ;
    public final void ruleFreshnessCheck() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:991:2: ( ( ( rule__FreshnessCheck__Group__0 ) ) )
            // InternalKant.g:992:2: ( ( rule__FreshnessCheck__Group__0 ) )
            {
            // InternalKant.g:992:2: ( ( rule__FreshnessCheck__Group__0 ) )
            // InternalKant.g:993:3: ( rule__FreshnessCheck__Group__0 )
            {
             before(grammarAccess.getFreshnessCheckAccess().getGroup()); 
            // InternalKant.g:994:3: ( rule__FreshnessCheck__Group__0 )
            // InternalKant.g:994:4: rule__FreshnessCheck__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FreshnessCheck__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFreshnessCheckAccess().getGroup()); 

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
    // $ANTLR end "ruleFreshnessCheck"


    // $ANTLR start "entryRuleLinkabilityCheck"
    // InternalKant.g:1003:1: entryRuleLinkabilityCheck : ruleLinkabilityCheck EOF ;
    public final void entryRuleLinkabilityCheck() throws RecognitionException {
        try {
            // InternalKant.g:1004:1: ( ruleLinkabilityCheck EOF )
            // InternalKant.g:1005:1: ruleLinkabilityCheck EOF
            {
             before(grammarAccess.getLinkabilityCheckRule()); 
            pushFollow(FOLLOW_1);
            ruleLinkabilityCheck();

            state._fsp--;

             after(grammarAccess.getLinkabilityCheckRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleLinkabilityCheck"


    // $ANTLR start "ruleLinkabilityCheck"
    // InternalKant.g:1012:1: ruleLinkabilityCheck : ( ( rule__LinkabilityCheck__Group__0 ) ) ;
    public final void ruleLinkabilityCheck() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:1016:2: ( ( ( rule__LinkabilityCheck__Group__0 ) ) )
            // InternalKant.g:1017:2: ( ( rule__LinkabilityCheck__Group__0 ) )
            {
            // InternalKant.g:1017:2: ( ( rule__LinkabilityCheck__Group__0 ) )
            // InternalKant.g:1018:3: ( rule__LinkabilityCheck__Group__0 )
            {
             before(grammarAccess.getLinkabilityCheckAccess().getGroup()); 
            // InternalKant.g:1019:3: ( rule__LinkabilityCheck__Group__0 )
            // InternalKant.g:1019:4: rule__LinkabilityCheck__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LinkabilityCheck__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLinkabilityCheckAccess().getGroup()); 

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
    // $ANTLR end "ruleLinkabilityCheck"


    // $ANTLR start "entryRuleAuthenticationCheck"
    // InternalKant.g:1028:1: entryRuleAuthenticationCheck : ruleAuthenticationCheck EOF ;
    public final void entryRuleAuthenticationCheck() throws RecognitionException {
        try {
            // InternalKant.g:1029:1: ( ruleAuthenticationCheck EOF )
            // InternalKant.g:1030:1: ruleAuthenticationCheck EOF
            {
             before(grammarAccess.getAuthenticationCheckRule()); 
            pushFollow(FOLLOW_1);
            ruleAuthenticationCheck();

            state._fsp--;

             after(grammarAccess.getAuthenticationCheckRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAuthenticationCheck"


    // $ANTLR start "ruleAuthenticationCheck"
    // InternalKant.g:1037:1: ruleAuthenticationCheck : ( ( rule__AuthenticationCheck__Group__0 ) ) ;
    public final void ruleAuthenticationCheck() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:1041:2: ( ( ( rule__AuthenticationCheck__Group__0 ) ) )
            // InternalKant.g:1042:2: ( ( rule__AuthenticationCheck__Group__0 ) )
            {
            // InternalKant.g:1042:2: ( ( rule__AuthenticationCheck__Group__0 ) )
            // InternalKant.g:1043:3: ( rule__AuthenticationCheck__Group__0 )
            {
             before(grammarAccess.getAuthenticationCheckAccess().getGroup()); 
            // InternalKant.g:1044:3: ( rule__AuthenticationCheck__Group__0 )
            // InternalKant.g:1044:4: rule__AuthenticationCheck__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AuthenticationCheck__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAuthenticationCheckAccess().getGroup()); 

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
    // $ANTLR end "ruleAuthenticationCheck"


    // $ANTLR start "rule__Element__Alternatives"
    // InternalKant.g:1052:1: rule__Element__Alternatives : ( ( ruleFunctionDef ) | ( rulePropertyDef ) | ( ruleKnowledgeBase ) | ( rulePrincipal ) | ( ruleCommunication ) | ( ruleScenarioBranching ) | ( ruleCheck ) );
    public final void rule__Element__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:1056:1: ( ( ruleFunctionDef ) | ( rulePropertyDef ) | ( ruleKnowledgeBase ) | ( rulePrincipal ) | ( ruleCommunication ) | ( ruleScenarioBranching ) | ( ruleCheck ) )
            int alt2=7;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt2=1;
                }
                break;
            case 23:
                {
                alt2=2;
                }
                break;
            case 26:
            case 47:
                {
                alt2=3;
                }
                break;
            case 27:
                {
                alt2=4;
                }
                break;
            case RULE_ID:
                {
                alt2=5;
                }
                break;
            case 35:
            case 36:
                {
                alt2=6;
                }
                break;
            case 38:
                {
                alt2=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalKant.g:1057:2: ( ruleFunctionDef )
                    {
                    // InternalKant.g:1057:2: ( ruleFunctionDef )
                    // InternalKant.g:1058:3: ruleFunctionDef
                    {
                     before(grammarAccess.getElementAccess().getFunctionDefParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleFunctionDef();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getFunctionDefParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalKant.g:1063:2: ( rulePropertyDef )
                    {
                    // InternalKant.g:1063:2: ( rulePropertyDef )
                    // InternalKant.g:1064:3: rulePropertyDef
                    {
                     before(grammarAccess.getElementAccess().getPropertyDefParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    rulePropertyDef();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getPropertyDefParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalKant.g:1069:2: ( ruleKnowledgeBase )
                    {
                    // InternalKant.g:1069:2: ( ruleKnowledgeBase )
                    // InternalKant.g:1070:3: ruleKnowledgeBase
                    {
                     before(grammarAccess.getElementAccess().getKnowledgeBaseParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleKnowledgeBase();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getKnowledgeBaseParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalKant.g:1075:2: ( rulePrincipal )
                    {
                    // InternalKant.g:1075:2: ( rulePrincipal )
                    // InternalKant.g:1076:3: rulePrincipal
                    {
                     before(grammarAccess.getElementAccess().getPrincipalParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    rulePrincipal();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getPrincipalParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalKant.g:1081:2: ( ruleCommunication )
                    {
                    // InternalKant.g:1081:2: ( ruleCommunication )
                    // InternalKant.g:1082:3: ruleCommunication
                    {
                     before(grammarAccess.getElementAccess().getCommunicationParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleCommunication();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getCommunicationParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalKant.g:1087:2: ( ruleScenarioBranching )
                    {
                    // InternalKant.g:1087:2: ( ruleScenarioBranching )
                    // InternalKant.g:1088:3: ruleScenarioBranching
                    {
                     before(grammarAccess.getElementAccess().getScenarioBranchingParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleScenarioBranching();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getScenarioBranchingParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalKant.g:1093:2: ( ruleCheck )
                    {
                    // InternalKant.g:1093:2: ( ruleCheck )
                    // InternalKant.g:1094:3: ruleCheck
                    {
                     before(grammarAccess.getElementAccess().getCheckParserRuleCall_6()); 
                    pushFollow(FOLLOW_2);
                    ruleCheck();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getCheckParserRuleCall_6()); 

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
    // $ANTLR end "rule__Element__Alternatives"


    // $ANTLR start "rule__FunctionKey__Alternatives"
    // InternalKant.g:1103:1: rule__FunctionKey__Alternatives : ( ( ( rule__FunctionKey__ElementsAssignment_0 ) ) | ( ( rule__FunctionKey__Group_1__0 ) ) );
    public final void rule__FunctionKey__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:1107:1: ( ( ( rule__FunctionKey__ElementsAssignment_0 ) ) | ( ( rule__FunctionKey__Group_1__0 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                alt3=1;
            }
            else if ( (LA3_0==21) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalKant.g:1108:2: ( ( rule__FunctionKey__ElementsAssignment_0 ) )
                    {
                    // InternalKant.g:1108:2: ( ( rule__FunctionKey__ElementsAssignment_0 ) )
                    // InternalKant.g:1109:3: ( rule__FunctionKey__ElementsAssignment_0 )
                    {
                     before(grammarAccess.getFunctionKeyAccess().getElementsAssignment_0()); 
                    // InternalKant.g:1110:3: ( rule__FunctionKey__ElementsAssignment_0 )
                    // InternalKant.g:1110:4: rule__FunctionKey__ElementsAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FunctionKey__ElementsAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFunctionKeyAccess().getElementsAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalKant.g:1114:2: ( ( rule__FunctionKey__Group_1__0 ) )
                    {
                    // InternalKant.g:1114:2: ( ( rule__FunctionKey__Group_1__0 ) )
                    // InternalKant.g:1115:3: ( rule__FunctionKey__Group_1__0 )
                    {
                     before(grammarAccess.getFunctionKeyAccess().getGroup_1()); 
                    // InternalKant.g:1116:3: ( rule__FunctionKey__Group_1__0 )
                    // InternalKant.g:1116:4: rule__FunctionKey__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FunctionKey__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFunctionKeyAccess().getGroup_1()); 

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
    // $ANTLR end "rule__FunctionKey__Alternatives"


    // $ANTLR start "rule__FunctionReturn__Alternatives"
    // InternalKant.g:1124:1: rule__FunctionReturn__Alternatives : ( ( ( rule__FunctionReturn__ElementsAssignment_0 ) ) | ( ( rule__FunctionReturn__Group_1__0 ) ) );
    public final void rule__FunctionReturn__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:1128:1: ( ( ( rule__FunctionReturn__ElementsAssignment_0 ) ) | ( ( rule__FunctionReturn__Group_1__0 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                alt4=1;
            }
            else if ( (LA4_0==21) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalKant.g:1129:2: ( ( rule__FunctionReturn__ElementsAssignment_0 ) )
                    {
                    // InternalKant.g:1129:2: ( ( rule__FunctionReturn__ElementsAssignment_0 ) )
                    // InternalKant.g:1130:3: ( rule__FunctionReturn__ElementsAssignment_0 )
                    {
                     before(grammarAccess.getFunctionReturnAccess().getElementsAssignment_0()); 
                    // InternalKant.g:1131:3: ( rule__FunctionReturn__ElementsAssignment_0 )
                    // InternalKant.g:1131:4: rule__FunctionReturn__ElementsAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FunctionReturn__ElementsAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFunctionReturnAccess().getElementsAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalKant.g:1135:2: ( ( rule__FunctionReturn__Group_1__0 ) )
                    {
                    // InternalKant.g:1135:2: ( ( rule__FunctionReturn__Group_1__0 ) )
                    // InternalKant.g:1136:3: ( rule__FunctionReturn__Group_1__0 )
                    {
                     before(grammarAccess.getFunctionReturnAccess().getGroup_1()); 
                    // InternalKant.g:1137:3: ( rule__FunctionReturn__Group_1__0 )
                    // InternalKant.g:1137:4: rule__FunctionReturn__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FunctionReturn__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFunctionReturnAccess().getGroup_1()); 

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
    // $ANTLR end "rule__FunctionReturn__Alternatives"


    // $ANTLR start "rule__PropertyDef__PropertyAlternatives_1_0"
    // InternalKant.g:1145:1: rule__PropertyDef__PropertyAlternatives_1_0 : ( ( ruleKnowledgeEqualityDef ) | ( ruleFunctionInversionDef ) );
    public final void rule__PropertyDef__PropertyAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:1149:1: ( ( ruleKnowledgeEqualityDef ) | ( ruleFunctionInversionDef ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==11||LA5_0==21||LA5_0==29||LA5_0==34) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_ID) ) {
                int LA5_2 = input.LA(2);

                if ( (LA5_2==15||LA5_2==24||LA5_2==33) ) {
                    alt5=1;
                }
                else if ( (LA5_2==25) ) {
                    alt5=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalKant.g:1150:2: ( ruleKnowledgeEqualityDef )
                    {
                    // InternalKant.g:1150:2: ( ruleKnowledgeEqualityDef )
                    // InternalKant.g:1151:3: ruleKnowledgeEqualityDef
                    {
                     before(grammarAccess.getPropertyDefAccess().getPropertyKnowledgeEqualityDefParserRuleCall_1_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleKnowledgeEqualityDef();

                    state._fsp--;

                     after(grammarAccess.getPropertyDefAccess().getPropertyKnowledgeEqualityDefParserRuleCall_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalKant.g:1156:2: ( ruleFunctionInversionDef )
                    {
                    // InternalKant.g:1156:2: ( ruleFunctionInversionDef )
                    // InternalKant.g:1157:3: ruleFunctionInversionDef
                    {
                     before(grammarAccess.getPropertyDefAccess().getPropertyFunctionInversionDefParserRuleCall_1_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleFunctionInversionDef();

                    state._fsp--;

                     after(grammarAccess.getPropertyDefAccess().getPropertyFunctionInversionDefParserRuleCall_1_0_1()); 

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
    // $ANTLR end "rule__PropertyDef__PropertyAlternatives_1_0"


    // $ANTLR start "rule__Knowledge__Alternatives"
    // InternalKant.g:1166:1: rule__Knowledge__Alternatives : ( ( ruleKnowledgeDef ) | ( ruleKnowledgeValue ) );
    public final void rule__Knowledge__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:1170:1: ( ( ruleKnowledgeDef ) | ( ruleKnowledgeValue ) )
            int alt6=2;
            alt6 = dfa6.predict(input);
            switch (alt6) {
                case 1 :
                    // InternalKant.g:1171:2: ( ruleKnowledgeDef )
                    {
                    // InternalKant.g:1171:2: ( ruleKnowledgeDef )
                    // InternalKant.g:1172:3: ruleKnowledgeDef
                    {
                     before(grammarAccess.getKnowledgeAccess().getKnowledgeDefParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleKnowledgeDef();

                    state._fsp--;

                     after(grammarAccess.getKnowledgeAccess().getKnowledgeDefParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalKant.g:1177:2: ( ruleKnowledgeValue )
                    {
                    // InternalKant.g:1177:2: ( ruleKnowledgeValue )
                    // InternalKant.g:1178:3: ruleKnowledgeValue
                    {
                     before(grammarAccess.getKnowledgeAccess().getKnowledgeValueParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleKnowledgeValue();

                    state._fsp--;

                     after(grammarAccess.getKnowledgeAccess().getKnowledgeValueParserRuleCall_1()); 

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
    // $ANTLR end "rule__Knowledge__Alternatives"


    // $ANTLR start "rule__KnowledgeDef__Alternatives"
    // InternalKant.g:1187:1: rule__KnowledgeDef__Alternatives : ( ( ( rule__KnowledgeDef__Group_0__0 ) ) | ( ( rule__KnowledgeDef__Group_1__0 ) ) );
    public final void rule__KnowledgeDef__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:1191:1: ( ( ( rule__KnowledgeDef__Group_0__0 ) ) | ( ( rule__KnowledgeDef__Group_1__0 ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ID||LA7_0==21||LA7_0==29) ) {
                alt7=1;
            }
            else if ( ((LA7_0>=9 && LA7_0<=10)) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalKant.g:1192:2: ( ( rule__KnowledgeDef__Group_0__0 ) )
                    {
                    // InternalKant.g:1192:2: ( ( rule__KnowledgeDef__Group_0__0 ) )
                    // InternalKant.g:1193:3: ( rule__KnowledgeDef__Group_0__0 )
                    {
                     before(grammarAccess.getKnowledgeDefAccess().getGroup_0()); 
                    // InternalKant.g:1194:3: ( rule__KnowledgeDef__Group_0__0 )
                    // InternalKant.g:1194:4: rule__KnowledgeDef__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__KnowledgeDef__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getKnowledgeDefAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalKant.g:1198:2: ( ( rule__KnowledgeDef__Group_1__0 ) )
                    {
                    // InternalKant.g:1198:2: ( ( rule__KnowledgeDef__Group_1__0 ) )
                    // InternalKant.g:1199:3: ( rule__KnowledgeDef__Group_1__0 )
                    {
                     before(grammarAccess.getKnowledgeDefAccess().getGroup_1()); 
                    // InternalKant.g:1200:3: ( rule__KnowledgeDef__Group_1__0 )
                    // InternalKant.g:1200:4: rule__KnowledgeDef__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__KnowledgeDef__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getKnowledgeDefAccess().getGroup_1()); 

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
    // $ANTLR end "rule__KnowledgeDef__Alternatives"


    // $ANTLR start "rule__KnowledgeDef__Alternatives_0_0"
    // InternalKant.g:1208:1: rule__KnowledgeDef__Alternatives_0_0 : ( ( ( rule__KnowledgeDef__NameAssignment_0_0_0 ) ) | ( ruleKnowledgeDefDestructuring ) );
    public final void rule__KnowledgeDef__Alternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:1212:1: ( ( ( rule__KnowledgeDef__NameAssignment_0_0_0 ) ) | ( ruleKnowledgeDefDestructuring ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ID) ) {
                alt8=1;
            }
            else if ( (LA8_0==21||LA8_0==29) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalKant.g:1213:2: ( ( rule__KnowledgeDef__NameAssignment_0_0_0 ) )
                    {
                    // InternalKant.g:1213:2: ( ( rule__KnowledgeDef__NameAssignment_0_0_0 ) )
                    // InternalKant.g:1214:3: ( rule__KnowledgeDef__NameAssignment_0_0_0 )
                    {
                     before(grammarAccess.getKnowledgeDefAccess().getNameAssignment_0_0_0()); 
                    // InternalKant.g:1215:3: ( rule__KnowledgeDef__NameAssignment_0_0_0 )
                    // InternalKant.g:1215:4: rule__KnowledgeDef__NameAssignment_0_0_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__KnowledgeDef__NameAssignment_0_0_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getKnowledgeDefAccess().getNameAssignment_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalKant.g:1219:2: ( ruleKnowledgeDefDestructuring )
                    {
                    // InternalKant.g:1219:2: ( ruleKnowledgeDefDestructuring )
                    // InternalKant.g:1220:3: ruleKnowledgeDefDestructuring
                    {
                     before(grammarAccess.getKnowledgeDefAccess().getKnowledgeDefDestructuringParserRuleCall_0_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleKnowledgeDefDestructuring();

                    state._fsp--;

                     after(grammarAccess.getKnowledgeDefAccess().getKnowledgeDefDestructuringParserRuleCall_0_0_1()); 

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
    // $ANTLR end "rule__KnowledgeDef__Alternatives_0_0"


    // $ANTLR start "rule__KnowledgeDef__Alternatives_1_0"
    // InternalKant.g:1229:1: rule__KnowledgeDef__Alternatives_1_0 : ( ( 'const' ) | ( 'fresh' ) );
    public final void rule__KnowledgeDef__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:1233:1: ( ( 'const' ) | ( 'fresh' ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==9) ) {
                alt9=1;
            }
            else if ( (LA9_0==10) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalKant.g:1234:2: ( 'const' )
                    {
                    // InternalKant.g:1234:2: ( 'const' )
                    // InternalKant.g:1235:3: 'const'
                    {
                     before(grammarAccess.getKnowledgeDefAccess().getConstKeyword_1_0_0()); 
                    match(input,9,FOLLOW_2); 
                     after(grammarAccess.getKnowledgeDefAccess().getConstKeyword_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalKant.g:1240:2: ( 'fresh' )
                    {
                    // InternalKant.g:1240:2: ( 'fresh' )
                    // InternalKant.g:1241:3: 'fresh'
                    {
                     before(grammarAccess.getKnowledgeDefAccess().getFreshKeyword_1_0_1()); 
                    match(input,10,FOLLOW_2); 
                     after(grammarAccess.getKnowledgeDefAccess().getFreshKeyword_1_0_1()); 

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
    // $ANTLR end "rule__KnowledgeDef__Alternatives_1_0"


    // $ANTLR start "rule__KnowledgeDef__Alternatives_1_1"
    // InternalKant.g:1250:1: rule__KnowledgeDef__Alternatives_1_1 : ( ( ( rule__KnowledgeDef__NameAssignment_1_1_0 ) ) | ( ( rule__KnowledgeDef__Group_1_1_1__0 ) ) );
    public final void rule__KnowledgeDef__Alternatives_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:1254:1: ( ( ( rule__KnowledgeDef__NameAssignment_1_1_0 ) ) | ( ( rule__KnowledgeDef__Group_1_1_1__0 ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ID) ) {
                alt10=1;
            }
            else if ( (LA10_0==21) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalKant.g:1255:2: ( ( rule__KnowledgeDef__NameAssignment_1_1_0 ) )
                    {
                    // InternalKant.g:1255:2: ( ( rule__KnowledgeDef__NameAssignment_1_1_0 ) )
                    // InternalKant.g:1256:3: ( rule__KnowledgeDef__NameAssignment_1_1_0 )
                    {
                     before(grammarAccess.getKnowledgeDefAccess().getNameAssignment_1_1_0()); 
                    // InternalKant.g:1257:3: ( rule__KnowledgeDef__NameAssignment_1_1_0 )
                    // InternalKant.g:1257:4: rule__KnowledgeDef__NameAssignment_1_1_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__KnowledgeDef__NameAssignment_1_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getKnowledgeDefAccess().getNameAssignment_1_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalKant.g:1261:2: ( ( rule__KnowledgeDef__Group_1_1_1__0 ) )
                    {
                    // InternalKant.g:1261:2: ( ( rule__KnowledgeDef__Group_1_1_1__0 ) )
                    // InternalKant.g:1262:3: ( rule__KnowledgeDef__Group_1_1_1__0 )
                    {
                     before(grammarAccess.getKnowledgeDefAccess().getGroup_1_1_1()); 
                    // InternalKant.g:1263:3: ( rule__KnowledgeDef__Group_1_1_1__0 )
                    // InternalKant.g:1263:4: rule__KnowledgeDef__Group_1_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__KnowledgeDef__Group_1_1_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getKnowledgeDefAccess().getGroup_1_1_1()); 

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
    // $ANTLR end "rule__KnowledgeDef__Alternatives_1_1"


    // $ANTLR start "rule__KnowledgeDefDestructuring__Alternatives"
    // InternalKant.g:1271:1: rule__KnowledgeDefDestructuring__Alternatives : ( ( ruleKnowledgeDefSetDestructuring ) | ( ruleKnowledgeDefListDestructuring ) );
    public final void rule__KnowledgeDefDestructuring__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:1275:1: ( ( ruleKnowledgeDefSetDestructuring ) | ( ruleKnowledgeDefListDestructuring ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==21) ) {
                alt11=1;
            }
            else if ( (LA11_0==29) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalKant.g:1276:2: ( ruleKnowledgeDefSetDestructuring )
                    {
                    // InternalKant.g:1276:2: ( ruleKnowledgeDefSetDestructuring )
                    // InternalKant.g:1277:3: ruleKnowledgeDefSetDestructuring
                    {
                     before(grammarAccess.getKnowledgeDefDestructuringAccess().getKnowledgeDefSetDestructuringParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleKnowledgeDefSetDestructuring();

                    state._fsp--;

                     after(grammarAccess.getKnowledgeDefDestructuringAccess().getKnowledgeDefSetDestructuringParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalKant.g:1282:2: ( ruleKnowledgeDefListDestructuring )
                    {
                    // InternalKant.g:1282:2: ( ruleKnowledgeDefListDestructuring )
                    // InternalKant.g:1283:3: ruleKnowledgeDefListDestructuring
                    {
                     before(grammarAccess.getKnowledgeDefDestructuringAccess().getKnowledgeDefListDestructuringParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleKnowledgeDefListDestructuring();

                    state._fsp--;

                     after(grammarAccess.getKnowledgeDefDestructuringAccess().getKnowledgeDefListDestructuringParserRuleCall_1()); 

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
    // $ANTLR end "rule__KnowledgeDefDestructuring__Alternatives"


    // $ANTLR start "rule__KnowledgeDefListDesctructuringAssignment__Alternatives"
    // InternalKant.g:1292:1: rule__KnowledgeDefListDesctructuringAssignment__Alternatives : ( ( ( rule__KnowledgeDefListDesctructuringAssignment__Group_0__0 ) ) | ( ( rule__KnowledgeDefListDesctructuringAssignment__Group_1__0 ) ) | ( ( rule__KnowledgeDefListDesctructuringAssignment__NameAssignment_2 ) ) );
    public final void rule__KnowledgeDefListDesctructuringAssignment__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:1296:1: ( ( ( rule__KnowledgeDefListDesctructuringAssignment__Group_0__0 ) ) | ( ( rule__KnowledgeDefListDesctructuringAssignment__Group_1__0 ) ) | ( ( rule__KnowledgeDefListDesctructuringAssignment__NameAssignment_2 ) ) )
            int alt12=3;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt12=1;
                }
                break;
            case 32:
                {
                alt12=2;
                }
                break;
            case RULE_ID:
                {
                alt12=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalKant.g:1297:2: ( ( rule__KnowledgeDefListDesctructuringAssignment__Group_0__0 ) )
                    {
                    // InternalKant.g:1297:2: ( ( rule__KnowledgeDefListDesctructuringAssignment__Group_0__0 ) )
                    // InternalKant.g:1298:3: ( rule__KnowledgeDefListDesctructuringAssignment__Group_0__0 )
                    {
                     before(grammarAccess.getKnowledgeDefListDesctructuringAssignmentAccess().getGroup_0()); 
                    // InternalKant.g:1299:3: ( rule__KnowledgeDefListDesctructuringAssignment__Group_0__0 )
                    // InternalKant.g:1299:4: rule__KnowledgeDefListDesctructuringAssignment__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__KnowledgeDefListDesctructuringAssignment__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getKnowledgeDefListDesctructuringAssignmentAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalKant.g:1303:2: ( ( rule__KnowledgeDefListDesctructuringAssignment__Group_1__0 ) )
                    {
                    // InternalKant.g:1303:2: ( ( rule__KnowledgeDefListDesctructuringAssignment__Group_1__0 ) )
                    // InternalKant.g:1304:3: ( rule__KnowledgeDefListDesctructuringAssignment__Group_1__0 )
                    {
                     before(grammarAccess.getKnowledgeDefListDesctructuringAssignmentAccess().getGroup_1()); 
                    // InternalKant.g:1305:3: ( rule__KnowledgeDefListDesctructuringAssignment__Group_1__0 )
                    // InternalKant.g:1305:4: rule__KnowledgeDefListDesctructuringAssignment__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__KnowledgeDefListDesctructuringAssignment__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getKnowledgeDefListDesctructuringAssignmentAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalKant.g:1309:2: ( ( rule__KnowledgeDefListDesctructuringAssignment__NameAssignment_2 ) )
                    {
                    // InternalKant.g:1309:2: ( ( rule__KnowledgeDefListDesctructuringAssignment__NameAssignment_2 ) )
                    // InternalKant.g:1310:3: ( rule__KnowledgeDefListDesctructuringAssignment__NameAssignment_2 )
                    {
                     before(grammarAccess.getKnowledgeDefListDesctructuringAssignmentAccess().getNameAssignment_2()); 
                    // InternalKant.g:1311:3: ( rule__KnowledgeDefListDesctructuringAssignment__NameAssignment_2 )
                    // InternalKant.g:1311:4: rule__KnowledgeDefListDesctructuringAssignment__NameAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__KnowledgeDefListDesctructuringAssignment__NameAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getKnowledgeDefListDesctructuringAssignmentAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__KnowledgeDefListDesctructuringAssignment__Alternatives"


    // $ANTLR start "rule__KnowledgeValue__Alternatives"
    // InternalKant.g:1319:1: rule__KnowledgeValue__Alternatives : ( ( ruleKnowledgeRef ) | ( ruleKnowledgeList ) | ( ruleKnowledgeSet ) | ( ruleKnowledgeGenerator ) | ( ruleKnowledgeFromFunction ) );
    public final void rule__KnowledgeValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:1323:1: ( ( ruleKnowledgeRef ) | ( ruleKnowledgeList ) | ( ruleKnowledgeSet ) | ( ruleKnowledgeGenerator ) | ( ruleKnowledgeFromFunction ) )
            int alt13=5;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                int LA13_1 = input.LA(2);

                if ( (LA13_1==15) ) {
                    alt13=5;
                }
                else if ( (LA13_1==EOF||LA13_1==RULE_ID||(LA13_1>=13 && LA13_1<=14)||LA13_1==16||LA13_1==18||(LA13_1>=22 && LA13_1<=24)||(LA13_1>=26 && LA13_1<=27)||LA13_1==30||LA13_1==33||(LA13_1>=35 && LA13_1<=36)||LA13_1==38||(LA13_1>=44 && LA13_1<=45)||LA13_1==47) ) {
                    alt13=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 1, input);

                    throw nvae;
                }
                }
                break;
            case 29:
                {
                alt13=2;
                }
                break;
            case 21:
                {
                alt13=3;
                }
                break;
            case 34:
                {
                alt13=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalKant.g:1324:2: ( ruleKnowledgeRef )
                    {
                    // InternalKant.g:1324:2: ( ruleKnowledgeRef )
                    // InternalKant.g:1325:3: ruleKnowledgeRef
                    {
                     before(grammarAccess.getKnowledgeValueAccess().getKnowledgeRefParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleKnowledgeRef();

                    state._fsp--;

                     after(grammarAccess.getKnowledgeValueAccess().getKnowledgeRefParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalKant.g:1330:2: ( ruleKnowledgeList )
                    {
                    // InternalKant.g:1330:2: ( ruleKnowledgeList )
                    // InternalKant.g:1331:3: ruleKnowledgeList
                    {
                     before(grammarAccess.getKnowledgeValueAccess().getKnowledgeListParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleKnowledgeList();

                    state._fsp--;

                     after(grammarAccess.getKnowledgeValueAccess().getKnowledgeListParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalKant.g:1336:2: ( ruleKnowledgeSet )
                    {
                    // InternalKant.g:1336:2: ( ruleKnowledgeSet )
                    // InternalKant.g:1337:3: ruleKnowledgeSet
                    {
                     before(grammarAccess.getKnowledgeValueAccess().getKnowledgeSetParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleKnowledgeSet();

                    state._fsp--;

                     after(grammarAccess.getKnowledgeValueAccess().getKnowledgeSetParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalKant.g:1342:2: ( ruleKnowledgeGenerator )
                    {
                    // InternalKant.g:1342:2: ( ruleKnowledgeGenerator )
                    // InternalKant.g:1343:3: ruleKnowledgeGenerator
                    {
                     before(grammarAccess.getKnowledgeValueAccess().getKnowledgeGeneratorParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleKnowledgeGenerator();

                    state._fsp--;

                     after(grammarAccess.getKnowledgeValueAccess().getKnowledgeGeneratorParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalKant.g:1348:2: ( ruleKnowledgeFromFunction )
                    {
                    // InternalKant.g:1348:2: ( ruleKnowledgeFromFunction )
                    // InternalKant.g:1349:3: ruleKnowledgeFromFunction
                    {
                     before(grammarAccess.getKnowledgeValueAccess().getKnowledgeFromFunctionParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleKnowledgeFromFunction();

                    state._fsp--;

                     after(grammarAccess.getKnowledgeValueAccess().getKnowledgeFromFunctionParserRuleCall_4()); 

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
    // $ANTLR end "rule__KnowledgeValue__Alternatives"


    // $ANTLR start "rule__KnowledgeList__ValuesAlternatives_2_0_0"
    // InternalKant.g:1358:1: rule__KnowledgeList__ValuesAlternatives_2_0_0 : ( ( ruleKnowledgeValue ) | ( ruleKnowledgeSpreading ) );
    public final void rule__KnowledgeList__ValuesAlternatives_2_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:1362:1: ( ( ruleKnowledgeValue ) | ( ruleKnowledgeSpreading ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_ID||LA14_0==21||LA14_0==29||LA14_0==34) ) {
                alt14=1;
            }
            else if ( (LA14_0==31) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalKant.g:1363:2: ( ruleKnowledgeValue )
                    {
                    // InternalKant.g:1363:2: ( ruleKnowledgeValue )
                    // InternalKant.g:1364:3: ruleKnowledgeValue
                    {
                     before(grammarAccess.getKnowledgeListAccess().getValuesKnowledgeValueParserRuleCall_2_0_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleKnowledgeValue();

                    state._fsp--;

                     after(grammarAccess.getKnowledgeListAccess().getValuesKnowledgeValueParserRuleCall_2_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalKant.g:1369:2: ( ruleKnowledgeSpreading )
                    {
                    // InternalKant.g:1369:2: ( ruleKnowledgeSpreading )
                    // InternalKant.g:1370:3: ruleKnowledgeSpreading
                    {
                     before(grammarAccess.getKnowledgeListAccess().getValuesKnowledgeSpreadingParserRuleCall_2_0_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleKnowledgeSpreading();

                    state._fsp--;

                     after(grammarAccess.getKnowledgeListAccess().getValuesKnowledgeSpreadingParserRuleCall_2_0_0_1()); 

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
    // $ANTLR end "rule__KnowledgeList__ValuesAlternatives_2_0_0"


    // $ANTLR start "rule__KnowledgeList__ValuesAlternatives_2_1_1_0"
    // InternalKant.g:1379:1: rule__KnowledgeList__ValuesAlternatives_2_1_1_0 : ( ( ruleKnowledgeValue ) | ( ruleKnowledgeSpreading ) );
    public final void rule__KnowledgeList__ValuesAlternatives_2_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:1383:1: ( ( ruleKnowledgeValue ) | ( ruleKnowledgeSpreading ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_ID||LA15_0==21||LA15_0==29||LA15_0==34) ) {
                alt15=1;
            }
            else if ( (LA15_0==31) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalKant.g:1384:2: ( ruleKnowledgeValue )
                    {
                    // InternalKant.g:1384:2: ( ruleKnowledgeValue )
                    // InternalKant.g:1385:3: ruleKnowledgeValue
                    {
                     before(grammarAccess.getKnowledgeListAccess().getValuesKnowledgeValueParserRuleCall_2_1_1_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleKnowledgeValue();

                    state._fsp--;

                     after(grammarAccess.getKnowledgeListAccess().getValuesKnowledgeValueParserRuleCall_2_1_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalKant.g:1390:2: ( ruleKnowledgeSpreading )
                    {
                    // InternalKant.g:1390:2: ( ruleKnowledgeSpreading )
                    // InternalKant.g:1391:3: ruleKnowledgeSpreading
                    {
                     before(grammarAccess.getKnowledgeListAccess().getValuesKnowledgeSpreadingParserRuleCall_2_1_1_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleKnowledgeSpreading();

                    state._fsp--;

                     after(grammarAccess.getKnowledgeListAccess().getValuesKnowledgeSpreadingParserRuleCall_2_1_1_0_1()); 

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
    // $ANTLR end "rule__KnowledgeList__ValuesAlternatives_2_1_1_0"


    // $ANTLR start "rule__KnowledgeSet__ContentAlternatives_2_0_0"
    // InternalKant.g:1400:1: rule__KnowledgeSet__ContentAlternatives_2_0_0 : ( ( ruleKnowledge ) | ( ruleKnowledgeSpreading ) );
    public final void rule__KnowledgeSet__ContentAlternatives_2_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:1404:1: ( ( ruleKnowledge ) | ( ruleKnowledgeSpreading ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_ID||(LA16_0>=9 && LA16_0<=10)||LA16_0==21||LA16_0==29||LA16_0==34) ) {
                alt16=1;
            }
            else if ( (LA16_0==31) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalKant.g:1405:2: ( ruleKnowledge )
                    {
                    // InternalKant.g:1405:2: ( ruleKnowledge )
                    // InternalKant.g:1406:3: ruleKnowledge
                    {
                     before(grammarAccess.getKnowledgeSetAccess().getContentKnowledgeParserRuleCall_2_0_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleKnowledge();

                    state._fsp--;

                     after(grammarAccess.getKnowledgeSetAccess().getContentKnowledgeParserRuleCall_2_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalKant.g:1411:2: ( ruleKnowledgeSpreading )
                    {
                    // InternalKant.g:1411:2: ( ruleKnowledgeSpreading )
                    // InternalKant.g:1412:3: ruleKnowledgeSpreading
                    {
                     before(grammarAccess.getKnowledgeSetAccess().getContentKnowledgeSpreadingParserRuleCall_2_0_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleKnowledgeSpreading();

                    state._fsp--;

                     after(grammarAccess.getKnowledgeSetAccess().getContentKnowledgeSpreadingParserRuleCall_2_0_0_1()); 

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
    // $ANTLR end "rule__KnowledgeSet__ContentAlternatives_2_0_0"


    // $ANTLR start "rule__KnowledgeSet__ContentAlternatives_2_1_1_0"
    // InternalKant.g:1421:1: rule__KnowledgeSet__ContentAlternatives_2_1_1_0 : ( ( ruleKnowledge ) | ( ruleKnowledgeSpreading ) );
    public final void rule__KnowledgeSet__ContentAlternatives_2_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:1425:1: ( ( ruleKnowledge ) | ( ruleKnowledgeSpreading ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_ID||(LA17_0>=9 && LA17_0<=10)||LA17_0==21||LA17_0==29||LA17_0==34) ) {
                alt17=1;
            }
            else if ( (LA17_0==31) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalKant.g:1426:2: ( ruleKnowledge )
                    {
                    // InternalKant.g:1426:2: ( ruleKnowledge )
                    // InternalKant.g:1427:3: ruleKnowledge
                    {
                     before(grammarAccess.getKnowledgeSetAccess().getContentKnowledgeParserRuleCall_2_1_1_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleKnowledge();

                    state._fsp--;

                     after(grammarAccess.getKnowledgeSetAccess().getContentKnowledgeParserRuleCall_2_1_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalKant.g:1432:2: ( ruleKnowledgeSpreading )
                    {
                    // InternalKant.g:1432:2: ( ruleKnowledgeSpreading )
                    // InternalKant.g:1433:3: ruleKnowledgeSpreading
                    {
                     before(grammarAccess.getKnowledgeSetAccess().getContentKnowledgeSpreadingParserRuleCall_2_1_1_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleKnowledgeSpreading();

                    state._fsp--;

                     after(grammarAccess.getKnowledgeSetAccess().getContentKnowledgeSpreadingParserRuleCall_2_1_1_0_1()); 

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
    // $ANTLR end "rule__KnowledgeSet__ContentAlternatives_2_1_1_0"


    // $ANTLR start "rule__KnowledgeSpreading__RefAlternatives_1_0"
    // InternalKant.g:1442:1: rule__KnowledgeSpreading__RefAlternatives_1_0 : ( ( ruleKnowledgeRef ) | ( ruleKnowledgeSet ) | ( ruleKnowledgeList ) );
    public final void rule__KnowledgeSpreading__RefAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:1446:1: ( ( ruleKnowledgeRef ) | ( ruleKnowledgeSet ) | ( ruleKnowledgeList ) )
            int alt18=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt18=1;
                }
                break;
            case 21:
                {
                alt18=2;
                }
                break;
            case 29:
                {
                alt18=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // InternalKant.g:1447:2: ( ruleKnowledgeRef )
                    {
                    // InternalKant.g:1447:2: ( ruleKnowledgeRef )
                    // InternalKant.g:1448:3: ruleKnowledgeRef
                    {
                     before(grammarAccess.getKnowledgeSpreadingAccess().getRefKnowledgeRefParserRuleCall_1_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleKnowledgeRef();

                    state._fsp--;

                     after(grammarAccess.getKnowledgeSpreadingAccess().getRefKnowledgeRefParserRuleCall_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalKant.g:1453:2: ( ruleKnowledgeSet )
                    {
                    // InternalKant.g:1453:2: ( ruleKnowledgeSet )
                    // InternalKant.g:1454:3: ruleKnowledgeSet
                    {
                     before(grammarAccess.getKnowledgeSpreadingAccess().getRefKnowledgeSetParserRuleCall_1_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleKnowledgeSet();

                    state._fsp--;

                     after(grammarAccess.getKnowledgeSpreadingAccess().getRefKnowledgeSetParserRuleCall_1_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalKant.g:1459:2: ( ruleKnowledgeList )
                    {
                    // InternalKant.g:1459:2: ( ruleKnowledgeList )
                    // InternalKant.g:1460:3: ruleKnowledgeList
                    {
                     before(grammarAccess.getKnowledgeSpreadingAccess().getRefKnowledgeListParserRuleCall_1_0_2()); 
                    pushFollow(FOLLOW_2);
                    ruleKnowledgeList();

                    state._fsp--;

                     after(grammarAccess.getKnowledgeSpreadingAccess().getRefKnowledgeListParserRuleCall_1_0_2()); 

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
    // $ANTLR end "rule__KnowledgeSpreading__RefAlternatives_1_0"


    // $ANTLR start "rule__KnowledgeFromFunctionArg__Alternatives"
    // InternalKant.g:1469:1: rule__KnowledgeFromFunctionArg__Alternatives : ( ( ( rule__KnowledgeFromFunctionArg__Group_0__0 ) ) | ( ruleKnowledgeSpreading ) );
    public final void rule__KnowledgeFromFunctionArg__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:1473:1: ( ( ( rule__KnowledgeFromFunctionArg__Group_0__0 ) ) | ( ruleKnowledgeSpreading ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_ID||LA19_0==21||LA19_0==29||LA19_0==34) ) {
                alt19=1;
            }
            else if ( (LA19_0==31) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalKant.g:1474:2: ( ( rule__KnowledgeFromFunctionArg__Group_0__0 ) )
                    {
                    // InternalKant.g:1474:2: ( ( rule__KnowledgeFromFunctionArg__Group_0__0 ) )
                    // InternalKant.g:1475:3: ( rule__KnowledgeFromFunctionArg__Group_0__0 )
                    {
                     before(grammarAccess.getKnowledgeFromFunctionArgAccess().getGroup_0()); 
                    // InternalKant.g:1476:3: ( rule__KnowledgeFromFunctionArg__Group_0__0 )
                    // InternalKant.g:1476:4: rule__KnowledgeFromFunctionArg__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__KnowledgeFromFunctionArg__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getKnowledgeFromFunctionArgAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalKant.g:1480:2: ( ruleKnowledgeSpreading )
                    {
                    // InternalKant.g:1480:2: ( ruleKnowledgeSpreading )
                    // InternalKant.g:1481:3: ruleKnowledgeSpreading
                    {
                     before(grammarAccess.getKnowledgeFromFunctionArgAccess().getKnowledgeSpreadingParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleKnowledgeSpreading();

                    state._fsp--;

                     after(grammarAccess.getKnowledgeFromFunctionArgAccess().getKnowledgeSpreadingParserRuleCall_1()); 

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
    // $ANTLR end "rule__KnowledgeFromFunctionArg__Alternatives"


    // $ANTLR start "rule__ScenarioBranching__Alternatives"
    // InternalKant.g:1490:1: rule__ScenarioBranching__Alternatives : ( ( ruleScenarioOptional ) | ( ruleScenarioAlternatives ) );
    public final void rule__ScenarioBranching__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:1494:1: ( ( ruleScenarioOptional ) | ( ruleScenarioAlternatives ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==35) ) {
                alt20=1;
            }
            else if ( (LA20_0==36) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // InternalKant.g:1495:2: ( ruleScenarioOptional )
                    {
                    // InternalKant.g:1495:2: ( ruleScenarioOptional )
                    // InternalKant.g:1496:3: ruleScenarioOptional
                    {
                     before(grammarAccess.getScenarioBranchingAccess().getScenarioOptionalParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleScenarioOptional();

                    state._fsp--;

                     after(grammarAccess.getScenarioBranchingAccess().getScenarioOptionalParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalKant.g:1501:2: ( ruleScenarioAlternatives )
                    {
                    // InternalKant.g:1501:2: ( ruleScenarioAlternatives )
                    // InternalKant.g:1502:3: ruleScenarioAlternatives
                    {
                     before(grammarAccess.getScenarioBranchingAccess().getScenarioAlternativesParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleScenarioAlternatives();

                    state._fsp--;

                     after(grammarAccess.getScenarioBranchingAccess().getScenarioAlternativesParserRuleCall_1()); 

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
    // $ANTLR end "rule__ScenarioBranching__Alternatives"


    // $ANTLR start "rule__Check__Alternatives_1"
    // InternalKant.g:1511:1: rule__Check__Alternatives_1 : ( ( ruleKnowledgeCheck ) | ( ruleEqualityCheck ) | ( ruleFreshnessCheck ) | ( ruleLinkabilityCheck ) | ( ruleAuthenticationCheck ) );
    public final void rule__Check__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:1515:1: ( ( ruleKnowledgeCheck ) | ( ruleEqualityCheck ) | ( ruleFreshnessCheck ) | ( ruleLinkabilityCheck ) | ( ruleAuthenticationCheck ) )
            int alt21=5;
            alt21 = dfa21.predict(input);
            switch (alt21) {
                case 1 :
                    // InternalKant.g:1516:2: ( ruleKnowledgeCheck )
                    {
                    // InternalKant.g:1516:2: ( ruleKnowledgeCheck )
                    // InternalKant.g:1517:3: ruleKnowledgeCheck
                    {
                     before(grammarAccess.getCheckAccess().getKnowledgeCheckParserRuleCall_1_0()); 
                    pushFollow(FOLLOW_2);
                    ruleKnowledgeCheck();

                    state._fsp--;

                     after(grammarAccess.getCheckAccess().getKnowledgeCheckParserRuleCall_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalKant.g:1522:2: ( ruleEqualityCheck )
                    {
                    // InternalKant.g:1522:2: ( ruleEqualityCheck )
                    // InternalKant.g:1523:3: ruleEqualityCheck
                    {
                     before(grammarAccess.getCheckAccess().getEqualityCheckParserRuleCall_1_1()); 
                    pushFollow(FOLLOW_2);
                    ruleEqualityCheck();

                    state._fsp--;

                     after(grammarAccess.getCheckAccess().getEqualityCheckParserRuleCall_1_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalKant.g:1528:2: ( ruleFreshnessCheck )
                    {
                    // InternalKant.g:1528:2: ( ruleFreshnessCheck )
                    // InternalKant.g:1529:3: ruleFreshnessCheck
                    {
                     before(grammarAccess.getCheckAccess().getFreshnessCheckParserRuleCall_1_2()); 
                    pushFollow(FOLLOW_2);
                    ruleFreshnessCheck();

                    state._fsp--;

                     after(grammarAccess.getCheckAccess().getFreshnessCheckParserRuleCall_1_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalKant.g:1534:2: ( ruleLinkabilityCheck )
                    {
                    // InternalKant.g:1534:2: ( ruleLinkabilityCheck )
                    // InternalKant.g:1535:3: ruleLinkabilityCheck
                    {
                     before(grammarAccess.getCheckAccess().getLinkabilityCheckParserRuleCall_1_3()); 
                    pushFollow(FOLLOW_2);
                    ruleLinkabilityCheck();

                    state._fsp--;

                     after(grammarAccess.getCheckAccess().getLinkabilityCheckParserRuleCall_1_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalKant.g:1540:2: ( ruleAuthenticationCheck )
                    {
                    // InternalKant.g:1540:2: ( ruleAuthenticationCheck )
                    // InternalKant.g:1541:3: ruleAuthenticationCheck
                    {
                     before(grammarAccess.getCheckAccess().getAuthenticationCheckParserRuleCall_1_4()); 
                    pushFollow(FOLLOW_2);
                    ruleAuthenticationCheck();

                    state._fsp--;

                     after(grammarAccess.getCheckAccess().getAuthenticationCheckParserRuleCall_1_4()); 

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
    // $ANTLR end "rule__Check__Alternatives_1"


    // $ANTLR start "rule__UniversalIntroduction__Group__0"
    // InternalKant.g:1550:1: rule__UniversalIntroduction__Group__0 : rule__UniversalIntroduction__Group__0__Impl rule__UniversalIntroduction__Group__1 ;
    public final void rule__UniversalIntroduction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:1554:1: ( rule__UniversalIntroduction__Group__0__Impl rule__UniversalIntroduction__Group__1 )
            // InternalKant.g:1555:2: rule__UniversalIntroduction__Group__0__Impl rule__UniversalIntroduction__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__UniversalIntroduction__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UniversalIntroduction__Group__1();

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
    // $ANTLR end "rule__UniversalIntroduction__Group__0"


    // $ANTLR start "rule__UniversalIntroduction__Group__0__Impl"
    // InternalKant.g:1562:1: rule__UniversalIntroduction__Group__0__Impl : ( 'forall' ) ;
    public final void rule__UniversalIntroduction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:1566:1: ( ( 'forall' ) )
            // InternalKant.g:1567:1: ( 'forall' )
            {
            // InternalKant.g:1567:1: ( 'forall' )
            // InternalKant.g:1568:2: 'forall'
            {
             before(grammarAccess.getUniversalIntroductionAccess().getForallKeyword_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getUniversalIntroductionAccess().getForallKeyword_0()); 

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
    // $ANTLR end "rule__UniversalIntroduction__Group__0__Impl"


    // $ANTLR start "rule__UniversalIntroduction__Group__1"
    // InternalKant.g:1577:1: rule__UniversalIntroduction__Group__1 : rule__UniversalIntroduction__Group__1__Impl rule__UniversalIntroduction__Group__2 ;
    public final void rule__UniversalIntroduction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:1581:1: ( rule__UniversalIntroduction__Group__1__Impl rule__UniversalIntroduction__Group__2 )
            // InternalKant.g:1582:2: rule__UniversalIntroduction__Group__1__Impl rule__UniversalIntroduction__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__UniversalIntroduction__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UniversalIntroduction__Group__2();

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
    // $ANTLR end "rule__UniversalIntroduction__Group__1"


    // $ANTLR start "rule__UniversalIntroduction__Group__1__Impl"
    // InternalKant.g:1589:1: rule__UniversalIntroduction__Group__1__Impl : ( ( rule__UniversalIntroduction__ArgsAssignment_1 ) ) ;
    public final void rule__UniversalIntroduction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:1593:1: ( ( ( rule__UniversalIntroduction__ArgsAssignment_1 ) ) )
            // InternalKant.g:1594:1: ( ( rule__UniversalIntroduction__ArgsAssignment_1 ) )
            {
            // InternalKant.g:1594:1: ( ( rule__UniversalIntroduction__ArgsAssignment_1 ) )
            // InternalKant.g:1595:2: ( rule__UniversalIntroduction__ArgsAssignment_1 )
            {
             before(grammarAccess.getUniversalIntroductionAccess().getArgsAssignment_1()); 
            // InternalKant.g:1596:2: ( rule__UniversalIntroduction__ArgsAssignment_1 )
            // InternalKant.g:1596:3: rule__UniversalIntroduction__ArgsAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__UniversalIntroduction__ArgsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getUniversalIntroductionAccess().getArgsAssignment_1()); 

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
    // $ANTLR end "rule__UniversalIntroduction__Group__1__Impl"


    // $ANTLR start "rule__UniversalIntroduction__Group__2"
    // InternalKant.g:1604:1: rule__UniversalIntroduction__Group__2 : rule__UniversalIntroduction__Group__2__Impl rule__UniversalIntroduction__Group__3 ;
    public final void rule__UniversalIntroduction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:1608:1: ( rule__UniversalIntroduction__Group__2__Impl rule__UniversalIntroduction__Group__3 )
            // InternalKant.g:1609:2: rule__UniversalIntroduction__Group__2__Impl rule__UniversalIntroduction__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__UniversalIntroduction__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UniversalIntroduction__Group__3();

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
    // $ANTLR end "rule__UniversalIntroduction__Group__2"


    // $ANTLR start "rule__UniversalIntroduction__Group__2__Impl"
    // InternalKant.g:1616:1: rule__UniversalIntroduction__Group__2__Impl : ( ( rule__UniversalIntroduction__Group_2__0 )* ) ;
    public final void rule__UniversalIntroduction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:1620:1: ( ( ( rule__UniversalIntroduction__Group_2__0 )* ) )
            // InternalKant.g:1621:1: ( ( rule__UniversalIntroduction__Group_2__0 )* )
            {
            // InternalKant.g:1621:1: ( ( rule__UniversalIntroduction__Group_2__0 )* )
            // InternalKant.g:1622:2: ( rule__UniversalIntroduction__Group_2__0 )*
            {
             before(grammarAccess.getUniversalIntroductionAccess().getGroup_2()); 
            // InternalKant.g:1623:2: ( rule__UniversalIntroduction__Group_2__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==13) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalKant.g:1623:3: rule__UniversalIntroduction__Group_2__0
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__UniversalIntroduction__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getUniversalIntroductionAccess().getGroup_2()); 

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
    // $ANTLR end "rule__UniversalIntroduction__Group__2__Impl"


    // $ANTLR start "rule__UniversalIntroduction__Group__3"
    // InternalKant.g:1631:1: rule__UniversalIntroduction__Group__3 : rule__UniversalIntroduction__Group__3__Impl ;
    public final void rule__UniversalIntroduction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:1635:1: ( rule__UniversalIntroduction__Group__3__Impl )
            // InternalKant.g:1636:2: rule__UniversalIntroduction__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UniversalIntroduction__Group__3__Impl();

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
    // $ANTLR end "rule__UniversalIntroduction__Group__3"


    // $ANTLR start "rule__UniversalIntroduction__Group__3__Impl"
    // InternalKant.g:1642:1: rule__UniversalIntroduction__Group__3__Impl : ( ':' ) ;
    public final void rule__UniversalIntroduction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:1646:1: ( ( ':' ) )
            // InternalKant.g:1647:1: ( ':' )
            {
            // InternalKant.g:1647:1: ( ':' )
            // InternalKant.g:1648:2: ':'
            {
             before(grammarAccess.getUniversalIntroductionAccess().getColonKeyword_3()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getUniversalIntroductionAccess().getColonKeyword_3()); 

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
    // $ANTLR end "rule__UniversalIntroduction__Group__3__Impl"


    // $ANTLR start "rule__UniversalIntroduction__Group_2__0"
    // InternalKant.g:1658:1: rule__UniversalIntroduction__Group_2__0 : rule__UniversalIntroduction__Group_2__0__Impl rule__UniversalIntroduction__Group_2__1 ;
    public final void rule__UniversalIntroduction__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:1662:1: ( rule__UniversalIntroduction__Group_2__0__Impl rule__UniversalIntroduction__Group_2__1 )
            // InternalKant.g:1663:2: rule__UniversalIntroduction__Group_2__0__Impl rule__UniversalIntroduction__Group_2__1
            {
            pushFollow(FOLLOW_4);
            rule__UniversalIntroduction__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UniversalIntroduction__Group_2__1();

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
    // $ANTLR end "rule__UniversalIntroduction__Group_2__0"


    // $ANTLR start "rule__UniversalIntroduction__Group_2__0__Impl"
    // InternalKant.g:1670:1: rule__UniversalIntroduction__Group_2__0__Impl : ( ',' ) ;
    public final void rule__UniversalIntroduction__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:1674:1: ( ( ',' ) )
            // InternalKant.g:1675:1: ( ',' )
            {
            // InternalKant.g:1675:1: ( ',' )
            // InternalKant.g:1676:2: ','
            {
             before(grammarAccess.getUniversalIntroductionAccess().getCommaKeyword_2_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getUniversalIntroductionAccess().getCommaKeyword_2_0()); 

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
    // $ANTLR end "rule__UniversalIntroduction__Group_2__0__Impl"


    // $ANTLR start "rule__UniversalIntroduction__Group_2__1"
    // InternalKant.g:1685:1: rule__UniversalIntroduction__Group_2__1 : rule__UniversalIntroduction__Group_2__1__Impl ;
    public final void rule__UniversalIntroduction__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:1689:1: ( rule__UniversalIntroduction__Group_2__1__Impl )
            // InternalKant.g:1690:2: rule__UniversalIntroduction__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UniversalIntroduction__Group_2__1__Impl();

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
    // $ANTLR end "rule__UniversalIntroduction__Group_2__1"


    // $ANTLR start "rule__UniversalIntroduction__Group_2__1__Impl"
    // InternalKant.g:1696:1: rule__UniversalIntroduction__Group_2__1__Impl : ( ( rule__UniversalIntroduction__ArgsAssignment_2_1 ) ) ;
    public final void rule__UniversalIntroduction__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:1700:1: ( ( ( rule__UniversalIntroduction__ArgsAssignment_2_1 ) ) )
            // InternalKant.g:1701:1: ( ( rule__UniversalIntroduction__ArgsAssignment_2_1 ) )
            {
            // InternalKant.g:1701:1: ( ( rule__UniversalIntroduction__ArgsAssignment_2_1 ) )
            // InternalKant.g:1702:2: ( rule__UniversalIntroduction__ArgsAssignment_2_1 )
            {
             before(grammarAccess.getUniversalIntroductionAccess().getArgsAssignment_2_1()); 
            // InternalKant.g:1703:2: ( rule__UniversalIntroduction__ArgsAssignment_2_1 )
            // InternalKant.g:1703:3: rule__UniversalIntroduction__ArgsAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__UniversalIntroduction__ArgsAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getUniversalIntroductionAccess().getArgsAssignment_2_1()); 

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
    // $ANTLR end "rule__UniversalIntroduction__Group_2__1__Impl"


    // $ANTLR start "rule__FunctionDef__Group__0"
    // InternalKant.g:1712:1: rule__FunctionDef__Group__0 : rule__FunctionDef__Group__0__Impl rule__FunctionDef__Group__1 ;
    public final void rule__FunctionDef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:1716:1: ( rule__FunctionDef__Group__0__Impl rule__FunctionDef__Group__1 )
            // InternalKant.g:1717:2: rule__FunctionDef__Group__0__Impl rule__FunctionDef__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__FunctionDef__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FunctionDef__Group__1();

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
    // $ANTLR end "rule__FunctionDef__Group__0"


    // $ANTLR start "rule__FunctionDef__Group__0__Impl"
    // InternalKant.g:1724:1: rule__FunctionDef__Group__0__Impl : ( 'function' ) ;
    public final void rule__FunctionDef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:1728:1: ( ( 'function' ) )
            // InternalKant.g:1729:1: ( 'function' )
            {
            // InternalKant.g:1729:1: ( 'function' )
            // InternalKant.g:1730:2: 'function'
            {
             before(grammarAccess.getFunctionDefAccess().getFunctionKeyword_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getFunctionDefAccess().getFunctionKeyword_0()); 

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
    // $ANTLR end "rule__FunctionDef__Group__0__Impl"


    // $ANTLR start "rule__FunctionDef__Group__1"
    // InternalKant.g:1739:1: rule__FunctionDef__Group__1 : rule__FunctionDef__Group__1__Impl rule__FunctionDef__Group__2 ;
    public final void rule__FunctionDef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:1743:1: ( rule__FunctionDef__Group__1__Impl rule__FunctionDef__Group__2 )
            // InternalKant.g:1744:2: rule__FunctionDef__Group__1__Impl rule__FunctionDef__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__FunctionDef__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FunctionDef__Group__2();

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
    // $ANTLR end "rule__FunctionDef__Group__1"


    // $ANTLR start "rule__FunctionDef__Group__1__Impl"
    // InternalKant.g:1751:1: rule__FunctionDef__Group__1__Impl : ( ( rule__FunctionDef__IntroAssignment_1 )? ) ;
    public final void rule__FunctionDef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:1755:1: ( ( ( rule__FunctionDef__IntroAssignment_1 )? ) )
            // InternalKant.g:1756:1: ( ( rule__FunctionDef__IntroAssignment_1 )? )
            {
            // InternalKant.g:1756:1: ( ( rule__FunctionDef__IntroAssignment_1 )? )
            // InternalKant.g:1757:2: ( rule__FunctionDef__IntroAssignment_1 )?
            {
             before(grammarAccess.getFunctionDefAccess().getIntroAssignment_1()); 
            // InternalKant.g:1758:2: ( rule__FunctionDef__IntroAssignment_1 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==11) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalKant.g:1758:3: rule__FunctionDef__IntroAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__FunctionDef__IntroAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFunctionDefAccess().getIntroAssignment_1()); 

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
    // $ANTLR end "rule__FunctionDef__Group__1__Impl"


    // $ANTLR start "rule__FunctionDef__Group__2"
    // InternalKant.g:1766:1: rule__FunctionDef__Group__2 : rule__FunctionDef__Group__2__Impl rule__FunctionDef__Group__3 ;
    public final void rule__FunctionDef__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:1770:1: ( rule__FunctionDef__Group__2__Impl rule__FunctionDef__Group__3 )
            // InternalKant.g:1771:2: rule__FunctionDef__Group__2__Impl rule__FunctionDef__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__FunctionDef__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FunctionDef__Group__3();

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
    // $ANTLR end "rule__FunctionDef__Group__2"


    // $ANTLR start "rule__FunctionDef__Group__2__Impl"
    // InternalKant.g:1778:1: rule__FunctionDef__Group__2__Impl : ( ( rule__FunctionDef__NameAssignment_2 ) ) ;
    public final void rule__FunctionDef__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:1782:1: ( ( ( rule__FunctionDef__NameAssignment_2 ) ) )
            // InternalKant.g:1783:1: ( ( rule__FunctionDef__NameAssignment_2 ) )
            {
            // InternalKant.g:1783:1: ( ( rule__FunctionDef__NameAssignment_2 ) )
            // InternalKant.g:1784:2: ( rule__FunctionDef__NameAssignment_2 )
            {
             before(grammarAccess.getFunctionDefAccess().getNameAssignment_2()); 
            // InternalKant.g:1785:2: ( rule__FunctionDef__NameAssignment_2 )
            // InternalKant.g:1785:3: rule__FunctionDef__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__FunctionDef__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getFunctionDefAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__FunctionDef__Group__2__Impl"


    // $ANTLR start "rule__FunctionDef__Group__3"
    // InternalKant.g:1793:1: rule__FunctionDef__Group__3 : rule__FunctionDef__Group__3__Impl rule__FunctionDef__Group__4 ;
    public final void rule__FunctionDef__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:1797:1: ( rule__FunctionDef__Group__3__Impl rule__FunctionDef__Group__4 )
            // InternalKant.g:1798:2: rule__FunctionDef__Group__3__Impl rule__FunctionDef__Group__4
            {
            pushFollow(FOLLOW_8);
            rule__FunctionDef__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FunctionDef__Group__4();

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
    // $ANTLR end "rule__FunctionDef__Group__3"


    // $ANTLR start "rule__FunctionDef__Group__3__Impl"
    // InternalKant.g:1805:1: rule__FunctionDef__Group__3__Impl : ( ( rule__FunctionDef__Group_3__0 )? ) ;
    public final void rule__FunctionDef__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:1809:1: ( ( ( rule__FunctionDef__Group_3__0 )? ) )
            // InternalKant.g:1810:1: ( ( rule__FunctionDef__Group_3__0 )? )
            {
            // InternalKant.g:1810:1: ( ( rule__FunctionDef__Group_3__0 )? )
            // InternalKant.g:1811:2: ( rule__FunctionDef__Group_3__0 )?
            {
             before(grammarAccess.getFunctionDefAccess().getGroup_3()); 
            // InternalKant.g:1812:2: ( rule__FunctionDef__Group_3__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==15) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalKant.g:1812:3: rule__FunctionDef__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FunctionDef__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFunctionDefAccess().getGroup_3()); 

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
    // $ANTLR end "rule__FunctionDef__Group__3__Impl"


    // $ANTLR start "rule__FunctionDef__Group__4"
    // InternalKant.g:1820:1: rule__FunctionDef__Group__4 : rule__FunctionDef__Group__4__Impl rule__FunctionDef__Group__5 ;
    public final void rule__FunctionDef__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:1824:1: ( rule__FunctionDef__Group__4__Impl rule__FunctionDef__Group__5 )
            // InternalKant.g:1825:2: rule__FunctionDef__Group__4__Impl rule__FunctionDef__Group__5
            {
            pushFollow(FOLLOW_8);
            rule__FunctionDef__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FunctionDef__Group__5();

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
    // $ANTLR end "rule__FunctionDef__Group__4"


    // $ANTLR start "rule__FunctionDef__Group__4__Impl"
    // InternalKant.g:1832:1: rule__FunctionDef__Group__4__Impl : ( ( rule__FunctionDef__Group_4__0 )? ) ;
    public final void rule__FunctionDef__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:1836:1: ( ( ( rule__FunctionDef__Group_4__0 )? ) )
            // InternalKant.g:1837:1: ( ( rule__FunctionDef__Group_4__0 )? )
            {
            // InternalKant.g:1837:1: ( ( rule__FunctionDef__Group_4__0 )? )
            // InternalKant.g:1838:2: ( rule__FunctionDef__Group_4__0 )?
            {
             before(grammarAccess.getFunctionDefAccess().getGroup_4()); 
            // InternalKant.g:1839:2: ( rule__FunctionDef__Group_4__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==17) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalKant.g:1839:3: rule__FunctionDef__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FunctionDef__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFunctionDefAccess().getGroup_4()); 

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
    // $ANTLR end "rule__FunctionDef__Group__4__Impl"


    // $ANTLR start "rule__FunctionDef__Group__5"
    // InternalKant.g:1847:1: rule__FunctionDef__Group__5 : rule__FunctionDef__Group__5__Impl rule__FunctionDef__Group__6 ;
    public final void rule__FunctionDef__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:1851:1: ( rule__FunctionDef__Group__5__Impl rule__FunctionDef__Group__6 )
            // InternalKant.g:1852:2: rule__FunctionDef__Group__5__Impl rule__FunctionDef__Group__6
            {
            pushFollow(FOLLOW_8);
            rule__FunctionDef__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FunctionDef__Group__6();

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
    // $ANTLR end "rule__FunctionDef__Group__5"


    // $ANTLR start "rule__FunctionDef__Group__5__Impl"
    // InternalKant.g:1859:1: rule__FunctionDef__Group__5__Impl : ( ( rule__FunctionDef__Group_5__0 )? ) ;
    public final void rule__FunctionDef__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:1863:1: ( ( ( rule__FunctionDef__Group_5__0 )? ) )
            // InternalKant.g:1864:1: ( ( rule__FunctionDef__Group_5__0 )? )
            {
            // InternalKant.g:1864:1: ( ( rule__FunctionDef__Group_5__0 )? )
            // InternalKant.g:1865:2: ( rule__FunctionDef__Group_5__0 )?
            {
             before(grammarAccess.getFunctionDefAccess().getGroup_5()); 
            // InternalKant.g:1866:2: ( rule__FunctionDef__Group_5__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==18) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalKant.g:1866:3: rule__FunctionDef__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FunctionDef__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFunctionDefAccess().getGroup_5()); 

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
    // $ANTLR end "rule__FunctionDef__Group__5__Impl"


    // $ANTLR start "rule__FunctionDef__Group__6"
    // InternalKant.g:1874:1: rule__FunctionDef__Group__6 : rule__FunctionDef__Group__6__Impl rule__FunctionDef__Group__7 ;
    public final void rule__FunctionDef__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:1878:1: ( rule__FunctionDef__Group__6__Impl rule__FunctionDef__Group__7 )
            // InternalKant.g:1879:2: rule__FunctionDef__Group__6__Impl rule__FunctionDef__Group__7
            {
            pushFollow(FOLLOW_8);
            rule__FunctionDef__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FunctionDef__Group__7();

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
    // $ANTLR end "rule__FunctionDef__Group__6"


    // $ANTLR start "rule__FunctionDef__Group__6__Impl"
    // InternalKant.g:1886:1: rule__FunctionDef__Group__6__Impl : ( ( rule__FunctionDef__RandomizedAssignment_6 )? ) ;
    public final void rule__FunctionDef__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:1890:1: ( ( ( rule__FunctionDef__RandomizedAssignment_6 )? ) )
            // InternalKant.g:1891:1: ( ( rule__FunctionDef__RandomizedAssignment_6 )? )
            {
            // InternalKant.g:1891:1: ( ( rule__FunctionDef__RandomizedAssignment_6 )? )
            // InternalKant.g:1892:2: ( rule__FunctionDef__RandomizedAssignment_6 )?
            {
             before(grammarAccess.getFunctionDefAccess().getRandomizedAssignment_6()); 
            // InternalKant.g:1893:2: ( rule__FunctionDef__RandomizedAssignment_6 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==44) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalKant.g:1893:3: rule__FunctionDef__RandomizedAssignment_6
                    {
                    pushFollow(FOLLOW_2);
                    rule__FunctionDef__RandomizedAssignment_6();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFunctionDefAccess().getRandomizedAssignment_6()); 

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
    // $ANTLR end "rule__FunctionDef__Group__6__Impl"


    // $ANTLR start "rule__FunctionDef__Group__7"
    // InternalKant.g:1901:1: rule__FunctionDef__Group__7 : rule__FunctionDef__Group__7__Impl ;
    public final void rule__FunctionDef__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:1905:1: ( rule__FunctionDef__Group__7__Impl )
            // InternalKant.g:1906:2: rule__FunctionDef__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FunctionDef__Group__7__Impl();

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
    // $ANTLR end "rule__FunctionDef__Group__7"


    // $ANTLR start "rule__FunctionDef__Group__7__Impl"
    // InternalKant.g:1912:1: rule__FunctionDef__Group__7__Impl : ( ( rule__FunctionDef__Group_7__0 )? ) ;
    public final void rule__FunctionDef__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:1916:1: ( ( ( rule__FunctionDef__Group_7__0 )? ) )
            // InternalKant.g:1917:1: ( ( rule__FunctionDef__Group_7__0 )? )
            {
            // InternalKant.g:1917:1: ( ( rule__FunctionDef__Group_7__0 )? )
            // InternalKant.g:1918:2: ( rule__FunctionDef__Group_7__0 )?
            {
             before(grammarAccess.getFunctionDefAccess().getGroup_7()); 
            // InternalKant.g:1919:2: ( rule__FunctionDef__Group_7__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==45) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalKant.g:1919:3: rule__FunctionDef__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FunctionDef__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFunctionDefAccess().getGroup_7()); 

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
    // $ANTLR end "rule__FunctionDef__Group__7__Impl"


    // $ANTLR start "rule__FunctionDef__Group_3__0"
    // InternalKant.g:1928:1: rule__FunctionDef__Group_3__0 : rule__FunctionDef__Group_3__0__Impl rule__FunctionDef__Group_3__1 ;
    public final void rule__FunctionDef__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:1932:1: ( rule__FunctionDef__Group_3__0__Impl rule__FunctionDef__Group_3__1 )
            // InternalKant.g:1933:2: rule__FunctionDef__Group_3__0__Impl rule__FunctionDef__Group_3__1
            {
            pushFollow(FOLLOW_9);
            rule__FunctionDef__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FunctionDef__Group_3__1();

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
    // $ANTLR end "rule__FunctionDef__Group_3__0"


    // $ANTLR start "rule__FunctionDef__Group_3__0__Impl"
    // InternalKant.g:1940:1: rule__FunctionDef__Group_3__0__Impl : ( '(' ) ;
    public final void rule__FunctionDef__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:1944:1: ( ( '(' ) )
            // InternalKant.g:1945:1: ( '(' )
            {
            // InternalKant.g:1945:1: ( '(' )
            // InternalKant.g:1946:2: '('
            {
             before(grammarAccess.getFunctionDefAccess().getLeftParenthesisKeyword_3_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getFunctionDefAccess().getLeftParenthesisKeyword_3_0()); 

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
    // $ANTLR end "rule__FunctionDef__Group_3__0__Impl"


    // $ANTLR start "rule__FunctionDef__Group_3__1"
    // InternalKant.g:1955:1: rule__FunctionDef__Group_3__1 : rule__FunctionDef__Group_3__1__Impl rule__FunctionDef__Group_3__2 ;
    public final void rule__FunctionDef__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:1959:1: ( rule__FunctionDef__Group_3__1__Impl rule__FunctionDef__Group_3__2 )
            // InternalKant.g:1960:2: rule__FunctionDef__Group_3__1__Impl rule__FunctionDef__Group_3__2
            {
            pushFollow(FOLLOW_10);
            rule__FunctionDef__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FunctionDef__Group_3__2();

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
    // $ANTLR end "rule__FunctionDef__Group_3__1"


    // $ANTLR start "rule__FunctionDef__Group_3__1__Impl"
    // InternalKant.g:1967:1: rule__FunctionDef__Group_3__1__Impl : ( ( rule__FunctionDef__ParamsAssignment_3_1 ) ) ;
    public final void rule__FunctionDef__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:1971:1: ( ( ( rule__FunctionDef__ParamsAssignment_3_1 ) ) )
            // InternalKant.g:1972:1: ( ( rule__FunctionDef__ParamsAssignment_3_1 ) )
            {
            // InternalKant.g:1972:1: ( ( rule__FunctionDef__ParamsAssignment_3_1 ) )
            // InternalKant.g:1973:2: ( rule__FunctionDef__ParamsAssignment_3_1 )
            {
             before(grammarAccess.getFunctionDefAccess().getParamsAssignment_3_1()); 
            // InternalKant.g:1974:2: ( rule__FunctionDef__ParamsAssignment_3_1 )
            // InternalKant.g:1974:3: rule__FunctionDef__ParamsAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__FunctionDef__ParamsAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getFunctionDefAccess().getParamsAssignment_3_1()); 

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
    // $ANTLR end "rule__FunctionDef__Group_3__1__Impl"


    // $ANTLR start "rule__FunctionDef__Group_3__2"
    // InternalKant.g:1982:1: rule__FunctionDef__Group_3__2 : rule__FunctionDef__Group_3__2__Impl rule__FunctionDef__Group_3__3 ;
    public final void rule__FunctionDef__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:1986:1: ( rule__FunctionDef__Group_3__2__Impl rule__FunctionDef__Group_3__3 )
            // InternalKant.g:1987:2: rule__FunctionDef__Group_3__2__Impl rule__FunctionDef__Group_3__3
            {
            pushFollow(FOLLOW_10);
            rule__FunctionDef__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FunctionDef__Group_3__3();

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
    // $ANTLR end "rule__FunctionDef__Group_3__2"


    // $ANTLR start "rule__FunctionDef__Group_3__2__Impl"
    // InternalKant.g:1994:1: rule__FunctionDef__Group_3__2__Impl : ( ( rule__FunctionDef__Group_3_2__0 )* ) ;
    public final void rule__FunctionDef__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:1998:1: ( ( ( rule__FunctionDef__Group_3_2__0 )* ) )
            // InternalKant.g:1999:1: ( ( rule__FunctionDef__Group_3_2__0 )* )
            {
            // InternalKant.g:1999:1: ( ( rule__FunctionDef__Group_3_2__0 )* )
            // InternalKant.g:2000:2: ( rule__FunctionDef__Group_3_2__0 )*
            {
             before(grammarAccess.getFunctionDefAccess().getGroup_3_2()); 
            // InternalKant.g:2001:2: ( rule__FunctionDef__Group_3_2__0 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==13) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalKant.g:2001:3: rule__FunctionDef__Group_3_2__0
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__FunctionDef__Group_3_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

             after(grammarAccess.getFunctionDefAccess().getGroup_3_2()); 

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
    // $ANTLR end "rule__FunctionDef__Group_3__2__Impl"


    // $ANTLR start "rule__FunctionDef__Group_3__3"
    // InternalKant.g:2009:1: rule__FunctionDef__Group_3__3 : rule__FunctionDef__Group_3__3__Impl ;
    public final void rule__FunctionDef__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:2013:1: ( rule__FunctionDef__Group_3__3__Impl )
            // InternalKant.g:2014:2: rule__FunctionDef__Group_3__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FunctionDef__Group_3__3__Impl();

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
    // $ANTLR end "rule__FunctionDef__Group_3__3"


    // $ANTLR start "rule__FunctionDef__Group_3__3__Impl"
    // InternalKant.g:2020:1: rule__FunctionDef__Group_3__3__Impl : ( ')' ) ;
    public final void rule__FunctionDef__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:2024:1: ( ( ')' ) )
            // InternalKant.g:2025:1: ( ')' )
            {
            // InternalKant.g:2025:1: ( ')' )
            // InternalKant.g:2026:2: ')'
            {
             before(grammarAccess.getFunctionDefAccess().getRightParenthesisKeyword_3_3()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getFunctionDefAccess().getRightParenthesisKeyword_3_3()); 

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
    // $ANTLR end "rule__FunctionDef__Group_3__3__Impl"


    // $ANTLR start "rule__FunctionDef__Group_3_2__0"
    // InternalKant.g:2036:1: rule__FunctionDef__Group_3_2__0 : rule__FunctionDef__Group_3_2__0__Impl rule__FunctionDef__Group_3_2__1 ;
    public final void rule__FunctionDef__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:2040:1: ( rule__FunctionDef__Group_3_2__0__Impl rule__FunctionDef__Group_3_2__1 )
            // InternalKant.g:2041:2: rule__FunctionDef__Group_3_2__0__Impl rule__FunctionDef__Group_3_2__1
            {
            pushFollow(FOLLOW_9);
            rule__FunctionDef__Group_3_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FunctionDef__Group_3_2__1();

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
    // $ANTLR end "rule__FunctionDef__Group_3_2__0"


    // $ANTLR start "rule__FunctionDef__Group_3_2__0__Impl"
    // InternalKant.g:2048:1: rule__FunctionDef__Group_3_2__0__Impl : ( ',' ) ;
    public final void rule__FunctionDef__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:2052:1: ( ( ',' ) )
            // InternalKant.g:2053:1: ( ',' )
            {
            // InternalKant.g:2053:1: ( ',' )
            // InternalKant.g:2054:2: ','
            {
             before(grammarAccess.getFunctionDefAccess().getCommaKeyword_3_2_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getFunctionDefAccess().getCommaKeyword_3_2_0()); 

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
    // $ANTLR end "rule__FunctionDef__Group_3_2__0__Impl"


    // $ANTLR start "rule__FunctionDef__Group_3_2__1"
    // InternalKant.g:2063:1: rule__FunctionDef__Group_3_2__1 : rule__FunctionDef__Group_3_2__1__Impl ;
    public final void rule__FunctionDef__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:2067:1: ( rule__FunctionDef__Group_3_2__1__Impl )
            // InternalKant.g:2068:2: rule__FunctionDef__Group_3_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FunctionDef__Group_3_2__1__Impl();

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
    // $ANTLR end "rule__FunctionDef__Group_3_2__1"


    // $ANTLR start "rule__FunctionDef__Group_3_2__1__Impl"
    // InternalKant.g:2074:1: rule__FunctionDef__Group_3_2__1__Impl : ( ( rule__FunctionDef__ParamsAssignment_3_2_1 ) ) ;
    public final void rule__FunctionDef__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:2078:1: ( ( ( rule__FunctionDef__ParamsAssignment_3_2_1 ) ) )
            // InternalKant.g:2079:1: ( ( rule__FunctionDef__ParamsAssignment_3_2_1 ) )
            {
            // InternalKant.g:2079:1: ( ( rule__FunctionDef__ParamsAssignment_3_2_1 ) )
            // InternalKant.g:2080:2: ( rule__FunctionDef__ParamsAssignment_3_2_1 )
            {
             before(grammarAccess.getFunctionDefAccess().getParamsAssignment_3_2_1()); 
            // InternalKant.g:2081:2: ( rule__FunctionDef__ParamsAssignment_3_2_1 )
            // InternalKant.g:2081:3: rule__FunctionDef__ParamsAssignment_3_2_1
            {
            pushFollow(FOLLOW_2);
            rule__FunctionDef__ParamsAssignment_3_2_1();

            state._fsp--;


            }

             after(grammarAccess.getFunctionDefAccess().getParamsAssignment_3_2_1()); 

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
    // $ANTLR end "rule__FunctionDef__Group_3_2__1__Impl"


    // $ANTLR start "rule__FunctionDef__Group_4__0"
    // InternalKant.g:2090:1: rule__FunctionDef__Group_4__0 : rule__FunctionDef__Group_4__0__Impl rule__FunctionDef__Group_4__1 ;
    public final void rule__FunctionDef__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:2094:1: ( rule__FunctionDef__Group_4__0__Impl rule__FunctionDef__Group_4__1 )
            // InternalKant.g:2095:2: rule__FunctionDef__Group_4__0__Impl rule__FunctionDef__Group_4__1
            {
            pushFollow(FOLLOW_11);
            rule__FunctionDef__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FunctionDef__Group_4__1();

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
    // $ANTLR end "rule__FunctionDef__Group_4__0"


    // $ANTLR start "rule__FunctionDef__Group_4__0__Impl"
    // InternalKant.g:2102:1: rule__FunctionDef__Group_4__0__Impl : ( 'with' ) ;
    public final void rule__FunctionDef__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:2106:1: ( ( 'with' ) )
            // InternalKant.g:2107:1: ( 'with' )
            {
            // InternalKant.g:2107:1: ( 'with' )
            // InternalKant.g:2108:2: 'with'
            {
             before(grammarAccess.getFunctionDefAccess().getWithKeyword_4_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getFunctionDefAccess().getWithKeyword_4_0()); 

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
    // $ANTLR end "rule__FunctionDef__Group_4__0__Impl"


    // $ANTLR start "rule__FunctionDef__Group_4__1"
    // InternalKant.g:2117:1: rule__FunctionDef__Group_4__1 : rule__FunctionDef__Group_4__1__Impl ;
    public final void rule__FunctionDef__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:2121:1: ( rule__FunctionDef__Group_4__1__Impl )
            // InternalKant.g:2122:2: rule__FunctionDef__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FunctionDef__Group_4__1__Impl();

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
    // $ANTLR end "rule__FunctionDef__Group_4__1"


    // $ANTLR start "rule__FunctionDef__Group_4__1__Impl"
    // InternalKant.g:2128:1: rule__FunctionDef__Group_4__1__Impl : ( ( rule__FunctionDef__KeyAssignment_4_1 ) ) ;
    public final void rule__FunctionDef__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:2132:1: ( ( ( rule__FunctionDef__KeyAssignment_4_1 ) ) )
            // InternalKant.g:2133:1: ( ( rule__FunctionDef__KeyAssignment_4_1 ) )
            {
            // InternalKant.g:2133:1: ( ( rule__FunctionDef__KeyAssignment_4_1 ) )
            // InternalKant.g:2134:2: ( rule__FunctionDef__KeyAssignment_4_1 )
            {
             before(grammarAccess.getFunctionDefAccess().getKeyAssignment_4_1()); 
            // InternalKant.g:2135:2: ( rule__FunctionDef__KeyAssignment_4_1 )
            // InternalKant.g:2135:3: rule__FunctionDef__KeyAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__FunctionDef__KeyAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getFunctionDefAccess().getKeyAssignment_4_1()); 

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
    // $ANTLR end "rule__FunctionDef__Group_4__1__Impl"


    // $ANTLR start "rule__FunctionDef__Group_5__0"
    // InternalKant.g:2144:1: rule__FunctionDef__Group_5__0 : rule__FunctionDef__Group_5__0__Impl rule__FunctionDef__Group_5__1 ;
    public final void rule__FunctionDef__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:2148:1: ( rule__FunctionDef__Group_5__0__Impl rule__FunctionDef__Group_5__1 )
            // InternalKant.g:2149:2: rule__FunctionDef__Group_5__0__Impl rule__FunctionDef__Group_5__1
            {
            pushFollow(FOLLOW_11);
            rule__FunctionDef__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FunctionDef__Group_5__1();

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
    // $ANTLR end "rule__FunctionDef__Group_5__0"


    // $ANTLR start "rule__FunctionDef__Group_5__0__Impl"
    // InternalKant.g:2156:1: rule__FunctionDef__Group_5__0__Impl : ( '->' ) ;
    public final void rule__FunctionDef__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:2160:1: ( ( '->' ) )
            // InternalKant.g:2161:1: ( '->' )
            {
            // InternalKant.g:2161:1: ( '->' )
            // InternalKant.g:2162:2: '->'
            {
             before(grammarAccess.getFunctionDefAccess().getHyphenMinusGreaterThanSignKeyword_5_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getFunctionDefAccess().getHyphenMinusGreaterThanSignKeyword_5_0()); 

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
    // $ANTLR end "rule__FunctionDef__Group_5__0__Impl"


    // $ANTLR start "rule__FunctionDef__Group_5__1"
    // InternalKant.g:2171:1: rule__FunctionDef__Group_5__1 : rule__FunctionDef__Group_5__1__Impl ;
    public final void rule__FunctionDef__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:2175:1: ( rule__FunctionDef__Group_5__1__Impl )
            // InternalKant.g:2176:2: rule__FunctionDef__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FunctionDef__Group_5__1__Impl();

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
    // $ANTLR end "rule__FunctionDef__Group_5__1"


    // $ANTLR start "rule__FunctionDef__Group_5__1__Impl"
    // InternalKant.g:2182:1: rule__FunctionDef__Group_5__1__Impl : ( ( rule__FunctionDef__ReturnAssignment_5_1 ) ) ;
    public final void rule__FunctionDef__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:2186:1: ( ( ( rule__FunctionDef__ReturnAssignment_5_1 ) ) )
            // InternalKant.g:2187:1: ( ( rule__FunctionDef__ReturnAssignment_5_1 ) )
            {
            // InternalKant.g:2187:1: ( ( rule__FunctionDef__ReturnAssignment_5_1 ) )
            // InternalKant.g:2188:2: ( rule__FunctionDef__ReturnAssignment_5_1 )
            {
             before(grammarAccess.getFunctionDefAccess().getReturnAssignment_5_1()); 
            // InternalKant.g:2189:2: ( rule__FunctionDef__ReturnAssignment_5_1 )
            // InternalKant.g:2189:3: rule__FunctionDef__ReturnAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__FunctionDef__ReturnAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getFunctionDefAccess().getReturnAssignment_5_1()); 

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
    // $ANTLR end "rule__FunctionDef__Group_5__1__Impl"


    // $ANTLR start "rule__FunctionDef__Group_7__0"
    // InternalKant.g:2198:1: rule__FunctionDef__Group_7__0 : rule__FunctionDef__Group_7__0__Impl rule__FunctionDef__Group_7__1 ;
    public final void rule__FunctionDef__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:2202:1: ( rule__FunctionDef__Group_7__0__Impl rule__FunctionDef__Group_7__1 )
            // InternalKant.g:2203:2: rule__FunctionDef__Group_7__0__Impl rule__FunctionDef__Group_7__1
            {
            pushFollow(FOLLOW_12);
            rule__FunctionDef__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FunctionDef__Group_7__1();

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
    // $ANTLR end "rule__FunctionDef__Group_7__0"


    // $ANTLR start "rule__FunctionDef__Group_7__0__Impl"
    // InternalKant.g:2210:1: rule__FunctionDef__Group_7__0__Impl : ( ( rule__FunctionDef__OwAssignment_7_0 ) ) ;
    public final void rule__FunctionDef__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:2214:1: ( ( ( rule__FunctionDef__OwAssignment_7_0 ) ) )
            // InternalKant.g:2215:1: ( ( rule__FunctionDef__OwAssignment_7_0 ) )
            {
            // InternalKant.g:2215:1: ( ( rule__FunctionDef__OwAssignment_7_0 ) )
            // InternalKant.g:2216:2: ( rule__FunctionDef__OwAssignment_7_0 )
            {
             before(grammarAccess.getFunctionDefAccess().getOwAssignment_7_0()); 
            // InternalKant.g:2217:2: ( rule__FunctionDef__OwAssignment_7_0 )
            // InternalKant.g:2217:3: rule__FunctionDef__OwAssignment_7_0
            {
            pushFollow(FOLLOW_2);
            rule__FunctionDef__OwAssignment_7_0();

            state._fsp--;


            }

             after(grammarAccess.getFunctionDefAccess().getOwAssignment_7_0()); 

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
    // $ANTLR end "rule__FunctionDef__Group_7__0__Impl"


    // $ANTLR start "rule__FunctionDef__Group_7__1"
    // InternalKant.g:2225:1: rule__FunctionDef__Group_7__1 : rule__FunctionDef__Group_7__1__Impl ;
    public final void rule__FunctionDef__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:2229:1: ( rule__FunctionDef__Group_7__1__Impl )
            // InternalKant.g:2230:2: rule__FunctionDef__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FunctionDef__Group_7__1__Impl();

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
    // $ANTLR end "rule__FunctionDef__Group_7__1"


    // $ANTLR start "rule__FunctionDef__Group_7__1__Impl"
    // InternalKant.g:2236:1: rule__FunctionDef__Group_7__1__Impl : ( 'way' ) ;
    public final void rule__FunctionDef__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:2240:1: ( ( 'way' ) )
            // InternalKant.g:2241:1: ( 'way' )
            {
            // InternalKant.g:2241:1: ( 'way' )
            // InternalKant.g:2242:2: 'way'
            {
             before(grammarAccess.getFunctionDefAccess().getWayKeyword_7_1()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getFunctionDefAccess().getWayKeyword_7_1()); 

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
    // $ANTLR end "rule__FunctionDef__Group_7__1__Impl"


    // $ANTLR start "rule__FunctionParam__Group__0"
    // InternalKant.g:2252:1: rule__FunctionParam__Group__0 : rule__FunctionParam__Group__0__Impl rule__FunctionParam__Group__1 ;
    public final void rule__FunctionParam__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:2256:1: ( rule__FunctionParam__Group__0__Impl rule__FunctionParam__Group__1 )
            // InternalKant.g:2257:2: rule__FunctionParam__Group__0__Impl rule__FunctionParam__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__FunctionParam__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FunctionParam__Group__1();

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
    // $ANTLR end "rule__FunctionParam__Group__0"


    // $ANTLR start "rule__FunctionParam__Group__0__Impl"
    // InternalKant.g:2264:1: rule__FunctionParam__Group__0__Impl : ( ( rule__FunctionParam__VariadicAssignment_0 )? ) ;
    public final void rule__FunctionParam__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:2268:1: ( ( ( rule__FunctionParam__VariadicAssignment_0 )? ) )
            // InternalKant.g:2269:1: ( ( rule__FunctionParam__VariadicAssignment_0 )? )
            {
            // InternalKant.g:2269:1: ( ( rule__FunctionParam__VariadicAssignment_0 )? )
            // InternalKant.g:2270:2: ( rule__FunctionParam__VariadicAssignment_0 )?
            {
             before(grammarAccess.getFunctionParamAccess().getVariadicAssignment_0()); 
            // InternalKant.g:2271:2: ( rule__FunctionParam__VariadicAssignment_0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==31) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalKant.g:2271:3: rule__FunctionParam__VariadicAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FunctionParam__VariadicAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFunctionParamAccess().getVariadicAssignment_0()); 

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
    // $ANTLR end "rule__FunctionParam__Group__0__Impl"


    // $ANTLR start "rule__FunctionParam__Group__1"
    // InternalKant.g:2279:1: rule__FunctionParam__Group__1 : rule__FunctionParam__Group__1__Impl rule__FunctionParam__Group__2 ;
    public final void rule__FunctionParam__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:2283:1: ( rule__FunctionParam__Group__1__Impl rule__FunctionParam__Group__2 )
            // InternalKant.g:2284:2: rule__FunctionParam__Group__1__Impl rule__FunctionParam__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__FunctionParam__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FunctionParam__Group__2();

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
    // $ANTLR end "rule__FunctionParam__Group__1"


    // $ANTLR start "rule__FunctionParam__Group__1__Impl"
    // InternalKant.g:2291:1: rule__FunctionParam__Group__1__Impl : ( ( rule__FunctionParam__NameAssignment_1 ) ) ;
    public final void rule__FunctionParam__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:2295:1: ( ( ( rule__FunctionParam__NameAssignment_1 ) ) )
            // InternalKant.g:2296:1: ( ( rule__FunctionParam__NameAssignment_1 ) )
            {
            // InternalKant.g:2296:1: ( ( rule__FunctionParam__NameAssignment_1 ) )
            // InternalKant.g:2297:2: ( rule__FunctionParam__NameAssignment_1 )
            {
             before(grammarAccess.getFunctionParamAccess().getNameAssignment_1()); 
            // InternalKant.g:2298:2: ( rule__FunctionParam__NameAssignment_1 )
            // InternalKant.g:2298:3: rule__FunctionParam__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__FunctionParam__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFunctionParamAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__FunctionParam__Group__1__Impl"


    // $ANTLR start "rule__FunctionParam__Group__2"
    // InternalKant.g:2306:1: rule__FunctionParam__Group__2 : rule__FunctionParam__Group__2__Impl rule__FunctionParam__Group__3 ;
    public final void rule__FunctionParam__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:2310:1: ( rule__FunctionParam__Group__2__Impl rule__FunctionParam__Group__3 )
            // InternalKant.g:2311:2: rule__FunctionParam__Group__2__Impl rule__FunctionParam__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__FunctionParam__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FunctionParam__Group__3();

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
    // $ANTLR end "rule__FunctionParam__Group__2"


    // $ANTLR start "rule__FunctionParam__Group__2__Impl"
    // InternalKant.g:2318:1: rule__FunctionParam__Group__2__Impl : ( ( rule__FunctionParam__OptAssignment_2 )? ) ;
    public final void rule__FunctionParam__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:2322:1: ( ( ( rule__FunctionParam__OptAssignment_2 )? ) )
            // InternalKant.g:2323:1: ( ( rule__FunctionParam__OptAssignment_2 )? )
            {
            // InternalKant.g:2323:1: ( ( rule__FunctionParam__OptAssignment_2 )? )
            // InternalKant.g:2324:2: ( rule__FunctionParam__OptAssignment_2 )?
            {
             before(grammarAccess.getFunctionParamAccess().getOptAssignment_2()); 
            // InternalKant.g:2325:2: ( rule__FunctionParam__OptAssignment_2 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==46) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalKant.g:2325:3: rule__FunctionParam__OptAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__FunctionParam__OptAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFunctionParamAccess().getOptAssignment_2()); 

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
    // $ANTLR end "rule__FunctionParam__Group__2__Impl"


    // $ANTLR start "rule__FunctionParam__Group__3"
    // InternalKant.g:2333:1: rule__FunctionParam__Group__3 : rule__FunctionParam__Group__3__Impl ;
    public final void rule__FunctionParam__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:2337:1: ( rule__FunctionParam__Group__3__Impl )
            // InternalKant.g:2338:2: rule__FunctionParam__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FunctionParam__Group__3__Impl();

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
    // $ANTLR end "rule__FunctionParam__Group__3"


    // $ANTLR start "rule__FunctionParam__Group__3__Impl"
    // InternalKant.g:2344:1: rule__FunctionParam__Group__3__Impl : ( ( rule__FunctionParam__Group_3__0 )? ) ;
    public final void rule__FunctionParam__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:2348:1: ( ( ( rule__FunctionParam__Group_3__0 )? ) )
            // InternalKant.g:2349:1: ( ( rule__FunctionParam__Group_3__0 )? )
            {
            // InternalKant.g:2349:1: ( ( rule__FunctionParam__Group_3__0 )? )
            // InternalKant.g:2350:2: ( rule__FunctionParam__Group_3__0 )?
            {
             before(grammarAccess.getFunctionParamAccess().getGroup_3()); 
            // InternalKant.g:2351:2: ( rule__FunctionParam__Group_3__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==20) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalKant.g:2351:3: rule__FunctionParam__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FunctionParam__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFunctionParamAccess().getGroup_3()); 

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
    // $ANTLR end "rule__FunctionParam__Group__3__Impl"


    // $ANTLR start "rule__FunctionParam__Group_3__0"
    // InternalKant.g:2360:1: rule__FunctionParam__Group_3__0 : rule__FunctionParam__Group_3__0__Impl rule__FunctionParam__Group_3__1 ;
    public final void rule__FunctionParam__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:2364:1: ( rule__FunctionParam__Group_3__0__Impl rule__FunctionParam__Group_3__1 )
            // InternalKant.g:2365:2: rule__FunctionParam__Group_3__0__Impl rule__FunctionParam__Group_3__1
            {
            pushFollow(FOLLOW_14);
            rule__FunctionParam__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FunctionParam__Group_3__1();

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
    // $ANTLR end "rule__FunctionParam__Group_3__0"


    // $ANTLR start "rule__FunctionParam__Group_3__0__Impl"
    // InternalKant.g:2372:1: rule__FunctionParam__Group_3__0__Impl : ( '=' ) ;
    public final void rule__FunctionParam__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:2376:1: ( ( '=' ) )
            // InternalKant.g:2377:1: ( '=' )
            {
            // InternalKant.g:2377:1: ( '=' )
            // InternalKant.g:2378:2: '='
            {
             before(grammarAccess.getFunctionParamAccess().getEqualsSignKeyword_3_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getFunctionParamAccess().getEqualsSignKeyword_3_0()); 

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
    // $ANTLR end "rule__FunctionParam__Group_3__0__Impl"


    // $ANTLR start "rule__FunctionParam__Group_3__1"
    // InternalKant.g:2387:1: rule__FunctionParam__Group_3__1 : rule__FunctionParam__Group_3__1__Impl ;
    public final void rule__FunctionParam__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:2391:1: ( rule__FunctionParam__Group_3__1__Impl )
            // InternalKant.g:2392:2: rule__FunctionParam__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FunctionParam__Group_3__1__Impl();

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
    // $ANTLR end "rule__FunctionParam__Group_3__1"


    // $ANTLR start "rule__FunctionParam__Group_3__1__Impl"
    // InternalKant.g:2398:1: rule__FunctionParam__Group_3__1__Impl : ( ( rule__FunctionParam__TypeAssignment_3_1 ) ) ;
    public final void rule__FunctionParam__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:2402:1: ( ( ( rule__FunctionParam__TypeAssignment_3_1 ) ) )
            // InternalKant.g:2403:1: ( ( rule__FunctionParam__TypeAssignment_3_1 ) )
            {
            // InternalKant.g:2403:1: ( ( rule__FunctionParam__TypeAssignment_3_1 ) )
            // InternalKant.g:2404:2: ( rule__FunctionParam__TypeAssignment_3_1 )
            {
             before(grammarAccess.getFunctionParamAccess().getTypeAssignment_3_1()); 
            // InternalKant.g:2405:2: ( rule__FunctionParam__TypeAssignment_3_1 )
            // InternalKant.g:2405:3: rule__FunctionParam__TypeAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__FunctionParam__TypeAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getFunctionParamAccess().getTypeAssignment_3_1()); 

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
    // $ANTLR end "rule__FunctionParam__Group_3__1__Impl"


    // $ANTLR start "rule__FunctionKey__Group_1__0"
    // InternalKant.g:2414:1: rule__FunctionKey__Group_1__0 : rule__FunctionKey__Group_1__0__Impl rule__FunctionKey__Group_1__1 ;
    public final void rule__FunctionKey__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:2418:1: ( rule__FunctionKey__Group_1__0__Impl rule__FunctionKey__Group_1__1 )
            // InternalKant.g:2419:2: rule__FunctionKey__Group_1__0__Impl rule__FunctionKey__Group_1__1
            {
            pushFollow(FOLLOW_4);
            rule__FunctionKey__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FunctionKey__Group_1__1();

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
    // $ANTLR end "rule__FunctionKey__Group_1__0"


    // $ANTLR start "rule__FunctionKey__Group_1__0__Impl"
    // InternalKant.g:2426:1: rule__FunctionKey__Group_1__0__Impl : ( '{' ) ;
    public final void rule__FunctionKey__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:2430:1: ( ( '{' ) )
            // InternalKant.g:2431:1: ( '{' )
            {
            // InternalKant.g:2431:1: ( '{' )
            // InternalKant.g:2432:2: '{'
            {
             before(grammarAccess.getFunctionKeyAccess().getLeftCurlyBracketKeyword_1_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getFunctionKeyAccess().getLeftCurlyBracketKeyword_1_0()); 

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
    // $ANTLR end "rule__FunctionKey__Group_1__0__Impl"


    // $ANTLR start "rule__FunctionKey__Group_1__1"
    // InternalKant.g:2441:1: rule__FunctionKey__Group_1__1 : rule__FunctionKey__Group_1__1__Impl rule__FunctionKey__Group_1__2 ;
    public final void rule__FunctionKey__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:2445:1: ( rule__FunctionKey__Group_1__1__Impl rule__FunctionKey__Group_1__2 )
            // InternalKant.g:2446:2: rule__FunctionKey__Group_1__1__Impl rule__FunctionKey__Group_1__2
            {
            pushFollow(FOLLOW_15);
            rule__FunctionKey__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FunctionKey__Group_1__2();

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
    // $ANTLR end "rule__FunctionKey__Group_1__1"


    // $ANTLR start "rule__FunctionKey__Group_1__1__Impl"
    // InternalKant.g:2453:1: rule__FunctionKey__Group_1__1__Impl : ( ( rule__FunctionKey__ElementsAssignment_1_1 ) ) ;
    public final void rule__FunctionKey__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:2457:1: ( ( ( rule__FunctionKey__ElementsAssignment_1_1 ) ) )
            // InternalKant.g:2458:1: ( ( rule__FunctionKey__ElementsAssignment_1_1 ) )
            {
            // InternalKant.g:2458:1: ( ( rule__FunctionKey__ElementsAssignment_1_1 ) )
            // InternalKant.g:2459:2: ( rule__FunctionKey__ElementsAssignment_1_1 )
            {
             before(grammarAccess.getFunctionKeyAccess().getElementsAssignment_1_1()); 
            // InternalKant.g:2460:2: ( rule__FunctionKey__ElementsAssignment_1_1 )
            // InternalKant.g:2460:3: rule__FunctionKey__ElementsAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__FunctionKey__ElementsAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getFunctionKeyAccess().getElementsAssignment_1_1()); 

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
    // $ANTLR end "rule__FunctionKey__Group_1__1__Impl"


    // $ANTLR start "rule__FunctionKey__Group_1__2"
    // InternalKant.g:2468:1: rule__FunctionKey__Group_1__2 : rule__FunctionKey__Group_1__2__Impl rule__FunctionKey__Group_1__3 ;
    public final void rule__FunctionKey__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:2472:1: ( rule__FunctionKey__Group_1__2__Impl rule__FunctionKey__Group_1__3 )
            // InternalKant.g:2473:2: rule__FunctionKey__Group_1__2__Impl rule__FunctionKey__Group_1__3
            {
            pushFollow(FOLLOW_15);
            rule__FunctionKey__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FunctionKey__Group_1__3();

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
    // $ANTLR end "rule__FunctionKey__Group_1__2"


    // $ANTLR start "rule__FunctionKey__Group_1__2__Impl"
    // InternalKant.g:2480:1: rule__FunctionKey__Group_1__2__Impl : ( ( rule__FunctionKey__Group_1_2__0 )* ) ;
    public final void rule__FunctionKey__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:2484:1: ( ( ( rule__FunctionKey__Group_1_2__0 )* ) )
            // InternalKant.g:2485:1: ( ( rule__FunctionKey__Group_1_2__0 )* )
            {
            // InternalKant.g:2485:1: ( ( rule__FunctionKey__Group_1_2__0 )* )
            // InternalKant.g:2486:2: ( rule__FunctionKey__Group_1_2__0 )*
            {
             before(grammarAccess.getFunctionKeyAccess().getGroup_1_2()); 
            // InternalKant.g:2487:2: ( rule__FunctionKey__Group_1_2__0 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==13) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalKant.g:2487:3: rule__FunctionKey__Group_1_2__0
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__FunctionKey__Group_1_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

             after(grammarAccess.getFunctionKeyAccess().getGroup_1_2()); 

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
    // $ANTLR end "rule__FunctionKey__Group_1__2__Impl"


    // $ANTLR start "rule__FunctionKey__Group_1__3"
    // InternalKant.g:2495:1: rule__FunctionKey__Group_1__3 : rule__FunctionKey__Group_1__3__Impl ;
    public final void rule__FunctionKey__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:2499:1: ( rule__FunctionKey__Group_1__3__Impl )
            // InternalKant.g:2500:2: rule__FunctionKey__Group_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FunctionKey__Group_1__3__Impl();

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
    // $ANTLR end "rule__FunctionKey__Group_1__3"


    // $ANTLR start "rule__FunctionKey__Group_1__3__Impl"
    // InternalKant.g:2506:1: rule__FunctionKey__Group_1__3__Impl : ( '}' ) ;
    public final void rule__FunctionKey__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:2510:1: ( ( '}' ) )
            // InternalKant.g:2511:1: ( '}' )
            {
            // InternalKant.g:2511:1: ( '}' )
            // InternalKant.g:2512:2: '}'
            {
             before(grammarAccess.getFunctionKeyAccess().getRightCurlyBracketKeyword_1_3()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getFunctionKeyAccess().getRightCurlyBracketKeyword_1_3()); 

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
    // $ANTLR end "rule__FunctionKey__Group_1__3__Impl"


    // $ANTLR start "rule__FunctionKey__Group_1_2__0"
    // InternalKant.g:2522:1: rule__FunctionKey__Group_1_2__0 : rule__FunctionKey__Group_1_2__0__Impl rule__FunctionKey__Group_1_2__1 ;
    public final void rule__FunctionKey__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:2526:1: ( rule__FunctionKey__Group_1_2__0__Impl rule__FunctionKey__Group_1_2__1 )
            // InternalKant.g:2527:2: rule__FunctionKey__Group_1_2__0__Impl rule__FunctionKey__Group_1_2__1
            {
            pushFollow(FOLLOW_4);
            rule__FunctionKey__Group_1_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FunctionKey__Group_1_2__1();

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
    // $ANTLR end "rule__FunctionKey__Group_1_2__0"


    // $ANTLR start "rule__FunctionKey__Group_1_2__0__Impl"
    // InternalKant.g:2534:1: rule__FunctionKey__Group_1_2__0__Impl : ( ',' ) ;
    public final void rule__FunctionKey__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:2538:1: ( ( ',' ) )
            // InternalKant.g:2539:1: ( ',' )
            {
            // InternalKant.g:2539:1: ( ',' )
            // InternalKant.g:2540:2: ','
            {
             before(grammarAccess.getFunctionKeyAccess().getCommaKeyword_1_2_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getFunctionKeyAccess().getCommaKeyword_1_2_0()); 

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
    // $ANTLR end "rule__FunctionKey__Group_1_2__0__Impl"


    // $ANTLR start "rule__FunctionKey__Group_1_2__1"
    // InternalKant.g:2549:1: rule__FunctionKey__Group_1_2__1 : rule__FunctionKey__Group_1_2__1__Impl ;
    public final void rule__FunctionKey__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:2553:1: ( rule__FunctionKey__Group_1_2__1__Impl )
            // InternalKant.g:2554:2: rule__FunctionKey__Group_1_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FunctionKey__Group_1_2__1__Impl();

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
    // $ANTLR end "rule__FunctionKey__Group_1_2__1"


    // $ANTLR start "rule__FunctionKey__Group_1_2__1__Impl"
    // InternalKant.g:2560:1: rule__FunctionKey__Group_1_2__1__Impl : ( ( rule__FunctionKey__ElementsAssignment_1_2_1 ) ) ;
    public final void rule__FunctionKey__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:2564:1: ( ( ( rule__FunctionKey__ElementsAssignment_1_2_1 ) ) )
            // InternalKant.g:2565:1: ( ( rule__FunctionKey__ElementsAssignment_1_2_1 ) )
            {
            // InternalKant.g:2565:1: ( ( rule__FunctionKey__ElementsAssignment_1_2_1 ) )
            // InternalKant.g:2566:2: ( rule__FunctionKey__ElementsAssignment_1_2_1 )
            {
             before(grammarAccess.getFunctionKeyAccess().getElementsAssignment_1_2_1()); 
            // InternalKant.g:2567:2: ( rule__FunctionKey__ElementsAssignment_1_2_1 )
            // InternalKant.g:2567:3: rule__FunctionKey__ElementsAssignment_1_2_1
            {
            pushFollow(FOLLOW_2);
            rule__FunctionKey__ElementsAssignment_1_2_1();

            state._fsp--;


            }

             after(grammarAccess.getFunctionKeyAccess().getElementsAssignment_1_2_1()); 

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
    // $ANTLR end "rule__FunctionKey__Group_1_2__1__Impl"


    // $ANTLR start "rule__FunctionKeyElement__Group__0"
    // InternalKant.g:2576:1: rule__FunctionKeyElement__Group__0 : rule__FunctionKeyElement__Group__0__Impl rule__FunctionKeyElement__Group__1 ;
    public final void rule__FunctionKeyElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:2580:1: ( rule__FunctionKeyElement__Group__0__Impl rule__FunctionKeyElement__Group__1 )
            // InternalKant.g:2581:2: rule__FunctionKeyElement__Group__0__Impl rule__FunctionKeyElement__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__FunctionKeyElement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FunctionKeyElement__Group__1();

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
    // $ANTLR end "rule__FunctionKeyElement__Group__0"


    // $ANTLR start "rule__FunctionKeyElement__Group__0__Impl"
    // InternalKant.g:2588:1: rule__FunctionKeyElement__Group__0__Impl : ( ( rule__FunctionKeyElement__NameAssignment_0 ) ) ;
    public final void rule__FunctionKeyElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:2592:1: ( ( ( rule__FunctionKeyElement__NameAssignment_0 ) ) )
            // InternalKant.g:2593:1: ( ( rule__FunctionKeyElement__NameAssignment_0 ) )
            {
            // InternalKant.g:2593:1: ( ( rule__FunctionKeyElement__NameAssignment_0 ) )
            // InternalKant.g:2594:2: ( rule__FunctionKeyElement__NameAssignment_0 )
            {
             before(grammarAccess.getFunctionKeyElementAccess().getNameAssignment_0()); 
            // InternalKant.g:2595:2: ( rule__FunctionKeyElement__NameAssignment_0 )
            // InternalKant.g:2595:3: rule__FunctionKeyElement__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__FunctionKeyElement__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getFunctionKeyElementAccess().getNameAssignment_0()); 

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
    // $ANTLR end "rule__FunctionKeyElement__Group__0__Impl"


    // $ANTLR start "rule__FunctionKeyElement__Group__1"
    // InternalKant.g:2603:1: rule__FunctionKeyElement__Group__1 : rule__FunctionKeyElement__Group__1__Impl ;
    public final void rule__FunctionKeyElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:2607:1: ( rule__FunctionKeyElement__Group__1__Impl )
            // InternalKant.g:2608:2: rule__FunctionKeyElement__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FunctionKeyElement__Group__1__Impl();

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
    // $ANTLR end "rule__FunctionKeyElement__Group__1"


    // $ANTLR start "rule__FunctionKeyElement__Group__1__Impl"
    // InternalKant.g:2614:1: rule__FunctionKeyElement__Group__1__Impl : ( ( rule__FunctionKeyElement__Group_1__0 )? ) ;
    public final void rule__FunctionKeyElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:2618:1: ( ( ( rule__FunctionKeyElement__Group_1__0 )? ) )
            // InternalKant.g:2619:1: ( ( rule__FunctionKeyElement__Group_1__0 )? )
            {
            // InternalKant.g:2619:1: ( ( rule__FunctionKeyElement__Group_1__0 )? )
            // InternalKant.g:2620:2: ( rule__FunctionKeyElement__Group_1__0 )?
            {
             before(grammarAccess.getFunctionKeyElementAccess().getGroup_1()); 
            // InternalKant.g:2621:2: ( rule__FunctionKeyElement__Group_1__0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==20) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalKant.g:2621:3: rule__FunctionKeyElement__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FunctionKeyElement__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFunctionKeyElementAccess().getGroup_1()); 

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
    // $ANTLR end "rule__FunctionKeyElement__Group__1__Impl"


    // $ANTLR start "rule__FunctionKeyElement__Group_1__0"
    // InternalKant.g:2630:1: rule__FunctionKeyElement__Group_1__0 : rule__FunctionKeyElement__Group_1__0__Impl rule__FunctionKeyElement__Group_1__1 ;
    public final void rule__FunctionKeyElement__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:2634:1: ( rule__FunctionKeyElement__Group_1__0__Impl rule__FunctionKeyElement__Group_1__1 )
            // InternalKant.g:2635:2: rule__FunctionKeyElement__Group_1__0__Impl rule__FunctionKeyElement__Group_1__1
            {
            pushFollow(FOLLOW_14);
            rule__FunctionKeyElement__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FunctionKeyElement__Group_1__1();

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
    // $ANTLR end "rule__FunctionKeyElement__Group_1__0"


    // $ANTLR start "rule__FunctionKeyElement__Group_1__0__Impl"
    // InternalKant.g:2642:1: rule__FunctionKeyElement__Group_1__0__Impl : ( '=' ) ;
    public final void rule__FunctionKeyElement__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:2646:1: ( ( '=' ) )
            // InternalKant.g:2647:1: ( '=' )
            {
            // InternalKant.g:2647:1: ( '=' )
            // InternalKant.g:2648:2: '='
            {
             before(grammarAccess.getFunctionKeyElementAccess().getEqualsSignKeyword_1_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getFunctionKeyElementAccess().getEqualsSignKeyword_1_0()); 

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
    // $ANTLR end "rule__FunctionKeyElement__Group_1__0__Impl"


    // $ANTLR start "rule__FunctionKeyElement__Group_1__1"
    // InternalKant.g:2657:1: rule__FunctionKeyElement__Group_1__1 : rule__FunctionKeyElement__Group_1__1__Impl ;
    public final void rule__FunctionKeyElement__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:2661:1: ( rule__FunctionKeyElement__Group_1__1__Impl )
            // InternalKant.g:2662:2: rule__FunctionKeyElement__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FunctionKeyElement__Group_1__1__Impl();

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
    // $ANTLR end "rule__FunctionKeyElement__Group_1__1"


    // $ANTLR start "rule__FunctionKeyElement__Group_1__1__Impl"
    // InternalKant.g:2668:1: rule__FunctionKeyElement__Group_1__1__Impl : ( ( rule__FunctionKeyElement__TypeAssignment_1_1 ) ) ;
    public final void rule__FunctionKeyElement__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:2672:1: ( ( ( rule__FunctionKeyElement__TypeAssignment_1_1 ) ) )
            // InternalKant.g:2673:1: ( ( rule__FunctionKeyElement__TypeAssignment_1_1 ) )
            {
            // InternalKant.g:2673:1: ( ( rule__FunctionKeyElement__TypeAssignment_1_1 ) )
            // InternalKant.g:2674:2: ( rule__FunctionKeyElement__TypeAssignment_1_1 )
            {
             before(grammarAccess.getFunctionKeyElementAccess().getTypeAssignment_1_1()); 
            // InternalKant.g:2675:2: ( rule__FunctionKeyElement__TypeAssignment_1_1 )
            // InternalKant.g:2675:3: rule__FunctionKeyElement__TypeAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__FunctionKeyElement__TypeAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getFunctionKeyElementAccess().getTypeAssignment_1_1()); 

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
    // $ANTLR end "rule__FunctionKeyElement__Group_1__1__Impl"


    // $ANTLR start "rule__FunctionReturn__Group_1__0"
    // InternalKant.g:2684:1: rule__FunctionReturn__Group_1__0 : rule__FunctionReturn__Group_1__0__Impl rule__FunctionReturn__Group_1__1 ;
    public final void rule__FunctionReturn__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:2688:1: ( rule__FunctionReturn__Group_1__0__Impl rule__FunctionReturn__Group_1__1 )
            // InternalKant.g:2689:2: rule__FunctionReturn__Group_1__0__Impl rule__FunctionReturn__Group_1__1
            {
            pushFollow(FOLLOW_4);
            rule__FunctionReturn__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FunctionReturn__Group_1__1();

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
    // $ANTLR end "rule__FunctionReturn__Group_1__0"


    // $ANTLR start "rule__FunctionReturn__Group_1__0__Impl"
    // InternalKant.g:2696:1: rule__FunctionReturn__Group_1__0__Impl : ( '{' ) ;
    public final void rule__FunctionReturn__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:2700:1: ( ( '{' ) )
            // InternalKant.g:2701:1: ( '{' )
            {
            // InternalKant.g:2701:1: ( '{' )
            // InternalKant.g:2702:2: '{'
            {
             before(grammarAccess.getFunctionReturnAccess().getLeftCurlyBracketKeyword_1_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getFunctionReturnAccess().getLeftCurlyBracketKeyword_1_0()); 

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
    // $ANTLR end "rule__FunctionReturn__Group_1__0__Impl"


    // $ANTLR start "rule__FunctionReturn__Group_1__1"
    // InternalKant.g:2711:1: rule__FunctionReturn__Group_1__1 : rule__FunctionReturn__Group_1__1__Impl rule__FunctionReturn__Group_1__2 ;
    public final void rule__FunctionReturn__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:2715:1: ( rule__FunctionReturn__Group_1__1__Impl rule__FunctionReturn__Group_1__2 )
            // InternalKant.g:2716:2: rule__FunctionReturn__Group_1__1__Impl rule__FunctionReturn__Group_1__2
            {
            pushFollow(FOLLOW_15);
            rule__FunctionReturn__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FunctionReturn__Group_1__2();

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
    // $ANTLR end "rule__FunctionReturn__Group_1__1"


    // $ANTLR start "rule__FunctionReturn__Group_1__1__Impl"
    // InternalKant.g:2723:1: rule__FunctionReturn__Group_1__1__Impl : ( ( rule__FunctionReturn__ElementsAssignment_1_1 ) ) ;
    public final void rule__FunctionReturn__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:2727:1: ( ( ( rule__FunctionReturn__ElementsAssignment_1_1 ) ) )
            // InternalKant.g:2728:1: ( ( rule__FunctionReturn__ElementsAssignment_1_1 ) )
            {
            // InternalKant.g:2728:1: ( ( rule__FunctionReturn__ElementsAssignment_1_1 ) )
            // InternalKant.g:2729:2: ( rule__FunctionReturn__ElementsAssignment_1_1 )
            {
             before(grammarAccess.getFunctionReturnAccess().getElementsAssignment_1_1()); 
            // InternalKant.g:2730:2: ( rule__FunctionReturn__ElementsAssignment_1_1 )
            // InternalKant.g:2730:3: rule__FunctionReturn__ElementsAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__FunctionReturn__ElementsAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getFunctionReturnAccess().getElementsAssignment_1_1()); 

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
    // $ANTLR end "rule__FunctionReturn__Group_1__1__Impl"


    // $ANTLR start "rule__FunctionReturn__Group_1__2"
    // InternalKant.g:2738:1: rule__FunctionReturn__Group_1__2 : rule__FunctionReturn__Group_1__2__Impl rule__FunctionReturn__Group_1__3 ;
    public final void rule__FunctionReturn__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:2742:1: ( rule__FunctionReturn__Group_1__2__Impl rule__FunctionReturn__Group_1__3 )
            // InternalKant.g:2743:2: rule__FunctionReturn__Group_1__2__Impl rule__FunctionReturn__Group_1__3
            {
            pushFollow(FOLLOW_15);
            rule__FunctionReturn__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FunctionReturn__Group_1__3();

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
    // $ANTLR end "rule__FunctionReturn__Group_1__2"


    // $ANTLR start "rule__FunctionReturn__Group_1__2__Impl"
    // InternalKant.g:2750:1: rule__FunctionReturn__Group_1__2__Impl : ( ( rule__FunctionReturn__Group_1_2__0 )* ) ;
    public final void rule__FunctionReturn__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:2754:1: ( ( ( rule__FunctionReturn__Group_1_2__0 )* ) )
            // InternalKant.g:2755:1: ( ( rule__FunctionReturn__Group_1_2__0 )* )
            {
            // InternalKant.g:2755:1: ( ( rule__FunctionReturn__Group_1_2__0 )* )
            // InternalKant.g:2756:2: ( rule__FunctionReturn__Group_1_2__0 )*
            {
             before(grammarAccess.getFunctionReturnAccess().getGroup_1_2()); 
            // InternalKant.g:2757:2: ( rule__FunctionReturn__Group_1_2__0 )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==13) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalKant.g:2757:3: rule__FunctionReturn__Group_1_2__0
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__FunctionReturn__Group_1_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);

             after(grammarAccess.getFunctionReturnAccess().getGroup_1_2()); 

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
    // $ANTLR end "rule__FunctionReturn__Group_1__2__Impl"


    // $ANTLR start "rule__FunctionReturn__Group_1__3"
    // InternalKant.g:2765:1: rule__FunctionReturn__Group_1__3 : rule__FunctionReturn__Group_1__3__Impl ;
    public final void rule__FunctionReturn__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:2769:1: ( rule__FunctionReturn__Group_1__3__Impl )
            // InternalKant.g:2770:2: rule__FunctionReturn__Group_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FunctionReturn__Group_1__3__Impl();

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
    // $ANTLR end "rule__FunctionReturn__Group_1__3"


    // $ANTLR start "rule__FunctionReturn__Group_1__3__Impl"
    // InternalKant.g:2776:1: rule__FunctionReturn__Group_1__3__Impl : ( '}' ) ;
    public final void rule__FunctionReturn__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:2780:1: ( ( '}' ) )
            // InternalKant.g:2781:1: ( '}' )
            {
            // InternalKant.g:2781:1: ( '}' )
            // InternalKant.g:2782:2: '}'
            {
             before(grammarAccess.getFunctionReturnAccess().getRightCurlyBracketKeyword_1_3()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getFunctionReturnAccess().getRightCurlyBracketKeyword_1_3()); 

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
    // $ANTLR end "rule__FunctionReturn__Group_1__3__Impl"


    // $ANTLR start "rule__FunctionReturn__Group_1_2__0"
    // InternalKant.g:2792:1: rule__FunctionReturn__Group_1_2__0 : rule__FunctionReturn__Group_1_2__0__Impl rule__FunctionReturn__Group_1_2__1 ;
    public final void rule__FunctionReturn__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:2796:1: ( rule__FunctionReturn__Group_1_2__0__Impl rule__FunctionReturn__Group_1_2__1 )
            // InternalKant.g:2797:2: rule__FunctionReturn__Group_1_2__0__Impl rule__FunctionReturn__Group_1_2__1
            {
            pushFollow(FOLLOW_4);
            rule__FunctionReturn__Group_1_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FunctionReturn__Group_1_2__1();

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
    // $ANTLR end "rule__FunctionReturn__Group_1_2__0"


    // $ANTLR start "rule__FunctionReturn__Group_1_2__0__Impl"
    // InternalKant.g:2804:1: rule__FunctionReturn__Group_1_2__0__Impl : ( ',' ) ;
    public final void rule__FunctionReturn__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:2808:1: ( ( ',' ) )
            // InternalKant.g:2809:1: ( ',' )
            {
            // InternalKant.g:2809:1: ( ',' )
            // InternalKant.g:2810:2: ','
            {
             before(grammarAccess.getFunctionReturnAccess().getCommaKeyword_1_2_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getFunctionReturnAccess().getCommaKeyword_1_2_0()); 

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
    // $ANTLR end "rule__FunctionReturn__Group_1_2__0__Impl"


    // $ANTLR start "rule__FunctionReturn__Group_1_2__1"
    // InternalKant.g:2819:1: rule__FunctionReturn__Group_1_2__1 : rule__FunctionReturn__Group_1_2__1__Impl ;
    public final void rule__FunctionReturn__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:2823:1: ( rule__FunctionReturn__Group_1_2__1__Impl )
            // InternalKant.g:2824:2: rule__FunctionReturn__Group_1_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FunctionReturn__Group_1_2__1__Impl();

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
    // $ANTLR end "rule__FunctionReturn__Group_1_2__1"


    // $ANTLR start "rule__FunctionReturn__Group_1_2__1__Impl"
    // InternalKant.g:2830:1: rule__FunctionReturn__Group_1_2__1__Impl : ( ( rule__FunctionReturn__ElementsAssignment_1_2_1 ) ) ;
    public final void rule__FunctionReturn__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:2834:1: ( ( ( rule__FunctionReturn__ElementsAssignment_1_2_1 ) ) )
            // InternalKant.g:2835:1: ( ( rule__FunctionReturn__ElementsAssignment_1_2_1 ) )
            {
            // InternalKant.g:2835:1: ( ( rule__FunctionReturn__ElementsAssignment_1_2_1 ) )
            // InternalKant.g:2836:2: ( rule__FunctionReturn__ElementsAssignment_1_2_1 )
            {
             before(grammarAccess.getFunctionReturnAccess().getElementsAssignment_1_2_1()); 
            // InternalKant.g:2837:2: ( rule__FunctionReturn__ElementsAssignment_1_2_1 )
            // InternalKant.g:2837:3: rule__FunctionReturn__ElementsAssignment_1_2_1
            {
            pushFollow(FOLLOW_2);
            rule__FunctionReturn__ElementsAssignment_1_2_1();

            state._fsp--;


            }

             after(grammarAccess.getFunctionReturnAccess().getElementsAssignment_1_2_1()); 

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
    // $ANTLR end "rule__FunctionReturn__Group_1_2__1__Impl"


    // $ANTLR start "rule__FunctionReturnElement__Group__0"
    // InternalKant.g:2846:1: rule__FunctionReturnElement__Group__0 : rule__FunctionReturnElement__Group__0__Impl rule__FunctionReturnElement__Group__1 ;
    public final void rule__FunctionReturnElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:2850:1: ( rule__FunctionReturnElement__Group__0__Impl rule__FunctionReturnElement__Group__1 )
            // InternalKant.g:2851:2: rule__FunctionReturnElement__Group__0__Impl rule__FunctionReturnElement__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__FunctionReturnElement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FunctionReturnElement__Group__1();

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
    // $ANTLR end "rule__FunctionReturnElement__Group__0"


    // $ANTLR start "rule__FunctionReturnElement__Group__0__Impl"
    // InternalKant.g:2858:1: rule__FunctionReturnElement__Group__0__Impl : ( ( rule__FunctionReturnElement__NameAssignment_0 ) ) ;
    public final void rule__FunctionReturnElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:2862:1: ( ( ( rule__FunctionReturnElement__NameAssignment_0 ) ) )
            // InternalKant.g:2863:1: ( ( rule__FunctionReturnElement__NameAssignment_0 ) )
            {
            // InternalKant.g:2863:1: ( ( rule__FunctionReturnElement__NameAssignment_0 ) )
            // InternalKant.g:2864:2: ( rule__FunctionReturnElement__NameAssignment_0 )
            {
             before(grammarAccess.getFunctionReturnElementAccess().getNameAssignment_0()); 
            // InternalKant.g:2865:2: ( rule__FunctionReturnElement__NameAssignment_0 )
            // InternalKant.g:2865:3: rule__FunctionReturnElement__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__FunctionReturnElement__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getFunctionReturnElementAccess().getNameAssignment_0()); 

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
    // $ANTLR end "rule__FunctionReturnElement__Group__0__Impl"


    // $ANTLR start "rule__FunctionReturnElement__Group__1"
    // InternalKant.g:2873:1: rule__FunctionReturnElement__Group__1 : rule__FunctionReturnElement__Group__1__Impl ;
    public final void rule__FunctionReturnElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:2877:1: ( rule__FunctionReturnElement__Group__1__Impl )
            // InternalKant.g:2878:2: rule__FunctionReturnElement__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FunctionReturnElement__Group__1__Impl();

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
    // $ANTLR end "rule__FunctionReturnElement__Group__1"


    // $ANTLR start "rule__FunctionReturnElement__Group__1__Impl"
    // InternalKant.g:2884:1: rule__FunctionReturnElement__Group__1__Impl : ( ( rule__FunctionReturnElement__Group_1__0 )? ) ;
    public final void rule__FunctionReturnElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:2888:1: ( ( ( rule__FunctionReturnElement__Group_1__0 )? ) )
            // InternalKant.g:2889:1: ( ( rule__FunctionReturnElement__Group_1__0 )? )
            {
            // InternalKant.g:2889:1: ( ( rule__FunctionReturnElement__Group_1__0 )? )
            // InternalKant.g:2890:2: ( rule__FunctionReturnElement__Group_1__0 )?
            {
             before(grammarAccess.getFunctionReturnElementAccess().getGroup_1()); 
            // InternalKant.g:2891:2: ( rule__FunctionReturnElement__Group_1__0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==20) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalKant.g:2891:3: rule__FunctionReturnElement__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FunctionReturnElement__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFunctionReturnElementAccess().getGroup_1()); 

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
    // $ANTLR end "rule__FunctionReturnElement__Group__1__Impl"


    // $ANTLR start "rule__FunctionReturnElement__Group_1__0"
    // InternalKant.g:2900:1: rule__FunctionReturnElement__Group_1__0 : rule__FunctionReturnElement__Group_1__0__Impl rule__FunctionReturnElement__Group_1__1 ;
    public final void rule__FunctionReturnElement__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:2904:1: ( rule__FunctionReturnElement__Group_1__0__Impl rule__FunctionReturnElement__Group_1__1 )
            // InternalKant.g:2905:2: rule__FunctionReturnElement__Group_1__0__Impl rule__FunctionReturnElement__Group_1__1
            {
            pushFollow(FOLLOW_14);
            rule__FunctionReturnElement__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FunctionReturnElement__Group_1__1();

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
    // $ANTLR end "rule__FunctionReturnElement__Group_1__0"


    // $ANTLR start "rule__FunctionReturnElement__Group_1__0__Impl"
    // InternalKant.g:2912:1: rule__FunctionReturnElement__Group_1__0__Impl : ( '=' ) ;
    public final void rule__FunctionReturnElement__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:2916:1: ( ( '=' ) )
            // InternalKant.g:2917:1: ( '=' )
            {
            // InternalKant.g:2917:1: ( '=' )
            // InternalKant.g:2918:2: '='
            {
             before(grammarAccess.getFunctionReturnElementAccess().getEqualsSignKeyword_1_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getFunctionReturnElementAccess().getEqualsSignKeyword_1_0()); 

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
    // $ANTLR end "rule__FunctionReturnElement__Group_1__0__Impl"


    // $ANTLR start "rule__FunctionReturnElement__Group_1__1"
    // InternalKant.g:2927:1: rule__FunctionReturnElement__Group_1__1 : rule__FunctionReturnElement__Group_1__1__Impl ;
    public final void rule__FunctionReturnElement__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:2931:1: ( rule__FunctionReturnElement__Group_1__1__Impl )
            // InternalKant.g:2932:2: rule__FunctionReturnElement__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FunctionReturnElement__Group_1__1__Impl();

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
    // $ANTLR end "rule__FunctionReturnElement__Group_1__1"


    // $ANTLR start "rule__FunctionReturnElement__Group_1__1__Impl"
    // InternalKant.g:2938:1: rule__FunctionReturnElement__Group_1__1__Impl : ( ( rule__FunctionReturnElement__TypeAssignment_1_1 ) ) ;
    public final void rule__FunctionReturnElement__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:2942:1: ( ( ( rule__FunctionReturnElement__TypeAssignment_1_1 ) ) )
            // InternalKant.g:2943:1: ( ( rule__FunctionReturnElement__TypeAssignment_1_1 ) )
            {
            // InternalKant.g:2943:1: ( ( rule__FunctionReturnElement__TypeAssignment_1_1 ) )
            // InternalKant.g:2944:2: ( rule__FunctionReturnElement__TypeAssignment_1_1 )
            {
             before(grammarAccess.getFunctionReturnElementAccess().getTypeAssignment_1_1()); 
            // InternalKant.g:2945:2: ( rule__FunctionReturnElement__TypeAssignment_1_1 )
            // InternalKant.g:2945:3: rule__FunctionReturnElement__TypeAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__FunctionReturnElement__TypeAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getFunctionReturnElementAccess().getTypeAssignment_1_1()); 

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
    // $ANTLR end "rule__FunctionReturnElement__Group_1__1__Impl"


    // $ANTLR start "rule__PropertyDef__Group__0"
    // InternalKant.g:2954:1: rule__PropertyDef__Group__0 : rule__PropertyDef__Group__0__Impl rule__PropertyDef__Group__1 ;
    public final void rule__PropertyDef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:2958:1: ( rule__PropertyDef__Group__0__Impl rule__PropertyDef__Group__1 )
            // InternalKant.g:2959:2: rule__PropertyDef__Group__0__Impl rule__PropertyDef__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__PropertyDef__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PropertyDef__Group__1();

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
    // $ANTLR end "rule__PropertyDef__Group__0"


    // $ANTLR start "rule__PropertyDef__Group__0__Impl"
    // InternalKant.g:2966:1: rule__PropertyDef__Group__0__Impl : ( 'property' ) ;
    public final void rule__PropertyDef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:2970:1: ( ( 'property' ) )
            // InternalKant.g:2971:1: ( 'property' )
            {
            // InternalKant.g:2971:1: ( 'property' )
            // InternalKant.g:2972:2: 'property'
            {
             before(grammarAccess.getPropertyDefAccess().getPropertyKeyword_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getPropertyDefAccess().getPropertyKeyword_0()); 

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
    // $ANTLR end "rule__PropertyDef__Group__0__Impl"


    // $ANTLR start "rule__PropertyDef__Group__1"
    // InternalKant.g:2981:1: rule__PropertyDef__Group__1 : rule__PropertyDef__Group__1__Impl ;
    public final void rule__PropertyDef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:2985:1: ( rule__PropertyDef__Group__1__Impl )
            // InternalKant.g:2986:2: rule__PropertyDef__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PropertyDef__Group__1__Impl();

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
    // $ANTLR end "rule__PropertyDef__Group__1"


    // $ANTLR start "rule__PropertyDef__Group__1__Impl"
    // InternalKant.g:2992:1: rule__PropertyDef__Group__1__Impl : ( ( rule__PropertyDef__PropertyAssignment_1 ) ) ;
    public final void rule__PropertyDef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:2996:1: ( ( ( rule__PropertyDef__PropertyAssignment_1 ) ) )
            // InternalKant.g:2997:1: ( ( rule__PropertyDef__PropertyAssignment_1 ) )
            {
            // InternalKant.g:2997:1: ( ( rule__PropertyDef__PropertyAssignment_1 ) )
            // InternalKant.g:2998:2: ( rule__PropertyDef__PropertyAssignment_1 )
            {
             before(grammarAccess.getPropertyDefAccess().getPropertyAssignment_1()); 
            // InternalKant.g:2999:2: ( rule__PropertyDef__PropertyAssignment_1 )
            // InternalKant.g:2999:3: rule__PropertyDef__PropertyAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__PropertyDef__PropertyAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPropertyDefAccess().getPropertyAssignment_1()); 

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
    // $ANTLR end "rule__PropertyDef__Group__1__Impl"


    // $ANTLR start "rule__KnowledgeEqualityDef__Group__0"
    // InternalKant.g:3008:1: rule__KnowledgeEqualityDef__Group__0 : rule__KnowledgeEqualityDef__Group__0__Impl rule__KnowledgeEqualityDef__Group__1 ;
    public final void rule__KnowledgeEqualityDef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:3012:1: ( rule__KnowledgeEqualityDef__Group__0__Impl rule__KnowledgeEqualityDef__Group__1 )
            // InternalKant.g:3013:2: rule__KnowledgeEqualityDef__Group__0__Impl rule__KnowledgeEqualityDef__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__KnowledgeEqualityDef__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__KnowledgeEqualityDef__Group__1();

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
    // $ANTLR end "rule__KnowledgeEqualityDef__Group__0"


    // $ANTLR start "rule__KnowledgeEqualityDef__Group__0__Impl"
    // InternalKant.g:3020:1: rule__KnowledgeEqualityDef__Group__0__Impl : ( ( rule__KnowledgeEqualityDef__IntroAssignment_0 )? ) ;
    public final void rule__KnowledgeEqualityDef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:3024:1: ( ( ( rule__KnowledgeEqualityDef__IntroAssignment_0 )? ) )
            // InternalKant.g:3025:1: ( ( rule__KnowledgeEqualityDef__IntroAssignment_0 )? )
            {
            // InternalKant.g:3025:1: ( ( rule__KnowledgeEqualityDef__IntroAssignment_0 )? )
            // InternalKant.g:3026:2: ( rule__KnowledgeEqualityDef__IntroAssignment_0 )?
            {
             before(grammarAccess.getKnowledgeEqualityDefAccess().getIntroAssignment_0()); 
            // InternalKant.g:3027:2: ( rule__KnowledgeEqualityDef__IntroAssignment_0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==11) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalKant.g:3027:3: rule__KnowledgeEqualityDef__IntroAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__KnowledgeEqualityDef__IntroAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getKnowledgeEqualityDefAccess().getIntroAssignment_0()); 

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
    // $ANTLR end "rule__KnowledgeEqualityDef__Group__0__Impl"


    // $ANTLR start "rule__KnowledgeEqualityDef__Group__1"
    // InternalKant.g:3035:1: rule__KnowledgeEqualityDef__Group__1 : rule__KnowledgeEqualityDef__Group__1__Impl rule__KnowledgeEqualityDef__Group__2 ;
    public final void rule__KnowledgeEqualityDef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:3039:1: ( rule__KnowledgeEqualityDef__Group__1__Impl rule__KnowledgeEqualityDef__Group__2 )
            // InternalKant.g:3040:2: rule__KnowledgeEqualityDef__Group__1__Impl rule__KnowledgeEqualityDef__Group__2
            {
            pushFollow(FOLLOW_18);
            rule__KnowledgeEqualityDef__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__KnowledgeEqualityDef__Group__2();

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
    // $ANTLR end "rule__KnowledgeEqualityDef__Group__1"


    // $ANTLR start "rule__KnowledgeEqualityDef__Group__1__Impl"
    // InternalKant.g:3047:1: rule__KnowledgeEqualityDef__Group__1__Impl : ( ( rule__KnowledgeEqualityDef__ValueAssignment_1 ) ) ;
    public final void rule__KnowledgeEqualityDef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:3051:1: ( ( ( rule__KnowledgeEqualityDef__ValueAssignment_1 ) ) )
            // InternalKant.g:3052:1: ( ( rule__KnowledgeEqualityDef__ValueAssignment_1 ) )
            {
            // InternalKant.g:3052:1: ( ( rule__KnowledgeEqualityDef__ValueAssignment_1 ) )
            // InternalKant.g:3053:2: ( rule__KnowledgeEqualityDef__ValueAssignment_1 )
            {
             before(grammarAccess.getKnowledgeEqualityDefAccess().getValueAssignment_1()); 
            // InternalKant.g:3054:2: ( rule__KnowledgeEqualityDef__ValueAssignment_1 )
            // InternalKant.g:3054:3: rule__KnowledgeEqualityDef__ValueAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__KnowledgeEqualityDef__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getKnowledgeEqualityDefAccess().getValueAssignment_1()); 

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
    // $ANTLR end "rule__KnowledgeEqualityDef__Group__1__Impl"


    // $ANTLR start "rule__KnowledgeEqualityDef__Group__2"
    // InternalKant.g:3062:1: rule__KnowledgeEqualityDef__Group__2 : rule__KnowledgeEqualityDef__Group__2__Impl rule__KnowledgeEqualityDef__Group__3 ;
    public final void rule__KnowledgeEqualityDef__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:3066:1: ( rule__KnowledgeEqualityDef__Group__2__Impl rule__KnowledgeEqualityDef__Group__3 )
            // InternalKant.g:3067:2: rule__KnowledgeEqualityDef__Group__2__Impl rule__KnowledgeEqualityDef__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__KnowledgeEqualityDef__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__KnowledgeEqualityDef__Group__3();

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
    // $ANTLR end "rule__KnowledgeEqualityDef__Group__2"


    // $ANTLR start "rule__KnowledgeEqualityDef__Group__2__Impl"
    // InternalKant.g:3074:1: rule__KnowledgeEqualityDef__Group__2__Impl : ( 'equals' ) ;
    public final void rule__KnowledgeEqualityDef__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:3078:1: ( ( 'equals' ) )
            // InternalKant.g:3079:1: ( 'equals' )
            {
            // InternalKant.g:3079:1: ( 'equals' )
            // InternalKant.g:3080:2: 'equals'
            {
             before(grammarAccess.getKnowledgeEqualityDefAccess().getEqualsKeyword_2()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getKnowledgeEqualityDefAccess().getEqualsKeyword_2()); 

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
    // $ANTLR end "rule__KnowledgeEqualityDef__Group__2__Impl"


    // $ANTLR start "rule__KnowledgeEqualityDef__Group__3"
    // InternalKant.g:3089:1: rule__KnowledgeEqualityDef__Group__3 : rule__KnowledgeEqualityDef__Group__3__Impl ;
    public final void rule__KnowledgeEqualityDef__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:3093:1: ( rule__KnowledgeEqualityDef__Group__3__Impl )
            // InternalKant.g:3094:2: rule__KnowledgeEqualityDef__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__KnowledgeEqualityDef__Group__3__Impl();

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
    // $ANTLR end "rule__KnowledgeEqualityDef__Group__3"


    // $ANTLR start "rule__KnowledgeEqualityDef__Group__3__Impl"
    // InternalKant.g:3100:1: rule__KnowledgeEqualityDef__Group__3__Impl : ( ( rule__KnowledgeEqualityDef__TargetAssignment_3 ) ) ;
    public final void rule__KnowledgeEqualityDef__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:3104:1: ( ( ( rule__KnowledgeEqualityDef__TargetAssignment_3 ) ) )
            // InternalKant.g:3105:1: ( ( rule__KnowledgeEqualityDef__TargetAssignment_3 ) )
            {
            // InternalKant.g:3105:1: ( ( rule__KnowledgeEqualityDef__TargetAssignment_3 ) )
            // InternalKant.g:3106:2: ( rule__KnowledgeEqualityDef__TargetAssignment_3 )
            {
             before(grammarAccess.getKnowledgeEqualityDefAccess().getTargetAssignment_3()); 
            // InternalKant.g:3107:2: ( rule__KnowledgeEqualityDef__TargetAssignment_3 )
            // InternalKant.g:3107:3: rule__KnowledgeEqualityDef__TargetAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__KnowledgeEqualityDef__TargetAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getKnowledgeEqualityDefAccess().getTargetAssignment_3()); 

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
    // $ANTLR end "rule__KnowledgeEqualityDef__Group__3__Impl"


    // $ANTLR start "rule__FunctionInversionDef__Group__0"
    // InternalKant.g:3116:1: rule__FunctionInversionDef__Group__0 : rule__FunctionInversionDef__Group__0__Impl rule__FunctionInversionDef__Group__1 ;
    public final void rule__FunctionInversionDef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:3120:1: ( rule__FunctionInversionDef__Group__0__Impl rule__FunctionInversionDef__Group__1 )
            // InternalKant.g:3121:2: rule__FunctionInversionDef__Group__0__Impl rule__FunctionInversionDef__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__FunctionInversionDef__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FunctionInversionDef__Group__1();

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
    // $ANTLR end "rule__FunctionInversionDef__Group__0"


    // $ANTLR start "rule__FunctionInversionDef__Group__0__Impl"
    // InternalKant.g:3128:1: rule__FunctionInversionDef__Group__0__Impl : ( ( rule__FunctionInversionDef__InverterAssignment_0 ) ) ;
    public final void rule__FunctionInversionDef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:3132:1: ( ( ( rule__FunctionInversionDef__InverterAssignment_0 ) ) )
            // InternalKant.g:3133:1: ( ( rule__FunctionInversionDef__InverterAssignment_0 ) )
            {
            // InternalKant.g:3133:1: ( ( rule__FunctionInversionDef__InverterAssignment_0 ) )
            // InternalKant.g:3134:2: ( rule__FunctionInversionDef__InverterAssignment_0 )
            {
             before(grammarAccess.getFunctionInversionDefAccess().getInverterAssignment_0()); 
            // InternalKant.g:3135:2: ( rule__FunctionInversionDef__InverterAssignment_0 )
            // InternalKant.g:3135:3: rule__FunctionInversionDef__InverterAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__FunctionInversionDef__InverterAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getFunctionInversionDefAccess().getInverterAssignment_0()); 

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
    // $ANTLR end "rule__FunctionInversionDef__Group__0__Impl"


    // $ANTLR start "rule__FunctionInversionDef__Group__1"
    // InternalKant.g:3143:1: rule__FunctionInversionDef__Group__1 : rule__FunctionInversionDef__Group__1__Impl rule__FunctionInversionDef__Group__2 ;
    public final void rule__FunctionInversionDef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:3147:1: ( rule__FunctionInversionDef__Group__1__Impl rule__FunctionInversionDef__Group__2 )
            // InternalKant.g:3148:2: rule__FunctionInversionDef__Group__1__Impl rule__FunctionInversionDef__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__FunctionInversionDef__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FunctionInversionDef__Group__2();

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
    // $ANTLR end "rule__FunctionInversionDef__Group__1"


    // $ANTLR start "rule__FunctionInversionDef__Group__1__Impl"
    // InternalKant.g:3155:1: rule__FunctionInversionDef__Group__1__Impl : ( 'invert' ) ;
    public final void rule__FunctionInversionDef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:3159:1: ( ( 'invert' ) )
            // InternalKant.g:3160:1: ( 'invert' )
            {
            // InternalKant.g:3160:1: ( 'invert' )
            // InternalKant.g:3161:2: 'invert'
            {
             before(grammarAccess.getFunctionInversionDefAccess().getInvertKeyword_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getFunctionInversionDefAccess().getInvertKeyword_1()); 

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
    // $ANTLR end "rule__FunctionInversionDef__Group__1__Impl"


    // $ANTLR start "rule__FunctionInversionDef__Group__2"
    // InternalKant.g:3170:1: rule__FunctionInversionDef__Group__2 : rule__FunctionInversionDef__Group__2__Impl ;
    public final void rule__FunctionInversionDef__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:3174:1: ( rule__FunctionInversionDef__Group__2__Impl )
            // InternalKant.g:3175:2: rule__FunctionInversionDef__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FunctionInversionDef__Group__2__Impl();

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
    // $ANTLR end "rule__FunctionInversionDef__Group__2"


    // $ANTLR start "rule__FunctionInversionDef__Group__2__Impl"
    // InternalKant.g:3181:1: rule__FunctionInversionDef__Group__2__Impl : ( ( rule__FunctionInversionDef__FunctionAssignment_2 ) ) ;
    public final void rule__FunctionInversionDef__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:3185:1: ( ( ( rule__FunctionInversionDef__FunctionAssignment_2 ) ) )
            // InternalKant.g:3186:1: ( ( rule__FunctionInversionDef__FunctionAssignment_2 ) )
            {
            // InternalKant.g:3186:1: ( ( rule__FunctionInversionDef__FunctionAssignment_2 ) )
            // InternalKant.g:3187:2: ( rule__FunctionInversionDef__FunctionAssignment_2 )
            {
             before(grammarAccess.getFunctionInversionDefAccess().getFunctionAssignment_2()); 
            // InternalKant.g:3188:2: ( rule__FunctionInversionDef__FunctionAssignment_2 )
            // InternalKant.g:3188:3: rule__FunctionInversionDef__FunctionAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__FunctionInversionDef__FunctionAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getFunctionInversionDefAccess().getFunctionAssignment_2()); 

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
    // $ANTLR end "rule__FunctionInversionDef__Group__2__Impl"


    // $ANTLR start "rule__KnowledgeBase__Group__0"
    // InternalKant.g:3197:1: rule__KnowledgeBase__Group__0 : rule__KnowledgeBase__Group__0__Impl rule__KnowledgeBase__Group__1 ;
    public final void rule__KnowledgeBase__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:3201:1: ( rule__KnowledgeBase__Group__0__Impl rule__KnowledgeBase__Group__1 )
            // InternalKant.g:3202:2: rule__KnowledgeBase__Group__0__Impl rule__KnowledgeBase__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__KnowledgeBase__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__KnowledgeBase__Group__1();

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
    // $ANTLR end "rule__KnowledgeBase__Group__0"


    // $ANTLR start "rule__KnowledgeBase__Group__0__Impl"
    // InternalKant.g:3209:1: rule__KnowledgeBase__Group__0__Impl : ( ( rule__KnowledgeBase__SharedAssignment_0 )? ) ;
    public final void rule__KnowledgeBase__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:3213:1: ( ( ( rule__KnowledgeBase__SharedAssignment_0 )? ) )
            // InternalKant.g:3214:1: ( ( rule__KnowledgeBase__SharedAssignment_0 )? )
            {
            // InternalKant.g:3214:1: ( ( rule__KnowledgeBase__SharedAssignment_0 )? )
            // InternalKant.g:3215:2: ( rule__KnowledgeBase__SharedAssignment_0 )?
            {
             before(grammarAccess.getKnowledgeBaseAccess().getSharedAssignment_0()); 
            // InternalKant.g:3216:2: ( rule__KnowledgeBase__SharedAssignment_0 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==47) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalKant.g:3216:3: rule__KnowledgeBase__SharedAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__KnowledgeBase__SharedAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getKnowledgeBaseAccess().getSharedAssignment_0()); 

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
    // $ANTLR end "rule__KnowledgeBase__Group__0__Impl"


    // $ANTLR start "rule__KnowledgeBase__Group__1"
    // InternalKant.g:3224:1: rule__KnowledgeBase__Group__1 : rule__KnowledgeBase__Group__1__Impl rule__KnowledgeBase__Group__2 ;
    public final void rule__KnowledgeBase__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:3228:1: ( rule__KnowledgeBase__Group__1__Impl rule__KnowledgeBase__Group__2 )
            // InternalKant.g:3229:2: rule__KnowledgeBase__Group__1__Impl rule__KnowledgeBase__Group__2
            {
            pushFollow(FOLLOW_21);
            rule__KnowledgeBase__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__KnowledgeBase__Group__2();

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
    // $ANTLR end "rule__KnowledgeBase__Group__1"


    // $ANTLR start "rule__KnowledgeBase__Group__1__Impl"
    // InternalKant.g:3236:1: rule__KnowledgeBase__Group__1__Impl : ( 'knowledge' ) ;
    public final void rule__KnowledgeBase__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:3240:1: ( ( 'knowledge' ) )
            // InternalKant.g:3241:1: ( 'knowledge' )
            {
            // InternalKant.g:3241:1: ( 'knowledge' )
            // InternalKant.g:3242:2: 'knowledge'
            {
             before(grammarAccess.getKnowledgeBaseAccess().getKnowledgeKeyword_1()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getKnowledgeBaseAccess().getKnowledgeKeyword_1()); 

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
    // $ANTLR end "rule__KnowledgeBase__Group__1__Impl"


    // $ANTLR start "rule__KnowledgeBase__Group__2"
    // InternalKant.g:3251:1: rule__KnowledgeBase__Group__2 : rule__KnowledgeBase__Group__2__Impl ;
    public final void rule__KnowledgeBase__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:3255:1: ( rule__KnowledgeBase__Group__2__Impl )
            // InternalKant.g:3256:2: rule__KnowledgeBase__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__KnowledgeBase__Group__2__Impl();

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
    // $ANTLR end "rule__KnowledgeBase__Group__2"


    // $ANTLR start "rule__KnowledgeBase__Group__2__Impl"
    // InternalKant.g:3262:1: rule__KnowledgeBase__Group__2__Impl : ( ( rule__KnowledgeBase__KnowledgeAssignment_2 ) ) ;
    public final void rule__KnowledgeBase__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:3266:1: ( ( ( rule__KnowledgeBase__KnowledgeAssignment_2 ) ) )
            // InternalKant.g:3267:1: ( ( rule__KnowledgeBase__KnowledgeAssignment_2 ) )
            {
            // InternalKant.g:3267:1: ( ( rule__KnowledgeBase__KnowledgeAssignment_2 ) )
            // InternalKant.g:3268:2: ( rule__KnowledgeBase__KnowledgeAssignment_2 )
            {
             before(grammarAccess.getKnowledgeBaseAccess().getKnowledgeAssignment_2()); 
            // InternalKant.g:3269:2: ( rule__KnowledgeBase__KnowledgeAssignment_2 )
            // InternalKant.g:3269:3: rule__KnowledgeBase__KnowledgeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__KnowledgeBase__KnowledgeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getKnowledgeBaseAccess().getKnowledgeAssignment_2()); 

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
    // $ANTLR end "rule__KnowledgeBase__Group__2__Impl"


    // $ANTLR start "rule__Principal__Group__0"
    // InternalKant.g:3278:1: rule__Principal__Group__0 : rule__Principal__Group__0__Impl rule__Principal__Group__1 ;
    public final void rule__Principal__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:3282:1: ( rule__Principal__Group__0__Impl rule__Principal__Group__1 )
            // InternalKant.g:3283:2: rule__Principal__Group__0__Impl rule__Principal__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Principal__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Principal__Group__1();

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
    // $ANTLR end "rule__Principal__Group__0"


    // $ANTLR start "rule__Principal__Group__0__Impl"
    // InternalKant.g:3290:1: rule__Principal__Group__0__Impl : ( 'principal' ) ;
    public final void rule__Principal__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:3294:1: ( ( 'principal' ) )
            // InternalKant.g:3295:1: ( 'principal' )
            {
            // InternalKant.g:3295:1: ( 'principal' )
            // InternalKant.g:3296:2: 'principal'
            {
             before(grammarAccess.getPrincipalAccess().getPrincipalKeyword_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getPrincipalAccess().getPrincipalKeyword_0()); 

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
    // $ANTLR end "rule__Principal__Group__0__Impl"


    // $ANTLR start "rule__Principal__Group__1"
    // InternalKant.g:3305:1: rule__Principal__Group__1 : rule__Principal__Group__1__Impl rule__Principal__Group__2 ;
    public final void rule__Principal__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:3309:1: ( rule__Principal__Group__1__Impl rule__Principal__Group__2 )
            // InternalKant.g:3310:2: rule__Principal__Group__1__Impl rule__Principal__Group__2
            {
            pushFollow(FOLLOW_22);
            rule__Principal__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Principal__Group__2();

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
    // $ANTLR end "rule__Principal__Group__1"


    // $ANTLR start "rule__Principal__Group__1__Impl"
    // InternalKant.g:3317:1: rule__Principal__Group__1__Impl : ( ( rule__Principal__NameAssignment_1 ) ) ;
    public final void rule__Principal__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:3321:1: ( ( ( rule__Principal__NameAssignment_1 ) ) )
            // InternalKant.g:3322:1: ( ( rule__Principal__NameAssignment_1 ) )
            {
            // InternalKant.g:3322:1: ( ( rule__Principal__NameAssignment_1 ) )
            // InternalKant.g:3323:2: ( rule__Principal__NameAssignment_1 )
            {
             before(grammarAccess.getPrincipalAccess().getNameAssignment_1()); 
            // InternalKant.g:3324:2: ( rule__Principal__NameAssignment_1 )
            // InternalKant.g:3324:3: rule__Principal__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Principal__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPrincipalAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Principal__Group__1__Impl"


    // $ANTLR start "rule__Principal__Group__2"
    // InternalKant.g:3332:1: rule__Principal__Group__2 : rule__Principal__Group__2__Impl rule__Principal__Group__3 ;
    public final void rule__Principal__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:3336:1: ( rule__Principal__Group__2__Impl rule__Principal__Group__3 )
            // InternalKant.g:3337:2: rule__Principal__Group__2__Impl rule__Principal__Group__3
            {
            pushFollow(FOLLOW_22);
            rule__Principal__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Principal__Group__3();

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
    // $ANTLR end "rule__Principal__Group__2"


    // $ANTLR start "rule__Principal__Group__2__Impl"
    // InternalKant.g:3344:1: rule__Principal__Group__2__Impl : ( ( rule__Principal__Group_2__0 )* ) ;
    public final void rule__Principal__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:3348:1: ( ( ( rule__Principal__Group_2__0 )* ) )
            // InternalKant.g:3349:1: ( ( rule__Principal__Group_2__0 )* )
            {
            // InternalKant.g:3349:1: ( ( rule__Principal__Group_2__0 )* )
            // InternalKant.g:3350:2: ( rule__Principal__Group_2__0 )*
            {
             before(grammarAccess.getPrincipalAccess().getGroup_2()); 
            // InternalKant.g:3351:2: ( rule__Principal__Group_2__0 )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==13) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalKant.g:3351:3: rule__Principal__Group_2__0
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Principal__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);

             after(grammarAccess.getPrincipalAccess().getGroup_2()); 

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
    // $ANTLR end "rule__Principal__Group__2__Impl"


    // $ANTLR start "rule__Principal__Group__3"
    // InternalKant.g:3359:1: rule__Principal__Group__3 : rule__Principal__Group__3__Impl ;
    public final void rule__Principal__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:3363:1: ( rule__Principal__Group__3__Impl )
            // InternalKant.g:3364:2: rule__Principal__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Principal__Group__3__Impl();

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
    // $ANTLR end "rule__Principal__Group__3"


    // $ANTLR start "rule__Principal__Group__3__Impl"
    // InternalKant.g:3370:1: rule__Principal__Group__3__Impl : ( ( rule__Principal__Group_3__0 )? ) ;
    public final void rule__Principal__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:3374:1: ( ( ( rule__Principal__Group_3__0 )? ) )
            // InternalKant.g:3375:1: ( ( rule__Principal__Group_3__0 )? )
            {
            // InternalKant.g:3375:1: ( ( rule__Principal__Group_3__0 )? )
            // InternalKant.g:3376:2: ( rule__Principal__Group_3__0 )?
            {
             before(grammarAccess.getPrincipalAccess().getGroup_3()); 
            // InternalKant.g:3377:2: ( rule__Principal__Group_3__0 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==28) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalKant.g:3377:3: rule__Principal__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Principal__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPrincipalAccess().getGroup_3()); 

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
    // $ANTLR end "rule__Principal__Group__3__Impl"


    // $ANTLR start "rule__Principal__Group_2__0"
    // InternalKant.g:3386:1: rule__Principal__Group_2__0 : rule__Principal__Group_2__0__Impl rule__Principal__Group_2__1 ;
    public final void rule__Principal__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:3390:1: ( rule__Principal__Group_2__0__Impl rule__Principal__Group_2__1 )
            // InternalKant.g:3391:2: rule__Principal__Group_2__0__Impl rule__Principal__Group_2__1
            {
            pushFollow(FOLLOW_4);
            rule__Principal__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Principal__Group_2__1();

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
    // $ANTLR end "rule__Principal__Group_2__0"


    // $ANTLR start "rule__Principal__Group_2__0__Impl"
    // InternalKant.g:3398:1: rule__Principal__Group_2__0__Impl : ( ',' ) ;
    public final void rule__Principal__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:3402:1: ( ( ',' ) )
            // InternalKant.g:3403:1: ( ',' )
            {
            // InternalKant.g:3403:1: ( ',' )
            // InternalKant.g:3404:2: ','
            {
             before(grammarAccess.getPrincipalAccess().getCommaKeyword_2_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getPrincipalAccess().getCommaKeyword_2_0()); 

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
    // $ANTLR end "rule__Principal__Group_2__0__Impl"


    // $ANTLR start "rule__Principal__Group_2__1"
    // InternalKant.g:3413:1: rule__Principal__Group_2__1 : rule__Principal__Group_2__1__Impl ;
    public final void rule__Principal__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:3417:1: ( rule__Principal__Group_2__1__Impl )
            // InternalKant.g:3418:2: rule__Principal__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Principal__Group_2__1__Impl();

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
    // $ANTLR end "rule__Principal__Group_2__1"


    // $ANTLR start "rule__Principal__Group_2__1__Impl"
    // InternalKant.g:3424:1: rule__Principal__Group_2__1__Impl : ( ( rule__Principal__NameAssignment_2_1 ) ) ;
    public final void rule__Principal__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:3428:1: ( ( ( rule__Principal__NameAssignment_2_1 ) ) )
            // InternalKant.g:3429:1: ( ( rule__Principal__NameAssignment_2_1 ) )
            {
            // InternalKant.g:3429:1: ( ( rule__Principal__NameAssignment_2_1 ) )
            // InternalKant.g:3430:2: ( rule__Principal__NameAssignment_2_1 )
            {
             before(grammarAccess.getPrincipalAccess().getNameAssignment_2_1()); 
            // InternalKant.g:3431:2: ( rule__Principal__NameAssignment_2_1 )
            // InternalKant.g:3431:3: rule__Principal__NameAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Principal__NameAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getPrincipalAccess().getNameAssignment_2_1()); 

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
    // $ANTLR end "rule__Principal__Group_2__1__Impl"


    // $ANTLR start "rule__Principal__Group_3__0"
    // InternalKant.g:3440:1: rule__Principal__Group_3__0 : rule__Principal__Group_3__0__Impl rule__Principal__Group_3__1 ;
    public final void rule__Principal__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:3444:1: ( rule__Principal__Group_3__0__Impl rule__Principal__Group_3__1 )
            // InternalKant.g:3445:2: rule__Principal__Group_3__0__Impl rule__Principal__Group_3__1
            {
            pushFollow(FOLLOW_21);
            rule__Principal__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Principal__Group_3__1();

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
    // $ANTLR end "rule__Principal__Group_3__0"


    // $ANTLR start "rule__Principal__Group_3__0__Impl"
    // InternalKant.g:3452:1: rule__Principal__Group_3__0__Impl : ( 'know' ) ;
    public final void rule__Principal__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:3456:1: ( ( 'know' ) )
            // InternalKant.g:3457:1: ( 'know' )
            {
            // InternalKant.g:3457:1: ( 'know' )
            // InternalKant.g:3458:2: 'know'
            {
             before(grammarAccess.getPrincipalAccess().getKnowKeyword_3_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getPrincipalAccess().getKnowKeyword_3_0()); 

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
    // $ANTLR end "rule__Principal__Group_3__0__Impl"


    // $ANTLR start "rule__Principal__Group_3__1"
    // InternalKant.g:3467:1: rule__Principal__Group_3__1 : rule__Principal__Group_3__1__Impl ;
    public final void rule__Principal__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:3471:1: ( rule__Principal__Group_3__1__Impl )
            // InternalKant.g:3472:2: rule__Principal__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Principal__Group_3__1__Impl();

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
    // $ANTLR end "rule__Principal__Group_3__1"


    // $ANTLR start "rule__Principal__Group_3__1__Impl"
    // InternalKant.g:3478:1: rule__Principal__Group_3__1__Impl : ( ( rule__Principal__KnowledgeAssignment_3_1 ) ) ;
    public final void rule__Principal__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:3482:1: ( ( ( rule__Principal__KnowledgeAssignment_3_1 ) ) )
            // InternalKant.g:3483:1: ( ( rule__Principal__KnowledgeAssignment_3_1 ) )
            {
            // InternalKant.g:3483:1: ( ( rule__Principal__KnowledgeAssignment_3_1 ) )
            // InternalKant.g:3484:2: ( rule__Principal__KnowledgeAssignment_3_1 )
            {
             before(grammarAccess.getPrincipalAccess().getKnowledgeAssignment_3_1()); 
            // InternalKant.g:3485:2: ( rule__Principal__KnowledgeAssignment_3_1 )
            // InternalKant.g:3485:3: rule__Principal__KnowledgeAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Principal__KnowledgeAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getPrincipalAccess().getKnowledgeAssignment_3_1()); 

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
    // $ANTLR end "rule__Principal__Group_3__1__Impl"


    // $ANTLR start "rule__KnowledgeDef__Group_0__0"
    // InternalKant.g:3494:1: rule__KnowledgeDef__Group_0__0 : rule__KnowledgeDef__Group_0__0__Impl rule__KnowledgeDef__Group_0__1 ;
    public final void rule__KnowledgeDef__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:3498:1: ( rule__KnowledgeDef__Group_0__0__Impl rule__KnowledgeDef__Group_0__1 )
            // InternalKant.g:3499:2: rule__KnowledgeDef__Group_0__0__Impl rule__KnowledgeDef__Group_0__1
            {
            pushFollow(FOLLOW_16);
            rule__KnowledgeDef__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__KnowledgeDef__Group_0__1();

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
    // $ANTLR end "rule__KnowledgeDef__Group_0__0"


    // $ANTLR start "rule__KnowledgeDef__Group_0__0__Impl"
    // InternalKant.g:3506:1: rule__KnowledgeDef__Group_0__0__Impl : ( ( rule__KnowledgeDef__Alternatives_0_0 ) ) ;
    public final void rule__KnowledgeDef__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:3510:1: ( ( ( rule__KnowledgeDef__Alternatives_0_0 ) ) )
            // InternalKant.g:3511:1: ( ( rule__KnowledgeDef__Alternatives_0_0 ) )
            {
            // InternalKant.g:3511:1: ( ( rule__KnowledgeDef__Alternatives_0_0 ) )
            // InternalKant.g:3512:2: ( rule__KnowledgeDef__Alternatives_0_0 )
            {
             before(grammarAccess.getKnowledgeDefAccess().getAlternatives_0_0()); 
            // InternalKant.g:3513:2: ( rule__KnowledgeDef__Alternatives_0_0 )
            // InternalKant.g:3513:3: rule__KnowledgeDef__Alternatives_0_0
            {
            pushFollow(FOLLOW_2);
            rule__KnowledgeDef__Alternatives_0_0();

            state._fsp--;


            }

             after(grammarAccess.getKnowledgeDefAccess().getAlternatives_0_0()); 

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
    // $ANTLR end "rule__KnowledgeDef__Group_0__0__Impl"


    // $ANTLR start "rule__KnowledgeDef__Group_0__1"
    // InternalKant.g:3521:1: rule__KnowledgeDef__Group_0__1 : rule__KnowledgeDef__Group_0__1__Impl rule__KnowledgeDef__Group_0__2 ;
    public final void rule__KnowledgeDef__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:3525:1: ( rule__KnowledgeDef__Group_0__1__Impl rule__KnowledgeDef__Group_0__2 )
            // InternalKant.g:3526:2: rule__KnowledgeDef__Group_0__1__Impl rule__KnowledgeDef__Group_0__2
            {
            pushFollow(FOLLOW_14);
            rule__KnowledgeDef__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__KnowledgeDef__Group_0__2();

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
    // $ANTLR end "rule__KnowledgeDef__Group_0__1"


    // $ANTLR start "rule__KnowledgeDef__Group_0__1__Impl"
    // InternalKant.g:3533:1: rule__KnowledgeDef__Group_0__1__Impl : ( '=' ) ;
    public final void rule__KnowledgeDef__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:3537:1: ( ( '=' ) )
            // InternalKant.g:3538:1: ( '=' )
            {
            // InternalKant.g:3538:1: ( '=' )
            // InternalKant.g:3539:2: '='
            {
             before(grammarAccess.getKnowledgeDefAccess().getEqualsSignKeyword_0_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getKnowledgeDefAccess().getEqualsSignKeyword_0_1()); 

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
    // $ANTLR end "rule__KnowledgeDef__Group_0__1__Impl"


    // $ANTLR start "rule__KnowledgeDef__Group_0__2"
    // InternalKant.g:3548:1: rule__KnowledgeDef__Group_0__2 : rule__KnowledgeDef__Group_0__2__Impl ;
    public final void rule__KnowledgeDef__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:3552:1: ( rule__KnowledgeDef__Group_0__2__Impl )
            // InternalKant.g:3553:2: rule__KnowledgeDef__Group_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__KnowledgeDef__Group_0__2__Impl();

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
    // $ANTLR end "rule__KnowledgeDef__Group_0__2"


    // $ANTLR start "rule__KnowledgeDef__Group_0__2__Impl"
    // InternalKant.g:3559:1: rule__KnowledgeDef__Group_0__2__Impl : ( ( rule__KnowledgeDef__ValueAssignment_0_2 ) ) ;
    public final void rule__KnowledgeDef__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:3563:1: ( ( ( rule__KnowledgeDef__ValueAssignment_0_2 ) ) )
            // InternalKant.g:3564:1: ( ( rule__KnowledgeDef__ValueAssignment_0_2 ) )
            {
            // InternalKant.g:3564:1: ( ( rule__KnowledgeDef__ValueAssignment_0_2 ) )
            // InternalKant.g:3565:2: ( rule__KnowledgeDef__ValueAssignment_0_2 )
            {
             before(grammarAccess.getKnowledgeDefAccess().getValueAssignment_0_2()); 
            // InternalKant.g:3566:2: ( rule__KnowledgeDef__ValueAssignment_0_2 )
            // InternalKant.g:3566:3: rule__KnowledgeDef__ValueAssignment_0_2
            {
            pushFollow(FOLLOW_2);
            rule__KnowledgeDef__ValueAssignment_0_2();

            state._fsp--;


            }

             after(grammarAccess.getKnowledgeDefAccess().getValueAssignment_0_2()); 

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
    // $ANTLR end "rule__KnowledgeDef__Group_0__2__Impl"


    // $ANTLR start "rule__KnowledgeDef__Group_1__0"
    // InternalKant.g:3575:1: rule__KnowledgeDef__Group_1__0 : rule__KnowledgeDef__Group_1__0__Impl rule__KnowledgeDef__Group_1__1 ;
    public final void rule__KnowledgeDef__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:3579:1: ( rule__KnowledgeDef__Group_1__0__Impl rule__KnowledgeDef__Group_1__1 )
            // InternalKant.g:3580:2: rule__KnowledgeDef__Group_1__0__Impl rule__KnowledgeDef__Group_1__1
            {
            pushFollow(FOLLOW_11);
            rule__KnowledgeDef__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__KnowledgeDef__Group_1__1();

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
    // $ANTLR end "rule__KnowledgeDef__Group_1__0"


    // $ANTLR start "rule__KnowledgeDef__Group_1__0__Impl"
    // InternalKant.g:3587:1: rule__KnowledgeDef__Group_1__0__Impl : ( ( rule__KnowledgeDef__Alternatives_1_0 ) ) ;
    public final void rule__KnowledgeDef__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:3591:1: ( ( ( rule__KnowledgeDef__Alternatives_1_0 ) ) )
            // InternalKant.g:3592:1: ( ( rule__KnowledgeDef__Alternatives_1_0 ) )
            {
            // InternalKant.g:3592:1: ( ( rule__KnowledgeDef__Alternatives_1_0 ) )
            // InternalKant.g:3593:2: ( rule__KnowledgeDef__Alternatives_1_0 )
            {
             before(grammarAccess.getKnowledgeDefAccess().getAlternatives_1_0()); 
            // InternalKant.g:3594:2: ( rule__KnowledgeDef__Alternatives_1_0 )
            // InternalKant.g:3594:3: rule__KnowledgeDef__Alternatives_1_0
            {
            pushFollow(FOLLOW_2);
            rule__KnowledgeDef__Alternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getKnowledgeDefAccess().getAlternatives_1_0()); 

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
    // $ANTLR end "rule__KnowledgeDef__Group_1__0__Impl"


    // $ANTLR start "rule__KnowledgeDef__Group_1__1"
    // InternalKant.g:3602:1: rule__KnowledgeDef__Group_1__1 : rule__KnowledgeDef__Group_1__1__Impl ;
    public final void rule__KnowledgeDef__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:3606:1: ( rule__KnowledgeDef__Group_1__1__Impl )
            // InternalKant.g:3607:2: rule__KnowledgeDef__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__KnowledgeDef__Group_1__1__Impl();

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
    // $ANTLR end "rule__KnowledgeDef__Group_1__1"


    // $ANTLR start "rule__KnowledgeDef__Group_1__1__Impl"
    // InternalKant.g:3613:1: rule__KnowledgeDef__Group_1__1__Impl : ( ( rule__KnowledgeDef__Alternatives_1_1 ) ) ;
    public final void rule__KnowledgeDef__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:3617:1: ( ( ( rule__KnowledgeDef__Alternatives_1_1 ) ) )
            // InternalKant.g:3618:1: ( ( rule__KnowledgeDef__Alternatives_1_1 ) )
            {
            // InternalKant.g:3618:1: ( ( rule__KnowledgeDef__Alternatives_1_1 ) )
            // InternalKant.g:3619:2: ( rule__KnowledgeDef__Alternatives_1_1 )
            {
             before(grammarAccess.getKnowledgeDefAccess().getAlternatives_1_1()); 
            // InternalKant.g:3620:2: ( rule__KnowledgeDef__Alternatives_1_1 )
            // InternalKant.g:3620:3: rule__KnowledgeDef__Alternatives_1_1
            {
            pushFollow(FOLLOW_2);
            rule__KnowledgeDef__Alternatives_1_1();

            state._fsp--;


            }

             after(grammarAccess.getKnowledgeDefAccess().getAlternatives_1_1()); 

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
    // $ANTLR end "rule__KnowledgeDef__Group_1__1__Impl"


    // $ANTLR start "rule__KnowledgeDef__Group_1_1_1__0"
    // InternalKant.g:3629:1: rule__KnowledgeDef__Group_1_1_1__0 : rule__KnowledgeDef__Group_1_1_1__0__Impl rule__KnowledgeDef__Group_1_1_1__1 ;
    public final void rule__KnowledgeDef__Group_1_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:3633:1: ( rule__KnowledgeDef__Group_1_1_1__0__Impl rule__KnowledgeDef__Group_1_1_1__1 )
            // InternalKant.g:3634:2: rule__KnowledgeDef__Group_1_1_1__0__Impl rule__KnowledgeDef__Group_1_1_1__1
            {
            pushFollow(FOLLOW_4);
            rule__KnowledgeDef__Group_1_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__KnowledgeDef__Group_1_1_1__1();

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
    // $ANTLR end "rule__KnowledgeDef__Group_1_1_1__0"


    // $ANTLR start "rule__KnowledgeDef__Group_1_1_1__0__Impl"
    // InternalKant.g:3641:1: rule__KnowledgeDef__Group_1_1_1__0__Impl : ( '{' ) ;
    public final void rule__KnowledgeDef__Group_1_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:3645:1: ( ( '{' ) )
            // InternalKant.g:3646:1: ( '{' )
            {
            // InternalKant.g:3646:1: ( '{' )
            // InternalKant.g:3647:2: '{'
            {
             before(grammarAccess.getKnowledgeDefAccess().getLeftCurlyBracketKeyword_1_1_1_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getKnowledgeDefAccess().getLeftCurlyBracketKeyword_1_1_1_0()); 

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
    // $ANTLR end "rule__KnowledgeDef__Group_1_1_1__0__Impl"


    // $ANTLR start "rule__KnowledgeDef__Group_1_1_1__1"
    // InternalKant.g:3656:1: rule__KnowledgeDef__Group_1_1_1__1 : rule__KnowledgeDef__Group_1_1_1__1__Impl rule__KnowledgeDef__Group_1_1_1__2 ;
    public final void rule__KnowledgeDef__Group_1_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:3660:1: ( rule__KnowledgeDef__Group_1_1_1__1__Impl rule__KnowledgeDef__Group_1_1_1__2 )
            // InternalKant.g:3661:2: rule__KnowledgeDef__Group_1_1_1__1__Impl rule__KnowledgeDef__Group_1_1_1__2
            {
            pushFollow(FOLLOW_15);
            rule__KnowledgeDef__Group_1_1_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__KnowledgeDef__Group_1_1_1__2();

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
    // $ANTLR end "rule__KnowledgeDef__Group_1_1_1__1"


    // $ANTLR start "rule__KnowledgeDef__Group_1_1_1__1__Impl"
    // InternalKant.g:3668:1: rule__KnowledgeDef__Group_1_1_1__1__Impl : ( ( rule__KnowledgeDef__NameAssignment_1_1_1_1 ) ) ;
    public final void rule__KnowledgeDef__Group_1_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:3672:1: ( ( ( rule__KnowledgeDef__NameAssignment_1_1_1_1 ) ) )
            // InternalKant.g:3673:1: ( ( rule__KnowledgeDef__NameAssignment_1_1_1_1 ) )
            {
            // InternalKant.g:3673:1: ( ( rule__KnowledgeDef__NameAssignment_1_1_1_1 ) )
            // InternalKant.g:3674:2: ( rule__KnowledgeDef__NameAssignment_1_1_1_1 )
            {
             before(grammarAccess.getKnowledgeDefAccess().getNameAssignment_1_1_1_1()); 
            // InternalKant.g:3675:2: ( rule__KnowledgeDef__NameAssignment_1_1_1_1 )
            // InternalKant.g:3675:3: rule__KnowledgeDef__NameAssignment_1_1_1_1
            {
            pushFollow(FOLLOW_2);
            rule__KnowledgeDef__NameAssignment_1_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getKnowledgeDefAccess().getNameAssignment_1_1_1_1()); 

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
    // $ANTLR end "rule__KnowledgeDef__Group_1_1_1__1__Impl"


    // $ANTLR start "rule__KnowledgeDef__Group_1_1_1__2"
    // InternalKant.g:3683:1: rule__KnowledgeDef__Group_1_1_1__2 : rule__KnowledgeDef__Group_1_1_1__2__Impl rule__KnowledgeDef__Group_1_1_1__3 ;
    public final void rule__KnowledgeDef__Group_1_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:3687:1: ( rule__KnowledgeDef__Group_1_1_1__2__Impl rule__KnowledgeDef__Group_1_1_1__3 )
            // InternalKant.g:3688:2: rule__KnowledgeDef__Group_1_1_1__2__Impl rule__KnowledgeDef__Group_1_1_1__3
            {
            pushFollow(FOLLOW_15);
            rule__KnowledgeDef__Group_1_1_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__KnowledgeDef__Group_1_1_1__3();

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
    // $ANTLR end "rule__KnowledgeDef__Group_1_1_1__2"


    // $ANTLR start "rule__KnowledgeDef__Group_1_1_1__2__Impl"
    // InternalKant.g:3695:1: rule__KnowledgeDef__Group_1_1_1__2__Impl : ( ( rule__KnowledgeDef__Group_1_1_1_2__0 )* ) ;
    public final void rule__KnowledgeDef__Group_1_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:3699:1: ( ( ( rule__KnowledgeDef__Group_1_1_1_2__0 )* ) )
            // InternalKant.g:3700:1: ( ( rule__KnowledgeDef__Group_1_1_1_2__0 )* )
            {
            // InternalKant.g:3700:1: ( ( rule__KnowledgeDef__Group_1_1_1_2__0 )* )
            // InternalKant.g:3701:2: ( rule__KnowledgeDef__Group_1_1_1_2__0 )*
            {
             before(grammarAccess.getKnowledgeDefAccess().getGroup_1_1_1_2()); 
            // InternalKant.g:3702:2: ( rule__KnowledgeDef__Group_1_1_1_2__0 )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==13) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalKant.g:3702:3: rule__KnowledgeDef__Group_1_1_1_2__0
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__KnowledgeDef__Group_1_1_1_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);

             after(grammarAccess.getKnowledgeDefAccess().getGroup_1_1_1_2()); 

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
    // $ANTLR end "rule__KnowledgeDef__Group_1_1_1__2__Impl"


    // $ANTLR start "rule__KnowledgeDef__Group_1_1_1__3"
    // InternalKant.g:3710:1: rule__KnowledgeDef__Group_1_1_1__3 : rule__KnowledgeDef__Group_1_1_1__3__Impl ;
    public final void rule__KnowledgeDef__Group_1_1_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:3714:1: ( rule__KnowledgeDef__Group_1_1_1__3__Impl )
            // InternalKant.g:3715:2: rule__KnowledgeDef__Group_1_1_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__KnowledgeDef__Group_1_1_1__3__Impl();

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
    // $ANTLR end "rule__KnowledgeDef__Group_1_1_1__3"


    // $ANTLR start "rule__KnowledgeDef__Group_1_1_1__3__Impl"
    // InternalKant.g:3721:1: rule__KnowledgeDef__Group_1_1_1__3__Impl : ( '}' ) ;
    public final void rule__KnowledgeDef__Group_1_1_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:3725:1: ( ( '}' ) )
            // InternalKant.g:3726:1: ( '}' )
            {
            // InternalKant.g:3726:1: ( '}' )
            // InternalKant.g:3727:2: '}'
            {
             before(grammarAccess.getKnowledgeDefAccess().getRightCurlyBracketKeyword_1_1_1_3()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getKnowledgeDefAccess().getRightCurlyBracketKeyword_1_1_1_3()); 

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
    // $ANTLR end "rule__KnowledgeDef__Group_1_1_1__3__Impl"


    // $ANTLR start "rule__KnowledgeDef__Group_1_1_1_2__0"
    // InternalKant.g:3737:1: rule__KnowledgeDef__Group_1_1_1_2__0 : rule__KnowledgeDef__Group_1_1_1_2__0__Impl rule__KnowledgeDef__Group_1_1_1_2__1 ;
    public final void rule__KnowledgeDef__Group_1_1_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:3741:1: ( rule__KnowledgeDef__Group_1_1_1_2__0__Impl rule__KnowledgeDef__Group_1_1_1_2__1 )
            // InternalKant.g:3742:2: rule__KnowledgeDef__Group_1_1_1_2__0__Impl rule__KnowledgeDef__Group_1_1_1_2__1
            {
            pushFollow(FOLLOW_4);
            rule__KnowledgeDef__Group_1_1_1_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__KnowledgeDef__Group_1_1_1_2__1();

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
    // $ANTLR end "rule__KnowledgeDef__Group_1_1_1_2__0"


    // $ANTLR start "rule__KnowledgeDef__Group_1_1_1_2__0__Impl"
    // InternalKant.g:3749:1: rule__KnowledgeDef__Group_1_1_1_2__0__Impl : ( ',' ) ;
    public final void rule__KnowledgeDef__Group_1_1_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:3753:1: ( ( ',' ) )
            // InternalKant.g:3754:1: ( ',' )
            {
            // InternalKant.g:3754:1: ( ',' )
            // InternalKant.g:3755:2: ','
            {
             before(grammarAccess.getKnowledgeDefAccess().getCommaKeyword_1_1_1_2_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getKnowledgeDefAccess().getCommaKeyword_1_1_1_2_0()); 

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
    // $ANTLR end "rule__KnowledgeDef__Group_1_1_1_2__0__Impl"


    // $ANTLR start "rule__KnowledgeDef__Group_1_1_1_2__1"
    // InternalKant.g:3764:1: rule__KnowledgeDef__Group_1_1_1_2__1 : rule__KnowledgeDef__Group_1_1_1_2__1__Impl ;
    public final void rule__KnowledgeDef__Group_1_1_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:3768:1: ( rule__KnowledgeDef__Group_1_1_1_2__1__Impl )
            // InternalKant.g:3769:2: rule__KnowledgeDef__Group_1_1_1_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__KnowledgeDef__Group_1_1_1_2__1__Impl();

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
    // $ANTLR end "rule__KnowledgeDef__Group_1_1_1_2__1"


    // $ANTLR start "rule__KnowledgeDef__Group_1_1_1_2__1__Impl"
    // InternalKant.g:3775:1: rule__KnowledgeDef__Group_1_1_1_2__1__Impl : ( ( rule__KnowledgeDef__NameAssignment_1_1_1_2_1 ) ) ;
    public final void rule__KnowledgeDef__Group_1_1_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:3779:1: ( ( ( rule__KnowledgeDef__NameAssignment_1_1_1_2_1 ) ) )
            // InternalKant.g:3780:1: ( ( rule__KnowledgeDef__NameAssignment_1_1_1_2_1 ) )
            {
            // InternalKant.g:3780:1: ( ( rule__KnowledgeDef__NameAssignment_1_1_1_2_1 ) )
            // InternalKant.g:3781:2: ( rule__KnowledgeDef__NameAssignment_1_1_1_2_1 )
            {
             before(grammarAccess.getKnowledgeDefAccess().getNameAssignment_1_1_1_2_1()); 
            // InternalKant.g:3782:2: ( rule__KnowledgeDef__NameAssignment_1_1_1_2_1 )
            // InternalKant.g:3782:3: rule__KnowledgeDef__NameAssignment_1_1_1_2_1
            {
            pushFollow(FOLLOW_2);
            rule__KnowledgeDef__NameAssignment_1_1_1_2_1();

            state._fsp--;


            }

             after(grammarAccess.getKnowledgeDefAccess().getNameAssignment_1_1_1_2_1()); 

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
    // $ANTLR end "rule__KnowledgeDef__Group_1_1_1_2__1__Impl"


    // $ANTLR start "rule__KnowledgeDefSetDestructuring__Group__0"
    // InternalKant.g:3791:1: rule__KnowledgeDefSetDestructuring__Group__0 : rule__KnowledgeDefSetDestructuring__Group__0__Impl rule__KnowledgeDefSetDestructuring__Group__1 ;
    public final void rule__KnowledgeDefSetDestructuring__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:3795:1: ( rule__KnowledgeDefSetDestructuring__Group__0__Impl rule__KnowledgeDefSetDestructuring__Group__1 )
            // InternalKant.g:3796:2: rule__KnowledgeDefSetDestructuring__Group__0__Impl rule__KnowledgeDefSetDestructuring__Group__1
            {
            pushFollow(FOLLOW_23);
            rule__KnowledgeDefSetDestructuring__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__KnowledgeDefSetDestructuring__Group__1();

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
    // $ANTLR end "rule__KnowledgeDefSetDestructuring__Group__0"


    // $ANTLR start "rule__KnowledgeDefSetDestructuring__Group__0__Impl"
    // InternalKant.g:3803:1: rule__KnowledgeDefSetDestructuring__Group__0__Impl : ( () ) ;
    public final void rule__KnowledgeDefSetDestructuring__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:3807:1: ( ( () ) )
            // InternalKant.g:3808:1: ( () )
            {
            // InternalKant.g:3808:1: ( () )
            // InternalKant.g:3809:2: ()
            {
             before(grammarAccess.getKnowledgeDefSetDestructuringAccess().getKnowledgeDefSetDestructuringAction_0()); 
            // InternalKant.g:3810:2: ()
            // InternalKant.g:3810:3: 
            {
            }

             after(grammarAccess.getKnowledgeDefSetDestructuringAccess().getKnowledgeDefSetDestructuringAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KnowledgeDefSetDestructuring__Group__0__Impl"


    // $ANTLR start "rule__KnowledgeDefSetDestructuring__Group__1"
    // InternalKant.g:3818:1: rule__KnowledgeDefSetDestructuring__Group__1 : rule__KnowledgeDefSetDestructuring__Group__1__Impl rule__KnowledgeDefSetDestructuring__Group__2 ;
    public final void rule__KnowledgeDefSetDestructuring__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:3822:1: ( rule__KnowledgeDefSetDestructuring__Group__1__Impl rule__KnowledgeDefSetDestructuring__Group__2 )
            // InternalKant.g:3823:2: rule__KnowledgeDefSetDestructuring__Group__1__Impl rule__KnowledgeDefSetDestructuring__Group__2
            {
            pushFollow(FOLLOW_24);
            rule__KnowledgeDefSetDestructuring__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__KnowledgeDefSetDestructuring__Group__2();

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
    // $ANTLR end "rule__KnowledgeDefSetDestructuring__Group__1"


    // $ANTLR start "rule__KnowledgeDefSetDestructuring__Group__1__Impl"
    // InternalKant.g:3830:1: rule__KnowledgeDefSetDestructuring__Group__1__Impl : ( '{' ) ;
    public final void rule__KnowledgeDefSetDestructuring__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:3834:1: ( ( '{' ) )
            // InternalKant.g:3835:1: ( '{' )
            {
            // InternalKant.g:3835:1: ( '{' )
            // InternalKant.g:3836:2: '{'
            {
             before(grammarAccess.getKnowledgeDefSetDestructuringAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getKnowledgeDefSetDestructuringAccess().getLeftCurlyBracketKeyword_1()); 

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
    // $ANTLR end "rule__KnowledgeDefSetDestructuring__Group__1__Impl"


    // $ANTLR start "rule__KnowledgeDefSetDestructuring__Group__2"
    // InternalKant.g:3845:1: rule__KnowledgeDefSetDestructuring__Group__2 : rule__KnowledgeDefSetDestructuring__Group__2__Impl rule__KnowledgeDefSetDestructuring__Group__3 ;
    public final void rule__KnowledgeDefSetDestructuring__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:3849:1: ( rule__KnowledgeDefSetDestructuring__Group__2__Impl rule__KnowledgeDefSetDestructuring__Group__3 )
            // InternalKant.g:3850:2: rule__KnowledgeDefSetDestructuring__Group__2__Impl rule__KnowledgeDefSetDestructuring__Group__3
            {
            pushFollow(FOLLOW_24);
            rule__KnowledgeDefSetDestructuring__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__KnowledgeDefSetDestructuring__Group__3();

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
    // $ANTLR end "rule__KnowledgeDefSetDestructuring__Group__2"


    // $ANTLR start "rule__KnowledgeDefSetDestructuring__Group__2__Impl"
    // InternalKant.g:3857:1: rule__KnowledgeDefSetDestructuring__Group__2__Impl : ( ( rule__KnowledgeDefSetDestructuring__Group_2__0 )? ) ;
    public final void rule__KnowledgeDefSetDestructuring__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:3861:1: ( ( ( rule__KnowledgeDefSetDestructuring__Group_2__0 )? ) )
            // InternalKant.g:3862:1: ( ( rule__KnowledgeDefSetDestructuring__Group_2__0 )? )
            {
            // InternalKant.g:3862:1: ( ( rule__KnowledgeDefSetDestructuring__Group_2__0 )? )
            // InternalKant.g:3863:2: ( rule__KnowledgeDefSetDestructuring__Group_2__0 )?
            {
             before(grammarAccess.getKnowledgeDefSetDestructuringAccess().getGroup_2()); 
            // InternalKant.g:3864:2: ( rule__KnowledgeDefSetDestructuring__Group_2__0 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==RULE_ID) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalKant.g:3864:3: rule__KnowledgeDefSetDestructuring__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__KnowledgeDefSetDestructuring__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getKnowledgeDefSetDestructuringAccess().getGroup_2()); 

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
    // $ANTLR end "rule__KnowledgeDefSetDestructuring__Group__2__Impl"


    // $ANTLR start "rule__KnowledgeDefSetDestructuring__Group__3"
    // InternalKant.g:3872:1: rule__KnowledgeDefSetDestructuring__Group__3 : rule__KnowledgeDefSetDestructuring__Group__3__Impl ;
    public final void rule__KnowledgeDefSetDestructuring__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:3876:1: ( rule__KnowledgeDefSetDestructuring__Group__3__Impl )
            // InternalKant.g:3877:2: rule__KnowledgeDefSetDestructuring__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__KnowledgeDefSetDestructuring__Group__3__Impl();

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
    // $ANTLR end "rule__KnowledgeDefSetDestructuring__Group__3"


    // $ANTLR start "rule__KnowledgeDefSetDestructuring__Group__3__Impl"
    // InternalKant.g:3883:1: rule__KnowledgeDefSetDestructuring__Group__3__Impl : ( '}' ) ;
    public final void rule__KnowledgeDefSetDestructuring__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:3887:1: ( ( '}' ) )
            // InternalKant.g:3888:1: ( '}' )
            {
            // InternalKant.g:3888:1: ( '}' )
            // InternalKant.g:3889:2: '}'
            {
             before(grammarAccess.getKnowledgeDefSetDestructuringAccess().getRightCurlyBracketKeyword_3()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getKnowledgeDefSetDestructuringAccess().getRightCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__KnowledgeDefSetDestructuring__Group__3__Impl"


    // $ANTLR start "rule__KnowledgeDefSetDestructuring__Group_2__0"
    // InternalKant.g:3899:1: rule__KnowledgeDefSetDestructuring__Group_2__0 : rule__KnowledgeDefSetDestructuring__Group_2__0__Impl rule__KnowledgeDefSetDestructuring__Group_2__1 ;
    public final void rule__KnowledgeDefSetDestructuring__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:3903:1: ( rule__KnowledgeDefSetDestructuring__Group_2__0__Impl rule__KnowledgeDefSetDestructuring__Group_2__1 )
            // InternalKant.g:3904:2: rule__KnowledgeDefSetDestructuring__Group_2__0__Impl rule__KnowledgeDefSetDestructuring__Group_2__1
            {
            pushFollow(FOLLOW_25);
            rule__KnowledgeDefSetDestructuring__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__KnowledgeDefSetDestructuring__Group_2__1();

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
    // $ANTLR end "rule__KnowledgeDefSetDestructuring__Group_2__0"


    // $ANTLR start "rule__KnowledgeDefSetDestructuring__Group_2__0__Impl"
    // InternalKant.g:3911:1: rule__KnowledgeDefSetDestructuring__Group_2__0__Impl : ( ( rule__KnowledgeDefSetDestructuring__AssignmentsAssignment_2_0 ) ) ;
    public final void rule__KnowledgeDefSetDestructuring__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:3915:1: ( ( ( rule__KnowledgeDefSetDestructuring__AssignmentsAssignment_2_0 ) ) )
            // InternalKant.g:3916:1: ( ( rule__KnowledgeDefSetDestructuring__AssignmentsAssignment_2_0 ) )
            {
            // InternalKant.g:3916:1: ( ( rule__KnowledgeDefSetDestructuring__AssignmentsAssignment_2_0 ) )
            // InternalKant.g:3917:2: ( rule__KnowledgeDefSetDestructuring__AssignmentsAssignment_2_0 )
            {
             before(grammarAccess.getKnowledgeDefSetDestructuringAccess().getAssignmentsAssignment_2_0()); 
            // InternalKant.g:3918:2: ( rule__KnowledgeDefSetDestructuring__AssignmentsAssignment_2_0 )
            // InternalKant.g:3918:3: rule__KnowledgeDefSetDestructuring__AssignmentsAssignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__KnowledgeDefSetDestructuring__AssignmentsAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getKnowledgeDefSetDestructuringAccess().getAssignmentsAssignment_2_0()); 

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
    // $ANTLR end "rule__KnowledgeDefSetDestructuring__Group_2__0__Impl"


    // $ANTLR start "rule__KnowledgeDefSetDestructuring__Group_2__1"
    // InternalKant.g:3926:1: rule__KnowledgeDefSetDestructuring__Group_2__1 : rule__KnowledgeDefSetDestructuring__Group_2__1__Impl ;
    public final void rule__KnowledgeDefSetDestructuring__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:3930:1: ( rule__KnowledgeDefSetDestructuring__Group_2__1__Impl )
            // InternalKant.g:3931:2: rule__KnowledgeDefSetDestructuring__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__KnowledgeDefSetDestructuring__Group_2__1__Impl();

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
    // $ANTLR end "rule__KnowledgeDefSetDestructuring__Group_2__1"


    // $ANTLR start "rule__KnowledgeDefSetDestructuring__Group_2__1__Impl"
    // InternalKant.g:3937:1: rule__KnowledgeDefSetDestructuring__Group_2__1__Impl : ( ( rule__KnowledgeDefSetDestructuring__Group_2_1__0 )* ) ;
    public final void rule__KnowledgeDefSetDestructuring__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:3941:1: ( ( ( rule__KnowledgeDefSetDestructuring__Group_2_1__0 )* ) )
            // InternalKant.g:3942:1: ( ( rule__KnowledgeDefSetDestructuring__Group_2_1__0 )* )
            {
            // InternalKant.g:3942:1: ( ( rule__KnowledgeDefSetDestructuring__Group_2_1__0 )* )
            // InternalKant.g:3943:2: ( rule__KnowledgeDefSetDestructuring__Group_2_1__0 )*
            {
             before(grammarAccess.getKnowledgeDefSetDestructuringAccess().getGroup_2_1()); 
            // InternalKant.g:3944:2: ( rule__KnowledgeDefSetDestructuring__Group_2_1__0 )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==13) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // InternalKant.g:3944:3: rule__KnowledgeDefSetDestructuring__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__KnowledgeDefSetDestructuring__Group_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop43;
                }
            } while (true);

             after(grammarAccess.getKnowledgeDefSetDestructuringAccess().getGroup_2_1()); 

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
    // $ANTLR end "rule__KnowledgeDefSetDestructuring__Group_2__1__Impl"


    // $ANTLR start "rule__KnowledgeDefSetDestructuring__Group_2_1__0"
    // InternalKant.g:3953:1: rule__KnowledgeDefSetDestructuring__Group_2_1__0 : rule__KnowledgeDefSetDestructuring__Group_2_1__0__Impl rule__KnowledgeDefSetDestructuring__Group_2_1__1 ;
    public final void rule__KnowledgeDefSetDestructuring__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:3957:1: ( rule__KnowledgeDefSetDestructuring__Group_2_1__0__Impl rule__KnowledgeDefSetDestructuring__Group_2_1__1 )
            // InternalKant.g:3958:2: rule__KnowledgeDefSetDestructuring__Group_2_1__0__Impl rule__KnowledgeDefSetDestructuring__Group_2_1__1
            {
            pushFollow(FOLLOW_4);
            rule__KnowledgeDefSetDestructuring__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__KnowledgeDefSetDestructuring__Group_2_1__1();

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
    // $ANTLR end "rule__KnowledgeDefSetDestructuring__Group_2_1__0"


    // $ANTLR start "rule__KnowledgeDefSetDestructuring__Group_2_1__0__Impl"
    // InternalKant.g:3965:1: rule__KnowledgeDefSetDestructuring__Group_2_1__0__Impl : ( ',' ) ;
    public final void rule__KnowledgeDefSetDestructuring__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:3969:1: ( ( ',' ) )
            // InternalKant.g:3970:1: ( ',' )
            {
            // InternalKant.g:3970:1: ( ',' )
            // InternalKant.g:3971:2: ','
            {
             before(grammarAccess.getKnowledgeDefSetDestructuringAccess().getCommaKeyword_2_1_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getKnowledgeDefSetDestructuringAccess().getCommaKeyword_2_1_0()); 

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
    // $ANTLR end "rule__KnowledgeDefSetDestructuring__Group_2_1__0__Impl"


    // $ANTLR start "rule__KnowledgeDefSetDestructuring__Group_2_1__1"
    // InternalKant.g:3980:1: rule__KnowledgeDefSetDestructuring__Group_2_1__1 : rule__KnowledgeDefSetDestructuring__Group_2_1__1__Impl ;
    public final void rule__KnowledgeDefSetDestructuring__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:3984:1: ( rule__KnowledgeDefSetDestructuring__Group_2_1__1__Impl )
            // InternalKant.g:3985:2: rule__KnowledgeDefSetDestructuring__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__KnowledgeDefSetDestructuring__Group_2_1__1__Impl();

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
    // $ANTLR end "rule__KnowledgeDefSetDestructuring__Group_2_1__1"


    // $ANTLR start "rule__KnowledgeDefSetDestructuring__Group_2_1__1__Impl"
    // InternalKant.g:3991:1: rule__KnowledgeDefSetDestructuring__Group_2_1__1__Impl : ( ( rule__KnowledgeDefSetDestructuring__AssignmentsAssignment_2_1_1 ) ) ;
    public final void rule__KnowledgeDefSetDestructuring__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:3995:1: ( ( ( rule__KnowledgeDefSetDestructuring__AssignmentsAssignment_2_1_1 ) ) )
            // InternalKant.g:3996:1: ( ( rule__KnowledgeDefSetDestructuring__AssignmentsAssignment_2_1_1 ) )
            {
            // InternalKant.g:3996:1: ( ( rule__KnowledgeDefSetDestructuring__AssignmentsAssignment_2_1_1 ) )
            // InternalKant.g:3997:2: ( rule__KnowledgeDefSetDestructuring__AssignmentsAssignment_2_1_1 )
            {
             before(grammarAccess.getKnowledgeDefSetDestructuringAccess().getAssignmentsAssignment_2_1_1()); 
            // InternalKant.g:3998:2: ( rule__KnowledgeDefSetDestructuring__AssignmentsAssignment_2_1_1 )
            // InternalKant.g:3998:3: rule__KnowledgeDefSetDestructuring__AssignmentsAssignment_2_1_1
            {
            pushFollow(FOLLOW_2);
            rule__KnowledgeDefSetDestructuring__AssignmentsAssignment_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getKnowledgeDefSetDestructuringAccess().getAssignmentsAssignment_2_1_1()); 

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
    // $ANTLR end "rule__KnowledgeDefSetDestructuring__Group_2_1__1__Impl"


    // $ANTLR start "rule__KnowledgeDefSetDesctructuringAssignment__Group__0"
    // InternalKant.g:4007:1: rule__KnowledgeDefSetDesctructuringAssignment__Group__0 : rule__KnowledgeDefSetDesctructuringAssignment__Group__0__Impl rule__KnowledgeDefSetDesctructuringAssignment__Group__1 ;
    public final void rule__KnowledgeDefSetDesctructuringAssignment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:4011:1: ( rule__KnowledgeDefSetDesctructuringAssignment__Group__0__Impl rule__KnowledgeDefSetDesctructuringAssignment__Group__1 )
            // InternalKant.g:4012:2: rule__KnowledgeDefSetDesctructuringAssignment__Group__0__Impl rule__KnowledgeDefSetDesctructuringAssignment__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__KnowledgeDefSetDesctructuringAssignment__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__KnowledgeDefSetDesctructuringAssignment__Group__1();

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
    // $ANTLR end "rule__KnowledgeDefSetDesctructuringAssignment__Group__0"


    // $ANTLR start "rule__KnowledgeDefSetDesctructuringAssignment__Group__0__Impl"
    // InternalKant.g:4019:1: rule__KnowledgeDefSetDesctructuringAssignment__Group__0__Impl : ( ( rule__KnowledgeDefSetDesctructuringAssignment__NameAssignment_0 ) ) ;
    public final void rule__KnowledgeDefSetDesctructuringAssignment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:4023:1: ( ( ( rule__KnowledgeDefSetDesctructuringAssignment__NameAssignment_0 ) ) )
            // InternalKant.g:4024:1: ( ( rule__KnowledgeDefSetDesctructuringAssignment__NameAssignment_0 ) )
            {
            // InternalKant.g:4024:1: ( ( rule__KnowledgeDefSetDesctructuringAssignment__NameAssignment_0 ) )
            // InternalKant.g:4025:2: ( rule__KnowledgeDefSetDesctructuringAssignment__NameAssignment_0 )
            {
             before(grammarAccess.getKnowledgeDefSetDesctructuringAssignmentAccess().getNameAssignment_0()); 
            // InternalKant.g:4026:2: ( rule__KnowledgeDefSetDesctructuringAssignment__NameAssignment_0 )
            // InternalKant.g:4026:3: rule__KnowledgeDefSetDesctructuringAssignment__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__KnowledgeDefSetDesctructuringAssignment__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getKnowledgeDefSetDesctructuringAssignmentAccess().getNameAssignment_0()); 

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
    // $ANTLR end "rule__KnowledgeDefSetDesctructuringAssignment__Group__0__Impl"


    // $ANTLR start "rule__KnowledgeDefSetDesctructuringAssignment__Group__1"
    // InternalKant.g:4034:1: rule__KnowledgeDefSetDesctructuringAssignment__Group__1 : rule__KnowledgeDefSetDesctructuringAssignment__Group__1__Impl ;
    public final void rule__KnowledgeDefSetDesctructuringAssignment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:4038:1: ( rule__KnowledgeDefSetDesctructuringAssignment__Group__1__Impl )
            // InternalKant.g:4039:2: rule__KnowledgeDefSetDesctructuringAssignment__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__KnowledgeDefSetDesctructuringAssignment__Group__1__Impl();

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
    // $ANTLR end "rule__KnowledgeDefSetDesctructuringAssignment__Group__1"


    // $ANTLR start "rule__KnowledgeDefSetDesctructuringAssignment__Group__1__Impl"
    // InternalKant.g:4045:1: rule__KnowledgeDefSetDesctructuringAssignment__Group__1__Impl : ( ( rule__KnowledgeDefSetDesctructuringAssignment__Group_1__0 )? ) ;
    public final void rule__KnowledgeDefSetDesctructuringAssignment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:4049:1: ( ( ( rule__KnowledgeDefSetDesctructuringAssignment__Group_1__0 )? ) )
            // InternalKant.g:4050:1: ( ( rule__KnowledgeDefSetDesctructuringAssignment__Group_1__0 )? )
            {
            // InternalKant.g:4050:1: ( ( rule__KnowledgeDefSetDesctructuringAssignment__Group_1__0 )? )
            // InternalKant.g:4051:2: ( rule__KnowledgeDefSetDesctructuringAssignment__Group_1__0 )?
            {
             before(grammarAccess.getKnowledgeDefSetDesctructuringAssignmentAccess().getGroup_1()); 
            // InternalKant.g:4052:2: ( rule__KnowledgeDefSetDesctructuringAssignment__Group_1__0 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==20) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalKant.g:4052:3: rule__KnowledgeDefSetDesctructuringAssignment__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__KnowledgeDefSetDesctructuringAssignment__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getKnowledgeDefSetDesctructuringAssignmentAccess().getGroup_1()); 

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
    // $ANTLR end "rule__KnowledgeDefSetDesctructuringAssignment__Group__1__Impl"


    // $ANTLR start "rule__KnowledgeDefSetDesctructuringAssignment__Group_1__0"
    // InternalKant.g:4061:1: rule__KnowledgeDefSetDesctructuringAssignment__Group_1__0 : rule__KnowledgeDefSetDesctructuringAssignment__Group_1__0__Impl rule__KnowledgeDefSetDesctructuringAssignment__Group_1__1 ;
    public final void rule__KnowledgeDefSetDesctructuringAssignment__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:4065:1: ( rule__KnowledgeDefSetDesctructuringAssignment__Group_1__0__Impl rule__KnowledgeDefSetDesctructuringAssignment__Group_1__1 )
            // InternalKant.g:4066:2: rule__KnowledgeDefSetDesctructuringAssignment__Group_1__0__Impl rule__KnowledgeDefSetDesctructuringAssignment__Group_1__1
            {
            pushFollow(FOLLOW_4);
            rule__KnowledgeDefSetDesctructuringAssignment__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__KnowledgeDefSetDesctructuringAssignment__Group_1__1();

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
    // $ANTLR end "rule__KnowledgeDefSetDesctructuringAssignment__Group_1__0"


    // $ANTLR start "rule__KnowledgeDefSetDesctructuringAssignment__Group_1__0__Impl"
    // InternalKant.g:4073:1: rule__KnowledgeDefSetDesctructuringAssignment__Group_1__0__Impl : ( '=' ) ;
    public final void rule__KnowledgeDefSetDesctructuringAssignment__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:4077:1: ( ( '=' ) )
            // InternalKant.g:4078:1: ( '=' )
            {
            // InternalKant.g:4078:1: ( '=' )
            // InternalKant.g:4079:2: '='
            {
             before(grammarAccess.getKnowledgeDefSetDesctructuringAssignmentAccess().getEqualsSignKeyword_1_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getKnowledgeDefSetDesctructuringAssignmentAccess().getEqualsSignKeyword_1_0()); 

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
    // $ANTLR end "rule__KnowledgeDefSetDesctructuringAssignment__Group_1__0__Impl"


    // $ANTLR start "rule__KnowledgeDefSetDesctructuringAssignment__Group_1__1"
    // InternalKant.g:4088:1: rule__KnowledgeDefSetDesctructuringAssignment__Group_1__1 : rule__KnowledgeDefSetDesctructuringAssignment__Group_1__1__Impl ;
    public final void rule__KnowledgeDefSetDesctructuringAssignment__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:4092:1: ( rule__KnowledgeDefSetDesctructuringAssignment__Group_1__1__Impl )
            // InternalKant.g:4093:2: rule__KnowledgeDefSetDesctructuringAssignment__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__KnowledgeDefSetDesctructuringAssignment__Group_1__1__Impl();

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
    // $ANTLR end "rule__KnowledgeDefSetDesctructuringAssignment__Group_1__1"


    // $ANTLR start "rule__KnowledgeDefSetDesctructuringAssignment__Group_1__1__Impl"
    // InternalKant.g:4099:1: rule__KnowledgeDefSetDesctructuringAssignment__Group_1__1__Impl : ( ( rule__KnowledgeDefSetDesctructuringAssignment__FromAssignment_1_1 ) ) ;
    public final void rule__KnowledgeDefSetDesctructuringAssignment__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:4103:1: ( ( ( rule__KnowledgeDefSetDesctructuringAssignment__FromAssignment_1_1 ) ) )
            // InternalKant.g:4104:1: ( ( rule__KnowledgeDefSetDesctructuringAssignment__FromAssignment_1_1 ) )
            {
            // InternalKant.g:4104:1: ( ( rule__KnowledgeDefSetDesctructuringAssignment__FromAssignment_1_1 ) )
            // InternalKant.g:4105:2: ( rule__KnowledgeDefSetDesctructuringAssignment__FromAssignment_1_1 )
            {
             before(grammarAccess.getKnowledgeDefSetDesctructuringAssignmentAccess().getFromAssignment_1_1()); 
            // InternalKant.g:4106:2: ( rule__KnowledgeDefSetDesctructuringAssignment__FromAssignment_1_1 )
            // InternalKant.g:4106:3: rule__KnowledgeDefSetDesctructuringAssignment__FromAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__KnowledgeDefSetDesctructuringAssignment__FromAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getKnowledgeDefSetDesctructuringAssignmentAccess().getFromAssignment_1_1()); 

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
    // $ANTLR end "rule__KnowledgeDefSetDesctructuringAssignment__Group_1__1__Impl"


    // $ANTLR start "rule__KnowledgeDefListDestructuring__Group__0"
    // InternalKant.g:4115:1: rule__KnowledgeDefListDestructuring__Group__0 : rule__KnowledgeDefListDestructuring__Group__0__Impl rule__KnowledgeDefListDestructuring__Group__1 ;
    public final void rule__KnowledgeDefListDestructuring__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:4119:1: ( rule__KnowledgeDefListDestructuring__Group__0__Impl rule__KnowledgeDefListDestructuring__Group__1 )
            // InternalKant.g:4120:2: rule__KnowledgeDefListDestructuring__Group__0__Impl rule__KnowledgeDefListDestructuring__Group__1
            {
            pushFollow(FOLLOW_26);
            rule__KnowledgeDefListDestructuring__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__KnowledgeDefListDestructuring__Group__1();

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
    // $ANTLR end "rule__KnowledgeDefListDestructuring__Group__0"


    // $ANTLR start "rule__KnowledgeDefListDestructuring__Group__0__Impl"
    // InternalKant.g:4127:1: rule__KnowledgeDefListDestructuring__Group__0__Impl : ( () ) ;
    public final void rule__KnowledgeDefListDestructuring__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:4131:1: ( ( () ) )
            // InternalKant.g:4132:1: ( () )
            {
            // InternalKant.g:4132:1: ( () )
            // InternalKant.g:4133:2: ()
            {
             before(grammarAccess.getKnowledgeDefListDestructuringAccess().getKnowledgeDefListDestructuringAction_0()); 
            // InternalKant.g:4134:2: ()
            // InternalKant.g:4134:3: 
            {
            }

             after(grammarAccess.getKnowledgeDefListDestructuringAccess().getKnowledgeDefListDestructuringAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KnowledgeDefListDestructuring__Group__0__Impl"


    // $ANTLR start "rule__KnowledgeDefListDestructuring__Group__1"
    // InternalKant.g:4142:1: rule__KnowledgeDefListDestructuring__Group__1 : rule__KnowledgeDefListDestructuring__Group__1__Impl rule__KnowledgeDefListDestructuring__Group__2 ;
    public final void rule__KnowledgeDefListDestructuring__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:4146:1: ( rule__KnowledgeDefListDestructuring__Group__1__Impl rule__KnowledgeDefListDestructuring__Group__2 )
            // InternalKant.g:4147:2: rule__KnowledgeDefListDestructuring__Group__1__Impl rule__KnowledgeDefListDestructuring__Group__2
            {
            pushFollow(FOLLOW_27);
            rule__KnowledgeDefListDestructuring__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__KnowledgeDefListDestructuring__Group__2();

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
    // $ANTLR end "rule__KnowledgeDefListDestructuring__Group__1"


    // $ANTLR start "rule__KnowledgeDefListDestructuring__Group__1__Impl"
    // InternalKant.g:4154:1: rule__KnowledgeDefListDestructuring__Group__1__Impl : ( '[' ) ;
    public final void rule__KnowledgeDefListDestructuring__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:4158:1: ( ( '[' ) )
            // InternalKant.g:4159:1: ( '[' )
            {
            // InternalKant.g:4159:1: ( '[' )
            // InternalKant.g:4160:2: '['
            {
             before(grammarAccess.getKnowledgeDefListDestructuringAccess().getLeftSquareBracketKeyword_1()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getKnowledgeDefListDestructuringAccess().getLeftSquareBracketKeyword_1()); 

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
    // $ANTLR end "rule__KnowledgeDefListDestructuring__Group__1__Impl"


    // $ANTLR start "rule__KnowledgeDefListDestructuring__Group__2"
    // InternalKant.g:4169:1: rule__KnowledgeDefListDestructuring__Group__2 : rule__KnowledgeDefListDestructuring__Group__2__Impl rule__KnowledgeDefListDestructuring__Group__3 ;
    public final void rule__KnowledgeDefListDestructuring__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:4173:1: ( rule__KnowledgeDefListDestructuring__Group__2__Impl rule__KnowledgeDefListDestructuring__Group__3 )
            // InternalKant.g:4174:2: rule__KnowledgeDefListDestructuring__Group__2__Impl rule__KnowledgeDefListDestructuring__Group__3
            {
            pushFollow(FOLLOW_27);
            rule__KnowledgeDefListDestructuring__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__KnowledgeDefListDestructuring__Group__3();

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
    // $ANTLR end "rule__KnowledgeDefListDestructuring__Group__2"


    // $ANTLR start "rule__KnowledgeDefListDestructuring__Group__2__Impl"
    // InternalKant.g:4181:1: rule__KnowledgeDefListDestructuring__Group__2__Impl : ( ( rule__KnowledgeDefListDestructuring__Group_2__0 )? ) ;
    public final void rule__KnowledgeDefListDestructuring__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:4185:1: ( ( ( rule__KnowledgeDefListDestructuring__Group_2__0 )? ) )
            // InternalKant.g:4186:1: ( ( rule__KnowledgeDefListDestructuring__Group_2__0 )? )
            {
            // InternalKant.g:4186:1: ( ( rule__KnowledgeDefListDestructuring__Group_2__0 )? )
            // InternalKant.g:4187:2: ( rule__KnowledgeDefListDestructuring__Group_2__0 )?
            {
             before(grammarAccess.getKnowledgeDefListDestructuringAccess().getGroup_2()); 
            // InternalKant.g:4188:2: ( rule__KnowledgeDefListDestructuring__Group_2__0 )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==RULE_ID||(LA45_0>=31 && LA45_0<=32)) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalKant.g:4188:3: rule__KnowledgeDefListDestructuring__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__KnowledgeDefListDestructuring__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getKnowledgeDefListDestructuringAccess().getGroup_2()); 

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
    // $ANTLR end "rule__KnowledgeDefListDestructuring__Group__2__Impl"


    // $ANTLR start "rule__KnowledgeDefListDestructuring__Group__3"
    // InternalKant.g:4196:1: rule__KnowledgeDefListDestructuring__Group__3 : rule__KnowledgeDefListDestructuring__Group__3__Impl ;
    public final void rule__KnowledgeDefListDestructuring__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:4200:1: ( rule__KnowledgeDefListDestructuring__Group__3__Impl )
            // InternalKant.g:4201:2: rule__KnowledgeDefListDestructuring__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__KnowledgeDefListDestructuring__Group__3__Impl();

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
    // $ANTLR end "rule__KnowledgeDefListDestructuring__Group__3"


    // $ANTLR start "rule__KnowledgeDefListDestructuring__Group__3__Impl"
    // InternalKant.g:4207:1: rule__KnowledgeDefListDestructuring__Group__3__Impl : ( ']' ) ;
    public final void rule__KnowledgeDefListDestructuring__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:4211:1: ( ( ']' ) )
            // InternalKant.g:4212:1: ( ']' )
            {
            // InternalKant.g:4212:1: ( ']' )
            // InternalKant.g:4213:2: ']'
            {
             before(grammarAccess.getKnowledgeDefListDestructuringAccess().getRightSquareBracketKeyword_3()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getKnowledgeDefListDestructuringAccess().getRightSquareBracketKeyword_3()); 

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
    // $ANTLR end "rule__KnowledgeDefListDestructuring__Group__3__Impl"


    // $ANTLR start "rule__KnowledgeDefListDestructuring__Group_2__0"
    // InternalKant.g:4223:1: rule__KnowledgeDefListDestructuring__Group_2__0 : rule__KnowledgeDefListDestructuring__Group_2__0__Impl rule__KnowledgeDefListDestructuring__Group_2__1 ;
    public final void rule__KnowledgeDefListDestructuring__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:4227:1: ( rule__KnowledgeDefListDestructuring__Group_2__0__Impl rule__KnowledgeDefListDestructuring__Group_2__1 )
            // InternalKant.g:4228:2: rule__KnowledgeDefListDestructuring__Group_2__0__Impl rule__KnowledgeDefListDestructuring__Group_2__1
            {
            pushFollow(FOLLOW_25);
            rule__KnowledgeDefListDestructuring__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__KnowledgeDefListDestructuring__Group_2__1();

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
    // $ANTLR end "rule__KnowledgeDefListDestructuring__Group_2__0"


    // $ANTLR start "rule__KnowledgeDefListDestructuring__Group_2__0__Impl"
    // InternalKant.g:4235:1: rule__KnowledgeDefListDestructuring__Group_2__0__Impl : ( ( rule__KnowledgeDefListDestructuring__AssignmentsAssignment_2_0 ) ) ;
    public final void rule__KnowledgeDefListDestructuring__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:4239:1: ( ( ( rule__KnowledgeDefListDestructuring__AssignmentsAssignment_2_0 ) ) )
            // InternalKant.g:4240:1: ( ( rule__KnowledgeDefListDestructuring__AssignmentsAssignment_2_0 ) )
            {
            // InternalKant.g:4240:1: ( ( rule__KnowledgeDefListDestructuring__AssignmentsAssignment_2_0 ) )
            // InternalKant.g:4241:2: ( rule__KnowledgeDefListDestructuring__AssignmentsAssignment_2_0 )
            {
             before(grammarAccess.getKnowledgeDefListDestructuringAccess().getAssignmentsAssignment_2_0()); 
            // InternalKant.g:4242:2: ( rule__KnowledgeDefListDestructuring__AssignmentsAssignment_2_0 )
            // InternalKant.g:4242:3: rule__KnowledgeDefListDestructuring__AssignmentsAssignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__KnowledgeDefListDestructuring__AssignmentsAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getKnowledgeDefListDestructuringAccess().getAssignmentsAssignment_2_0()); 

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
    // $ANTLR end "rule__KnowledgeDefListDestructuring__Group_2__0__Impl"


    // $ANTLR start "rule__KnowledgeDefListDestructuring__Group_2__1"
    // InternalKant.g:4250:1: rule__KnowledgeDefListDestructuring__Group_2__1 : rule__KnowledgeDefListDestructuring__Group_2__1__Impl ;
    public final void rule__KnowledgeDefListDestructuring__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:4254:1: ( rule__KnowledgeDefListDestructuring__Group_2__1__Impl )
            // InternalKant.g:4255:2: rule__KnowledgeDefListDestructuring__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__KnowledgeDefListDestructuring__Group_2__1__Impl();

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
    // $ANTLR end "rule__KnowledgeDefListDestructuring__Group_2__1"


    // $ANTLR start "rule__KnowledgeDefListDestructuring__Group_2__1__Impl"
    // InternalKant.g:4261:1: rule__KnowledgeDefListDestructuring__Group_2__1__Impl : ( ( rule__KnowledgeDefListDestructuring__Group_2_1__0 )* ) ;
    public final void rule__KnowledgeDefListDestructuring__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:4265:1: ( ( ( rule__KnowledgeDefListDestructuring__Group_2_1__0 )* ) )
            // InternalKant.g:4266:1: ( ( rule__KnowledgeDefListDestructuring__Group_2_1__0 )* )
            {
            // InternalKant.g:4266:1: ( ( rule__KnowledgeDefListDestructuring__Group_2_1__0 )* )
            // InternalKant.g:4267:2: ( rule__KnowledgeDefListDestructuring__Group_2_1__0 )*
            {
             before(grammarAccess.getKnowledgeDefListDestructuringAccess().getGroup_2_1()); 
            // InternalKant.g:4268:2: ( rule__KnowledgeDefListDestructuring__Group_2_1__0 )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==13) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // InternalKant.g:4268:3: rule__KnowledgeDefListDestructuring__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__KnowledgeDefListDestructuring__Group_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop46;
                }
            } while (true);

             after(grammarAccess.getKnowledgeDefListDestructuringAccess().getGroup_2_1()); 

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
    // $ANTLR end "rule__KnowledgeDefListDestructuring__Group_2__1__Impl"


    // $ANTLR start "rule__KnowledgeDefListDestructuring__Group_2_1__0"
    // InternalKant.g:4277:1: rule__KnowledgeDefListDestructuring__Group_2_1__0 : rule__KnowledgeDefListDestructuring__Group_2_1__0__Impl rule__KnowledgeDefListDestructuring__Group_2_1__1 ;
    public final void rule__KnowledgeDefListDestructuring__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:4281:1: ( rule__KnowledgeDefListDestructuring__Group_2_1__0__Impl rule__KnowledgeDefListDestructuring__Group_2_1__1 )
            // InternalKant.g:4282:2: rule__KnowledgeDefListDestructuring__Group_2_1__0__Impl rule__KnowledgeDefListDestructuring__Group_2_1__1
            {
            pushFollow(FOLLOW_28);
            rule__KnowledgeDefListDestructuring__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__KnowledgeDefListDestructuring__Group_2_1__1();

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
    // $ANTLR end "rule__KnowledgeDefListDestructuring__Group_2_1__0"


    // $ANTLR start "rule__KnowledgeDefListDestructuring__Group_2_1__0__Impl"
    // InternalKant.g:4289:1: rule__KnowledgeDefListDestructuring__Group_2_1__0__Impl : ( ',' ) ;
    public final void rule__KnowledgeDefListDestructuring__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:4293:1: ( ( ',' ) )
            // InternalKant.g:4294:1: ( ',' )
            {
            // InternalKant.g:4294:1: ( ',' )
            // InternalKant.g:4295:2: ','
            {
             before(grammarAccess.getKnowledgeDefListDestructuringAccess().getCommaKeyword_2_1_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getKnowledgeDefListDestructuringAccess().getCommaKeyword_2_1_0()); 

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
    // $ANTLR end "rule__KnowledgeDefListDestructuring__Group_2_1__0__Impl"


    // $ANTLR start "rule__KnowledgeDefListDestructuring__Group_2_1__1"
    // InternalKant.g:4304:1: rule__KnowledgeDefListDestructuring__Group_2_1__1 : rule__KnowledgeDefListDestructuring__Group_2_1__1__Impl ;
    public final void rule__KnowledgeDefListDestructuring__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:4308:1: ( rule__KnowledgeDefListDestructuring__Group_2_1__1__Impl )
            // InternalKant.g:4309:2: rule__KnowledgeDefListDestructuring__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__KnowledgeDefListDestructuring__Group_2_1__1__Impl();

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
    // $ANTLR end "rule__KnowledgeDefListDestructuring__Group_2_1__1"


    // $ANTLR start "rule__KnowledgeDefListDestructuring__Group_2_1__1__Impl"
    // InternalKant.g:4315:1: rule__KnowledgeDefListDestructuring__Group_2_1__1__Impl : ( ( rule__KnowledgeDefListDestructuring__AssignmentsAssignment_2_1_1 ) ) ;
    public final void rule__KnowledgeDefListDestructuring__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:4319:1: ( ( ( rule__KnowledgeDefListDestructuring__AssignmentsAssignment_2_1_1 ) ) )
            // InternalKant.g:4320:1: ( ( rule__KnowledgeDefListDestructuring__AssignmentsAssignment_2_1_1 ) )
            {
            // InternalKant.g:4320:1: ( ( rule__KnowledgeDefListDestructuring__AssignmentsAssignment_2_1_1 ) )
            // InternalKant.g:4321:2: ( rule__KnowledgeDefListDestructuring__AssignmentsAssignment_2_1_1 )
            {
             before(grammarAccess.getKnowledgeDefListDestructuringAccess().getAssignmentsAssignment_2_1_1()); 
            // InternalKant.g:4322:2: ( rule__KnowledgeDefListDestructuring__AssignmentsAssignment_2_1_1 )
            // InternalKant.g:4322:3: rule__KnowledgeDefListDestructuring__AssignmentsAssignment_2_1_1
            {
            pushFollow(FOLLOW_2);
            rule__KnowledgeDefListDestructuring__AssignmentsAssignment_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getKnowledgeDefListDestructuringAccess().getAssignmentsAssignment_2_1_1()); 

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
    // $ANTLR end "rule__KnowledgeDefListDestructuring__Group_2_1__1__Impl"


    // $ANTLR start "rule__KnowledgeDefListDesctructuringAssignment__Group_0__0"
    // InternalKant.g:4331:1: rule__KnowledgeDefListDesctructuringAssignment__Group_0__0 : rule__KnowledgeDefListDesctructuringAssignment__Group_0__0__Impl rule__KnowledgeDefListDesctructuringAssignment__Group_0__1 ;
    public final void rule__KnowledgeDefListDesctructuringAssignment__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:4335:1: ( rule__KnowledgeDefListDesctructuringAssignment__Group_0__0__Impl rule__KnowledgeDefListDesctructuringAssignment__Group_0__1 )
            // InternalKant.g:4336:2: rule__KnowledgeDefListDesctructuringAssignment__Group_0__0__Impl rule__KnowledgeDefListDesctructuringAssignment__Group_0__1
            {
            pushFollow(FOLLOW_29);
            rule__KnowledgeDefListDesctructuringAssignment__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__KnowledgeDefListDesctructuringAssignment__Group_0__1();

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
    // $ANTLR end "rule__KnowledgeDefListDesctructuringAssignment__Group_0__0"


    // $ANTLR start "rule__KnowledgeDefListDesctructuringAssignment__Group_0__0__Impl"
    // InternalKant.g:4343:1: rule__KnowledgeDefListDesctructuringAssignment__Group_0__0__Impl : ( () ) ;
    public final void rule__KnowledgeDefListDesctructuringAssignment__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:4347:1: ( ( () ) )
            // InternalKant.g:4348:1: ( () )
            {
            // InternalKant.g:4348:1: ( () )
            // InternalKant.g:4349:2: ()
            {
             before(grammarAccess.getKnowledgeDefListDesctructuringAssignmentAccess().getKnowledgeDefListDesctructuringAssignmentAction_0_0()); 
            // InternalKant.g:4350:2: ()
            // InternalKant.g:4350:3: 
            {
            }

             after(grammarAccess.getKnowledgeDefListDesctructuringAssignmentAccess().getKnowledgeDefListDesctructuringAssignmentAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KnowledgeDefListDesctructuringAssignment__Group_0__0__Impl"


    // $ANTLR start "rule__KnowledgeDefListDesctructuringAssignment__Group_0__1"
    // InternalKant.g:4358:1: rule__KnowledgeDefListDesctructuringAssignment__Group_0__1 : rule__KnowledgeDefListDesctructuringAssignment__Group_0__1__Impl ;
    public final void rule__KnowledgeDefListDesctructuringAssignment__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:4362:1: ( rule__KnowledgeDefListDesctructuringAssignment__Group_0__1__Impl )
            // InternalKant.g:4363:2: rule__KnowledgeDefListDesctructuringAssignment__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__KnowledgeDefListDesctructuringAssignment__Group_0__1__Impl();

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
    // $ANTLR end "rule__KnowledgeDefListDesctructuringAssignment__Group_0__1"


    // $ANTLR start "rule__KnowledgeDefListDesctructuringAssignment__Group_0__1__Impl"
    // InternalKant.g:4369:1: rule__KnowledgeDefListDesctructuringAssignment__Group_0__1__Impl : ( '...' ) ;
    public final void rule__KnowledgeDefListDesctructuringAssignment__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:4373:1: ( ( '...' ) )
            // InternalKant.g:4374:1: ( '...' )
            {
            // InternalKant.g:4374:1: ( '...' )
            // InternalKant.g:4375:2: '...'
            {
             before(grammarAccess.getKnowledgeDefListDesctructuringAssignmentAccess().getFullStopFullStopFullStopKeyword_0_1()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getKnowledgeDefListDesctructuringAssignmentAccess().getFullStopFullStopFullStopKeyword_0_1()); 

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
    // $ANTLR end "rule__KnowledgeDefListDesctructuringAssignment__Group_0__1__Impl"


    // $ANTLR start "rule__KnowledgeDefListDesctructuringAssignment__Group_1__0"
    // InternalKant.g:4385:1: rule__KnowledgeDefListDesctructuringAssignment__Group_1__0 : rule__KnowledgeDefListDesctructuringAssignment__Group_1__0__Impl rule__KnowledgeDefListDesctructuringAssignment__Group_1__1 ;
    public final void rule__KnowledgeDefListDesctructuringAssignment__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:4389:1: ( rule__KnowledgeDefListDesctructuringAssignment__Group_1__0__Impl rule__KnowledgeDefListDesctructuringAssignment__Group_1__1 )
            // InternalKant.g:4390:2: rule__KnowledgeDefListDesctructuringAssignment__Group_1__0__Impl rule__KnowledgeDefListDesctructuringAssignment__Group_1__1
            {
            pushFollow(FOLLOW_30);
            rule__KnowledgeDefListDesctructuringAssignment__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__KnowledgeDefListDesctructuringAssignment__Group_1__1();

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
    // $ANTLR end "rule__KnowledgeDefListDesctructuringAssignment__Group_1__0"


    // $ANTLR start "rule__KnowledgeDefListDesctructuringAssignment__Group_1__0__Impl"
    // InternalKant.g:4397:1: rule__KnowledgeDefListDesctructuringAssignment__Group_1__0__Impl : ( () ) ;
    public final void rule__KnowledgeDefListDesctructuringAssignment__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:4401:1: ( ( () ) )
            // InternalKant.g:4402:1: ( () )
            {
            // InternalKant.g:4402:1: ( () )
            // InternalKant.g:4403:2: ()
            {
             before(grammarAccess.getKnowledgeDefListDesctructuringAssignmentAccess().getKnowledgeDefListDesctructuringAssignmentAction_1_0()); 
            // InternalKant.g:4404:2: ()
            // InternalKant.g:4404:3: 
            {
            }

             after(grammarAccess.getKnowledgeDefListDesctructuringAssignmentAccess().getKnowledgeDefListDesctructuringAssignmentAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KnowledgeDefListDesctructuringAssignment__Group_1__0__Impl"


    // $ANTLR start "rule__KnowledgeDefListDesctructuringAssignment__Group_1__1"
    // InternalKant.g:4412:1: rule__KnowledgeDefListDesctructuringAssignment__Group_1__1 : rule__KnowledgeDefListDesctructuringAssignment__Group_1__1__Impl ;
    public final void rule__KnowledgeDefListDesctructuringAssignment__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:4416:1: ( rule__KnowledgeDefListDesctructuringAssignment__Group_1__1__Impl )
            // InternalKant.g:4417:2: rule__KnowledgeDefListDesctructuringAssignment__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__KnowledgeDefListDesctructuringAssignment__Group_1__1__Impl();

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
    // $ANTLR end "rule__KnowledgeDefListDesctructuringAssignment__Group_1__1"


    // $ANTLR start "rule__KnowledgeDefListDesctructuringAssignment__Group_1__1__Impl"
    // InternalKant.g:4423:1: rule__KnowledgeDefListDesctructuringAssignment__Group_1__1__Impl : ( '_' ) ;
    public final void rule__KnowledgeDefListDesctructuringAssignment__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:4427:1: ( ( '_' ) )
            // InternalKant.g:4428:1: ( '_' )
            {
            // InternalKant.g:4428:1: ( '_' )
            // InternalKant.g:4429:2: '_'
            {
             before(grammarAccess.getKnowledgeDefListDesctructuringAssignmentAccess().get_Keyword_1_1()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getKnowledgeDefListDesctructuringAssignmentAccess().get_Keyword_1_1()); 

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
    // $ANTLR end "rule__KnowledgeDefListDesctructuringAssignment__Group_1__1__Impl"


    // $ANTLR start "rule__KnowledgeList__Group__0"
    // InternalKant.g:4439:1: rule__KnowledgeList__Group__0 : rule__KnowledgeList__Group__0__Impl rule__KnowledgeList__Group__1 ;
    public final void rule__KnowledgeList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:4443:1: ( rule__KnowledgeList__Group__0__Impl rule__KnowledgeList__Group__1 )
            // InternalKant.g:4444:2: rule__KnowledgeList__Group__0__Impl rule__KnowledgeList__Group__1
            {
            pushFollow(FOLLOW_31);
            rule__KnowledgeList__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__KnowledgeList__Group__1();

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
    // $ANTLR end "rule__KnowledgeList__Group__0"


    // $ANTLR start "rule__KnowledgeList__Group__0__Impl"
    // InternalKant.g:4451:1: rule__KnowledgeList__Group__0__Impl : ( () ) ;
    public final void rule__KnowledgeList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:4455:1: ( ( () ) )
            // InternalKant.g:4456:1: ( () )
            {
            // InternalKant.g:4456:1: ( () )
            // InternalKant.g:4457:2: ()
            {
             before(grammarAccess.getKnowledgeListAccess().getKnowledgeListAction_0()); 
            // InternalKant.g:4458:2: ()
            // InternalKant.g:4458:3: 
            {
            }

             after(grammarAccess.getKnowledgeListAccess().getKnowledgeListAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KnowledgeList__Group__0__Impl"


    // $ANTLR start "rule__KnowledgeList__Group__1"
    // InternalKant.g:4466:1: rule__KnowledgeList__Group__1 : rule__KnowledgeList__Group__1__Impl rule__KnowledgeList__Group__2 ;
    public final void rule__KnowledgeList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:4470:1: ( rule__KnowledgeList__Group__1__Impl rule__KnowledgeList__Group__2 )
            // InternalKant.g:4471:2: rule__KnowledgeList__Group__1__Impl rule__KnowledgeList__Group__2
            {
            pushFollow(FOLLOW_32);
            rule__KnowledgeList__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__KnowledgeList__Group__2();

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
    // $ANTLR end "rule__KnowledgeList__Group__1"


    // $ANTLR start "rule__KnowledgeList__Group__1__Impl"
    // InternalKant.g:4478:1: rule__KnowledgeList__Group__1__Impl : ( '[' ) ;
    public final void rule__KnowledgeList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:4482:1: ( ( '[' ) )
            // InternalKant.g:4483:1: ( '[' )
            {
            // InternalKant.g:4483:1: ( '[' )
            // InternalKant.g:4484:2: '['
            {
             before(grammarAccess.getKnowledgeListAccess().getLeftSquareBracketKeyword_1()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getKnowledgeListAccess().getLeftSquareBracketKeyword_1()); 

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
    // $ANTLR end "rule__KnowledgeList__Group__1__Impl"


    // $ANTLR start "rule__KnowledgeList__Group__2"
    // InternalKant.g:4493:1: rule__KnowledgeList__Group__2 : rule__KnowledgeList__Group__2__Impl rule__KnowledgeList__Group__3 ;
    public final void rule__KnowledgeList__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:4497:1: ( rule__KnowledgeList__Group__2__Impl rule__KnowledgeList__Group__3 )
            // InternalKant.g:4498:2: rule__KnowledgeList__Group__2__Impl rule__KnowledgeList__Group__3
            {
            pushFollow(FOLLOW_32);
            rule__KnowledgeList__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__KnowledgeList__Group__3();

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
    // $ANTLR end "rule__KnowledgeList__Group__2"


    // $ANTLR start "rule__KnowledgeList__Group__2__Impl"
    // InternalKant.g:4505:1: rule__KnowledgeList__Group__2__Impl : ( ( rule__KnowledgeList__Group_2__0 )? ) ;
    public final void rule__KnowledgeList__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:4509:1: ( ( ( rule__KnowledgeList__Group_2__0 )? ) )
            // InternalKant.g:4510:1: ( ( rule__KnowledgeList__Group_2__0 )? )
            {
            // InternalKant.g:4510:1: ( ( rule__KnowledgeList__Group_2__0 )? )
            // InternalKant.g:4511:2: ( rule__KnowledgeList__Group_2__0 )?
            {
             before(grammarAccess.getKnowledgeListAccess().getGroup_2()); 
            // InternalKant.g:4512:2: ( rule__KnowledgeList__Group_2__0 )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==RULE_ID||LA47_0==21||LA47_0==29||LA47_0==31||LA47_0==34) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalKant.g:4512:3: rule__KnowledgeList__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__KnowledgeList__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getKnowledgeListAccess().getGroup_2()); 

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
    // $ANTLR end "rule__KnowledgeList__Group__2__Impl"


    // $ANTLR start "rule__KnowledgeList__Group__3"
    // InternalKant.g:4520:1: rule__KnowledgeList__Group__3 : rule__KnowledgeList__Group__3__Impl ;
    public final void rule__KnowledgeList__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:4524:1: ( rule__KnowledgeList__Group__3__Impl )
            // InternalKant.g:4525:2: rule__KnowledgeList__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__KnowledgeList__Group__3__Impl();

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
    // $ANTLR end "rule__KnowledgeList__Group__3"


    // $ANTLR start "rule__KnowledgeList__Group__3__Impl"
    // InternalKant.g:4531:1: rule__KnowledgeList__Group__3__Impl : ( ']' ) ;
    public final void rule__KnowledgeList__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:4535:1: ( ( ']' ) )
            // InternalKant.g:4536:1: ( ']' )
            {
            // InternalKant.g:4536:1: ( ']' )
            // InternalKant.g:4537:2: ']'
            {
             before(grammarAccess.getKnowledgeListAccess().getRightSquareBracketKeyword_3()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getKnowledgeListAccess().getRightSquareBracketKeyword_3()); 

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
    // $ANTLR end "rule__KnowledgeList__Group__3__Impl"


    // $ANTLR start "rule__KnowledgeList__Group_2__0"
    // InternalKant.g:4547:1: rule__KnowledgeList__Group_2__0 : rule__KnowledgeList__Group_2__0__Impl rule__KnowledgeList__Group_2__1 ;
    public final void rule__KnowledgeList__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:4551:1: ( rule__KnowledgeList__Group_2__0__Impl rule__KnowledgeList__Group_2__1 )
            // InternalKant.g:4552:2: rule__KnowledgeList__Group_2__0__Impl rule__KnowledgeList__Group_2__1
            {
            pushFollow(FOLLOW_25);
            rule__KnowledgeList__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__KnowledgeList__Group_2__1();

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
    // $ANTLR end "rule__KnowledgeList__Group_2__0"


    // $ANTLR start "rule__KnowledgeList__Group_2__0__Impl"
    // InternalKant.g:4559:1: rule__KnowledgeList__Group_2__0__Impl : ( ( rule__KnowledgeList__ValuesAssignment_2_0 ) ) ;
    public final void rule__KnowledgeList__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:4563:1: ( ( ( rule__KnowledgeList__ValuesAssignment_2_0 ) ) )
            // InternalKant.g:4564:1: ( ( rule__KnowledgeList__ValuesAssignment_2_0 ) )
            {
            // InternalKant.g:4564:1: ( ( rule__KnowledgeList__ValuesAssignment_2_0 ) )
            // InternalKant.g:4565:2: ( rule__KnowledgeList__ValuesAssignment_2_0 )
            {
             before(grammarAccess.getKnowledgeListAccess().getValuesAssignment_2_0()); 
            // InternalKant.g:4566:2: ( rule__KnowledgeList__ValuesAssignment_2_0 )
            // InternalKant.g:4566:3: rule__KnowledgeList__ValuesAssignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__KnowledgeList__ValuesAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getKnowledgeListAccess().getValuesAssignment_2_0()); 

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
    // $ANTLR end "rule__KnowledgeList__Group_2__0__Impl"


    // $ANTLR start "rule__KnowledgeList__Group_2__1"
    // InternalKant.g:4574:1: rule__KnowledgeList__Group_2__1 : rule__KnowledgeList__Group_2__1__Impl ;
    public final void rule__KnowledgeList__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:4578:1: ( rule__KnowledgeList__Group_2__1__Impl )
            // InternalKant.g:4579:2: rule__KnowledgeList__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__KnowledgeList__Group_2__1__Impl();

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
    // $ANTLR end "rule__KnowledgeList__Group_2__1"


    // $ANTLR start "rule__KnowledgeList__Group_2__1__Impl"
    // InternalKant.g:4585:1: rule__KnowledgeList__Group_2__1__Impl : ( ( rule__KnowledgeList__Group_2_1__0 )* ) ;
    public final void rule__KnowledgeList__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:4589:1: ( ( ( rule__KnowledgeList__Group_2_1__0 )* ) )
            // InternalKant.g:4590:1: ( ( rule__KnowledgeList__Group_2_1__0 )* )
            {
            // InternalKant.g:4590:1: ( ( rule__KnowledgeList__Group_2_1__0 )* )
            // InternalKant.g:4591:2: ( rule__KnowledgeList__Group_2_1__0 )*
            {
             before(grammarAccess.getKnowledgeListAccess().getGroup_2_1()); 
            // InternalKant.g:4592:2: ( rule__KnowledgeList__Group_2_1__0 )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==13) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // InternalKant.g:4592:3: rule__KnowledgeList__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__KnowledgeList__Group_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop48;
                }
            } while (true);

             after(grammarAccess.getKnowledgeListAccess().getGroup_2_1()); 

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
    // $ANTLR end "rule__KnowledgeList__Group_2__1__Impl"


    // $ANTLR start "rule__KnowledgeList__Group_2_1__0"
    // InternalKant.g:4601:1: rule__KnowledgeList__Group_2_1__0 : rule__KnowledgeList__Group_2_1__0__Impl rule__KnowledgeList__Group_2_1__1 ;
    public final void rule__KnowledgeList__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:4605:1: ( rule__KnowledgeList__Group_2_1__0__Impl rule__KnowledgeList__Group_2_1__1 )
            // InternalKant.g:4606:2: rule__KnowledgeList__Group_2_1__0__Impl rule__KnowledgeList__Group_2_1__1
            {
            pushFollow(FOLLOW_33);
            rule__KnowledgeList__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__KnowledgeList__Group_2_1__1();

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
    // $ANTLR end "rule__KnowledgeList__Group_2_1__0"


    // $ANTLR start "rule__KnowledgeList__Group_2_1__0__Impl"
    // InternalKant.g:4613:1: rule__KnowledgeList__Group_2_1__0__Impl : ( ',' ) ;
    public final void rule__KnowledgeList__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:4617:1: ( ( ',' ) )
            // InternalKant.g:4618:1: ( ',' )
            {
            // InternalKant.g:4618:1: ( ',' )
            // InternalKant.g:4619:2: ','
            {
             before(grammarAccess.getKnowledgeListAccess().getCommaKeyword_2_1_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getKnowledgeListAccess().getCommaKeyword_2_1_0()); 

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
    // $ANTLR end "rule__KnowledgeList__Group_2_1__0__Impl"


    // $ANTLR start "rule__KnowledgeList__Group_2_1__1"
    // InternalKant.g:4628:1: rule__KnowledgeList__Group_2_1__1 : rule__KnowledgeList__Group_2_1__1__Impl ;
    public final void rule__KnowledgeList__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:4632:1: ( rule__KnowledgeList__Group_2_1__1__Impl )
            // InternalKant.g:4633:2: rule__KnowledgeList__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__KnowledgeList__Group_2_1__1__Impl();

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
    // $ANTLR end "rule__KnowledgeList__Group_2_1__1"


    // $ANTLR start "rule__KnowledgeList__Group_2_1__1__Impl"
    // InternalKant.g:4639:1: rule__KnowledgeList__Group_2_1__1__Impl : ( ( rule__KnowledgeList__ValuesAssignment_2_1_1 ) ) ;
    public final void rule__KnowledgeList__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:4643:1: ( ( ( rule__KnowledgeList__ValuesAssignment_2_1_1 ) ) )
            // InternalKant.g:4644:1: ( ( rule__KnowledgeList__ValuesAssignment_2_1_1 ) )
            {
            // InternalKant.g:4644:1: ( ( rule__KnowledgeList__ValuesAssignment_2_1_1 ) )
            // InternalKant.g:4645:2: ( rule__KnowledgeList__ValuesAssignment_2_1_1 )
            {
             before(grammarAccess.getKnowledgeListAccess().getValuesAssignment_2_1_1()); 
            // InternalKant.g:4646:2: ( rule__KnowledgeList__ValuesAssignment_2_1_1 )
            // InternalKant.g:4646:3: rule__KnowledgeList__ValuesAssignment_2_1_1
            {
            pushFollow(FOLLOW_2);
            rule__KnowledgeList__ValuesAssignment_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getKnowledgeListAccess().getValuesAssignment_2_1_1()); 

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
    // $ANTLR end "rule__KnowledgeList__Group_2_1__1__Impl"


    // $ANTLR start "rule__KnowledgeRef__Group__0"
    // InternalKant.g:4655:1: rule__KnowledgeRef__Group__0 : rule__KnowledgeRef__Group__0__Impl rule__KnowledgeRef__Group__1 ;
    public final void rule__KnowledgeRef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:4659:1: ( rule__KnowledgeRef__Group__0__Impl rule__KnowledgeRef__Group__1 )
            // InternalKant.g:4660:2: rule__KnowledgeRef__Group__0__Impl rule__KnowledgeRef__Group__1
            {
            pushFollow(FOLLOW_34);
            rule__KnowledgeRef__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__KnowledgeRef__Group__1();

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
    // $ANTLR end "rule__KnowledgeRef__Group__0"


    // $ANTLR start "rule__KnowledgeRef__Group__0__Impl"
    // InternalKant.g:4667:1: rule__KnowledgeRef__Group__0__Impl : ( ( rule__KnowledgeRef__RefAssignment_0 ) ) ;
    public final void rule__KnowledgeRef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:4671:1: ( ( ( rule__KnowledgeRef__RefAssignment_0 ) ) )
            // InternalKant.g:4672:1: ( ( rule__KnowledgeRef__RefAssignment_0 ) )
            {
            // InternalKant.g:4672:1: ( ( rule__KnowledgeRef__RefAssignment_0 ) )
            // InternalKant.g:4673:2: ( rule__KnowledgeRef__RefAssignment_0 )
            {
             before(grammarAccess.getKnowledgeRefAccess().getRefAssignment_0()); 
            // InternalKant.g:4674:2: ( rule__KnowledgeRef__RefAssignment_0 )
            // InternalKant.g:4674:3: rule__KnowledgeRef__RefAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__KnowledgeRef__RefAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getKnowledgeRefAccess().getRefAssignment_0()); 

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
    // $ANTLR end "rule__KnowledgeRef__Group__0__Impl"


    // $ANTLR start "rule__KnowledgeRef__Group__1"
    // InternalKant.g:4682:1: rule__KnowledgeRef__Group__1 : rule__KnowledgeRef__Group__1__Impl ;
    public final void rule__KnowledgeRef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:4686:1: ( rule__KnowledgeRef__Group__1__Impl )
            // InternalKant.g:4687:2: rule__KnowledgeRef__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__KnowledgeRef__Group__1__Impl();

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
    // $ANTLR end "rule__KnowledgeRef__Group__1"


    // $ANTLR start "rule__KnowledgeRef__Group__1__Impl"
    // InternalKant.g:4693:1: rule__KnowledgeRef__Group__1__Impl : ( ( rule__KnowledgeRef__Group_1__0 )* ) ;
    public final void rule__KnowledgeRef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:4697:1: ( ( ( rule__KnowledgeRef__Group_1__0 )* ) )
            // InternalKant.g:4698:1: ( ( rule__KnowledgeRef__Group_1__0 )* )
            {
            // InternalKant.g:4698:1: ( ( rule__KnowledgeRef__Group_1__0 )* )
            // InternalKant.g:4699:2: ( rule__KnowledgeRef__Group_1__0 )*
            {
             before(grammarAccess.getKnowledgeRefAccess().getGroup_1()); 
            // InternalKant.g:4700:2: ( rule__KnowledgeRef__Group_1__0 )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==33) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // InternalKant.g:4700:3: rule__KnowledgeRef__Group_1__0
            	    {
            	    pushFollow(FOLLOW_35);
            	    rule__KnowledgeRef__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop49;
                }
            } while (true);

             after(grammarAccess.getKnowledgeRefAccess().getGroup_1()); 

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
    // $ANTLR end "rule__KnowledgeRef__Group__1__Impl"


    // $ANTLR start "rule__KnowledgeRef__Group_1__0"
    // InternalKant.g:4709:1: rule__KnowledgeRef__Group_1__0 : rule__KnowledgeRef__Group_1__0__Impl rule__KnowledgeRef__Group_1__1 ;
    public final void rule__KnowledgeRef__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:4713:1: ( rule__KnowledgeRef__Group_1__0__Impl rule__KnowledgeRef__Group_1__1 )
            // InternalKant.g:4714:2: rule__KnowledgeRef__Group_1__0__Impl rule__KnowledgeRef__Group_1__1
            {
            pushFollow(FOLLOW_4);
            rule__KnowledgeRef__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__KnowledgeRef__Group_1__1();

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
    // $ANTLR end "rule__KnowledgeRef__Group_1__0"


    // $ANTLR start "rule__KnowledgeRef__Group_1__0__Impl"
    // InternalKant.g:4721:1: rule__KnowledgeRef__Group_1__0__Impl : ( '.' ) ;
    public final void rule__KnowledgeRef__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:4725:1: ( ( '.' ) )
            // InternalKant.g:4726:1: ( '.' )
            {
            // InternalKant.g:4726:1: ( '.' )
            // InternalKant.g:4727:2: '.'
            {
             before(grammarAccess.getKnowledgeRefAccess().getFullStopKeyword_1_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getKnowledgeRefAccess().getFullStopKeyword_1_0()); 

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
    // $ANTLR end "rule__KnowledgeRef__Group_1__0__Impl"


    // $ANTLR start "rule__KnowledgeRef__Group_1__1"
    // InternalKant.g:4736:1: rule__KnowledgeRef__Group_1__1 : rule__KnowledgeRef__Group_1__1__Impl ;
    public final void rule__KnowledgeRef__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:4740:1: ( rule__KnowledgeRef__Group_1__1__Impl )
            // InternalKant.g:4741:2: rule__KnowledgeRef__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__KnowledgeRef__Group_1__1__Impl();

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
    // $ANTLR end "rule__KnowledgeRef__Group_1__1"


    // $ANTLR start "rule__KnowledgeRef__Group_1__1__Impl"
    // InternalKant.g:4747:1: rule__KnowledgeRef__Group_1__1__Impl : ( ( rule__KnowledgeRef__AccessAssignment_1_1 ) ) ;
    public final void rule__KnowledgeRef__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:4751:1: ( ( ( rule__KnowledgeRef__AccessAssignment_1_1 ) ) )
            // InternalKant.g:4752:1: ( ( rule__KnowledgeRef__AccessAssignment_1_1 ) )
            {
            // InternalKant.g:4752:1: ( ( rule__KnowledgeRef__AccessAssignment_1_1 ) )
            // InternalKant.g:4753:2: ( rule__KnowledgeRef__AccessAssignment_1_1 )
            {
             before(grammarAccess.getKnowledgeRefAccess().getAccessAssignment_1_1()); 
            // InternalKant.g:4754:2: ( rule__KnowledgeRef__AccessAssignment_1_1 )
            // InternalKant.g:4754:3: rule__KnowledgeRef__AccessAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__KnowledgeRef__AccessAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getKnowledgeRefAccess().getAccessAssignment_1_1()); 

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
    // $ANTLR end "rule__KnowledgeRef__Group_1__1__Impl"


    // $ANTLR start "rule__KnowledgeSet__Group__0"
    // InternalKant.g:4763:1: rule__KnowledgeSet__Group__0 : rule__KnowledgeSet__Group__0__Impl rule__KnowledgeSet__Group__1 ;
    public final void rule__KnowledgeSet__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:4767:1: ( rule__KnowledgeSet__Group__0__Impl rule__KnowledgeSet__Group__1 )
            // InternalKant.g:4768:2: rule__KnowledgeSet__Group__0__Impl rule__KnowledgeSet__Group__1
            {
            pushFollow(FOLLOW_23);
            rule__KnowledgeSet__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__KnowledgeSet__Group__1();

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
    // $ANTLR end "rule__KnowledgeSet__Group__0"


    // $ANTLR start "rule__KnowledgeSet__Group__0__Impl"
    // InternalKant.g:4775:1: rule__KnowledgeSet__Group__0__Impl : ( () ) ;
    public final void rule__KnowledgeSet__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:4779:1: ( ( () ) )
            // InternalKant.g:4780:1: ( () )
            {
            // InternalKant.g:4780:1: ( () )
            // InternalKant.g:4781:2: ()
            {
             before(grammarAccess.getKnowledgeSetAccess().getKnowledgeSetAction_0()); 
            // InternalKant.g:4782:2: ()
            // InternalKant.g:4782:3: 
            {
            }

             after(grammarAccess.getKnowledgeSetAccess().getKnowledgeSetAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KnowledgeSet__Group__0__Impl"


    // $ANTLR start "rule__KnowledgeSet__Group__1"
    // InternalKant.g:4790:1: rule__KnowledgeSet__Group__1 : rule__KnowledgeSet__Group__1__Impl rule__KnowledgeSet__Group__2 ;
    public final void rule__KnowledgeSet__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:4794:1: ( rule__KnowledgeSet__Group__1__Impl rule__KnowledgeSet__Group__2 )
            // InternalKant.g:4795:2: rule__KnowledgeSet__Group__1__Impl rule__KnowledgeSet__Group__2
            {
            pushFollow(FOLLOW_36);
            rule__KnowledgeSet__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__KnowledgeSet__Group__2();

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
    // $ANTLR end "rule__KnowledgeSet__Group__1"


    // $ANTLR start "rule__KnowledgeSet__Group__1__Impl"
    // InternalKant.g:4802:1: rule__KnowledgeSet__Group__1__Impl : ( '{' ) ;
    public final void rule__KnowledgeSet__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:4806:1: ( ( '{' ) )
            // InternalKant.g:4807:1: ( '{' )
            {
            // InternalKant.g:4807:1: ( '{' )
            // InternalKant.g:4808:2: '{'
            {
             before(grammarAccess.getKnowledgeSetAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getKnowledgeSetAccess().getLeftCurlyBracketKeyword_1()); 

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
    // $ANTLR end "rule__KnowledgeSet__Group__1__Impl"


    // $ANTLR start "rule__KnowledgeSet__Group__2"
    // InternalKant.g:4817:1: rule__KnowledgeSet__Group__2 : rule__KnowledgeSet__Group__2__Impl rule__KnowledgeSet__Group__3 ;
    public final void rule__KnowledgeSet__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:4821:1: ( rule__KnowledgeSet__Group__2__Impl rule__KnowledgeSet__Group__3 )
            // InternalKant.g:4822:2: rule__KnowledgeSet__Group__2__Impl rule__KnowledgeSet__Group__3
            {
            pushFollow(FOLLOW_36);
            rule__KnowledgeSet__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__KnowledgeSet__Group__3();

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
    // $ANTLR end "rule__KnowledgeSet__Group__2"


    // $ANTLR start "rule__KnowledgeSet__Group__2__Impl"
    // InternalKant.g:4829:1: rule__KnowledgeSet__Group__2__Impl : ( ( rule__KnowledgeSet__Group_2__0 )? ) ;
    public final void rule__KnowledgeSet__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:4833:1: ( ( ( rule__KnowledgeSet__Group_2__0 )? ) )
            // InternalKant.g:4834:1: ( ( rule__KnowledgeSet__Group_2__0 )? )
            {
            // InternalKant.g:4834:1: ( ( rule__KnowledgeSet__Group_2__0 )? )
            // InternalKant.g:4835:2: ( rule__KnowledgeSet__Group_2__0 )?
            {
             before(grammarAccess.getKnowledgeSetAccess().getGroup_2()); 
            // InternalKant.g:4836:2: ( rule__KnowledgeSet__Group_2__0 )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==RULE_ID||(LA50_0>=9 && LA50_0<=10)||LA50_0==21||LA50_0==29||LA50_0==31||LA50_0==34) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalKant.g:4836:3: rule__KnowledgeSet__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__KnowledgeSet__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getKnowledgeSetAccess().getGroup_2()); 

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
    // $ANTLR end "rule__KnowledgeSet__Group__2__Impl"


    // $ANTLR start "rule__KnowledgeSet__Group__3"
    // InternalKant.g:4844:1: rule__KnowledgeSet__Group__3 : rule__KnowledgeSet__Group__3__Impl ;
    public final void rule__KnowledgeSet__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:4848:1: ( rule__KnowledgeSet__Group__3__Impl )
            // InternalKant.g:4849:2: rule__KnowledgeSet__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__KnowledgeSet__Group__3__Impl();

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
    // $ANTLR end "rule__KnowledgeSet__Group__3"


    // $ANTLR start "rule__KnowledgeSet__Group__3__Impl"
    // InternalKant.g:4855:1: rule__KnowledgeSet__Group__3__Impl : ( '}' ) ;
    public final void rule__KnowledgeSet__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:4859:1: ( ( '}' ) )
            // InternalKant.g:4860:1: ( '}' )
            {
            // InternalKant.g:4860:1: ( '}' )
            // InternalKant.g:4861:2: '}'
            {
             before(grammarAccess.getKnowledgeSetAccess().getRightCurlyBracketKeyword_3()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getKnowledgeSetAccess().getRightCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__KnowledgeSet__Group__3__Impl"


    // $ANTLR start "rule__KnowledgeSet__Group_2__0"
    // InternalKant.g:4871:1: rule__KnowledgeSet__Group_2__0 : rule__KnowledgeSet__Group_2__0__Impl rule__KnowledgeSet__Group_2__1 ;
    public final void rule__KnowledgeSet__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:4875:1: ( rule__KnowledgeSet__Group_2__0__Impl rule__KnowledgeSet__Group_2__1 )
            // InternalKant.g:4876:2: rule__KnowledgeSet__Group_2__0__Impl rule__KnowledgeSet__Group_2__1
            {
            pushFollow(FOLLOW_25);
            rule__KnowledgeSet__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__KnowledgeSet__Group_2__1();

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
    // $ANTLR end "rule__KnowledgeSet__Group_2__0"


    // $ANTLR start "rule__KnowledgeSet__Group_2__0__Impl"
    // InternalKant.g:4883:1: rule__KnowledgeSet__Group_2__0__Impl : ( ( rule__KnowledgeSet__ContentAssignment_2_0 ) ) ;
    public final void rule__KnowledgeSet__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:4887:1: ( ( ( rule__KnowledgeSet__ContentAssignment_2_0 ) ) )
            // InternalKant.g:4888:1: ( ( rule__KnowledgeSet__ContentAssignment_2_0 ) )
            {
            // InternalKant.g:4888:1: ( ( rule__KnowledgeSet__ContentAssignment_2_0 ) )
            // InternalKant.g:4889:2: ( rule__KnowledgeSet__ContentAssignment_2_0 )
            {
             before(grammarAccess.getKnowledgeSetAccess().getContentAssignment_2_0()); 
            // InternalKant.g:4890:2: ( rule__KnowledgeSet__ContentAssignment_2_0 )
            // InternalKant.g:4890:3: rule__KnowledgeSet__ContentAssignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__KnowledgeSet__ContentAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getKnowledgeSetAccess().getContentAssignment_2_0()); 

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
    // $ANTLR end "rule__KnowledgeSet__Group_2__0__Impl"


    // $ANTLR start "rule__KnowledgeSet__Group_2__1"
    // InternalKant.g:4898:1: rule__KnowledgeSet__Group_2__1 : rule__KnowledgeSet__Group_2__1__Impl ;
    public final void rule__KnowledgeSet__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:4902:1: ( rule__KnowledgeSet__Group_2__1__Impl )
            // InternalKant.g:4903:2: rule__KnowledgeSet__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__KnowledgeSet__Group_2__1__Impl();

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
    // $ANTLR end "rule__KnowledgeSet__Group_2__1"


    // $ANTLR start "rule__KnowledgeSet__Group_2__1__Impl"
    // InternalKant.g:4909:1: rule__KnowledgeSet__Group_2__1__Impl : ( ( rule__KnowledgeSet__Group_2_1__0 )* ) ;
    public final void rule__KnowledgeSet__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:4913:1: ( ( ( rule__KnowledgeSet__Group_2_1__0 )* ) )
            // InternalKant.g:4914:1: ( ( rule__KnowledgeSet__Group_2_1__0 )* )
            {
            // InternalKant.g:4914:1: ( ( rule__KnowledgeSet__Group_2_1__0 )* )
            // InternalKant.g:4915:2: ( rule__KnowledgeSet__Group_2_1__0 )*
            {
             before(grammarAccess.getKnowledgeSetAccess().getGroup_2_1()); 
            // InternalKant.g:4916:2: ( rule__KnowledgeSet__Group_2_1__0 )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==13) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // InternalKant.g:4916:3: rule__KnowledgeSet__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__KnowledgeSet__Group_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop51;
                }
            } while (true);

             after(grammarAccess.getKnowledgeSetAccess().getGroup_2_1()); 

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
    // $ANTLR end "rule__KnowledgeSet__Group_2__1__Impl"


    // $ANTLR start "rule__KnowledgeSet__Group_2_1__0"
    // InternalKant.g:4925:1: rule__KnowledgeSet__Group_2_1__0 : rule__KnowledgeSet__Group_2_1__0__Impl rule__KnowledgeSet__Group_2_1__1 ;
    public final void rule__KnowledgeSet__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:4929:1: ( rule__KnowledgeSet__Group_2_1__0__Impl rule__KnowledgeSet__Group_2_1__1 )
            // InternalKant.g:4930:2: rule__KnowledgeSet__Group_2_1__0__Impl rule__KnowledgeSet__Group_2_1__1
            {
            pushFollow(FOLLOW_37);
            rule__KnowledgeSet__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__KnowledgeSet__Group_2_1__1();

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
    // $ANTLR end "rule__KnowledgeSet__Group_2_1__0"


    // $ANTLR start "rule__KnowledgeSet__Group_2_1__0__Impl"
    // InternalKant.g:4937:1: rule__KnowledgeSet__Group_2_1__0__Impl : ( ',' ) ;
    public final void rule__KnowledgeSet__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:4941:1: ( ( ',' ) )
            // InternalKant.g:4942:1: ( ',' )
            {
            // InternalKant.g:4942:1: ( ',' )
            // InternalKant.g:4943:2: ','
            {
             before(grammarAccess.getKnowledgeSetAccess().getCommaKeyword_2_1_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getKnowledgeSetAccess().getCommaKeyword_2_1_0()); 

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
    // $ANTLR end "rule__KnowledgeSet__Group_2_1__0__Impl"


    // $ANTLR start "rule__KnowledgeSet__Group_2_1__1"
    // InternalKant.g:4952:1: rule__KnowledgeSet__Group_2_1__1 : rule__KnowledgeSet__Group_2_1__1__Impl ;
    public final void rule__KnowledgeSet__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:4956:1: ( rule__KnowledgeSet__Group_2_1__1__Impl )
            // InternalKant.g:4957:2: rule__KnowledgeSet__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__KnowledgeSet__Group_2_1__1__Impl();

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
    // $ANTLR end "rule__KnowledgeSet__Group_2_1__1"


    // $ANTLR start "rule__KnowledgeSet__Group_2_1__1__Impl"
    // InternalKant.g:4963:1: rule__KnowledgeSet__Group_2_1__1__Impl : ( ( rule__KnowledgeSet__ContentAssignment_2_1_1 ) ) ;
    public final void rule__KnowledgeSet__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:4967:1: ( ( ( rule__KnowledgeSet__ContentAssignment_2_1_1 ) ) )
            // InternalKant.g:4968:1: ( ( rule__KnowledgeSet__ContentAssignment_2_1_1 ) )
            {
            // InternalKant.g:4968:1: ( ( rule__KnowledgeSet__ContentAssignment_2_1_1 ) )
            // InternalKant.g:4969:2: ( rule__KnowledgeSet__ContentAssignment_2_1_1 )
            {
             before(grammarAccess.getKnowledgeSetAccess().getContentAssignment_2_1_1()); 
            // InternalKant.g:4970:2: ( rule__KnowledgeSet__ContentAssignment_2_1_1 )
            // InternalKant.g:4970:3: rule__KnowledgeSet__ContentAssignment_2_1_1
            {
            pushFollow(FOLLOW_2);
            rule__KnowledgeSet__ContentAssignment_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getKnowledgeSetAccess().getContentAssignment_2_1_1()); 

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
    // $ANTLR end "rule__KnowledgeSet__Group_2_1__1__Impl"


    // $ANTLR start "rule__KnowledgeSpreading__Group__0"
    // InternalKant.g:4979:1: rule__KnowledgeSpreading__Group__0 : rule__KnowledgeSpreading__Group__0__Impl rule__KnowledgeSpreading__Group__1 ;
    public final void rule__KnowledgeSpreading__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:4983:1: ( rule__KnowledgeSpreading__Group__0__Impl rule__KnowledgeSpreading__Group__1 )
            // InternalKant.g:4984:2: rule__KnowledgeSpreading__Group__0__Impl rule__KnowledgeSpreading__Group__1
            {
            pushFollow(FOLLOW_26);
            rule__KnowledgeSpreading__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__KnowledgeSpreading__Group__1();

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
    // $ANTLR end "rule__KnowledgeSpreading__Group__0"


    // $ANTLR start "rule__KnowledgeSpreading__Group__0__Impl"
    // InternalKant.g:4991:1: rule__KnowledgeSpreading__Group__0__Impl : ( '...' ) ;
    public final void rule__KnowledgeSpreading__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:4995:1: ( ( '...' ) )
            // InternalKant.g:4996:1: ( '...' )
            {
            // InternalKant.g:4996:1: ( '...' )
            // InternalKant.g:4997:2: '...'
            {
             before(grammarAccess.getKnowledgeSpreadingAccess().getFullStopFullStopFullStopKeyword_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getKnowledgeSpreadingAccess().getFullStopFullStopFullStopKeyword_0()); 

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
    // $ANTLR end "rule__KnowledgeSpreading__Group__0__Impl"


    // $ANTLR start "rule__KnowledgeSpreading__Group__1"
    // InternalKant.g:5006:1: rule__KnowledgeSpreading__Group__1 : rule__KnowledgeSpreading__Group__1__Impl ;
    public final void rule__KnowledgeSpreading__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:5010:1: ( rule__KnowledgeSpreading__Group__1__Impl )
            // InternalKant.g:5011:2: rule__KnowledgeSpreading__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__KnowledgeSpreading__Group__1__Impl();

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
    // $ANTLR end "rule__KnowledgeSpreading__Group__1"


    // $ANTLR start "rule__KnowledgeSpreading__Group__1__Impl"
    // InternalKant.g:5017:1: rule__KnowledgeSpreading__Group__1__Impl : ( ( rule__KnowledgeSpreading__RefAssignment_1 ) ) ;
    public final void rule__KnowledgeSpreading__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:5021:1: ( ( ( rule__KnowledgeSpreading__RefAssignment_1 ) ) )
            // InternalKant.g:5022:1: ( ( rule__KnowledgeSpreading__RefAssignment_1 ) )
            {
            // InternalKant.g:5022:1: ( ( rule__KnowledgeSpreading__RefAssignment_1 ) )
            // InternalKant.g:5023:2: ( rule__KnowledgeSpreading__RefAssignment_1 )
            {
             before(grammarAccess.getKnowledgeSpreadingAccess().getRefAssignment_1()); 
            // InternalKant.g:5024:2: ( rule__KnowledgeSpreading__RefAssignment_1 )
            // InternalKant.g:5024:3: rule__KnowledgeSpreading__RefAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__KnowledgeSpreading__RefAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getKnowledgeSpreadingAccess().getRefAssignment_1()); 

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
    // $ANTLR end "rule__KnowledgeSpreading__Group__1__Impl"


    // $ANTLR start "rule__KnowledgeGenerator__Group__0"
    // InternalKant.g:5033:1: rule__KnowledgeGenerator__Group__0 : rule__KnowledgeGenerator__Group__0__Impl rule__KnowledgeGenerator__Group__1 ;
    public final void rule__KnowledgeGenerator__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:5037:1: ( rule__KnowledgeGenerator__Group__0__Impl rule__KnowledgeGenerator__Group__1 )
            // InternalKant.g:5038:2: rule__KnowledgeGenerator__Group__0__Impl rule__KnowledgeGenerator__Group__1
            {
            pushFollow(FOLLOW_38);
            rule__KnowledgeGenerator__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__KnowledgeGenerator__Group__1();

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
    // $ANTLR end "rule__KnowledgeGenerator__Group__0"


    // $ANTLR start "rule__KnowledgeGenerator__Group__0__Impl"
    // InternalKant.g:5045:1: rule__KnowledgeGenerator__Group__0__Impl : ( 'gen' ) ;
    public final void rule__KnowledgeGenerator__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:5049:1: ( ( 'gen' ) )
            // InternalKant.g:5050:1: ( 'gen' )
            {
            // InternalKant.g:5050:1: ( 'gen' )
            // InternalKant.g:5051:2: 'gen'
            {
             before(grammarAccess.getKnowledgeGeneratorAccess().getGenKeyword_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getKnowledgeGeneratorAccess().getGenKeyword_0()); 

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
    // $ANTLR end "rule__KnowledgeGenerator__Group__0__Impl"


    // $ANTLR start "rule__KnowledgeGenerator__Group__1"
    // InternalKant.g:5060:1: rule__KnowledgeGenerator__Group__1 : rule__KnowledgeGenerator__Group__1__Impl ;
    public final void rule__KnowledgeGenerator__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:5064:1: ( rule__KnowledgeGenerator__Group__1__Impl )
            // InternalKant.g:5065:2: rule__KnowledgeGenerator__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__KnowledgeGenerator__Group__1__Impl();

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
    // $ANTLR end "rule__KnowledgeGenerator__Group__1"


    // $ANTLR start "rule__KnowledgeGenerator__Group__1__Impl"
    // InternalKant.g:5071:1: rule__KnowledgeGenerator__Group__1__Impl : ( ( rule__KnowledgeGenerator__TypeAssignment_1 ) ) ;
    public final void rule__KnowledgeGenerator__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:5075:1: ( ( ( rule__KnowledgeGenerator__TypeAssignment_1 ) ) )
            // InternalKant.g:5076:1: ( ( rule__KnowledgeGenerator__TypeAssignment_1 ) )
            {
            // InternalKant.g:5076:1: ( ( rule__KnowledgeGenerator__TypeAssignment_1 ) )
            // InternalKant.g:5077:2: ( rule__KnowledgeGenerator__TypeAssignment_1 )
            {
             before(grammarAccess.getKnowledgeGeneratorAccess().getTypeAssignment_1()); 
            // InternalKant.g:5078:2: ( rule__KnowledgeGenerator__TypeAssignment_1 )
            // InternalKant.g:5078:3: rule__KnowledgeGenerator__TypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__KnowledgeGenerator__TypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getKnowledgeGeneratorAccess().getTypeAssignment_1()); 

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
    // $ANTLR end "rule__KnowledgeGenerator__Group__1__Impl"


    // $ANTLR start "rule__KnowledgeFromFunction__Group__0"
    // InternalKant.g:5087:1: rule__KnowledgeFromFunction__Group__0 : rule__KnowledgeFromFunction__Group__0__Impl rule__KnowledgeFromFunction__Group__1 ;
    public final void rule__KnowledgeFromFunction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:5091:1: ( rule__KnowledgeFromFunction__Group__0__Impl rule__KnowledgeFromFunction__Group__1 )
            // InternalKant.g:5092:2: rule__KnowledgeFromFunction__Group__0__Impl rule__KnowledgeFromFunction__Group__1
            {
            pushFollow(FOLLOW_39);
            rule__KnowledgeFromFunction__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__KnowledgeFromFunction__Group__1();

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
    // $ANTLR end "rule__KnowledgeFromFunction__Group__0"


    // $ANTLR start "rule__KnowledgeFromFunction__Group__0__Impl"
    // InternalKant.g:5099:1: rule__KnowledgeFromFunction__Group__0__Impl : ( ( rule__KnowledgeFromFunction__NameAssignment_0 ) ) ;
    public final void rule__KnowledgeFromFunction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:5103:1: ( ( ( rule__KnowledgeFromFunction__NameAssignment_0 ) ) )
            // InternalKant.g:5104:1: ( ( rule__KnowledgeFromFunction__NameAssignment_0 ) )
            {
            // InternalKant.g:5104:1: ( ( rule__KnowledgeFromFunction__NameAssignment_0 ) )
            // InternalKant.g:5105:2: ( rule__KnowledgeFromFunction__NameAssignment_0 )
            {
             before(grammarAccess.getKnowledgeFromFunctionAccess().getNameAssignment_0()); 
            // InternalKant.g:5106:2: ( rule__KnowledgeFromFunction__NameAssignment_0 )
            // InternalKant.g:5106:3: rule__KnowledgeFromFunction__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__KnowledgeFromFunction__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getKnowledgeFromFunctionAccess().getNameAssignment_0()); 

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
    // $ANTLR end "rule__KnowledgeFromFunction__Group__0__Impl"


    // $ANTLR start "rule__KnowledgeFromFunction__Group__1"
    // InternalKant.g:5114:1: rule__KnowledgeFromFunction__Group__1 : rule__KnowledgeFromFunction__Group__1__Impl rule__KnowledgeFromFunction__Group__2 ;
    public final void rule__KnowledgeFromFunction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:5118:1: ( rule__KnowledgeFromFunction__Group__1__Impl rule__KnowledgeFromFunction__Group__2 )
            // InternalKant.g:5119:2: rule__KnowledgeFromFunction__Group__1__Impl rule__KnowledgeFromFunction__Group__2
            {
            pushFollow(FOLLOW_40);
            rule__KnowledgeFromFunction__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__KnowledgeFromFunction__Group__2();

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
    // $ANTLR end "rule__KnowledgeFromFunction__Group__1"


    // $ANTLR start "rule__KnowledgeFromFunction__Group__1__Impl"
    // InternalKant.g:5126:1: rule__KnowledgeFromFunction__Group__1__Impl : ( '(' ) ;
    public final void rule__KnowledgeFromFunction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:5130:1: ( ( '(' ) )
            // InternalKant.g:5131:1: ( '(' )
            {
            // InternalKant.g:5131:1: ( '(' )
            // InternalKant.g:5132:2: '('
            {
             before(grammarAccess.getKnowledgeFromFunctionAccess().getLeftParenthesisKeyword_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getKnowledgeFromFunctionAccess().getLeftParenthesisKeyword_1()); 

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
    // $ANTLR end "rule__KnowledgeFromFunction__Group__1__Impl"


    // $ANTLR start "rule__KnowledgeFromFunction__Group__2"
    // InternalKant.g:5141:1: rule__KnowledgeFromFunction__Group__2 : rule__KnowledgeFromFunction__Group__2__Impl rule__KnowledgeFromFunction__Group__3 ;
    public final void rule__KnowledgeFromFunction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:5145:1: ( rule__KnowledgeFromFunction__Group__2__Impl rule__KnowledgeFromFunction__Group__3 )
            // InternalKant.g:5146:2: rule__KnowledgeFromFunction__Group__2__Impl rule__KnowledgeFromFunction__Group__3
            {
            pushFollow(FOLLOW_40);
            rule__KnowledgeFromFunction__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__KnowledgeFromFunction__Group__3();

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
    // $ANTLR end "rule__KnowledgeFromFunction__Group__2"


    // $ANTLR start "rule__KnowledgeFromFunction__Group__2__Impl"
    // InternalKant.g:5153:1: rule__KnowledgeFromFunction__Group__2__Impl : ( ( rule__KnowledgeFromFunction__ArgsAssignment_2 )? ) ;
    public final void rule__KnowledgeFromFunction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:5157:1: ( ( ( rule__KnowledgeFromFunction__ArgsAssignment_2 )? ) )
            // InternalKant.g:5158:1: ( ( rule__KnowledgeFromFunction__ArgsAssignment_2 )? )
            {
            // InternalKant.g:5158:1: ( ( rule__KnowledgeFromFunction__ArgsAssignment_2 )? )
            // InternalKant.g:5159:2: ( rule__KnowledgeFromFunction__ArgsAssignment_2 )?
            {
             before(grammarAccess.getKnowledgeFromFunctionAccess().getArgsAssignment_2()); 
            // InternalKant.g:5160:2: ( rule__KnowledgeFromFunction__ArgsAssignment_2 )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==RULE_ID||LA52_0==21||LA52_0==29||LA52_0==31||LA52_0==34) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalKant.g:5160:3: rule__KnowledgeFromFunction__ArgsAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__KnowledgeFromFunction__ArgsAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getKnowledgeFromFunctionAccess().getArgsAssignment_2()); 

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
    // $ANTLR end "rule__KnowledgeFromFunction__Group__2__Impl"


    // $ANTLR start "rule__KnowledgeFromFunction__Group__3"
    // InternalKant.g:5168:1: rule__KnowledgeFromFunction__Group__3 : rule__KnowledgeFromFunction__Group__3__Impl rule__KnowledgeFromFunction__Group__4 ;
    public final void rule__KnowledgeFromFunction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:5172:1: ( rule__KnowledgeFromFunction__Group__3__Impl rule__KnowledgeFromFunction__Group__4 )
            // InternalKant.g:5173:2: rule__KnowledgeFromFunction__Group__3__Impl rule__KnowledgeFromFunction__Group__4
            {
            pushFollow(FOLLOW_41);
            rule__KnowledgeFromFunction__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__KnowledgeFromFunction__Group__4();

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
    // $ANTLR end "rule__KnowledgeFromFunction__Group__3"


    // $ANTLR start "rule__KnowledgeFromFunction__Group__3__Impl"
    // InternalKant.g:5180:1: rule__KnowledgeFromFunction__Group__3__Impl : ( ')' ) ;
    public final void rule__KnowledgeFromFunction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:5184:1: ( ( ')' ) )
            // InternalKant.g:5185:1: ( ')' )
            {
            // InternalKant.g:5185:1: ( ')' )
            // InternalKant.g:5186:2: ')'
            {
             before(grammarAccess.getKnowledgeFromFunctionAccess().getRightParenthesisKeyword_3()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getKnowledgeFromFunctionAccess().getRightParenthesisKeyword_3()); 

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
    // $ANTLR end "rule__KnowledgeFromFunction__Group__3__Impl"


    // $ANTLR start "rule__KnowledgeFromFunction__Group__4"
    // InternalKant.g:5195:1: rule__KnowledgeFromFunction__Group__4 : rule__KnowledgeFromFunction__Group__4__Impl ;
    public final void rule__KnowledgeFromFunction__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:5199:1: ( rule__KnowledgeFromFunction__Group__4__Impl )
            // InternalKant.g:5200:2: rule__KnowledgeFromFunction__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__KnowledgeFromFunction__Group__4__Impl();

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
    // $ANTLR end "rule__KnowledgeFromFunction__Group__4"


    // $ANTLR start "rule__KnowledgeFromFunction__Group__4__Impl"
    // InternalKant.g:5206:1: rule__KnowledgeFromFunction__Group__4__Impl : ( ( rule__KnowledgeFromFunction__Group_4__0 )? ) ;
    public final void rule__KnowledgeFromFunction__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:5210:1: ( ( ( rule__KnowledgeFromFunction__Group_4__0 )? ) )
            // InternalKant.g:5211:1: ( ( rule__KnowledgeFromFunction__Group_4__0 )? )
            {
            // InternalKant.g:5211:1: ( ( rule__KnowledgeFromFunction__Group_4__0 )? )
            // InternalKant.g:5212:2: ( rule__KnowledgeFromFunction__Group_4__0 )?
            {
             before(grammarAccess.getKnowledgeFromFunctionAccess().getGroup_4()); 
            // InternalKant.g:5213:2: ( rule__KnowledgeFromFunction__Group_4__0 )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==17) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalKant.g:5213:3: rule__KnowledgeFromFunction__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__KnowledgeFromFunction__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getKnowledgeFromFunctionAccess().getGroup_4()); 

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
    // $ANTLR end "rule__KnowledgeFromFunction__Group__4__Impl"


    // $ANTLR start "rule__KnowledgeFromFunction__Group_4__0"
    // InternalKant.g:5222:1: rule__KnowledgeFromFunction__Group_4__0 : rule__KnowledgeFromFunction__Group_4__0__Impl rule__KnowledgeFromFunction__Group_4__1 ;
    public final void rule__KnowledgeFromFunction__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:5226:1: ( rule__KnowledgeFromFunction__Group_4__0__Impl rule__KnowledgeFromFunction__Group_4__1 )
            // InternalKant.g:5227:2: rule__KnowledgeFromFunction__Group_4__0__Impl rule__KnowledgeFromFunction__Group_4__1
            {
            pushFollow(FOLLOW_14);
            rule__KnowledgeFromFunction__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__KnowledgeFromFunction__Group_4__1();

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
    // $ANTLR end "rule__KnowledgeFromFunction__Group_4__0"


    // $ANTLR start "rule__KnowledgeFromFunction__Group_4__0__Impl"
    // InternalKant.g:5234:1: rule__KnowledgeFromFunction__Group_4__0__Impl : ( 'with' ) ;
    public final void rule__KnowledgeFromFunction__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:5238:1: ( ( 'with' ) )
            // InternalKant.g:5239:1: ( 'with' )
            {
            // InternalKant.g:5239:1: ( 'with' )
            // InternalKant.g:5240:2: 'with'
            {
             before(grammarAccess.getKnowledgeFromFunctionAccess().getWithKeyword_4_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getKnowledgeFromFunctionAccess().getWithKeyword_4_0()); 

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
    // $ANTLR end "rule__KnowledgeFromFunction__Group_4__0__Impl"


    // $ANTLR start "rule__KnowledgeFromFunction__Group_4__1"
    // InternalKant.g:5249:1: rule__KnowledgeFromFunction__Group_4__1 : rule__KnowledgeFromFunction__Group_4__1__Impl ;
    public final void rule__KnowledgeFromFunction__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:5253:1: ( rule__KnowledgeFromFunction__Group_4__1__Impl )
            // InternalKant.g:5254:2: rule__KnowledgeFromFunction__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__KnowledgeFromFunction__Group_4__1__Impl();

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
    // $ANTLR end "rule__KnowledgeFromFunction__Group_4__1"


    // $ANTLR start "rule__KnowledgeFromFunction__Group_4__1__Impl"
    // InternalKant.g:5260:1: rule__KnowledgeFromFunction__Group_4__1__Impl : ( ( rule__KnowledgeFromFunction__KeyAssignment_4_1 ) ) ;
    public final void rule__KnowledgeFromFunction__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:5264:1: ( ( ( rule__KnowledgeFromFunction__KeyAssignment_4_1 ) ) )
            // InternalKant.g:5265:1: ( ( rule__KnowledgeFromFunction__KeyAssignment_4_1 ) )
            {
            // InternalKant.g:5265:1: ( ( rule__KnowledgeFromFunction__KeyAssignment_4_1 ) )
            // InternalKant.g:5266:2: ( rule__KnowledgeFromFunction__KeyAssignment_4_1 )
            {
             before(grammarAccess.getKnowledgeFromFunctionAccess().getKeyAssignment_4_1()); 
            // InternalKant.g:5267:2: ( rule__KnowledgeFromFunction__KeyAssignment_4_1 )
            // InternalKant.g:5267:3: rule__KnowledgeFromFunction__KeyAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__KnowledgeFromFunction__KeyAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getKnowledgeFromFunctionAccess().getKeyAssignment_4_1()); 

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
    // $ANTLR end "rule__KnowledgeFromFunction__Group_4__1__Impl"


    // $ANTLR start "rule__KnowledgeFromFunctionArg__Group_0__0"
    // InternalKant.g:5276:1: rule__KnowledgeFromFunctionArg__Group_0__0 : rule__KnowledgeFromFunctionArg__Group_0__0__Impl rule__KnowledgeFromFunctionArg__Group_0__1 ;
    public final void rule__KnowledgeFromFunctionArg__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:5280:1: ( rule__KnowledgeFromFunctionArg__Group_0__0__Impl rule__KnowledgeFromFunctionArg__Group_0__1 )
            // InternalKant.g:5281:2: rule__KnowledgeFromFunctionArg__Group_0__0__Impl rule__KnowledgeFromFunctionArg__Group_0__1
            {
            pushFollow(FOLLOW_25);
            rule__KnowledgeFromFunctionArg__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__KnowledgeFromFunctionArg__Group_0__1();

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
    // $ANTLR end "rule__KnowledgeFromFunctionArg__Group_0__0"


    // $ANTLR start "rule__KnowledgeFromFunctionArg__Group_0__0__Impl"
    // InternalKant.g:5288:1: rule__KnowledgeFromFunctionArg__Group_0__0__Impl : ( ( rule__KnowledgeFromFunctionArg__ArgsAssignment_0_0 ) ) ;
    public final void rule__KnowledgeFromFunctionArg__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:5292:1: ( ( ( rule__KnowledgeFromFunctionArg__ArgsAssignment_0_0 ) ) )
            // InternalKant.g:5293:1: ( ( rule__KnowledgeFromFunctionArg__ArgsAssignment_0_0 ) )
            {
            // InternalKant.g:5293:1: ( ( rule__KnowledgeFromFunctionArg__ArgsAssignment_0_0 ) )
            // InternalKant.g:5294:2: ( rule__KnowledgeFromFunctionArg__ArgsAssignment_0_0 )
            {
             before(grammarAccess.getKnowledgeFromFunctionArgAccess().getArgsAssignment_0_0()); 
            // InternalKant.g:5295:2: ( rule__KnowledgeFromFunctionArg__ArgsAssignment_0_0 )
            // InternalKant.g:5295:3: rule__KnowledgeFromFunctionArg__ArgsAssignment_0_0
            {
            pushFollow(FOLLOW_2);
            rule__KnowledgeFromFunctionArg__ArgsAssignment_0_0();

            state._fsp--;


            }

             after(grammarAccess.getKnowledgeFromFunctionArgAccess().getArgsAssignment_0_0()); 

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
    // $ANTLR end "rule__KnowledgeFromFunctionArg__Group_0__0__Impl"


    // $ANTLR start "rule__KnowledgeFromFunctionArg__Group_0__1"
    // InternalKant.g:5303:1: rule__KnowledgeFromFunctionArg__Group_0__1 : rule__KnowledgeFromFunctionArg__Group_0__1__Impl ;
    public final void rule__KnowledgeFromFunctionArg__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:5307:1: ( rule__KnowledgeFromFunctionArg__Group_0__1__Impl )
            // InternalKant.g:5308:2: rule__KnowledgeFromFunctionArg__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__KnowledgeFromFunctionArg__Group_0__1__Impl();

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
    // $ANTLR end "rule__KnowledgeFromFunctionArg__Group_0__1"


    // $ANTLR start "rule__KnowledgeFromFunctionArg__Group_0__1__Impl"
    // InternalKant.g:5314:1: rule__KnowledgeFromFunctionArg__Group_0__1__Impl : ( ( rule__KnowledgeFromFunctionArg__Group_0_1__0 )* ) ;
    public final void rule__KnowledgeFromFunctionArg__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:5318:1: ( ( ( rule__KnowledgeFromFunctionArg__Group_0_1__0 )* ) )
            // InternalKant.g:5319:1: ( ( rule__KnowledgeFromFunctionArg__Group_0_1__0 )* )
            {
            // InternalKant.g:5319:1: ( ( rule__KnowledgeFromFunctionArg__Group_0_1__0 )* )
            // InternalKant.g:5320:2: ( rule__KnowledgeFromFunctionArg__Group_0_1__0 )*
            {
             before(grammarAccess.getKnowledgeFromFunctionArgAccess().getGroup_0_1()); 
            // InternalKant.g:5321:2: ( rule__KnowledgeFromFunctionArg__Group_0_1__0 )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( (LA54_0==13) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // InternalKant.g:5321:3: rule__KnowledgeFromFunctionArg__Group_0_1__0
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__KnowledgeFromFunctionArg__Group_0_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop54;
                }
            } while (true);

             after(grammarAccess.getKnowledgeFromFunctionArgAccess().getGroup_0_1()); 

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
    // $ANTLR end "rule__KnowledgeFromFunctionArg__Group_0__1__Impl"


    // $ANTLR start "rule__KnowledgeFromFunctionArg__Group_0_1__0"
    // InternalKant.g:5330:1: rule__KnowledgeFromFunctionArg__Group_0_1__0 : rule__KnowledgeFromFunctionArg__Group_0_1__0__Impl rule__KnowledgeFromFunctionArg__Group_0_1__1 ;
    public final void rule__KnowledgeFromFunctionArg__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:5334:1: ( rule__KnowledgeFromFunctionArg__Group_0_1__0__Impl rule__KnowledgeFromFunctionArg__Group_0_1__1 )
            // InternalKant.g:5335:2: rule__KnowledgeFromFunctionArg__Group_0_1__0__Impl rule__KnowledgeFromFunctionArg__Group_0_1__1
            {
            pushFollow(FOLLOW_14);
            rule__KnowledgeFromFunctionArg__Group_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__KnowledgeFromFunctionArg__Group_0_1__1();

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
    // $ANTLR end "rule__KnowledgeFromFunctionArg__Group_0_1__0"


    // $ANTLR start "rule__KnowledgeFromFunctionArg__Group_0_1__0__Impl"
    // InternalKant.g:5342:1: rule__KnowledgeFromFunctionArg__Group_0_1__0__Impl : ( ',' ) ;
    public final void rule__KnowledgeFromFunctionArg__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:5346:1: ( ( ',' ) )
            // InternalKant.g:5347:1: ( ',' )
            {
            // InternalKant.g:5347:1: ( ',' )
            // InternalKant.g:5348:2: ','
            {
             before(grammarAccess.getKnowledgeFromFunctionArgAccess().getCommaKeyword_0_1_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getKnowledgeFromFunctionArgAccess().getCommaKeyword_0_1_0()); 

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
    // $ANTLR end "rule__KnowledgeFromFunctionArg__Group_0_1__0__Impl"


    // $ANTLR start "rule__KnowledgeFromFunctionArg__Group_0_1__1"
    // InternalKant.g:5357:1: rule__KnowledgeFromFunctionArg__Group_0_1__1 : rule__KnowledgeFromFunctionArg__Group_0_1__1__Impl ;
    public final void rule__KnowledgeFromFunctionArg__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:5361:1: ( rule__KnowledgeFromFunctionArg__Group_0_1__1__Impl )
            // InternalKant.g:5362:2: rule__KnowledgeFromFunctionArg__Group_0_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__KnowledgeFromFunctionArg__Group_0_1__1__Impl();

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
    // $ANTLR end "rule__KnowledgeFromFunctionArg__Group_0_1__1"


    // $ANTLR start "rule__KnowledgeFromFunctionArg__Group_0_1__1__Impl"
    // InternalKant.g:5368:1: rule__KnowledgeFromFunctionArg__Group_0_1__1__Impl : ( ( rule__KnowledgeFromFunctionArg__ArgsAssignment_0_1_1 ) ) ;
    public final void rule__KnowledgeFromFunctionArg__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:5372:1: ( ( ( rule__KnowledgeFromFunctionArg__ArgsAssignment_0_1_1 ) ) )
            // InternalKant.g:5373:1: ( ( rule__KnowledgeFromFunctionArg__ArgsAssignment_0_1_1 ) )
            {
            // InternalKant.g:5373:1: ( ( rule__KnowledgeFromFunctionArg__ArgsAssignment_0_1_1 ) )
            // InternalKant.g:5374:2: ( rule__KnowledgeFromFunctionArg__ArgsAssignment_0_1_1 )
            {
             before(grammarAccess.getKnowledgeFromFunctionArgAccess().getArgsAssignment_0_1_1()); 
            // InternalKant.g:5375:2: ( rule__KnowledgeFromFunctionArg__ArgsAssignment_0_1_1 )
            // InternalKant.g:5375:3: rule__KnowledgeFromFunctionArg__ArgsAssignment_0_1_1
            {
            pushFollow(FOLLOW_2);
            rule__KnowledgeFromFunctionArg__ArgsAssignment_0_1_1();

            state._fsp--;


            }

             after(grammarAccess.getKnowledgeFromFunctionArgAccess().getArgsAssignment_0_1_1()); 

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
    // $ANTLR end "rule__KnowledgeFromFunctionArg__Group_0_1__1__Impl"


    // $ANTLR start "rule__Communication__Group__0"
    // InternalKant.g:5384:1: rule__Communication__Group__0 : rule__Communication__Group__0__Impl rule__Communication__Group__1 ;
    public final void rule__Communication__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:5388:1: ( rule__Communication__Group__0__Impl rule__Communication__Group__1 )
            // InternalKant.g:5389:2: rule__Communication__Group__0__Impl rule__Communication__Group__1
            {
            pushFollow(FOLLOW_42);
            rule__Communication__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Communication__Group__1();

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
    // $ANTLR end "rule__Communication__Group__0"


    // $ANTLR start "rule__Communication__Group__0__Impl"
    // InternalKant.g:5396:1: rule__Communication__Group__0__Impl : ( ( rule__Communication__FromAssignment_0 ) ) ;
    public final void rule__Communication__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:5400:1: ( ( ( rule__Communication__FromAssignment_0 ) ) )
            // InternalKant.g:5401:1: ( ( rule__Communication__FromAssignment_0 ) )
            {
            // InternalKant.g:5401:1: ( ( rule__Communication__FromAssignment_0 ) )
            // InternalKant.g:5402:2: ( rule__Communication__FromAssignment_0 )
            {
             before(grammarAccess.getCommunicationAccess().getFromAssignment_0()); 
            // InternalKant.g:5403:2: ( rule__Communication__FromAssignment_0 )
            // InternalKant.g:5403:3: rule__Communication__FromAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Communication__FromAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getCommunicationAccess().getFromAssignment_0()); 

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
    // $ANTLR end "rule__Communication__Group__0__Impl"


    // $ANTLR start "rule__Communication__Group__1"
    // InternalKant.g:5411:1: rule__Communication__Group__1 : rule__Communication__Group__1__Impl rule__Communication__Group__2 ;
    public final void rule__Communication__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:5415:1: ( rule__Communication__Group__1__Impl rule__Communication__Group__2 )
            // InternalKant.g:5416:2: rule__Communication__Group__1__Impl rule__Communication__Group__2
            {
            pushFollow(FOLLOW_42);
            rule__Communication__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Communication__Group__2();

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
    // $ANTLR end "rule__Communication__Group__1"


    // $ANTLR start "rule__Communication__Group__1__Impl"
    // InternalKant.g:5423:1: rule__Communication__Group__1__Impl : ( ( rule__Communication__Group_1__0 )* ) ;
    public final void rule__Communication__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:5427:1: ( ( ( rule__Communication__Group_1__0 )* ) )
            // InternalKant.g:5428:1: ( ( rule__Communication__Group_1__0 )* )
            {
            // InternalKant.g:5428:1: ( ( rule__Communication__Group_1__0 )* )
            // InternalKant.g:5429:2: ( rule__Communication__Group_1__0 )*
            {
             before(grammarAccess.getCommunicationAccess().getGroup_1()); 
            // InternalKant.g:5430:2: ( rule__Communication__Group_1__0 )*
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( (LA55_0==13) ) {
                    alt55=1;
                }


                switch (alt55) {
            	case 1 :
            	    // InternalKant.g:5430:3: rule__Communication__Group_1__0
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Communication__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop55;
                }
            } while (true);

             after(grammarAccess.getCommunicationAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Communication__Group__1__Impl"


    // $ANTLR start "rule__Communication__Group__2"
    // InternalKant.g:5438:1: rule__Communication__Group__2 : rule__Communication__Group__2__Impl rule__Communication__Group__3 ;
    public final void rule__Communication__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:5442:1: ( rule__Communication__Group__2__Impl rule__Communication__Group__3 )
            // InternalKant.g:5443:2: rule__Communication__Group__2__Impl rule__Communication__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__Communication__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Communication__Group__3();

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
    // $ANTLR end "rule__Communication__Group__2"


    // $ANTLR start "rule__Communication__Group__2__Impl"
    // InternalKant.g:5450:1: rule__Communication__Group__2__Impl : ( '->' ) ;
    public final void rule__Communication__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:5454:1: ( ( '->' ) )
            // InternalKant.g:5455:1: ( '->' )
            {
            // InternalKant.g:5455:1: ( '->' )
            // InternalKant.g:5456:2: '->'
            {
             before(grammarAccess.getCommunicationAccess().getHyphenMinusGreaterThanSignKeyword_2()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getCommunicationAccess().getHyphenMinusGreaterThanSignKeyword_2()); 

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
    // $ANTLR end "rule__Communication__Group__2__Impl"


    // $ANTLR start "rule__Communication__Group__3"
    // InternalKant.g:5465:1: rule__Communication__Group__3 : rule__Communication__Group__3__Impl rule__Communication__Group__4 ;
    public final void rule__Communication__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:5469:1: ( rule__Communication__Group__3__Impl rule__Communication__Group__4 )
            // InternalKant.g:5470:2: rule__Communication__Group__3__Impl rule__Communication__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__Communication__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Communication__Group__4();

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
    // $ANTLR end "rule__Communication__Group__3"


    // $ANTLR start "rule__Communication__Group__3__Impl"
    // InternalKant.g:5477:1: rule__Communication__Group__3__Impl : ( ( rule__Communication__ToAssignment_3 ) ) ;
    public final void rule__Communication__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:5481:1: ( ( ( rule__Communication__ToAssignment_3 ) ) )
            // InternalKant.g:5482:1: ( ( rule__Communication__ToAssignment_3 ) )
            {
            // InternalKant.g:5482:1: ( ( rule__Communication__ToAssignment_3 ) )
            // InternalKant.g:5483:2: ( rule__Communication__ToAssignment_3 )
            {
             before(grammarAccess.getCommunicationAccess().getToAssignment_3()); 
            // InternalKant.g:5484:2: ( rule__Communication__ToAssignment_3 )
            // InternalKant.g:5484:3: rule__Communication__ToAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Communication__ToAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getCommunicationAccess().getToAssignment_3()); 

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
    // $ANTLR end "rule__Communication__Group__3__Impl"


    // $ANTLR start "rule__Communication__Group__4"
    // InternalKant.g:5492:1: rule__Communication__Group__4 : rule__Communication__Group__4__Impl rule__Communication__Group__5 ;
    public final void rule__Communication__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:5496:1: ( rule__Communication__Group__4__Impl rule__Communication__Group__5 )
            // InternalKant.g:5497:2: rule__Communication__Group__4__Impl rule__Communication__Group__5
            {
            pushFollow(FOLLOW_5);
            rule__Communication__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Communication__Group__5();

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
    // $ANTLR end "rule__Communication__Group__4"


    // $ANTLR start "rule__Communication__Group__4__Impl"
    // InternalKant.g:5504:1: rule__Communication__Group__4__Impl : ( ( rule__Communication__Group_4__0 )* ) ;
    public final void rule__Communication__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:5508:1: ( ( ( rule__Communication__Group_4__0 )* ) )
            // InternalKant.g:5509:1: ( ( rule__Communication__Group_4__0 )* )
            {
            // InternalKant.g:5509:1: ( ( rule__Communication__Group_4__0 )* )
            // InternalKant.g:5510:2: ( rule__Communication__Group_4__0 )*
            {
             before(grammarAccess.getCommunicationAccess().getGroup_4()); 
            // InternalKant.g:5511:2: ( rule__Communication__Group_4__0 )*
            loop56:
            do {
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( (LA56_0==13) ) {
                    alt56=1;
                }


                switch (alt56) {
            	case 1 :
            	    // InternalKant.g:5511:3: rule__Communication__Group_4__0
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Communication__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop56;
                }
            } while (true);

             after(grammarAccess.getCommunicationAccess().getGroup_4()); 

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
    // $ANTLR end "rule__Communication__Group__4__Impl"


    // $ANTLR start "rule__Communication__Group__5"
    // InternalKant.g:5519:1: rule__Communication__Group__5 : rule__Communication__Group__5__Impl rule__Communication__Group__6 ;
    public final void rule__Communication__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:5523:1: ( rule__Communication__Group__5__Impl rule__Communication__Group__6 )
            // InternalKant.g:5524:2: rule__Communication__Group__5__Impl rule__Communication__Group__6
            {
            pushFollow(FOLLOW_21);
            rule__Communication__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Communication__Group__6();

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
    // $ANTLR end "rule__Communication__Group__5"


    // $ANTLR start "rule__Communication__Group__5__Impl"
    // InternalKant.g:5531:1: rule__Communication__Group__5__Impl : ( ':' ) ;
    public final void rule__Communication__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:5535:1: ( ( ':' ) )
            // InternalKant.g:5536:1: ( ':' )
            {
            // InternalKant.g:5536:1: ( ':' )
            // InternalKant.g:5537:2: ':'
            {
             before(grammarAccess.getCommunicationAccess().getColonKeyword_5()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getCommunicationAccess().getColonKeyword_5()); 

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
    // $ANTLR end "rule__Communication__Group__5__Impl"


    // $ANTLR start "rule__Communication__Group__6"
    // InternalKant.g:5546:1: rule__Communication__Group__6 : rule__Communication__Group__6__Impl ;
    public final void rule__Communication__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:5550:1: ( rule__Communication__Group__6__Impl )
            // InternalKant.g:5551:2: rule__Communication__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Communication__Group__6__Impl();

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
    // $ANTLR end "rule__Communication__Group__6"


    // $ANTLR start "rule__Communication__Group__6__Impl"
    // InternalKant.g:5557:1: rule__Communication__Group__6__Impl : ( ( rule__Communication__KnowledgeAssignment_6 ) ) ;
    public final void rule__Communication__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:5561:1: ( ( ( rule__Communication__KnowledgeAssignment_6 ) ) )
            // InternalKant.g:5562:1: ( ( rule__Communication__KnowledgeAssignment_6 ) )
            {
            // InternalKant.g:5562:1: ( ( rule__Communication__KnowledgeAssignment_6 ) )
            // InternalKant.g:5563:2: ( rule__Communication__KnowledgeAssignment_6 )
            {
             before(grammarAccess.getCommunicationAccess().getKnowledgeAssignment_6()); 
            // InternalKant.g:5564:2: ( rule__Communication__KnowledgeAssignment_6 )
            // InternalKant.g:5564:3: rule__Communication__KnowledgeAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Communication__KnowledgeAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getCommunicationAccess().getKnowledgeAssignment_6()); 

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
    // $ANTLR end "rule__Communication__Group__6__Impl"


    // $ANTLR start "rule__Communication__Group_1__0"
    // InternalKant.g:5573:1: rule__Communication__Group_1__0 : rule__Communication__Group_1__0__Impl rule__Communication__Group_1__1 ;
    public final void rule__Communication__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:5577:1: ( rule__Communication__Group_1__0__Impl rule__Communication__Group_1__1 )
            // InternalKant.g:5578:2: rule__Communication__Group_1__0__Impl rule__Communication__Group_1__1
            {
            pushFollow(FOLLOW_4);
            rule__Communication__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Communication__Group_1__1();

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
    // $ANTLR end "rule__Communication__Group_1__0"


    // $ANTLR start "rule__Communication__Group_1__0__Impl"
    // InternalKant.g:5585:1: rule__Communication__Group_1__0__Impl : ( ',' ) ;
    public final void rule__Communication__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:5589:1: ( ( ',' ) )
            // InternalKant.g:5590:1: ( ',' )
            {
            // InternalKant.g:5590:1: ( ',' )
            // InternalKant.g:5591:2: ','
            {
             before(grammarAccess.getCommunicationAccess().getCommaKeyword_1_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getCommunicationAccess().getCommaKeyword_1_0()); 

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
    // $ANTLR end "rule__Communication__Group_1__0__Impl"


    // $ANTLR start "rule__Communication__Group_1__1"
    // InternalKant.g:5600:1: rule__Communication__Group_1__1 : rule__Communication__Group_1__1__Impl ;
    public final void rule__Communication__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:5604:1: ( rule__Communication__Group_1__1__Impl )
            // InternalKant.g:5605:2: rule__Communication__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Communication__Group_1__1__Impl();

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
    // $ANTLR end "rule__Communication__Group_1__1"


    // $ANTLR start "rule__Communication__Group_1__1__Impl"
    // InternalKant.g:5611:1: rule__Communication__Group_1__1__Impl : ( ( rule__Communication__FromAssignment_1_1 ) ) ;
    public final void rule__Communication__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:5615:1: ( ( ( rule__Communication__FromAssignment_1_1 ) ) )
            // InternalKant.g:5616:1: ( ( rule__Communication__FromAssignment_1_1 ) )
            {
            // InternalKant.g:5616:1: ( ( rule__Communication__FromAssignment_1_1 ) )
            // InternalKant.g:5617:2: ( rule__Communication__FromAssignment_1_1 )
            {
             before(grammarAccess.getCommunicationAccess().getFromAssignment_1_1()); 
            // InternalKant.g:5618:2: ( rule__Communication__FromAssignment_1_1 )
            // InternalKant.g:5618:3: rule__Communication__FromAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Communication__FromAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getCommunicationAccess().getFromAssignment_1_1()); 

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
    // $ANTLR end "rule__Communication__Group_1__1__Impl"


    // $ANTLR start "rule__Communication__Group_4__0"
    // InternalKant.g:5627:1: rule__Communication__Group_4__0 : rule__Communication__Group_4__0__Impl rule__Communication__Group_4__1 ;
    public final void rule__Communication__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:5631:1: ( rule__Communication__Group_4__0__Impl rule__Communication__Group_4__1 )
            // InternalKant.g:5632:2: rule__Communication__Group_4__0__Impl rule__Communication__Group_4__1
            {
            pushFollow(FOLLOW_4);
            rule__Communication__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Communication__Group_4__1();

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
    // $ANTLR end "rule__Communication__Group_4__0"


    // $ANTLR start "rule__Communication__Group_4__0__Impl"
    // InternalKant.g:5639:1: rule__Communication__Group_4__0__Impl : ( ',' ) ;
    public final void rule__Communication__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:5643:1: ( ( ',' ) )
            // InternalKant.g:5644:1: ( ',' )
            {
            // InternalKant.g:5644:1: ( ',' )
            // InternalKant.g:5645:2: ','
            {
             before(grammarAccess.getCommunicationAccess().getCommaKeyword_4_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getCommunicationAccess().getCommaKeyword_4_0()); 

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
    // $ANTLR end "rule__Communication__Group_4__0__Impl"


    // $ANTLR start "rule__Communication__Group_4__1"
    // InternalKant.g:5654:1: rule__Communication__Group_4__1 : rule__Communication__Group_4__1__Impl ;
    public final void rule__Communication__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:5658:1: ( rule__Communication__Group_4__1__Impl )
            // InternalKant.g:5659:2: rule__Communication__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Communication__Group_4__1__Impl();

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
    // $ANTLR end "rule__Communication__Group_4__1"


    // $ANTLR start "rule__Communication__Group_4__1__Impl"
    // InternalKant.g:5665:1: rule__Communication__Group_4__1__Impl : ( ( rule__Communication__ToAssignment_4_1 ) ) ;
    public final void rule__Communication__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:5669:1: ( ( ( rule__Communication__ToAssignment_4_1 ) ) )
            // InternalKant.g:5670:1: ( ( rule__Communication__ToAssignment_4_1 ) )
            {
            // InternalKant.g:5670:1: ( ( rule__Communication__ToAssignment_4_1 ) )
            // InternalKant.g:5671:2: ( rule__Communication__ToAssignment_4_1 )
            {
             before(grammarAccess.getCommunicationAccess().getToAssignment_4_1()); 
            // InternalKant.g:5672:2: ( rule__Communication__ToAssignment_4_1 )
            // InternalKant.g:5672:3: rule__Communication__ToAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Communication__ToAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getCommunicationAccess().getToAssignment_4_1()); 

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
    // $ANTLR end "rule__Communication__Group_4__1__Impl"


    // $ANTLR start "rule__ScenarioOptional__Group__0"
    // InternalKant.g:5681:1: rule__ScenarioOptional__Group__0 : rule__ScenarioOptional__Group__0__Impl rule__ScenarioOptional__Group__1 ;
    public final void rule__ScenarioOptional__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:5685:1: ( rule__ScenarioOptional__Group__0__Impl rule__ScenarioOptional__Group__1 )
            // InternalKant.g:5686:2: rule__ScenarioOptional__Group__0__Impl rule__ScenarioOptional__Group__1
            {
            pushFollow(FOLLOW_43);
            rule__ScenarioOptional__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ScenarioOptional__Group__1();

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
    // $ANTLR end "rule__ScenarioOptional__Group__0"


    // $ANTLR start "rule__ScenarioOptional__Group__0__Impl"
    // InternalKant.g:5693:1: rule__ScenarioOptional__Group__0__Impl : ( 'optionally' ) ;
    public final void rule__ScenarioOptional__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:5697:1: ( ( 'optionally' ) )
            // InternalKant.g:5698:1: ( 'optionally' )
            {
            // InternalKant.g:5698:1: ( 'optionally' )
            // InternalKant.g:5699:2: 'optionally'
            {
             before(grammarAccess.getScenarioOptionalAccess().getOptionallyKeyword_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getScenarioOptionalAccess().getOptionallyKeyword_0()); 

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
    // $ANTLR end "rule__ScenarioOptional__Group__0__Impl"


    // $ANTLR start "rule__ScenarioOptional__Group__1"
    // InternalKant.g:5708:1: rule__ScenarioOptional__Group__1 : rule__ScenarioOptional__Group__1__Impl ;
    public final void rule__ScenarioOptional__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:5712:1: ( rule__ScenarioOptional__Group__1__Impl )
            // InternalKant.g:5713:2: rule__ScenarioOptional__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ScenarioOptional__Group__1__Impl();

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
    // $ANTLR end "rule__ScenarioOptional__Group__1"


    // $ANTLR start "rule__ScenarioOptional__Group__1__Impl"
    // InternalKant.g:5719:1: rule__ScenarioOptional__Group__1__Impl : ( ( rule__ScenarioOptional__ScenarioAssignment_1 ) ) ;
    public final void rule__ScenarioOptional__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:5723:1: ( ( ( rule__ScenarioOptional__ScenarioAssignment_1 ) ) )
            // InternalKant.g:5724:1: ( ( rule__ScenarioOptional__ScenarioAssignment_1 ) )
            {
            // InternalKant.g:5724:1: ( ( rule__ScenarioOptional__ScenarioAssignment_1 ) )
            // InternalKant.g:5725:2: ( rule__ScenarioOptional__ScenarioAssignment_1 )
            {
             before(grammarAccess.getScenarioOptionalAccess().getScenarioAssignment_1()); 
            // InternalKant.g:5726:2: ( rule__ScenarioOptional__ScenarioAssignment_1 )
            // InternalKant.g:5726:3: rule__ScenarioOptional__ScenarioAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ScenarioOptional__ScenarioAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getScenarioOptionalAccess().getScenarioAssignment_1()); 

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
    // $ANTLR end "rule__ScenarioOptional__Group__1__Impl"


    // $ANTLR start "rule__ScenarioAlternatives__Group__0"
    // InternalKant.g:5735:1: rule__ScenarioAlternatives__Group__0 : rule__ScenarioAlternatives__Group__0__Impl rule__ScenarioAlternatives__Group__1 ;
    public final void rule__ScenarioAlternatives__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:5739:1: ( rule__ScenarioAlternatives__Group__0__Impl rule__ScenarioAlternatives__Group__1 )
            // InternalKant.g:5740:2: rule__ScenarioAlternatives__Group__0__Impl rule__ScenarioAlternatives__Group__1
            {
            pushFollow(FOLLOW_44);
            rule__ScenarioAlternatives__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ScenarioAlternatives__Group__1();

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
    // $ANTLR end "rule__ScenarioAlternatives__Group__0"


    // $ANTLR start "rule__ScenarioAlternatives__Group__0__Impl"
    // InternalKant.g:5747:1: rule__ScenarioAlternatives__Group__0__Impl : ( 'alternatively' ) ;
    public final void rule__ScenarioAlternatives__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:5751:1: ( ( 'alternatively' ) )
            // InternalKant.g:5752:1: ( 'alternatively' )
            {
            // InternalKant.g:5752:1: ( 'alternatively' )
            // InternalKant.g:5753:2: 'alternatively'
            {
             before(grammarAccess.getScenarioAlternativesAccess().getAlternativelyKeyword_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getScenarioAlternativesAccess().getAlternativelyKeyword_0()); 

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
    // $ANTLR end "rule__ScenarioAlternatives__Group__0__Impl"


    // $ANTLR start "rule__ScenarioAlternatives__Group__1"
    // InternalKant.g:5762:1: rule__ScenarioAlternatives__Group__1 : rule__ScenarioAlternatives__Group__1__Impl rule__ScenarioAlternatives__Group__2 ;
    public final void rule__ScenarioAlternatives__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:5766:1: ( rule__ScenarioAlternatives__Group__1__Impl rule__ScenarioAlternatives__Group__2 )
            // InternalKant.g:5767:2: rule__ScenarioAlternatives__Group__1__Impl rule__ScenarioAlternatives__Group__2
            {
            pushFollow(FOLLOW_44);
            rule__ScenarioAlternatives__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ScenarioAlternatives__Group__2();

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
    // $ANTLR end "rule__ScenarioAlternatives__Group__1"


    // $ANTLR start "rule__ScenarioAlternatives__Group__1__Impl"
    // InternalKant.g:5774:1: rule__ScenarioAlternatives__Group__1__Impl : ( ( rule__ScenarioAlternatives__Group_1__0 ) ) ;
    public final void rule__ScenarioAlternatives__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:5778:1: ( ( ( rule__ScenarioAlternatives__Group_1__0 ) ) )
            // InternalKant.g:5779:1: ( ( rule__ScenarioAlternatives__Group_1__0 ) )
            {
            // InternalKant.g:5779:1: ( ( rule__ScenarioAlternatives__Group_1__0 ) )
            // InternalKant.g:5780:2: ( rule__ScenarioAlternatives__Group_1__0 )
            {
             before(grammarAccess.getScenarioAlternativesAccess().getGroup_1()); 
            // InternalKant.g:5781:2: ( rule__ScenarioAlternatives__Group_1__0 )
            // InternalKant.g:5781:3: rule__ScenarioAlternatives__Group_1__0
            {
            pushFollow(FOLLOW_2);
            rule__ScenarioAlternatives__Group_1__0();

            state._fsp--;


            }

             after(grammarAccess.getScenarioAlternativesAccess().getGroup_1()); 

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
    // $ANTLR end "rule__ScenarioAlternatives__Group__1__Impl"


    // $ANTLR start "rule__ScenarioAlternatives__Group__2"
    // InternalKant.g:5789:1: rule__ScenarioAlternatives__Group__2 : rule__ScenarioAlternatives__Group__2__Impl ;
    public final void rule__ScenarioAlternatives__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:5793:1: ( rule__ScenarioAlternatives__Group__2__Impl )
            // InternalKant.g:5794:2: rule__ScenarioAlternatives__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ScenarioAlternatives__Group__2__Impl();

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
    // $ANTLR end "rule__ScenarioAlternatives__Group__2"


    // $ANTLR start "rule__ScenarioAlternatives__Group__2__Impl"
    // InternalKant.g:5800:1: rule__ScenarioAlternatives__Group__2__Impl : ( ( ( rule__ScenarioAlternatives__Group_2__0 ) ) ( ( rule__ScenarioAlternatives__Group_2__0 )* ) ) ;
    public final void rule__ScenarioAlternatives__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:5804:1: ( ( ( ( rule__ScenarioAlternatives__Group_2__0 ) ) ( ( rule__ScenarioAlternatives__Group_2__0 )* ) ) )
            // InternalKant.g:5805:1: ( ( ( rule__ScenarioAlternatives__Group_2__0 ) ) ( ( rule__ScenarioAlternatives__Group_2__0 )* ) )
            {
            // InternalKant.g:5805:1: ( ( ( rule__ScenarioAlternatives__Group_2__0 ) ) ( ( rule__ScenarioAlternatives__Group_2__0 )* ) )
            // InternalKant.g:5806:2: ( ( rule__ScenarioAlternatives__Group_2__0 ) ) ( ( rule__ScenarioAlternatives__Group_2__0 )* )
            {
            // InternalKant.g:5806:2: ( ( rule__ScenarioAlternatives__Group_2__0 ) )
            // InternalKant.g:5807:3: ( rule__ScenarioAlternatives__Group_2__0 )
            {
             before(grammarAccess.getScenarioAlternativesAccess().getGroup_2()); 
            // InternalKant.g:5808:3: ( rule__ScenarioAlternatives__Group_2__0 )
            // InternalKant.g:5808:4: rule__ScenarioAlternatives__Group_2__0
            {
            pushFollow(FOLLOW_45);
            rule__ScenarioAlternatives__Group_2__0();

            state._fsp--;


            }

             after(grammarAccess.getScenarioAlternativesAccess().getGroup_2()); 

            }

            // InternalKant.g:5811:2: ( ( rule__ScenarioAlternatives__Group_2__0 )* )
            // InternalKant.g:5812:3: ( rule__ScenarioAlternatives__Group_2__0 )*
            {
             before(grammarAccess.getScenarioAlternativesAccess().getGroup_2()); 
            // InternalKant.g:5813:3: ( rule__ScenarioAlternatives__Group_2__0 )*
            loop57:
            do {
                int alt57=2;
                int LA57_0 = input.LA(1);

                if ( (LA57_0==37) ) {
                    alt57=1;
                }


                switch (alt57) {
            	case 1 :
            	    // InternalKant.g:5813:4: rule__ScenarioAlternatives__Group_2__0
            	    {
            	    pushFollow(FOLLOW_45);
            	    rule__ScenarioAlternatives__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop57;
                }
            } while (true);

             after(grammarAccess.getScenarioAlternativesAccess().getGroup_2()); 

            }


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
    // $ANTLR end "rule__ScenarioAlternatives__Group__2__Impl"


    // $ANTLR start "rule__ScenarioAlternatives__Group_1__0"
    // InternalKant.g:5823:1: rule__ScenarioAlternatives__Group_1__0 : rule__ScenarioAlternatives__Group_1__0__Impl rule__ScenarioAlternatives__Group_1__1 ;
    public final void rule__ScenarioAlternatives__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:5827:1: ( rule__ScenarioAlternatives__Group_1__0__Impl rule__ScenarioAlternatives__Group_1__1 )
            // InternalKant.g:5828:2: rule__ScenarioAlternatives__Group_1__0__Impl rule__ScenarioAlternatives__Group_1__1
            {
            pushFollow(FOLLOW_43);
            rule__ScenarioAlternatives__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ScenarioAlternatives__Group_1__1();

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
    // $ANTLR end "rule__ScenarioAlternatives__Group_1__0"


    // $ANTLR start "rule__ScenarioAlternatives__Group_1__0__Impl"
    // InternalKant.g:5835:1: rule__ScenarioAlternatives__Group_1__0__Impl : ( 'or' ) ;
    public final void rule__ScenarioAlternatives__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:5839:1: ( ( 'or' ) )
            // InternalKant.g:5840:1: ( 'or' )
            {
            // InternalKant.g:5840:1: ( 'or' )
            // InternalKant.g:5841:2: 'or'
            {
             before(grammarAccess.getScenarioAlternativesAccess().getOrKeyword_1_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getScenarioAlternativesAccess().getOrKeyword_1_0()); 

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
    // $ANTLR end "rule__ScenarioAlternatives__Group_1__0__Impl"


    // $ANTLR start "rule__ScenarioAlternatives__Group_1__1"
    // InternalKant.g:5850:1: rule__ScenarioAlternatives__Group_1__1 : rule__ScenarioAlternatives__Group_1__1__Impl ;
    public final void rule__ScenarioAlternatives__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:5854:1: ( rule__ScenarioAlternatives__Group_1__1__Impl )
            // InternalKant.g:5855:2: rule__ScenarioAlternatives__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ScenarioAlternatives__Group_1__1__Impl();

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
    // $ANTLR end "rule__ScenarioAlternatives__Group_1__1"


    // $ANTLR start "rule__ScenarioAlternatives__Group_1__1__Impl"
    // InternalKant.g:5861:1: rule__ScenarioAlternatives__Group_1__1__Impl : ( ( rule__ScenarioAlternatives__ScenarioAssignment_1_1 ) ) ;
    public final void rule__ScenarioAlternatives__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:5865:1: ( ( ( rule__ScenarioAlternatives__ScenarioAssignment_1_1 ) ) )
            // InternalKant.g:5866:1: ( ( rule__ScenarioAlternatives__ScenarioAssignment_1_1 ) )
            {
            // InternalKant.g:5866:1: ( ( rule__ScenarioAlternatives__ScenarioAssignment_1_1 ) )
            // InternalKant.g:5867:2: ( rule__ScenarioAlternatives__ScenarioAssignment_1_1 )
            {
             before(grammarAccess.getScenarioAlternativesAccess().getScenarioAssignment_1_1()); 
            // InternalKant.g:5868:2: ( rule__ScenarioAlternatives__ScenarioAssignment_1_1 )
            // InternalKant.g:5868:3: rule__ScenarioAlternatives__ScenarioAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__ScenarioAlternatives__ScenarioAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getScenarioAlternativesAccess().getScenarioAssignment_1_1()); 

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
    // $ANTLR end "rule__ScenarioAlternatives__Group_1__1__Impl"


    // $ANTLR start "rule__ScenarioAlternatives__Group_2__0"
    // InternalKant.g:5877:1: rule__ScenarioAlternatives__Group_2__0 : rule__ScenarioAlternatives__Group_2__0__Impl rule__ScenarioAlternatives__Group_2__1 ;
    public final void rule__ScenarioAlternatives__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:5881:1: ( rule__ScenarioAlternatives__Group_2__0__Impl rule__ScenarioAlternatives__Group_2__1 )
            // InternalKant.g:5882:2: rule__ScenarioAlternatives__Group_2__0__Impl rule__ScenarioAlternatives__Group_2__1
            {
            pushFollow(FOLLOW_43);
            rule__ScenarioAlternatives__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ScenarioAlternatives__Group_2__1();

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
    // $ANTLR end "rule__ScenarioAlternatives__Group_2__0"


    // $ANTLR start "rule__ScenarioAlternatives__Group_2__0__Impl"
    // InternalKant.g:5889:1: rule__ScenarioAlternatives__Group_2__0__Impl : ( 'or' ) ;
    public final void rule__ScenarioAlternatives__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:5893:1: ( ( 'or' ) )
            // InternalKant.g:5894:1: ( 'or' )
            {
            // InternalKant.g:5894:1: ( 'or' )
            // InternalKant.g:5895:2: 'or'
            {
             before(grammarAccess.getScenarioAlternativesAccess().getOrKeyword_2_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getScenarioAlternativesAccess().getOrKeyword_2_0()); 

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
    // $ANTLR end "rule__ScenarioAlternatives__Group_2__0__Impl"


    // $ANTLR start "rule__ScenarioAlternatives__Group_2__1"
    // InternalKant.g:5904:1: rule__ScenarioAlternatives__Group_2__1 : rule__ScenarioAlternatives__Group_2__1__Impl ;
    public final void rule__ScenarioAlternatives__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:5908:1: ( rule__ScenarioAlternatives__Group_2__1__Impl )
            // InternalKant.g:5909:2: rule__ScenarioAlternatives__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ScenarioAlternatives__Group_2__1__Impl();

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
    // $ANTLR end "rule__ScenarioAlternatives__Group_2__1"


    // $ANTLR start "rule__ScenarioAlternatives__Group_2__1__Impl"
    // InternalKant.g:5915:1: rule__ScenarioAlternatives__Group_2__1__Impl : ( ( rule__ScenarioAlternatives__ScenarioAssignment_2_1 ) ) ;
    public final void rule__ScenarioAlternatives__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:5919:1: ( ( ( rule__ScenarioAlternatives__ScenarioAssignment_2_1 ) ) )
            // InternalKant.g:5920:1: ( ( rule__ScenarioAlternatives__ScenarioAssignment_2_1 ) )
            {
            // InternalKant.g:5920:1: ( ( rule__ScenarioAlternatives__ScenarioAssignment_2_1 ) )
            // InternalKant.g:5921:2: ( rule__ScenarioAlternatives__ScenarioAssignment_2_1 )
            {
             before(grammarAccess.getScenarioAlternativesAccess().getScenarioAssignment_2_1()); 
            // InternalKant.g:5922:2: ( rule__ScenarioAlternatives__ScenarioAssignment_2_1 )
            // InternalKant.g:5922:3: rule__ScenarioAlternatives__ScenarioAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__ScenarioAlternatives__ScenarioAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getScenarioAlternativesAccess().getScenarioAssignment_2_1()); 

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
    // $ANTLR end "rule__ScenarioAlternatives__Group_2__1__Impl"


    // $ANTLR start "rule__Scenario__Group__0"
    // InternalKant.g:5931:1: rule__Scenario__Group__0 : rule__Scenario__Group__0__Impl rule__Scenario__Group__1 ;
    public final void rule__Scenario__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:5935:1: ( rule__Scenario__Group__0__Impl rule__Scenario__Group__1 )
            // InternalKant.g:5936:2: rule__Scenario__Group__0__Impl rule__Scenario__Group__1
            {
            pushFollow(FOLLOW_43);
            rule__Scenario__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Scenario__Group__1();

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
    // $ANTLR end "rule__Scenario__Group__0"


    // $ANTLR start "rule__Scenario__Group__0__Impl"
    // InternalKant.g:5943:1: rule__Scenario__Group__0__Impl : ( ( rule__Scenario__NameAssignment_0 )? ) ;
    public final void rule__Scenario__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:5947:1: ( ( ( rule__Scenario__NameAssignment_0 )? ) )
            // InternalKant.g:5948:1: ( ( rule__Scenario__NameAssignment_0 )? )
            {
            // InternalKant.g:5948:1: ( ( rule__Scenario__NameAssignment_0 )? )
            // InternalKant.g:5949:2: ( rule__Scenario__NameAssignment_0 )?
            {
             before(grammarAccess.getScenarioAccess().getNameAssignment_0()); 
            // InternalKant.g:5950:2: ( rule__Scenario__NameAssignment_0 )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==RULE_STRING) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalKant.g:5950:3: rule__Scenario__NameAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Scenario__NameAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getScenarioAccess().getNameAssignment_0()); 

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
    // $ANTLR end "rule__Scenario__Group__0__Impl"


    // $ANTLR start "rule__Scenario__Group__1"
    // InternalKant.g:5958:1: rule__Scenario__Group__1 : rule__Scenario__Group__1__Impl rule__Scenario__Group__2 ;
    public final void rule__Scenario__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:5962:1: ( rule__Scenario__Group__1__Impl rule__Scenario__Group__2 )
            // InternalKant.g:5963:2: rule__Scenario__Group__1__Impl rule__Scenario__Group__2
            {
            pushFollow(FOLLOW_46);
            rule__Scenario__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Scenario__Group__2();

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
    // $ANTLR end "rule__Scenario__Group__1"


    // $ANTLR start "rule__Scenario__Group__1__Impl"
    // InternalKant.g:5970:1: rule__Scenario__Group__1__Impl : ( '{' ) ;
    public final void rule__Scenario__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:5974:1: ( ( '{' ) )
            // InternalKant.g:5975:1: ( '{' )
            {
            // InternalKant.g:5975:1: ( '{' )
            // InternalKant.g:5976:2: '{'
            {
             before(grammarAccess.getScenarioAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getScenarioAccess().getLeftCurlyBracketKeyword_1()); 

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
    // $ANTLR end "rule__Scenario__Group__1__Impl"


    // $ANTLR start "rule__Scenario__Group__2"
    // InternalKant.g:5985:1: rule__Scenario__Group__2 : rule__Scenario__Group__2__Impl rule__Scenario__Group__3 ;
    public final void rule__Scenario__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:5989:1: ( rule__Scenario__Group__2__Impl rule__Scenario__Group__3 )
            // InternalKant.g:5990:2: rule__Scenario__Group__2__Impl rule__Scenario__Group__3
            {
            pushFollow(FOLLOW_47);
            rule__Scenario__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Scenario__Group__3();

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
    // $ANTLR end "rule__Scenario__Group__2"


    // $ANTLR start "rule__Scenario__Group__2__Impl"
    // InternalKant.g:5997:1: rule__Scenario__Group__2__Impl : ( ( ( rule__Scenario__ElementsAssignment_2 ) ) ( ( rule__Scenario__ElementsAssignment_2 )* ) ) ;
    public final void rule__Scenario__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:6001:1: ( ( ( ( rule__Scenario__ElementsAssignment_2 ) ) ( ( rule__Scenario__ElementsAssignment_2 )* ) ) )
            // InternalKant.g:6002:1: ( ( ( rule__Scenario__ElementsAssignment_2 ) ) ( ( rule__Scenario__ElementsAssignment_2 )* ) )
            {
            // InternalKant.g:6002:1: ( ( ( rule__Scenario__ElementsAssignment_2 ) ) ( ( rule__Scenario__ElementsAssignment_2 )* ) )
            // InternalKant.g:6003:2: ( ( rule__Scenario__ElementsAssignment_2 ) ) ( ( rule__Scenario__ElementsAssignment_2 )* )
            {
            // InternalKant.g:6003:2: ( ( rule__Scenario__ElementsAssignment_2 ) )
            // InternalKant.g:6004:3: ( rule__Scenario__ElementsAssignment_2 )
            {
             before(grammarAccess.getScenarioAccess().getElementsAssignment_2()); 
            // InternalKant.g:6005:3: ( rule__Scenario__ElementsAssignment_2 )
            // InternalKant.g:6005:4: rule__Scenario__ElementsAssignment_2
            {
            pushFollow(FOLLOW_3);
            rule__Scenario__ElementsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getScenarioAccess().getElementsAssignment_2()); 

            }

            // InternalKant.g:6008:2: ( ( rule__Scenario__ElementsAssignment_2 )* )
            // InternalKant.g:6009:3: ( rule__Scenario__ElementsAssignment_2 )*
            {
             before(grammarAccess.getScenarioAccess().getElementsAssignment_2()); 
            // InternalKant.g:6010:3: ( rule__Scenario__ElementsAssignment_2 )*
            loop59:
            do {
                int alt59=2;
                int LA59_0 = input.LA(1);

                if ( (LA59_0==RULE_ID||LA59_0==14||LA59_0==23||(LA59_0>=26 && LA59_0<=27)||(LA59_0>=35 && LA59_0<=36)||LA59_0==38||LA59_0==47) ) {
                    alt59=1;
                }


                switch (alt59) {
            	case 1 :
            	    // InternalKant.g:6010:4: rule__Scenario__ElementsAssignment_2
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Scenario__ElementsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop59;
                }
            } while (true);

             after(grammarAccess.getScenarioAccess().getElementsAssignment_2()); 

            }


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
    // $ANTLR end "rule__Scenario__Group__2__Impl"


    // $ANTLR start "rule__Scenario__Group__3"
    // InternalKant.g:6019:1: rule__Scenario__Group__3 : rule__Scenario__Group__3__Impl ;
    public final void rule__Scenario__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:6023:1: ( rule__Scenario__Group__3__Impl )
            // InternalKant.g:6024:2: rule__Scenario__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Scenario__Group__3__Impl();

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
    // $ANTLR end "rule__Scenario__Group__3"


    // $ANTLR start "rule__Scenario__Group__3__Impl"
    // InternalKant.g:6030:1: rule__Scenario__Group__3__Impl : ( '}' ) ;
    public final void rule__Scenario__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:6034:1: ( ( '}' ) )
            // InternalKant.g:6035:1: ( '}' )
            {
            // InternalKant.g:6035:1: ( '}' )
            // InternalKant.g:6036:2: '}'
            {
             before(grammarAccess.getScenarioAccess().getRightCurlyBracketKeyword_3()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getScenarioAccess().getRightCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__Scenario__Group__3__Impl"


    // $ANTLR start "rule__Check__Group__0"
    // InternalKant.g:6046:1: rule__Check__Group__0 : rule__Check__Group__0__Impl rule__Check__Group__1 ;
    public final void rule__Check__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:6050:1: ( rule__Check__Group__0__Impl rule__Check__Group__1 )
            // InternalKant.g:6051:2: rule__Check__Group__0__Impl rule__Check__Group__1
            {
            pushFollow(FOLLOW_48);
            rule__Check__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Check__Group__1();

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
    // $ANTLR end "rule__Check__Group__0"


    // $ANTLR start "rule__Check__Group__0__Impl"
    // InternalKant.g:6058:1: rule__Check__Group__0__Impl : ( 'check' ) ;
    public final void rule__Check__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:6062:1: ( ( 'check' ) )
            // InternalKant.g:6063:1: ( 'check' )
            {
            // InternalKant.g:6063:1: ( 'check' )
            // InternalKant.g:6064:2: 'check'
            {
             before(grammarAccess.getCheckAccess().getCheckKeyword_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getCheckAccess().getCheckKeyword_0()); 

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
    // $ANTLR end "rule__Check__Group__0__Impl"


    // $ANTLR start "rule__Check__Group__1"
    // InternalKant.g:6073:1: rule__Check__Group__1 : rule__Check__Group__1__Impl ;
    public final void rule__Check__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:6077:1: ( rule__Check__Group__1__Impl )
            // InternalKant.g:6078:2: rule__Check__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Check__Group__1__Impl();

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
    // $ANTLR end "rule__Check__Group__1"


    // $ANTLR start "rule__Check__Group__1__Impl"
    // InternalKant.g:6084:1: rule__Check__Group__1__Impl : ( ( rule__Check__Alternatives_1 ) ) ;
    public final void rule__Check__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:6088:1: ( ( ( rule__Check__Alternatives_1 ) ) )
            // InternalKant.g:6089:1: ( ( rule__Check__Alternatives_1 ) )
            {
            // InternalKant.g:6089:1: ( ( rule__Check__Alternatives_1 ) )
            // InternalKant.g:6090:2: ( rule__Check__Alternatives_1 )
            {
             before(grammarAccess.getCheckAccess().getAlternatives_1()); 
            // InternalKant.g:6091:2: ( rule__Check__Alternatives_1 )
            // InternalKant.g:6091:3: rule__Check__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__Check__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getCheckAccess().getAlternatives_1()); 

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
    // $ANTLR end "rule__Check__Group__1__Impl"


    // $ANTLR start "rule__KnowledgeCheck__Group__0"
    // InternalKant.g:6100:1: rule__KnowledgeCheck__Group__0 : rule__KnowledgeCheck__Group__0__Impl rule__KnowledgeCheck__Group__1 ;
    public final void rule__KnowledgeCheck__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:6104:1: ( rule__KnowledgeCheck__Group__0__Impl rule__KnowledgeCheck__Group__1 )
            // InternalKant.g:6105:2: rule__KnowledgeCheck__Group__0__Impl rule__KnowledgeCheck__Group__1
            {
            pushFollow(FOLLOW_48);
            rule__KnowledgeCheck__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__KnowledgeCheck__Group__1();

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
    // $ANTLR end "rule__KnowledgeCheck__Group__0"


    // $ANTLR start "rule__KnowledgeCheck__Group__0__Impl"
    // InternalKant.g:6112:1: rule__KnowledgeCheck__Group__0__Impl : ( ( rule__KnowledgeCheck__HereAssignment_0 )? ) ;
    public final void rule__KnowledgeCheck__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:6116:1: ( ( ( rule__KnowledgeCheck__HereAssignment_0 )? ) )
            // InternalKant.g:6117:1: ( ( rule__KnowledgeCheck__HereAssignment_0 )? )
            {
            // InternalKant.g:6117:1: ( ( rule__KnowledgeCheck__HereAssignment_0 )? )
            // InternalKant.g:6118:2: ( rule__KnowledgeCheck__HereAssignment_0 )?
            {
             before(grammarAccess.getKnowledgeCheckAccess().getHereAssignment_0()); 
            // InternalKant.g:6119:2: ( rule__KnowledgeCheck__HereAssignment_0 )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==48) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // InternalKant.g:6119:3: rule__KnowledgeCheck__HereAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__KnowledgeCheck__HereAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getKnowledgeCheckAccess().getHereAssignment_0()); 

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
    // $ANTLR end "rule__KnowledgeCheck__Group__0__Impl"


    // $ANTLR start "rule__KnowledgeCheck__Group__1"
    // InternalKant.g:6127:1: rule__KnowledgeCheck__Group__1 : rule__KnowledgeCheck__Group__1__Impl rule__KnowledgeCheck__Group__2 ;
    public final void rule__KnowledgeCheck__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:6131:1: ( rule__KnowledgeCheck__Group__1__Impl rule__KnowledgeCheck__Group__2 )
            // InternalKant.g:6132:2: rule__KnowledgeCheck__Group__1__Impl rule__KnowledgeCheck__Group__2
            {
            pushFollow(FOLLOW_48);
            rule__KnowledgeCheck__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__KnowledgeCheck__Group__2();

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
    // $ANTLR end "rule__KnowledgeCheck__Group__1"


    // $ANTLR start "rule__KnowledgeCheck__Group__1__Impl"
    // InternalKant.g:6139:1: rule__KnowledgeCheck__Group__1__Impl : ( ( rule__KnowledgeCheck__OnlyAssignment_1 )? ) ;
    public final void rule__KnowledgeCheck__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:6143:1: ( ( ( rule__KnowledgeCheck__OnlyAssignment_1 )? ) )
            // InternalKant.g:6144:1: ( ( rule__KnowledgeCheck__OnlyAssignment_1 )? )
            {
            // InternalKant.g:6144:1: ( ( rule__KnowledgeCheck__OnlyAssignment_1 )? )
            // InternalKant.g:6145:2: ( rule__KnowledgeCheck__OnlyAssignment_1 )?
            {
             before(grammarAccess.getKnowledgeCheckAccess().getOnlyAssignment_1()); 
            // InternalKant.g:6146:2: ( rule__KnowledgeCheck__OnlyAssignment_1 )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==49) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // InternalKant.g:6146:3: rule__KnowledgeCheck__OnlyAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__KnowledgeCheck__OnlyAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getKnowledgeCheckAccess().getOnlyAssignment_1()); 

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
    // $ANTLR end "rule__KnowledgeCheck__Group__1__Impl"


    // $ANTLR start "rule__KnowledgeCheck__Group__2"
    // InternalKant.g:6154:1: rule__KnowledgeCheck__Group__2 : rule__KnowledgeCheck__Group__2__Impl rule__KnowledgeCheck__Group__3 ;
    public final void rule__KnowledgeCheck__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:6158:1: ( rule__KnowledgeCheck__Group__2__Impl rule__KnowledgeCheck__Group__3 )
            // InternalKant.g:6159:2: rule__KnowledgeCheck__Group__2__Impl rule__KnowledgeCheck__Group__3
            {
            pushFollow(FOLLOW_49);
            rule__KnowledgeCheck__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__KnowledgeCheck__Group__3();

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
    // $ANTLR end "rule__KnowledgeCheck__Group__2"


    // $ANTLR start "rule__KnowledgeCheck__Group__2__Impl"
    // InternalKant.g:6166:1: rule__KnowledgeCheck__Group__2__Impl : ( ( rule__KnowledgeCheck__Group_2__0 ) ) ;
    public final void rule__KnowledgeCheck__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:6170:1: ( ( ( rule__KnowledgeCheck__Group_2__0 ) ) )
            // InternalKant.g:6171:1: ( ( rule__KnowledgeCheck__Group_2__0 ) )
            {
            // InternalKant.g:6171:1: ( ( rule__KnowledgeCheck__Group_2__0 ) )
            // InternalKant.g:6172:2: ( rule__KnowledgeCheck__Group_2__0 )
            {
             before(grammarAccess.getKnowledgeCheckAccess().getGroup_2()); 
            // InternalKant.g:6173:2: ( rule__KnowledgeCheck__Group_2__0 )
            // InternalKant.g:6173:3: rule__KnowledgeCheck__Group_2__0
            {
            pushFollow(FOLLOW_2);
            rule__KnowledgeCheck__Group_2__0();

            state._fsp--;


            }

             after(grammarAccess.getKnowledgeCheckAccess().getGroup_2()); 

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
    // $ANTLR end "rule__KnowledgeCheck__Group__2__Impl"


    // $ANTLR start "rule__KnowledgeCheck__Group__3"
    // InternalKant.g:6181:1: rule__KnowledgeCheck__Group__3 : rule__KnowledgeCheck__Group__3__Impl rule__KnowledgeCheck__Group__4 ;
    public final void rule__KnowledgeCheck__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:6185:1: ( rule__KnowledgeCheck__Group__3__Impl rule__KnowledgeCheck__Group__4 )
            // InternalKant.g:6186:2: rule__KnowledgeCheck__Group__3__Impl rule__KnowledgeCheck__Group__4
            {
            pushFollow(FOLLOW_14);
            rule__KnowledgeCheck__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__KnowledgeCheck__Group__4();

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
    // $ANTLR end "rule__KnowledgeCheck__Group__3"


    // $ANTLR start "rule__KnowledgeCheck__Group__3__Impl"
    // InternalKant.g:6193:1: rule__KnowledgeCheck__Group__3__Impl : ( ( rule__KnowledgeCheck__Group_3__0 ) ) ;
    public final void rule__KnowledgeCheck__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:6197:1: ( ( ( rule__KnowledgeCheck__Group_3__0 ) ) )
            // InternalKant.g:6198:1: ( ( rule__KnowledgeCheck__Group_3__0 ) )
            {
            // InternalKant.g:6198:1: ( ( rule__KnowledgeCheck__Group_3__0 ) )
            // InternalKant.g:6199:2: ( rule__KnowledgeCheck__Group_3__0 )
            {
             before(grammarAccess.getKnowledgeCheckAccess().getGroup_3()); 
            // InternalKant.g:6200:2: ( rule__KnowledgeCheck__Group_3__0 )
            // InternalKant.g:6200:3: rule__KnowledgeCheck__Group_3__0
            {
            pushFollow(FOLLOW_2);
            rule__KnowledgeCheck__Group_3__0();

            state._fsp--;


            }

             after(grammarAccess.getKnowledgeCheckAccess().getGroup_3()); 

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
    // $ANTLR end "rule__KnowledgeCheck__Group__3__Impl"


    // $ANTLR start "rule__KnowledgeCheck__Group__4"
    // InternalKant.g:6208:1: rule__KnowledgeCheck__Group__4 : rule__KnowledgeCheck__Group__4__Impl ;
    public final void rule__KnowledgeCheck__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:6212:1: ( rule__KnowledgeCheck__Group__4__Impl )
            // InternalKant.g:6213:2: rule__KnowledgeCheck__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__KnowledgeCheck__Group__4__Impl();

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
    // $ANTLR end "rule__KnowledgeCheck__Group__4"


    // $ANTLR start "rule__KnowledgeCheck__Group__4__Impl"
    // InternalKant.g:6219:1: rule__KnowledgeCheck__Group__4__Impl : ( ( rule__KnowledgeCheck__KnowledgeAssignment_4 ) ) ;
    public final void rule__KnowledgeCheck__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:6223:1: ( ( ( rule__KnowledgeCheck__KnowledgeAssignment_4 ) ) )
            // InternalKant.g:6224:1: ( ( rule__KnowledgeCheck__KnowledgeAssignment_4 ) )
            {
            // InternalKant.g:6224:1: ( ( rule__KnowledgeCheck__KnowledgeAssignment_4 ) )
            // InternalKant.g:6225:2: ( rule__KnowledgeCheck__KnowledgeAssignment_4 )
            {
             before(grammarAccess.getKnowledgeCheckAccess().getKnowledgeAssignment_4()); 
            // InternalKant.g:6226:2: ( rule__KnowledgeCheck__KnowledgeAssignment_4 )
            // InternalKant.g:6226:3: rule__KnowledgeCheck__KnowledgeAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__KnowledgeCheck__KnowledgeAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getKnowledgeCheckAccess().getKnowledgeAssignment_4()); 

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
    // $ANTLR end "rule__KnowledgeCheck__Group__4__Impl"


    // $ANTLR start "rule__KnowledgeCheck__Group_2__0"
    // InternalKant.g:6235:1: rule__KnowledgeCheck__Group_2__0 : rule__KnowledgeCheck__Group_2__0__Impl rule__KnowledgeCheck__Group_2__1 ;
    public final void rule__KnowledgeCheck__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:6239:1: ( rule__KnowledgeCheck__Group_2__0__Impl rule__KnowledgeCheck__Group_2__1 )
            // InternalKant.g:6240:2: rule__KnowledgeCheck__Group_2__0__Impl rule__KnowledgeCheck__Group_2__1
            {
            pushFollow(FOLLOW_25);
            rule__KnowledgeCheck__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__KnowledgeCheck__Group_2__1();

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
    // $ANTLR end "rule__KnowledgeCheck__Group_2__0"


    // $ANTLR start "rule__KnowledgeCheck__Group_2__0__Impl"
    // InternalKant.g:6247:1: rule__KnowledgeCheck__Group_2__0__Impl : ( ( rule__KnowledgeCheck__TargetAssignment_2_0 ) ) ;
    public final void rule__KnowledgeCheck__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:6251:1: ( ( ( rule__KnowledgeCheck__TargetAssignment_2_0 ) ) )
            // InternalKant.g:6252:1: ( ( rule__KnowledgeCheck__TargetAssignment_2_0 ) )
            {
            // InternalKant.g:6252:1: ( ( rule__KnowledgeCheck__TargetAssignment_2_0 ) )
            // InternalKant.g:6253:2: ( rule__KnowledgeCheck__TargetAssignment_2_0 )
            {
             before(grammarAccess.getKnowledgeCheckAccess().getTargetAssignment_2_0()); 
            // InternalKant.g:6254:2: ( rule__KnowledgeCheck__TargetAssignment_2_0 )
            // InternalKant.g:6254:3: rule__KnowledgeCheck__TargetAssignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__KnowledgeCheck__TargetAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getKnowledgeCheckAccess().getTargetAssignment_2_0()); 

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
    // $ANTLR end "rule__KnowledgeCheck__Group_2__0__Impl"


    // $ANTLR start "rule__KnowledgeCheck__Group_2__1"
    // InternalKant.g:6262:1: rule__KnowledgeCheck__Group_2__1 : rule__KnowledgeCheck__Group_2__1__Impl ;
    public final void rule__KnowledgeCheck__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:6266:1: ( rule__KnowledgeCheck__Group_2__1__Impl )
            // InternalKant.g:6267:2: rule__KnowledgeCheck__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__KnowledgeCheck__Group_2__1__Impl();

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
    // $ANTLR end "rule__KnowledgeCheck__Group_2__1"


    // $ANTLR start "rule__KnowledgeCheck__Group_2__1__Impl"
    // InternalKant.g:6273:1: rule__KnowledgeCheck__Group_2__1__Impl : ( ( rule__KnowledgeCheck__Group_2_1__0 )* ) ;
    public final void rule__KnowledgeCheck__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:6277:1: ( ( ( rule__KnowledgeCheck__Group_2_1__0 )* ) )
            // InternalKant.g:6278:1: ( ( rule__KnowledgeCheck__Group_2_1__0 )* )
            {
            // InternalKant.g:6278:1: ( ( rule__KnowledgeCheck__Group_2_1__0 )* )
            // InternalKant.g:6279:2: ( rule__KnowledgeCheck__Group_2_1__0 )*
            {
             before(grammarAccess.getKnowledgeCheckAccess().getGroup_2_1()); 
            // InternalKant.g:6280:2: ( rule__KnowledgeCheck__Group_2_1__0 )*
            loop62:
            do {
                int alt62=2;
                int LA62_0 = input.LA(1);

                if ( (LA62_0==13) ) {
                    alt62=1;
                }


                switch (alt62) {
            	case 1 :
            	    // InternalKant.g:6280:3: rule__KnowledgeCheck__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__KnowledgeCheck__Group_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop62;
                }
            } while (true);

             after(grammarAccess.getKnowledgeCheckAccess().getGroup_2_1()); 

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
    // $ANTLR end "rule__KnowledgeCheck__Group_2__1__Impl"


    // $ANTLR start "rule__KnowledgeCheck__Group_2_1__0"
    // InternalKant.g:6289:1: rule__KnowledgeCheck__Group_2_1__0 : rule__KnowledgeCheck__Group_2_1__0__Impl rule__KnowledgeCheck__Group_2_1__1 ;
    public final void rule__KnowledgeCheck__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:6293:1: ( rule__KnowledgeCheck__Group_2_1__0__Impl rule__KnowledgeCheck__Group_2_1__1 )
            // InternalKant.g:6294:2: rule__KnowledgeCheck__Group_2_1__0__Impl rule__KnowledgeCheck__Group_2_1__1
            {
            pushFollow(FOLLOW_4);
            rule__KnowledgeCheck__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__KnowledgeCheck__Group_2_1__1();

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
    // $ANTLR end "rule__KnowledgeCheck__Group_2_1__0"


    // $ANTLR start "rule__KnowledgeCheck__Group_2_1__0__Impl"
    // InternalKant.g:6301:1: rule__KnowledgeCheck__Group_2_1__0__Impl : ( ',' ) ;
    public final void rule__KnowledgeCheck__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:6305:1: ( ( ',' ) )
            // InternalKant.g:6306:1: ( ',' )
            {
            // InternalKant.g:6306:1: ( ',' )
            // InternalKant.g:6307:2: ','
            {
             before(grammarAccess.getKnowledgeCheckAccess().getCommaKeyword_2_1_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getKnowledgeCheckAccess().getCommaKeyword_2_1_0()); 

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
    // $ANTLR end "rule__KnowledgeCheck__Group_2_1__0__Impl"


    // $ANTLR start "rule__KnowledgeCheck__Group_2_1__1"
    // InternalKant.g:6316:1: rule__KnowledgeCheck__Group_2_1__1 : rule__KnowledgeCheck__Group_2_1__1__Impl ;
    public final void rule__KnowledgeCheck__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:6320:1: ( rule__KnowledgeCheck__Group_2_1__1__Impl )
            // InternalKant.g:6321:2: rule__KnowledgeCheck__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__KnowledgeCheck__Group_2_1__1__Impl();

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
    // $ANTLR end "rule__KnowledgeCheck__Group_2_1__1"


    // $ANTLR start "rule__KnowledgeCheck__Group_2_1__1__Impl"
    // InternalKant.g:6327:1: rule__KnowledgeCheck__Group_2_1__1__Impl : ( ( rule__KnowledgeCheck__TargetAssignment_2_1_1 ) ) ;
    public final void rule__KnowledgeCheck__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:6331:1: ( ( ( rule__KnowledgeCheck__TargetAssignment_2_1_1 ) ) )
            // InternalKant.g:6332:1: ( ( rule__KnowledgeCheck__TargetAssignment_2_1_1 ) )
            {
            // InternalKant.g:6332:1: ( ( rule__KnowledgeCheck__TargetAssignment_2_1_1 ) )
            // InternalKant.g:6333:2: ( rule__KnowledgeCheck__TargetAssignment_2_1_1 )
            {
             before(grammarAccess.getKnowledgeCheckAccess().getTargetAssignment_2_1_1()); 
            // InternalKant.g:6334:2: ( rule__KnowledgeCheck__TargetAssignment_2_1_1 )
            // InternalKant.g:6334:3: rule__KnowledgeCheck__TargetAssignment_2_1_1
            {
            pushFollow(FOLLOW_2);
            rule__KnowledgeCheck__TargetAssignment_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getKnowledgeCheckAccess().getTargetAssignment_2_1_1()); 

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
    // $ANTLR end "rule__KnowledgeCheck__Group_2_1__1__Impl"


    // $ANTLR start "rule__KnowledgeCheck__Group_3__0"
    // InternalKant.g:6343:1: rule__KnowledgeCheck__Group_3__0 : rule__KnowledgeCheck__Group_3__0__Impl rule__KnowledgeCheck__Group_3__1 ;
    public final void rule__KnowledgeCheck__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:6347:1: ( rule__KnowledgeCheck__Group_3__0__Impl rule__KnowledgeCheck__Group_3__1 )
            // InternalKant.g:6348:2: rule__KnowledgeCheck__Group_3__0__Impl rule__KnowledgeCheck__Group_3__1
            {
            pushFollow(FOLLOW_50);
            rule__KnowledgeCheck__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__KnowledgeCheck__Group_3__1();

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
    // $ANTLR end "rule__KnowledgeCheck__Group_3__0"


    // $ANTLR start "rule__KnowledgeCheck__Group_3__0__Impl"
    // InternalKant.g:6355:1: rule__KnowledgeCheck__Group_3__0__Impl : ( 'should' ) ;
    public final void rule__KnowledgeCheck__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:6359:1: ( ( 'should' ) )
            // InternalKant.g:6360:1: ( 'should' )
            {
            // InternalKant.g:6360:1: ( 'should' )
            // InternalKant.g:6361:2: 'should'
            {
             before(grammarAccess.getKnowledgeCheckAccess().getShouldKeyword_3_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getKnowledgeCheckAccess().getShouldKeyword_3_0()); 

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
    // $ANTLR end "rule__KnowledgeCheck__Group_3__0__Impl"


    // $ANTLR start "rule__KnowledgeCheck__Group_3__1"
    // InternalKant.g:6370:1: rule__KnowledgeCheck__Group_3__1 : rule__KnowledgeCheck__Group_3__1__Impl rule__KnowledgeCheck__Group_3__2 ;
    public final void rule__KnowledgeCheck__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:6374:1: ( rule__KnowledgeCheck__Group_3__1__Impl rule__KnowledgeCheck__Group_3__2 )
            // InternalKant.g:6375:2: rule__KnowledgeCheck__Group_3__1__Impl rule__KnowledgeCheck__Group_3__2
            {
            pushFollow(FOLLOW_50);
            rule__KnowledgeCheck__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__KnowledgeCheck__Group_3__2();

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
    // $ANTLR end "rule__KnowledgeCheck__Group_3__1"


    // $ANTLR start "rule__KnowledgeCheck__Group_3__1__Impl"
    // InternalKant.g:6382:1: rule__KnowledgeCheck__Group_3__1__Impl : ( ( rule__KnowledgeCheck__NotAssignment_3_1 )? ) ;
    public final void rule__KnowledgeCheck__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:6386:1: ( ( ( rule__KnowledgeCheck__NotAssignment_3_1 )? ) )
            // InternalKant.g:6387:1: ( ( rule__KnowledgeCheck__NotAssignment_3_1 )? )
            {
            // InternalKant.g:6387:1: ( ( rule__KnowledgeCheck__NotAssignment_3_1 )? )
            // InternalKant.g:6388:2: ( rule__KnowledgeCheck__NotAssignment_3_1 )?
            {
             before(grammarAccess.getKnowledgeCheckAccess().getNotAssignment_3_1()); 
            // InternalKant.g:6389:2: ( rule__KnowledgeCheck__NotAssignment_3_1 )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==50) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // InternalKant.g:6389:3: rule__KnowledgeCheck__NotAssignment_3_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__KnowledgeCheck__NotAssignment_3_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getKnowledgeCheckAccess().getNotAssignment_3_1()); 

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
    // $ANTLR end "rule__KnowledgeCheck__Group_3__1__Impl"


    // $ANTLR start "rule__KnowledgeCheck__Group_3__2"
    // InternalKant.g:6397:1: rule__KnowledgeCheck__Group_3__2 : rule__KnowledgeCheck__Group_3__2__Impl ;
    public final void rule__KnowledgeCheck__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:6401:1: ( rule__KnowledgeCheck__Group_3__2__Impl )
            // InternalKant.g:6402:2: rule__KnowledgeCheck__Group_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__KnowledgeCheck__Group_3__2__Impl();

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
    // $ANTLR end "rule__KnowledgeCheck__Group_3__2"


    // $ANTLR start "rule__KnowledgeCheck__Group_3__2__Impl"
    // InternalKant.g:6408:1: rule__KnowledgeCheck__Group_3__2__Impl : ( 'know' ) ;
    public final void rule__KnowledgeCheck__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:6412:1: ( ( 'know' ) )
            // InternalKant.g:6413:1: ( 'know' )
            {
            // InternalKant.g:6413:1: ( 'know' )
            // InternalKant.g:6414:2: 'know'
            {
             before(grammarAccess.getKnowledgeCheckAccess().getKnowKeyword_3_2()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getKnowledgeCheckAccess().getKnowKeyword_3_2()); 

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
    // $ANTLR end "rule__KnowledgeCheck__Group_3__2__Impl"


    // $ANTLR start "rule__EqualityCheck__Group__0"
    // InternalKant.g:6424:1: rule__EqualityCheck__Group__0 : rule__EqualityCheck__Group__0__Impl rule__EqualityCheck__Group__1 ;
    public final void rule__EqualityCheck__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:6428:1: ( rule__EqualityCheck__Group__0__Impl rule__EqualityCheck__Group__1 )
            // InternalKant.g:6429:2: rule__EqualityCheck__Group__0__Impl rule__EqualityCheck__Group__1
            {
            pushFollow(FOLLOW_25);
            rule__EqualityCheck__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EqualityCheck__Group__1();

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
    // $ANTLR end "rule__EqualityCheck__Group__0"


    // $ANTLR start "rule__EqualityCheck__Group__0__Impl"
    // InternalKant.g:6436:1: rule__EqualityCheck__Group__0__Impl : ( ( rule__EqualityCheck__KnowledgeAssignment_0 ) ) ;
    public final void rule__EqualityCheck__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:6440:1: ( ( ( rule__EqualityCheck__KnowledgeAssignment_0 ) ) )
            // InternalKant.g:6441:1: ( ( rule__EqualityCheck__KnowledgeAssignment_0 ) )
            {
            // InternalKant.g:6441:1: ( ( rule__EqualityCheck__KnowledgeAssignment_0 ) )
            // InternalKant.g:6442:2: ( rule__EqualityCheck__KnowledgeAssignment_0 )
            {
             before(grammarAccess.getEqualityCheckAccess().getKnowledgeAssignment_0()); 
            // InternalKant.g:6443:2: ( rule__EqualityCheck__KnowledgeAssignment_0 )
            // InternalKant.g:6443:3: rule__EqualityCheck__KnowledgeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__EqualityCheck__KnowledgeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getEqualityCheckAccess().getKnowledgeAssignment_0()); 

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
    // $ANTLR end "rule__EqualityCheck__Group__0__Impl"


    // $ANTLR start "rule__EqualityCheck__Group__1"
    // InternalKant.g:6451:1: rule__EqualityCheck__Group__1 : rule__EqualityCheck__Group__1__Impl rule__EqualityCheck__Group__2 ;
    public final void rule__EqualityCheck__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:6455:1: ( rule__EqualityCheck__Group__1__Impl rule__EqualityCheck__Group__2 )
            // InternalKant.g:6456:2: rule__EqualityCheck__Group__1__Impl rule__EqualityCheck__Group__2
            {
            pushFollow(FOLLOW_49);
            rule__EqualityCheck__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EqualityCheck__Group__2();

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
    // $ANTLR end "rule__EqualityCheck__Group__1"


    // $ANTLR start "rule__EqualityCheck__Group__1__Impl"
    // InternalKant.g:6463:1: rule__EqualityCheck__Group__1__Impl : ( ( ( rule__EqualityCheck__Group_1__0 ) ) ( ( rule__EqualityCheck__Group_1__0 )* ) ) ;
    public final void rule__EqualityCheck__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:6467:1: ( ( ( ( rule__EqualityCheck__Group_1__0 ) ) ( ( rule__EqualityCheck__Group_1__0 )* ) ) )
            // InternalKant.g:6468:1: ( ( ( rule__EqualityCheck__Group_1__0 ) ) ( ( rule__EqualityCheck__Group_1__0 )* ) )
            {
            // InternalKant.g:6468:1: ( ( ( rule__EqualityCheck__Group_1__0 ) ) ( ( rule__EqualityCheck__Group_1__0 )* ) )
            // InternalKant.g:6469:2: ( ( rule__EqualityCheck__Group_1__0 ) ) ( ( rule__EqualityCheck__Group_1__0 )* )
            {
            // InternalKant.g:6469:2: ( ( rule__EqualityCheck__Group_1__0 ) )
            // InternalKant.g:6470:3: ( rule__EqualityCheck__Group_1__0 )
            {
             before(grammarAccess.getEqualityCheckAccess().getGroup_1()); 
            // InternalKant.g:6471:3: ( rule__EqualityCheck__Group_1__0 )
            // InternalKant.g:6471:4: rule__EqualityCheck__Group_1__0
            {
            pushFollow(FOLLOW_6);
            rule__EqualityCheck__Group_1__0();

            state._fsp--;


            }

             after(grammarAccess.getEqualityCheckAccess().getGroup_1()); 

            }

            // InternalKant.g:6474:2: ( ( rule__EqualityCheck__Group_1__0 )* )
            // InternalKant.g:6475:3: ( rule__EqualityCheck__Group_1__0 )*
            {
             before(grammarAccess.getEqualityCheckAccess().getGroup_1()); 
            // InternalKant.g:6476:3: ( rule__EqualityCheck__Group_1__0 )*
            loop64:
            do {
                int alt64=2;
                int LA64_0 = input.LA(1);

                if ( (LA64_0==13) ) {
                    alt64=1;
                }


                switch (alt64) {
            	case 1 :
            	    // InternalKant.g:6476:4: rule__EqualityCheck__Group_1__0
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__EqualityCheck__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop64;
                }
            } while (true);

             after(grammarAccess.getEqualityCheckAccess().getGroup_1()); 

            }


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
    // $ANTLR end "rule__EqualityCheck__Group__1__Impl"


    // $ANTLR start "rule__EqualityCheck__Group__2"
    // InternalKant.g:6485:1: rule__EqualityCheck__Group__2 : rule__EqualityCheck__Group__2__Impl rule__EqualityCheck__Group__3 ;
    public final void rule__EqualityCheck__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:6489:1: ( rule__EqualityCheck__Group__2__Impl rule__EqualityCheck__Group__3 )
            // InternalKant.g:6490:2: rule__EqualityCheck__Group__2__Impl rule__EqualityCheck__Group__3
            {
            pushFollow(FOLLOW_51);
            rule__EqualityCheck__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EqualityCheck__Group__3();

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
    // $ANTLR end "rule__EqualityCheck__Group__2"


    // $ANTLR start "rule__EqualityCheck__Group__2__Impl"
    // InternalKant.g:6497:1: rule__EqualityCheck__Group__2__Impl : ( 'should' ) ;
    public final void rule__EqualityCheck__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:6501:1: ( ( 'should' ) )
            // InternalKant.g:6502:1: ( 'should' )
            {
            // InternalKant.g:6502:1: ( 'should' )
            // InternalKant.g:6503:2: 'should'
            {
             before(grammarAccess.getEqualityCheckAccess().getShouldKeyword_2()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getEqualityCheckAccess().getShouldKeyword_2()); 

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
    // $ANTLR end "rule__EqualityCheck__Group__2__Impl"


    // $ANTLR start "rule__EqualityCheck__Group__3"
    // InternalKant.g:6512:1: rule__EqualityCheck__Group__3 : rule__EqualityCheck__Group__3__Impl rule__EqualityCheck__Group__4 ;
    public final void rule__EqualityCheck__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:6516:1: ( rule__EqualityCheck__Group__3__Impl rule__EqualityCheck__Group__4 )
            // InternalKant.g:6517:2: rule__EqualityCheck__Group__3__Impl rule__EqualityCheck__Group__4
            {
            pushFollow(FOLLOW_51);
            rule__EqualityCheck__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EqualityCheck__Group__4();

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
    // $ANTLR end "rule__EqualityCheck__Group__3"


    // $ANTLR start "rule__EqualityCheck__Group__3__Impl"
    // InternalKant.g:6524:1: rule__EqualityCheck__Group__3__Impl : ( ( rule__EqualityCheck__NotAssignment_3 )? ) ;
    public final void rule__EqualityCheck__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:6528:1: ( ( ( rule__EqualityCheck__NotAssignment_3 )? ) )
            // InternalKant.g:6529:1: ( ( rule__EqualityCheck__NotAssignment_3 )? )
            {
            // InternalKant.g:6529:1: ( ( rule__EqualityCheck__NotAssignment_3 )? )
            // InternalKant.g:6530:2: ( rule__EqualityCheck__NotAssignment_3 )?
            {
             before(grammarAccess.getEqualityCheckAccess().getNotAssignment_3()); 
            // InternalKant.g:6531:2: ( rule__EqualityCheck__NotAssignment_3 )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==50) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // InternalKant.g:6531:3: rule__EqualityCheck__NotAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__EqualityCheck__NotAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEqualityCheckAccess().getNotAssignment_3()); 

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
    // $ANTLR end "rule__EqualityCheck__Group__3__Impl"


    // $ANTLR start "rule__EqualityCheck__Group__4"
    // InternalKant.g:6539:1: rule__EqualityCheck__Group__4 : rule__EqualityCheck__Group__4__Impl rule__EqualityCheck__Group__5 ;
    public final void rule__EqualityCheck__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:6543:1: ( rule__EqualityCheck__Group__4__Impl rule__EqualityCheck__Group__5 )
            // InternalKant.g:6544:2: rule__EqualityCheck__Group__4__Impl rule__EqualityCheck__Group__5
            {
            pushFollow(FOLLOW_52);
            rule__EqualityCheck__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EqualityCheck__Group__5();

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
    // $ANTLR end "rule__EqualityCheck__Group__4"


    // $ANTLR start "rule__EqualityCheck__Group__4__Impl"
    // InternalKant.g:6551:1: rule__EqualityCheck__Group__4__Impl : ( 'be' ) ;
    public final void rule__EqualityCheck__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:6555:1: ( ( 'be' ) )
            // InternalKant.g:6556:1: ( 'be' )
            {
            // InternalKant.g:6556:1: ( 'be' )
            // InternalKant.g:6557:2: 'be'
            {
             before(grammarAccess.getEqualityCheckAccess().getBeKeyword_4()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getEqualityCheckAccess().getBeKeyword_4()); 

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
    // $ANTLR end "rule__EqualityCheck__Group__4__Impl"


    // $ANTLR start "rule__EqualityCheck__Group__5"
    // InternalKant.g:6566:1: rule__EqualityCheck__Group__5 : rule__EqualityCheck__Group__5__Impl ;
    public final void rule__EqualityCheck__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:6570:1: ( rule__EqualityCheck__Group__5__Impl )
            // InternalKant.g:6571:2: rule__EqualityCheck__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EqualityCheck__Group__5__Impl();

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
    // $ANTLR end "rule__EqualityCheck__Group__5"


    // $ANTLR start "rule__EqualityCheck__Group__5__Impl"
    // InternalKant.g:6577:1: rule__EqualityCheck__Group__5__Impl : ( 'equal' ) ;
    public final void rule__EqualityCheck__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:6581:1: ( ( 'equal' ) )
            // InternalKant.g:6582:1: ( 'equal' )
            {
            // InternalKant.g:6582:1: ( 'equal' )
            // InternalKant.g:6583:2: 'equal'
            {
             before(grammarAccess.getEqualityCheckAccess().getEqualKeyword_5()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getEqualityCheckAccess().getEqualKeyword_5()); 

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
    // $ANTLR end "rule__EqualityCheck__Group__5__Impl"


    // $ANTLR start "rule__EqualityCheck__Group_1__0"
    // InternalKant.g:6593:1: rule__EqualityCheck__Group_1__0 : rule__EqualityCheck__Group_1__0__Impl rule__EqualityCheck__Group_1__1 ;
    public final void rule__EqualityCheck__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:6597:1: ( rule__EqualityCheck__Group_1__0__Impl rule__EqualityCheck__Group_1__1 )
            // InternalKant.g:6598:2: rule__EqualityCheck__Group_1__0__Impl rule__EqualityCheck__Group_1__1
            {
            pushFollow(FOLLOW_4);
            rule__EqualityCheck__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EqualityCheck__Group_1__1();

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
    // $ANTLR end "rule__EqualityCheck__Group_1__0"


    // $ANTLR start "rule__EqualityCheck__Group_1__0__Impl"
    // InternalKant.g:6605:1: rule__EqualityCheck__Group_1__0__Impl : ( ',' ) ;
    public final void rule__EqualityCheck__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:6609:1: ( ( ',' ) )
            // InternalKant.g:6610:1: ( ',' )
            {
            // InternalKant.g:6610:1: ( ',' )
            // InternalKant.g:6611:2: ','
            {
             before(grammarAccess.getEqualityCheckAccess().getCommaKeyword_1_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getEqualityCheckAccess().getCommaKeyword_1_0()); 

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
    // $ANTLR end "rule__EqualityCheck__Group_1__0__Impl"


    // $ANTLR start "rule__EqualityCheck__Group_1__1"
    // InternalKant.g:6620:1: rule__EqualityCheck__Group_1__1 : rule__EqualityCheck__Group_1__1__Impl ;
    public final void rule__EqualityCheck__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:6624:1: ( rule__EqualityCheck__Group_1__1__Impl )
            // InternalKant.g:6625:2: rule__EqualityCheck__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EqualityCheck__Group_1__1__Impl();

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
    // $ANTLR end "rule__EqualityCheck__Group_1__1"


    // $ANTLR start "rule__EqualityCheck__Group_1__1__Impl"
    // InternalKant.g:6631:1: rule__EqualityCheck__Group_1__1__Impl : ( ( rule__EqualityCheck__KnowledgeAssignment_1_1 ) ) ;
    public final void rule__EqualityCheck__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:6635:1: ( ( ( rule__EqualityCheck__KnowledgeAssignment_1_1 ) ) )
            // InternalKant.g:6636:1: ( ( rule__EqualityCheck__KnowledgeAssignment_1_1 ) )
            {
            // InternalKant.g:6636:1: ( ( rule__EqualityCheck__KnowledgeAssignment_1_1 ) )
            // InternalKant.g:6637:2: ( rule__EqualityCheck__KnowledgeAssignment_1_1 )
            {
             before(grammarAccess.getEqualityCheckAccess().getKnowledgeAssignment_1_1()); 
            // InternalKant.g:6638:2: ( rule__EqualityCheck__KnowledgeAssignment_1_1 )
            // InternalKant.g:6638:3: rule__EqualityCheck__KnowledgeAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__EqualityCheck__KnowledgeAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getEqualityCheckAccess().getKnowledgeAssignment_1_1()); 

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
    // $ANTLR end "rule__EqualityCheck__Group_1__1__Impl"


    // $ANTLR start "rule__FreshnessCheck__Group__0"
    // InternalKant.g:6647:1: rule__FreshnessCheck__Group__0 : rule__FreshnessCheck__Group__0__Impl rule__FreshnessCheck__Group__1 ;
    public final void rule__FreshnessCheck__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:6651:1: ( rule__FreshnessCheck__Group__0__Impl rule__FreshnessCheck__Group__1 )
            // InternalKant.g:6652:2: rule__FreshnessCheck__Group__0__Impl rule__FreshnessCheck__Group__1
            {
            pushFollow(FOLLOW_53);
            rule__FreshnessCheck__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FreshnessCheck__Group__1();

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
    // $ANTLR end "rule__FreshnessCheck__Group__0"


    // $ANTLR start "rule__FreshnessCheck__Group__0__Impl"
    // InternalKant.g:6659:1: rule__FreshnessCheck__Group__0__Impl : ( ( rule__FreshnessCheck__KnowledgeAssignment_0 ) ) ;
    public final void rule__FreshnessCheck__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:6663:1: ( ( ( rule__FreshnessCheck__KnowledgeAssignment_0 ) ) )
            // InternalKant.g:6664:1: ( ( rule__FreshnessCheck__KnowledgeAssignment_0 ) )
            {
            // InternalKant.g:6664:1: ( ( rule__FreshnessCheck__KnowledgeAssignment_0 ) )
            // InternalKant.g:6665:2: ( rule__FreshnessCheck__KnowledgeAssignment_0 )
            {
             before(grammarAccess.getFreshnessCheckAccess().getKnowledgeAssignment_0()); 
            // InternalKant.g:6666:2: ( rule__FreshnessCheck__KnowledgeAssignment_0 )
            // InternalKant.g:6666:3: rule__FreshnessCheck__KnowledgeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__FreshnessCheck__KnowledgeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getFreshnessCheckAccess().getKnowledgeAssignment_0()); 

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
    // $ANTLR end "rule__FreshnessCheck__Group__0__Impl"


    // $ANTLR start "rule__FreshnessCheck__Group__1"
    // InternalKant.g:6674:1: rule__FreshnessCheck__Group__1 : rule__FreshnessCheck__Group__1__Impl rule__FreshnessCheck__Group__2 ;
    public final void rule__FreshnessCheck__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:6678:1: ( rule__FreshnessCheck__Group__1__Impl rule__FreshnessCheck__Group__2 )
            // InternalKant.g:6679:2: rule__FreshnessCheck__Group__1__Impl rule__FreshnessCheck__Group__2
            {
            pushFollow(FOLLOW_53);
            rule__FreshnessCheck__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FreshnessCheck__Group__2();

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
    // $ANTLR end "rule__FreshnessCheck__Group__1"


    // $ANTLR start "rule__FreshnessCheck__Group__1__Impl"
    // InternalKant.g:6686:1: rule__FreshnessCheck__Group__1__Impl : ( ( rule__FreshnessCheck__Group_1__0 )* ) ;
    public final void rule__FreshnessCheck__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:6690:1: ( ( ( rule__FreshnessCheck__Group_1__0 )* ) )
            // InternalKant.g:6691:1: ( ( rule__FreshnessCheck__Group_1__0 )* )
            {
            // InternalKant.g:6691:1: ( ( rule__FreshnessCheck__Group_1__0 )* )
            // InternalKant.g:6692:2: ( rule__FreshnessCheck__Group_1__0 )*
            {
             before(grammarAccess.getFreshnessCheckAccess().getGroup_1()); 
            // InternalKant.g:6693:2: ( rule__FreshnessCheck__Group_1__0 )*
            loop66:
            do {
                int alt66=2;
                int LA66_0 = input.LA(1);

                if ( (LA66_0==13) ) {
                    alt66=1;
                }


                switch (alt66) {
            	case 1 :
            	    // InternalKant.g:6693:3: rule__FreshnessCheck__Group_1__0
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__FreshnessCheck__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop66;
                }
            } while (true);

             after(grammarAccess.getFreshnessCheckAccess().getGroup_1()); 

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
    // $ANTLR end "rule__FreshnessCheck__Group__1__Impl"


    // $ANTLR start "rule__FreshnessCheck__Group__2"
    // InternalKant.g:6701:1: rule__FreshnessCheck__Group__2 : rule__FreshnessCheck__Group__2__Impl rule__FreshnessCheck__Group__3 ;
    public final void rule__FreshnessCheck__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:6705:1: ( rule__FreshnessCheck__Group__2__Impl rule__FreshnessCheck__Group__3 )
            // InternalKant.g:6706:2: rule__FreshnessCheck__Group__2__Impl rule__FreshnessCheck__Group__3
            {
            pushFollow(FOLLOW_51);
            rule__FreshnessCheck__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FreshnessCheck__Group__3();

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
    // $ANTLR end "rule__FreshnessCheck__Group__2"


    // $ANTLR start "rule__FreshnessCheck__Group__2__Impl"
    // InternalKant.g:6713:1: rule__FreshnessCheck__Group__2__Impl : ( 'should' ) ;
    public final void rule__FreshnessCheck__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:6717:1: ( ( 'should' ) )
            // InternalKant.g:6718:1: ( 'should' )
            {
            // InternalKant.g:6718:1: ( 'should' )
            // InternalKant.g:6719:2: 'should'
            {
             before(grammarAccess.getFreshnessCheckAccess().getShouldKeyword_2()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getFreshnessCheckAccess().getShouldKeyword_2()); 

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
    // $ANTLR end "rule__FreshnessCheck__Group__2__Impl"


    // $ANTLR start "rule__FreshnessCheck__Group__3"
    // InternalKant.g:6728:1: rule__FreshnessCheck__Group__3 : rule__FreshnessCheck__Group__3__Impl rule__FreshnessCheck__Group__4 ;
    public final void rule__FreshnessCheck__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:6732:1: ( rule__FreshnessCheck__Group__3__Impl rule__FreshnessCheck__Group__4 )
            // InternalKant.g:6733:2: rule__FreshnessCheck__Group__3__Impl rule__FreshnessCheck__Group__4
            {
            pushFollow(FOLLOW_51);
            rule__FreshnessCheck__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FreshnessCheck__Group__4();

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
    // $ANTLR end "rule__FreshnessCheck__Group__3"


    // $ANTLR start "rule__FreshnessCheck__Group__3__Impl"
    // InternalKant.g:6740:1: rule__FreshnessCheck__Group__3__Impl : ( ( rule__FreshnessCheck__NotAssignment_3 )? ) ;
    public final void rule__FreshnessCheck__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:6744:1: ( ( ( rule__FreshnessCheck__NotAssignment_3 )? ) )
            // InternalKant.g:6745:1: ( ( rule__FreshnessCheck__NotAssignment_3 )? )
            {
            // InternalKant.g:6745:1: ( ( rule__FreshnessCheck__NotAssignment_3 )? )
            // InternalKant.g:6746:2: ( rule__FreshnessCheck__NotAssignment_3 )?
            {
             before(grammarAccess.getFreshnessCheckAccess().getNotAssignment_3()); 
            // InternalKant.g:6747:2: ( rule__FreshnessCheck__NotAssignment_3 )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==50) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // InternalKant.g:6747:3: rule__FreshnessCheck__NotAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__FreshnessCheck__NotAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFreshnessCheckAccess().getNotAssignment_3()); 

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
    // $ANTLR end "rule__FreshnessCheck__Group__3__Impl"


    // $ANTLR start "rule__FreshnessCheck__Group__4"
    // InternalKant.g:6755:1: rule__FreshnessCheck__Group__4 : rule__FreshnessCheck__Group__4__Impl rule__FreshnessCheck__Group__5 ;
    public final void rule__FreshnessCheck__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:6759:1: ( rule__FreshnessCheck__Group__4__Impl rule__FreshnessCheck__Group__5 )
            // InternalKant.g:6760:2: rule__FreshnessCheck__Group__4__Impl rule__FreshnessCheck__Group__5
            {
            pushFollow(FOLLOW_54);
            rule__FreshnessCheck__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FreshnessCheck__Group__5();

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
    // $ANTLR end "rule__FreshnessCheck__Group__4"


    // $ANTLR start "rule__FreshnessCheck__Group__4__Impl"
    // InternalKant.g:6767:1: rule__FreshnessCheck__Group__4__Impl : ( 'be' ) ;
    public final void rule__FreshnessCheck__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:6771:1: ( ( 'be' ) )
            // InternalKant.g:6772:1: ( 'be' )
            {
            // InternalKant.g:6772:1: ( 'be' )
            // InternalKant.g:6773:2: 'be'
            {
             before(grammarAccess.getFreshnessCheckAccess().getBeKeyword_4()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getFreshnessCheckAccess().getBeKeyword_4()); 

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
    // $ANTLR end "rule__FreshnessCheck__Group__4__Impl"


    // $ANTLR start "rule__FreshnessCheck__Group__5"
    // InternalKant.g:6782:1: rule__FreshnessCheck__Group__5 : rule__FreshnessCheck__Group__5__Impl ;
    public final void rule__FreshnessCheck__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:6786:1: ( rule__FreshnessCheck__Group__5__Impl )
            // InternalKant.g:6787:2: rule__FreshnessCheck__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FreshnessCheck__Group__5__Impl();

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
    // $ANTLR end "rule__FreshnessCheck__Group__5"


    // $ANTLR start "rule__FreshnessCheck__Group__5__Impl"
    // InternalKant.g:6793:1: rule__FreshnessCheck__Group__5__Impl : ( 'fresh' ) ;
    public final void rule__FreshnessCheck__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:6797:1: ( ( 'fresh' ) )
            // InternalKant.g:6798:1: ( 'fresh' )
            {
            // InternalKant.g:6798:1: ( 'fresh' )
            // InternalKant.g:6799:2: 'fresh'
            {
             before(grammarAccess.getFreshnessCheckAccess().getFreshKeyword_5()); 
            match(input,10,FOLLOW_2); 
             after(grammarAccess.getFreshnessCheckAccess().getFreshKeyword_5()); 

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
    // $ANTLR end "rule__FreshnessCheck__Group__5__Impl"


    // $ANTLR start "rule__FreshnessCheck__Group_1__0"
    // InternalKant.g:6809:1: rule__FreshnessCheck__Group_1__0 : rule__FreshnessCheck__Group_1__0__Impl rule__FreshnessCheck__Group_1__1 ;
    public final void rule__FreshnessCheck__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:6813:1: ( rule__FreshnessCheck__Group_1__0__Impl rule__FreshnessCheck__Group_1__1 )
            // InternalKant.g:6814:2: rule__FreshnessCheck__Group_1__0__Impl rule__FreshnessCheck__Group_1__1
            {
            pushFollow(FOLLOW_4);
            rule__FreshnessCheck__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FreshnessCheck__Group_1__1();

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
    // $ANTLR end "rule__FreshnessCheck__Group_1__0"


    // $ANTLR start "rule__FreshnessCheck__Group_1__0__Impl"
    // InternalKant.g:6821:1: rule__FreshnessCheck__Group_1__0__Impl : ( ',' ) ;
    public final void rule__FreshnessCheck__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:6825:1: ( ( ',' ) )
            // InternalKant.g:6826:1: ( ',' )
            {
            // InternalKant.g:6826:1: ( ',' )
            // InternalKant.g:6827:2: ','
            {
             before(grammarAccess.getFreshnessCheckAccess().getCommaKeyword_1_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getFreshnessCheckAccess().getCommaKeyword_1_0()); 

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
    // $ANTLR end "rule__FreshnessCheck__Group_1__0__Impl"


    // $ANTLR start "rule__FreshnessCheck__Group_1__1"
    // InternalKant.g:6836:1: rule__FreshnessCheck__Group_1__1 : rule__FreshnessCheck__Group_1__1__Impl ;
    public final void rule__FreshnessCheck__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:6840:1: ( rule__FreshnessCheck__Group_1__1__Impl )
            // InternalKant.g:6841:2: rule__FreshnessCheck__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FreshnessCheck__Group_1__1__Impl();

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
    // $ANTLR end "rule__FreshnessCheck__Group_1__1"


    // $ANTLR start "rule__FreshnessCheck__Group_1__1__Impl"
    // InternalKant.g:6847:1: rule__FreshnessCheck__Group_1__1__Impl : ( ( rule__FreshnessCheck__KnowledgeAssignment_1_1 ) ) ;
    public final void rule__FreshnessCheck__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:6851:1: ( ( ( rule__FreshnessCheck__KnowledgeAssignment_1_1 ) ) )
            // InternalKant.g:6852:1: ( ( rule__FreshnessCheck__KnowledgeAssignment_1_1 ) )
            {
            // InternalKant.g:6852:1: ( ( rule__FreshnessCheck__KnowledgeAssignment_1_1 ) )
            // InternalKant.g:6853:2: ( rule__FreshnessCheck__KnowledgeAssignment_1_1 )
            {
             before(grammarAccess.getFreshnessCheckAccess().getKnowledgeAssignment_1_1()); 
            // InternalKant.g:6854:2: ( rule__FreshnessCheck__KnowledgeAssignment_1_1 )
            // InternalKant.g:6854:3: rule__FreshnessCheck__KnowledgeAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__FreshnessCheck__KnowledgeAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getFreshnessCheckAccess().getKnowledgeAssignment_1_1()); 

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
    // $ANTLR end "rule__FreshnessCheck__Group_1__1__Impl"


    // $ANTLR start "rule__LinkabilityCheck__Group__0"
    // InternalKant.g:6863:1: rule__LinkabilityCheck__Group__0 : rule__LinkabilityCheck__Group__0__Impl rule__LinkabilityCheck__Group__1 ;
    public final void rule__LinkabilityCheck__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:6867:1: ( rule__LinkabilityCheck__Group__0__Impl rule__LinkabilityCheck__Group__1 )
            // InternalKant.g:6868:2: rule__LinkabilityCheck__Group__0__Impl rule__LinkabilityCheck__Group__1
            {
            pushFollow(FOLLOW_25);
            rule__LinkabilityCheck__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LinkabilityCheck__Group__1();

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
    // $ANTLR end "rule__LinkabilityCheck__Group__0"


    // $ANTLR start "rule__LinkabilityCheck__Group__0__Impl"
    // InternalKant.g:6875:1: rule__LinkabilityCheck__Group__0__Impl : ( ( rule__LinkabilityCheck__KnowledgeAssignment_0 ) ) ;
    public final void rule__LinkabilityCheck__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:6879:1: ( ( ( rule__LinkabilityCheck__KnowledgeAssignment_0 ) ) )
            // InternalKant.g:6880:1: ( ( rule__LinkabilityCheck__KnowledgeAssignment_0 ) )
            {
            // InternalKant.g:6880:1: ( ( rule__LinkabilityCheck__KnowledgeAssignment_0 ) )
            // InternalKant.g:6881:2: ( rule__LinkabilityCheck__KnowledgeAssignment_0 )
            {
             before(grammarAccess.getLinkabilityCheckAccess().getKnowledgeAssignment_0()); 
            // InternalKant.g:6882:2: ( rule__LinkabilityCheck__KnowledgeAssignment_0 )
            // InternalKant.g:6882:3: rule__LinkabilityCheck__KnowledgeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__LinkabilityCheck__KnowledgeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getLinkabilityCheckAccess().getKnowledgeAssignment_0()); 

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
    // $ANTLR end "rule__LinkabilityCheck__Group__0__Impl"


    // $ANTLR start "rule__LinkabilityCheck__Group__1"
    // InternalKant.g:6890:1: rule__LinkabilityCheck__Group__1 : rule__LinkabilityCheck__Group__1__Impl rule__LinkabilityCheck__Group__2 ;
    public final void rule__LinkabilityCheck__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:6894:1: ( rule__LinkabilityCheck__Group__1__Impl rule__LinkabilityCheck__Group__2 )
            // InternalKant.g:6895:2: rule__LinkabilityCheck__Group__1__Impl rule__LinkabilityCheck__Group__2
            {
            pushFollow(FOLLOW_49);
            rule__LinkabilityCheck__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LinkabilityCheck__Group__2();

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
    // $ANTLR end "rule__LinkabilityCheck__Group__1"


    // $ANTLR start "rule__LinkabilityCheck__Group__1__Impl"
    // InternalKant.g:6902:1: rule__LinkabilityCheck__Group__1__Impl : ( ( ( rule__LinkabilityCheck__Group_1__0 ) ) ( ( rule__LinkabilityCheck__Group_1__0 )* ) ) ;
    public final void rule__LinkabilityCheck__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:6906:1: ( ( ( ( rule__LinkabilityCheck__Group_1__0 ) ) ( ( rule__LinkabilityCheck__Group_1__0 )* ) ) )
            // InternalKant.g:6907:1: ( ( ( rule__LinkabilityCheck__Group_1__0 ) ) ( ( rule__LinkabilityCheck__Group_1__0 )* ) )
            {
            // InternalKant.g:6907:1: ( ( ( rule__LinkabilityCheck__Group_1__0 ) ) ( ( rule__LinkabilityCheck__Group_1__0 )* ) )
            // InternalKant.g:6908:2: ( ( rule__LinkabilityCheck__Group_1__0 ) ) ( ( rule__LinkabilityCheck__Group_1__0 )* )
            {
            // InternalKant.g:6908:2: ( ( rule__LinkabilityCheck__Group_1__0 ) )
            // InternalKant.g:6909:3: ( rule__LinkabilityCheck__Group_1__0 )
            {
             before(grammarAccess.getLinkabilityCheckAccess().getGroup_1()); 
            // InternalKant.g:6910:3: ( rule__LinkabilityCheck__Group_1__0 )
            // InternalKant.g:6910:4: rule__LinkabilityCheck__Group_1__0
            {
            pushFollow(FOLLOW_6);
            rule__LinkabilityCheck__Group_1__0();

            state._fsp--;


            }

             after(grammarAccess.getLinkabilityCheckAccess().getGroup_1()); 

            }

            // InternalKant.g:6913:2: ( ( rule__LinkabilityCheck__Group_1__0 )* )
            // InternalKant.g:6914:3: ( rule__LinkabilityCheck__Group_1__0 )*
            {
             before(grammarAccess.getLinkabilityCheckAccess().getGroup_1()); 
            // InternalKant.g:6915:3: ( rule__LinkabilityCheck__Group_1__0 )*
            loop68:
            do {
                int alt68=2;
                int LA68_0 = input.LA(1);

                if ( (LA68_0==13) ) {
                    alt68=1;
                }


                switch (alt68) {
            	case 1 :
            	    // InternalKant.g:6915:4: rule__LinkabilityCheck__Group_1__0
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__LinkabilityCheck__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop68;
                }
            } while (true);

             after(grammarAccess.getLinkabilityCheckAccess().getGroup_1()); 

            }


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
    // $ANTLR end "rule__LinkabilityCheck__Group__1__Impl"


    // $ANTLR start "rule__LinkabilityCheck__Group__2"
    // InternalKant.g:6924:1: rule__LinkabilityCheck__Group__2 : rule__LinkabilityCheck__Group__2__Impl rule__LinkabilityCheck__Group__3 ;
    public final void rule__LinkabilityCheck__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:6928:1: ( rule__LinkabilityCheck__Group__2__Impl rule__LinkabilityCheck__Group__3 )
            // InternalKant.g:6929:2: rule__LinkabilityCheck__Group__2__Impl rule__LinkabilityCheck__Group__3
            {
            pushFollow(FOLLOW_51);
            rule__LinkabilityCheck__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LinkabilityCheck__Group__3();

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
    // $ANTLR end "rule__LinkabilityCheck__Group__2"


    // $ANTLR start "rule__LinkabilityCheck__Group__2__Impl"
    // InternalKant.g:6936:1: rule__LinkabilityCheck__Group__2__Impl : ( 'should' ) ;
    public final void rule__LinkabilityCheck__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:6940:1: ( ( 'should' ) )
            // InternalKant.g:6941:1: ( 'should' )
            {
            // InternalKant.g:6941:1: ( 'should' )
            // InternalKant.g:6942:2: 'should'
            {
             before(grammarAccess.getLinkabilityCheckAccess().getShouldKeyword_2()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getLinkabilityCheckAccess().getShouldKeyword_2()); 

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
    // $ANTLR end "rule__LinkabilityCheck__Group__2__Impl"


    // $ANTLR start "rule__LinkabilityCheck__Group__3"
    // InternalKant.g:6951:1: rule__LinkabilityCheck__Group__3 : rule__LinkabilityCheck__Group__3__Impl rule__LinkabilityCheck__Group__4 ;
    public final void rule__LinkabilityCheck__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:6955:1: ( rule__LinkabilityCheck__Group__3__Impl rule__LinkabilityCheck__Group__4 )
            // InternalKant.g:6956:2: rule__LinkabilityCheck__Group__3__Impl rule__LinkabilityCheck__Group__4
            {
            pushFollow(FOLLOW_51);
            rule__LinkabilityCheck__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LinkabilityCheck__Group__4();

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
    // $ANTLR end "rule__LinkabilityCheck__Group__3"


    // $ANTLR start "rule__LinkabilityCheck__Group__3__Impl"
    // InternalKant.g:6963:1: rule__LinkabilityCheck__Group__3__Impl : ( ( rule__LinkabilityCheck__NotAssignment_3 )? ) ;
    public final void rule__LinkabilityCheck__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:6967:1: ( ( ( rule__LinkabilityCheck__NotAssignment_3 )? ) )
            // InternalKant.g:6968:1: ( ( rule__LinkabilityCheck__NotAssignment_3 )? )
            {
            // InternalKant.g:6968:1: ( ( rule__LinkabilityCheck__NotAssignment_3 )? )
            // InternalKant.g:6969:2: ( rule__LinkabilityCheck__NotAssignment_3 )?
            {
             before(grammarAccess.getLinkabilityCheckAccess().getNotAssignment_3()); 
            // InternalKant.g:6970:2: ( rule__LinkabilityCheck__NotAssignment_3 )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==50) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // InternalKant.g:6970:3: rule__LinkabilityCheck__NotAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__LinkabilityCheck__NotAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLinkabilityCheckAccess().getNotAssignment_3()); 

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
    // $ANTLR end "rule__LinkabilityCheck__Group__3__Impl"


    // $ANTLR start "rule__LinkabilityCheck__Group__4"
    // InternalKant.g:6978:1: rule__LinkabilityCheck__Group__4 : rule__LinkabilityCheck__Group__4__Impl rule__LinkabilityCheck__Group__5 ;
    public final void rule__LinkabilityCheck__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:6982:1: ( rule__LinkabilityCheck__Group__4__Impl rule__LinkabilityCheck__Group__5 )
            // InternalKant.g:6983:2: rule__LinkabilityCheck__Group__4__Impl rule__LinkabilityCheck__Group__5
            {
            pushFollow(FOLLOW_55);
            rule__LinkabilityCheck__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LinkabilityCheck__Group__5();

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
    // $ANTLR end "rule__LinkabilityCheck__Group__4"


    // $ANTLR start "rule__LinkabilityCheck__Group__4__Impl"
    // InternalKant.g:6990:1: rule__LinkabilityCheck__Group__4__Impl : ( 'be' ) ;
    public final void rule__LinkabilityCheck__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:6994:1: ( ( 'be' ) )
            // InternalKant.g:6995:1: ( 'be' )
            {
            // InternalKant.g:6995:1: ( 'be' )
            // InternalKant.g:6996:2: 'be'
            {
             before(grammarAccess.getLinkabilityCheckAccess().getBeKeyword_4()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getLinkabilityCheckAccess().getBeKeyword_4()); 

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
    // $ANTLR end "rule__LinkabilityCheck__Group__4__Impl"


    // $ANTLR start "rule__LinkabilityCheck__Group__5"
    // InternalKant.g:7005:1: rule__LinkabilityCheck__Group__5 : rule__LinkabilityCheck__Group__5__Impl ;
    public final void rule__LinkabilityCheck__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:7009:1: ( rule__LinkabilityCheck__Group__5__Impl )
            // InternalKant.g:7010:2: rule__LinkabilityCheck__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LinkabilityCheck__Group__5__Impl();

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
    // $ANTLR end "rule__LinkabilityCheck__Group__5"


    // $ANTLR start "rule__LinkabilityCheck__Group__5__Impl"
    // InternalKant.g:7016:1: rule__LinkabilityCheck__Group__5__Impl : ( 'linked' ) ;
    public final void rule__LinkabilityCheck__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:7020:1: ( ( 'linked' ) )
            // InternalKant.g:7021:1: ( 'linked' )
            {
            // InternalKant.g:7021:1: ( 'linked' )
            // InternalKant.g:7022:2: 'linked'
            {
             before(grammarAccess.getLinkabilityCheckAccess().getLinkedKeyword_5()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getLinkabilityCheckAccess().getLinkedKeyword_5()); 

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
    // $ANTLR end "rule__LinkabilityCheck__Group__5__Impl"


    // $ANTLR start "rule__LinkabilityCheck__Group_1__0"
    // InternalKant.g:7032:1: rule__LinkabilityCheck__Group_1__0 : rule__LinkabilityCheck__Group_1__0__Impl rule__LinkabilityCheck__Group_1__1 ;
    public final void rule__LinkabilityCheck__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:7036:1: ( rule__LinkabilityCheck__Group_1__0__Impl rule__LinkabilityCheck__Group_1__1 )
            // InternalKant.g:7037:2: rule__LinkabilityCheck__Group_1__0__Impl rule__LinkabilityCheck__Group_1__1
            {
            pushFollow(FOLLOW_4);
            rule__LinkabilityCheck__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LinkabilityCheck__Group_1__1();

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
    // $ANTLR end "rule__LinkabilityCheck__Group_1__0"


    // $ANTLR start "rule__LinkabilityCheck__Group_1__0__Impl"
    // InternalKant.g:7044:1: rule__LinkabilityCheck__Group_1__0__Impl : ( ',' ) ;
    public final void rule__LinkabilityCheck__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:7048:1: ( ( ',' ) )
            // InternalKant.g:7049:1: ( ',' )
            {
            // InternalKant.g:7049:1: ( ',' )
            // InternalKant.g:7050:2: ','
            {
             before(grammarAccess.getLinkabilityCheckAccess().getCommaKeyword_1_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getLinkabilityCheckAccess().getCommaKeyword_1_0()); 

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
    // $ANTLR end "rule__LinkabilityCheck__Group_1__0__Impl"


    // $ANTLR start "rule__LinkabilityCheck__Group_1__1"
    // InternalKant.g:7059:1: rule__LinkabilityCheck__Group_1__1 : rule__LinkabilityCheck__Group_1__1__Impl ;
    public final void rule__LinkabilityCheck__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:7063:1: ( rule__LinkabilityCheck__Group_1__1__Impl )
            // InternalKant.g:7064:2: rule__LinkabilityCheck__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LinkabilityCheck__Group_1__1__Impl();

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
    // $ANTLR end "rule__LinkabilityCheck__Group_1__1"


    // $ANTLR start "rule__LinkabilityCheck__Group_1__1__Impl"
    // InternalKant.g:7070:1: rule__LinkabilityCheck__Group_1__1__Impl : ( ( rule__LinkabilityCheck__KnowledgeAssignment_1_1 ) ) ;
    public final void rule__LinkabilityCheck__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:7074:1: ( ( ( rule__LinkabilityCheck__KnowledgeAssignment_1_1 ) ) )
            // InternalKant.g:7075:1: ( ( rule__LinkabilityCheck__KnowledgeAssignment_1_1 ) )
            {
            // InternalKant.g:7075:1: ( ( rule__LinkabilityCheck__KnowledgeAssignment_1_1 ) )
            // InternalKant.g:7076:2: ( rule__LinkabilityCheck__KnowledgeAssignment_1_1 )
            {
             before(grammarAccess.getLinkabilityCheckAccess().getKnowledgeAssignment_1_1()); 
            // InternalKant.g:7077:2: ( rule__LinkabilityCheck__KnowledgeAssignment_1_1 )
            // InternalKant.g:7077:3: rule__LinkabilityCheck__KnowledgeAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__LinkabilityCheck__KnowledgeAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getLinkabilityCheckAccess().getKnowledgeAssignment_1_1()); 

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
    // $ANTLR end "rule__LinkabilityCheck__Group_1__1__Impl"


    // $ANTLR start "rule__AuthenticationCheck__Group__0"
    // InternalKant.g:7086:1: rule__AuthenticationCheck__Group__0 : rule__AuthenticationCheck__Group__0__Impl rule__AuthenticationCheck__Group__1 ;
    public final void rule__AuthenticationCheck__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:7090:1: ( rule__AuthenticationCheck__Group__0__Impl rule__AuthenticationCheck__Group__1 )
            // InternalKant.g:7091:2: rule__AuthenticationCheck__Group__0__Impl rule__AuthenticationCheck__Group__1
            {
            pushFollow(FOLLOW_49);
            rule__AuthenticationCheck__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AuthenticationCheck__Group__1();

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
    // $ANTLR end "rule__AuthenticationCheck__Group__0"


    // $ANTLR start "rule__AuthenticationCheck__Group__0__Impl"
    // InternalKant.g:7098:1: rule__AuthenticationCheck__Group__0__Impl : ( ( rule__AuthenticationCheck__PrincipalAssignment_0 ) ) ;
    public final void rule__AuthenticationCheck__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:7102:1: ( ( ( rule__AuthenticationCheck__PrincipalAssignment_0 ) ) )
            // InternalKant.g:7103:1: ( ( rule__AuthenticationCheck__PrincipalAssignment_0 ) )
            {
            // InternalKant.g:7103:1: ( ( rule__AuthenticationCheck__PrincipalAssignment_0 ) )
            // InternalKant.g:7104:2: ( rule__AuthenticationCheck__PrincipalAssignment_0 )
            {
             before(grammarAccess.getAuthenticationCheckAccess().getPrincipalAssignment_0()); 
            // InternalKant.g:7105:2: ( rule__AuthenticationCheck__PrincipalAssignment_0 )
            // InternalKant.g:7105:3: rule__AuthenticationCheck__PrincipalAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__AuthenticationCheck__PrincipalAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAuthenticationCheckAccess().getPrincipalAssignment_0()); 

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
    // $ANTLR end "rule__AuthenticationCheck__Group__0__Impl"


    // $ANTLR start "rule__AuthenticationCheck__Group__1"
    // InternalKant.g:7113:1: rule__AuthenticationCheck__Group__1 : rule__AuthenticationCheck__Group__1__Impl rule__AuthenticationCheck__Group__2 ;
    public final void rule__AuthenticationCheck__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:7117:1: ( rule__AuthenticationCheck__Group__1__Impl rule__AuthenticationCheck__Group__2 )
            // InternalKant.g:7118:2: rule__AuthenticationCheck__Group__1__Impl rule__AuthenticationCheck__Group__2
            {
            pushFollow(FOLLOW_56);
            rule__AuthenticationCheck__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AuthenticationCheck__Group__2();

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
    // $ANTLR end "rule__AuthenticationCheck__Group__1"


    // $ANTLR start "rule__AuthenticationCheck__Group__1__Impl"
    // InternalKant.g:7125:1: rule__AuthenticationCheck__Group__1__Impl : ( 'should' ) ;
    public final void rule__AuthenticationCheck__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:7129:1: ( ( 'should' ) )
            // InternalKant.g:7130:1: ( 'should' )
            {
            // InternalKant.g:7130:1: ( 'should' )
            // InternalKant.g:7131:2: 'should'
            {
             before(grammarAccess.getAuthenticationCheckAccess().getShouldKeyword_1()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getAuthenticationCheckAccess().getShouldKeyword_1()); 

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
    // $ANTLR end "rule__AuthenticationCheck__Group__1__Impl"


    // $ANTLR start "rule__AuthenticationCheck__Group__2"
    // InternalKant.g:7140:1: rule__AuthenticationCheck__Group__2 : rule__AuthenticationCheck__Group__2__Impl rule__AuthenticationCheck__Group__3 ;
    public final void rule__AuthenticationCheck__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:7144:1: ( rule__AuthenticationCheck__Group__2__Impl rule__AuthenticationCheck__Group__3 )
            // InternalKant.g:7145:2: rule__AuthenticationCheck__Group__2__Impl rule__AuthenticationCheck__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__AuthenticationCheck__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AuthenticationCheck__Group__3();

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
    // $ANTLR end "rule__AuthenticationCheck__Group__2"


    // $ANTLR start "rule__AuthenticationCheck__Group__2__Impl"
    // InternalKant.g:7152:1: rule__AuthenticationCheck__Group__2__Impl : ( 'authenticate' ) ;
    public final void rule__AuthenticationCheck__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:7156:1: ( ( 'authenticate' ) )
            // InternalKant.g:7157:1: ( 'authenticate' )
            {
            // InternalKant.g:7157:1: ( 'authenticate' )
            // InternalKant.g:7158:2: 'authenticate'
            {
             before(grammarAccess.getAuthenticationCheckAccess().getAuthenticateKeyword_2()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getAuthenticationCheckAccess().getAuthenticateKeyword_2()); 

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
    // $ANTLR end "rule__AuthenticationCheck__Group__2__Impl"


    // $ANTLR start "rule__AuthenticationCheck__Group__3"
    // InternalKant.g:7167:1: rule__AuthenticationCheck__Group__3 : rule__AuthenticationCheck__Group__3__Impl rule__AuthenticationCheck__Group__4 ;
    public final void rule__AuthenticationCheck__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:7171:1: ( rule__AuthenticationCheck__Group__3__Impl rule__AuthenticationCheck__Group__4 )
            // InternalKant.g:7172:2: rule__AuthenticationCheck__Group__3__Impl rule__AuthenticationCheck__Group__4
            {
            pushFollow(FOLLOW_41);
            rule__AuthenticationCheck__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AuthenticationCheck__Group__4();

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
    // $ANTLR end "rule__AuthenticationCheck__Group__3"


    // $ANTLR start "rule__AuthenticationCheck__Group__3__Impl"
    // InternalKant.g:7179:1: rule__AuthenticationCheck__Group__3__Impl : ( ( rule__AuthenticationCheck__TargetAssignment_3 ) ) ;
    public final void rule__AuthenticationCheck__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:7183:1: ( ( ( rule__AuthenticationCheck__TargetAssignment_3 ) ) )
            // InternalKant.g:7184:1: ( ( rule__AuthenticationCheck__TargetAssignment_3 ) )
            {
            // InternalKant.g:7184:1: ( ( rule__AuthenticationCheck__TargetAssignment_3 ) )
            // InternalKant.g:7185:2: ( rule__AuthenticationCheck__TargetAssignment_3 )
            {
             before(grammarAccess.getAuthenticationCheckAccess().getTargetAssignment_3()); 
            // InternalKant.g:7186:2: ( rule__AuthenticationCheck__TargetAssignment_3 )
            // InternalKant.g:7186:3: rule__AuthenticationCheck__TargetAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__AuthenticationCheck__TargetAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getAuthenticationCheckAccess().getTargetAssignment_3()); 

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
    // $ANTLR end "rule__AuthenticationCheck__Group__3__Impl"


    // $ANTLR start "rule__AuthenticationCheck__Group__4"
    // InternalKant.g:7194:1: rule__AuthenticationCheck__Group__4 : rule__AuthenticationCheck__Group__4__Impl rule__AuthenticationCheck__Group__5 ;
    public final void rule__AuthenticationCheck__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:7198:1: ( rule__AuthenticationCheck__Group__4__Impl rule__AuthenticationCheck__Group__5 )
            // InternalKant.g:7199:2: rule__AuthenticationCheck__Group__4__Impl rule__AuthenticationCheck__Group__5
            {
            pushFollow(FOLLOW_14);
            rule__AuthenticationCheck__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AuthenticationCheck__Group__5();

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
    // $ANTLR end "rule__AuthenticationCheck__Group__4"


    // $ANTLR start "rule__AuthenticationCheck__Group__4__Impl"
    // InternalKant.g:7206:1: rule__AuthenticationCheck__Group__4__Impl : ( 'with' ) ;
    public final void rule__AuthenticationCheck__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:7210:1: ( ( 'with' ) )
            // InternalKant.g:7211:1: ( 'with' )
            {
            // InternalKant.g:7211:1: ( 'with' )
            // InternalKant.g:7212:2: 'with'
            {
             before(grammarAccess.getAuthenticationCheckAccess().getWithKeyword_4()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getAuthenticationCheckAccess().getWithKeyword_4()); 

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
    // $ANTLR end "rule__AuthenticationCheck__Group__4__Impl"


    // $ANTLR start "rule__AuthenticationCheck__Group__5"
    // InternalKant.g:7221:1: rule__AuthenticationCheck__Group__5 : rule__AuthenticationCheck__Group__5__Impl ;
    public final void rule__AuthenticationCheck__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:7225:1: ( rule__AuthenticationCheck__Group__5__Impl )
            // InternalKant.g:7226:2: rule__AuthenticationCheck__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AuthenticationCheck__Group__5__Impl();

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
    // $ANTLR end "rule__AuthenticationCheck__Group__5"


    // $ANTLR start "rule__AuthenticationCheck__Group__5__Impl"
    // InternalKant.g:7232:1: rule__AuthenticationCheck__Group__5__Impl : ( ( rule__AuthenticationCheck__KnowledgeAssignment_5 ) ) ;
    public final void rule__AuthenticationCheck__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:7236:1: ( ( ( rule__AuthenticationCheck__KnowledgeAssignment_5 ) ) )
            // InternalKant.g:7237:1: ( ( rule__AuthenticationCheck__KnowledgeAssignment_5 ) )
            {
            // InternalKant.g:7237:1: ( ( rule__AuthenticationCheck__KnowledgeAssignment_5 ) )
            // InternalKant.g:7238:2: ( rule__AuthenticationCheck__KnowledgeAssignment_5 )
            {
             before(grammarAccess.getAuthenticationCheckAccess().getKnowledgeAssignment_5()); 
            // InternalKant.g:7239:2: ( rule__AuthenticationCheck__KnowledgeAssignment_5 )
            // InternalKant.g:7239:3: rule__AuthenticationCheck__KnowledgeAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__AuthenticationCheck__KnowledgeAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getAuthenticationCheckAccess().getKnowledgeAssignment_5()); 

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
    // $ANTLR end "rule__AuthenticationCheck__Group__5__Impl"


    // $ANTLR start "rule__Protocol__ElementsAssignment"
    // InternalKant.g:7248:1: rule__Protocol__ElementsAssignment : ( ruleElement ) ;
    public final void rule__Protocol__ElementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:7252:1: ( ( ruleElement ) )
            // InternalKant.g:7253:2: ( ruleElement )
            {
            // InternalKant.g:7253:2: ( ruleElement )
            // InternalKant.g:7254:3: ruleElement
            {
             before(grammarAccess.getProtocolAccess().getElementsElementParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleElement();

            state._fsp--;

             after(grammarAccess.getProtocolAccess().getElementsElementParserRuleCall_0()); 

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
    // $ANTLR end "rule__Protocol__ElementsAssignment"


    // $ANTLR start "rule__UniversalIntroduction__ArgsAssignment_1"
    // InternalKant.g:7263:1: rule__UniversalIntroduction__ArgsAssignment_1 : ( RULE_ID ) ;
    public final void rule__UniversalIntroduction__ArgsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:7267:1: ( ( RULE_ID ) )
            // InternalKant.g:7268:2: ( RULE_ID )
            {
            // InternalKant.g:7268:2: ( RULE_ID )
            // InternalKant.g:7269:3: RULE_ID
            {
             before(grammarAccess.getUniversalIntroductionAccess().getArgsIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getUniversalIntroductionAccess().getArgsIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__UniversalIntroduction__ArgsAssignment_1"


    // $ANTLR start "rule__UniversalIntroduction__ArgsAssignment_2_1"
    // InternalKant.g:7278:1: rule__UniversalIntroduction__ArgsAssignment_2_1 : ( RULE_ID ) ;
    public final void rule__UniversalIntroduction__ArgsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:7282:1: ( ( RULE_ID ) )
            // InternalKant.g:7283:2: ( RULE_ID )
            {
            // InternalKant.g:7283:2: ( RULE_ID )
            // InternalKant.g:7284:3: RULE_ID
            {
             before(grammarAccess.getUniversalIntroductionAccess().getArgsIDTerminalRuleCall_2_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getUniversalIntroductionAccess().getArgsIDTerminalRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__UniversalIntroduction__ArgsAssignment_2_1"


    // $ANTLR start "rule__FunctionDef__IntroAssignment_1"
    // InternalKant.g:7293:1: rule__FunctionDef__IntroAssignment_1 : ( ruleUniversalIntroduction ) ;
    public final void rule__FunctionDef__IntroAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:7297:1: ( ( ruleUniversalIntroduction ) )
            // InternalKant.g:7298:2: ( ruleUniversalIntroduction )
            {
            // InternalKant.g:7298:2: ( ruleUniversalIntroduction )
            // InternalKant.g:7299:3: ruleUniversalIntroduction
            {
             before(grammarAccess.getFunctionDefAccess().getIntroUniversalIntroductionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleUniversalIntroduction();

            state._fsp--;

             after(grammarAccess.getFunctionDefAccess().getIntroUniversalIntroductionParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__FunctionDef__IntroAssignment_1"


    // $ANTLR start "rule__FunctionDef__NameAssignment_2"
    // InternalKant.g:7308:1: rule__FunctionDef__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__FunctionDef__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:7312:1: ( ( RULE_ID ) )
            // InternalKant.g:7313:2: ( RULE_ID )
            {
            // InternalKant.g:7313:2: ( RULE_ID )
            // InternalKant.g:7314:3: RULE_ID
            {
             before(grammarAccess.getFunctionDefAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFunctionDefAccess().getNameIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__FunctionDef__NameAssignment_2"


    // $ANTLR start "rule__FunctionDef__ParamsAssignment_3_1"
    // InternalKant.g:7323:1: rule__FunctionDef__ParamsAssignment_3_1 : ( ruleFunctionParam ) ;
    public final void rule__FunctionDef__ParamsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:7327:1: ( ( ruleFunctionParam ) )
            // InternalKant.g:7328:2: ( ruleFunctionParam )
            {
            // InternalKant.g:7328:2: ( ruleFunctionParam )
            // InternalKant.g:7329:3: ruleFunctionParam
            {
             before(grammarAccess.getFunctionDefAccess().getParamsFunctionParamParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFunctionParam();

            state._fsp--;

             after(grammarAccess.getFunctionDefAccess().getParamsFunctionParamParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__FunctionDef__ParamsAssignment_3_1"


    // $ANTLR start "rule__FunctionDef__ParamsAssignment_3_2_1"
    // InternalKant.g:7338:1: rule__FunctionDef__ParamsAssignment_3_2_1 : ( ruleFunctionParam ) ;
    public final void rule__FunctionDef__ParamsAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:7342:1: ( ( ruleFunctionParam ) )
            // InternalKant.g:7343:2: ( ruleFunctionParam )
            {
            // InternalKant.g:7343:2: ( ruleFunctionParam )
            // InternalKant.g:7344:3: ruleFunctionParam
            {
             before(grammarAccess.getFunctionDefAccess().getParamsFunctionParamParserRuleCall_3_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFunctionParam();

            state._fsp--;

             after(grammarAccess.getFunctionDefAccess().getParamsFunctionParamParserRuleCall_3_2_1_0()); 

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
    // $ANTLR end "rule__FunctionDef__ParamsAssignment_3_2_1"


    // $ANTLR start "rule__FunctionDef__KeyAssignment_4_1"
    // InternalKant.g:7353:1: rule__FunctionDef__KeyAssignment_4_1 : ( ruleFunctionKey ) ;
    public final void rule__FunctionDef__KeyAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:7357:1: ( ( ruleFunctionKey ) )
            // InternalKant.g:7358:2: ( ruleFunctionKey )
            {
            // InternalKant.g:7358:2: ( ruleFunctionKey )
            // InternalKant.g:7359:3: ruleFunctionKey
            {
             before(grammarAccess.getFunctionDefAccess().getKeyFunctionKeyParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFunctionKey();

            state._fsp--;

             after(grammarAccess.getFunctionDefAccess().getKeyFunctionKeyParserRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__FunctionDef__KeyAssignment_4_1"


    // $ANTLR start "rule__FunctionDef__ReturnAssignment_5_1"
    // InternalKant.g:7368:1: rule__FunctionDef__ReturnAssignment_5_1 : ( ruleFunctionReturn ) ;
    public final void rule__FunctionDef__ReturnAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:7372:1: ( ( ruleFunctionReturn ) )
            // InternalKant.g:7373:2: ( ruleFunctionReturn )
            {
            // InternalKant.g:7373:2: ( ruleFunctionReturn )
            // InternalKant.g:7374:3: ruleFunctionReturn
            {
             before(grammarAccess.getFunctionDefAccess().getReturnFunctionReturnParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFunctionReturn();

            state._fsp--;

             after(grammarAccess.getFunctionDefAccess().getReturnFunctionReturnParserRuleCall_5_1_0()); 

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
    // $ANTLR end "rule__FunctionDef__ReturnAssignment_5_1"


    // $ANTLR start "rule__FunctionDef__RandomizedAssignment_6"
    // InternalKant.g:7383:1: rule__FunctionDef__RandomizedAssignment_6 : ( ( 'randomized' ) ) ;
    public final void rule__FunctionDef__RandomizedAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:7387:1: ( ( ( 'randomized' ) ) )
            // InternalKant.g:7388:2: ( ( 'randomized' ) )
            {
            // InternalKant.g:7388:2: ( ( 'randomized' ) )
            // InternalKant.g:7389:3: ( 'randomized' )
            {
             before(grammarAccess.getFunctionDefAccess().getRandomizedRandomizedKeyword_6_0()); 
            // InternalKant.g:7390:3: ( 'randomized' )
            // InternalKant.g:7391:4: 'randomized'
            {
             before(grammarAccess.getFunctionDefAccess().getRandomizedRandomizedKeyword_6_0()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getFunctionDefAccess().getRandomizedRandomizedKeyword_6_0()); 

            }

             after(grammarAccess.getFunctionDefAccess().getRandomizedRandomizedKeyword_6_0()); 

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
    // $ANTLR end "rule__FunctionDef__RandomizedAssignment_6"


    // $ANTLR start "rule__FunctionDef__OwAssignment_7_0"
    // InternalKant.g:7402:1: rule__FunctionDef__OwAssignment_7_0 : ( ( 'one' ) ) ;
    public final void rule__FunctionDef__OwAssignment_7_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:7406:1: ( ( ( 'one' ) ) )
            // InternalKant.g:7407:2: ( ( 'one' ) )
            {
            // InternalKant.g:7407:2: ( ( 'one' ) )
            // InternalKant.g:7408:3: ( 'one' )
            {
             before(grammarAccess.getFunctionDefAccess().getOwOneKeyword_7_0_0()); 
            // InternalKant.g:7409:3: ( 'one' )
            // InternalKant.g:7410:4: 'one'
            {
             before(grammarAccess.getFunctionDefAccess().getOwOneKeyword_7_0_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getFunctionDefAccess().getOwOneKeyword_7_0_0()); 

            }

             after(grammarAccess.getFunctionDefAccess().getOwOneKeyword_7_0_0()); 

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
    // $ANTLR end "rule__FunctionDef__OwAssignment_7_0"


    // $ANTLR start "rule__FunctionParam__VariadicAssignment_0"
    // InternalKant.g:7421:1: rule__FunctionParam__VariadicAssignment_0 : ( ( '...' ) ) ;
    public final void rule__FunctionParam__VariadicAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:7425:1: ( ( ( '...' ) ) )
            // InternalKant.g:7426:2: ( ( '...' ) )
            {
            // InternalKant.g:7426:2: ( ( '...' ) )
            // InternalKant.g:7427:3: ( '...' )
            {
             before(grammarAccess.getFunctionParamAccess().getVariadicFullStopFullStopFullStopKeyword_0_0()); 
            // InternalKant.g:7428:3: ( '...' )
            // InternalKant.g:7429:4: '...'
            {
             before(grammarAccess.getFunctionParamAccess().getVariadicFullStopFullStopFullStopKeyword_0_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getFunctionParamAccess().getVariadicFullStopFullStopFullStopKeyword_0_0()); 

            }

             after(grammarAccess.getFunctionParamAccess().getVariadicFullStopFullStopFullStopKeyword_0_0()); 

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
    // $ANTLR end "rule__FunctionParam__VariadicAssignment_0"


    // $ANTLR start "rule__FunctionParam__NameAssignment_1"
    // InternalKant.g:7440:1: rule__FunctionParam__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__FunctionParam__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:7444:1: ( ( RULE_ID ) )
            // InternalKant.g:7445:2: ( RULE_ID )
            {
            // InternalKant.g:7445:2: ( RULE_ID )
            // InternalKant.g:7446:3: RULE_ID
            {
             before(grammarAccess.getFunctionParamAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFunctionParamAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__FunctionParam__NameAssignment_1"


    // $ANTLR start "rule__FunctionParam__OptAssignment_2"
    // InternalKant.g:7455:1: rule__FunctionParam__OptAssignment_2 : ( ( '?' ) ) ;
    public final void rule__FunctionParam__OptAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:7459:1: ( ( ( '?' ) ) )
            // InternalKant.g:7460:2: ( ( '?' ) )
            {
            // InternalKant.g:7460:2: ( ( '?' ) )
            // InternalKant.g:7461:3: ( '?' )
            {
             before(grammarAccess.getFunctionParamAccess().getOptQuestionMarkKeyword_2_0()); 
            // InternalKant.g:7462:3: ( '?' )
            // InternalKant.g:7463:4: '?'
            {
             before(grammarAccess.getFunctionParamAccess().getOptQuestionMarkKeyword_2_0()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getFunctionParamAccess().getOptQuestionMarkKeyword_2_0()); 

            }

             after(grammarAccess.getFunctionParamAccess().getOptQuestionMarkKeyword_2_0()); 

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
    // $ANTLR end "rule__FunctionParam__OptAssignment_2"


    // $ANTLR start "rule__FunctionParam__TypeAssignment_3_1"
    // InternalKant.g:7474:1: rule__FunctionParam__TypeAssignment_3_1 : ( ruleKnowledgeValue ) ;
    public final void rule__FunctionParam__TypeAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:7478:1: ( ( ruleKnowledgeValue ) )
            // InternalKant.g:7479:2: ( ruleKnowledgeValue )
            {
            // InternalKant.g:7479:2: ( ruleKnowledgeValue )
            // InternalKant.g:7480:3: ruleKnowledgeValue
            {
             before(grammarAccess.getFunctionParamAccess().getTypeKnowledgeValueParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleKnowledgeValue();

            state._fsp--;

             after(grammarAccess.getFunctionParamAccess().getTypeKnowledgeValueParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__FunctionParam__TypeAssignment_3_1"


    // $ANTLR start "rule__FunctionKey__ElementsAssignment_0"
    // InternalKant.g:7489:1: rule__FunctionKey__ElementsAssignment_0 : ( ruleFunctionKeyElement ) ;
    public final void rule__FunctionKey__ElementsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:7493:1: ( ( ruleFunctionKeyElement ) )
            // InternalKant.g:7494:2: ( ruleFunctionKeyElement )
            {
            // InternalKant.g:7494:2: ( ruleFunctionKeyElement )
            // InternalKant.g:7495:3: ruleFunctionKeyElement
            {
             before(grammarAccess.getFunctionKeyAccess().getElementsFunctionKeyElementParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleFunctionKeyElement();

            state._fsp--;

             after(grammarAccess.getFunctionKeyAccess().getElementsFunctionKeyElementParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__FunctionKey__ElementsAssignment_0"


    // $ANTLR start "rule__FunctionKey__ElementsAssignment_1_1"
    // InternalKant.g:7504:1: rule__FunctionKey__ElementsAssignment_1_1 : ( ruleFunctionKeyElement ) ;
    public final void rule__FunctionKey__ElementsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:7508:1: ( ( ruleFunctionKeyElement ) )
            // InternalKant.g:7509:2: ( ruleFunctionKeyElement )
            {
            // InternalKant.g:7509:2: ( ruleFunctionKeyElement )
            // InternalKant.g:7510:3: ruleFunctionKeyElement
            {
             before(grammarAccess.getFunctionKeyAccess().getElementsFunctionKeyElementParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFunctionKeyElement();

            state._fsp--;

             after(grammarAccess.getFunctionKeyAccess().getElementsFunctionKeyElementParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__FunctionKey__ElementsAssignment_1_1"


    // $ANTLR start "rule__FunctionKey__ElementsAssignment_1_2_1"
    // InternalKant.g:7519:1: rule__FunctionKey__ElementsAssignment_1_2_1 : ( ruleFunctionKeyElement ) ;
    public final void rule__FunctionKey__ElementsAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:7523:1: ( ( ruleFunctionKeyElement ) )
            // InternalKant.g:7524:2: ( ruleFunctionKeyElement )
            {
            // InternalKant.g:7524:2: ( ruleFunctionKeyElement )
            // InternalKant.g:7525:3: ruleFunctionKeyElement
            {
             before(grammarAccess.getFunctionKeyAccess().getElementsFunctionKeyElementParserRuleCall_1_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFunctionKeyElement();

            state._fsp--;

             after(grammarAccess.getFunctionKeyAccess().getElementsFunctionKeyElementParserRuleCall_1_2_1_0()); 

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
    // $ANTLR end "rule__FunctionKey__ElementsAssignment_1_2_1"


    // $ANTLR start "rule__FunctionKeyElement__NameAssignment_0"
    // InternalKant.g:7534:1: rule__FunctionKeyElement__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__FunctionKeyElement__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:7538:1: ( ( RULE_ID ) )
            // InternalKant.g:7539:2: ( RULE_ID )
            {
            // InternalKant.g:7539:2: ( RULE_ID )
            // InternalKant.g:7540:3: RULE_ID
            {
             before(grammarAccess.getFunctionKeyElementAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFunctionKeyElementAccess().getNameIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__FunctionKeyElement__NameAssignment_0"


    // $ANTLR start "rule__FunctionKeyElement__TypeAssignment_1_1"
    // InternalKant.g:7549:1: rule__FunctionKeyElement__TypeAssignment_1_1 : ( ruleKnowledgeValue ) ;
    public final void rule__FunctionKeyElement__TypeAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:7553:1: ( ( ruleKnowledgeValue ) )
            // InternalKant.g:7554:2: ( ruleKnowledgeValue )
            {
            // InternalKant.g:7554:2: ( ruleKnowledgeValue )
            // InternalKant.g:7555:3: ruleKnowledgeValue
            {
             before(grammarAccess.getFunctionKeyElementAccess().getTypeKnowledgeValueParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleKnowledgeValue();

            state._fsp--;

             after(grammarAccess.getFunctionKeyElementAccess().getTypeKnowledgeValueParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__FunctionKeyElement__TypeAssignment_1_1"


    // $ANTLR start "rule__FunctionReturn__ElementsAssignment_0"
    // InternalKant.g:7564:1: rule__FunctionReturn__ElementsAssignment_0 : ( ruleFunctionReturnElement ) ;
    public final void rule__FunctionReturn__ElementsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:7568:1: ( ( ruleFunctionReturnElement ) )
            // InternalKant.g:7569:2: ( ruleFunctionReturnElement )
            {
            // InternalKant.g:7569:2: ( ruleFunctionReturnElement )
            // InternalKant.g:7570:3: ruleFunctionReturnElement
            {
             before(grammarAccess.getFunctionReturnAccess().getElementsFunctionReturnElementParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleFunctionReturnElement();

            state._fsp--;

             after(grammarAccess.getFunctionReturnAccess().getElementsFunctionReturnElementParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__FunctionReturn__ElementsAssignment_0"


    // $ANTLR start "rule__FunctionReturn__ElementsAssignment_1_1"
    // InternalKant.g:7579:1: rule__FunctionReturn__ElementsAssignment_1_1 : ( ruleFunctionReturnElement ) ;
    public final void rule__FunctionReturn__ElementsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:7583:1: ( ( ruleFunctionReturnElement ) )
            // InternalKant.g:7584:2: ( ruleFunctionReturnElement )
            {
            // InternalKant.g:7584:2: ( ruleFunctionReturnElement )
            // InternalKant.g:7585:3: ruleFunctionReturnElement
            {
             before(grammarAccess.getFunctionReturnAccess().getElementsFunctionReturnElementParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFunctionReturnElement();

            state._fsp--;

             after(grammarAccess.getFunctionReturnAccess().getElementsFunctionReturnElementParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__FunctionReturn__ElementsAssignment_1_1"


    // $ANTLR start "rule__FunctionReturn__ElementsAssignment_1_2_1"
    // InternalKant.g:7594:1: rule__FunctionReturn__ElementsAssignment_1_2_1 : ( ruleFunctionReturnElement ) ;
    public final void rule__FunctionReturn__ElementsAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:7598:1: ( ( ruleFunctionReturnElement ) )
            // InternalKant.g:7599:2: ( ruleFunctionReturnElement )
            {
            // InternalKant.g:7599:2: ( ruleFunctionReturnElement )
            // InternalKant.g:7600:3: ruleFunctionReturnElement
            {
             before(grammarAccess.getFunctionReturnAccess().getElementsFunctionReturnElementParserRuleCall_1_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFunctionReturnElement();

            state._fsp--;

             after(grammarAccess.getFunctionReturnAccess().getElementsFunctionReturnElementParserRuleCall_1_2_1_0()); 

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
    // $ANTLR end "rule__FunctionReturn__ElementsAssignment_1_2_1"


    // $ANTLR start "rule__FunctionReturnElement__NameAssignment_0"
    // InternalKant.g:7609:1: rule__FunctionReturnElement__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__FunctionReturnElement__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:7613:1: ( ( RULE_ID ) )
            // InternalKant.g:7614:2: ( RULE_ID )
            {
            // InternalKant.g:7614:2: ( RULE_ID )
            // InternalKant.g:7615:3: RULE_ID
            {
             before(grammarAccess.getFunctionReturnElementAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFunctionReturnElementAccess().getNameIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__FunctionReturnElement__NameAssignment_0"


    // $ANTLR start "rule__FunctionReturnElement__TypeAssignment_1_1"
    // InternalKant.g:7624:1: rule__FunctionReturnElement__TypeAssignment_1_1 : ( ruleKnowledgeValue ) ;
    public final void rule__FunctionReturnElement__TypeAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:7628:1: ( ( ruleKnowledgeValue ) )
            // InternalKant.g:7629:2: ( ruleKnowledgeValue )
            {
            // InternalKant.g:7629:2: ( ruleKnowledgeValue )
            // InternalKant.g:7630:3: ruleKnowledgeValue
            {
             before(grammarAccess.getFunctionReturnElementAccess().getTypeKnowledgeValueParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleKnowledgeValue();

            state._fsp--;

             after(grammarAccess.getFunctionReturnElementAccess().getTypeKnowledgeValueParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__FunctionReturnElement__TypeAssignment_1_1"


    // $ANTLR start "rule__PropertyDef__PropertyAssignment_1"
    // InternalKant.g:7639:1: rule__PropertyDef__PropertyAssignment_1 : ( ( rule__PropertyDef__PropertyAlternatives_1_0 ) ) ;
    public final void rule__PropertyDef__PropertyAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:7643:1: ( ( ( rule__PropertyDef__PropertyAlternatives_1_0 ) ) )
            // InternalKant.g:7644:2: ( ( rule__PropertyDef__PropertyAlternatives_1_0 ) )
            {
            // InternalKant.g:7644:2: ( ( rule__PropertyDef__PropertyAlternatives_1_0 ) )
            // InternalKant.g:7645:3: ( rule__PropertyDef__PropertyAlternatives_1_0 )
            {
             before(grammarAccess.getPropertyDefAccess().getPropertyAlternatives_1_0()); 
            // InternalKant.g:7646:3: ( rule__PropertyDef__PropertyAlternatives_1_0 )
            // InternalKant.g:7646:4: rule__PropertyDef__PropertyAlternatives_1_0
            {
            pushFollow(FOLLOW_2);
            rule__PropertyDef__PropertyAlternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getPropertyDefAccess().getPropertyAlternatives_1_0()); 

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
    // $ANTLR end "rule__PropertyDef__PropertyAssignment_1"


    // $ANTLR start "rule__KnowledgeEqualityDef__IntroAssignment_0"
    // InternalKant.g:7654:1: rule__KnowledgeEqualityDef__IntroAssignment_0 : ( ruleUniversalIntroduction ) ;
    public final void rule__KnowledgeEqualityDef__IntroAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:7658:1: ( ( ruleUniversalIntroduction ) )
            // InternalKant.g:7659:2: ( ruleUniversalIntroduction )
            {
            // InternalKant.g:7659:2: ( ruleUniversalIntroduction )
            // InternalKant.g:7660:3: ruleUniversalIntroduction
            {
             before(grammarAccess.getKnowledgeEqualityDefAccess().getIntroUniversalIntroductionParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleUniversalIntroduction();

            state._fsp--;

             after(grammarAccess.getKnowledgeEqualityDefAccess().getIntroUniversalIntroductionParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__KnowledgeEqualityDef__IntroAssignment_0"


    // $ANTLR start "rule__KnowledgeEqualityDef__ValueAssignment_1"
    // InternalKant.g:7669:1: rule__KnowledgeEqualityDef__ValueAssignment_1 : ( ruleKnowledgeValue ) ;
    public final void rule__KnowledgeEqualityDef__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:7673:1: ( ( ruleKnowledgeValue ) )
            // InternalKant.g:7674:2: ( ruleKnowledgeValue )
            {
            // InternalKant.g:7674:2: ( ruleKnowledgeValue )
            // InternalKant.g:7675:3: ruleKnowledgeValue
            {
             before(grammarAccess.getKnowledgeEqualityDefAccess().getValueKnowledgeValueParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleKnowledgeValue();

            state._fsp--;

             after(grammarAccess.getKnowledgeEqualityDefAccess().getValueKnowledgeValueParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__KnowledgeEqualityDef__ValueAssignment_1"


    // $ANTLR start "rule__KnowledgeEqualityDef__TargetAssignment_3"
    // InternalKant.g:7684:1: rule__KnowledgeEqualityDef__TargetAssignment_3 : ( ruleKnowledgeValue ) ;
    public final void rule__KnowledgeEqualityDef__TargetAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:7688:1: ( ( ruleKnowledgeValue ) )
            // InternalKant.g:7689:2: ( ruleKnowledgeValue )
            {
            // InternalKant.g:7689:2: ( ruleKnowledgeValue )
            // InternalKant.g:7690:3: ruleKnowledgeValue
            {
             before(grammarAccess.getKnowledgeEqualityDefAccess().getTargetKnowledgeValueParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleKnowledgeValue();

            state._fsp--;

             after(grammarAccess.getKnowledgeEqualityDefAccess().getTargetKnowledgeValueParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__KnowledgeEqualityDef__TargetAssignment_3"


    // $ANTLR start "rule__FunctionInversionDef__InverterAssignment_0"
    // InternalKant.g:7699:1: rule__FunctionInversionDef__InverterAssignment_0 : ( RULE_ID ) ;
    public final void rule__FunctionInversionDef__InverterAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:7703:1: ( ( RULE_ID ) )
            // InternalKant.g:7704:2: ( RULE_ID )
            {
            // InternalKant.g:7704:2: ( RULE_ID )
            // InternalKant.g:7705:3: RULE_ID
            {
             before(grammarAccess.getFunctionInversionDefAccess().getInverterIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFunctionInversionDefAccess().getInverterIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__FunctionInversionDef__InverterAssignment_0"


    // $ANTLR start "rule__FunctionInversionDef__FunctionAssignment_2"
    // InternalKant.g:7714:1: rule__FunctionInversionDef__FunctionAssignment_2 : ( RULE_ID ) ;
    public final void rule__FunctionInversionDef__FunctionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:7718:1: ( ( RULE_ID ) )
            // InternalKant.g:7719:2: ( RULE_ID )
            {
            // InternalKant.g:7719:2: ( RULE_ID )
            // InternalKant.g:7720:3: RULE_ID
            {
             before(grammarAccess.getFunctionInversionDefAccess().getFunctionIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFunctionInversionDefAccess().getFunctionIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__FunctionInversionDef__FunctionAssignment_2"


    // $ANTLR start "rule__KnowledgeBase__SharedAssignment_0"
    // InternalKant.g:7729:1: rule__KnowledgeBase__SharedAssignment_0 : ( ( 'shared' ) ) ;
    public final void rule__KnowledgeBase__SharedAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:7733:1: ( ( ( 'shared' ) ) )
            // InternalKant.g:7734:2: ( ( 'shared' ) )
            {
            // InternalKant.g:7734:2: ( ( 'shared' ) )
            // InternalKant.g:7735:3: ( 'shared' )
            {
             before(grammarAccess.getKnowledgeBaseAccess().getSharedSharedKeyword_0_0()); 
            // InternalKant.g:7736:3: ( 'shared' )
            // InternalKant.g:7737:4: 'shared'
            {
             before(grammarAccess.getKnowledgeBaseAccess().getSharedSharedKeyword_0_0()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getKnowledgeBaseAccess().getSharedSharedKeyword_0_0()); 

            }

             after(grammarAccess.getKnowledgeBaseAccess().getSharedSharedKeyword_0_0()); 

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
    // $ANTLR end "rule__KnowledgeBase__SharedAssignment_0"


    // $ANTLR start "rule__KnowledgeBase__KnowledgeAssignment_2"
    // InternalKant.g:7748:1: rule__KnowledgeBase__KnowledgeAssignment_2 : ( ruleKnowledge ) ;
    public final void rule__KnowledgeBase__KnowledgeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:7752:1: ( ( ruleKnowledge ) )
            // InternalKant.g:7753:2: ( ruleKnowledge )
            {
            // InternalKant.g:7753:2: ( ruleKnowledge )
            // InternalKant.g:7754:3: ruleKnowledge
            {
             before(grammarAccess.getKnowledgeBaseAccess().getKnowledgeKnowledgeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleKnowledge();

            state._fsp--;

             after(grammarAccess.getKnowledgeBaseAccess().getKnowledgeKnowledgeParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__KnowledgeBase__KnowledgeAssignment_2"


    // $ANTLR start "rule__Principal__NameAssignment_1"
    // InternalKant.g:7763:1: rule__Principal__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Principal__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:7767:1: ( ( RULE_ID ) )
            // InternalKant.g:7768:2: ( RULE_ID )
            {
            // InternalKant.g:7768:2: ( RULE_ID )
            // InternalKant.g:7769:3: RULE_ID
            {
             before(grammarAccess.getPrincipalAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPrincipalAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Principal__NameAssignment_1"


    // $ANTLR start "rule__Principal__NameAssignment_2_1"
    // InternalKant.g:7778:1: rule__Principal__NameAssignment_2_1 : ( RULE_ID ) ;
    public final void rule__Principal__NameAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:7782:1: ( ( RULE_ID ) )
            // InternalKant.g:7783:2: ( RULE_ID )
            {
            // InternalKant.g:7783:2: ( RULE_ID )
            // InternalKant.g:7784:3: RULE_ID
            {
             before(grammarAccess.getPrincipalAccess().getNameIDTerminalRuleCall_2_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPrincipalAccess().getNameIDTerminalRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__Principal__NameAssignment_2_1"


    // $ANTLR start "rule__Principal__KnowledgeAssignment_3_1"
    // InternalKant.g:7793:1: rule__Principal__KnowledgeAssignment_3_1 : ( ruleKnowledge ) ;
    public final void rule__Principal__KnowledgeAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:7797:1: ( ( ruleKnowledge ) )
            // InternalKant.g:7798:2: ( ruleKnowledge )
            {
            // InternalKant.g:7798:2: ( ruleKnowledge )
            // InternalKant.g:7799:3: ruleKnowledge
            {
             before(grammarAccess.getPrincipalAccess().getKnowledgeKnowledgeParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleKnowledge();

            state._fsp--;

             after(grammarAccess.getPrincipalAccess().getKnowledgeKnowledgeParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__Principal__KnowledgeAssignment_3_1"


    // $ANTLR start "rule__KnowledgeDef__NameAssignment_0_0_0"
    // InternalKant.g:7808:1: rule__KnowledgeDef__NameAssignment_0_0_0 : ( RULE_ID ) ;
    public final void rule__KnowledgeDef__NameAssignment_0_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:7812:1: ( ( RULE_ID ) )
            // InternalKant.g:7813:2: ( RULE_ID )
            {
            // InternalKant.g:7813:2: ( RULE_ID )
            // InternalKant.g:7814:3: RULE_ID
            {
             before(grammarAccess.getKnowledgeDefAccess().getNameIDTerminalRuleCall_0_0_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getKnowledgeDefAccess().getNameIDTerminalRuleCall_0_0_0_0()); 

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
    // $ANTLR end "rule__KnowledgeDef__NameAssignment_0_0_0"


    // $ANTLR start "rule__KnowledgeDef__ValueAssignment_0_2"
    // InternalKant.g:7823:1: rule__KnowledgeDef__ValueAssignment_0_2 : ( ruleKnowledgeValue ) ;
    public final void rule__KnowledgeDef__ValueAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:7827:1: ( ( ruleKnowledgeValue ) )
            // InternalKant.g:7828:2: ( ruleKnowledgeValue )
            {
            // InternalKant.g:7828:2: ( ruleKnowledgeValue )
            // InternalKant.g:7829:3: ruleKnowledgeValue
            {
             before(grammarAccess.getKnowledgeDefAccess().getValueKnowledgeValueParserRuleCall_0_2_0()); 
            pushFollow(FOLLOW_2);
            ruleKnowledgeValue();

            state._fsp--;

             after(grammarAccess.getKnowledgeDefAccess().getValueKnowledgeValueParserRuleCall_0_2_0()); 

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
    // $ANTLR end "rule__KnowledgeDef__ValueAssignment_0_2"


    // $ANTLR start "rule__KnowledgeDef__NameAssignment_1_1_0"
    // InternalKant.g:7838:1: rule__KnowledgeDef__NameAssignment_1_1_0 : ( RULE_ID ) ;
    public final void rule__KnowledgeDef__NameAssignment_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:7842:1: ( ( RULE_ID ) )
            // InternalKant.g:7843:2: ( RULE_ID )
            {
            // InternalKant.g:7843:2: ( RULE_ID )
            // InternalKant.g:7844:3: RULE_ID
            {
             before(grammarAccess.getKnowledgeDefAccess().getNameIDTerminalRuleCall_1_1_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getKnowledgeDefAccess().getNameIDTerminalRuleCall_1_1_0_0()); 

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
    // $ANTLR end "rule__KnowledgeDef__NameAssignment_1_1_0"


    // $ANTLR start "rule__KnowledgeDef__NameAssignment_1_1_1_1"
    // InternalKant.g:7853:1: rule__KnowledgeDef__NameAssignment_1_1_1_1 : ( RULE_ID ) ;
    public final void rule__KnowledgeDef__NameAssignment_1_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:7857:1: ( ( RULE_ID ) )
            // InternalKant.g:7858:2: ( RULE_ID )
            {
            // InternalKant.g:7858:2: ( RULE_ID )
            // InternalKant.g:7859:3: RULE_ID
            {
             before(grammarAccess.getKnowledgeDefAccess().getNameIDTerminalRuleCall_1_1_1_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getKnowledgeDefAccess().getNameIDTerminalRuleCall_1_1_1_1_0()); 

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
    // $ANTLR end "rule__KnowledgeDef__NameAssignment_1_1_1_1"


    // $ANTLR start "rule__KnowledgeDef__NameAssignment_1_1_1_2_1"
    // InternalKant.g:7868:1: rule__KnowledgeDef__NameAssignment_1_1_1_2_1 : ( RULE_ID ) ;
    public final void rule__KnowledgeDef__NameAssignment_1_1_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:7872:1: ( ( RULE_ID ) )
            // InternalKant.g:7873:2: ( RULE_ID )
            {
            // InternalKant.g:7873:2: ( RULE_ID )
            // InternalKant.g:7874:3: RULE_ID
            {
             before(grammarAccess.getKnowledgeDefAccess().getNameIDTerminalRuleCall_1_1_1_2_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getKnowledgeDefAccess().getNameIDTerminalRuleCall_1_1_1_2_1_0()); 

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
    // $ANTLR end "rule__KnowledgeDef__NameAssignment_1_1_1_2_1"


    // $ANTLR start "rule__KnowledgeDefSetDestructuring__AssignmentsAssignment_2_0"
    // InternalKant.g:7883:1: rule__KnowledgeDefSetDestructuring__AssignmentsAssignment_2_0 : ( ruleKnowledgeDefSetDesctructuringAssignment ) ;
    public final void rule__KnowledgeDefSetDestructuring__AssignmentsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:7887:1: ( ( ruleKnowledgeDefSetDesctructuringAssignment ) )
            // InternalKant.g:7888:2: ( ruleKnowledgeDefSetDesctructuringAssignment )
            {
            // InternalKant.g:7888:2: ( ruleKnowledgeDefSetDesctructuringAssignment )
            // InternalKant.g:7889:3: ruleKnowledgeDefSetDesctructuringAssignment
            {
             before(grammarAccess.getKnowledgeDefSetDestructuringAccess().getAssignmentsKnowledgeDefSetDesctructuringAssignmentParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleKnowledgeDefSetDesctructuringAssignment();

            state._fsp--;

             after(grammarAccess.getKnowledgeDefSetDestructuringAccess().getAssignmentsKnowledgeDefSetDesctructuringAssignmentParserRuleCall_2_0_0()); 

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
    // $ANTLR end "rule__KnowledgeDefSetDestructuring__AssignmentsAssignment_2_0"


    // $ANTLR start "rule__KnowledgeDefSetDestructuring__AssignmentsAssignment_2_1_1"
    // InternalKant.g:7898:1: rule__KnowledgeDefSetDestructuring__AssignmentsAssignment_2_1_1 : ( ruleKnowledgeDefSetDesctructuringAssignment ) ;
    public final void rule__KnowledgeDefSetDestructuring__AssignmentsAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:7902:1: ( ( ruleKnowledgeDefSetDesctructuringAssignment ) )
            // InternalKant.g:7903:2: ( ruleKnowledgeDefSetDesctructuringAssignment )
            {
            // InternalKant.g:7903:2: ( ruleKnowledgeDefSetDesctructuringAssignment )
            // InternalKant.g:7904:3: ruleKnowledgeDefSetDesctructuringAssignment
            {
             before(grammarAccess.getKnowledgeDefSetDestructuringAccess().getAssignmentsKnowledgeDefSetDesctructuringAssignmentParserRuleCall_2_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleKnowledgeDefSetDesctructuringAssignment();

            state._fsp--;

             after(grammarAccess.getKnowledgeDefSetDestructuringAccess().getAssignmentsKnowledgeDefSetDesctructuringAssignmentParserRuleCall_2_1_1_0()); 

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
    // $ANTLR end "rule__KnowledgeDefSetDestructuring__AssignmentsAssignment_2_1_1"


    // $ANTLR start "rule__KnowledgeDefSetDesctructuringAssignment__NameAssignment_0"
    // InternalKant.g:7913:1: rule__KnowledgeDefSetDesctructuringAssignment__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__KnowledgeDefSetDesctructuringAssignment__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:7917:1: ( ( RULE_ID ) )
            // InternalKant.g:7918:2: ( RULE_ID )
            {
            // InternalKant.g:7918:2: ( RULE_ID )
            // InternalKant.g:7919:3: RULE_ID
            {
             before(grammarAccess.getKnowledgeDefSetDesctructuringAssignmentAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getKnowledgeDefSetDesctructuringAssignmentAccess().getNameIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__KnowledgeDefSetDesctructuringAssignment__NameAssignment_0"


    // $ANTLR start "rule__KnowledgeDefSetDesctructuringAssignment__FromAssignment_1_1"
    // InternalKant.g:7928:1: rule__KnowledgeDefSetDesctructuringAssignment__FromAssignment_1_1 : ( RULE_ID ) ;
    public final void rule__KnowledgeDefSetDesctructuringAssignment__FromAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:7932:1: ( ( RULE_ID ) )
            // InternalKant.g:7933:2: ( RULE_ID )
            {
            // InternalKant.g:7933:2: ( RULE_ID )
            // InternalKant.g:7934:3: RULE_ID
            {
             before(grammarAccess.getKnowledgeDefSetDesctructuringAssignmentAccess().getFromIDTerminalRuleCall_1_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getKnowledgeDefSetDesctructuringAssignmentAccess().getFromIDTerminalRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__KnowledgeDefSetDesctructuringAssignment__FromAssignment_1_1"


    // $ANTLR start "rule__KnowledgeDefListDestructuring__AssignmentsAssignment_2_0"
    // InternalKant.g:7943:1: rule__KnowledgeDefListDestructuring__AssignmentsAssignment_2_0 : ( ruleKnowledgeDefListDesctructuringAssignment ) ;
    public final void rule__KnowledgeDefListDestructuring__AssignmentsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:7947:1: ( ( ruleKnowledgeDefListDesctructuringAssignment ) )
            // InternalKant.g:7948:2: ( ruleKnowledgeDefListDesctructuringAssignment )
            {
            // InternalKant.g:7948:2: ( ruleKnowledgeDefListDesctructuringAssignment )
            // InternalKant.g:7949:3: ruleKnowledgeDefListDesctructuringAssignment
            {
             before(grammarAccess.getKnowledgeDefListDestructuringAccess().getAssignmentsKnowledgeDefListDesctructuringAssignmentParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleKnowledgeDefListDesctructuringAssignment();

            state._fsp--;

             after(grammarAccess.getKnowledgeDefListDestructuringAccess().getAssignmentsKnowledgeDefListDesctructuringAssignmentParserRuleCall_2_0_0()); 

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
    // $ANTLR end "rule__KnowledgeDefListDestructuring__AssignmentsAssignment_2_0"


    // $ANTLR start "rule__KnowledgeDefListDestructuring__AssignmentsAssignment_2_1_1"
    // InternalKant.g:7958:1: rule__KnowledgeDefListDestructuring__AssignmentsAssignment_2_1_1 : ( ruleKnowledgeDefListDesctructuringAssignment ) ;
    public final void rule__KnowledgeDefListDestructuring__AssignmentsAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:7962:1: ( ( ruleKnowledgeDefListDesctructuringAssignment ) )
            // InternalKant.g:7963:2: ( ruleKnowledgeDefListDesctructuringAssignment )
            {
            // InternalKant.g:7963:2: ( ruleKnowledgeDefListDesctructuringAssignment )
            // InternalKant.g:7964:3: ruleKnowledgeDefListDesctructuringAssignment
            {
             before(grammarAccess.getKnowledgeDefListDestructuringAccess().getAssignmentsKnowledgeDefListDesctructuringAssignmentParserRuleCall_2_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleKnowledgeDefListDesctructuringAssignment();

            state._fsp--;

             after(grammarAccess.getKnowledgeDefListDestructuringAccess().getAssignmentsKnowledgeDefListDesctructuringAssignmentParserRuleCall_2_1_1_0()); 

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
    // $ANTLR end "rule__KnowledgeDefListDestructuring__AssignmentsAssignment_2_1_1"


    // $ANTLR start "rule__KnowledgeDefListDesctructuringAssignment__NameAssignment_2"
    // InternalKant.g:7973:1: rule__KnowledgeDefListDesctructuringAssignment__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__KnowledgeDefListDesctructuringAssignment__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:7977:1: ( ( RULE_ID ) )
            // InternalKant.g:7978:2: ( RULE_ID )
            {
            // InternalKant.g:7978:2: ( RULE_ID )
            // InternalKant.g:7979:3: RULE_ID
            {
             before(grammarAccess.getKnowledgeDefListDesctructuringAssignmentAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getKnowledgeDefListDesctructuringAssignmentAccess().getNameIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__KnowledgeDefListDesctructuringAssignment__NameAssignment_2"


    // $ANTLR start "rule__KnowledgeList__ValuesAssignment_2_0"
    // InternalKant.g:7988:1: rule__KnowledgeList__ValuesAssignment_2_0 : ( ( rule__KnowledgeList__ValuesAlternatives_2_0_0 ) ) ;
    public final void rule__KnowledgeList__ValuesAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:7992:1: ( ( ( rule__KnowledgeList__ValuesAlternatives_2_0_0 ) ) )
            // InternalKant.g:7993:2: ( ( rule__KnowledgeList__ValuesAlternatives_2_0_0 ) )
            {
            // InternalKant.g:7993:2: ( ( rule__KnowledgeList__ValuesAlternatives_2_0_0 ) )
            // InternalKant.g:7994:3: ( rule__KnowledgeList__ValuesAlternatives_2_0_0 )
            {
             before(grammarAccess.getKnowledgeListAccess().getValuesAlternatives_2_0_0()); 
            // InternalKant.g:7995:3: ( rule__KnowledgeList__ValuesAlternatives_2_0_0 )
            // InternalKant.g:7995:4: rule__KnowledgeList__ValuesAlternatives_2_0_0
            {
            pushFollow(FOLLOW_2);
            rule__KnowledgeList__ValuesAlternatives_2_0_0();

            state._fsp--;


            }

             after(grammarAccess.getKnowledgeListAccess().getValuesAlternatives_2_0_0()); 

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
    // $ANTLR end "rule__KnowledgeList__ValuesAssignment_2_0"


    // $ANTLR start "rule__KnowledgeList__ValuesAssignment_2_1_1"
    // InternalKant.g:8003:1: rule__KnowledgeList__ValuesAssignment_2_1_1 : ( ( rule__KnowledgeList__ValuesAlternatives_2_1_1_0 ) ) ;
    public final void rule__KnowledgeList__ValuesAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:8007:1: ( ( ( rule__KnowledgeList__ValuesAlternatives_2_1_1_0 ) ) )
            // InternalKant.g:8008:2: ( ( rule__KnowledgeList__ValuesAlternatives_2_1_1_0 ) )
            {
            // InternalKant.g:8008:2: ( ( rule__KnowledgeList__ValuesAlternatives_2_1_1_0 ) )
            // InternalKant.g:8009:3: ( rule__KnowledgeList__ValuesAlternatives_2_1_1_0 )
            {
             before(grammarAccess.getKnowledgeListAccess().getValuesAlternatives_2_1_1_0()); 
            // InternalKant.g:8010:3: ( rule__KnowledgeList__ValuesAlternatives_2_1_1_0 )
            // InternalKant.g:8010:4: rule__KnowledgeList__ValuesAlternatives_2_1_1_0
            {
            pushFollow(FOLLOW_2);
            rule__KnowledgeList__ValuesAlternatives_2_1_1_0();

            state._fsp--;


            }

             after(grammarAccess.getKnowledgeListAccess().getValuesAlternatives_2_1_1_0()); 

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
    // $ANTLR end "rule__KnowledgeList__ValuesAssignment_2_1_1"


    // $ANTLR start "rule__KnowledgeRef__RefAssignment_0"
    // InternalKant.g:8018:1: rule__KnowledgeRef__RefAssignment_0 : ( RULE_ID ) ;
    public final void rule__KnowledgeRef__RefAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:8022:1: ( ( RULE_ID ) )
            // InternalKant.g:8023:2: ( RULE_ID )
            {
            // InternalKant.g:8023:2: ( RULE_ID )
            // InternalKant.g:8024:3: RULE_ID
            {
             before(grammarAccess.getKnowledgeRefAccess().getRefIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getKnowledgeRefAccess().getRefIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__KnowledgeRef__RefAssignment_0"


    // $ANTLR start "rule__KnowledgeRef__AccessAssignment_1_1"
    // InternalKant.g:8033:1: rule__KnowledgeRef__AccessAssignment_1_1 : ( RULE_ID ) ;
    public final void rule__KnowledgeRef__AccessAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:8037:1: ( ( RULE_ID ) )
            // InternalKant.g:8038:2: ( RULE_ID )
            {
            // InternalKant.g:8038:2: ( RULE_ID )
            // InternalKant.g:8039:3: RULE_ID
            {
             before(grammarAccess.getKnowledgeRefAccess().getAccessIDTerminalRuleCall_1_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getKnowledgeRefAccess().getAccessIDTerminalRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__KnowledgeRef__AccessAssignment_1_1"


    // $ANTLR start "rule__KnowledgeSet__ContentAssignment_2_0"
    // InternalKant.g:8048:1: rule__KnowledgeSet__ContentAssignment_2_0 : ( ( rule__KnowledgeSet__ContentAlternatives_2_0_0 ) ) ;
    public final void rule__KnowledgeSet__ContentAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:8052:1: ( ( ( rule__KnowledgeSet__ContentAlternatives_2_0_0 ) ) )
            // InternalKant.g:8053:2: ( ( rule__KnowledgeSet__ContentAlternatives_2_0_0 ) )
            {
            // InternalKant.g:8053:2: ( ( rule__KnowledgeSet__ContentAlternatives_2_0_0 ) )
            // InternalKant.g:8054:3: ( rule__KnowledgeSet__ContentAlternatives_2_0_0 )
            {
             before(grammarAccess.getKnowledgeSetAccess().getContentAlternatives_2_0_0()); 
            // InternalKant.g:8055:3: ( rule__KnowledgeSet__ContentAlternatives_2_0_0 )
            // InternalKant.g:8055:4: rule__KnowledgeSet__ContentAlternatives_2_0_0
            {
            pushFollow(FOLLOW_2);
            rule__KnowledgeSet__ContentAlternatives_2_0_0();

            state._fsp--;


            }

             after(grammarAccess.getKnowledgeSetAccess().getContentAlternatives_2_0_0()); 

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
    // $ANTLR end "rule__KnowledgeSet__ContentAssignment_2_0"


    // $ANTLR start "rule__KnowledgeSet__ContentAssignment_2_1_1"
    // InternalKant.g:8063:1: rule__KnowledgeSet__ContentAssignment_2_1_1 : ( ( rule__KnowledgeSet__ContentAlternatives_2_1_1_0 ) ) ;
    public final void rule__KnowledgeSet__ContentAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:8067:1: ( ( ( rule__KnowledgeSet__ContentAlternatives_2_1_1_0 ) ) )
            // InternalKant.g:8068:2: ( ( rule__KnowledgeSet__ContentAlternatives_2_1_1_0 ) )
            {
            // InternalKant.g:8068:2: ( ( rule__KnowledgeSet__ContentAlternatives_2_1_1_0 ) )
            // InternalKant.g:8069:3: ( rule__KnowledgeSet__ContentAlternatives_2_1_1_0 )
            {
             before(grammarAccess.getKnowledgeSetAccess().getContentAlternatives_2_1_1_0()); 
            // InternalKant.g:8070:3: ( rule__KnowledgeSet__ContentAlternatives_2_1_1_0 )
            // InternalKant.g:8070:4: rule__KnowledgeSet__ContentAlternatives_2_1_1_0
            {
            pushFollow(FOLLOW_2);
            rule__KnowledgeSet__ContentAlternatives_2_1_1_0();

            state._fsp--;


            }

             after(grammarAccess.getKnowledgeSetAccess().getContentAlternatives_2_1_1_0()); 

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
    // $ANTLR end "rule__KnowledgeSet__ContentAssignment_2_1_1"


    // $ANTLR start "rule__KnowledgeSpreading__RefAssignment_1"
    // InternalKant.g:8078:1: rule__KnowledgeSpreading__RefAssignment_1 : ( ( rule__KnowledgeSpreading__RefAlternatives_1_0 ) ) ;
    public final void rule__KnowledgeSpreading__RefAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:8082:1: ( ( ( rule__KnowledgeSpreading__RefAlternatives_1_0 ) ) )
            // InternalKant.g:8083:2: ( ( rule__KnowledgeSpreading__RefAlternatives_1_0 ) )
            {
            // InternalKant.g:8083:2: ( ( rule__KnowledgeSpreading__RefAlternatives_1_0 ) )
            // InternalKant.g:8084:3: ( rule__KnowledgeSpreading__RefAlternatives_1_0 )
            {
             before(grammarAccess.getKnowledgeSpreadingAccess().getRefAlternatives_1_0()); 
            // InternalKant.g:8085:3: ( rule__KnowledgeSpreading__RefAlternatives_1_0 )
            // InternalKant.g:8085:4: rule__KnowledgeSpreading__RefAlternatives_1_0
            {
            pushFollow(FOLLOW_2);
            rule__KnowledgeSpreading__RefAlternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getKnowledgeSpreadingAccess().getRefAlternatives_1_0()); 

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
    // $ANTLR end "rule__KnowledgeSpreading__RefAssignment_1"


    // $ANTLR start "rule__KnowledgeGenerator__TypeAssignment_1"
    // InternalKant.g:8093:1: rule__KnowledgeGenerator__TypeAssignment_1 : ( RULE_STRING ) ;
    public final void rule__KnowledgeGenerator__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:8097:1: ( ( RULE_STRING ) )
            // InternalKant.g:8098:2: ( RULE_STRING )
            {
            // InternalKant.g:8098:2: ( RULE_STRING )
            // InternalKant.g:8099:3: RULE_STRING
            {
             before(grammarAccess.getKnowledgeGeneratorAccess().getTypeSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getKnowledgeGeneratorAccess().getTypeSTRINGTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__KnowledgeGenerator__TypeAssignment_1"


    // $ANTLR start "rule__KnowledgeFromFunction__NameAssignment_0"
    // InternalKant.g:8108:1: rule__KnowledgeFromFunction__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__KnowledgeFromFunction__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:8112:1: ( ( RULE_ID ) )
            // InternalKant.g:8113:2: ( RULE_ID )
            {
            // InternalKant.g:8113:2: ( RULE_ID )
            // InternalKant.g:8114:3: RULE_ID
            {
             before(grammarAccess.getKnowledgeFromFunctionAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getKnowledgeFromFunctionAccess().getNameIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__KnowledgeFromFunction__NameAssignment_0"


    // $ANTLR start "rule__KnowledgeFromFunction__ArgsAssignment_2"
    // InternalKant.g:8123:1: rule__KnowledgeFromFunction__ArgsAssignment_2 : ( ruleKnowledgeFromFunctionArg ) ;
    public final void rule__KnowledgeFromFunction__ArgsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:8127:1: ( ( ruleKnowledgeFromFunctionArg ) )
            // InternalKant.g:8128:2: ( ruleKnowledgeFromFunctionArg )
            {
            // InternalKant.g:8128:2: ( ruleKnowledgeFromFunctionArg )
            // InternalKant.g:8129:3: ruleKnowledgeFromFunctionArg
            {
             before(grammarAccess.getKnowledgeFromFunctionAccess().getArgsKnowledgeFromFunctionArgParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleKnowledgeFromFunctionArg();

            state._fsp--;

             after(grammarAccess.getKnowledgeFromFunctionAccess().getArgsKnowledgeFromFunctionArgParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__KnowledgeFromFunction__ArgsAssignment_2"


    // $ANTLR start "rule__KnowledgeFromFunction__KeyAssignment_4_1"
    // InternalKant.g:8138:1: rule__KnowledgeFromFunction__KeyAssignment_4_1 : ( ruleKnowledgeValue ) ;
    public final void rule__KnowledgeFromFunction__KeyAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:8142:1: ( ( ruleKnowledgeValue ) )
            // InternalKant.g:8143:2: ( ruleKnowledgeValue )
            {
            // InternalKant.g:8143:2: ( ruleKnowledgeValue )
            // InternalKant.g:8144:3: ruleKnowledgeValue
            {
             before(grammarAccess.getKnowledgeFromFunctionAccess().getKeyKnowledgeValueParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleKnowledgeValue();

            state._fsp--;

             after(grammarAccess.getKnowledgeFromFunctionAccess().getKeyKnowledgeValueParserRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__KnowledgeFromFunction__KeyAssignment_4_1"


    // $ANTLR start "rule__KnowledgeFromFunctionArg__ArgsAssignment_0_0"
    // InternalKant.g:8153:1: rule__KnowledgeFromFunctionArg__ArgsAssignment_0_0 : ( ruleKnowledgeValue ) ;
    public final void rule__KnowledgeFromFunctionArg__ArgsAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:8157:1: ( ( ruleKnowledgeValue ) )
            // InternalKant.g:8158:2: ( ruleKnowledgeValue )
            {
            // InternalKant.g:8158:2: ( ruleKnowledgeValue )
            // InternalKant.g:8159:3: ruleKnowledgeValue
            {
             before(grammarAccess.getKnowledgeFromFunctionArgAccess().getArgsKnowledgeValueParserRuleCall_0_0_0()); 
            pushFollow(FOLLOW_2);
            ruleKnowledgeValue();

            state._fsp--;

             after(grammarAccess.getKnowledgeFromFunctionArgAccess().getArgsKnowledgeValueParserRuleCall_0_0_0()); 

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
    // $ANTLR end "rule__KnowledgeFromFunctionArg__ArgsAssignment_0_0"


    // $ANTLR start "rule__KnowledgeFromFunctionArg__ArgsAssignment_0_1_1"
    // InternalKant.g:8168:1: rule__KnowledgeFromFunctionArg__ArgsAssignment_0_1_1 : ( ruleKnowledgeValue ) ;
    public final void rule__KnowledgeFromFunctionArg__ArgsAssignment_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:8172:1: ( ( ruleKnowledgeValue ) )
            // InternalKant.g:8173:2: ( ruleKnowledgeValue )
            {
            // InternalKant.g:8173:2: ( ruleKnowledgeValue )
            // InternalKant.g:8174:3: ruleKnowledgeValue
            {
             before(grammarAccess.getKnowledgeFromFunctionArgAccess().getArgsKnowledgeValueParserRuleCall_0_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleKnowledgeValue();

            state._fsp--;

             after(grammarAccess.getKnowledgeFromFunctionArgAccess().getArgsKnowledgeValueParserRuleCall_0_1_1_0()); 

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
    // $ANTLR end "rule__KnowledgeFromFunctionArg__ArgsAssignment_0_1_1"


    // $ANTLR start "rule__Communication__FromAssignment_0"
    // InternalKant.g:8183:1: rule__Communication__FromAssignment_0 : ( RULE_ID ) ;
    public final void rule__Communication__FromAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:8187:1: ( ( RULE_ID ) )
            // InternalKant.g:8188:2: ( RULE_ID )
            {
            // InternalKant.g:8188:2: ( RULE_ID )
            // InternalKant.g:8189:3: RULE_ID
            {
             before(grammarAccess.getCommunicationAccess().getFromIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCommunicationAccess().getFromIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__Communication__FromAssignment_0"


    // $ANTLR start "rule__Communication__FromAssignment_1_1"
    // InternalKant.g:8198:1: rule__Communication__FromAssignment_1_1 : ( RULE_ID ) ;
    public final void rule__Communication__FromAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:8202:1: ( ( RULE_ID ) )
            // InternalKant.g:8203:2: ( RULE_ID )
            {
            // InternalKant.g:8203:2: ( RULE_ID )
            // InternalKant.g:8204:3: RULE_ID
            {
             before(grammarAccess.getCommunicationAccess().getFromIDTerminalRuleCall_1_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCommunicationAccess().getFromIDTerminalRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__Communication__FromAssignment_1_1"


    // $ANTLR start "rule__Communication__ToAssignment_3"
    // InternalKant.g:8213:1: rule__Communication__ToAssignment_3 : ( RULE_ID ) ;
    public final void rule__Communication__ToAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:8217:1: ( ( RULE_ID ) )
            // InternalKant.g:8218:2: ( RULE_ID )
            {
            // InternalKant.g:8218:2: ( RULE_ID )
            // InternalKant.g:8219:3: RULE_ID
            {
             before(grammarAccess.getCommunicationAccess().getToIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCommunicationAccess().getToIDTerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__Communication__ToAssignment_3"


    // $ANTLR start "rule__Communication__ToAssignment_4_1"
    // InternalKant.g:8228:1: rule__Communication__ToAssignment_4_1 : ( RULE_ID ) ;
    public final void rule__Communication__ToAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:8232:1: ( ( RULE_ID ) )
            // InternalKant.g:8233:2: ( RULE_ID )
            {
            // InternalKant.g:8233:2: ( RULE_ID )
            // InternalKant.g:8234:3: RULE_ID
            {
             before(grammarAccess.getCommunicationAccess().getToIDTerminalRuleCall_4_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCommunicationAccess().getToIDTerminalRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__Communication__ToAssignment_4_1"


    // $ANTLR start "rule__Communication__KnowledgeAssignment_6"
    // InternalKant.g:8243:1: rule__Communication__KnowledgeAssignment_6 : ( ruleKnowledge ) ;
    public final void rule__Communication__KnowledgeAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:8247:1: ( ( ruleKnowledge ) )
            // InternalKant.g:8248:2: ( ruleKnowledge )
            {
            // InternalKant.g:8248:2: ( ruleKnowledge )
            // InternalKant.g:8249:3: ruleKnowledge
            {
             before(grammarAccess.getCommunicationAccess().getKnowledgeKnowledgeParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleKnowledge();

            state._fsp--;

             after(grammarAccess.getCommunicationAccess().getKnowledgeKnowledgeParserRuleCall_6_0()); 

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
    // $ANTLR end "rule__Communication__KnowledgeAssignment_6"


    // $ANTLR start "rule__ScenarioOptional__ScenarioAssignment_1"
    // InternalKant.g:8258:1: rule__ScenarioOptional__ScenarioAssignment_1 : ( ruleScenario ) ;
    public final void rule__ScenarioOptional__ScenarioAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:8262:1: ( ( ruleScenario ) )
            // InternalKant.g:8263:2: ( ruleScenario )
            {
            // InternalKant.g:8263:2: ( ruleScenario )
            // InternalKant.g:8264:3: ruleScenario
            {
             before(grammarAccess.getScenarioOptionalAccess().getScenarioScenarioParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleScenario();

            state._fsp--;

             after(grammarAccess.getScenarioOptionalAccess().getScenarioScenarioParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__ScenarioOptional__ScenarioAssignment_1"


    // $ANTLR start "rule__ScenarioAlternatives__ScenarioAssignment_1_1"
    // InternalKant.g:8273:1: rule__ScenarioAlternatives__ScenarioAssignment_1_1 : ( ruleScenario ) ;
    public final void rule__ScenarioAlternatives__ScenarioAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:8277:1: ( ( ruleScenario ) )
            // InternalKant.g:8278:2: ( ruleScenario )
            {
            // InternalKant.g:8278:2: ( ruleScenario )
            // InternalKant.g:8279:3: ruleScenario
            {
             before(grammarAccess.getScenarioAlternativesAccess().getScenarioScenarioParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleScenario();

            state._fsp--;

             after(grammarAccess.getScenarioAlternativesAccess().getScenarioScenarioParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__ScenarioAlternatives__ScenarioAssignment_1_1"


    // $ANTLR start "rule__ScenarioAlternatives__ScenarioAssignment_2_1"
    // InternalKant.g:8288:1: rule__ScenarioAlternatives__ScenarioAssignment_2_1 : ( ruleScenario ) ;
    public final void rule__ScenarioAlternatives__ScenarioAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:8292:1: ( ( ruleScenario ) )
            // InternalKant.g:8293:2: ( ruleScenario )
            {
            // InternalKant.g:8293:2: ( ruleScenario )
            // InternalKant.g:8294:3: ruleScenario
            {
             before(grammarAccess.getScenarioAlternativesAccess().getScenarioScenarioParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleScenario();

            state._fsp--;

             after(grammarAccess.getScenarioAlternativesAccess().getScenarioScenarioParserRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__ScenarioAlternatives__ScenarioAssignment_2_1"


    // $ANTLR start "rule__Scenario__NameAssignment_0"
    // InternalKant.g:8303:1: rule__Scenario__NameAssignment_0 : ( RULE_STRING ) ;
    public final void rule__Scenario__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:8307:1: ( ( RULE_STRING ) )
            // InternalKant.g:8308:2: ( RULE_STRING )
            {
            // InternalKant.g:8308:2: ( RULE_STRING )
            // InternalKant.g:8309:3: RULE_STRING
            {
             before(grammarAccess.getScenarioAccess().getNameSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getScenarioAccess().getNameSTRINGTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__Scenario__NameAssignment_0"


    // $ANTLR start "rule__Scenario__ElementsAssignment_2"
    // InternalKant.g:8318:1: rule__Scenario__ElementsAssignment_2 : ( ruleElement ) ;
    public final void rule__Scenario__ElementsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:8322:1: ( ( ruleElement ) )
            // InternalKant.g:8323:2: ( ruleElement )
            {
            // InternalKant.g:8323:2: ( ruleElement )
            // InternalKant.g:8324:3: ruleElement
            {
             before(grammarAccess.getScenarioAccess().getElementsElementParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleElement();

            state._fsp--;

             after(grammarAccess.getScenarioAccess().getElementsElementParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Scenario__ElementsAssignment_2"


    // $ANTLR start "rule__KnowledgeCheck__HereAssignment_0"
    // InternalKant.g:8333:1: rule__KnowledgeCheck__HereAssignment_0 : ( ( 'here' ) ) ;
    public final void rule__KnowledgeCheck__HereAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:8337:1: ( ( ( 'here' ) ) )
            // InternalKant.g:8338:2: ( ( 'here' ) )
            {
            // InternalKant.g:8338:2: ( ( 'here' ) )
            // InternalKant.g:8339:3: ( 'here' )
            {
             before(grammarAccess.getKnowledgeCheckAccess().getHereHereKeyword_0_0()); 
            // InternalKant.g:8340:3: ( 'here' )
            // InternalKant.g:8341:4: 'here'
            {
             before(grammarAccess.getKnowledgeCheckAccess().getHereHereKeyword_0_0()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getKnowledgeCheckAccess().getHereHereKeyword_0_0()); 

            }

             after(grammarAccess.getKnowledgeCheckAccess().getHereHereKeyword_0_0()); 

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
    // $ANTLR end "rule__KnowledgeCheck__HereAssignment_0"


    // $ANTLR start "rule__KnowledgeCheck__OnlyAssignment_1"
    // InternalKant.g:8352:1: rule__KnowledgeCheck__OnlyAssignment_1 : ( ( 'only' ) ) ;
    public final void rule__KnowledgeCheck__OnlyAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:8356:1: ( ( ( 'only' ) ) )
            // InternalKant.g:8357:2: ( ( 'only' ) )
            {
            // InternalKant.g:8357:2: ( ( 'only' ) )
            // InternalKant.g:8358:3: ( 'only' )
            {
             before(grammarAccess.getKnowledgeCheckAccess().getOnlyOnlyKeyword_1_0()); 
            // InternalKant.g:8359:3: ( 'only' )
            // InternalKant.g:8360:4: 'only'
            {
             before(grammarAccess.getKnowledgeCheckAccess().getOnlyOnlyKeyword_1_0()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getKnowledgeCheckAccess().getOnlyOnlyKeyword_1_0()); 

            }

             after(grammarAccess.getKnowledgeCheckAccess().getOnlyOnlyKeyword_1_0()); 

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
    // $ANTLR end "rule__KnowledgeCheck__OnlyAssignment_1"


    // $ANTLR start "rule__KnowledgeCheck__TargetAssignment_2_0"
    // InternalKant.g:8371:1: rule__KnowledgeCheck__TargetAssignment_2_0 : ( RULE_ID ) ;
    public final void rule__KnowledgeCheck__TargetAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:8375:1: ( ( RULE_ID ) )
            // InternalKant.g:8376:2: ( RULE_ID )
            {
            // InternalKant.g:8376:2: ( RULE_ID )
            // InternalKant.g:8377:3: RULE_ID
            {
             before(grammarAccess.getKnowledgeCheckAccess().getTargetIDTerminalRuleCall_2_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getKnowledgeCheckAccess().getTargetIDTerminalRuleCall_2_0_0()); 

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
    // $ANTLR end "rule__KnowledgeCheck__TargetAssignment_2_0"


    // $ANTLR start "rule__KnowledgeCheck__TargetAssignment_2_1_1"
    // InternalKant.g:8386:1: rule__KnowledgeCheck__TargetAssignment_2_1_1 : ( RULE_ID ) ;
    public final void rule__KnowledgeCheck__TargetAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:8390:1: ( ( RULE_ID ) )
            // InternalKant.g:8391:2: ( RULE_ID )
            {
            // InternalKant.g:8391:2: ( RULE_ID )
            // InternalKant.g:8392:3: RULE_ID
            {
             before(grammarAccess.getKnowledgeCheckAccess().getTargetIDTerminalRuleCall_2_1_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getKnowledgeCheckAccess().getTargetIDTerminalRuleCall_2_1_1_0()); 

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
    // $ANTLR end "rule__KnowledgeCheck__TargetAssignment_2_1_1"


    // $ANTLR start "rule__KnowledgeCheck__NotAssignment_3_1"
    // InternalKant.g:8401:1: rule__KnowledgeCheck__NotAssignment_3_1 : ( ( 'not' ) ) ;
    public final void rule__KnowledgeCheck__NotAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:8405:1: ( ( ( 'not' ) ) )
            // InternalKant.g:8406:2: ( ( 'not' ) )
            {
            // InternalKant.g:8406:2: ( ( 'not' ) )
            // InternalKant.g:8407:3: ( 'not' )
            {
             before(grammarAccess.getKnowledgeCheckAccess().getNotNotKeyword_3_1_0()); 
            // InternalKant.g:8408:3: ( 'not' )
            // InternalKant.g:8409:4: 'not'
            {
             before(grammarAccess.getKnowledgeCheckAccess().getNotNotKeyword_3_1_0()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getKnowledgeCheckAccess().getNotNotKeyword_3_1_0()); 

            }

             after(grammarAccess.getKnowledgeCheckAccess().getNotNotKeyword_3_1_0()); 

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
    // $ANTLR end "rule__KnowledgeCheck__NotAssignment_3_1"


    // $ANTLR start "rule__KnowledgeCheck__KnowledgeAssignment_4"
    // InternalKant.g:8420:1: rule__KnowledgeCheck__KnowledgeAssignment_4 : ( ruleKnowledgeValue ) ;
    public final void rule__KnowledgeCheck__KnowledgeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:8424:1: ( ( ruleKnowledgeValue ) )
            // InternalKant.g:8425:2: ( ruleKnowledgeValue )
            {
            // InternalKant.g:8425:2: ( ruleKnowledgeValue )
            // InternalKant.g:8426:3: ruleKnowledgeValue
            {
             before(grammarAccess.getKnowledgeCheckAccess().getKnowledgeKnowledgeValueParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleKnowledgeValue();

            state._fsp--;

             after(grammarAccess.getKnowledgeCheckAccess().getKnowledgeKnowledgeValueParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__KnowledgeCheck__KnowledgeAssignment_4"


    // $ANTLR start "rule__EqualityCheck__KnowledgeAssignment_0"
    // InternalKant.g:8435:1: rule__EqualityCheck__KnowledgeAssignment_0 : ( ruleKnowledgeRef ) ;
    public final void rule__EqualityCheck__KnowledgeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:8439:1: ( ( ruleKnowledgeRef ) )
            // InternalKant.g:8440:2: ( ruleKnowledgeRef )
            {
            // InternalKant.g:8440:2: ( ruleKnowledgeRef )
            // InternalKant.g:8441:3: ruleKnowledgeRef
            {
             before(grammarAccess.getEqualityCheckAccess().getKnowledgeKnowledgeRefParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleKnowledgeRef();

            state._fsp--;

             after(grammarAccess.getEqualityCheckAccess().getKnowledgeKnowledgeRefParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__EqualityCheck__KnowledgeAssignment_0"


    // $ANTLR start "rule__EqualityCheck__KnowledgeAssignment_1_1"
    // InternalKant.g:8450:1: rule__EqualityCheck__KnowledgeAssignment_1_1 : ( ruleKnowledgeRef ) ;
    public final void rule__EqualityCheck__KnowledgeAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:8454:1: ( ( ruleKnowledgeRef ) )
            // InternalKant.g:8455:2: ( ruleKnowledgeRef )
            {
            // InternalKant.g:8455:2: ( ruleKnowledgeRef )
            // InternalKant.g:8456:3: ruleKnowledgeRef
            {
             before(grammarAccess.getEqualityCheckAccess().getKnowledgeKnowledgeRefParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleKnowledgeRef();

            state._fsp--;

             after(grammarAccess.getEqualityCheckAccess().getKnowledgeKnowledgeRefParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__EqualityCheck__KnowledgeAssignment_1_1"


    // $ANTLR start "rule__EqualityCheck__NotAssignment_3"
    // InternalKant.g:8465:1: rule__EqualityCheck__NotAssignment_3 : ( ( 'not' ) ) ;
    public final void rule__EqualityCheck__NotAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:8469:1: ( ( ( 'not' ) ) )
            // InternalKant.g:8470:2: ( ( 'not' ) )
            {
            // InternalKant.g:8470:2: ( ( 'not' ) )
            // InternalKant.g:8471:3: ( 'not' )
            {
             before(grammarAccess.getEqualityCheckAccess().getNotNotKeyword_3_0()); 
            // InternalKant.g:8472:3: ( 'not' )
            // InternalKant.g:8473:4: 'not'
            {
             before(grammarAccess.getEqualityCheckAccess().getNotNotKeyword_3_0()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getEqualityCheckAccess().getNotNotKeyword_3_0()); 

            }

             after(grammarAccess.getEqualityCheckAccess().getNotNotKeyword_3_0()); 

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
    // $ANTLR end "rule__EqualityCheck__NotAssignment_3"


    // $ANTLR start "rule__FreshnessCheck__KnowledgeAssignment_0"
    // InternalKant.g:8484:1: rule__FreshnessCheck__KnowledgeAssignment_0 : ( ruleKnowledgeRef ) ;
    public final void rule__FreshnessCheck__KnowledgeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:8488:1: ( ( ruleKnowledgeRef ) )
            // InternalKant.g:8489:2: ( ruleKnowledgeRef )
            {
            // InternalKant.g:8489:2: ( ruleKnowledgeRef )
            // InternalKant.g:8490:3: ruleKnowledgeRef
            {
             before(grammarAccess.getFreshnessCheckAccess().getKnowledgeKnowledgeRefParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleKnowledgeRef();

            state._fsp--;

             after(grammarAccess.getFreshnessCheckAccess().getKnowledgeKnowledgeRefParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__FreshnessCheck__KnowledgeAssignment_0"


    // $ANTLR start "rule__FreshnessCheck__KnowledgeAssignment_1_1"
    // InternalKant.g:8499:1: rule__FreshnessCheck__KnowledgeAssignment_1_1 : ( ruleKnowledgeRef ) ;
    public final void rule__FreshnessCheck__KnowledgeAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:8503:1: ( ( ruleKnowledgeRef ) )
            // InternalKant.g:8504:2: ( ruleKnowledgeRef )
            {
            // InternalKant.g:8504:2: ( ruleKnowledgeRef )
            // InternalKant.g:8505:3: ruleKnowledgeRef
            {
             before(grammarAccess.getFreshnessCheckAccess().getKnowledgeKnowledgeRefParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleKnowledgeRef();

            state._fsp--;

             after(grammarAccess.getFreshnessCheckAccess().getKnowledgeKnowledgeRefParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__FreshnessCheck__KnowledgeAssignment_1_1"


    // $ANTLR start "rule__FreshnessCheck__NotAssignment_3"
    // InternalKant.g:8514:1: rule__FreshnessCheck__NotAssignment_3 : ( ( 'not' ) ) ;
    public final void rule__FreshnessCheck__NotAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:8518:1: ( ( ( 'not' ) ) )
            // InternalKant.g:8519:2: ( ( 'not' ) )
            {
            // InternalKant.g:8519:2: ( ( 'not' ) )
            // InternalKant.g:8520:3: ( 'not' )
            {
             before(grammarAccess.getFreshnessCheckAccess().getNotNotKeyword_3_0()); 
            // InternalKant.g:8521:3: ( 'not' )
            // InternalKant.g:8522:4: 'not'
            {
             before(grammarAccess.getFreshnessCheckAccess().getNotNotKeyword_3_0()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getFreshnessCheckAccess().getNotNotKeyword_3_0()); 

            }

             after(grammarAccess.getFreshnessCheckAccess().getNotNotKeyword_3_0()); 

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
    // $ANTLR end "rule__FreshnessCheck__NotAssignment_3"


    // $ANTLR start "rule__LinkabilityCheck__KnowledgeAssignment_0"
    // InternalKant.g:8533:1: rule__LinkabilityCheck__KnowledgeAssignment_0 : ( ruleKnowledgeRef ) ;
    public final void rule__LinkabilityCheck__KnowledgeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:8537:1: ( ( ruleKnowledgeRef ) )
            // InternalKant.g:8538:2: ( ruleKnowledgeRef )
            {
            // InternalKant.g:8538:2: ( ruleKnowledgeRef )
            // InternalKant.g:8539:3: ruleKnowledgeRef
            {
             before(grammarAccess.getLinkabilityCheckAccess().getKnowledgeKnowledgeRefParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleKnowledgeRef();

            state._fsp--;

             after(grammarAccess.getLinkabilityCheckAccess().getKnowledgeKnowledgeRefParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__LinkabilityCheck__KnowledgeAssignment_0"


    // $ANTLR start "rule__LinkabilityCheck__KnowledgeAssignment_1_1"
    // InternalKant.g:8548:1: rule__LinkabilityCheck__KnowledgeAssignment_1_1 : ( ruleKnowledgeRef ) ;
    public final void rule__LinkabilityCheck__KnowledgeAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:8552:1: ( ( ruleKnowledgeRef ) )
            // InternalKant.g:8553:2: ( ruleKnowledgeRef )
            {
            // InternalKant.g:8553:2: ( ruleKnowledgeRef )
            // InternalKant.g:8554:3: ruleKnowledgeRef
            {
             before(grammarAccess.getLinkabilityCheckAccess().getKnowledgeKnowledgeRefParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleKnowledgeRef();

            state._fsp--;

             after(grammarAccess.getLinkabilityCheckAccess().getKnowledgeKnowledgeRefParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__LinkabilityCheck__KnowledgeAssignment_1_1"


    // $ANTLR start "rule__LinkabilityCheck__NotAssignment_3"
    // InternalKant.g:8563:1: rule__LinkabilityCheck__NotAssignment_3 : ( ( 'not' ) ) ;
    public final void rule__LinkabilityCheck__NotAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:8567:1: ( ( ( 'not' ) ) )
            // InternalKant.g:8568:2: ( ( 'not' ) )
            {
            // InternalKant.g:8568:2: ( ( 'not' ) )
            // InternalKant.g:8569:3: ( 'not' )
            {
             before(grammarAccess.getLinkabilityCheckAccess().getNotNotKeyword_3_0()); 
            // InternalKant.g:8570:3: ( 'not' )
            // InternalKant.g:8571:4: 'not'
            {
             before(grammarAccess.getLinkabilityCheckAccess().getNotNotKeyword_3_0()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getLinkabilityCheckAccess().getNotNotKeyword_3_0()); 

            }

             after(grammarAccess.getLinkabilityCheckAccess().getNotNotKeyword_3_0()); 

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
    // $ANTLR end "rule__LinkabilityCheck__NotAssignment_3"


    // $ANTLR start "rule__AuthenticationCheck__PrincipalAssignment_0"
    // InternalKant.g:8582:1: rule__AuthenticationCheck__PrincipalAssignment_0 : ( RULE_ID ) ;
    public final void rule__AuthenticationCheck__PrincipalAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:8586:1: ( ( RULE_ID ) )
            // InternalKant.g:8587:2: ( RULE_ID )
            {
            // InternalKant.g:8587:2: ( RULE_ID )
            // InternalKant.g:8588:3: RULE_ID
            {
             before(grammarAccess.getAuthenticationCheckAccess().getPrincipalIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAuthenticationCheckAccess().getPrincipalIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__AuthenticationCheck__PrincipalAssignment_0"


    // $ANTLR start "rule__AuthenticationCheck__TargetAssignment_3"
    // InternalKant.g:8597:1: rule__AuthenticationCheck__TargetAssignment_3 : ( RULE_ID ) ;
    public final void rule__AuthenticationCheck__TargetAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:8601:1: ( ( RULE_ID ) )
            // InternalKant.g:8602:2: ( RULE_ID )
            {
            // InternalKant.g:8602:2: ( RULE_ID )
            // InternalKant.g:8603:3: RULE_ID
            {
             before(grammarAccess.getAuthenticationCheckAccess().getTargetIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAuthenticationCheckAccess().getTargetIDTerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__AuthenticationCheck__TargetAssignment_3"


    // $ANTLR start "rule__AuthenticationCheck__KnowledgeAssignment_5"
    // InternalKant.g:8612:1: rule__AuthenticationCheck__KnowledgeAssignment_5 : ( ruleKnowledgeValue ) ;
    public final void rule__AuthenticationCheck__KnowledgeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKant.g:8616:1: ( ( ruleKnowledgeValue ) )
            // InternalKant.g:8617:2: ( ruleKnowledgeValue )
            {
            // InternalKant.g:8617:2: ( ruleKnowledgeValue )
            // InternalKant.g:8618:3: ruleKnowledgeValue
            {
             before(grammarAccess.getAuthenticationCheckAccess().getKnowledgeKnowledgeValueParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleKnowledgeValue();

            state._fsp--;

             after(grammarAccess.getAuthenticationCheckAccess().getKnowledgeKnowledgeValueParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__AuthenticationCheck__KnowledgeAssignment_5"

    // Delegated rules


    protected DFA6 dfa6 = new DFA6(this);
    protected DFA21 dfa21 = new DFA21(this);
    static final String dfa_1s = "\24\uffff";
    static final String dfa_2s = "\1\uffff\1\5\5\uffff\1\5\2\uffff\1\5\11\uffff";
    static final String dfa_3s = "\4\4\2\uffff\1\15\2\4\1\15\4\4\3\15\2\4\1\15";
    static final String dfa_4s = "\1\42\1\57\2\42\2\uffff\1\41\1\57\1\36\1\41\1\57\3\42\3\41\1\36\1\42\1\41";
    static final String dfa_5s = "\4\uffff\1\1\1\2\16\uffff";
    static final String dfa_6s = "\24\uffff}>";
    static final String[] dfa_7s = {
            "\1\1\4\uffff\2\4\12\uffff\1\2\7\uffff\1\3\4\uffff\1\5",
            "\1\5\10\uffff\3\5\4\uffff\1\4\1\uffff\2\5\2\uffff\2\5\5\uffff\1\5\1\uffff\2\5\1\uffff\1\5\10\uffff\1\5",
            "\1\6\4\uffff\2\5\12\uffff\1\5\1\7\6\uffff\1\5\1\uffff\1\5\2\uffff\1\5",
            "\1\11\20\uffff\1\5\7\uffff\1\5\1\12\1\10\1\4\1\uffff\1\5",
            "",
            "",
            "\1\14\1\uffff\1\5\4\uffff\1\13\1\uffff\1\7\12\uffff\1\5",
            "\1\5\10\uffff\2\5\5\uffff\1\4\1\uffff\2\5\2\uffff\2\5\7\uffff\2\5\1\uffff\1\5\10\uffff\1\5",
            "\1\5\10\uffff\1\4\7\uffff\1\5\7\uffff\1\5\1\4",
            "\1\15\1\uffff\1\5\16\uffff\1\12\2\uffff\1\5",
            "\1\5\10\uffff\2\5\5\uffff\1\4\1\uffff\2\5\2\uffff\2\5\7\uffff\2\5\1\uffff\1\5\10\uffff\1\5",
            "\1\16\20\uffff\1\5\7\uffff\1\5\4\uffff\1\5",
            "\1\17\4\uffff\2\5\12\uffff\1\5\7\uffff\1\5\1\uffff\1\5\2\uffff\1\5",
            "\1\20\20\uffff\1\5\7\uffff\1\5\1\uffff\1\21\1\4\1\uffff\1\5",
            "\1\14\1\uffff\1\5\6\uffff\1\7\12\uffff\1\5",
            "\1\14\1\uffff\1\5\4\uffff\1\22\1\uffff\1\7\12\uffff\1\5",
            "\1\15\1\uffff\1\5\16\uffff\1\12\2\uffff\1\5",
            "\1\5\10\uffff\1\4\7\uffff\1\5\7\uffff\1\5\1\4",
            "\1\23\20\uffff\1\5\7\uffff\1\5\4\uffff\1\5",
            "\1\14\1\uffff\1\5\6\uffff\1\7\12\uffff\1\5"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "1166:1: rule__Knowledge__Alternatives : ( ( ruleKnowledgeDef ) | ( ruleKnowledgeValue ) );";
        }
    }
    static final String dfa_8s = "\34\uffff";
    static final String dfa_9s = "\1\4\1\uffff\1\15\1\4\1\34\1\4\1\15\1\34\2\uffff\1\15\1\4\1\34\2\4\1\15\1\34\1\12\2\15\1\4\1\50\2\uffff\1\4\1\15\1\50\1\15";
    static final String dfa_10s = "\1\61\1\uffff\1\47\1\4\1\62\1\4\1\47\1\50\2\uffff\1\47\1\4\1\62\2\4\1\47\1\50\1\52\2\47\1\4\1\62\2\uffff\1\4\1\47\1\50\1\47";
    static final String dfa_11s = "\1\uffff\1\1\6\uffff\1\3\1\5\14\uffff\1\4\1\2\4\uffff";
    static final String dfa_12s = "\34\uffff}>";
    static final String[] dfa_13s = {
            "\1\2\53\uffff\2\1",
            "",
            "\1\3\23\uffff\1\5\5\uffff\1\4",
            "\1\6",
            "\1\1\13\uffff\1\10\2\uffff\1\11\6\uffff\1\7",
            "\1\12",
            "\1\15\23\uffff\1\13\5\uffff\1\14",
            "\1\1\13\uffff\1\10",
            "",
            "",
            "\1\16\23\uffff\1\5\5\uffff\1\10",
            "\1\17",
            "\1\1\13\uffff\1\21\11\uffff\1\20",
            "\1\22",
            "\1\23",
            "\1\24\23\uffff\1\13\5\uffff\1\25",
            "\1\1\13\uffff\1\21",
            "\1\10\36\uffff\1\27\1\26",
            "\1\15\23\uffff\1\30\5\uffff\1\14",
            "\1\24\23\uffff\1\13\5\uffff\1\25",
            "\1\31",
            "\1\21\11\uffff\1\32",
            "",
            "",
            "\1\33",
            "\1\24\23\uffff\1\30\5\uffff\1\25",
            "\1\21",
            "\1\24\23\uffff\1\30\5\uffff\1\25"
    };

    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[][] dfa_13 = unpackEncodedStringArray(dfa_13s);

    class DFA21 extends DFA {

        public DFA21(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 21;
            this.eot = dfa_8;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_12;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "1511:1: rule__Check__Alternatives_1 : ( ( ruleKnowledgeCheck ) | ( ruleEqualityCheck ) | ( ruleFreshnessCheck ) | ( ruleLinkabilityCheck ) | ( ruleAuthenticationCheck ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000080580C804012L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000810L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000300000068000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000080000010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000200010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000400000100000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000420200010L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000402000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000420200810L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000800004000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000420200610L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000010002000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000400010L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000020200010L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x00000001C0000010L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000180000010L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x00000004E0200010L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x00000004A0200010L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x00000004A0600610L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x00000004A0200610L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x00000004A0210010L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000042000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000200020L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x000080580C804010L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0003000000000010L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0004000010000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0004010000000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000008000002000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000080000000000L});

}