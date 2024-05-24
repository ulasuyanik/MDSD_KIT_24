package org.xtext.example.mydsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'ESystem'", "'<<'", "'provides:'", "','", "'requires:'", "'encapsulates:'", "'>>'", "'ECompositeComponent'", "'providesInterfaceTo:'", "'usesInterfaceFrom:'", "'providesDirectly:'", "'behaviourDescription:'", "'EAllocationContext'", "'controls:'", "'specifiesFor:'", "'specifies:'", "'ERequiredRole'", "'roleOf:'", "'linkedTo:'", "'EProvidedRole'", "'linkedFrom:'", "'EAssemblyContext'", "'allocated:'", "'encapsulatedByComponent:'", "'encapsulatedBySystem:'", "'instantiates:'", "'roles:'", "'EProvidedDelegationConnector'", "'linkFrom:'", "'linkTo:'", "'ERequiredDelegationConnector'", "'ESystemIndependentViewPoint'", "'repositoryViewType:'", "'EAssemblyViewPoint'", "'assemblyViewType:'", "'EDeploymentViewPoint'", "'allocationViewType:'", "'environmentViewType:'", "'ERepositoryViewType'", "'showsInterfaces:'", "'showsComponents:'", "'EAssemblyViewType'", "'mainArtifacts:'", "'EAllocationViewType'", "'includes:'", "'EEnvironmentViewType'", "'showsLinks:'", "'showsContainers:'", "'EComponent'", "'EInterface'", "'resultsIn:'", "'providedByComponent:'", "'providedBySystem:'", "'requiredByComponent:'", "'requiredBySystem:'", "'signature:'", "'EBehaviourDescription'", "'internalAction:'", "'loop:'", "'branch:'", "'externalCall:'", "'EInternalAction'", "'ELoop'", "'EBranch'", "'EExternalCall'", "'to:'", "'ESignature'", "'returnType:'", "'correspondsTo:'", "'parameter:'", "'EParameter'", "'type:'", "'Boolean'", "'Char'", "'Date'", "'Double'", "'Float'", "'List'", "'Integer'", "'Long'", "'Map'", "'String'", "'Void'", "'EObject'"
    };
    public static final int T__50=50;
    public static final int T__59=59;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=4;
    public static final int RULE_INT=6;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__67=67;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
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
    public static final int T__91=91;
    public static final int T__92=92;
    public static final int T__93=93;
    public static final int T__94=94;
    public static final int T__90=90;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__77=77;
    public static final int T__78=78;
    public static final int T__79=79;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__74=74;
    public static final int T__75=75;
    public static final int T__76=76;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__88=88;
    public static final int T__89=89;
    public static final int T__84=84;
    public static final int T__85=85;
    public static final int T__86=86;
    public static final int T__87=87;

    // delegates
    // delegators


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyDsl.g"; }



     	private MyDslGrammarAccess grammarAccess;

        public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "ESystem";
       	}

       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleESystem"
    // InternalMyDsl.g:65:1: entryRuleESystem returns [EObject current=null] : iv_ruleESystem= ruleESystem EOF ;
    public final EObject entryRuleESystem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleESystem = null;


        try {
            // InternalMyDsl.g:65:48: (iv_ruleESystem= ruleESystem EOF )
            // InternalMyDsl.g:66:2: iv_ruleESystem= ruleESystem EOF
            {
             newCompositeNode(grammarAccess.getESystemRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleESystem=ruleESystem();

            state._fsp--;

             current =iv_ruleESystem; 
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
    // $ANTLR end "entryRuleESystem"


    // $ANTLR start "ruleESystem"
    // InternalMyDsl.g:72:1: ruleESystem returns [EObject current=null] : (otherlv_0= 'ESystem' otherlv_1= '<<' (otherlv_2= 'provides:' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* ) (otherlv_6= 'requires:' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* )? (otherlv_10= 'encapsulates:' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' ( (otherlv_13= RULE_ID ) ) )* )? otherlv_14= '>>' ) ;
    public final EObject ruleESystem() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;


        	enterRule();

        try {
            // InternalMyDsl.g:78:2: ( (otherlv_0= 'ESystem' otherlv_1= '<<' (otherlv_2= 'provides:' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* ) (otherlv_6= 'requires:' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* )? (otherlv_10= 'encapsulates:' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' ( (otherlv_13= RULE_ID ) ) )* )? otherlv_14= '>>' ) )
            // InternalMyDsl.g:79:2: (otherlv_0= 'ESystem' otherlv_1= '<<' (otherlv_2= 'provides:' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* ) (otherlv_6= 'requires:' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* )? (otherlv_10= 'encapsulates:' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' ( (otherlv_13= RULE_ID ) ) )* )? otherlv_14= '>>' )
            {
            // InternalMyDsl.g:79:2: (otherlv_0= 'ESystem' otherlv_1= '<<' (otherlv_2= 'provides:' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* ) (otherlv_6= 'requires:' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* )? (otherlv_10= 'encapsulates:' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' ( (otherlv_13= RULE_ID ) ) )* )? otherlv_14= '>>' )
            // InternalMyDsl.g:80:3: otherlv_0= 'ESystem' otherlv_1= '<<' (otherlv_2= 'provides:' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* ) (otherlv_6= 'requires:' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* )? (otherlv_10= 'encapsulates:' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' ( (otherlv_13= RULE_ID ) ) )* )? otherlv_14= '>>'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getESystemAccess().getESystemKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getESystemAccess().getLessThanSignLessThanSignKeyword_1());
            		
            // InternalMyDsl.g:88:3: (otherlv_2= 'provides:' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* )
            // InternalMyDsl.g:89:4: otherlv_2= 'provides:' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )*
            {
            otherlv_2=(Token)match(input,13,FOLLOW_5); 

            				newLeafNode(otherlv_2, grammarAccess.getESystemAccess().getProvidesKeyword_2_0());
            			
            // InternalMyDsl.g:93:4: ( (otherlv_3= RULE_ID ) )
            // InternalMyDsl.g:94:5: (otherlv_3= RULE_ID )
            {
            // InternalMyDsl.g:94:5: (otherlv_3= RULE_ID )
            // InternalMyDsl.g:95:6: otherlv_3= RULE_ID
            {

            						if (current==null) {
            							current = createModelElement(grammarAccess.getESystemRule());
            						}
            					
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_6); 

            						newLeafNode(otherlv_3, grammarAccess.getESystemAccess().getProvidesEInterfaceCrossReference_2_1_0());
            					

            }


            }

            // InternalMyDsl.g:106:4: (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:107:5: otherlv_4= ',' ( (otherlv_5= RULE_ID ) )
            	    {
            	    otherlv_4=(Token)match(input,14,FOLLOW_5); 

            	    					newLeafNode(otherlv_4, grammarAccess.getESystemAccess().getCommaKeyword_2_2_0());
            	    				
            	    // InternalMyDsl.g:111:5: ( (otherlv_5= RULE_ID ) )
            	    // InternalMyDsl.g:112:6: (otherlv_5= RULE_ID )
            	    {
            	    // InternalMyDsl.g:112:6: (otherlv_5= RULE_ID )
            	    // InternalMyDsl.g:113:7: otherlv_5= RULE_ID
            	    {

            	    							if (current==null) {
            	    								current = createModelElement(grammarAccess.getESystemRule());
            	    							}
            	    						
            	    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_6); 

            	    							newLeafNode(otherlv_5, grammarAccess.getESystemAccess().getProvidesEInterfaceCrossReference_2_2_1_0());
            	    						

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            // InternalMyDsl.g:126:3: (otherlv_6= 'requires:' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==15) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:127:4: otherlv_6= 'requires:' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )*
                    {
                    otherlv_6=(Token)match(input,15,FOLLOW_5); 

                    				newLeafNode(otherlv_6, grammarAccess.getESystemAccess().getRequiresKeyword_3_0());
                    			
                    // InternalMyDsl.g:131:4: ( (otherlv_7= RULE_ID ) )
                    // InternalMyDsl.g:132:5: (otherlv_7= RULE_ID )
                    {
                    // InternalMyDsl.g:132:5: (otherlv_7= RULE_ID )
                    // InternalMyDsl.g:133:6: otherlv_7= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getESystemRule());
                    						}
                    					
                    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_7); 

                    						newLeafNode(otherlv_7, grammarAccess.getESystemAccess().getRequiresEInterfaceCrossReference_3_1_0());
                    					

                    }


                    }

                    // InternalMyDsl.g:144:4: (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==14) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // InternalMyDsl.g:145:5: otherlv_8= ',' ( (otherlv_9= RULE_ID ) )
                    	    {
                    	    otherlv_8=(Token)match(input,14,FOLLOW_5); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getESystemAccess().getCommaKeyword_3_2_0());
                    	    				
                    	    // InternalMyDsl.g:149:5: ( (otherlv_9= RULE_ID ) )
                    	    // InternalMyDsl.g:150:6: (otherlv_9= RULE_ID )
                    	    {
                    	    // InternalMyDsl.g:150:6: (otherlv_9= RULE_ID )
                    	    // InternalMyDsl.g:151:7: otherlv_9= RULE_ID
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getESystemRule());
                    	    							}
                    	    						
                    	    otherlv_9=(Token)match(input,RULE_ID,FOLLOW_7); 

                    	    							newLeafNode(otherlv_9, grammarAccess.getESystemAccess().getRequiresEInterfaceCrossReference_3_2_1_0());
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalMyDsl.g:164:3: (otherlv_10= 'encapsulates:' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' ( (otherlv_13= RULE_ID ) ) )* )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==16) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:165:4: otherlv_10= 'encapsulates:' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' ( (otherlv_13= RULE_ID ) ) )*
                    {
                    otherlv_10=(Token)match(input,16,FOLLOW_5); 

                    				newLeafNode(otherlv_10, grammarAccess.getESystemAccess().getEncapsulatesKeyword_4_0());
                    			
                    // InternalMyDsl.g:169:4: ( (otherlv_11= RULE_ID ) )
                    // InternalMyDsl.g:170:5: (otherlv_11= RULE_ID )
                    {
                    // InternalMyDsl.g:170:5: (otherlv_11= RULE_ID )
                    // InternalMyDsl.g:171:6: otherlv_11= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getESystemRule());
                    						}
                    					
                    otherlv_11=(Token)match(input,RULE_ID,FOLLOW_8); 

                    						newLeafNode(otherlv_11, grammarAccess.getESystemAccess().getEncapsulatesEAssemblyContextCrossReference_4_1_0());
                    					

                    }


                    }

                    // InternalMyDsl.g:182:4: (otherlv_12= ',' ( (otherlv_13= RULE_ID ) ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==14) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalMyDsl.g:183:5: otherlv_12= ',' ( (otherlv_13= RULE_ID ) )
                    	    {
                    	    otherlv_12=(Token)match(input,14,FOLLOW_5); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getESystemAccess().getCommaKeyword_4_2_0());
                    	    				
                    	    // InternalMyDsl.g:187:5: ( (otherlv_13= RULE_ID ) )
                    	    // InternalMyDsl.g:188:6: (otherlv_13= RULE_ID )
                    	    {
                    	    // InternalMyDsl.g:188:6: (otherlv_13= RULE_ID )
                    	    // InternalMyDsl.g:189:7: otherlv_13= RULE_ID
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getESystemRule());
                    	    							}
                    	    						
                    	    otherlv_13=(Token)match(input,RULE_ID,FOLLOW_8); 

                    	    							newLeafNode(otherlv_13, grammarAccess.getESystemAccess().getEncapsulatesEAssemblyContextCrossReference_4_2_1_0());
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_14=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_14, grammarAccess.getESystemAccess().getGreaterThanSignGreaterThanSignKeyword_5());
            		

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
    // $ANTLR end "ruleESystem"


    // $ANTLR start "entryRuleEString"
    // InternalMyDsl.g:210:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalMyDsl.g:210:47: (iv_ruleEString= ruleEString EOF )
            // InternalMyDsl.g:211:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalMyDsl.g:217:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:223:2: (this_STRING_0= RULE_STRING )
            // InternalMyDsl.g:224:2: this_STRING_0= RULE_STRING
            {
            this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            		current.merge(this_STRING_0);
            	

            		newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall());
            	

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
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleECompositeComponent"
    // InternalMyDsl.g:234:1: entryRuleECompositeComponent returns [EObject current=null] : iv_ruleECompositeComponent= ruleECompositeComponent EOF ;
    public final EObject entryRuleECompositeComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleECompositeComponent = null;


        try {
            // InternalMyDsl.g:234:60: (iv_ruleECompositeComponent= ruleECompositeComponent EOF )
            // InternalMyDsl.g:235:2: iv_ruleECompositeComponent= ruleECompositeComponent EOF
            {
             newCompositeNode(grammarAccess.getECompositeComponentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleECompositeComponent=ruleECompositeComponent();

            state._fsp--;

             current =iv_ruleECompositeComponent; 
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
    // $ANTLR end "entryRuleECompositeComponent"


    // $ANTLR start "ruleECompositeComponent"
    // InternalMyDsl.g:241:1: ruleECompositeComponent returns [EObject current=null] : (otherlv_0= 'ECompositeComponent' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '<<' (otherlv_3= 'providesInterfaceTo:' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* )? (otherlv_7= 'usesInterfaceFrom:' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* )? (otherlv_11= 'providesDirectly:' ( (otherlv_12= RULE_ID ) ) (otherlv_13= ',' ( (otherlv_14= RULE_ID ) ) )* )? (otherlv_15= 'provides:' ( (otherlv_16= RULE_ID ) ) (otherlv_17= ',' ( (otherlv_18= RULE_ID ) ) )* )? (otherlv_19= 'requires:' ( (otherlv_20= RULE_ID ) ) (otherlv_21= ',' ( (otherlv_22= RULE_ID ) ) )* )? (otherlv_23= 'encapsulates:' ( (otherlv_24= RULE_ID ) ) (otherlv_25= ',' ( (otherlv_26= RULE_ID ) ) )* )? (otherlv_27= 'behaviourDescription:' ( (lv_behaviourDescription_28_0= ruleEBehaviourDescription ) ) )? otherlv_29= '>>' ) ;
    public final EObject ruleECompositeComponent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        Token otherlv_29=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_behaviourDescription_28_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:247:2: ( (otherlv_0= 'ECompositeComponent' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '<<' (otherlv_3= 'providesInterfaceTo:' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* )? (otherlv_7= 'usesInterfaceFrom:' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* )? (otherlv_11= 'providesDirectly:' ( (otherlv_12= RULE_ID ) ) (otherlv_13= ',' ( (otherlv_14= RULE_ID ) ) )* )? (otherlv_15= 'provides:' ( (otherlv_16= RULE_ID ) ) (otherlv_17= ',' ( (otherlv_18= RULE_ID ) ) )* )? (otherlv_19= 'requires:' ( (otherlv_20= RULE_ID ) ) (otherlv_21= ',' ( (otherlv_22= RULE_ID ) ) )* )? (otherlv_23= 'encapsulates:' ( (otherlv_24= RULE_ID ) ) (otherlv_25= ',' ( (otherlv_26= RULE_ID ) ) )* )? (otherlv_27= 'behaviourDescription:' ( (lv_behaviourDescription_28_0= ruleEBehaviourDescription ) ) )? otherlv_29= '>>' ) )
            // InternalMyDsl.g:248:2: (otherlv_0= 'ECompositeComponent' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '<<' (otherlv_3= 'providesInterfaceTo:' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* )? (otherlv_7= 'usesInterfaceFrom:' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* )? (otherlv_11= 'providesDirectly:' ( (otherlv_12= RULE_ID ) ) (otherlv_13= ',' ( (otherlv_14= RULE_ID ) ) )* )? (otherlv_15= 'provides:' ( (otherlv_16= RULE_ID ) ) (otherlv_17= ',' ( (otherlv_18= RULE_ID ) ) )* )? (otherlv_19= 'requires:' ( (otherlv_20= RULE_ID ) ) (otherlv_21= ',' ( (otherlv_22= RULE_ID ) ) )* )? (otherlv_23= 'encapsulates:' ( (otherlv_24= RULE_ID ) ) (otherlv_25= ',' ( (otherlv_26= RULE_ID ) ) )* )? (otherlv_27= 'behaviourDescription:' ( (lv_behaviourDescription_28_0= ruleEBehaviourDescription ) ) )? otherlv_29= '>>' )
            {
            // InternalMyDsl.g:248:2: (otherlv_0= 'ECompositeComponent' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '<<' (otherlv_3= 'providesInterfaceTo:' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* )? (otherlv_7= 'usesInterfaceFrom:' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* )? (otherlv_11= 'providesDirectly:' ( (otherlv_12= RULE_ID ) ) (otherlv_13= ',' ( (otherlv_14= RULE_ID ) ) )* )? (otherlv_15= 'provides:' ( (otherlv_16= RULE_ID ) ) (otherlv_17= ',' ( (otherlv_18= RULE_ID ) ) )* )? (otherlv_19= 'requires:' ( (otherlv_20= RULE_ID ) ) (otherlv_21= ',' ( (otherlv_22= RULE_ID ) ) )* )? (otherlv_23= 'encapsulates:' ( (otherlv_24= RULE_ID ) ) (otherlv_25= ',' ( (otherlv_26= RULE_ID ) ) )* )? (otherlv_27= 'behaviourDescription:' ( (lv_behaviourDescription_28_0= ruleEBehaviourDescription ) ) )? otherlv_29= '>>' )
            // InternalMyDsl.g:249:3: otherlv_0= 'ECompositeComponent' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '<<' (otherlv_3= 'providesInterfaceTo:' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* )? (otherlv_7= 'usesInterfaceFrom:' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* )? (otherlv_11= 'providesDirectly:' ( (otherlv_12= RULE_ID ) ) (otherlv_13= ',' ( (otherlv_14= RULE_ID ) ) )* )? (otherlv_15= 'provides:' ( (otherlv_16= RULE_ID ) ) (otherlv_17= ',' ( (otherlv_18= RULE_ID ) ) )* )? (otherlv_19= 'requires:' ( (otherlv_20= RULE_ID ) ) (otherlv_21= ',' ( (otherlv_22= RULE_ID ) ) )* )? (otherlv_23= 'encapsulates:' ( (otherlv_24= RULE_ID ) ) (otherlv_25= ',' ( (otherlv_26= RULE_ID ) ) )* )? (otherlv_27= 'behaviourDescription:' ( (lv_behaviourDescription_28_0= ruleEBehaviourDescription ) ) )? otherlv_29= '>>'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getECompositeComponentAccess().getECompositeComponentKeyword_0());
            		
            // InternalMyDsl.g:253:3: ( (lv_name_1_0= ruleEString ) )
            // InternalMyDsl.g:254:4: (lv_name_1_0= ruleEString )
            {
            // InternalMyDsl.g:254:4: (lv_name_1_0= ruleEString )
            // InternalMyDsl.g:255:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getECompositeComponentAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getECompositeComponentRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getECompositeComponentAccess().getLessThanSignLessThanSignKeyword_2());
            		
            // InternalMyDsl.g:276:3: (otherlv_3= 'providesInterfaceTo:' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==19) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalMyDsl.g:277:4: otherlv_3= 'providesInterfaceTo:' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )*
                    {
                    otherlv_3=(Token)match(input,19,FOLLOW_5); 

                    				newLeafNode(otherlv_3, grammarAccess.getECompositeComponentAccess().getProvidesInterfaceToKeyword_3_0());
                    			
                    // InternalMyDsl.g:281:4: ( (otherlv_4= RULE_ID ) )
                    // InternalMyDsl.g:282:5: (otherlv_4= RULE_ID )
                    {
                    // InternalMyDsl.g:282:5: (otherlv_4= RULE_ID )
                    // InternalMyDsl.g:283:6: otherlv_4= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getECompositeComponentRule());
                    						}
                    					
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_11); 

                    						newLeafNode(otherlv_4, grammarAccess.getECompositeComponentAccess().getProvidesInterfaceToEComponentCrossReference_3_1_0());
                    					

                    }


                    }

                    // InternalMyDsl.g:294:4: (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==14) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalMyDsl.g:295:5: otherlv_5= ',' ( (otherlv_6= RULE_ID ) )
                    	    {
                    	    otherlv_5=(Token)match(input,14,FOLLOW_5); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getECompositeComponentAccess().getCommaKeyword_3_2_0());
                    	    				
                    	    // InternalMyDsl.g:299:5: ( (otherlv_6= RULE_ID ) )
                    	    // InternalMyDsl.g:300:6: (otherlv_6= RULE_ID )
                    	    {
                    	    // InternalMyDsl.g:300:6: (otherlv_6= RULE_ID )
                    	    // InternalMyDsl.g:301:7: otherlv_6= RULE_ID
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getECompositeComponentRule());
                    	    							}
                    	    						
                    	    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_11); 

                    	    							newLeafNode(otherlv_6, grammarAccess.getECompositeComponentAccess().getProvidesInterfaceToEComponentCrossReference_3_2_1_0());
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalMyDsl.g:314:3: (otherlv_7= 'usesInterfaceFrom:' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==20) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalMyDsl.g:315:4: otherlv_7= 'usesInterfaceFrom:' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )*
                    {
                    otherlv_7=(Token)match(input,20,FOLLOW_5); 

                    				newLeafNode(otherlv_7, grammarAccess.getECompositeComponentAccess().getUsesInterfaceFromKeyword_4_0());
                    			
                    // InternalMyDsl.g:319:4: ( (otherlv_8= RULE_ID ) )
                    // InternalMyDsl.g:320:5: (otherlv_8= RULE_ID )
                    {
                    // InternalMyDsl.g:320:5: (otherlv_8= RULE_ID )
                    // InternalMyDsl.g:321:6: otherlv_8= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getECompositeComponentRule());
                    						}
                    					
                    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_12); 

                    						newLeafNode(otherlv_8, grammarAccess.getECompositeComponentAccess().getUsesInterfaceFromEComponentCrossReference_4_1_0());
                    					

                    }


                    }

                    // InternalMyDsl.g:332:4: (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==14) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalMyDsl.g:333:5: otherlv_9= ',' ( (otherlv_10= RULE_ID ) )
                    	    {
                    	    otherlv_9=(Token)match(input,14,FOLLOW_5); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getECompositeComponentAccess().getCommaKeyword_4_2_0());
                    	    				
                    	    // InternalMyDsl.g:337:5: ( (otherlv_10= RULE_ID ) )
                    	    // InternalMyDsl.g:338:6: (otherlv_10= RULE_ID )
                    	    {
                    	    // InternalMyDsl.g:338:6: (otherlv_10= RULE_ID )
                    	    // InternalMyDsl.g:339:7: otherlv_10= RULE_ID
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getECompositeComponentRule());
                    	    							}
                    	    						
                    	    otherlv_10=(Token)match(input,RULE_ID,FOLLOW_12); 

                    	    							newLeafNode(otherlv_10, grammarAccess.getECompositeComponentAccess().getUsesInterfaceFromEComponentCrossReference_4_2_1_0());
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalMyDsl.g:352:3: (otherlv_11= 'providesDirectly:' ( (otherlv_12= RULE_ID ) ) (otherlv_13= ',' ( (otherlv_14= RULE_ID ) ) )* )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==21) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalMyDsl.g:353:4: otherlv_11= 'providesDirectly:' ( (otherlv_12= RULE_ID ) ) (otherlv_13= ',' ( (otherlv_14= RULE_ID ) ) )*
                    {
                    otherlv_11=(Token)match(input,21,FOLLOW_5); 

                    				newLeafNode(otherlv_11, grammarAccess.getECompositeComponentAccess().getProvidesDirectlyKeyword_5_0());
                    			
                    // InternalMyDsl.g:357:4: ( (otherlv_12= RULE_ID ) )
                    // InternalMyDsl.g:358:5: (otherlv_12= RULE_ID )
                    {
                    // InternalMyDsl.g:358:5: (otherlv_12= RULE_ID )
                    // InternalMyDsl.g:359:6: otherlv_12= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getECompositeComponentRule());
                    						}
                    					
                    otherlv_12=(Token)match(input,RULE_ID,FOLLOW_13); 

                    						newLeafNode(otherlv_12, grammarAccess.getECompositeComponentAccess().getProvidesDirectlyEServiceCrossReference_5_1_0());
                    					

                    }


                    }

                    // InternalMyDsl.g:370:4: (otherlv_13= ',' ( (otherlv_14= RULE_ID ) ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==14) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalMyDsl.g:371:5: otherlv_13= ',' ( (otherlv_14= RULE_ID ) )
                    	    {
                    	    otherlv_13=(Token)match(input,14,FOLLOW_5); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getECompositeComponentAccess().getCommaKeyword_5_2_0());
                    	    				
                    	    // InternalMyDsl.g:375:5: ( (otherlv_14= RULE_ID ) )
                    	    // InternalMyDsl.g:376:6: (otherlv_14= RULE_ID )
                    	    {
                    	    // InternalMyDsl.g:376:6: (otherlv_14= RULE_ID )
                    	    // InternalMyDsl.g:377:7: otherlv_14= RULE_ID
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getECompositeComponentRule());
                    	    							}
                    	    						
                    	    otherlv_14=(Token)match(input,RULE_ID,FOLLOW_13); 

                    	    							newLeafNode(otherlv_14, grammarAccess.getECompositeComponentAccess().getProvidesDirectlyEServiceCrossReference_5_2_1_0());
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalMyDsl.g:390:3: (otherlv_15= 'provides:' ( (otherlv_16= RULE_ID ) ) (otherlv_17= ',' ( (otherlv_18= RULE_ID ) ) )* )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==13) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalMyDsl.g:391:4: otherlv_15= 'provides:' ( (otherlv_16= RULE_ID ) ) (otherlv_17= ',' ( (otherlv_18= RULE_ID ) ) )*
                    {
                    otherlv_15=(Token)match(input,13,FOLLOW_5); 

                    				newLeafNode(otherlv_15, grammarAccess.getECompositeComponentAccess().getProvidesKeyword_6_0());
                    			
                    // InternalMyDsl.g:395:4: ( (otherlv_16= RULE_ID ) )
                    // InternalMyDsl.g:396:5: (otherlv_16= RULE_ID )
                    {
                    // InternalMyDsl.g:396:5: (otherlv_16= RULE_ID )
                    // InternalMyDsl.g:397:6: otherlv_16= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getECompositeComponentRule());
                    						}
                    					
                    otherlv_16=(Token)match(input,RULE_ID,FOLLOW_14); 

                    						newLeafNode(otherlv_16, grammarAccess.getECompositeComponentAccess().getProvidesEInterfaceCrossReference_6_1_0());
                    					

                    }


                    }

                    // InternalMyDsl.g:408:4: (otherlv_17= ',' ( (otherlv_18= RULE_ID ) ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==14) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // InternalMyDsl.g:409:5: otherlv_17= ',' ( (otherlv_18= RULE_ID ) )
                    	    {
                    	    otherlv_17=(Token)match(input,14,FOLLOW_5); 

                    	    					newLeafNode(otherlv_17, grammarAccess.getECompositeComponentAccess().getCommaKeyword_6_2_0());
                    	    				
                    	    // InternalMyDsl.g:413:5: ( (otherlv_18= RULE_ID ) )
                    	    // InternalMyDsl.g:414:6: (otherlv_18= RULE_ID )
                    	    {
                    	    // InternalMyDsl.g:414:6: (otherlv_18= RULE_ID )
                    	    // InternalMyDsl.g:415:7: otherlv_18= RULE_ID
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getECompositeComponentRule());
                    	    							}
                    	    						
                    	    otherlv_18=(Token)match(input,RULE_ID,FOLLOW_14); 

                    	    							newLeafNode(otherlv_18, grammarAccess.getECompositeComponentAccess().getProvidesEInterfaceCrossReference_6_2_1_0());
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalMyDsl.g:428:3: (otherlv_19= 'requires:' ( (otherlv_20= RULE_ID ) ) (otherlv_21= ',' ( (otherlv_22= RULE_ID ) ) )* )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==15) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalMyDsl.g:429:4: otherlv_19= 'requires:' ( (otherlv_20= RULE_ID ) ) (otherlv_21= ',' ( (otherlv_22= RULE_ID ) ) )*
                    {
                    otherlv_19=(Token)match(input,15,FOLLOW_5); 

                    				newLeafNode(otherlv_19, grammarAccess.getECompositeComponentAccess().getRequiresKeyword_7_0());
                    			
                    // InternalMyDsl.g:433:4: ( (otherlv_20= RULE_ID ) )
                    // InternalMyDsl.g:434:5: (otherlv_20= RULE_ID )
                    {
                    // InternalMyDsl.g:434:5: (otherlv_20= RULE_ID )
                    // InternalMyDsl.g:435:6: otherlv_20= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getECompositeComponentRule());
                    						}
                    					
                    otherlv_20=(Token)match(input,RULE_ID,FOLLOW_15); 

                    						newLeafNode(otherlv_20, grammarAccess.getECompositeComponentAccess().getRequiresEInterfaceCrossReference_7_1_0());
                    					

                    }


                    }

                    // InternalMyDsl.g:446:4: (otherlv_21= ',' ( (otherlv_22= RULE_ID ) ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==14) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // InternalMyDsl.g:447:5: otherlv_21= ',' ( (otherlv_22= RULE_ID ) )
                    	    {
                    	    otherlv_21=(Token)match(input,14,FOLLOW_5); 

                    	    					newLeafNode(otherlv_21, grammarAccess.getECompositeComponentAccess().getCommaKeyword_7_2_0());
                    	    				
                    	    // InternalMyDsl.g:451:5: ( (otherlv_22= RULE_ID ) )
                    	    // InternalMyDsl.g:452:6: (otherlv_22= RULE_ID )
                    	    {
                    	    // InternalMyDsl.g:452:6: (otherlv_22= RULE_ID )
                    	    // InternalMyDsl.g:453:7: otherlv_22= RULE_ID
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getECompositeComponentRule());
                    	    							}
                    	    						
                    	    otherlv_22=(Token)match(input,RULE_ID,FOLLOW_15); 

                    	    							newLeafNode(otherlv_22, grammarAccess.getECompositeComponentAccess().getRequiresEInterfaceCrossReference_7_2_1_0());
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalMyDsl.g:466:3: (otherlv_23= 'encapsulates:' ( (otherlv_24= RULE_ID ) ) (otherlv_25= ',' ( (otherlv_26= RULE_ID ) ) )* )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==16) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalMyDsl.g:467:4: otherlv_23= 'encapsulates:' ( (otherlv_24= RULE_ID ) ) (otherlv_25= ',' ( (otherlv_26= RULE_ID ) ) )*
                    {
                    otherlv_23=(Token)match(input,16,FOLLOW_5); 

                    				newLeafNode(otherlv_23, grammarAccess.getECompositeComponentAccess().getEncapsulatesKeyword_8_0());
                    			
                    // InternalMyDsl.g:471:4: ( (otherlv_24= RULE_ID ) )
                    // InternalMyDsl.g:472:5: (otherlv_24= RULE_ID )
                    {
                    // InternalMyDsl.g:472:5: (otherlv_24= RULE_ID )
                    // InternalMyDsl.g:473:6: otherlv_24= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getECompositeComponentRule());
                    						}
                    					
                    otherlv_24=(Token)match(input,RULE_ID,FOLLOW_16); 

                    						newLeafNode(otherlv_24, grammarAccess.getECompositeComponentAccess().getEncapsulatesEAssemblyContextCrossReference_8_1_0());
                    					

                    }


                    }

                    // InternalMyDsl.g:484:4: (otherlv_25= ',' ( (otherlv_26= RULE_ID ) ) )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==14) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // InternalMyDsl.g:485:5: otherlv_25= ',' ( (otherlv_26= RULE_ID ) )
                    	    {
                    	    otherlv_25=(Token)match(input,14,FOLLOW_5); 

                    	    					newLeafNode(otherlv_25, grammarAccess.getECompositeComponentAccess().getCommaKeyword_8_2_0());
                    	    				
                    	    // InternalMyDsl.g:489:5: ( (otherlv_26= RULE_ID ) )
                    	    // InternalMyDsl.g:490:6: (otherlv_26= RULE_ID )
                    	    {
                    	    // InternalMyDsl.g:490:6: (otherlv_26= RULE_ID )
                    	    // InternalMyDsl.g:491:7: otherlv_26= RULE_ID
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getECompositeComponentRule());
                    	    							}
                    	    						
                    	    otherlv_26=(Token)match(input,RULE_ID,FOLLOW_16); 

                    	    							newLeafNode(otherlv_26, grammarAccess.getECompositeComponentAccess().getEncapsulatesEAssemblyContextCrossReference_8_2_1_0());
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalMyDsl.g:504:3: (otherlv_27= 'behaviourDescription:' ( (lv_behaviourDescription_28_0= ruleEBehaviourDescription ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==22) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalMyDsl.g:505:4: otherlv_27= 'behaviourDescription:' ( (lv_behaviourDescription_28_0= ruleEBehaviourDescription ) )
                    {
                    otherlv_27=(Token)match(input,22,FOLLOW_17); 

                    				newLeafNode(otherlv_27, grammarAccess.getECompositeComponentAccess().getBehaviourDescriptionKeyword_9_0());
                    			
                    // InternalMyDsl.g:509:4: ( (lv_behaviourDescription_28_0= ruleEBehaviourDescription ) )
                    // InternalMyDsl.g:510:5: (lv_behaviourDescription_28_0= ruleEBehaviourDescription )
                    {
                    // InternalMyDsl.g:510:5: (lv_behaviourDescription_28_0= ruleEBehaviourDescription )
                    // InternalMyDsl.g:511:6: lv_behaviourDescription_28_0= ruleEBehaviourDescription
                    {

                    						newCompositeNode(grammarAccess.getECompositeComponentAccess().getBehaviourDescriptionEBehaviourDescriptionParserRuleCall_9_1_0());
                    					
                    pushFollow(FOLLOW_18);
                    lv_behaviourDescription_28_0=ruleEBehaviourDescription();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getECompositeComponentRule());
                    						}
                    						set(
                    							current,
                    							"behaviourDescription",
                    							lv_behaviourDescription_28_0,
                    							"org.xtext.example.mydsl.MyDsl.EBehaviourDescription");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_29=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_29, grammarAccess.getECompositeComponentAccess().getGreaterThanSignGreaterThanSignKeyword_10());
            		

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
    // $ANTLR end "ruleECompositeComponent"


    // $ANTLR start "entryRuleEAllocationContext"
    // InternalMyDsl.g:537:1: entryRuleEAllocationContext returns [EObject current=null] : iv_ruleEAllocationContext= ruleEAllocationContext EOF ;
    public final EObject entryRuleEAllocationContext() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEAllocationContext = null;


        try {
            // InternalMyDsl.g:537:59: (iv_ruleEAllocationContext= ruleEAllocationContext EOF )
            // InternalMyDsl.g:538:2: iv_ruleEAllocationContext= ruleEAllocationContext EOF
            {
             newCompositeNode(grammarAccess.getEAllocationContextRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEAllocationContext=ruleEAllocationContext();

            state._fsp--;

             current =iv_ruleEAllocationContext; 
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
    // $ANTLR end "entryRuleEAllocationContext"


    // $ANTLR start "ruleEAllocationContext"
    // InternalMyDsl.g:544:1: ruleEAllocationContext returns [EObject current=null] : (otherlv_0= 'EAllocationContext' otherlv_1= '<<' (otherlv_2= 'controls:' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* )? (otherlv_6= 'specifiesFor:' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* ) (otherlv_10= 'specifies:' ( (otherlv_11= RULE_ID ) ) ) otherlv_12= '>>' ) ;
    public final EObject ruleEAllocationContext() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;


        	enterRule();

        try {
            // InternalMyDsl.g:550:2: ( (otherlv_0= 'EAllocationContext' otherlv_1= '<<' (otherlv_2= 'controls:' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* )? (otherlv_6= 'specifiesFor:' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* ) (otherlv_10= 'specifies:' ( (otherlv_11= RULE_ID ) ) ) otherlv_12= '>>' ) )
            // InternalMyDsl.g:551:2: (otherlv_0= 'EAllocationContext' otherlv_1= '<<' (otherlv_2= 'controls:' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* )? (otherlv_6= 'specifiesFor:' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* ) (otherlv_10= 'specifies:' ( (otherlv_11= RULE_ID ) ) ) otherlv_12= '>>' )
            {
            // InternalMyDsl.g:551:2: (otherlv_0= 'EAllocationContext' otherlv_1= '<<' (otherlv_2= 'controls:' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* )? (otherlv_6= 'specifiesFor:' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* ) (otherlv_10= 'specifies:' ( (otherlv_11= RULE_ID ) ) ) otherlv_12= '>>' )
            // InternalMyDsl.g:552:3: otherlv_0= 'EAllocationContext' otherlv_1= '<<' (otherlv_2= 'controls:' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* )? (otherlv_6= 'specifiesFor:' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* ) (otherlv_10= 'specifies:' ( (otherlv_11= RULE_ID ) ) ) otherlv_12= '>>'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getEAllocationContextAccess().getEAllocationContextKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_19); 

            			newLeafNode(otherlv_1, grammarAccess.getEAllocationContextAccess().getLessThanSignLessThanSignKeyword_1());
            		
            // InternalMyDsl.g:560:3: (otherlv_2= 'controls:' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==24) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalMyDsl.g:561:4: otherlv_2= 'controls:' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )*
                    {
                    otherlv_2=(Token)match(input,24,FOLLOW_5); 

                    				newLeafNode(otherlv_2, grammarAccess.getEAllocationContextAccess().getControlsKeyword_2_0());
                    			
                    // InternalMyDsl.g:565:4: ( (otherlv_3= RULE_ID ) )
                    // InternalMyDsl.g:566:5: (otherlv_3= RULE_ID )
                    {
                    // InternalMyDsl.g:566:5: (otherlv_3= RULE_ID )
                    // InternalMyDsl.g:567:6: otherlv_3= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEAllocationContextRule());
                    						}
                    					
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_20); 

                    						newLeafNode(otherlv_3, grammarAccess.getEAllocationContextAccess().getControlsEContainerCrossReference_2_1_0());
                    					

                    }


                    }

                    // InternalMyDsl.g:578:4: (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==14) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // InternalMyDsl.g:579:5: otherlv_4= ',' ( (otherlv_5= RULE_ID ) )
                    	    {
                    	    otherlv_4=(Token)match(input,14,FOLLOW_5); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getEAllocationContextAccess().getCommaKeyword_2_2_0());
                    	    				
                    	    // InternalMyDsl.g:583:5: ( (otherlv_5= RULE_ID ) )
                    	    // InternalMyDsl.g:584:6: (otherlv_5= RULE_ID )
                    	    {
                    	    // InternalMyDsl.g:584:6: (otherlv_5= RULE_ID )
                    	    // InternalMyDsl.g:585:7: otherlv_5= RULE_ID
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getEAllocationContextRule());
                    	    							}
                    	    						
                    	    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_20); 

                    	    							newLeafNode(otherlv_5, grammarAccess.getEAllocationContextAccess().getControlsEContainerCrossReference_2_2_1_0());
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop19;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalMyDsl.g:598:3: (otherlv_6= 'specifiesFor:' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* )
            // InternalMyDsl.g:599:4: otherlv_6= 'specifiesFor:' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )*
            {
            otherlv_6=(Token)match(input,25,FOLLOW_5); 

            				newLeafNode(otherlv_6, grammarAccess.getEAllocationContextAccess().getSpecifiesForKeyword_3_0());
            			
            // InternalMyDsl.g:603:4: ( (otherlv_7= RULE_ID ) )
            // InternalMyDsl.g:604:5: (otherlv_7= RULE_ID )
            {
            // InternalMyDsl.g:604:5: (otherlv_7= RULE_ID )
            // InternalMyDsl.g:605:6: otherlv_7= RULE_ID
            {

            						if (current==null) {
            							current = createModelElement(grammarAccess.getEAllocationContextRule());
            						}
            					
            otherlv_7=(Token)match(input,RULE_ID,FOLLOW_21); 

            						newLeafNode(otherlv_7, grammarAccess.getEAllocationContextAccess().getSpecifiesForESystemCrossReference_3_1_0());
            					

            }


            }

            // InternalMyDsl.g:616:4: (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==14) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalMyDsl.g:617:5: otherlv_8= ',' ( (otherlv_9= RULE_ID ) )
            	    {
            	    otherlv_8=(Token)match(input,14,FOLLOW_5); 

            	    					newLeafNode(otherlv_8, grammarAccess.getEAllocationContextAccess().getCommaKeyword_3_2_0());
            	    				
            	    // InternalMyDsl.g:621:5: ( (otherlv_9= RULE_ID ) )
            	    // InternalMyDsl.g:622:6: (otherlv_9= RULE_ID )
            	    {
            	    // InternalMyDsl.g:622:6: (otherlv_9= RULE_ID )
            	    // InternalMyDsl.g:623:7: otherlv_9= RULE_ID
            	    {

            	    							if (current==null) {
            	    								current = createModelElement(grammarAccess.getEAllocationContextRule());
            	    							}
            	    						
            	    otherlv_9=(Token)match(input,RULE_ID,FOLLOW_21); 

            	    							newLeafNode(otherlv_9, grammarAccess.getEAllocationContextAccess().getSpecifiesForESystemCrossReference_3_2_1_0());
            	    						

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);


            }

            // InternalMyDsl.g:636:3: (otherlv_10= 'specifies:' ( (otherlv_11= RULE_ID ) ) )
            // InternalMyDsl.g:637:4: otherlv_10= 'specifies:' ( (otherlv_11= RULE_ID ) )
            {
            otherlv_10=(Token)match(input,26,FOLLOW_5); 

            				newLeafNode(otherlv_10, grammarAccess.getEAllocationContextAccess().getSpecifiesKeyword_4_0());
            			
            // InternalMyDsl.g:641:4: ( (otherlv_11= RULE_ID ) )
            // InternalMyDsl.g:642:5: (otherlv_11= RULE_ID )
            {
            // InternalMyDsl.g:642:5: (otherlv_11= RULE_ID )
            // InternalMyDsl.g:643:6: otherlv_11= RULE_ID
            {

            						if (current==null) {
            							current = createModelElement(grammarAccess.getEAllocationContextRule());
            						}
            					
            otherlv_11=(Token)match(input,RULE_ID,FOLLOW_18); 

            						newLeafNode(otherlv_11, grammarAccess.getEAllocationContextAccess().getSpecifiesEAssemblyContextCrossReference_4_1_0());
            					

            }


            }


            }

            otherlv_12=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getEAllocationContextAccess().getGreaterThanSignGreaterThanSignKeyword_5());
            		

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
    // $ANTLR end "ruleEAllocationContext"


    // $ANTLR start "entryRuleERole"
    // InternalMyDsl.g:663:1: entryRuleERole returns [EObject current=null] : iv_ruleERole= ruleERole EOF ;
    public final EObject entryRuleERole() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleERole = null;


        try {
            // InternalMyDsl.g:663:46: (iv_ruleERole= ruleERole EOF )
            // InternalMyDsl.g:664:2: iv_ruleERole= ruleERole EOF
            {
             newCompositeNode(grammarAccess.getERoleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleERole=ruleERole();

            state._fsp--;

             current =iv_ruleERole; 
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
    // $ANTLR end "entryRuleERole"


    // $ANTLR start "ruleERole"
    // InternalMyDsl.g:670:1: ruleERole returns [EObject current=null] : (this_ERequiredRole_0= ruleERequiredRole | this_EProvidedRole_1= ruleEProvidedRole ) ;
    public final EObject ruleERole() throws RecognitionException {
        EObject current = null;

        EObject this_ERequiredRole_0 = null;

        EObject this_EProvidedRole_1 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:676:2: ( (this_ERequiredRole_0= ruleERequiredRole | this_EProvidedRole_1= ruleEProvidedRole ) )
            // InternalMyDsl.g:677:2: (this_ERequiredRole_0= ruleERequiredRole | this_EProvidedRole_1= ruleEProvidedRole )
            {
            // InternalMyDsl.g:677:2: (this_ERequiredRole_0= ruleERequiredRole | this_EProvidedRole_1= ruleEProvidedRole )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==27) ) {
                alt22=1;
            }
            else if ( (LA22_0==30) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // InternalMyDsl.g:678:3: this_ERequiredRole_0= ruleERequiredRole
                    {

                    			newCompositeNode(grammarAccess.getERoleAccess().getERequiredRoleParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ERequiredRole_0=ruleERequiredRole();

                    state._fsp--;


                    			current = this_ERequiredRole_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:687:3: this_EProvidedRole_1= ruleEProvidedRole
                    {

                    			newCompositeNode(grammarAccess.getERoleAccess().getEProvidedRoleParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_EProvidedRole_1=ruleEProvidedRole();

                    state._fsp--;


                    			current = this_EProvidedRole_1;
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
    // $ANTLR end "ruleERole"


    // $ANTLR start "entryRuleERequiredRole"
    // InternalMyDsl.g:699:1: entryRuleERequiredRole returns [EObject current=null] : iv_ruleERequiredRole= ruleERequiredRole EOF ;
    public final EObject entryRuleERequiredRole() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleERequiredRole = null;


        try {
            // InternalMyDsl.g:699:54: (iv_ruleERequiredRole= ruleERequiredRole EOF )
            // InternalMyDsl.g:700:2: iv_ruleERequiredRole= ruleERequiredRole EOF
            {
             newCompositeNode(grammarAccess.getERequiredRoleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleERequiredRole=ruleERequiredRole();

            state._fsp--;

             current =iv_ruleERequiredRole; 
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
    // $ANTLR end "entryRuleERequiredRole"


    // $ANTLR start "ruleERequiredRole"
    // InternalMyDsl.g:706:1: ruleERequiredRole returns [EObject current=null] : (otherlv_0= 'ERequiredRole' otherlv_1= '<<' (otherlv_2= 'roleOf:' ( (otherlv_3= RULE_ID ) ) )? (otherlv_4= 'linkedTo:' ( (otherlv_5= RULE_ID ) ) )? otherlv_6= '>>' ) ;
    public final EObject ruleERequiredRole() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalMyDsl.g:712:2: ( (otherlv_0= 'ERequiredRole' otherlv_1= '<<' (otherlv_2= 'roleOf:' ( (otherlv_3= RULE_ID ) ) )? (otherlv_4= 'linkedTo:' ( (otherlv_5= RULE_ID ) ) )? otherlv_6= '>>' ) )
            // InternalMyDsl.g:713:2: (otherlv_0= 'ERequiredRole' otherlv_1= '<<' (otherlv_2= 'roleOf:' ( (otherlv_3= RULE_ID ) ) )? (otherlv_4= 'linkedTo:' ( (otherlv_5= RULE_ID ) ) )? otherlv_6= '>>' )
            {
            // InternalMyDsl.g:713:2: (otherlv_0= 'ERequiredRole' otherlv_1= '<<' (otherlv_2= 'roleOf:' ( (otherlv_3= RULE_ID ) ) )? (otherlv_4= 'linkedTo:' ( (otherlv_5= RULE_ID ) ) )? otherlv_6= '>>' )
            // InternalMyDsl.g:714:3: otherlv_0= 'ERequiredRole' otherlv_1= '<<' (otherlv_2= 'roleOf:' ( (otherlv_3= RULE_ID ) ) )? (otherlv_4= 'linkedTo:' ( (otherlv_5= RULE_ID ) ) )? otherlv_6= '>>'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getERequiredRoleAccess().getERequiredRoleKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_22); 

            			newLeafNode(otherlv_1, grammarAccess.getERequiredRoleAccess().getLessThanSignLessThanSignKeyword_1());
            		
            // InternalMyDsl.g:722:3: (otherlv_2= 'roleOf:' ( (otherlv_3= RULE_ID ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==28) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalMyDsl.g:723:4: otherlv_2= 'roleOf:' ( (otherlv_3= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,28,FOLLOW_5); 

                    				newLeafNode(otherlv_2, grammarAccess.getERequiredRoleAccess().getRoleOfKeyword_2_0());
                    			
                    // InternalMyDsl.g:727:4: ( (otherlv_3= RULE_ID ) )
                    // InternalMyDsl.g:728:5: (otherlv_3= RULE_ID )
                    {
                    // InternalMyDsl.g:728:5: (otherlv_3= RULE_ID )
                    // InternalMyDsl.g:729:6: otherlv_3= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getERequiredRoleRule());
                    						}
                    					
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_23); 

                    						newLeafNode(otherlv_3, grammarAccess.getERequiredRoleAccess().getRoleOfEAssemblyContextCrossReference_2_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:741:3: (otherlv_4= 'linkedTo:' ( (otherlv_5= RULE_ID ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==29) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalMyDsl.g:742:4: otherlv_4= 'linkedTo:' ( (otherlv_5= RULE_ID ) )
                    {
                    otherlv_4=(Token)match(input,29,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getERequiredRoleAccess().getLinkedToKeyword_3_0());
                    			
                    // InternalMyDsl.g:746:4: ( (otherlv_5= RULE_ID ) )
                    // InternalMyDsl.g:747:5: (otherlv_5= RULE_ID )
                    {
                    // InternalMyDsl.g:747:5: (otherlv_5= RULE_ID )
                    // InternalMyDsl.g:748:6: otherlv_5= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getERequiredRoleRule());
                    						}
                    					
                    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_18); 

                    						newLeafNode(otherlv_5, grammarAccess.getERequiredRoleAccess().getLinkedToEAssemblyConnectorCrossReference_3_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getERequiredRoleAccess().getGreaterThanSignGreaterThanSignKeyword_4());
            		

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
    // $ANTLR end "ruleERequiredRole"


    // $ANTLR start "entryRuleEProvidedRole"
    // InternalMyDsl.g:768:1: entryRuleEProvidedRole returns [EObject current=null] : iv_ruleEProvidedRole= ruleEProvidedRole EOF ;
    public final EObject entryRuleEProvidedRole() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEProvidedRole = null;


        try {
            // InternalMyDsl.g:768:54: (iv_ruleEProvidedRole= ruleEProvidedRole EOF )
            // InternalMyDsl.g:769:2: iv_ruleEProvidedRole= ruleEProvidedRole EOF
            {
             newCompositeNode(grammarAccess.getEProvidedRoleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEProvidedRole=ruleEProvidedRole();

            state._fsp--;

             current =iv_ruleEProvidedRole; 
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
    // $ANTLR end "entryRuleEProvidedRole"


    // $ANTLR start "ruleEProvidedRole"
    // InternalMyDsl.g:775:1: ruleEProvidedRole returns [EObject current=null] : (otherlv_0= 'EProvidedRole' otherlv_1= '<<' (otherlv_2= 'roleOf:' ( (otherlv_3= RULE_ID ) ) )? (otherlv_4= 'linkedFrom:' ( (otherlv_5= RULE_ID ) ) )? otherlv_6= '>>' ) ;
    public final EObject ruleEProvidedRole() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalMyDsl.g:781:2: ( (otherlv_0= 'EProvidedRole' otherlv_1= '<<' (otherlv_2= 'roleOf:' ( (otherlv_3= RULE_ID ) ) )? (otherlv_4= 'linkedFrom:' ( (otherlv_5= RULE_ID ) ) )? otherlv_6= '>>' ) )
            // InternalMyDsl.g:782:2: (otherlv_0= 'EProvidedRole' otherlv_1= '<<' (otherlv_2= 'roleOf:' ( (otherlv_3= RULE_ID ) ) )? (otherlv_4= 'linkedFrom:' ( (otherlv_5= RULE_ID ) ) )? otherlv_6= '>>' )
            {
            // InternalMyDsl.g:782:2: (otherlv_0= 'EProvidedRole' otherlv_1= '<<' (otherlv_2= 'roleOf:' ( (otherlv_3= RULE_ID ) ) )? (otherlv_4= 'linkedFrom:' ( (otherlv_5= RULE_ID ) ) )? otherlv_6= '>>' )
            // InternalMyDsl.g:783:3: otherlv_0= 'EProvidedRole' otherlv_1= '<<' (otherlv_2= 'roleOf:' ( (otherlv_3= RULE_ID ) ) )? (otherlv_4= 'linkedFrom:' ( (otherlv_5= RULE_ID ) ) )? otherlv_6= '>>'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getEProvidedRoleAccess().getEProvidedRoleKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_24); 

            			newLeafNode(otherlv_1, grammarAccess.getEProvidedRoleAccess().getLessThanSignLessThanSignKeyword_1());
            		
            // InternalMyDsl.g:791:3: (otherlv_2= 'roleOf:' ( (otherlv_3= RULE_ID ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==28) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalMyDsl.g:792:4: otherlv_2= 'roleOf:' ( (otherlv_3= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,28,FOLLOW_5); 

                    				newLeafNode(otherlv_2, grammarAccess.getEProvidedRoleAccess().getRoleOfKeyword_2_0());
                    			
                    // InternalMyDsl.g:796:4: ( (otherlv_3= RULE_ID ) )
                    // InternalMyDsl.g:797:5: (otherlv_3= RULE_ID )
                    {
                    // InternalMyDsl.g:797:5: (otherlv_3= RULE_ID )
                    // InternalMyDsl.g:798:6: otherlv_3= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEProvidedRoleRule());
                    						}
                    					
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_25); 

                    						newLeafNode(otherlv_3, grammarAccess.getEProvidedRoleAccess().getRoleOfEAssemblyContextCrossReference_2_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:810:3: (otherlv_4= 'linkedFrom:' ( (otherlv_5= RULE_ID ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==31) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalMyDsl.g:811:4: otherlv_4= 'linkedFrom:' ( (otherlv_5= RULE_ID ) )
                    {
                    otherlv_4=(Token)match(input,31,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getEProvidedRoleAccess().getLinkedFromKeyword_3_0());
                    			
                    // InternalMyDsl.g:815:4: ( (otherlv_5= RULE_ID ) )
                    // InternalMyDsl.g:816:5: (otherlv_5= RULE_ID )
                    {
                    // InternalMyDsl.g:816:5: (otherlv_5= RULE_ID )
                    // InternalMyDsl.g:817:6: otherlv_5= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEProvidedRoleRule());
                    						}
                    					
                    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_18); 

                    						newLeafNode(otherlv_5, grammarAccess.getEProvidedRoleAccess().getLinkedFromEAssemblyConnectorCrossReference_3_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getEProvidedRoleAccess().getGreaterThanSignGreaterThanSignKeyword_4());
            		

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
    // $ANTLR end "ruleEProvidedRole"


    // $ANTLR start "entryRuleEAssemblyContext"
    // InternalMyDsl.g:837:1: entryRuleEAssemblyContext returns [EObject current=null] : iv_ruleEAssemblyContext= ruleEAssemblyContext EOF ;
    public final EObject entryRuleEAssemblyContext() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEAssemblyContext = null;


        try {
            // InternalMyDsl.g:837:57: (iv_ruleEAssemblyContext= ruleEAssemblyContext EOF )
            // InternalMyDsl.g:838:2: iv_ruleEAssemblyContext= ruleEAssemblyContext EOF
            {
             newCompositeNode(grammarAccess.getEAssemblyContextRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEAssemblyContext=ruleEAssemblyContext();

            state._fsp--;

             current =iv_ruleEAssemblyContext; 
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
    // $ANTLR end "entryRuleEAssemblyContext"


    // $ANTLR start "ruleEAssemblyContext"
    // InternalMyDsl.g:844:1: ruleEAssemblyContext returns [EObject current=null] : (otherlv_0= 'EAssemblyContext' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '<<' (otherlv_3= 'allocated:' ( (otherlv_4= RULE_ID ) ) )? (otherlv_5= 'encapsulatedByComponent:' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* )? (otherlv_9= 'encapsulatedBySystem:' ( (otherlv_10= RULE_ID ) ) (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )* )? (otherlv_13= 'instantiates:' ( (otherlv_14= RULE_ID ) ) (otherlv_15= ',' ( (otherlv_16= RULE_ID ) ) )* )? (otherlv_17= 'roles:' ( (lv_roles_18_0= ruleERole ) ) (otherlv_19= ',' ( (lv_roles_20_0= ruleERole ) ) )* )? otherlv_21= '>>' ) ;
    public final EObject ruleEAssemblyContext() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_roles_18_0 = null;

        EObject lv_roles_20_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:850:2: ( (otherlv_0= 'EAssemblyContext' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '<<' (otherlv_3= 'allocated:' ( (otherlv_4= RULE_ID ) ) )? (otherlv_5= 'encapsulatedByComponent:' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* )? (otherlv_9= 'encapsulatedBySystem:' ( (otherlv_10= RULE_ID ) ) (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )* )? (otherlv_13= 'instantiates:' ( (otherlv_14= RULE_ID ) ) (otherlv_15= ',' ( (otherlv_16= RULE_ID ) ) )* )? (otherlv_17= 'roles:' ( (lv_roles_18_0= ruleERole ) ) (otherlv_19= ',' ( (lv_roles_20_0= ruleERole ) ) )* )? otherlv_21= '>>' ) )
            // InternalMyDsl.g:851:2: (otherlv_0= 'EAssemblyContext' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '<<' (otherlv_3= 'allocated:' ( (otherlv_4= RULE_ID ) ) )? (otherlv_5= 'encapsulatedByComponent:' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* )? (otherlv_9= 'encapsulatedBySystem:' ( (otherlv_10= RULE_ID ) ) (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )* )? (otherlv_13= 'instantiates:' ( (otherlv_14= RULE_ID ) ) (otherlv_15= ',' ( (otherlv_16= RULE_ID ) ) )* )? (otherlv_17= 'roles:' ( (lv_roles_18_0= ruleERole ) ) (otherlv_19= ',' ( (lv_roles_20_0= ruleERole ) ) )* )? otherlv_21= '>>' )
            {
            // InternalMyDsl.g:851:2: (otherlv_0= 'EAssemblyContext' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '<<' (otherlv_3= 'allocated:' ( (otherlv_4= RULE_ID ) ) )? (otherlv_5= 'encapsulatedByComponent:' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* )? (otherlv_9= 'encapsulatedBySystem:' ( (otherlv_10= RULE_ID ) ) (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )* )? (otherlv_13= 'instantiates:' ( (otherlv_14= RULE_ID ) ) (otherlv_15= ',' ( (otherlv_16= RULE_ID ) ) )* )? (otherlv_17= 'roles:' ( (lv_roles_18_0= ruleERole ) ) (otherlv_19= ',' ( (lv_roles_20_0= ruleERole ) ) )* )? otherlv_21= '>>' )
            // InternalMyDsl.g:852:3: otherlv_0= 'EAssemblyContext' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '<<' (otherlv_3= 'allocated:' ( (otherlv_4= RULE_ID ) ) )? (otherlv_5= 'encapsulatedByComponent:' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* )? (otherlv_9= 'encapsulatedBySystem:' ( (otherlv_10= RULE_ID ) ) (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )* )? (otherlv_13= 'instantiates:' ( (otherlv_14= RULE_ID ) ) (otherlv_15= ',' ( (otherlv_16= RULE_ID ) ) )* )? (otherlv_17= 'roles:' ( (lv_roles_18_0= ruleERole ) ) (otherlv_19= ',' ( (lv_roles_20_0= ruleERole ) ) )* )? otherlv_21= '>>'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getEAssemblyContextAccess().getEAssemblyContextKeyword_0());
            		
            // InternalMyDsl.g:856:3: ( (lv_name_1_0= ruleEString ) )
            // InternalMyDsl.g:857:4: (lv_name_1_0= ruleEString )
            {
            // InternalMyDsl.g:857:4: (lv_name_1_0= ruleEString )
            // InternalMyDsl.g:858:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getEAssemblyContextAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEAssemblyContextRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_26); 

            			newLeafNode(otherlv_2, grammarAccess.getEAssemblyContextAccess().getLessThanSignLessThanSignKeyword_2());
            		
            // InternalMyDsl.g:879:3: (otherlv_3= 'allocated:' ( (otherlv_4= RULE_ID ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==33) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalMyDsl.g:880:4: otherlv_3= 'allocated:' ( (otherlv_4= RULE_ID ) )
                    {
                    otherlv_3=(Token)match(input,33,FOLLOW_5); 

                    				newLeafNode(otherlv_3, grammarAccess.getEAssemblyContextAccess().getAllocatedKeyword_3_0());
                    			
                    // InternalMyDsl.g:884:4: ( (otherlv_4= RULE_ID ) )
                    // InternalMyDsl.g:885:5: (otherlv_4= RULE_ID )
                    {
                    // InternalMyDsl.g:885:5: (otherlv_4= RULE_ID )
                    // InternalMyDsl.g:886:6: otherlv_4= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEAssemblyContextRule());
                    						}
                    					
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_27); 

                    						newLeafNode(otherlv_4, grammarAccess.getEAssemblyContextAccess().getAllocatedEContainerCrossReference_3_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:898:3: (otherlv_5= 'encapsulatedByComponent:' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==34) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalMyDsl.g:899:4: otherlv_5= 'encapsulatedByComponent:' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )*
                    {
                    otherlv_5=(Token)match(input,34,FOLLOW_5); 

                    				newLeafNode(otherlv_5, grammarAccess.getEAssemblyContextAccess().getEncapsulatedByComponentKeyword_4_0());
                    			
                    // InternalMyDsl.g:903:4: ( (otherlv_6= RULE_ID ) )
                    // InternalMyDsl.g:904:5: (otherlv_6= RULE_ID )
                    {
                    // InternalMyDsl.g:904:5: (otherlv_6= RULE_ID )
                    // InternalMyDsl.g:905:6: otherlv_6= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEAssemblyContextRule());
                    						}
                    					
                    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_28); 

                    						newLeafNode(otherlv_6, grammarAccess.getEAssemblyContextAccess().getEncapsulatedByComponentECompositeComponentCrossReference_4_1_0());
                    					

                    }


                    }

                    // InternalMyDsl.g:916:4: (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )*
                    loop28:
                    do {
                        int alt28=2;
                        int LA28_0 = input.LA(1);

                        if ( (LA28_0==14) ) {
                            alt28=1;
                        }


                        switch (alt28) {
                    	case 1 :
                    	    // InternalMyDsl.g:917:5: otherlv_7= ',' ( (otherlv_8= RULE_ID ) )
                    	    {
                    	    otherlv_7=(Token)match(input,14,FOLLOW_5); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getEAssemblyContextAccess().getCommaKeyword_4_2_0());
                    	    				
                    	    // InternalMyDsl.g:921:5: ( (otherlv_8= RULE_ID ) )
                    	    // InternalMyDsl.g:922:6: (otherlv_8= RULE_ID )
                    	    {
                    	    // InternalMyDsl.g:922:6: (otherlv_8= RULE_ID )
                    	    // InternalMyDsl.g:923:7: otherlv_8= RULE_ID
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getEAssemblyContextRule());
                    	    							}
                    	    						
                    	    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_28); 

                    	    							newLeafNode(otherlv_8, grammarAccess.getEAssemblyContextAccess().getEncapsulatedByComponentECompositeComponentCrossReference_4_2_1_0());
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop28;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalMyDsl.g:936:3: (otherlv_9= 'encapsulatedBySystem:' ( (otherlv_10= RULE_ID ) ) (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )* )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==35) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalMyDsl.g:937:4: otherlv_9= 'encapsulatedBySystem:' ( (otherlv_10= RULE_ID ) ) (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )*
                    {
                    otherlv_9=(Token)match(input,35,FOLLOW_5); 

                    				newLeafNode(otherlv_9, grammarAccess.getEAssemblyContextAccess().getEncapsulatedBySystemKeyword_5_0());
                    			
                    // InternalMyDsl.g:941:4: ( (otherlv_10= RULE_ID ) )
                    // InternalMyDsl.g:942:5: (otherlv_10= RULE_ID )
                    {
                    // InternalMyDsl.g:942:5: (otherlv_10= RULE_ID )
                    // InternalMyDsl.g:943:6: otherlv_10= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEAssemblyContextRule());
                    						}
                    					
                    otherlv_10=(Token)match(input,RULE_ID,FOLLOW_29); 

                    						newLeafNode(otherlv_10, grammarAccess.getEAssemblyContextAccess().getEncapsulatedBySystemESystemCrossReference_5_1_0());
                    					

                    }


                    }

                    // InternalMyDsl.g:954:4: (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )*
                    loop30:
                    do {
                        int alt30=2;
                        int LA30_0 = input.LA(1);

                        if ( (LA30_0==14) ) {
                            alt30=1;
                        }


                        switch (alt30) {
                    	case 1 :
                    	    // InternalMyDsl.g:955:5: otherlv_11= ',' ( (otherlv_12= RULE_ID ) )
                    	    {
                    	    otherlv_11=(Token)match(input,14,FOLLOW_5); 

                    	    					newLeafNode(otherlv_11, grammarAccess.getEAssemblyContextAccess().getCommaKeyword_5_2_0());
                    	    				
                    	    // InternalMyDsl.g:959:5: ( (otherlv_12= RULE_ID ) )
                    	    // InternalMyDsl.g:960:6: (otherlv_12= RULE_ID )
                    	    {
                    	    // InternalMyDsl.g:960:6: (otherlv_12= RULE_ID )
                    	    // InternalMyDsl.g:961:7: otherlv_12= RULE_ID
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getEAssemblyContextRule());
                    	    							}
                    	    						
                    	    otherlv_12=(Token)match(input,RULE_ID,FOLLOW_29); 

                    	    							newLeafNode(otherlv_12, grammarAccess.getEAssemblyContextAccess().getEncapsulatedBySystemESystemCrossReference_5_2_1_0());
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop30;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalMyDsl.g:974:3: (otherlv_13= 'instantiates:' ( (otherlv_14= RULE_ID ) ) (otherlv_15= ',' ( (otherlv_16= RULE_ID ) ) )* )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==36) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalMyDsl.g:975:4: otherlv_13= 'instantiates:' ( (otherlv_14= RULE_ID ) ) (otherlv_15= ',' ( (otherlv_16= RULE_ID ) ) )*
                    {
                    otherlv_13=(Token)match(input,36,FOLLOW_5); 

                    				newLeafNode(otherlv_13, grammarAccess.getEAssemblyContextAccess().getInstantiatesKeyword_6_0());
                    			
                    // InternalMyDsl.g:979:4: ( (otherlv_14= RULE_ID ) )
                    // InternalMyDsl.g:980:5: (otherlv_14= RULE_ID )
                    {
                    // InternalMyDsl.g:980:5: (otherlv_14= RULE_ID )
                    // InternalMyDsl.g:981:6: otherlv_14= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEAssemblyContextRule());
                    						}
                    					
                    otherlv_14=(Token)match(input,RULE_ID,FOLLOW_30); 

                    						newLeafNode(otherlv_14, grammarAccess.getEAssemblyContextAccess().getInstantiatesEComponentCrossReference_6_1_0());
                    					

                    }


                    }

                    // InternalMyDsl.g:992:4: (otherlv_15= ',' ( (otherlv_16= RULE_ID ) ) )*
                    loop32:
                    do {
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( (LA32_0==14) ) {
                            alt32=1;
                        }


                        switch (alt32) {
                    	case 1 :
                    	    // InternalMyDsl.g:993:5: otherlv_15= ',' ( (otherlv_16= RULE_ID ) )
                    	    {
                    	    otherlv_15=(Token)match(input,14,FOLLOW_5); 

                    	    					newLeafNode(otherlv_15, grammarAccess.getEAssemblyContextAccess().getCommaKeyword_6_2_0());
                    	    				
                    	    // InternalMyDsl.g:997:5: ( (otherlv_16= RULE_ID ) )
                    	    // InternalMyDsl.g:998:6: (otherlv_16= RULE_ID )
                    	    {
                    	    // InternalMyDsl.g:998:6: (otherlv_16= RULE_ID )
                    	    // InternalMyDsl.g:999:7: otherlv_16= RULE_ID
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getEAssemblyContextRule());
                    	    							}
                    	    						
                    	    otherlv_16=(Token)match(input,RULE_ID,FOLLOW_30); 

                    	    							newLeafNode(otherlv_16, grammarAccess.getEAssemblyContextAccess().getInstantiatesEComponentCrossReference_6_2_1_0());
                    	    						

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

            // InternalMyDsl.g:1012:3: (otherlv_17= 'roles:' ( (lv_roles_18_0= ruleERole ) ) (otherlv_19= ',' ( (lv_roles_20_0= ruleERole ) ) )* )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==37) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalMyDsl.g:1013:4: otherlv_17= 'roles:' ( (lv_roles_18_0= ruleERole ) ) (otherlv_19= ',' ( (lv_roles_20_0= ruleERole ) ) )*
                    {
                    otherlv_17=(Token)match(input,37,FOLLOW_31); 

                    				newLeafNode(otherlv_17, grammarAccess.getEAssemblyContextAccess().getRolesKeyword_7_0());
                    			
                    // InternalMyDsl.g:1017:4: ( (lv_roles_18_0= ruleERole ) )
                    // InternalMyDsl.g:1018:5: (lv_roles_18_0= ruleERole )
                    {
                    // InternalMyDsl.g:1018:5: (lv_roles_18_0= ruleERole )
                    // InternalMyDsl.g:1019:6: lv_roles_18_0= ruleERole
                    {

                    						newCompositeNode(grammarAccess.getEAssemblyContextAccess().getRolesERoleParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_roles_18_0=ruleERole();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEAssemblyContextRule());
                    						}
                    						add(
                    							current,
                    							"roles",
                    							lv_roles_18_0,
                    							"org.xtext.example.mydsl.MyDsl.ERole");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:1036:4: (otherlv_19= ',' ( (lv_roles_20_0= ruleERole ) ) )*
                    loop34:
                    do {
                        int alt34=2;
                        int LA34_0 = input.LA(1);

                        if ( (LA34_0==14) ) {
                            alt34=1;
                        }


                        switch (alt34) {
                    	case 1 :
                    	    // InternalMyDsl.g:1037:5: otherlv_19= ',' ( (lv_roles_20_0= ruleERole ) )
                    	    {
                    	    otherlv_19=(Token)match(input,14,FOLLOW_31); 

                    	    					newLeafNode(otherlv_19, grammarAccess.getEAssemblyContextAccess().getCommaKeyword_7_2_0());
                    	    				
                    	    // InternalMyDsl.g:1041:5: ( (lv_roles_20_0= ruleERole ) )
                    	    // InternalMyDsl.g:1042:6: (lv_roles_20_0= ruleERole )
                    	    {
                    	    // InternalMyDsl.g:1042:6: (lv_roles_20_0= ruleERole )
                    	    // InternalMyDsl.g:1043:7: lv_roles_20_0= ruleERole
                    	    {

                    	    							newCompositeNode(grammarAccess.getEAssemblyContextAccess().getRolesERoleParserRuleCall_7_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_roles_20_0=ruleERole();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getEAssemblyContextRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"roles",
                    	    								lv_roles_20_0,
                    	    								"org.xtext.example.mydsl.MyDsl.ERole");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop34;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_21=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_21, grammarAccess.getEAssemblyContextAccess().getGreaterThanSignGreaterThanSignKeyword_8());
            		

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
    // $ANTLR end "ruleEAssemblyContext"


    // $ANTLR start "entryRuleEProvidedDelegationConnector"
    // InternalMyDsl.g:1070:1: entryRuleEProvidedDelegationConnector returns [EObject current=null] : iv_ruleEProvidedDelegationConnector= ruleEProvidedDelegationConnector EOF ;
    public final EObject entryRuleEProvidedDelegationConnector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEProvidedDelegationConnector = null;


        try {
            // InternalMyDsl.g:1070:69: (iv_ruleEProvidedDelegationConnector= ruleEProvidedDelegationConnector EOF )
            // InternalMyDsl.g:1071:2: iv_ruleEProvidedDelegationConnector= ruleEProvidedDelegationConnector EOF
            {
             newCompositeNode(grammarAccess.getEProvidedDelegationConnectorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEProvidedDelegationConnector=ruleEProvidedDelegationConnector();

            state._fsp--;

             current =iv_ruleEProvidedDelegationConnector; 
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
    // $ANTLR end "entryRuleEProvidedDelegationConnector"


    // $ANTLR start "ruleEProvidedDelegationConnector"
    // InternalMyDsl.g:1077:1: ruleEProvidedDelegationConnector returns [EObject current=null] : (otherlv_0= 'EProvidedDelegationConnector' otherlv_1= '<<' (otherlv_2= 'linkFrom:' ( (otherlv_3= RULE_ID ) ) ) (otherlv_4= 'linkTo:' ( (otherlv_5= RULE_ID ) ) ) otherlv_6= '>>' ) ;
    public final EObject ruleEProvidedDelegationConnector() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1083:2: ( (otherlv_0= 'EProvidedDelegationConnector' otherlv_1= '<<' (otherlv_2= 'linkFrom:' ( (otherlv_3= RULE_ID ) ) ) (otherlv_4= 'linkTo:' ( (otherlv_5= RULE_ID ) ) ) otherlv_6= '>>' ) )
            // InternalMyDsl.g:1084:2: (otherlv_0= 'EProvidedDelegationConnector' otherlv_1= '<<' (otherlv_2= 'linkFrom:' ( (otherlv_3= RULE_ID ) ) ) (otherlv_4= 'linkTo:' ( (otherlv_5= RULE_ID ) ) ) otherlv_6= '>>' )
            {
            // InternalMyDsl.g:1084:2: (otherlv_0= 'EProvidedDelegationConnector' otherlv_1= '<<' (otherlv_2= 'linkFrom:' ( (otherlv_3= RULE_ID ) ) ) (otherlv_4= 'linkTo:' ( (otherlv_5= RULE_ID ) ) ) otherlv_6= '>>' )
            // InternalMyDsl.g:1085:3: otherlv_0= 'EProvidedDelegationConnector' otherlv_1= '<<' (otherlv_2= 'linkFrom:' ( (otherlv_3= RULE_ID ) ) ) (otherlv_4= 'linkTo:' ( (otherlv_5= RULE_ID ) ) ) otherlv_6= '>>'
            {
            otherlv_0=(Token)match(input,38,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getEProvidedDelegationConnectorAccess().getEProvidedDelegationConnectorKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_32); 

            			newLeafNode(otherlv_1, grammarAccess.getEProvidedDelegationConnectorAccess().getLessThanSignLessThanSignKeyword_1());
            		
            // InternalMyDsl.g:1093:3: (otherlv_2= 'linkFrom:' ( (otherlv_3= RULE_ID ) ) )
            // InternalMyDsl.g:1094:4: otherlv_2= 'linkFrom:' ( (otherlv_3= RULE_ID ) )
            {
            otherlv_2=(Token)match(input,39,FOLLOW_5); 

            				newLeafNode(otherlv_2, grammarAccess.getEProvidedDelegationConnectorAccess().getLinkFromKeyword_2_0());
            			
            // InternalMyDsl.g:1098:4: ( (otherlv_3= RULE_ID ) )
            // InternalMyDsl.g:1099:5: (otherlv_3= RULE_ID )
            {
            // InternalMyDsl.g:1099:5: (otherlv_3= RULE_ID )
            // InternalMyDsl.g:1100:6: otherlv_3= RULE_ID
            {

            						if (current==null) {
            							current = createModelElement(grammarAccess.getEProvidedDelegationConnectorRule());
            						}
            					
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_33); 

            						newLeafNode(otherlv_3, grammarAccess.getEProvidedDelegationConnectorAccess().getLinkFromEInterfaceCrossReference_2_1_0());
            					

            }


            }


            }

            // InternalMyDsl.g:1112:3: (otherlv_4= 'linkTo:' ( (otherlv_5= RULE_ID ) ) )
            // InternalMyDsl.g:1113:4: otherlv_4= 'linkTo:' ( (otherlv_5= RULE_ID ) )
            {
            otherlv_4=(Token)match(input,40,FOLLOW_5); 

            				newLeafNode(otherlv_4, grammarAccess.getEProvidedDelegationConnectorAccess().getLinkToKeyword_3_0());
            			
            // InternalMyDsl.g:1117:4: ( (otherlv_5= RULE_ID ) )
            // InternalMyDsl.g:1118:5: (otherlv_5= RULE_ID )
            {
            // InternalMyDsl.g:1118:5: (otherlv_5= RULE_ID )
            // InternalMyDsl.g:1119:6: otherlv_5= RULE_ID
            {

            						if (current==null) {
            							current = createModelElement(grammarAccess.getEProvidedDelegationConnectorRule());
            						}
            					
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_18); 

            						newLeafNode(otherlv_5, grammarAccess.getEProvidedDelegationConnectorAccess().getLinkToEProvidedRoleCrossReference_3_1_0());
            					

            }


            }


            }

            otherlv_6=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getEProvidedDelegationConnectorAccess().getGreaterThanSignGreaterThanSignKeyword_4());
            		

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
    // $ANTLR end "ruleEProvidedDelegationConnector"


    // $ANTLR start "entryRuleERequiredDelegationConnector"
    // InternalMyDsl.g:1139:1: entryRuleERequiredDelegationConnector returns [EObject current=null] : iv_ruleERequiredDelegationConnector= ruleERequiredDelegationConnector EOF ;
    public final EObject entryRuleERequiredDelegationConnector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleERequiredDelegationConnector = null;


        try {
            // InternalMyDsl.g:1139:69: (iv_ruleERequiredDelegationConnector= ruleERequiredDelegationConnector EOF )
            // InternalMyDsl.g:1140:2: iv_ruleERequiredDelegationConnector= ruleERequiredDelegationConnector EOF
            {
             newCompositeNode(grammarAccess.getERequiredDelegationConnectorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleERequiredDelegationConnector=ruleERequiredDelegationConnector();

            state._fsp--;

             current =iv_ruleERequiredDelegationConnector; 
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
    // $ANTLR end "entryRuleERequiredDelegationConnector"


    // $ANTLR start "ruleERequiredDelegationConnector"
    // InternalMyDsl.g:1146:1: ruleERequiredDelegationConnector returns [EObject current=null] : (otherlv_0= 'ERequiredDelegationConnector' otherlv_1= '<<' (otherlv_2= 'linkFrom:' ( (otherlv_3= RULE_ID ) ) ) (otherlv_4= 'linkTo:' ( (otherlv_5= RULE_ID ) ) ) otherlv_6= '>>' ) ;
    public final EObject ruleERequiredDelegationConnector() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1152:2: ( (otherlv_0= 'ERequiredDelegationConnector' otherlv_1= '<<' (otherlv_2= 'linkFrom:' ( (otherlv_3= RULE_ID ) ) ) (otherlv_4= 'linkTo:' ( (otherlv_5= RULE_ID ) ) ) otherlv_6= '>>' ) )
            // InternalMyDsl.g:1153:2: (otherlv_0= 'ERequiredDelegationConnector' otherlv_1= '<<' (otherlv_2= 'linkFrom:' ( (otherlv_3= RULE_ID ) ) ) (otherlv_4= 'linkTo:' ( (otherlv_5= RULE_ID ) ) ) otherlv_6= '>>' )
            {
            // InternalMyDsl.g:1153:2: (otherlv_0= 'ERequiredDelegationConnector' otherlv_1= '<<' (otherlv_2= 'linkFrom:' ( (otherlv_3= RULE_ID ) ) ) (otherlv_4= 'linkTo:' ( (otherlv_5= RULE_ID ) ) ) otherlv_6= '>>' )
            // InternalMyDsl.g:1154:3: otherlv_0= 'ERequiredDelegationConnector' otherlv_1= '<<' (otherlv_2= 'linkFrom:' ( (otherlv_3= RULE_ID ) ) ) (otherlv_4= 'linkTo:' ( (otherlv_5= RULE_ID ) ) ) otherlv_6= '>>'
            {
            otherlv_0=(Token)match(input,41,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getERequiredDelegationConnectorAccess().getERequiredDelegationConnectorKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_32); 

            			newLeafNode(otherlv_1, grammarAccess.getERequiredDelegationConnectorAccess().getLessThanSignLessThanSignKeyword_1());
            		
            // InternalMyDsl.g:1162:3: (otherlv_2= 'linkFrom:' ( (otherlv_3= RULE_ID ) ) )
            // InternalMyDsl.g:1163:4: otherlv_2= 'linkFrom:' ( (otherlv_3= RULE_ID ) )
            {
            otherlv_2=(Token)match(input,39,FOLLOW_5); 

            				newLeafNode(otherlv_2, grammarAccess.getERequiredDelegationConnectorAccess().getLinkFromKeyword_2_0());
            			
            // InternalMyDsl.g:1167:4: ( (otherlv_3= RULE_ID ) )
            // InternalMyDsl.g:1168:5: (otherlv_3= RULE_ID )
            {
            // InternalMyDsl.g:1168:5: (otherlv_3= RULE_ID )
            // InternalMyDsl.g:1169:6: otherlv_3= RULE_ID
            {

            						if (current==null) {
            							current = createModelElement(grammarAccess.getERequiredDelegationConnectorRule());
            						}
            					
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_33); 

            						newLeafNode(otherlv_3, grammarAccess.getERequiredDelegationConnectorAccess().getLinkFromERequiredRoleCrossReference_2_1_0());
            					

            }


            }


            }

            // InternalMyDsl.g:1181:3: (otherlv_4= 'linkTo:' ( (otherlv_5= RULE_ID ) ) )
            // InternalMyDsl.g:1182:4: otherlv_4= 'linkTo:' ( (otherlv_5= RULE_ID ) )
            {
            otherlv_4=(Token)match(input,40,FOLLOW_5); 

            				newLeafNode(otherlv_4, grammarAccess.getERequiredDelegationConnectorAccess().getLinkToKeyword_3_0());
            			
            // InternalMyDsl.g:1186:4: ( (otherlv_5= RULE_ID ) )
            // InternalMyDsl.g:1187:5: (otherlv_5= RULE_ID )
            {
            // InternalMyDsl.g:1187:5: (otherlv_5= RULE_ID )
            // InternalMyDsl.g:1188:6: otherlv_5= RULE_ID
            {

            						if (current==null) {
            							current = createModelElement(grammarAccess.getERequiredDelegationConnectorRule());
            						}
            					
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_18); 

            						newLeafNode(otherlv_5, grammarAccess.getERequiredDelegationConnectorAccess().getLinkToEInterfaceCrossReference_3_1_0());
            					

            }


            }


            }

            otherlv_6=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getERequiredDelegationConnectorAccess().getGreaterThanSignGreaterThanSignKeyword_4());
            		

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
    // $ANTLR end "ruleERequiredDelegationConnector"


    // $ANTLR start "entryRuleESystemIndependentViewPoint"
    // InternalMyDsl.g:1208:1: entryRuleESystemIndependentViewPoint returns [EObject current=null] : iv_ruleESystemIndependentViewPoint= ruleESystemIndependentViewPoint EOF ;
    public final EObject entryRuleESystemIndependentViewPoint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleESystemIndependentViewPoint = null;


        try {
            // InternalMyDsl.g:1208:68: (iv_ruleESystemIndependentViewPoint= ruleESystemIndependentViewPoint EOF )
            // InternalMyDsl.g:1209:2: iv_ruleESystemIndependentViewPoint= ruleESystemIndependentViewPoint EOF
            {
             newCompositeNode(grammarAccess.getESystemIndependentViewPointRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleESystemIndependentViewPoint=ruleESystemIndependentViewPoint();

            state._fsp--;

             current =iv_ruleESystemIndependentViewPoint; 
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
    // $ANTLR end "entryRuleESystemIndependentViewPoint"


    // $ANTLR start "ruleESystemIndependentViewPoint"
    // InternalMyDsl.g:1215:1: ruleESystemIndependentViewPoint returns [EObject current=null] : (otherlv_0= 'ESystemIndependentViewPoint' otherlv_1= '<<' (otherlv_2= 'repositoryViewType:' ( (lv_repositoryViewType_3_0= ruleERepositoryViewType ) ) ) otherlv_4= '>>' ) ;
    public final EObject ruleESystemIndependentViewPoint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_repositoryViewType_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1221:2: ( (otherlv_0= 'ESystemIndependentViewPoint' otherlv_1= '<<' (otherlv_2= 'repositoryViewType:' ( (lv_repositoryViewType_3_0= ruleERepositoryViewType ) ) ) otherlv_4= '>>' ) )
            // InternalMyDsl.g:1222:2: (otherlv_0= 'ESystemIndependentViewPoint' otherlv_1= '<<' (otherlv_2= 'repositoryViewType:' ( (lv_repositoryViewType_3_0= ruleERepositoryViewType ) ) ) otherlv_4= '>>' )
            {
            // InternalMyDsl.g:1222:2: (otherlv_0= 'ESystemIndependentViewPoint' otherlv_1= '<<' (otherlv_2= 'repositoryViewType:' ( (lv_repositoryViewType_3_0= ruleERepositoryViewType ) ) ) otherlv_4= '>>' )
            // InternalMyDsl.g:1223:3: otherlv_0= 'ESystemIndependentViewPoint' otherlv_1= '<<' (otherlv_2= 'repositoryViewType:' ( (lv_repositoryViewType_3_0= ruleERepositoryViewType ) ) ) otherlv_4= '>>'
            {
            otherlv_0=(Token)match(input,42,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getESystemIndependentViewPointAccess().getESystemIndependentViewPointKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_34); 

            			newLeafNode(otherlv_1, grammarAccess.getESystemIndependentViewPointAccess().getLessThanSignLessThanSignKeyword_1());
            		
            // InternalMyDsl.g:1231:3: (otherlv_2= 'repositoryViewType:' ( (lv_repositoryViewType_3_0= ruleERepositoryViewType ) ) )
            // InternalMyDsl.g:1232:4: otherlv_2= 'repositoryViewType:' ( (lv_repositoryViewType_3_0= ruleERepositoryViewType ) )
            {
            otherlv_2=(Token)match(input,43,FOLLOW_35); 

            				newLeafNode(otherlv_2, grammarAccess.getESystemIndependentViewPointAccess().getRepositoryViewTypeKeyword_2_0());
            			
            // InternalMyDsl.g:1236:4: ( (lv_repositoryViewType_3_0= ruleERepositoryViewType ) )
            // InternalMyDsl.g:1237:5: (lv_repositoryViewType_3_0= ruleERepositoryViewType )
            {
            // InternalMyDsl.g:1237:5: (lv_repositoryViewType_3_0= ruleERepositoryViewType )
            // InternalMyDsl.g:1238:6: lv_repositoryViewType_3_0= ruleERepositoryViewType
            {

            						newCompositeNode(grammarAccess.getESystemIndependentViewPointAccess().getRepositoryViewTypeERepositoryViewTypeParserRuleCall_2_1_0());
            					
            pushFollow(FOLLOW_18);
            lv_repositoryViewType_3_0=ruleERepositoryViewType();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getESystemIndependentViewPointRule());
            						}
            						set(
            							current,
            							"repositoryViewType",
            							lv_repositoryViewType_3_0,
            							"org.xtext.example.mydsl.MyDsl.ERepositoryViewType");
            						afterParserOrEnumRuleCall();
            					

            }


            }


            }

            otherlv_4=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getESystemIndependentViewPointAccess().getGreaterThanSignGreaterThanSignKeyword_3());
            		

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
    // $ANTLR end "ruleESystemIndependentViewPoint"


    // $ANTLR start "entryRuleEAssemblyViewPoint"
    // InternalMyDsl.g:1264:1: entryRuleEAssemblyViewPoint returns [EObject current=null] : iv_ruleEAssemblyViewPoint= ruleEAssemblyViewPoint EOF ;
    public final EObject entryRuleEAssemblyViewPoint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEAssemblyViewPoint = null;


        try {
            // InternalMyDsl.g:1264:59: (iv_ruleEAssemblyViewPoint= ruleEAssemblyViewPoint EOF )
            // InternalMyDsl.g:1265:2: iv_ruleEAssemblyViewPoint= ruleEAssemblyViewPoint EOF
            {
             newCompositeNode(grammarAccess.getEAssemblyViewPointRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEAssemblyViewPoint=ruleEAssemblyViewPoint();

            state._fsp--;

             current =iv_ruleEAssemblyViewPoint; 
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
    // $ANTLR end "entryRuleEAssemblyViewPoint"


    // $ANTLR start "ruleEAssemblyViewPoint"
    // InternalMyDsl.g:1271:1: ruleEAssemblyViewPoint returns [EObject current=null] : (otherlv_0= 'EAssemblyViewPoint' otherlv_1= '<<' (otherlv_2= 'assemblyViewType:' ( (lv_assemblyViewType_3_0= ruleEAssemblyViewType ) ) ) otherlv_4= '>>' ) ;
    public final EObject ruleEAssemblyViewPoint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_assemblyViewType_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1277:2: ( (otherlv_0= 'EAssemblyViewPoint' otherlv_1= '<<' (otherlv_2= 'assemblyViewType:' ( (lv_assemblyViewType_3_0= ruleEAssemblyViewType ) ) ) otherlv_4= '>>' ) )
            // InternalMyDsl.g:1278:2: (otherlv_0= 'EAssemblyViewPoint' otherlv_1= '<<' (otherlv_2= 'assemblyViewType:' ( (lv_assemblyViewType_3_0= ruleEAssemblyViewType ) ) ) otherlv_4= '>>' )
            {
            // InternalMyDsl.g:1278:2: (otherlv_0= 'EAssemblyViewPoint' otherlv_1= '<<' (otherlv_2= 'assemblyViewType:' ( (lv_assemblyViewType_3_0= ruleEAssemblyViewType ) ) ) otherlv_4= '>>' )
            // InternalMyDsl.g:1279:3: otherlv_0= 'EAssemblyViewPoint' otherlv_1= '<<' (otherlv_2= 'assemblyViewType:' ( (lv_assemblyViewType_3_0= ruleEAssemblyViewType ) ) ) otherlv_4= '>>'
            {
            otherlv_0=(Token)match(input,44,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getEAssemblyViewPointAccess().getEAssemblyViewPointKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_36); 

            			newLeafNode(otherlv_1, grammarAccess.getEAssemblyViewPointAccess().getLessThanSignLessThanSignKeyword_1());
            		
            // InternalMyDsl.g:1287:3: (otherlv_2= 'assemblyViewType:' ( (lv_assemblyViewType_3_0= ruleEAssemblyViewType ) ) )
            // InternalMyDsl.g:1288:4: otherlv_2= 'assemblyViewType:' ( (lv_assemblyViewType_3_0= ruleEAssemblyViewType ) )
            {
            otherlv_2=(Token)match(input,45,FOLLOW_37); 

            				newLeafNode(otherlv_2, grammarAccess.getEAssemblyViewPointAccess().getAssemblyViewTypeKeyword_2_0());
            			
            // InternalMyDsl.g:1292:4: ( (lv_assemblyViewType_3_0= ruleEAssemblyViewType ) )
            // InternalMyDsl.g:1293:5: (lv_assemblyViewType_3_0= ruleEAssemblyViewType )
            {
            // InternalMyDsl.g:1293:5: (lv_assemblyViewType_3_0= ruleEAssemblyViewType )
            // InternalMyDsl.g:1294:6: lv_assemblyViewType_3_0= ruleEAssemblyViewType
            {

            						newCompositeNode(grammarAccess.getEAssemblyViewPointAccess().getAssemblyViewTypeEAssemblyViewTypeParserRuleCall_2_1_0());
            					
            pushFollow(FOLLOW_18);
            lv_assemblyViewType_3_0=ruleEAssemblyViewType();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getEAssemblyViewPointRule());
            						}
            						set(
            							current,
            							"assemblyViewType",
            							lv_assemblyViewType_3_0,
            							"org.xtext.example.mydsl.MyDsl.EAssemblyViewType");
            						afterParserOrEnumRuleCall();
            					

            }


            }


            }

            otherlv_4=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getEAssemblyViewPointAccess().getGreaterThanSignGreaterThanSignKeyword_3());
            		

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
    // $ANTLR end "ruleEAssemblyViewPoint"


    // $ANTLR start "entryRuleEDeploymentViewPoint"
    // InternalMyDsl.g:1320:1: entryRuleEDeploymentViewPoint returns [EObject current=null] : iv_ruleEDeploymentViewPoint= ruleEDeploymentViewPoint EOF ;
    public final EObject entryRuleEDeploymentViewPoint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEDeploymentViewPoint = null;


        try {
            // InternalMyDsl.g:1320:61: (iv_ruleEDeploymentViewPoint= ruleEDeploymentViewPoint EOF )
            // InternalMyDsl.g:1321:2: iv_ruleEDeploymentViewPoint= ruleEDeploymentViewPoint EOF
            {
             newCompositeNode(grammarAccess.getEDeploymentViewPointRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEDeploymentViewPoint=ruleEDeploymentViewPoint();

            state._fsp--;

             current =iv_ruleEDeploymentViewPoint; 
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
    // $ANTLR end "entryRuleEDeploymentViewPoint"


    // $ANTLR start "ruleEDeploymentViewPoint"
    // InternalMyDsl.g:1327:1: ruleEDeploymentViewPoint returns [EObject current=null] : (otherlv_0= 'EDeploymentViewPoint' otherlv_1= '<<' otherlv_2= 'allocationViewType:' ( (lv_allocationViewType_3_0= ruleEAllocationViewType ) ) otherlv_4= 'environmentViewType:' ( (lv_environmentViewType_5_0= ruleEEnvironmentViewType ) ) otherlv_6= '>>' ) ;
    public final EObject ruleEDeploymentViewPoint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_allocationViewType_3_0 = null;

        EObject lv_environmentViewType_5_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1333:2: ( (otherlv_0= 'EDeploymentViewPoint' otherlv_1= '<<' otherlv_2= 'allocationViewType:' ( (lv_allocationViewType_3_0= ruleEAllocationViewType ) ) otherlv_4= 'environmentViewType:' ( (lv_environmentViewType_5_0= ruleEEnvironmentViewType ) ) otherlv_6= '>>' ) )
            // InternalMyDsl.g:1334:2: (otherlv_0= 'EDeploymentViewPoint' otherlv_1= '<<' otherlv_2= 'allocationViewType:' ( (lv_allocationViewType_3_0= ruleEAllocationViewType ) ) otherlv_4= 'environmentViewType:' ( (lv_environmentViewType_5_0= ruleEEnvironmentViewType ) ) otherlv_6= '>>' )
            {
            // InternalMyDsl.g:1334:2: (otherlv_0= 'EDeploymentViewPoint' otherlv_1= '<<' otherlv_2= 'allocationViewType:' ( (lv_allocationViewType_3_0= ruleEAllocationViewType ) ) otherlv_4= 'environmentViewType:' ( (lv_environmentViewType_5_0= ruleEEnvironmentViewType ) ) otherlv_6= '>>' )
            // InternalMyDsl.g:1335:3: otherlv_0= 'EDeploymentViewPoint' otherlv_1= '<<' otherlv_2= 'allocationViewType:' ( (lv_allocationViewType_3_0= ruleEAllocationViewType ) ) otherlv_4= 'environmentViewType:' ( (lv_environmentViewType_5_0= ruleEEnvironmentViewType ) ) otherlv_6= '>>'
            {
            otherlv_0=(Token)match(input,46,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getEDeploymentViewPointAccess().getEDeploymentViewPointKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_38); 

            			newLeafNode(otherlv_1, grammarAccess.getEDeploymentViewPointAccess().getLessThanSignLessThanSignKeyword_1());
            		
            otherlv_2=(Token)match(input,47,FOLLOW_39); 

            			newLeafNode(otherlv_2, grammarAccess.getEDeploymentViewPointAccess().getAllocationViewTypeKeyword_2());
            		
            // InternalMyDsl.g:1347:3: ( (lv_allocationViewType_3_0= ruleEAllocationViewType ) )
            // InternalMyDsl.g:1348:4: (lv_allocationViewType_3_0= ruleEAllocationViewType )
            {
            // InternalMyDsl.g:1348:4: (lv_allocationViewType_3_0= ruleEAllocationViewType )
            // InternalMyDsl.g:1349:5: lv_allocationViewType_3_0= ruleEAllocationViewType
            {

            					newCompositeNode(grammarAccess.getEDeploymentViewPointAccess().getAllocationViewTypeEAllocationViewTypeParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_40);
            lv_allocationViewType_3_0=ruleEAllocationViewType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEDeploymentViewPointRule());
            					}
            					set(
            						current,
            						"allocationViewType",
            						lv_allocationViewType_3_0,
            						"org.xtext.example.mydsl.MyDsl.EAllocationViewType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,48,FOLLOW_41); 

            			newLeafNode(otherlv_4, grammarAccess.getEDeploymentViewPointAccess().getEnvironmentViewTypeKeyword_4());
            		
            // InternalMyDsl.g:1370:3: ( (lv_environmentViewType_5_0= ruleEEnvironmentViewType ) )
            // InternalMyDsl.g:1371:4: (lv_environmentViewType_5_0= ruleEEnvironmentViewType )
            {
            // InternalMyDsl.g:1371:4: (lv_environmentViewType_5_0= ruleEEnvironmentViewType )
            // InternalMyDsl.g:1372:5: lv_environmentViewType_5_0= ruleEEnvironmentViewType
            {

            					newCompositeNode(grammarAccess.getEDeploymentViewPointAccess().getEnvironmentViewTypeEEnvironmentViewTypeParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_18);
            lv_environmentViewType_5_0=ruleEEnvironmentViewType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEDeploymentViewPointRule());
            					}
            					set(
            						current,
            						"environmentViewType",
            						lv_environmentViewType_5_0,
            						"org.xtext.example.mydsl.MyDsl.EEnvironmentViewType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getEDeploymentViewPointAccess().getGreaterThanSignGreaterThanSignKeyword_6());
            		

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
    // $ANTLR end "ruleEDeploymentViewPoint"


    // $ANTLR start "entryRuleERepositoryViewType"
    // InternalMyDsl.g:1397:1: entryRuleERepositoryViewType returns [EObject current=null] : iv_ruleERepositoryViewType= ruleERepositoryViewType EOF ;
    public final EObject entryRuleERepositoryViewType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleERepositoryViewType = null;


        try {
            // InternalMyDsl.g:1397:60: (iv_ruleERepositoryViewType= ruleERepositoryViewType EOF )
            // InternalMyDsl.g:1398:2: iv_ruleERepositoryViewType= ruleERepositoryViewType EOF
            {
             newCompositeNode(grammarAccess.getERepositoryViewTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleERepositoryViewType=ruleERepositoryViewType();

            state._fsp--;

             current =iv_ruleERepositoryViewType; 
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
    // $ANTLR end "entryRuleERepositoryViewType"


    // $ANTLR start "ruleERepositoryViewType"
    // InternalMyDsl.g:1404:1: ruleERepositoryViewType returns [EObject current=null] : (otherlv_0= 'ERepositoryViewType' otherlv_1= '<<' (otherlv_2= 'showsInterfaces:' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* )? (otherlv_6= 'showsComponents:' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* )? otherlv_10= '>>' ) ;
    public final EObject ruleERepositoryViewType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1410:2: ( (otherlv_0= 'ERepositoryViewType' otherlv_1= '<<' (otherlv_2= 'showsInterfaces:' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* )? (otherlv_6= 'showsComponents:' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* )? otherlv_10= '>>' ) )
            // InternalMyDsl.g:1411:2: (otherlv_0= 'ERepositoryViewType' otherlv_1= '<<' (otherlv_2= 'showsInterfaces:' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* )? (otherlv_6= 'showsComponents:' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* )? otherlv_10= '>>' )
            {
            // InternalMyDsl.g:1411:2: (otherlv_0= 'ERepositoryViewType' otherlv_1= '<<' (otherlv_2= 'showsInterfaces:' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* )? (otherlv_6= 'showsComponents:' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* )? otherlv_10= '>>' )
            // InternalMyDsl.g:1412:3: otherlv_0= 'ERepositoryViewType' otherlv_1= '<<' (otherlv_2= 'showsInterfaces:' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* )? (otherlv_6= 'showsComponents:' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* )? otherlv_10= '>>'
            {
            otherlv_0=(Token)match(input,49,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getERepositoryViewTypeAccess().getERepositoryViewTypeKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_42); 

            			newLeafNode(otherlv_1, grammarAccess.getERepositoryViewTypeAccess().getLessThanSignLessThanSignKeyword_1());
            		
            // InternalMyDsl.g:1420:3: (otherlv_2= 'showsInterfaces:' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==50) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalMyDsl.g:1421:4: otherlv_2= 'showsInterfaces:' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )*
                    {
                    otherlv_2=(Token)match(input,50,FOLLOW_5); 

                    				newLeafNode(otherlv_2, grammarAccess.getERepositoryViewTypeAccess().getShowsInterfacesKeyword_2_0());
                    			
                    // InternalMyDsl.g:1425:4: ( (otherlv_3= RULE_ID ) )
                    // InternalMyDsl.g:1426:5: (otherlv_3= RULE_ID )
                    {
                    // InternalMyDsl.g:1426:5: (otherlv_3= RULE_ID )
                    // InternalMyDsl.g:1427:6: otherlv_3= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getERepositoryViewTypeRule());
                    						}
                    					
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_43); 

                    						newLeafNode(otherlv_3, grammarAccess.getERepositoryViewTypeAccess().getShowsInterfacesEInterfaceCrossReference_2_1_0());
                    					

                    }


                    }

                    // InternalMyDsl.g:1438:4: (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )*
                    loop36:
                    do {
                        int alt36=2;
                        int LA36_0 = input.LA(1);

                        if ( (LA36_0==14) ) {
                            alt36=1;
                        }


                        switch (alt36) {
                    	case 1 :
                    	    // InternalMyDsl.g:1439:5: otherlv_4= ',' ( (otherlv_5= RULE_ID ) )
                    	    {
                    	    otherlv_4=(Token)match(input,14,FOLLOW_5); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getERepositoryViewTypeAccess().getCommaKeyword_2_2_0());
                    	    				
                    	    // InternalMyDsl.g:1443:5: ( (otherlv_5= RULE_ID ) )
                    	    // InternalMyDsl.g:1444:6: (otherlv_5= RULE_ID )
                    	    {
                    	    // InternalMyDsl.g:1444:6: (otherlv_5= RULE_ID )
                    	    // InternalMyDsl.g:1445:7: otherlv_5= RULE_ID
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getERepositoryViewTypeRule());
                    	    							}
                    	    						
                    	    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_43); 

                    	    							newLeafNode(otherlv_5, grammarAccess.getERepositoryViewTypeAccess().getShowsInterfacesEInterfaceCrossReference_2_2_1_0());
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop36;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalMyDsl.g:1458:3: (otherlv_6= 'showsComponents:' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==51) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalMyDsl.g:1459:4: otherlv_6= 'showsComponents:' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )*
                    {
                    otherlv_6=(Token)match(input,51,FOLLOW_5); 

                    				newLeafNode(otherlv_6, grammarAccess.getERepositoryViewTypeAccess().getShowsComponentsKeyword_3_0());
                    			
                    // InternalMyDsl.g:1463:4: ( (otherlv_7= RULE_ID ) )
                    // InternalMyDsl.g:1464:5: (otherlv_7= RULE_ID )
                    {
                    // InternalMyDsl.g:1464:5: (otherlv_7= RULE_ID )
                    // InternalMyDsl.g:1465:6: otherlv_7= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getERepositoryViewTypeRule());
                    						}
                    					
                    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_8); 

                    						newLeafNode(otherlv_7, grammarAccess.getERepositoryViewTypeAccess().getShowsComponentsEComponentCrossReference_3_1_0());
                    					

                    }


                    }

                    // InternalMyDsl.g:1476:4: (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )*
                    loop38:
                    do {
                        int alt38=2;
                        int LA38_0 = input.LA(1);

                        if ( (LA38_0==14) ) {
                            alt38=1;
                        }


                        switch (alt38) {
                    	case 1 :
                    	    // InternalMyDsl.g:1477:5: otherlv_8= ',' ( (otherlv_9= RULE_ID ) )
                    	    {
                    	    otherlv_8=(Token)match(input,14,FOLLOW_5); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getERepositoryViewTypeAccess().getCommaKeyword_3_2_0());
                    	    				
                    	    // InternalMyDsl.g:1481:5: ( (otherlv_9= RULE_ID ) )
                    	    // InternalMyDsl.g:1482:6: (otherlv_9= RULE_ID )
                    	    {
                    	    // InternalMyDsl.g:1482:6: (otherlv_9= RULE_ID )
                    	    // InternalMyDsl.g:1483:7: otherlv_9= RULE_ID
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getERepositoryViewTypeRule());
                    	    							}
                    	    						
                    	    otherlv_9=(Token)match(input,RULE_ID,FOLLOW_8); 

                    	    							newLeafNode(otherlv_9, grammarAccess.getERepositoryViewTypeAccess().getShowsComponentsEComponentCrossReference_3_2_1_0());
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop38;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_10=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getERepositoryViewTypeAccess().getGreaterThanSignGreaterThanSignKeyword_4());
            		

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
    // $ANTLR end "ruleERepositoryViewType"


    // $ANTLR start "entryRuleEAssemblyViewType"
    // InternalMyDsl.g:1504:1: entryRuleEAssemblyViewType returns [EObject current=null] : iv_ruleEAssemblyViewType= ruleEAssemblyViewType EOF ;
    public final EObject entryRuleEAssemblyViewType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEAssemblyViewType = null;


        try {
            // InternalMyDsl.g:1504:58: (iv_ruleEAssemblyViewType= ruleEAssemblyViewType EOF )
            // InternalMyDsl.g:1505:2: iv_ruleEAssemblyViewType= ruleEAssemblyViewType EOF
            {
             newCompositeNode(grammarAccess.getEAssemblyViewTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEAssemblyViewType=ruleEAssemblyViewType();

            state._fsp--;

             current =iv_ruleEAssemblyViewType; 
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
    // $ANTLR end "entryRuleEAssemblyViewType"


    // $ANTLR start "ruleEAssemblyViewType"
    // InternalMyDsl.g:1511:1: ruleEAssemblyViewType returns [EObject current=null] : (otherlv_0= 'EAssemblyViewType' otherlv_1= '<<' (otherlv_2= 'mainArtifacts:' ( (lv_mainArtifacts_3_0= ruleEAssemblyContext ) ) (otherlv_4= ',' ( (lv_mainArtifacts_5_0= ruleEAssemblyContext ) ) )* )? (otherlv_6= 'showsComponents:' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* )? otherlv_10= '>>' ) ;
    public final EObject ruleEAssemblyViewType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        EObject lv_mainArtifacts_3_0 = null;

        EObject lv_mainArtifacts_5_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1517:2: ( (otherlv_0= 'EAssemblyViewType' otherlv_1= '<<' (otherlv_2= 'mainArtifacts:' ( (lv_mainArtifacts_3_0= ruleEAssemblyContext ) ) (otherlv_4= ',' ( (lv_mainArtifacts_5_0= ruleEAssemblyContext ) ) )* )? (otherlv_6= 'showsComponents:' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* )? otherlv_10= '>>' ) )
            // InternalMyDsl.g:1518:2: (otherlv_0= 'EAssemblyViewType' otherlv_1= '<<' (otherlv_2= 'mainArtifacts:' ( (lv_mainArtifacts_3_0= ruleEAssemblyContext ) ) (otherlv_4= ',' ( (lv_mainArtifacts_5_0= ruleEAssemblyContext ) ) )* )? (otherlv_6= 'showsComponents:' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* )? otherlv_10= '>>' )
            {
            // InternalMyDsl.g:1518:2: (otherlv_0= 'EAssemblyViewType' otherlv_1= '<<' (otherlv_2= 'mainArtifacts:' ( (lv_mainArtifacts_3_0= ruleEAssemblyContext ) ) (otherlv_4= ',' ( (lv_mainArtifacts_5_0= ruleEAssemblyContext ) ) )* )? (otherlv_6= 'showsComponents:' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* )? otherlv_10= '>>' )
            // InternalMyDsl.g:1519:3: otherlv_0= 'EAssemblyViewType' otherlv_1= '<<' (otherlv_2= 'mainArtifacts:' ( (lv_mainArtifacts_3_0= ruleEAssemblyContext ) ) (otherlv_4= ',' ( (lv_mainArtifacts_5_0= ruleEAssemblyContext ) ) )* )? (otherlv_6= 'showsComponents:' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* )? otherlv_10= '>>'
            {
            otherlv_0=(Token)match(input,52,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getEAssemblyViewTypeAccess().getEAssemblyViewTypeKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_44); 

            			newLeafNode(otherlv_1, grammarAccess.getEAssemblyViewTypeAccess().getLessThanSignLessThanSignKeyword_1());
            		
            // InternalMyDsl.g:1527:3: (otherlv_2= 'mainArtifacts:' ( (lv_mainArtifacts_3_0= ruleEAssemblyContext ) ) (otherlv_4= ',' ( (lv_mainArtifacts_5_0= ruleEAssemblyContext ) ) )* )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==53) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalMyDsl.g:1528:4: otherlv_2= 'mainArtifacts:' ( (lv_mainArtifacts_3_0= ruleEAssemblyContext ) ) (otherlv_4= ',' ( (lv_mainArtifacts_5_0= ruleEAssemblyContext ) ) )*
                    {
                    otherlv_2=(Token)match(input,53,FOLLOW_45); 

                    				newLeafNode(otherlv_2, grammarAccess.getEAssemblyViewTypeAccess().getMainArtifactsKeyword_2_0());
                    			
                    // InternalMyDsl.g:1532:4: ( (lv_mainArtifacts_3_0= ruleEAssemblyContext ) )
                    // InternalMyDsl.g:1533:5: (lv_mainArtifacts_3_0= ruleEAssemblyContext )
                    {
                    // InternalMyDsl.g:1533:5: (lv_mainArtifacts_3_0= ruleEAssemblyContext )
                    // InternalMyDsl.g:1534:6: lv_mainArtifacts_3_0= ruleEAssemblyContext
                    {

                    						newCompositeNode(grammarAccess.getEAssemblyViewTypeAccess().getMainArtifactsEAssemblyContextParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_43);
                    lv_mainArtifacts_3_0=ruleEAssemblyContext();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEAssemblyViewTypeRule());
                    						}
                    						add(
                    							current,
                    							"mainArtifacts",
                    							lv_mainArtifacts_3_0,
                    							"org.xtext.example.mydsl.MyDsl.EAssemblyContext");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:1551:4: (otherlv_4= ',' ( (lv_mainArtifacts_5_0= ruleEAssemblyContext ) ) )*
                    loop40:
                    do {
                        int alt40=2;
                        int LA40_0 = input.LA(1);

                        if ( (LA40_0==14) ) {
                            alt40=1;
                        }


                        switch (alt40) {
                    	case 1 :
                    	    // InternalMyDsl.g:1552:5: otherlv_4= ',' ( (lv_mainArtifacts_5_0= ruleEAssemblyContext ) )
                    	    {
                    	    otherlv_4=(Token)match(input,14,FOLLOW_45); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getEAssemblyViewTypeAccess().getCommaKeyword_2_2_0());
                    	    				
                    	    // InternalMyDsl.g:1556:5: ( (lv_mainArtifacts_5_0= ruleEAssemblyContext ) )
                    	    // InternalMyDsl.g:1557:6: (lv_mainArtifacts_5_0= ruleEAssemblyContext )
                    	    {
                    	    // InternalMyDsl.g:1557:6: (lv_mainArtifacts_5_0= ruleEAssemblyContext )
                    	    // InternalMyDsl.g:1558:7: lv_mainArtifacts_5_0= ruleEAssemblyContext
                    	    {

                    	    							newCompositeNode(grammarAccess.getEAssemblyViewTypeAccess().getMainArtifactsEAssemblyContextParserRuleCall_2_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_43);
                    	    lv_mainArtifacts_5_0=ruleEAssemblyContext();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getEAssemblyViewTypeRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"mainArtifacts",
                    	    								lv_mainArtifacts_5_0,
                    	    								"org.xtext.example.mydsl.MyDsl.EAssemblyContext");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop40;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalMyDsl.g:1577:3: (otherlv_6= 'showsComponents:' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==51) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalMyDsl.g:1578:4: otherlv_6= 'showsComponents:' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )*
                    {
                    otherlv_6=(Token)match(input,51,FOLLOW_5); 

                    				newLeafNode(otherlv_6, grammarAccess.getEAssemblyViewTypeAccess().getShowsComponentsKeyword_3_0());
                    			
                    // InternalMyDsl.g:1582:4: ( (otherlv_7= RULE_ID ) )
                    // InternalMyDsl.g:1583:5: (otherlv_7= RULE_ID )
                    {
                    // InternalMyDsl.g:1583:5: (otherlv_7= RULE_ID )
                    // InternalMyDsl.g:1584:6: otherlv_7= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEAssemblyViewTypeRule());
                    						}
                    					
                    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_8); 

                    						newLeafNode(otherlv_7, grammarAccess.getEAssemblyViewTypeAccess().getShowsComponentsEComponentCrossReference_3_1_0());
                    					

                    }


                    }

                    // InternalMyDsl.g:1595:4: (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )*
                    loop42:
                    do {
                        int alt42=2;
                        int LA42_0 = input.LA(1);

                        if ( (LA42_0==14) ) {
                            alt42=1;
                        }


                        switch (alt42) {
                    	case 1 :
                    	    // InternalMyDsl.g:1596:5: otherlv_8= ',' ( (otherlv_9= RULE_ID ) )
                    	    {
                    	    otherlv_8=(Token)match(input,14,FOLLOW_5); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getEAssemblyViewTypeAccess().getCommaKeyword_3_2_0());
                    	    				
                    	    // InternalMyDsl.g:1600:5: ( (otherlv_9= RULE_ID ) )
                    	    // InternalMyDsl.g:1601:6: (otherlv_9= RULE_ID )
                    	    {
                    	    // InternalMyDsl.g:1601:6: (otherlv_9= RULE_ID )
                    	    // InternalMyDsl.g:1602:7: otherlv_9= RULE_ID
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getEAssemblyViewTypeRule());
                    	    							}
                    	    						
                    	    otherlv_9=(Token)match(input,RULE_ID,FOLLOW_8); 

                    	    							newLeafNode(otherlv_9, grammarAccess.getEAssemblyViewTypeAccess().getShowsComponentsEComponentCrossReference_3_2_1_0());
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop42;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_10=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getEAssemblyViewTypeAccess().getGreaterThanSignGreaterThanSignKeyword_4());
            		

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
    // $ANTLR end "ruleEAssemblyViewType"


    // $ANTLR start "entryRuleEAllocationViewType"
    // InternalMyDsl.g:1623:1: entryRuleEAllocationViewType returns [EObject current=null] : iv_ruleEAllocationViewType= ruleEAllocationViewType EOF ;
    public final EObject entryRuleEAllocationViewType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEAllocationViewType = null;


        try {
            // InternalMyDsl.g:1623:60: (iv_ruleEAllocationViewType= ruleEAllocationViewType EOF )
            // InternalMyDsl.g:1624:2: iv_ruleEAllocationViewType= ruleEAllocationViewType EOF
            {
             newCompositeNode(grammarAccess.getEAllocationViewTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEAllocationViewType=ruleEAllocationViewType();

            state._fsp--;

             current =iv_ruleEAllocationViewType; 
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
    // $ANTLR end "entryRuleEAllocationViewType"


    // $ANTLR start "ruleEAllocationViewType"
    // InternalMyDsl.g:1630:1: ruleEAllocationViewType returns [EObject current=null] : (otherlv_0= 'EAllocationViewType' otherlv_1= '<<' (otherlv_2= 'includes:' ( (lv_includes_3_0= ruleEAllocationContext ) ) (otherlv_4= ',' ( (lv_includes_5_0= ruleEAllocationContext ) ) )* )? otherlv_6= '>>' ) ;
    public final EObject ruleEAllocationViewType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_includes_3_0 = null;

        EObject lv_includes_5_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1636:2: ( (otherlv_0= 'EAllocationViewType' otherlv_1= '<<' (otherlv_2= 'includes:' ( (lv_includes_3_0= ruleEAllocationContext ) ) (otherlv_4= ',' ( (lv_includes_5_0= ruleEAllocationContext ) ) )* )? otherlv_6= '>>' ) )
            // InternalMyDsl.g:1637:2: (otherlv_0= 'EAllocationViewType' otherlv_1= '<<' (otherlv_2= 'includes:' ( (lv_includes_3_0= ruleEAllocationContext ) ) (otherlv_4= ',' ( (lv_includes_5_0= ruleEAllocationContext ) ) )* )? otherlv_6= '>>' )
            {
            // InternalMyDsl.g:1637:2: (otherlv_0= 'EAllocationViewType' otherlv_1= '<<' (otherlv_2= 'includes:' ( (lv_includes_3_0= ruleEAllocationContext ) ) (otherlv_4= ',' ( (lv_includes_5_0= ruleEAllocationContext ) ) )* )? otherlv_6= '>>' )
            // InternalMyDsl.g:1638:3: otherlv_0= 'EAllocationViewType' otherlv_1= '<<' (otherlv_2= 'includes:' ( (lv_includes_3_0= ruleEAllocationContext ) ) (otherlv_4= ',' ( (lv_includes_5_0= ruleEAllocationContext ) ) )* )? otherlv_6= '>>'
            {
            otherlv_0=(Token)match(input,54,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getEAllocationViewTypeAccess().getEAllocationViewTypeKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_46); 

            			newLeafNode(otherlv_1, grammarAccess.getEAllocationViewTypeAccess().getLessThanSignLessThanSignKeyword_1());
            		
            // InternalMyDsl.g:1646:3: (otherlv_2= 'includes:' ( (lv_includes_3_0= ruleEAllocationContext ) ) (otherlv_4= ',' ( (lv_includes_5_0= ruleEAllocationContext ) ) )* )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==55) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalMyDsl.g:1647:4: otherlv_2= 'includes:' ( (lv_includes_3_0= ruleEAllocationContext ) ) (otherlv_4= ',' ( (lv_includes_5_0= ruleEAllocationContext ) ) )*
                    {
                    otherlv_2=(Token)match(input,55,FOLLOW_47); 

                    				newLeafNode(otherlv_2, grammarAccess.getEAllocationViewTypeAccess().getIncludesKeyword_2_0());
                    			
                    // InternalMyDsl.g:1651:4: ( (lv_includes_3_0= ruleEAllocationContext ) )
                    // InternalMyDsl.g:1652:5: (lv_includes_3_0= ruleEAllocationContext )
                    {
                    // InternalMyDsl.g:1652:5: (lv_includes_3_0= ruleEAllocationContext )
                    // InternalMyDsl.g:1653:6: lv_includes_3_0= ruleEAllocationContext
                    {

                    						newCompositeNode(grammarAccess.getEAllocationViewTypeAccess().getIncludesEAllocationContextParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_includes_3_0=ruleEAllocationContext();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEAllocationViewTypeRule());
                    						}
                    						add(
                    							current,
                    							"includes",
                    							lv_includes_3_0,
                    							"org.xtext.example.mydsl.MyDsl.EAllocationContext");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:1670:4: (otherlv_4= ',' ( (lv_includes_5_0= ruleEAllocationContext ) ) )*
                    loop44:
                    do {
                        int alt44=2;
                        int LA44_0 = input.LA(1);

                        if ( (LA44_0==14) ) {
                            alt44=1;
                        }


                        switch (alt44) {
                    	case 1 :
                    	    // InternalMyDsl.g:1671:5: otherlv_4= ',' ( (lv_includes_5_0= ruleEAllocationContext ) )
                    	    {
                    	    otherlv_4=(Token)match(input,14,FOLLOW_47); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getEAllocationViewTypeAccess().getCommaKeyword_2_2_0());
                    	    				
                    	    // InternalMyDsl.g:1675:5: ( (lv_includes_5_0= ruleEAllocationContext ) )
                    	    // InternalMyDsl.g:1676:6: (lv_includes_5_0= ruleEAllocationContext )
                    	    {
                    	    // InternalMyDsl.g:1676:6: (lv_includes_5_0= ruleEAllocationContext )
                    	    // InternalMyDsl.g:1677:7: lv_includes_5_0= ruleEAllocationContext
                    	    {

                    	    							newCompositeNode(grammarAccess.getEAllocationViewTypeAccess().getIncludesEAllocationContextParserRuleCall_2_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_includes_5_0=ruleEAllocationContext();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getEAllocationViewTypeRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"includes",
                    	    								lv_includes_5_0,
                    	    								"org.xtext.example.mydsl.MyDsl.EAllocationContext");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop44;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getEAllocationViewTypeAccess().getGreaterThanSignGreaterThanSignKeyword_3());
            		

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
    // $ANTLR end "ruleEAllocationViewType"


    // $ANTLR start "entryRuleEEnvironmentViewType"
    // InternalMyDsl.g:1704:1: entryRuleEEnvironmentViewType returns [EObject current=null] : iv_ruleEEnvironmentViewType= ruleEEnvironmentViewType EOF ;
    public final EObject entryRuleEEnvironmentViewType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEEnvironmentViewType = null;


        try {
            // InternalMyDsl.g:1704:61: (iv_ruleEEnvironmentViewType= ruleEEnvironmentViewType EOF )
            // InternalMyDsl.g:1705:2: iv_ruleEEnvironmentViewType= ruleEEnvironmentViewType EOF
            {
             newCompositeNode(grammarAccess.getEEnvironmentViewTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEEnvironmentViewType=ruleEEnvironmentViewType();

            state._fsp--;

             current =iv_ruleEEnvironmentViewType; 
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
    // $ANTLR end "entryRuleEEnvironmentViewType"


    // $ANTLR start "ruleEEnvironmentViewType"
    // InternalMyDsl.g:1711:1: ruleEEnvironmentViewType returns [EObject current=null] : (otherlv_0= 'EEnvironmentViewType' otherlv_1= '<<' (otherlv_2= 'showsLinks:' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* )? (otherlv_6= 'showsContainers:' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* )? otherlv_10= '>>' ) ;
    public final EObject ruleEEnvironmentViewType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1717:2: ( (otherlv_0= 'EEnvironmentViewType' otherlv_1= '<<' (otherlv_2= 'showsLinks:' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* )? (otherlv_6= 'showsContainers:' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* )? otherlv_10= '>>' ) )
            // InternalMyDsl.g:1718:2: (otherlv_0= 'EEnvironmentViewType' otherlv_1= '<<' (otherlv_2= 'showsLinks:' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* )? (otherlv_6= 'showsContainers:' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* )? otherlv_10= '>>' )
            {
            // InternalMyDsl.g:1718:2: (otherlv_0= 'EEnvironmentViewType' otherlv_1= '<<' (otherlv_2= 'showsLinks:' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* )? (otherlv_6= 'showsContainers:' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* )? otherlv_10= '>>' )
            // InternalMyDsl.g:1719:3: otherlv_0= 'EEnvironmentViewType' otherlv_1= '<<' (otherlv_2= 'showsLinks:' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* )? (otherlv_6= 'showsContainers:' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* )? otherlv_10= '>>'
            {
            otherlv_0=(Token)match(input,56,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getEEnvironmentViewTypeAccess().getEEnvironmentViewTypeKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_48); 

            			newLeafNode(otherlv_1, grammarAccess.getEEnvironmentViewTypeAccess().getLessThanSignLessThanSignKeyword_1());
            		
            // InternalMyDsl.g:1727:3: (otherlv_2= 'showsLinks:' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==57) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalMyDsl.g:1728:4: otherlv_2= 'showsLinks:' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )*
                    {
                    otherlv_2=(Token)match(input,57,FOLLOW_5); 

                    				newLeafNode(otherlv_2, grammarAccess.getEEnvironmentViewTypeAccess().getShowsLinksKeyword_2_0());
                    			
                    // InternalMyDsl.g:1732:4: ( (otherlv_3= RULE_ID ) )
                    // InternalMyDsl.g:1733:5: (otherlv_3= RULE_ID )
                    {
                    // InternalMyDsl.g:1733:5: (otherlv_3= RULE_ID )
                    // InternalMyDsl.g:1734:6: otherlv_3= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEEnvironmentViewTypeRule());
                    						}
                    					
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_49); 

                    						newLeafNode(otherlv_3, grammarAccess.getEEnvironmentViewTypeAccess().getShowsLinksELinkCrossReference_2_1_0());
                    					

                    }


                    }

                    // InternalMyDsl.g:1745:4: (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )*
                    loop46:
                    do {
                        int alt46=2;
                        int LA46_0 = input.LA(1);

                        if ( (LA46_0==14) ) {
                            alt46=1;
                        }


                        switch (alt46) {
                    	case 1 :
                    	    // InternalMyDsl.g:1746:5: otherlv_4= ',' ( (otherlv_5= RULE_ID ) )
                    	    {
                    	    otherlv_4=(Token)match(input,14,FOLLOW_5); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getEEnvironmentViewTypeAccess().getCommaKeyword_2_2_0());
                    	    				
                    	    // InternalMyDsl.g:1750:5: ( (otherlv_5= RULE_ID ) )
                    	    // InternalMyDsl.g:1751:6: (otherlv_5= RULE_ID )
                    	    {
                    	    // InternalMyDsl.g:1751:6: (otherlv_5= RULE_ID )
                    	    // InternalMyDsl.g:1752:7: otherlv_5= RULE_ID
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getEEnvironmentViewTypeRule());
                    	    							}
                    	    						
                    	    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_49); 

                    	    							newLeafNode(otherlv_5, grammarAccess.getEEnvironmentViewTypeAccess().getShowsLinksELinkCrossReference_2_2_1_0());
                    	    						

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

            // InternalMyDsl.g:1765:3: (otherlv_6= 'showsContainers:' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==58) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalMyDsl.g:1766:4: otherlv_6= 'showsContainers:' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )*
                    {
                    otherlv_6=(Token)match(input,58,FOLLOW_5); 

                    				newLeafNode(otherlv_6, grammarAccess.getEEnvironmentViewTypeAccess().getShowsContainersKeyword_3_0());
                    			
                    // InternalMyDsl.g:1770:4: ( (otherlv_7= RULE_ID ) )
                    // InternalMyDsl.g:1771:5: (otherlv_7= RULE_ID )
                    {
                    // InternalMyDsl.g:1771:5: (otherlv_7= RULE_ID )
                    // InternalMyDsl.g:1772:6: otherlv_7= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEEnvironmentViewTypeRule());
                    						}
                    					
                    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_8); 

                    						newLeafNode(otherlv_7, grammarAccess.getEEnvironmentViewTypeAccess().getShowsContainersEContainerCrossReference_3_1_0());
                    					

                    }


                    }

                    // InternalMyDsl.g:1783:4: (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )*
                    loop48:
                    do {
                        int alt48=2;
                        int LA48_0 = input.LA(1);

                        if ( (LA48_0==14) ) {
                            alt48=1;
                        }


                        switch (alt48) {
                    	case 1 :
                    	    // InternalMyDsl.g:1784:5: otherlv_8= ',' ( (otherlv_9= RULE_ID ) )
                    	    {
                    	    otherlv_8=(Token)match(input,14,FOLLOW_5); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getEEnvironmentViewTypeAccess().getCommaKeyword_3_2_0());
                    	    				
                    	    // InternalMyDsl.g:1788:5: ( (otherlv_9= RULE_ID ) )
                    	    // InternalMyDsl.g:1789:6: (otherlv_9= RULE_ID )
                    	    {
                    	    // InternalMyDsl.g:1789:6: (otherlv_9= RULE_ID )
                    	    // InternalMyDsl.g:1790:7: otherlv_9= RULE_ID
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getEEnvironmentViewTypeRule());
                    	    							}
                    	    						
                    	    otherlv_9=(Token)match(input,RULE_ID,FOLLOW_8); 

                    	    							newLeafNode(otherlv_9, grammarAccess.getEEnvironmentViewTypeAccess().getShowsContainersEContainerCrossReference_3_2_1_0());
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop48;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_10=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getEEnvironmentViewTypeAccess().getGreaterThanSignGreaterThanSignKeyword_4());
            		

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
    // $ANTLR end "ruleEEnvironmentViewType"


    // $ANTLR start "entryRuleEComponent"
    // InternalMyDsl.g:1811:1: entryRuleEComponent returns [EObject current=null] : iv_ruleEComponent= ruleEComponent EOF ;
    public final EObject entryRuleEComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEComponent = null;


        try {
            // InternalMyDsl.g:1811:51: (iv_ruleEComponent= ruleEComponent EOF )
            // InternalMyDsl.g:1812:2: iv_ruleEComponent= ruleEComponent EOF
            {
             newCompositeNode(grammarAccess.getEComponentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEComponent=ruleEComponent();

            state._fsp--;

             current =iv_ruleEComponent; 
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
    // $ANTLR end "entryRuleEComponent"


    // $ANTLR start "ruleEComponent"
    // InternalMyDsl.g:1818:1: ruleEComponent returns [EObject current=null] : (this_EComponent_Impl_0= ruleEComponent_Impl | this_ECompositeComponent_1= ruleECompositeComponent ) ;
    public final EObject ruleEComponent() throws RecognitionException {
        EObject current = null;

        EObject this_EComponent_Impl_0 = null;

        EObject this_ECompositeComponent_1 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1824:2: ( (this_EComponent_Impl_0= ruleEComponent_Impl | this_ECompositeComponent_1= ruleECompositeComponent ) )
            // InternalMyDsl.g:1825:2: (this_EComponent_Impl_0= ruleEComponent_Impl | this_ECompositeComponent_1= ruleECompositeComponent )
            {
            // InternalMyDsl.g:1825:2: (this_EComponent_Impl_0= ruleEComponent_Impl | this_ECompositeComponent_1= ruleECompositeComponent )
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==59) ) {
                alt50=1;
            }
            else if ( (LA50_0==18) ) {
                alt50=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }
            switch (alt50) {
                case 1 :
                    // InternalMyDsl.g:1826:3: this_EComponent_Impl_0= ruleEComponent_Impl
                    {

                    			newCompositeNode(grammarAccess.getEComponentAccess().getEComponent_ImplParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_EComponent_Impl_0=ruleEComponent_Impl();

                    state._fsp--;


                    			current = this_EComponent_Impl_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1835:3: this_ECompositeComponent_1= ruleECompositeComponent
                    {

                    			newCompositeNode(grammarAccess.getEComponentAccess().getECompositeComponentParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ECompositeComponent_1=ruleECompositeComponent();

                    state._fsp--;


                    			current = this_ECompositeComponent_1;
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
    // $ANTLR end "ruleEComponent"


    // $ANTLR start "entryRuleEComponent_Impl"
    // InternalMyDsl.g:1847:1: entryRuleEComponent_Impl returns [EObject current=null] : iv_ruleEComponent_Impl= ruleEComponent_Impl EOF ;
    public final EObject entryRuleEComponent_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEComponent_Impl = null;


        try {
            // InternalMyDsl.g:1847:56: (iv_ruleEComponent_Impl= ruleEComponent_Impl EOF )
            // InternalMyDsl.g:1848:2: iv_ruleEComponent_Impl= ruleEComponent_Impl EOF
            {
             newCompositeNode(grammarAccess.getEComponent_ImplRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEComponent_Impl=ruleEComponent_Impl();

            state._fsp--;

             current =iv_ruleEComponent_Impl; 
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
    // $ANTLR end "entryRuleEComponent_Impl"


    // $ANTLR start "ruleEComponent_Impl"
    // InternalMyDsl.g:1854:1: ruleEComponent_Impl returns [EObject current=null] : (otherlv_0= 'EComponent' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '<<' (otherlv_3= 'providesInterfaceTo:' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* )? (otherlv_7= 'usesInterfaceFrom:' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* )? (otherlv_11= 'providesDirectly:' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* )? (otherlv_15= 'provides:' ( ( ruleEString ) ) (otherlv_17= ',' ( ( ruleEString ) ) )* )? (otherlv_19= 'requires:' ( ( ruleEString ) ) (otherlv_21= ',' ( ( ruleEString ) ) )* )? (otherlv_23= 'behaviourDescription:' ( (lv_behaviourDescription_24_0= ruleEBehaviourDescription ) ) )? otherlv_25= '>>' ) ;
    public final EObject ruleEComponent_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_behaviourDescription_24_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1860:2: ( (otherlv_0= 'EComponent' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '<<' (otherlv_3= 'providesInterfaceTo:' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* )? (otherlv_7= 'usesInterfaceFrom:' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* )? (otherlv_11= 'providesDirectly:' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* )? (otherlv_15= 'provides:' ( ( ruleEString ) ) (otherlv_17= ',' ( ( ruleEString ) ) )* )? (otherlv_19= 'requires:' ( ( ruleEString ) ) (otherlv_21= ',' ( ( ruleEString ) ) )* )? (otherlv_23= 'behaviourDescription:' ( (lv_behaviourDescription_24_0= ruleEBehaviourDescription ) ) )? otherlv_25= '>>' ) )
            // InternalMyDsl.g:1861:2: (otherlv_0= 'EComponent' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '<<' (otherlv_3= 'providesInterfaceTo:' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* )? (otherlv_7= 'usesInterfaceFrom:' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* )? (otherlv_11= 'providesDirectly:' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* )? (otherlv_15= 'provides:' ( ( ruleEString ) ) (otherlv_17= ',' ( ( ruleEString ) ) )* )? (otherlv_19= 'requires:' ( ( ruleEString ) ) (otherlv_21= ',' ( ( ruleEString ) ) )* )? (otherlv_23= 'behaviourDescription:' ( (lv_behaviourDescription_24_0= ruleEBehaviourDescription ) ) )? otherlv_25= '>>' )
            {
            // InternalMyDsl.g:1861:2: (otherlv_0= 'EComponent' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '<<' (otherlv_3= 'providesInterfaceTo:' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* )? (otherlv_7= 'usesInterfaceFrom:' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* )? (otherlv_11= 'providesDirectly:' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* )? (otherlv_15= 'provides:' ( ( ruleEString ) ) (otherlv_17= ',' ( ( ruleEString ) ) )* )? (otherlv_19= 'requires:' ( ( ruleEString ) ) (otherlv_21= ',' ( ( ruleEString ) ) )* )? (otherlv_23= 'behaviourDescription:' ( (lv_behaviourDescription_24_0= ruleEBehaviourDescription ) ) )? otherlv_25= '>>' )
            // InternalMyDsl.g:1862:3: otherlv_0= 'EComponent' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '<<' (otherlv_3= 'providesInterfaceTo:' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* )? (otherlv_7= 'usesInterfaceFrom:' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* )? (otherlv_11= 'providesDirectly:' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* )? (otherlv_15= 'provides:' ( ( ruleEString ) ) (otherlv_17= ',' ( ( ruleEString ) ) )* )? (otherlv_19= 'requires:' ( ( ruleEString ) ) (otherlv_21= ',' ( ( ruleEString ) ) )* )? (otherlv_23= 'behaviourDescription:' ( (lv_behaviourDescription_24_0= ruleEBehaviourDescription ) ) )? otherlv_25= '>>'
            {
            otherlv_0=(Token)match(input,59,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getEComponent_ImplAccess().getEComponentKeyword_0());
            		
            // InternalMyDsl.g:1866:3: ( (lv_name_1_0= ruleEString ) )
            // InternalMyDsl.g:1867:4: (lv_name_1_0= ruleEString )
            {
            // InternalMyDsl.g:1867:4: (lv_name_1_0= ruleEString )
            // InternalMyDsl.g:1868:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getEComponent_ImplAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEComponent_ImplRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_50); 

            			newLeafNode(otherlv_2, grammarAccess.getEComponent_ImplAccess().getLessThanSignLessThanSignKeyword_2());
            		
            // InternalMyDsl.g:1889:3: (otherlv_3= 'providesInterfaceTo:' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==19) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalMyDsl.g:1890:4: otherlv_3= 'providesInterfaceTo:' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )*
                    {
                    otherlv_3=(Token)match(input,19,FOLLOW_9); 

                    				newLeafNode(otherlv_3, grammarAccess.getEComponent_ImplAccess().getProvidesInterfaceToKeyword_3_0());
                    			
                    // InternalMyDsl.g:1894:4: ( ( ruleEString ) )
                    // InternalMyDsl.g:1895:5: ( ruleEString )
                    {
                    // InternalMyDsl.g:1895:5: ( ruleEString )
                    // InternalMyDsl.g:1896:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEComponent_ImplRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getEComponent_ImplAccess().getProvidesInterfaceToEComponentCrossReference_3_1_0());
                    					
                    pushFollow(FOLLOW_51);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:1910:4: (otherlv_5= ',' ( ( ruleEString ) ) )*
                    loop51:
                    do {
                        int alt51=2;
                        int LA51_0 = input.LA(1);

                        if ( (LA51_0==14) ) {
                            alt51=1;
                        }


                        switch (alt51) {
                    	case 1 :
                    	    // InternalMyDsl.g:1911:5: otherlv_5= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_5=(Token)match(input,14,FOLLOW_9); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getEComponent_ImplAccess().getCommaKeyword_3_2_0());
                    	    				
                    	    // InternalMyDsl.g:1915:5: ( ( ruleEString ) )
                    	    // InternalMyDsl.g:1916:6: ( ruleEString )
                    	    {
                    	    // InternalMyDsl.g:1916:6: ( ruleEString )
                    	    // InternalMyDsl.g:1917:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getEComponent_ImplRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getEComponent_ImplAccess().getProvidesInterfaceToEComponentCrossReference_3_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_51);
                    	    ruleEString();

                    	    state._fsp--;


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
                    break;

            }

            // InternalMyDsl.g:1933:3: (otherlv_7= 'usesInterfaceFrom:' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==20) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalMyDsl.g:1934:4: otherlv_7= 'usesInterfaceFrom:' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )*
                    {
                    otherlv_7=(Token)match(input,20,FOLLOW_9); 

                    				newLeafNode(otherlv_7, grammarAccess.getEComponent_ImplAccess().getUsesInterfaceFromKeyword_4_0());
                    			
                    // InternalMyDsl.g:1938:4: ( ( ruleEString ) )
                    // InternalMyDsl.g:1939:5: ( ruleEString )
                    {
                    // InternalMyDsl.g:1939:5: ( ruleEString )
                    // InternalMyDsl.g:1940:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEComponent_ImplRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getEComponent_ImplAccess().getUsesInterfaceFromEComponentCrossReference_4_1_0());
                    					
                    pushFollow(FOLLOW_52);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:1954:4: (otherlv_9= ',' ( ( ruleEString ) ) )*
                    loop53:
                    do {
                        int alt53=2;
                        int LA53_0 = input.LA(1);

                        if ( (LA53_0==14) ) {
                            alt53=1;
                        }


                        switch (alt53) {
                    	case 1 :
                    	    // InternalMyDsl.g:1955:5: otherlv_9= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_9=(Token)match(input,14,FOLLOW_9); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getEComponent_ImplAccess().getCommaKeyword_4_2_0());
                    	    				
                    	    // InternalMyDsl.g:1959:5: ( ( ruleEString ) )
                    	    // InternalMyDsl.g:1960:6: ( ruleEString )
                    	    {
                    	    // InternalMyDsl.g:1960:6: ( ruleEString )
                    	    // InternalMyDsl.g:1961:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getEComponent_ImplRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getEComponent_ImplAccess().getUsesInterfaceFromEComponentCrossReference_4_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_52);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop53;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalMyDsl.g:1977:3: (otherlv_11= 'providesDirectly:' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==21) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalMyDsl.g:1978:4: otherlv_11= 'providesDirectly:' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )*
                    {
                    otherlv_11=(Token)match(input,21,FOLLOW_9); 

                    				newLeafNode(otherlv_11, grammarAccess.getEComponent_ImplAccess().getProvidesDirectlyKeyword_5_0());
                    			
                    // InternalMyDsl.g:1982:4: ( ( ruleEString ) )
                    // InternalMyDsl.g:1983:5: ( ruleEString )
                    {
                    // InternalMyDsl.g:1983:5: ( ruleEString )
                    // InternalMyDsl.g:1984:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEComponent_ImplRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getEComponent_ImplAccess().getProvidesDirectlyEServiceCrossReference_5_1_0());
                    					
                    pushFollow(FOLLOW_53);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:1998:4: (otherlv_13= ',' ( ( ruleEString ) ) )*
                    loop55:
                    do {
                        int alt55=2;
                        int LA55_0 = input.LA(1);

                        if ( (LA55_0==14) ) {
                            alt55=1;
                        }


                        switch (alt55) {
                    	case 1 :
                    	    // InternalMyDsl.g:1999:5: otherlv_13= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_13=(Token)match(input,14,FOLLOW_9); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getEComponent_ImplAccess().getCommaKeyword_5_2_0());
                    	    				
                    	    // InternalMyDsl.g:2003:5: ( ( ruleEString ) )
                    	    // InternalMyDsl.g:2004:6: ( ruleEString )
                    	    {
                    	    // InternalMyDsl.g:2004:6: ( ruleEString )
                    	    // InternalMyDsl.g:2005:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getEComponent_ImplRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getEComponent_ImplAccess().getProvidesDirectlyEServiceCrossReference_5_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_53);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop55;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalMyDsl.g:2021:3: (otherlv_15= 'provides:' ( ( ruleEString ) ) (otherlv_17= ',' ( ( ruleEString ) ) )* )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==13) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalMyDsl.g:2022:4: otherlv_15= 'provides:' ( ( ruleEString ) ) (otherlv_17= ',' ( ( ruleEString ) ) )*
                    {
                    otherlv_15=(Token)match(input,13,FOLLOW_9); 

                    				newLeafNode(otherlv_15, grammarAccess.getEComponent_ImplAccess().getProvidesKeyword_6_0());
                    			
                    // InternalMyDsl.g:2026:4: ( ( ruleEString ) )
                    // InternalMyDsl.g:2027:5: ( ruleEString )
                    {
                    // InternalMyDsl.g:2027:5: ( ruleEString )
                    // InternalMyDsl.g:2028:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEComponent_ImplRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getEComponent_ImplAccess().getProvidesEInterfaceCrossReference_6_1_0());
                    					
                    pushFollow(FOLLOW_54);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:2042:4: (otherlv_17= ',' ( ( ruleEString ) ) )*
                    loop57:
                    do {
                        int alt57=2;
                        int LA57_0 = input.LA(1);

                        if ( (LA57_0==14) ) {
                            alt57=1;
                        }


                        switch (alt57) {
                    	case 1 :
                    	    // InternalMyDsl.g:2043:5: otherlv_17= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_17=(Token)match(input,14,FOLLOW_9); 

                    	    					newLeafNode(otherlv_17, grammarAccess.getEComponent_ImplAccess().getCommaKeyword_6_2_0());
                    	    				
                    	    // InternalMyDsl.g:2047:5: ( ( ruleEString ) )
                    	    // InternalMyDsl.g:2048:6: ( ruleEString )
                    	    {
                    	    // InternalMyDsl.g:2048:6: ( ruleEString )
                    	    // InternalMyDsl.g:2049:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getEComponent_ImplRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getEComponent_ImplAccess().getProvidesEInterfaceCrossReference_6_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_54);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop57;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalMyDsl.g:2065:3: (otherlv_19= 'requires:' ( ( ruleEString ) ) (otherlv_21= ',' ( ( ruleEString ) ) )* )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==15) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // InternalMyDsl.g:2066:4: otherlv_19= 'requires:' ( ( ruleEString ) ) (otherlv_21= ',' ( ( ruleEString ) ) )*
                    {
                    otherlv_19=(Token)match(input,15,FOLLOW_9); 

                    				newLeafNode(otherlv_19, grammarAccess.getEComponent_ImplAccess().getRequiresKeyword_7_0());
                    			
                    // InternalMyDsl.g:2070:4: ( ( ruleEString ) )
                    // InternalMyDsl.g:2071:5: ( ruleEString )
                    {
                    // InternalMyDsl.g:2071:5: ( ruleEString )
                    // InternalMyDsl.g:2072:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEComponent_ImplRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getEComponent_ImplAccess().getRequiresEInterfaceCrossReference_7_1_0());
                    					
                    pushFollow(FOLLOW_16);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:2086:4: (otherlv_21= ',' ( ( ruleEString ) ) )*
                    loop59:
                    do {
                        int alt59=2;
                        int LA59_0 = input.LA(1);

                        if ( (LA59_0==14) ) {
                            alt59=1;
                        }


                        switch (alt59) {
                    	case 1 :
                    	    // InternalMyDsl.g:2087:5: otherlv_21= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_21=(Token)match(input,14,FOLLOW_9); 

                    	    					newLeafNode(otherlv_21, grammarAccess.getEComponent_ImplAccess().getCommaKeyword_7_2_0());
                    	    				
                    	    // InternalMyDsl.g:2091:5: ( ( ruleEString ) )
                    	    // InternalMyDsl.g:2092:6: ( ruleEString )
                    	    {
                    	    // InternalMyDsl.g:2092:6: ( ruleEString )
                    	    // InternalMyDsl.g:2093:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getEComponent_ImplRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getEComponent_ImplAccess().getRequiresEInterfaceCrossReference_7_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_16);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop59;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalMyDsl.g:2109:3: (otherlv_23= 'behaviourDescription:' ( (lv_behaviourDescription_24_0= ruleEBehaviourDescription ) ) )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==22) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // InternalMyDsl.g:2110:4: otherlv_23= 'behaviourDescription:' ( (lv_behaviourDescription_24_0= ruleEBehaviourDescription ) )
                    {
                    otherlv_23=(Token)match(input,22,FOLLOW_17); 

                    				newLeafNode(otherlv_23, grammarAccess.getEComponent_ImplAccess().getBehaviourDescriptionKeyword_8_0());
                    			
                    // InternalMyDsl.g:2114:4: ( (lv_behaviourDescription_24_0= ruleEBehaviourDescription ) )
                    // InternalMyDsl.g:2115:5: (lv_behaviourDescription_24_0= ruleEBehaviourDescription )
                    {
                    // InternalMyDsl.g:2115:5: (lv_behaviourDescription_24_0= ruleEBehaviourDescription )
                    // InternalMyDsl.g:2116:6: lv_behaviourDescription_24_0= ruleEBehaviourDescription
                    {

                    						newCompositeNode(grammarAccess.getEComponent_ImplAccess().getBehaviourDescriptionEBehaviourDescriptionParserRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_18);
                    lv_behaviourDescription_24_0=ruleEBehaviourDescription();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEComponent_ImplRule());
                    						}
                    						set(
                    							current,
                    							"behaviourDescription",
                    							lv_behaviourDescription_24_0,
                    							"org.xtext.example.mydsl.MyDsl.EBehaviourDescription");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_25=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_25, grammarAccess.getEComponent_ImplAccess().getGreaterThanSignGreaterThanSignKeyword_9());
            		

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
    // $ANTLR end "ruleEComponent_Impl"


    // $ANTLR start "entryRuleEInterface"
    // InternalMyDsl.g:2142:1: entryRuleEInterface returns [EObject current=null] : iv_ruleEInterface= ruleEInterface EOF ;
    public final EObject entryRuleEInterface() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEInterface = null;


        try {
            // InternalMyDsl.g:2142:51: (iv_ruleEInterface= ruleEInterface EOF )
            // InternalMyDsl.g:2143:2: iv_ruleEInterface= ruleEInterface EOF
            {
             newCompositeNode(grammarAccess.getEInterfaceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEInterface=ruleEInterface();

            state._fsp--;

             current =iv_ruleEInterface; 
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
    // $ANTLR end "entryRuleEInterface"


    // $ANTLR start "ruleEInterface"
    // InternalMyDsl.g:2149:1: ruleEInterface returns [EObject current=null] : (otherlv_0= 'EInterface' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '<<' (otherlv_3= 'resultsIn:' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* )? (otherlv_7= 'providedByComponent:' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* )? (otherlv_11= 'providedBySystem:' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* )? (otherlv_15= 'requiredByComponent:' ( ( ruleEString ) ) (otherlv_17= ',' ( ( ruleEString ) ) )* )? (otherlv_19= 'requiredBySystem:' ( ( ruleEString ) ) (otherlv_21= ',' ( ( ruleEString ) ) )* )? (otherlv_23= 'signature:' ( (lv_signature_24_0= ruleESignature ) ) (otherlv_25= ',' ( (lv_signature_26_0= ruleESignature ) ) )* )? otherlv_27= '>>' ) ;
    public final EObject ruleEInterface() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token otherlv_27=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_signature_24_0 = null;

        EObject lv_signature_26_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2155:2: ( (otherlv_0= 'EInterface' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '<<' (otherlv_3= 'resultsIn:' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* )? (otherlv_7= 'providedByComponent:' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* )? (otherlv_11= 'providedBySystem:' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* )? (otherlv_15= 'requiredByComponent:' ( ( ruleEString ) ) (otherlv_17= ',' ( ( ruleEString ) ) )* )? (otherlv_19= 'requiredBySystem:' ( ( ruleEString ) ) (otherlv_21= ',' ( ( ruleEString ) ) )* )? (otherlv_23= 'signature:' ( (lv_signature_24_0= ruleESignature ) ) (otherlv_25= ',' ( (lv_signature_26_0= ruleESignature ) ) )* )? otherlv_27= '>>' ) )
            // InternalMyDsl.g:2156:2: (otherlv_0= 'EInterface' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '<<' (otherlv_3= 'resultsIn:' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* )? (otherlv_7= 'providedByComponent:' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* )? (otherlv_11= 'providedBySystem:' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* )? (otherlv_15= 'requiredByComponent:' ( ( ruleEString ) ) (otherlv_17= ',' ( ( ruleEString ) ) )* )? (otherlv_19= 'requiredBySystem:' ( ( ruleEString ) ) (otherlv_21= ',' ( ( ruleEString ) ) )* )? (otherlv_23= 'signature:' ( (lv_signature_24_0= ruleESignature ) ) (otherlv_25= ',' ( (lv_signature_26_0= ruleESignature ) ) )* )? otherlv_27= '>>' )
            {
            // InternalMyDsl.g:2156:2: (otherlv_0= 'EInterface' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '<<' (otherlv_3= 'resultsIn:' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* )? (otherlv_7= 'providedByComponent:' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* )? (otherlv_11= 'providedBySystem:' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* )? (otherlv_15= 'requiredByComponent:' ( ( ruleEString ) ) (otherlv_17= ',' ( ( ruleEString ) ) )* )? (otherlv_19= 'requiredBySystem:' ( ( ruleEString ) ) (otherlv_21= ',' ( ( ruleEString ) ) )* )? (otherlv_23= 'signature:' ( (lv_signature_24_0= ruleESignature ) ) (otherlv_25= ',' ( (lv_signature_26_0= ruleESignature ) ) )* )? otherlv_27= '>>' )
            // InternalMyDsl.g:2157:3: otherlv_0= 'EInterface' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '<<' (otherlv_3= 'resultsIn:' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* )? (otherlv_7= 'providedByComponent:' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* )? (otherlv_11= 'providedBySystem:' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* )? (otherlv_15= 'requiredByComponent:' ( ( ruleEString ) ) (otherlv_17= ',' ( ( ruleEString ) ) )* )? (otherlv_19= 'requiredBySystem:' ( ( ruleEString ) ) (otherlv_21= ',' ( ( ruleEString ) ) )* )? (otherlv_23= 'signature:' ( (lv_signature_24_0= ruleESignature ) ) (otherlv_25= ',' ( (lv_signature_26_0= ruleESignature ) ) )* )? otherlv_27= '>>'
            {
            otherlv_0=(Token)match(input,60,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getEInterfaceAccess().getEInterfaceKeyword_0());
            		
            // InternalMyDsl.g:2161:3: ( (lv_name_1_0= ruleEString ) )
            // InternalMyDsl.g:2162:4: (lv_name_1_0= ruleEString )
            {
            // InternalMyDsl.g:2162:4: (lv_name_1_0= ruleEString )
            // InternalMyDsl.g:2163:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getEInterfaceAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEInterfaceRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_55); 

            			newLeafNode(otherlv_2, grammarAccess.getEInterfaceAccess().getLessThanSignLessThanSignKeyword_2());
            		
            // InternalMyDsl.g:2184:3: (otherlv_3= 'resultsIn:' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==61) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // InternalMyDsl.g:2185:4: otherlv_3= 'resultsIn:' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )*
                    {
                    otherlv_3=(Token)match(input,61,FOLLOW_9); 

                    				newLeafNode(otherlv_3, grammarAccess.getEInterfaceAccess().getResultsInKeyword_3_0());
                    			
                    // InternalMyDsl.g:2189:4: ( ( ruleEString ) )
                    // InternalMyDsl.g:2190:5: ( ruleEString )
                    {
                    // InternalMyDsl.g:2190:5: ( ruleEString )
                    // InternalMyDsl.g:2191:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEInterfaceRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getEInterfaceAccess().getResultsInERoleCrossReference_3_1_0());
                    					
                    pushFollow(FOLLOW_56);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:2205:4: (otherlv_5= ',' ( ( ruleEString ) ) )*
                    loop62:
                    do {
                        int alt62=2;
                        int LA62_0 = input.LA(1);

                        if ( (LA62_0==14) ) {
                            alt62=1;
                        }


                        switch (alt62) {
                    	case 1 :
                    	    // InternalMyDsl.g:2206:5: otherlv_5= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_5=(Token)match(input,14,FOLLOW_9); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getEInterfaceAccess().getCommaKeyword_3_2_0());
                    	    				
                    	    // InternalMyDsl.g:2210:5: ( ( ruleEString ) )
                    	    // InternalMyDsl.g:2211:6: ( ruleEString )
                    	    {
                    	    // InternalMyDsl.g:2211:6: ( ruleEString )
                    	    // InternalMyDsl.g:2212:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getEInterfaceRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getEInterfaceAccess().getResultsInERoleCrossReference_3_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_56);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop62;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalMyDsl.g:2228:3: (otherlv_7= 'providedByComponent:' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==62) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // InternalMyDsl.g:2229:4: otherlv_7= 'providedByComponent:' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )*
                    {
                    otherlv_7=(Token)match(input,62,FOLLOW_9); 

                    				newLeafNode(otherlv_7, grammarAccess.getEInterfaceAccess().getProvidedByComponentKeyword_4_0());
                    			
                    // InternalMyDsl.g:2233:4: ( ( ruleEString ) )
                    // InternalMyDsl.g:2234:5: ( ruleEString )
                    {
                    // InternalMyDsl.g:2234:5: ( ruleEString )
                    // InternalMyDsl.g:2235:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEInterfaceRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getEInterfaceAccess().getProvidedByComponentEComponentCrossReference_4_1_0());
                    					
                    pushFollow(FOLLOW_57);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:2249:4: (otherlv_9= ',' ( ( ruleEString ) ) )*
                    loop64:
                    do {
                        int alt64=2;
                        int LA64_0 = input.LA(1);

                        if ( (LA64_0==14) ) {
                            alt64=1;
                        }


                        switch (alt64) {
                    	case 1 :
                    	    // InternalMyDsl.g:2250:5: otherlv_9= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_9=(Token)match(input,14,FOLLOW_9); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getEInterfaceAccess().getCommaKeyword_4_2_0());
                    	    				
                    	    // InternalMyDsl.g:2254:5: ( ( ruleEString ) )
                    	    // InternalMyDsl.g:2255:6: ( ruleEString )
                    	    {
                    	    // InternalMyDsl.g:2255:6: ( ruleEString )
                    	    // InternalMyDsl.g:2256:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getEInterfaceRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getEInterfaceAccess().getProvidedByComponentEComponentCrossReference_4_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_57);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop64;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalMyDsl.g:2272:3: (otherlv_11= 'providedBySystem:' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==63) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // InternalMyDsl.g:2273:4: otherlv_11= 'providedBySystem:' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )*
                    {
                    otherlv_11=(Token)match(input,63,FOLLOW_9); 

                    				newLeafNode(otherlv_11, grammarAccess.getEInterfaceAccess().getProvidedBySystemKeyword_5_0());
                    			
                    // InternalMyDsl.g:2277:4: ( ( ruleEString ) )
                    // InternalMyDsl.g:2278:5: ( ruleEString )
                    {
                    // InternalMyDsl.g:2278:5: ( ruleEString )
                    // InternalMyDsl.g:2279:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEInterfaceRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getEInterfaceAccess().getProvidedBySystemESystemCrossReference_5_1_0());
                    					
                    pushFollow(FOLLOW_58);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:2293:4: (otherlv_13= ',' ( ( ruleEString ) ) )*
                    loop66:
                    do {
                        int alt66=2;
                        int LA66_0 = input.LA(1);

                        if ( (LA66_0==14) ) {
                            alt66=1;
                        }


                        switch (alt66) {
                    	case 1 :
                    	    // InternalMyDsl.g:2294:5: otherlv_13= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_13=(Token)match(input,14,FOLLOW_9); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getEInterfaceAccess().getCommaKeyword_5_2_0());
                    	    				
                    	    // InternalMyDsl.g:2298:5: ( ( ruleEString ) )
                    	    // InternalMyDsl.g:2299:6: ( ruleEString )
                    	    {
                    	    // InternalMyDsl.g:2299:6: ( ruleEString )
                    	    // InternalMyDsl.g:2300:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getEInterfaceRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getEInterfaceAccess().getProvidedBySystemESystemCrossReference_5_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_58);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop66;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalMyDsl.g:2316:3: (otherlv_15= 'requiredByComponent:' ( ( ruleEString ) ) (otherlv_17= ',' ( ( ruleEString ) ) )* )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==64) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // InternalMyDsl.g:2317:4: otherlv_15= 'requiredByComponent:' ( ( ruleEString ) ) (otherlv_17= ',' ( ( ruleEString ) ) )*
                    {
                    otherlv_15=(Token)match(input,64,FOLLOW_9); 

                    				newLeafNode(otherlv_15, grammarAccess.getEInterfaceAccess().getRequiredByComponentKeyword_6_0());
                    			
                    // InternalMyDsl.g:2321:4: ( ( ruleEString ) )
                    // InternalMyDsl.g:2322:5: ( ruleEString )
                    {
                    // InternalMyDsl.g:2322:5: ( ruleEString )
                    // InternalMyDsl.g:2323:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEInterfaceRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getEInterfaceAccess().getRequiredByComponentEComponentCrossReference_6_1_0());
                    					
                    pushFollow(FOLLOW_59);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:2337:4: (otherlv_17= ',' ( ( ruleEString ) ) )*
                    loop68:
                    do {
                        int alt68=2;
                        int LA68_0 = input.LA(1);

                        if ( (LA68_0==14) ) {
                            alt68=1;
                        }


                        switch (alt68) {
                    	case 1 :
                    	    // InternalMyDsl.g:2338:5: otherlv_17= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_17=(Token)match(input,14,FOLLOW_9); 

                    	    					newLeafNode(otherlv_17, grammarAccess.getEInterfaceAccess().getCommaKeyword_6_2_0());
                    	    				
                    	    // InternalMyDsl.g:2342:5: ( ( ruleEString ) )
                    	    // InternalMyDsl.g:2343:6: ( ruleEString )
                    	    {
                    	    // InternalMyDsl.g:2343:6: ( ruleEString )
                    	    // InternalMyDsl.g:2344:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getEInterfaceRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getEInterfaceAccess().getRequiredByComponentEComponentCrossReference_6_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_59);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop68;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalMyDsl.g:2360:3: (otherlv_19= 'requiredBySystem:' ( ( ruleEString ) ) (otherlv_21= ',' ( ( ruleEString ) ) )* )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==65) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // InternalMyDsl.g:2361:4: otherlv_19= 'requiredBySystem:' ( ( ruleEString ) ) (otherlv_21= ',' ( ( ruleEString ) ) )*
                    {
                    otherlv_19=(Token)match(input,65,FOLLOW_9); 

                    				newLeafNode(otherlv_19, grammarAccess.getEInterfaceAccess().getRequiredBySystemKeyword_7_0());
                    			
                    // InternalMyDsl.g:2365:4: ( ( ruleEString ) )
                    // InternalMyDsl.g:2366:5: ( ruleEString )
                    {
                    // InternalMyDsl.g:2366:5: ( ruleEString )
                    // InternalMyDsl.g:2367:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEInterfaceRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getEInterfaceAccess().getRequiredBySystemESystemCrossReference_7_1_0());
                    					
                    pushFollow(FOLLOW_60);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:2381:4: (otherlv_21= ',' ( ( ruleEString ) ) )*
                    loop70:
                    do {
                        int alt70=2;
                        int LA70_0 = input.LA(1);

                        if ( (LA70_0==14) ) {
                            alt70=1;
                        }


                        switch (alt70) {
                    	case 1 :
                    	    // InternalMyDsl.g:2382:5: otherlv_21= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_21=(Token)match(input,14,FOLLOW_9); 

                    	    					newLeafNode(otherlv_21, grammarAccess.getEInterfaceAccess().getCommaKeyword_7_2_0());
                    	    				
                    	    // InternalMyDsl.g:2386:5: ( ( ruleEString ) )
                    	    // InternalMyDsl.g:2387:6: ( ruleEString )
                    	    {
                    	    // InternalMyDsl.g:2387:6: ( ruleEString )
                    	    // InternalMyDsl.g:2388:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getEInterfaceRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getEInterfaceAccess().getRequiredBySystemESystemCrossReference_7_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_60);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop70;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalMyDsl.g:2404:3: (otherlv_23= 'signature:' ( (lv_signature_24_0= ruleESignature ) ) (otherlv_25= ',' ( (lv_signature_26_0= ruleESignature ) ) )* )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==66) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // InternalMyDsl.g:2405:4: otherlv_23= 'signature:' ( (lv_signature_24_0= ruleESignature ) ) (otherlv_25= ',' ( (lv_signature_26_0= ruleESignature ) ) )*
                    {
                    otherlv_23=(Token)match(input,66,FOLLOW_61); 

                    				newLeafNode(otherlv_23, grammarAccess.getEInterfaceAccess().getSignatureKeyword_8_0());
                    			
                    // InternalMyDsl.g:2409:4: ( (lv_signature_24_0= ruleESignature ) )
                    // InternalMyDsl.g:2410:5: (lv_signature_24_0= ruleESignature )
                    {
                    // InternalMyDsl.g:2410:5: (lv_signature_24_0= ruleESignature )
                    // InternalMyDsl.g:2411:6: lv_signature_24_0= ruleESignature
                    {

                    						newCompositeNode(grammarAccess.getEInterfaceAccess().getSignatureESignatureParserRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_signature_24_0=ruleESignature();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEInterfaceRule());
                    						}
                    						add(
                    							current,
                    							"signature",
                    							lv_signature_24_0,
                    							"org.xtext.example.mydsl.MyDsl.ESignature");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:2428:4: (otherlv_25= ',' ( (lv_signature_26_0= ruleESignature ) ) )*
                    loop72:
                    do {
                        int alt72=2;
                        int LA72_0 = input.LA(1);

                        if ( (LA72_0==14) ) {
                            alt72=1;
                        }


                        switch (alt72) {
                    	case 1 :
                    	    // InternalMyDsl.g:2429:5: otherlv_25= ',' ( (lv_signature_26_0= ruleESignature ) )
                    	    {
                    	    otherlv_25=(Token)match(input,14,FOLLOW_61); 

                    	    					newLeafNode(otherlv_25, grammarAccess.getEInterfaceAccess().getCommaKeyword_8_2_0());
                    	    				
                    	    // InternalMyDsl.g:2433:5: ( (lv_signature_26_0= ruleESignature ) )
                    	    // InternalMyDsl.g:2434:6: (lv_signature_26_0= ruleESignature )
                    	    {
                    	    // InternalMyDsl.g:2434:6: (lv_signature_26_0= ruleESignature )
                    	    // InternalMyDsl.g:2435:7: lv_signature_26_0= ruleESignature
                    	    {

                    	    							newCompositeNode(grammarAccess.getEInterfaceAccess().getSignatureESignatureParserRuleCall_8_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_signature_26_0=ruleESignature();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getEInterfaceRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"signature",
                    	    								lv_signature_26_0,
                    	    								"org.xtext.example.mydsl.MyDsl.ESignature");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop72;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_27=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_27, grammarAccess.getEInterfaceAccess().getGreaterThanSignGreaterThanSignKeyword_9());
            		

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
    // $ANTLR end "ruleEInterface"


    // $ANTLR start "entryRuleEBehaviourDescription"
    // InternalMyDsl.g:2462:1: entryRuleEBehaviourDescription returns [EObject current=null] : iv_ruleEBehaviourDescription= ruleEBehaviourDescription EOF ;
    public final EObject entryRuleEBehaviourDescription() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEBehaviourDescription = null;


        try {
            // InternalMyDsl.g:2462:62: (iv_ruleEBehaviourDescription= ruleEBehaviourDescription EOF )
            // InternalMyDsl.g:2463:2: iv_ruleEBehaviourDescription= ruleEBehaviourDescription EOF
            {
             newCompositeNode(grammarAccess.getEBehaviourDescriptionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEBehaviourDescription=ruleEBehaviourDescription();

            state._fsp--;

             current =iv_ruleEBehaviourDescription; 
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
    // $ANTLR end "entryRuleEBehaviourDescription"


    // $ANTLR start "ruleEBehaviourDescription"
    // InternalMyDsl.g:2469:1: ruleEBehaviourDescription returns [EObject current=null] : (otherlv_0= 'EBehaviourDescription' otherlv_1= '<<' (otherlv_2= 'internalAction:' ( (lv_internalAction_3_0= ruleEInternalAction ) ) (otherlv_4= ',' ( (lv_internalAction_5_0= ruleEInternalAction ) ) )* )? (otherlv_6= 'loop:' ( (lv_loop_7_0= ruleELoop ) ) (otherlv_8= ',' ( (lv_loop_9_0= ruleELoop ) ) )* )? (otherlv_10= 'branch:' ( (lv_branch_11_0= ruleEBranch ) ) (otherlv_12= ',' ( (lv_branch_13_0= ruleEBranch ) ) )* )? (otherlv_14= 'externalCall:' ( (lv_externalCall_15_0= ruleEExternalCall ) ) (otherlv_16= ',' ( (lv_externalCall_17_0= ruleEExternalCall ) ) )* )? otherlv_18= '>>' ) ;
    public final EObject ruleEBehaviourDescription() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        EObject lv_internalAction_3_0 = null;

        EObject lv_internalAction_5_0 = null;

        EObject lv_loop_7_0 = null;

        EObject lv_loop_9_0 = null;

        EObject lv_branch_11_0 = null;

        EObject lv_branch_13_0 = null;

        EObject lv_externalCall_15_0 = null;

        EObject lv_externalCall_17_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2475:2: ( (otherlv_0= 'EBehaviourDescription' otherlv_1= '<<' (otherlv_2= 'internalAction:' ( (lv_internalAction_3_0= ruleEInternalAction ) ) (otherlv_4= ',' ( (lv_internalAction_5_0= ruleEInternalAction ) ) )* )? (otherlv_6= 'loop:' ( (lv_loop_7_0= ruleELoop ) ) (otherlv_8= ',' ( (lv_loop_9_0= ruleELoop ) ) )* )? (otherlv_10= 'branch:' ( (lv_branch_11_0= ruleEBranch ) ) (otherlv_12= ',' ( (lv_branch_13_0= ruleEBranch ) ) )* )? (otherlv_14= 'externalCall:' ( (lv_externalCall_15_0= ruleEExternalCall ) ) (otherlv_16= ',' ( (lv_externalCall_17_0= ruleEExternalCall ) ) )* )? otherlv_18= '>>' ) )
            // InternalMyDsl.g:2476:2: (otherlv_0= 'EBehaviourDescription' otherlv_1= '<<' (otherlv_2= 'internalAction:' ( (lv_internalAction_3_0= ruleEInternalAction ) ) (otherlv_4= ',' ( (lv_internalAction_5_0= ruleEInternalAction ) ) )* )? (otherlv_6= 'loop:' ( (lv_loop_7_0= ruleELoop ) ) (otherlv_8= ',' ( (lv_loop_9_0= ruleELoop ) ) )* )? (otherlv_10= 'branch:' ( (lv_branch_11_0= ruleEBranch ) ) (otherlv_12= ',' ( (lv_branch_13_0= ruleEBranch ) ) )* )? (otherlv_14= 'externalCall:' ( (lv_externalCall_15_0= ruleEExternalCall ) ) (otherlv_16= ',' ( (lv_externalCall_17_0= ruleEExternalCall ) ) )* )? otherlv_18= '>>' )
            {
            // InternalMyDsl.g:2476:2: (otherlv_0= 'EBehaviourDescription' otherlv_1= '<<' (otherlv_2= 'internalAction:' ( (lv_internalAction_3_0= ruleEInternalAction ) ) (otherlv_4= ',' ( (lv_internalAction_5_0= ruleEInternalAction ) ) )* )? (otherlv_6= 'loop:' ( (lv_loop_7_0= ruleELoop ) ) (otherlv_8= ',' ( (lv_loop_9_0= ruleELoop ) ) )* )? (otherlv_10= 'branch:' ( (lv_branch_11_0= ruleEBranch ) ) (otherlv_12= ',' ( (lv_branch_13_0= ruleEBranch ) ) )* )? (otherlv_14= 'externalCall:' ( (lv_externalCall_15_0= ruleEExternalCall ) ) (otherlv_16= ',' ( (lv_externalCall_17_0= ruleEExternalCall ) ) )* )? otherlv_18= '>>' )
            // InternalMyDsl.g:2477:3: otherlv_0= 'EBehaviourDescription' otherlv_1= '<<' (otherlv_2= 'internalAction:' ( (lv_internalAction_3_0= ruleEInternalAction ) ) (otherlv_4= ',' ( (lv_internalAction_5_0= ruleEInternalAction ) ) )* )? (otherlv_6= 'loop:' ( (lv_loop_7_0= ruleELoop ) ) (otherlv_8= ',' ( (lv_loop_9_0= ruleELoop ) ) )* )? (otherlv_10= 'branch:' ( (lv_branch_11_0= ruleEBranch ) ) (otherlv_12= ',' ( (lv_branch_13_0= ruleEBranch ) ) )* )? (otherlv_14= 'externalCall:' ( (lv_externalCall_15_0= ruleEExternalCall ) ) (otherlv_16= ',' ( (lv_externalCall_17_0= ruleEExternalCall ) ) )* )? otherlv_18= '>>'
            {
            otherlv_0=(Token)match(input,67,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getEBehaviourDescriptionAccess().getEBehaviourDescriptionKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_62); 

            			newLeafNode(otherlv_1, grammarAccess.getEBehaviourDescriptionAccess().getLessThanSignLessThanSignKeyword_1());
            		
            // InternalMyDsl.g:2485:3: (otherlv_2= 'internalAction:' ( (lv_internalAction_3_0= ruleEInternalAction ) ) (otherlv_4= ',' ( (lv_internalAction_5_0= ruleEInternalAction ) ) )* )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==68) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // InternalMyDsl.g:2486:4: otherlv_2= 'internalAction:' ( (lv_internalAction_3_0= ruleEInternalAction ) ) (otherlv_4= ',' ( (lv_internalAction_5_0= ruleEInternalAction ) ) )*
                    {
                    otherlv_2=(Token)match(input,68,FOLLOW_63); 

                    				newLeafNode(otherlv_2, grammarAccess.getEBehaviourDescriptionAccess().getInternalActionKeyword_2_0());
                    			
                    // InternalMyDsl.g:2490:4: ( (lv_internalAction_3_0= ruleEInternalAction ) )
                    // InternalMyDsl.g:2491:5: (lv_internalAction_3_0= ruleEInternalAction )
                    {
                    // InternalMyDsl.g:2491:5: (lv_internalAction_3_0= ruleEInternalAction )
                    // InternalMyDsl.g:2492:6: lv_internalAction_3_0= ruleEInternalAction
                    {

                    						newCompositeNode(grammarAccess.getEBehaviourDescriptionAccess().getInternalActionEInternalActionParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_64);
                    lv_internalAction_3_0=ruleEInternalAction();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEBehaviourDescriptionRule());
                    						}
                    						add(
                    							current,
                    							"internalAction",
                    							lv_internalAction_3_0,
                    							"org.xtext.example.mydsl.MyDsl.EInternalAction");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:2509:4: (otherlv_4= ',' ( (lv_internalAction_5_0= ruleEInternalAction ) ) )*
                    loop74:
                    do {
                        int alt74=2;
                        int LA74_0 = input.LA(1);

                        if ( (LA74_0==14) ) {
                            alt74=1;
                        }


                        switch (alt74) {
                    	case 1 :
                    	    // InternalMyDsl.g:2510:5: otherlv_4= ',' ( (lv_internalAction_5_0= ruleEInternalAction ) )
                    	    {
                    	    otherlv_4=(Token)match(input,14,FOLLOW_63); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getEBehaviourDescriptionAccess().getCommaKeyword_2_2_0());
                    	    				
                    	    // InternalMyDsl.g:2514:5: ( (lv_internalAction_5_0= ruleEInternalAction ) )
                    	    // InternalMyDsl.g:2515:6: (lv_internalAction_5_0= ruleEInternalAction )
                    	    {
                    	    // InternalMyDsl.g:2515:6: (lv_internalAction_5_0= ruleEInternalAction )
                    	    // InternalMyDsl.g:2516:7: lv_internalAction_5_0= ruleEInternalAction
                    	    {

                    	    							newCompositeNode(grammarAccess.getEBehaviourDescriptionAccess().getInternalActionEInternalActionParserRuleCall_2_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_64);
                    	    lv_internalAction_5_0=ruleEInternalAction();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getEBehaviourDescriptionRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"internalAction",
                    	    								lv_internalAction_5_0,
                    	    								"org.xtext.example.mydsl.MyDsl.EInternalAction");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop74;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalMyDsl.g:2535:3: (otherlv_6= 'loop:' ( (lv_loop_7_0= ruleELoop ) ) (otherlv_8= ',' ( (lv_loop_9_0= ruleELoop ) ) )* )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==69) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // InternalMyDsl.g:2536:4: otherlv_6= 'loop:' ( (lv_loop_7_0= ruleELoop ) ) (otherlv_8= ',' ( (lv_loop_9_0= ruleELoop ) ) )*
                    {
                    otherlv_6=(Token)match(input,69,FOLLOW_65); 

                    				newLeafNode(otherlv_6, grammarAccess.getEBehaviourDescriptionAccess().getLoopKeyword_3_0());
                    			
                    // InternalMyDsl.g:2540:4: ( (lv_loop_7_0= ruleELoop ) )
                    // InternalMyDsl.g:2541:5: (lv_loop_7_0= ruleELoop )
                    {
                    // InternalMyDsl.g:2541:5: (lv_loop_7_0= ruleELoop )
                    // InternalMyDsl.g:2542:6: lv_loop_7_0= ruleELoop
                    {

                    						newCompositeNode(grammarAccess.getEBehaviourDescriptionAccess().getLoopELoopParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_66);
                    lv_loop_7_0=ruleELoop();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEBehaviourDescriptionRule());
                    						}
                    						add(
                    							current,
                    							"loop",
                    							lv_loop_7_0,
                    							"org.xtext.example.mydsl.MyDsl.ELoop");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:2559:4: (otherlv_8= ',' ( (lv_loop_9_0= ruleELoop ) ) )*
                    loop76:
                    do {
                        int alt76=2;
                        int LA76_0 = input.LA(1);

                        if ( (LA76_0==14) ) {
                            alt76=1;
                        }


                        switch (alt76) {
                    	case 1 :
                    	    // InternalMyDsl.g:2560:5: otherlv_8= ',' ( (lv_loop_9_0= ruleELoop ) )
                    	    {
                    	    otherlv_8=(Token)match(input,14,FOLLOW_65); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getEBehaviourDescriptionAccess().getCommaKeyword_3_2_0());
                    	    				
                    	    // InternalMyDsl.g:2564:5: ( (lv_loop_9_0= ruleELoop ) )
                    	    // InternalMyDsl.g:2565:6: (lv_loop_9_0= ruleELoop )
                    	    {
                    	    // InternalMyDsl.g:2565:6: (lv_loop_9_0= ruleELoop )
                    	    // InternalMyDsl.g:2566:7: lv_loop_9_0= ruleELoop
                    	    {

                    	    							newCompositeNode(grammarAccess.getEBehaviourDescriptionAccess().getLoopELoopParserRuleCall_3_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_66);
                    	    lv_loop_9_0=ruleELoop();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getEBehaviourDescriptionRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"loop",
                    	    								lv_loop_9_0,
                    	    								"org.xtext.example.mydsl.MyDsl.ELoop");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop76;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalMyDsl.g:2585:3: (otherlv_10= 'branch:' ( (lv_branch_11_0= ruleEBranch ) ) (otherlv_12= ',' ( (lv_branch_13_0= ruleEBranch ) ) )* )?
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==70) ) {
                alt79=1;
            }
            switch (alt79) {
                case 1 :
                    // InternalMyDsl.g:2586:4: otherlv_10= 'branch:' ( (lv_branch_11_0= ruleEBranch ) ) (otherlv_12= ',' ( (lv_branch_13_0= ruleEBranch ) ) )*
                    {
                    otherlv_10=(Token)match(input,70,FOLLOW_67); 

                    				newLeafNode(otherlv_10, grammarAccess.getEBehaviourDescriptionAccess().getBranchKeyword_4_0());
                    			
                    // InternalMyDsl.g:2590:4: ( (lv_branch_11_0= ruleEBranch ) )
                    // InternalMyDsl.g:2591:5: (lv_branch_11_0= ruleEBranch )
                    {
                    // InternalMyDsl.g:2591:5: (lv_branch_11_0= ruleEBranch )
                    // InternalMyDsl.g:2592:6: lv_branch_11_0= ruleEBranch
                    {

                    						newCompositeNode(grammarAccess.getEBehaviourDescriptionAccess().getBranchEBranchParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_68);
                    lv_branch_11_0=ruleEBranch();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEBehaviourDescriptionRule());
                    						}
                    						add(
                    							current,
                    							"branch",
                    							lv_branch_11_0,
                    							"org.xtext.example.mydsl.MyDsl.EBranch");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:2609:4: (otherlv_12= ',' ( (lv_branch_13_0= ruleEBranch ) ) )*
                    loop78:
                    do {
                        int alt78=2;
                        int LA78_0 = input.LA(1);

                        if ( (LA78_0==14) ) {
                            alt78=1;
                        }


                        switch (alt78) {
                    	case 1 :
                    	    // InternalMyDsl.g:2610:5: otherlv_12= ',' ( (lv_branch_13_0= ruleEBranch ) )
                    	    {
                    	    otherlv_12=(Token)match(input,14,FOLLOW_67); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getEBehaviourDescriptionAccess().getCommaKeyword_4_2_0());
                    	    				
                    	    // InternalMyDsl.g:2614:5: ( (lv_branch_13_0= ruleEBranch ) )
                    	    // InternalMyDsl.g:2615:6: (lv_branch_13_0= ruleEBranch )
                    	    {
                    	    // InternalMyDsl.g:2615:6: (lv_branch_13_0= ruleEBranch )
                    	    // InternalMyDsl.g:2616:7: lv_branch_13_0= ruleEBranch
                    	    {

                    	    							newCompositeNode(grammarAccess.getEBehaviourDescriptionAccess().getBranchEBranchParserRuleCall_4_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_68);
                    	    lv_branch_13_0=ruleEBranch();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getEBehaviourDescriptionRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"branch",
                    	    								lv_branch_13_0,
                    	    								"org.xtext.example.mydsl.MyDsl.EBranch");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop78;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalMyDsl.g:2635:3: (otherlv_14= 'externalCall:' ( (lv_externalCall_15_0= ruleEExternalCall ) ) (otherlv_16= ',' ( (lv_externalCall_17_0= ruleEExternalCall ) ) )* )?
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==71) ) {
                alt81=1;
            }
            switch (alt81) {
                case 1 :
                    // InternalMyDsl.g:2636:4: otherlv_14= 'externalCall:' ( (lv_externalCall_15_0= ruleEExternalCall ) ) (otherlv_16= ',' ( (lv_externalCall_17_0= ruleEExternalCall ) ) )*
                    {
                    otherlv_14=(Token)match(input,71,FOLLOW_69); 

                    				newLeafNode(otherlv_14, grammarAccess.getEBehaviourDescriptionAccess().getExternalCallKeyword_5_0());
                    			
                    // InternalMyDsl.g:2640:4: ( (lv_externalCall_15_0= ruleEExternalCall ) )
                    // InternalMyDsl.g:2641:5: (lv_externalCall_15_0= ruleEExternalCall )
                    {
                    // InternalMyDsl.g:2641:5: (lv_externalCall_15_0= ruleEExternalCall )
                    // InternalMyDsl.g:2642:6: lv_externalCall_15_0= ruleEExternalCall
                    {

                    						newCompositeNode(grammarAccess.getEBehaviourDescriptionAccess().getExternalCallEExternalCallParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_externalCall_15_0=ruleEExternalCall();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEBehaviourDescriptionRule());
                    						}
                    						add(
                    							current,
                    							"externalCall",
                    							lv_externalCall_15_0,
                    							"org.xtext.example.mydsl.MyDsl.EExternalCall");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:2659:4: (otherlv_16= ',' ( (lv_externalCall_17_0= ruleEExternalCall ) ) )*
                    loop80:
                    do {
                        int alt80=2;
                        int LA80_0 = input.LA(1);

                        if ( (LA80_0==14) ) {
                            alt80=1;
                        }


                        switch (alt80) {
                    	case 1 :
                    	    // InternalMyDsl.g:2660:5: otherlv_16= ',' ( (lv_externalCall_17_0= ruleEExternalCall ) )
                    	    {
                    	    otherlv_16=(Token)match(input,14,FOLLOW_69); 

                    	    					newLeafNode(otherlv_16, grammarAccess.getEBehaviourDescriptionAccess().getCommaKeyword_5_2_0());
                    	    				
                    	    // InternalMyDsl.g:2664:5: ( (lv_externalCall_17_0= ruleEExternalCall ) )
                    	    // InternalMyDsl.g:2665:6: (lv_externalCall_17_0= ruleEExternalCall )
                    	    {
                    	    // InternalMyDsl.g:2665:6: (lv_externalCall_17_0= ruleEExternalCall )
                    	    // InternalMyDsl.g:2666:7: lv_externalCall_17_0= ruleEExternalCall
                    	    {

                    	    							newCompositeNode(grammarAccess.getEBehaviourDescriptionAccess().getExternalCallEExternalCallParserRuleCall_5_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_externalCall_17_0=ruleEExternalCall();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getEBehaviourDescriptionRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"externalCall",
                    	    								lv_externalCall_17_0,
                    	    								"org.xtext.example.mydsl.MyDsl.EExternalCall");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop80;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_18=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_18, grammarAccess.getEBehaviourDescriptionAccess().getGreaterThanSignGreaterThanSignKeyword_6());
            		

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
    // $ANTLR end "ruleEBehaviourDescription"


    // $ANTLR start "entryRuleEInternalAction"
    // InternalMyDsl.g:2693:1: entryRuleEInternalAction returns [EObject current=null] : iv_ruleEInternalAction= ruleEInternalAction EOF ;
    public final EObject entryRuleEInternalAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEInternalAction = null;


        try {
            // InternalMyDsl.g:2693:56: (iv_ruleEInternalAction= ruleEInternalAction EOF )
            // InternalMyDsl.g:2694:2: iv_ruleEInternalAction= ruleEInternalAction EOF
            {
             newCompositeNode(grammarAccess.getEInternalActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEInternalAction=ruleEInternalAction();

            state._fsp--;

             current =iv_ruleEInternalAction; 
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
    // $ANTLR end "entryRuleEInternalAction"


    // $ANTLR start "ruleEInternalAction"
    // InternalMyDsl.g:2700:1: ruleEInternalAction returns [EObject current=null] : otherlv_0= 'EInternalAction' ;
    public final EObject ruleEInternalAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:2706:2: (otherlv_0= 'EInternalAction' )
            // InternalMyDsl.g:2707:2: otherlv_0= 'EInternalAction'
            {
            otherlv_0=(Token)match(input,72,FOLLOW_2); 

            		newLeafNode(otherlv_0, grammarAccess.getEInternalActionAccess().getEInternalActionKeyword());
            	

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
    // $ANTLR end "ruleEInternalAction"


    // $ANTLR start "entryRuleELoop"
    // InternalMyDsl.g:2714:1: entryRuleELoop returns [EObject current=null] : iv_ruleELoop= ruleELoop EOF ;
    public final EObject entryRuleELoop() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleELoop = null;


        try {
            // InternalMyDsl.g:2714:46: (iv_ruleELoop= ruleELoop EOF )
            // InternalMyDsl.g:2715:2: iv_ruleELoop= ruleELoop EOF
            {
             newCompositeNode(grammarAccess.getELoopRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleELoop=ruleELoop();

            state._fsp--;

             current =iv_ruleELoop; 
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
    // $ANTLR end "entryRuleELoop"


    // $ANTLR start "ruleELoop"
    // InternalMyDsl.g:2721:1: ruleELoop returns [EObject current=null] : otherlv_0= 'ELoop' ;
    public final EObject ruleELoop() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:2727:2: (otherlv_0= 'ELoop' )
            // InternalMyDsl.g:2728:2: otherlv_0= 'ELoop'
            {
            otherlv_0=(Token)match(input,73,FOLLOW_2); 

            		newLeafNode(otherlv_0, grammarAccess.getELoopAccess().getELoopKeyword());
            	

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
    // $ANTLR end "ruleELoop"


    // $ANTLR start "entryRuleEBranch"
    // InternalMyDsl.g:2735:1: entryRuleEBranch returns [EObject current=null] : iv_ruleEBranch= ruleEBranch EOF ;
    public final EObject entryRuleEBranch() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEBranch = null;


        try {
            // InternalMyDsl.g:2735:48: (iv_ruleEBranch= ruleEBranch EOF )
            // InternalMyDsl.g:2736:2: iv_ruleEBranch= ruleEBranch EOF
            {
             newCompositeNode(grammarAccess.getEBranchRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEBranch=ruleEBranch();

            state._fsp--;

             current =iv_ruleEBranch; 
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
    // $ANTLR end "entryRuleEBranch"


    // $ANTLR start "ruleEBranch"
    // InternalMyDsl.g:2742:1: ruleEBranch returns [EObject current=null] : otherlv_0= 'EBranch' ;
    public final EObject ruleEBranch() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:2748:2: (otherlv_0= 'EBranch' )
            // InternalMyDsl.g:2749:2: otherlv_0= 'EBranch'
            {
            otherlv_0=(Token)match(input,74,FOLLOW_2); 

            		newLeafNode(otherlv_0, grammarAccess.getEBranchAccess().getEBranchKeyword());
            	

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
    // $ANTLR end "ruleEBranch"


    // $ANTLR start "entryRuleEExternalCall"
    // InternalMyDsl.g:2756:1: entryRuleEExternalCall returns [EObject current=null] : iv_ruleEExternalCall= ruleEExternalCall EOF ;
    public final EObject entryRuleEExternalCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEExternalCall = null;


        try {
            // InternalMyDsl.g:2756:54: (iv_ruleEExternalCall= ruleEExternalCall EOF )
            // InternalMyDsl.g:2757:2: iv_ruleEExternalCall= ruleEExternalCall EOF
            {
             newCompositeNode(grammarAccess.getEExternalCallRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEExternalCall=ruleEExternalCall();

            state._fsp--;

             current =iv_ruleEExternalCall; 
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
    // $ANTLR end "entryRuleEExternalCall"


    // $ANTLR start "ruleEExternalCall"
    // InternalMyDsl.g:2763:1: ruleEExternalCall returns [EObject current=null] : (otherlv_0= 'EExternalCall' otherlv_1= '<<' (otherlv_2= 'to:' ( ( ruleEString ) ) ) otherlv_4= '>>' ) ;
    public final EObject ruleEExternalCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalMyDsl.g:2769:2: ( (otherlv_0= 'EExternalCall' otherlv_1= '<<' (otherlv_2= 'to:' ( ( ruleEString ) ) ) otherlv_4= '>>' ) )
            // InternalMyDsl.g:2770:2: (otherlv_0= 'EExternalCall' otherlv_1= '<<' (otherlv_2= 'to:' ( ( ruleEString ) ) ) otherlv_4= '>>' )
            {
            // InternalMyDsl.g:2770:2: (otherlv_0= 'EExternalCall' otherlv_1= '<<' (otherlv_2= 'to:' ( ( ruleEString ) ) ) otherlv_4= '>>' )
            // InternalMyDsl.g:2771:3: otherlv_0= 'EExternalCall' otherlv_1= '<<' (otherlv_2= 'to:' ( ( ruleEString ) ) ) otherlv_4= '>>'
            {
            otherlv_0=(Token)match(input,75,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getEExternalCallAccess().getEExternalCallKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_70); 

            			newLeafNode(otherlv_1, grammarAccess.getEExternalCallAccess().getLessThanSignLessThanSignKeyword_1());
            		
            // InternalMyDsl.g:2779:3: (otherlv_2= 'to:' ( ( ruleEString ) ) )
            // InternalMyDsl.g:2780:4: otherlv_2= 'to:' ( ( ruleEString ) )
            {
            otherlv_2=(Token)match(input,76,FOLLOW_9); 

            				newLeafNode(otherlv_2, grammarAccess.getEExternalCallAccess().getToKeyword_2_0());
            			
            // InternalMyDsl.g:2784:4: ( ( ruleEString ) )
            // InternalMyDsl.g:2785:5: ( ruleEString )
            {
            // InternalMyDsl.g:2785:5: ( ruleEString )
            // InternalMyDsl.g:2786:6: ruleEString
            {

            						if (current==null) {
            							current = createModelElement(grammarAccess.getEExternalCallRule());
            						}
            					

            						newCompositeNode(grammarAccess.getEExternalCallAccess().getToEServiceCrossReference_2_1_0());
            					
            pushFollow(FOLLOW_18);
            ruleEString();

            state._fsp--;


            						afterParserOrEnumRuleCall();
            					

            }


            }


            }

            otherlv_4=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getEExternalCallAccess().getGreaterThanSignGreaterThanSignKeyword_3());
            		

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
    // $ANTLR end "ruleEExternalCall"


    // $ANTLR start "entryRuleESignature"
    // InternalMyDsl.g:2809:1: entryRuleESignature returns [EObject current=null] : iv_ruleESignature= ruleESignature EOF ;
    public final EObject entryRuleESignature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleESignature = null;


        try {
            // InternalMyDsl.g:2809:51: (iv_ruleESignature= ruleESignature EOF )
            // InternalMyDsl.g:2810:2: iv_ruleESignature= ruleESignature EOF
            {
             newCompositeNode(grammarAccess.getESignatureRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleESignature=ruleESignature();

            state._fsp--;

             current =iv_ruleESignature; 
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
    // $ANTLR end "entryRuleESignature"


    // $ANTLR start "ruleESignature"
    // InternalMyDsl.g:2816:1: ruleESignature returns [EObject current=null] : (otherlv_0= 'ESignature' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '<<' (otherlv_3= 'returnType:' ( (lv_returnType_4_0= rulePossibleReturnTypes ) ) ) (otherlv_5= 'correspondsTo:' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* )? (otherlv_9= 'parameter:' ( (lv_parameter_10_0= ruleEParameter ) ) (otherlv_11= ',' ( (lv_parameter_12_0= ruleEParameter ) ) )* )? otherlv_13= '>>' ) ;
    public final EObject ruleESignature() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        Enumerator lv_returnType_4_0 = null;

        EObject lv_parameter_10_0 = null;

        EObject lv_parameter_12_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2822:2: ( (otherlv_0= 'ESignature' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '<<' (otherlv_3= 'returnType:' ( (lv_returnType_4_0= rulePossibleReturnTypes ) ) ) (otherlv_5= 'correspondsTo:' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* )? (otherlv_9= 'parameter:' ( (lv_parameter_10_0= ruleEParameter ) ) (otherlv_11= ',' ( (lv_parameter_12_0= ruleEParameter ) ) )* )? otherlv_13= '>>' ) )
            // InternalMyDsl.g:2823:2: (otherlv_0= 'ESignature' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '<<' (otherlv_3= 'returnType:' ( (lv_returnType_4_0= rulePossibleReturnTypes ) ) ) (otherlv_5= 'correspondsTo:' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* )? (otherlv_9= 'parameter:' ( (lv_parameter_10_0= ruleEParameter ) ) (otherlv_11= ',' ( (lv_parameter_12_0= ruleEParameter ) ) )* )? otherlv_13= '>>' )
            {
            // InternalMyDsl.g:2823:2: (otherlv_0= 'ESignature' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '<<' (otherlv_3= 'returnType:' ( (lv_returnType_4_0= rulePossibleReturnTypes ) ) ) (otherlv_5= 'correspondsTo:' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* )? (otherlv_9= 'parameter:' ( (lv_parameter_10_0= ruleEParameter ) ) (otherlv_11= ',' ( (lv_parameter_12_0= ruleEParameter ) ) )* )? otherlv_13= '>>' )
            // InternalMyDsl.g:2824:3: otherlv_0= 'ESignature' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '<<' (otherlv_3= 'returnType:' ( (lv_returnType_4_0= rulePossibleReturnTypes ) ) ) (otherlv_5= 'correspondsTo:' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* )? (otherlv_9= 'parameter:' ( (lv_parameter_10_0= ruleEParameter ) ) (otherlv_11= ',' ( (lv_parameter_12_0= ruleEParameter ) ) )* )? otherlv_13= '>>'
            {
            otherlv_0=(Token)match(input,77,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getESignatureAccess().getESignatureKeyword_0());
            		
            // InternalMyDsl.g:2828:3: ( (lv_name_1_0= ruleEString ) )
            // InternalMyDsl.g:2829:4: (lv_name_1_0= ruleEString )
            {
            // InternalMyDsl.g:2829:4: (lv_name_1_0= ruleEString )
            // InternalMyDsl.g:2830:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getESignatureAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getESignatureRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_71); 

            			newLeafNode(otherlv_2, grammarAccess.getESignatureAccess().getLessThanSignLessThanSignKeyword_2());
            		
            // InternalMyDsl.g:2851:3: (otherlv_3= 'returnType:' ( (lv_returnType_4_0= rulePossibleReturnTypes ) ) )
            // InternalMyDsl.g:2852:4: otherlv_3= 'returnType:' ( (lv_returnType_4_0= rulePossibleReturnTypes ) )
            {
            otherlv_3=(Token)match(input,78,FOLLOW_72); 

            				newLeafNode(otherlv_3, grammarAccess.getESignatureAccess().getReturnTypeKeyword_3_0());
            			
            // InternalMyDsl.g:2856:4: ( (lv_returnType_4_0= rulePossibleReturnTypes ) )
            // InternalMyDsl.g:2857:5: (lv_returnType_4_0= rulePossibleReturnTypes )
            {
            // InternalMyDsl.g:2857:5: (lv_returnType_4_0= rulePossibleReturnTypes )
            // InternalMyDsl.g:2858:6: lv_returnType_4_0= rulePossibleReturnTypes
            {

            						newCompositeNode(grammarAccess.getESignatureAccess().getReturnTypePossibleReturnTypesEnumRuleCall_3_1_0());
            					
            pushFollow(FOLLOW_73);
            lv_returnType_4_0=rulePossibleReturnTypes();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getESignatureRule());
            						}
            						set(
            							current,
            							"returnType",
            							lv_returnType_4_0,
            							"org.xtext.example.mydsl.MyDsl.PossibleReturnTypes");
            						afterParserOrEnumRuleCall();
            					

            }


            }


            }

            // InternalMyDsl.g:2876:3: (otherlv_5= 'correspondsTo:' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* )?
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==79) ) {
                alt83=1;
            }
            switch (alt83) {
                case 1 :
                    // InternalMyDsl.g:2877:4: otherlv_5= 'correspondsTo:' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )*
                    {
                    otherlv_5=(Token)match(input,79,FOLLOW_9); 

                    				newLeafNode(otherlv_5, grammarAccess.getESignatureAccess().getCorrespondsToKeyword_4_0());
                    			
                    // InternalMyDsl.g:2881:4: ( ( ruleEString ) )
                    // InternalMyDsl.g:2882:5: ( ruleEString )
                    {
                    // InternalMyDsl.g:2882:5: ( ruleEString )
                    // InternalMyDsl.g:2883:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getESignatureRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getESignatureAccess().getCorrespondsToEServiceCrossReference_4_1_0());
                    					
                    pushFollow(FOLLOW_74);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:2897:4: (otherlv_7= ',' ( ( ruleEString ) ) )*
                    loop82:
                    do {
                        int alt82=2;
                        int LA82_0 = input.LA(1);

                        if ( (LA82_0==14) ) {
                            alt82=1;
                        }


                        switch (alt82) {
                    	case 1 :
                    	    // InternalMyDsl.g:2898:5: otherlv_7= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_7=(Token)match(input,14,FOLLOW_9); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getESignatureAccess().getCommaKeyword_4_2_0());
                    	    				
                    	    // InternalMyDsl.g:2902:5: ( ( ruleEString ) )
                    	    // InternalMyDsl.g:2903:6: ( ruleEString )
                    	    {
                    	    // InternalMyDsl.g:2903:6: ( ruleEString )
                    	    // InternalMyDsl.g:2904:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getESignatureRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getESignatureAccess().getCorrespondsToEServiceCrossReference_4_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_74);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop82;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalMyDsl.g:2920:3: (otherlv_9= 'parameter:' ( (lv_parameter_10_0= ruleEParameter ) ) (otherlv_11= ',' ( (lv_parameter_12_0= ruleEParameter ) ) )* )?
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==80) ) {
                alt85=1;
            }
            switch (alt85) {
                case 1 :
                    // InternalMyDsl.g:2921:4: otherlv_9= 'parameter:' ( (lv_parameter_10_0= ruleEParameter ) ) (otherlv_11= ',' ( (lv_parameter_12_0= ruleEParameter ) ) )*
                    {
                    otherlv_9=(Token)match(input,80,FOLLOW_75); 

                    				newLeafNode(otherlv_9, grammarAccess.getESignatureAccess().getParameterKeyword_5_0());
                    			
                    // InternalMyDsl.g:2925:4: ( (lv_parameter_10_0= ruleEParameter ) )
                    // InternalMyDsl.g:2926:5: (lv_parameter_10_0= ruleEParameter )
                    {
                    // InternalMyDsl.g:2926:5: (lv_parameter_10_0= ruleEParameter )
                    // InternalMyDsl.g:2927:6: lv_parameter_10_0= ruleEParameter
                    {

                    						newCompositeNode(grammarAccess.getESignatureAccess().getParameterEParameterParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_parameter_10_0=ruleEParameter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getESignatureRule());
                    						}
                    						add(
                    							current,
                    							"parameter",
                    							lv_parameter_10_0,
                    							"org.xtext.example.mydsl.MyDsl.EParameter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:2944:4: (otherlv_11= ',' ( (lv_parameter_12_0= ruleEParameter ) ) )*
                    loop84:
                    do {
                        int alt84=2;
                        int LA84_0 = input.LA(1);

                        if ( (LA84_0==14) ) {
                            alt84=1;
                        }


                        switch (alt84) {
                    	case 1 :
                    	    // InternalMyDsl.g:2945:5: otherlv_11= ',' ( (lv_parameter_12_0= ruleEParameter ) )
                    	    {
                    	    otherlv_11=(Token)match(input,14,FOLLOW_75); 

                    	    					newLeafNode(otherlv_11, grammarAccess.getESignatureAccess().getCommaKeyword_5_2_0());
                    	    				
                    	    // InternalMyDsl.g:2949:5: ( (lv_parameter_12_0= ruleEParameter ) )
                    	    // InternalMyDsl.g:2950:6: (lv_parameter_12_0= ruleEParameter )
                    	    {
                    	    // InternalMyDsl.g:2950:6: (lv_parameter_12_0= ruleEParameter )
                    	    // InternalMyDsl.g:2951:7: lv_parameter_12_0= ruleEParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getESignatureAccess().getParameterEParameterParserRuleCall_5_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_parameter_12_0=ruleEParameter();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getESignatureRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"parameter",
                    	    								lv_parameter_12_0,
                    	    								"org.xtext.example.mydsl.MyDsl.EParameter");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop84;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_13=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_13, grammarAccess.getESignatureAccess().getGreaterThanSignGreaterThanSignKeyword_6());
            		

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
    // $ANTLR end "ruleESignature"


    // $ANTLR start "entryRuleEParameter"
    // InternalMyDsl.g:2978:1: entryRuleEParameter returns [EObject current=null] : iv_ruleEParameter= ruleEParameter EOF ;
    public final EObject entryRuleEParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEParameter = null;


        try {
            // InternalMyDsl.g:2978:51: (iv_ruleEParameter= ruleEParameter EOF )
            // InternalMyDsl.g:2979:2: iv_ruleEParameter= ruleEParameter EOF
            {
             newCompositeNode(grammarAccess.getEParameterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEParameter=ruleEParameter();

            state._fsp--;

             current =iv_ruleEParameter; 
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
    // $ANTLR end "entryRuleEParameter"


    // $ANTLR start "ruleEParameter"
    // InternalMyDsl.g:2985:1: ruleEParameter returns [EObject current=null] : (otherlv_0= 'EParameter' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '<<' (otherlv_3= 'type:' ( (lv_type_4_0= rulePossibleParameterTypes ) ) ) otherlv_5= '>>' ) ;
    public final EObject ruleEParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        Enumerator lv_type_4_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2991:2: ( (otherlv_0= 'EParameter' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '<<' (otherlv_3= 'type:' ( (lv_type_4_0= rulePossibleParameterTypes ) ) ) otherlv_5= '>>' ) )
            // InternalMyDsl.g:2992:2: (otherlv_0= 'EParameter' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '<<' (otherlv_3= 'type:' ( (lv_type_4_0= rulePossibleParameterTypes ) ) ) otherlv_5= '>>' )
            {
            // InternalMyDsl.g:2992:2: (otherlv_0= 'EParameter' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '<<' (otherlv_3= 'type:' ( (lv_type_4_0= rulePossibleParameterTypes ) ) ) otherlv_5= '>>' )
            // InternalMyDsl.g:2993:3: otherlv_0= 'EParameter' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '<<' (otherlv_3= 'type:' ( (lv_type_4_0= rulePossibleParameterTypes ) ) ) otherlv_5= '>>'
            {
            otherlv_0=(Token)match(input,81,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getEParameterAccess().getEParameterKeyword_0());
            		
            // InternalMyDsl.g:2997:3: ( (lv_name_1_0= ruleEString ) )
            // InternalMyDsl.g:2998:4: (lv_name_1_0= ruleEString )
            {
            // InternalMyDsl.g:2998:4: (lv_name_1_0= ruleEString )
            // InternalMyDsl.g:2999:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getEParameterAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEParameterRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_76); 

            			newLeafNode(otherlv_2, grammarAccess.getEParameterAccess().getLessThanSignLessThanSignKeyword_2());
            		
            // InternalMyDsl.g:3020:3: (otherlv_3= 'type:' ( (lv_type_4_0= rulePossibleParameterTypes ) ) )
            // InternalMyDsl.g:3021:4: otherlv_3= 'type:' ( (lv_type_4_0= rulePossibleParameterTypes ) )
            {
            otherlv_3=(Token)match(input,82,FOLLOW_77); 

            				newLeafNode(otherlv_3, grammarAccess.getEParameterAccess().getTypeKeyword_3_0());
            			
            // InternalMyDsl.g:3025:4: ( (lv_type_4_0= rulePossibleParameterTypes ) )
            // InternalMyDsl.g:3026:5: (lv_type_4_0= rulePossibleParameterTypes )
            {
            // InternalMyDsl.g:3026:5: (lv_type_4_0= rulePossibleParameterTypes )
            // InternalMyDsl.g:3027:6: lv_type_4_0= rulePossibleParameterTypes
            {

            						newCompositeNode(grammarAccess.getEParameterAccess().getTypePossibleParameterTypesEnumRuleCall_3_1_0());
            					
            pushFollow(FOLLOW_18);
            lv_type_4_0=rulePossibleParameterTypes();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getEParameterRule());
            						}
            						set(
            							current,
            							"type",
            							lv_type_4_0,
            							"org.xtext.example.mydsl.MyDsl.PossibleParameterTypes");
            						afterParserOrEnumRuleCall();
            					

            }


            }


            }

            otherlv_5=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getEParameterAccess().getGreaterThanSignGreaterThanSignKeyword_4());
            		

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
    // $ANTLR end "ruleEParameter"


    // $ANTLR start "rulePossibleReturnTypes"
    // InternalMyDsl.g:3053:1: rulePossibleReturnTypes returns [Enumerator current=null] : ( (enumLiteral_0= 'Boolean' ) | (enumLiteral_1= 'Char' ) | (enumLiteral_2= 'Date' ) | (enumLiteral_3= 'Double' ) | (enumLiteral_4= 'Float' ) | (enumLiteral_5= 'List' ) | (enumLiteral_6= 'Integer' ) | (enumLiteral_7= 'Long' ) | (enumLiteral_8= 'Map' ) | (enumLiteral_9= 'String' ) | (enumLiteral_10= 'Void' ) | (enumLiteral_11= 'EObject' ) ) ;
    public final Enumerator rulePossibleReturnTypes() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;
        Token enumLiteral_8=null;
        Token enumLiteral_9=null;
        Token enumLiteral_10=null;
        Token enumLiteral_11=null;


        	enterRule();

        try {
            // InternalMyDsl.g:3059:2: ( ( (enumLiteral_0= 'Boolean' ) | (enumLiteral_1= 'Char' ) | (enumLiteral_2= 'Date' ) | (enumLiteral_3= 'Double' ) | (enumLiteral_4= 'Float' ) | (enumLiteral_5= 'List' ) | (enumLiteral_6= 'Integer' ) | (enumLiteral_7= 'Long' ) | (enumLiteral_8= 'Map' ) | (enumLiteral_9= 'String' ) | (enumLiteral_10= 'Void' ) | (enumLiteral_11= 'EObject' ) ) )
            // InternalMyDsl.g:3060:2: ( (enumLiteral_0= 'Boolean' ) | (enumLiteral_1= 'Char' ) | (enumLiteral_2= 'Date' ) | (enumLiteral_3= 'Double' ) | (enumLiteral_4= 'Float' ) | (enumLiteral_5= 'List' ) | (enumLiteral_6= 'Integer' ) | (enumLiteral_7= 'Long' ) | (enumLiteral_8= 'Map' ) | (enumLiteral_9= 'String' ) | (enumLiteral_10= 'Void' ) | (enumLiteral_11= 'EObject' ) )
            {
            // InternalMyDsl.g:3060:2: ( (enumLiteral_0= 'Boolean' ) | (enumLiteral_1= 'Char' ) | (enumLiteral_2= 'Date' ) | (enumLiteral_3= 'Double' ) | (enumLiteral_4= 'Float' ) | (enumLiteral_5= 'List' ) | (enumLiteral_6= 'Integer' ) | (enumLiteral_7= 'Long' ) | (enumLiteral_8= 'Map' ) | (enumLiteral_9= 'String' ) | (enumLiteral_10= 'Void' ) | (enumLiteral_11= 'EObject' ) )
            int alt86=12;
            switch ( input.LA(1) ) {
            case 83:
                {
                alt86=1;
                }
                break;
            case 84:
                {
                alt86=2;
                }
                break;
            case 85:
                {
                alt86=3;
                }
                break;
            case 86:
                {
                alt86=4;
                }
                break;
            case 87:
                {
                alt86=5;
                }
                break;
            case 88:
                {
                alt86=6;
                }
                break;
            case 89:
                {
                alt86=7;
                }
                break;
            case 90:
                {
                alt86=8;
                }
                break;
            case 91:
                {
                alt86=9;
                }
                break;
            case 92:
                {
                alt86=10;
                }
                break;
            case 93:
                {
                alt86=11;
                }
                break;
            case 94:
                {
                alt86=12;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 86, 0, input);

                throw nvae;
            }

            switch (alt86) {
                case 1 :
                    // InternalMyDsl.g:3061:3: (enumLiteral_0= 'Boolean' )
                    {
                    // InternalMyDsl.g:3061:3: (enumLiteral_0= 'Boolean' )
                    // InternalMyDsl.g:3062:4: enumLiteral_0= 'Boolean'
                    {
                    enumLiteral_0=(Token)match(input,83,FOLLOW_2); 

                    				current = grammarAccess.getPossibleReturnTypesAccess().getBOOLEANEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getPossibleReturnTypesAccess().getBOOLEANEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:3069:3: (enumLiteral_1= 'Char' )
                    {
                    // InternalMyDsl.g:3069:3: (enumLiteral_1= 'Char' )
                    // InternalMyDsl.g:3070:4: enumLiteral_1= 'Char'
                    {
                    enumLiteral_1=(Token)match(input,84,FOLLOW_2); 

                    				current = grammarAccess.getPossibleReturnTypesAccess().getCHAREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getPossibleReturnTypesAccess().getCHAREnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:3077:3: (enumLiteral_2= 'Date' )
                    {
                    // InternalMyDsl.g:3077:3: (enumLiteral_2= 'Date' )
                    // InternalMyDsl.g:3078:4: enumLiteral_2= 'Date'
                    {
                    enumLiteral_2=(Token)match(input,85,FOLLOW_2); 

                    				current = grammarAccess.getPossibleReturnTypesAccess().getDATEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getPossibleReturnTypesAccess().getDATEEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:3085:3: (enumLiteral_3= 'Double' )
                    {
                    // InternalMyDsl.g:3085:3: (enumLiteral_3= 'Double' )
                    // InternalMyDsl.g:3086:4: enumLiteral_3= 'Double'
                    {
                    enumLiteral_3=(Token)match(input,86,FOLLOW_2); 

                    				current = grammarAccess.getPossibleReturnTypesAccess().getDOUBLEEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getPossibleReturnTypesAccess().getDOUBLEEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:3093:3: (enumLiteral_4= 'Float' )
                    {
                    // InternalMyDsl.g:3093:3: (enumLiteral_4= 'Float' )
                    // InternalMyDsl.g:3094:4: enumLiteral_4= 'Float'
                    {
                    enumLiteral_4=(Token)match(input,87,FOLLOW_2); 

                    				current = grammarAccess.getPossibleReturnTypesAccess().getFLOATEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getPossibleReturnTypesAccess().getFLOATEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:3101:3: (enumLiteral_5= 'List' )
                    {
                    // InternalMyDsl.g:3101:3: (enumLiteral_5= 'List' )
                    // InternalMyDsl.g:3102:4: enumLiteral_5= 'List'
                    {
                    enumLiteral_5=(Token)match(input,88,FOLLOW_2); 

                    				current = grammarAccess.getPossibleReturnTypesAccess().getLISTEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getPossibleReturnTypesAccess().getLISTEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalMyDsl.g:3109:3: (enumLiteral_6= 'Integer' )
                    {
                    // InternalMyDsl.g:3109:3: (enumLiteral_6= 'Integer' )
                    // InternalMyDsl.g:3110:4: enumLiteral_6= 'Integer'
                    {
                    enumLiteral_6=(Token)match(input,89,FOLLOW_2); 

                    				current = grammarAccess.getPossibleReturnTypesAccess().getINTEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getPossibleReturnTypesAccess().getINTEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalMyDsl.g:3117:3: (enumLiteral_7= 'Long' )
                    {
                    // InternalMyDsl.g:3117:3: (enumLiteral_7= 'Long' )
                    // InternalMyDsl.g:3118:4: enumLiteral_7= 'Long'
                    {
                    enumLiteral_7=(Token)match(input,90,FOLLOW_2); 

                    				current = grammarAccess.getPossibleReturnTypesAccess().getLONGEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getPossibleReturnTypesAccess().getLONGEnumLiteralDeclaration_7());
                    			

                    }


                    }
                    break;
                case 9 :
                    // InternalMyDsl.g:3125:3: (enumLiteral_8= 'Map' )
                    {
                    // InternalMyDsl.g:3125:3: (enumLiteral_8= 'Map' )
                    // InternalMyDsl.g:3126:4: enumLiteral_8= 'Map'
                    {
                    enumLiteral_8=(Token)match(input,91,FOLLOW_2); 

                    				current = grammarAccess.getPossibleReturnTypesAccess().getMAPEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_8, grammarAccess.getPossibleReturnTypesAccess().getMAPEnumLiteralDeclaration_8());
                    			

                    }


                    }
                    break;
                case 10 :
                    // InternalMyDsl.g:3133:3: (enumLiteral_9= 'String' )
                    {
                    // InternalMyDsl.g:3133:3: (enumLiteral_9= 'String' )
                    // InternalMyDsl.g:3134:4: enumLiteral_9= 'String'
                    {
                    enumLiteral_9=(Token)match(input,92,FOLLOW_2); 

                    				current = grammarAccess.getPossibleReturnTypesAccess().getSTRINGEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_9, grammarAccess.getPossibleReturnTypesAccess().getSTRINGEnumLiteralDeclaration_9());
                    			

                    }


                    }
                    break;
                case 11 :
                    // InternalMyDsl.g:3141:3: (enumLiteral_10= 'Void' )
                    {
                    // InternalMyDsl.g:3141:3: (enumLiteral_10= 'Void' )
                    // InternalMyDsl.g:3142:4: enumLiteral_10= 'Void'
                    {
                    enumLiteral_10=(Token)match(input,93,FOLLOW_2); 

                    				current = grammarAccess.getPossibleReturnTypesAccess().getVOIDEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_10, grammarAccess.getPossibleReturnTypesAccess().getVOIDEnumLiteralDeclaration_10());
                    			

                    }


                    }
                    break;
                case 12 :
                    // InternalMyDsl.g:3149:3: (enumLiteral_11= 'EObject' )
                    {
                    // InternalMyDsl.g:3149:3: (enumLiteral_11= 'EObject' )
                    // InternalMyDsl.g:3150:4: enumLiteral_11= 'EObject'
                    {
                    enumLiteral_11=(Token)match(input,94,FOLLOW_2); 

                    				current = grammarAccess.getPossibleReturnTypesAccess().getEOBJECTEnumLiteralDeclaration_11().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_11, grammarAccess.getPossibleReturnTypesAccess().getEOBJECTEnumLiteralDeclaration_11());
                    			

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
    // $ANTLR end "rulePossibleReturnTypes"


    // $ANTLR start "rulePossibleParameterTypes"
    // InternalMyDsl.g:3160:1: rulePossibleParameterTypes returns [Enumerator current=null] : ( (enumLiteral_0= 'Boolean' ) | (enumLiteral_1= 'Char' ) | (enumLiteral_2= 'Date' ) | (enumLiteral_3= 'Double' ) | (enumLiteral_4= 'Float' ) | (enumLiteral_5= 'List' ) | (enumLiteral_6= 'Integer' ) | (enumLiteral_7= 'Long' ) | (enumLiteral_8= 'Map' ) | (enumLiteral_9= 'String' ) | (enumLiteral_10= 'EObject' ) ) ;
    public final Enumerator rulePossibleParameterTypes() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;
        Token enumLiteral_8=null;
        Token enumLiteral_9=null;
        Token enumLiteral_10=null;


        	enterRule();

        try {
            // InternalMyDsl.g:3166:2: ( ( (enumLiteral_0= 'Boolean' ) | (enumLiteral_1= 'Char' ) | (enumLiteral_2= 'Date' ) | (enumLiteral_3= 'Double' ) | (enumLiteral_4= 'Float' ) | (enumLiteral_5= 'List' ) | (enumLiteral_6= 'Integer' ) | (enumLiteral_7= 'Long' ) | (enumLiteral_8= 'Map' ) | (enumLiteral_9= 'String' ) | (enumLiteral_10= 'EObject' ) ) )
            // InternalMyDsl.g:3167:2: ( (enumLiteral_0= 'Boolean' ) | (enumLiteral_1= 'Char' ) | (enumLiteral_2= 'Date' ) | (enumLiteral_3= 'Double' ) | (enumLiteral_4= 'Float' ) | (enumLiteral_5= 'List' ) | (enumLiteral_6= 'Integer' ) | (enumLiteral_7= 'Long' ) | (enumLiteral_8= 'Map' ) | (enumLiteral_9= 'String' ) | (enumLiteral_10= 'EObject' ) )
            {
            // InternalMyDsl.g:3167:2: ( (enumLiteral_0= 'Boolean' ) | (enumLiteral_1= 'Char' ) | (enumLiteral_2= 'Date' ) | (enumLiteral_3= 'Double' ) | (enumLiteral_4= 'Float' ) | (enumLiteral_5= 'List' ) | (enumLiteral_6= 'Integer' ) | (enumLiteral_7= 'Long' ) | (enumLiteral_8= 'Map' ) | (enumLiteral_9= 'String' ) | (enumLiteral_10= 'EObject' ) )
            int alt87=11;
            switch ( input.LA(1) ) {
            case 83:
                {
                alt87=1;
                }
                break;
            case 84:
                {
                alt87=2;
                }
                break;
            case 85:
                {
                alt87=3;
                }
                break;
            case 86:
                {
                alt87=4;
                }
                break;
            case 87:
                {
                alt87=5;
                }
                break;
            case 88:
                {
                alt87=6;
                }
                break;
            case 89:
                {
                alt87=7;
                }
                break;
            case 90:
                {
                alt87=8;
                }
                break;
            case 91:
                {
                alt87=9;
                }
                break;
            case 92:
                {
                alt87=10;
                }
                break;
            case 94:
                {
                alt87=11;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 87, 0, input);

                throw nvae;
            }

            switch (alt87) {
                case 1 :
                    // InternalMyDsl.g:3168:3: (enumLiteral_0= 'Boolean' )
                    {
                    // InternalMyDsl.g:3168:3: (enumLiteral_0= 'Boolean' )
                    // InternalMyDsl.g:3169:4: enumLiteral_0= 'Boolean'
                    {
                    enumLiteral_0=(Token)match(input,83,FOLLOW_2); 

                    				current = grammarAccess.getPossibleParameterTypesAccess().getBOOLEANEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getPossibleParameterTypesAccess().getBOOLEANEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:3176:3: (enumLiteral_1= 'Char' )
                    {
                    // InternalMyDsl.g:3176:3: (enumLiteral_1= 'Char' )
                    // InternalMyDsl.g:3177:4: enumLiteral_1= 'Char'
                    {
                    enumLiteral_1=(Token)match(input,84,FOLLOW_2); 

                    				current = grammarAccess.getPossibleParameterTypesAccess().getCHAREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getPossibleParameterTypesAccess().getCHAREnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:3184:3: (enumLiteral_2= 'Date' )
                    {
                    // InternalMyDsl.g:3184:3: (enumLiteral_2= 'Date' )
                    // InternalMyDsl.g:3185:4: enumLiteral_2= 'Date'
                    {
                    enumLiteral_2=(Token)match(input,85,FOLLOW_2); 

                    				current = grammarAccess.getPossibleParameterTypesAccess().getDATEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getPossibleParameterTypesAccess().getDATEEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:3192:3: (enumLiteral_3= 'Double' )
                    {
                    // InternalMyDsl.g:3192:3: (enumLiteral_3= 'Double' )
                    // InternalMyDsl.g:3193:4: enumLiteral_3= 'Double'
                    {
                    enumLiteral_3=(Token)match(input,86,FOLLOW_2); 

                    				current = grammarAccess.getPossibleParameterTypesAccess().getDOUBLEEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getPossibleParameterTypesAccess().getDOUBLEEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:3200:3: (enumLiteral_4= 'Float' )
                    {
                    // InternalMyDsl.g:3200:3: (enumLiteral_4= 'Float' )
                    // InternalMyDsl.g:3201:4: enumLiteral_4= 'Float'
                    {
                    enumLiteral_4=(Token)match(input,87,FOLLOW_2); 

                    				current = grammarAccess.getPossibleParameterTypesAccess().getFLOATEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getPossibleParameterTypesAccess().getFLOATEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:3208:3: (enumLiteral_5= 'List' )
                    {
                    // InternalMyDsl.g:3208:3: (enumLiteral_5= 'List' )
                    // InternalMyDsl.g:3209:4: enumLiteral_5= 'List'
                    {
                    enumLiteral_5=(Token)match(input,88,FOLLOW_2); 

                    				current = grammarAccess.getPossibleParameterTypesAccess().getLISTEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getPossibleParameterTypesAccess().getLISTEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalMyDsl.g:3216:3: (enumLiteral_6= 'Integer' )
                    {
                    // InternalMyDsl.g:3216:3: (enumLiteral_6= 'Integer' )
                    // InternalMyDsl.g:3217:4: enumLiteral_6= 'Integer'
                    {
                    enumLiteral_6=(Token)match(input,89,FOLLOW_2); 

                    				current = grammarAccess.getPossibleParameterTypesAccess().getINTEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getPossibleParameterTypesAccess().getINTEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalMyDsl.g:3224:3: (enumLiteral_7= 'Long' )
                    {
                    // InternalMyDsl.g:3224:3: (enumLiteral_7= 'Long' )
                    // InternalMyDsl.g:3225:4: enumLiteral_7= 'Long'
                    {
                    enumLiteral_7=(Token)match(input,90,FOLLOW_2); 

                    				current = grammarAccess.getPossibleParameterTypesAccess().getLONGEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getPossibleParameterTypesAccess().getLONGEnumLiteralDeclaration_7());
                    			

                    }


                    }
                    break;
                case 9 :
                    // InternalMyDsl.g:3232:3: (enumLiteral_8= 'Map' )
                    {
                    // InternalMyDsl.g:3232:3: (enumLiteral_8= 'Map' )
                    // InternalMyDsl.g:3233:4: enumLiteral_8= 'Map'
                    {
                    enumLiteral_8=(Token)match(input,91,FOLLOW_2); 

                    				current = grammarAccess.getPossibleParameterTypesAccess().getMAPEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_8, grammarAccess.getPossibleParameterTypesAccess().getMAPEnumLiteralDeclaration_8());
                    			

                    }


                    }
                    break;
                case 10 :
                    // InternalMyDsl.g:3240:3: (enumLiteral_9= 'String' )
                    {
                    // InternalMyDsl.g:3240:3: (enumLiteral_9= 'String' )
                    // InternalMyDsl.g:3241:4: enumLiteral_9= 'String'
                    {
                    enumLiteral_9=(Token)match(input,92,FOLLOW_2); 

                    				current = grammarAccess.getPossibleParameterTypesAccess().getSTRINGEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_9, grammarAccess.getPossibleParameterTypesAccess().getSTRINGEnumLiteralDeclaration_9());
                    			

                    }


                    }
                    break;
                case 11 :
                    // InternalMyDsl.g:3248:3: (enumLiteral_10= 'EObject' )
                    {
                    // InternalMyDsl.g:3248:3: (enumLiteral_10= 'EObject' )
                    // InternalMyDsl.g:3249:4: enumLiteral_10= 'EObject'
                    {
                    enumLiteral_10=(Token)match(input,94,FOLLOW_2); 

                    				current = grammarAccess.getPossibleParameterTypesAccess().getEOBJECTEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_10, grammarAccess.getPossibleParameterTypesAccess().getEOBJECTEnumLiteralDeclaration_10());
                    			

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
    // $ANTLR end "rulePossibleParameterTypes"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000003C000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000034000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000024000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000007BA000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x000000000073E000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x000000000063E000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x000000000043E000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x000000000043C000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000434000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000424000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000002004000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000004004000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000030020000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000020020000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000090020000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000080020000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000003E00020000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000003C00020000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000003800024000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000003000024000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000002000024000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000048000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x000C000000020000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0008000000024000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0028000000020000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0080000000020000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0600000000020000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0400000000024000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x00000000007AA000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x000000000072E000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x000000000062E000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x000000000042E000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x000000000042C000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0xE000000000020000L,0x0000000000000007L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0xC000000000024000L,0x0000000000000007L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x8000000000024000L,0x0000000000000007L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000000000024000L,0x0000000000000007L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000000000024000L,0x0000000000000006L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0000000000024000L,0x0000000000000004L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0000000000020000L,0x00000000000000F0L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0000000000024000L,0x00000000000000E0L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0000000000024000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0000000000024000L,0x0000000000000080L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x0000000000000000L,0x000000007FF80000L});
    public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x0000000000020000L,0x0000000000018000L});
    public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x0000000000024000L,0x0000000000010000L});
    public static final BitSet FOLLOW_75 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_76 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_77 = new BitSet(new long[]{0x0000000000000000L,0x000000005FF80000L});

}