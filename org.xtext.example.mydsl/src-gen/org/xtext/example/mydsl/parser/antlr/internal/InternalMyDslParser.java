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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'ESystem'", "'{'", "'provides:'", "','", "'requires:'", "'encapsulates:'", "'containsRepos:'", "'containsContainers:'", "'}'", "'EInterface'", "'resultsIn:'", "'providedByComponent:'", "'providedBySystem:'", "'requiredByComponent:'", "'requiredBySystem:'", "'signature:'", "'EParameter'", "'type:'", "'ECompositeComponent'", "'providesInterfaceTo:'", "'usesInterfaceFrom:'", "'providesDirectly:'", "'behaviourDescription:'", "'EContainer'", "'connectedTo:'", "'EAllocationContext'", "'controls:'", "'specifiesFor:'", "'specifies:'", "'ERequiredRole'", "'roleOf:'", "'linkedTo:'", "'EProvidedRole'", "'linkedFrom:'", "'EAssemblyContext'", "'allocated:'", "'encapsulatedByComponent:'", "'encapsulatedBySystem:'", "'instantiates:'", "'roles:'", "'EProvidedDelegationConnector'", "'linkFrom:'", "'linkTo:'", "'ERequiredDelegationConnector'", "'ESystemIndependentViewPoint'", "'repositoryViewType:'", "'EAssemblyViewPoint'", "'assemblyViewType:'", "'EDeploymentViewPoint'", "'allocationViewType:'", "'environmentViewType:'", "'ERepositoryViewType'", "'showsInterfaces:'", "'showsComponents:'", "'EAssemblyViewType'", "'mainArtifacts:'", "'EAllocationViewType'", "'includes:'", "'EEnvironmentViewType'", "'showsLinks:'", "'showsContainers:'", "'EComponent'", "'EBehaviourDescription'", "'internalAction:'", "'loop:'", "'branch:'", "'externalCall:'", "'EInternalAction'", "'ELoop'", "'EBranch'", "'EExternalCall'", "'to:'", "'ESignature'", "'returnType:'", "'correspondsTo:'", "'parameter:'", "'ERepository'", "'component:'", "'interface:'", "'Boolean'", "'Char'", "'Date'", "'Double'", "'Float'", "'List'", "'Integer'", "'Long'", "'Map'", "'String'", "'Void'", "'EObject'"
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
    public static final int T__100=100;
    public static final int T__92=92;
    public static final int T__93=93;
    public static final int T__94=94;
    public static final int T__101=101;
    public static final int T__90=90;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__99=99;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__95=95;
    public static final int T__96=96;
    public static final int T__97=97;
    public static final int T__98=98;
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
    // InternalMyDsl.g:72:1: ruleESystem returns [EObject current=null] : (otherlv_0= 'ESystem' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'provides:' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* ) (otherlv_7= 'requires:' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* )? (otherlv_11= 'encapsulates:' ( (otherlv_12= RULE_ID ) ) (otherlv_13= ',' ( (otherlv_14= RULE_ID ) ) )* )? (otherlv_15= 'containsRepos:' ( (lv_containsRepos_16_0= ruleERepository ) ) (otherlv_17= ',' ( (lv_containsRepos_18_0= ruleERepository ) ) )* )? (otherlv_19= 'containsContainers:' ( (lv_containsContainers_20_0= ruleEContainer ) ) (otherlv_21= ',' ( (lv_containsContainers_22_0= ruleEContainer ) ) )* )? otherlv_23= '}' ) ;
    public final EObject ruleESystem() throws RecognitionException {
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
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_containsRepos_16_0 = null;

        EObject lv_containsRepos_18_0 = null;

        EObject lv_containsContainers_20_0 = null;

        EObject lv_containsContainers_22_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:78:2: ( (otherlv_0= 'ESystem' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'provides:' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* ) (otherlv_7= 'requires:' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* )? (otherlv_11= 'encapsulates:' ( (otherlv_12= RULE_ID ) ) (otherlv_13= ',' ( (otherlv_14= RULE_ID ) ) )* )? (otherlv_15= 'containsRepos:' ( (lv_containsRepos_16_0= ruleERepository ) ) (otherlv_17= ',' ( (lv_containsRepos_18_0= ruleERepository ) ) )* )? (otherlv_19= 'containsContainers:' ( (lv_containsContainers_20_0= ruleEContainer ) ) (otherlv_21= ',' ( (lv_containsContainers_22_0= ruleEContainer ) ) )* )? otherlv_23= '}' ) )
            // InternalMyDsl.g:79:2: (otherlv_0= 'ESystem' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'provides:' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* ) (otherlv_7= 'requires:' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* )? (otherlv_11= 'encapsulates:' ( (otherlv_12= RULE_ID ) ) (otherlv_13= ',' ( (otherlv_14= RULE_ID ) ) )* )? (otherlv_15= 'containsRepos:' ( (lv_containsRepos_16_0= ruleERepository ) ) (otherlv_17= ',' ( (lv_containsRepos_18_0= ruleERepository ) ) )* )? (otherlv_19= 'containsContainers:' ( (lv_containsContainers_20_0= ruleEContainer ) ) (otherlv_21= ',' ( (lv_containsContainers_22_0= ruleEContainer ) ) )* )? otherlv_23= '}' )
            {
            // InternalMyDsl.g:79:2: (otherlv_0= 'ESystem' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'provides:' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* ) (otherlv_7= 'requires:' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* )? (otherlv_11= 'encapsulates:' ( (otherlv_12= RULE_ID ) ) (otherlv_13= ',' ( (otherlv_14= RULE_ID ) ) )* )? (otherlv_15= 'containsRepos:' ( (lv_containsRepos_16_0= ruleERepository ) ) (otherlv_17= ',' ( (lv_containsRepos_18_0= ruleERepository ) ) )* )? (otherlv_19= 'containsContainers:' ( (lv_containsContainers_20_0= ruleEContainer ) ) (otherlv_21= ',' ( (lv_containsContainers_22_0= ruleEContainer ) ) )* )? otherlv_23= '}' )
            // InternalMyDsl.g:80:3: otherlv_0= 'ESystem' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'provides:' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* ) (otherlv_7= 'requires:' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* )? (otherlv_11= 'encapsulates:' ( (otherlv_12= RULE_ID ) ) (otherlv_13= ',' ( (otherlv_14= RULE_ID ) ) )* )? (otherlv_15= 'containsRepos:' ( (lv_containsRepos_16_0= ruleERepository ) ) (otherlv_17= ',' ( (lv_containsRepos_18_0= ruleERepository ) ) )* )? (otherlv_19= 'containsContainers:' ( (lv_containsContainers_20_0= ruleEContainer ) ) (otherlv_21= ',' ( (lv_containsContainers_22_0= ruleEContainer ) ) )* )? otherlv_23= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getESystemAccess().getESystemKeyword_0());
            		
            // InternalMyDsl.g:84:3: ( (lv_name_1_0= ruleEString ) )
            // InternalMyDsl.g:85:4: (lv_name_1_0= ruleEString )
            {
            // InternalMyDsl.g:85:4: (lv_name_1_0= ruleEString )
            // InternalMyDsl.g:86:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getESystemAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getESystemRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getESystemAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:107:3: (otherlv_3= 'provides:' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* )
            // InternalMyDsl.g:108:4: otherlv_3= 'provides:' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )*
            {
            otherlv_3=(Token)match(input,13,FOLLOW_6); 

            				newLeafNode(otherlv_3, grammarAccess.getESystemAccess().getProvidesKeyword_3_0());
            			
            // InternalMyDsl.g:112:4: ( (otherlv_4= RULE_ID ) )
            // InternalMyDsl.g:113:5: (otherlv_4= RULE_ID )
            {
            // InternalMyDsl.g:113:5: (otherlv_4= RULE_ID )
            // InternalMyDsl.g:114:6: otherlv_4= RULE_ID
            {

            						if (current==null) {
            							current = createModelElement(grammarAccess.getESystemRule());
            						}
            					
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_7); 

            						newLeafNode(otherlv_4, grammarAccess.getESystemAccess().getProvidesEInterfaceCrossReference_3_1_0());
            					

            }


            }

            // InternalMyDsl.g:125:4: (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:126:5: otherlv_5= ',' ( (otherlv_6= RULE_ID ) )
            	    {
            	    otherlv_5=(Token)match(input,14,FOLLOW_6); 

            	    					newLeafNode(otherlv_5, grammarAccess.getESystemAccess().getCommaKeyword_3_2_0());
            	    				
            	    // InternalMyDsl.g:130:5: ( (otherlv_6= RULE_ID ) )
            	    // InternalMyDsl.g:131:6: (otherlv_6= RULE_ID )
            	    {
            	    // InternalMyDsl.g:131:6: (otherlv_6= RULE_ID )
            	    // InternalMyDsl.g:132:7: otherlv_6= RULE_ID
            	    {

            	    							if (current==null) {
            	    								current = createModelElement(grammarAccess.getESystemRule());
            	    							}
            	    						
            	    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_7); 

            	    							newLeafNode(otherlv_6, grammarAccess.getESystemAccess().getProvidesEInterfaceCrossReference_3_2_1_0());
            	    						

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            // InternalMyDsl.g:145:3: (otherlv_7= 'requires:' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==15) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:146:4: otherlv_7= 'requires:' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )*
                    {
                    otherlv_7=(Token)match(input,15,FOLLOW_6); 

                    				newLeafNode(otherlv_7, grammarAccess.getESystemAccess().getRequiresKeyword_4_0());
                    			
                    // InternalMyDsl.g:150:4: ( (otherlv_8= RULE_ID ) )
                    // InternalMyDsl.g:151:5: (otherlv_8= RULE_ID )
                    {
                    // InternalMyDsl.g:151:5: (otherlv_8= RULE_ID )
                    // InternalMyDsl.g:152:6: otherlv_8= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getESystemRule());
                    						}
                    					
                    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_8); 

                    						newLeafNode(otherlv_8, grammarAccess.getESystemAccess().getRequiresEInterfaceCrossReference_4_1_0());
                    					

                    }


                    }

                    // InternalMyDsl.g:163:4: (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==14) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // InternalMyDsl.g:164:5: otherlv_9= ',' ( (otherlv_10= RULE_ID ) )
                    	    {
                    	    otherlv_9=(Token)match(input,14,FOLLOW_6); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getESystemAccess().getCommaKeyword_4_2_0());
                    	    				
                    	    // InternalMyDsl.g:168:5: ( (otherlv_10= RULE_ID ) )
                    	    // InternalMyDsl.g:169:6: (otherlv_10= RULE_ID )
                    	    {
                    	    // InternalMyDsl.g:169:6: (otherlv_10= RULE_ID )
                    	    // InternalMyDsl.g:170:7: otherlv_10= RULE_ID
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getESystemRule());
                    	    							}
                    	    						
                    	    otherlv_10=(Token)match(input,RULE_ID,FOLLOW_8); 

                    	    							newLeafNode(otherlv_10, grammarAccess.getESystemAccess().getRequiresEInterfaceCrossReference_4_2_1_0());
                    	    						

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

            // InternalMyDsl.g:183:3: (otherlv_11= 'encapsulates:' ( (otherlv_12= RULE_ID ) ) (otherlv_13= ',' ( (otherlv_14= RULE_ID ) ) )* )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==16) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:184:4: otherlv_11= 'encapsulates:' ( (otherlv_12= RULE_ID ) ) (otherlv_13= ',' ( (otherlv_14= RULE_ID ) ) )*
                    {
                    otherlv_11=(Token)match(input,16,FOLLOW_6); 

                    				newLeafNode(otherlv_11, grammarAccess.getESystemAccess().getEncapsulatesKeyword_5_0());
                    			
                    // InternalMyDsl.g:188:4: ( (otherlv_12= RULE_ID ) )
                    // InternalMyDsl.g:189:5: (otherlv_12= RULE_ID )
                    {
                    // InternalMyDsl.g:189:5: (otherlv_12= RULE_ID )
                    // InternalMyDsl.g:190:6: otherlv_12= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getESystemRule());
                    						}
                    					
                    otherlv_12=(Token)match(input,RULE_ID,FOLLOW_9); 

                    						newLeafNode(otherlv_12, grammarAccess.getESystemAccess().getEncapsulatesEAssemblyContextCrossReference_5_1_0());
                    					

                    }


                    }

                    // InternalMyDsl.g:201:4: (otherlv_13= ',' ( (otherlv_14= RULE_ID ) ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==14) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalMyDsl.g:202:5: otherlv_13= ',' ( (otherlv_14= RULE_ID ) )
                    	    {
                    	    otherlv_13=(Token)match(input,14,FOLLOW_6); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getESystemAccess().getCommaKeyword_5_2_0());
                    	    				
                    	    // InternalMyDsl.g:206:5: ( (otherlv_14= RULE_ID ) )
                    	    // InternalMyDsl.g:207:6: (otherlv_14= RULE_ID )
                    	    {
                    	    // InternalMyDsl.g:207:6: (otherlv_14= RULE_ID )
                    	    // InternalMyDsl.g:208:7: otherlv_14= RULE_ID
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getESystemRule());
                    	    							}
                    	    						
                    	    otherlv_14=(Token)match(input,RULE_ID,FOLLOW_9); 

                    	    							newLeafNode(otherlv_14, grammarAccess.getESystemAccess().getEncapsulatesEAssemblyContextCrossReference_5_2_1_0());
                    	    						

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

            // InternalMyDsl.g:221:3: (otherlv_15= 'containsRepos:' ( (lv_containsRepos_16_0= ruleERepository ) ) (otherlv_17= ',' ( (lv_containsRepos_18_0= ruleERepository ) ) )* )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==17) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalMyDsl.g:222:4: otherlv_15= 'containsRepos:' ( (lv_containsRepos_16_0= ruleERepository ) ) (otherlv_17= ',' ( (lv_containsRepos_18_0= ruleERepository ) ) )*
                    {
                    otherlv_15=(Token)match(input,17,FOLLOW_10); 

                    				newLeafNode(otherlv_15, grammarAccess.getESystemAccess().getContainsReposKeyword_6_0());
                    			
                    // InternalMyDsl.g:226:4: ( (lv_containsRepos_16_0= ruleERepository ) )
                    // InternalMyDsl.g:227:5: (lv_containsRepos_16_0= ruleERepository )
                    {
                    // InternalMyDsl.g:227:5: (lv_containsRepos_16_0= ruleERepository )
                    // InternalMyDsl.g:228:6: lv_containsRepos_16_0= ruleERepository
                    {

                    						newCompositeNode(grammarAccess.getESystemAccess().getContainsReposERepositoryParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_containsRepos_16_0=ruleERepository();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getESystemRule());
                    						}
                    						add(
                    							current,
                    							"containsRepos",
                    							lv_containsRepos_16_0,
                    							"org.xtext.example.mydsl.MyDsl.ERepository");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:245:4: (otherlv_17= ',' ( (lv_containsRepos_18_0= ruleERepository ) ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==14) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalMyDsl.g:246:5: otherlv_17= ',' ( (lv_containsRepos_18_0= ruleERepository ) )
                    	    {
                    	    otherlv_17=(Token)match(input,14,FOLLOW_10); 

                    	    					newLeafNode(otherlv_17, grammarAccess.getESystemAccess().getCommaKeyword_6_2_0());
                    	    				
                    	    // InternalMyDsl.g:250:5: ( (lv_containsRepos_18_0= ruleERepository ) )
                    	    // InternalMyDsl.g:251:6: (lv_containsRepos_18_0= ruleERepository )
                    	    {
                    	    // InternalMyDsl.g:251:6: (lv_containsRepos_18_0= ruleERepository )
                    	    // InternalMyDsl.g:252:7: lv_containsRepos_18_0= ruleERepository
                    	    {

                    	    							newCompositeNode(grammarAccess.getESystemAccess().getContainsReposERepositoryParserRuleCall_6_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_11);
                    	    lv_containsRepos_18_0=ruleERepository();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getESystemRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"containsRepos",
                    	    								lv_containsRepos_18_0,
                    	    								"org.xtext.example.mydsl.MyDsl.ERepository");
                    	    							afterParserOrEnumRuleCall();
                    	    						

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

            // InternalMyDsl.g:271:3: (otherlv_19= 'containsContainers:' ( (lv_containsContainers_20_0= ruleEContainer ) ) (otherlv_21= ',' ( (lv_containsContainers_22_0= ruleEContainer ) ) )* )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==18) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalMyDsl.g:272:4: otherlv_19= 'containsContainers:' ( (lv_containsContainers_20_0= ruleEContainer ) ) (otherlv_21= ',' ( (lv_containsContainers_22_0= ruleEContainer ) ) )*
                    {
                    otherlv_19=(Token)match(input,18,FOLLOW_12); 

                    				newLeafNode(otherlv_19, grammarAccess.getESystemAccess().getContainsContainersKeyword_7_0());
                    			
                    // InternalMyDsl.g:276:4: ( (lv_containsContainers_20_0= ruleEContainer ) )
                    // InternalMyDsl.g:277:5: (lv_containsContainers_20_0= ruleEContainer )
                    {
                    // InternalMyDsl.g:277:5: (lv_containsContainers_20_0= ruleEContainer )
                    // InternalMyDsl.g:278:6: lv_containsContainers_20_0= ruleEContainer
                    {

                    						newCompositeNode(grammarAccess.getESystemAccess().getContainsContainersEContainerParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_containsContainers_20_0=ruleEContainer();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getESystemRule());
                    						}
                    						add(
                    							current,
                    							"containsContainers",
                    							lv_containsContainers_20_0,
                    							"org.xtext.example.mydsl.MyDsl.EContainer");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:295:4: (otherlv_21= ',' ( (lv_containsContainers_22_0= ruleEContainer ) ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==14) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalMyDsl.g:296:5: otherlv_21= ',' ( (lv_containsContainers_22_0= ruleEContainer ) )
                    	    {
                    	    otherlv_21=(Token)match(input,14,FOLLOW_12); 

                    	    					newLeafNode(otherlv_21, grammarAccess.getESystemAccess().getCommaKeyword_7_2_0());
                    	    				
                    	    // InternalMyDsl.g:300:5: ( (lv_containsContainers_22_0= ruleEContainer ) )
                    	    // InternalMyDsl.g:301:6: (lv_containsContainers_22_0= ruleEContainer )
                    	    {
                    	    // InternalMyDsl.g:301:6: (lv_containsContainers_22_0= ruleEContainer )
                    	    // InternalMyDsl.g:302:7: lv_containsContainers_22_0= ruleEContainer
                    	    {

                    	    							newCompositeNode(grammarAccess.getESystemAccess().getContainsContainersEContainerParserRuleCall_7_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_13);
                    	    lv_containsContainers_22_0=ruleEContainer();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getESystemRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"containsContainers",
                    	    								lv_containsContainers_22_0,
                    	    								"org.xtext.example.mydsl.MyDsl.EContainer");
                    	    							afterParserOrEnumRuleCall();
                    	    						

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

            otherlv_23=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_23, grammarAccess.getESystemAccess().getRightCurlyBracketKeyword_8());
            		

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


    // $ANTLR start "entryRuleEInterface"
    // InternalMyDsl.g:329:1: entryRuleEInterface returns [EObject current=null] : iv_ruleEInterface= ruleEInterface EOF ;
    public final EObject entryRuleEInterface() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEInterface = null;


        try {
            // InternalMyDsl.g:329:51: (iv_ruleEInterface= ruleEInterface EOF )
            // InternalMyDsl.g:330:2: iv_ruleEInterface= ruleEInterface EOF
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
    // InternalMyDsl.g:336:1: ruleEInterface returns [EObject current=null] : ( () otherlv_1= 'EInterface' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'resultsIn:' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* )? (otherlv_8= 'providedByComponent:' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* )? (otherlv_12= 'providedBySystem:' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* )? (otherlv_16= 'requiredByComponent:' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* )? (otherlv_20= 'requiredBySystem:' ( ( ruleEString ) ) (otherlv_22= ',' ( ( ruleEString ) ) )* )? (otherlv_24= 'signature:' ( (lv_signature_25_0= ruleESignature ) ) (otherlv_26= ',' ( (lv_signature_27_0= ruleESignature ) ) )* )? otherlv_28= '}' ) ;
    public final EObject ruleEInterface() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token otherlv_26=null;
        Token otherlv_28=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_signature_25_0 = null;

        EObject lv_signature_27_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:342:2: ( ( () otherlv_1= 'EInterface' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'resultsIn:' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* )? (otherlv_8= 'providedByComponent:' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* )? (otherlv_12= 'providedBySystem:' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* )? (otherlv_16= 'requiredByComponent:' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* )? (otherlv_20= 'requiredBySystem:' ( ( ruleEString ) ) (otherlv_22= ',' ( ( ruleEString ) ) )* )? (otherlv_24= 'signature:' ( (lv_signature_25_0= ruleESignature ) ) (otherlv_26= ',' ( (lv_signature_27_0= ruleESignature ) ) )* )? otherlv_28= '}' ) )
            // InternalMyDsl.g:343:2: ( () otherlv_1= 'EInterface' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'resultsIn:' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* )? (otherlv_8= 'providedByComponent:' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* )? (otherlv_12= 'providedBySystem:' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* )? (otherlv_16= 'requiredByComponent:' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* )? (otherlv_20= 'requiredBySystem:' ( ( ruleEString ) ) (otherlv_22= ',' ( ( ruleEString ) ) )* )? (otherlv_24= 'signature:' ( (lv_signature_25_0= ruleESignature ) ) (otherlv_26= ',' ( (lv_signature_27_0= ruleESignature ) ) )* )? otherlv_28= '}' )
            {
            // InternalMyDsl.g:343:2: ( () otherlv_1= 'EInterface' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'resultsIn:' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* )? (otherlv_8= 'providedByComponent:' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* )? (otherlv_12= 'providedBySystem:' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* )? (otherlv_16= 'requiredByComponent:' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* )? (otherlv_20= 'requiredBySystem:' ( ( ruleEString ) ) (otherlv_22= ',' ( ( ruleEString ) ) )* )? (otherlv_24= 'signature:' ( (lv_signature_25_0= ruleESignature ) ) (otherlv_26= ',' ( (lv_signature_27_0= ruleESignature ) ) )* )? otherlv_28= '}' )
            // InternalMyDsl.g:344:3: () otherlv_1= 'EInterface' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'resultsIn:' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* )? (otherlv_8= 'providedByComponent:' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* )? (otherlv_12= 'providedBySystem:' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* )? (otherlv_16= 'requiredByComponent:' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* )? (otherlv_20= 'requiredBySystem:' ( ( ruleEString ) ) (otherlv_22= ',' ( ( ruleEString ) ) )* )? (otherlv_24= 'signature:' ( (lv_signature_25_0= ruleESignature ) ) (otherlv_26= ',' ( (lv_signature_27_0= ruleESignature ) ) )* )? otherlv_28= '}'
            {
            // InternalMyDsl.g:344:3: ()
            // InternalMyDsl.g:345:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEInterfaceAccess().getEInterfaceAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,20,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getEInterfaceAccess().getEInterfaceKeyword_1());
            		
            // InternalMyDsl.g:355:3: ( (lv_name_2_0= ruleEString ) )
            // InternalMyDsl.g:356:4: (lv_name_2_0= ruleEString )
            {
            // InternalMyDsl.g:356:4: (lv_name_2_0= ruleEString )
            // InternalMyDsl.g:357:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getEInterfaceAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEInterfaceRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_14); 

            			newLeafNode(otherlv_3, grammarAccess.getEInterfaceAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalMyDsl.g:378:3: (otherlv_4= 'resultsIn:' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==21) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalMyDsl.g:379:4: otherlv_4= 'resultsIn:' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )*
                    {
                    otherlv_4=(Token)match(input,21,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getEInterfaceAccess().getResultsInKeyword_4_0());
                    			
                    // InternalMyDsl.g:383:4: ( ( ruleEString ) )
                    // InternalMyDsl.g:384:5: ( ruleEString )
                    {
                    // InternalMyDsl.g:384:5: ( ruleEString )
                    // InternalMyDsl.g:385:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEInterfaceRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getEInterfaceAccess().getResultsInERoleCrossReference_4_1_0());
                    					
                    pushFollow(FOLLOW_15);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:399:4: (otherlv_6= ',' ( ( ruleEString ) ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==14) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalMyDsl.g:400:5: otherlv_6= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_6=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getEInterfaceAccess().getCommaKeyword_4_2_0());
                    	    				
                    	    // InternalMyDsl.g:404:5: ( ( ruleEString ) )
                    	    // InternalMyDsl.g:405:6: ( ruleEString )
                    	    {
                    	    // InternalMyDsl.g:405:6: ( ruleEString )
                    	    // InternalMyDsl.g:406:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getEInterfaceRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getEInterfaceAccess().getResultsInERoleCrossReference_4_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_15);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

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

            // InternalMyDsl.g:422:3: (otherlv_8= 'providedByComponent:' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==22) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalMyDsl.g:423:4: otherlv_8= 'providedByComponent:' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )*
                    {
                    otherlv_8=(Token)match(input,22,FOLLOW_3); 

                    				newLeafNode(otherlv_8, grammarAccess.getEInterfaceAccess().getProvidedByComponentKeyword_5_0());
                    			
                    // InternalMyDsl.g:427:4: ( ( ruleEString ) )
                    // InternalMyDsl.g:428:5: ( ruleEString )
                    {
                    // InternalMyDsl.g:428:5: ( ruleEString )
                    // InternalMyDsl.g:429:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEInterfaceRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getEInterfaceAccess().getProvidedByComponentEComponentCrossReference_5_1_0());
                    					
                    pushFollow(FOLLOW_16);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:443:4: (otherlv_10= ',' ( ( ruleEString ) ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==14) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // InternalMyDsl.g:444:5: otherlv_10= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_10=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_10, grammarAccess.getEInterfaceAccess().getCommaKeyword_5_2_0());
                    	    				
                    	    // InternalMyDsl.g:448:5: ( ( ruleEString ) )
                    	    // InternalMyDsl.g:449:6: ( ruleEString )
                    	    {
                    	    // InternalMyDsl.g:449:6: ( ruleEString )
                    	    // InternalMyDsl.g:450:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getEInterfaceRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getEInterfaceAccess().getProvidedByComponentEComponentCrossReference_5_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_16);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

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

            // InternalMyDsl.g:466:3: (otherlv_12= 'providedBySystem:' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==23) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalMyDsl.g:467:4: otherlv_12= 'providedBySystem:' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )*
                    {
                    otherlv_12=(Token)match(input,23,FOLLOW_3); 

                    				newLeafNode(otherlv_12, grammarAccess.getEInterfaceAccess().getProvidedBySystemKeyword_6_0());
                    			
                    // InternalMyDsl.g:471:4: ( ( ruleEString ) )
                    // InternalMyDsl.g:472:5: ( ruleEString )
                    {
                    // InternalMyDsl.g:472:5: ( ruleEString )
                    // InternalMyDsl.g:473:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEInterfaceRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getEInterfaceAccess().getProvidedBySystemESystemCrossReference_6_1_0());
                    					
                    pushFollow(FOLLOW_17);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:487:4: (otherlv_14= ',' ( ( ruleEString ) ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==14) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // InternalMyDsl.g:488:5: otherlv_14= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_14=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_14, grammarAccess.getEInterfaceAccess().getCommaKeyword_6_2_0());
                    	    				
                    	    // InternalMyDsl.g:492:5: ( ( ruleEString ) )
                    	    // InternalMyDsl.g:493:6: ( ruleEString )
                    	    {
                    	    // InternalMyDsl.g:493:6: ( ruleEString )
                    	    // InternalMyDsl.g:494:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getEInterfaceRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getEInterfaceAccess().getProvidedBySystemESystemCrossReference_6_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_17);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

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

            // InternalMyDsl.g:510:3: (otherlv_16= 'requiredByComponent:' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==24) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalMyDsl.g:511:4: otherlv_16= 'requiredByComponent:' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )*
                    {
                    otherlv_16=(Token)match(input,24,FOLLOW_3); 

                    				newLeafNode(otherlv_16, grammarAccess.getEInterfaceAccess().getRequiredByComponentKeyword_7_0());
                    			
                    // InternalMyDsl.g:515:4: ( ( ruleEString ) )
                    // InternalMyDsl.g:516:5: ( ruleEString )
                    {
                    // InternalMyDsl.g:516:5: ( ruleEString )
                    // InternalMyDsl.g:517:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEInterfaceRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getEInterfaceAccess().getRequiredByComponentEComponentCrossReference_7_1_0());
                    					
                    pushFollow(FOLLOW_18);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:531:4: (otherlv_18= ',' ( ( ruleEString ) ) )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==14) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // InternalMyDsl.g:532:5: otherlv_18= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_18=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_18, grammarAccess.getEInterfaceAccess().getCommaKeyword_7_2_0());
                    	    				
                    	    // InternalMyDsl.g:536:5: ( ( ruleEString ) )
                    	    // InternalMyDsl.g:537:6: ( ruleEString )
                    	    {
                    	    // InternalMyDsl.g:537:6: ( ruleEString )
                    	    // InternalMyDsl.g:538:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getEInterfaceRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getEInterfaceAccess().getRequiredByComponentEComponentCrossReference_7_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_18);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

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

            // InternalMyDsl.g:554:3: (otherlv_20= 'requiredBySystem:' ( ( ruleEString ) ) (otherlv_22= ',' ( ( ruleEString ) ) )* )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==25) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalMyDsl.g:555:4: otherlv_20= 'requiredBySystem:' ( ( ruleEString ) ) (otherlv_22= ',' ( ( ruleEString ) ) )*
                    {
                    otherlv_20=(Token)match(input,25,FOLLOW_3); 

                    				newLeafNode(otherlv_20, grammarAccess.getEInterfaceAccess().getRequiredBySystemKeyword_8_0());
                    			
                    // InternalMyDsl.g:559:4: ( ( ruleEString ) )
                    // InternalMyDsl.g:560:5: ( ruleEString )
                    {
                    // InternalMyDsl.g:560:5: ( ruleEString )
                    // InternalMyDsl.g:561:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEInterfaceRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getEInterfaceAccess().getRequiredBySystemESystemCrossReference_8_1_0());
                    					
                    pushFollow(FOLLOW_19);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:575:4: (otherlv_22= ',' ( ( ruleEString ) ) )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==14) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // InternalMyDsl.g:576:5: otherlv_22= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_22=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_22, grammarAccess.getEInterfaceAccess().getCommaKeyword_8_2_0());
                    	    				
                    	    // InternalMyDsl.g:580:5: ( ( ruleEString ) )
                    	    // InternalMyDsl.g:581:6: ( ruleEString )
                    	    {
                    	    // InternalMyDsl.g:581:6: ( ruleEString )
                    	    // InternalMyDsl.g:582:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getEInterfaceRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getEInterfaceAccess().getRequiredBySystemESystemCrossReference_8_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_19);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalMyDsl.g:598:3: (otherlv_24= 'signature:' ( (lv_signature_25_0= ruleESignature ) ) (otherlv_26= ',' ( (lv_signature_27_0= ruleESignature ) ) )* )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==26) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalMyDsl.g:599:4: otherlv_24= 'signature:' ( (lv_signature_25_0= ruleESignature ) ) (otherlv_26= ',' ( (lv_signature_27_0= ruleESignature ) ) )*
                    {
                    otherlv_24=(Token)match(input,26,FOLLOW_20); 

                    				newLeafNode(otherlv_24, grammarAccess.getEInterfaceAccess().getSignatureKeyword_9_0());
                    			
                    // InternalMyDsl.g:603:4: ( (lv_signature_25_0= ruleESignature ) )
                    // InternalMyDsl.g:604:5: (lv_signature_25_0= ruleESignature )
                    {
                    // InternalMyDsl.g:604:5: (lv_signature_25_0= ruleESignature )
                    // InternalMyDsl.g:605:6: lv_signature_25_0= ruleESignature
                    {

                    						newCompositeNode(grammarAccess.getEInterfaceAccess().getSignatureESignatureParserRuleCall_9_1_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_signature_25_0=ruleESignature();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEInterfaceRule());
                    						}
                    						add(
                    							current,
                    							"signature",
                    							lv_signature_25_0,
                    							"org.xtext.example.mydsl.MyDsl.ESignature");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:622:4: (otherlv_26= ',' ( (lv_signature_27_0= ruleESignature ) ) )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==14) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // InternalMyDsl.g:623:5: otherlv_26= ',' ( (lv_signature_27_0= ruleESignature ) )
                    	    {
                    	    otherlv_26=(Token)match(input,14,FOLLOW_20); 

                    	    					newLeafNode(otherlv_26, grammarAccess.getEInterfaceAccess().getCommaKeyword_9_2_0());
                    	    				
                    	    // InternalMyDsl.g:627:5: ( (lv_signature_27_0= ruleESignature ) )
                    	    // InternalMyDsl.g:628:6: (lv_signature_27_0= ruleESignature )
                    	    {
                    	    // InternalMyDsl.g:628:6: (lv_signature_27_0= ruleESignature )
                    	    // InternalMyDsl.g:629:7: lv_signature_27_0= ruleESignature
                    	    {

                    	    							newCompositeNode(grammarAccess.getEInterfaceAccess().getSignatureESignatureParserRuleCall_9_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_13);
                    	    lv_signature_27_0=ruleESignature();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getEInterfaceRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"signature",
                    	    								lv_signature_27_0,
                    	    								"org.xtext.example.mydsl.MyDsl.ESignature");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop20;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_28=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_28, grammarAccess.getEInterfaceAccess().getRightCurlyBracketKeyword_10());
            		

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


    // $ANTLR start "entryRuleEParameter"
    // InternalMyDsl.g:656:1: entryRuleEParameter returns [EObject current=null] : iv_ruleEParameter= ruleEParameter EOF ;
    public final EObject entryRuleEParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEParameter = null;


        try {
            // InternalMyDsl.g:656:51: (iv_ruleEParameter= ruleEParameter EOF )
            // InternalMyDsl.g:657:2: iv_ruleEParameter= ruleEParameter EOF
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
    // InternalMyDsl.g:663:1: ruleEParameter returns [EObject current=null] : ( () otherlv_1= 'EParameter' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'type:' ( (lv_type_5_0= rulePossibleParameterTypes ) ) ) otherlv_6= '}' ) ;
    public final EObject ruleEParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        Enumerator lv_type_5_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:669:2: ( ( () otherlv_1= 'EParameter' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'type:' ( (lv_type_5_0= rulePossibleParameterTypes ) ) ) otherlv_6= '}' ) )
            // InternalMyDsl.g:670:2: ( () otherlv_1= 'EParameter' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'type:' ( (lv_type_5_0= rulePossibleParameterTypes ) ) ) otherlv_6= '}' )
            {
            // InternalMyDsl.g:670:2: ( () otherlv_1= 'EParameter' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'type:' ( (lv_type_5_0= rulePossibleParameterTypes ) ) ) otherlv_6= '}' )
            // InternalMyDsl.g:671:3: () otherlv_1= 'EParameter' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'type:' ( (lv_type_5_0= rulePossibleParameterTypes ) ) ) otherlv_6= '}'
            {
            // InternalMyDsl.g:671:3: ()
            // InternalMyDsl.g:672:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEParameterAccess().getEParameterAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,27,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getEParameterAccess().getEParameterKeyword_1());
            		
            // InternalMyDsl.g:682:3: ( (lv_name_2_0= ruleEString ) )
            // InternalMyDsl.g:683:4: (lv_name_2_0= ruleEString )
            {
            // InternalMyDsl.g:683:4: (lv_name_2_0= ruleEString )
            // InternalMyDsl.g:684:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getEParameterAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEParameterRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_21); 

            			newLeafNode(otherlv_3, grammarAccess.getEParameterAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalMyDsl.g:705:3: (otherlv_4= 'type:' ( (lv_type_5_0= rulePossibleParameterTypes ) ) )
            // InternalMyDsl.g:706:4: otherlv_4= 'type:' ( (lv_type_5_0= rulePossibleParameterTypes ) )
            {
            otherlv_4=(Token)match(input,28,FOLLOW_22); 

            				newLeafNode(otherlv_4, grammarAccess.getEParameterAccess().getTypeKeyword_4_0());
            			
            // InternalMyDsl.g:710:4: ( (lv_type_5_0= rulePossibleParameterTypes ) )
            // InternalMyDsl.g:711:5: (lv_type_5_0= rulePossibleParameterTypes )
            {
            // InternalMyDsl.g:711:5: (lv_type_5_0= rulePossibleParameterTypes )
            // InternalMyDsl.g:712:6: lv_type_5_0= rulePossibleParameterTypes
            {

            						newCompositeNode(grammarAccess.getEParameterAccess().getTypePossibleParameterTypesEnumRuleCall_4_1_0());
            					
            pushFollow(FOLLOW_23);
            lv_type_5_0=rulePossibleParameterTypes();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getEParameterRule());
            						}
            						set(
            							current,
            							"type",
            							lv_type_5_0,
            							"org.xtext.example.mydsl.MyDsl.PossibleParameterTypes");
            						afterParserOrEnumRuleCall();
            					

            }


            }


            }

            otherlv_6=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getEParameterAccess().getRightCurlyBracketKeyword_5());
            		

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


    // $ANTLR start "entryRuleEString"
    // InternalMyDsl.g:738:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalMyDsl.g:738:47: (iv_ruleEString= ruleEString EOF )
            // InternalMyDsl.g:739:2: iv_ruleEString= ruleEString EOF
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
    // InternalMyDsl.g:745:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:751:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalMyDsl.g:752:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalMyDsl.g:752:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_STRING) ) {
                alt22=1;
            }
            else if ( (LA22_0==RULE_ID) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // InternalMyDsl.g:753:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:761:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

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
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleECompositeComponent"
    // InternalMyDsl.g:772:1: entryRuleECompositeComponent returns [EObject current=null] : iv_ruleECompositeComponent= ruleECompositeComponent EOF ;
    public final EObject entryRuleECompositeComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleECompositeComponent = null;


        try {
            // InternalMyDsl.g:772:60: (iv_ruleECompositeComponent= ruleECompositeComponent EOF )
            // InternalMyDsl.g:773:2: iv_ruleECompositeComponent= ruleECompositeComponent EOF
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
    // InternalMyDsl.g:779:1: ruleECompositeComponent returns [EObject current=null] : ( () otherlv_1= 'ECompositeComponent' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'providesInterfaceTo:' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* )? (otherlv_8= 'usesInterfaceFrom:' ( (otherlv_9= RULE_ID ) ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )* )? (otherlv_12= 'providesDirectly:' ( (otherlv_13= RULE_ID ) ) (otherlv_14= ',' ( (otherlv_15= RULE_ID ) ) )* )? (otherlv_16= 'provides:' ( (otherlv_17= RULE_ID ) ) (otherlv_18= ',' ( (otherlv_19= RULE_ID ) ) )* )? (otherlv_20= 'requires:' ( (otherlv_21= RULE_ID ) ) (otherlv_22= ',' ( (otherlv_23= RULE_ID ) ) )* )? (otherlv_24= 'encapsulates:' ( (otherlv_25= RULE_ID ) ) (otherlv_26= ',' ( (otherlv_27= RULE_ID ) ) )* )? (otherlv_28= 'behaviourDescription:' ( (lv_behaviourDescription_29_0= ruleEBehaviourDescription ) ) )? otherlv_30= '}' ) ;
    public final EObject ruleECompositeComponent() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
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
        Token otherlv_28=null;
        Token otherlv_30=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_behaviourDescription_29_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:785:2: ( ( () otherlv_1= 'ECompositeComponent' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'providesInterfaceTo:' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* )? (otherlv_8= 'usesInterfaceFrom:' ( (otherlv_9= RULE_ID ) ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )* )? (otherlv_12= 'providesDirectly:' ( (otherlv_13= RULE_ID ) ) (otherlv_14= ',' ( (otherlv_15= RULE_ID ) ) )* )? (otherlv_16= 'provides:' ( (otherlv_17= RULE_ID ) ) (otherlv_18= ',' ( (otherlv_19= RULE_ID ) ) )* )? (otherlv_20= 'requires:' ( (otherlv_21= RULE_ID ) ) (otherlv_22= ',' ( (otherlv_23= RULE_ID ) ) )* )? (otherlv_24= 'encapsulates:' ( (otherlv_25= RULE_ID ) ) (otherlv_26= ',' ( (otherlv_27= RULE_ID ) ) )* )? (otherlv_28= 'behaviourDescription:' ( (lv_behaviourDescription_29_0= ruleEBehaviourDescription ) ) )? otherlv_30= '}' ) )
            // InternalMyDsl.g:786:2: ( () otherlv_1= 'ECompositeComponent' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'providesInterfaceTo:' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* )? (otherlv_8= 'usesInterfaceFrom:' ( (otherlv_9= RULE_ID ) ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )* )? (otherlv_12= 'providesDirectly:' ( (otherlv_13= RULE_ID ) ) (otherlv_14= ',' ( (otherlv_15= RULE_ID ) ) )* )? (otherlv_16= 'provides:' ( (otherlv_17= RULE_ID ) ) (otherlv_18= ',' ( (otherlv_19= RULE_ID ) ) )* )? (otherlv_20= 'requires:' ( (otherlv_21= RULE_ID ) ) (otherlv_22= ',' ( (otherlv_23= RULE_ID ) ) )* )? (otherlv_24= 'encapsulates:' ( (otherlv_25= RULE_ID ) ) (otherlv_26= ',' ( (otherlv_27= RULE_ID ) ) )* )? (otherlv_28= 'behaviourDescription:' ( (lv_behaviourDescription_29_0= ruleEBehaviourDescription ) ) )? otherlv_30= '}' )
            {
            // InternalMyDsl.g:786:2: ( () otherlv_1= 'ECompositeComponent' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'providesInterfaceTo:' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* )? (otherlv_8= 'usesInterfaceFrom:' ( (otherlv_9= RULE_ID ) ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )* )? (otherlv_12= 'providesDirectly:' ( (otherlv_13= RULE_ID ) ) (otherlv_14= ',' ( (otherlv_15= RULE_ID ) ) )* )? (otherlv_16= 'provides:' ( (otherlv_17= RULE_ID ) ) (otherlv_18= ',' ( (otherlv_19= RULE_ID ) ) )* )? (otherlv_20= 'requires:' ( (otherlv_21= RULE_ID ) ) (otherlv_22= ',' ( (otherlv_23= RULE_ID ) ) )* )? (otherlv_24= 'encapsulates:' ( (otherlv_25= RULE_ID ) ) (otherlv_26= ',' ( (otherlv_27= RULE_ID ) ) )* )? (otherlv_28= 'behaviourDescription:' ( (lv_behaviourDescription_29_0= ruleEBehaviourDescription ) ) )? otherlv_30= '}' )
            // InternalMyDsl.g:787:3: () otherlv_1= 'ECompositeComponent' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'providesInterfaceTo:' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* )? (otherlv_8= 'usesInterfaceFrom:' ( (otherlv_9= RULE_ID ) ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )* )? (otherlv_12= 'providesDirectly:' ( (otherlv_13= RULE_ID ) ) (otherlv_14= ',' ( (otherlv_15= RULE_ID ) ) )* )? (otherlv_16= 'provides:' ( (otherlv_17= RULE_ID ) ) (otherlv_18= ',' ( (otherlv_19= RULE_ID ) ) )* )? (otherlv_20= 'requires:' ( (otherlv_21= RULE_ID ) ) (otherlv_22= ',' ( (otherlv_23= RULE_ID ) ) )* )? (otherlv_24= 'encapsulates:' ( (otherlv_25= RULE_ID ) ) (otherlv_26= ',' ( (otherlv_27= RULE_ID ) ) )* )? (otherlv_28= 'behaviourDescription:' ( (lv_behaviourDescription_29_0= ruleEBehaviourDescription ) ) )? otherlv_30= '}'
            {
            // InternalMyDsl.g:787:3: ()
            // InternalMyDsl.g:788:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getECompositeComponentAccess().getECompositeComponentAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,29,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getECompositeComponentAccess().getECompositeComponentKeyword_1());
            		
            // InternalMyDsl.g:798:3: ( (lv_name_2_0= ruleEString ) )
            // InternalMyDsl.g:799:4: (lv_name_2_0= ruleEString )
            {
            // InternalMyDsl.g:799:4: (lv_name_2_0= ruleEString )
            // InternalMyDsl.g:800:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getECompositeComponentAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getECompositeComponentRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_24); 

            			newLeafNode(otherlv_3, grammarAccess.getECompositeComponentAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalMyDsl.g:821:3: (otherlv_4= 'providesInterfaceTo:' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==30) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalMyDsl.g:822:4: otherlv_4= 'providesInterfaceTo:' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )*
                    {
                    otherlv_4=(Token)match(input,30,FOLLOW_6); 

                    				newLeafNode(otherlv_4, grammarAccess.getECompositeComponentAccess().getProvidesInterfaceToKeyword_4_0());
                    			
                    // InternalMyDsl.g:826:4: ( (otherlv_5= RULE_ID ) )
                    // InternalMyDsl.g:827:5: (otherlv_5= RULE_ID )
                    {
                    // InternalMyDsl.g:827:5: (otherlv_5= RULE_ID )
                    // InternalMyDsl.g:828:6: otherlv_5= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getECompositeComponentRule());
                    						}
                    					
                    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_25); 

                    						newLeafNode(otherlv_5, grammarAccess.getECompositeComponentAccess().getProvidesInterfaceToEComponentCrossReference_4_1_0());
                    					

                    }


                    }

                    // InternalMyDsl.g:839:4: (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )*
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==14) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // InternalMyDsl.g:840:5: otherlv_6= ',' ( (otherlv_7= RULE_ID ) )
                    	    {
                    	    otherlv_6=(Token)match(input,14,FOLLOW_6); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getECompositeComponentAccess().getCommaKeyword_4_2_0());
                    	    				
                    	    // InternalMyDsl.g:844:5: ( (otherlv_7= RULE_ID ) )
                    	    // InternalMyDsl.g:845:6: (otherlv_7= RULE_ID )
                    	    {
                    	    // InternalMyDsl.g:845:6: (otherlv_7= RULE_ID )
                    	    // InternalMyDsl.g:846:7: otherlv_7= RULE_ID
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getECompositeComponentRule());
                    	    							}
                    	    						
                    	    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_25); 

                    	    							newLeafNode(otherlv_7, grammarAccess.getECompositeComponentAccess().getProvidesInterfaceToEComponentCrossReference_4_2_1_0());
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop23;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalMyDsl.g:859:3: (otherlv_8= 'usesInterfaceFrom:' ( (otherlv_9= RULE_ID ) ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )* )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==31) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalMyDsl.g:860:4: otherlv_8= 'usesInterfaceFrom:' ( (otherlv_9= RULE_ID ) ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )*
                    {
                    otherlv_8=(Token)match(input,31,FOLLOW_6); 

                    				newLeafNode(otherlv_8, grammarAccess.getECompositeComponentAccess().getUsesInterfaceFromKeyword_5_0());
                    			
                    // InternalMyDsl.g:864:4: ( (otherlv_9= RULE_ID ) )
                    // InternalMyDsl.g:865:5: (otherlv_9= RULE_ID )
                    {
                    // InternalMyDsl.g:865:5: (otherlv_9= RULE_ID )
                    // InternalMyDsl.g:866:6: otherlv_9= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getECompositeComponentRule());
                    						}
                    					
                    otherlv_9=(Token)match(input,RULE_ID,FOLLOW_26); 

                    						newLeafNode(otherlv_9, grammarAccess.getECompositeComponentAccess().getUsesInterfaceFromEComponentCrossReference_5_1_0());
                    					

                    }


                    }

                    // InternalMyDsl.g:877:4: (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )*
                    loop25:
                    do {
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( (LA25_0==14) ) {
                            alt25=1;
                        }


                        switch (alt25) {
                    	case 1 :
                    	    // InternalMyDsl.g:878:5: otherlv_10= ',' ( (otherlv_11= RULE_ID ) )
                    	    {
                    	    otherlv_10=(Token)match(input,14,FOLLOW_6); 

                    	    					newLeafNode(otherlv_10, grammarAccess.getECompositeComponentAccess().getCommaKeyword_5_2_0());
                    	    				
                    	    // InternalMyDsl.g:882:5: ( (otherlv_11= RULE_ID ) )
                    	    // InternalMyDsl.g:883:6: (otherlv_11= RULE_ID )
                    	    {
                    	    // InternalMyDsl.g:883:6: (otherlv_11= RULE_ID )
                    	    // InternalMyDsl.g:884:7: otherlv_11= RULE_ID
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getECompositeComponentRule());
                    	    							}
                    	    						
                    	    otherlv_11=(Token)match(input,RULE_ID,FOLLOW_26); 

                    	    							newLeafNode(otherlv_11, grammarAccess.getECompositeComponentAccess().getUsesInterfaceFromEComponentCrossReference_5_2_1_0());
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop25;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalMyDsl.g:897:3: (otherlv_12= 'providesDirectly:' ( (otherlv_13= RULE_ID ) ) (otherlv_14= ',' ( (otherlv_15= RULE_ID ) ) )* )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==32) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalMyDsl.g:898:4: otherlv_12= 'providesDirectly:' ( (otherlv_13= RULE_ID ) ) (otherlv_14= ',' ( (otherlv_15= RULE_ID ) ) )*
                    {
                    otherlv_12=(Token)match(input,32,FOLLOW_6); 

                    				newLeafNode(otherlv_12, grammarAccess.getECompositeComponentAccess().getProvidesDirectlyKeyword_6_0());
                    			
                    // InternalMyDsl.g:902:4: ( (otherlv_13= RULE_ID ) )
                    // InternalMyDsl.g:903:5: (otherlv_13= RULE_ID )
                    {
                    // InternalMyDsl.g:903:5: (otherlv_13= RULE_ID )
                    // InternalMyDsl.g:904:6: otherlv_13= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getECompositeComponentRule());
                    						}
                    					
                    otherlv_13=(Token)match(input,RULE_ID,FOLLOW_27); 

                    						newLeafNode(otherlv_13, grammarAccess.getECompositeComponentAccess().getProvidesDirectlyEServiceCrossReference_6_1_0());
                    					

                    }


                    }

                    // InternalMyDsl.g:915:4: (otherlv_14= ',' ( (otherlv_15= RULE_ID ) ) )*
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( (LA27_0==14) ) {
                            alt27=1;
                        }


                        switch (alt27) {
                    	case 1 :
                    	    // InternalMyDsl.g:916:5: otherlv_14= ',' ( (otherlv_15= RULE_ID ) )
                    	    {
                    	    otherlv_14=(Token)match(input,14,FOLLOW_6); 

                    	    					newLeafNode(otherlv_14, grammarAccess.getECompositeComponentAccess().getCommaKeyword_6_2_0());
                    	    				
                    	    // InternalMyDsl.g:920:5: ( (otherlv_15= RULE_ID ) )
                    	    // InternalMyDsl.g:921:6: (otherlv_15= RULE_ID )
                    	    {
                    	    // InternalMyDsl.g:921:6: (otherlv_15= RULE_ID )
                    	    // InternalMyDsl.g:922:7: otherlv_15= RULE_ID
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getECompositeComponentRule());
                    	    							}
                    	    						
                    	    otherlv_15=(Token)match(input,RULE_ID,FOLLOW_27); 

                    	    							newLeafNode(otherlv_15, grammarAccess.getECompositeComponentAccess().getProvidesDirectlyEServiceCrossReference_6_2_1_0());
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop27;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalMyDsl.g:935:3: (otherlv_16= 'provides:' ( (otherlv_17= RULE_ID ) ) (otherlv_18= ',' ( (otherlv_19= RULE_ID ) ) )* )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==13) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalMyDsl.g:936:4: otherlv_16= 'provides:' ( (otherlv_17= RULE_ID ) ) (otherlv_18= ',' ( (otherlv_19= RULE_ID ) ) )*
                    {
                    otherlv_16=(Token)match(input,13,FOLLOW_6); 

                    				newLeafNode(otherlv_16, grammarAccess.getECompositeComponentAccess().getProvidesKeyword_7_0());
                    			
                    // InternalMyDsl.g:940:4: ( (otherlv_17= RULE_ID ) )
                    // InternalMyDsl.g:941:5: (otherlv_17= RULE_ID )
                    {
                    // InternalMyDsl.g:941:5: (otherlv_17= RULE_ID )
                    // InternalMyDsl.g:942:6: otherlv_17= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getECompositeComponentRule());
                    						}
                    					
                    otherlv_17=(Token)match(input,RULE_ID,FOLLOW_28); 

                    						newLeafNode(otherlv_17, grammarAccess.getECompositeComponentAccess().getProvidesEInterfaceCrossReference_7_1_0());
                    					

                    }


                    }

                    // InternalMyDsl.g:953:4: (otherlv_18= ',' ( (otherlv_19= RULE_ID ) ) )*
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( (LA29_0==14) ) {
                            alt29=1;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // InternalMyDsl.g:954:5: otherlv_18= ',' ( (otherlv_19= RULE_ID ) )
                    	    {
                    	    otherlv_18=(Token)match(input,14,FOLLOW_6); 

                    	    					newLeafNode(otherlv_18, grammarAccess.getECompositeComponentAccess().getCommaKeyword_7_2_0());
                    	    				
                    	    // InternalMyDsl.g:958:5: ( (otherlv_19= RULE_ID ) )
                    	    // InternalMyDsl.g:959:6: (otherlv_19= RULE_ID )
                    	    {
                    	    // InternalMyDsl.g:959:6: (otherlv_19= RULE_ID )
                    	    // InternalMyDsl.g:960:7: otherlv_19= RULE_ID
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getECompositeComponentRule());
                    	    							}
                    	    						
                    	    otherlv_19=(Token)match(input,RULE_ID,FOLLOW_28); 

                    	    							newLeafNode(otherlv_19, grammarAccess.getECompositeComponentAccess().getProvidesEInterfaceCrossReference_7_2_1_0());
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop29;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalMyDsl.g:973:3: (otherlv_20= 'requires:' ( (otherlv_21= RULE_ID ) ) (otherlv_22= ',' ( (otherlv_23= RULE_ID ) ) )* )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==15) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalMyDsl.g:974:4: otherlv_20= 'requires:' ( (otherlv_21= RULE_ID ) ) (otherlv_22= ',' ( (otherlv_23= RULE_ID ) ) )*
                    {
                    otherlv_20=(Token)match(input,15,FOLLOW_6); 

                    				newLeafNode(otherlv_20, grammarAccess.getECompositeComponentAccess().getRequiresKeyword_8_0());
                    			
                    // InternalMyDsl.g:978:4: ( (otherlv_21= RULE_ID ) )
                    // InternalMyDsl.g:979:5: (otherlv_21= RULE_ID )
                    {
                    // InternalMyDsl.g:979:5: (otherlv_21= RULE_ID )
                    // InternalMyDsl.g:980:6: otherlv_21= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getECompositeComponentRule());
                    						}
                    					
                    otherlv_21=(Token)match(input,RULE_ID,FOLLOW_29); 

                    						newLeafNode(otherlv_21, grammarAccess.getECompositeComponentAccess().getRequiresEInterfaceCrossReference_8_1_0());
                    					

                    }


                    }

                    // InternalMyDsl.g:991:4: (otherlv_22= ',' ( (otherlv_23= RULE_ID ) ) )*
                    loop31:
                    do {
                        int alt31=2;
                        int LA31_0 = input.LA(1);

                        if ( (LA31_0==14) ) {
                            alt31=1;
                        }


                        switch (alt31) {
                    	case 1 :
                    	    // InternalMyDsl.g:992:5: otherlv_22= ',' ( (otherlv_23= RULE_ID ) )
                    	    {
                    	    otherlv_22=(Token)match(input,14,FOLLOW_6); 

                    	    					newLeafNode(otherlv_22, grammarAccess.getECompositeComponentAccess().getCommaKeyword_8_2_0());
                    	    				
                    	    // InternalMyDsl.g:996:5: ( (otherlv_23= RULE_ID ) )
                    	    // InternalMyDsl.g:997:6: (otherlv_23= RULE_ID )
                    	    {
                    	    // InternalMyDsl.g:997:6: (otherlv_23= RULE_ID )
                    	    // InternalMyDsl.g:998:7: otherlv_23= RULE_ID
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getECompositeComponentRule());
                    	    							}
                    	    						
                    	    otherlv_23=(Token)match(input,RULE_ID,FOLLOW_29); 

                    	    							newLeafNode(otherlv_23, grammarAccess.getECompositeComponentAccess().getRequiresEInterfaceCrossReference_8_2_1_0());
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop31;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalMyDsl.g:1011:3: (otherlv_24= 'encapsulates:' ( (otherlv_25= RULE_ID ) ) (otherlv_26= ',' ( (otherlv_27= RULE_ID ) ) )* )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==16) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalMyDsl.g:1012:4: otherlv_24= 'encapsulates:' ( (otherlv_25= RULE_ID ) ) (otherlv_26= ',' ( (otherlv_27= RULE_ID ) ) )*
                    {
                    otherlv_24=(Token)match(input,16,FOLLOW_6); 

                    				newLeafNode(otherlv_24, grammarAccess.getECompositeComponentAccess().getEncapsulatesKeyword_9_0());
                    			
                    // InternalMyDsl.g:1016:4: ( (otherlv_25= RULE_ID ) )
                    // InternalMyDsl.g:1017:5: (otherlv_25= RULE_ID )
                    {
                    // InternalMyDsl.g:1017:5: (otherlv_25= RULE_ID )
                    // InternalMyDsl.g:1018:6: otherlv_25= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getECompositeComponentRule());
                    						}
                    					
                    otherlv_25=(Token)match(input,RULE_ID,FOLLOW_30); 

                    						newLeafNode(otherlv_25, grammarAccess.getECompositeComponentAccess().getEncapsulatesEAssemblyContextCrossReference_9_1_0());
                    					

                    }


                    }

                    // InternalMyDsl.g:1029:4: (otherlv_26= ',' ( (otherlv_27= RULE_ID ) ) )*
                    loop33:
                    do {
                        int alt33=2;
                        int LA33_0 = input.LA(1);

                        if ( (LA33_0==14) ) {
                            alt33=1;
                        }


                        switch (alt33) {
                    	case 1 :
                    	    // InternalMyDsl.g:1030:5: otherlv_26= ',' ( (otherlv_27= RULE_ID ) )
                    	    {
                    	    otherlv_26=(Token)match(input,14,FOLLOW_6); 

                    	    					newLeafNode(otherlv_26, grammarAccess.getECompositeComponentAccess().getCommaKeyword_9_2_0());
                    	    				
                    	    // InternalMyDsl.g:1034:5: ( (otherlv_27= RULE_ID ) )
                    	    // InternalMyDsl.g:1035:6: (otherlv_27= RULE_ID )
                    	    {
                    	    // InternalMyDsl.g:1035:6: (otherlv_27= RULE_ID )
                    	    // InternalMyDsl.g:1036:7: otherlv_27= RULE_ID
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getECompositeComponentRule());
                    	    							}
                    	    						
                    	    otherlv_27=(Token)match(input,RULE_ID,FOLLOW_30); 

                    	    							newLeafNode(otherlv_27, grammarAccess.getECompositeComponentAccess().getEncapsulatesEAssemblyContextCrossReference_9_2_1_0());
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop33;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalMyDsl.g:1049:3: (otherlv_28= 'behaviourDescription:' ( (lv_behaviourDescription_29_0= ruleEBehaviourDescription ) ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==33) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalMyDsl.g:1050:4: otherlv_28= 'behaviourDescription:' ( (lv_behaviourDescription_29_0= ruleEBehaviourDescription ) )
                    {
                    otherlv_28=(Token)match(input,33,FOLLOW_31); 

                    				newLeafNode(otherlv_28, grammarAccess.getECompositeComponentAccess().getBehaviourDescriptionKeyword_10_0());
                    			
                    // InternalMyDsl.g:1054:4: ( (lv_behaviourDescription_29_0= ruleEBehaviourDescription ) )
                    // InternalMyDsl.g:1055:5: (lv_behaviourDescription_29_0= ruleEBehaviourDescription )
                    {
                    // InternalMyDsl.g:1055:5: (lv_behaviourDescription_29_0= ruleEBehaviourDescription )
                    // InternalMyDsl.g:1056:6: lv_behaviourDescription_29_0= ruleEBehaviourDescription
                    {

                    						newCompositeNode(grammarAccess.getECompositeComponentAccess().getBehaviourDescriptionEBehaviourDescriptionParserRuleCall_10_1_0());
                    					
                    pushFollow(FOLLOW_23);
                    lv_behaviourDescription_29_0=ruleEBehaviourDescription();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getECompositeComponentRule());
                    						}
                    						set(
                    							current,
                    							"behaviourDescription",
                    							lv_behaviourDescription_29_0,
                    							"org.xtext.example.mydsl.MyDsl.EBehaviourDescription");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_30=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_30, grammarAccess.getECompositeComponentAccess().getRightCurlyBracketKeyword_11());
            		

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


    // $ANTLR start "entryRuleEContainer"
    // InternalMyDsl.g:1082:1: entryRuleEContainer returns [EObject current=null] : iv_ruleEContainer= ruleEContainer EOF ;
    public final EObject entryRuleEContainer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEContainer = null;


        try {
            // InternalMyDsl.g:1082:51: (iv_ruleEContainer= ruleEContainer EOF )
            // InternalMyDsl.g:1083:2: iv_ruleEContainer= ruleEContainer EOF
            {
             newCompositeNode(grammarAccess.getEContainerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEContainer=ruleEContainer();

            state._fsp--;

             current =iv_ruleEContainer; 
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
    // $ANTLR end "entryRuleEContainer"


    // $ANTLR start "ruleEContainer"
    // InternalMyDsl.g:1089:1: ruleEContainer returns [EObject current=null] : ( () otherlv_1= 'EContainer' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'connectedTo:' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* )? otherlv_8= '}' ) ;
    public final EObject ruleEContainer() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1095:2: ( ( () otherlv_1= 'EContainer' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'connectedTo:' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* )? otherlv_8= '}' ) )
            // InternalMyDsl.g:1096:2: ( () otherlv_1= 'EContainer' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'connectedTo:' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* )? otherlv_8= '}' )
            {
            // InternalMyDsl.g:1096:2: ( () otherlv_1= 'EContainer' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'connectedTo:' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* )? otherlv_8= '}' )
            // InternalMyDsl.g:1097:3: () otherlv_1= 'EContainer' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'connectedTo:' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* )? otherlv_8= '}'
            {
            // InternalMyDsl.g:1097:3: ()
            // InternalMyDsl.g:1098:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEContainerAccess().getEContainerAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,34,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getEContainerAccess().getEContainerKeyword_1());
            		
            // InternalMyDsl.g:1108:3: ( (lv_name_2_0= ruleEString ) )
            // InternalMyDsl.g:1109:4: (lv_name_2_0= ruleEString )
            {
            // InternalMyDsl.g:1109:4: (lv_name_2_0= ruleEString )
            // InternalMyDsl.g:1110:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getEContainerAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEContainerRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_32); 

            			newLeafNode(otherlv_3, grammarAccess.getEContainerAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalMyDsl.g:1131:3: (otherlv_4= 'connectedTo:' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==35) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalMyDsl.g:1132:4: otherlv_4= 'connectedTo:' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )*
                    {
                    otherlv_4=(Token)match(input,35,FOLLOW_6); 

                    				newLeafNode(otherlv_4, grammarAccess.getEContainerAccess().getConnectedToKeyword_4_0());
                    			
                    // InternalMyDsl.g:1136:4: ( (otherlv_5= RULE_ID ) )
                    // InternalMyDsl.g:1137:5: (otherlv_5= RULE_ID )
                    {
                    // InternalMyDsl.g:1137:5: (otherlv_5= RULE_ID )
                    // InternalMyDsl.g:1138:6: otherlv_5= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEContainerRule());
                    						}
                    					
                    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_13); 

                    						newLeafNode(otherlv_5, grammarAccess.getEContainerAccess().getConnectedToELinkCrossReference_4_1_0());
                    					

                    }


                    }

                    // InternalMyDsl.g:1149:4: (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )*
                    loop36:
                    do {
                        int alt36=2;
                        int LA36_0 = input.LA(1);

                        if ( (LA36_0==14) ) {
                            alt36=1;
                        }


                        switch (alt36) {
                    	case 1 :
                    	    // InternalMyDsl.g:1150:5: otherlv_6= ',' ( (otherlv_7= RULE_ID ) )
                    	    {
                    	    otherlv_6=(Token)match(input,14,FOLLOW_6); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getEContainerAccess().getCommaKeyword_4_2_0());
                    	    				
                    	    // InternalMyDsl.g:1154:5: ( (otherlv_7= RULE_ID ) )
                    	    // InternalMyDsl.g:1155:6: (otherlv_7= RULE_ID )
                    	    {
                    	    // InternalMyDsl.g:1155:6: (otherlv_7= RULE_ID )
                    	    // InternalMyDsl.g:1156:7: otherlv_7= RULE_ID
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getEContainerRule());
                    	    							}
                    	    						
                    	    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_13); 

                    	    							newLeafNode(otherlv_7, grammarAccess.getEContainerAccess().getConnectedToELinkCrossReference_4_2_1_0());
                    	    						

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

            otherlv_8=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getEContainerAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleEContainer"


    // $ANTLR start "entryRuleEAllocationContext"
    // InternalMyDsl.g:1177:1: entryRuleEAllocationContext returns [EObject current=null] : iv_ruleEAllocationContext= ruleEAllocationContext EOF ;
    public final EObject entryRuleEAllocationContext() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEAllocationContext = null;


        try {
            // InternalMyDsl.g:1177:59: (iv_ruleEAllocationContext= ruleEAllocationContext EOF )
            // InternalMyDsl.g:1178:2: iv_ruleEAllocationContext= ruleEAllocationContext EOF
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
    // InternalMyDsl.g:1184:1: ruleEAllocationContext returns [EObject current=null] : ( () otherlv_1= 'EAllocationContext' otherlv_2= '{' (otherlv_3= 'controls:' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* )? (otherlv_7= 'specifiesFor:' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* ) (otherlv_11= 'specifies:' ( (otherlv_12= RULE_ID ) ) ) otherlv_13= '}' ) ;
    public final EObject ruleEAllocationContext() throws RecognitionException {
        EObject current = null;

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


        	enterRule();

        try {
            // InternalMyDsl.g:1190:2: ( ( () otherlv_1= 'EAllocationContext' otherlv_2= '{' (otherlv_3= 'controls:' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* )? (otherlv_7= 'specifiesFor:' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* ) (otherlv_11= 'specifies:' ( (otherlv_12= RULE_ID ) ) ) otherlv_13= '}' ) )
            // InternalMyDsl.g:1191:2: ( () otherlv_1= 'EAllocationContext' otherlv_2= '{' (otherlv_3= 'controls:' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* )? (otherlv_7= 'specifiesFor:' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* ) (otherlv_11= 'specifies:' ( (otherlv_12= RULE_ID ) ) ) otherlv_13= '}' )
            {
            // InternalMyDsl.g:1191:2: ( () otherlv_1= 'EAllocationContext' otherlv_2= '{' (otherlv_3= 'controls:' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* )? (otherlv_7= 'specifiesFor:' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* ) (otherlv_11= 'specifies:' ( (otherlv_12= RULE_ID ) ) ) otherlv_13= '}' )
            // InternalMyDsl.g:1192:3: () otherlv_1= 'EAllocationContext' otherlv_2= '{' (otherlv_3= 'controls:' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* )? (otherlv_7= 'specifiesFor:' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* ) (otherlv_11= 'specifies:' ( (otherlv_12= RULE_ID ) ) ) otherlv_13= '}'
            {
            // InternalMyDsl.g:1192:3: ()
            // InternalMyDsl.g:1193:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEAllocationContextAccess().getEAllocationContextAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,36,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getEAllocationContextAccess().getEAllocationContextKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_33); 

            			newLeafNode(otherlv_2, grammarAccess.getEAllocationContextAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:1207:3: (otherlv_3= 'controls:' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==37) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalMyDsl.g:1208:4: otherlv_3= 'controls:' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )*
                    {
                    otherlv_3=(Token)match(input,37,FOLLOW_6); 

                    				newLeafNode(otherlv_3, grammarAccess.getEAllocationContextAccess().getControlsKeyword_3_0());
                    			
                    // InternalMyDsl.g:1212:4: ( (otherlv_4= RULE_ID ) )
                    // InternalMyDsl.g:1213:5: (otherlv_4= RULE_ID )
                    {
                    // InternalMyDsl.g:1213:5: (otherlv_4= RULE_ID )
                    // InternalMyDsl.g:1214:6: otherlv_4= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEAllocationContextRule());
                    						}
                    					
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_34); 

                    						newLeafNode(otherlv_4, grammarAccess.getEAllocationContextAccess().getControlsEContainerCrossReference_3_1_0());
                    					

                    }


                    }

                    // InternalMyDsl.g:1225:4: (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )*
                    loop38:
                    do {
                        int alt38=2;
                        int LA38_0 = input.LA(1);

                        if ( (LA38_0==14) ) {
                            alt38=1;
                        }


                        switch (alt38) {
                    	case 1 :
                    	    // InternalMyDsl.g:1226:5: otherlv_5= ',' ( (otherlv_6= RULE_ID ) )
                    	    {
                    	    otherlv_5=(Token)match(input,14,FOLLOW_6); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getEAllocationContextAccess().getCommaKeyword_3_2_0());
                    	    				
                    	    // InternalMyDsl.g:1230:5: ( (otherlv_6= RULE_ID ) )
                    	    // InternalMyDsl.g:1231:6: (otherlv_6= RULE_ID )
                    	    {
                    	    // InternalMyDsl.g:1231:6: (otherlv_6= RULE_ID )
                    	    // InternalMyDsl.g:1232:7: otherlv_6= RULE_ID
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getEAllocationContextRule());
                    	    							}
                    	    						
                    	    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_34); 

                    	    							newLeafNode(otherlv_6, grammarAccess.getEAllocationContextAccess().getControlsEContainerCrossReference_3_2_1_0());
                    	    						

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

            // InternalMyDsl.g:1245:3: (otherlv_7= 'specifiesFor:' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* )
            // InternalMyDsl.g:1246:4: otherlv_7= 'specifiesFor:' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )*
            {
            otherlv_7=(Token)match(input,38,FOLLOW_6); 

            				newLeafNode(otherlv_7, grammarAccess.getEAllocationContextAccess().getSpecifiesForKeyword_4_0());
            			
            // InternalMyDsl.g:1250:4: ( (otherlv_8= RULE_ID ) )
            // InternalMyDsl.g:1251:5: (otherlv_8= RULE_ID )
            {
            // InternalMyDsl.g:1251:5: (otherlv_8= RULE_ID )
            // InternalMyDsl.g:1252:6: otherlv_8= RULE_ID
            {

            						if (current==null) {
            							current = createModelElement(grammarAccess.getEAllocationContextRule());
            						}
            					
            otherlv_8=(Token)match(input,RULE_ID,FOLLOW_35); 

            						newLeafNode(otherlv_8, grammarAccess.getEAllocationContextAccess().getSpecifiesForESystemCrossReference_4_1_0());
            					

            }


            }

            // InternalMyDsl.g:1263:4: (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==14) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalMyDsl.g:1264:5: otherlv_9= ',' ( (otherlv_10= RULE_ID ) )
            	    {
            	    otherlv_9=(Token)match(input,14,FOLLOW_6); 

            	    					newLeafNode(otherlv_9, grammarAccess.getEAllocationContextAccess().getCommaKeyword_4_2_0());
            	    				
            	    // InternalMyDsl.g:1268:5: ( (otherlv_10= RULE_ID ) )
            	    // InternalMyDsl.g:1269:6: (otherlv_10= RULE_ID )
            	    {
            	    // InternalMyDsl.g:1269:6: (otherlv_10= RULE_ID )
            	    // InternalMyDsl.g:1270:7: otherlv_10= RULE_ID
            	    {

            	    							if (current==null) {
            	    								current = createModelElement(grammarAccess.getEAllocationContextRule());
            	    							}
            	    						
            	    otherlv_10=(Token)match(input,RULE_ID,FOLLOW_35); 

            	    							newLeafNode(otherlv_10, grammarAccess.getEAllocationContextAccess().getSpecifiesForESystemCrossReference_4_2_1_0());
            	    						

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);


            }

            // InternalMyDsl.g:1283:3: (otherlv_11= 'specifies:' ( (otherlv_12= RULE_ID ) ) )
            // InternalMyDsl.g:1284:4: otherlv_11= 'specifies:' ( (otherlv_12= RULE_ID ) )
            {
            otherlv_11=(Token)match(input,39,FOLLOW_6); 

            				newLeafNode(otherlv_11, grammarAccess.getEAllocationContextAccess().getSpecifiesKeyword_5_0());
            			
            // InternalMyDsl.g:1288:4: ( (otherlv_12= RULE_ID ) )
            // InternalMyDsl.g:1289:5: (otherlv_12= RULE_ID )
            {
            // InternalMyDsl.g:1289:5: (otherlv_12= RULE_ID )
            // InternalMyDsl.g:1290:6: otherlv_12= RULE_ID
            {

            						if (current==null) {
            							current = createModelElement(grammarAccess.getEAllocationContextRule());
            						}
            					
            otherlv_12=(Token)match(input,RULE_ID,FOLLOW_23); 

            						newLeafNode(otherlv_12, grammarAccess.getEAllocationContextAccess().getSpecifiesEAssemblyContextCrossReference_5_1_0());
            					

            }


            }


            }

            otherlv_13=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_13, grammarAccess.getEAllocationContextAccess().getRightCurlyBracketKeyword_6());
            		

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
    // InternalMyDsl.g:1310:1: entryRuleERole returns [EObject current=null] : iv_ruleERole= ruleERole EOF ;
    public final EObject entryRuleERole() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleERole = null;


        try {
            // InternalMyDsl.g:1310:46: (iv_ruleERole= ruleERole EOF )
            // InternalMyDsl.g:1311:2: iv_ruleERole= ruleERole EOF
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
    // InternalMyDsl.g:1317:1: ruleERole returns [EObject current=null] : (this_ERequiredRole_0= ruleERequiredRole | this_EProvidedRole_1= ruleEProvidedRole ) ;
    public final EObject ruleERole() throws RecognitionException {
        EObject current = null;

        EObject this_ERequiredRole_0 = null;

        EObject this_EProvidedRole_1 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1323:2: ( (this_ERequiredRole_0= ruleERequiredRole | this_EProvidedRole_1= ruleEProvidedRole ) )
            // InternalMyDsl.g:1324:2: (this_ERequiredRole_0= ruleERequiredRole | this_EProvidedRole_1= ruleEProvidedRole )
            {
            // InternalMyDsl.g:1324:2: (this_ERequiredRole_0= ruleERequiredRole | this_EProvidedRole_1= ruleEProvidedRole )
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==40) ) {
                alt41=1;
            }
            else if ( (LA41_0==43) ) {
                alt41=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }
            switch (alt41) {
                case 1 :
                    // InternalMyDsl.g:1325:3: this_ERequiredRole_0= ruleERequiredRole
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
                    // InternalMyDsl.g:1334:3: this_EProvidedRole_1= ruleEProvidedRole
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
    // InternalMyDsl.g:1346:1: entryRuleERequiredRole returns [EObject current=null] : iv_ruleERequiredRole= ruleERequiredRole EOF ;
    public final EObject entryRuleERequiredRole() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleERequiredRole = null;


        try {
            // InternalMyDsl.g:1346:54: (iv_ruleERequiredRole= ruleERequiredRole EOF )
            // InternalMyDsl.g:1347:2: iv_ruleERequiredRole= ruleERequiredRole EOF
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
    // InternalMyDsl.g:1353:1: ruleERequiredRole returns [EObject current=null] : ( () otherlv_1= 'ERequiredRole' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'roleOf:' ( (otherlv_5= RULE_ID ) ) )? (otherlv_6= 'linkedTo:' ( (otherlv_7= RULE_ID ) ) )? otherlv_8= '}' ) ;
    public final EObject ruleERequiredRole() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1359:2: ( ( () otherlv_1= 'ERequiredRole' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'roleOf:' ( (otherlv_5= RULE_ID ) ) )? (otherlv_6= 'linkedTo:' ( (otherlv_7= RULE_ID ) ) )? otherlv_8= '}' ) )
            // InternalMyDsl.g:1360:2: ( () otherlv_1= 'ERequiredRole' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'roleOf:' ( (otherlv_5= RULE_ID ) ) )? (otherlv_6= 'linkedTo:' ( (otherlv_7= RULE_ID ) ) )? otherlv_8= '}' )
            {
            // InternalMyDsl.g:1360:2: ( () otherlv_1= 'ERequiredRole' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'roleOf:' ( (otherlv_5= RULE_ID ) ) )? (otherlv_6= 'linkedTo:' ( (otherlv_7= RULE_ID ) ) )? otherlv_8= '}' )
            // InternalMyDsl.g:1361:3: () otherlv_1= 'ERequiredRole' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'roleOf:' ( (otherlv_5= RULE_ID ) ) )? (otherlv_6= 'linkedTo:' ( (otherlv_7= RULE_ID ) ) )? otherlv_8= '}'
            {
            // InternalMyDsl.g:1361:3: ()
            // InternalMyDsl.g:1362:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getERequiredRoleAccess().getERequiredRoleAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,40,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getERequiredRoleAccess().getERequiredRoleKeyword_1());
            		
            // InternalMyDsl.g:1372:3: ( (lv_name_2_0= ruleEString ) )
            // InternalMyDsl.g:1373:4: (lv_name_2_0= ruleEString )
            {
            // InternalMyDsl.g:1373:4: (lv_name_2_0= ruleEString )
            // InternalMyDsl.g:1374:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getERequiredRoleAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getERequiredRoleRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_36); 

            			newLeafNode(otherlv_3, grammarAccess.getERequiredRoleAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalMyDsl.g:1395:3: (otherlv_4= 'roleOf:' ( (otherlv_5= RULE_ID ) ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==41) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalMyDsl.g:1396:4: otherlv_4= 'roleOf:' ( (otherlv_5= RULE_ID ) )
                    {
                    otherlv_4=(Token)match(input,41,FOLLOW_6); 

                    				newLeafNode(otherlv_4, grammarAccess.getERequiredRoleAccess().getRoleOfKeyword_4_0());
                    			
                    // InternalMyDsl.g:1400:4: ( (otherlv_5= RULE_ID ) )
                    // InternalMyDsl.g:1401:5: (otherlv_5= RULE_ID )
                    {
                    // InternalMyDsl.g:1401:5: (otherlv_5= RULE_ID )
                    // InternalMyDsl.g:1402:6: otherlv_5= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getERequiredRoleRule());
                    						}
                    					
                    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_37); 

                    						newLeafNode(otherlv_5, grammarAccess.getERequiredRoleAccess().getRoleOfEAssemblyContextCrossReference_4_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:1414:3: (otherlv_6= 'linkedTo:' ( (otherlv_7= RULE_ID ) ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==42) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalMyDsl.g:1415:4: otherlv_6= 'linkedTo:' ( (otherlv_7= RULE_ID ) )
                    {
                    otherlv_6=(Token)match(input,42,FOLLOW_6); 

                    				newLeafNode(otherlv_6, grammarAccess.getERequiredRoleAccess().getLinkedToKeyword_5_0());
                    			
                    // InternalMyDsl.g:1419:4: ( (otherlv_7= RULE_ID ) )
                    // InternalMyDsl.g:1420:5: (otherlv_7= RULE_ID )
                    {
                    // InternalMyDsl.g:1420:5: (otherlv_7= RULE_ID )
                    // InternalMyDsl.g:1421:6: otherlv_7= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getERequiredRoleRule());
                    						}
                    					
                    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_23); 

                    						newLeafNode(otherlv_7, grammarAccess.getERequiredRoleAccess().getLinkedToEAssemblyConnectorCrossReference_5_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getERequiredRoleAccess().getRightCurlyBracketKeyword_6());
            		

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
    // InternalMyDsl.g:1441:1: entryRuleEProvidedRole returns [EObject current=null] : iv_ruleEProvidedRole= ruleEProvidedRole EOF ;
    public final EObject entryRuleEProvidedRole() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEProvidedRole = null;


        try {
            // InternalMyDsl.g:1441:54: (iv_ruleEProvidedRole= ruleEProvidedRole EOF )
            // InternalMyDsl.g:1442:2: iv_ruleEProvidedRole= ruleEProvidedRole EOF
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
    // InternalMyDsl.g:1448:1: ruleEProvidedRole returns [EObject current=null] : ( () otherlv_1= 'EProvidedRole' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'roleOf:' ( (otherlv_5= RULE_ID ) ) )? (otherlv_6= 'linkedFrom:' ( (otherlv_7= RULE_ID ) ) )? otherlv_8= '}' ) ;
    public final EObject ruleEProvidedRole() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1454:2: ( ( () otherlv_1= 'EProvidedRole' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'roleOf:' ( (otherlv_5= RULE_ID ) ) )? (otherlv_6= 'linkedFrom:' ( (otherlv_7= RULE_ID ) ) )? otherlv_8= '}' ) )
            // InternalMyDsl.g:1455:2: ( () otherlv_1= 'EProvidedRole' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'roleOf:' ( (otherlv_5= RULE_ID ) ) )? (otherlv_6= 'linkedFrom:' ( (otherlv_7= RULE_ID ) ) )? otherlv_8= '}' )
            {
            // InternalMyDsl.g:1455:2: ( () otherlv_1= 'EProvidedRole' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'roleOf:' ( (otherlv_5= RULE_ID ) ) )? (otherlv_6= 'linkedFrom:' ( (otherlv_7= RULE_ID ) ) )? otherlv_8= '}' )
            // InternalMyDsl.g:1456:3: () otherlv_1= 'EProvidedRole' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'roleOf:' ( (otherlv_5= RULE_ID ) ) )? (otherlv_6= 'linkedFrom:' ( (otherlv_7= RULE_ID ) ) )? otherlv_8= '}'
            {
            // InternalMyDsl.g:1456:3: ()
            // InternalMyDsl.g:1457:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEProvidedRoleAccess().getEProvidedRoleAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,43,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getEProvidedRoleAccess().getEProvidedRoleKeyword_1());
            		
            // InternalMyDsl.g:1467:3: ( (lv_name_2_0= ruleEString ) )
            // InternalMyDsl.g:1468:4: (lv_name_2_0= ruleEString )
            {
            // InternalMyDsl.g:1468:4: (lv_name_2_0= ruleEString )
            // InternalMyDsl.g:1469:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getEProvidedRoleAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEProvidedRoleRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_38); 

            			newLeafNode(otherlv_3, grammarAccess.getEProvidedRoleAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalMyDsl.g:1490:3: (otherlv_4= 'roleOf:' ( (otherlv_5= RULE_ID ) ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==41) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalMyDsl.g:1491:4: otherlv_4= 'roleOf:' ( (otherlv_5= RULE_ID ) )
                    {
                    otherlv_4=(Token)match(input,41,FOLLOW_6); 

                    				newLeafNode(otherlv_4, grammarAccess.getEProvidedRoleAccess().getRoleOfKeyword_4_0());
                    			
                    // InternalMyDsl.g:1495:4: ( (otherlv_5= RULE_ID ) )
                    // InternalMyDsl.g:1496:5: (otherlv_5= RULE_ID )
                    {
                    // InternalMyDsl.g:1496:5: (otherlv_5= RULE_ID )
                    // InternalMyDsl.g:1497:6: otherlv_5= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEProvidedRoleRule());
                    						}
                    					
                    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_39); 

                    						newLeafNode(otherlv_5, grammarAccess.getEProvidedRoleAccess().getRoleOfEAssemblyContextCrossReference_4_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:1509:3: (otherlv_6= 'linkedFrom:' ( (otherlv_7= RULE_ID ) ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==44) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalMyDsl.g:1510:4: otherlv_6= 'linkedFrom:' ( (otherlv_7= RULE_ID ) )
                    {
                    otherlv_6=(Token)match(input,44,FOLLOW_6); 

                    				newLeafNode(otherlv_6, grammarAccess.getEProvidedRoleAccess().getLinkedFromKeyword_5_0());
                    			
                    // InternalMyDsl.g:1514:4: ( (otherlv_7= RULE_ID ) )
                    // InternalMyDsl.g:1515:5: (otherlv_7= RULE_ID )
                    {
                    // InternalMyDsl.g:1515:5: (otherlv_7= RULE_ID )
                    // InternalMyDsl.g:1516:6: otherlv_7= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEProvidedRoleRule());
                    						}
                    					
                    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_23); 

                    						newLeafNode(otherlv_7, grammarAccess.getEProvidedRoleAccess().getLinkedFromEAssemblyConnectorCrossReference_5_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getEProvidedRoleAccess().getRightCurlyBracketKeyword_6());
            		

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
    // InternalMyDsl.g:1536:1: entryRuleEAssemblyContext returns [EObject current=null] : iv_ruleEAssemblyContext= ruleEAssemblyContext EOF ;
    public final EObject entryRuleEAssemblyContext() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEAssemblyContext = null;


        try {
            // InternalMyDsl.g:1536:57: (iv_ruleEAssemblyContext= ruleEAssemblyContext EOF )
            // InternalMyDsl.g:1537:2: iv_ruleEAssemblyContext= ruleEAssemblyContext EOF
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
    // InternalMyDsl.g:1543:1: ruleEAssemblyContext returns [EObject current=null] : ( () otherlv_1= 'EAssemblyContext' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'allocated:' ( (otherlv_5= RULE_ID ) ) )? (otherlv_6= 'encapsulatedByComponent:' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* )? (otherlv_10= 'encapsulatedBySystem:' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' ( (otherlv_13= RULE_ID ) ) )* )? (otherlv_14= 'instantiates:' ( (otherlv_15= RULE_ID ) ) (otherlv_16= ',' ( (otherlv_17= RULE_ID ) ) )* )? (otherlv_18= 'roles:' ( (lv_roles_19_0= ruleERole ) ) (otherlv_20= ',' ( (lv_roles_21_0= ruleERole ) ) )* )? otherlv_22= '}' ) ;
    public final EObject ruleEAssemblyContext() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
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
        Token otherlv_20=null;
        Token otherlv_22=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_roles_19_0 = null;

        EObject lv_roles_21_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1549:2: ( ( () otherlv_1= 'EAssemblyContext' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'allocated:' ( (otherlv_5= RULE_ID ) ) )? (otherlv_6= 'encapsulatedByComponent:' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* )? (otherlv_10= 'encapsulatedBySystem:' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' ( (otherlv_13= RULE_ID ) ) )* )? (otherlv_14= 'instantiates:' ( (otherlv_15= RULE_ID ) ) (otherlv_16= ',' ( (otherlv_17= RULE_ID ) ) )* )? (otherlv_18= 'roles:' ( (lv_roles_19_0= ruleERole ) ) (otherlv_20= ',' ( (lv_roles_21_0= ruleERole ) ) )* )? otherlv_22= '}' ) )
            // InternalMyDsl.g:1550:2: ( () otherlv_1= 'EAssemblyContext' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'allocated:' ( (otherlv_5= RULE_ID ) ) )? (otherlv_6= 'encapsulatedByComponent:' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* )? (otherlv_10= 'encapsulatedBySystem:' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' ( (otherlv_13= RULE_ID ) ) )* )? (otherlv_14= 'instantiates:' ( (otherlv_15= RULE_ID ) ) (otherlv_16= ',' ( (otherlv_17= RULE_ID ) ) )* )? (otherlv_18= 'roles:' ( (lv_roles_19_0= ruleERole ) ) (otherlv_20= ',' ( (lv_roles_21_0= ruleERole ) ) )* )? otherlv_22= '}' )
            {
            // InternalMyDsl.g:1550:2: ( () otherlv_1= 'EAssemblyContext' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'allocated:' ( (otherlv_5= RULE_ID ) ) )? (otherlv_6= 'encapsulatedByComponent:' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* )? (otherlv_10= 'encapsulatedBySystem:' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' ( (otherlv_13= RULE_ID ) ) )* )? (otherlv_14= 'instantiates:' ( (otherlv_15= RULE_ID ) ) (otherlv_16= ',' ( (otherlv_17= RULE_ID ) ) )* )? (otherlv_18= 'roles:' ( (lv_roles_19_0= ruleERole ) ) (otherlv_20= ',' ( (lv_roles_21_0= ruleERole ) ) )* )? otherlv_22= '}' )
            // InternalMyDsl.g:1551:3: () otherlv_1= 'EAssemblyContext' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'allocated:' ( (otherlv_5= RULE_ID ) ) )? (otherlv_6= 'encapsulatedByComponent:' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* )? (otherlv_10= 'encapsulatedBySystem:' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' ( (otherlv_13= RULE_ID ) ) )* )? (otherlv_14= 'instantiates:' ( (otherlv_15= RULE_ID ) ) (otherlv_16= ',' ( (otherlv_17= RULE_ID ) ) )* )? (otherlv_18= 'roles:' ( (lv_roles_19_0= ruleERole ) ) (otherlv_20= ',' ( (lv_roles_21_0= ruleERole ) ) )* )? otherlv_22= '}'
            {
            // InternalMyDsl.g:1551:3: ()
            // InternalMyDsl.g:1552:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEAssemblyContextAccess().getEAssemblyContextAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,45,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getEAssemblyContextAccess().getEAssemblyContextKeyword_1());
            		
            // InternalMyDsl.g:1562:3: ( (lv_name_2_0= ruleEString ) )
            // InternalMyDsl.g:1563:4: (lv_name_2_0= ruleEString )
            {
            // InternalMyDsl.g:1563:4: (lv_name_2_0= ruleEString )
            // InternalMyDsl.g:1564:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getEAssemblyContextAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEAssemblyContextRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_40); 

            			newLeafNode(otherlv_3, grammarAccess.getEAssemblyContextAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalMyDsl.g:1585:3: (otherlv_4= 'allocated:' ( (otherlv_5= RULE_ID ) ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==46) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalMyDsl.g:1586:4: otherlv_4= 'allocated:' ( (otherlv_5= RULE_ID ) )
                    {
                    otherlv_4=(Token)match(input,46,FOLLOW_6); 

                    				newLeafNode(otherlv_4, grammarAccess.getEAssemblyContextAccess().getAllocatedKeyword_4_0());
                    			
                    // InternalMyDsl.g:1590:4: ( (otherlv_5= RULE_ID ) )
                    // InternalMyDsl.g:1591:5: (otherlv_5= RULE_ID )
                    {
                    // InternalMyDsl.g:1591:5: (otherlv_5= RULE_ID )
                    // InternalMyDsl.g:1592:6: otherlv_5= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEAssemblyContextRule());
                    						}
                    					
                    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_41); 

                    						newLeafNode(otherlv_5, grammarAccess.getEAssemblyContextAccess().getAllocatedEContainerCrossReference_4_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:1604:3: (otherlv_6= 'encapsulatedByComponent:' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==47) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalMyDsl.g:1605:4: otherlv_6= 'encapsulatedByComponent:' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )*
                    {
                    otherlv_6=(Token)match(input,47,FOLLOW_6); 

                    				newLeafNode(otherlv_6, grammarAccess.getEAssemblyContextAccess().getEncapsulatedByComponentKeyword_5_0());
                    			
                    // InternalMyDsl.g:1609:4: ( (otherlv_7= RULE_ID ) )
                    // InternalMyDsl.g:1610:5: (otherlv_7= RULE_ID )
                    {
                    // InternalMyDsl.g:1610:5: (otherlv_7= RULE_ID )
                    // InternalMyDsl.g:1611:6: otherlv_7= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEAssemblyContextRule());
                    						}
                    					
                    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_42); 

                    						newLeafNode(otherlv_7, grammarAccess.getEAssemblyContextAccess().getEncapsulatedByComponentECompositeComponentCrossReference_5_1_0());
                    					

                    }


                    }

                    // InternalMyDsl.g:1622:4: (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )*
                    loop47:
                    do {
                        int alt47=2;
                        int LA47_0 = input.LA(1);

                        if ( (LA47_0==14) ) {
                            alt47=1;
                        }


                        switch (alt47) {
                    	case 1 :
                    	    // InternalMyDsl.g:1623:5: otherlv_8= ',' ( (otherlv_9= RULE_ID ) )
                    	    {
                    	    otherlv_8=(Token)match(input,14,FOLLOW_6); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getEAssemblyContextAccess().getCommaKeyword_5_2_0());
                    	    				
                    	    // InternalMyDsl.g:1627:5: ( (otherlv_9= RULE_ID ) )
                    	    // InternalMyDsl.g:1628:6: (otherlv_9= RULE_ID )
                    	    {
                    	    // InternalMyDsl.g:1628:6: (otherlv_9= RULE_ID )
                    	    // InternalMyDsl.g:1629:7: otherlv_9= RULE_ID
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getEAssemblyContextRule());
                    	    							}
                    	    						
                    	    otherlv_9=(Token)match(input,RULE_ID,FOLLOW_42); 

                    	    							newLeafNode(otherlv_9, grammarAccess.getEAssemblyContextAccess().getEncapsulatedByComponentECompositeComponentCrossReference_5_2_1_0());
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop47;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalMyDsl.g:1642:3: (otherlv_10= 'encapsulatedBySystem:' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' ( (otherlv_13= RULE_ID ) ) )* )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==48) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalMyDsl.g:1643:4: otherlv_10= 'encapsulatedBySystem:' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' ( (otherlv_13= RULE_ID ) ) )*
                    {
                    otherlv_10=(Token)match(input,48,FOLLOW_6); 

                    				newLeafNode(otherlv_10, grammarAccess.getEAssemblyContextAccess().getEncapsulatedBySystemKeyword_6_0());
                    			
                    // InternalMyDsl.g:1647:4: ( (otherlv_11= RULE_ID ) )
                    // InternalMyDsl.g:1648:5: (otherlv_11= RULE_ID )
                    {
                    // InternalMyDsl.g:1648:5: (otherlv_11= RULE_ID )
                    // InternalMyDsl.g:1649:6: otherlv_11= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEAssemblyContextRule());
                    						}
                    					
                    otherlv_11=(Token)match(input,RULE_ID,FOLLOW_43); 

                    						newLeafNode(otherlv_11, grammarAccess.getEAssemblyContextAccess().getEncapsulatedBySystemESystemCrossReference_6_1_0());
                    					

                    }


                    }

                    // InternalMyDsl.g:1660:4: (otherlv_12= ',' ( (otherlv_13= RULE_ID ) ) )*
                    loop49:
                    do {
                        int alt49=2;
                        int LA49_0 = input.LA(1);

                        if ( (LA49_0==14) ) {
                            alt49=1;
                        }


                        switch (alt49) {
                    	case 1 :
                    	    // InternalMyDsl.g:1661:5: otherlv_12= ',' ( (otherlv_13= RULE_ID ) )
                    	    {
                    	    otherlv_12=(Token)match(input,14,FOLLOW_6); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getEAssemblyContextAccess().getCommaKeyword_6_2_0());
                    	    				
                    	    // InternalMyDsl.g:1665:5: ( (otherlv_13= RULE_ID ) )
                    	    // InternalMyDsl.g:1666:6: (otherlv_13= RULE_ID )
                    	    {
                    	    // InternalMyDsl.g:1666:6: (otherlv_13= RULE_ID )
                    	    // InternalMyDsl.g:1667:7: otherlv_13= RULE_ID
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getEAssemblyContextRule());
                    	    							}
                    	    						
                    	    otherlv_13=(Token)match(input,RULE_ID,FOLLOW_43); 

                    	    							newLeafNode(otherlv_13, grammarAccess.getEAssemblyContextAccess().getEncapsulatedBySystemESystemCrossReference_6_2_1_0());
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop49;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalMyDsl.g:1680:3: (otherlv_14= 'instantiates:' ( (otherlv_15= RULE_ID ) ) (otherlv_16= ',' ( (otherlv_17= RULE_ID ) ) )* )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==49) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalMyDsl.g:1681:4: otherlv_14= 'instantiates:' ( (otherlv_15= RULE_ID ) ) (otherlv_16= ',' ( (otherlv_17= RULE_ID ) ) )*
                    {
                    otherlv_14=(Token)match(input,49,FOLLOW_6); 

                    				newLeafNode(otherlv_14, grammarAccess.getEAssemblyContextAccess().getInstantiatesKeyword_7_0());
                    			
                    // InternalMyDsl.g:1685:4: ( (otherlv_15= RULE_ID ) )
                    // InternalMyDsl.g:1686:5: (otherlv_15= RULE_ID )
                    {
                    // InternalMyDsl.g:1686:5: (otherlv_15= RULE_ID )
                    // InternalMyDsl.g:1687:6: otherlv_15= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEAssemblyContextRule());
                    						}
                    					
                    otherlv_15=(Token)match(input,RULE_ID,FOLLOW_44); 

                    						newLeafNode(otherlv_15, grammarAccess.getEAssemblyContextAccess().getInstantiatesEComponentCrossReference_7_1_0());
                    					

                    }


                    }

                    // InternalMyDsl.g:1698:4: (otherlv_16= ',' ( (otherlv_17= RULE_ID ) ) )*
                    loop51:
                    do {
                        int alt51=2;
                        int LA51_0 = input.LA(1);

                        if ( (LA51_0==14) ) {
                            alt51=1;
                        }


                        switch (alt51) {
                    	case 1 :
                    	    // InternalMyDsl.g:1699:5: otherlv_16= ',' ( (otherlv_17= RULE_ID ) )
                    	    {
                    	    otherlv_16=(Token)match(input,14,FOLLOW_6); 

                    	    					newLeafNode(otherlv_16, grammarAccess.getEAssemblyContextAccess().getCommaKeyword_7_2_0());
                    	    				
                    	    // InternalMyDsl.g:1703:5: ( (otherlv_17= RULE_ID ) )
                    	    // InternalMyDsl.g:1704:6: (otherlv_17= RULE_ID )
                    	    {
                    	    // InternalMyDsl.g:1704:6: (otherlv_17= RULE_ID )
                    	    // InternalMyDsl.g:1705:7: otherlv_17= RULE_ID
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getEAssemblyContextRule());
                    	    							}
                    	    						
                    	    otherlv_17=(Token)match(input,RULE_ID,FOLLOW_44); 

                    	    							newLeafNode(otherlv_17, grammarAccess.getEAssemblyContextAccess().getInstantiatesEComponentCrossReference_7_2_1_0());
                    	    						

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

            // InternalMyDsl.g:1718:3: (otherlv_18= 'roles:' ( (lv_roles_19_0= ruleERole ) ) (otherlv_20= ',' ( (lv_roles_21_0= ruleERole ) ) )* )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==50) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalMyDsl.g:1719:4: otherlv_18= 'roles:' ( (lv_roles_19_0= ruleERole ) ) (otherlv_20= ',' ( (lv_roles_21_0= ruleERole ) ) )*
                    {
                    otherlv_18=(Token)match(input,50,FOLLOW_45); 

                    				newLeafNode(otherlv_18, grammarAccess.getEAssemblyContextAccess().getRolesKeyword_8_0());
                    			
                    // InternalMyDsl.g:1723:4: ( (lv_roles_19_0= ruleERole ) )
                    // InternalMyDsl.g:1724:5: (lv_roles_19_0= ruleERole )
                    {
                    // InternalMyDsl.g:1724:5: (lv_roles_19_0= ruleERole )
                    // InternalMyDsl.g:1725:6: lv_roles_19_0= ruleERole
                    {

                    						newCompositeNode(grammarAccess.getEAssemblyContextAccess().getRolesERoleParserRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_roles_19_0=ruleERole();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEAssemblyContextRule());
                    						}
                    						add(
                    							current,
                    							"roles",
                    							lv_roles_19_0,
                    							"org.xtext.example.mydsl.MyDsl.ERole");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:1742:4: (otherlv_20= ',' ( (lv_roles_21_0= ruleERole ) ) )*
                    loop53:
                    do {
                        int alt53=2;
                        int LA53_0 = input.LA(1);

                        if ( (LA53_0==14) ) {
                            alt53=1;
                        }


                        switch (alt53) {
                    	case 1 :
                    	    // InternalMyDsl.g:1743:5: otherlv_20= ',' ( (lv_roles_21_0= ruleERole ) )
                    	    {
                    	    otherlv_20=(Token)match(input,14,FOLLOW_45); 

                    	    					newLeafNode(otherlv_20, grammarAccess.getEAssemblyContextAccess().getCommaKeyword_8_2_0());
                    	    				
                    	    // InternalMyDsl.g:1747:5: ( (lv_roles_21_0= ruleERole ) )
                    	    // InternalMyDsl.g:1748:6: (lv_roles_21_0= ruleERole )
                    	    {
                    	    // InternalMyDsl.g:1748:6: (lv_roles_21_0= ruleERole )
                    	    // InternalMyDsl.g:1749:7: lv_roles_21_0= ruleERole
                    	    {

                    	    							newCompositeNode(grammarAccess.getEAssemblyContextAccess().getRolesERoleParserRuleCall_8_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_13);
                    	    lv_roles_21_0=ruleERole();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getEAssemblyContextRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"roles",
                    	    								lv_roles_21_0,
                    	    								"org.xtext.example.mydsl.MyDsl.ERole");
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

            otherlv_22=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_22, grammarAccess.getEAssemblyContextAccess().getRightCurlyBracketKeyword_9());
            		

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
    // InternalMyDsl.g:1776:1: entryRuleEProvidedDelegationConnector returns [EObject current=null] : iv_ruleEProvidedDelegationConnector= ruleEProvidedDelegationConnector EOF ;
    public final EObject entryRuleEProvidedDelegationConnector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEProvidedDelegationConnector = null;


        try {
            // InternalMyDsl.g:1776:69: (iv_ruleEProvidedDelegationConnector= ruleEProvidedDelegationConnector EOF )
            // InternalMyDsl.g:1777:2: iv_ruleEProvidedDelegationConnector= ruleEProvidedDelegationConnector EOF
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
    // InternalMyDsl.g:1783:1: ruleEProvidedDelegationConnector returns [EObject current=null] : ( () otherlv_1= 'EProvidedDelegationConnector' otherlv_2= '{' (otherlv_3= 'linkFrom:' ( (otherlv_4= RULE_ID ) ) ) (otherlv_5= 'linkTo:' ( (otherlv_6= RULE_ID ) ) ) otherlv_7= '}' ) ;
    public final EObject ruleEProvidedDelegationConnector() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1789:2: ( ( () otherlv_1= 'EProvidedDelegationConnector' otherlv_2= '{' (otherlv_3= 'linkFrom:' ( (otherlv_4= RULE_ID ) ) ) (otherlv_5= 'linkTo:' ( (otherlv_6= RULE_ID ) ) ) otherlv_7= '}' ) )
            // InternalMyDsl.g:1790:2: ( () otherlv_1= 'EProvidedDelegationConnector' otherlv_2= '{' (otherlv_3= 'linkFrom:' ( (otherlv_4= RULE_ID ) ) ) (otherlv_5= 'linkTo:' ( (otherlv_6= RULE_ID ) ) ) otherlv_7= '}' )
            {
            // InternalMyDsl.g:1790:2: ( () otherlv_1= 'EProvidedDelegationConnector' otherlv_2= '{' (otherlv_3= 'linkFrom:' ( (otherlv_4= RULE_ID ) ) ) (otherlv_5= 'linkTo:' ( (otherlv_6= RULE_ID ) ) ) otherlv_7= '}' )
            // InternalMyDsl.g:1791:3: () otherlv_1= 'EProvidedDelegationConnector' otherlv_2= '{' (otherlv_3= 'linkFrom:' ( (otherlv_4= RULE_ID ) ) ) (otherlv_5= 'linkTo:' ( (otherlv_6= RULE_ID ) ) ) otherlv_7= '}'
            {
            // InternalMyDsl.g:1791:3: ()
            // InternalMyDsl.g:1792:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEProvidedDelegationConnectorAccess().getEProvidedDelegationConnectorAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,51,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getEProvidedDelegationConnectorAccess().getEProvidedDelegationConnectorKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_46); 

            			newLeafNode(otherlv_2, grammarAccess.getEProvidedDelegationConnectorAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:1806:3: (otherlv_3= 'linkFrom:' ( (otherlv_4= RULE_ID ) ) )
            // InternalMyDsl.g:1807:4: otherlv_3= 'linkFrom:' ( (otherlv_4= RULE_ID ) )
            {
            otherlv_3=(Token)match(input,52,FOLLOW_6); 

            				newLeafNode(otherlv_3, grammarAccess.getEProvidedDelegationConnectorAccess().getLinkFromKeyword_3_0());
            			
            // InternalMyDsl.g:1811:4: ( (otherlv_4= RULE_ID ) )
            // InternalMyDsl.g:1812:5: (otherlv_4= RULE_ID )
            {
            // InternalMyDsl.g:1812:5: (otherlv_4= RULE_ID )
            // InternalMyDsl.g:1813:6: otherlv_4= RULE_ID
            {

            						if (current==null) {
            							current = createModelElement(grammarAccess.getEProvidedDelegationConnectorRule());
            						}
            					
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_47); 

            						newLeafNode(otherlv_4, grammarAccess.getEProvidedDelegationConnectorAccess().getLinkFromEInterfaceCrossReference_3_1_0());
            					

            }


            }


            }

            // InternalMyDsl.g:1825:3: (otherlv_5= 'linkTo:' ( (otherlv_6= RULE_ID ) ) )
            // InternalMyDsl.g:1826:4: otherlv_5= 'linkTo:' ( (otherlv_6= RULE_ID ) )
            {
            otherlv_5=(Token)match(input,53,FOLLOW_6); 

            				newLeafNode(otherlv_5, grammarAccess.getEProvidedDelegationConnectorAccess().getLinkToKeyword_4_0());
            			
            // InternalMyDsl.g:1830:4: ( (otherlv_6= RULE_ID ) )
            // InternalMyDsl.g:1831:5: (otherlv_6= RULE_ID )
            {
            // InternalMyDsl.g:1831:5: (otherlv_6= RULE_ID )
            // InternalMyDsl.g:1832:6: otherlv_6= RULE_ID
            {

            						if (current==null) {
            							current = createModelElement(grammarAccess.getEProvidedDelegationConnectorRule());
            						}
            					
            otherlv_6=(Token)match(input,RULE_ID,FOLLOW_23); 

            						newLeafNode(otherlv_6, grammarAccess.getEProvidedDelegationConnectorAccess().getLinkToEProvidedRoleCrossReference_4_1_0());
            					

            }


            }


            }

            otherlv_7=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getEProvidedDelegationConnectorAccess().getRightCurlyBracketKeyword_5());
            		

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
    // InternalMyDsl.g:1852:1: entryRuleERequiredDelegationConnector returns [EObject current=null] : iv_ruleERequiredDelegationConnector= ruleERequiredDelegationConnector EOF ;
    public final EObject entryRuleERequiredDelegationConnector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleERequiredDelegationConnector = null;


        try {
            // InternalMyDsl.g:1852:69: (iv_ruleERequiredDelegationConnector= ruleERequiredDelegationConnector EOF )
            // InternalMyDsl.g:1853:2: iv_ruleERequiredDelegationConnector= ruleERequiredDelegationConnector EOF
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
    // InternalMyDsl.g:1859:1: ruleERequiredDelegationConnector returns [EObject current=null] : ( () otherlv_1= 'ERequiredDelegationConnector' otherlv_2= '{' (otherlv_3= 'linkFrom:' ( (otherlv_4= RULE_ID ) ) ) (otherlv_5= 'linkTo:' ( (otherlv_6= RULE_ID ) ) ) otherlv_7= '}' ) ;
    public final EObject ruleERequiredDelegationConnector() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1865:2: ( ( () otherlv_1= 'ERequiredDelegationConnector' otherlv_2= '{' (otherlv_3= 'linkFrom:' ( (otherlv_4= RULE_ID ) ) ) (otherlv_5= 'linkTo:' ( (otherlv_6= RULE_ID ) ) ) otherlv_7= '}' ) )
            // InternalMyDsl.g:1866:2: ( () otherlv_1= 'ERequiredDelegationConnector' otherlv_2= '{' (otherlv_3= 'linkFrom:' ( (otherlv_4= RULE_ID ) ) ) (otherlv_5= 'linkTo:' ( (otherlv_6= RULE_ID ) ) ) otherlv_7= '}' )
            {
            // InternalMyDsl.g:1866:2: ( () otherlv_1= 'ERequiredDelegationConnector' otherlv_2= '{' (otherlv_3= 'linkFrom:' ( (otherlv_4= RULE_ID ) ) ) (otherlv_5= 'linkTo:' ( (otherlv_6= RULE_ID ) ) ) otherlv_7= '}' )
            // InternalMyDsl.g:1867:3: () otherlv_1= 'ERequiredDelegationConnector' otherlv_2= '{' (otherlv_3= 'linkFrom:' ( (otherlv_4= RULE_ID ) ) ) (otherlv_5= 'linkTo:' ( (otherlv_6= RULE_ID ) ) ) otherlv_7= '}'
            {
            // InternalMyDsl.g:1867:3: ()
            // InternalMyDsl.g:1868:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getERequiredDelegationConnectorAccess().getERequiredDelegationConnectorAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,54,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getERequiredDelegationConnectorAccess().getERequiredDelegationConnectorKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_46); 

            			newLeafNode(otherlv_2, grammarAccess.getERequiredDelegationConnectorAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:1882:3: (otherlv_3= 'linkFrom:' ( (otherlv_4= RULE_ID ) ) )
            // InternalMyDsl.g:1883:4: otherlv_3= 'linkFrom:' ( (otherlv_4= RULE_ID ) )
            {
            otherlv_3=(Token)match(input,52,FOLLOW_6); 

            				newLeafNode(otherlv_3, grammarAccess.getERequiredDelegationConnectorAccess().getLinkFromKeyword_3_0());
            			
            // InternalMyDsl.g:1887:4: ( (otherlv_4= RULE_ID ) )
            // InternalMyDsl.g:1888:5: (otherlv_4= RULE_ID )
            {
            // InternalMyDsl.g:1888:5: (otherlv_4= RULE_ID )
            // InternalMyDsl.g:1889:6: otherlv_4= RULE_ID
            {

            						if (current==null) {
            							current = createModelElement(grammarAccess.getERequiredDelegationConnectorRule());
            						}
            					
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_47); 

            						newLeafNode(otherlv_4, grammarAccess.getERequiredDelegationConnectorAccess().getLinkFromERequiredRoleCrossReference_3_1_0());
            					

            }


            }


            }

            // InternalMyDsl.g:1901:3: (otherlv_5= 'linkTo:' ( (otherlv_6= RULE_ID ) ) )
            // InternalMyDsl.g:1902:4: otherlv_5= 'linkTo:' ( (otherlv_6= RULE_ID ) )
            {
            otherlv_5=(Token)match(input,53,FOLLOW_6); 

            				newLeafNode(otherlv_5, grammarAccess.getERequiredDelegationConnectorAccess().getLinkToKeyword_4_0());
            			
            // InternalMyDsl.g:1906:4: ( (otherlv_6= RULE_ID ) )
            // InternalMyDsl.g:1907:5: (otherlv_6= RULE_ID )
            {
            // InternalMyDsl.g:1907:5: (otherlv_6= RULE_ID )
            // InternalMyDsl.g:1908:6: otherlv_6= RULE_ID
            {

            						if (current==null) {
            							current = createModelElement(grammarAccess.getERequiredDelegationConnectorRule());
            						}
            					
            otherlv_6=(Token)match(input,RULE_ID,FOLLOW_23); 

            						newLeafNode(otherlv_6, grammarAccess.getERequiredDelegationConnectorAccess().getLinkToEInterfaceCrossReference_4_1_0());
            					

            }


            }


            }

            otherlv_7=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getERequiredDelegationConnectorAccess().getRightCurlyBracketKeyword_5());
            		

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
    // InternalMyDsl.g:1928:1: entryRuleESystemIndependentViewPoint returns [EObject current=null] : iv_ruleESystemIndependentViewPoint= ruleESystemIndependentViewPoint EOF ;
    public final EObject entryRuleESystemIndependentViewPoint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleESystemIndependentViewPoint = null;


        try {
            // InternalMyDsl.g:1928:68: (iv_ruleESystemIndependentViewPoint= ruleESystemIndependentViewPoint EOF )
            // InternalMyDsl.g:1929:2: iv_ruleESystemIndependentViewPoint= ruleESystemIndependentViewPoint EOF
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
    // InternalMyDsl.g:1935:1: ruleESystemIndependentViewPoint returns [EObject current=null] : ( () otherlv_1= 'ESystemIndependentViewPoint' otherlv_2= '{' (otherlv_3= 'repositoryViewType:' ( (lv_repositoryViewType_4_0= ruleERepositoryViewType ) ) ) otherlv_5= '}' ) ;
    public final EObject ruleESystemIndependentViewPoint() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_repositoryViewType_4_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1941:2: ( ( () otherlv_1= 'ESystemIndependentViewPoint' otherlv_2= '{' (otherlv_3= 'repositoryViewType:' ( (lv_repositoryViewType_4_0= ruleERepositoryViewType ) ) ) otherlv_5= '}' ) )
            // InternalMyDsl.g:1942:2: ( () otherlv_1= 'ESystemIndependentViewPoint' otherlv_2= '{' (otherlv_3= 'repositoryViewType:' ( (lv_repositoryViewType_4_0= ruleERepositoryViewType ) ) ) otherlv_5= '}' )
            {
            // InternalMyDsl.g:1942:2: ( () otherlv_1= 'ESystemIndependentViewPoint' otherlv_2= '{' (otherlv_3= 'repositoryViewType:' ( (lv_repositoryViewType_4_0= ruleERepositoryViewType ) ) ) otherlv_5= '}' )
            // InternalMyDsl.g:1943:3: () otherlv_1= 'ESystemIndependentViewPoint' otherlv_2= '{' (otherlv_3= 'repositoryViewType:' ( (lv_repositoryViewType_4_0= ruleERepositoryViewType ) ) ) otherlv_5= '}'
            {
            // InternalMyDsl.g:1943:3: ()
            // InternalMyDsl.g:1944:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getESystemIndependentViewPointAccess().getESystemIndependentViewPointAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,55,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getESystemIndependentViewPointAccess().getESystemIndependentViewPointKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_48); 

            			newLeafNode(otherlv_2, grammarAccess.getESystemIndependentViewPointAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:1958:3: (otherlv_3= 'repositoryViewType:' ( (lv_repositoryViewType_4_0= ruleERepositoryViewType ) ) )
            // InternalMyDsl.g:1959:4: otherlv_3= 'repositoryViewType:' ( (lv_repositoryViewType_4_0= ruleERepositoryViewType ) )
            {
            otherlv_3=(Token)match(input,56,FOLLOW_49); 

            				newLeafNode(otherlv_3, grammarAccess.getESystemIndependentViewPointAccess().getRepositoryViewTypeKeyword_3_0());
            			
            // InternalMyDsl.g:1963:4: ( (lv_repositoryViewType_4_0= ruleERepositoryViewType ) )
            // InternalMyDsl.g:1964:5: (lv_repositoryViewType_4_0= ruleERepositoryViewType )
            {
            // InternalMyDsl.g:1964:5: (lv_repositoryViewType_4_0= ruleERepositoryViewType )
            // InternalMyDsl.g:1965:6: lv_repositoryViewType_4_0= ruleERepositoryViewType
            {

            						newCompositeNode(grammarAccess.getESystemIndependentViewPointAccess().getRepositoryViewTypeERepositoryViewTypeParserRuleCall_3_1_0());
            					
            pushFollow(FOLLOW_23);
            lv_repositoryViewType_4_0=ruleERepositoryViewType();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getESystemIndependentViewPointRule());
            						}
            						set(
            							current,
            							"repositoryViewType",
            							lv_repositoryViewType_4_0,
            							"org.xtext.example.mydsl.MyDsl.ERepositoryViewType");
            						afterParserOrEnumRuleCall();
            					

            }


            }


            }

            otherlv_5=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getESystemIndependentViewPointAccess().getRightCurlyBracketKeyword_4());
            		

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
    // InternalMyDsl.g:1991:1: entryRuleEAssemblyViewPoint returns [EObject current=null] : iv_ruleEAssemblyViewPoint= ruleEAssemblyViewPoint EOF ;
    public final EObject entryRuleEAssemblyViewPoint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEAssemblyViewPoint = null;


        try {
            // InternalMyDsl.g:1991:59: (iv_ruleEAssemblyViewPoint= ruleEAssemblyViewPoint EOF )
            // InternalMyDsl.g:1992:2: iv_ruleEAssemblyViewPoint= ruleEAssemblyViewPoint EOF
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
    // InternalMyDsl.g:1998:1: ruleEAssemblyViewPoint returns [EObject current=null] : ( () otherlv_1= 'EAssemblyViewPoint' otherlv_2= '{' (otherlv_3= 'assemblyViewType:' ( (lv_assemblyViewType_4_0= ruleEAssemblyViewType ) ) ) otherlv_5= '}' ) ;
    public final EObject ruleEAssemblyViewPoint() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_assemblyViewType_4_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2004:2: ( ( () otherlv_1= 'EAssemblyViewPoint' otherlv_2= '{' (otherlv_3= 'assemblyViewType:' ( (lv_assemblyViewType_4_0= ruleEAssemblyViewType ) ) ) otherlv_5= '}' ) )
            // InternalMyDsl.g:2005:2: ( () otherlv_1= 'EAssemblyViewPoint' otherlv_2= '{' (otherlv_3= 'assemblyViewType:' ( (lv_assemblyViewType_4_0= ruleEAssemblyViewType ) ) ) otherlv_5= '}' )
            {
            // InternalMyDsl.g:2005:2: ( () otherlv_1= 'EAssemblyViewPoint' otherlv_2= '{' (otherlv_3= 'assemblyViewType:' ( (lv_assemblyViewType_4_0= ruleEAssemblyViewType ) ) ) otherlv_5= '}' )
            // InternalMyDsl.g:2006:3: () otherlv_1= 'EAssemblyViewPoint' otherlv_2= '{' (otherlv_3= 'assemblyViewType:' ( (lv_assemblyViewType_4_0= ruleEAssemblyViewType ) ) ) otherlv_5= '}'
            {
            // InternalMyDsl.g:2006:3: ()
            // InternalMyDsl.g:2007:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEAssemblyViewPointAccess().getEAssemblyViewPointAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,57,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getEAssemblyViewPointAccess().getEAssemblyViewPointKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_50); 

            			newLeafNode(otherlv_2, grammarAccess.getEAssemblyViewPointAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:2021:3: (otherlv_3= 'assemblyViewType:' ( (lv_assemblyViewType_4_0= ruleEAssemblyViewType ) ) )
            // InternalMyDsl.g:2022:4: otherlv_3= 'assemblyViewType:' ( (lv_assemblyViewType_4_0= ruleEAssemblyViewType ) )
            {
            otherlv_3=(Token)match(input,58,FOLLOW_51); 

            				newLeafNode(otherlv_3, grammarAccess.getEAssemblyViewPointAccess().getAssemblyViewTypeKeyword_3_0());
            			
            // InternalMyDsl.g:2026:4: ( (lv_assemblyViewType_4_0= ruleEAssemblyViewType ) )
            // InternalMyDsl.g:2027:5: (lv_assemblyViewType_4_0= ruleEAssemblyViewType )
            {
            // InternalMyDsl.g:2027:5: (lv_assemblyViewType_4_0= ruleEAssemblyViewType )
            // InternalMyDsl.g:2028:6: lv_assemblyViewType_4_0= ruleEAssemblyViewType
            {

            						newCompositeNode(grammarAccess.getEAssemblyViewPointAccess().getAssemblyViewTypeEAssemblyViewTypeParserRuleCall_3_1_0());
            					
            pushFollow(FOLLOW_23);
            lv_assemblyViewType_4_0=ruleEAssemblyViewType();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getEAssemblyViewPointRule());
            						}
            						set(
            							current,
            							"assemblyViewType",
            							lv_assemblyViewType_4_0,
            							"org.xtext.example.mydsl.MyDsl.EAssemblyViewType");
            						afterParserOrEnumRuleCall();
            					

            }


            }


            }

            otherlv_5=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getEAssemblyViewPointAccess().getRightCurlyBracketKeyword_4());
            		

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
    // InternalMyDsl.g:2054:1: entryRuleEDeploymentViewPoint returns [EObject current=null] : iv_ruleEDeploymentViewPoint= ruleEDeploymentViewPoint EOF ;
    public final EObject entryRuleEDeploymentViewPoint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEDeploymentViewPoint = null;


        try {
            // InternalMyDsl.g:2054:61: (iv_ruleEDeploymentViewPoint= ruleEDeploymentViewPoint EOF )
            // InternalMyDsl.g:2055:2: iv_ruleEDeploymentViewPoint= ruleEDeploymentViewPoint EOF
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
    // InternalMyDsl.g:2061:1: ruleEDeploymentViewPoint returns [EObject current=null] : ( () otherlv_1= 'EDeploymentViewPoint' otherlv_2= '{' otherlv_3= 'allocationViewType:' ( (lv_allocationViewType_4_0= ruleEAllocationViewType ) ) otherlv_5= 'environmentViewType:' ( (lv_environmentViewType_6_0= ruleEEnvironmentViewType ) ) otherlv_7= '}' ) ;
    public final EObject ruleEDeploymentViewPoint() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_allocationViewType_4_0 = null;

        EObject lv_environmentViewType_6_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2067:2: ( ( () otherlv_1= 'EDeploymentViewPoint' otherlv_2= '{' otherlv_3= 'allocationViewType:' ( (lv_allocationViewType_4_0= ruleEAllocationViewType ) ) otherlv_5= 'environmentViewType:' ( (lv_environmentViewType_6_0= ruleEEnvironmentViewType ) ) otherlv_7= '}' ) )
            // InternalMyDsl.g:2068:2: ( () otherlv_1= 'EDeploymentViewPoint' otherlv_2= '{' otherlv_3= 'allocationViewType:' ( (lv_allocationViewType_4_0= ruleEAllocationViewType ) ) otherlv_5= 'environmentViewType:' ( (lv_environmentViewType_6_0= ruleEEnvironmentViewType ) ) otherlv_7= '}' )
            {
            // InternalMyDsl.g:2068:2: ( () otherlv_1= 'EDeploymentViewPoint' otherlv_2= '{' otherlv_3= 'allocationViewType:' ( (lv_allocationViewType_4_0= ruleEAllocationViewType ) ) otherlv_5= 'environmentViewType:' ( (lv_environmentViewType_6_0= ruleEEnvironmentViewType ) ) otherlv_7= '}' )
            // InternalMyDsl.g:2069:3: () otherlv_1= 'EDeploymentViewPoint' otherlv_2= '{' otherlv_3= 'allocationViewType:' ( (lv_allocationViewType_4_0= ruleEAllocationViewType ) ) otherlv_5= 'environmentViewType:' ( (lv_environmentViewType_6_0= ruleEEnvironmentViewType ) ) otherlv_7= '}'
            {
            // InternalMyDsl.g:2069:3: ()
            // InternalMyDsl.g:2070:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEDeploymentViewPointAccess().getEDeploymentViewPointAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,59,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getEDeploymentViewPointAccess().getEDeploymentViewPointKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_52); 

            			newLeafNode(otherlv_2, grammarAccess.getEDeploymentViewPointAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,60,FOLLOW_53); 

            			newLeafNode(otherlv_3, grammarAccess.getEDeploymentViewPointAccess().getAllocationViewTypeKeyword_3());
            		
            // InternalMyDsl.g:2088:3: ( (lv_allocationViewType_4_0= ruleEAllocationViewType ) )
            // InternalMyDsl.g:2089:4: (lv_allocationViewType_4_0= ruleEAllocationViewType )
            {
            // InternalMyDsl.g:2089:4: (lv_allocationViewType_4_0= ruleEAllocationViewType )
            // InternalMyDsl.g:2090:5: lv_allocationViewType_4_0= ruleEAllocationViewType
            {

            					newCompositeNode(grammarAccess.getEDeploymentViewPointAccess().getAllocationViewTypeEAllocationViewTypeParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_54);
            lv_allocationViewType_4_0=ruleEAllocationViewType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEDeploymentViewPointRule());
            					}
            					set(
            						current,
            						"allocationViewType",
            						lv_allocationViewType_4_0,
            						"org.xtext.example.mydsl.MyDsl.EAllocationViewType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,61,FOLLOW_55); 

            			newLeafNode(otherlv_5, grammarAccess.getEDeploymentViewPointAccess().getEnvironmentViewTypeKeyword_5());
            		
            // InternalMyDsl.g:2111:3: ( (lv_environmentViewType_6_0= ruleEEnvironmentViewType ) )
            // InternalMyDsl.g:2112:4: (lv_environmentViewType_6_0= ruleEEnvironmentViewType )
            {
            // InternalMyDsl.g:2112:4: (lv_environmentViewType_6_0= ruleEEnvironmentViewType )
            // InternalMyDsl.g:2113:5: lv_environmentViewType_6_0= ruleEEnvironmentViewType
            {

            					newCompositeNode(grammarAccess.getEDeploymentViewPointAccess().getEnvironmentViewTypeEEnvironmentViewTypeParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_23);
            lv_environmentViewType_6_0=ruleEEnvironmentViewType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEDeploymentViewPointRule());
            					}
            					set(
            						current,
            						"environmentViewType",
            						lv_environmentViewType_6_0,
            						"org.xtext.example.mydsl.MyDsl.EEnvironmentViewType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getEDeploymentViewPointAccess().getRightCurlyBracketKeyword_7());
            		

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
    // InternalMyDsl.g:2138:1: entryRuleERepositoryViewType returns [EObject current=null] : iv_ruleERepositoryViewType= ruleERepositoryViewType EOF ;
    public final EObject entryRuleERepositoryViewType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleERepositoryViewType = null;


        try {
            // InternalMyDsl.g:2138:60: (iv_ruleERepositoryViewType= ruleERepositoryViewType EOF )
            // InternalMyDsl.g:2139:2: iv_ruleERepositoryViewType= ruleERepositoryViewType EOF
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
    // InternalMyDsl.g:2145:1: ruleERepositoryViewType returns [EObject current=null] : ( () otherlv_1= 'ERepositoryViewType' otherlv_2= '{' (otherlv_3= 'showsInterfaces:' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* )? (otherlv_7= 'showsComponents:' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* )? otherlv_11= '}' ) ;
    public final EObject ruleERepositoryViewType() throws RecognitionException {
        EObject current = null;

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


        	enterRule();

        try {
            // InternalMyDsl.g:2151:2: ( ( () otherlv_1= 'ERepositoryViewType' otherlv_2= '{' (otherlv_3= 'showsInterfaces:' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* )? (otherlv_7= 'showsComponents:' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* )? otherlv_11= '}' ) )
            // InternalMyDsl.g:2152:2: ( () otherlv_1= 'ERepositoryViewType' otherlv_2= '{' (otherlv_3= 'showsInterfaces:' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* )? (otherlv_7= 'showsComponents:' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* )? otherlv_11= '}' )
            {
            // InternalMyDsl.g:2152:2: ( () otherlv_1= 'ERepositoryViewType' otherlv_2= '{' (otherlv_3= 'showsInterfaces:' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* )? (otherlv_7= 'showsComponents:' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* )? otherlv_11= '}' )
            // InternalMyDsl.g:2153:3: () otherlv_1= 'ERepositoryViewType' otherlv_2= '{' (otherlv_3= 'showsInterfaces:' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* )? (otherlv_7= 'showsComponents:' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* )? otherlv_11= '}'
            {
            // InternalMyDsl.g:2153:3: ()
            // InternalMyDsl.g:2154:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getERepositoryViewTypeAccess().getERepositoryViewTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,62,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getERepositoryViewTypeAccess().getERepositoryViewTypeKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_56); 

            			newLeafNode(otherlv_2, grammarAccess.getERepositoryViewTypeAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:2168:3: (otherlv_3= 'showsInterfaces:' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==63) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalMyDsl.g:2169:4: otherlv_3= 'showsInterfaces:' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )*
                    {
                    otherlv_3=(Token)match(input,63,FOLLOW_6); 

                    				newLeafNode(otherlv_3, grammarAccess.getERepositoryViewTypeAccess().getShowsInterfacesKeyword_3_0());
                    			
                    // InternalMyDsl.g:2173:4: ( (otherlv_4= RULE_ID ) )
                    // InternalMyDsl.g:2174:5: (otherlv_4= RULE_ID )
                    {
                    // InternalMyDsl.g:2174:5: (otherlv_4= RULE_ID )
                    // InternalMyDsl.g:2175:6: otherlv_4= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getERepositoryViewTypeRule());
                    						}
                    					
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_57); 

                    						newLeafNode(otherlv_4, grammarAccess.getERepositoryViewTypeAccess().getShowsInterfacesEInterfaceCrossReference_3_1_0());
                    					

                    }


                    }

                    // InternalMyDsl.g:2186:4: (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )*
                    loop55:
                    do {
                        int alt55=2;
                        int LA55_0 = input.LA(1);

                        if ( (LA55_0==14) ) {
                            alt55=1;
                        }


                        switch (alt55) {
                    	case 1 :
                    	    // InternalMyDsl.g:2187:5: otherlv_5= ',' ( (otherlv_6= RULE_ID ) )
                    	    {
                    	    otherlv_5=(Token)match(input,14,FOLLOW_6); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getERepositoryViewTypeAccess().getCommaKeyword_3_2_0());
                    	    				
                    	    // InternalMyDsl.g:2191:5: ( (otherlv_6= RULE_ID ) )
                    	    // InternalMyDsl.g:2192:6: (otherlv_6= RULE_ID )
                    	    {
                    	    // InternalMyDsl.g:2192:6: (otherlv_6= RULE_ID )
                    	    // InternalMyDsl.g:2193:7: otherlv_6= RULE_ID
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getERepositoryViewTypeRule());
                    	    							}
                    	    						
                    	    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_57); 

                    	    							newLeafNode(otherlv_6, grammarAccess.getERepositoryViewTypeAccess().getShowsInterfacesEInterfaceCrossReference_3_2_1_0());
                    	    						

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

            // InternalMyDsl.g:2206:3: (otherlv_7= 'showsComponents:' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==64) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalMyDsl.g:2207:4: otherlv_7= 'showsComponents:' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )*
                    {
                    otherlv_7=(Token)match(input,64,FOLLOW_6); 

                    				newLeafNode(otherlv_7, grammarAccess.getERepositoryViewTypeAccess().getShowsComponentsKeyword_4_0());
                    			
                    // InternalMyDsl.g:2211:4: ( (otherlv_8= RULE_ID ) )
                    // InternalMyDsl.g:2212:5: (otherlv_8= RULE_ID )
                    {
                    // InternalMyDsl.g:2212:5: (otherlv_8= RULE_ID )
                    // InternalMyDsl.g:2213:6: otherlv_8= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getERepositoryViewTypeRule());
                    						}
                    					
                    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_13); 

                    						newLeafNode(otherlv_8, grammarAccess.getERepositoryViewTypeAccess().getShowsComponentsEComponentCrossReference_4_1_0());
                    					

                    }


                    }

                    // InternalMyDsl.g:2224:4: (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )*
                    loop57:
                    do {
                        int alt57=2;
                        int LA57_0 = input.LA(1);

                        if ( (LA57_0==14) ) {
                            alt57=1;
                        }


                        switch (alt57) {
                    	case 1 :
                    	    // InternalMyDsl.g:2225:5: otherlv_9= ',' ( (otherlv_10= RULE_ID ) )
                    	    {
                    	    otherlv_9=(Token)match(input,14,FOLLOW_6); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getERepositoryViewTypeAccess().getCommaKeyword_4_2_0());
                    	    				
                    	    // InternalMyDsl.g:2229:5: ( (otherlv_10= RULE_ID ) )
                    	    // InternalMyDsl.g:2230:6: (otherlv_10= RULE_ID )
                    	    {
                    	    // InternalMyDsl.g:2230:6: (otherlv_10= RULE_ID )
                    	    // InternalMyDsl.g:2231:7: otherlv_10= RULE_ID
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getERepositoryViewTypeRule());
                    	    							}
                    	    						
                    	    otherlv_10=(Token)match(input,RULE_ID,FOLLOW_13); 

                    	    							newLeafNode(otherlv_10, grammarAccess.getERepositoryViewTypeAccess().getShowsComponentsEComponentCrossReference_4_2_1_0());
                    	    						

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

            otherlv_11=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getERepositoryViewTypeAccess().getRightCurlyBracketKeyword_5());
            		

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
    // InternalMyDsl.g:2252:1: entryRuleEAssemblyViewType returns [EObject current=null] : iv_ruleEAssemblyViewType= ruleEAssemblyViewType EOF ;
    public final EObject entryRuleEAssemblyViewType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEAssemblyViewType = null;


        try {
            // InternalMyDsl.g:2252:58: (iv_ruleEAssemblyViewType= ruleEAssemblyViewType EOF )
            // InternalMyDsl.g:2253:2: iv_ruleEAssemblyViewType= ruleEAssemblyViewType EOF
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
    // InternalMyDsl.g:2259:1: ruleEAssemblyViewType returns [EObject current=null] : ( () otherlv_1= 'EAssemblyViewType' otherlv_2= '{' (otherlv_3= 'mainArtifacts:' ( (lv_mainArtifacts_4_0= ruleEAssemblyContext ) ) (otherlv_5= ',' ( (lv_mainArtifacts_6_0= ruleEAssemblyContext ) ) )* )? (otherlv_7= 'showsComponents:' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* )? otherlv_11= '}' ) ;
    public final EObject ruleEAssemblyViewType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        EObject lv_mainArtifacts_4_0 = null;

        EObject lv_mainArtifacts_6_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2265:2: ( ( () otherlv_1= 'EAssemblyViewType' otherlv_2= '{' (otherlv_3= 'mainArtifacts:' ( (lv_mainArtifacts_4_0= ruleEAssemblyContext ) ) (otherlv_5= ',' ( (lv_mainArtifacts_6_0= ruleEAssemblyContext ) ) )* )? (otherlv_7= 'showsComponents:' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* )? otherlv_11= '}' ) )
            // InternalMyDsl.g:2266:2: ( () otherlv_1= 'EAssemblyViewType' otherlv_2= '{' (otherlv_3= 'mainArtifacts:' ( (lv_mainArtifacts_4_0= ruleEAssemblyContext ) ) (otherlv_5= ',' ( (lv_mainArtifacts_6_0= ruleEAssemblyContext ) ) )* )? (otherlv_7= 'showsComponents:' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* )? otherlv_11= '}' )
            {
            // InternalMyDsl.g:2266:2: ( () otherlv_1= 'EAssemblyViewType' otherlv_2= '{' (otherlv_3= 'mainArtifacts:' ( (lv_mainArtifacts_4_0= ruleEAssemblyContext ) ) (otherlv_5= ',' ( (lv_mainArtifacts_6_0= ruleEAssemblyContext ) ) )* )? (otherlv_7= 'showsComponents:' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* )? otherlv_11= '}' )
            // InternalMyDsl.g:2267:3: () otherlv_1= 'EAssemblyViewType' otherlv_2= '{' (otherlv_3= 'mainArtifacts:' ( (lv_mainArtifacts_4_0= ruleEAssemblyContext ) ) (otherlv_5= ',' ( (lv_mainArtifacts_6_0= ruleEAssemblyContext ) ) )* )? (otherlv_7= 'showsComponents:' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* )? otherlv_11= '}'
            {
            // InternalMyDsl.g:2267:3: ()
            // InternalMyDsl.g:2268:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEAssemblyViewTypeAccess().getEAssemblyViewTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,65,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getEAssemblyViewTypeAccess().getEAssemblyViewTypeKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_58); 

            			newLeafNode(otherlv_2, grammarAccess.getEAssemblyViewTypeAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:2282:3: (otherlv_3= 'mainArtifacts:' ( (lv_mainArtifacts_4_0= ruleEAssemblyContext ) ) (otherlv_5= ',' ( (lv_mainArtifacts_6_0= ruleEAssemblyContext ) ) )* )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==66) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // InternalMyDsl.g:2283:4: otherlv_3= 'mainArtifacts:' ( (lv_mainArtifacts_4_0= ruleEAssemblyContext ) ) (otherlv_5= ',' ( (lv_mainArtifacts_6_0= ruleEAssemblyContext ) ) )*
                    {
                    otherlv_3=(Token)match(input,66,FOLLOW_59); 

                    				newLeafNode(otherlv_3, grammarAccess.getEAssemblyViewTypeAccess().getMainArtifactsKeyword_3_0());
                    			
                    // InternalMyDsl.g:2287:4: ( (lv_mainArtifacts_4_0= ruleEAssemblyContext ) )
                    // InternalMyDsl.g:2288:5: (lv_mainArtifacts_4_0= ruleEAssemblyContext )
                    {
                    // InternalMyDsl.g:2288:5: (lv_mainArtifacts_4_0= ruleEAssemblyContext )
                    // InternalMyDsl.g:2289:6: lv_mainArtifacts_4_0= ruleEAssemblyContext
                    {

                    						newCompositeNode(grammarAccess.getEAssemblyViewTypeAccess().getMainArtifactsEAssemblyContextParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_57);
                    lv_mainArtifacts_4_0=ruleEAssemblyContext();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEAssemblyViewTypeRule());
                    						}
                    						add(
                    							current,
                    							"mainArtifacts",
                    							lv_mainArtifacts_4_0,
                    							"org.xtext.example.mydsl.MyDsl.EAssemblyContext");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:2306:4: (otherlv_5= ',' ( (lv_mainArtifacts_6_0= ruleEAssemblyContext ) ) )*
                    loop59:
                    do {
                        int alt59=2;
                        int LA59_0 = input.LA(1);

                        if ( (LA59_0==14) ) {
                            alt59=1;
                        }


                        switch (alt59) {
                    	case 1 :
                    	    // InternalMyDsl.g:2307:5: otherlv_5= ',' ( (lv_mainArtifacts_6_0= ruleEAssemblyContext ) )
                    	    {
                    	    otherlv_5=(Token)match(input,14,FOLLOW_59); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getEAssemblyViewTypeAccess().getCommaKeyword_3_2_0());
                    	    				
                    	    // InternalMyDsl.g:2311:5: ( (lv_mainArtifacts_6_0= ruleEAssemblyContext ) )
                    	    // InternalMyDsl.g:2312:6: (lv_mainArtifacts_6_0= ruleEAssemblyContext )
                    	    {
                    	    // InternalMyDsl.g:2312:6: (lv_mainArtifacts_6_0= ruleEAssemblyContext )
                    	    // InternalMyDsl.g:2313:7: lv_mainArtifacts_6_0= ruleEAssemblyContext
                    	    {

                    	    							newCompositeNode(grammarAccess.getEAssemblyViewTypeAccess().getMainArtifactsEAssemblyContextParserRuleCall_3_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_57);
                    	    lv_mainArtifacts_6_0=ruleEAssemblyContext();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getEAssemblyViewTypeRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"mainArtifacts",
                    	    								lv_mainArtifacts_6_0,
                    	    								"org.xtext.example.mydsl.MyDsl.EAssemblyContext");
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

            // InternalMyDsl.g:2332:3: (otherlv_7= 'showsComponents:' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==64) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // InternalMyDsl.g:2333:4: otherlv_7= 'showsComponents:' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )*
                    {
                    otherlv_7=(Token)match(input,64,FOLLOW_6); 

                    				newLeafNode(otherlv_7, grammarAccess.getEAssemblyViewTypeAccess().getShowsComponentsKeyword_4_0());
                    			
                    // InternalMyDsl.g:2337:4: ( (otherlv_8= RULE_ID ) )
                    // InternalMyDsl.g:2338:5: (otherlv_8= RULE_ID )
                    {
                    // InternalMyDsl.g:2338:5: (otherlv_8= RULE_ID )
                    // InternalMyDsl.g:2339:6: otherlv_8= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEAssemblyViewTypeRule());
                    						}
                    					
                    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_13); 

                    						newLeafNode(otherlv_8, grammarAccess.getEAssemblyViewTypeAccess().getShowsComponentsEComponentCrossReference_4_1_0());
                    					

                    }


                    }

                    // InternalMyDsl.g:2350:4: (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )*
                    loop61:
                    do {
                        int alt61=2;
                        int LA61_0 = input.LA(1);

                        if ( (LA61_0==14) ) {
                            alt61=1;
                        }


                        switch (alt61) {
                    	case 1 :
                    	    // InternalMyDsl.g:2351:5: otherlv_9= ',' ( (otherlv_10= RULE_ID ) )
                    	    {
                    	    otherlv_9=(Token)match(input,14,FOLLOW_6); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getEAssemblyViewTypeAccess().getCommaKeyword_4_2_0());
                    	    				
                    	    // InternalMyDsl.g:2355:5: ( (otherlv_10= RULE_ID ) )
                    	    // InternalMyDsl.g:2356:6: (otherlv_10= RULE_ID )
                    	    {
                    	    // InternalMyDsl.g:2356:6: (otherlv_10= RULE_ID )
                    	    // InternalMyDsl.g:2357:7: otherlv_10= RULE_ID
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getEAssemblyViewTypeRule());
                    	    							}
                    	    						
                    	    otherlv_10=(Token)match(input,RULE_ID,FOLLOW_13); 

                    	    							newLeafNode(otherlv_10, grammarAccess.getEAssemblyViewTypeAccess().getShowsComponentsEComponentCrossReference_4_2_1_0());
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop61;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_11=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getEAssemblyViewTypeAccess().getRightCurlyBracketKeyword_5());
            		

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
    // InternalMyDsl.g:2378:1: entryRuleEAllocationViewType returns [EObject current=null] : iv_ruleEAllocationViewType= ruleEAllocationViewType EOF ;
    public final EObject entryRuleEAllocationViewType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEAllocationViewType = null;


        try {
            // InternalMyDsl.g:2378:60: (iv_ruleEAllocationViewType= ruleEAllocationViewType EOF )
            // InternalMyDsl.g:2379:2: iv_ruleEAllocationViewType= ruleEAllocationViewType EOF
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
    // InternalMyDsl.g:2385:1: ruleEAllocationViewType returns [EObject current=null] : ( () otherlv_1= 'EAllocationViewType' otherlv_2= '{' (otherlv_3= 'includes:' ( (lv_includes_4_0= ruleEAllocationContext ) ) (otherlv_5= ',' ( (lv_includes_6_0= ruleEAllocationContext ) ) )* )? otherlv_7= '}' ) ;
    public final EObject ruleEAllocationViewType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_includes_4_0 = null;

        EObject lv_includes_6_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2391:2: ( ( () otherlv_1= 'EAllocationViewType' otherlv_2= '{' (otherlv_3= 'includes:' ( (lv_includes_4_0= ruleEAllocationContext ) ) (otherlv_5= ',' ( (lv_includes_6_0= ruleEAllocationContext ) ) )* )? otherlv_7= '}' ) )
            // InternalMyDsl.g:2392:2: ( () otherlv_1= 'EAllocationViewType' otherlv_2= '{' (otherlv_3= 'includes:' ( (lv_includes_4_0= ruleEAllocationContext ) ) (otherlv_5= ',' ( (lv_includes_6_0= ruleEAllocationContext ) ) )* )? otherlv_7= '}' )
            {
            // InternalMyDsl.g:2392:2: ( () otherlv_1= 'EAllocationViewType' otherlv_2= '{' (otherlv_3= 'includes:' ( (lv_includes_4_0= ruleEAllocationContext ) ) (otherlv_5= ',' ( (lv_includes_6_0= ruleEAllocationContext ) ) )* )? otherlv_7= '}' )
            // InternalMyDsl.g:2393:3: () otherlv_1= 'EAllocationViewType' otherlv_2= '{' (otherlv_3= 'includes:' ( (lv_includes_4_0= ruleEAllocationContext ) ) (otherlv_5= ',' ( (lv_includes_6_0= ruleEAllocationContext ) ) )* )? otherlv_7= '}'
            {
            // InternalMyDsl.g:2393:3: ()
            // InternalMyDsl.g:2394:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEAllocationViewTypeAccess().getEAllocationViewTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,67,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getEAllocationViewTypeAccess().getEAllocationViewTypeKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_60); 

            			newLeafNode(otherlv_2, grammarAccess.getEAllocationViewTypeAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:2408:3: (otherlv_3= 'includes:' ( (lv_includes_4_0= ruleEAllocationContext ) ) (otherlv_5= ',' ( (lv_includes_6_0= ruleEAllocationContext ) ) )* )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==68) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // InternalMyDsl.g:2409:4: otherlv_3= 'includes:' ( (lv_includes_4_0= ruleEAllocationContext ) ) (otherlv_5= ',' ( (lv_includes_6_0= ruleEAllocationContext ) ) )*
                    {
                    otherlv_3=(Token)match(input,68,FOLLOW_61); 

                    				newLeafNode(otherlv_3, grammarAccess.getEAllocationViewTypeAccess().getIncludesKeyword_3_0());
                    			
                    // InternalMyDsl.g:2413:4: ( (lv_includes_4_0= ruleEAllocationContext ) )
                    // InternalMyDsl.g:2414:5: (lv_includes_4_0= ruleEAllocationContext )
                    {
                    // InternalMyDsl.g:2414:5: (lv_includes_4_0= ruleEAllocationContext )
                    // InternalMyDsl.g:2415:6: lv_includes_4_0= ruleEAllocationContext
                    {

                    						newCompositeNode(grammarAccess.getEAllocationViewTypeAccess().getIncludesEAllocationContextParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_includes_4_0=ruleEAllocationContext();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEAllocationViewTypeRule());
                    						}
                    						add(
                    							current,
                    							"includes",
                    							lv_includes_4_0,
                    							"org.xtext.example.mydsl.MyDsl.EAllocationContext");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:2432:4: (otherlv_5= ',' ( (lv_includes_6_0= ruleEAllocationContext ) ) )*
                    loop63:
                    do {
                        int alt63=2;
                        int LA63_0 = input.LA(1);

                        if ( (LA63_0==14) ) {
                            alt63=1;
                        }


                        switch (alt63) {
                    	case 1 :
                    	    // InternalMyDsl.g:2433:5: otherlv_5= ',' ( (lv_includes_6_0= ruleEAllocationContext ) )
                    	    {
                    	    otherlv_5=(Token)match(input,14,FOLLOW_61); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getEAllocationViewTypeAccess().getCommaKeyword_3_2_0());
                    	    				
                    	    // InternalMyDsl.g:2437:5: ( (lv_includes_6_0= ruleEAllocationContext ) )
                    	    // InternalMyDsl.g:2438:6: (lv_includes_6_0= ruleEAllocationContext )
                    	    {
                    	    // InternalMyDsl.g:2438:6: (lv_includes_6_0= ruleEAllocationContext )
                    	    // InternalMyDsl.g:2439:7: lv_includes_6_0= ruleEAllocationContext
                    	    {

                    	    							newCompositeNode(grammarAccess.getEAllocationViewTypeAccess().getIncludesEAllocationContextParserRuleCall_3_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_13);
                    	    lv_includes_6_0=ruleEAllocationContext();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getEAllocationViewTypeRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"includes",
                    	    								lv_includes_6_0,
                    	    								"org.xtext.example.mydsl.MyDsl.EAllocationContext");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop63;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_7=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getEAllocationViewTypeAccess().getRightCurlyBracketKeyword_4());
            		

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
    // InternalMyDsl.g:2466:1: entryRuleEEnvironmentViewType returns [EObject current=null] : iv_ruleEEnvironmentViewType= ruleEEnvironmentViewType EOF ;
    public final EObject entryRuleEEnvironmentViewType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEEnvironmentViewType = null;


        try {
            // InternalMyDsl.g:2466:61: (iv_ruleEEnvironmentViewType= ruleEEnvironmentViewType EOF )
            // InternalMyDsl.g:2467:2: iv_ruleEEnvironmentViewType= ruleEEnvironmentViewType EOF
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
    // InternalMyDsl.g:2473:1: ruleEEnvironmentViewType returns [EObject current=null] : ( () otherlv_1= 'EEnvironmentViewType' otherlv_2= '{' (otherlv_3= 'showsLinks:' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* )? (otherlv_7= 'showsContainers:' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* )? otherlv_11= '}' ) ;
    public final EObject ruleEEnvironmentViewType() throws RecognitionException {
        EObject current = null;

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


        	enterRule();

        try {
            // InternalMyDsl.g:2479:2: ( ( () otherlv_1= 'EEnvironmentViewType' otherlv_2= '{' (otherlv_3= 'showsLinks:' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* )? (otherlv_7= 'showsContainers:' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* )? otherlv_11= '}' ) )
            // InternalMyDsl.g:2480:2: ( () otherlv_1= 'EEnvironmentViewType' otherlv_2= '{' (otherlv_3= 'showsLinks:' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* )? (otherlv_7= 'showsContainers:' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* )? otherlv_11= '}' )
            {
            // InternalMyDsl.g:2480:2: ( () otherlv_1= 'EEnvironmentViewType' otherlv_2= '{' (otherlv_3= 'showsLinks:' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* )? (otherlv_7= 'showsContainers:' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* )? otherlv_11= '}' )
            // InternalMyDsl.g:2481:3: () otherlv_1= 'EEnvironmentViewType' otherlv_2= '{' (otherlv_3= 'showsLinks:' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* )? (otherlv_7= 'showsContainers:' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* )? otherlv_11= '}'
            {
            // InternalMyDsl.g:2481:3: ()
            // InternalMyDsl.g:2482:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEEnvironmentViewTypeAccess().getEEnvironmentViewTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,69,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getEEnvironmentViewTypeAccess().getEEnvironmentViewTypeKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_62); 

            			newLeafNode(otherlv_2, grammarAccess.getEEnvironmentViewTypeAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:2496:3: (otherlv_3= 'showsLinks:' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==70) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // InternalMyDsl.g:2497:4: otherlv_3= 'showsLinks:' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )*
                    {
                    otherlv_3=(Token)match(input,70,FOLLOW_6); 

                    				newLeafNode(otherlv_3, grammarAccess.getEEnvironmentViewTypeAccess().getShowsLinksKeyword_3_0());
                    			
                    // InternalMyDsl.g:2501:4: ( (otherlv_4= RULE_ID ) )
                    // InternalMyDsl.g:2502:5: (otherlv_4= RULE_ID )
                    {
                    // InternalMyDsl.g:2502:5: (otherlv_4= RULE_ID )
                    // InternalMyDsl.g:2503:6: otherlv_4= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEEnvironmentViewTypeRule());
                    						}
                    					
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_63); 

                    						newLeafNode(otherlv_4, grammarAccess.getEEnvironmentViewTypeAccess().getShowsLinksELinkCrossReference_3_1_0());
                    					

                    }


                    }

                    // InternalMyDsl.g:2514:4: (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )*
                    loop65:
                    do {
                        int alt65=2;
                        int LA65_0 = input.LA(1);

                        if ( (LA65_0==14) ) {
                            alt65=1;
                        }


                        switch (alt65) {
                    	case 1 :
                    	    // InternalMyDsl.g:2515:5: otherlv_5= ',' ( (otherlv_6= RULE_ID ) )
                    	    {
                    	    otherlv_5=(Token)match(input,14,FOLLOW_6); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getEEnvironmentViewTypeAccess().getCommaKeyword_3_2_0());
                    	    				
                    	    // InternalMyDsl.g:2519:5: ( (otherlv_6= RULE_ID ) )
                    	    // InternalMyDsl.g:2520:6: (otherlv_6= RULE_ID )
                    	    {
                    	    // InternalMyDsl.g:2520:6: (otherlv_6= RULE_ID )
                    	    // InternalMyDsl.g:2521:7: otherlv_6= RULE_ID
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getEEnvironmentViewTypeRule());
                    	    							}
                    	    						
                    	    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_63); 

                    	    							newLeafNode(otherlv_6, grammarAccess.getEEnvironmentViewTypeAccess().getShowsLinksELinkCrossReference_3_2_1_0());
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop65;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalMyDsl.g:2534:3: (otherlv_7= 'showsContainers:' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==71) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // InternalMyDsl.g:2535:4: otherlv_7= 'showsContainers:' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )*
                    {
                    otherlv_7=(Token)match(input,71,FOLLOW_6); 

                    				newLeafNode(otherlv_7, grammarAccess.getEEnvironmentViewTypeAccess().getShowsContainersKeyword_4_0());
                    			
                    // InternalMyDsl.g:2539:4: ( (otherlv_8= RULE_ID ) )
                    // InternalMyDsl.g:2540:5: (otherlv_8= RULE_ID )
                    {
                    // InternalMyDsl.g:2540:5: (otherlv_8= RULE_ID )
                    // InternalMyDsl.g:2541:6: otherlv_8= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEEnvironmentViewTypeRule());
                    						}
                    					
                    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_13); 

                    						newLeafNode(otherlv_8, grammarAccess.getEEnvironmentViewTypeAccess().getShowsContainersEContainerCrossReference_4_1_0());
                    					

                    }


                    }

                    // InternalMyDsl.g:2552:4: (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )*
                    loop67:
                    do {
                        int alt67=2;
                        int LA67_0 = input.LA(1);

                        if ( (LA67_0==14) ) {
                            alt67=1;
                        }


                        switch (alt67) {
                    	case 1 :
                    	    // InternalMyDsl.g:2553:5: otherlv_9= ',' ( (otherlv_10= RULE_ID ) )
                    	    {
                    	    otherlv_9=(Token)match(input,14,FOLLOW_6); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getEEnvironmentViewTypeAccess().getCommaKeyword_4_2_0());
                    	    				
                    	    // InternalMyDsl.g:2557:5: ( (otherlv_10= RULE_ID ) )
                    	    // InternalMyDsl.g:2558:6: (otherlv_10= RULE_ID )
                    	    {
                    	    // InternalMyDsl.g:2558:6: (otherlv_10= RULE_ID )
                    	    // InternalMyDsl.g:2559:7: otherlv_10= RULE_ID
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getEEnvironmentViewTypeRule());
                    	    							}
                    	    						
                    	    otherlv_10=(Token)match(input,RULE_ID,FOLLOW_13); 

                    	    							newLeafNode(otherlv_10, grammarAccess.getEEnvironmentViewTypeAccess().getShowsContainersEContainerCrossReference_4_2_1_0());
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop67;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_11=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getEEnvironmentViewTypeAccess().getRightCurlyBracketKeyword_5());
            		

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
    // InternalMyDsl.g:2580:1: entryRuleEComponent returns [EObject current=null] : iv_ruleEComponent= ruleEComponent EOF ;
    public final EObject entryRuleEComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEComponent = null;


        try {
            // InternalMyDsl.g:2580:51: (iv_ruleEComponent= ruleEComponent EOF )
            // InternalMyDsl.g:2581:2: iv_ruleEComponent= ruleEComponent EOF
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
    // InternalMyDsl.g:2587:1: ruleEComponent returns [EObject current=null] : (this_EComponent_Impl_0= ruleEComponent_Impl | this_ECompositeComponent_1= ruleECompositeComponent ) ;
    public final EObject ruleEComponent() throws RecognitionException {
        EObject current = null;

        EObject this_EComponent_Impl_0 = null;

        EObject this_ECompositeComponent_1 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2593:2: ( (this_EComponent_Impl_0= ruleEComponent_Impl | this_ECompositeComponent_1= ruleECompositeComponent ) )
            // InternalMyDsl.g:2594:2: (this_EComponent_Impl_0= ruleEComponent_Impl | this_ECompositeComponent_1= ruleECompositeComponent )
            {
            // InternalMyDsl.g:2594:2: (this_EComponent_Impl_0= ruleEComponent_Impl | this_ECompositeComponent_1= ruleECompositeComponent )
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==72) ) {
                alt69=1;
            }
            else if ( (LA69_0==29) ) {
                alt69=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 69, 0, input);

                throw nvae;
            }
            switch (alt69) {
                case 1 :
                    // InternalMyDsl.g:2595:3: this_EComponent_Impl_0= ruleEComponent_Impl
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
                    // InternalMyDsl.g:2604:3: this_ECompositeComponent_1= ruleECompositeComponent
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
    // InternalMyDsl.g:2616:1: entryRuleEComponent_Impl returns [EObject current=null] : iv_ruleEComponent_Impl= ruleEComponent_Impl EOF ;
    public final EObject entryRuleEComponent_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEComponent_Impl = null;


        try {
            // InternalMyDsl.g:2616:56: (iv_ruleEComponent_Impl= ruleEComponent_Impl EOF )
            // InternalMyDsl.g:2617:2: iv_ruleEComponent_Impl= ruleEComponent_Impl EOF
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
    // InternalMyDsl.g:2623:1: ruleEComponent_Impl returns [EObject current=null] : ( () otherlv_1= 'EComponent' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'providesInterfaceTo:' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* )? (otherlv_8= 'usesInterfaceFrom:' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* )? (otherlv_12= 'providesDirectly:' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* )? (otherlv_16= 'provides:' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* )? (otherlv_20= 'requires:' ( ( ruleEString ) ) (otherlv_22= ',' ( ( ruleEString ) ) )* )? (otherlv_24= 'behaviourDescription:' ( (lv_behaviourDescription_25_0= ruleEBehaviourDescription ) ) )? otherlv_26= '}' ) ;
    public final EObject ruleEComponent_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token otherlv_26=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_behaviourDescription_25_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2629:2: ( ( () otherlv_1= 'EComponent' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'providesInterfaceTo:' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* )? (otherlv_8= 'usesInterfaceFrom:' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* )? (otherlv_12= 'providesDirectly:' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* )? (otherlv_16= 'provides:' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* )? (otherlv_20= 'requires:' ( ( ruleEString ) ) (otherlv_22= ',' ( ( ruleEString ) ) )* )? (otherlv_24= 'behaviourDescription:' ( (lv_behaviourDescription_25_0= ruleEBehaviourDescription ) ) )? otherlv_26= '}' ) )
            // InternalMyDsl.g:2630:2: ( () otherlv_1= 'EComponent' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'providesInterfaceTo:' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* )? (otherlv_8= 'usesInterfaceFrom:' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* )? (otherlv_12= 'providesDirectly:' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* )? (otherlv_16= 'provides:' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* )? (otherlv_20= 'requires:' ( ( ruleEString ) ) (otherlv_22= ',' ( ( ruleEString ) ) )* )? (otherlv_24= 'behaviourDescription:' ( (lv_behaviourDescription_25_0= ruleEBehaviourDescription ) ) )? otherlv_26= '}' )
            {
            // InternalMyDsl.g:2630:2: ( () otherlv_1= 'EComponent' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'providesInterfaceTo:' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* )? (otherlv_8= 'usesInterfaceFrom:' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* )? (otherlv_12= 'providesDirectly:' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* )? (otherlv_16= 'provides:' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* )? (otherlv_20= 'requires:' ( ( ruleEString ) ) (otherlv_22= ',' ( ( ruleEString ) ) )* )? (otherlv_24= 'behaviourDescription:' ( (lv_behaviourDescription_25_0= ruleEBehaviourDescription ) ) )? otherlv_26= '}' )
            // InternalMyDsl.g:2631:3: () otherlv_1= 'EComponent' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'providesInterfaceTo:' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* )? (otherlv_8= 'usesInterfaceFrom:' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* )? (otherlv_12= 'providesDirectly:' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* )? (otherlv_16= 'provides:' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* )? (otherlv_20= 'requires:' ( ( ruleEString ) ) (otherlv_22= ',' ( ( ruleEString ) ) )* )? (otherlv_24= 'behaviourDescription:' ( (lv_behaviourDescription_25_0= ruleEBehaviourDescription ) ) )? otherlv_26= '}'
            {
            // InternalMyDsl.g:2631:3: ()
            // InternalMyDsl.g:2632:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEComponent_ImplAccess().getEComponentAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,72,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getEComponent_ImplAccess().getEComponentKeyword_1());
            		
            // InternalMyDsl.g:2642:3: ( (lv_name_2_0= ruleEString ) )
            // InternalMyDsl.g:2643:4: (lv_name_2_0= ruleEString )
            {
            // InternalMyDsl.g:2643:4: (lv_name_2_0= ruleEString )
            // InternalMyDsl.g:2644:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getEComponent_ImplAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEComponent_ImplRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_64); 

            			newLeafNode(otherlv_3, grammarAccess.getEComponent_ImplAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalMyDsl.g:2665:3: (otherlv_4= 'providesInterfaceTo:' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==30) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // InternalMyDsl.g:2666:4: otherlv_4= 'providesInterfaceTo:' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )*
                    {
                    otherlv_4=(Token)match(input,30,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getEComponent_ImplAccess().getProvidesInterfaceToKeyword_4_0());
                    			
                    // InternalMyDsl.g:2670:4: ( ( ruleEString ) )
                    // InternalMyDsl.g:2671:5: ( ruleEString )
                    {
                    // InternalMyDsl.g:2671:5: ( ruleEString )
                    // InternalMyDsl.g:2672:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEComponent_ImplRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getEComponent_ImplAccess().getProvidesInterfaceToEComponentCrossReference_4_1_0());
                    					
                    pushFollow(FOLLOW_65);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:2686:4: (otherlv_6= ',' ( ( ruleEString ) ) )*
                    loop70:
                    do {
                        int alt70=2;
                        int LA70_0 = input.LA(1);

                        if ( (LA70_0==14) ) {
                            alt70=1;
                        }


                        switch (alt70) {
                    	case 1 :
                    	    // InternalMyDsl.g:2687:5: otherlv_6= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_6=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getEComponent_ImplAccess().getCommaKeyword_4_2_0());
                    	    				
                    	    // InternalMyDsl.g:2691:5: ( ( ruleEString ) )
                    	    // InternalMyDsl.g:2692:6: ( ruleEString )
                    	    {
                    	    // InternalMyDsl.g:2692:6: ( ruleEString )
                    	    // InternalMyDsl.g:2693:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getEComponent_ImplRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getEComponent_ImplAccess().getProvidesInterfaceToEComponentCrossReference_4_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_65);
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

            // InternalMyDsl.g:2709:3: (otherlv_8= 'usesInterfaceFrom:' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==31) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // InternalMyDsl.g:2710:4: otherlv_8= 'usesInterfaceFrom:' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )*
                    {
                    otherlv_8=(Token)match(input,31,FOLLOW_3); 

                    				newLeafNode(otherlv_8, grammarAccess.getEComponent_ImplAccess().getUsesInterfaceFromKeyword_5_0());
                    			
                    // InternalMyDsl.g:2714:4: ( ( ruleEString ) )
                    // InternalMyDsl.g:2715:5: ( ruleEString )
                    {
                    // InternalMyDsl.g:2715:5: ( ruleEString )
                    // InternalMyDsl.g:2716:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEComponent_ImplRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getEComponent_ImplAccess().getUsesInterfaceFromEComponentCrossReference_5_1_0());
                    					
                    pushFollow(FOLLOW_66);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:2730:4: (otherlv_10= ',' ( ( ruleEString ) ) )*
                    loop72:
                    do {
                        int alt72=2;
                        int LA72_0 = input.LA(1);

                        if ( (LA72_0==14) ) {
                            alt72=1;
                        }


                        switch (alt72) {
                    	case 1 :
                    	    // InternalMyDsl.g:2731:5: otherlv_10= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_10=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_10, grammarAccess.getEComponent_ImplAccess().getCommaKeyword_5_2_0());
                    	    				
                    	    // InternalMyDsl.g:2735:5: ( ( ruleEString ) )
                    	    // InternalMyDsl.g:2736:6: ( ruleEString )
                    	    {
                    	    // InternalMyDsl.g:2736:6: ( ruleEString )
                    	    // InternalMyDsl.g:2737:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getEComponent_ImplRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getEComponent_ImplAccess().getUsesInterfaceFromEComponentCrossReference_5_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_66);
                    	    ruleEString();

                    	    state._fsp--;


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

            // InternalMyDsl.g:2753:3: (otherlv_12= 'providesDirectly:' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==32) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // InternalMyDsl.g:2754:4: otherlv_12= 'providesDirectly:' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )*
                    {
                    otherlv_12=(Token)match(input,32,FOLLOW_3); 

                    				newLeafNode(otherlv_12, grammarAccess.getEComponent_ImplAccess().getProvidesDirectlyKeyword_6_0());
                    			
                    // InternalMyDsl.g:2758:4: ( ( ruleEString ) )
                    // InternalMyDsl.g:2759:5: ( ruleEString )
                    {
                    // InternalMyDsl.g:2759:5: ( ruleEString )
                    // InternalMyDsl.g:2760:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEComponent_ImplRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getEComponent_ImplAccess().getProvidesDirectlyEServiceCrossReference_6_1_0());
                    					
                    pushFollow(FOLLOW_67);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:2774:4: (otherlv_14= ',' ( ( ruleEString ) ) )*
                    loop74:
                    do {
                        int alt74=2;
                        int LA74_0 = input.LA(1);

                        if ( (LA74_0==14) ) {
                            alt74=1;
                        }


                        switch (alt74) {
                    	case 1 :
                    	    // InternalMyDsl.g:2775:5: otherlv_14= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_14=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_14, grammarAccess.getEComponent_ImplAccess().getCommaKeyword_6_2_0());
                    	    				
                    	    // InternalMyDsl.g:2779:5: ( ( ruleEString ) )
                    	    // InternalMyDsl.g:2780:6: ( ruleEString )
                    	    {
                    	    // InternalMyDsl.g:2780:6: ( ruleEString )
                    	    // InternalMyDsl.g:2781:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getEComponent_ImplRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getEComponent_ImplAccess().getProvidesDirectlyEServiceCrossReference_6_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_67);
                    	    ruleEString();

                    	    state._fsp--;


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

            // InternalMyDsl.g:2797:3: (otherlv_16= 'provides:' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==13) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // InternalMyDsl.g:2798:4: otherlv_16= 'provides:' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )*
                    {
                    otherlv_16=(Token)match(input,13,FOLLOW_3); 

                    				newLeafNode(otherlv_16, grammarAccess.getEComponent_ImplAccess().getProvidesKeyword_7_0());
                    			
                    // InternalMyDsl.g:2802:4: ( ( ruleEString ) )
                    // InternalMyDsl.g:2803:5: ( ruleEString )
                    {
                    // InternalMyDsl.g:2803:5: ( ruleEString )
                    // InternalMyDsl.g:2804:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEComponent_ImplRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getEComponent_ImplAccess().getProvidesEInterfaceCrossReference_7_1_0());
                    					
                    pushFollow(FOLLOW_68);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:2818:4: (otherlv_18= ',' ( ( ruleEString ) ) )*
                    loop76:
                    do {
                        int alt76=2;
                        int LA76_0 = input.LA(1);

                        if ( (LA76_0==14) ) {
                            alt76=1;
                        }


                        switch (alt76) {
                    	case 1 :
                    	    // InternalMyDsl.g:2819:5: otherlv_18= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_18=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_18, grammarAccess.getEComponent_ImplAccess().getCommaKeyword_7_2_0());
                    	    				
                    	    // InternalMyDsl.g:2823:5: ( ( ruleEString ) )
                    	    // InternalMyDsl.g:2824:6: ( ruleEString )
                    	    {
                    	    // InternalMyDsl.g:2824:6: ( ruleEString )
                    	    // InternalMyDsl.g:2825:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getEComponent_ImplRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getEComponent_ImplAccess().getProvidesEInterfaceCrossReference_7_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_68);
                    	    ruleEString();

                    	    state._fsp--;


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

            // InternalMyDsl.g:2841:3: (otherlv_20= 'requires:' ( ( ruleEString ) ) (otherlv_22= ',' ( ( ruleEString ) ) )* )?
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==15) ) {
                alt79=1;
            }
            switch (alt79) {
                case 1 :
                    // InternalMyDsl.g:2842:4: otherlv_20= 'requires:' ( ( ruleEString ) ) (otherlv_22= ',' ( ( ruleEString ) ) )*
                    {
                    otherlv_20=(Token)match(input,15,FOLLOW_3); 

                    				newLeafNode(otherlv_20, grammarAccess.getEComponent_ImplAccess().getRequiresKeyword_8_0());
                    			
                    // InternalMyDsl.g:2846:4: ( ( ruleEString ) )
                    // InternalMyDsl.g:2847:5: ( ruleEString )
                    {
                    // InternalMyDsl.g:2847:5: ( ruleEString )
                    // InternalMyDsl.g:2848:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEComponent_ImplRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getEComponent_ImplAccess().getRequiresEInterfaceCrossReference_8_1_0());
                    					
                    pushFollow(FOLLOW_30);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:2862:4: (otherlv_22= ',' ( ( ruleEString ) ) )*
                    loop78:
                    do {
                        int alt78=2;
                        int LA78_0 = input.LA(1);

                        if ( (LA78_0==14) ) {
                            alt78=1;
                        }


                        switch (alt78) {
                    	case 1 :
                    	    // InternalMyDsl.g:2863:5: otherlv_22= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_22=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_22, grammarAccess.getEComponent_ImplAccess().getCommaKeyword_8_2_0());
                    	    				
                    	    // InternalMyDsl.g:2867:5: ( ( ruleEString ) )
                    	    // InternalMyDsl.g:2868:6: ( ruleEString )
                    	    {
                    	    // InternalMyDsl.g:2868:6: ( ruleEString )
                    	    // InternalMyDsl.g:2869:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getEComponent_ImplRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getEComponent_ImplAccess().getRequiresEInterfaceCrossReference_8_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_30);
                    	    ruleEString();

                    	    state._fsp--;


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

            // InternalMyDsl.g:2885:3: (otherlv_24= 'behaviourDescription:' ( (lv_behaviourDescription_25_0= ruleEBehaviourDescription ) ) )?
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==33) ) {
                alt80=1;
            }
            switch (alt80) {
                case 1 :
                    // InternalMyDsl.g:2886:4: otherlv_24= 'behaviourDescription:' ( (lv_behaviourDescription_25_0= ruleEBehaviourDescription ) )
                    {
                    otherlv_24=(Token)match(input,33,FOLLOW_31); 

                    				newLeafNode(otherlv_24, grammarAccess.getEComponent_ImplAccess().getBehaviourDescriptionKeyword_9_0());
                    			
                    // InternalMyDsl.g:2890:4: ( (lv_behaviourDescription_25_0= ruleEBehaviourDescription ) )
                    // InternalMyDsl.g:2891:5: (lv_behaviourDescription_25_0= ruleEBehaviourDescription )
                    {
                    // InternalMyDsl.g:2891:5: (lv_behaviourDescription_25_0= ruleEBehaviourDescription )
                    // InternalMyDsl.g:2892:6: lv_behaviourDescription_25_0= ruleEBehaviourDescription
                    {

                    						newCompositeNode(grammarAccess.getEComponent_ImplAccess().getBehaviourDescriptionEBehaviourDescriptionParserRuleCall_9_1_0());
                    					
                    pushFollow(FOLLOW_23);
                    lv_behaviourDescription_25_0=ruleEBehaviourDescription();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEComponent_ImplRule());
                    						}
                    						set(
                    							current,
                    							"behaviourDescription",
                    							lv_behaviourDescription_25_0,
                    							"org.xtext.example.mydsl.MyDsl.EBehaviourDescription");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_26=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_26, grammarAccess.getEComponent_ImplAccess().getRightCurlyBracketKeyword_10());
            		

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


    // $ANTLR start "entryRuleEBehaviourDescription"
    // InternalMyDsl.g:2918:1: entryRuleEBehaviourDescription returns [EObject current=null] : iv_ruleEBehaviourDescription= ruleEBehaviourDescription EOF ;
    public final EObject entryRuleEBehaviourDescription() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEBehaviourDescription = null;


        try {
            // InternalMyDsl.g:2918:62: (iv_ruleEBehaviourDescription= ruleEBehaviourDescription EOF )
            // InternalMyDsl.g:2919:2: iv_ruleEBehaviourDescription= ruleEBehaviourDescription EOF
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
    // InternalMyDsl.g:2925:1: ruleEBehaviourDescription returns [EObject current=null] : ( () otherlv_1= 'EBehaviourDescription' otherlv_2= '{' (otherlv_3= 'internalAction:' ( (lv_internalAction_4_0= ruleEInternalAction ) ) (otherlv_5= ',' ( (lv_internalAction_6_0= ruleEInternalAction ) ) )* )? (otherlv_7= 'loop:' ( (lv_loop_8_0= ruleELoop ) ) (otherlv_9= ',' ( (lv_loop_10_0= ruleELoop ) ) )* )? (otherlv_11= 'branch:' ( (lv_branch_12_0= ruleEBranch ) ) (otherlv_13= ',' ( (lv_branch_14_0= ruleEBranch ) ) )* )? (otherlv_15= 'externalCall:' ( (lv_externalCall_16_0= ruleEExternalCall ) ) (otherlv_17= ',' ( (lv_externalCall_18_0= ruleEExternalCall ) ) )* )? otherlv_19= '}' ) ;
    public final EObject ruleEBehaviourDescription() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
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
        EObject lv_internalAction_4_0 = null;

        EObject lv_internalAction_6_0 = null;

        EObject lv_loop_8_0 = null;

        EObject lv_loop_10_0 = null;

        EObject lv_branch_12_0 = null;

        EObject lv_branch_14_0 = null;

        EObject lv_externalCall_16_0 = null;

        EObject lv_externalCall_18_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2931:2: ( ( () otherlv_1= 'EBehaviourDescription' otherlv_2= '{' (otherlv_3= 'internalAction:' ( (lv_internalAction_4_0= ruleEInternalAction ) ) (otherlv_5= ',' ( (lv_internalAction_6_0= ruleEInternalAction ) ) )* )? (otherlv_7= 'loop:' ( (lv_loop_8_0= ruleELoop ) ) (otherlv_9= ',' ( (lv_loop_10_0= ruleELoop ) ) )* )? (otherlv_11= 'branch:' ( (lv_branch_12_0= ruleEBranch ) ) (otherlv_13= ',' ( (lv_branch_14_0= ruleEBranch ) ) )* )? (otherlv_15= 'externalCall:' ( (lv_externalCall_16_0= ruleEExternalCall ) ) (otherlv_17= ',' ( (lv_externalCall_18_0= ruleEExternalCall ) ) )* )? otherlv_19= '}' ) )
            // InternalMyDsl.g:2932:2: ( () otherlv_1= 'EBehaviourDescription' otherlv_2= '{' (otherlv_3= 'internalAction:' ( (lv_internalAction_4_0= ruleEInternalAction ) ) (otherlv_5= ',' ( (lv_internalAction_6_0= ruleEInternalAction ) ) )* )? (otherlv_7= 'loop:' ( (lv_loop_8_0= ruleELoop ) ) (otherlv_9= ',' ( (lv_loop_10_0= ruleELoop ) ) )* )? (otherlv_11= 'branch:' ( (lv_branch_12_0= ruleEBranch ) ) (otherlv_13= ',' ( (lv_branch_14_0= ruleEBranch ) ) )* )? (otherlv_15= 'externalCall:' ( (lv_externalCall_16_0= ruleEExternalCall ) ) (otherlv_17= ',' ( (lv_externalCall_18_0= ruleEExternalCall ) ) )* )? otherlv_19= '}' )
            {
            // InternalMyDsl.g:2932:2: ( () otherlv_1= 'EBehaviourDescription' otherlv_2= '{' (otherlv_3= 'internalAction:' ( (lv_internalAction_4_0= ruleEInternalAction ) ) (otherlv_5= ',' ( (lv_internalAction_6_0= ruleEInternalAction ) ) )* )? (otherlv_7= 'loop:' ( (lv_loop_8_0= ruleELoop ) ) (otherlv_9= ',' ( (lv_loop_10_0= ruleELoop ) ) )* )? (otherlv_11= 'branch:' ( (lv_branch_12_0= ruleEBranch ) ) (otherlv_13= ',' ( (lv_branch_14_0= ruleEBranch ) ) )* )? (otherlv_15= 'externalCall:' ( (lv_externalCall_16_0= ruleEExternalCall ) ) (otherlv_17= ',' ( (lv_externalCall_18_0= ruleEExternalCall ) ) )* )? otherlv_19= '}' )
            // InternalMyDsl.g:2933:3: () otherlv_1= 'EBehaviourDescription' otherlv_2= '{' (otherlv_3= 'internalAction:' ( (lv_internalAction_4_0= ruleEInternalAction ) ) (otherlv_5= ',' ( (lv_internalAction_6_0= ruleEInternalAction ) ) )* )? (otherlv_7= 'loop:' ( (lv_loop_8_0= ruleELoop ) ) (otherlv_9= ',' ( (lv_loop_10_0= ruleELoop ) ) )* )? (otherlv_11= 'branch:' ( (lv_branch_12_0= ruleEBranch ) ) (otherlv_13= ',' ( (lv_branch_14_0= ruleEBranch ) ) )* )? (otherlv_15= 'externalCall:' ( (lv_externalCall_16_0= ruleEExternalCall ) ) (otherlv_17= ',' ( (lv_externalCall_18_0= ruleEExternalCall ) ) )* )? otherlv_19= '}'
            {
            // InternalMyDsl.g:2933:3: ()
            // InternalMyDsl.g:2934:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEBehaviourDescriptionAccess().getEBehaviourDescriptionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,73,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getEBehaviourDescriptionAccess().getEBehaviourDescriptionKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_69); 

            			newLeafNode(otherlv_2, grammarAccess.getEBehaviourDescriptionAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:2948:3: (otherlv_3= 'internalAction:' ( (lv_internalAction_4_0= ruleEInternalAction ) ) (otherlv_5= ',' ( (lv_internalAction_6_0= ruleEInternalAction ) ) )* )?
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==74) ) {
                alt82=1;
            }
            switch (alt82) {
                case 1 :
                    // InternalMyDsl.g:2949:4: otherlv_3= 'internalAction:' ( (lv_internalAction_4_0= ruleEInternalAction ) ) (otherlv_5= ',' ( (lv_internalAction_6_0= ruleEInternalAction ) ) )*
                    {
                    otherlv_3=(Token)match(input,74,FOLLOW_70); 

                    				newLeafNode(otherlv_3, grammarAccess.getEBehaviourDescriptionAccess().getInternalActionKeyword_3_0());
                    			
                    // InternalMyDsl.g:2953:4: ( (lv_internalAction_4_0= ruleEInternalAction ) )
                    // InternalMyDsl.g:2954:5: (lv_internalAction_4_0= ruleEInternalAction )
                    {
                    // InternalMyDsl.g:2954:5: (lv_internalAction_4_0= ruleEInternalAction )
                    // InternalMyDsl.g:2955:6: lv_internalAction_4_0= ruleEInternalAction
                    {

                    						newCompositeNode(grammarAccess.getEBehaviourDescriptionAccess().getInternalActionEInternalActionParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_71);
                    lv_internalAction_4_0=ruleEInternalAction();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEBehaviourDescriptionRule());
                    						}
                    						add(
                    							current,
                    							"internalAction",
                    							lv_internalAction_4_0,
                    							"org.xtext.example.mydsl.MyDsl.EInternalAction");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:2972:4: (otherlv_5= ',' ( (lv_internalAction_6_0= ruleEInternalAction ) ) )*
                    loop81:
                    do {
                        int alt81=2;
                        int LA81_0 = input.LA(1);

                        if ( (LA81_0==14) ) {
                            alt81=1;
                        }


                        switch (alt81) {
                    	case 1 :
                    	    // InternalMyDsl.g:2973:5: otherlv_5= ',' ( (lv_internalAction_6_0= ruleEInternalAction ) )
                    	    {
                    	    otherlv_5=(Token)match(input,14,FOLLOW_70); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getEBehaviourDescriptionAccess().getCommaKeyword_3_2_0());
                    	    				
                    	    // InternalMyDsl.g:2977:5: ( (lv_internalAction_6_0= ruleEInternalAction ) )
                    	    // InternalMyDsl.g:2978:6: (lv_internalAction_6_0= ruleEInternalAction )
                    	    {
                    	    // InternalMyDsl.g:2978:6: (lv_internalAction_6_0= ruleEInternalAction )
                    	    // InternalMyDsl.g:2979:7: lv_internalAction_6_0= ruleEInternalAction
                    	    {

                    	    							newCompositeNode(grammarAccess.getEBehaviourDescriptionAccess().getInternalActionEInternalActionParserRuleCall_3_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_71);
                    	    lv_internalAction_6_0=ruleEInternalAction();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getEBehaviourDescriptionRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"internalAction",
                    	    								lv_internalAction_6_0,
                    	    								"org.xtext.example.mydsl.MyDsl.EInternalAction");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop81;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalMyDsl.g:2998:3: (otherlv_7= 'loop:' ( (lv_loop_8_0= ruleELoop ) ) (otherlv_9= ',' ( (lv_loop_10_0= ruleELoop ) ) )* )?
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==75) ) {
                alt84=1;
            }
            switch (alt84) {
                case 1 :
                    // InternalMyDsl.g:2999:4: otherlv_7= 'loop:' ( (lv_loop_8_0= ruleELoop ) ) (otherlv_9= ',' ( (lv_loop_10_0= ruleELoop ) ) )*
                    {
                    otherlv_7=(Token)match(input,75,FOLLOW_72); 

                    				newLeafNode(otherlv_7, grammarAccess.getEBehaviourDescriptionAccess().getLoopKeyword_4_0());
                    			
                    // InternalMyDsl.g:3003:4: ( (lv_loop_8_0= ruleELoop ) )
                    // InternalMyDsl.g:3004:5: (lv_loop_8_0= ruleELoop )
                    {
                    // InternalMyDsl.g:3004:5: (lv_loop_8_0= ruleELoop )
                    // InternalMyDsl.g:3005:6: lv_loop_8_0= ruleELoop
                    {

                    						newCompositeNode(grammarAccess.getEBehaviourDescriptionAccess().getLoopELoopParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_73);
                    lv_loop_8_0=ruleELoop();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEBehaviourDescriptionRule());
                    						}
                    						add(
                    							current,
                    							"loop",
                    							lv_loop_8_0,
                    							"org.xtext.example.mydsl.MyDsl.ELoop");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:3022:4: (otherlv_9= ',' ( (lv_loop_10_0= ruleELoop ) ) )*
                    loop83:
                    do {
                        int alt83=2;
                        int LA83_0 = input.LA(1);

                        if ( (LA83_0==14) ) {
                            alt83=1;
                        }


                        switch (alt83) {
                    	case 1 :
                    	    // InternalMyDsl.g:3023:5: otherlv_9= ',' ( (lv_loop_10_0= ruleELoop ) )
                    	    {
                    	    otherlv_9=(Token)match(input,14,FOLLOW_72); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getEBehaviourDescriptionAccess().getCommaKeyword_4_2_0());
                    	    				
                    	    // InternalMyDsl.g:3027:5: ( (lv_loop_10_0= ruleELoop ) )
                    	    // InternalMyDsl.g:3028:6: (lv_loop_10_0= ruleELoop )
                    	    {
                    	    // InternalMyDsl.g:3028:6: (lv_loop_10_0= ruleELoop )
                    	    // InternalMyDsl.g:3029:7: lv_loop_10_0= ruleELoop
                    	    {

                    	    							newCompositeNode(grammarAccess.getEBehaviourDescriptionAccess().getLoopELoopParserRuleCall_4_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_73);
                    	    lv_loop_10_0=ruleELoop();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getEBehaviourDescriptionRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"loop",
                    	    								lv_loop_10_0,
                    	    								"org.xtext.example.mydsl.MyDsl.ELoop");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop83;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalMyDsl.g:3048:3: (otherlv_11= 'branch:' ( (lv_branch_12_0= ruleEBranch ) ) (otherlv_13= ',' ( (lv_branch_14_0= ruleEBranch ) ) )* )?
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==76) ) {
                alt86=1;
            }
            switch (alt86) {
                case 1 :
                    // InternalMyDsl.g:3049:4: otherlv_11= 'branch:' ( (lv_branch_12_0= ruleEBranch ) ) (otherlv_13= ',' ( (lv_branch_14_0= ruleEBranch ) ) )*
                    {
                    otherlv_11=(Token)match(input,76,FOLLOW_74); 

                    				newLeafNode(otherlv_11, grammarAccess.getEBehaviourDescriptionAccess().getBranchKeyword_5_0());
                    			
                    // InternalMyDsl.g:3053:4: ( (lv_branch_12_0= ruleEBranch ) )
                    // InternalMyDsl.g:3054:5: (lv_branch_12_0= ruleEBranch )
                    {
                    // InternalMyDsl.g:3054:5: (lv_branch_12_0= ruleEBranch )
                    // InternalMyDsl.g:3055:6: lv_branch_12_0= ruleEBranch
                    {

                    						newCompositeNode(grammarAccess.getEBehaviourDescriptionAccess().getBranchEBranchParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_75);
                    lv_branch_12_0=ruleEBranch();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEBehaviourDescriptionRule());
                    						}
                    						add(
                    							current,
                    							"branch",
                    							lv_branch_12_0,
                    							"org.xtext.example.mydsl.MyDsl.EBranch");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:3072:4: (otherlv_13= ',' ( (lv_branch_14_0= ruleEBranch ) ) )*
                    loop85:
                    do {
                        int alt85=2;
                        int LA85_0 = input.LA(1);

                        if ( (LA85_0==14) ) {
                            alt85=1;
                        }


                        switch (alt85) {
                    	case 1 :
                    	    // InternalMyDsl.g:3073:5: otherlv_13= ',' ( (lv_branch_14_0= ruleEBranch ) )
                    	    {
                    	    otherlv_13=(Token)match(input,14,FOLLOW_74); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getEBehaviourDescriptionAccess().getCommaKeyword_5_2_0());
                    	    				
                    	    // InternalMyDsl.g:3077:5: ( (lv_branch_14_0= ruleEBranch ) )
                    	    // InternalMyDsl.g:3078:6: (lv_branch_14_0= ruleEBranch )
                    	    {
                    	    // InternalMyDsl.g:3078:6: (lv_branch_14_0= ruleEBranch )
                    	    // InternalMyDsl.g:3079:7: lv_branch_14_0= ruleEBranch
                    	    {

                    	    							newCompositeNode(grammarAccess.getEBehaviourDescriptionAccess().getBranchEBranchParserRuleCall_5_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_75);
                    	    lv_branch_14_0=ruleEBranch();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getEBehaviourDescriptionRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"branch",
                    	    								lv_branch_14_0,
                    	    								"org.xtext.example.mydsl.MyDsl.EBranch");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop85;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalMyDsl.g:3098:3: (otherlv_15= 'externalCall:' ( (lv_externalCall_16_0= ruleEExternalCall ) ) (otherlv_17= ',' ( (lv_externalCall_18_0= ruleEExternalCall ) ) )* )?
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==77) ) {
                alt88=1;
            }
            switch (alt88) {
                case 1 :
                    // InternalMyDsl.g:3099:4: otherlv_15= 'externalCall:' ( (lv_externalCall_16_0= ruleEExternalCall ) ) (otherlv_17= ',' ( (lv_externalCall_18_0= ruleEExternalCall ) ) )*
                    {
                    otherlv_15=(Token)match(input,77,FOLLOW_76); 

                    				newLeafNode(otherlv_15, grammarAccess.getEBehaviourDescriptionAccess().getExternalCallKeyword_6_0());
                    			
                    // InternalMyDsl.g:3103:4: ( (lv_externalCall_16_0= ruleEExternalCall ) )
                    // InternalMyDsl.g:3104:5: (lv_externalCall_16_0= ruleEExternalCall )
                    {
                    // InternalMyDsl.g:3104:5: (lv_externalCall_16_0= ruleEExternalCall )
                    // InternalMyDsl.g:3105:6: lv_externalCall_16_0= ruleEExternalCall
                    {

                    						newCompositeNode(grammarAccess.getEBehaviourDescriptionAccess().getExternalCallEExternalCallParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_externalCall_16_0=ruleEExternalCall();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEBehaviourDescriptionRule());
                    						}
                    						add(
                    							current,
                    							"externalCall",
                    							lv_externalCall_16_0,
                    							"org.xtext.example.mydsl.MyDsl.EExternalCall");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:3122:4: (otherlv_17= ',' ( (lv_externalCall_18_0= ruleEExternalCall ) ) )*
                    loop87:
                    do {
                        int alt87=2;
                        int LA87_0 = input.LA(1);

                        if ( (LA87_0==14) ) {
                            alt87=1;
                        }


                        switch (alt87) {
                    	case 1 :
                    	    // InternalMyDsl.g:3123:5: otherlv_17= ',' ( (lv_externalCall_18_0= ruleEExternalCall ) )
                    	    {
                    	    otherlv_17=(Token)match(input,14,FOLLOW_76); 

                    	    					newLeafNode(otherlv_17, grammarAccess.getEBehaviourDescriptionAccess().getCommaKeyword_6_2_0());
                    	    				
                    	    // InternalMyDsl.g:3127:5: ( (lv_externalCall_18_0= ruleEExternalCall ) )
                    	    // InternalMyDsl.g:3128:6: (lv_externalCall_18_0= ruleEExternalCall )
                    	    {
                    	    // InternalMyDsl.g:3128:6: (lv_externalCall_18_0= ruleEExternalCall )
                    	    // InternalMyDsl.g:3129:7: lv_externalCall_18_0= ruleEExternalCall
                    	    {

                    	    							newCompositeNode(grammarAccess.getEBehaviourDescriptionAccess().getExternalCallEExternalCallParserRuleCall_6_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_13);
                    	    lv_externalCall_18_0=ruleEExternalCall();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getEBehaviourDescriptionRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"externalCall",
                    	    								lv_externalCall_18_0,
                    	    								"org.xtext.example.mydsl.MyDsl.EExternalCall");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop87;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_19=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_19, grammarAccess.getEBehaviourDescriptionAccess().getRightCurlyBracketKeyword_7());
            		

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
    // InternalMyDsl.g:3156:1: entryRuleEInternalAction returns [EObject current=null] : iv_ruleEInternalAction= ruleEInternalAction EOF ;
    public final EObject entryRuleEInternalAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEInternalAction = null;


        try {
            // InternalMyDsl.g:3156:56: (iv_ruleEInternalAction= ruleEInternalAction EOF )
            // InternalMyDsl.g:3157:2: iv_ruleEInternalAction= ruleEInternalAction EOF
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
    // InternalMyDsl.g:3163:1: ruleEInternalAction returns [EObject current=null] : ( () otherlv_1= 'EInternalAction' ) ;
    public final EObject ruleEInternalAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:3169:2: ( ( () otherlv_1= 'EInternalAction' ) )
            // InternalMyDsl.g:3170:2: ( () otherlv_1= 'EInternalAction' )
            {
            // InternalMyDsl.g:3170:2: ( () otherlv_1= 'EInternalAction' )
            // InternalMyDsl.g:3171:3: () otherlv_1= 'EInternalAction'
            {
            // InternalMyDsl.g:3171:3: ()
            // InternalMyDsl.g:3172:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEInternalActionAccess().getEInternalActionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,78,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getEInternalActionAccess().getEInternalActionKeyword_1());
            		

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
    // $ANTLR end "ruleEInternalAction"


    // $ANTLR start "entryRuleELoop"
    // InternalMyDsl.g:3186:1: entryRuleELoop returns [EObject current=null] : iv_ruleELoop= ruleELoop EOF ;
    public final EObject entryRuleELoop() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleELoop = null;


        try {
            // InternalMyDsl.g:3186:46: (iv_ruleELoop= ruleELoop EOF )
            // InternalMyDsl.g:3187:2: iv_ruleELoop= ruleELoop EOF
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
    // InternalMyDsl.g:3193:1: ruleELoop returns [EObject current=null] : ( () otherlv_1= 'ELoop' ) ;
    public final EObject ruleELoop() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:3199:2: ( ( () otherlv_1= 'ELoop' ) )
            // InternalMyDsl.g:3200:2: ( () otherlv_1= 'ELoop' )
            {
            // InternalMyDsl.g:3200:2: ( () otherlv_1= 'ELoop' )
            // InternalMyDsl.g:3201:3: () otherlv_1= 'ELoop'
            {
            // InternalMyDsl.g:3201:3: ()
            // InternalMyDsl.g:3202:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getELoopAccess().getELoopAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,79,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getELoopAccess().getELoopKeyword_1());
            		

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
    // $ANTLR end "ruleELoop"


    // $ANTLR start "entryRuleEBranch"
    // InternalMyDsl.g:3216:1: entryRuleEBranch returns [EObject current=null] : iv_ruleEBranch= ruleEBranch EOF ;
    public final EObject entryRuleEBranch() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEBranch = null;


        try {
            // InternalMyDsl.g:3216:48: (iv_ruleEBranch= ruleEBranch EOF )
            // InternalMyDsl.g:3217:2: iv_ruleEBranch= ruleEBranch EOF
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
    // InternalMyDsl.g:3223:1: ruleEBranch returns [EObject current=null] : ( () otherlv_1= 'EBranch' ) ;
    public final EObject ruleEBranch() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:3229:2: ( ( () otherlv_1= 'EBranch' ) )
            // InternalMyDsl.g:3230:2: ( () otherlv_1= 'EBranch' )
            {
            // InternalMyDsl.g:3230:2: ( () otherlv_1= 'EBranch' )
            // InternalMyDsl.g:3231:3: () otherlv_1= 'EBranch'
            {
            // InternalMyDsl.g:3231:3: ()
            // InternalMyDsl.g:3232:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEBranchAccess().getEBranchAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,80,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getEBranchAccess().getEBranchKeyword_1());
            		

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
    // $ANTLR end "ruleEBranch"


    // $ANTLR start "entryRuleEExternalCall"
    // InternalMyDsl.g:3246:1: entryRuleEExternalCall returns [EObject current=null] : iv_ruleEExternalCall= ruleEExternalCall EOF ;
    public final EObject entryRuleEExternalCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEExternalCall = null;


        try {
            // InternalMyDsl.g:3246:54: (iv_ruleEExternalCall= ruleEExternalCall EOF )
            // InternalMyDsl.g:3247:2: iv_ruleEExternalCall= ruleEExternalCall EOF
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
    // InternalMyDsl.g:3253:1: ruleEExternalCall returns [EObject current=null] : ( () otherlv_1= 'EExternalCall' otherlv_2= '{' (otherlv_3= 'to:' ( ( ruleEString ) ) ) otherlv_5= '}' ) ;
    public final EObject ruleEExternalCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalMyDsl.g:3259:2: ( ( () otherlv_1= 'EExternalCall' otherlv_2= '{' (otherlv_3= 'to:' ( ( ruleEString ) ) ) otherlv_5= '}' ) )
            // InternalMyDsl.g:3260:2: ( () otherlv_1= 'EExternalCall' otherlv_2= '{' (otherlv_3= 'to:' ( ( ruleEString ) ) ) otherlv_5= '}' )
            {
            // InternalMyDsl.g:3260:2: ( () otherlv_1= 'EExternalCall' otherlv_2= '{' (otherlv_3= 'to:' ( ( ruleEString ) ) ) otherlv_5= '}' )
            // InternalMyDsl.g:3261:3: () otherlv_1= 'EExternalCall' otherlv_2= '{' (otherlv_3= 'to:' ( ( ruleEString ) ) ) otherlv_5= '}'
            {
            // InternalMyDsl.g:3261:3: ()
            // InternalMyDsl.g:3262:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEExternalCallAccess().getEExternalCallAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,81,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getEExternalCallAccess().getEExternalCallKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_77); 

            			newLeafNode(otherlv_2, grammarAccess.getEExternalCallAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:3276:3: (otherlv_3= 'to:' ( ( ruleEString ) ) )
            // InternalMyDsl.g:3277:4: otherlv_3= 'to:' ( ( ruleEString ) )
            {
            otherlv_3=(Token)match(input,82,FOLLOW_3); 

            				newLeafNode(otherlv_3, grammarAccess.getEExternalCallAccess().getToKeyword_3_0());
            			
            // InternalMyDsl.g:3281:4: ( ( ruleEString ) )
            // InternalMyDsl.g:3282:5: ( ruleEString )
            {
            // InternalMyDsl.g:3282:5: ( ruleEString )
            // InternalMyDsl.g:3283:6: ruleEString
            {

            						if (current==null) {
            							current = createModelElement(grammarAccess.getEExternalCallRule());
            						}
            					

            						newCompositeNode(grammarAccess.getEExternalCallAccess().getToEServiceCrossReference_3_1_0());
            					
            pushFollow(FOLLOW_23);
            ruleEString();

            state._fsp--;


            						afterParserOrEnumRuleCall();
            					

            }


            }


            }

            otherlv_5=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getEExternalCallAccess().getRightCurlyBracketKeyword_4());
            		

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
    // InternalMyDsl.g:3306:1: entryRuleESignature returns [EObject current=null] : iv_ruleESignature= ruleESignature EOF ;
    public final EObject entryRuleESignature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleESignature = null;


        try {
            // InternalMyDsl.g:3306:51: (iv_ruleESignature= ruleESignature EOF )
            // InternalMyDsl.g:3307:2: iv_ruleESignature= ruleESignature EOF
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
    // InternalMyDsl.g:3313:1: ruleESignature returns [EObject current=null] : ( () otherlv_1= 'ESignature' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'returnType:' ( (lv_returnType_5_0= rulePossibleReturnTypes ) ) ) (otherlv_6= 'correspondsTo:' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* )? (otherlv_10= 'parameter:' ( (lv_parameter_11_0= ruleEParameter ) ) (otherlv_12= ',' ( (lv_parameter_13_0= ruleEParameter ) ) )* )? otherlv_14= '}' ) ;
    public final EObject ruleESignature() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        Enumerator lv_returnType_5_0 = null;

        EObject lv_parameter_11_0 = null;

        EObject lv_parameter_13_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:3319:2: ( ( () otherlv_1= 'ESignature' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'returnType:' ( (lv_returnType_5_0= rulePossibleReturnTypes ) ) ) (otherlv_6= 'correspondsTo:' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* )? (otherlv_10= 'parameter:' ( (lv_parameter_11_0= ruleEParameter ) ) (otherlv_12= ',' ( (lv_parameter_13_0= ruleEParameter ) ) )* )? otherlv_14= '}' ) )
            // InternalMyDsl.g:3320:2: ( () otherlv_1= 'ESignature' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'returnType:' ( (lv_returnType_5_0= rulePossibleReturnTypes ) ) ) (otherlv_6= 'correspondsTo:' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* )? (otherlv_10= 'parameter:' ( (lv_parameter_11_0= ruleEParameter ) ) (otherlv_12= ',' ( (lv_parameter_13_0= ruleEParameter ) ) )* )? otherlv_14= '}' )
            {
            // InternalMyDsl.g:3320:2: ( () otherlv_1= 'ESignature' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'returnType:' ( (lv_returnType_5_0= rulePossibleReturnTypes ) ) ) (otherlv_6= 'correspondsTo:' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* )? (otherlv_10= 'parameter:' ( (lv_parameter_11_0= ruleEParameter ) ) (otherlv_12= ',' ( (lv_parameter_13_0= ruleEParameter ) ) )* )? otherlv_14= '}' )
            // InternalMyDsl.g:3321:3: () otherlv_1= 'ESignature' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'returnType:' ( (lv_returnType_5_0= rulePossibleReturnTypes ) ) ) (otherlv_6= 'correspondsTo:' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* )? (otherlv_10= 'parameter:' ( (lv_parameter_11_0= ruleEParameter ) ) (otherlv_12= ',' ( (lv_parameter_13_0= ruleEParameter ) ) )* )? otherlv_14= '}'
            {
            // InternalMyDsl.g:3321:3: ()
            // InternalMyDsl.g:3322:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getESignatureAccess().getESignatureAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,83,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getESignatureAccess().getESignatureKeyword_1());
            		
            // InternalMyDsl.g:3332:3: ( (lv_name_2_0= ruleEString ) )
            // InternalMyDsl.g:3333:4: (lv_name_2_0= ruleEString )
            {
            // InternalMyDsl.g:3333:4: (lv_name_2_0= ruleEString )
            // InternalMyDsl.g:3334:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getESignatureAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getESignatureRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_78); 

            			newLeafNode(otherlv_3, grammarAccess.getESignatureAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalMyDsl.g:3355:3: (otherlv_4= 'returnType:' ( (lv_returnType_5_0= rulePossibleReturnTypes ) ) )
            // InternalMyDsl.g:3356:4: otherlv_4= 'returnType:' ( (lv_returnType_5_0= rulePossibleReturnTypes ) )
            {
            otherlv_4=(Token)match(input,84,FOLLOW_79); 

            				newLeafNode(otherlv_4, grammarAccess.getESignatureAccess().getReturnTypeKeyword_4_0());
            			
            // InternalMyDsl.g:3360:4: ( (lv_returnType_5_0= rulePossibleReturnTypes ) )
            // InternalMyDsl.g:3361:5: (lv_returnType_5_0= rulePossibleReturnTypes )
            {
            // InternalMyDsl.g:3361:5: (lv_returnType_5_0= rulePossibleReturnTypes )
            // InternalMyDsl.g:3362:6: lv_returnType_5_0= rulePossibleReturnTypes
            {

            						newCompositeNode(grammarAccess.getESignatureAccess().getReturnTypePossibleReturnTypesEnumRuleCall_4_1_0());
            					
            pushFollow(FOLLOW_80);
            lv_returnType_5_0=rulePossibleReturnTypes();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getESignatureRule());
            						}
            						set(
            							current,
            							"returnType",
            							lv_returnType_5_0,
            							"org.xtext.example.mydsl.MyDsl.PossibleReturnTypes");
            						afterParserOrEnumRuleCall();
            					

            }


            }


            }

            // InternalMyDsl.g:3380:3: (otherlv_6= 'correspondsTo:' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* )?
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( (LA90_0==85) ) {
                alt90=1;
            }
            switch (alt90) {
                case 1 :
                    // InternalMyDsl.g:3381:4: otherlv_6= 'correspondsTo:' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )*
                    {
                    otherlv_6=(Token)match(input,85,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getESignatureAccess().getCorrespondsToKeyword_5_0());
                    			
                    // InternalMyDsl.g:3385:4: ( ( ruleEString ) )
                    // InternalMyDsl.g:3386:5: ( ruleEString )
                    {
                    // InternalMyDsl.g:3386:5: ( ruleEString )
                    // InternalMyDsl.g:3387:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getESignatureRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getESignatureAccess().getCorrespondsToEServiceCrossReference_5_1_0());
                    					
                    pushFollow(FOLLOW_81);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:3401:4: (otherlv_8= ',' ( ( ruleEString ) ) )*
                    loop89:
                    do {
                        int alt89=2;
                        int LA89_0 = input.LA(1);

                        if ( (LA89_0==14) ) {
                            alt89=1;
                        }


                        switch (alt89) {
                    	case 1 :
                    	    // InternalMyDsl.g:3402:5: otherlv_8= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_8=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getESignatureAccess().getCommaKeyword_5_2_0());
                    	    				
                    	    // InternalMyDsl.g:3406:5: ( ( ruleEString ) )
                    	    // InternalMyDsl.g:3407:6: ( ruleEString )
                    	    {
                    	    // InternalMyDsl.g:3407:6: ( ruleEString )
                    	    // InternalMyDsl.g:3408:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getESignatureRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getESignatureAccess().getCorrespondsToEServiceCrossReference_5_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_81);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop89;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalMyDsl.g:3424:3: (otherlv_10= 'parameter:' ( (lv_parameter_11_0= ruleEParameter ) ) (otherlv_12= ',' ( (lv_parameter_13_0= ruleEParameter ) ) )* )?
            int alt92=2;
            int LA92_0 = input.LA(1);

            if ( (LA92_0==86) ) {
                alt92=1;
            }
            switch (alt92) {
                case 1 :
                    // InternalMyDsl.g:3425:4: otherlv_10= 'parameter:' ( (lv_parameter_11_0= ruleEParameter ) ) (otherlv_12= ',' ( (lv_parameter_13_0= ruleEParameter ) ) )*
                    {
                    otherlv_10=(Token)match(input,86,FOLLOW_82); 

                    				newLeafNode(otherlv_10, grammarAccess.getESignatureAccess().getParameterKeyword_6_0());
                    			
                    // InternalMyDsl.g:3429:4: ( (lv_parameter_11_0= ruleEParameter ) )
                    // InternalMyDsl.g:3430:5: (lv_parameter_11_0= ruleEParameter )
                    {
                    // InternalMyDsl.g:3430:5: (lv_parameter_11_0= ruleEParameter )
                    // InternalMyDsl.g:3431:6: lv_parameter_11_0= ruleEParameter
                    {

                    						newCompositeNode(grammarAccess.getESignatureAccess().getParameterEParameterParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_parameter_11_0=ruleEParameter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getESignatureRule());
                    						}
                    						add(
                    							current,
                    							"parameter",
                    							lv_parameter_11_0,
                    							"org.xtext.example.mydsl.MyDsl.EParameter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:3448:4: (otherlv_12= ',' ( (lv_parameter_13_0= ruleEParameter ) ) )*
                    loop91:
                    do {
                        int alt91=2;
                        int LA91_0 = input.LA(1);

                        if ( (LA91_0==14) ) {
                            alt91=1;
                        }


                        switch (alt91) {
                    	case 1 :
                    	    // InternalMyDsl.g:3449:5: otherlv_12= ',' ( (lv_parameter_13_0= ruleEParameter ) )
                    	    {
                    	    otherlv_12=(Token)match(input,14,FOLLOW_82); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getESignatureAccess().getCommaKeyword_6_2_0());
                    	    				
                    	    // InternalMyDsl.g:3453:5: ( (lv_parameter_13_0= ruleEParameter ) )
                    	    // InternalMyDsl.g:3454:6: (lv_parameter_13_0= ruleEParameter )
                    	    {
                    	    // InternalMyDsl.g:3454:6: (lv_parameter_13_0= ruleEParameter )
                    	    // InternalMyDsl.g:3455:7: lv_parameter_13_0= ruleEParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getESignatureAccess().getParameterEParameterParserRuleCall_6_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_13);
                    	    lv_parameter_13_0=ruleEParameter();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getESignatureRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"parameter",
                    	    								lv_parameter_13_0,
                    	    								"org.xtext.example.mydsl.MyDsl.EParameter");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop91;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_14=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_14, grammarAccess.getESignatureAccess().getRightCurlyBracketKeyword_7());
            		

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


    // $ANTLR start "entryRuleERepository"
    // InternalMyDsl.g:3482:1: entryRuleERepository returns [EObject current=null] : iv_ruleERepository= ruleERepository EOF ;
    public final EObject entryRuleERepository() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleERepository = null;


        try {
            // InternalMyDsl.g:3482:52: (iv_ruleERepository= ruleERepository EOF )
            // InternalMyDsl.g:3483:2: iv_ruleERepository= ruleERepository EOF
            {
             newCompositeNode(grammarAccess.getERepositoryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleERepository=ruleERepository();

            state._fsp--;

             current =iv_ruleERepository; 
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
    // $ANTLR end "entryRuleERepository"


    // $ANTLR start "ruleERepository"
    // InternalMyDsl.g:3489:1: ruleERepository returns [EObject current=null] : ( () otherlv_1= 'ERepository' otherlv_2= '{' (otherlv_3= 'component:' ( (lv_component_4_0= ruleEComponent ) ) (otherlv_5= ',' ( (lv_component_6_0= ruleEComponent ) ) )* )? (otherlv_7= 'interface:' ( (lv_interface_8_0= ruleEInterface ) ) (otherlv_9= ',' ( (lv_interface_10_0= ruleEInterface ) ) )* )? otherlv_11= '}' ) ;
    public final EObject ruleERepository() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        EObject lv_component_4_0 = null;

        EObject lv_component_6_0 = null;

        EObject lv_interface_8_0 = null;

        EObject lv_interface_10_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:3495:2: ( ( () otherlv_1= 'ERepository' otherlv_2= '{' (otherlv_3= 'component:' ( (lv_component_4_0= ruleEComponent ) ) (otherlv_5= ',' ( (lv_component_6_0= ruleEComponent ) ) )* )? (otherlv_7= 'interface:' ( (lv_interface_8_0= ruleEInterface ) ) (otherlv_9= ',' ( (lv_interface_10_0= ruleEInterface ) ) )* )? otherlv_11= '}' ) )
            // InternalMyDsl.g:3496:2: ( () otherlv_1= 'ERepository' otherlv_2= '{' (otherlv_3= 'component:' ( (lv_component_4_0= ruleEComponent ) ) (otherlv_5= ',' ( (lv_component_6_0= ruleEComponent ) ) )* )? (otherlv_7= 'interface:' ( (lv_interface_8_0= ruleEInterface ) ) (otherlv_9= ',' ( (lv_interface_10_0= ruleEInterface ) ) )* )? otherlv_11= '}' )
            {
            // InternalMyDsl.g:3496:2: ( () otherlv_1= 'ERepository' otherlv_2= '{' (otherlv_3= 'component:' ( (lv_component_4_0= ruleEComponent ) ) (otherlv_5= ',' ( (lv_component_6_0= ruleEComponent ) ) )* )? (otherlv_7= 'interface:' ( (lv_interface_8_0= ruleEInterface ) ) (otherlv_9= ',' ( (lv_interface_10_0= ruleEInterface ) ) )* )? otherlv_11= '}' )
            // InternalMyDsl.g:3497:3: () otherlv_1= 'ERepository' otherlv_2= '{' (otherlv_3= 'component:' ( (lv_component_4_0= ruleEComponent ) ) (otherlv_5= ',' ( (lv_component_6_0= ruleEComponent ) ) )* )? (otherlv_7= 'interface:' ( (lv_interface_8_0= ruleEInterface ) ) (otherlv_9= ',' ( (lv_interface_10_0= ruleEInterface ) ) )* )? otherlv_11= '}'
            {
            // InternalMyDsl.g:3497:3: ()
            // InternalMyDsl.g:3498:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getERepositoryAccess().getERepositoryAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,87,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getERepositoryAccess().getERepositoryKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_83); 

            			newLeafNode(otherlv_2, grammarAccess.getERepositoryAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:3512:3: (otherlv_3= 'component:' ( (lv_component_4_0= ruleEComponent ) ) (otherlv_5= ',' ( (lv_component_6_0= ruleEComponent ) ) )* )?
            int alt94=2;
            int LA94_0 = input.LA(1);

            if ( (LA94_0==88) ) {
                alt94=1;
            }
            switch (alt94) {
                case 1 :
                    // InternalMyDsl.g:3513:4: otherlv_3= 'component:' ( (lv_component_4_0= ruleEComponent ) ) (otherlv_5= ',' ( (lv_component_6_0= ruleEComponent ) ) )*
                    {
                    otherlv_3=(Token)match(input,88,FOLLOW_84); 

                    				newLeafNode(otherlv_3, grammarAccess.getERepositoryAccess().getComponentKeyword_3_0());
                    			
                    // InternalMyDsl.g:3517:4: ( (lv_component_4_0= ruleEComponent ) )
                    // InternalMyDsl.g:3518:5: (lv_component_4_0= ruleEComponent )
                    {
                    // InternalMyDsl.g:3518:5: (lv_component_4_0= ruleEComponent )
                    // InternalMyDsl.g:3519:6: lv_component_4_0= ruleEComponent
                    {

                    						newCompositeNode(grammarAccess.getERepositoryAccess().getComponentEComponentParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_85);
                    lv_component_4_0=ruleEComponent();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getERepositoryRule());
                    						}
                    						add(
                    							current,
                    							"component",
                    							lv_component_4_0,
                    							"org.xtext.example.mydsl.MyDsl.EComponent");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:3536:4: (otherlv_5= ',' ( (lv_component_6_0= ruleEComponent ) ) )*
                    loop93:
                    do {
                        int alt93=2;
                        int LA93_0 = input.LA(1);

                        if ( (LA93_0==14) ) {
                            alt93=1;
                        }


                        switch (alt93) {
                    	case 1 :
                    	    // InternalMyDsl.g:3537:5: otherlv_5= ',' ( (lv_component_6_0= ruleEComponent ) )
                    	    {
                    	    otherlv_5=(Token)match(input,14,FOLLOW_84); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getERepositoryAccess().getCommaKeyword_3_2_0());
                    	    				
                    	    // InternalMyDsl.g:3541:5: ( (lv_component_6_0= ruleEComponent ) )
                    	    // InternalMyDsl.g:3542:6: (lv_component_6_0= ruleEComponent )
                    	    {
                    	    // InternalMyDsl.g:3542:6: (lv_component_6_0= ruleEComponent )
                    	    // InternalMyDsl.g:3543:7: lv_component_6_0= ruleEComponent
                    	    {

                    	    							newCompositeNode(grammarAccess.getERepositoryAccess().getComponentEComponentParserRuleCall_3_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_85);
                    	    lv_component_6_0=ruleEComponent();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getERepositoryRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"component",
                    	    								lv_component_6_0,
                    	    								"org.xtext.example.mydsl.MyDsl.EComponent");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop93;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalMyDsl.g:3562:3: (otherlv_7= 'interface:' ( (lv_interface_8_0= ruleEInterface ) ) (otherlv_9= ',' ( (lv_interface_10_0= ruleEInterface ) ) )* )?
            int alt96=2;
            int LA96_0 = input.LA(1);

            if ( (LA96_0==89) ) {
                alt96=1;
            }
            switch (alt96) {
                case 1 :
                    // InternalMyDsl.g:3563:4: otherlv_7= 'interface:' ( (lv_interface_8_0= ruleEInterface ) ) (otherlv_9= ',' ( (lv_interface_10_0= ruleEInterface ) ) )*
                    {
                    otherlv_7=(Token)match(input,89,FOLLOW_86); 

                    				newLeafNode(otherlv_7, grammarAccess.getERepositoryAccess().getInterfaceKeyword_4_0());
                    			
                    // InternalMyDsl.g:3567:4: ( (lv_interface_8_0= ruleEInterface ) )
                    // InternalMyDsl.g:3568:5: (lv_interface_8_0= ruleEInterface )
                    {
                    // InternalMyDsl.g:3568:5: (lv_interface_8_0= ruleEInterface )
                    // InternalMyDsl.g:3569:6: lv_interface_8_0= ruleEInterface
                    {

                    						newCompositeNode(grammarAccess.getERepositoryAccess().getInterfaceEInterfaceParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_interface_8_0=ruleEInterface();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getERepositoryRule());
                    						}
                    						add(
                    							current,
                    							"interface",
                    							lv_interface_8_0,
                    							"org.xtext.example.mydsl.MyDsl.EInterface");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:3586:4: (otherlv_9= ',' ( (lv_interface_10_0= ruleEInterface ) ) )*
                    loop95:
                    do {
                        int alt95=2;
                        int LA95_0 = input.LA(1);

                        if ( (LA95_0==14) ) {
                            alt95=1;
                        }


                        switch (alt95) {
                    	case 1 :
                    	    // InternalMyDsl.g:3587:5: otherlv_9= ',' ( (lv_interface_10_0= ruleEInterface ) )
                    	    {
                    	    otherlv_9=(Token)match(input,14,FOLLOW_86); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getERepositoryAccess().getCommaKeyword_4_2_0());
                    	    				
                    	    // InternalMyDsl.g:3591:5: ( (lv_interface_10_0= ruleEInterface ) )
                    	    // InternalMyDsl.g:3592:6: (lv_interface_10_0= ruleEInterface )
                    	    {
                    	    // InternalMyDsl.g:3592:6: (lv_interface_10_0= ruleEInterface )
                    	    // InternalMyDsl.g:3593:7: lv_interface_10_0= ruleEInterface
                    	    {

                    	    							newCompositeNode(grammarAccess.getERepositoryAccess().getInterfaceEInterfaceParserRuleCall_4_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_13);
                    	    lv_interface_10_0=ruleEInterface();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getERepositoryRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"interface",
                    	    								lv_interface_10_0,
                    	    								"org.xtext.example.mydsl.MyDsl.EInterface");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop95;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_11=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getERepositoryAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleERepository"


    // $ANTLR start "rulePossibleReturnTypes"
    // InternalMyDsl.g:3620:1: rulePossibleReturnTypes returns [Enumerator current=null] : ( (enumLiteral_0= 'Boolean' ) | (enumLiteral_1= 'Char' ) | (enumLiteral_2= 'Date' ) | (enumLiteral_3= 'Double' ) | (enumLiteral_4= 'Float' ) | (enumLiteral_5= 'List' ) | (enumLiteral_6= 'Integer' ) | (enumLiteral_7= 'Long' ) | (enumLiteral_8= 'Map' ) | (enumLiteral_9= 'String' ) | (enumLiteral_10= 'Void' ) | (enumLiteral_11= 'EObject' ) ) ;
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
            // InternalMyDsl.g:3626:2: ( ( (enumLiteral_0= 'Boolean' ) | (enumLiteral_1= 'Char' ) | (enumLiteral_2= 'Date' ) | (enumLiteral_3= 'Double' ) | (enumLiteral_4= 'Float' ) | (enumLiteral_5= 'List' ) | (enumLiteral_6= 'Integer' ) | (enumLiteral_7= 'Long' ) | (enumLiteral_8= 'Map' ) | (enumLiteral_9= 'String' ) | (enumLiteral_10= 'Void' ) | (enumLiteral_11= 'EObject' ) ) )
            // InternalMyDsl.g:3627:2: ( (enumLiteral_0= 'Boolean' ) | (enumLiteral_1= 'Char' ) | (enumLiteral_2= 'Date' ) | (enumLiteral_3= 'Double' ) | (enumLiteral_4= 'Float' ) | (enumLiteral_5= 'List' ) | (enumLiteral_6= 'Integer' ) | (enumLiteral_7= 'Long' ) | (enumLiteral_8= 'Map' ) | (enumLiteral_9= 'String' ) | (enumLiteral_10= 'Void' ) | (enumLiteral_11= 'EObject' ) )
            {
            // InternalMyDsl.g:3627:2: ( (enumLiteral_0= 'Boolean' ) | (enumLiteral_1= 'Char' ) | (enumLiteral_2= 'Date' ) | (enumLiteral_3= 'Double' ) | (enumLiteral_4= 'Float' ) | (enumLiteral_5= 'List' ) | (enumLiteral_6= 'Integer' ) | (enumLiteral_7= 'Long' ) | (enumLiteral_8= 'Map' ) | (enumLiteral_9= 'String' ) | (enumLiteral_10= 'Void' ) | (enumLiteral_11= 'EObject' ) )
            int alt97=12;
            switch ( input.LA(1) ) {
            case 90:
                {
                alt97=1;
                }
                break;
            case 91:
                {
                alt97=2;
                }
                break;
            case 92:
                {
                alt97=3;
                }
                break;
            case 93:
                {
                alt97=4;
                }
                break;
            case 94:
                {
                alt97=5;
                }
                break;
            case 95:
                {
                alt97=6;
                }
                break;
            case 96:
                {
                alt97=7;
                }
                break;
            case 97:
                {
                alt97=8;
                }
                break;
            case 98:
                {
                alt97=9;
                }
                break;
            case 99:
                {
                alt97=10;
                }
                break;
            case 100:
                {
                alt97=11;
                }
                break;
            case 101:
                {
                alt97=12;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 97, 0, input);

                throw nvae;
            }

            switch (alt97) {
                case 1 :
                    // InternalMyDsl.g:3628:3: (enumLiteral_0= 'Boolean' )
                    {
                    // InternalMyDsl.g:3628:3: (enumLiteral_0= 'Boolean' )
                    // InternalMyDsl.g:3629:4: enumLiteral_0= 'Boolean'
                    {
                    enumLiteral_0=(Token)match(input,90,FOLLOW_2); 

                    				current = grammarAccess.getPossibleReturnTypesAccess().getBOOLEANEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getPossibleReturnTypesAccess().getBOOLEANEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:3636:3: (enumLiteral_1= 'Char' )
                    {
                    // InternalMyDsl.g:3636:3: (enumLiteral_1= 'Char' )
                    // InternalMyDsl.g:3637:4: enumLiteral_1= 'Char'
                    {
                    enumLiteral_1=(Token)match(input,91,FOLLOW_2); 

                    				current = grammarAccess.getPossibleReturnTypesAccess().getCHAREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getPossibleReturnTypesAccess().getCHAREnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:3644:3: (enumLiteral_2= 'Date' )
                    {
                    // InternalMyDsl.g:3644:3: (enumLiteral_2= 'Date' )
                    // InternalMyDsl.g:3645:4: enumLiteral_2= 'Date'
                    {
                    enumLiteral_2=(Token)match(input,92,FOLLOW_2); 

                    				current = grammarAccess.getPossibleReturnTypesAccess().getDATEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getPossibleReturnTypesAccess().getDATEEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:3652:3: (enumLiteral_3= 'Double' )
                    {
                    // InternalMyDsl.g:3652:3: (enumLiteral_3= 'Double' )
                    // InternalMyDsl.g:3653:4: enumLiteral_3= 'Double'
                    {
                    enumLiteral_3=(Token)match(input,93,FOLLOW_2); 

                    				current = grammarAccess.getPossibleReturnTypesAccess().getDOUBLEEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getPossibleReturnTypesAccess().getDOUBLEEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:3660:3: (enumLiteral_4= 'Float' )
                    {
                    // InternalMyDsl.g:3660:3: (enumLiteral_4= 'Float' )
                    // InternalMyDsl.g:3661:4: enumLiteral_4= 'Float'
                    {
                    enumLiteral_4=(Token)match(input,94,FOLLOW_2); 

                    				current = grammarAccess.getPossibleReturnTypesAccess().getFLOATEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getPossibleReturnTypesAccess().getFLOATEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:3668:3: (enumLiteral_5= 'List' )
                    {
                    // InternalMyDsl.g:3668:3: (enumLiteral_5= 'List' )
                    // InternalMyDsl.g:3669:4: enumLiteral_5= 'List'
                    {
                    enumLiteral_5=(Token)match(input,95,FOLLOW_2); 

                    				current = grammarAccess.getPossibleReturnTypesAccess().getLISTEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getPossibleReturnTypesAccess().getLISTEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalMyDsl.g:3676:3: (enumLiteral_6= 'Integer' )
                    {
                    // InternalMyDsl.g:3676:3: (enumLiteral_6= 'Integer' )
                    // InternalMyDsl.g:3677:4: enumLiteral_6= 'Integer'
                    {
                    enumLiteral_6=(Token)match(input,96,FOLLOW_2); 

                    				current = grammarAccess.getPossibleReturnTypesAccess().getINTEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getPossibleReturnTypesAccess().getINTEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalMyDsl.g:3684:3: (enumLiteral_7= 'Long' )
                    {
                    // InternalMyDsl.g:3684:3: (enumLiteral_7= 'Long' )
                    // InternalMyDsl.g:3685:4: enumLiteral_7= 'Long'
                    {
                    enumLiteral_7=(Token)match(input,97,FOLLOW_2); 

                    				current = grammarAccess.getPossibleReturnTypesAccess().getLONGEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getPossibleReturnTypesAccess().getLONGEnumLiteralDeclaration_7());
                    			

                    }


                    }
                    break;
                case 9 :
                    // InternalMyDsl.g:3692:3: (enumLiteral_8= 'Map' )
                    {
                    // InternalMyDsl.g:3692:3: (enumLiteral_8= 'Map' )
                    // InternalMyDsl.g:3693:4: enumLiteral_8= 'Map'
                    {
                    enumLiteral_8=(Token)match(input,98,FOLLOW_2); 

                    				current = grammarAccess.getPossibleReturnTypesAccess().getMAPEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_8, grammarAccess.getPossibleReturnTypesAccess().getMAPEnumLiteralDeclaration_8());
                    			

                    }


                    }
                    break;
                case 10 :
                    // InternalMyDsl.g:3700:3: (enumLiteral_9= 'String' )
                    {
                    // InternalMyDsl.g:3700:3: (enumLiteral_9= 'String' )
                    // InternalMyDsl.g:3701:4: enumLiteral_9= 'String'
                    {
                    enumLiteral_9=(Token)match(input,99,FOLLOW_2); 

                    				current = grammarAccess.getPossibleReturnTypesAccess().getSTRINGEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_9, grammarAccess.getPossibleReturnTypesAccess().getSTRINGEnumLiteralDeclaration_9());
                    			

                    }


                    }
                    break;
                case 11 :
                    // InternalMyDsl.g:3708:3: (enumLiteral_10= 'Void' )
                    {
                    // InternalMyDsl.g:3708:3: (enumLiteral_10= 'Void' )
                    // InternalMyDsl.g:3709:4: enumLiteral_10= 'Void'
                    {
                    enumLiteral_10=(Token)match(input,100,FOLLOW_2); 

                    				current = grammarAccess.getPossibleReturnTypesAccess().getVOIDEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_10, grammarAccess.getPossibleReturnTypesAccess().getVOIDEnumLiteralDeclaration_10());
                    			

                    }


                    }
                    break;
                case 12 :
                    // InternalMyDsl.g:3716:3: (enumLiteral_11= 'EObject' )
                    {
                    // InternalMyDsl.g:3716:3: (enumLiteral_11= 'EObject' )
                    // InternalMyDsl.g:3717:4: enumLiteral_11= 'EObject'
                    {
                    enumLiteral_11=(Token)match(input,101,FOLLOW_2); 

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
    // InternalMyDsl.g:3727:1: rulePossibleParameterTypes returns [Enumerator current=null] : ( (enumLiteral_0= 'Boolean' ) | (enumLiteral_1= 'Char' ) | (enumLiteral_2= 'Date' ) | (enumLiteral_3= 'Double' ) | (enumLiteral_4= 'Float' ) | (enumLiteral_5= 'List' ) | (enumLiteral_6= 'Integer' ) | (enumLiteral_7= 'Long' ) | (enumLiteral_8= 'Map' ) | (enumLiteral_9= 'String' ) | (enumLiteral_10= 'EObject' ) ) ;
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
            // InternalMyDsl.g:3733:2: ( ( (enumLiteral_0= 'Boolean' ) | (enumLiteral_1= 'Char' ) | (enumLiteral_2= 'Date' ) | (enumLiteral_3= 'Double' ) | (enumLiteral_4= 'Float' ) | (enumLiteral_5= 'List' ) | (enumLiteral_6= 'Integer' ) | (enumLiteral_7= 'Long' ) | (enumLiteral_8= 'Map' ) | (enumLiteral_9= 'String' ) | (enumLiteral_10= 'EObject' ) ) )
            // InternalMyDsl.g:3734:2: ( (enumLiteral_0= 'Boolean' ) | (enumLiteral_1= 'Char' ) | (enumLiteral_2= 'Date' ) | (enumLiteral_3= 'Double' ) | (enumLiteral_4= 'Float' ) | (enumLiteral_5= 'List' ) | (enumLiteral_6= 'Integer' ) | (enumLiteral_7= 'Long' ) | (enumLiteral_8= 'Map' ) | (enumLiteral_9= 'String' ) | (enumLiteral_10= 'EObject' ) )
            {
            // InternalMyDsl.g:3734:2: ( (enumLiteral_0= 'Boolean' ) | (enumLiteral_1= 'Char' ) | (enumLiteral_2= 'Date' ) | (enumLiteral_3= 'Double' ) | (enumLiteral_4= 'Float' ) | (enumLiteral_5= 'List' ) | (enumLiteral_6= 'Integer' ) | (enumLiteral_7= 'Long' ) | (enumLiteral_8= 'Map' ) | (enumLiteral_9= 'String' ) | (enumLiteral_10= 'EObject' ) )
            int alt98=11;
            switch ( input.LA(1) ) {
            case 90:
                {
                alt98=1;
                }
                break;
            case 91:
                {
                alt98=2;
                }
                break;
            case 92:
                {
                alt98=3;
                }
                break;
            case 93:
                {
                alt98=4;
                }
                break;
            case 94:
                {
                alt98=5;
                }
                break;
            case 95:
                {
                alt98=6;
                }
                break;
            case 96:
                {
                alt98=7;
                }
                break;
            case 97:
                {
                alt98=8;
                }
                break;
            case 98:
                {
                alt98=9;
                }
                break;
            case 99:
                {
                alt98=10;
                }
                break;
            case 101:
                {
                alt98=11;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 98, 0, input);

                throw nvae;
            }

            switch (alt98) {
                case 1 :
                    // InternalMyDsl.g:3735:3: (enumLiteral_0= 'Boolean' )
                    {
                    // InternalMyDsl.g:3735:3: (enumLiteral_0= 'Boolean' )
                    // InternalMyDsl.g:3736:4: enumLiteral_0= 'Boolean'
                    {
                    enumLiteral_0=(Token)match(input,90,FOLLOW_2); 

                    				current = grammarAccess.getPossibleParameterTypesAccess().getBOOLEANEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getPossibleParameterTypesAccess().getBOOLEANEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:3743:3: (enumLiteral_1= 'Char' )
                    {
                    // InternalMyDsl.g:3743:3: (enumLiteral_1= 'Char' )
                    // InternalMyDsl.g:3744:4: enumLiteral_1= 'Char'
                    {
                    enumLiteral_1=(Token)match(input,91,FOLLOW_2); 

                    				current = grammarAccess.getPossibleParameterTypesAccess().getCHAREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getPossibleParameterTypesAccess().getCHAREnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:3751:3: (enumLiteral_2= 'Date' )
                    {
                    // InternalMyDsl.g:3751:3: (enumLiteral_2= 'Date' )
                    // InternalMyDsl.g:3752:4: enumLiteral_2= 'Date'
                    {
                    enumLiteral_2=(Token)match(input,92,FOLLOW_2); 

                    				current = grammarAccess.getPossibleParameterTypesAccess().getDATEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getPossibleParameterTypesAccess().getDATEEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:3759:3: (enumLiteral_3= 'Double' )
                    {
                    // InternalMyDsl.g:3759:3: (enumLiteral_3= 'Double' )
                    // InternalMyDsl.g:3760:4: enumLiteral_3= 'Double'
                    {
                    enumLiteral_3=(Token)match(input,93,FOLLOW_2); 

                    				current = grammarAccess.getPossibleParameterTypesAccess().getDOUBLEEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getPossibleParameterTypesAccess().getDOUBLEEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:3767:3: (enumLiteral_4= 'Float' )
                    {
                    // InternalMyDsl.g:3767:3: (enumLiteral_4= 'Float' )
                    // InternalMyDsl.g:3768:4: enumLiteral_4= 'Float'
                    {
                    enumLiteral_4=(Token)match(input,94,FOLLOW_2); 

                    				current = grammarAccess.getPossibleParameterTypesAccess().getFLOATEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getPossibleParameterTypesAccess().getFLOATEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:3775:3: (enumLiteral_5= 'List' )
                    {
                    // InternalMyDsl.g:3775:3: (enumLiteral_5= 'List' )
                    // InternalMyDsl.g:3776:4: enumLiteral_5= 'List'
                    {
                    enumLiteral_5=(Token)match(input,95,FOLLOW_2); 

                    				current = grammarAccess.getPossibleParameterTypesAccess().getLISTEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getPossibleParameterTypesAccess().getLISTEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalMyDsl.g:3783:3: (enumLiteral_6= 'Integer' )
                    {
                    // InternalMyDsl.g:3783:3: (enumLiteral_6= 'Integer' )
                    // InternalMyDsl.g:3784:4: enumLiteral_6= 'Integer'
                    {
                    enumLiteral_6=(Token)match(input,96,FOLLOW_2); 

                    				current = grammarAccess.getPossibleParameterTypesAccess().getINTEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getPossibleParameterTypesAccess().getINTEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalMyDsl.g:3791:3: (enumLiteral_7= 'Long' )
                    {
                    // InternalMyDsl.g:3791:3: (enumLiteral_7= 'Long' )
                    // InternalMyDsl.g:3792:4: enumLiteral_7= 'Long'
                    {
                    enumLiteral_7=(Token)match(input,97,FOLLOW_2); 

                    				current = grammarAccess.getPossibleParameterTypesAccess().getLONGEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getPossibleParameterTypesAccess().getLONGEnumLiteralDeclaration_7());
                    			

                    }


                    }
                    break;
                case 9 :
                    // InternalMyDsl.g:3799:3: (enumLiteral_8= 'Map' )
                    {
                    // InternalMyDsl.g:3799:3: (enumLiteral_8= 'Map' )
                    // InternalMyDsl.g:3800:4: enumLiteral_8= 'Map'
                    {
                    enumLiteral_8=(Token)match(input,98,FOLLOW_2); 

                    				current = grammarAccess.getPossibleParameterTypesAccess().getMAPEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_8, grammarAccess.getPossibleParameterTypesAccess().getMAPEnumLiteralDeclaration_8());
                    			

                    }


                    }
                    break;
                case 10 :
                    // InternalMyDsl.g:3807:3: (enumLiteral_9= 'String' )
                    {
                    // InternalMyDsl.g:3807:3: (enumLiteral_9= 'String' )
                    // InternalMyDsl.g:3808:4: enumLiteral_9= 'String'
                    {
                    enumLiteral_9=(Token)match(input,99,FOLLOW_2); 

                    				current = grammarAccess.getPossibleParameterTypesAccess().getSTRINGEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_9, grammarAccess.getPossibleParameterTypesAccess().getSTRINGEnumLiteralDeclaration_9());
                    			

                    }


                    }
                    break;
                case 11 :
                    // InternalMyDsl.g:3815:3: (enumLiteral_10= 'EObject' )
                    {
                    // InternalMyDsl.g:3815:3: (enumLiteral_10= 'EObject' )
                    // InternalMyDsl.g:3816:4: enumLiteral_10= 'EObject'
                    {
                    enumLiteral_10=(Token)match(input,101,FOLLOW_2); 

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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000000000FC000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000000000F4000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000000000E4000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000000000C4000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000084000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000007E80000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000007C84000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000007884000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000007084000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000006084000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000004084000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000000L,0x0000002FFC000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x00000003C009A000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x000000038009E000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x000000030009E000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x000000020009E000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x000000020009C000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000200094000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000200084000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000800080000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000006000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000004000004000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000008000004000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000060000080000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000040000080000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000120000080000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000100000080000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0007C00000080000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0007800000080000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0007000000084000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0006000000084000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0004000000084000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000090000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x8000000000080000L,0x0000000000000001L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000000000084000L,0x0000000000000001L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000000000080000L,0x0000000000000005L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0000000000080000L,0x0000000000000010L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0000000000080000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0000000000084000L,0x0000000000000080L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x00000003C008A000L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x000000038008E000L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x000000030008E000L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x000000020008E000L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x000000020008C000L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0000000000080000L,0x0000000000003C00L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x0000000000084000L,0x0000000000003800L});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x0000000000084000L,0x0000000000003000L});
    public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_75 = new BitSet(new long[]{0x0000000000084000L,0x0000000000002000L});
    public static final BitSet FOLLOW_76 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_77 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_78 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_79 = new BitSet(new long[]{0x0000000000000000L,0x0000003FFC000000L});
    public static final BitSet FOLLOW_80 = new BitSet(new long[]{0x0000000000080000L,0x0000000000600000L});
    public static final BitSet FOLLOW_81 = new BitSet(new long[]{0x0000000000084000L,0x0000000000400000L});
    public static final BitSet FOLLOW_82 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_83 = new BitSet(new long[]{0x0000000000080000L,0x0000000003000000L});
    public static final BitSet FOLLOW_84 = new BitSet(new long[]{0x0000000020000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_85 = new BitSet(new long[]{0x0000000000084000L,0x0000000002000000L});
    public static final BitSet FOLLOW_86 = new BitSet(new long[]{0x0000000000100000L});

}