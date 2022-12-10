package it.unimi.xtext.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import it.unimi.xtext.services.KantGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalKantParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "'forall'", "','", "':'", "'function'", "'('", "')'", "'with'", "'->'", "'randomized'", "'one'", "'way'", "'...'", "'?'", "'='", "'{'", "'}'", "'property'", "'equals'", "'invert'", "'shared'", "'knowledge'", "'principal'", "'know'", "'const'", "'fresh'", "'['", "']'", "'_'", "'.'", "'gen'", "'optionally'", "'alternatively'", "'or'", "'check'", "'here'", "'only'", "'should'", "'not'", "'be'", "'equal'", "'linked'", "'authenticate'"
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

        public InternalKantParser(TokenStream input, KantGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Protocol";
       	}

       	@Override
       	protected KantGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleProtocol"
    // InternalKant.g:64:1: entryRuleProtocol returns [EObject current=null] : iv_ruleProtocol= ruleProtocol EOF ;
    public final EObject entryRuleProtocol() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProtocol = null;


        try {
            // InternalKant.g:64:49: (iv_ruleProtocol= ruleProtocol EOF )
            // InternalKant.g:65:2: iv_ruleProtocol= ruleProtocol EOF
            {
             newCompositeNode(grammarAccess.getProtocolRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProtocol=ruleProtocol();

            state._fsp--;

             current =iv_ruleProtocol; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProtocol"


    // $ANTLR start "ruleProtocol"
    // InternalKant.g:71:1: ruleProtocol returns [EObject current=null] : ( (lv_elements_0_0= ruleElement ) )* ;
    public final EObject ruleProtocol() throws RecognitionException {
        EObject current = null;

        EObject lv_elements_0_0 = null;



        	enterRule();

        try {
            // InternalKant.g:77:2: ( ( (lv_elements_0_0= ruleElement ) )* )
            // InternalKant.g:78:2: ( (lv_elements_0_0= ruleElement ) )*
            {
            // InternalKant.g:78:2: ( (lv_elements_0_0= ruleElement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID||LA1_0==12||LA1_0==25||(LA1_0>=28 && LA1_0<=30)||(LA1_0>=39 && LA1_0<=40)||LA1_0==42) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalKant.g:79:3: (lv_elements_0_0= ruleElement )
            	    {
            	    // InternalKant.g:79:3: (lv_elements_0_0= ruleElement )
            	    // InternalKant.g:80:4: lv_elements_0_0= ruleElement
            	    {

            	    				newCompositeNode(grammarAccess.getProtocolAccess().getElementsElementParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_elements_0_0=ruleElement();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getProtocolRule());
            	    				}
            	    				add(
            	    					current,
            	    					"elements",
            	    					lv_elements_0_0,
            	    					"it.unimi.xtext.Kant.Element");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProtocol"


    // $ANTLR start "entryRuleElement"
    // InternalKant.g:100:1: entryRuleElement returns [EObject current=null] : iv_ruleElement= ruleElement EOF ;
    public final EObject entryRuleElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElement = null;


        try {
            // InternalKant.g:100:48: (iv_ruleElement= ruleElement EOF )
            // InternalKant.g:101:2: iv_ruleElement= ruleElement EOF
            {
             newCompositeNode(grammarAccess.getElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleElement=ruleElement();

            state._fsp--;

             current =iv_ruleElement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleElement"


    // $ANTLR start "ruleElement"
    // InternalKant.g:107:1: ruleElement returns [EObject current=null] : (this_FunctionDef_0= ruleFunctionDef | this_PropertyDef_1= rulePropertyDef | this_KnowledgeBase_2= ruleKnowledgeBase | this_Principal_3= rulePrincipal | this_Communication_4= ruleCommunication | this_ScenarioBranching_5= ruleScenarioBranching | this_Check_6= ruleCheck ) ;
    public final EObject ruleElement() throws RecognitionException {
        EObject current = null;

        EObject this_FunctionDef_0 = null;

        EObject this_PropertyDef_1 = null;

        EObject this_KnowledgeBase_2 = null;

        EObject this_Principal_3 = null;

        EObject this_Communication_4 = null;

        EObject this_ScenarioBranching_5 = null;

        EObject this_Check_6 = null;



        	enterRule();

        try {
            // InternalKant.g:113:2: ( (this_FunctionDef_0= ruleFunctionDef | this_PropertyDef_1= rulePropertyDef | this_KnowledgeBase_2= ruleKnowledgeBase | this_Principal_3= rulePrincipal | this_Communication_4= ruleCommunication | this_ScenarioBranching_5= ruleScenarioBranching | this_Check_6= ruleCheck ) )
            // InternalKant.g:114:2: (this_FunctionDef_0= ruleFunctionDef | this_PropertyDef_1= rulePropertyDef | this_KnowledgeBase_2= ruleKnowledgeBase | this_Principal_3= rulePrincipal | this_Communication_4= ruleCommunication | this_ScenarioBranching_5= ruleScenarioBranching | this_Check_6= ruleCheck )
            {
            // InternalKant.g:114:2: (this_FunctionDef_0= ruleFunctionDef | this_PropertyDef_1= rulePropertyDef | this_KnowledgeBase_2= ruleKnowledgeBase | this_Principal_3= rulePrincipal | this_Communication_4= ruleCommunication | this_ScenarioBranching_5= ruleScenarioBranching | this_Check_6= ruleCheck )
            int alt2=7;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt2=1;
                }
                break;
            case 25:
                {
                alt2=2;
                }
                break;
            case 28:
            case 29:
                {
                alt2=3;
                }
                break;
            case 30:
                {
                alt2=4;
                }
                break;
            case RULE_ID:
                {
                alt2=5;
                }
                break;
            case 39:
            case 40:
                {
                alt2=6;
                }
                break;
            case 42:
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
                    // InternalKant.g:115:3: this_FunctionDef_0= ruleFunctionDef
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getFunctionDefParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_FunctionDef_0=ruleFunctionDef();

                    state._fsp--;


                    			current = this_FunctionDef_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalKant.g:124:3: this_PropertyDef_1= rulePropertyDef
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getPropertyDefParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_PropertyDef_1=rulePropertyDef();

                    state._fsp--;


                    			current = this_PropertyDef_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalKant.g:133:3: this_KnowledgeBase_2= ruleKnowledgeBase
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getKnowledgeBaseParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_KnowledgeBase_2=ruleKnowledgeBase();

                    state._fsp--;


                    			current = this_KnowledgeBase_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalKant.g:142:3: this_Principal_3= rulePrincipal
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getPrincipalParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Principal_3=rulePrincipal();

                    state._fsp--;


                    			current = this_Principal_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalKant.g:151:3: this_Communication_4= ruleCommunication
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getCommunicationParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_Communication_4=ruleCommunication();

                    state._fsp--;


                    			current = this_Communication_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalKant.g:160:3: this_ScenarioBranching_5= ruleScenarioBranching
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getScenarioBranchingParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_ScenarioBranching_5=ruleScenarioBranching();

                    state._fsp--;


                    			current = this_ScenarioBranching_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalKant.g:169:3: this_Check_6= ruleCheck
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getCheckParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_Check_6=ruleCheck();

                    state._fsp--;


                    			current = this_Check_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleElement"


    // $ANTLR start "entryRuleUniversalIntroduction"
    // InternalKant.g:181:1: entryRuleUniversalIntroduction returns [EObject current=null] : iv_ruleUniversalIntroduction= ruleUniversalIntroduction EOF ;
    public final EObject entryRuleUniversalIntroduction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUniversalIntroduction = null;


        try {
            // InternalKant.g:181:62: (iv_ruleUniversalIntroduction= ruleUniversalIntroduction EOF )
            // InternalKant.g:182:2: iv_ruleUniversalIntroduction= ruleUniversalIntroduction EOF
            {
             newCompositeNode(grammarAccess.getUniversalIntroductionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUniversalIntroduction=ruleUniversalIntroduction();

            state._fsp--;

             current =iv_ruleUniversalIntroduction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUniversalIntroduction"


    // $ANTLR start "ruleUniversalIntroduction"
    // InternalKant.g:188:1: ruleUniversalIntroduction returns [EObject current=null] : (otherlv_0= 'forall' ( (lv_args_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_args_3_0= RULE_ID ) ) )* otherlv_4= ':' ) ;
    public final EObject ruleUniversalIntroduction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_args_1_0=null;
        Token otherlv_2=null;
        Token lv_args_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalKant.g:194:2: ( (otherlv_0= 'forall' ( (lv_args_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_args_3_0= RULE_ID ) ) )* otherlv_4= ':' ) )
            // InternalKant.g:195:2: (otherlv_0= 'forall' ( (lv_args_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_args_3_0= RULE_ID ) ) )* otherlv_4= ':' )
            {
            // InternalKant.g:195:2: (otherlv_0= 'forall' ( (lv_args_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_args_3_0= RULE_ID ) ) )* otherlv_4= ':' )
            // InternalKant.g:196:3: otherlv_0= 'forall' ( (lv_args_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_args_3_0= RULE_ID ) ) )* otherlv_4= ':'
            {
            otherlv_0=(Token)match(input,9,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getUniversalIntroductionAccess().getForallKeyword_0());
            		
            // InternalKant.g:200:3: ( (lv_args_1_0= RULE_ID ) )
            // InternalKant.g:201:4: (lv_args_1_0= RULE_ID )
            {
            // InternalKant.g:201:4: (lv_args_1_0= RULE_ID )
            // InternalKant.g:202:5: lv_args_1_0= RULE_ID
            {
            lv_args_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_args_1_0, grammarAccess.getUniversalIntroductionAccess().getArgsIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getUniversalIntroductionRule());
            					}
            					addWithLastConsumed(
            						current,
            						"args",
            						lv_args_1_0,
            						"it.unimi.xtext.Kant.ID");
            				

            }


            }

            // InternalKant.g:218:3: (otherlv_2= ',' ( (lv_args_3_0= RULE_ID ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==10) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalKant.g:219:4: otherlv_2= ',' ( (lv_args_3_0= RULE_ID ) )
            	    {
            	    otherlv_2=(Token)match(input,10,FOLLOW_4); 

            	    				newLeafNode(otherlv_2, grammarAccess.getUniversalIntroductionAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalKant.g:223:4: ( (lv_args_3_0= RULE_ID ) )
            	    // InternalKant.g:224:5: (lv_args_3_0= RULE_ID )
            	    {
            	    // InternalKant.g:224:5: (lv_args_3_0= RULE_ID )
            	    // InternalKant.g:225:6: lv_args_3_0= RULE_ID
            	    {
            	    lv_args_3_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            	    						newLeafNode(lv_args_3_0, grammarAccess.getUniversalIntroductionAccess().getArgsIDTerminalRuleCall_2_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getUniversalIntroductionRule());
            	    						}
            	    						addWithLastConsumed(
            	    							current,
            	    							"args",
            	    							lv_args_3_0,
            	    							"it.unimi.xtext.Kant.ID");
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_4=(Token)match(input,11,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getUniversalIntroductionAccess().getColonKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUniversalIntroduction"


    // $ANTLR start "entryRuleFunctionDef"
    // InternalKant.g:250:1: entryRuleFunctionDef returns [EObject current=null] : iv_ruleFunctionDef= ruleFunctionDef EOF ;
    public final EObject entryRuleFunctionDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionDef = null;


        try {
            // InternalKant.g:250:52: (iv_ruleFunctionDef= ruleFunctionDef EOF )
            // InternalKant.g:251:2: iv_ruleFunctionDef= ruleFunctionDef EOF
            {
             newCompositeNode(grammarAccess.getFunctionDefRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFunctionDef=ruleFunctionDef();

            state._fsp--;

             current =iv_ruleFunctionDef; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFunctionDef"


    // $ANTLR start "ruleFunctionDef"
    // InternalKant.g:257:1: ruleFunctionDef returns [EObject current=null] : (otherlv_0= 'function' ( (lv_intro_1_0= ruleUniversalIntroduction ) )? ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' ( (lv_params_4_0= ruleFunctionParam ) ) (otherlv_5= ',' ( (lv_params_6_0= ruleFunctionParam ) ) )* otherlv_7= ')' )? (otherlv_8= 'with' ( (lv_key_9_0= ruleFunctionKey ) ) )? (otherlv_10= '->' ( (lv_return_11_0= ruleFunctionReturn ) ) )? ( (lv_randomized_12_0= 'randomized' ) )? ( ( (lv_ow_13_0= 'one' ) ) otherlv_14= 'way' )? ) ;
    public final EObject ruleFunctionDef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token lv_randomized_12_0=null;
        Token lv_ow_13_0=null;
        Token otherlv_14=null;
        EObject lv_intro_1_0 = null;

        EObject lv_params_4_0 = null;

        EObject lv_params_6_0 = null;

        EObject lv_key_9_0 = null;

        EObject lv_return_11_0 = null;



        	enterRule();

        try {
            // InternalKant.g:263:2: ( (otherlv_0= 'function' ( (lv_intro_1_0= ruleUniversalIntroduction ) )? ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' ( (lv_params_4_0= ruleFunctionParam ) ) (otherlv_5= ',' ( (lv_params_6_0= ruleFunctionParam ) ) )* otherlv_7= ')' )? (otherlv_8= 'with' ( (lv_key_9_0= ruleFunctionKey ) ) )? (otherlv_10= '->' ( (lv_return_11_0= ruleFunctionReturn ) ) )? ( (lv_randomized_12_0= 'randomized' ) )? ( ( (lv_ow_13_0= 'one' ) ) otherlv_14= 'way' )? ) )
            // InternalKant.g:264:2: (otherlv_0= 'function' ( (lv_intro_1_0= ruleUniversalIntroduction ) )? ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' ( (lv_params_4_0= ruleFunctionParam ) ) (otherlv_5= ',' ( (lv_params_6_0= ruleFunctionParam ) ) )* otherlv_7= ')' )? (otherlv_8= 'with' ( (lv_key_9_0= ruleFunctionKey ) ) )? (otherlv_10= '->' ( (lv_return_11_0= ruleFunctionReturn ) ) )? ( (lv_randomized_12_0= 'randomized' ) )? ( ( (lv_ow_13_0= 'one' ) ) otherlv_14= 'way' )? )
            {
            // InternalKant.g:264:2: (otherlv_0= 'function' ( (lv_intro_1_0= ruleUniversalIntroduction ) )? ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' ( (lv_params_4_0= ruleFunctionParam ) ) (otherlv_5= ',' ( (lv_params_6_0= ruleFunctionParam ) ) )* otherlv_7= ')' )? (otherlv_8= 'with' ( (lv_key_9_0= ruleFunctionKey ) ) )? (otherlv_10= '->' ( (lv_return_11_0= ruleFunctionReturn ) ) )? ( (lv_randomized_12_0= 'randomized' ) )? ( ( (lv_ow_13_0= 'one' ) ) otherlv_14= 'way' )? )
            // InternalKant.g:265:3: otherlv_0= 'function' ( (lv_intro_1_0= ruleUniversalIntroduction ) )? ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' ( (lv_params_4_0= ruleFunctionParam ) ) (otherlv_5= ',' ( (lv_params_6_0= ruleFunctionParam ) ) )* otherlv_7= ')' )? (otherlv_8= 'with' ( (lv_key_9_0= ruleFunctionKey ) ) )? (otherlv_10= '->' ( (lv_return_11_0= ruleFunctionReturn ) ) )? ( (lv_randomized_12_0= 'randomized' ) )? ( ( (lv_ow_13_0= 'one' ) ) otherlv_14= 'way' )?
            {
            otherlv_0=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getFunctionDefAccess().getFunctionKeyword_0());
            		
            // InternalKant.g:269:3: ( (lv_intro_1_0= ruleUniversalIntroduction ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==9) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalKant.g:270:4: (lv_intro_1_0= ruleUniversalIntroduction )
                    {
                    // InternalKant.g:270:4: (lv_intro_1_0= ruleUniversalIntroduction )
                    // InternalKant.g:271:5: lv_intro_1_0= ruleUniversalIntroduction
                    {

                    					newCompositeNode(grammarAccess.getFunctionDefAccess().getIntroUniversalIntroductionParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_4);
                    lv_intro_1_0=ruleUniversalIntroduction();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getFunctionDefRule());
                    					}
                    					set(
                    						current,
                    						"intro",
                    						lv_intro_1_0,
                    						"it.unimi.xtext.Kant.UniversalIntroduction");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalKant.g:288:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalKant.g:289:4: (lv_name_2_0= RULE_ID )
            {
            // InternalKant.g:289:4: (lv_name_2_0= RULE_ID )
            // InternalKant.g:290:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(lv_name_2_0, grammarAccess.getFunctionDefAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFunctionDefRule());
            					}
            					addWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"it.unimi.xtext.Kant.ID");
            				

            }


            }

            // InternalKant.g:306:3: (otherlv_3= '(' ( (lv_params_4_0= ruleFunctionParam ) ) (otherlv_5= ',' ( (lv_params_6_0= ruleFunctionParam ) ) )* otherlv_7= ')' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==13) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalKant.g:307:4: otherlv_3= '(' ( (lv_params_4_0= ruleFunctionParam ) ) (otherlv_5= ',' ( (lv_params_6_0= ruleFunctionParam ) ) )* otherlv_7= ')'
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_8); 

                    				newLeafNode(otherlv_3, grammarAccess.getFunctionDefAccess().getLeftParenthesisKeyword_3_0());
                    			
                    // InternalKant.g:311:4: ( (lv_params_4_0= ruleFunctionParam ) )
                    // InternalKant.g:312:5: (lv_params_4_0= ruleFunctionParam )
                    {
                    // InternalKant.g:312:5: (lv_params_4_0= ruleFunctionParam )
                    // InternalKant.g:313:6: lv_params_4_0= ruleFunctionParam
                    {

                    						newCompositeNode(grammarAccess.getFunctionDefAccess().getParamsFunctionParamParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_params_4_0=ruleFunctionParam();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFunctionDefRule());
                    						}
                    						add(
                    							current,
                    							"params",
                    							lv_params_4_0,
                    							"it.unimi.xtext.Kant.FunctionParam");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalKant.g:330:4: (otherlv_5= ',' ( (lv_params_6_0= ruleFunctionParam ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==10) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalKant.g:331:5: otherlv_5= ',' ( (lv_params_6_0= ruleFunctionParam ) )
                    	    {
                    	    otherlv_5=(Token)match(input,10,FOLLOW_8); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getFunctionDefAccess().getCommaKeyword_3_2_0());
                    	    				
                    	    // InternalKant.g:335:5: ( (lv_params_6_0= ruleFunctionParam ) )
                    	    // InternalKant.g:336:6: (lv_params_6_0= ruleFunctionParam )
                    	    {
                    	    // InternalKant.g:336:6: (lv_params_6_0= ruleFunctionParam )
                    	    // InternalKant.g:337:7: lv_params_6_0= ruleFunctionParam
                    	    {

                    	    							newCompositeNode(grammarAccess.getFunctionDefAccess().getParamsFunctionParamParserRuleCall_3_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_9);
                    	    lv_params_6_0=ruleFunctionParam();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getFunctionDefRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"params",
                    	    								lv_params_6_0,
                    	    								"it.unimi.xtext.Kant.FunctionParam");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,14,FOLLOW_10); 

                    				newLeafNode(otherlv_7, grammarAccess.getFunctionDefAccess().getRightParenthesisKeyword_3_3());
                    			

                    }
                    break;

            }

            // InternalKant.g:360:3: (otherlv_8= 'with' ( (lv_key_9_0= ruleFunctionKey ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==15) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalKant.g:361:4: otherlv_8= 'with' ( (lv_key_9_0= ruleFunctionKey ) )
                    {
                    otherlv_8=(Token)match(input,15,FOLLOW_11); 

                    				newLeafNode(otherlv_8, grammarAccess.getFunctionDefAccess().getWithKeyword_4_0());
                    			
                    // InternalKant.g:365:4: ( (lv_key_9_0= ruleFunctionKey ) )
                    // InternalKant.g:366:5: (lv_key_9_0= ruleFunctionKey )
                    {
                    // InternalKant.g:366:5: (lv_key_9_0= ruleFunctionKey )
                    // InternalKant.g:367:6: lv_key_9_0= ruleFunctionKey
                    {

                    						newCompositeNode(grammarAccess.getFunctionDefAccess().getKeyFunctionKeyParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_key_9_0=ruleFunctionKey();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFunctionDefRule());
                    						}
                    						set(
                    							current,
                    							"key",
                    							lv_key_9_0,
                    							"it.unimi.xtext.Kant.FunctionKey");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalKant.g:385:3: (otherlv_10= '->' ( (lv_return_11_0= ruleFunctionReturn ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==16) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalKant.g:386:4: otherlv_10= '->' ( (lv_return_11_0= ruleFunctionReturn ) )
                    {
                    otherlv_10=(Token)match(input,16,FOLLOW_11); 

                    				newLeafNode(otherlv_10, grammarAccess.getFunctionDefAccess().getHyphenMinusGreaterThanSignKeyword_5_0());
                    			
                    // InternalKant.g:390:4: ( (lv_return_11_0= ruleFunctionReturn ) )
                    // InternalKant.g:391:5: (lv_return_11_0= ruleFunctionReturn )
                    {
                    // InternalKant.g:391:5: (lv_return_11_0= ruleFunctionReturn )
                    // InternalKant.g:392:6: lv_return_11_0= ruleFunctionReturn
                    {

                    						newCompositeNode(grammarAccess.getFunctionDefAccess().getReturnFunctionReturnParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_return_11_0=ruleFunctionReturn();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFunctionDefRule());
                    						}
                    						set(
                    							current,
                    							"return",
                    							lv_return_11_0,
                    							"it.unimi.xtext.Kant.FunctionReturn");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalKant.g:410:3: ( (lv_randomized_12_0= 'randomized' ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==17) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalKant.g:411:4: (lv_randomized_12_0= 'randomized' )
                    {
                    // InternalKant.g:411:4: (lv_randomized_12_0= 'randomized' )
                    // InternalKant.g:412:5: lv_randomized_12_0= 'randomized'
                    {
                    lv_randomized_12_0=(Token)match(input,17,FOLLOW_14); 

                    					newLeafNode(lv_randomized_12_0, grammarAccess.getFunctionDefAccess().getRandomizedRandomizedKeyword_6_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getFunctionDefRule());
                    					}
                    					setWithLastConsumed(current, "randomized", lv_randomized_12_0 != null, "randomized");
                    				

                    }


                    }
                    break;

            }

            // InternalKant.g:424:3: ( ( (lv_ow_13_0= 'one' ) ) otherlv_14= 'way' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==18) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalKant.g:425:4: ( (lv_ow_13_0= 'one' ) ) otherlv_14= 'way'
                    {
                    // InternalKant.g:425:4: ( (lv_ow_13_0= 'one' ) )
                    // InternalKant.g:426:5: (lv_ow_13_0= 'one' )
                    {
                    // InternalKant.g:426:5: (lv_ow_13_0= 'one' )
                    // InternalKant.g:427:6: lv_ow_13_0= 'one'
                    {
                    lv_ow_13_0=(Token)match(input,18,FOLLOW_15); 

                    						newLeafNode(lv_ow_13_0, grammarAccess.getFunctionDefAccess().getOwOneKeyword_7_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFunctionDefRule());
                    						}
                    						setWithLastConsumed(current, "ow", lv_ow_13_0 != null, "one");
                    					

                    }


                    }

                    otherlv_14=(Token)match(input,19,FOLLOW_2); 

                    				newLeafNode(otherlv_14, grammarAccess.getFunctionDefAccess().getWayKeyword_7_1());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFunctionDef"


    // $ANTLR start "entryRuleFunctionParam"
    // InternalKant.g:448:1: entryRuleFunctionParam returns [EObject current=null] : iv_ruleFunctionParam= ruleFunctionParam EOF ;
    public final EObject entryRuleFunctionParam() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionParam = null;


        try {
            // InternalKant.g:448:54: (iv_ruleFunctionParam= ruleFunctionParam EOF )
            // InternalKant.g:449:2: iv_ruleFunctionParam= ruleFunctionParam EOF
            {
             newCompositeNode(grammarAccess.getFunctionParamRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFunctionParam=ruleFunctionParam();

            state._fsp--;

             current =iv_ruleFunctionParam; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFunctionParam"


    // $ANTLR start "ruleFunctionParam"
    // InternalKant.g:455:1: ruleFunctionParam returns [EObject current=null] : ( ( (lv_variadic_0_0= '...' ) )? ( (lv_name_1_0= RULE_ID ) ) ( (lv_opt_2_0= '?' ) )? (otherlv_3= '=' ( (lv_type_4_0= ruleKnowledgeValue ) ) )? ) ;
    public final EObject ruleFunctionParam() throws RecognitionException {
        EObject current = null;

        Token lv_variadic_0_0=null;
        Token lv_name_1_0=null;
        Token lv_opt_2_0=null;
        Token otherlv_3=null;
        EObject lv_type_4_0 = null;



        	enterRule();

        try {
            // InternalKant.g:461:2: ( ( ( (lv_variadic_0_0= '...' ) )? ( (lv_name_1_0= RULE_ID ) ) ( (lv_opt_2_0= '?' ) )? (otherlv_3= '=' ( (lv_type_4_0= ruleKnowledgeValue ) ) )? ) )
            // InternalKant.g:462:2: ( ( (lv_variadic_0_0= '...' ) )? ( (lv_name_1_0= RULE_ID ) ) ( (lv_opt_2_0= '?' ) )? (otherlv_3= '=' ( (lv_type_4_0= ruleKnowledgeValue ) ) )? )
            {
            // InternalKant.g:462:2: ( ( (lv_variadic_0_0= '...' ) )? ( (lv_name_1_0= RULE_ID ) ) ( (lv_opt_2_0= '?' ) )? (otherlv_3= '=' ( (lv_type_4_0= ruleKnowledgeValue ) ) )? )
            // InternalKant.g:463:3: ( (lv_variadic_0_0= '...' ) )? ( (lv_name_1_0= RULE_ID ) ) ( (lv_opt_2_0= '?' ) )? (otherlv_3= '=' ( (lv_type_4_0= ruleKnowledgeValue ) ) )?
            {
            // InternalKant.g:463:3: ( (lv_variadic_0_0= '...' ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==20) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalKant.g:464:4: (lv_variadic_0_0= '...' )
                    {
                    // InternalKant.g:464:4: (lv_variadic_0_0= '...' )
                    // InternalKant.g:465:5: lv_variadic_0_0= '...'
                    {
                    lv_variadic_0_0=(Token)match(input,20,FOLLOW_4); 

                    					newLeafNode(lv_variadic_0_0, grammarAccess.getFunctionParamAccess().getVariadicFullStopFullStopFullStopKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getFunctionParamRule());
                    					}
                    					setWithLastConsumed(current, "variadic", lv_variadic_0_0 != null, "...");
                    				

                    }


                    }
                    break;

            }

            // InternalKant.g:477:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalKant.g:478:4: (lv_name_1_0= RULE_ID )
            {
            // InternalKant.g:478:4: (lv_name_1_0= RULE_ID )
            // InternalKant.g:479:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_16); 

            					newLeafNode(lv_name_1_0, grammarAccess.getFunctionParamAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFunctionParamRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"it.unimi.xtext.Kant.ID");
            				

            }


            }

            // InternalKant.g:495:3: ( (lv_opt_2_0= '?' ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==21) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalKant.g:496:4: (lv_opt_2_0= '?' )
                    {
                    // InternalKant.g:496:4: (lv_opt_2_0= '?' )
                    // InternalKant.g:497:5: lv_opt_2_0= '?'
                    {
                    lv_opt_2_0=(Token)match(input,21,FOLLOW_17); 

                    					newLeafNode(lv_opt_2_0, grammarAccess.getFunctionParamAccess().getOptQuestionMarkKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getFunctionParamRule());
                    					}
                    					setWithLastConsumed(current, "opt", lv_opt_2_0 != null, "?");
                    				

                    }


                    }
                    break;

            }

            // InternalKant.g:509:3: (otherlv_3= '=' ( (lv_type_4_0= ruleKnowledgeValue ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==22) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalKant.g:510:4: otherlv_3= '=' ( (lv_type_4_0= ruleKnowledgeValue ) )
                    {
                    otherlv_3=(Token)match(input,22,FOLLOW_18); 

                    				newLeafNode(otherlv_3, grammarAccess.getFunctionParamAccess().getEqualsSignKeyword_3_0());
                    			
                    // InternalKant.g:514:4: ( (lv_type_4_0= ruleKnowledgeValue ) )
                    // InternalKant.g:515:5: (lv_type_4_0= ruleKnowledgeValue )
                    {
                    // InternalKant.g:515:5: (lv_type_4_0= ruleKnowledgeValue )
                    // InternalKant.g:516:6: lv_type_4_0= ruleKnowledgeValue
                    {

                    						newCompositeNode(grammarAccess.getFunctionParamAccess().getTypeKnowledgeValueParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_type_4_0=ruleKnowledgeValue();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFunctionParamRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_4_0,
                    							"it.unimi.xtext.Kant.KnowledgeValue");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFunctionParam"


    // $ANTLR start "entryRuleFunctionKey"
    // InternalKant.g:538:1: entryRuleFunctionKey returns [EObject current=null] : iv_ruleFunctionKey= ruleFunctionKey EOF ;
    public final EObject entryRuleFunctionKey() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionKey = null;


        try {
            // InternalKant.g:538:52: (iv_ruleFunctionKey= ruleFunctionKey EOF )
            // InternalKant.g:539:2: iv_ruleFunctionKey= ruleFunctionKey EOF
            {
             newCompositeNode(grammarAccess.getFunctionKeyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFunctionKey=ruleFunctionKey();

            state._fsp--;

             current =iv_ruleFunctionKey; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFunctionKey"


    // $ANTLR start "ruleFunctionKey"
    // InternalKant.g:545:1: ruleFunctionKey returns [EObject current=null] : ( ( (lv_elements_0_0= ruleFunctionKeyElement ) ) | (otherlv_1= '{' ( (lv_elements_2_0= ruleFunctionKeyElement ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleFunctionKeyElement ) ) )* otherlv_5= '}' ) ) ;
    public final EObject ruleFunctionKey() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_elements_0_0 = null;

        EObject lv_elements_2_0 = null;

        EObject lv_elements_4_0 = null;



        	enterRule();

        try {
            // InternalKant.g:551:2: ( ( ( (lv_elements_0_0= ruleFunctionKeyElement ) ) | (otherlv_1= '{' ( (lv_elements_2_0= ruleFunctionKeyElement ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleFunctionKeyElement ) ) )* otherlv_5= '}' ) ) )
            // InternalKant.g:552:2: ( ( (lv_elements_0_0= ruleFunctionKeyElement ) ) | (otherlv_1= '{' ( (lv_elements_2_0= ruleFunctionKeyElement ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleFunctionKeyElement ) ) )* otherlv_5= '}' ) )
            {
            // InternalKant.g:552:2: ( ( (lv_elements_0_0= ruleFunctionKeyElement ) ) | (otherlv_1= '{' ( (lv_elements_2_0= ruleFunctionKeyElement ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleFunctionKeyElement ) ) )* otherlv_5= '}' ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_ID) ) {
                alt15=1;
            }
            else if ( (LA15_0==23) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalKant.g:553:3: ( (lv_elements_0_0= ruleFunctionKeyElement ) )
                    {
                    // InternalKant.g:553:3: ( (lv_elements_0_0= ruleFunctionKeyElement ) )
                    // InternalKant.g:554:4: (lv_elements_0_0= ruleFunctionKeyElement )
                    {
                    // InternalKant.g:554:4: (lv_elements_0_0= ruleFunctionKeyElement )
                    // InternalKant.g:555:5: lv_elements_0_0= ruleFunctionKeyElement
                    {

                    					newCompositeNode(grammarAccess.getFunctionKeyAccess().getElementsFunctionKeyElementParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_elements_0_0=ruleFunctionKeyElement();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getFunctionKeyRule());
                    					}
                    					add(
                    						current,
                    						"elements",
                    						lv_elements_0_0,
                    						"it.unimi.xtext.Kant.FunctionKeyElement");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalKant.g:573:3: (otherlv_1= '{' ( (lv_elements_2_0= ruleFunctionKeyElement ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleFunctionKeyElement ) ) )* otherlv_5= '}' )
                    {
                    // InternalKant.g:573:3: (otherlv_1= '{' ( (lv_elements_2_0= ruleFunctionKeyElement ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleFunctionKeyElement ) ) )* otherlv_5= '}' )
                    // InternalKant.g:574:4: otherlv_1= '{' ( (lv_elements_2_0= ruleFunctionKeyElement ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleFunctionKeyElement ) ) )* otherlv_5= '}'
                    {
                    otherlv_1=(Token)match(input,23,FOLLOW_4); 

                    				newLeafNode(otherlv_1, grammarAccess.getFunctionKeyAccess().getLeftCurlyBracketKeyword_1_0());
                    			
                    // InternalKant.g:578:4: ( (lv_elements_2_0= ruleFunctionKeyElement ) )
                    // InternalKant.g:579:5: (lv_elements_2_0= ruleFunctionKeyElement )
                    {
                    // InternalKant.g:579:5: (lv_elements_2_0= ruleFunctionKeyElement )
                    // InternalKant.g:580:6: lv_elements_2_0= ruleFunctionKeyElement
                    {

                    						newCompositeNode(grammarAccess.getFunctionKeyAccess().getElementsFunctionKeyElementParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_19);
                    lv_elements_2_0=ruleFunctionKeyElement();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFunctionKeyRule());
                    						}
                    						add(
                    							current,
                    							"elements",
                    							lv_elements_2_0,
                    							"it.unimi.xtext.Kant.FunctionKeyElement");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalKant.g:597:4: (otherlv_3= ',' ( (lv_elements_4_0= ruleFunctionKeyElement ) ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==10) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // InternalKant.g:598:5: otherlv_3= ',' ( (lv_elements_4_0= ruleFunctionKeyElement ) )
                    	    {
                    	    otherlv_3=(Token)match(input,10,FOLLOW_4); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getFunctionKeyAccess().getCommaKeyword_1_2_0());
                    	    				
                    	    // InternalKant.g:602:5: ( (lv_elements_4_0= ruleFunctionKeyElement ) )
                    	    // InternalKant.g:603:6: (lv_elements_4_0= ruleFunctionKeyElement )
                    	    {
                    	    // InternalKant.g:603:6: (lv_elements_4_0= ruleFunctionKeyElement )
                    	    // InternalKant.g:604:7: lv_elements_4_0= ruleFunctionKeyElement
                    	    {

                    	    							newCompositeNode(grammarAccess.getFunctionKeyAccess().getElementsFunctionKeyElementParserRuleCall_1_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_19);
                    	    lv_elements_4_0=ruleFunctionKeyElement();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getFunctionKeyRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"elements",
                    	    								lv_elements_4_0,
                    	    								"it.unimi.xtext.Kant.FunctionKeyElement");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,24,FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getFunctionKeyAccess().getRightCurlyBracketKeyword_1_3());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFunctionKey"


    // $ANTLR start "entryRuleFunctionKeyElement"
    // InternalKant.g:631:1: entryRuleFunctionKeyElement returns [EObject current=null] : iv_ruleFunctionKeyElement= ruleFunctionKeyElement EOF ;
    public final EObject entryRuleFunctionKeyElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionKeyElement = null;


        try {
            // InternalKant.g:631:59: (iv_ruleFunctionKeyElement= ruleFunctionKeyElement EOF )
            // InternalKant.g:632:2: iv_ruleFunctionKeyElement= ruleFunctionKeyElement EOF
            {
             newCompositeNode(grammarAccess.getFunctionKeyElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFunctionKeyElement=ruleFunctionKeyElement();

            state._fsp--;

             current =iv_ruleFunctionKeyElement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFunctionKeyElement"


    // $ANTLR start "ruleFunctionKeyElement"
    // InternalKant.g:638:1: ruleFunctionKeyElement returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_type_2_0= ruleKnowledgeValue ) ) )? ) ;
    public final EObject ruleFunctionKeyElement() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalKant.g:644:2: ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_type_2_0= ruleKnowledgeValue ) ) )? ) )
            // InternalKant.g:645:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_type_2_0= ruleKnowledgeValue ) ) )? )
            {
            // InternalKant.g:645:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_type_2_0= ruleKnowledgeValue ) ) )? )
            // InternalKant.g:646:3: ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_type_2_0= ruleKnowledgeValue ) ) )?
            {
            // InternalKant.g:646:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalKant.g:647:4: (lv_name_0_0= RULE_ID )
            {
            // InternalKant.g:647:4: (lv_name_0_0= RULE_ID )
            // InternalKant.g:648:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_17); 

            					newLeafNode(lv_name_0_0, grammarAccess.getFunctionKeyElementAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFunctionKeyElementRule());
            					}
            					addWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"it.unimi.xtext.Kant.ID");
            				

            }


            }

            // InternalKant.g:664:3: (otherlv_1= '=' ( (lv_type_2_0= ruleKnowledgeValue ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==22) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalKant.g:665:4: otherlv_1= '=' ( (lv_type_2_0= ruleKnowledgeValue ) )
                    {
                    otherlv_1=(Token)match(input,22,FOLLOW_18); 

                    				newLeafNode(otherlv_1, grammarAccess.getFunctionKeyElementAccess().getEqualsSignKeyword_1_0());
                    			
                    // InternalKant.g:669:4: ( (lv_type_2_0= ruleKnowledgeValue ) )
                    // InternalKant.g:670:5: (lv_type_2_0= ruleKnowledgeValue )
                    {
                    // InternalKant.g:670:5: (lv_type_2_0= ruleKnowledgeValue )
                    // InternalKant.g:671:6: lv_type_2_0= ruleKnowledgeValue
                    {

                    						newCompositeNode(grammarAccess.getFunctionKeyElementAccess().getTypeKnowledgeValueParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_type_2_0=ruleKnowledgeValue();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFunctionKeyElementRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_2_0,
                    							"it.unimi.xtext.Kant.KnowledgeValue");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFunctionKeyElement"


    // $ANTLR start "entryRuleFunctionReturn"
    // InternalKant.g:693:1: entryRuleFunctionReturn returns [EObject current=null] : iv_ruleFunctionReturn= ruleFunctionReturn EOF ;
    public final EObject entryRuleFunctionReturn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionReturn = null;


        try {
            // InternalKant.g:693:55: (iv_ruleFunctionReturn= ruleFunctionReturn EOF )
            // InternalKant.g:694:2: iv_ruleFunctionReturn= ruleFunctionReturn EOF
            {
             newCompositeNode(grammarAccess.getFunctionReturnRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFunctionReturn=ruleFunctionReturn();

            state._fsp--;

             current =iv_ruleFunctionReturn; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFunctionReturn"


    // $ANTLR start "ruleFunctionReturn"
    // InternalKant.g:700:1: ruleFunctionReturn returns [EObject current=null] : ( ( (lv_elements_0_0= ruleFunctionReturnElement ) ) | (otherlv_1= '{' ( (lv_elements_2_0= ruleFunctionReturnElement ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleFunctionReturnElement ) ) )* otherlv_5= '}' ) ) ;
    public final EObject ruleFunctionReturn() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_elements_0_0 = null;

        EObject lv_elements_2_0 = null;

        EObject lv_elements_4_0 = null;



        	enterRule();

        try {
            // InternalKant.g:706:2: ( ( ( (lv_elements_0_0= ruleFunctionReturnElement ) ) | (otherlv_1= '{' ( (lv_elements_2_0= ruleFunctionReturnElement ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleFunctionReturnElement ) ) )* otherlv_5= '}' ) ) )
            // InternalKant.g:707:2: ( ( (lv_elements_0_0= ruleFunctionReturnElement ) ) | (otherlv_1= '{' ( (lv_elements_2_0= ruleFunctionReturnElement ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleFunctionReturnElement ) ) )* otherlv_5= '}' ) )
            {
            // InternalKant.g:707:2: ( ( (lv_elements_0_0= ruleFunctionReturnElement ) ) | (otherlv_1= '{' ( (lv_elements_2_0= ruleFunctionReturnElement ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleFunctionReturnElement ) ) )* otherlv_5= '}' ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_ID) ) {
                alt18=1;
            }
            else if ( (LA18_0==23) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalKant.g:708:3: ( (lv_elements_0_0= ruleFunctionReturnElement ) )
                    {
                    // InternalKant.g:708:3: ( (lv_elements_0_0= ruleFunctionReturnElement ) )
                    // InternalKant.g:709:4: (lv_elements_0_0= ruleFunctionReturnElement )
                    {
                    // InternalKant.g:709:4: (lv_elements_0_0= ruleFunctionReturnElement )
                    // InternalKant.g:710:5: lv_elements_0_0= ruleFunctionReturnElement
                    {

                    					newCompositeNode(grammarAccess.getFunctionReturnAccess().getElementsFunctionReturnElementParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_elements_0_0=ruleFunctionReturnElement();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getFunctionReturnRule());
                    					}
                    					add(
                    						current,
                    						"elements",
                    						lv_elements_0_0,
                    						"it.unimi.xtext.Kant.FunctionReturnElement");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalKant.g:728:3: (otherlv_1= '{' ( (lv_elements_2_0= ruleFunctionReturnElement ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleFunctionReturnElement ) ) )* otherlv_5= '}' )
                    {
                    // InternalKant.g:728:3: (otherlv_1= '{' ( (lv_elements_2_0= ruleFunctionReturnElement ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleFunctionReturnElement ) ) )* otherlv_5= '}' )
                    // InternalKant.g:729:4: otherlv_1= '{' ( (lv_elements_2_0= ruleFunctionReturnElement ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleFunctionReturnElement ) ) )* otherlv_5= '}'
                    {
                    otherlv_1=(Token)match(input,23,FOLLOW_4); 

                    				newLeafNode(otherlv_1, grammarAccess.getFunctionReturnAccess().getLeftCurlyBracketKeyword_1_0());
                    			
                    // InternalKant.g:733:4: ( (lv_elements_2_0= ruleFunctionReturnElement ) )
                    // InternalKant.g:734:5: (lv_elements_2_0= ruleFunctionReturnElement )
                    {
                    // InternalKant.g:734:5: (lv_elements_2_0= ruleFunctionReturnElement )
                    // InternalKant.g:735:6: lv_elements_2_0= ruleFunctionReturnElement
                    {

                    						newCompositeNode(grammarAccess.getFunctionReturnAccess().getElementsFunctionReturnElementParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_19);
                    lv_elements_2_0=ruleFunctionReturnElement();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFunctionReturnRule());
                    						}
                    						add(
                    							current,
                    							"elements",
                    							lv_elements_2_0,
                    							"it.unimi.xtext.Kant.FunctionReturnElement");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalKant.g:752:4: (otherlv_3= ',' ( (lv_elements_4_0= ruleFunctionReturnElement ) ) )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==10) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // InternalKant.g:753:5: otherlv_3= ',' ( (lv_elements_4_0= ruleFunctionReturnElement ) )
                    	    {
                    	    otherlv_3=(Token)match(input,10,FOLLOW_4); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getFunctionReturnAccess().getCommaKeyword_1_2_0());
                    	    				
                    	    // InternalKant.g:757:5: ( (lv_elements_4_0= ruleFunctionReturnElement ) )
                    	    // InternalKant.g:758:6: (lv_elements_4_0= ruleFunctionReturnElement )
                    	    {
                    	    // InternalKant.g:758:6: (lv_elements_4_0= ruleFunctionReturnElement )
                    	    // InternalKant.g:759:7: lv_elements_4_0= ruleFunctionReturnElement
                    	    {

                    	    							newCompositeNode(grammarAccess.getFunctionReturnAccess().getElementsFunctionReturnElementParserRuleCall_1_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_19);
                    	    lv_elements_4_0=ruleFunctionReturnElement();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getFunctionReturnRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"elements",
                    	    								lv_elements_4_0,
                    	    								"it.unimi.xtext.Kant.FunctionReturnElement");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop17;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,24,FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getFunctionReturnAccess().getRightCurlyBracketKeyword_1_3());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFunctionReturn"


    // $ANTLR start "entryRuleFunctionReturnElement"
    // InternalKant.g:786:1: entryRuleFunctionReturnElement returns [EObject current=null] : iv_ruleFunctionReturnElement= ruleFunctionReturnElement EOF ;
    public final EObject entryRuleFunctionReturnElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionReturnElement = null;


        try {
            // InternalKant.g:786:62: (iv_ruleFunctionReturnElement= ruleFunctionReturnElement EOF )
            // InternalKant.g:787:2: iv_ruleFunctionReturnElement= ruleFunctionReturnElement EOF
            {
             newCompositeNode(grammarAccess.getFunctionReturnElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFunctionReturnElement=ruleFunctionReturnElement();

            state._fsp--;

             current =iv_ruleFunctionReturnElement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFunctionReturnElement"


    // $ANTLR start "ruleFunctionReturnElement"
    // InternalKant.g:793:1: ruleFunctionReturnElement returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_type_2_0= ruleKnowledgeValue ) ) )? ) ;
    public final EObject ruleFunctionReturnElement() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalKant.g:799:2: ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_type_2_0= ruleKnowledgeValue ) ) )? ) )
            // InternalKant.g:800:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_type_2_0= ruleKnowledgeValue ) ) )? )
            {
            // InternalKant.g:800:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_type_2_0= ruleKnowledgeValue ) ) )? )
            // InternalKant.g:801:3: ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_type_2_0= ruleKnowledgeValue ) ) )?
            {
            // InternalKant.g:801:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalKant.g:802:4: (lv_name_0_0= RULE_ID )
            {
            // InternalKant.g:802:4: (lv_name_0_0= RULE_ID )
            // InternalKant.g:803:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_17); 

            					newLeafNode(lv_name_0_0, grammarAccess.getFunctionReturnElementAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFunctionReturnElementRule());
            					}
            					addWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"it.unimi.xtext.Kant.ID");
            				

            }


            }

            // InternalKant.g:819:3: (otherlv_1= '=' ( (lv_type_2_0= ruleKnowledgeValue ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==22) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalKant.g:820:4: otherlv_1= '=' ( (lv_type_2_0= ruleKnowledgeValue ) )
                    {
                    otherlv_1=(Token)match(input,22,FOLLOW_18); 

                    				newLeafNode(otherlv_1, grammarAccess.getFunctionReturnElementAccess().getEqualsSignKeyword_1_0());
                    			
                    // InternalKant.g:824:4: ( (lv_type_2_0= ruleKnowledgeValue ) )
                    // InternalKant.g:825:5: (lv_type_2_0= ruleKnowledgeValue )
                    {
                    // InternalKant.g:825:5: (lv_type_2_0= ruleKnowledgeValue )
                    // InternalKant.g:826:6: lv_type_2_0= ruleKnowledgeValue
                    {

                    						newCompositeNode(grammarAccess.getFunctionReturnElementAccess().getTypeKnowledgeValueParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_type_2_0=ruleKnowledgeValue();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFunctionReturnElementRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_2_0,
                    							"it.unimi.xtext.Kant.KnowledgeValue");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFunctionReturnElement"


    // $ANTLR start "entryRulePropertyDef"
    // InternalKant.g:848:1: entryRulePropertyDef returns [EObject current=null] : iv_rulePropertyDef= rulePropertyDef EOF ;
    public final EObject entryRulePropertyDef() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyDef = null;


        try {
            // InternalKant.g:848:52: (iv_rulePropertyDef= rulePropertyDef EOF )
            // InternalKant.g:849:2: iv_rulePropertyDef= rulePropertyDef EOF
            {
             newCompositeNode(grammarAccess.getPropertyDefRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePropertyDef=rulePropertyDef();

            state._fsp--;

             current =iv_rulePropertyDef; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePropertyDef"


    // $ANTLR start "rulePropertyDef"
    // InternalKant.g:855:1: rulePropertyDef returns [EObject current=null] : (otherlv_0= 'property' ( ( (lv_property_1_1= ruleKnowledgeEqualityDef | lv_property_1_2= ruleFunctionInversionDef ) ) ) ) ;
    public final EObject rulePropertyDef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_property_1_1 = null;

        EObject lv_property_1_2 = null;



        	enterRule();

        try {
            // InternalKant.g:861:2: ( (otherlv_0= 'property' ( ( (lv_property_1_1= ruleKnowledgeEqualityDef | lv_property_1_2= ruleFunctionInversionDef ) ) ) ) )
            // InternalKant.g:862:2: (otherlv_0= 'property' ( ( (lv_property_1_1= ruleKnowledgeEqualityDef | lv_property_1_2= ruleFunctionInversionDef ) ) ) )
            {
            // InternalKant.g:862:2: (otherlv_0= 'property' ( ( (lv_property_1_1= ruleKnowledgeEqualityDef | lv_property_1_2= ruleFunctionInversionDef ) ) ) )
            // InternalKant.g:863:3: otherlv_0= 'property' ( ( (lv_property_1_1= ruleKnowledgeEqualityDef | lv_property_1_2= ruleFunctionInversionDef ) ) )
            {
            otherlv_0=(Token)match(input,25,FOLLOW_20); 

            			newLeafNode(otherlv_0, grammarAccess.getPropertyDefAccess().getPropertyKeyword_0());
            		
            // InternalKant.g:867:3: ( ( (lv_property_1_1= ruleKnowledgeEqualityDef | lv_property_1_2= ruleFunctionInversionDef ) ) )
            // InternalKant.g:868:4: ( (lv_property_1_1= ruleKnowledgeEqualityDef | lv_property_1_2= ruleFunctionInversionDef ) )
            {
            // InternalKant.g:868:4: ( (lv_property_1_1= ruleKnowledgeEqualityDef | lv_property_1_2= ruleFunctionInversionDef ) )
            // InternalKant.g:869:5: (lv_property_1_1= ruleKnowledgeEqualityDef | lv_property_1_2= ruleFunctionInversionDef )
            {
            // InternalKant.g:869:5: (lv_property_1_1= ruleKnowledgeEqualityDef | lv_property_1_2= ruleFunctionInversionDef )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==9||LA20_0==23||LA20_0==34||LA20_0==38) ) {
                alt20=1;
            }
            else if ( (LA20_0==RULE_ID) ) {
                int LA20_2 = input.LA(2);

                if ( (LA20_2==13||LA20_2==26||LA20_2==37) ) {
                    alt20=1;
                }
                else if ( (LA20_2==27) ) {
                    alt20=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 20, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // InternalKant.g:870:6: lv_property_1_1= ruleKnowledgeEqualityDef
                    {

                    						newCompositeNode(grammarAccess.getPropertyDefAccess().getPropertyKnowledgeEqualityDefParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_property_1_1=ruleKnowledgeEqualityDef();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPropertyDefRule());
                    						}
                    						set(
                    							current,
                    							"property",
                    							lv_property_1_1,
                    							"it.unimi.xtext.Kant.KnowledgeEqualityDef");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 2 :
                    // InternalKant.g:886:6: lv_property_1_2= ruleFunctionInversionDef
                    {

                    						newCompositeNode(grammarAccess.getPropertyDefAccess().getPropertyFunctionInversionDefParserRuleCall_1_0_1());
                    					
                    pushFollow(FOLLOW_2);
                    lv_property_1_2=ruleFunctionInversionDef();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPropertyDefRule());
                    						}
                    						set(
                    							current,
                    							"property",
                    							lv_property_1_2,
                    							"it.unimi.xtext.Kant.FunctionInversionDef");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;

            }


            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePropertyDef"


    // $ANTLR start "entryRuleKnowledgeEqualityDef"
    // InternalKant.g:908:1: entryRuleKnowledgeEqualityDef returns [EObject current=null] : iv_ruleKnowledgeEqualityDef= ruleKnowledgeEqualityDef EOF ;
    public final EObject entryRuleKnowledgeEqualityDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKnowledgeEqualityDef = null;


        try {
            // InternalKant.g:908:61: (iv_ruleKnowledgeEqualityDef= ruleKnowledgeEqualityDef EOF )
            // InternalKant.g:909:2: iv_ruleKnowledgeEqualityDef= ruleKnowledgeEqualityDef EOF
            {
             newCompositeNode(grammarAccess.getKnowledgeEqualityDefRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleKnowledgeEqualityDef=ruleKnowledgeEqualityDef();

            state._fsp--;

             current =iv_ruleKnowledgeEqualityDef; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleKnowledgeEqualityDef"


    // $ANTLR start "ruleKnowledgeEqualityDef"
    // InternalKant.g:915:1: ruleKnowledgeEqualityDef returns [EObject current=null] : ( ( (lv_intro_0_0= ruleUniversalIntroduction ) )? ( (lv_value_1_0= ruleKnowledgeValue ) ) otherlv_2= 'equals' ( (lv_target_3_0= ruleKnowledgeValue ) ) ) ;
    public final EObject ruleKnowledgeEqualityDef() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_intro_0_0 = null;

        EObject lv_value_1_0 = null;

        EObject lv_target_3_0 = null;



        	enterRule();

        try {
            // InternalKant.g:921:2: ( ( ( (lv_intro_0_0= ruleUniversalIntroduction ) )? ( (lv_value_1_0= ruleKnowledgeValue ) ) otherlv_2= 'equals' ( (lv_target_3_0= ruleKnowledgeValue ) ) ) )
            // InternalKant.g:922:2: ( ( (lv_intro_0_0= ruleUniversalIntroduction ) )? ( (lv_value_1_0= ruleKnowledgeValue ) ) otherlv_2= 'equals' ( (lv_target_3_0= ruleKnowledgeValue ) ) )
            {
            // InternalKant.g:922:2: ( ( (lv_intro_0_0= ruleUniversalIntroduction ) )? ( (lv_value_1_0= ruleKnowledgeValue ) ) otherlv_2= 'equals' ( (lv_target_3_0= ruleKnowledgeValue ) ) )
            // InternalKant.g:923:3: ( (lv_intro_0_0= ruleUniversalIntroduction ) )? ( (lv_value_1_0= ruleKnowledgeValue ) ) otherlv_2= 'equals' ( (lv_target_3_0= ruleKnowledgeValue ) )
            {
            // InternalKant.g:923:3: ( (lv_intro_0_0= ruleUniversalIntroduction ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==9) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalKant.g:924:4: (lv_intro_0_0= ruleUniversalIntroduction )
                    {
                    // InternalKant.g:924:4: (lv_intro_0_0= ruleUniversalIntroduction )
                    // InternalKant.g:925:5: lv_intro_0_0= ruleUniversalIntroduction
                    {

                    					newCompositeNode(grammarAccess.getKnowledgeEqualityDefAccess().getIntroUniversalIntroductionParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_18);
                    lv_intro_0_0=ruleUniversalIntroduction();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getKnowledgeEqualityDefRule());
                    					}
                    					set(
                    						current,
                    						"intro",
                    						lv_intro_0_0,
                    						"it.unimi.xtext.Kant.UniversalIntroduction");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalKant.g:942:3: ( (lv_value_1_0= ruleKnowledgeValue ) )
            // InternalKant.g:943:4: (lv_value_1_0= ruleKnowledgeValue )
            {
            // InternalKant.g:943:4: (lv_value_1_0= ruleKnowledgeValue )
            // InternalKant.g:944:5: lv_value_1_0= ruleKnowledgeValue
            {

            					newCompositeNode(grammarAccess.getKnowledgeEqualityDefAccess().getValueKnowledgeValueParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_21);
            lv_value_1_0=ruleKnowledgeValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getKnowledgeEqualityDefRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_1_0,
            						"it.unimi.xtext.Kant.KnowledgeValue");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,26,FOLLOW_18); 

            			newLeafNode(otherlv_2, grammarAccess.getKnowledgeEqualityDefAccess().getEqualsKeyword_2());
            		
            // InternalKant.g:965:3: ( (lv_target_3_0= ruleKnowledgeValue ) )
            // InternalKant.g:966:4: (lv_target_3_0= ruleKnowledgeValue )
            {
            // InternalKant.g:966:4: (lv_target_3_0= ruleKnowledgeValue )
            // InternalKant.g:967:5: lv_target_3_0= ruleKnowledgeValue
            {

            					newCompositeNode(grammarAccess.getKnowledgeEqualityDefAccess().getTargetKnowledgeValueParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_target_3_0=ruleKnowledgeValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getKnowledgeEqualityDefRule());
            					}
            					set(
            						current,
            						"target",
            						lv_target_3_0,
            						"it.unimi.xtext.Kant.KnowledgeValue");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleKnowledgeEqualityDef"


    // $ANTLR start "entryRuleFunctionInversionDef"
    // InternalKant.g:988:1: entryRuleFunctionInversionDef returns [EObject current=null] : iv_ruleFunctionInversionDef= ruleFunctionInversionDef EOF ;
    public final EObject entryRuleFunctionInversionDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionInversionDef = null;


        try {
            // InternalKant.g:988:61: (iv_ruleFunctionInversionDef= ruleFunctionInversionDef EOF )
            // InternalKant.g:989:2: iv_ruleFunctionInversionDef= ruleFunctionInversionDef EOF
            {
             newCompositeNode(grammarAccess.getFunctionInversionDefRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFunctionInversionDef=ruleFunctionInversionDef();

            state._fsp--;

             current =iv_ruleFunctionInversionDef; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFunctionInversionDef"


    // $ANTLR start "ruleFunctionInversionDef"
    // InternalKant.g:995:1: ruleFunctionInversionDef returns [EObject current=null] : ( ( (lv_inverter_0_0= RULE_ID ) ) otherlv_1= 'invert' ( (lv_function_2_0= RULE_ID ) ) ) ;
    public final EObject ruleFunctionInversionDef() throws RecognitionException {
        EObject current = null;

        Token lv_inverter_0_0=null;
        Token otherlv_1=null;
        Token lv_function_2_0=null;


        	enterRule();

        try {
            // InternalKant.g:1001:2: ( ( ( (lv_inverter_0_0= RULE_ID ) ) otherlv_1= 'invert' ( (lv_function_2_0= RULE_ID ) ) ) )
            // InternalKant.g:1002:2: ( ( (lv_inverter_0_0= RULE_ID ) ) otherlv_1= 'invert' ( (lv_function_2_0= RULE_ID ) ) )
            {
            // InternalKant.g:1002:2: ( ( (lv_inverter_0_0= RULE_ID ) ) otherlv_1= 'invert' ( (lv_function_2_0= RULE_ID ) ) )
            // InternalKant.g:1003:3: ( (lv_inverter_0_0= RULE_ID ) ) otherlv_1= 'invert' ( (lv_function_2_0= RULE_ID ) )
            {
            // InternalKant.g:1003:3: ( (lv_inverter_0_0= RULE_ID ) )
            // InternalKant.g:1004:4: (lv_inverter_0_0= RULE_ID )
            {
            // InternalKant.g:1004:4: (lv_inverter_0_0= RULE_ID )
            // InternalKant.g:1005:5: lv_inverter_0_0= RULE_ID
            {
            lv_inverter_0_0=(Token)match(input,RULE_ID,FOLLOW_22); 

            					newLeafNode(lv_inverter_0_0, grammarAccess.getFunctionInversionDefAccess().getInverterIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFunctionInversionDefRule());
            					}
            					setWithLastConsumed(
            						current,
            						"inverter",
            						lv_inverter_0_0,
            						"it.unimi.xtext.Kant.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,27,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getFunctionInversionDefAccess().getInvertKeyword_1());
            		
            // InternalKant.g:1025:3: ( (lv_function_2_0= RULE_ID ) )
            // InternalKant.g:1026:4: (lv_function_2_0= RULE_ID )
            {
            // InternalKant.g:1026:4: (lv_function_2_0= RULE_ID )
            // InternalKant.g:1027:5: lv_function_2_0= RULE_ID
            {
            lv_function_2_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_function_2_0, grammarAccess.getFunctionInversionDefAccess().getFunctionIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFunctionInversionDefRule());
            					}
            					setWithLastConsumed(
            						current,
            						"function",
            						lv_function_2_0,
            						"it.unimi.xtext.Kant.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFunctionInversionDef"


    // $ANTLR start "entryRuleKnowledgeBase"
    // InternalKant.g:1047:1: entryRuleKnowledgeBase returns [EObject current=null] : iv_ruleKnowledgeBase= ruleKnowledgeBase EOF ;
    public final EObject entryRuleKnowledgeBase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKnowledgeBase = null;


        try {
            // InternalKant.g:1047:54: (iv_ruleKnowledgeBase= ruleKnowledgeBase EOF )
            // InternalKant.g:1048:2: iv_ruleKnowledgeBase= ruleKnowledgeBase EOF
            {
             newCompositeNode(grammarAccess.getKnowledgeBaseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleKnowledgeBase=ruleKnowledgeBase();

            state._fsp--;

             current =iv_ruleKnowledgeBase; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleKnowledgeBase"


    // $ANTLR start "ruleKnowledgeBase"
    // InternalKant.g:1054:1: ruleKnowledgeBase returns [EObject current=null] : ( ( (lv_shared_0_0= 'shared' ) )? otherlv_1= 'knowledge' ( (lv_knowledge_2_0= ruleKnowledge ) ) ) ;
    public final EObject ruleKnowledgeBase() throws RecognitionException {
        EObject current = null;

        Token lv_shared_0_0=null;
        Token otherlv_1=null;
        EObject lv_knowledge_2_0 = null;



        	enterRule();

        try {
            // InternalKant.g:1060:2: ( ( ( (lv_shared_0_0= 'shared' ) )? otherlv_1= 'knowledge' ( (lv_knowledge_2_0= ruleKnowledge ) ) ) )
            // InternalKant.g:1061:2: ( ( (lv_shared_0_0= 'shared' ) )? otherlv_1= 'knowledge' ( (lv_knowledge_2_0= ruleKnowledge ) ) )
            {
            // InternalKant.g:1061:2: ( ( (lv_shared_0_0= 'shared' ) )? otherlv_1= 'knowledge' ( (lv_knowledge_2_0= ruleKnowledge ) ) )
            // InternalKant.g:1062:3: ( (lv_shared_0_0= 'shared' ) )? otherlv_1= 'knowledge' ( (lv_knowledge_2_0= ruleKnowledge ) )
            {
            // InternalKant.g:1062:3: ( (lv_shared_0_0= 'shared' ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==28) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalKant.g:1063:4: (lv_shared_0_0= 'shared' )
                    {
                    // InternalKant.g:1063:4: (lv_shared_0_0= 'shared' )
                    // InternalKant.g:1064:5: lv_shared_0_0= 'shared'
                    {
                    lv_shared_0_0=(Token)match(input,28,FOLLOW_23); 

                    					newLeafNode(lv_shared_0_0, grammarAccess.getKnowledgeBaseAccess().getSharedSharedKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getKnowledgeBaseRule());
                    					}
                    					setWithLastConsumed(current, "shared", lv_shared_0_0 != null, "shared");
                    				

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,29,FOLLOW_24); 

            			newLeafNode(otherlv_1, grammarAccess.getKnowledgeBaseAccess().getKnowledgeKeyword_1());
            		
            // InternalKant.g:1080:3: ( (lv_knowledge_2_0= ruleKnowledge ) )
            // InternalKant.g:1081:4: (lv_knowledge_2_0= ruleKnowledge )
            {
            // InternalKant.g:1081:4: (lv_knowledge_2_0= ruleKnowledge )
            // InternalKant.g:1082:5: lv_knowledge_2_0= ruleKnowledge
            {

            					newCompositeNode(grammarAccess.getKnowledgeBaseAccess().getKnowledgeKnowledgeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_knowledge_2_0=ruleKnowledge();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getKnowledgeBaseRule());
            					}
            					set(
            						current,
            						"knowledge",
            						lv_knowledge_2_0,
            						"it.unimi.xtext.Kant.Knowledge");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleKnowledgeBase"


    // $ANTLR start "entryRulePrincipal"
    // InternalKant.g:1103:1: entryRulePrincipal returns [EObject current=null] : iv_rulePrincipal= rulePrincipal EOF ;
    public final EObject entryRulePrincipal() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrincipal = null;


        try {
            // InternalKant.g:1103:50: (iv_rulePrincipal= rulePrincipal EOF )
            // InternalKant.g:1104:2: iv_rulePrincipal= rulePrincipal EOF
            {
             newCompositeNode(grammarAccess.getPrincipalRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrincipal=rulePrincipal();

            state._fsp--;

             current =iv_rulePrincipal; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrincipal"


    // $ANTLR start "rulePrincipal"
    // InternalKant.g:1110:1: rulePrincipal returns [EObject current=null] : (otherlv_0= 'principal' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_name_3_0= RULE_ID ) ) )* (otherlv_4= 'know' ( (lv_knowledge_5_0= ruleKnowledge ) ) )? ) ;
    public final EObject rulePrincipal() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        EObject lv_knowledge_5_0 = null;



        	enterRule();

        try {
            // InternalKant.g:1116:2: ( (otherlv_0= 'principal' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_name_3_0= RULE_ID ) ) )* (otherlv_4= 'know' ( (lv_knowledge_5_0= ruleKnowledge ) ) )? ) )
            // InternalKant.g:1117:2: (otherlv_0= 'principal' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_name_3_0= RULE_ID ) ) )* (otherlv_4= 'know' ( (lv_knowledge_5_0= ruleKnowledge ) ) )? )
            {
            // InternalKant.g:1117:2: (otherlv_0= 'principal' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_name_3_0= RULE_ID ) ) )* (otherlv_4= 'know' ( (lv_knowledge_5_0= ruleKnowledge ) ) )? )
            // InternalKant.g:1118:3: otherlv_0= 'principal' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_name_3_0= RULE_ID ) ) )* (otherlv_4= 'know' ( (lv_knowledge_5_0= ruleKnowledge ) ) )?
            {
            otherlv_0=(Token)match(input,30,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getPrincipalAccess().getPrincipalKeyword_0());
            		
            // InternalKant.g:1122:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalKant.g:1123:4: (lv_name_1_0= RULE_ID )
            {
            // InternalKant.g:1123:4: (lv_name_1_0= RULE_ID )
            // InternalKant.g:1124:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_25); 

            					newLeafNode(lv_name_1_0, grammarAccess.getPrincipalAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPrincipalRule());
            					}
            					addWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"it.unimi.xtext.Kant.ID");
            				

            }


            }

            // InternalKant.g:1140:3: (otherlv_2= ',' ( (lv_name_3_0= RULE_ID ) ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==10) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalKant.g:1141:4: otherlv_2= ',' ( (lv_name_3_0= RULE_ID ) )
            	    {
            	    otherlv_2=(Token)match(input,10,FOLLOW_4); 

            	    				newLeafNode(otherlv_2, grammarAccess.getPrincipalAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalKant.g:1145:4: ( (lv_name_3_0= RULE_ID ) )
            	    // InternalKant.g:1146:5: (lv_name_3_0= RULE_ID )
            	    {
            	    // InternalKant.g:1146:5: (lv_name_3_0= RULE_ID )
            	    // InternalKant.g:1147:6: lv_name_3_0= RULE_ID
            	    {
            	    lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_25); 

            	    						newLeafNode(lv_name_3_0, grammarAccess.getPrincipalAccess().getNameIDTerminalRuleCall_2_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getPrincipalRule());
            	    						}
            	    						addWithLastConsumed(
            	    							current,
            	    							"name",
            	    							lv_name_3_0,
            	    							"it.unimi.xtext.Kant.ID");
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

            // InternalKant.g:1164:3: (otherlv_4= 'know' ( (lv_knowledge_5_0= ruleKnowledge ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==31) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalKant.g:1165:4: otherlv_4= 'know' ( (lv_knowledge_5_0= ruleKnowledge ) )
                    {
                    otherlv_4=(Token)match(input,31,FOLLOW_24); 

                    				newLeafNode(otherlv_4, grammarAccess.getPrincipalAccess().getKnowKeyword_3_0());
                    			
                    // InternalKant.g:1169:4: ( (lv_knowledge_5_0= ruleKnowledge ) )
                    // InternalKant.g:1170:5: (lv_knowledge_5_0= ruleKnowledge )
                    {
                    // InternalKant.g:1170:5: (lv_knowledge_5_0= ruleKnowledge )
                    // InternalKant.g:1171:6: lv_knowledge_5_0= ruleKnowledge
                    {

                    						newCompositeNode(grammarAccess.getPrincipalAccess().getKnowledgeKnowledgeParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_knowledge_5_0=ruleKnowledge();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPrincipalRule());
                    						}
                    						set(
                    							current,
                    							"knowledge",
                    							lv_knowledge_5_0,
                    							"it.unimi.xtext.Kant.Knowledge");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrincipal"


    // $ANTLR start "entryRuleKnowledge"
    // InternalKant.g:1193:1: entryRuleKnowledge returns [EObject current=null] : iv_ruleKnowledge= ruleKnowledge EOF ;
    public final EObject entryRuleKnowledge() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKnowledge = null;


        try {
            // InternalKant.g:1193:50: (iv_ruleKnowledge= ruleKnowledge EOF )
            // InternalKant.g:1194:2: iv_ruleKnowledge= ruleKnowledge EOF
            {
             newCompositeNode(grammarAccess.getKnowledgeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleKnowledge=ruleKnowledge();

            state._fsp--;

             current =iv_ruleKnowledge; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleKnowledge"


    // $ANTLR start "ruleKnowledge"
    // InternalKant.g:1200:1: ruleKnowledge returns [EObject current=null] : (this_KnowledgeDef_0= ruleKnowledgeDef | this_KnowledgeValue_1= ruleKnowledgeValue ) ;
    public final EObject ruleKnowledge() throws RecognitionException {
        EObject current = null;

        EObject this_KnowledgeDef_0 = null;

        EObject this_KnowledgeValue_1 = null;



        	enterRule();

        try {
            // InternalKant.g:1206:2: ( (this_KnowledgeDef_0= ruleKnowledgeDef | this_KnowledgeValue_1= ruleKnowledgeValue ) )
            // InternalKant.g:1207:2: (this_KnowledgeDef_0= ruleKnowledgeDef | this_KnowledgeValue_1= ruleKnowledgeValue )
            {
            // InternalKant.g:1207:2: (this_KnowledgeDef_0= ruleKnowledgeDef | this_KnowledgeValue_1= ruleKnowledgeValue )
            int alt25=2;
            alt25 = dfa25.predict(input);
            switch (alt25) {
                case 1 :
                    // InternalKant.g:1208:3: this_KnowledgeDef_0= ruleKnowledgeDef
                    {

                    			newCompositeNode(grammarAccess.getKnowledgeAccess().getKnowledgeDefParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_KnowledgeDef_0=ruleKnowledgeDef();

                    state._fsp--;


                    			current = this_KnowledgeDef_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalKant.g:1217:3: this_KnowledgeValue_1= ruleKnowledgeValue
                    {

                    			newCompositeNode(grammarAccess.getKnowledgeAccess().getKnowledgeValueParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_KnowledgeValue_1=ruleKnowledgeValue();

                    state._fsp--;


                    			current = this_KnowledgeValue_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleKnowledge"


    // $ANTLR start "entryRuleKnowledgeDef"
    // InternalKant.g:1229:1: entryRuleKnowledgeDef returns [EObject current=null] : iv_ruleKnowledgeDef= ruleKnowledgeDef EOF ;
    public final EObject entryRuleKnowledgeDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKnowledgeDef = null;


        try {
            // InternalKant.g:1229:53: (iv_ruleKnowledgeDef= ruleKnowledgeDef EOF )
            // InternalKant.g:1230:2: iv_ruleKnowledgeDef= ruleKnowledgeDef EOF
            {
             newCompositeNode(grammarAccess.getKnowledgeDefRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleKnowledgeDef=ruleKnowledgeDef();

            state._fsp--;

             current =iv_ruleKnowledgeDef; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleKnowledgeDef"


    // $ANTLR start "ruleKnowledgeDef"
    // InternalKant.g:1236:1: ruleKnowledgeDef returns [EObject current=null] : ( ( ( ( (lv_name_0_0= RULE_ID ) ) | this_KnowledgeDefDestructuring_1= ruleKnowledgeDefDestructuring ) otherlv_2= '=' ( (lv_value_3_0= ruleKnowledgeValue ) ) ) | ( (otherlv_4= 'const' | otherlv_5= 'fresh' ) ( ( (lv_name_6_0= RULE_ID ) ) | (otherlv_7= '{' ( (lv_name_8_0= RULE_ID ) ) (otherlv_9= ',' ( (lv_name_10_0= RULE_ID ) ) )* otherlv_11= '}' ) ) ) ) ;
    public final EObject ruleKnowledgeDef() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_name_6_0=null;
        Token otherlv_7=null;
        Token lv_name_8_0=null;
        Token otherlv_9=null;
        Token lv_name_10_0=null;
        Token otherlv_11=null;
        EObject this_KnowledgeDefDestructuring_1 = null;

        EObject lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalKant.g:1242:2: ( ( ( ( ( (lv_name_0_0= RULE_ID ) ) | this_KnowledgeDefDestructuring_1= ruleKnowledgeDefDestructuring ) otherlv_2= '=' ( (lv_value_3_0= ruleKnowledgeValue ) ) ) | ( (otherlv_4= 'const' | otherlv_5= 'fresh' ) ( ( (lv_name_6_0= RULE_ID ) ) | (otherlv_7= '{' ( (lv_name_8_0= RULE_ID ) ) (otherlv_9= ',' ( (lv_name_10_0= RULE_ID ) ) )* otherlv_11= '}' ) ) ) ) )
            // InternalKant.g:1243:2: ( ( ( ( (lv_name_0_0= RULE_ID ) ) | this_KnowledgeDefDestructuring_1= ruleKnowledgeDefDestructuring ) otherlv_2= '=' ( (lv_value_3_0= ruleKnowledgeValue ) ) ) | ( (otherlv_4= 'const' | otherlv_5= 'fresh' ) ( ( (lv_name_6_0= RULE_ID ) ) | (otherlv_7= '{' ( (lv_name_8_0= RULE_ID ) ) (otherlv_9= ',' ( (lv_name_10_0= RULE_ID ) ) )* otherlv_11= '}' ) ) ) )
            {
            // InternalKant.g:1243:2: ( ( ( ( (lv_name_0_0= RULE_ID ) ) | this_KnowledgeDefDestructuring_1= ruleKnowledgeDefDestructuring ) otherlv_2= '=' ( (lv_value_3_0= ruleKnowledgeValue ) ) ) | ( (otherlv_4= 'const' | otherlv_5= 'fresh' ) ( ( (lv_name_6_0= RULE_ID ) ) | (otherlv_7= '{' ( (lv_name_8_0= RULE_ID ) ) (otherlv_9= ',' ( (lv_name_10_0= RULE_ID ) ) )* otherlv_11= '}' ) ) ) )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_ID||LA30_0==23||LA30_0==34) ) {
                alt30=1;
            }
            else if ( ((LA30_0>=32 && LA30_0<=33)) ) {
                alt30=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // InternalKant.g:1244:3: ( ( ( (lv_name_0_0= RULE_ID ) ) | this_KnowledgeDefDestructuring_1= ruleKnowledgeDefDestructuring ) otherlv_2= '=' ( (lv_value_3_0= ruleKnowledgeValue ) ) )
                    {
                    // InternalKant.g:1244:3: ( ( ( (lv_name_0_0= RULE_ID ) ) | this_KnowledgeDefDestructuring_1= ruleKnowledgeDefDestructuring ) otherlv_2= '=' ( (lv_value_3_0= ruleKnowledgeValue ) ) )
                    // InternalKant.g:1245:4: ( ( (lv_name_0_0= RULE_ID ) ) | this_KnowledgeDefDestructuring_1= ruleKnowledgeDefDestructuring ) otherlv_2= '=' ( (lv_value_3_0= ruleKnowledgeValue ) )
                    {
                    // InternalKant.g:1245:4: ( ( (lv_name_0_0= RULE_ID ) ) | this_KnowledgeDefDestructuring_1= ruleKnowledgeDefDestructuring )
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0==RULE_ID) ) {
                        alt26=1;
                    }
                    else if ( (LA26_0==23||LA26_0==34) ) {
                        alt26=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 26, 0, input);

                        throw nvae;
                    }
                    switch (alt26) {
                        case 1 :
                            // InternalKant.g:1246:5: ( (lv_name_0_0= RULE_ID ) )
                            {
                            // InternalKant.g:1246:5: ( (lv_name_0_0= RULE_ID ) )
                            // InternalKant.g:1247:6: (lv_name_0_0= RULE_ID )
                            {
                            // InternalKant.g:1247:6: (lv_name_0_0= RULE_ID )
                            // InternalKant.g:1248:7: lv_name_0_0= RULE_ID
                            {
                            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_26); 

                            							newLeafNode(lv_name_0_0, grammarAccess.getKnowledgeDefAccess().getNameIDTerminalRuleCall_0_0_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getKnowledgeDefRule());
                            							}
                            							addWithLastConsumed(
                            								current,
                            								"name",
                            								lv_name_0_0,
                            								"it.unimi.xtext.Kant.ID");
                            						

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalKant.g:1265:5: this_KnowledgeDefDestructuring_1= ruleKnowledgeDefDestructuring
                            {

                            					newCompositeNode(grammarAccess.getKnowledgeDefAccess().getKnowledgeDefDestructuringParserRuleCall_0_0_1());
                            				
                            pushFollow(FOLLOW_26);
                            this_KnowledgeDefDestructuring_1=ruleKnowledgeDefDestructuring();

                            state._fsp--;


                            					current = this_KnowledgeDefDestructuring_1;
                            					afterParserOrEnumRuleCall();
                            				

                            }
                            break;

                    }

                    otherlv_2=(Token)match(input,22,FOLLOW_18); 

                    				newLeafNode(otherlv_2, grammarAccess.getKnowledgeDefAccess().getEqualsSignKeyword_0_1());
                    			
                    // InternalKant.g:1278:4: ( (lv_value_3_0= ruleKnowledgeValue ) )
                    // InternalKant.g:1279:5: (lv_value_3_0= ruleKnowledgeValue )
                    {
                    // InternalKant.g:1279:5: (lv_value_3_0= ruleKnowledgeValue )
                    // InternalKant.g:1280:6: lv_value_3_0= ruleKnowledgeValue
                    {

                    						newCompositeNode(grammarAccess.getKnowledgeDefAccess().getValueKnowledgeValueParserRuleCall_0_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_value_3_0=ruleKnowledgeValue();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getKnowledgeDefRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_3_0,
                    							"it.unimi.xtext.Kant.KnowledgeValue");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalKant.g:1299:3: ( (otherlv_4= 'const' | otherlv_5= 'fresh' ) ( ( (lv_name_6_0= RULE_ID ) ) | (otherlv_7= '{' ( (lv_name_8_0= RULE_ID ) ) (otherlv_9= ',' ( (lv_name_10_0= RULE_ID ) ) )* otherlv_11= '}' ) ) )
                    {
                    // InternalKant.g:1299:3: ( (otherlv_4= 'const' | otherlv_5= 'fresh' ) ( ( (lv_name_6_0= RULE_ID ) ) | (otherlv_7= '{' ( (lv_name_8_0= RULE_ID ) ) (otherlv_9= ',' ( (lv_name_10_0= RULE_ID ) ) )* otherlv_11= '}' ) ) )
                    // InternalKant.g:1300:4: (otherlv_4= 'const' | otherlv_5= 'fresh' ) ( ( (lv_name_6_0= RULE_ID ) ) | (otherlv_7= '{' ( (lv_name_8_0= RULE_ID ) ) (otherlv_9= ',' ( (lv_name_10_0= RULE_ID ) ) )* otherlv_11= '}' ) )
                    {
                    // InternalKant.g:1300:4: (otherlv_4= 'const' | otherlv_5= 'fresh' )
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0==32) ) {
                        alt27=1;
                    }
                    else if ( (LA27_0==33) ) {
                        alt27=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 27, 0, input);

                        throw nvae;
                    }
                    switch (alt27) {
                        case 1 :
                            // InternalKant.g:1301:5: otherlv_4= 'const'
                            {
                            otherlv_4=(Token)match(input,32,FOLLOW_11); 

                            					newLeafNode(otherlv_4, grammarAccess.getKnowledgeDefAccess().getConstKeyword_1_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalKant.g:1306:5: otherlv_5= 'fresh'
                            {
                            otherlv_5=(Token)match(input,33,FOLLOW_11); 

                            					newLeafNode(otherlv_5, grammarAccess.getKnowledgeDefAccess().getFreshKeyword_1_0_1());
                            				

                            }
                            break;

                    }

                    // InternalKant.g:1311:4: ( ( (lv_name_6_0= RULE_ID ) ) | (otherlv_7= '{' ( (lv_name_8_0= RULE_ID ) ) (otherlv_9= ',' ( (lv_name_10_0= RULE_ID ) ) )* otherlv_11= '}' ) )
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( (LA29_0==RULE_ID) ) {
                        alt29=1;
                    }
                    else if ( (LA29_0==23) ) {
                        alt29=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 29, 0, input);

                        throw nvae;
                    }
                    switch (alt29) {
                        case 1 :
                            // InternalKant.g:1312:5: ( (lv_name_6_0= RULE_ID ) )
                            {
                            // InternalKant.g:1312:5: ( (lv_name_6_0= RULE_ID ) )
                            // InternalKant.g:1313:6: (lv_name_6_0= RULE_ID )
                            {
                            // InternalKant.g:1313:6: (lv_name_6_0= RULE_ID )
                            // InternalKant.g:1314:7: lv_name_6_0= RULE_ID
                            {
                            lv_name_6_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                            							newLeafNode(lv_name_6_0, grammarAccess.getKnowledgeDefAccess().getNameIDTerminalRuleCall_1_1_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getKnowledgeDefRule());
                            							}
                            							addWithLastConsumed(
                            								current,
                            								"name",
                            								lv_name_6_0,
                            								"it.unimi.xtext.Kant.ID");
                            						

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalKant.g:1331:5: (otherlv_7= '{' ( (lv_name_8_0= RULE_ID ) ) (otherlv_9= ',' ( (lv_name_10_0= RULE_ID ) ) )* otherlv_11= '}' )
                            {
                            // InternalKant.g:1331:5: (otherlv_7= '{' ( (lv_name_8_0= RULE_ID ) ) (otherlv_9= ',' ( (lv_name_10_0= RULE_ID ) ) )* otherlv_11= '}' )
                            // InternalKant.g:1332:6: otherlv_7= '{' ( (lv_name_8_0= RULE_ID ) ) (otherlv_9= ',' ( (lv_name_10_0= RULE_ID ) ) )* otherlv_11= '}'
                            {
                            otherlv_7=(Token)match(input,23,FOLLOW_4); 

                            						newLeafNode(otherlv_7, grammarAccess.getKnowledgeDefAccess().getLeftCurlyBracketKeyword_1_1_1_0());
                            					
                            // InternalKant.g:1336:6: ( (lv_name_8_0= RULE_ID ) )
                            // InternalKant.g:1337:7: (lv_name_8_0= RULE_ID )
                            {
                            // InternalKant.g:1337:7: (lv_name_8_0= RULE_ID )
                            // InternalKant.g:1338:8: lv_name_8_0= RULE_ID
                            {
                            lv_name_8_0=(Token)match(input,RULE_ID,FOLLOW_19); 

                            								newLeafNode(lv_name_8_0, grammarAccess.getKnowledgeDefAccess().getNameIDTerminalRuleCall_1_1_1_1_0());
                            							

                            								if (current==null) {
                            									current = createModelElement(grammarAccess.getKnowledgeDefRule());
                            								}
                            								addWithLastConsumed(
                            									current,
                            									"name",
                            									lv_name_8_0,
                            									"it.unimi.xtext.Kant.ID");
                            							

                            }


                            }

                            // InternalKant.g:1354:6: (otherlv_9= ',' ( (lv_name_10_0= RULE_ID ) ) )*
                            loop28:
                            do {
                                int alt28=2;
                                int LA28_0 = input.LA(1);

                                if ( (LA28_0==10) ) {
                                    alt28=1;
                                }


                                switch (alt28) {
                            	case 1 :
                            	    // InternalKant.g:1355:7: otherlv_9= ',' ( (lv_name_10_0= RULE_ID ) )
                            	    {
                            	    otherlv_9=(Token)match(input,10,FOLLOW_4); 

                            	    							newLeafNode(otherlv_9, grammarAccess.getKnowledgeDefAccess().getCommaKeyword_1_1_1_2_0());
                            	    						
                            	    // InternalKant.g:1359:7: ( (lv_name_10_0= RULE_ID ) )
                            	    // InternalKant.g:1360:8: (lv_name_10_0= RULE_ID )
                            	    {
                            	    // InternalKant.g:1360:8: (lv_name_10_0= RULE_ID )
                            	    // InternalKant.g:1361:9: lv_name_10_0= RULE_ID
                            	    {
                            	    lv_name_10_0=(Token)match(input,RULE_ID,FOLLOW_19); 

                            	    									newLeafNode(lv_name_10_0, grammarAccess.getKnowledgeDefAccess().getNameIDTerminalRuleCall_1_1_1_2_1_0());
                            	    								

                            	    									if (current==null) {
                            	    										current = createModelElement(grammarAccess.getKnowledgeDefRule());
                            	    									}
                            	    									addWithLastConsumed(
                            	    										current,
                            	    										"name",
                            	    										lv_name_10_0,
                            	    										"it.unimi.xtext.Kant.ID");
                            	    								

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop28;
                                }
                            } while (true);

                            otherlv_11=(Token)match(input,24,FOLLOW_2); 

                            						newLeafNode(otherlv_11, grammarAccess.getKnowledgeDefAccess().getRightCurlyBracketKeyword_1_1_1_3());
                            					

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleKnowledgeDef"


    // $ANTLR start "entryRuleKnowledgeDefDestructuring"
    // InternalKant.g:1389:1: entryRuleKnowledgeDefDestructuring returns [EObject current=null] : iv_ruleKnowledgeDefDestructuring= ruleKnowledgeDefDestructuring EOF ;
    public final EObject entryRuleKnowledgeDefDestructuring() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKnowledgeDefDestructuring = null;


        try {
            // InternalKant.g:1389:66: (iv_ruleKnowledgeDefDestructuring= ruleKnowledgeDefDestructuring EOF )
            // InternalKant.g:1390:2: iv_ruleKnowledgeDefDestructuring= ruleKnowledgeDefDestructuring EOF
            {
             newCompositeNode(grammarAccess.getKnowledgeDefDestructuringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleKnowledgeDefDestructuring=ruleKnowledgeDefDestructuring();

            state._fsp--;

             current =iv_ruleKnowledgeDefDestructuring; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleKnowledgeDefDestructuring"


    // $ANTLR start "ruleKnowledgeDefDestructuring"
    // InternalKant.g:1396:1: ruleKnowledgeDefDestructuring returns [EObject current=null] : (this_KnowledgeDefSetDestructuring_0= ruleKnowledgeDefSetDestructuring | this_KnowledgeDefListDestructuring_1= ruleKnowledgeDefListDestructuring ) ;
    public final EObject ruleKnowledgeDefDestructuring() throws RecognitionException {
        EObject current = null;

        EObject this_KnowledgeDefSetDestructuring_0 = null;

        EObject this_KnowledgeDefListDestructuring_1 = null;



        	enterRule();

        try {
            // InternalKant.g:1402:2: ( (this_KnowledgeDefSetDestructuring_0= ruleKnowledgeDefSetDestructuring | this_KnowledgeDefListDestructuring_1= ruleKnowledgeDefListDestructuring ) )
            // InternalKant.g:1403:2: (this_KnowledgeDefSetDestructuring_0= ruleKnowledgeDefSetDestructuring | this_KnowledgeDefListDestructuring_1= ruleKnowledgeDefListDestructuring )
            {
            // InternalKant.g:1403:2: (this_KnowledgeDefSetDestructuring_0= ruleKnowledgeDefSetDestructuring | this_KnowledgeDefListDestructuring_1= ruleKnowledgeDefListDestructuring )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==23) ) {
                alt31=1;
            }
            else if ( (LA31_0==34) ) {
                alt31=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // InternalKant.g:1404:3: this_KnowledgeDefSetDestructuring_0= ruleKnowledgeDefSetDestructuring
                    {

                    			newCompositeNode(grammarAccess.getKnowledgeDefDestructuringAccess().getKnowledgeDefSetDestructuringParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_KnowledgeDefSetDestructuring_0=ruleKnowledgeDefSetDestructuring();

                    state._fsp--;


                    			current = this_KnowledgeDefSetDestructuring_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalKant.g:1413:3: this_KnowledgeDefListDestructuring_1= ruleKnowledgeDefListDestructuring
                    {

                    			newCompositeNode(grammarAccess.getKnowledgeDefDestructuringAccess().getKnowledgeDefListDestructuringParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_KnowledgeDefListDestructuring_1=ruleKnowledgeDefListDestructuring();

                    state._fsp--;


                    			current = this_KnowledgeDefListDestructuring_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleKnowledgeDefDestructuring"


    // $ANTLR start "entryRuleKnowledgeDefSetDestructuring"
    // InternalKant.g:1425:1: entryRuleKnowledgeDefSetDestructuring returns [EObject current=null] : iv_ruleKnowledgeDefSetDestructuring= ruleKnowledgeDefSetDestructuring EOF ;
    public final EObject entryRuleKnowledgeDefSetDestructuring() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKnowledgeDefSetDestructuring = null;


        try {
            // InternalKant.g:1425:69: (iv_ruleKnowledgeDefSetDestructuring= ruleKnowledgeDefSetDestructuring EOF )
            // InternalKant.g:1426:2: iv_ruleKnowledgeDefSetDestructuring= ruleKnowledgeDefSetDestructuring EOF
            {
             newCompositeNode(grammarAccess.getKnowledgeDefSetDestructuringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleKnowledgeDefSetDestructuring=ruleKnowledgeDefSetDestructuring();

            state._fsp--;

             current =iv_ruleKnowledgeDefSetDestructuring; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleKnowledgeDefSetDestructuring"


    // $ANTLR start "ruleKnowledgeDefSetDestructuring"
    // InternalKant.g:1432:1: ruleKnowledgeDefSetDestructuring returns [EObject current=null] : ( () otherlv_1= '{' ( ( (lv_assignments_2_0= ruleKnowledgeDefSetDesctructuringAssignment ) ) (otherlv_3= ',' ( (lv_assignments_4_0= ruleKnowledgeDefSetDesctructuringAssignment ) ) )* )? otherlv_5= '}' ) ;
    public final EObject ruleKnowledgeDefSetDestructuring() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_assignments_2_0 = null;

        EObject lv_assignments_4_0 = null;



        	enterRule();

        try {
            // InternalKant.g:1438:2: ( ( () otherlv_1= '{' ( ( (lv_assignments_2_0= ruleKnowledgeDefSetDesctructuringAssignment ) ) (otherlv_3= ',' ( (lv_assignments_4_0= ruleKnowledgeDefSetDesctructuringAssignment ) ) )* )? otherlv_5= '}' ) )
            // InternalKant.g:1439:2: ( () otherlv_1= '{' ( ( (lv_assignments_2_0= ruleKnowledgeDefSetDesctructuringAssignment ) ) (otherlv_3= ',' ( (lv_assignments_4_0= ruleKnowledgeDefSetDesctructuringAssignment ) ) )* )? otherlv_5= '}' )
            {
            // InternalKant.g:1439:2: ( () otherlv_1= '{' ( ( (lv_assignments_2_0= ruleKnowledgeDefSetDesctructuringAssignment ) ) (otherlv_3= ',' ( (lv_assignments_4_0= ruleKnowledgeDefSetDesctructuringAssignment ) ) )* )? otherlv_5= '}' )
            // InternalKant.g:1440:3: () otherlv_1= '{' ( ( (lv_assignments_2_0= ruleKnowledgeDefSetDesctructuringAssignment ) ) (otherlv_3= ',' ( (lv_assignments_4_0= ruleKnowledgeDefSetDesctructuringAssignment ) ) )* )? otherlv_5= '}'
            {
            // InternalKant.g:1440:3: ()
            // InternalKant.g:1441:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getKnowledgeDefSetDestructuringAccess().getKnowledgeDefSetDestructuringAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,23,FOLLOW_27); 

            			newLeafNode(otherlv_1, grammarAccess.getKnowledgeDefSetDestructuringAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalKant.g:1451:3: ( ( (lv_assignments_2_0= ruleKnowledgeDefSetDesctructuringAssignment ) ) (otherlv_3= ',' ( (lv_assignments_4_0= ruleKnowledgeDefSetDesctructuringAssignment ) ) )* )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==RULE_ID) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalKant.g:1452:4: ( (lv_assignments_2_0= ruleKnowledgeDefSetDesctructuringAssignment ) ) (otherlv_3= ',' ( (lv_assignments_4_0= ruleKnowledgeDefSetDesctructuringAssignment ) ) )*
                    {
                    // InternalKant.g:1452:4: ( (lv_assignments_2_0= ruleKnowledgeDefSetDesctructuringAssignment ) )
                    // InternalKant.g:1453:5: (lv_assignments_2_0= ruleKnowledgeDefSetDesctructuringAssignment )
                    {
                    // InternalKant.g:1453:5: (lv_assignments_2_0= ruleKnowledgeDefSetDesctructuringAssignment )
                    // InternalKant.g:1454:6: lv_assignments_2_0= ruleKnowledgeDefSetDesctructuringAssignment
                    {

                    						newCompositeNode(grammarAccess.getKnowledgeDefSetDestructuringAccess().getAssignmentsKnowledgeDefSetDesctructuringAssignmentParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_19);
                    lv_assignments_2_0=ruleKnowledgeDefSetDesctructuringAssignment();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getKnowledgeDefSetDestructuringRule());
                    						}
                    						add(
                    							current,
                    							"assignments",
                    							lv_assignments_2_0,
                    							"it.unimi.xtext.Kant.KnowledgeDefSetDesctructuringAssignment");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalKant.g:1471:4: (otherlv_3= ',' ( (lv_assignments_4_0= ruleKnowledgeDefSetDesctructuringAssignment ) ) )*
                    loop32:
                    do {
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( (LA32_0==10) ) {
                            alt32=1;
                        }


                        switch (alt32) {
                    	case 1 :
                    	    // InternalKant.g:1472:5: otherlv_3= ',' ( (lv_assignments_4_0= ruleKnowledgeDefSetDesctructuringAssignment ) )
                    	    {
                    	    otherlv_3=(Token)match(input,10,FOLLOW_4); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getKnowledgeDefSetDestructuringAccess().getCommaKeyword_2_1_0());
                    	    				
                    	    // InternalKant.g:1476:5: ( (lv_assignments_4_0= ruleKnowledgeDefSetDesctructuringAssignment ) )
                    	    // InternalKant.g:1477:6: (lv_assignments_4_0= ruleKnowledgeDefSetDesctructuringAssignment )
                    	    {
                    	    // InternalKant.g:1477:6: (lv_assignments_4_0= ruleKnowledgeDefSetDesctructuringAssignment )
                    	    // InternalKant.g:1478:7: lv_assignments_4_0= ruleKnowledgeDefSetDesctructuringAssignment
                    	    {

                    	    							newCompositeNode(grammarAccess.getKnowledgeDefSetDestructuringAccess().getAssignmentsKnowledgeDefSetDesctructuringAssignmentParserRuleCall_2_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_19);
                    	    lv_assignments_4_0=ruleKnowledgeDefSetDesctructuringAssignment();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getKnowledgeDefSetDestructuringRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"assignments",
                    	    								lv_assignments_4_0,
                    	    								"it.unimi.xtext.Kant.KnowledgeDefSetDesctructuringAssignment");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop32;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,24,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getKnowledgeDefSetDestructuringAccess().getRightCurlyBracketKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleKnowledgeDefSetDestructuring"


    // $ANTLR start "entryRuleKnowledgeDefSetDesctructuringAssignment"
    // InternalKant.g:1505:1: entryRuleKnowledgeDefSetDesctructuringAssignment returns [EObject current=null] : iv_ruleKnowledgeDefSetDesctructuringAssignment= ruleKnowledgeDefSetDesctructuringAssignment EOF ;
    public final EObject entryRuleKnowledgeDefSetDesctructuringAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKnowledgeDefSetDesctructuringAssignment = null;


        try {
            // InternalKant.g:1505:80: (iv_ruleKnowledgeDefSetDesctructuringAssignment= ruleKnowledgeDefSetDesctructuringAssignment EOF )
            // InternalKant.g:1506:2: iv_ruleKnowledgeDefSetDesctructuringAssignment= ruleKnowledgeDefSetDesctructuringAssignment EOF
            {
             newCompositeNode(grammarAccess.getKnowledgeDefSetDesctructuringAssignmentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleKnowledgeDefSetDesctructuringAssignment=ruleKnowledgeDefSetDesctructuringAssignment();

            state._fsp--;

             current =iv_ruleKnowledgeDefSetDesctructuringAssignment; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleKnowledgeDefSetDesctructuringAssignment"


    // $ANTLR start "ruleKnowledgeDefSetDesctructuringAssignment"
    // InternalKant.g:1512:1: ruleKnowledgeDefSetDesctructuringAssignment returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_from_2_0= RULE_ID ) ) )? ) ;
    public final EObject ruleKnowledgeDefSetDesctructuringAssignment() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_from_2_0=null;


        	enterRule();

        try {
            // InternalKant.g:1518:2: ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_from_2_0= RULE_ID ) ) )? ) )
            // InternalKant.g:1519:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_from_2_0= RULE_ID ) ) )? )
            {
            // InternalKant.g:1519:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_from_2_0= RULE_ID ) ) )? )
            // InternalKant.g:1520:3: ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_from_2_0= RULE_ID ) ) )?
            {
            // InternalKant.g:1520:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalKant.g:1521:4: (lv_name_0_0= RULE_ID )
            {
            // InternalKant.g:1521:4: (lv_name_0_0= RULE_ID )
            // InternalKant.g:1522:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_17); 

            					newLeafNode(lv_name_0_0, grammarAccess.getKnowledgeDefSetDesctructuringAssignmentAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getKnowledgeDefSetDesctructuringAssignmentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"it.unimi.xtext.Kant.ID");
            				

            }


            }

            // InternalKant.g:1538:3: (otherlv_1= '=' ( (lv_from_2_0= RULE_ID ) ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==22) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalKant.g:1539:4: otherlv_1= '=' ( (lv_from_2_0= RULE_ID ) )
                    {
                    otherlv_1=(Token)match(input,22,FOLLOW_4); 

                    				newLeafNode(otherlv_1, grammarAccess.getKnowledgeDefSetDesctructuringAssignmentAccess().getEqualsSignKeyword_1_0());
                    			
                    // InternalKant.g:1543:4: ( (lv_from_2_0= RULE_ID ) )
                    // InternalKant.g:1544:5: (lv_from_2_0= RULE_ID )
                    {
                    // InternalKant.g:1544:5: (lv_from_2_0= RULE_ID )
                    // InternalKant.g:1545:6: lv_from_2_0= RULE_ID
                    {
                    lv_from_2_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(lv_from_2_0, grammarAccess.getKnowledgeDefSetDesctructuringAssignmentAccess().getFromIDTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getKnowledgeDefSetDesctructuringAssignmentRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"from",
                    							lv_from_2_0,
                    							"it.unimi.xtext.Kant.ID");
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleKnowledgeDefSetDesctructuringAssignment"


    // $ANTLR start "entryRuleKnowledgeDefListDestructuring"
    // InternalKant.g:1566:1: entryRuleKnowledgeDefListDestructuring returns [EObject current=null] : iv_ruleKnowledgeDefListDestructuring= ruleKnowledgeDefListDestructuring EOF ;
    public final EObject entryRuleKnowledgeDefListDestructuring() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKnowledgeDefListDestructuring = null;


        try {
            // InternalKant.g:1566:70: (iv_ruleKnowledgeDefListDestructuring= ruleKnowledgeDefListDestructuring EOF )
            // InternalKant.g:1567:2: iv_ruleKnowledgeDefListDestructuring= ruleKnowledgeDefListDestructuring EOF
            {
             newCompositeNode(grammarAccess.getKnowledgeDefListDestructuringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleKnowledgeDefListDestructuring=ruleKnowledgeDefListDestructuring();

            state._fsp--;

             current =iv_ruleKnowledgeDefListDestructuring; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleKnowledgeDefListDestructuring"


    // $ANTLR start "ruleKnowledgeDefListDestructuring"
    // InternalKant.g:1573:1: ruleKnowledgeDefListDestructuring returns [EObject current=null] : ( () otherlv_1= '[' ( ( (lv_assignments_2_0= ruleKnowledgeDefListDesctructuringAssignment ) ) (otherlv_3= ',' ( (lv_assignments_4_0= ruleKnowledgeDefListDesctructuringAssignment ) ) )* )? otherlv_5= ']' ) ;
    public final EObject ruleKnowledgeDefListDestructuring() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_assignments_2_0 = null;

        EObject lv_assignments_4_0 = null;



        	enterRule();

        try {
            // InternalKant.g:1579:2: ( ( () otherlv_1= '[' ( ( (lv_assignments_2_0= ruleKnowledgeDefListDesctructuringAssignment ) ) (otherlv_3= ',' ( (lv_assignments_4_0= ruleKnowledgeDefListDesctructuringAssignment ) ) )* )? otherlv_5= ']' ) )
            // InternalKant.g:1580:2: ( () otherlv_1= '[' ( ( (lv_assignments_2_0= ruleKnowledgeDefListDesctructuringAssignment ) ) (otherlv_3= ',' ( (lv_assignments_4_0= ruleKnowledgeDefListDesctructuringAssignment ) ) )* )? otherlv_5= ']' )
            {
            // InternalKant.g:1580:2: ( () otherlv_1= '[' ( ( (lv_assignments_2_0= ruleKnowledgeDefListDesctructuringAssignment ) ) (otherlv_3= ',' ( (lv_assignments_4_0= ruleKnowledgeDefListDesctructuringAssignment ) ) )* )? otherlv_5= ']' )
            // InternalKant.g:1581:3: () otherlv_1= '[' ( ( (lv_assignments_2_0= ruleKnowledgeDefListDesctructuringAssignment ) ) (otherlv_3= ',' ( (lv_assignments_4_0= ruleKnowledgeDefListDesctructuringAssignment ) ) )* )? otherlv_5= ']'
            {
            // InternalKant.g:1581:3: ()
            // InternalKant.g:1582:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getKnowledgeDefListDestructuringAccess().getKnowledgeDefListDestructuringAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,34,FOLLOW_28); 

            			newLeafNode(otherlv_1, grammarAccess.getKnowledgeDefListDestructuringAccess().getLeftSquareBracketKeyword_1());
            		
            // InternalKant.g:1592:3: ( ( (lv_assignments_2_0= ruleKnowledgeDefListDesctructuringAssignment ) ) (otherlv_3= ',' ( (lv_assignments_4_0= ruleKnowledgeDefListDesctructuringAssignment ) ) )* )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==RULE_ID||LA36_0==20||LA36_0==36) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalKant.g:1593:4: ( (lv_assignments_2_0= ruleKnowledgeDefListDesctructuringAssignment ) ) (otherlv_3= ',' ( (lv_assignments_4_0= ruleKnowledgeDefListDesctructuringAssignment ) ) )*
                    {
                    // InternalKant.g:1593:4: ( (lv_assignments_2_0= ruleKnowledgeDefListDesctructuringAssignment ) )
                    // InternalKant.g:1594:5: (lv_assignments_2_0= ruleKnowledgeDefListDesctructuringAssignment )
                    {
                    // InternalKant.g:1594:5: (lv_assignments_2_0= ruleKnowledgeDefListDesctructuringAssignment )
                    // InternalKant.g:1595:6: lv_assignments_2_0= ruleKnowledgeDefListDesctructuringAssignment
                    {

                    						newCompositeNode(grammarAccess.getKnowledgeDefListDestructuringAccess().getAssignmentsKnowledgeDefListDesctructuringAssignmentParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_29);
                    lv_assignments_2_0=ruleKnowledgeDefListDesctructuringAssignment();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getKnowledgeDefListDestructuringRule());
                    						}
                    						add(
                    							current,
                    							"assignments",
                    							lv_assignments_2_0,
                    							"it.unimi.xtext.Kant.KnowledgeDefListDesctructuringAssignment");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalKant.g:1612:4: (otherlv_3= ',' ( (lv_assignments_4_0= ruleKnowledgeDefListDesctructuringAssignment ) ) )*
                    loop35:
                    do {
                        int alt35=2;
                        int LA35_0 = input.LA(1);

                        if ( (LA35_0==10) ) {
                            alt35=1;
                        }


                        switch (alt35) {
                    	case 1 :
                    	    // InternalKant.g:1613:5: otherlv_3= ',' ( (lv_assignments_4_0= ruleKnowledgeDefListDesctructuringAssignment ) )
                    	    {
                    	    otherlv_3=(Token)match(input,10,FOLLOW_30); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getKnowledgeDefListDestructuringAccess().getCommaKeyword_2_1_0());
                    	    				
                    	    // InternalKant.g:1617:5: ( (lv_assignments_4_0= ruleKnowledgeDefListDesctructuringAssignment ) )
                    	    // InternalKant.g:1618:6: (lv_assignments_4_0= ruleKnowledgeDefListDesctructuringAssignment )
                    	    {
                    	    // InternalKant.g:1618:6: (lv_assignments_4_0= ruleKnowledgeDefListDesctructuringAssignment )
                    	    // InternalKant.g:1619:7: lv_assignments_4_0= ruleKnowledgeDefListDesctructuringAssignment
                    	    {

                    	    							newCompositeNode(grammarAccess.getKnowledgeDefListDestructuringAccess().getAssignmentsKnowledgeDefListDesctructuringAssignmentParserRuleCall_2_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_29);
                    	    lv_assignments_4_0=ruleKnowledgeDefListDesctructuringAssignment();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getKnowledgeDefListDestructuringRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"assignments",
                    	    								lv_assignments_4_0,
                    	    								"it.unimi.xtext.Kant.KnowledgeDefListDesctructuringAssignment");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop35;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,35,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getKnowledgeDefListDestructuringAccess().getRightSquareBracketKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleKnowledgeDefListDestructuring"


    // $ANTLR start "entryRuleKnowledgeDefListDesctructuringAssignment"
    // InternalKant.g:1646:1: entryRuleKnowledgeDefListDesctructuringAssignment returns [EObject current=null] : iv_ruleKnowledgeDefListDesctructuringAssignment= ruleKnowledgeDefListDesctructuringAssignment EOF ;
    public final EObject entryRuleKnowledgeDefListDesctructuringAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKnowledgeDefListDesctructuringAssignment = null;


        try {
            // InternalKant.g:1646:81: (iv_ruleKnowledgeDefListDesctructuringAssignment= ruleKnowledgeDefListDesctructuringAssignment EOF )
            // InternalKant.g:1647:2: iv_ruleKnowledgeDefListDesctructuringAssignment= ruleKnowledgeDefListDesctructuringAssignment EOF
            {
             newCompositeNode(grammarAccess.getKnowledgeDefListDesctructuringAssignmentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleKnowledgeDefListDesctructuringAssignment=ruleKnowledgeDefListDesctructuringAssignment();

            state._fsp--;

             current =iv_ruleKnowledgeDefListDesctructuringAssignment; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleKnowledgeDefListDesctructuringAssignment"


    // $ANTLR start "ruleKnowledgeDefListDesctructuringAssignment"
    // InternalKant.g:1653:1: ruleKnowledgeDefListDesctructuringAssignment returns [EObject current=null] : ( ( () otherlv_1= '...' ) | ( () otherlv_3= '_' ) | ( (lv_name_4_0= RULE_ID ) ) ) ;
    public final EObject ruleKnowledgeDefListDesctructuringAssignment() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_name_4_0=null;


        	enterRule();

        try {
            // InternalKant.g:1659:2: ( ( ( () otherlv_1= '...' ) | ( () otherlv_3= '_' ) | ( (lv_name_4_0= RULE_ID ) ) ) )
            // InternalKant.g:1660:2: ( ( () otherlv_1= '...' ) | ( () otherlv_3= '_' ) | ( (lv_name_4_0= RULE_ID ) ) )
            {
            // InternalKant.g:1660:2: ( ( () otherlv_1= '...' ) | ( () otherlv_3= '_' ) | ( (lv_name_4_0= RULE_ID ) ) )
            int alt37=3;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt37=1;
                }
                break;
            case 36:
                {
                alt37=2;
                }
                break;
            case RULE_ID:
                {
                alt37=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }

            switch (alt37) {
                case 1 :
                    // InternalKant.g:1661:3: ( () otherlv_1= '...' )
                    {
                    // InternalKant.g:1661:3: ( () otherlv_1= '...' )
                    // InternalKant.g:1662:4: () otherlv_1= '...'
                    {
                    // InternalKant.g:1662:4: ()
                    // InternalKant.g:1663:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getKnowledgeDefListDesctructuringAssignmentAccess().getKnowledgeDefListDesctructuringAssignmentAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,20,FOLLOW_2); 

                    				newLeafNode(otherlv_1, grammarAccess.getKnowledgeDefListDesctructuringAssignmentAccess().getFullStopFullStopFullStopKeyword_0_1());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalKant.g:1675:3: ( () otherlv_3= '_' )
                    {
                    // InternalKant.g:1675:3: ( () otherlv_3= '_' )
                    // InternalKant.g:1676:4: () otherlv_3= '_'
                    {
                    // InternalKant.g:1676:4: ()
                    // InternalKant.g:1677:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getKnowledgeDefListDesctructuringAssignmentAccess().getKnowledgeDefListDesctructuringAssignmentAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_3=(Token)match(input,36,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getKnowledgeDefListDesctructuringAssignmentAccess().get_Keyword_1_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalKant.g:1689:3: ( (lv_name_4_0= RULE_ID ) )
                    {
                    // InternalKant.g:1689:3: ( (lv_name_4_0= RULE_ID ) )
                    // InternalKant.g:1690:4: (lv_name_4_0= RULE_ID )
                    {
                    // InternalKant.g:1690:4: (lv_name_4_0= RULE_ID )
                    // InternalKant.g:1691:5: lv_name_4_0= RULE_ID
                    {
                    lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    					newLeafNode(lv_name_4_0, grammarAccess.getKnowledgeDefListDesctructuringAssignmentAccess().getNameIDTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getKnowledgeDefListDesctructuringAssignmentRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"name",
                    						lv_name_4_0,
                    						"it.unimi.xtext.Kant.ID");
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleKnowledgeDefListDesctructuringAssignment"


    // $ANTLR start "entryRuleKnowledgeValue"
    // InternalKant.g:1711:1: entryRuleKnowledgeValue returns [EObject current=null] : iv_ruleKnowledgeValue= ruleKnowledgeValue EOF ;
    public final EObject entryRuleKnowledgeValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKnowledgeValue = null;


        try {
            // InternalKant.g:1711:55: (iv_ruleKnowledgeValue= ruleKnowledgeValue EOF )
            // InternalKant.g:1712:2: iv_ruleKnowledgeValue= ruleKnowledgeValue EOF
            {
             newCompositeNode(grammarAccess.getKnowledgeValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleKnowledgeValue=ruleKnowledgeValue();

            state._fsp--;

             current =iv_ruleKnowledgeValue; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleKnowledgeValue"


    // $ANTLR start "ruleKnowledgeValue"
    // InternalKant.g:1718:1: ruleKnowledgeValue returns [EObject current=null] : (this_KnowledgeRef_0= ruleKnowledgeRef | this_KnowledgeList_1= ruleKnowledgeList | this_KnowledgeSet_2= ruleKnowledgeSet | this_KnowledgeGenerator_3= ruleKnowledgeGenerator | this_KnowledgeFromFunction_4= ruleKnowledgeFromFunction ) ;
    public final EObject ruleKnowledgeValue() throws RecognitionException {
        EObject current = null;

        EObject this_KnowledgeRef_0 = null;

        EObject this_KnowledgeList_1 = null;

        EObject this_KnowledgeSet_2 = null;

        EObject this_KnowledgeGenerator_3 = null;

        EObject this_KnowledgeFromFunction_4 = null;



        	enterRule();

        try {
            // InternalKant.g:1724:2: ( (this_KnowledgeRef_0= ruleKnowledgeRef | this_KnowledgeList_1= ruleKnowledgeList | this_KnowledgeSet_2= ruleKnowledgeSet | this_KnowledgeGenerator_3= ruleKnowledgeGenerator | this_KnowledgeFromFunction_4= ruleKnowledgeFromFunction ) )
            // InternalKant.g:1725:2: (this_KnowledgeRef_0= ruleKnowledgeRef | this_KnowledgeList_1= ruleKnowledgeList | this_KnowledgeSet_2= ruleKnowledgeSet | this_KnowledgeGenerator_3= ruleKnowledgeGenerator | this_KnowledgeFromFunction_4= ruleKnowledgeFromFunction )
            {
            // InternalKant.g:1725:2: (this_KnowledgeRef_0= ruleKnowledgeRef | this_KnowledgeList_1= ruleKnowledgeList | this_KnowledgeSet_2= ruleKnowledgeSet | this_KnowledgeGenerator_3= ruleKnowledgeGenerator | this_KnowledgeFromFunction_4= ruleKnowledgeFromFunction )
            int alt38=5;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                int LA38_1 = input.LA(2);

                if ( (LA38_1==13) ) {
                    alt38=5;
                }
                else if ( (LA38_1==EOF||LA38_1==RULE_ID||LA38_1==10||LA38_1==12||LA38_1==14||(LA38_1>=16 && LA38_1<=18)||(LA38_1>=24 && LA38_1<=26)||(LA38_1>=28 && LA38_1<=30)||LA38_1==35||LA38_1==37||(LA38_1>=39 && LA38_1<=40)||LA38_1==42) ) {
                    alt38=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 38, 1, input);

                    throw nvae;
                }
                }
                break;
            case 34:
                {
                alt38=2;
                }
                break;
            case 23:
                {
                alt38=3;
                }
                break;
            case 38:
                {
                alt38=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }

            switch (alt38) {
                case 1 :
                    // InternalKant.g:1726:3: this_KnowledgeRef_0= ruleKnowledgeRef
                    {

                    			newCompositeNode(grammarAccess.getKnowledgeValueAccess().getKnowledgeRefParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_KnowledgeRef_0=ruleKnowledgeRef();

                    state._fsp--;


                    			current = this_KnowledgeRef_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalKant.g:1735:3: this_KnowledgeList_1= ruleKnowledgeList
                    {

                    			newCompositeNode(grammarAccess.getKnowledgeValueAccess().getKnowledgeListParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_KnowledgeList_1=ruleKnowledgeList();

                    state._fsp--;


                    			current = this_KnowledgeList_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalKant.g:1744:3: this_KnowledgeSet_2= ruleKnowledgeSet
                    {

                    			newCompositeNode(grammarAccess.getKnowledgeValueAccess().getKnowledgeSetParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_KnowledgeSet_2=ruleKnowledgeSet();

                    state._fsp--;


                    			current = this_KnowledgeSet_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalKant.g:1753:3: this_KnowledgeGenerator_3= ruleKnowledgeGenerator
                    {

                    			newCompositeNode(grammarAccess.getKnowledgeValueAccess().getKnowledgeGeneratorParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_KnowledgeGenerator_3=ruleKnowledgeGenerator();

                    state._fsp--;


                    			current = this_KnowledgeGenerator_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalKant.g:1762:3: this_KnowledgeFromFunction_4= ruleKnowledgeFromFunction
                    {

                    			newCompositeNode(grammarAccess.getKnowledgeValueAccess().getKnowledgeFromFunctionParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_KnowledgeFromFunction_4=ruleKnowledgeFromFunction();

                    state._fsp--;


                    			current = this_KnowledgeFromFunction_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleKnowledgeValue"


    // $ANTLR start "entryRuleKnowledgeList"
    // InternalKant.g:1774:1: entryRuleKnowledgeList returns [EObject current=null] : iv_ruleKnowledgeList= ruleKnowledgeList EOF ;
    public final EObject entryRuleKnowledgeList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKnowledgeList = null;


        try {
            // InternalKant.g:1774:54: (iv_ruleKnowledgeList= ruleKnowledgeList EOF )
            // InternalKant.g:1775:2: iv_ruleKnowledgeList= ruleKnowledgeList EOF
            {
             newCompositeNode(grammarAccess.getKnowledgeListRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleKnowledgeList=ruleKnowledgeList();

            state._fsp--;

             current =iv_ruleKnowledgeList; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleKnowledgeList"


    // $ANTLR start "ruleKnowledgeList"
    // InternalKant.g:1781:1: ruleKnowledgeList returns [EObject current=null] : ( () otherlv_1= '[' ( ( ( (lv_values_2_1= ruleKnowledgeValue | lv_values_2_2= ruleKnowledgeSpreading ) ) ) (otherlv_3= ',' ( ( (lv_values_4_1= ruleKnowledgeValue | lv_values_4_2= ruleKnowledgeSpreading ) ) ) )* )? otherlv_5= ']' ) ;
    public final EObject ruleKnowledgeList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_values_2_1 = null;

        EObject lv_values_2_2 = null;

        EObject lv_values_4_1 = null;

        EObject lv_values_4_2 = null;



        	enterRule();

        try {
            // InternalKant.g:1787:2: ( ( () otherlv_1= '[' ( ( ( (lv_values_2_1= ruleKnowledgeValue | lv_values_2_2= ruleKnowledgeSpreading ) ) ) (otherlv_3= ',' ( ( (lv_values_4_1= ruleKnowledgeValue | lv_values_4_2= ruleKnowledgeSpreading ) ) ) )* )? otherlv_5= ']' ) )
            // InternalKant.g:1788:2: ( () otherlv_1= '[' ( ( ( (lv_values_2_1= ruleKnowledgeValue | lv_values_2_2= ruleKnowledgeSpreading ) ) ) (otherlv_3= ',' ( ( (lv_values_4_1= ruleKnowledgeValue | lv_values_4_2= ruleKnowledgeSpreading ) ) ) )* )? otherlv_5= ']' )
            {
            // InternalKant.g:1788:2: ( () otherlv_1= '[' ( ( ( (lv_values_2_1= ruleKnowledgeValue | lv_values_2_2= ruleKnowledgeSpreading ) ) ) (otherlv_3= ',' ( ( (lv_values_4_1= ruleKnowledgeValue | lv_values_4_2= ruleKnowledgeSpreading ) ) ) )* )? otherlv_5= ']' )
            // InternalKant.g:1789:3: () otherlv_1= '[' ( ( ( (lv_values_2_1= ruleKnowledgeValue | lv_values_2_2= ruleKnowledgeSpreading ) ) ) (otherlv_3= ',' ( ( (lv_values_4_1= ruleKnowledgeValue | lv_values_4_2= ruleKnowledgeSpreading ) ) ) )* )? otherlv_5= ']'
            {
            // InternalKant.g:1789:3: ()
            // InternalKant.g:1790:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getKnowledgeListAccess().getKnowledgeListAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,34,FOLLOW_31); 

            			newLeafNode(otherlv_1, grammarAccess.getKnowledgeListAccess().getLeftSquareBracketKeyword_1());
            		
            // InternalKant.g:1800:3: ( ( ( (lv_values_2_1= ruleKnowledgeValue | lv_values_2_2= ruleKnowledgeSpreading ) ) ) (otherlv_3= ',' ( ( (lv_values_4_1= ruleKnowledgeValue | lv_values_4_2= ruleKnowledgeSpreading ) ) ) )* )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==RULE_ID||LA42_0==20||LA42_0==23||LA42_0==34||LA42_0==38) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalKant.g:1801:4: ( ( (lv_values_2_1= ruleKnowledgeValue | lv_values_2_2= ruleKnowledgeSpreading ) ) ) (otherlv_3= ',' ( ( (lv_values_4_1= ruleKnowledgeValue | lv_values_4_2= ruleKnowledgeSpreading ) ) ) )*
                    {
                    // InternalKant.g:1801:4: ( ( (lv_values_2_1= ruleKnowledgeValue | lv_values_2_2= ruleKnowledgeSpreading ) ) )
                    // InternalKant.g:1802:5: ( (lv_values_2_1= ruleKnowledgeValue | lv_values_2_2= ruleKnowledgeSpreading ) )
                    {
                    // InternalKant.g:1802:5: ( (lv_values_2_1= ruleKnowledgeValue | lv_values_2_2= ruleKnowledgeSpreading ) )
                    // InternalKant.g:1803:6: (lv_values_2_1= ruleKnowledgeValue | lv_values_2_2= ruleKnowledgeSpreading )
                    {
                    // InternalKant.g:1803:6: (lv_values_2_1= ruleKnowledgeValue | lv_values_2_2= ruleKnowledgeSpreading )
                    int alt39=2;
                    int LA39_0 = input.LA(1);

                    if ( (LA39_0==RULE_ID||LA39_0==23||LA39_0==34||LA39_0==38) ) {
                        alt39=1;
                    }
                    else if ( (LA39_0==20) ) {
                        alt39=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 39, 0, input);

                        throw nvae;
                    }
                    switch (alt39) {
                        case 1 :
                            // InternalKant.g:1804:7: lv_values_2_1= ruleKnowledgeValue
                            {

                            							newCompositeNode(grammarAccess.getKnowledgeListAccess().getValuesKnowledgeValueParserRuleCall_2_0_0_0());
                            						
                            pushFollow(FOLLOW_29);
                            lv_values_2_1=ruleKnowledgeValue();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getKnowledgeListRule());
                            							}
                            							add(
                            								current,
                            								"values",
                            								lv_values_2_1,
                            								"it.unimi.xtext.Kant.KnowledgeValue");
                            							afterParserOrEnumRuleCall();
                            						

                            }
                            break;
                        case 2 :
                            // InternalKant.g:1820:7: lv_values_2_2= ruleKnowledgeSpreading
                            {

                            							newCompositeNode(grammarAccess.getKnowledgeListAccess().getValuesKnowledgeSpreadingParserRuleCall_2_0_0_1());
                            						
                            pushFollow(FOLLOW_29);
                            lv_values_2_2=ruleKnowledgeSpreading();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getKnowledgeListRule());
                            							}
                            							add(
                            								current,
                            								"values",
                            								lv_values_2_2,
                            								"it.unimi.xtext.Kant.KnowledgeSpreading");
                            							afterParserOrEnumRuleCall();
                            						

                            }
                            break;

                    }


                    }


                    }

                    // InternalKant.g:1838:4: (otherlv_3= ',' ( ( (lv_values_4_1= ruleKnowledgeValue | lv_values_4_2= ruleKnowledgeSpreading ) ) ) )*
                    loop41:
                    do {
                        int alt41=2;
                        int LA41_0 = input.LA(1);

                        if ( (LA41_0==10) ) {
                            alt41=1;
                        }


                        switch (alt41) {
                    	case 1 :
                    	    // InternalKant.g:1839:5: otherlv_3= ',' ( ( (lv_values_4_1= ruleKnowledgeValue | lv_values_4_2= ruleKnowledgeSpreading ) ) )
                    	    {
                    	    otherlv_3=(Token)match(input,10,FOLLOW_32); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getKnowledgeListAccess().getCommaKeyword_2_1_0());
                    	    				
                    	    // InternalKant.g:1843:5: ( ( (lv_values_4_1= ruleKnowledgeValue | lv_values_4_2= ruleKnowledgeSpreading ) ) )
                    	    // InternalKant.g:1844:6: ( (lv_values_4_1= ruleKnowledgeValue | lv_values_4_2= ruleKnowledgeSpreading ) )
                    	    {
                    	    // InternalKant.g:1844:6: ( (lv_values_4_1= ruleKnowledgeValue | lv_values_4_2= ruleKnowledgeSpreading ) )
                    	    // InternalKant.g:1845:7: (lv_values_4_1= ruleKnowledgeValue | lv_values_4_2= ruleKnowledgeSpreading )
                    	    {
                    	    // InternalKant.g:1845:7: (lv_values_4_1= ruleKnowledgeValue | lv_values_4_2= ruleKnowledgeSpreading )
                    	    int alt40=2;
                    	    int LA40_0 = input.LA(1);

                    	    if ( (LA40_0==RULE_ID||LA40_0==23||LA40_0==34||LA40_0==38) ) {
                    	        alt40=1;
                    	    }
                    	    else if ( (LA40_0==20) ) {
                    	        alt40=2;
                    	    }
                    	    else {
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 40, 0, input);

                    	        throw nvae;
                    	    }
                    	    switch (alt40) {
                    	        case 1 :
                    	            // InternalKant.g:1846:8: lv_values_4_1= ruleKnowledgeValue
                    	            {

                    	            								newCompositeNode(grammarAccess.getKnowledgeListAccess().getValuesKnowledgeValueParserRuleCall_2_1_1_0_0());
                    	            							
                    	            pushFollow(FOLLOW_29);
                    	            lv_values_4_1=ruleKnowledgeValue();

                    	            state._fsp--;


                    	            								if (current==null) {
                    	            									current = createModelElementForParent(grammarAccess.getKnowledgeListRule());
                    	            								}
                    	            								add(
                    	            									current,
                    	            									"values",
                    	            									lv_values_4_1,
                    	            									"it.unimi.xtext.Kant.KnowledgeValue");
                    	            								afterParserOrEnumRuleCall();
                    	            							

                    	            }
                    	            break;
                    	        case 2 :
                    	            // InternalKant.g:1862:8: lv_values_4_2= ruleKnowledgeSpreading
                    	            {

                    	            								newCompositeNode(grammarAccess.getKnowledgeListAccess().getValuesKnowledgeSpreadingParserRuleCall_2_1_1_0_1());
                    	            							
                    	            pushFollow(FOLLOW_29);
                    	            lv_values_4_2=ruleKnowledgeSpreading();

                    	            state._fsp--;


                    	            								if (current==null) {
                    	            									current = createModelElementForParent(grammarAccess.getKnowledgeListRule());
                    	            								}
                    	            								add(
                    	            									current,
                    	            									"values",
                    	            									lv_values_4_2,
                    	            									"it.unimi.xtext.Kant.KnowledgeSpreading");
                    	            								afterParserOrEnumRuleCall();
                    	            							

                    	            }
                    	            break;

                    	    }


                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop41;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,35,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getKnowledgeListAccess().getRightSquareBracketKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleKnowledgeList"


    // $ANTLR start "entryRuleKnowledgeRef"
    // InternalKant.g:1890:1: entryRuleKnowledgeRef returns [EObject current=null] : iv_ruleKnowledgeRef= ruleKnowledgeRef EOF ;
    public final EObject entryRuleKnowledgeRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKnowledgeRef = null;


        try {
            // InternalKant.g:1890:53: (iv_ruleKnowledgeRef= ruleKnowledgeRef EOF )
            // InternalKant.g:1891:2: iv_ruleKnowledgeRef= ruleKnowledgeRef EOF
            {
             newCompositeNode(grammarAccess.getKnowledgeRefRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleKnowledgeRef=ruleKnowledgeRef();

            state._fsp--;

             current =iv_ruleKnowledgeRef; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleKnowledgeRef"


    // $ANTLR start "ruleKnowledgeRef"
    // InternalKant.g:1897:1: ruleKnowledgeRef returns [EObject current=null] : ( ( (lv_ref_0_0= RULE_ID ) ) (otherlv_1= '.' ( (lv_access_2_0= RULE_ID ) ) )* ) ;
    public final EObject ruleKnowledgeRef() throws RecognitionException {
        EObject current = null;

        Token lv_ref_0_0=null;
        Token otherlv_1=null;
        Token lv_access_2_0=null;


        	enterRule();

        try {
            // InternalKant.g:1903:2: ( ( ( (lv_ref_0_0= RULE_ID ) ) (otherlv_1= '.' ( (lv_access_2_0= RULE_ID ) ) )* ) )
            // InternalKant.g:1904:2: ( ( (lv_ref_0_0= RULE_ID ) ) (otherlv_1= '.' ( (lv_access_2_0= RULE_ID ) ) )* )
            {
            // InternalKant.g:1904:2: ( ( (lv_ref_0_0= RULE_ID ) ) (otherlv_1= '.' ( (lv_access_2_0= RULE_ID ) ) )* )
            // InternalKant.g:1905:3: ( (lv_ref_0_0= RULE_ID ) ) (otherlv_1= '.' ( (lv_access_2_0= RULE_ID ) ) )*
            {
            // InternalKant.g:1905:3: ( (lv_ref_0_0= RULE_ID ) )
            // InternalKant.g:1906:4: (lv_ref_0_0= RULE_ID )
            {
            // InternalKant.g:1906:4: (lv_ref_0_0= RULE_ID )
            // InternalKant.g:1907:5: lv_ref_0_0= RULE_ID
            {
            lv_ref_0_0=(Token)match(input,RULE_ID,FOLLOW_33); 

            					newLeafNode(lv_ref_0_0, grammarAccess.getKnowledgeRefAccess().getRefIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getKnowledgeRefRule());
            					}
            					setWithLastConsumed(
            						current,
            						"ref",
            						lv_ref_0_0,
            						"it.unimi.xtext.Kant.ID");
            				

            }


            }

            // InternalKant.g:1923:3: (otherlv_1= '.' ( (lv_access_2_0= RULE_ID ) ) )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==37) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // InternalKant.g:1924:4: otherlv_1= '.' ( (lv_access_2_0= RULE_ID ) )
            	    {
            	    otherlv_1=(Token)match(input,37,FOLLOW_4); 

            	    				newLeafNode(otherlv_1, grammarAccess.getKnowledgeRefAccess().getFullStopKeyword_1_0());
            	    			
            	    // InternalKant.g:1928:4: ( (lv_access_2_0= RULE_ID ) )
            	    // InternalKant.g:1929:5: (lv_access_2_0= RULE_ID )
            	    {
            	    // InternalKant.g:1929:5: (lv_access_2_0= RULE_ID )
            	    // InternalKant.g:1930:6: lv_access_2_0= RULE_ID
            	    {
            	    lv_access_2_0=(Token)match(input,RULE_ID,FOLLOW_33); 

            	    						newLeafNode(lv_access_2_0, grammarAccess.getKnowledgeRefAccess().getAccessIDTerminalRuleCall_1_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getKnowledgeRefRule());
            	    						}
            	    						addWithLastConsumed(
            	    							current,
            	    							"access",
            	    							lv_access_2_0,
            	    							"it.unimi.xtext.Kant.ID");
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop43;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleKnowledgeRef"


    // $ANTLR start "entryRuleKnowledgeSet"
    // InternalKant.g:1951:1: entryRuleKnowledgeSet returns [EObject current=null] : iv_ruleKnowledgeSet= ruleKnowledgeSet EOF ;
    public final EObject entryRuleKnowledgeSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKnowledgeSet = null;


        try {
            // InternalKant.g:1951:53: (iv_ruleKnowledgeSet= ruleKnowledgeSet EOF )
            // InternalKant.g:1952:2: iv_ruleKnowledgeSet= ruleKnowledgeSet EOF
            {
             newCompositeNode(grammarAccess.getKnowledgeSetRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleKnowledgeSet=ruleKnowledgeSet();

            state._fsp--;

             current =iv_ruleKnowledgeSet; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleKnowledgeSet"


    // $ANTLR start "ruleKnowledgeSet"
    // InternalKant.g:1958:1: ruleKnowledgeSet returns [EObject current=null] : ( () otherlv_1= '{' ( ( ( (lv_content_2_1= ruleKnowledge | lv_content_2_2= ruleKnowledgeSpreading ) ) ) (otherlv_3= ',' ( ( (lv_content_4_1= ruleKnowledge | lv_content_4_2= ruleKnowledgeSpreading ) ) ) )* )? otherlv_5= '}' ) ;
    public final EObject ruleKnowledgeSet() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_content_2_1 = null;

        EObject lv_content_2_2 = null;

        EObject lv_content_4_1 = null;

        EObject lv_content_4_2 = null;



        	enterRule();

        try {
            // InternalKant.g:1964:2: ( ( () otherlv_1= '{' ( ( ( (lv_content_2_1= ruleKnowledge | lv_content_2_2= ruleKnowledgeSpreading ) ) ) (otherlv_3= ',' ( ( (lv_content_4_1= ruleKnowledge | lv_content_4_2= ruleKnowledgeSpreading ) ) ) )* )? otherlv_5= '}' ) )
            // InternalKant.g:1965:2: ( () otherlv_1= '{' ( ( ( (lv_content_2_1= ruleKnowledge | lv_content_2_2= ruleKnowledgeSpreading ) ) ) (otherlv_3= ',' ( ( (lv_content_4_1= ruleKnowledge | lv_content_4_2= ruleKnowledgeSpreading ) ) ) )* )? otherlv_5= '}' )
            {
            // InternalKant.g:1965:2: ( () otherlv_1= '{' ( ( ( (lv_content_2_1= ruleKnowledge | lv_content_2_2= ruleKnowledgeSpreading ) ) ) (otherlv_3= ',' ( ( (lv_content_4_1= ruleKnowledge | lv_content_4_2= ruleKnowledgeSpreading ) ) ) )* )? otherlv_5= '}' )
            // InternalKant.g:1966:3: () otherlv_1= '{' ( ( ( (lv_content_2_1= ruleKnowledge | lv_content_2_2= ruleKnowledgeSpreading ) ) ) (otherlv_3= ',' ( ( (lv_content_4_1= ruleKnowledge | lv_content_4_2= ruleKnowledgeSpreading ) ) ) )* )? otherlv_5= '}'
            {
            // InternalKant.g:1966:3: ()
            // InternalKant.g:1967:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getKnowledgeSetAccess().getKnowledgeSetAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,23,FOLLOW_34); 

            			newLeafNode(otherlv_1, grammarAccess.getKnowledgeSetAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalKant.g:1977:3: ( ( ( (lv_content_2_1= ruleKnowledge | lv_content_2_2= ruleKnowledgeSpreading ) ) ) (otherlv_3= ',' ( ( (lv_content_4_1= ruleKnowledge | lv_content_4_2= ruleKnowledgeSpreading ) ) ) )* )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==RULE_ID||LA47_0==20||LA47_0==23||(LA47_0>=32 && LA47_0<=34)||LA47_0==38) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalKant.g:1978:4: ( ( (lv_content_2_1= ruleKnowledge | lv_content_2_2= ruleKnowledgeSpreading ) ) ) (otherlv_3= ',' ( ( (lv_content_4_1= ruleKnowledge | lv_content_4_2= ruleKnowledgeSpreading ) ) ) )*
                    {
                    // InternalKant.g:1978:4: ( ( (lv_content_2_1= ruleKnowledge | lv_content_2_2= ruleKnowledgeSpreading ) ) )
                    // InternalKant.g:1979:5: ( (lv_content_2_1= ruleKnowledge | lv_content_2_2= ruleKnowledgeSpreading ) )
                    {
                    // InternalKant.g:1979:5: ( (lv_content_2_1= ruleKnowledge | lv_content_2_2= ruleKnowledgeSpreading ) )
                    // InternalKant.g:1980:6: (lv_content_2_1= ruleKnowledge | lv_content_2_2= ruleKnowledgeSpreading )
                    {
                    // InternalKant.g:1980:6: (lv_content_2_1= ruleKnowledge | lv_content_2_2= ruleKnowledgeSpreading )
                    int alt44=2;
                    int LA44_0 = input.LA(1);

                    if ( (LA44_0==RULE_ID||LA44_0==23||(LA44_0>=32 && LA44_0<=34)||LA44_0==38) ) {
                        alt44=1;
                    }
                    else if ( (LA44_0==20) ) {
                        alt44=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 44, 0, input);

                        throw nvae;
                    }
                    switch (alt44) {
                        case 1 :
                            // InternalKant.g:1981:7: lv_content_2_1= ruleKnowledge
                            {

                            							newCompositeNode(grammarAccess.getKnowledgeSetAccess().getContentKnowledgeParserRuleCall_2_0_0_0());
                            						
                            pushFollow(FOLLOW_19);
                            lv_content_2_1=ruleKnowledge();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getKnowledgeSetRule());
                            							}
                            							add(
                            								current,
                            								"content",
                            								lv_content_2_1,
                            								"it.unimi.xtext.Kant.Knowledge");
                            							afterParserOrEnumRuleCall();
                            						

                            }
                            break;
                        case 2 :
                            // InternalKant.g:1997:7: lv_content_2_2= ruleKnowledgeSpreading
                            {

                            							newCompositeNode(grammarAccess.getKnowledgeSetAccess().getContentKnowledgeSpreadingParserRuleCall_2_0_0_1());
                            						
                            pushFollow(FOLLOW_19);
                            lv_content_2_2=ruleKnowledgeSpreading();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getKnowledgeSetRule());
                            							}
                            							add(
                            								current,
                            								"content",
                            								lv_content_2_2,
                            								"it.unimi.xtext.Kant.KnowledgeSpreading");
                            							afterParserOrEnumRuleCall();
                            						

                            }
                            break;

                    }


                    }


                    }

                    // InternalKant.g:2015:4: (otherlv_3= ',' ( ( (lv_content_4_1= ruleKnowledge | lv_content_4_2= ruleKnowledgeSpreading ) ) ) )*
                    loop46:
                    do {
                        int alt46=2;
                        int LA46_0 = input.LA(1);

                        if ( (LA46_0==10) ) {
                            alt46=1;
                        }


                        switch (alt46) {
                    	case 1 :
                    	    // InternalKant.g:2016:5: otherlv_3= ',' ( ( (lv_content_4_1= ruleKnowledge | lv_content_4_2= ruleKnowledgeSpreading ) ) )
                    	    {
                    	    otherlv_3=(Token)match(input,10,FOLLOW_35); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getKnowledgeSetAccess().getCommaKeyword_2_1_0());
                    	    				
                    	    // InternalKant.g:2020:5: ( ( (lv_content_4_1= ruleKnowledge | lv_content_4_2= ruleKnowledgeSpreading ) ) )
                    	    // InternalKant.g:2021:6: ( (lv_content_4_1= ruleKnowledge | lv_content_4_2= ruleKnowledgeSpreading ) )
                    	    {
                    	    // InternalKant.g:2021:6: ( (lv_content_4_1= ruleKnowledge | lv_content_4_2= ruleKnowledgeSpreading ) )
                    	    // InternalKant.g:2022:7: (lv_content_4_1= ruleKnowledge | lv_content_4_2= ruleKnowledgeSpreading )
                    	    {
                    	    // InternalKant.g:2022:7: (lv_content_4_1= ruleKnowledge | lv_content_4_2= ruleKnowledgeSpreading )
                    	    int alt45=2;
                    	    int LA45_0 = input.LA(1);

                    	    if ( (LA45_0==RULE_ID||LA45_0==23||(LA45_0>=32 && LA45_0<=34)||LA45_0==38) ) {
                    	        alt45=1;
                    	    }
                    	    else if ( (LA45_0==20) ) {
                    	        alt45=2;
                    	    }
                    	    else {
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 45, 0, input);

                    	        throw nvae;
                    	    }
                    	    switch (alt45) {
                    	        case 1 :
                    	            // InternalKant.g:2023:8: lv_content_4_1= ruleKnowledge
                    	            {

                    	            								newCompositeNode(grammarAccess.getKnowledgeSetAccess().getContentKnowledgeParserRuleCall_2_1_1_0_0());
                    	            							
                    	            pushFollow(FOLLOW_19);
                    	            lv_content_4_1=ruleKnowledge();

                    	            state._fsp--;


                    	            								if (current==null) {
                    	            									current = createModelElementForParent(grammarAccess.getKnowledgeSetRule());
                    	            								}
                    	            								add(
                    	            									current,
                    	            									"content",
                    	            									lv_content_4_1,
                    	            									"it.unimi.xtext.Kant.Knowledge");
                    	            								afterParserOrEnumRuleCall();
                    	            							

                    	            }
                    	            break;
                    	        case 2 :
                    	            // InternalKant.g:2039:8: lv_content_4_2= ruleKnowledgeSpreading
                    	            {

                    	            								newCompositeNode(grammarAccess.getKnowledgeSetAccess().getContentKnowledgeSpreadingParserRuleCall_2_1_1_0_1());
                    	            							
                    	            pushFollow(FOLLOW_19);
                    	            lv_content_4_2=ruleKnowledgeSpreading();

                    	            state._fsp--;


                    	            								if (current==null) {
                    	            									current = createModelElementForParent(grammarAccess.getKnowledgeSetRule());
                    	            								}
                    	            								add(
                    	            									current,
                    	            									"content",
                    	            									lv_content_4_2,
                    	            									"it.unimi.xtext.Kant.KnowledgeSpreading");
                    	            								afterParserOrEnumRuleCall();
                    	            							

                    	            }
                    	            break;

                    	    }


                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop46;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,24,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getKnowledgeSetAccess().getRightCurlyBracketKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleKnowledgeSet"


    // $ANTLR start "entryRuleKnowledgeSpreading"
    // InternalKant.g:2067:1: entryRuleKnowledgeSpreading returns [EObject current=null] : iv_ruleKnowledgeSpreading= ruleKnowledgeSpreading EOF ;
    public final EObject entryRuleKnowledgeSpreading() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKnowledgeSpreading = null;


        try {
            // InternalKant.g:2067:59: (iv_ruleKnowledgeSpreading= ruleKnowledgeSpreading EOF )
            // InternalKant.g:2068:2: iv_ruleKnowledgeSpreading= ruleKnowledgeSpreading EOF
            {
             newCompositeNode(grammarAccess.getKnowledgeSpreadingRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleKnowledgeSpreading=ruleKnowledgeSpreading();

            state._fsp--;

             current =iv_ruleKnowledgeSpreading; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleKnowledgeSpreading"


    // $ANTLR start "ruleKnowledgeSpreading"
    // InternalKant.g:2074:1: ruleKnowledgeSpreading returns [EObject current=null] : (otherlv_0= '...' ( ( (lv_ref_1_1= ruleKnowledgeRef | lv_ref_1_2= ruleKnowledgeSet | lv_ref_1_3= ruleKnowledgeList ) ) ) ) ;
    public final EObject ruleKnowledgeSpreading() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_ref_1_1 = null;

        EObject lv_ref_1_2 = null;

        EObject lv_ref_1_3 = null;



        	enterRule();

        try {
            // InternalKant.g:2080:2: ( (otherlv_0= '...' ( ( (lv_ref_1_1= ruleKnowledgeRef | lv_ref_1_2= ruleKnowledgeSet | lv_ref_1_3= ruleKnowledgeList ) ) ) ) )
            // InternalKant.g:2081:2: (otherlv_0= '...' ( ( (lv_ref_1_1= ruleKnowledgeRef | lv_ref_1_2= ruleKnowledgeSet | lv_ref_1_3= ruleKnowledgeList ) ) ) )
            {
            // InternalKant.g:2081:2: (otherlv_0= '...' ( ( (lv_ref_1_1= ruleKnowledgeRef | lv_ref_1_2= ruleKnowledgeSet | lv_ref_1_3= ruleKnowledgeList ) ) ) )
            // InternalKant.g:2082:3: otherlv_0= '...' ( ( (lv_ref_1_1= ruleKnowledgeRef | lv_ref_1_2= ruleKnowledgeSet | lv_ref_1_3= ruleKnowledgeList ) ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_36); 

            			newLeafNode(otherlv_0, grammarAccess.getKnowledgeSpreadingAccess().getFullStopFullStopFullStopKeyword_0());
            		
            // InternalKant.g:2086:3: ( ( (lv_ref_1_1= ruleKnowledgeRef | lv_ref_1_2= ruleKnowledgeSet | lv_ref_1_3= ruleKnowledgeList ) ) )
            // InternalKant.g:2087:4: ( (lv_ref_1_1= ruleKnowledgeRef | lv_ref_1_2= ruleKnowledgeSet | lv_ref_1_3= ruleKnowledgeList ) )
            {
            // InternalKant.g:2087:4: ( (lv_ref_1_1= ruleKnowledgeRef | lv_ref_1_2= ruleKnowledgeSet | lv_ref_1_3= ruleKnowledgeList ) )
            // InternalKant.g:2088:5: (lv_ref_1_1= ruleKnowledgeRef | lv_ref_1_2= ruleKnowledgeSet | lv_ref_1_3= ruleKnowledgeList )
            {
            // InternalKant.g:2088:5: (lv_ref_1_1= ruleKnowledgeRef | lv_ref_1_2= ruleKnowledgeSet | lv_ref_1_3= ruleKnowledgeList )
            int alt48=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt48=1;
                }
                break;
            case 23:
                {
                alt48=2;
                }
                break;
            case 34:
                {
                alt48=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }

            switch (alt48) {
                case 1 :
                    // InternalKant.g:2089:6: lv_ref_1_1= ruleKnowledgeRef
                    {

                    						newCompositeNode(grammarAccess.getKnowledgeSpreadingAccess().getRefKnowledgeRefParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_ref_1_1=ruleKnowledgeRef();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getKnowledgeSpreadingRule());
                    						}
                    						set(
                    							current,
                    							"ref",
                    							lv_ref_1_1,
                    							"it.unimi.xtext.Kant.KnowledgeRef");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 2 :
                    // InternalKant.g:2105:6: lv_ref_1_2= ruleKnowledgeSet
                    {

                    						newCompositeNode(grammarAccess.getKnowledgeSpreadingAccess().getRefKnowledgeSetParserRuleCall_1_0_1());
                    					
                    pushFollow(FOLLOW_2);
                    lv_ref_1_2=ruleKnowledgeSet();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getKnowledgeSpreadingRule());
                    						}
                    						set(
                    							current,
                    							"ref",
                    							lv_ref_1_2,
                    							"it.unimi.xtext.Kant.KnowledgeSet");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 3 :
                    // InternalKant.g:2121:6: lv_ref_1_3= ruleKnowledgeList
                    {

                    						newCompositeNode(grammarAccess.getKnowledgeSpreadingAccess().getRefKnowledgeListParserRuleCall_1_0_2());
                    					
                    pushFollow(FOLLOW_2);
                    lv_ref_1_3=ruleKnowledgeList();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getKnowledgeSpreadingRule());
                    						}
                    						set(
                    							current,
                    							"ref",
                    							lv_ref_1_3,
                    							"it.unimi.xtext.Kant.KnowledgeList");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;

            }


            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleKnowledgeSpreading"


    // $ANTLR start "entryRuleKnowledgeGenerator"
    // InternalKant.g:2143:1: entryRuleKnowledgeGenerator returns [EObject current=null] : iv_ruleKnowledgeGenerator= ruleKnowledgeGenerator EOF ;
    public final EObject entryRuleKnowledgeGenerator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKnowledgeGenerator = null;


        try {
            // InternalKant.g:2143:59: (iv_ruleKnowledgeGenerator= ruleKnowledgeGenerator EOF )
            // InternalKant.g:2144:2: iv_ruleKnowledgeGenerator= ruleKnowledgeGenerator EOF
            {
             newCompositeNode(grammarAccess.getKnowledgeGeneratorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleKnowledgeGenerator=ruleKnowledgeGenerator();

            state._fsp--;

             current =iv_ruleKnowledgeGenerator; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleKnowledgeGenerator"


    // $ANTLR start "ruleKnowledgeGenerator"
    // InternalKant.g:2150:1: ruleKnowledgeGenerator returns [EObject current=null] : (otherlv_0= 'gen' ( (lv_type_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleKnowledgeGenerator() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_type_1_0=null;


        	enterRule();

        try {
            // InternalKant.g:2156:2: ( (otherlv_0= 'gen' ( (lv_type_1_0= RULE_STRING ) ) ) )
            // InternalKant.g:2157:2: (otherlv_0= 'gen' ( (lv_type_1_0= RULE_STRING ) ) )
            {
            // InternalKant.g:2157:2: (otherlv_0= 'gen' ( (lv_type_1_0= RULE_STRING ) ) )
            // InternalKant.g:2158:3: otherlv_0= 'gen' ( (lv_type_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,38,FOLLOW_37); 

            			newLeafNode(otherlv_0, grammarAccess.getKnowledgeGeneratorAccess().getGenKeyword_0());
            		
            // InternalKant.g:2162:3: ( (lv_type_1_0= RULE_STRING ) )
            // InternalKant.g:2163:4: (lv_type_1_0= RULE_STRING )
            {
            // InternalKant.g:2163:4: (lv_type_1_0= RULE_STRING )
            // InternalKant.g:2164:5: lv_type_1_0= RULE_STRING
            {
            lv_type_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_type_1_0, grammarAccess.getKnowledgeGeneratorAccess().getTypeSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getKnowledgeGeneratorRule());
            					}
            					setWithLastConsumed(
            						current,
            						"type",
            						lv_type_1_0,
            						"it.unimi.xtext.Kant.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleKnowledgeGenerator"


    // $ANTLR start "entryRuleKnowledgeFromFunction"
    // InternalKant.g:2184:1: entryRuleKnowledgeFromFunction returns [EObject current=null] : iv_ruleKnowledgeFromFunction= ruleKnowledgeFromFunction EOF ;
    public final EObject entryRuleKnowledgeFromFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKnowledgeFromFunction = null;


        try {
            // InternalKant.g:2184:62: (iv_ruleKnowledgeFromFunction= ruleKnowledgeFromFunction EOF )
            // InternalKant.g:2185:2: iv_ruleKnowledgeFromFunction= ruleKnowledgeFromFunction EOF
            {
             newCompositeNode(grammarAccess.getKnowledgeFromFunctionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleKnowledgeFromFunction=ruleKnowledgeFromFunction();

            state._fsp--;

             current =iv_ruleKnowledgeFromFunction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleKnowledgeFromFunction"


    // $ANTLR start "ruleKnowledgeFromFunction"
    // InternalKant.g:2191:1: ruleKnowledgeFromFunction returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_args_2_0= ruleKnowledgeFromFunctionArg ) )? otherlv_3= ')' (otherlv_4= 'with' ( (lv_key_5_0= ruleKnowledgeValue ) ) )? ) ;
    public final EObject ruleKnowledgeFromFunction() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_args_2_0 = null;

        EObject lv_key_5_0 = null;



        	enterRule();

        try {
            // InternalKant.g:2197:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_args_2_0= ruleKnowledgeFromFunctionArg ) )? otherlv_3= ')' (otherlv_4= 'with' ( (lv_key_5_0= ruleKnowledgeValue ) ) )? ) )
            // InternalKant.g:2198:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_args_2_0= ruleKnowledgeFromFunctionArg ) )? otherlv_3= ')' (otherlv_4= 'with' ( (lv_key_5_0= ruleKnowledgeValue ) ) )? )
            {
            // InternalKant.g:2198:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_args_2_0= ruleKnowledgeFromFunctionArg ) )? otherlv_3= ')' (otherlv_4= 'with' ( (lv_key_5_0= ruleKnowledgeValue ) ) )? )
            // InternalKant.g:2199:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_args_2_0= ruleKnowledgeFromFunctionArg ) )? otherlv_3= ')' (otherlv_4= 'with' ( (lv_key_5_0= ruleKnowledgeValue ) ) )?
            {
            // InternalKant.g:2199:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalKant.g:2200:4: (lv_name_0_0= RULE_ID )
            {
            // InternalKant.g:2200:4: (lv_name_0_0= RULE_ID )
            // InternalKant.g:2201:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_38); 

            					newLeafNode(lv_name_0_0, grammarAccess.getKnowledgeFromFunctionAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getKnowledgeFromFunctionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"it.unimi.xtext.Kant.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,13,FOLLOW_39); 

            			newLeafNode(otherlv_1, grammarAccess.getKnowledgeFromFunctionAccess().getLeftParenthesisKeyword_1());
            		
            // InternalKant.g:2221:3: ( (lv_args_2_0= ruleKnowledgeFromFunctionArg ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==RULE_ID||LA49_0==20||LA49_0==23||LA49_0==34||LA49_0==38) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalKant.g:2222:4: (lv_args_2_0= ruleKnowledgeFromFunctionArg )
                    {
                    // InternalKant.g:2222:4: (lv_args_2_0= ruleKnowledgeFromFunctionArg )
                    // InternalKant.g:2223:5: lv_args_2_0= ruleKnowledgeFromFunctionArg
                    {

                    					newCompositeNode(grammarAccess.getKnowledgeFromFunctionAccess().getArgsKnowledgeFromFunctionArgParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_40);
                    lv_args_2_0=ruleKnowledgeFromFunctionArg();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getKnowledgeFromFunctionRule());
                    					}
                    					set(
                    						current,
                    						"args",
                    						lv_args_2_0,
                    						"it.unimi.xtext.Kant.KnowledgeFromFunctionArg");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,14,FOLLOW_41); 

            			newLeafNode(otherlv_3, grammarAccess.getKnowledgeFromFunctionAccess().getRightParenthesisKeyword_3());
            		
            // InternalKant.g:2244:3: (otherlv_4= 'with' ( (lv_key_5_0= ruleKnowledgeValue ) ) )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==15) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalKant.g:2245:4: otherlv_4= 'with' ( (lv_key_5_0= ruleKnowledgeValue ) )
                    {
                    otherlv_4=(Token)match(input,15,FOLLOW_18); 

                    				newLeafNode(otherlv_4, grammarAccess.getKnowledgeFromFunctionAccess().getWithKeyword_4_0());
                    			
                    // InternalKant.g:2249:4: ( (lv_key_5_0= ruleKnowledgeValue ) )
                    // InternalKant.g:2250:5: (lv_key_5_0= ruleKnowledgeValue )
                    {
                    // InternalKant.g:2250:5: (lv_key_5_0= ruleKnowledgeValue )
                    // InternalKant.g:2251:6: lv_key_5_0= ruleKnowledgeValue
                    {

                    						newCompositeNode(grammarAccess.getKnowledgeFromFunctionAccess().getKeyKnowledgeValueParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_key_5_0=ruleKnowledgeValue();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getKnowledgeFromFunctionRule());
                    						}
                    						set(
                    							current,
                    							"key",
                    							lv_key_5_0,
                    							"it.unimi.xtext.Kant.KnowledgeValue");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleKnowledgeFromFunction"


    // $ANTLR start "entryRuleKnowledgeFromFunctionArg"
    // InternalKant.g:2273:1: entryRuleKnowledgeFromFunctionArg returns [EObject current=null] : iv_ruleKnowledgeFromFunctionArg= ruleKnowledgeFromFunctionArg EOF ;
    public final EObject entryRuleKnowledgeFromFunctionArg() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKnowledgeFromFunctionArg = null;


        try {
            // InternalKant.g:2273:65: (iv_ruleKnowledgeFromFunctionArg= ruleKnowledgeFromFunctionArg EOF )
            // InternalKant.g:2274:2: iv_ruleKnowledgeFromFunctionArg= ruleKnowledgeFromFunctionArg EOF
            {
             newCompositeNode(grammarAccess.getKnowledgeFromFunctionArgRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleKnowledgeFromFunctionArg=ruleKnowledgeFromFunctionArg();

            state._fsp--;

             current =iv_ruleKnowledgeFromFunctionArg; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleKnowledgeFromFunctionArg"


    // $ANTLR start "ruleKnowledgeFromFunctionArg"
    // InternalKant.g:2280:1: ruleKnowledgeFromFunctionArg returns [EObject current=null] : ( ( ( (lv_args_0_0= ruleKnowledgeValue ) ) (otherlv_1= ',' ( (lv_args_2_0= ruleKnowledgeValue ) ) )* ) | this_KnowledgeSpreading_3= ruleKnowledgeSpreading ) ;
    public final EObject ruleKnowledgeFromFunctionArg() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_args_0_0 = null;

        EObject lv_args_2_0 = null;

        EObject this_KnowledgeSpreading_3 = null;



        	enterRule();

        try {
            // InternalKant.g:2286:2: ( ( ( ( (lv_args_0_0= ruleKnowledgeValue ) ) (otherlv_1= ',' ( (lv_args_2_0= ruleKnowledgeValue ) ) )* ) | this_KnowledgeSpreading_3= ruleKnowledgeSpreading ) )
            // InternalKant.g:2287:2: ( ( ( (lv_args_0_0= ruleKnowledgeValue ) ) (otherlv_1= ',' ( (lv_args_2_0= ruleKnowledgeValue ) ) )* ) | this_KnowledgeSpreading_3= ruleKnowledgeSpreading )
            {
            // InternalKant.g:2287:2: ( ( ( (lv_args_0_0= ruleKnowledgeValue ) ) (otherlv_1= ',' ( (lv_args_2_0= ruleKnowledgeValue ) ) )* ) | this_KnowledgeSpreading_3= ruleKnowledgeSpreading )
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==RULE_ID||LA52_0==23||LA52_0==34||LA52_0==38) ) {
                alt52=1;
            }
            else if ( (LA52_0==20) ) {
                alt52=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;
            }
            switch (alt52) {
                case 1 :
                    // InternalKant.g:2288:3: ( ( (lv_args_0_0= ruleKnowledgeValue ) ) (otherlv_1= ',' ( (lv_args_2_0= ruleKnowledgeValue ) ) )* )
                    {
                    // InternalKant.g:2288:3: ( ( (lv_args_0_0= ruleKnowledgeValue ) ) (otherlv_1= ',' ( (lv_args_2_0= ruleKnowledgeValue ) ) )* )
                    // InternalKant.g:2289:4: ( (lv_args_0_0= ruleKnowledgeValue ) ) (otherlv_1= ',' ( (lv_args_2_0= ruleKnowledgeValue ) ) )*
                    {
                    // InternalKant.g:2289:4: ( (lv_args_0_0= ruleKnowledgeValue ) )
                    // InternalKant.g:2290:5: (lv_args_0_0= ruleKnowledgeValue )
                    {
                    // InternalKant.g:2290:5: (lv_args_0_0= ruleKnowledgeValue )
                    // InternalKant.g:2291:6: lv_args_0_0= ruleKnowledgeValue
                    {

                    						newCompositeNode(grammarAccess.getKnowledgeFromFunctionArgAccess().getArgsKnowledgeValueParserRuleCall_0_0_0());
                    					
                    pushFollow(FOLLOW_42);
                    lv_args_0_0=ruleKnowledgeValue();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getKnowledgeFromFunctionArgRule());
                    						}
                    						add(
                    							current,
                    							"args",
                    							lv_args_0_0,
                    							"it.unimi.xtext.Kant.KnowledgeValue");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalKant.g:2308:4: (otherlv_1= ',' ( (lv_args_2_0= ruleKnowledgeValue ) ) )*
                    loop51:
                    do {
                        int alt51=2;
                        int LA51_0 = input.LA(1);

                        if ( (LA51_0==10) ) {
                            alt51=1;
                        }


                        switch (alt51) {
                    	case 1 :
                    	    // InternalKant.g:2309:5: otherlv_1= ',' ( (lv_args_2_0= ruleKnowledgeValue ) )
                    	    {
                    	    otherlv_1=(Token)match(input,10,FOLLOW_18); 

                    	    					newLeafNode(otherlv_1, grammarAccess.getKnowledgeFromFunctionArgAccess().getCommaKeyword_0_1_0());
                    	    				
                    	    // InternalKant.g:2313:5: ( (lv_args_2_0= ruleKnowledgeValue ) )
                    	    // InternalKant.g:2314:6: (lv_args_2_0= ruleKnowledgeValue )
                    	    {
                    	    // InternalKant.g:2314:6: (lv_args_2_0= ruleKnowledgeValue )
                    	    // InternalKant.g:2315:7: lv_args_2_0= ruleKnowledgeValue
                    	    {

                    	    							newCompositeNode(grammarAccess.getKnowledgeFromFunctionArgAccess().getArgsKnowledgeValueParserRuleCall_0_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_42);
                    	    lv_args_2_0=ruleKnowledgeValue();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getKnowledgeFromFunctionArgRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"args",
                    	    								lv_args_2_0,
                    	    								"it.unimi.xtext.Kant.KnowledgeValue");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop51;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // InternalKant.g:2335:3: this_KnowledgeSpreading_3= ruleKnowledgeSpreading
                    {

                    			newCompositeNode(grammarAccess.getKnowledgeFromFunctionArgAccess().getKnowledgeSpreadingParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_KnowledgeSpreading_3=ruleKnowledgeSpreading();

                    state._fsp--;


                    			current = this_KnowledgeSpreading_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleKnowledgeFromFunctionArg"


    // $ANTLR start "entryRuleCommunication"
    // InternalKant.g:2347:1: entryRuleCommunication returns [EObject current=null] : iv_ruleCommunication= ruleCommunication EOF ;
    public final EObject entryRuleCommunication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommunication = null;


        try {
            // InternalKant.g:2347:54: (iv_ruleCommunication= ruleCommunication EOF )
            // InternalKant.g:2348:2: iv_ruleCommunication= ruleCommunication EOF
            {
             newCompositeNode(grammarAccess.getCommunicationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCommunication=ruleCommunication();

            state._fsp--;

             current =iv_ruleCommunication; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCommunication"


    // $ANTLR start "ruleCommunication"
    // InternalKant.g:2354:1: ruleCommunication returns [EObject current=null] : ( ( (lv_from_0_0= RULE_ID ) ) (otherlv_1= ',' ( (lv_from_2_0= RULE_ID ) ) )* otherlv_3= '->' ( (lv_to_4_0= RULE_ID ) ) (otherlv_5= ',' ( (lv_to_6_0= RULE_ID ) ) )* otherlv_7= ':' ( (lv_knowledge_8_0= ruleKnowledge ) ) ) ;
    public final EObject ruleCommunication() throws RecognitionException {
        EObject current = null;

        Token lv_from_0_0=null;
        Token otherlv_1=null;
        Token lv_from_2_0=null;
        Token otherlv_3=null;
        Token lv_to_4_0=null;
        Token otherlv_5=null;
        Token lv_to_6_0=null;
        Token otherlv_7=null;
        EObject lv_knowledge_8_0 = null;



        	enterRule();

        try {
            // InternalKant.g:2360:2: ( ( ( (lv_from_0_0= RULE_ID ) ) (otherlv_1= ',' ( (lv_from_2_0= RULE_ID ) ) )* otherlv_3= '->' ( (lv_to_4_0= RULE_ID ) ) (otherlv_5= ',' ( (lv_to_6_0= RULE_ID ) ) )* otherlv_7= ':' ( (lv_knowledge_8_0= ruleKnowledge ) ) ) )
            // InternalKant.g:2361:2: ( ( (lv_from_0_0= RULE_ID ) ) (otherlv_1= ',' ( (lv_from_2_0= RULE_ID ) ) )* otherlv_3= '->' ( (lv_to_4_0= RULE_ID ) ) (otherlv_5= ',' ( (lv_to_6_0= RULE_ID ) ) )* otherlv_7= ':' ( (lv_knowledge_8_0= ruleKnowledge ) ) )
            {
            // InternalKant.g:2361:2: ( ( (lv_from_0_0= RULE_ID ) ) (otherlv_1= ',' ( (lv_from_2_0= RULE_ID ) ) )* otherlv_3= '->' ( (lv_to_4_0= RULE_ID ) ) (otherlv_5= ',' ( (lv_to_6_0= RULE_ID ) ) )* otherlv_7= ':' ( (lv_knowledge_8_0= ruleKnowledge ) ) )
            // InternalKant.g:2362:3: ( (lv_from_0_0= RULE_ID ) ) (otherlv_1= ',' ( (lv_from_2_0= RULE_ID ) ) )* otherlv_3= '->' ( (lv_to_4_0= RULE_ID ) ) (otherlv_5= ',' ( (lv_to_6_0= RULE_ID ) ) )* otherlv_7= ':' ( (lv_knowledge_8_0= ruleKnowledge ) )
            {
            // InternalKant.g:2362:3: ( (lv_from_0_0= RULE_ID ) )
            // InternalKant.g:2363:4: (lv_from_0_0= RULE_ID )
            {
            // InternalKant.g:2363:4: (lv_from_0_0= RULE_ID )
            // InternalKant.g:2364:5: lv_from_0_0= RULE_ID
            {
            lv_from_0_0=(Token)match(input,RULE_ID,FOLLOW_43); 

            					newLeafNode(lv_from_0_0, grammarAccess.getCommunicationAccess().getFromIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCommunicationRule());
            					}
            					addWithLastConsumed(
            						current,
            						"from",
            						lv_from_0_0,
            						"it.unimi.xtext.Kant.ID");
            				

            }


            }

            // InternalKant.g:2380:3: (otherlv_1= ',' ( (lv_from_2_0= RULE_ID ) ) )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( (LA53_0==10) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // InternalKant.g:2381:4: otherlv_1= ',' ( (lv_from_2_0= RULE_ID ) )
            	    {
            	    otherlv_1=(Token)match(input,10,FOLLOW_4); 

            	    				newLeafNode(otherlv_1, grammarAccess.getCommunicationAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalKant.g:2385:4: ( (lv_from_2_0= RULE_ID ) )
            	    // InternalKant.g:2386:5: (lv_from_2_0= RULE_ID )
            	    {
            	    // InternalKant.g:2386:5: (lv_from_2_0= RULE_ID )
            	    // InternalKant.g:2387:6: lv_from_2_0= RULE_ID
            	    {
            	    lv_from_2_0=(Token)match(input,RULE_ID,FOLLOW_43); 

            	    						newLeafNode(lv_from_2_0, grammarAccess.getCommunicationAccess().getFromIDTerminalRuleCall_1_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getCommunicationRule());
            	    						}
            	    						addWithLastConsumed(
            	    							current,
            	    							"from",
            	    							lv_from_2_0,
            	    							"it.unimi.xtext.Kant.ID");
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop53;
                }
            } while (true);

            otherlv_3=(Token)match(input,16,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getCommunicationAccess().getHyphenMinusGreaterThanSignKeyword_2());
            		
            // InternalKant.g:2408:3: ( (lv_to_4_0= RULE_ID ) )
            // InternalKant.g:2409:4: (lv_to_4_0= RULE_ID )
            {
            // InternalKant.g:2409:4: (lv_to_4_0= RULE_ID )
            // InternalKant.g:2410:5: lv_to_4_0= RULE_ID
            {
            lv_to_4_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_to_4_0, grammarAccess.getCommunicationAccess().getToIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCommunicationRule());
            					}
            					addWithLastConsumed(
            						current,
            						"to",
            						lv_to_4_0,
            						"it.unimi.xtext.Kant.ID");
            				

            }


            }

            // InternalKant.g:2426:3: (otherlv_5= ',' ( (lv_to_6_0= RULE_ID ) ) )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( (LA54_0==10) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // InternalKant.g:2427:4: otherlv_5= ',' ( (lv_to_6_0= RULE_ID ) )
            	    {
            	    otherlv_5=(Token)match(input,10,FOLLOW_4); 

            	    				newLeafNode(otherlv_5, grammarAccess.getCommunicationAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalKant.g:2431:4: ( (lv_to_6_0= RULE_ID ) )
            	    // InternalKant.g:2432:5: (lv_to_6_0= RULE_ID )
            	    {
            	    // InternalKant.g:2432:5: (lv_to_6_0= RULE_ID )
            	    // InternalKant.g:2433:6: lv_to_6_0= RULE_ID
            	    {
            	    lv_to_6_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            	    						newLeafNode(lv_to_6_0, grammarAccess.getCommunicationAccess().getToIDTerminalRuleCall_4_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getCommunicationRule());
            	    						}
            	    						addWithLastConsumed(
            	    							current,
            	    							"to",
            	    							lv_to_6_0,
            	    							"it.unimi.xtext.Kant.ID");
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop54;
                }
            } while (true);

            otherlv_7=(Token)match(input,11,FOLLOW_24); 

            			newLeafNode(otherlv_7, grammarAccess.getCommunicationAccess().getColonKeyword_5());
            		
            // InternalKant.g:2454:3: ( (lv_knowledge_8_0= ruleKnowledge ) )
            // InternalKant.g:2455:4: (lv_knowledge_8_0= ruleKnowledge )
            {
            // InternalKant.g:2455:4: (lv_knowledge_8_0= ruleKnowledge )
            // InternalKant.g:2456:5: lv_knowledge_8_0= ruleKnowledge
            {

            					newCompositeNode(grammarAccess.getCommunicationAccess().getKnowledgeKnowledgeParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_2);
            lv_knowledge_8_0=ruleKnowledge();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCommunicationRule());
            					}
            					set(
            						current,
            						"knowledge",
            						lv_knowledge_8_0,
            						"it.unimi.xtext.Kant.Knowledge");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCommunication"


    // $ANTLR start "entryRuleScenarioBranching"
    // InternalKant.g:2477:1: entryRuleScenarioBranching returns [EObject current=null] : iv_ruleScenarioBranching= ruleScenarioBranching EOF ;
    public final EObject entryRuleScenarioBranching() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScenarioBranching = null;


        try {
            // InternalKant.g:2477:58: (iv_ruleScenarioBranching= ruleScenarioBranching EOF )
            // InternalKant.g:2478:2: iv_ruleScenarioBranching= ruleScenarioBranching EOF
            {
             newCompositeNode(grammarAccess.getScenarioBranchingRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleScenarioBranching=ruleScenarioBranching();

            state._fsp--;

             current =iv_ruleScenarioBranching; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleScenarioBranching"


    // $ANTLR start "ruleScenarioBranching"
    // InternalKant.g:2484:1: ruleScenarioBranching returns [EObject current=null] : (this_ScenarioOptional_0= ruleScenarioOptional | this_ScenarioAlternatives_1= ruleScenarioAlternatives ) ;
    public final EObject ruleScenarioBranching() throws RecognitionException {
        EObject current = null;

        EObject this_ScenarioOptional_0 = null;

        EObject this_ScenarioAlternatives_1 = null;



        	enterRule();

        try {
            // InternalKant.g:2490:2: ( (this_ScenarioOptional_0= ruleScenarioOptional | this_ScenarioAlternatives_1= ruleScenarioAlternatives ) )
            // InternalKant.g:2491:2: (this_ScenarioOptional_0= ruleScenarioOptional | this_ScenarioAlternatives_1= ruleScenarioAlternatives )
            {
            // InternalKant.g:2491:2: (this_ScenarioOptional_0= ruleScenarioOptional | this_ScenarioAlternatives_1= ruleScenarioAlternatives )
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==39) ) {
                alt55=1;
            }
            else if ( (LA55_0==40) ) {
                alt55=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 55, 0, input);

                throw nvae;
            }
            switch (alt55) {
                case 1 :
                    // InternalKant.g:2492:3: this_ScenarioOptional_0= ruleScenarioOptional
                    {

                    			newCompositeNode(grammarAccess.getScenarioBranchingAccess().getScenarioOptionalParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ScenarioOptional_0=ruleScenarioOptional();

                    state._fsp--;


                    			current = this_ScenarioOptional_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalKant.g:2501:3: this_ScenarioAlternatives_1= ruleScenarioAlternatives
                    {

                    			newCompositeNode(grammarAccess.getScenarioBranchingAccess().getScenarioAlternativesParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ScenarioAlternatives_1=ruleScenarioAlternatives();

                    state._fsp--;


                    			current = this_ScenarioAlternatives_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleScenarioBranching"


    // $ANTLR start "entryRuleScenarioOptional"
    // InternalKant.g:2513:1: entryRuleScenarioOptional returns [EObject current=null] : iv_ruleScenarioOptional= ruleScenarioOptional EOF ;
    public final EObject entryRuleScenarioOptional() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScenarioOptional = null;


        try {
            // InternalKant.g:2513:57: (iv_ruleScenarioOptional= ruleScenarioOptional EOF )
            // InternalKant.g:2514:2: iv_ruleScenarioOptional= ruleScenarioOptional EOF
            {
             newCompositeNode(grammarAccess.getScenarioOptionalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleScenarioOptional=ruleScenarioOptional();

            state._fsp--;

             current =iv_ruleScenarioOptional; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleScenarioOptional"


    // $ANTLR start "ruleScenarioOptional"
    // InternalKant.g:2520:1: ruleScenarioOptional returns [EObject current=null] : (otherlv_0= 'optionally' ( (lv_scenario_1_0= ruleScenario ) ) ) ;
    public final EObject ruleScenarioOptional() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_scenario_1_0 = null;



        	enterRule();

        try {
            // InternalKant.g:2526:2: ( (otherlv_0= 'optionally' ( (lv_scenario_1_0= ruleScenario ) ) ) )
            // InternalKant.g:2527:2: (otherlv_0= 'optionally' ( (lv_scenario_1_0= ruleScenario ) ) )
            {
            // InternalKant.g:2527:2: (otherlv_0= 'optionally' ( (lv_scenario_1_0= ruleScenario ) ) )
            // InternalKant.g:2528:3: otherlv_0= 'optionally' ( (lv_scenario_1_0= ruleScenario ) )
            {
            otherlv_0=(Token)match(input,39,FOLLOW_44); 

            			newLeafNode(otherlv_0, grammarAccess.getScenarioOptionalAccess().getOptionallyKeyword_0());
            		
            // InternalKant.g:2532:3: ( (lv_scenario_1_0= ruleScenario ) )
            // InternalKant.g:2533:4: (lv_scenario_1_0= ruleScenario )
            {
            // InternalKant.g:2533:4: (lv_scenario_1_0= ruleScenario )
            // InternalKant.g:2534:5: lv_scenario_1_0= ruleScenario
            {

            					newCompositeNode(grammarAccess.getScenarioOptionalAccess().getScenarioScenarioParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_scenario_1_0=ruleScenario();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getScenarioOptionalRule());
            					}
            					add(
            						current,
            						"scenario",
            						lv_scenario_1_0,
            						"it.unimi.xtext.Kant.Scenario");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleScenarioOptional"


    // $ANTLR start "entryRuleScenarioAlternatives"
    // InternalKant.g:2555:1: entryRuleScenarioAlternatives returns [EObject current=null] : iv_ruleScenarioAlternatives= ruleScenarioAlternatives EOF ;
    public final EObject entryRuleScenarioAlternatives() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScenarioAlternatives = null;


        try {
            // InternalKant.g:2555:61: (iv_ruleScenarioAlternatives= ruleScenarioAlternatives EOF )
            // InternalKant.g:2556:2: iv_ruleScenarioAlternatives= ruleScenarioAlternatives EOF
            {
             newCompositeNode(grammarAccess.getScenarioAlternativesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleScenarioAlternatives=ruleScenarioAlternatives();

            state._fsp--;

             current =iv_ruleScenarioAlternatives; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleScenarioAlternatives"


    // $ANTLR start "ruleScenarioAlternatives"
    // InternalKant.g:2562:1: ruleScenarioAlternatives returns [EObject current=null] : (otherlv_0= 'alternatively' (otherlv_1= 'or' ( (lv_scenario_2_0= ruleScenario ) ) ) (otherlv_3= 'or' ( (lv_scenario_4_0= ruleScenario ) ) )+ ) ;
    public final EObject ruleScenarioAlternatives() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_scenario_2_0 = null;

        EObject lv_scenario_4_0 = null;



        	enterRule();

        try {
            // InternalKant.g:2568:2: ( (otherlv_0= 'alternatively' (otherlv_1= 'or' ( (lv_scenario_2_0= ruleScenario ) ) ) (otherlv_3= 'or' ( (lv_scenario_4_0= ruleScenario ) ) )+ ) )
            // InternalKant.g:2569:2: (otherlv_0= 'alternatively' (otherlv_1= 'or' ( (lv_scenario_2_0= ruleScenario ) ) ) (otherlv_3= 'or' ( (lv_scenario_4_0= ruleScenario ) ) )+ )
            {
            // InternalKant.g:2569:2: (otherlv_0= 'alternatively' (otherlv_1= 'or' ( (lv_scenario_2_0= ruleScenario ) ) ) (otherlv_3= 'or' ( (lv_scenario_4_0= ruleScenario ) ) )+ )
            // InternalKant.g:2570:3: otherlv_0= 'alternatively' (otherlv_1= 'or' ( (lv_scenario_2_0= ruleScenario ) ) ) (otherlv_3= 'or' ( (lv_scenario_4_0= ruleScenario ) ) )+
            {
            otherlv_0=(Token)match(input,40,FOLLOW_45); 

            			newLeafNode(otherlv_0, grammarAccess.getScenarioAlternativesAccess().getAlternativelyKeyword_0());
            		
            // InternalKant.g:2574:3: (otherlv_1= 'or' ( (lv_scenario_2_0= ruleScenario ) ) )
            // InternalKant.g:2575:4: otherlv_1= 'or' ( (lv_scenario_2_0= ruleScenario ) )
            {
            otherlv_1=(Token)match(input,41,FOLLOW_44); 

            				newLeafNode(otherlv_1, grammarAccess.getScenarioAlternativesAccess().getOrKeyword_1_0());
            			
            // InternalKant.g:2579:4: ( (lv_scenario_2_0= ruleScenario ) )
            // InternalKant.g:2580:5: (lv_scenario_2_0= ruleScenario )
            {
            // InternalKant.g:2580:5: (lv_scenario_2_0= ruleScenario )
            // InternalKant.g:2581:6: lv_scenario_2_0= ruleScenario
            {

            						newCompositeNode(grammarAccess.getScenarioAlternativesAccess().getScenarioScenarioParserRuleCall_1_1_0());
            					
            pushFollow(FOLLOW_45);
            lv_scenario_2_0=ruleScenario();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getScenarioAlternativesRule());
            						}
            						add(
            							current,
            							"scenario",
            							lv_scenario_2_0,
            							"it.unimi.xtext.Kant.Scenario");
            						afterParserOrEnumRuleCall();
            					

            }


            }


            }

            // InternalKant.g:2599:3: (otherlv_3= 'or' ( (lv_scenario_4_0= ruleScenario ) ) )+
            int cnt56=0;
            loop56:
            do {
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( (LA56_0==41) ) {
                    alt56=1;
                }


                switch (alt56) {
            	case 1 :
            	    // InternalKant.g:2600:4: otherlv_3= 'or' ( (lv_scenario_4_0= ruleScenario ) )
            	    {
            	    otherlv_3=(Token)match(input,41,FOLLOW_44); 

            	    				newLeafNode(otherlv_3, grammarAccess.getScenarioAlternativesAccess().getOrKeyword_2_0());
            	    			
            	    // InternalKant.g:2604:4: ( (lv_scenario_4_0= ruleScenario ) )
            	    // InternalKant.g:2605:5: (lv_scenario_4_0= ruleScenario )
            	    {
            	    // InternalKant.g:2605:5: (lv_scenario_4_0= ruleScenario )
            	    // InternalKant.g:2606:6: lv_scenario_4_0= ruleScenario
            	    {

            	    						newCompositeNode(grammarAccess.getScenarioAlternativesAccess().getScenarioScenarioParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_46);
            	    lv_scenario_4_0=ruleScenario();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getScenarioAlternativesRule());
            	    						}
            	    						add(
            	    							current,
            	    							"scenario",
            	    							lv_scenario_4_0,
            	    							"it.unimi.xtext.Kant.Scenario");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt56 >= 1 ) break loop56;
                        EarlyExitException eee =
                            new EarlyExitException(56, input);
                        throw eee;
                }
                cnt56++;
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleScenarioAlternatives"


    // $ANTLR start "entryRuleScenario"
    // InternalKant.g:2628:1: entryRuleScenario returns [EObject current=null] : iv_ruleScenario= ruleScenario EOF ;
    public final EObject entryRuleScenario() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScenario = null;


        try {
            // InternalKant.g:2628:49: (iv_ruleScenario= ruleScenario EOF )
            // InternalKant.g:2629:2: iv_ruleScenario= ruleScenario EOF
            {
             newCompositeNode(grammarAccess.getScenarioRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleScenario=ruleScenario();

            state._fsp--;

             current =iv_ruleScenario; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleScenario"


    // $ANTLR start "ruleScenario"
    // InternalKant.g:2635:1: ruleScenario returns [EObject current=null] : ( ( (lv_name_0_0= RULE_STRING ) )? otherlv_1= '{' ( (lv_elements_2_0= ruleElement ) )+ otherlv_3= '}' ) ;
    public final EObject ruleScenario() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_elements_2_0 = null;



        	enterRule();

        try {
            // InternalKant.g:2641:2: ( ( ( (lv_name_0_0= RULE_STRING ) )? otherlv_1= '{' ( (lv_elements_2_0= ruleElement ) )+ otherlv_3= '}' ) )
            // InternalKant.g:2642:2: ( ( (lv_name_0_0= RULE_STRING ) )? otherlv_1= '{' ( (lv_elements_2_0= ruleElement ) )+ otherlv_3= '}' )
            {
            // InternalKant.g:2642:2: ( ( (lv_name_0_0= RULE_STRING ) )? otherlv_1= '{' ( (lv_elements_2_0= ruleElement ) )+ otherlv_3= '}' )
            // InternalKant.g:2643:3: ( (lv_name_0_0= RULE_STRING ) )? otherlv_1= '{' ( (lv_elements_2_0= ruleElement ) )+ otherlv_3= '}'
            {
            // InternalKant.g:2643:3: ( (lv_name_0_0= RULE_STRING ) )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==RULE_STRING) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // InternalKant.g:2644:4: (lv_name_0_0= RULE_STRING )
                    {
                    // InternalKant.g:2644:4: (lv_name_0_0= RULE_STRING )
                    // InternalKant.g:2645:5: lv_name_0_0= RULE_STRING
                    {
                    lv_name_0_0=(Token)match(input,RULE_STRING,FOLLOW_47); 

                    					newLeafNode(lv_name_0_0, grammarAccess.getScenarioAccess().getNameSTRINGTerminalRuleCall_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getScenarioRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"name",
                    						lv_name_0_0,
                    						"it.unimi.xtext.Kant.STRING");
                    				

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,23,FOLLOW_48); 

            			newLeafNode(otherlv_1, grammarAccess.getScenarioAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalKant.g:2665:3: ( (lv_elements_2_0= ruleElement ) )+
            int cnt58=0;
            loop58:
            do {
                int alt58=2;
                int LA58_0 = input.LA(1);

                if ( (LA58_0==RULE_ID||LA58_0==12||LA58_0==25||(LA58_0>=28 && LA58_0<=30)||(LA58_0>=39 && LA58_0<=40)||LA58_0==42) ) {
                    alt58=1;
                }


                switch (alt58) {
            	case 1 :
            	    // InternalKant.g:2666:4: (lv_elements_2_0= ruleElement )
            	    {
            	    // InternalKant.g:2666:4: (lv_elements_2_0= ruleElement )
            	    // InternalKant.g:2667:5: lv_elements_2_0= ruleElement
            	    {

            	    					newCompositeNode(grammarAccess.getScenarioAccess().getElementsElementParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_48);
            	    lv_elements_2_0=ruleElement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getScenarioRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elements",
            	    						lv_elements_2_0,
            	    						"it.unimi.xtext.Kant.Element");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt58 >= 1 ) break loop58;
                        EarlyExitException eee =
                            new EarlyExitException(58, input);
                        throw eee;
                }
                cnt58++;
            } while (true);

            otherlv_3=(Token)match(input,24,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getScenarioAccess().getRightCurlyBracketKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleScenario"


    // $ANTLR start "entryRuleCheck"
    // InternalKant.g:2692:1: entryRuleCheck returns [EObject current=null] : iv_ruleCheck= ruleCheck EOF ;
    public final EObject entryRuleCheck() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCheck = null;


        try {
            // InternalKant.g:2692:46: (iv_ruleCheck= ruleCheck EOF )
            // InternalKant.g:2693:2: iv_ruleCheck= ruleCheck EOF
            {
             newCompositeNode(grammarAccess.getCheckRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCheck=ruleCheck();

            state._fsp--;

             current =iv_ruleCheck; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCheck"


    // $ANTLR start "ruleCheck"
    // InternalKant.g:2699:1: ruleCheck returns [EObject current=null] : (otherlv_0= 'check' (this_KnowledgeCheck_1= ruleKnowledgeCheck | this_EqualityCheck_2= ruleEqualityCheck | this_FreshnessCheck_3= ruleFreshnessCheck | this_LinkabilityCheck_4= ruleLinkabilityCheck | this_AuthenticationCheck_5= ruleAuthenticationCheck ) ) ;
    public final EObject ruleCheck() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_KnowledgeCheck_1 = null;

        EObject this_EqualityCheck_2 = null;

        EObject this_FreshnessCheck_3 = null;

        EObject this_LinkabilityCheck_4 = null;

        EObject this_AuthenticationCheck_5 = null;



        	enterRule();

        try {
            // InternalKant.g:2705:2: ( (otherlv_0= 'check' (this_KnowledgeCheck_1= ruleKnowledgeCheck | this_EqualityCheck_2= ruleEqualityCheck | this_FreshnessCheck_3= ruleFreshnessCheck | this_LinkabilityCheck_4= ruleLinkabilityCheck | this_AuthenticationCheck_5= ruleAuthenticationCheck ) ) )
            // InternalKant.g:2706:2: (otherlv_0= 'check' (this_KnowledgeCheck_1= ruleKnowledgeCheck | this_EqualityCheck_2= ruleEqualityCheck | this_FreshnessCheck_3= ruleFreshnessCheck | this_LinkabilityCheck_4= ruleLinkabilityCheck | this_AuthenticationCheck_5= ruleAuthenticationCheck ) )
            {
            // InternalKant.g:2706:2: (otherlv_0= 'check' (this_KnowledgeCheck_1= ruleKnowledgeCheck | this_EqualityCheck_2= ruleEqualityCheck | this_FreshnessCheck_3= ruleFreshnessCheck | this_LinkabilityCheck_4= ruleLinkabilityCheck | this_AuthenticationCheck_5= ruleAuthenticationCheck ) )
            // InternalKant.g:2707:3: otherlv_0= 'check' (this_KnowledgeCheck_1= ruleKnowledgeCheck | this_EqualityCheck_2= ruleEqualityCheck | this_FreshnessCheck_3= ruleFreshnessCheck | this_LinkabilityCheck_4= ruleLinkabilityCheck | this_AuthenticationCheck_5= ruleAuthenticationCheck )
            {
            otherlv_0=(Token)match(input,42,FOLLOW_49); 

            			newLeafNode(otherlv_0, grammarAccess.getCheckAccess().getCheckKeyword_0());
            		
            // InternalKant.g:2711:3: (this_KnowledgeCheck_1= ruleKnowledgeCheck | this_EqualityCheck_2= ruleEqualityCheck | this_FreshnessCheck_3= ruleFreshnessCheck | this_LinkabilityCheck_4= ruleLinkabilityCheck | this_AuthenticationCheck_5= ruleAuthenticationCheck )
            int alt59=5;
            alt59 = dfa59.predict(input);
            switch (alt59) {
                case 1 :
                    // InternalKant.g:2712:4: this_KnowledgeCheck_1= ruleKnowledgeCheck
                    {

                    				newCompositeNode(grammarAccess.getCheckAccess().getKnowledgeCheckParserRuleCall_1_0());
                    			
                    pushFollow(FOLLOW_2);
                    this_KnowledgeCheck_1=ruleKnowledgeCheck();

                    state._fsp--;


                    				current = this_KnowledgeCheck_1;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 2 :
                    // InternalKant.g:2721:4: this_EqualityCheck_2= ruleEqualityCheck
                    {

                    				newCompositeNode(grammarAccess.getCheckAccess().getEqualityCheckParserRuleCall_1_1());
                    			
                    pushFollow(FOLLOW_2);
                    this_EqualityCheck_2=ruleEqualityCheck();

                    state._fsp--;


                    				current = this_EqualityCheck_2;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 3 :
                    // InternalKant.g:2730:4: this_FreshnessCheck_3= ruleFreshnessCheck
                    {

                    				newCompositeNode(grammarAccess.getCheckAccess().getFreshnessCheckParserRuleCall_1_2());
                    			
                    pushFollow(FOLLOW_2);
                    this_FreshnessCheck_3=ruleFreshnessCheck();

                    state._fsp--;


                    				current = this_FreshnessCheck_3;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 4 :
                    // InternalKant.g:2739:4: this_LinkabilityCheck_4= ruleLinkabilityCheck
                    {

                    				newCompositeNode(grammarAccess.getCheckAccess().getLinkabilityCheckParserRuleCall_1_3());
                    			
                    pushFollow(FOLLOW_2);
                    this_LinkabilityCheck_4=ruleLinkabilityCheck();

                    state._fsp--;


                    				current = this_LinkabilityCheck_4;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 5 :
                    // InternalKant.g:2748:4: this_AuthenticationCheck_5= ruleAuthenticationCheck
                    {

                    				newCompositeNode(grammarAccess.getCheckAccess().getAuthenticationCheckParserRuleCall_1_4());
                    			
                    pushFollow(FOLLOW_2);
                    this_AuthenticationCheck_5=ruleAuthenticationCheck();

                    state._fsp--;


                    				current = this_AuthenticationCheck_5;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCheck"


    // $ANTLR start "entryRuleKnowledgeCheck"
    // InternalKant.g:2761:1: entryRuleKnowledgeCheck returns [EObject current=null] : iv_ruleKnowledgeCheck= ruleKnowledgeCheck EOF ;
    public final EObject entryRuleKnowledgeCheck() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKnowledgeCheck = null;


        try {
            // InternalKant.g:2761:55: (iv_ruleKnowledgeCheck= ruleKnowledgeCheck EOF )
            // InternalKant.g:2762:2: iv_ruleKnowledgeCheck= ruleKnowledgeCheck EOF
            {
             newCompositeNode(grammarAccess.getKnowledgeCheckRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleKnowledgeCheck=ruleKnowledgeCheck();

            state._fsp--;

             current =iv_ruleKnowledgeCheck; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleKnowledgeCheck"


    // $ANTLR start "ruleKnowledgeCheck"
    // InternalKant.g:2768:1: ruleKnowledgeCheck returns [EObject current=null] : ( ( (lv_here_0_0= 'here' ) )? ( (lv_only_1_0= 'only' ) )? ( ( (lv_target_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_target_4_0= RULE_ID ) ) )* ) (otherlv_5= 'should' ( (lv_not_6_0= 'not' ) )? otherlv_7= 'know' ) ( (lv_knowledge_8_0= ruleKnowledgeValue ) ) ) ;
    public final EObject ruleKnowledgeCheck() throws RecognitionException {
        EObject current = null;

        Token lv_here_0_0=null;
        Token lv_only_1_0=null;
        Token lv_target_2_0=null;
        Token otherlv_3=null;
        Token lv_target_4_0=null;
        Token otherlv_5=null;
        Token lv_not_6_0=null;
        Token otherlv_7=null;
        EObject lv_knowledge_8_0 = null;



        	enterRule();

        try {
            // InternalKant.g:2774:2: ( ( ( (lv_here_0_0= 'here' ) )? ( (lv_only_1_0= 'only' ) )? ( ( (lv_target_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_target_4_0= RULE_ID ) ) )* ) (otherlv_5= 'should' ( (lv_not_6_0= 'not' ) )? otherlv_7= 'know' ) ( (lv_knowledge_8_0= ruleKnowledgeValue ) ) ) )
            // InternalKant.g:2775:2: ( ( (lv_here_0_0= 'here' ) )? ( (lv_only_1_0= 'only' ) )? ( ( (lv_target_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_target_4_0= RULE_ID ) ) )* ) (otherlv_5= 'should' ( (lv_not_6_0= 'not' ) )? otherlv_7= 'know' ) ( (lv_knowledge_8_0= ruleKnowledgeValue ) ) )
            {
            // InternalKant.g:2775:2: ( ( (lv_here_0_0= 'here' ) )? ( (lv_only_1_0= 'only' ) )? ( ( (lv_target_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_target_4_0= RULE_ID ) ) )* ) (otherlv_5= 'should' ( (lv_not_6_0= 'not' ) )? otherlv_7= 'know' ) ( (lv_knowledge_8_0= ruleKnowledgeValue ) ) )
            // InternalKant.g:2776:3: ( (lv_here_0_0= 'here' ) )? ( (lv_only_1_0= 'only' ) )? ( ( (lv_target_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_target_4_0= RULE_ID ) ) )* ) (otherlv_5= 'should' ( (lv_not_6_0= 'not' ) )? otherlv_7= 'know' ) ( (lv_knowledge_8_0= ruleKnowledgeValue ) )
            {
            // InternalKant.g:2776:3: ( (lv_here_0_0= 'here' ) )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==43) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // InternalKant.g:2777:4: (lv_here_0_0= 'here' )
                    {
                    // InternalKant.g:2777:4: (lv_here_0_0= 'here' )
                    // InternalKant.g:2778:5: lv_here_0_0= 'here'
                    {
                    lv_here_0_0=(Token)match(input,43,FOLLOW_50); 

                    					newLeafNode(lv_here_0_0, grammarAccess.getKnowledgeCheckAccess().getHereHereKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getKnowledgeCheckRule());
                    					}
                    					setWithLastConsumed(current, "here", lv_here_0_0 != null, "here");
                    				

                    }


                    }
                    break;

            }

            // InternalKant.g:2790:3: ( (lv_only_1_0= 'only' ) )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==44) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // InternalKant.g:2791:4: (lv_only_1_0= 'only' )
                    {
                    // InternalKant.g:2791:4: (lv_only_1_0= 'only' )
                    // InternalKant.g:2792:5: lv_only_1_0= 'only'
                    {
                    lv_only_1_0=(Token)match(input,44,FOLLOW_4); 

                    					newLeafNode(lv_only_1_0, grammarAccess.getKnowledgeCheckAccess().getOnlyOnlyKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getKnowledgeCheckRule());
                    					}
                    					setWithLastConsumed(current, "only", lv_only_1_0 != null, "only");
                    				

                    }


                    }
                    break;

            }

            // InternalKant.g:2804:3: ( ( (lv_target_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_target_4_0= RULE_ID ) ) )* )
            // InternalKant.g:2805:4: ( (lv_target_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_target_4_0= RULE_ID ) ) )*
            {
            // InternalKant.g:2805:4: ( (lv_target_2_0= RULE_ID ) )
            // InternalKant.g:2806:5: (lv_target_2_0= RULE_ID )
            {
            // InternalKant.g:2806:5: (lv_target_2_0= RULE_ID )
            // InternalKant.g:2807:6: lv_target_2_0= RULE_ID
            {
            lv_target_2_0=(Token)match(input,RULE_ID,FOLLOW_51); 

            						newLeafNode(lv_target_2_0, grammarAccess.getKnowledgeCheckAccess().getTargetIDTerminalRuleCall_2_0_0());
            					

            						if (current==null) {
            							current = createModelElement(grammarAccess.getKnowledgeCheckRule());
            						}
            						addWithLastConsumed(
            							current,
            							"target",
            							lv_target_2_0,
            							"it.unimi.xtext.Kant.ID");
            					

            }


            }

            // InternalKant.g:2823:4: (otherlv_3= ',' ( (lv_target_4_0= RULE_ID ) ) )*
            loop62:
            do {
                int alt62=2;
                int LA62_0 = input.LA(1);

                if ( (LA62_0==10) ) {
                    alt62=1;
                }


                switch (alt62) {
            	case 1 :
            	    // InternalKant.g:2824:5: otherlv_3= ',' ( (lv_target_4_0= RULE_ID ) )
            	    {
            	    otherlv_3=(Token)match(input,10,FOLLOW_4); 

            	    					newLeafNode(otherlv_3, grammarAccess.getKnowledgeCheckAccess().getCommaKeyword_2_1_0());
            	    				
            	    // InternalKant.g:2828:5: ( (lv_target_4_0= RULE_ID ) )
            	    // InternalKant.g:2829:6: (lv_target_4_0= RULE_ID )
            	    {
            	    // InternalKant.g:2829:6: (lv_target_4_0= RULE_ID )
            	    // InternalKant.g:2830:7: lv_target_4_0= RULE_ID
            	    {
            	    lv_target_4_0=(Token)match(input,RULE_ID,FOLLOW_51); 

            	    							newLeafNode(lv_target_4_0, grammarAccess.getKnowledgeCheckAccess().getTargetIDTerminalRuleCall_2_1_1_0());
            	    						

            	    							if (current==null) {
            	    								current = createModelElement(grammarAccess.getKnowledgeCheckRule());
            	    							}
            	    							addWithLastConsumed(
            	    								current,
            	    								"target",
            	    								lv_target_4_0,
            	    								"it.unimi.xtext.Kant.ID");
            	    						

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop62;
                }
            } while (true);


            }

            // InternalKant.g:2848:3: (otherlv_5= 'should' ( (lv_not_6_0= 'not' ) )? otherlv_7= 'know' )
            // InternalKant.g:2849:4: otherlv_5= 'should' ( (lv_not_6_0= 'not' ) )? otherlv_7= 'know'
            {
            otherlv_5=(Token)match(input,45,FOLLOW_52); 

            				newLeafNode(otherlv_5, grammarAccess.getKnowledgeCheckAccess().getShouldKeyword_3_0());
            			
            // InternalKant.g:2853:4: ( (lv_not_6_0= 'not' ) )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==46) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // InternalKant.g:2854:5: (lv_not_6_0= 'not' )
                    {
                    // InternalKant.g:2854:5: (lv_not_6_0= 'not' )
                    // InternalKant.g:2855:6: lv_not_6_0= 'not'
                    {
                    lv_not_6_0=(Token)match(input,46,FOLLOW_53); 

                    						newLeafNode(lv_not_6_0, grammarAccess.getKnowledgeCheckAccess().getNotNotKeyword_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getKnowledgeCheckRule());
                    						}
                    						setWithLastConsumed(current, "not", lv_not_6_0 != null, "not");
                    					

                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,31,FOLLOW_18); 

            				newLeafNode(otherlv_7, grammarAccess.getKnowledgeCheckAccess().getKnowKeyword_3_2());
            			

            }

            // InternalKant.g:2872:3: ( (lv_knowledge_8_0= ruleKnowledgeValue ) )
            // InternalKant.g:2873:4: (lv_knowledge_8_0= ruleKnowledgeValue )
            {
            // InternalKant.g:2873:4: (lv_knowledge_8_0= ruleKnowledgeValue )
            // InternalKant.g:2874:5: lv_knowledge_8_0= ruleKnowledgeValue
            {

            					newCompositeNode(grammarAccess.getKnowledgeCheckAccess().getKnowledgeKnowledgeValueParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_knowledge_8_0=ruleKnowledgeValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getKnowledgeCheckRule());
            					}
            					set(
            						current,
            						"knowledge",
            						lv_knowledge_8_0,
            						"it.unimi.xtext.Kant.KnowledgeValue");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleKnowledgeCheck"


    // $ANTLR start "entryRuleEqualityCheck"
    // InternalKant.g:2895:1: entryRuleEqualityCheck returns [EObject current=null] : iv_ruleEqualityCheck= ruleEqualityCheck EOF ;
    public final EObject entryRuleEqualityCheck() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEqualityCheck = null;


        try {
            // InternalKant.g:2895:54: (iv_ruleEqualityCheck= ruleEqualityCheck EOF )
            // InternalKant.g:2896:2: iv_ruleEqualityCheck= ruleEqualityCheck EOF
            {
             newCompositeNode(grammarAccess.getEqualityCheckRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEqualityCheck=ruleEqualityCheck();

            state._fsp--;

             current =iv_ruleEqualityCheck; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEqualityCheck"


    // $ANTLR start "ruleEqualityCheck"
    // InternalKant.g:2902:1: ruleEqualityCheck returns [EObject current=null] : ( ( (lv_knowledge_0_0= ruleKnowledgeRef ) ) (otherlv_1= ',' ( (lv_knowledge_2_0= ruleKnowledgeRef ) ) )+ otherlv_3= 'should' ( (lv_not_4_0= 'not' ) )? otherlv_5= 'be' otherlv_6= 'equal' ) ;
    public final EObject ruleEqualityCheck() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_not_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        EObject lv_knowledge_0_0 = null;

        EObject lv_knowledge_2_0 = null;



        	enterRule();

        try {
            // InternalKant.g:2908:2: ( ( ( (lv_knowledge_0_0= ruleKnowledgeRef ) ) (otherlv_1= ',' ( (lv_knowledge_2_0= ruleKnowledgeRef ) ) )+ otherlv_3= 'should' ( (lv_not_4_0= 'not' ) )? otherlv_5= 'be' otherlv_6= 'equal' ) )
            // InternalKant.g:2909:2: ( ( (lv_knowledge_0_0= ruleKnowledgeRef ) ) (otherlv_1= ',' ( (lv_knowledge_2_0= ruleKnowledgeRef ) ) )+ otherlv_3= 'should' ( (lv_not_4_0= 'not' ) )? otherlv_5= 'be' otherlv_6= 'equal' )
            {
            // InternalKant.g:2909:2: ( ( (lv_knowledge_0_0= ruleKnowledgeRef ) ) (otherlv_1= ',' ( (lv_knowledge_2_0= ruleKnowledgeRef ) ) )+ otherlv_3= 'should' ( (lv_not_4_0= 'not' ) )? otherlv_5= 'be' otherlv_6= 'equal' )
            // InternalKant.g:2910:3: ( (lv_knowledge_0_0= ruleKnowledgeRef ) ) (otherlv_1= ',' ( (lv_knowledge_2_0= ruleKnowledgeRef ) ) )+ otherlv_3= 'should' ( (lv_not_4_0= 'not' ) )? otherlv_5= 'be' otherlv_6= 'equal'
            {
            // InternalKant.g:2910:3: ( (lv_knowledge_0_0= ruleKnowledgeRef ) )
            // InternalKant.g:2911:4: (lv_knowledge_0_0= ruleKnowledgeRef )
            {
            // InternalKant.g:2911:4: (lv_knowledge_0_0= ruleKnowledgeRef )
            // InternalKant.g:2912:5: lv_knowledge_0_0= ruleKnowledgeRef
            {

            					newCompositeNode(grammarAccess.getEqualityCheckAccess().getKnowledgeKnowledgeRefParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_54);
            lv_knowledge_0_0=ruleKnowledgeRef();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEqualityCheckRule());
            					}
            					add(
            						current,
            						"knowledge",
            						lv_knowledge_0_0,
            						"it.unimi.xtext.Kant.KnowledgeRef");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalKant.g:2929:3: (otherlv_1= ',' ( (lv_knowledge_2_0= ruleKnowledgeRef ) ) )+
            int cnt64=0;
            loop64:
            do {
                int alt64=2;
                int LA64_0 = input.LA(1);

                if ( (LA64_0==10) ) {
                    alt64=1;
                }


                switch (alt64) {
            	case 1 :
            	    // InternalKant.g:2930:4: otherlv_1= ',' ( (lv_knowledge_2_0= ruleKnowledgeRef ) )
            	    {
            	    otherlv_1=(Token)match(input,10,FOLLOW_4); 

            	    				newLeafNode(otherlv_1, grammarAccess.getEqualityCheckAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalKant.g:2934:4: ( (lv_knowledge_2_0= ruleKnowledgeRef ) )
            	    // InternalKant.g:2935:5: (lv_knowledge_2_0= ruleKnowledgeRef )
            	    {
            	    // InternalKant.g:2935:5: (lv_knowledge_2_0= ruleKnowledgeRef )
            	    // InternalKant.g:2936:6: lv_knowledge_2_0= ruleKnowledgeRef
            	    {

            	    						newCompositeNode(grammarAccess.getEqualityCheckAccess().getKnowledgeKnowledgeRefParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_51);
            	    lv_knowledge_2_0=ruleKnowledgeRef();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getEqualityCheckRule());
            	    						}
            	    						add(
            	    							current,
            	    							"knowledge",
            	    							lv_knowledge_2_0,
            	    							"it.unimi.xtext.Kant.KnowledgeRef");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt64 >= 1 ) break loop64;
                        EarlyExitException eee =
                            new EarlyExitException(64, input);
                        throw eee;
                }
                cnt64++;
            } while (true);

            otherlv_3=(Token)match(input,45,FOLLOW_55); 

            			newLeafNode(otherlv_3, grammarAccess.getEqualityCheckAccess().getShouldKeyword_2());
            		
            // InternalKant.g:2958:3: ( (lv_not_4_0= 'not' ) )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==46) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // InternalKant.g:2959:4: (lv_not_4_0= 'not' )
                    {
                    // InternalKant.g:2959:4: (lv_not_4_0= 'not' )
                    // InternalKant.g:2960:5: lv_not_4_0= 'not'
                    {
                    lv_not_4_0=(Token)match(input,46,FOLLOW_56); 

                    					newLeafNode(lv_not_4_0, grammarAccess.getEqualityCheckAccess().getNotNotKeyword_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getEqualityCheckRule());
                    					}
                    					setWithLastConsumed(current, "not", lv_not_4_0 != null, "not");
                    				

                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,47,FOLLOW_57); 

            			newLeafNode(otherlv_5, grammarAccess.getEqualityCheckAccess().getBeKeyword_4());
            		
            otherlv_6=(Token)match(input,48,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getEqualityCheckAccess().getEqualKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEqualityCheck"


    // $ANTLR start "entryRuleFreshnessCheck"
    // InternalKant.g:2984:1: entryRuleFreshnessCheck returns [EObject current=null] : iv_ruleFreshnessCheck= ruleFreshnessCheck EOF ;
    public final EObject entryRuleFreshnessCheck() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFreshnessCheck = null;


        try {
            // InternalKant.g:2984:55: (iv_ruleFreshnessCheck= ruleFreshnessCheck EOF )
            // InternalKant.g:2985:2: iv_ruleFreshnessCheck= ruleFreshnessCheck EOF
            {
             newCompositeNode(grammarAccess.getFreshnessCheckRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFreshnessCheck=ruleFreshnessCheck();

            state._fsp--;

             current =iv_ruleFreshnessCheck; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFreshnessCheck"


    // $ANTLR start "ruleFreshnessCheck"
    // InternalKant.g:2991:1: ruleFreshnessCheck returns [EObject current=null] : ( ( (lv_knowledge_0_0= ruleKnowledgeRef ) ) (otherlv_1= ',' ( (lv_knowledge_2_0= ruleKnowledgeRef ) ) )* otherlv_3= 'should' ( (lv_not_4_0= 'not' ) )? otherlv_5= 'be' otherlv_6= 'fresh' ) ;
    public final EObject ruleFreshnessCheck() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_not_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        EObject lv_knowledge_0_0 = null;

        EObject lv_knowledge_2_0 = null;



        	enterRule();

        try {
            // InternalKant.g:2997:2: ( ( ( (lv_knowledge_0_0= ruleKnowledgeRef ) ) (otherlv_1= ',' ( (lv_knowledge_2_0= ruleKnowledgeRef ) ) )* otherlv_3= 'should' ( (lv_not_4_0= 'not' ) )? otherlv_5= 'be' otherlv_6= 'fresh' ) )
            // InternalKant.g:2998:2: ( ( (lv_knowledge_0_0= ruleKnowledgeRef ) ) (otherlv_1= ',' ( (lv_knowledge_2_0= ruleKnowledgeRef ) ) )* otherlv_3= 'should' ( (lv_not_4_0= 'not' ) )? otherlv_5= 'be' otherlv_6= 'fresh' )
            {
            // InternalKant.g:2998:2: ( ( (lv_knowledge_0_0= ruleKnowledgeRef ) ) (otherlv_1= ',' ( (lv_knowledge_2_0= ruleKnowledgeRef ) ) )* otherlv_3= 'should' ( (lv_not_4_0= 'not' ) )? otherlv_5= 'be' otherlv_6= 'fresh' )
            // InternalKant.g:2999:3: ( (lv_knowledge_0_0= ruleKnowledgeRef ) ) (otherlv_1= ',' ( (lv_knowledge_2_0= ruleKnowledgeRef ) ) )* otherlv_3= 'should' ( (lv_not_4_0= 'not' ) )? otherlv_5= 'be' otherlv_6= 'fresh'
            {
            // InternalKant.g:2999:3: ( (lv_knowledge_0_0= ruleKnowledgeRef ) )
            // InternalKant.g:3000:4: (lv_knowledge_0_0= ruleKnowledgeRef )
            {
            // InternalKant.g:3000:4: (lv_knowledge_0_0= ruleKnowledgeRef )
            // InternalKant.g:3001:5: lv_knowledge_0_0= ruleKnowledgeRef
            {

            					newCompositeNode(grammarAccess.getFreshnessCheckAccess().getKnowledgeKnowledgeRefParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_51);
            lv_knowledge_0_0=ruleKnowledgeRef();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFreshnessCheckRule());
            					}
            					add(
            						current,
            						"knowledge",
            						lv_knowledge_0_0,
            						"it.unimi.xtext.Kant.KnowledgeRef");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalKant.g:3018:3: (otherlv_1= ',' ( (lv_knowledge_2_0= ruleKnowledgeRef ) ) )*
            loop66:
            do {
                int alt66=2;
                int LA66_0 = input.LA(1);

                if ( (LA66_0==10) ) {
                    alt66=1;
                }


                switch (alt66) {
            	case 1 :
            	    // InternalKant.g:3019:4: otherlv_1= ',' ( (lv_knowledge_2_0= ruleKnowledgeRef ) )
            	    {
            	    otherlv_1=(Token)match(input,10,FOLLOW_4); 

            	    				newLeafNode(otherlv_1, grammarAccess.getFreshnessCheckAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalKant.g:3023:4: ( (lv_knowledge_2_0= ruleKnowledgeRef ) )
            	    // InternalKant.g:3024:5: (lv_knowledge_2_0= ruleKnowledgeRef )
            	    {
            	    // InternalKant.g:3024:5: (lv_knowledge_2_0= ruleKnowledgeRef )
            	    // InternalKant.g:3025:6: lv_knowledge_2_0= ruleKnowledgeRef
            	    {

            	    						newCompositeNode(grammarAccess.getFreshnessCheckAccess().getKnowledgeKnowledgeRefParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_51);
            	    lv_knowledge_2_0=ruleKnowledgeRef();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getFreshnessCheckRule());
            	    						}
            	    						add(
            	    							current,
            	    							"knowledge",
            	    							lv_knowledge_2_0,
            	    							"it.unimi.xtext.Kant.KnowledgeRef");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop66;
                }
            } while (true);

            otherlv_3=(Token)match(input,45,FOLLOW_55); 

            			newLeafNode(otherlv_3, grammarAccess.getFreshnessCheckAccess().getShouldKeyword_2());
            		
            // InternalKant.g:3047:3: ( (lv_not_4_0= 'not' ) )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==46) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // InternalKant.g:3048:4: (lv_not_4_0= 'not' )
                    {
                    // InternalKant.g:3048:4: (lv_not_4_0= 'not' )
                    // InternalKant.g:3049:5: lv_not_4_0= 'not'
                    {
                    lv_not_4_0=(Token)match(input,46,FOLLOW_56); 

                    					newLeafNode(lv_not_4_0, grammarAccess.getFreshnessCheckAccess().getNotNotKeyword_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getFreshnessCheckRule());
                    					}
                    					setWithLastConsumed(current, "not", lv_not_4_0 != null, "not");
                    				

                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,47,FOLLOW_58); 

            			newLeafNode(otherlv_5, grammarAccess.getFreshnessCheckAccess().getBeKeyword_4());
            		
            otherlv_6=(Token)match(input,33,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getFreshnessCheckAccess().getFreshKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFreshnessCheck"


    // $ANTLR start "entryRuleLinkabilityCheck"
    // InternalKant.g:3073:1: entryRuleLinkabilityCheck returns [EObject current=null] : iv_ruleLinkabilityCheck= ruleLinkabilityCheck EOF ;
    public final EObject entryRuleLinkabilityCheck() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLinkabilityCheck = null;


        try {
            // InternalKant.g:3073:57: (iv_ruleLinkabilityCheck= ruleLinkabilityCheck EOF )
            // InternalKant.g:3074:2: iv_ruleLinkabilityCheck= ruleLinkabilityCheck EOF
            {
             newCompositeNode(grammarAccess.getLinkabilityCheckRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLinkabilityCheck=ruleLinkabilityCheck();

            state._fsp--;

             current =iv_ruleLinkabilityCheck; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLinkabilityCheck"


    // $ANTLR start "ruleLinkabilityCheck"
    // InternalKant.g:3080:1: ruleLinkabilityCheck returns [EObject current=null] : ( ( (lv_knowledge_0_0= ruleKnowledgeRef ) ) (otherlv_1= ',' ( (lv_knowledge_2_0= ruleKnowledgeRef ) ) )+ otherlv_3= 'should' ( (lv_not_4_0= 'not' ) )? otherlv_5= 'be' otherlv_6= 'linked' ) ;
    public final EObject ruleLinkabilityCheck() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_not_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        EObject lv_knowledge_0_0 = null;

        EObject lv_knowledge_2_0 = null;



        	enterRule();

        try {
            // InternalKant.g:3086:2: ( ( ( (lv_knowledge_0_0= ruleKnowledgeRef ) ) (otherlv_1= ',' ( (lv_knowledge_2_0= ruleKnowledgeRef ) ) )+ otherlv_3= 'should' ( (lv_not_4_0= 'not' ) )? otherlv_5= 'be' otherlv_6= 'linked' ) )
            // InternalKant.g:3087:2: ( ( (lv_knowledge_0_0= ruleKnowledgeRef ) ) (otherlv_1= ',' ( (lv_knowledge_2_0= ruleKnowledgeRef ) ) )+ otherlv_3= 'should' ( (lv_not_4_0= 'not' ) )? otherlv_5= 'be' otherlv_6= 'linked' )
            {
            // InternalKant.g:3087:2: ( ( (lv_knowledge_0_0= ruleKnowledgeRef ) ) (otherlv_1= ',' ( (lv_knowledge_2_0= ruleKnowledgeRef ) ) )+ otherlv_3= 'should' ( (lv_not_4_0= 'not' ) )? otherlv_5= 'be' otherlv_6= 'linked' )
            // InternalKant.g:3088:3: ( (lv_knowledge_0_0= ruleKnowledgeRef ) ) (otherlv_1= ',' ( (lv_knowledge_2_0= ruleKnowledgeRef ) ) )+ otherlv_3= 'should' ( (lv_not_4_0= 'not' ) )? otherlv_5= 'be' otherlv_6= 'linked'
            {
            // InternalKant.g:3088:3: ( (lv_knowledge_0_0= ruleKnowledgeRef ) )
            // InternalKant.g:3089:4: (lv_knowledge_0_0= ruleKnowledgeRef )
            {
            // InternalKant.g:3089:4: (lv_knowledge_0_0= ruleKnowledgeRef )
            // InternalKant.g:3090:5: lv_knowledge_0_0= ruleKnowledgeRef
            {

            					newCompositeNode(grammarAccess.getLinkabilityCheckAccess().getKnowledgeKnowledgeRefParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_54);
            lv_knowledge_0_0=ruleKnowledgeRef();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLinkabilityCheckRule());
            					}
            					add(
            						current,
            						"knowledge",
            						lv_knowledge_0_0,
            						"it.unimi.xtext.Kant.KnowledgeRef");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalKant.g:3107:3: (otherlv_1= ',' ( (lv_knowledge_2_0= ruleKnowledgeRef ) ) )+
            int cnt68=0;
            loop68:
            do {
                int alt68=2;
                int LA68_0 = input.LA(1);

                if ( (LA68_0==10) ) {
                    alt68=1;
                }


                switch (alt68) {
            	case 1 :
            	    // InternalKant.g:3108:4: otherlv_1= ',' ( (lv_knowledge_2_0= ruleKnowledgeRef ) )
            	    {
            	    otherlv_1=(Token)match(input,10,FOLLOW_4); 

            	    				newLeafNode(otherlv_1, grammarAccess.getLinkabilityCheckAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalKant.g:3112:4: ( (lv_knowledge_2_0= ruleKnowledgeRef ) )
            	    // InternalKant.g:3113:5: (lv_knowledge_2_0= ruleKnowledgeRef )
            	    {
            	    // InternalKant.g:3113:5: (lv_knowledge_2_0= ruleKnowledgeRef )
            	    // InternalKant.g:3114:6: lv_knowledge_2_0= ruleKnowledgeRef
            	    {

            	    						newCompositeNode(grammarAccess.getLinkabilityCheckAccess().getKnowledgeKnowledgeRefParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_51);
            	    lv_knowledge_2_0=ruleKnowledgeRef();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getLinkabilityCheckRule());
            	    						}
            	    						add(
            	    							current,
            	    							"knowledge",
            	    							lv_knowledge_2_0,
            	    							"it.unimi.xtext.Kant.KnowledgeRef");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt68 >= 1 ) break loop68;
                        EarlyExitException eee =
                            new EarlyExitException(68, input);
                        throw eee;
                }
                cnt68++;
            } while (true);

            otherlv_3=(Token)match(input,45,FOLLOW_55); 

            			newLeafNode(otherlv_3, grammarAccess.getLinkabilityCheckAccess().getShouldKeyword_2());
            		
            // InternalKant.g:3136:3: ( (lv_not_4_0= 'not' ) )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==46) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // InternalKant.g:3137:4: (lv_not_4_0= 'not' )
                    {
                    // InternalKant.g:3137:4: (lv_not_4_0= 'not' )
                    // InternalKant.g:3138:5: lv_not_4_0= 'not'
                    {
                    lv_not_4_0=(Token)match(input,46,FOLLOW_56); 

                    					newLeafNode(lv_not_4_0, grammarAccess.getLinkabilityCheckAccess().getNotNotKeyword_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getLinkabilityCheckRule());
                    					}
                    					setWithLastConsumed(current, "not", lv_not_4_0 != null, "not");
                    				

                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,47,FOLLOW_59); 

            			newLeafNode(otherlv_5, grammarAccess.getLinkabilityCheckAccess().getBeKeyword_4());
            		
            otherlv_6=(Token)match(input,49,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getLinkabilityCheckAccess().getLinkedKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLinkabilityCheck"


    // $ANTLR start "entryRuleAuthenticationCheck"
    // InternalKant.g:3162:1: entryRuleAuthenticationCheck returns [EObject current=null] : iv_ruleAuthenticationCheck= ruleAuthenticationCheck EOF ;
    public final EObject entryRuleAuthenticationCheck() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAuthenticationCheck = null;


        try {
            // InternalKant.g:3162:60: (iv_ruleAuthenticationCheck= ruleAuthenticationCheck EOF )
            // InternalKant.g:3163:2: iv_ruleAuthenticationCheck= ruleAuthenticationCheck EOF
            {
             newCompositeNode(grammarAccess.getAuthenticationCheckRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAuthenticationCheck=ruleAuthenticationCheck();

            state._fsp--;

             current =iv_ruleAuthenticationCheck; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAuthenticationCheck"


    // $ANTLR start "ruleAuthenticationCheck"
    // InternalKant.g:3169:1: ruleAuthenticationCheck returns [EObject current=null] : ( ( (lv_principal_0_0= RULE_ID ) ) otherlv_1= 'should' otherlv_2= 'authenticate' ( (lv_target_3_0= RULE_ID ) ) otherlv_4= 'with' ( (lv_knowledge_5_0= ruleKnowledgeValue ) ) ) ;
    public final EObject ruleAuthenticationCheck() throws RecognitionException {
        EObject current = null;

        Token lv_principal_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_target_3_0=null;
        Token otherlv_4=null;
        EObject lv_knowledge_5_0 = null;



        	enterRule();

        try {
            // InternalKant.g:3175:2: ( ( ( (lv_principal_0_0= RULE_ID ) ) otherlv_1= 'should' otherlv_2= 'authenticate' ( (lv_target_3_0= RULE_ID ) ) otherlv_4= 'with' ( (lv_knowledge_5_0= ruleKnowledgeValue ) ) ) )
            // InternalKant.g:3176:2: ( ( (lv_principal_0_0= RULE_ID ) ) otherlv_1= 'should' otherlv_2= 'authenticate' ( (lv_target_3_0= RULE_ID ) ) otherlv_4= 'with' ( (lv_knowledge_5_0= ruleKnowledgeValue ) ) )
            {
            // InternalKant.g:3176:2: ( ( (lv_principal_0_0= RULE_ID ) ) otherlv_1= 'should' otherlv_2= 'authenticate' ( (lv_target_3_0= RULE_ID ) ) otherlv_4= 'with' ( (lv_knowledge_5_0= ruleKnowledgeValue ) ) )
            // InternalKant.g:3177:3: ( (lv_principal_0_0= RULE_ID ) ) otherlv_1= 'should' otherlv_2= 'authenticate' ( (lv_target_3_0= RULE_ID ) ) otherlv_4= 'with' ( (lv_knowledge_5_0= ruleKnowledgeValue ) )
            {
            // InternalKant.g:3177:3: ( (lv_principal_0_0= RULE_ID ) )
            // InternalKant.g:3178:4: (lv_principal_0_0= RULE_ID )
            {
            // InternalKant.g:3178:4: (lv_principal_0_0= RULE_ID )
            // InternalKant.g:3179:5: lv_principal_0_0= RULE_ID
            {
            lv_principal_0_0=(Token)match(input,RULE_ID,FOLLOW_60); 

            					newLeafNode(lv_principal_0_0, grammarAccess.getAuthenticationCheckAccess().getPrincipalIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAuthenticationCheckRule());
            					}
            					setWithLastConsumed(
            						current,
            						"principal",
            						lv_principal_0_0,
            						"it.unimi.xtext.Kant.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,45,FOLLOW_61); 

            			newLeafNode(otherlv_1, grammarAccess.getAuthenticationCheckAccess().getShouldKeyword_1());
            		
            otherlv_2=(Token)match(input,50,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getAuthenticationCheckAccess().getAuthenticateKeyword_2());
            		
            // InternalKant.g:3203:3: ( (lv_target_3_0= RULE_ID ) )
            // InternalKant.g:3204:4: (lv_target_3_0= RULE_ID )
            {
            // InternalKant.g:3204:4: (lv_target_3_0= RULE_ID )
            // InternalKant.g:3205:5: lv_target_3_0= RULE_ID
            {
            lv_target_3_0=(Token)match(input,RULE_ID,FOLLOW_62); 

            					newLeafNode(lv_target_3_0, grammarAccess.getAuthenticationCheckAccess().getTargetIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAuthenticationCheckRule());
            					}
            					setWithLastConsumed(
            						current,
            						"target",
            						lv_target_3_0,
            						"it.unimi.xtext.Kant.ID");
            				

            }


            }

            otherlv_4=(Token)match(input,15,FOLLOW_18); 

            			newLeafNode(otherlv_4, grammarAccess.getAuthenticationCheckAccess().getWithKeyword_4());
            		
            // InternalKant.g:3225:3: ( (lv_knowledge_5_0= ruleKnowledgeValue ) )
            // InternalKant.g:3226:4: (lv_knowledge_5_0= ruleKnowledgeValue )
            {
            // InternalKant.g:3226:4: (lv_knowledge_5_0= ruleKnowledgeValue )
            // InternalKant.g:3227:5: lv_knowledge_5_0= ruleKnowledgeValue
            {

            					newCompositeNode(grammarAccess.getAuthenticationCheckAccess().getKnowledgeKnowledgeValueParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_2);
            lv_knowledge_5_0=ruleKnowledgeValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAuthenticationCheckRule());
            					}
            					set(
            						current,
            						"knowledge",
            						lv_knowledge_5_0,
            						"it.unimi.xtext.Kant.KnowledgeValue");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAuthenticationCheck"

    // Delegated rules


    protected DFA25 dfa25 = new DFA25(this);
    protected DFA59 dfa59 = new DFA59(this);
    static final String dfa_1s = "\24\uffff";
    static final String dfa_2s = "\1\uffff\1\5\5\uffff\1\5\2\uffff\1\5\11\uffff";
    static final String dfa_3s = "\4\4\2\uffff\1\12\1\4\1\12\5\4\2\12\1\4\1\12\1\4\1\12";
    static final String dfa_4s = "\1\46\1\52\2\46\2\uffff\1\45\1\52\1\45\1\43\1\52\3\46\2\45\1\43\1\45\1\46\1\45";
    static final String dfa_5s = "\4\uffff\1\1\1\2\16\uffff";
    static final String dfa_6s = "\24\uffff}>";
    static final String[] dfa_7s = {
            "\1\1\22\uffff\1\2\10\uffff\2\4\1\3\3\uffff\1\5",
            "\1\5\5\uffff\1\5\1\uffff\2\5\10\uffff\1\4\1\uffff\2\5\2\uffff\3\5\6\uffff\1\5\1\uffff\2\5\1\uffff\1\5",
            "\1\6\17\uffff\1\5\2\uffff\1\5\1\7\7\uffff\3\5\3\uffff\1\5",
            "\1\10\17\uffff\1\11\2\uffff\1\5\12\uffff\1\5\1\12\1\4\1\uffff\1\5",
            "",
            "",
            "\1\13\2\uffff\1\5\10\uffff\1\14\1\uffff\1\7\14\uffff\1\5",
            "\1\5\5\uffff\1\5\1\uffff\1\5\11\uffff\1\4\1\uffff\2\5\2\uffff\3\5\10\uffff\2\5\1\uffff\1\5",
            "\1\15\2\uffff\1\5\25\uffff\1\12\1\uffff\1\5",
            "\1\5\5\uffff\1\4\14\uffff\1\5\12\uffff\1\5\1\4",
            "\1\5\5\uffff\1\5\1\uffff\1\5\11\uffff\1\4\1\uffff\2\5\2\uffff\3\5\10\uffff\2\5\1\uffff\1\5",
            "\1\16\17\uffff\1\5\2\uffff\1\5\10\uffff\3\5\3\uffff\1\5",
            "\1\17\22\uffff\1\5\12\uffff\1\5\3\uffff\1\5",
            "\1\21\17\uffff\1\20\2\uffff\1\5\12\uffff\1\5\1\uffff\1\4\1\uffff\1\5",
            "\1\13\2\uffff\1\5\10\uffff\1\22\1\uffff\1\7\14\uffff\1\5",
            "\1\13\2\uffff\1\5\12\uffff\1\7\14\uffff\1\5",
            "\1\5\5\uffff\1\4\14\uffff\1\5\12\uffff\1\5\1\4",
            "\1\15\2\uffff\1\5\25\uffff\1\12\1\uffff\1\5",
            "\1\23\22\uffff\1\5\12\uffff\1\5\3\uffff\1\5",
            "\1\13\2\uffff\1\5\12\uffff\1\7\14\uffff\1\5"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA25 extends DFA {

        public DFA25(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 25;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "1207:2: (this_KnowledgeDef_0= ruleKnowledgeDef | this_KnowledgeValue_1= ruleKnowledgeValue )";
        }
    }
    static final String dfa_8s = "\26\uffff";
    static final String dfa_9s = "\1\4\1\uffff\1\12\1\37\2\4\1\37\2\uffff\2\12\1\4\1\37\1\4\1\12\1\37\1\41\1\12\1\56\2\uffff\1\57";
    static final String dfa_10s = "\1\54\1\uffff\1\55\1\62\2\4\1\57\2\uffff\2\55\1\4\1\57\1\4\1\55\1\57\1\61\1\55\1\57\2\uffff\1\57";
    static final String dfa_11s = "\1\uffff\1\1\5\uffff\1\3\1\5\12\uffff\1\2\1\4\1\uffff";
    static final String dfa_12s = "\26\uffff}>";
    static final String[] dfa_13s = {
            "\1\2\46\uffff\2\1",
            "",
            "\1\4\32\uffff\1\5\7\uffff\1\3",
            "\1\1\16\uffff\1\6\1\7\2\uffff\1\10",
            "\1\11",
            "\1\12",
            "\1\1\17\uffff\1\7",
            "",
            "",
            "\1\4\32\uffff\1\13\7\uffff\1\14",
            "\1\15\32\uffff\1\5\7\uffff\1\7",
            "\1\16",
            "\1\1\16\uffff\1\17\1\20",
            "\1\21",
            "\1\15\32\uffff\1\13\7\uffff\1\22",
            "\1\1\17\uffff\1\20",
            "\1\7\16\uffff\1\23\1\24",
            "\1\15\32\uffff\1\13\7\uffff\1\22",
            "\1\25\1\20",
            "",
            "",
            "\1\20"
    };

    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[][] dfa_13 = unpackEncodedStringArray(dfa_13s);

    class DFA59 extends DFA {

        public DFA59(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 59;
            this.eot = dfa_8;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_12;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "2711:3: (this_KnowledgeCheck_1= ruleKnowledgeCheck | this_EqualityCheck_2= ruleEqualityCheck | this_FreshnessCheck_3= ruleFreshnessCheck | this_LinkabilityCheck_4= ruleLinkabilityCheck | this_AuthenticationCheck_5= ruleAuthenticationCheck )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000058072001012L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000C00L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000210L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000007A002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000100010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000004400L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000078002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000800010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000070002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000060002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000600002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000004400800010L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000001000400L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000004400800210L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000004700800010L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000080000402L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000001000010L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000001800100010L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000800000400L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000001000100010L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000004C00900010L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000004400900010L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000004701900010L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000004700900010L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000400800010L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000004400904010L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000010400L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000800020L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000058073001010L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000180000000010L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000100000000010L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000200000000400L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000400080000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000C00000000000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0000000000008000L});

}