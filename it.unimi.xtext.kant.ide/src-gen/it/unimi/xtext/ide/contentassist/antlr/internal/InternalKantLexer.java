package it.unimi.xtext.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalKantLexer extends Lexer {
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

    public InternalKantLexer() {;} 
    public InternalKantLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalKantLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalKant.g"; }

    // $ANTLR start "T__9"
    public final void mT__9() throws RecognitionException {
        try {
            int _type = T__9;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKant.g:11:6: ( 'const' )
            // InternalKant.g:11:8: 'const'
            {
            match("const"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__9"

    // $ANTLR start "T__10"
    public final void mT__10() throws RecognitionException {
        try {
            int _type = T__10;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKant.g:12:7: ( 'fresh' )
            // InternalKant.g:12:9: 'fresh'
            {
            match("fresh"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__10"

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKant.g:13:7: ( 'forall' )
            // InternalKant.g:13:9: 'forall'
            {
            match("forall"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__11"

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKant.g:14:7: ( ':' )
            // InternalKant.g:14:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKant.g:15:7: ( ',' )
            // InternalKant.g:15:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKant.g:16:7: ( 'function' )
            // InternalKant.g:16:9: 'function'
            {
            match("function"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKant.g:17:7: ( '(' )
            // InternalKant.g:17:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKant.g:18:7: ( ')' )
            // InternalKant.g:18:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKant.g:19:7: ( 'with' )
            // InternalKant.g:19:9: 'with'
            {
            match("with"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKant.g:20:7: ( '->' )
            // InternalKant.g:20:9: '->'
            {
            match("->"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKant.g:21:7: ( 'way' )
            // InternalKant.g:21:9: 'way'
            {
            match("way"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKant.g:22:7: ( '=' )
            // InternalKant.g:22:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKant.g:23:7: ( '{' )
            // InternalKant.g:23:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKant.g:24:7: ( '}' )
            // InternalKant.g:24:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKant.g:25:7: ( 'property' )
            // InternalKant.g:25:9: 'property'
            {
            match("property"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKant.g:26:7: ( 'equals' )
            // InternalKant.g:26:9: 'equals'
            {
            match("equals"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKant.g:27:7: ( 'invert' )
            // InternalKant.g:27:9: 'invert'
            {
            match("invert"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKant.g:28:7: ( 'knowledge' )
            // InternalKant.g:28:9: 'knowledge'
            {
            match("knowledge"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKant.g:29:7: ( 'principal' )
            // InternalKant.g:29:9: 'principal'
            {
            match("principal"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKant.g:30:7: ( 'know' )
            // InternalKant.g:30:9: 'know'
            {
            match("know"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKant.g:31:7: ( '[' )
            // InternalKant.g:31:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKant.g:32:7: ( ']' )
            // InternalKant.g:32:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKant.g:33:7: ( '...' )
            // InternalKant.g:33:9: '...'
            {
            match("..."); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKant.g:34:7: ( '_' )
            // InternalKant.g:34:9: '_'
            {
            match('_'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKant.g:35:7: ( '.' )
            // InternalKant.g:35:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKant.g:36:7: ( 'gen' )
            // InternalKant.g:36:9: 'gen'
            {
            match("gen"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKant.g:37:7: ( 'optionally' )
            // InternalKant.g:37:9: 'optionally'
            {
            match("optionally"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKant.g:38:7: ( 'alternatively' )
            // InternalKant.g:38:9: 'alternatively'
            {
            match("alternatively"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKant.g:39:7: ( 'or' )
            // InternalKant.g:39:9: 'or'
            {
            match("or"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKant.g:40:7: ( 'check' )
            // InternalKant.g:40:9: 'check'
            {
            match("check"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKant.g:41:7: ( 'should' )
            // InternalKant.g:41:9: 'should'
            {
            match("should"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKant.g:42:7: ( 'be' )
            // InternalKant.g:42:9: 'be'
            {
            match("be"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKant.g:43:7: ( 'equal' )
            // InternalKant.g:43:9: 'equal'
            {
            match("equal"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKant.g:44:7: ( 'linked' )
            // InternalKant.g:44:9: 'linked'
            {
            match("linked"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKant.g:45:7: ( 'authenticate' )
            // InternalKant.g:45:9: 'authenticate'
            {
            match("authenticate"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKant.g:46:7: ( 'randomized' )
            // InternalKant.g:46:9: 'randomized'
            {
            match("randomized"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKant.g:47:7: ( 'one' )
            // InternalKant.g:47:9: 'one'
            {
            match("one"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKant.g:48:7: ( '?' )
            // InternalKant.g:48:9: '?'
            {
            match('?'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKant.g:49:7: ( 'shared' )
            // InternalKant.g:49:9: 'shared'
            {
            match("shared"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKant.g:50:7: ( 'here' )
            // InternalKant.g:50:9: 'here'
            {
            match("here"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKant.g:51:7: ( 'only' )
            // InternalKant.g:51:9: 'only'
            {
            match("only"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKant.g:52:7: ( 'not' )
            // InternalKant.g:52:9: 'not'
            {
            match("not"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKant.g:8627:9: ( ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalKant.g:8627:11: ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalKant.g:8627:31: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')||(LA1_0>='A' && LA1_0<='Z')||LA1_0=='_'||(LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalKant.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKant.g:8629:13: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' )
            // InternalKant.g:8629:15: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
            {
            match('\"'); 
            // InternalKant.g:8629:19: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
            loop2:
            do {
                int alt2=3;
                int LA2_0 = input.LA(1);

                if ( (LA2_0=='\\') ) {
                    alt2=1;
                }
                else if ( ((LA2_0>='\u0000' && LA2_0<='!')||(LA2_0>='#' && LA2_0<='[')||(LA2_0>=']' && LA2_0<='\uFFFF')) ) {
                    alt2=2;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalKant.g:8629:20: '\\\\' .
            	    {
            	    match('\\'); 
            	    matchAny(); 

            	    }
            	    break;
            	case 2 :
            	    // InternalKant.g:8629:27: ~ ( ( '\\\\' | '\"' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKant.g:8631:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalKant.g:8631:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalKant.g:8631:24: ( options {greedy=false; } : . )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0=='*') ) {
                    int LA3_1 = input.LA(2);

                    if ( (LA3_1=='/') ) {
                        alt3=2;
                    }
                    else if ( ((LA3_1>='\u0000' && LA3_1<='.')||(LA3_1>='0' && LA3_1<='\uFFFF')) ) {
                        alt3=1;
                    }


                }
                else if ( ((LA3_0>='\u0000' && LA3_0<=')')||(LA3_0>='+' && LA3_0<='\uFFFF')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalKant.g:8631:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKant.g:8633:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalKant.g:8633:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalKant.g:8633:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='\u0000' && LA4_0<='\t')||(LA4_0>='\u000B' && LA4_0<='\f')||(LA4_0>='\u000E' && LA4_0<='\uFFFF')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalKant.g:8633:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // InternalKant.g:8633:40: ( ( '\\r' )? '\\n' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='\n'||LA6_0=='\r') ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalKant.g:8633:41: ( '\\r' )? '\\n'
                    {
                    // InternalKant.g:8633:41: ( '\\r' )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0=='\r') ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // InternalKant.g:8633:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKant.g:8635:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalKant.g:8635:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalKant.g:8635:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>='\t' && LA7_0<='\n')||LA7_0=='\r'||LA7_0==' ') ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalKant.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    public void mTokens() throws RecognitionException {
        // InternalKant.g:1:8: ( T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS )
        int alt8=47;
        alt8 = dfa8.predict(input);
        switch (alt8) {
            case 1 :
                // InternalKant.g:1:10: T__9
                {
                mT__9(); 

                }
                break;
            case 2 :
                // InternalKant.g:1:15: T__10
                {
                mT__10(); 

                }
                break;
            case 3 :
                // InternalKant.g:1:21: T__11
                {
                mT__11(); 

                }
                break;
            case 4 :
                // InternalKant.g:1:27: T__12
                {
                mT__12(); 

                }
                break;
            case 5 :
                // InternalKant.g:1:33: T__13
                {
                mT__13(); 

                }
                break;
            case 6 :
                // InternalKant.g:1:39: T__14
                {
                mT__14(); 

                }
                break;
            case 7 :
                // InternalKant.g:1:45: T__15
                {
                mT__15(); 

                }
                break;
            case 8 :
                // InternalKant.g:1:51: T__16
                {
                mT__16(); 

                }
                break;
            case 9 :
                // InternalKant.g:1:57: T__17
                {
                mT__17(); 

                }
                break;
            case 10 :
                // InternalKant.g:1:63: T__18
                {
                mT__18(); 

                }
                break;
            case 11 :
                // InternalKant.g:1:69: T__19
                {
                mT__19(); 

                }
                break;
            case 12 :
                // InternalKant.g:1:75: T__20
                {
                mT__20(); 

                }
                break;
            case 13 :
                // InternalKant.g:1:81: T__21
                {
                mT__21(); 

                }
                break;
            case 14 :
                // InternalKant.g:1:87: T__22
                {
                mT__22(); 

                }
                break;
            case 15 :
                // InternalKant.g:1:93: T__23
                {
                mT__23(); 

                }
                break;
            case 16 :
                // InternalKant.g:1:99: T__24
                {
                mT__24(); 

                }
                break;
            case 17 :
                // InternalKant.g:1:105: T__25
                {
                mT__25(); 

                }
                break;
            case 18 :
                // InternalKant.g:1:111: T__26
                {
                mT__26(); 

                }
                break;
            case 19 :
                // InternalKant.g:1:117: T__27
                {
                mT__27(); 

                }
                break;
            case 20 :
                // InternalKant.g:1:123: T__28
                {
                mT__28(); 

                }
                break;
            case 21 :
                // InternalKant.g:1:129: T__29
                {
                mT__29(); 

                }
                break;
            case 22 :
                // InternalKant.g:1:135: T__30
                {
                mT__30(); 

                }
                break;
            case 23 :
                // InternalKant.g:1:141: T__31
                {
                mT__31(); 

                }
                break;
            case 24 :
                // InternalKant.g:1:147: T__32
                {
                mT__32(); 

                }
                break;
            case 25 :
                // InternalKant.g:1:153: T__33
                {
                mT__33(); 

                }
                break;
            case 26 :
                // InternalKant.g:1:159: T__34
                {
                mT__34(); 

                }
                break;
            case 27 :
                // InternalKant.g:1:165: T__35
                {
                mT__35(); 

                }
                break;
            case 28 :
                // InternalKant.g:1:171: T__36
                {
                mT__36(); 

                }
                break;
            case 29 :
                // InternalKant.g:1:177: T__37
                {
                mT__37(); 

                }
                break;
            case 30 :
                // InternalKant.g:1:183: T__38
                {
                mT__38(); 

                }
                break;
            case 31 :
                // InternalKant.g:1:189: T__39
                {
                mT__39(); 

                }
                break;
            case 32 :
                // InternalKant.g:1:195: T__40
                {
                mT__40(); 

                }
                break;
            case 33 :
                // InternalKant.g:1:201: T__41
                {
                mT__41(); 

                }
                break;
            case 34 :
                // InternalKant.g:1:207: T__42
                {
                mT__42(); 

                }
                break;
            case 35 :
                // InternalKant.g:1:213: T__43
                {
                mT__43(); 

                }
                break;
            case 36 :
                // InternalKant.g:1:219: T__44
                {
                mT__44(); 

                }
                break;
            case 37 :
                // InternalKant.g:1:225: T__45
                {
                mT__45(); 

                }
                break;
            case 38 :
                // InternalKant.g:1:231: T__46
                {
                mT__46(); 

                }
                break;
            case 39 :
                // InternalKant.g:1:237: T__47
                {
                mT__47(); 

                }
                break;
            case 40 :
                // InternalKant.g:1:243: T__48
                {
                mT__48(); 

                }
                break;
            case 41 :
                // InternalKant.g:1:249: T__49
                {
                mT__49(); 

                }
                break;
            case 42 :
                // InternalKant.g:1:255: T__50
                {
                mT__50(); 

                }
                break;
            case 43 :
                // InternalKant.g:1:261: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 44 :
                // InternalKant.g:1:269: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 45 :
                // InternalKant.g:1:281: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 46 :
                // InternalKant.g:1:297: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 47 :
                // InternalKant.g:1:313: RULE_WS
                {
                mRULE_WS(); 

                }
                break;

        }

    }


    protected DFA8 dfa8 = new DFA8(this);
    static final String DFA8_eotS =
        "\1\uffff\2\36\4\uffff\1\36\4\uffff\4\36\2\uffff\1\56\1\uffff\7\36\1\uffff\2\36\4\uffff\13\36\2\uffff\2\36\1\113\4\36\1\122\4\36\2\uffff\6\36\1\135\5\36\1\143\1\36\1\uffff\1\145\5\36\1\uffff\3\36\1\156\5\36\1\164\1\uffff\4\36\1\172\1\uffff\1\36\1\uffff\1\174\6\36\1\u0083\1\uffff\1\u0084\1\u0085\1\u0086\2\36\1\uffff\2\36\1\u008c\2\36\1\uffff\1\36\1\uffff\6\36\4\uffff\1\u0096\3\36\1\u009a\1\uffff\1\u009b\4\36\1\u00a0\1\u00a1\1\u00a2\1\36\1\uffff\3\36\2\uffff\4\36\3\uffff\1\36\1\u00ac\1\u00ad\6\36\2\uffff\1\u00b4\1\u00b5\4\36\2\uffff\1\u00ba\2\36\1\u00bd\1\uffff\2\36\1\uffff\1\36\1\u00c1\1\u00c2\2\uffff";
    static final String DFA8_eofS =
        "\u00c3\uffff";
    static final String DFA8_minS =
        "\1\11\1\150\1\157\4\uffff\1\141\4\uffff\1\162\1\161\2\156\2\uffff\1\56\1\uffff\1\145\1\156\1\154\1\150\1\145\1\151\1\141\1\uffff\1\145\1\157\2\uffff\1\52\1\uffff\1\156\2\145\1\162\1\156\1\164\1\171\1\151\1\165\1\166\1\157\2\uffff\1\156\1\164\1\60\1\145\2\164\1\141\1\60\2\156\1\162\1\164\2\uffff\1\163\1\143\1\163\1\141\1\143\1\150\1\60\1\160\1\156\1\141\1\145\1\167\1\60\1\151\1\uffff\1\60\1\171\1\145\1\150\1\165\1\162\1\uffff\1\153\1\144\1\145\1\60\1\164\1\153\1\150\1\154\1\164\1\60\1\uffff\1\145\1\143\1\154\1\162\1\60\1\uffff\1\157\1\uffff\1\60\1\162\1\145\1\154\2\145\1\157\1\60\1\uffff\3\60\1\154\1\151\1\uffff\1\162\1\151\1\60\1\164\1\145\1\uffff\1\156\1\uffff\2\156\3\144\1\155\4\uffff\1\60\1\157\1\164\1\160\1\60\1\uffff\1\60\1\144\2\141\1\164\3\60\1\151\1\uffff\1\156\1\171\1\141\2\uffff\1\147\1\154\1\164\1\151\3\uffff\1\172\2\60\1\154\1\145\1\154\1\151\1\143\1\145\2\uffff\2\60\1\171\1\166\1\141\1\144\2\uffff\1\60\1\145\1\164\1\60\1\uffff\1\154\1\145\1\uffff\1\171\2\60\2\uffff";
    static final String DFA8_maxS =
        "\1\175\1\157\1\165\4\uffff\1\151\4\uffff\1\162\1\161\2\156\2\uffff\1\56\1\uffff\1\145\1\162\1\165\1\150\1\145\1\151\1\141\1\uffff\1\145\1\157\2\uffff\1\57\1\uffff\1\156\2\145\1\162\1\156\1\164\1\171\1\157\1\165\1\166\1\157\2\uffff\1\156\1\164\1\172\1\154\2\164\1\157\1\172\2\156\1\162\1\164\2\uffff\1\163\1\143\1\163\1\141\1\143\1\150\1\172\1\160\1\156\1\141\1\145\1\167\1\172\1\151\1\uffff\1\172\1\171\1\145\1\150\1\165\1\162\1\uffff\1\153\1\144\1\145\1\172\1\164\1\153\1\150\1\154\1\164\1\172\1\uffff\1\145\1\143\1\154\1\162\1\172\1\uffff\1\157\1\uffff\1\172\1\162\1\145\1\154\2\145\1\157\1\172\1\uffff\3\172\1\154\1\151\1\uffff\1\162\1\151\1\172\1\164\1\145\1\uffff\1\156\1\uffff\2\156\3\144\1\155\4\uffff\1\172\1\157\1\164\1\160\1\172\1\uffff\1\172\1\144\2\141\1\164\3\172\1\151\1\uffff\1\156\1\171\1\141\2\uffff\1\147\1\154\1\164\1\151\3\uffff\3\172\1\154\1\145\1\154\1\151\1\143\1\145\2\uffff\2\172\1\171\1\166\1\141\1\144\2\uffff\1\172\1\145\1\164\1\172\1\uffff\1\154\1\145\1\uffff\1\171\2\172\2\uffff";
    static final String DFA8_acceptS =
        "\3\uffff\1\4\1\5\1\7\1\10\1\uffff\1\12\1\14\1\15\1\16\4\uffff\1\25\1\26\1\uffff\1\30\7\uffff\1\46\2\uffff\1\53\1\54\1\uffff\1\57\13\uffff\1\27\1\31\14\uffff\1\55\1\56\16\uffff\1\35\6\uffff\1\40\12\uffff\1\13\5\uffff\1\32\1\uffff\1\45\10\uffff\1\52\5\uffff\1\11\5\uffff\1\24\1\uffff\1\51\6\uffff\1\50\1\1\1\36\1\2\5\uffff\1\41\11\uffff\1\3\3\uffff\1\20\1\21\4\uffff\1\37\1\47\1\42\11\uffff\1\6\1\17\6\uffff\1\23\1\22\4\uffff\1\33\2\uffff\1\44\3\uffff\1\43\1\34";
    static final String DFA8_specialS =
        "\u00c3\uffff}>";
    static final String[] DFA8_transitionS = {
            "\2\41\2\uffff\1\41\22\uffff\1\41\1\uffff\1\37\5\uffff\1\5\1\6\2\uffff\1\4\1\10\1\22\1\40\12\uffff\1\3\2\uffff\1\11\1\uffff\1\33\1\uffff\32\36\1\20\1\uffff\1\21\1\uffff\1\23\1\uffff\1\26\1\30\1\1\1\36\1\15\1\2\1\24\1\34\1\16\1\36\1\17\1\31\1\36\1\35\1\25\1\14\1\36\1\32\1\27\3\36\1\7\3\36\1\12\1\uffff\1\13",
            "\1\43\6\uffff\1\42",
            "\1\45\2\uffff\1\44\2\uffff\1\46",
            "",
            "",
            "",
            "",
            "\1\50\7\uffff\1\47",
            "",
            "",
            "",
            "",
            "\1\51",
            "\1\52",
            "\1\53",
            "\1\54",
            "",
            "",
            "\1\55",
            "",
            "\1\57",
            "\1\62\1\uffff\1\60\1\uffff\1\61",
            "\1\63\10\uffff\1\64",
            "\1\65",
            "\1\66",
            "\1\67",
            "\1\70",
            "",
            "\1\71",
            "\1\72",
            "",
            "",
            "\1\73\4\uffff\1\74",
            "",
            "\1\75",
            "\1\76",
            "\1\77",
            "\1\100",
            "\1\101",
            "\1\102",
            "\1\103",
            "\1\105\5\uffff\1\104",
            "\1\106",
            "\1\107",
            "\1\110",
            "",
            "",
            "\1\111",
            "\1\112",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\114\6\uffff\1\115",
            "\1\116",
            "\1\117",
            "\1\121\15\uffff\1\120",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\123",
            "\1\124",
            "\1\125",
            "\1\126",
            "",
            "",
            "\1\127",
            "\1\130",
            "\1\131",
            "\1\132",
            "\1\133",
            "\1\134",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\136",
            "\1\137",
            "\1\140",
            "\1\141",
            "\1\142",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\144",
            "",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\146",
            "\1\147",
            "\1\150",
            "\1\151",
            "\1\152",
            "",
            "\1\153",
            "\1\154",
            "\1\155",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\157",
            "\1\160",
            "\1\161",
            "\1\162",
            "\1\163",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "",
            "\1\165",
            "\1\166",
            "\1\167",
            "\1\170",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\13\36\1\171\16\36",
            "",
            "\1\173",
            "",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\175",
            "\1\176",
            "\1\177",
            "\1\u0080",
            "\1\u0081",
            "\1\u0082",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\u0087",
            "\1\u0088",
            "",
            "\1\u0089",
            "\1\u008a",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\22\36\1\u008b\7\36",
            "\1\u008d",
            "\1\u008e",
            "",
            "\1\u008f",
            "",
            "\1\u0090",
            "\1\u0091",
            "\1\u0092",
            "\1\u0093",
            "\1\u0094",
            "\1\u0095",
            "",
            "",
            "",
            "",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\u0097",
            "\1\u0098",
            "\1\u0099",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\u009c",
            "\1\u009d",
            "\1\u009e",
            "\1\u009f",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\u00a3",
            "",
            "\1\u00a4",
            "\1\u00a5",
            "\1\u00a6",
            "",
            "",
            "\1\u00a7",
            "\1\u00a8",
            "\1\u00a9",
            "\1\u00aa",
            "",
            "",
            "",
            "\1\u00ab",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\u00ae",
            "\1\u00af",
            "\1\u00b0",
            "\1\u00b1",
            "\1\u00b2",
            "\1\u00b3",
            "",
            "",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\u00b6",
            "\1\u00b7",
            "\1\u00b8",
            "\1\u00b9",
            "",
            "",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\u00bb",
            "\1\u00bc",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "",
            "\1\u00be",
            "\1\u00bf",
            "",
            "\1\u00c0",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "",
            ""
    };

    static final short[] DFA8_eot = DFA.unpackEncodedString(DFA8_eotS);
    static final short[] DFA8_eof = DFA.unpackEncodedString(DFA8_eofS);
    static final char[] DFA8_min = DFA.unpackEncodedStringToUnsignedChars(DFA8_minS);
    static final char[] DFA8_max = DFA.unpackEncodedStringToUnsignedChars(DFA8_maxS);
    static final short[] DFA8_accept = DFA.unpackEncodedString(DFA8_acceptS);
    static final short[] DFA8_special = DFA.unpackEncodedString(DFA8_specialS);
    static final short[][] DFA8_transition;

    static {
        int numStates = DFA8_transitionS.length;
        DFA8_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA8_transition[i] = DFA.unpackEncodedString(DFA8_transitionS[i]);
        }
    }

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = DFA8_eot;
            this.eof = DFA8_eof;
            this.min = DFA8_min;
            this.max = DFA8_max;
            this.accept = DFA8_accept;
            this.special = DFA8_special;
            this.transition = DFA8_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS );";
        }
    }
 

}