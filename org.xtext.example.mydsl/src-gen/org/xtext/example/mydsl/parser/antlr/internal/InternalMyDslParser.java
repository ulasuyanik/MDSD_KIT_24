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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'ERoot'", "'{'", "'eviewpoint:'", "','", "'eviewtype:'", "'eparameter:'", "'esignature:'", "'edelegationconnector:'", "'erole:'", "'elink:'", "'econtainer:'", "'eassemblyconnector:'", "'eassemblycontext:'", "'ecomponent:'", "'eservice:'", "'einterface:'", "'esystem:'", "'erepository:'", "'ebehaviourdescription:'", "'eexternalcall:'", "'einternalaction:'", "'ebranch:'", "'eloop:'", "'ecompositecomponent:'", "'eallocationcontext:'", "'}'", "'EInterface'", "'resultsIn:'", "'providedByComponent:'", "'providedBySystem:'", "'requiredByComponent:'", "'requiredBySystem:'", "'signature:'", "'ESystem'", "'provides:'", "'requires:'", "'encapsulates:'", "'EParameter'", "'type:'", "'ECompositeComponent'", "'providesInterfaceTo:'", "'usesInterfaceFrom:'", "'providesDirectly:'", "'behaviourDescription:'", "'EContainer'", "'connectedTo:'", "'EAllocationContext'", "'controls:'", "'specifiesFor:'", "'specifies:'", "'ERequiredRole'", "'roleOf:'", "'linkedTo:'", "'EProvidedRole'", "'linkedFrom:'", "'ELink'", "'connects:'", "'EAssemblyContext'", "'allocated:'", "'encapsulatedByComponent:'", "'encapsulatedBySystem:'", "'instantiates:'", "'roles:'", "'EAssemblyConnector'", "'linkTo:'", "'linkFrom:'", "'EProvidedDelegationConnector'", "'ERequiredDelegationConnector'", "'ESystemIndependentViewPoint'", "'repositoryViewType:'", "'EAssemblyViewPoint'", "'assemblyViewType:'", "'EDeploymentViewPoint'", "'allocationViewType:'", "'environmentViewType:'", "'ERepositoryViewType'", "'showsInterfaces:'", "'showsComponents:'", "'EAssemblyViewType'", "'mainArtifacts:'", "'EAllocationViewType'", "'includes:'", "'EEnvironmentViewType'", "'showsLinks:'", "'showsContainers:'", "'EComponent'", "'EBehaviourDescription'", "'internalAction:'", "'loop:'", "'branch:'", "'externalCall:'", "'EService'", "'EInternalAction'", "'ELoop'", "'EBranch'", "'EExternalCall'", "'to:'", "'ESignature'", "'returnType:'", "'correspondsTo:'", "'parameter:'", "'ERepository'", "'component:'", "'interface:'", "'Boolean'", "'Char'", "'Date'", "'Double'", "'Float'", "'List'", "'Integer'", "'Long'", "'Map'", "'String'", "'Void'", "'EObject'"
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
    public static final int T__126=126;
    public static final int T__63=63;
    public static final int T__125=125;
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
    public static final int T__102=102;
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
    public static final int T__122=122;
    public static final int T__70=70;
    public static final int T__121=121;
    public static final int T__71=71;
    public static final int T__124=124;
    public static final int T__72=72;
    public static final int T__123=123;
    public static final int T__120=120;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__77=77;
    public static final int T__119=119;
    public static final int T__78=78;
    public static final int T__118=118;
    public static final int T__79=79;
    public static final int T__73=73;
    public static final int T__115=115;
    public static final int EOF=-1;
    public static final int T__74=74;
    public static final int T__114=114;
    public static final int T__75=75;
    public static final int T__117=117;
    public static final int T__76=76;
    public static final int T__116=116;
    public static final int T__80=80;
    public static final int T__111=111;
    public static final int T__81=81;
    public static final int T__110=110;
    public static final int T__82=82;
    public static final int T__113=113;
    public static final int T__83=83;
    public static final int T__112=112;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__88=88;
    public static final int T__108=108;
    public static final int T__89=89;
    public static final int T__107=107;
    public static final int T__109=109;
    public static final int T__84=84;
    public static final int T__104=104;
    public static final int T__85=85;
    public static final int T__103=103;
    public static final int T__86=86;
    public static final int T__106=106;
    public static final int T__87=87;
    public static final int T__105=105;

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
        	return "ERoot";
       	}

       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleERoot"
    // InternalMyDsl.g:65:1: entryRuleERoot returns [EObject current=null] : iv_ruleERoot= ruleERoot EOF ;
    public final EObject entryRuleERoot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleERoot = null;


        try {
            // InternalMyDsl.g:65:46: (iv_ruleERoot= ruleERoot EOF )
            // InternalMyDsl.g:66:2: iv_ruleERoot= ruleERoot EOF
            {
             newCompositeNode(grammarAccess.getERootRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleERoot=ruleERoot();

            state._fsp--;

             current =iv_ruleERoot; 
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
    // $ANTLR end "entryRuleERoot"


    // $ANTLR start "ruleERoot"
    // InternalMyDsl.g:72:1: ruleERoot returns [EObject current=null] : ( () otherlv_1= 'ERoot' otherlv_2= '{' (otherlv_3= 'eviewpoint:' ( (lv_eviewpoint_4_0= ruleEViewPoint ) ) (otherlv_5= ',' ( (lv_eviewpoint_6_0= ruleEViewPoint ) ) )* )? (otherlv_7= 'eviewtype:' ( (lv_eviewtype_8_0= ruleEViewType ) ) (otherlv_9= ',' ( (lv_eviewtype_10_0= ruleEViewType ) ) )* )? (otherlv_11= 'eparameter:' ( (lv_eparameter_12_0= ruleEParameter ) ) (otherlv_13= ',' ( (lv_eparameter_14_0= ruleEParameter ) ) )* )? (otherlv_15= 'esignature:' ( (lv_esignature_16_0= ruleESignature ) ) (otherlv_17= ',' ( (lv_esignature_18_0= ruleESignature ) ) )* )? (otherlv_19= 'edelegationconnector:' ( (lv_edelegationconnector_20_0= ruleEDelegationConnector ) ) (otherlv_21= ',' ( (lv_edelegationconnector_22_0= ruleEDelegationConnector ) ) )* )? (otherlv_23= 'erole:' ( (lv_erole_24_0= ruleERole ) ) (otherlv_25= ',' ( (lv_erole_26_0= ruleERole ) ) )* )? (otherlv_27= 'elink:' ( (lv_elink_28_0= ruleELink ) ) (otherlv_29= ',' ( (lv_elink_30_0= ruleELink ) ) )* )? (otherlv_31= 'econtainer:' ( (lv_econtainer_32_0= ruleEContainer ) ) (otherlv_33= ',' ( (lv_econtainer_34_0= ruleEContainer ) ) )* )? (otherlv_35= 'eassemblyconnector:' ( (lv_eassemblyconnector_36_0= ruleEAssemblyConnector ) ) (otherlv_37= ',' ( (lv_eassemblyconnector_38_0= ruleEAssemblyConnector ) ) )* )? (otherlv_39= 'eassemblycontext:' ( (lv_eassemblycontext_40_0= ruleEAssemblyContext ) ) (otherlv_41= ',' ( (lv_eassemblycontext_42_0= ruleEAssemblyContext ) ) )* )? (otherlv_43= 'ecomponent:' ( (lv_ecomponent_44_0= ruleEComponent ) ) (otherlv_45= ',' ( (lv_ecomponent_46_0= ruleEComponent ) ) )* )? (otherlv_47= 'eservice:' ( (lv_eservice_48_0= ruleEService ) ) (otherlv_49= ',' ( (lv_eservice_50_0= ruleEService ) ) )* )? (otherlv_51= 'einterface:' ( (lv_einterface_52_0= ruleEInterface ) ) (otherlv_53= ',' ( (lv_einterface_54_0= ruleEInterface ) ) )* )? (otherlv_55= 'esystem:' ( (lv_esystem_56_0= ruleESystem ) ) (otherlv_57= ',' ( (lv_esystem_58_0= ruleESystem ) ) )* )? (otherlv_59= 'erepository:' ( (lv_erepository_60_0= ruleERepository ) ) (otherlv_61= ',' ( (lv_erepository_62_0= ruleERepository ) ) )* )? (otherlv_63= 'ebehaviourdescription:' ( (lv_ebehaviourdescription_64_0= ruleEBehaviourDescription ) ) (otherlv_65= ',' ( (lv_ebehaviourdescription_66_0= ruleEBehaviourDescription ) ) )* )? (otherlv_67= 'eexternalcall:' ( (lv_eexternalcall_68_0= ruleEExternalCall ) ) (otherlv_69= ',' ( (lv_eexternalcall_70_0= ruleEExternalCall ) ) )* )? (otherlv_71= 'einternalaction:' ( (lv_einternalaction_72_0= ruleEInternalAction ) ) (otherlv_73= ',' ( (lv_einternalaction_74_0= ruleEInternalAction ) ) )* )? (otherlv_75= 'ebranch:' ( (lv_ebranch_76_0= ruleEBranch ) ) (otherlv_77= ',' ( (lv_ebranch_78_0= ruleEBranch ) ) )* )? (otherlv_79= 'eloop:' ( (lv_eloop_80_0= ruleELoop ) ) (otherlv_81= ',' ( (lv_eloop_82_0= ruleELoop ) ) )* )? (otherlv_83= 'ecompositecomponent:' ( (lv_ecompositecomponent_84_0= ruleECompositeComponent ) ) (otherlv_85= ',' ( (lv_ecompositecomponent_86_0= ruleECompositeComponent ) ) )* )? (otherlv_87= 'eallocationcontext:' ( (lv_eallocationcontext_88_0= ruleEAllocationContext ) ) (otherlv_89= ',' ( (lv_eallocationcontext_90_0= ruleEAllocationContext ) ) )* )? otherlv_91= '}' ) ;
    public final EObject ruleERoot() throws RecognitionException {
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
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token otherlv_27=null;
        Token otherlv_29=null;
        Token otherlv_31=null;
        Token otherlv_33=null;
        Token otherlv_35=null;
        Token otherlv_37=null;
        Token otherlv_39=null;
        Token otherlv_41=null;
        Token otherlv_43=null;
        Token otherlv_45=null;
        Token otherlv_47=null;
        Token otherlv_49=null;
        Token otherlv_51=null;
        Token otherlv_53=null;
        Token otherlv_55=null;
        Token otherlv_57=null;
        Token otherlv_59=null;
        Token otherlv_61=null;
        Token otherlv_63=null;
        Token otherlv_65=null;
        Token otherlv_67=null;
        Token otherlv_69=null;
        Token otherlv_71=null;
        Token otherlv_73=null;
        Token otherlv_75=null;
        Token otherlv_77=null;
        Token otherlv_79=null;
        Token otherlv_81=null;
        Token otherlv_83=null;
        Token otherlv_85=null;
        Token otherlv_87=null;
        Token otherlv_89=null;
        Token otherlv_91=null;
        EObject lv_eviewpoint_4_0 = null;

        EObject lv_eviewpoint_6_0 = null;

        EObject lv_eviewtype_8_0 = null;

        EObject lv_eviewtype_10_0 = null;

        EObject lv_eparameter_12_0 = null;

        EObject lv_eparameter_14_0 = null;

        EObject lv_esignature_16_0 = null;

        EObject lv_esignature_18_0 = null;

        EObject lv_edelegationconnector_20_0 = null;

        EObject lv_edelegationconnector_22_0 = null;

        EObject lv_erole_24_0 = null;

        EObject lv_erole_26_0 = null;

        EObject lv_elink_28_0 = null;

        EObject lv_elink_30_0 = null;

        EObject lv_econtainer_32_0 = null;

        EObject lv_econtainer_34_0 = null;

        EObject lv_eassemblyconnector_36_0 = null;

        EObject lv_eassemblyconnector_38_0 = null;

        EObject lv_eassemblycontext_40_0 = null;

        EObject lv_eassemblycontext_42_0 = null;

        EObject lv_ecomponent_44_0 = null;

        EObject lv_ecomponent_46_0 = null;

        EObject lv_eservice_48_0 = null;

        EObject lv_eservice_50_0 = null;

        EObject lv_einterface_52_0 = null;

        EObject lv_einterface_54_0 = null;

        EObject lv_esystem_56_0 = null;

        EObject lv_esystem_58_0 = null;

        EObject lv_erepository_60_0 = null;

        EObject lv_erepository_62_0 = null;

        EObject lv_ebehaviourdescription_64_0 = null;

        EObject lv_ebehaviourdescription_66_0 = null;

        EObject lv_eexternalcall_68_0 = null;

        EObject lv_eexternalcall_70_0 = null;

        EObject lv_einternalaction_72_0 = null;

        EObject lv_einternalaction_74_0 = null;

        EObject lv_ebranch_76_0 = null;

        EObject lv_ebranch_78_0 = null;

        EObject lv_eloop_80_0 = null;

        EObject lv_eloop_82_0 = null;

        EObject lv_ecompositecomponent_84_0 = null;

        EObject lv_ecompositecomponent_86_0 = null;

        EObject lv_eallocationcontext_88_0 = null;

        EObject lv_eallocationcontext_90_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:78:2: ( ( () otherlv_1= 'ERoot' otherlv_2= '{' (otherlv_3= 'eviewpoint:' ( (lv_eviewpoint_4_0= ruleEViewPoint ) ) (otherlv_5= ',' ( (lv_eviewpoint_6_0= ruleEViewPoint ) ) )* )? (otherlv_7= 'eviewtype:' ( (lv_eviewtype_8_0= ruleEViewType ) ) (otherlv_9= ',' ( (lv_eviewtype_10_0= ruleEViewType ) ) )* )? (otherlv_11= 'eparameter:' ( (lv_eparameter_12_0= ruleEParameter ) ) (otherlv_13= ',' ( (lv_eparameter_14_0= ruleEParameter ) ) )* )? (otherlv_15= 'esignature:' ( (lv_esignature_16_0= ruleESignature ) ) (otherlv_17= ',' ( (lv_esignature_18_0= ruleESignature ) ) )* )? (otherlv_19= 'edelegationconnector:' ( (lv_edelegationconnector_20_0= ruleEDelegationConnector ) ) (otherlv_21= ',' ( (lv_edelegationconnector_22_0= ruleEDelegationConnector ) ) )* )? (otherlv_23= 'erole:' ( (lv_erole_24_0= ruleERole ) ) (otherlv_25= ',' ( (lv_erole_26_0= ruleERole ) ) )* )? (otherlv_27= 'elink:' ( (lv_elink_28_0= ruleELink ) ) (otherlv_29= ',' ( (lv_elink_30_0= ruleELink ) ) )* )? (otherlv_31= 'econtainer:' ( (lv_econtainer_32_0= ruleEContainer ) ) (otherlv_33= ',' ( (lv_econtainer_34_0= ruleEContainer ) ) )* )? (otherlv_35= 'eassemblyconnector:' ( (lv_eassemblyconnector_36_0= ruleEAssemblyConnector ) ) (otherlv_37= ',' ( (lv_eassemblyconnector_38_0= ruleEAssemblyConnector ) ) )* )? (otherlv_39= 'eassemblycontext:' ( (lv_eassemblycontext_40_0= ruleEAssemblyContext ) ) (otherlv_41= ',' ( (lv_eassemblycontext_42_0= ruleEAssemblyContext ) ) )* )? (otherlv_43= 'ecomponent:' ( (lv_ecomponent_44_0= ruleEComponent ) ) (otherlv_45= ',' ( (lv_ecomponent_46_0= ruleEComponent ) ) )* )? (otherlv_47= 'eservice:' ( (lv_eservice_48_0= ruleEService ) ) (otherlv_49= ',' ( (lv_eservice_50_0= ruleEService ) ) )* )? (otherlv_51= 'einterface:' ( (lv_einterface_52_0= ruleEInterface ) ) (otherlv_53= ',' ( (lv_einterface_54_0= ruleEInterface ) ) )* )? (otherlv_55= 'esystem:' ( (lv_esystem_56_0= ruleESystem ) ) (otherlv_57= ',' ( (lv_esystem_58_0= ruleESystem ) ) )* )? (otherlv_59= 'erepository:' ( (lv_erepository_60_0= ruleERepository ) ) (otherlv_61= ',' ( (lv_erepository_62_0= ruleERepository ) ) )* )? (otherlv_63= 'ebehaviourdescription:' ( (lv_ebehaviourdescription_64_0= ruleEBehaviourDescription ) ) (otherlv_65= ',' ( (lv_ebehaviourdescription_66_0= ruleEBehaviourDescription ) ) )* )? (otherlv_67= 'eexternalcall:' ( (lv_eexternalcall_68_0= ruleEExternalCall ) ) (otherlv_69= ',' ( (lv_eexternalcall_70_0= ruleEExternalCall ) ) )* )? (otherlv_71= 'einternalaction:' ( (lv_einternalaction_72_0= ruleEInternalAction ) ) (otherlv_73= ',' ( (lv_einternalaction_74_0= ruleEInternalAction ) ) )* )? (otherlv_75= 'ebranch:' ( (lv_ebranch_76_0= ruleEBranch ) ) (otherlv_77= ',' ( (lv_ebranch_78_0= ruleEBranch ) ) )* )? (otherlv_79= 'eloop:' ( (lv_eloop_80_0= ruleELoop ) ) (otherlv_81= ',' ( (lv_eloop_82_0= ruleELoop ) ) )* )? (otherlv_83= 'ecompositecomponent:' ( (lv_ecompositecomponent_84_0= ruleECompositeComponent ) ) (otherlv_85= ',' ( (lv_ecompositecomponent_86_0= ruleECompositeComponent ) ) )* )? (otherlv_87= 'eallocationcontext:' ( (lv_eallocationcontext_88_0= ruleEAllocationContext ) ) (otherlv_89= ',' ( (lv_eallocationcontext_90_0= ruleEAllocationContext ) ) )* )? otherlv_91= '}' ) )
            // InternalMyDsl.g:79:2: ( () otherlv_1= 'ERoot' otherlv_2= '{' (otherlv_3= 'eviewpoint:' ( (lv_eviewpoint_4_0= ruleEViewPoint ) ) (otherlv_5= ',' ( (lv_eviewpoint_6_0= ruleEViewPoint ) ) )* )? (otherlv_7= 'eviewtype:' ( (lv_eviewtype_8_0= ruleEViewType ) ) (otherlv_9= ',' ( (lv_eviewtype_10_0= ruleEViewType ) ) )* )? (otherlv_11= 'eparameter:' ( (lv_eparameter_12_0= ruleEParameter ) ) (otherlv_13= ',' ( (lv_eparameter_14_0= ruleEParameter ) ) )* )? (otherlv_15= 'esignature:' ( (lv_esignature_16_0= ruleESignature ) ) (otherlv_17= ',' ( (lv_esignature_18_0= ruleESignature ) ) )* )? (otherlv_19= 'edelegationconnector:' ( (lv_edelegationconnector_20_0= ruleEDelegationConnector ) ) (otherlv_21= ',' ( (lv_edelegationconnector_22_0= ruleEDelegationConnector ) ) )* )? (otherlv_23= 'erole:' ( (lv_erole_24_0= ruleERole ) ) (otherlv_25= ',' ( (lv_erole_26_0= ruleERole ) ) )* )? (otherlv_27= 'elink:' ( (lv_elink_28_0= ruleELink ) ) (otherlv_29= ',' ( (lv_elink_30_0= ruleELink ) ) )* )? (otherlv_31= 'econtainer:' ( (lv_econtainer_32_0= ruleEContainer ) ) (otherlv_33= ',' ( (lv_econtainer_34_0= ruleEContainer ) ) )* )? (otherlv_35= 'eassemblyconnector:' ( (lv_eassemblyconnector_36_0= ruleEAssemblyConnector ) ) (otherlv_37= ',' ( (lv_eassemblyconnector_38_0= ruleEAssemblyConnector ) ) )* )? (otherlv_39= 'eassemblycontext:' ( (lv_eassemblycontext_40_0= ruleEAssemblyContext ) ) (otherlv_41= ',' ( (lv_eassemblycontext_42_0= ruleEAssemblyContext ) ) )* )? (otherlv_43= 'ecomponent:' ( (lv_ecomponent_44_0= ruleEComponent ) ) (otherlv_45= ',' ( (lv_ecomponent_46_0= ruleEComponent ) ) )* )? (otherlv_47= 'eservice:' ( (lv_eservice_48_0= ruleEService ) ) (otherlv_49= ',' ( (lv_eservice_50_0= ruleEService ) ) )* )? (otherlv_51= 'einterface:' ( (lv_einterface_52_0= ruleEInterface ) ) (otherlv_53= ',' ( (lv_einterface_54_0= ruleEInterface ) ) )* )? (otherlv_55= 'esystem:' ( (lv_esystem_56_0= ruleESystem ) ) (otherlv_57= ',' ( (lv_esystem_58_0= ruleESystem ) ) )* )? (otherlv_59= 'erepository:' ( (lv_erepository_60_0= ruleERepository ) ) (otherlv_61= ',' ( (lv_erepository_62_0= ruleERepository ) ) )* )? (otherlv_63= 'ebehaviourdescription:' ( (lv_ebehaviourdescription_64_0= ruleEBehaviourDescription ) ) (otherlv_65= ',' ( (lv_ebehaviourdescription_66_0= ruleEBehaviourDescription ) ) )* )? (otherlv_67= 'eexternalcall:' ( (lv_eexternalcall_68_0= ruleEExternalCall ) ) (otherlv_69= ',' ( (lv_eexternalcall_70_0= ruleEExternalCall ) ) )* )? (otherlv_71= 'einternalaction:' ( (lv_einternalaction_72_0= ruleEInternalAction ) ) (otherlv_73= ',' ( (lv_einternalaction_74_0= ruleEInternalAction ) ) )* )? (otherlv_75= 'ebranch:' ( (lv_ebranch_76_0= ruleEBranch ) ) (otherlv_77= ',' ( (lv_ebranch_78_0= ruleEBranch ) ) )* )? (otherlv_79= 'eloop:' ( (lv_eloop_80_0= ruleELoop ) ) (otherlv_81= ',' ( (lv_eloop_82_0= ruleELoop ) ) )* )? (otherlv_83= 'ecompositecomponent:' ( (lv_ecompositecomponent_84_0= ruleECompositeComponent ) ) (otherlv_85= ',' ( (lv_ecompositecomponent_86_0= ruleECompositeComponent ) ) )* )? (otherlv_87= 'eallocationcontext:' ( (lv_eallocationcontext_88_0= ruleEAllocationContext ) ) (otherlv_89= ',' ( (lv_eallocationcontext_90_0= ruleEAllocationContext ) ) )* )? otherlv_91= '}' )
            {
            // InternalMyDsl.g:79:2: ( () otherlv_1= 'ERoot' otherlv_2= '{' (otherlv_3= 'eviewpoint:' ( (lv_eviewpoint_4_0= ruleEViewPoint ) ) (otherlv_5= ',' ( (lv_eviewpoint_6_0= ruleEViewPoint ) ) )* )? (otherlv_7= 'eviewtype:' ( (lv_eviewtype_8_0= ruleEViewType ) ) (otherlv_9= ',' ( (lv_eviewtype_10_0= ruleEViewType ) ) )* )? (otherlv_11= 'eparameter:' ( (lv_eparameter_12_0= ruleEParameter ) ) (otherlv_13= ',' ( (lv_eparameter_14_0= ruleEParameter ) ) )* )? (otherlv_15= 'esignature:' ( (lv_esignature_16_0= ruleESignature ) ) (otherlv_17= ',' ( (lv_esignature_18_0= ruleESignature ) ) )* )? (otherlv_19= 'edelegationconnector:' ( (lv_edelegationconnector_20_0= ruleEDelegationConnector ) ) (otherlv_21= ',' ( (lv_edelegationconnector_22_0= ruleEDelegationConnector ) ) )* )? (otherlv_23= 'erole:' ( (lv_erole_24_0= ruleERole ) ) (otherlv_25= ',' ( (lv_erole_26_0= ruleERole ) ) )* )? (otherlv_27= 'elink:' ( (lv_elink_28_0= ruleELink ) ) (otherlv_29= ',' ( (lv_elink_30_0= ruleELink ) ) )* )? (otherlv_31= 'econtainer:' ( (lv_econtainer_32_0= ruleEContainer ) ) (otherlv_33= ',' ( (lv_econtainer_34_0= ruleEContainer ) ) )* )? (otherlv_35= 'eassemblyconnector:' ( (lv_eassemblyconnector_36_0= ruleEAssemblyConnector ) ) (otherlv_37= ',' ( (lv_eassemblyconnector_38_0= ruleEAssemblyConnector ) ) )* )? (otherlv_39= 'eassemblycontext:' ( (lv_eassemblycontext_40_0= ruleEAssemblyContext ) ) (otherlv_41= ',' ( (lv_eassemblycontext_42_0= ruleEAssemblyContext ) ) )* )? (otherlv_43= 'ecomponent:' ( (lv_ecomponent_44_0= ruleEComponent ) ) (otherlv_45= ',' ( (lv_ecomponent_46_0= ruleEComponent ) ) )* )? (otherlv_47= 'eservice:' ( (lv_eservice_48_0= ruleEService ) ) (otherlv_49= ',' ( (lv_eservice_50_0= ruleEService ) ) )* )? (otherlv_51= 'einterface:' ( (lv_einterface_52_0= ruleEInterface ) ) (otherlv_53= ',' ( (lv_einterface_54_0= ruleEInterface ) ) )* )? (otherlv_55= 'esystem:' ( (lv_esystem_56_0= ruleESystem ) ) (otherlv_57= ',' ( (lv_esystem_58_0= ruleESystem ) ) )* )? (otherlv_59= 'erepository:' ( (lv_erepository_60_0= ruleERepository ) ) (otherlv_61= ',' ( (lv_erepository_62_0= ruleERepository ) ) )* )? (otherlv_63= 'ebehaviourdescription:' ( (lv_ebehaviourdescription_64_0= ruleEBehaviourDescription ) ) (otherlv_65= ',' ( (lv_ebehaviourdescription_66_0= ruleEBehaviourDescription ) ) )* )? (otherlv_67= 'eexternalcall:' ( (lv_eexternalcall_68_0= ruleEExternalCall ) ) (otherlv_69= ',' ( (lv_eexternalcall_70_0= ruleEExternalCall ) ) )* )? (otherlv_71= 'einternalaction:' ( (lv_einternalaction_72_0= ruleEInternalAction ) ) (otherlv_73= ',' ( (lv_einternalaction_74_0= ruleEInternalAction ) ) )* )? (otherlv_75= 'ebranch:' ( (lv_ebranch_76_0= ruleEBranch ) ) (otherlv_77= ',' ( (lv_ebranch_78_0= ruleEBranch ) ) )* )? (otherlv_79= 'eloop:' ( (lv_eloop_80_0= ruleELoop ) ) (otherlv_81= ',' ( (lv_eloop_82_0= ruleELoop ) ) )* )? (otherlv_83= 'ecompositecomponent:' ( (lv_ecompositecomponent_84_0= ruleECompositeComponent ) ) (otherlv_85= ',' ( (lv_ecompositecomponent_86_0= ruleECompositeComponent ) ) )* )? (otherlv_87= 'eallocationcontext:' ( (lv_eallocationcontext_88_0= ruleEAllocationContext ) ) (otherlv_89= ',' ( (lv_eallocationcontext_90_0= ruleEAllocationContext ) ) )* )? otherlv_91= '}' )
            // InternalMyDsl.g:80:3: () otherlv_1= 'ERoot' otherlv_2= '{' (otherlv_3= 'eviewpoint:' ( (lv_eviewpoint_4_0= ruleEViewPoint ) ) (otherlv_5= ',' ( (lv_eviewpoint_6_0= ruleEViewPoint ) ) )* )? (otherlv_7= 'eviewtype:' ( (lv_eviewtype_8_0= ruleEViewType ) ) (otherlv_9= ',' ( (lv_eviewtype_10_0= ruleEViewType ) ) )* )? (otherlv_11= 'eparameter:' ( (lv_eparameter_12_0= ruleEParameter ) ) (otherlv_13= ',' ( (lv_eparameter_14_0= ruleEParameter ) ) )* )? (otherlv_15= 'esignature:' ( (lv_esignature_16_0= ruleESignature ) ) (otherlv_17= ',' ( (lv_esignature_18_0= ruleESignature ) ) )* )? (otherlv_19= 'edelegationconnector:' ( (lv_edelegationconnector_20_0= ruleEDelegationConnector ) ) (otherlv_21= ',' ( (lv_edelegationconnector_22_0= ruleEDelegationConnector ) ) )* )? (otherlv_23= 'erole:' ( (lv_erole_24_0= ruleERole ) ) (otherlv_25= ',' ( (lv_erole_26_0= ruleERole ) ) )* )? (otherlv_27= 'elink:' ( (lv_elink_28_0= ruleELink ) ) (otherlv_29= ',' ( (lv_elink_30_0= ruleELink ) ) )* )? (otherlv_31= 'econtainer:' ( (lv_econtainer_32_0= ruleEContainer ) ) (otherlv_33= ',' ( (lv_econtainer_34_0= ruleEContainer ) ) )* )? (otherlv_35= 'eassemblyconnector:' ( (lv_eassemblyconnector_36_0= ruleEAssemblyConnector ) ) (otherlv_37= ',' ( (lv_eassemblyconnector_38_0= ruleEAssemblyConnector ) ) )* )? (otherlv_39= 'eassemblycontext:' ( (lv_eassemblycontext_40_0= ruleEAssemblyContext ) ) (otherlv_41= ',' ( (lv_eassemblycontext_42_0= ruleEAssemblyContext ) ) )* )? (otherlv_43= 'ecomponent:' ( (lv_ecomponent_44_0= ruleEComponent ) ) (otherlv_45= ',' ( (lv_ecomponent_46_0= ruleEComponent ) ) )* )? (otherlv_47= 'eservice:' ( (lv_eservice_48_0= ruleEService ) ) (otherlv_49= ',' ( (lv_eservice_50_0= ruleEService ) ) )* )? (otherlv_51= 'einterface:' ( (lv_einterface_52_0= ruleEInterface ) ) (otherlv_53= ',' ( (lv_einterface_54_0= ruleEInterface ) ) )* )? (otherlv_55= 'esystem:' ( (lv_esystem_56_0= ruleESystem ) ) (otherlv_57= ',' ( (lv_esystem_58_0= ruleESystem ) ) )* )? (otherlv_59= 'erepository:' ( (lv_erepository_60_0= ruleERepository ) ) (otherlv_61= ',' ( (lv_erepository_62_0= ruleERepository ) ) )* )? (otherlv_63= 'ebehaviourdescription:' ( (lv_ebehaviourdescription_64_0= ruleEBehaviourDescription ) ) (otherlv_65= ',' ( (lv_ebehaviourdescription_66_0= ruleEBehaviourDescription ) ) )* )? (otherlv_67= 'eexternalcall:' ( (lv_eexternalcall_68_0= ruleEExternalCall ) ) (otherlv_69= ',' ( (lv_eexternalcall_70_0= ruleEExternalCall ) ) )* )? (otherlv_71= 'einternalaction:' ( (lv_einternalaction_72_0= ruleEInternalAction ) ) (otherlv_73= ',' ( (lv_einternalaction_74_0= ruleEInternalAction ) ) )* )? (otherlv_75= 'ebranch:' ( (lv_ebranch_76_0= ruleEBranch ) ) (otherlv_77= ',' ( (lv_ebranch_78_0= ruleEBranch ) ) )* )? (otherlv_79= 'eloop:' ( (lv_eloop_80_0= ruleELoop ) ) (otherlv_81= ',' ( (lv_eloop_82_0= ruleELoop ) ) )* )? (otherlv_83= 'ecompositecomponent:' ( (lv_ecompositecomponent_84_0= ruleECompositeComponent ) ) (otherlv_85= ',' ( (lv_ecompositecomponent_86_0= ruleECompositeComponent ) ) )* )? (otherlv_87= 'eallocationcontext:' ( (lv_eallocationcontext_88_0= ruleEAllocationContext ) ) (otherlv_89= ',' ( (lv_eallocationcontext_90_0= ruleEAllocationContext ) ) )* )? otherlv_91= '}'
            {
            // InternalMyDsl.g:80:3: ()
            // InternalMyDsl.g:81:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getERootAccess().getERootAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getERootAccess().getERootKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getERootAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:95:3: (otherlv_3= 'eviewpoint:' ( (lv_eviewpoint_4_0= ruleEViewPoint ) ) (otherlv_5= ',' ( (lv_eviewpoint_6_0= ruleEViewPoint ) ) )* )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:96:4: otherlv_3= 'eviewpoint:' ( (lv_eviewpoint_4_0= ruleEViewPoint ) ) (otherlv_5= ',' ( (lv_eviewpoint_6_0= ruleEViewPoint ) ) )*
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_5); 

                    				newLeafNode(otherlv_3, grammarAccess.getERootAccess().getEviewpointKeyword_3_0());
                    			
                    // InternalMyDsl.g:100:4: ( (lv_eviewpoint_4_0= ruleEViewPoint ) )
                    // InternalMyDsl.g:101:5: (lv_eviewpoint_4_0= ruleEViewPoint )
                    {
                    // InternalMyDsl.g:101:5: (lv_eviewpoint_4_0= ruleEViewPoint )
                    // InternalMyDsl.g:102:6: lv_eviewpoint_4_0= ruleEViewPoint
                    {

                    						newCompositeNode(grammarAccess.getERootAccess().getEviewpointEViewPointParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_eviewpoint_4_0=ruleEViewPoint();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getERootRule());
                    						}
                    						add(
                    							current,
                    							"eviewpoint",
                    							lv_eviewpoint_4_0,
                    							"org.xtext.example.mydsl.MyDsl.EViewPoint");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:119:4: (otherlv_5= ',' ( (lv_eviewpoint_6_0= ruleEViewPoint ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==14) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalMyDsl.g:120:5: otherlv_5= ',' ( (lv_eviewpoint_6_0= ruleEViewPoint ) )
                    	    {
                    	    otherlv_5=(Token)match(input,14,FOLLOW_5); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getERootAccess().getCommaKeyword_3_2_0());
                    	    				
                    	    // InternalMyDsl.g:124:5: ( (lv_eviewpoint_6_0= ruleEViewPoint ) )
                    	    // InternalMyDsl.g:125:6: (lv_eviewpoint_6_0= ruleEViewPoint )
                    	    {
                    	    // InternalMyDsl.g:125:6: (lv_eviewpoint_6_0= ruleEViewPoint )
                    	    // InternalMyDsl.g:126:7: lv_eviewpoint_6_0= ruleEViewPoint
                    	    {

                    	    							newCompositeNode(grammarAccess.getERootAccess().getEviewpointEViewPointParserRuleCall_3_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_eviewpoint_6_0=ruleEViewPoint();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getERootRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"eviewpoint",
                    	    								lv_eviewpoint_6_0,
                    	    								"org.xtext.example.mydsl.MyDsl.EViewPoint");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalMyDsl.g:145:3: (otherlv_7= 'eviewtype:' ( (lv_eviewtype_8_0= ruleEViewType ) ) (otherlv_9= ',' ( (lv_eviewtype_10_0= ruleEViewType ) ) )* )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:146:4: otherlv_7= 'eviewtype:' ( (lv_eviewtype_8_0= ruleEViewType ) ) (otherlv_9= ',' ( (lv_eviewtype_10_0= ruleEViewType ) ) )*
                    {
                    otherlv_7=(Token)match(input,15,FOLLOW_7); 

                    				newLeafNode(otherlv_7, grammarAccess.getERootAccess().getEviewtypeKeyword_4_0());
                    			
                    // InternalMyDsl.g:150:4: ( (lv_eviewtype_8_0= ruleEViewType ) )
                    // InternalMyDsl.g:151:5: (lv_eviewtype_8_0= ruleEViewType )
                    {
                    // InternalMyDsl.g:151:5: (lv_eviewtype_8_0= ruleEViewType )
                    // InternalMyDsl.g:152:6: lv_eviewtype_8_0= ruleEViewType
                    {

                    						newCompositeNode(grammarAccess.getERootAccess().getEviewtypeEViewTypeParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_eviewtype_8_0=ruleEViewType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getERootRule());
                    						}
                    						add(
                    							current,
                    							"eviewtype",
                    							lv_eviewtype_8_0,
                    							"org.xtext.example.mydsl.MyDsl.EViewType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:169:4: (otherlv_9= ',' ( (lv_eviewtype_10_0= ruleEViewType ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==14) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalMyDsl.g:170:5: otherlv_9= ',' ( (lv_eviewtype_10_0= ruleEViewType ) )
                    	    {
                    	    otherlv_9=(Token)match(input,14,FOLLOW_7); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getERootAccess().getCommaKeyword_4_2_0());
                    	    				
                    	    // InternalMyDsl.g:174:5: ( (lv_eviewtype_10_0= ruleEViewType ) )
                    	    // InternalMyDsl.g:175:6: (lv_eviewtype_10_0= ruleEViewType )
                    	    {
                    	    // InternalMyDsl.g:175:6: (lv_eviewtype_10_0= ruleEViewType )
                    	    // InternalMyDsl.g:176:7: lv_eviewtype_10_0= ruleEViewType
                    	    {

                    	    							newCompositeNode(grammarAccess.getERootAccess().getEviewtypeEViewTypeParserRuleCall_4_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_eviewtype_10_0=ruleEViewType();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getERootRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"eviewtype",
                    	    								lv_eviewtype_10_0,
                    	    								"org.xtext.example.mydsl.MyDsl.EViewType");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalMyDsl.g:195:3: (otherlv_11= 'eparameter:' ( (lv_eparameter_12_0= ruleEParameter ) ) (otherlv_13= ',' ( (lv_eparameter_14_0= ruleEParameter ) ) )* )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==16) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalMyDsl.g:196:4: otherlv_11= 'eparameter:' ( (lv_eparameter_12_0= ruleEParameter ) ) (otherlv_13= ',' ( (lv_eparameter_14_0= ruleEParameter ) ) )*
                    {
                    otherlv_11=(Token)match(input,16,FOLLOW_9); 

                    				newLeafNode(otherlv_11, grammarAccess.getERootAccess().getEparameterKeyword_5_0());
                    			
                    // InternalMyDsl.g:200:4: ( (lv_eparameter_12_0= ruleEParameter ) )
                    // InternalMyDsl.g:201:5: (lv_eparameter_12_0= ruleEParameter )
                    {
                    // InternalMyDsl.g:201:5: (lv_eparameter_12_0= ruleEParameter )
                    // InternalMyDsl.g:202:6: lv_eparameter_12_0= ruleEParameter
                    {

                    						newCompositeNode(grammarAccess.getERootAccess().getEparameterEParameterParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_eparameter_12_0=ruleEParameter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getERootRule());
                    						}
                    						add(
                    							current,
                    							"eparameter",
                    							lv_eparameter_12_0,
                    							"org.xtext.example.mydsl.MyDsl.EParameter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:219:4: (otherlv_13= ',' ( (lv_eparameter_14_0= ruleEParameter ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==14) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalMyDsl.g:220:5: otherlv_13= ',' ( (lv_eparameter_14_0= ruleEParameter ) )
                    	    {
                    	    otherlv_13=(Token)match(input,14,FOLLOW_9); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getERootAccess().getCommaKeyword_5_2_0());
                    	    				
                    	    // InternalMyDsl.g:224:5: ( (lv_eparameter_14_0= ruleEParameter ) )
                    	    // InternalMyDsl.g:225:6: (lv_eparameter_14_0= ruleEParameter )
                    	    {
                    	    // InternalMyDsl.g:225:6: (lv_eparameter_14_0= ruleEParameter )
                    	    // InternalMyDsl.g:226:7: lv_eparameter_14_0= ruleEParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getERootAccess().getEparameterEParameterParserRuleCall_5_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_10);
                    	    lv_eparameter_14_0=ruleEParameter();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getERootRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"eparameter",
                    	    								lv_eparameter_14_0,
                    	    								"org.xtext.example.mydsl.MyDsl.EParameter");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalMyDsl.g:245:3: (otherlv_15= 'esignature:' ( (lv_esignature_16_0= ruleESignature ) ) (otherlv_17= ',' ( (lv_esignature_18_0= ruleESignature ) ) )* )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==17) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalMyDsl.g:246:4: otherlv_15= 'esignature:' ( (lv_esignature_16_0= ruleESignature ) ) (otherlv_17= ',' ( (lv_esignature_18_0= ruleESignature ) ) )*
                    {
                    otherlv_15=(Token)match(input,17,FOLLOW_11); 

                    				newLeafNode(otherlv_15, grammarAccess.getERootAccess().getEsignatureKeyword_6_0());
                    			
                    // InternalMyDsl.g:250:4: ( (lv_esignature_16_0= ruleESignature ) )
                    // InternalMyDsl.g:251:5: (lv_esignature_16_0= ruleESignature )
                    {
                    // InternalMyDsl.g:251:5: (lv_esignature_16_0= ruleESignature )
                    // InternalMyDsl.g:252:6: lv_esignature_16_0= ruleESignature
                    {

                    						newCompositeNode(grammarAccess.getERootAccess().getEsignatureESignatureParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_esignature_16_0=ruleESignature();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getERootRule());
                    						}
                    						add(
                    							current,
                    							"esignature",
                    							lv_esignature_16_0,
                    							"org.xtext.example.mydsl.MyDsl.ESignature");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:269:4: (otherlv_17= ',' ( (lv_esignature_18_0= ruleESignature ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==14) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalMyDsl.g:270:5: otherlv_17= ',' ( (lv_esignature_18_0= ruleESignature ) )
                    	    {
                    	    otherlv_17=(Token)match(input,14,FOLLOW_11); 

                    	    					newLeafNode(otherlv_17, grammarAccess.getERootAccess().getCommaKeyword_6_2_0());
                    	    				
                    	    // InternalMyDsl.g:274:5: ( (lv_esignature_18_0= ruleESignature ) )
                    	    // InternalMyDsl.g:275:6: (lv_esignature_18_0= ruleESignature )
                    	    {
                    	    // InternalMyDsl.g:275:6: (lv_esignature_18_0= ruleESignature )
                    	    // InternalMyDsl.g:276:7: lv_esignature_18_0= ruleESignature
                    	    {

                    	    							newCompositeNode(grammarAccess.getERootAccess().getEsignatureESignatureParserRuleCall_6_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_12);
                    	    lv_esignature_18_0=ruleESignature();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getERootRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"esignature",
                    	    								lv_esignature_18_0,
                    	    								"org.xtext.example.mydsl.MyDsl.ESignature");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalMyDsl.g:295:3: (otherlv_19= 'edelegationconnector:' ( (lv_edelegationconnector_20_0= ruleEDelegationConnector ) ) (otherlv_21= ',' ( (lv_edelegationconnector_22_0= ruleEDelegationConnector ) ) )* )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==18) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalMyDsl.g:296:4: otherlv_19= 'edelegationconnector:' ( (lv_edelegationconnector_20_0= ruleEDelegationConnector ) ) (otherlv_21= ',' ( (lv_edelegationconnector_22_0= ruleEDelegationConnector ) ) )*
                    {
                    otherlv_19=(Token)match(input,18,FOLLOW_13); 

                    				newLeafNode(otherlv_19, grammarAccess.getERootAccess().getEdelegationconnectorKeyword_7_0());
                    			
                    // InternalMyDsl.g:300:4: ( (lv_edelegationconnector_20_0= ruleEDelegationConnector ) )
                    // InternalMyDsl.g:301:5: (lv_edelegationconnector_20_0= ruleEDelegationConnector )
                    {
                    // InternalMyDsl.g:301:5: (lv_edelegationconnector_20_0= ruleEDelegationConnector )
                    // InternalMyDsl.g:302:6: lv_edelegationconnector_20_0= ruleEDelegationConnector
                    {

                    						newCompositeNode(grammarAccess.getERootAccess().getEdelegationconnectorEDelegationConnectorParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_edelegationconnector_20_0=ruleEDelegationConnector();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getERootRule());
                    						}
                    						add(
                    							current,
                    							"edelegationconnector",
                    							lv_edelegationconnector_20_0,
                    							"org.xtext.example.mydsl.MyDsl.EDelegationConnector");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:319:4: (otherlv_21= ',' ( (lv_edelegationconnector_22_0= ruleEDelegationConnector ) ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==14) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalMyDsl.g:320:5: otherlv_21= ',' ( (lv_edelegationconnector_22_0= ruleEDelegationConnector ) )
                    	    {
                    	    otherlv_21=(Token)match(input,14,FOLLOW_13); 

                    	    					newLeafNode(otherlv_21, grammarAccess.getERootAccess().getCommaKeyword_7_2_0());
                    	    				
                    	    // InternalMyDsl.g:324:5: ( (lv_edelegationconnector_22_0= ruleEDelegationConnector ) )
                    	    // InternalMyDsl.g:325:6: (lv_edelegationconnector_22_0= ruleEDelegationConnector )
                    	    {
                    	    // InternalMyDsl.g:325:6: (lv_edelegationconnector_22_0= ruleEDelegationConnector )
                    	    // InternalMyDsl.g:326:7: lv_edelegationconnector_22_0= ruleEDelegationConnector
                    	    {

                    	    							newCompositeNode(grammarAccess.getERootAccess().getEdelegationconnectorEDelegationConnectorParserRuleCall_7_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_14);
                    	    lv_edelegationconnector_22_0=ruleEDelegationConnector();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getERootRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"edelegationconnector",
                    	    								lv_edelegationconnector_22_0,
                    	    								"org.xtext.example.mydsl.MyDsl.EDelegationConnector");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalMyDsl.g:345:3: (otherlv_23= 'erole:' ( (lv_erole_24_0= ruleERole ) ) (otherlv_25= ',' ( (lv_erole_26_0= ruleERole ) ) )* )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==19) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalMyDsl.g:346:4: otherlv_23= 'erole:' ( (lv_erole_24_0= ruleERole ) ) (otherlv_25= ',' ( (lv_erole_26_0= ruleERole ) ) )*
                    {
                    otherlv_23=(Token)match(input,19,FOLLOW_15); 

                    				newLeafNode(otherlv_23, grammarAccess.getERootAccess().getEroleKeyword_8_0());
                    			
                    // InternalMyDsl.g:350:4: ( (lv_erole_24_0= ruleERole ) )
                    // InternalMyDsl.g:351:5: (lv_erole_24_0= ruleERole )
                    {
                    // InternalMyDsl.g:351:5: (lv_erole_24_0= ruleERole )
                    // InternalMyDsl.g:352:6: lv_erole_24_0= ruleERole
                    {

                    						newCompositeNode(grammarAccess.getERootAccess().getEroleERoleParserRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_erole_24_0=ruleERole();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getERootRule());
                    						}
                    						add(
                    							current,
                    							"erole",
                    							lv_erole_24_0,
                    							"org.xtext.example.mydsl.MyDsl.ERole");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:369:4: (otherlv_25= ',' ( (lv_erole_26_0= ruleERole ) ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==14) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalMyDsl.g:370:5: otherlv_25= ',' ( (lv_erole_26_0= ruleERole ) )
                    	    {
                    	    otherlv_25=(Token)match(input,14,FOLLOW_15); 

                    	    					newLeafNode(otherlv_25, grammarAccess.getERootAccess().getCommaKeyword_8_2_0());
                    	    				
                    	    // InternalMyDsl.g:374:5: ( (lv_erole_26_0= ruleERole ) )
                    	    // InternalMyDsl.g:375:6: (lv_erole_26_0= ruleERole )
                    	    {
                    	    // InternalMyDsl.g:375:6: (lv_erole_26_0= ruleERole )
                    	    // InternalMyDsl.g:376:7: lv_erole_26_0= ruleERole
                    	    {

                    	    							newCompositeNode(grammarAccess.getERootAccess().getEroleERoleParserRuleCall_8_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_16);
                    	    lv_erole_26_0=ruleERole();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getERootRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"erole",
                    	    								lv_erole_26_0,
                    	    								"org.xtext.example.mydsl.MyDsl.ERole");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalMyDsl.g:395:3: (otherlv_27= 'elink:' ( (lv_elink_28_0= ruleELink ) ) (otherlv_29= ',' ( (lv_elink_30_0= ruleELink ) ) )* )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==20) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalMyDsl.g:396:4: otherlv_27= 'elink:' ( (lv_elink_28_0= ruleELink ) ) (otherlv_29= ',' ( (lv_elink_30_0= ruleELink ) ) )*
                    {
                    otherlv_27=(Token)match(input,20,FOLLOW_17); 

                    				newLeafNode(otherlv_27, grammarAccess.getERootAccess().getElinkKeyword_9_0());
                    			
                    // InternalMyDsl.g:400:4: ( (lv_elink_28_0= ruleELink ) )
                    // InternalMyDsl.g:401:5: (lv_elink_28_0= ruleELink )
                    {
                    // InternalMyDsl.g:401:5: (lv_elink_28_0= ruleELink )
                    // InternalMyDsl.g:402:6: lv_elink_28_0= ruleELink
                    {

                    						newCompositeNode(grammarAccess.getERootAccess().getElinkELinkParserRuleCall_9_1_0());
                    					
                    pushFollow(FOLLOW_18);
                    lv_elink_28_0=ruleELink();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getERootRule());
                    						}
                    						add(
                    							current,
                    							"elink",
                    							lv_elink_28_0,
                    							"org.xtext.example.mydsl.MyDsl.ELink");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:419:4: (otherlv_29= ',' ( (lv_elink_30_0= ruleELink ) ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==14) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalMyDsl.g:420:5: otherlv_29= ',' ( (lv_elink_30_0= ruleELink ) )
                    	    {
                    	    otherlv_29=(Token)match(input,14,FOLLOW_17); 

                    	    					newLeafNode(otherlv_29, grammarAccess.getERootAccess().getCommaKeyword_9_2_0());
                    	    				
                    	    // InternalMyDsl.g:424:5: ( (lv_elink_30_0= ruleELink ) )
                    	    // InternalMyDsl.g:425:6: (lv_elink_30_0= ruleELink )
                    	    {
                    	    // InternalMyDsl.g:425:6: (lv_elink_30_0= ruleELink )
                    	    // InternalMyDsl.g:426:7: lv_elink_30_0= ruleELink
                    	    {

                    	    							newCompositeNode(grammarAccess.getERootAccess().getElinkELinkParserRuleCall_9_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_18);
                    	    lv_elink_30_0=ruleELink();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getERootRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"elink",
                    	    								lv_elink_30_0,
                    	    								"org.xtext.example.mydsl.MyDsl.ELink");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalMyDsl.g:445:3: (otherlv_31= 'econtainer:' ( (lv_econtainer_32_0= ruleEContainer ) ) (otherlv_33= ',' ( (lv_econtainer_34_0= ruleEContainer ) ) )* )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==21) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalMyDsl.g:446:4: otherlv_31= 'econtainer:' ( (lv_econtainer_32_0= ruleEContainer ) ) (otherlv_33= ',' ( (lv_econtainer_34_0= ruleEContainer ) ) )*
                    {
                    otherlv_31=(Token)match(input,21,FOLLOW_19); 

                    				newLeafNode(otherlv_31, grammarAccess.getERootAccess().getEcontainerKeyword_10_0());
                    			
                    // InternalMyDsl.g:450:4: ( (lv_econtainer_32_0= ruleEContainer ) )
                    // InternalMyDsl.g:451:5: (lv_econtainer_32_0= ruleEContainer )
                    {
                    // InternalMyDsl.g:451:5: (lv_econtainer_32_0= ruleEContainer )
                    // InternalMyDsl.g:452:6: lv_econtainer_32_0= ruleEContainer
                    {

                    						newCompositeNode(grammarAccess.getERootAccess().getEcontainerEContainerParserRuleCall_10_1_0());
                    					
                    pushFollow(FOLLOW_20);
                    lv_econtainer_32_0=ruleEContainer();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getERootRule());
                    						}
                    						add(
                    							current,
                    							"econtainer",
                    							lv_econtainer_32_0,
                    							"org.xtext.example.mydsl.MyDsl.EContainer");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:469:4: (otherlv_33= ',' ( (lv_econtainer_34_0= ruleEContainer ) ) )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==14) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // InternalMyDsl.g:470:5: otherlv_33= ',' ( (lv_econtainer_34_0= ruleEContainer ) )
                    	    {
                    	    otherlv_33=(Token)match(input,14,FOLLOW_19); 

                    	    					newLeafNode(otherlv_33, grammarAccess.getERootAccess().getCommaKeyword_10_2_0());
                    	    				
                    	    // InternalMyDsl.g:474:5: ( (lv_econtainer_34_0= ruleEContainer ) )
                    	    // InternalMyDsl.g:475:6: (lv_econtainer_34_0= ruleEContainer )
                    	    {
                    	    // InternalMyDsl.g:475:6: (lv_econtainer_34_0= ruleEContainer )
                    	    // InternalMyDsl.g:476:7: lv_econtainer_34_0= ruleEContainer
                    	    {

                    	    							newCompositeNode(grammarAccess.getERootAccess().getEcontainerEContainerParserRuleCall_10_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_20);
                    	    lv_econtainer_34_0=ruleEContainer();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getERootRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"econtainer",
                    	    								lv_econtainer_34_0,
                    	    								"org.xtext.example.mydsl.MyDsl.EContainer");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalMyDsl.g:495:3: (otherlv_35= 'eassemblyconnector:' ( (lv_eassemblyconnector_36_0= ruleEAssemblyConnector ) ) (otherlv_37= ',' ( (lv_eassemblyconnector_38_0= ruleEAssemblyConnector ) ) )* )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==22) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalMyDsl.g:496:4: otherlv_35= 'eassemblyconnector:' ( (lv_eassemblyconnector_36_0= ruleEAssemblyConnector ) ) (otherlv_37= ',' ( (lv_eassemblyconnector_38_0= ruleEAssemblyConnector ) ) )*
                    {
                    otherlv_35=(Token)match(input,22,FOLLOW_21); 

                    				newLeafNode(otherlv_35, grammarAccess.getERootAccess().getEassemblyconnectorKeyword_11_0());
                    			
                    // InternalMyDsl.g:500:4: ( (lv_eassemblyconnector_36_0= ruleEAssemblyConnector ) )
                    // InternalMyDsl.g:501:5: (lv_eassemblyconnector_36_0= ruleEAssemblyConnector )
                    {
                    // InternalMyDsl.g:501:5: (lv_eassemblyconnector_36_0= ruleEAssemblyConnector )
                    // InternalMyDsl.g:502:6: lv_eassemblyconnector_36_0= ruleEAssemblyConnector
                    {

                    						newCompositeNode(grammarAccess.getERootAccess().getEassemblyconnectorEAssemblyConnectorParserRuleCall_11_1_0());
                    					
                    pushFollow(FOLLOW_22);
                    lv_eassemblyconnector_36_0=ruleEAssemblyConnector();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getERootRule());
                    						}
                    						add(
                    							current,
                    							"eassemblyconnector",
                    							lv_eassemblyconnector_36_0,
                    							"org.xtext.example.mydsl.MyDsl.EAssemblyConnector");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:519:4: (otherlv_37= ',' ( (lv_eassemblyconnector_38_0= ruleEAssemblyConnector ) ) )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==14) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // InternalMyDsl.g:520:5: otherlv_37= ',' ( (lv_eassemblyconnector_38_0= ruleEAssemblyConnector ) )
                    	    {
                    	    otherlv_37=(Token)match(input,14,FOLLOW_21); 

                    	    					newLeafNode(otherlv_37, grammarAccess.getERootAccess().getCommaKeyword_11_2_0());
                    	    				
                    	    // InternalMyDsl.g:524:5: ( (lv_eassemblyconnector_38_0= ruleEAssemblyConnector ) )
                    	    // InternalMyDsl.g:525:6: (lv_eassemblyconnector_38_0= ruleEAssemblyConnector )
                    	    {
                    	    // InternalMyDsl.g:525:6: (lv_eassemblyconnector_38_0= ruleEAssemblyConnector )
                    	    // InternalMyDsl.g:526:7: lv_eassemblyconnector_38_0= ruleEAssemblyConnector
                    	    {

                    	    							newCompositeNode(grammarAccess.getERootAccess().getEassemblyconnectorEAssemblyConnectorParserRuleCall_11_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_22);
                    	    lv_eassemblyconnector_38_0=ruleEAssemblyConnector();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getERootRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"eassemblyconnector",
                    	    								lv_eassemblyconnector_38_0,
                    	    								"org.xtext.example.mydsl.MyDsl.EAssemblyConnector");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop17;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalMyDsl.g:545:3: (otherlv_39= 'eassemblycontext:' ( (lv_eassemblycontext_40_0= ruleEAssemblyContext ) ) (otherlv_41= ',' ( (lv_eassemblycontext_42_0= ruleEAssemblyContext ) ) )* )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==23) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalMyDsl.g:546:4: otherlv_39= 'eassemblycontext:' ( (lv_eassemblycontext_40_0= ruleEAssemblyContext ) ) (otherlv_41= ',' ( (lv_eassemblycontext_42_0= ruleEAssemblyContext ) ) )*
                    {
                    otherlv_39=(Token)match(input,23,FOLLOW_23); 

                    				newLeafNode(otherlv_39, grammarAccess.getERootAccess().getEassemblycontextKeyword_12_0());
                    			
                    // InternalMyDsl.g:550:4: ( (lv_eassemblycontext_40_0= ruleEAssemblyContext ) )
                    // InternalMyDsl.g:551:5: (lv_eassemblycontext_40_0= ruleEAssemblyContext )
                    {
                    // InternalMyDsl.g:551:5: (lv_eassemblycontext_40_0= ruleEAssemblyContext )
                    // InternalMyDsl.g:552:6: lv_eassemblycontext_40_0= ruleEAssemblyContext
                    {

                    						newCompositeNode(grammarAccess.getERootAccess().getEassemblycontextEAssemblyContextParserRuleCall_12_1_0());
                    					
                    pushFollow(FOLLOW_24);
                    lv_eassemblycontext_40_0=ruleEAssemblyContext();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getERootRule());
                    						}
                    						add(
                    							current,
                    							"eassemblycontext",
                    							lv_eassemblycontext_40_0,
                    							"org.xtext.example.mydsl.MyDsl.EAssemblyContext");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:569:4: (otherlv_41= ',' ( (lv_eassemblycontext_42_0= ruleEAssemblyContext ) ) )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==14) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // InternalMyDsl.g:570:5: otherlv_41= ',' ( (lv_eassemblycontext_42_0= ruleEAssemblyContext ) )
                    	    {
                    	    otherlv_41=(Token)match(input,14,FOLLOW_23); 

                    	    					newLeafNode(otherlv_41, grammarAccess.getERootAccess().getCommaKeyword_12_2_0());
                    	    				
                    	    // InternalMyDsl.g:574:5: ( (lv_eassemblycontext_42_0= ruleEAssemblyContext ) )
                    	    // InternalMyDsl.g:575:6: (lv_eassemblycontext_42_0= ruleEAssemblyContext )
                    	    {
                    	    // InternalMyDsl.g:575:6: (lv_eassemblycontext_42_0= ruleEAssemblyContext )
                    	    // InternalMyDsl.g:576:7: lv_eassemblycontext_42_0= ruleEAssemblyContext
                    	    {

                    	    							newCompositeNode(grammarAccess.getERootAccess().getEassemblycontextEAssemblyContextParserRuleCall_12_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_24);
                    	    lv_eassemblycontext_42_0=ruleEAssemblyContext();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getERootRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"eassemblycontext",
                    	    								lv_eassemblycontext_42_0,
                    	    								"org.xtext.example.mydsl.MyDsl.EAssemblyContext");
                    	    							afterParserOrEnumRuleCall();
                    	    						

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

            // InternalMyDsl.g:595:3: (otherlv_43= 'ecomponent:' ( (lv_ecomponent_44_0= ruleEComponent ) ) (otherlv_45= ',' ( (lv_ecomponent_46_0= ruleEComponent ) ) )* )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==24) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalMyDsl.g:596:4: otherlv_43= 'ecomponent:' ( (lv_ecomponent_44_0= ruleEComponent ) ) (otherlv_45= ',' ( (lv_ecomponent_46_0= ruleEComponent ) ) )*
                    {
                    otherlv_43=(Token)match(input,24,FOLLOW_25); 

                    				newLeafNode(otherlv_43, grammarAccess.getERootAccess().getEcomponentKeyword_13_0());
                    			
                    // InternalMyDsl.g:600:4: ( (lv_ecomponent_44_0= ruleEComponent ) )
                    // InternalMyDsl.g:601:5: (lv_ecomponent_44_0= ruleEComponent )
                    {
                    // InternalMyDsl.g:601:5: (lv_ecomponent_44_0= ruleEComponent )
                    // InternalMyDsl.g:602:6: lv_ecomponent_44_0= ruleEComponent
                    {

                    						newCompositeNode(grammarAccess.getERootAccess().getEcomponentEComponentParserRuleCall_13_1_0());
                    					
                    pushFollow(FOLLOW_26);
                    lv_ecomponent_44_0=ruleEComponent();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getERootRule());
                    						}
                    						add(
                    							current,
                    							"ecomponent",
                    							lv_ecomponent_44_0,
                    							"org.xtext.example.mydsl.MyDsl.EComponent");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:619:4: (otherlv_45= ',' ( (lv_ecomponent_46_0= ruleEComponent ) ) )*
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0==14) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // InternalMyDsl.g:620:5: otherlv_45= ',' ( (lv_ecomponent_46_0= ruleEComponent ) )
                    	    {
                    	    otherlv_45=(Token)match(input,14,FOLLOW_25); 

                    	    					newLeafNode(otherlv_45, grammarAccess.getERootAccess().getCommaKeyword_13_2_0());
                    	    				
                    	    // InternalMyDsl.g:624:5: ( (lv_ecomponent_46_0= ruleEComponent ) )
                    	    // InternalMyDsl.g:625:6: (lv_ecomponent_46_0= ruleEComponent )
                    	    {
                    	    // InternalMyDsl.g:625:6: (lv_ecomponent_46_0= ruleEComponent )
                    	    // InternalMyDsl.g:626:7: lv_ecomponent_46_0= ruleEComponent
                    	    {

                    	    							newCompositeNode(grammarAccess.getERootAccess().getEcomponentEComponentParserRuleCall_13_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_26);
                    	    lv_ecomponent_46_0=ruleEComponent();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getERootRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"ecomponent",
                    	    								lv_ecomponent_46_0,
                    	    								"org.xtext.example.mydsl.MyDsl.EComponent");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop21;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalMyDsl.g:645:3: (otherlv_47= 'eservice:' ( (lv_eservice_48_0= ruleEService ) ) (otherlv_49= ',' ( (lv_eservice_50_0= ruleEService ) ) )* )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==25) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalMyDsl.g:646:4: otherlv_47= 'eservice:' ( (lv_eservice_48_0= ruleEService ) ) (otherlv_49= ',' ( (lv_eservice_50_0= ruleEService ) ) )*
                    {
                    otherlv_47=(Token)match(input,25,FOLLOW_27); 

                    				newLeafNode(otherlv_47, grammarAccess.getERootAccess().getEserviceKeyword_14_0());
                    			
                    // InternalMyDsl.g:650:4: ( (lv_eservice_48_0= ruleEService ) )
                    // InternalMyDsl.g:651:5: (lv_eservice_48_0= ruleEService )
                    {
                    // InternalMyDsl.g:651:5: (lv_eservice_48_0= ruleEService )
                    // InternalMyDsl.g:652:6: lv_eservice_48_0= ruleEService
                    {

                    						newCompositeNode(grammarAccess.getERootAccess().getEserviceEServiceParserRuleCall_14_1_0());
                    					
                    pushFollow(FOLLOW_28);
                    lv_eservice_48_0=ruleEService();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getERootRule());
                    						}
                    						add(
                    							current,
                    							"eservice",
                    							lv_eservice_48_0,
                    							"org.xtext.example.mydsl.MyDsl.EService");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:669:4: (otherlv_49= ',' ( (lv_eservice_50_0= ruleEService ) ) )*
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==14) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // InternalMyDsl.g:670:5: otherlv_49= ',' ( (lv_eservice_50_0= ruleEService ) )
                    	    {
                    	    otherlv_49=(Token)match(input,14,FOLLOW_27); 

                    	    					newLeafNode(otherlv_49, grammarAccess.getERootAccess().getCommaKeyword_14_2_0());
                    	    				
                    	    // InternalMyDsl.g:674:5: ( (lv_eservice_50_0= ruleEService ) )
                    	    // InternalMyDsl.g:675:6: (lv_eservice_50_0= ruleEService )
                    	    {
                    	    // InternalMyDsl.g:675:6: (lv_eservice_50_0= ruleEService )
                    	    // InternalMyDsl.g:676:7: lv_eservice_50_0= ruleEService
                    	    {

                    	    							newCompositeNode(grammarAccess.getERootAccess().getEserviceEServiceParserRuleCall_14_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_28);
                    	    lv_eservice_50_0=ruleEService();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getERootRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"eservice",
                    	    								lv_eservice_50_0,
                    	    								"org.xtext.example.mydsl.MyDsl.EService");
                    	    							afterParserOrEnumRuleCall();
                    	    						

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

            // InternalMyDsl.g:695:3: (otherlv_51= 'einterface:' ( (lv_einterface_52_0= ruleEInterface ) ) (otherlv_53= ',' ( (lv_einterface_54_0= ruleEInterface ) ) )* )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==26) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalMyDsl.g:696:4: otherlv_51= 'einterface:' ( (lv_einterface_52_0= ruleEInterface ) ) (otherlv_53= ',' ( (lv_einterface_54_0= ruleEInterface ) ) )*
                    {
                    otherlv_51=(Token)match(input,26,FOLLOW_29); 

                    				newLeafNode(otherlv_51, grammarAccess.getERootAccess().getEinterfaceKeyword_15_0());
                    			
                    // InternalMyDsl.g:700:4: ( (lv_einterface_52_0= ruleEInterface ) )
                    // InternalMyDsl.g:701:5: (lv_einterface_52_0= ruleEInterface )
                    {
                    // InternalMyDsl.g:701:5: (lv_einterface_52_0= ruleEInterface )
                    // InternalMyDsl.g:702:6: lv_einterface_52_0= ruleEInterface
                    {

                    						newCompositeNode(grammarAccess.getERootAccess().getEinterfaceEInterfaceParserRuleCall_15_1_0());
                    					
                    pushFollow(FOLLOW_30);
                    lv_einterface_52_0=ruleEInterface();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getERootRule());
                    						}
                    						add(
                    							current,
                    							"einterface",
                    							lv_einterface_52_0,
                    							"org.xtext.example.mydsl.MyDsl.EInterface");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:719:4: (otherlv_53= ',' ( (lv_einterface_54_0= ruleEInterface ) ) )*
                    loop25:
                    do {
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( (LA25_0==14) ) {
                            alt25=1;
                        }


                        switch (alt25) {
                    	case 1 :
                    	    // InternalMyDsl.g:720:5: otherlv_53= ',' ( (lv_einterface_54_0= ruleEInterface ) )
                    	    {
                    	    otherlv_53=(Token)match(input,14,FOLLOW_29); 

                    	    					newLeafNode(otherlv_53, grammarAccess.getERootAccess().getCommaKeyword_15_2_0());
                    	    				
                    	    // InternalMyDsl.g:724:5: ( (lv_einterface_54_0= ruleEInterface ) )
                    	    // InternalMyDsl.g:725:6: (lv_einterface_54_0= ruleEInterface )
                    	    {
                    	    // InternalMyDsl.g:725:6: (lv_einterface_54_0= ruleEInterface )
                    	    // InternalMyDsl.g:726:7: lv_einterface_54_0= ruleEInterface
                    	    {

                    	    							newCompositeNode(grammarAccess.getERootAccess().getEinterfaceEInterfaceParserRuleCall_15_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_30);
                    	    lv_einterface_54_0=ruleEInterface();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getERootRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"einterface",
                    	    								lv_einterface_54_0,
                    	    								"org.xtext.example.mydsl.MyDsl.EInterface");
                    	    							afterParserOrEnumRuleCall();
                    	    						

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

            // InternalMyDsl.g:745:3: (otherlv_55= 'esystem:' ( (lv_esystem_56_0= ruleESystem ) ) (otherlv_57= ',' ( (lv_esystem_58_0= ruleESystem ) ) )* )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==27) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalMyDsl.g:746:4: otherlv_55= 'esystem:' ( (lv_esystem_56_0= ruleESystem ) ) (otherlv_57= ',' ( (lv_esystem_58_0= ruleESystem ) ) )*
                    {
                    otherlv_55=(Token)match(input,27,FOLLOW_31); 

                    				newLeafNode(otherlv_55, grammarAccess.getERootAccess().getEsystemKeyword_16_0());
                    			
                    // InternalMyDsl.g:750:4: ( (lv_esystem_56_0= ruleESystem ) )
                    // InternalMyDsl.g:751:5: (lv_esystem_56_0= ruleESystem )
                    {
                    // InternalMyDsl.g:751:5: (lv_esystem_56_0= ruleESystem )
                    // InternalMyDsl.g:752:6: lv_esystem_56_0= ruleESystem
                    {

                    						newCompositeNode(grammarAccess.getERootAccess().getEsystemESystemParserRuleCall_16_1_0());
                    					
                    pushFollow(FOLLOW_32);
                    lv_esystem_56_0=ruleESystem();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getERootRule());
                    						}
                    						add(
                    							current,
                    							"esystem",
                    							lv_esystem_56_0,
                    							"org.xtext.example.mydsl.MyDsl.ESystem");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:769:4: (otherlv_57= ',' ( (lv_esystem_58_0= ruleESystem ) ) )*
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( (LA27_0==14) ) {
                            alt27=1;
                        }


                        switch (alt27) {
                    	case 1 :
                    	    // InternalMyDsl.g:770:5: otherlv_57= ',' ( (lv_esystem_58_0= ruleESystem ) )
                    	    {
                    	    otherlv_57=(Token)match(input,14,FOLLOW_31); 

                    	    					newLeafNode(otherlv_57, grammarAccess.getERootAccess().getCommaKeyword_16_2_0());
                    	    				
                    	    // InternalMyDsl.g:774:5: ( (lv_esystem_58_0= ruleESystem ) )
                    	    // InternalMyDsl.g:775:6: (lv_esystem_58_0= ruleESystem )
                    	    {
                    	    // InternalMyDsl.g:775:6: (lv_esystem_58_0= ruleESystem )
                    	    // InternalMyDsl.g:776:7: lv_esystem_58_0= ruleESystem
                    	    {

                    	    							newCompositeNode(grammarAccess.getERootAccess().getEsystemESystemParserRuleCall_16_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_32);
                    	    lv_esystem_58_0=ruleESystem();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getERootRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"esystem",
                    	    								lv_esystem_58_0,
                    	    								"org.xtext.example.mydsl.MyDsl.ESystem");
                    	    							afterParserOrEnumRuleCall();
                    	    						

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

            // InternalMyDsl.g:795:3: (otherlv_59= 'erepository:' ( (lv_erepository_60_0= ruleERepository ) ) (otherlv_61= ',' ( (lv_erepository_62_0= ruleERepository ) ) )* )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==28) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalMyDsl.g:796:4: otherlv_59= 'erepository:' ( (lv_erepository_60_0= ruleERepository ) ) (otherlv_61= ',' ( (lv_erepository_62_0= ruleERepository ) ) )*
                    {
                    otherlv_59=(Token)match(input,28,FOLLOW_33); 

                    				newLeafNode(otherlv_59, grammarAccess.getERootAccess().getErepositoryKeyword_17_0());
                    			
                    // InternalMyDsl.g:800:4: ( (lv_erepository_60_0= ruleERepository ) )
                    // InternalMyDsl.g:801:5: (lv_erepository_60_0= ruleERepository )
                    {
                    // InternalMyDsl.g:801:5: (lv_erepository_60_0= ruleERepository )
                    // InternalMyDsl.g:802:6: lv_erepository_60_0= ruleERepository
                    {

                    						newCompositeNode(grammarAccess.getERootAccess().getErepositoryERepositoryParserRuleCall_17_1_0());
                    					
                    pushFollow(FOLLOW_34);
                    lv_erepository_60_0=ruleERepository();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getERootRule());
                    						}
                    						add(
                    							current,
                    							"erepository",
                    							lv_erepository_60_0,
                    							"org.xtext.example.mydsl.MyDsl.ERepository");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:819:4: (otherlv_61= ',' ( (lv_erepository_62_0= ruleERepository ) ) )*
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( (LA29_0==14) ) {
                            alt29=1;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // InternalMyDsl.g:820:5: otherlv_61= ',' ( (lv_erepository_62_0= ruleERepository ) )
                    	    {
                    	    otherlv_61=(Token)match(input,14,FOLLOW_33); 

                    	    					newLeafNode(otherlv_61, grammarAccess.getERootAccess().getCommaKeyword_17_2_0());
                    	    				
                    	    // InternalMyDsl.g:824:5: ( (lv_erepository_62_0= ruleERepository ) )
                    	    // InternalMyDsl.g:825:6: (lv_erepository_62_0= ruleERepository )
                    	    {
                    	    // InternalMyDsl.g:825:6: (lv_erepository_62_0= ruleERepository )
                    	    // InternalMyDsl.g:826:7: lv_erepository_62_0= ruleERepository
                    	    {

                    	    							newCompositeNode(grammarAccess.getERootAccess().getErepositoryERepositoryParserRuleCall_17_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_34);
                    	    lv_erepository_62_0=ruleERepository();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getERootRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"erepository",
                    	    								lv_erepository_62_0,
                    	    								"org.xtext.example.mydsl.MyDsl.ERepository");
                    	    							afterParserOrEnumRuleCall();
                    	    						

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

            // InternalMyDsl.g:845:3: (otherlv_63= 'ebehaviourdescription:' ( (lv_ebehaviourdescription_64_0= ruleEBehaviourDescription ) ) (otherlv_65= ',' ( (lv_ebehaviourdescription_66_0= ruleEBehaviourDescription ) ) )* )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==29) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalMyDsl.g:846:4: otherlv_63= 'ebehaviourdescription:' ( (lv_ebehaviourdescription_64_0= ruleEBehaviourDescription ) ) (otherlv_65= ',' ( (lv_ebehaviourdescription_66_0= ruleEBehaviourDescription ) ) )*
                    {
                    otherlv_63=(Token)match(input,29,FOLLOW_35); 

                    				newLeafNode(otherlv_63, grammarAccess.getERootAccess().getEbehaviourdescriptionKeyword_18_0());
                    			
                    // InternalMyDsl.g:850:4: ( (lv_ebehaviourdescription_64_0= ruleEBehaviourDescription ) )
                    // InternalMyDsl.g:851:5: (lv_ebehaviourdescription_64_0= ruleEBehaviourDescription )
                    {
                    // InternalMyDsl.g:851:5: (lv_ebehaviourdescription_64_0= ruleEBehaviourDescription )
                    // InternalMyDsl.g:852:6: lv_ebehaviourdescription_64_0= ruleEBehaviourDescription
                    {

                    						newCompositeNode(grammarAccess.getERootAccess().getEbehaviourdescriptionEBehaviourDescriptionParserRuleCall_18_1_0());
                    					
                    pushFollow(FOLLOW_36);
                    lv_ebehaviourdescription_64_0=ruleEBehaviourDescription();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getERootRule());
                    						}
                    						add(
                    							current,
                    							"ebehaviourdescription",
                    							lv_ebehaviourdescription_64_0,
                    							"org.xtext.example.mydsl.MyDsl.EBehaviourDescription");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:869:4: (otherlv_65= ',' ( (lv_ebehaviourdescription_66_0= ruleEBehaviourDescription ) ) )*
                    loop31:
                    do {
                        int alt31=2;
                        int LA31_0 = input.LA(1);

                        if ( (LA31_0==14) ) {
                            alt31=1;
                        }


                        switch (alt31) {
                    	case 1 :
                    	    // InternalMyDsl.g:870:5: otherlv_65= ',' ( (lv_ebehaviourdescription_66_0= ruleEBehaviourDescription ) )
                    	    {
                    	    otherlv_65=(Token)match(input,14,FOLLOW_35); 

                    	    					newLeafNode(otherlv_65, grammarAccess.getERootAccess().getCommaKeyword_18_2_0());
                    	    				
                    	    // InternalMyDsl.g:874:5: ( (lv_ebehaviourdescription_66_0= ruleEBehaviourDescription ) )
                    	    // InternalMyDsl.g:875:6: (lv_ebehaviourdescription_66_0= ruleEBehaviourDescription )
                    	    {
                    	    // InternalMyDsl.g:875:6: (lv_ebehaviourdescription_66_0= ruleEBehaviourDescription )
                    	    // InternalMyDsl.g:876:7: lv_ebehaviourdescription_66_0= ruleEBehaviourDescription
                    	    {

                    	    							newCompositeNode(grammarAccess.getERootAccess().getEbehaviourdescriptionEBehaviourDescriptionParserRuleCall_18_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_36);
                    	    lv_ebehaviourdescription_66_0=ruleEBehaviourDescription();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getERootRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"ebehaviourdescription",
                    	    								lv_ebehaviourdescription_66_0,
                    	    								"org.xtext.example.mydsl.MyDsl.EBehaviourDescription");
                    	    							afterParserOrEnumRuleCall();
                    	    						

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

            // InternalMyDsl.g:895:3: (otherlv_67= 'eexternalcall:' ( (lv_eexternalcall_68_0= ruleEExternalCall ) ) (otherlv_69= ',' ( (lv_eexternalcall_70_0= ruleEExternalCall ) ) )* )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==30) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalMyDsl.g:896:4: otherlv_67= 'eexternalcall:' ( (lv_eexternalcall_68_0= ruleEExternalCall ) ) (otherlv_69= ',' ( (lv_eexternalcall_70_0= ruleEExternalCall ) ) )*
                    {
                    otherlv_67=(Token)match(input,30,FOLLOW_37); 

                    				newLeafNode(otherlv_67, grammarAccess.getERootAccess().getEexternalcallKeyword_19_0());
                    			
                    // InternalMyDsl.g:900:4: ( (lv_eexternalcall_68_0= ruleEExternalCall ) )
                    // InternalMyDsl.g:901:5: (lv_eexternalcall_68_0= ruleEExternalCall )
                    {
                    // InternalMyDsl.g:901:5: (lv_eexternalcall_68_0= ruleEExternalCall )
                    // InternalMyDsl.g:902:6: lv_eexternalcall_68_0= ruleEExternalCall
                    {

                    						newCompositeNode(grammarAccess.getERootAccess().getEexternalcallEExternalCallParserRuleCall_19_1_0());
                    					
                    pushFollow(FOLLOW_38);
                    lv_eexternalcall_68_0=ruleEExternalCall();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getERootRule());
                    						}
                    						add(
                    							current,
                    							"eexternalcall",
                    							lv_eexternalcall_68_0,
                    							"org.xtext.example.mydsl.MyDsl.EExternalCall");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:919:4: (otherlv_69= ',' ( (lv_eexternalcall_70_0= ruleEExternalCall ) ) )*
                    loop33:
                    do {
                        int alt33=2;
                        int LA33_0 = input.LA(1);

                        if ( (LA33_0==14) ) {
                            alt33=1;
                        }


                        switch (alt33) {
                    	case 1 :
                    	    // InternalMyDsl.g:920:5: otherlv_69= ',' ( (lv_eexternalcall_70_0= ruleEExternalCall ) )
                    	    {
                    	    otherlv_69=(Token)match(input,14,FOLLOW_37); 

                    	    					newLeafNode(otherlv_69, grammarAccess.getERootAccess().getCommaKeyword_19_2_0());
                    	    				
                    	    // InternalMyDsl.g:924:5: ( (lv_eexternalcall_70_0= ruleEExternalCall ) )
                    	    // InternalMyDsl.g:925:6: (lv_eexternalcall_70_0= ruleEExternalCall )
                    	    {
                    	    // InternalMyDsl.g:925:6: (lv_eexternalcall_70_0= ruleEExternalCall )
                    	    // InternalMyDsl.g:926:7: lv_eexternalcall_70_0= ruleEExternalCall
                    	    {

                    	    							newCompositeNode(grammarAccess.getERootAccess().getEexternalcallEExternalCallParserRuleCall_19_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_38);
                    	    lv_eexternalcall_70_0=ruleEExternalCall();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getERootRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"eexternalcall",
                    	    								lv_eexternalcall_70_0,
                    	    								"org.xtext.example.mydsl.MyDsl.EExternalCall");
                    	    							afterParserOrEnumRuleCall();
                    	    						

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

            // InternalMyDsl.g:945:3: (otherlv_71= 'einternalaction:' ( (lv_einternalaction_72_0= ruleEInternalAction ) ) (otherlv_73= ',' ( (lv_einternalaction_74_0= ruleEInternalAction ) ) )* )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==31) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalMyDsl.g:946:4: otherlv_71= 'einternalaction:' ( (lv_einternalaction_72_0= ruleEInternalAction ) ) (otherlv_73= ',' ( (lv_einternalaction_74_0= ruleEInternalAction ) ) )*
                    {
                    otherlv_71=(Token)match(input,31,FOLLOW_39); 

                    				newLeafNode(otherlv_71, grammarAccess.getERootAccess().getEinternalactionKeyword_20_0());
                    			
                    // InternalMyDsl.g:950:4: ( (lv_einternalaction_72_0= ruleEInternalAction ) )
                    // InternalMyDsl.g:951:5: (lv_einternalaction_72_0= ruleEInternalAction )
                    {
                    // InternalMyDsl.g:951:5: (lv_einternalaction_72_0= ruleEInternalAction )
                    // InternalMyDsl.g:952:6: lv_einternalaction_72_0= ruleEInternalAction
                    {

                    						newCompositeNode(grammarAccess.getERootAccess().getEinternalactionEInternalActionParserRuleCall_20_1_0());
                    					
                    pushFollow(FOLLOW_40);
                    lv_einternalaction_72_0=ruleEInternalAction();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getERootRule());
                    						}
                    						add(
                    							current,
                    							"einternalaction",
                    							lv_einternalaction_72_0,
                    							"org.xtext.example.mydsl.MyDsl.EInternalAction");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:969:4: (otherlv_73= ',' ( (lv_einternalaction_74_0= ruleEInternalAction ) ) )*
                    loop35:
                    do {
                        int alt35=2;
                        int LA35_0 = input.LA(1);

                        if ( (LA35_0==14) ) {
                            alt35=1;
                        }


                        switch (alt35) {
                    	case 1 :
                    	    // InternalMyDsl.g:970:5: otherlv_73= ',' ( (lv_einternalaction_74_0= ruleEInternalAction ) )
                    	    {
                    	    otherlv_73=(Token)match(input,14,FOLLOW_39); 

                    	    					newLeafNode(otherlv_73, grammarAccess.getERootAccess().getCommaKeyword_20_2_0());
                    	    				
                    	    // InternalMyDsl.g:974:5: ( (lv_einternalaction_74_0= ruleEInternalAction ) )
                    	    // InternalMyDsl.g:975:6: (lv_einternalaction_74_0= ruleEInternalAction )
                    	    {
                    	    // InternalMyDsl.g:975:6: (lv_einternalaction_74_0= ruleEInternalAction )
                    	    // InternalMyDsl.g:976:7: lv_einternalaction_74_0= ruleEInternalAction
                    	    {

                    	    							newCompositeNode(grammarAccess.getERootAccess().getEinternalactionEInternalActionParserRuleCall_20_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_40);
                    	    lv_einternalaction_74_0=ruleEInternalAction();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getERootRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"einternalaction",
                    	    								lv_einternalaction_74_0,
                    	    								"org.xtext.example.mydsl.MyDsl.EInternalAction");
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

            // InternalMyDsl.g:995:3: (otherlv_75= 'ebranch:' ( (lv_ebranch_76_0= ruleEBranch ) ) (otherlv_77= ',' ( (lv_ebranch_78_0= ruleEBranch ) ) )* )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==32) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalMyDsl.g:996:4: otherlv_75= 'ebranch:' ( (lv_ebranch_76_0= ruleEBranch ) ) (otherlv_77= ',' ( (lv_ebranch_78_0= ruleEBranch ) ) )*
                    {
                    otherlv_75=(Token)match(input,32,FOLLOW_41); 

                    				newLeafNode(otherlv_75, grammarAccess.getERootAccess().getEbranchKeyword_21_0());
                    			
                    // InternalMyDsl.g:1000:4: ( (lv_ebranch_76_0= ruleEBranch ) )
                    // InternalMyDsl.g:1001:5: (lv_ebranch_76_0= ruleEBranch )
                    {
                    // InternalMyDsl.g:1001:5: (lv_ebranch_76_0= ruleEBranch )
                    // InternalMyDsl.g:1002:6: lv_ebranch_76_0= ruleEBranch
                    {

                    						newCompositeNode(grammarAccess.getERootAccess().getEbranchEBranchParserRuleCall_21_1_0());
                    					
                    pushFollow(FOLLOW_42);
                    lv_ebranch_76_0=ruleEBranch();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getERootRule());
                    						}
                    						add(
                    							current,
                    							"ebranch",
                    							lv_ebranch_76_0,
                    							"org.xtext.example.mydsl.MyDsl.EBranch");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:1019:4: (otherlv_77= ',' ( (lv_ebranch_78_0= ruleEBranch ) ) )*
                    loop37:
                    do {
                        int alt37=2;
                        int LA37_0 = input.LA(1);

                        if ( (LA37_0==14) ) {
                            alt37=1;
                        }


                        switch (alt37) {
                    	case 1 :
                    	    // InternalMyDsl.g:1020:5: otherlv_77= ',' ( (lv_ebranch_78_0= ruleEBranch ) )
                    	    {
                    	    otherlv_77=(Token)match(input,14,FOLLOW_41); 

                    	    					newLeafNode(otherlv_77, grammarAccess.getERootAccess().getCommaKeyword_21_2_0());
                    	    				
                    	    // InternalMyDsl.g:1024:5: ( (lv_ebranch_78_0= ruleEBranch ) )
                    	    // InternalMyDsl.g:1025:6: (lv_ebranch_78_0= ruleEBranch )
                    	    {
                    	    // InternalMyDsl.g:1025:6: (lv_ebranch_78_0= ruleEBranch )
                    	    // InternalMyDsl.g:1026:7: lv_ebranch_78_0= ruleEBranch
                    	    {

                    	    							newCompositeNode(grammarAccess.getERootAccess().getEbranchEBranchParserRuleCall_21_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_42);
                    	    lv_ebranch_78_0=ruleEBranch();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getERootRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"ebranch",
                    	    								lv_ebranch_78_0,
                    	    								"org.xtext.example.mydsl.MyDsl.EBranch");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop37;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalMyDsl.g:1045:3: (otherlv_79= 'eloop:' ( (lv_eloop_80_0= ruleELoop ) ) (otherlv_81= ',' ( (lv_eloop_82_0= ruleELoop ) ) )* )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==33) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalMyDsl.g:1046:4: otherlv_79= 'eloop:' ( (lv_eloop_80_0= ruleELoop ) ) (otherlv_81= ',' ( (lv_eloop_82_0= ruleELoop ) ) )*
                    {
                    otherlv_79=(Token)match(input,33,FOLLOW_43); 

                    				newLeafNode(otherlv_79, grammarAccess.getERootAccess().getEloopKeyword_22_0());
                    			
                    // InternalMyDsl.g:1050:4: ( (lv_eloop_80_0= ruleELoop ) )
                    // InternalMyDsl.g:1051:5: (lv_eloop_80_0= ruleELoop )
                    {
                    // InternalMyDsl.g:1051:5: (lv_eloop_80_0= ruleELoop )
                    // InternalMyDsl.g:1052:6: lv_eloop_80_0= ruleELoop
                    {

                    						newCompositeNode(grammarAccess.getERootAccess().getEloopELoopParserRuleCall_22_1_0());
                    					
                    pushFollow(FOLLOW_44);
                    lv_eloop_80_0=ruleELoop();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getERootRule());
                    						}
                    						add(
                    							current,
                    							"eloop",
                    							lv_eloop_80_0,
                    							"org.xtext.example.mydsl.MyDsl.ELoop");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:1069:4: (otherlv_81= ',' ( (lv_eloop_82_0= ruleELoop ) ) )*
                    loop39:
                    do {
                        int alt39=2;
                        int LA39_0 = input.LA(1);

                        if ( (LA39_0==14) ) {
                            alt39=1;
                        }


                        switch (alt39) {
                    	case 1 :
                    	    // InternalMyDsl.g:1070:5: otherlv_81= ',' ( (lv_eloop_82_0= ruleELoop ) )
                    	    {
                    	    otherlv_81=(Token)match(input,14,FOLLOW_43); 

                    	    					newLeafNode(otherlv_81, grammarAccess.getERootAccess().getCommaKeyword_22_2_0());
                    	    				
                    	    // InternalMyDsl.g:1074:5: ( (lv_eloop_82_0= ruleELoop ) )
                    	    // InternalMyDsl.g:1075:6: (lv_eloop_82_0= ruleELoop )
                    	    {
                    	    // InternalMyDsl.g:1075:6: (lv_eloop_82_0= ruleELoop )
                    	    // InternalMyDsl.g:1076:7: lv_eloop_82_0= ruleELoop
                    	    {

                    	    							newCompositeNode(grammarAccess.getERootAccess().getEloopELoopParserRuleCall_22_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_44);
                    	    lv_eloop_82_0=ruleELoop();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getERootRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"eloop",
                    	    								lv_eloop_82_0,
                    	    								"org.xtext.example.mydsl.MyDsl.ELoop");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop39;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalMyDsl.g:1095:3: (otherlv_83= 'ecompositecomponent:' ( (lv_ecompositecomponent_84_0= ruleECompositeComponent ) ) (otherlv_85= ',' ( (lv_ecompositecomponent_86_0= ruleECompositeComponent ) ) )* )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==34) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalMyDsl.g:1096:4: otherlv_83= 'ecompositecomponent:' ( (lv_ecompositecomponent_84_0= ruleECompositeComponent ) ) (otherlv_85= ',' ( (lv_ecompositecomponent_86_0= ruleECompositeComponent ) ) )*
                    {
                    otherlv_83=(Token)match(input,34,FOLLOW_25); 

                    				newLeafNode(otherlv_83, grammarAccess.getERootAccess().getEcompositecomponentKeyword_23_0());
                    			
                    // InternalMyDsl.g:1100:4: ( (lv_ecompositecomponent_84_0= ruleECompositeComponent ) )
                    // InternalMyDsl.g:1101:5: (lv_ecompositecomponent_84_0= ruleECompositeComponent )
                    {
                    // InternalMyDsl.g:1101:5: (lv_ecompositecomponent_84_0= ruleECompositeComponent )
                    // InternalMyDsl.g:1102:6: lv_ecompositecomponent_84_0= ruleECompositeComponent
                    {

                    						newCompositeNode(grammarAccess.getERootAccess().getEcompositecomponentECompositeComponentParserRuleCall_23_1_0());
                    					
                    pushFollow(FOLLOW_45);
                    lv_ecompositecomponent_84_0=ruleECompositeComponent();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getERootRule());
                    						}
                    						add(
                    							current,
                    							"ecompositecomponent",
                    							lv_ecompositecomponent_84_0,
                    							"org.xtext.example.mydsl.MyDsl.ECompositeComponent");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:1119:4: (otherlv_85= ',' ( (lv_ecompositecomponent_86_0= ruleECompositeComponent ) ) )*
                    loop41:
                    do {
                        int alt41=2;
                        int LA41_0 = input.LA(1);

                        if ( (LA41_0==14) ) {
                            alt41=1;
                        }


                        switch (alt41) {
                    	case 1 :
                    	    // InternalMyDsl.g:1120:5: otherlv_85= ',' ( (lv_ecompositecomponent_86_0= ruleECompositeComponent ) )
                    	    {
                    	    otherlv_85=(Token)match(input,14,FOLLOW_25); 

                    	    					newLeafNode(otherlv_85, grammarAccess.getERootAccess().getCommaKeyword_23_2_0());
                    	    				
                    	    // InternalMyDsl.g:1124:5: ( (lv_ecompositecomponent_86_0= ruleECompositeComponent ) )
                    	    // InternalMyDsl.g:1125:6: (lv_ecompositecomponent_86_0= ruleECompositeComponent )
                    	    {
                    	    // InternalMyDsl.g:1125:6: (lv_ecompositecomponent_86_0= ruleECompositeComponent )
                    	    // InternalMyDsl.g:1126:7: lv_ecompositecomponent_86_0= ruleECompositeComponent
                    	    {

                    	    							newCompositeNode(grammarAccess.getERootAccess().getEcompositecomponentECompositeComponentParserRuleCall_23_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_45);
                    	    lv_ecompositecomponent_86_0=ruleECompositeComponent();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getERootRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"ecompositecomponent",
                    	    								lv_ecompositecomponent_86_0,
                    	    								"org.xtext.example.mydsl.MyDsl.ECompositeComponent");
                    	    							afterParserOrEnumRuleCall();
                    	    						

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

            // InternalMyDsl.g:1145:3: (otherlv_87= 'eallocationcontext:' ( (lv_eallocationcontext_88_0= ruleEAllocationContext ) ) (otherlv_89= ',' ( (lv_eallocationcontext_90_0= ruleEAllocationContext ) ) )* )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==35) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalMyDsl.g:1146:4: otherlv_87= 'eallocationcontext:' ( (lv_eallocationcontext_88_0= ruleEAllocationContext ) ) (otherlv_89= ',' ( (lv_eallocationcontext_90_0= ruleEAllocationContext ) ) )*
                    {
                    otherlv_87=(Token)match(input,35,FOLLOW_46); 

                    				newLeafNode(otherlv_87, grammarAccess.getERootAccess().getEallocationcontextKeyword_24_0());
                    			
                    // InternalMyDsl.g:1150:4: ( (lv_eallocationcontext_88_0= ruleEAllocationContext ) )
                    // InternalMyDsl.g:1151:5: (lv_eallocationcontext_88_0= ruleEAllocationContext )
                    {
                    // InternalMyDsl.g:1151:5: (lv_eallocationcontext_88_0= ruleEAllocationContext )
                    // InternalMyDsl.g:1152:6: lv_eallocationcontext_88_0= ruleEAllocationContext
                    {

                    						newCompositeNode(grammarAccess.getERootAccess().getEallocationcontextEAllocationContextParserRuleCall_24_1_0());
                    					
                    pushFollow(FOLLOW_47);
                    lv_eallocationcontext_88_0=ruleEAllocationContext();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getERootRule());
                    						}
                    						add(
                    							current,
                    							"eallocationcontext",
                    							lv_eallocationcontext_88_0,
                    							"org.xtext.example.mydsl.MyDsl.EAllocationContext");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:1169:4: (otherlv_89= ',' ( (lv_eallocationcontext_90_0= ruleEAllocationContext ) ) )*
                    loop43:
                    do {
                        int alt43=2;
                        int LA43_0 = input.LA(1);

                        if ( (LA43_0==14) ) {
                            alt43=1;
                        }


                        switch (alt43) {
                    	case 1 :
                    	    // InternalMyDsl.g:1170:5: otherlv_89= ',' ( (lv_eallocationcontext_90_0= ruleEAllocationContext ) )
                    	    {
                    	    otherlv_89=(Token)match(input,14,FOLLOW_46); 

                    	    					newLeafNode(otherlv_89, grammarAccess.getERootAccess().getCommaKeyword_24_2_0());
                    	    				
                    	    // InternalMyDsl.g:1174:5: ( (lv_eallocationcontext_90_0= ruleEAllocationContext ) )
                    	    // InternalMyDsl.g:1175:6: (lv_eallocationcontext_90_0= ruleEAllocationContext )
                    	    {
                    	    // InternalMyDsl.g:1175:6: (lv_eallocationcontext_90_0= ruleEAllocationContext )
                    	    // InternalMyDsl.g:1176:7: lv_eallocationcontext_90_0= ruleEAllocationContext
                    	    {

                    	    							newCompositeNode(grammarAccess.getERootAccess().getEallocationcontextEAllocationContextParserRuleCall_24_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_47);
                    	    lv_eallocationcontext_90_0=ruleEAllocationContext();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getERootRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"eallocationcontext",
                    	    								lv_eallocationcontext_90_0,
                    	    								"org.xtext.example.mydsl.MyDsl.EAllocationContext");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop43;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_91=(Token)match(input,36,FOLLOW_2); 

            			newLeafNode(otherlv_91, grammarAccess.getERootAccess().getRightCurlyBracketKeyword_25());
            		

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
    // $ANTLR end "ruleERoot"


    // $ANTLR start "entryRuleEInterface"
    // InternalMyDsl.g:1203:1: entryRuleEInterface returns [EObject current=null] : iv_ruleEInterface= ruleEInterface EOF ;
    public final EObject entryRuleEInterface() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEInterface = null;


        try {
            // InternalMyDsl.g:1203:51: (iv_ruleEInterface= ruleEInterface EOF )
            // InternalMyDsl.g:1204:2: iv_ruleEInterface= ruleEInterface EOF
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
    // InternalMyDsl.g:1210:1: ruleEInterface returns [EObject current=null] : ( () otherlv_1= 'EInterface' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'resultsIn:' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* )? (otherlv_8= 'providedByComponent:' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* )? (otherlv_12= 'providedBySystem:' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* )? (otherlv_16= 'requiredByComponent:' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* )? (otherlv_20= 'requiredBySystem:' ( ( ruleEString ) ) (otherlv_22= ',' ( ( ruleEString ) ) )* )? (otherlv_24= 'signature:' ( (lv_signature_25_0= ruleESignature ) ) (otherlv_26= ',' ( (lv_signature_27_0= ruleESignature ) ) )* )? otherlv_28= '}' ) ;
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
            // InternalMyDsl.g:1216:2: ( ( () otherlv_1= 'EInterface' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'resultsIn:' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* )? (otherlv_8= 'providedByComponent:' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* )? (otherlv_12= 'providedBySystem:' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* )? (otherlv_16= 'requiredByComponent:' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* )? (otherlv_20= 'requiredBySystem:' ( ( ruleEString ) ) (otherlv_22= ',' ( ( ruleEString ) ) )* )? (otherlv_24= 'signature:' ( (lv_signature_25_0= ruleESignature ) ) (otherlv_26= ',' ( (lv_signature_27_0= ruleESignature ) ) )* )? otherlv_28= '}' ) )
            // InternalMyDsl.g:1217:2: ( () otherlv_1= 'EInterface' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'resultsIn:' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* )? (otherlv_8= 'providedByComponent:' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* )? (otherlv_12= 'providedBySystem:' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* )? (otherlv_16= 'requiredByComponent:' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* )? (otherlv_20= 'requiredBySystem:' ( ( ruleEString ) ) (otherlv_22= ',' ( ( ruleEString ) ) )* )? (otherlv_24= 'signature:' ( (lv_signature_25_0= ruleESignature ) ) (otherlv_26= ',' ( (lv_signature_27_0= ruleESignature ) ) )* )? otherlv_28= '}' )
            {
            // InternalMyDsl.g:1217:2: ( () otherlv_1= 'EInterface' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'resultsIn:' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* )? (otherlv_8= 'providedByComponent:' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* )? (otherlv_12= 'providedBySystem:' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* )? (otherlv_16= 'requiredByComponent:' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* )? (otherlv_20= 'requiredBySystem:' ( ( ruleEString ) ) (otherlv_22= ',' ( ( ruleEString ) ) )* )? (otherlv_24= 'signature:' ( (lv_signature_25_0= ruleESignature ) ) (otherlv_26= ',' ( (lv_signature_27_0= ruleESignature ) ) )* )? otherlv_28= '}' )
            // InternalMyDsl.g:1218:3: () otherlv_1= 'EInterface' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'resultsIn:' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* )? (otherlv_8= 'providedByComponent:' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* )? (otherlv_12= 'providedBySystem:' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* )? (otherlv_16= 'requiredByComponent:' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* )? (otherlv_20= 'requiredBySystem:' ( ( ruleEString ) ) (otherlv_22= ',' ( ( ruleEString ) ) )* )? (otherlv_24= 'signature:' ( (lv_signature_25_0= ruleESignature ) ) (otherlv_26= ',' ( (lv_signature_27_0= ruleESignature ) ) )* )? otherlv_28= '}'
            {
            // InternalMyDsl.g:1218:3: ()
            // InternalMyDsl.g:1219:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEInterfaceAccess().getEInterfaceAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,37,FOLLOW_48); 

            			newLeafNode(otherlv_1, grammarAccess.getEInterfaceAccess().getEInterfaceKeyword_1());
            		
            // InternalMyDsl.g:1229:3: ( (lv_name_2_0= ruleEString ) )
            // InternalMyDsl.g:1230:4: (lv_name_2_0= ruleEString )
            {
            // InternalMyDsl.g:1230:4: (lv_name_2_0= ruleEString )
            // InternalMyDsl.g:1231:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getEInterfaceAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_3);
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

            otherlv_3=(Token)match(input,12,FOLLOW_49); 

            			newLeafNode(otherlv_3, grammarAccess.getEInterfaceAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalMyDsl.g:1252:3: (otherlv_4= 'resultsIn:' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==38) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalMyDsl.g:1253:4: otherlv_4= 'resultsIn:' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )*
                    {
                    otherlv_4=(Token)match(input,38,FOLLOW_48); 

                    				newLeafNode(otherlv_4, grammarAccess.getEInterfaceAccess().getResultsInKeyword_4_0());
                    			
                    // InternalMyDsl.g:1257:4: ( ( ruleEString ) )
                    // InternalMyDsl.g:1258:5: ( ruleEString )
                    {
                    // InternalMyDsl.g:1258:5: ( ruleEString )
                    // InternalMyDsl.g:1259:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEInterfaceRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getEInterfaceAccess().getResultsInERoleCrossReference_4_1_0());
                    					
                    pushFollow(FOLLOW_50);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:1273:4: (otherlv_6= ',' ( ( ruleEString ) ) )*
                    loop45:
                    do {
                        int alt45=2;
                        int LA45_0 = input.LA(1);

                        if ( (LA45_0==14) ) {
                            alt45=1;
                        }


                        switch (alt45) {
                    	case 1 :
                    	    // InternalMyDsl.g:1274:5: otherlv_6= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_6=(Token)match(input,14,FOLLOW_48); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getEInterfaceAccess().getCommaKeyword_4_2_0());
                    	    				
                    	    // InternalMyDsl.g:1278:5: ( ( ruleEString ) )
                    	    // InternalMyDsl.g:1279:6: ( ruleEString )
                    	    {
                    	    // InternalMyDsl.g:1279:6: ( ruleEString )
                    	    // InternalMyDsl.g:1280:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getEInterfaceRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getEInterfaceAccess().getResultsInERoleCrossReference_4_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_50);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop45;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalMyDsl.g:1296:3: (otherlv_8= 'providedByComponent:' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==39) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalMyDsl.g:1297:4: otherlv_8= 'providedByComponent:' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )*
                    {
                    otherlv_8=(Token)match(input,39,FOLLOW_48); 

                    				newLeafNode(otherlv_8, grammarAccess.getEInterfaceAccess().getProvidedByComponentKeyword_5_0());
                    			
                    // InternalMyDsl.g:1301:4: ( ( ruleEString ) )
                    // InternalMyDsl.g:1302:5: ( ruleEString )
                    {
                    // InternalMyDsl.g:1302:5: ( ruleEString )
                    // InternalMyDsl.g:1303:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEInterfaceRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getEInterfaceAccess().getProvidedByComponentEComponentCrossReference_5_1_0());
                    					
                    pushFollow(FOLLOW_51);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:1317:4: (otherlv_10= ',' ( ( ruleEString ) ) )*
                    loop47:
                    do {
                        int alt47=2;
                        int LA47_0 = input.LA(1);

                        if ( (LA47_0==14) ) {
                            alt47=1;
                        }


                        switch (alt47) {
                    	case 1 :
                    	    // InternalMyDsl.g:1318:5: otherlv_10= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_10=(Token)match(input,14,FOLLOW_48); 

                    	    					newLeafNode(otherlv_10, grammarAccess.getEInterfaceAccess().getCommaKeyword_5_2_0());
                    	    				
                    	    // InternalMyDsl.g:1322:5: ( ( ruleEString ) )
                    	    // InternalMyDsl.g:1323:6: ( ruleEString )
                    	    {
                    	    // InternalMyDsl.g:1323:6: ( ruleEString )
                    	    // InternalMyDsl.g:1324:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getEInterfaceRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getEInterfaceAccess().getProvidedByComponentEComponentCrossReference_5_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_51);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

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

            // InternalMyDsl.g:1340:3: (otherlv_12= 'providedBySystem:' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==40) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalMyDsl.g:1341:4: otherlv_12= 'providedBySystem:' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )*
                    {
                    otherlv_12=(Token)match(input,40,FOLLOW_48); 

                    				newLeafNode(otherlv_12, grammarAccess.getEInterfaceAccess().getProvidedBySystemKeyword_6_0());
                    			
                    // InternalMyDsl.g:1345:4: ( ( ruleEString ) )
                    // InternalMyDsl.g:1346:5: ( ruleEString )
                    {
                    // InternalMyDsl.g:1346:5: ( ruleEString )
                    // InternalMyDsl.g:1347:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEInterfaceRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getEInterfaceAccess().getProvidedBySystemESystemCrossReference_6_1_0());
                    					
                    pushFollow(FOLLOW_52);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:1361:4: (otherlv_14= ',' ( ( ruleEString ) ) )*
                    loop49:
                    do {
                        int alt49=2;
                        int LA49_0 = input.LA(1);

                        if ( (LA49_0==14) ) {
                            alt49=1;
                        }


                        switch (alt49) {
                    	case 1 :
                    	    // InternalMyDsl.g:1362:5: otherlv_14= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_14=(Token)match(input,14,FOLLOW_48); 

                    	    					newLeafNode(otherlv_14, grammarAccess.getEInterfaceAccess().getCommaKeyword_6_2_0());
                    	    				
                    	    // InternalMyDsl.g:1366:5: ( ( ruleEString ) )
                    	    // InternalMyDsl.g:1367:6: ( ruleEString )
                    	    {
                    	    // InternalMyDsl.g:1367:6: ( ruleEString )
                    	    // InternalMyDsl.g:1368:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getEInterfaceRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getEInterfaceAccess().getProvidedBySystemESystemCrossReference_6_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_52);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

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

            // InternalMyDsl.g:1384:3: (otherlv_16= 'requiredByComponent:' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==41) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalMyDsl.g:1385:4: otherlv_16= 'requiredByComponent:' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )*
                    {
                    otherlv_16=(Token)match(input,41,FOLLOW_48); 

                    				newLeafNode(otherlv_16, grammarAccess.getEInterfaceAccess().getRequiredByComponentKeyword_7_0());
                    			
                    // InternalMyDsl.g:1389:4: ( ( ruleEString ) )
                    // InternalMyDsl.g:1390:5: ( ruleEString )
                    {
                    // InternalMyDsl.g:1390:5: ( ruleEString )
                    // InternalMyDsl.g:1391:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEInterfaceRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getEInterfaceAccess().getRequiredByComponentEComponentCrossReference_7_1_0());
                    					
                    pushFollow(FOLLOW_53);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:1405:4: (otherlv_18= ',' ( ( ruleEString ) ) )*
                    loop51:
                    do {
                        int alt51=2;
                        int LA51_0 = input.LA(1);

                        if ( (LA51_0==14) ) {
                            alt51=1;
                        }


                        switch (alt51) {
                    	case 1 :
                    	    // InternalMyDsl.g:1406:5: otherlv_18= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_18=(Token)match(input,14,FOLLOW_48); 

                    	    					newLeafNode(otherlv_18, grammarAccess.getEInterfaceAccess().getCommaKeyword_7_2_0());
                    	    				
                    	    // InternalMyDsl.g:1410:5: ( ( ruleEString ) )
                    	    // InternalMyDsl.g:1411:6: ( ruleEString )
                    	    {
                    	    // InternalMyDsl.g:1411:6: ( ruleEString )
                    	    // InternalMyDsl.g:1412:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getEInterfaceRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getEInterfaceAccess().getRequiredByComponentEComponentCrossReference_7_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_53);
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

            // InternalMyDsl.g:1428:3: (otherlv_20= 'requiredBySystem:' ( ( ruleEString ) ) (otherlv_22= ',' ( ( ruleEString ) ) )* )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==42) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalMyDsl.g:1429:4: otherlv_20= 'requiredBySystem:' ( ( ruleEString ) ) (otherlv_22= ',' ( ( ruleEString ) ) )*
                    {
                    otherlv_20=(Token)match(input,42,FOLLOW_48); 

                    				newLeafNode(otherlv_20, grammarAccess.getEInterfaceAccess().getRequiredBySystemKeyword_8_0());
                    			
                    // InternalMyDsl.g:1433:4: ( ( ruleEString ) )
                    // InternalMyDsl.g:1434:5: ( ruleEString )
                    {
                    // InternalMyDsl.g:1434:5: ( ruleEString )
                    // InternalMyDsl.g:1435:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEInterfaceRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getEInterfaceAccess().getRequiredBySystemESystemCrossReference_8_1_0());
                    					
                    pushFollow(FOLLOW_54);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:1449:4: (otherlv_22= ',' ( ( ruleEString ) ) )*
                    loop53:
                    do {
                        int alt53=2;
                        int LA53_0 = input.LA(1);

                        if ( (LA53_0==14) ) {
                            alt53=1;
                        }


                        switch (alt53) {
                    	case 1 :
                    	    // InternalMyDsl.g:1450:5: otherlv_22= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_22=(Token)match(input,14,FOLLOW_48); 

                    	    					newLeafNode(otherlv_22, grammarAccess.getEInterfaceAccess().getCommaKeyword_8_2_0());
                    	    				
                    	    // InternalMyDsl.g:1454:5: ( ( ruleEString ) )
                    	    // InternalMyDsl.g:1455:6: ( ruleEString )
                    	    {
                    	    // InternalMyDsl.g:1455:6: ( ruleEString )
                    	    // InternalMyDsl.g:1456:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getEInterfaceRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getEInterfaceAccess().getRequiredBySystemESystemCrossReference_8_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_54);
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

            // InternalMyDsl.g:1472:3: (otherlv_24= 'signature:' ( (lv_signature_25_0= ruleESignature ) ) (otherlv_26= ',' ( (lv_signature_27_0= ruleESignature ) ) )* )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==43) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalMyDsl.g:1473:4: otherlv_24= 'signature:' ( (lv_signature_25_0= ruleESignature ) ) (otherlv_26= ',' ( (lv_signature_27_0= ruleESignature ) ) )*
                    {
                    otherlv_24=(Token)match(input,43,FOLLOW_11); 

                    				newLeafNode(otherlv_24, grammarAccess.getEInterfaceAccess().getSignatureKeyword_9_0());
                    			
                    // InternalMyDsl.g:1477:4: ( (lv_signature_25_0= ruleESignature ) )
                    // InternalMyDsl.g:1478:5: (lv_signature_25_0= ruleESignature )
                    {
                    // InternalMyDsl.g:1478:5: (lv_signature_25_0= ruleESignature )
                    // InternalMyDsl.g:1479:6: lv_signature_25_0= ruleESignature
                    {

                    						newCompositeNode(grammarAccess.getEInterfaceAccess().getSignatureESignatureParserRuleCall_9_1_0());
                    					
                    pushFollow(FOLLOW_47);
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

                    // InternalMyDsl.g:1496:4: (otherlv_26= ',' ( (lv_signature_27_0= ruleESignature ) ) )*
                    loop55:
                    do {
                        int alt55=2;
                        int LA55_0 = input.LA(1);

                        if ( (LA55_0==14) ) {
                            alt55=1;
                        }


                        switch (alt55) {
                    	case 1 :
                    	    // InternalMyDsl.g:1497:5: otherlv_26= ',' ( (lv_signature_27_0= ruleESignature ) )
                    	    {
                    	    otherlv_26=(Token)match(input,14,FOLLOW_11); 

                    	    					newLeafNode(otherlv_26, grammarAccess.getEInterfaceAccess().getCommaKeyword_9_2_0());
                    	    				
                    	    // InternalMyDsl.g:1501:5: ( (lv_signature_27_0= ruleESignature ) )
                    	    // InternalMyDsl.g:1502:6: (lv_signature_27_0= ruleESignature )
                    	    {
                    	    // InternalMyDsl.g:1502:6: (lv_signature_27_0= ruleESignature )
                    	    // InternalMyDsl.g:1503:7: lv_signature_27_0= ruleESignature
                    	    {

                    	    							newCompositeNode(grammarAccess.getEInterfaceAccess().getSignatureESignatureParserRuleCall_9_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_47);
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
                    	    break loop55;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_28=(Token)match(input,36,FOLLOW_2); 

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


    // $ANTLR start "entryRuleESystem"
    // InternalMyDsl.g:1530:1: entryRuleESystem returns [EObject current=null] : iv_ruleESystem= ruleESystem EOF ;
    public final EObject entryRuleESystem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleESystem = null;


        try {
            // InternalMyDsl.g:1530:48: (iv_ruleESystem= ruleESystem EOF )
            // InternalMyDsl.g:1531:2: iv_ruleESystem= ruleESystem EOF
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
    // InternalMyDsl.g:1537:1: ruleESystem returns [EObject current=null] : ( () otherlv_1= 'ESystem' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'provides:' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* ) (otherlv_8= 'requires:' ( (otherlv_9= RULE_ID ) ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )* )? (otherlv_12= 'encapsulates:' ( (otherlv_13= RULE_ID ) ) (otherlv_14= ',' ( (otherlv_15= RULE_ID ) ) )* )? otherlv_16= '}' ) ;
    public final EObject ruleESystem() throws RecognitionException {
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
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1543:2: ( ( () otherlv_1= 'ESystem' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'provides:' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* ) (otherlv_8= 'requires:' ( (otherlv_9= RULE_ID ) ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )* )? (otherlv_12= 'encapsulates:' ( (otherlv_13= RULE_ID ) ) (otherlv_14= ',' ( (otherlv_15= RULE_ID ) ) )* )? otherlv_16= '}' ) )
            // InternalMyDsl.g:1544:2: ( () otherlv_1= 'ESystem' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'provides:' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* ) (otherlv_8= 'requires:' ( (otherlv_9= RULE_ID ) ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )* )? (otherlv_12= 'encapsulates:' ( (otherlv_13= RULE_ID ) ) (otherlv_14= ',' ( (otherlv_15= RULE_ID ) ) )* )? otherlv_16= '}' )
            {
            // InternalMyDsl.g:1544:2: ( () otherlv_1= 'ESystem' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'provides:' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* ) (otherlv_8= 'requires:' ( (otherlv_9= RULE_ID ) ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )* )? (otherlv_12= 'encapsulates:' ( (otherlv_13= RULE_ID ) ) (otherlv_14= ',' ( (otherlv_15= RULE_ID ) ) )* )? otherlv_16= '}' )
            // InternalMyDsl.g:1545:3: () otherlv_1= 'ESystem' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'provides:' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* ) (otherlv_8= 'requires:' ( (otherlv_9= RULE_ID ) ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )* )? (otherlv_12= 'encapsulates:' ( (otherlv_13= RULE_ID ) ) (otherlv_14= ',' ( (otherlv_15= RULE_ID ) ) )* )? otherlv_16= '}'
            {
            // InternalMyDsl.g:1545:3: ()
            // InternalMyDsl.g:1546:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getESystemAccess().getESystemAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,44,FOLLOW_48); 

            			newLeafNode(otherlv_1, grammarAccess.getESystemAccess().getESystemKeyword_1());
            		
            // InternalMyDsl.g:1556:3: ( (lv_name_2_0= ruleEString ) )
            // InternalMyDsl.g:1557:4: (lv_name_2_0= ruleEString )
            {
            // InternalMyDsl.g:1557:4: (lv_name_2_0= ruleEString )
            // InternalMyDsl.g:1558:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getESystemAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getESystemRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_55); 

            			newLeafNode(otherlv_3, grammarAccess.getESystemAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalMyDsl.g:1579:3: (otherlv_4= 'provides:' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* )
            // InternalMyDsl.g:1580:4: otherlv_4= 'provides:' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )*
            {
            otherlv_4=(Token)match(input,45,FOLLOW_56); 

            				newLeafNode(otherlv_4, grammarAccess.getESystemAccess().getProvidesKeyword_4_0());
            			
            // InternalMyDsl.g:1584:4: ( (otherlv_5= RULE_ID ) )
            // InternalMyDsl.g:1585:5: (otherlv_5= RULE_ID )
            {
            // InternalMyDsl.g:1585:5: (otherlv_5= RULE_ID )
            // InternalMyDsl.g:1586:6: otherlv_5= RULE_ID
            {

            						if (current==null) {
            							current = createModelElement(grammarAccess.getESystemRule());
            						}
            					
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_57); 

            						newLeafNode(otherlv_5, grammarAccess.getESystemAccess().getProvidesEInterfaceCrossReference_4_1_0());
            					

            }


            }

            // InternalMyDsl.g:1597:4: (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )*
            loop57:
            do {
                int alt57=2;
                int LA57_0 = input.LA(1);

                if ( (LA57_0==14) ) {
                    alt57=1;
                }


                switch (alt57) {
            	case 1 :
            	    // InternalMyDsl.g:1598:5: otherlv_6= ',' ( (otherlv_7= RULE_ID ) )
            	    {
            	    otherlv_6=(Token)match(input,14,FOLLOW_56); 

            	    					newLeafNode(otherlv_6, grammarAccess.getESystemAccess().getCommaKeyword_4_2_0());
            	    				
            	    // InternalMyDsl.g:1602:5: ( (otherlv_7= RULE_ID ) )
            	    // InternalMyDsl.g:1603:6: (otherlv_7= RULE_ID )
            	    {
            	    // InternalMyDsl.g:1603:6: (otherlv_7= RULE_ID )
            	    // InternalMyDsl.g:1604:7: otherlv_7= RULE_ID
            	    {

            	    							if (current==null) {
            	    								current = createModelElement(grammarAccess.getESystemRule());
            	    							}
            	    						
            	    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_57); 

            	    							newLeafNode(otherlv_7, grammarAccess.getESystemAccess().getProvidesEInterfaceCrossReference_4_2_1_0());
            	    						

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop57;
                }
            } while (true);


            }

            // InternalMyDsl.g:1617:3: (otherlv_8= 'requires:' ( (otherlv_9= RULE_ID ) ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )* )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==46) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalMyDsl.g:1618:4: otherlv_8= 'requires:' ( (otherlv_9= RULE_ID ) ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )*
                    {
                    otherlv_8=(Token)match(input,46,FOLLOW_56); 

                    				newLeafNode(otherlv_8, grammarAccess.getESystemAccess().getRequiresKeyword_5_0());
                    			
                    // InternalMyDsl.g:1622:4: ( (otherlv_9= RULE_ID ) )
                    // InternalMyDsl.g:1623:5: (otherlv_9= RULE_ID )
                    {
                    // InternalMyDsl.g:1623:5: (otherlv_9= RULE_ID )
                    // InternalMyDsl.g:1624:6: otherlv_9= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getESystemRule());
                    						}
                    					
                    otherlv_9=(Token)match(input,RULE_ID,FOLLOW_58); 

                    						newLeafNode(otherlv_9, grammarAccess.getESystemAccess().getRequiresEInterfaceCrossReference_5_1_0());
                    					

                    }


                    }

                    // InternalMyDsl.g:1635:4: (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )*
                    loop58:
                    do {
                        int alt58=2;
                        int LA58_0 = input.LA(1);

                        if ( (LA58_0==14) ) {
                            alt58=1;
                        }


                        switch (alt58) {
                    	case 1 :
                    	    // InternalMyDsl.g:1636:5: otherlv_10= ',' ( (otherlv_11= RULE_ID ) )
                    	    {
                    	    otherlv_10=(Token)match(input,14,FOLLOW_56); 

                    	    					newLeafNode(otherlv_10, grammarAccess.getESystemAccess().getCommaKeyword_5_2_0());
                    	    				
                    	    // InternalMyDsl.g:1640:5: ( (otherlv_11= RULE_ID ) )
                    	    // InternalMyDsl.g:1641:6: (otherlv_11= RULE_ID )
                    	    {
                    	    // InternalMyDsl.g:1641:6: (otherlv_11= RULE_ID )
                    	    // InternalMyDsl.g:1642:7: otherlv_11= RULE_ID
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getESystemRule());
                    	    							}
                    	    						
                    	    otherlv_11=(Token)match(input,RULE_ID,FOLLOW_58); 

                    	    							newLeafNode(otherlv_11, grammarAccess.getESystemAccess().getRequiresEInterfaceCrossReference_5_2_1_0());
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop58;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalMyDsl.g:1655:3: (otherlv_12= 'encapsulates:' ( (otherlv_13= RULE_ID ) ) (otherlv_14= ',' ( (otherlv_15= RULE_ID ) ) )* )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==47) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // InternalMyDsl.g:1656:4: otherlv_12= 'encapsulates:' ( (otherlv_13= RULE_ID ) ) (otherlv_14= ',' ( (otherlv_15= RULE_ID ) ) )*
                    {
                    otherlv_12=(Token)match(input,47,FOLLOW_56); 

                    				newLeafNode(otherlv_12, grammarAccess.getESystemAccess().getEncapsulatesKeyword_6_0());
                    			
                    // InternalMyDsl.g:1660:4: ( (otherlv_13= RULE_ID ) )
                    // InternalMyDsl.g:1661:5: (otherlv_13= RULE_ID )
                    {
                    // InternalMyDsl.g:1661:5: (otherlv_13= RULE_ID )
                    // InternalMyDsl.g:1662:6: otherlv_13= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getESystemRule());
                    						}
                    					
                    otherlv_13=(Token)match(input,RULE_ID,FOLLOW_47); 

                    						newLeafNode(otherlv_13, grammarAccess.getESystemAccess().getEncapsulatesEAssemblyContextCrossReference_6_1_0());
                    					

                    }


                    }

                    // InternalMyDsl.g:1673:4: (otherlv_14= ',' ( (otherlv_15= RULE_ID ) ) )*
                    loop60:
                    do {
                        int alt60=2;
                        int LA60_0 = input.LA(1);

                        if ( (LA60_0==14) ) {
                            alt60=1;
                        }


                        switch (alt60) {
                    	case 1 :
                    	    // InternalMyDsl.g:1674:5: otherlv_14= ',' ( (otherlv_15= RULE_ID ) )
                    	    {
                    	    otherlv_14=(Token)match(input,14,FOLLOW_56); 

                    	    					newLeafNode(otherlv_14, grammarAccess.getESystemAccess().getCommaKeyword_6_2_0());
                    	    				
                    	    // InternalMyDsl.g:1678:5: ( (otherlv_15= RULE_ID ) )
                    	    // InternalMyDsl.g:1679:6: (otherlv_15= RULE_ID )
                    	    {
                    	    // InternalMyDsl.g:1679:6: (otherlv_15= RULE_ID )
                    	    // InternalMyDsl.g:1680:7: otherlv_15= RULE_ID
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getESystemRule());
                    	    							}
                    	    						
                    	    otherlv_15=(Token)match(input,RULE_ID,FOLLOW_47); 

                    	    							newLeafNode(otherlv_15, grammarAccess.getESystemAccess().getEncapsulatesEAssemblyContextCrossReference_6_2_1_0());
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop60;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_16=(Token)match(input,36,FOLLOW_2); 

            			newLeafNode(otherlv_16, grammarAccess.getESystemAccess().getRightCurlyBracketKeyword_7());
            		

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


    // $ANTLR start "entryRuleEParameter"
    // InternalMyDsl.g:1701:1: entryRuleEParameter returns [EObject current=null] : iv_ruleEParameter= ruleEParameter EOF ;
    public final EObject entryRuleEParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEParameter = null;


        try {
            // InternalMyDsl.g:1701:51: (iv_ruleEParameter= ruleEParameter EOF )
            // InternalMyDsl.g:1702:2: iv_ruleEParameter= ruleEParameter EOF
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
    // InternalMyDsl.g:1708:1: ruleEParameter returns [EObject current=null] : ( () otherlv_1= 'EParameter' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'type:' ( (lv_type_5_0= rulePossibleParameterTypes ) ) ) otherlv_6= '}' ) ;
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
            // InternalMyDsl.g:1714:2: ( ( () otherlv_1= 'EParameter' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'type:' ( (lv_type_5_0= rulePossibleParameterTypes ) ) ) otherlv_6= '}' ) )
            // InternalMyDsl.g:1715:2: ( () otherlv_1= 'EParameter' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'type:' ( (lv_type_5_0= rulePossibleParameterTypes ) ) ) otherlv_6= '}' )
            {
            // InternalMyDsl.g:1715:2: ( () otherlv_1= 'EParameter' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'type:' ( (lv_type_5_0= rulePossibleParameterTypes ) ) ) otherlv_6= '}' )
            // InternalMyDsl.g:1716:3: () otherlv_1= 'EParameter' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'type:' ( (lv_type_5_0= rulePossibleParameterTypes ) ) ) otherlv_6= '}'
            {
            // InternalMyDsl.g:1716:3: ()
            // InternalMyDsl.g:1717:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEParameterAccess().getEParameterAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,48,FOLLOW_48); 

            			newLeafNode(otherlv_1, grammarAccess.getEParameterAccess().getEParameterKeyword_1());
            		
            // InternalMyDsl.g:1727:3: ( (lv_name_2_0= ruleEString ) )
            // InternalMyDsl.g:1728:4: (lv_name_2_0= ruleEString )
            {
            // InternalMyDsl.g:1728:4: (lv_name_2_0= ruleEString )
            // InternalMyDsl.g:1729:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getEParameterAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_3);
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

            otherlv_3=(Token)match(input,12,FOLLOW_59); 

            			newLeafNode(otherlv_3, grammarAccess.getEParameterAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalMyDsl.g:1750:3: (otherlv_4= 'type:' ( (lv_type_5_0= rulePossibleParameterTypes ) ) )
            // InternalMyDsl.g:1751:4: otherlv_4= 'type:' ( (lv_type_5_0= rulePossibleParameterTypes ) )
            {
            otherlv_4=(Token)match(input,49,FOLLOW_60); 

            				newLeafNode(otherlv_4, grammarAccess.getEParameterAccess().getTypeKeyword_4_0());
            			
            // InternalMyDsl.g:1755:4: ( (lv_type_5_0= rulePossibleParameterTypes ) )
            // InternalMyDsl.g:1756:5: (lv_type_5_0= rulePossibleParameterTypes )
            {
            // InternalMyDsl.g:1756:5: (lv_type_5_0= rulePossibleParameterTypes )
            // InternalMyDsl.g:1757:6: lv_type_5_0= rulePossibleParameterTypes
            {

            						newCompositeNode(grammarAccess.getEParameterAccess().getTypePossibleParameterTypesEnumRuleCall_4_1_0());
            					
            pushFollow(FOLLOW_61);
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

            otherlv_6=(Token)match(input,36,FOLLOW_2); 

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


    // $ANTLR start "entryRuleEViewPoint"
    // InternalMyDsl.g:1783:1: entryRuleEViewPoint returns [EObject current=null] : iv_ruleEViewPoint= ruleEViewPoint EOF ;
    public final EObject entryRuleEViewPoint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEViewPoint = null;


        try {
            // InternalMyDsl.g:1783:51: (iv_ruleEViewPoint= ruleEViewPoint EOF )
            // InternalMyDsl.g:1784:2: iv_ruleEViewPoint= ruleEViewPoint EOF
            {
             newCompositeNode(grammarAccess.getEViewPointRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEViewPoint=ruleEViewPoint();

            state._fsp--;

             current =iv_ruleEViewPoint; 
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
    // $ANTLR end "entryRuleEViewPoint"


    // $ANTLR start "ruleEViewPoint"
    // InternalMyDsl.g:1790:1: ruleEViewPoint returns [EObject current=null] : (this_ESystemIndependentViewPoint_0= ruleESystemIndependentViewPoint | this_EAssemblyViewPoint_1= ruleEAssemblyViewPoint | this_EDeploymentViewPoint_2= ruleEDeploymentViewPoint ) ;
    public final EObject ruleEViewPoint() throws RecognitionException {
        EObject current = null;

        EObject this_ESystemIndependentViewPoint_0 = null;

        EObject this_EAssemblyViewPoint_1 = null;

        EObject this_EDeploymentViewPoint_2 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1796:2: ( (this_ESystemIndependentViewPoint_0= ruleESystemIndependentViewPoint | this_EAssemblyViewPoint_1= ruleEAssemblyViewPoint | this_EDeploymentViewPoint_2= ruleEDeploymentViewPoint ) )
            // InternalMyDsl.g:1797:2: (this_ESystemIndependentViewPoint_0= ruleESystemIndependentViewPoint | this_EAssemblyViewPoint_1= ruleEAssemblyViewPoint | this_EDeploymentViewPoint_2= ruleEDeploymentViewPoint )
            {
            // InternalMyDsl.g:1797:2: (this_ESystemIndependentViewPoint_0= ruleESystemIndependentViewPoint | this_EAssemblyViewPoint_1= ruleEAssemblyViewPoint | this_EDeploymentViewPoint_2= ruleEDeploymentViewPoint )
            int alt62=3;
            switch ( input.LA(1) ) {
            case 79:
                {
                alt62=1;
                }
                break;
            case 81:
                {
                alt62=2;
                }
                break;
            case 83:
                {
                alt62=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 62, 0, input);

                throw nvae;
            }

            switch (alt62) {
                case 1 :
                    // InternalMyDsl.g:1798:3: this_ESystemIndependentViewPoint_0= ruleESystemIndependentViewPoint
                    {

                    			newCompositeNode(grammarAccess.getEViewPointAccess().getESystemIndependentViewPointParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ESystemIndependentViewPoint_0=ruleESystemIndependentViewPoint();

                    state._fsp--;


                    			current = this_ESystemIndependentViewPoint_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1807:3: this_EAssemblyViewPoint_1= ruleEAssemblyViewPoint
                    {

                    			newCompositeNode(grammarAccess.getEViewPointAccess().getEAssemblyViewPointParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_EAssemblyViewPoint_1=ruleEAssemblyViewPoint();

                    state._fsp--;


                    			current = this_EAssemblyViewPoint_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1816:3: this_EDeploymentViewPoint_2= ruleEDeploymentViewPoint
                    {

                    			newCompositeNode(grammarAccess.getEViewPointAccess().getEDeploymentViewPointParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_EDeploymentViewPoint_2=ruleEDeploymentViewPoint();

                    state._fsp--;


                    			current = this_EDeploymentViewPoint_2;
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
    // $ANTLR end "ruleEViewPoint"


    // $ANTLR start "entryRuleEString"
    // InternalMyDsl.g:1828:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalMyDsl.g:1828:47: (iv_ruleEString= ruleEString EOF )
            // InternalMyDsl.g:1829:2: iv_ruleEString= ruleEString EOF
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
    // InternalMyDsl.g:1835:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1841:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalMyDsl.g:1842:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalMyDsl.g:1842:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==RULE_STRING) ) {
                alt63=1;
            }
            else if ( (LA63_0==RULE_ID) ) {
                alt63=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 63, 0, input);

                throw nvae;
            }
            switch (alt63) {
                case 1 :
                    // InternalMyDsl.g:1843:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1851:3: this_ID_1= RULE_ID
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
    // InternalMyDsl.g:1862:1: entryRuleECompositeComponent returns [EObject current=null] : iv_ruleECompositeComponent= ruleECompositeComponent EOF ;
    public final EObject entryRuleECompositeComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleECompositeComponent = null;


        try {
            // InternalMyDsl.g:1862:60: (iv_ruleECompositeComponent= ruleECompositeComponent EOF )
            // InternalMyDsl.g:1863:2: iv_ruleECompositeComponent= ruleECompositeComponent EOF
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
    // InternalMyDsl.g:1869:1: ruleECompositeComponent returns [EObject current=null] : ( () otherlv_1= 'ECompositeComponent' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'providesInterfaceTo:' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* )? (otherlv_8= 'usesInterfaceFrom:' ( (otherlv_9= RULE_ID ) ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )* )? (otherlv_12= 'providesDirectly:' ( (otherlv_13= RULE_ID ) ) (otherlv_14= ',' ( (otherlv_15= RULE_ID ) ) )* )? (otherlv_16= 'provides:' ( (otherlv_17= RULE_ID ) ) (otherlv_18= ',' ( (otherlv_19= RULE_ID ) ) )* )? (otherlv_20= 'requires:' ( (otherlv_21= RULE_ID ) ) (otherlv_22= ',' ( (otherlv_23= RULE_ID ) ) )* )? (otherlv_24= 'encapsulates:' ( (otherlv_25= RULE_ID ) ) (otherlv_26= ',' ( (otherlv_27= RULE_ID ) ) )* )? (otherlv_28= 'behaviourDescription:' ( (lv_behaviourDescription_29_0= ruleEBehaviourDescription ) ) )? otherlv_30= '}' ) ;
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
            // InternalMyDsl.g:1875:2: ( ( () otherlv_1= 'ECompositeComponent' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'providesInterfaceTo:' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* )? (otherlv_8= 'usesInterfaceFrom:' ( (otherlv_9= RULE_ID ) ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )* )? (otherlv_12= 'providesDirectly:' ( (otherlv_13= RULE_ID ) ) (otherlv_14= ',' ( (otherlv_15= RULE_ID ) ) )* )? (otherlv_16= 'provides:' ( (otherlv_17= RULE_ID ) ) (otherlv_18= ',' ( (otherlv_19= RULE_ID ) ) )* )? (otherlv_20= 'requires:' ( (otherlv_21= RULE_ID ) ) (otherlv_22= ',' ( (otherlv_23= RULE_ID ) ) )* )? (otherlv_24= 'encapsulates:' ( (otherlv_25= RULE_ID ) ) (otherlv_26= ',' ( (otherlv_27= RULE_ID ) ) )* )? (otherlv_28= 'behaviourDescription:' ( (lv_behaviourDescription_29_0= ruleEBehaviourDescription ) ) )? otherlv_30= '}' ) )
            // InternalMyDsl.g:1876:2: ( () otherlv_1= 'ECompositeComponent' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'providesInterfaceTo:' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* )? (otherlv_8= 'usesInterfaceFrom:' ( (otherlv_9= RULE_ID ) ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )* )? (otherlv_12= 'providesDirectly:' ( (otherlv_13= RULE_ID ) ) (otherlv_14= ',' ( (otherlv_15= RULE_ID ) ) )* )? (otherlv_16= 'provides:' ( (otherlv_17= RULE_ID ) ) (otherlv_18= ',' ( (otherlv_19= RULE_ID ) ) )* )? (otherlv_20= 'requires:' ( (otherlv_21= RULE_ID ) ) (otherlv_22= ',' ( (otherlv_23= RULE_ID ) ) )* )? (otherlv_24= 'encapsulates:' ( (otherlv_25= RULE_ID ) ) (otherlv_26= ',' ( (otherlv_27= RULE_ID ) ) )* )? (otherlv_28= 'behaviourDescription:' ( (lv_behaviourDescription_29_0= ruleEBehaviourDescription ) ) )? otherlv_30= '}' )
            {
            // InternalMyDsl.g:1876:2: ( () otherlv_1= 'ECompositeComponent' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'providesInterfaceTo:' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* )? (otherlv_8= 'usesInterfaceFrom:' ( (otherlv_9= RULE_ID ) ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )* )? (otherlv_12= 'providesDirectly:' ( (otherlv_13= RULE_ID ) ) (otherlv_14= ',' ( (otherlv_15= RULE_ID ) ) )* )? (otherlv_16= 'provides:' ( (otherlv_17= RULE_ID ) ) (otherlv_18= ',' ( (otherlv_19= RULE_ID ) ) )* )? (otherlv_20= 'requires:' ( (otherlv_21= RULE_ID ) ) (otherlv_22= ',' ( (otherlv_23= RULE_ID ) ) )* )? (otherlv_24= 'encapsulates:' ( (otherlv_25= RULE_ID ) ) (otherlv_26= ',' ( (otherlv_27= RULE_ID ) ) )* )? (otherlv_28= 'behaviourDescription:' ( (lv_behaviourDescription_29_0= ruleEBehaviourDescription ) ) )? otherlv_30= '}' )
            // InternalMyDsl.g:1877:3: () otherlv_1= 'ECompositeComponent' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'providesInterfaceTo:' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* )? (otherlv_8= 'usesInterfaceFrom:' ( (otherlv_9= RULE_ID ) ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )* )? (otherlv_12= 'providesDirectly:' ( (otherlv_13= RULE_ID ) ) (otherlv_14= ',' ( (otherlv_15= RULE_ID ) ) )* )? (otherlv_16= 'provides:' ( (otherlv_17= RULE_ID ) ) (otherlv_18= ',' ( (otherlv_19= RULE_ID ) ) )* )? (otherlv_20= 'requires:' ( (otherlv_21= RULE_ID ) ) (otherlv_22= ',' ( (otherlv_23= RULE_ID ) ) )* )? (otherlv_24= 'encapsulates:' ( (otherlv_25= RULE_ID ) ) (otherlv_26= ',' ( (otherlv_27= RULE_ID ) ) )* )? (otherlv_28= 'behaviourDescription:' ( (lv_behaviourDescription_29_0= ruleEBehaviourDescription ) ) )? otherlv_30= '}'
            {
            // InternalMyDsl.g:1877:3: ()
            // InternalMyDsl.g:1878:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getECompositeComponentAccess().getECompositeComponentAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,50,FOLLOW_48); 

            			newLeafNode(otherlv_1, grammarAccess.getECompositeComponentAccess().getECompositeComponentKeyword_1());
            		
            // InternalMyDsl.g:1888:3: ( (lv_name_2_0= ruleEString ) )
            // InternalMyDsl.g:1889:4: (lv_name_2_0= ruleEString )
            {
            // InternalMyDsl.g:1889:4: (lv_name_2_0= ruleEString )
            // InternalMyDsl.g:1890:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getECompositeComponentAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_3);
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

            otherlv_3=(Token)match(input,12,FOLLOW_62); 

            			newLeafNode(otherlv_3, grammarAccess.getECompositeComponentAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalMyDsl.g:1911:3: (otherlv_4= 'providesInterfaceTo:' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==51) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // InternalMyDsl.g:1912:4: otherlv_4= 'providesInterfaceTo:' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )*
                    {
                    otherlv_4=(Token)match(input,51,FOLLOW_56); 

                    				newLeafNode(otherlv_4, grammarAccess.getECompositeComponentAccess().getProvidesInterfaceToKeyword_4_0());
                    			
                    // InternalMyDsl.g:1916:4: ( (otherlv_5= RULE_ID ) )
                    // InternalMyDsl.g:1917:5: (otherlv_5= RULE_ID )
                    {
                    // InternalMyDsl.g:1917:5: (otherlv_5= RULE_ID )
                    // InternalMyDsl.g:1918:6: otherlv_5= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getECompositeComponentRule());
                    						}
                    					
                    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_63); 

                    						newLeafNode(otherlv_5, grammarAccess.getECompositeComponentAccess().getProvidesInterfaceToEComponentCrossReference_4_1_0());
                    					

                    }


                    }

                    // InternalMyDsl.g:1929:4: (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )*
                    loop64:
                    do {
                        int alt64=2;
                        int LA64_0 = input.LA(1);

                        if ( (LA64_0==14) ) {
                            alt64=1;
                        }


                        switch (alt64) {
                    	case 1 :
                    	    // InternalMyDsl.g:1930:5: otherlv_6= ',' ( (otherlv_7= RULE_ID ) )
                    	    {
                    	    otherlv_6=(Token)match(input,14,FOLLOW_56); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getECompositeComponentAccess().getCommaKeyword_4_2_0());
                    	    				
                    	    // InternalMyDsl.g:1934:5: ( (otherlv_7= RULE_ID ) )
                    	    // InternalMyDsl.g:1935:6: (otherlv_7= RULE_ID )
                    	    {
                    	    // InternalMyDsl.g:1935:6: (otherlv_7= RULE_ID )
                    	    // InternalMyDsl.g:1936:7: otherlv_7= RULE_ID
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getECompositeComponentRule());
                    	    							}
                    	    						
                    	    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_63); 

                    	    							newLeafNode(otherlv_7, grammarAccess.getECompositeComponentAccess().getProvidesInterfaceToEComponentCrossReference_4_2_1_0());
                    	    						

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

            // InternalMyDsl.g:1949:3: (otherlv_8= 'usesInterfaceFrom:' ( (otherlv_9= RULE_ID ) ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )* )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==52) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // InternalMyDsl.g:1950:4: otherlv_8= 'usesInterfaceFrom:' ( (otherlv_9= RULE_ID ) ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )*
                    {
                    otherlv_8=(Token)match(input,52,FOLLOW_56); 

                    				newLeafNode(otherlv_8, grammarAccess.getECompositeComponentAccess().getUsesInterfaceFromKeyword_5_0());
                    			
                    // InternalMyDsl.g:1954:4: ( (otherlv_9= RULE_ID ) )
                    // InternalMyDsl.g:1955:5: (otherlv_9= RULE_ID )
                    {
                    // InternalMyDsl.g:1955:5: (otherlv_9= RULE_ID )
                    // InternalMyDsl.g:1956:6: otherlv_9= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getECompositeComponentRule());
                    						}
                    					
                    otherlv_9=(Token)match(input,RULE_ID,FOLLOW_64); 

                    						newLeafNode(otherlv_9, grammarAccess.getECompositeComponentAccess().getUsesInterfaceFromEComponentCrossReference_5_1_0());
                    					

                    }


                    }

                    // InternalMyDsl.g:1967:4: (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )*
                    loop66:
                    do {
                        int alt66=2;
                        int LA66_0 = input.LA(1);

                        if ( (LA66_0==14) ) {
                            alt66=1;
                        }


                        switch (alt66) {
                    	case 1 :
                    	    // InternalMyDsl.g:1968:5: otherlv_10= ',' ( (otherlv_11= RULE_ID ) )
                    	    {
                    	    otherlv_10=(Token)match(input,14,FOLLOW_56); 

                    	    					newLeafNode(otherlv_10, grammarAccess.getECompositeComponentAccess().getCommaKeyword_5_2_0());
                    	    				
                    	    // InternalMyDsl.g:1972:5: ( (otherlv_11= RULE_ID ) )
                    	    // InternalMyDsl.g:1973:6: (otherlv_11= RULE_ID )
                    	    {
                    	    // InternalMyDsl.g:1973:6: (otherlv_11= RULE_ID )
                    	    // InternalMyDsl.g:1974:7: otherlv_11= RULE_ID
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getECompositeComponentRule());
                    	    							}
                    	    						
                    	    otherlv_11=(Token)match(input,RULE_ID,FOLLOW_64); 

                    	    							newLeafNode(otherlv_11, grammarAccess.getECompositeComponentAccess().getUsesInterfaceFromEComponentCrossReference_5_2_1_0());
                    	    						

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

            // InternalMyDsl.g:1987:3: (otherlv_12= 'providesDirectly:' ( (otherlv_13= RULE_ID ) ) (otherlv_14= ',' ( (otherlv_15= RULE_ID ) ) )* )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==53) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // InternalMyDsl.g:1988:4: otherlv_12= 'providesDirectly:' ( (otherlv_13= RULE_ID ) ) (otherlv_14= ',' ( (otherlv_15= RULE_ID ) ) )*
                    {
                    otherlv_12=(Token)match(input,53,FOLLOW_56); 

                    				newLeafNode(otherlv_12, grammarAccess.getECompositeComponentAccess().getProvidesDirectlyKeyword_6_0());
                    			
                    // InternalMyDsl.g:1992:4: ( (otherlv_13= RULE_ID ) )
                    // InternalMyDsl.g:1993:5: (otherlv_13= RULE_ID )
                    {
                    // InternalMyDsl.g:1993:5: (otherlv_13= RULE_ID )
                    // InternalMyDsl.g:1994:6: otherlv_13= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getECompositeComponentRule());
                    						}
                    					
                    otherlv_13=(Token)match(input,RULE_ID,FOLLOW_65); 

                    						newLeafNode(otherlv_13, grammarAccess.getECompositeComponentAccess().getProvidesDirectlyEServiceCrossReference_6_1_0());
                    					

                    }


                    }

                    // InternalMyDsl.g:2005:4: (otherlv_14= ',' ( (otherlv_15= RULE_ID ) ) )*
                    loop68:
                    do {
                        int alt68=2;
                        int LA68_0 = input.LA(1);

                        if ( (LA68_0==14) ) {
                            alt68=1;
                        }


                        switch (alt68) {
                    	case 1 :
                    	    // InternalMyDsl.g:2006:5: otherlv_14= ',' ( (otherlv_15= RULE_ID ) )
                    	    {
                    	    otherlv_14=(Token)match(input,14,FOLLOW_56); 

                    	    					newLeafNode(otherlv_14, grammarAccess.getECompositeComponentAccess().getCommaKeyword_6_2_0());
                    	    				
                    	    // InternalMyDsl.g:2010:5: ( (otherlv_15= RULE_ID ) )
                    	    // InternalMyDsl.g:2011:6: (otherlv_15= RULE_ID )
                    	    {
                    	    // InternalMyDsl.g:2011:6: (otherlv_15= RULE_ID )
                    	    // InternalMyDsl.g:2012:7: otherlv_15= RULE_ID
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getECompositeComponentRule());
                    	    							}
                    	    						
                    	    otherlv_15=(Token)match(input,RULE_ID,FOLLOW_65); 

                    	    							newLeafNode(otherlv_15, grammarAccess.getECompositeComponentAccess().getProvidesDirectlyEServiceCrossReference_6_2_1_0());
                    	    						

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

            // InternalMyDsl.g:2025:3: (otherlv_16= 'provides:' ( (otherlv_17= RULE_ID ) ) (otherlv_18= ',' ( (otherlv_19= RULE_ID ) ) )* )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==45) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // InternalMyDsl.g:2026:4: otherlv_16= 'provides:' ( (otherlv_17= RULE_ID ) ) (otherlv_18= ',' ( (otherlv_19= RULE_ID ) ) )*
                    {
                    otherlv_16=(Token)match(input,45,FOLLOW_56); 

                    				newLeafNode(otherlv_16, grammarAccess.getECompositeComponentAccess().getProvidesKeyword_7_0());
                    			
                    // InternalMyDsl.g:2030:4: ( (otherlv_17= RULE_ID ) )
                    // InternalMyDsl.g:2031:5: (otherlv_17= RULE_ID )
                    {
                    // InternalMyDsl.g:2031:5: (otherlv_17= RULE_ID )
                    // InternalMyDsl.g:2032:6: otherlv_17= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getECompositeComponentRule());
                    						}
                    					
                    otherlv_17=(Token)match(input,RULE_ID,FOLLOW_66); 

                    						newLeafNode(otherlv_17, grammarAccess.getECompositeComponentAccess().getProvidesEInterfaceCrossReference_7_1_0());
                    					

                    }


                    }

                    // InternalMyDsl.g:2043:4: (otherlv_18= ',' ( (otherlv_19= RULE_ID ) ) )*
                    loop70:
                    do {
                        int alt70=2;
                        int LA70_0 = input.LA(1);

                        if ( (LA70_0==14) ) {
                            alt70=1;
                        }


                        switch (alt70) {
                    	case 1 :
                    	    // InternalMyDsl.g:2044:5: otherlv_18= ',' ( (otherlv_19= RULE_ID ) )
                    	    {
                    	    otherlv_18=(Token)match(input,14,FOLLOW_56); 

                    	    					newLeafNode(otherlv_18, grammarAccess.getECompositeComponentAccess().getCommaKeyword_7_2_0());
                    	    				
                    	    // InternalMyDsl.g:2048:5: ( (otherlv_19= RULE_ID ) )
                    	    // InternalMyDsl.g:2049:6: (otherlv_19= RULE_ID )
                    	    {
                    	    // InternalMyDsl.g:2049:6: (otherlv_19= RULE_ID )
                    	    // InternalMyDsl.g:2050:7: otherlv_19= RULE_ID
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getECompositeComponentRule());
                    	    							}
                    	    						
                    	    otherlv_19=(Token)match(input,RULE_ID,FOLLOW_66); 

                    	    							newLeafNode(otherlv_19, grammarAccess.getECompositeComponentAccess().getProvidesEInterfaceCrossReference_7_2_1_0());
                    	    						

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

            // InternalMyDsl.g:2063:3: (otherlv_20= 'requires:' ( (otherlv_21= RULE_ID ) ) (otherlv_22= ',' ( (otherlv_23= RULE_ID ) ) )* )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==46) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // InternalMyDsl.g:2064:4: otherlv_20= 'requires:' ( (otherlv_21= RULE_ID ) ) (otherlv_22= ',' ( (otherlv_23= RULE_ID ) ) )*
                    {
                    otherlv_20=(Token)match(input,46,FOLLOW_56); 

                    				newLeafNode(otherlv_20, grammarAccess.getECompositeComponentAccess().getRequiresKeyword_8_0());
                    			
                    // InternalMyDsl.g:2068:4: ( (otherlv_21= RULE_ID ) )
                    // InternalMyDsl.g:2069:5: (otherlv_21= RULE_ID )
                    {
                    // InternalMyDsl.g:2069:5: (otherlv_21= RULE_ID )
                    // InternalMyDsl.g:2070:6: otherlv_21= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getECompositeComponentRule());
                    						}
                    					
                    otherlv_21=(Token)match(input,RULE_ID,FOLLOW_67); 

                    						newLeafNode(otherlv_21, grammarAccess.getECompositeComponentAccess().getRequiresEInterfaceCrossReference_8_1_0());
                    					

                    }


                    }

                    // InternalMyDsl.g:2081:4: (otherlv_22= ',' ( (otherlv_23= RULE_ID ) ) )*
                    loop72:
                    do {
                        int alt72=2;
                        int LA72_0 = input.LA(1);

                        if ( (LA72_0==14) ) {
                            alt72=1;
                        }


                        switch (alt72) {
                    	case 1 :
                    	    // InternalMyDsl.g:2082:5: otherlv_22= ',' ( (otherlv_23= RULE_ID ) )
                    	    {
                    	    otherlv_22=(Token)match(input,14,FOLLOW_56); 

                    	    					newLeafNode(otherlv_22, grammarAccess.getECompositeComponentAccess().getCommaKeyword_8_2_0());
                    	    				
                    	    // InternalMyDsl.g:2086:5: ( (otherlv_23= RULE_ID ) )
                    	    // InternalMyDsl.g:2087:6: (otherlv_23= RULE_ID )
                    	    {
                    	    // InternalMyDsl.g:2087:6: (otherlv_23= RULE_ID )
                    	    // InternalMyDsl.g:2088:7: otherlv_23= RULE_ID
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getECompositeComponentRule());
                    	    							}
                    	    						
                    	    otherlv_23=(Token)match(input,RULE_ID,FOLLOW_67); 

                    	    							newLeafNode(otherlv_23, grammarAccess.getECompositeComponentAccess().getRequiresEInterfaceCrossReference_8_2_1_0());
                    	    						

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

            // InternalMyDsl.g:2101:3: (otherlv_24= 'encapsulates:' ( (otherlv_25= RULE_ID ) ) (otherlv_26= ',' ( (otherlv_27= RULE_ID ) ) )* )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==47) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // InternalMyDsl.g:2102:4: otherlv_24= 'encapsulates:' ( (otherlv_25= RULE_ID ) ) (otherlv_26= ',' ( (otherlv_27= RULE_ID ) ) )*
                    {
                    otherlv_24=(Token)match(input,47,FOLLOW_56); 

                    				newLeafNode(otherlv_24, grammarAccess.getECompositeComponentAccess().getEncapsulatesKeyword_9_0());
                    			
                    // InternalMyDsl.g:2106:4: ( (otherlv_25= RULE_ID ) )
                    // InternalMyDsl.g:2107:5: (otherlv_25= RULE_ID )
                    {
                    // InternalMyDsl.g:2107:5: (otherlv_25= RULE_ID )
                    // InternalMyDsl.g:2108:6: otherlv_25= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getECompositeComponentRule());
                    						}
                    					
                    otherlv_25=(Token)match(input,RULE_ID,FOLLOW_68); 

                    						newLeafNode(otherlv_25, grammarAccess.getECompositeComponentAccess().getEncapsulatesEAssemblyContextCrossReference_9_1_0());
                    					

                    }


                    }

                    // InternalMyDsl.g:2119:4: (otherlv_26= ',' ( (otherlv_27= RULE_ID ) ) )*
                    loop74:
                    do {
                        int alt74=2;
                        int LA74_0 = input.LA(1);

                        if ( (LA74_0==14) ) {
                            alt74=1;
                        }


                        switch (alt74) {
                    	case 1 :
                    	    // InternalMyDsl.g:2120:5: otherlv_26= ',' ( (otherlv_27= RULE_ID ) )
                    	    {
                    	    otherlv_26=(Token)match(input,14,FOLLOW_56); 

                    	    					newLeafNode(otherlv_26, grammarAccess.getECompositeComponentAccess().getCommaKeyword_9_2_0());
                    	    				
                    	    // InternalMyDsl.g:2124:5: ( (otherlv_27= RULE_ID ) )
                    	    // InternalMyDsl.g:2125:6: (otherlv_27= RULE_ID )
                    	    {
                    	    // InternalMyDsl.g:2125:6: (otherlv_27= RULE_ID )
                    	    // InternalMyDsl.g:2126:7: otherlv_27= RULE_ID
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getECompositeComponentRule());
                    	    							}
                    	    						
                    	    otherlv_27=(Token)match(input,RULE_ID,FOLLOW_68); 

                    	    							newLeafNode(otherlv_27, grammarAccess.getECompositeComponentAccess().getEncapsulatesEAssemblyContextCrossReference_9_2_1_0());
                    	    						

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

            // InternalMyDsl.g:2139:3: (otherlv_28= 'behaviourDescription:' ( (lv_behaviourDescription_29_0= ruleEBehaviourDescription ) ) )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==54) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // InternalMyDsl.g:2140:4: otherlv_28= 'behaviourDescription:' ( (lv_behaviourDescription_29_0= ruleEBehaviourDescription ) )
                    {
                    otherlv_28=(Token)match(input,54,FOLLOW_35); 

                    				newLeafNode(otherlv_28, grammarAccess.getECompositeComponentAccess().getBehaviourDescriptionKeyword_10_0());
                    			
                    // InternalMyDsl.g:2144:4: ( (lv_behaviourDescription_29_0= ruleEBehaviourDescription ) )
                    // InternalMyDsl.g:2145:5: (lv_behaviourDescription_29_0= ruleEBehaviourDescription )
                    {
                    // InternalMyDsl.g:2145:5: (lv_behaviourDescription_29_0= ruleEBehaviourDescription )
                    // InternalMyDsl.g:2146:6: lv_behaviourDescription_29_0= ruleEBehaviourDescription
                    {

                    						newCompositeNode(grammarAccess.getECompositeComponentAccess().getBehaviourDescriptionEBehaviourDescriptionParserRuleCall_10_1_0());
                    					
                    pushFollow(FOLLOW_61);
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

            otherlv_30=(Token)match(input,36,FOLLOW_2); 

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
    // InternalMyDsl.g:2172:1: entryRuleEContainer returns [EObject current=null] : iv_ruleEContainer= ruleEContainer EOF ;
    public final EObject entryRuleEContainer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEContainer = null;


        try {
            // InternalMyDsl.g:2172:51: (iv_ruleEContainer= ruleEContainer EOF )
            // InternalMyDsl.g:2173:2: iv_ruleEContainer= ruleEContainer EOF
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
    // InternalMyDsl.g:2179:1: ruleEContainer returns [EObject current=null] : ( () otherlv_1= 'EContainer' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'connectedTo:' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* )? otherlv_8= '}' ) ;
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
            // InternalMyDsl.g:2185:2: ( ( () otherlv_1= 'EContainer' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'connectedTo:' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* )? otherlv_8= '}' ) )
            // InternalMyDsl.g:2186:2: ( () otherlv_1= 'EContainer' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'connectedTo:' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* )? otherlv_8= '}' )
            {
            // InternalMyDsl.g:2186:2: ( () otherlv_1= 'EContainer' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'connectedTo:' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* )? otherlv_8= '}' )
            // InternalMyDsl.g:2187:3: () otherlv_1= 'EContainer' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'connectedTo:' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* )? otherlv_8= '}'
            {
            // InternalMyDsl.g:2187:3: ()
            // InternalMyDsl.g:2188:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEContainerAccess().getEContainerAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,55,FOLLOW_48); 

            			newLeafNode(otherlv_1, grammarAccess.getEContainerAccess().getEContainerKeyword_1());
            		
            // InternalMyDsl.g:2198:3: ( (lv_name_2_0= ruleEString ) )
            // InternalMyDsl.g:2199:4: (lv_name_2_0= ruleEString )
            {
            // InternalMyDsl.g:2199:4: (lv_name_2_0= ruleEString )
            // InternalMyDsl.g:2200:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getEContainerAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_3);
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

            otherlv_3=(Token)match(input,12,FOLLOW_69); 

            			newLeafNode(otherlv_3, grammarAccess.getEContainerAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalMyDsl.g:2221:3: (otherlv_4= 'connectedTo:' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* )?
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==56) ) {
                alt78=1;
            }
            switch (alt78) {
                case 1 :
                    // InternalMyDsl.g:2222:4: otherlv_4= 'connectedTo:' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )*
                    {
                    otherlv_4=(Token)match(input,56,FOLLOW_56); 

                    				newLeafNode(otherlv_4, grammarAccess.getEContainerAccess().getConnectedToKeyword_4_0());
                    			
                    // InternalMyDsl.g:2226:4: ( (otherlv_5= RULE_ID ) )
                    // InternalMyDsl.g:2227:5: (otherlv_5= RULE_ID )
                    {
                    // InternalMyDsl.g:2227:5: (otherlv_5= RULE_ID )
                    // InternalMyDsl.g:2228:6: otherlv_5= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEContainerRule());
                    						}
                    					
                    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_47); 

                    						newLeafNode(otherlv_5, grammarAccess.getEContainerAccess().getConnectedToELinkCrossReference_4_1_0());
                    					

                    }


                    }

                    // InternalMyDsl.g:2239:4: (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )*
                    loop77:
                    do {
                        int alt77=2;
                        int LA77_0 = input.LA(1);

                        if ( (LA77_0==14) ) {
                            alt77=1;
                        }


                        switch (alt77) {
                    	case 1 :
                    	    // InternalMyDsl.g:2240:5: otherlv_6= ',' ( (otherlv_7= RULE_ID ) )
                    	    {
                    	    otherlv_6=(Token)match(input,14,FOLLOW_56); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getEContainerAccess().getCommaKeyword_4_2_0());
                    	    				
                    	    // InternalMyDsl.g:2244:5: ( (otherlv_7= RULE_ID ) )
                    	    // InternalMyDsl.g:2245:6: (otherlv_7= RULE_ID )
                    	    {
                    	    // InternalMyDsl.g:2245:6: (otherlv_7= RULE_ID )
                    	    // InternalMyDsl.g:2246:7: otherlv_7= RULE_ID
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getEContainerRule());
                    	    							}
                    	    						
                    	    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_47); 

                    	    							newLeafNode(otherlv_7, grammarAccess.getEContainerAccess().getConnectedToELinkCrossReference_4_2_1_0());
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop77;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_8=(Token)match(input,36,FOLLOW_2); 

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
    // InternalMyDsl.g:2267:1: entryRuleEAllocationContext returns [EObject current=null] : iv_ruleEAllocationContext= ruleEAllocationContext EOF ;
    public final EObject entryRuleEAllocationContext() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEAllocationContext = null;


        try {
            // InternalMyDsl.g:2267:59: (iv_ruleEAllocationContext= ruleEAllocationContext EOF )
            // InternalMyDsl.g:2268:2: iv_ruleEAllocationContext= ruleEAllocationContext EOF
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
    // InternalMyDsl.g:2274:1: ruleEAllocationContext returns [EObject current=null] : ( () otherlv_1= 'EAllocationContext' otherlv_2= '{' (otherlv_3= 'controls:' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* )? (otherlv_7= 'specifiesFor:' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* ) (otherlv_11= 'specifies:' ( (otherlv_12= RULE_ID ) ) ) otherlv_13= '}' ) ;
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
            // InternalMyDsl.g:2280:2: ( ( () otherlv_1= 'EAllocationContext' otherlv_2= '{' (otherlv_3= 'controls:' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* )? (otherlv_7= 'specifiesFor:' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* ) (otherlv_11= 'specifies:' ( (otherlv_12= RULE_ID ) ) ) otherlv_13= '}' ) )
            // InternalMyDsl.g:2281:2: ( () otherlv_1= 'EAllocationContext' otherlv_2= '{' (otherlv_3= 'controls:' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* )? (otherlv_7= 'specifiesFor:' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* ) (otherlv_11= 'specifies:' ( (otherlv_12= RULE_ID ) ) ) otherlv_13= '}' )
            {
            // InternalMyDsl.g:2281:2: ( () otherlv_1= 'EAllocationContext' otherlv_2= '{' (otherlv_3= 'controls:' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* )? (otherlv_7= 'specifiesFor:' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* ) (otherlv_11= 'specifies:' ( (otherlv_12= RULE_ID ) ) ) otherlv_13= '}' )
            // InternalMyDsl.g:2282:3: () otherlv_1= 'EAllocationContext' otherlv_2= '{' (otherlv_3= 'controls:' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* )? (otherlv_7= 'specifiesFor:' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* ) (otherlv_11= 'specifies:' ( (otherlv_12= RULE_ID ) ) ) otherlv_13= '}'
            {
            // InternalMyDsl.g:2282:3: ()
            // InternalMyDsl.g:2283:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEAllocationContextAccess().getEAllocationContextAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,57,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getEAllocationContextAccess().getEAllocationContextKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_70); 

            			newLeafNode(otherlv_2, grammarAccess.getEAllocationContextAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:2297:3: (otherlv_3= 'controls:' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* )?
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==58) ) {
                alt80=1;
            }
            switch (alt80) {
                case 1 :
                    // InternalMyDsl.g:2298:4: otherlv_3= 'controls:' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )*
                    {
                    otherlv_3=(Token)match(input,58,FOLLOW_56); 

                    				newLeafNode(otherlv_3, grammarAccess.getEAllocationContextAccess().getControlsKeyword_3_0());
                    			
                    // InternalMyDsl.g:2302:4: ( (otherlv_4= RULE_ID ) )
                    // InternalMyDsl.g:2303:5: (otherlv_4= RULE_ID )
                    {
                    // InternalMyDsl.g:2303:5: (otherlv_4= RULE_ID )
                    // InternalMyDsl.g:2304:6: otherlv_4= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEAllocationContextRule());
                    						}
                    					
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_71); 

                    						newLeafNode(otherlv_4, grammarAccess.getEAllocationContextAccess().getControlsEContainerCrossReference_3_1_0());
                    					

                    }


                    }

                    // InternalMyDsl.g:2315:4: (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )*
                    loop79:
                    do {
                        int alt79=2;
                        int LA79_0 = input.LA(1);

                        if ( (LA79_0==14) ) {
                            alt79=1;
                        }


                        switch (alt79) {
                    	case 1 :
                    	    // InternalMyDsl.g:2316:5: otherlv_5= ',' ( (otherlv_6= RULE_ID ) )
                    	    {
                    	    otherlv_5=(Token)match(input,14,FOLLOW_56); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getEAllocationContextAccess().getCommaKeyword_3_2_0());
                    	    				
                    	    // InternalMyDsl.g:2320:5: ( (otherlv_6= RULE_ID ) )
                    	    // InternalMyDsl.g:2321:6: (otherlv_6= RULE_ID )
                    	    {
                    	    // InternalMyDsl.g:2321:6: (otherlv_6= RULE_ID )
                    	    // InternalMyDsl.g:2322:7: otherlv_6= RULE_ID
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getEAllocationContextRule());
                    	    							}
                    	    						
                    	    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_71); 

                    	    							newLeafNode(otherlv_6, grammarAccess.getEAllocationContextAccess().getControlsEContainerCrossReference_3_2_1_0());
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop79;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalMyDsl.g:2335:3: (otherlv_7= 'specifiesFor:' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* )
            // InternalMyDsl.g:2336:4: otherlv_7= 'specifiesFor:' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )*
            {
            otherlv_7=(Token)match(input,59,FOLLOW_56); 

            				newLeafNode(otherlv_7, grammarAccess.getEAllocationContextAccess().getSpecifiesForKeyword_4_0());
            			
            // InternalMyDsl.g:2340:4: ( (otherlv_8= RULE_ID ) )
            // InternalMyDsl.g:2341:5: (otherlv_8= RULE_ID )
            {
            // InternalMyDsl.g:2341:5: (otherlv_8= RULE_ID )
            // InternalMyDsl.g:2342:6: otherlv_8= RULE_ID
            {

            						if (current==null) {
            							current = createModelElement(grammarAccess.getEAllocationContextRule());
            						}
            					
            otherlv_8=(Token)match(input,RULE_ID,FOLLOW_72); 

            						newLeafNode(otherlv_8, grammarAccess.getEAllocationContextAccess().getSpecifiesForESystemCrossReference_4_1_0());
            					

            }


            }

            // InternalMyDsl.g:2353:4: (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )*
            loop81:
            do {
                int alt81=2;
                int LA81_0 = input.LA(1);

                if ( (LA81_0==14) ) {
                    alt81=1;
                }


                switch (alt81) {
            	case 1 :
            	    // InternalMyDsl.g:2354:5: otherlv_9= ',' ( (otherlv_10= RULE_ID ) )
            	    {
            	    otherlv_9=(Token)match(input,14,FOLLOW_56); 

            	    					newLeafNode(otherlv_9, grammarAccess.getEAllocationContextAccess().getCommaKeyword_4_2_0());
            	    				
            	    // InternalMyDsl.g:2358:5: ( (otherlv_10= RULE_ID ) )
            	    // InternalMyDsl.g:2359:6: (otherlv_10= RULE_ID )
            	    {
            	    // InternalMyDsl.g:2359:6: (otherlv_10= RULE_ID )
            	    // InternalMyDsl.g:2360:7: otherlv_10= RULE_ID
            	    {

            	    							if (current==null) {
            	    								current = createModelElement(grammarAccess.getEAllocationContextRule());
            	    							}
            	    						
            	    otherlv_10=(Token)match(input,RULE_ID,FOLLOW_72); 

            	    							newLeafNode(otherlv_10, grammarAccess.getEAllocationContextAccess().getSpecifiesForESystemCrossReference_4_2_1_0());
            	    						

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop81;
                }
            } while (true);


            }

            // InternalMyDsl.g:2373:3: (otherlv_11= 'specifies:' ( (otherlv_12= RULE_ID ) ) )
            // InternalMyDsl.g:2374:4: otherlv_11= 'specifies:' ( (otherlv_12= RULE_ID ) )
            {
            otherlv_11=(Token)match(input,60,FOLLOW_56); 

            				newLeafNode(otherlv_11, grammarAccess.getEAllocationContextAccess().getSpecifiesKeyword_5_0());
            			
            // InternalMyDsl.g:2378:4: ( (otherlv_12= RULE_ID ) )
            // InternalMyDsl.g:2379:5: (otherlv_12= RULE_ID )
            {
            // InternalMyDsl.g:2379:5: (otherlv_12= RULE_ID )
            // InternalMyDsl.g:2380:6: otherlv_12= RULE_ID
            {

            						if (current==null) {
            							current = createModelElement(grammarAccess.getEAllocationContextRule());
            						}
            					
            otherlv_12=(Token)match(input,RULE_ID,FOLLOW_61); 

            						newLeafNode(otherlv_12, grammarAccess.getEAllocationContextAccess().getSpecifiesEAssemblyContextCrossReference_5_1_0());
            					

            }


            }


            }

            otherlv_13=(Token)match(input,36,FOLLOW_2); 

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
    // InternalMyDsl.g:2400:1: entryRuleERole returns [EObject current=null] : iv_ruleERole= ruleERole EOF ;
    public final EObject entryRuleERole() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleERole = null;


        try {
            // InternalMyDsl.g:2400:46: (iv_ruleERole= ruleERole EOF )
            // InternalMyDsl.g:2401:2: iv_ruleERole= ruleERole EOF
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
    // InternalMyDsl.g:2407:1: ruleERole returns [EObject current=null] : (this_ERequiredRole_0= ruleERequiredRole | this_EProvidedRole_1= ruleEProvidedRole ) ;
    public final EObject ruleERole() throws RecognitionException {
        EObject current = null;

        EObject this_ERequiredRole_0 = null;

        EObject this_EProvidedRole_1 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2413:2: ( (this_ERequiredRole_0= ruleERequiredRole | this_EProvidedRole_1= ruleEProvidedRole ) )
            // InternalMyDsl.g:2414:2: (this_ERequiredRole_0= ruleERequiredRole | this_EProvidedRole_1= ruleEProvidedRole )
            {
            // InternalMyDsl.g:2414:2: (this_ERequiredRole_0= ruleERequiredRole | this_EProvidedRole_1= ruleEProvidedRole )
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==61) ) {
                alt82=1;
            }
            else if ( (LA82_0==64) ) {
                alt82=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 82, 0, input);

                throw nvae;
            }
            switch (alt82) {
                case 1 :
                    // InternalMyDsl.g:2415:3: this_ERequiredRole_0= ruleERequiredRole
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
                    // InternalMyDsl.g:2424:3: this_EProvidedRole_1= ruleEProvidedRole
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
    // InternalMyDsl.g:2436:1: entryRuleERequiredRole returns [EObject current=null] : iv_ruleERequiredRole= ruleERequiredRole EOF ;
    public final EObject entryRuleERequiredRole() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleERequiredRole = null;


        try {
            // InternalMyDsl.g:2436:54: (iv_ruleERequiredRole= ruleERequiredRole EOF )
            // InternalMyDsl.g:2437:2: iv_ruleERequiredRole= ruleERequiredRole EOF
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
    // InternalMyDsl.g:2443:1: ruleERequiredRole returns [EObject current=null] : ( () otherlv_1= 'ERequiredRole' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'roleOf:' ( (otherlv_5= RULE_ID ) ) )? (otherlv_6= 'linkedTo:' ( (otherlv_7= RULE_ID ) ) )? otherlv_8= '}' ) ;
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
            // InternalMyDsl.g:2449:2: ( ( () otherlv_1= 'ERequiredRole' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'roleOf:' ( (otherlv_5= RULE_ID ) ) )? (otherlv_6= 'linkedTo:' ( (otherlv_7= RULE_ID ) ) )? otherlv_8= '}' ) )
            // InternalMyDsl.g:2450:2: ( () otherlv_1= 'ERequiredRole' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'roleOf:' ( (otherlv_5= RULE_ID ) ) )? (otherlv_6= 'linkedTo:' ( (otherlv_7= RULE_ID ) ) )? otherlv_8= '}' )
            {
            // InternalMyDsl.g:2450:2: ( () otherlv_1= 'ERequiredRole' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'roleOf:' ( (otherlv_5= RULE_ID ) ) )? (otherlv_6= 'linkedTo:' ( (otherlv_7= RULE_ID ) ) )? otherlv_8= '}' )
            // InternalMyDsl.g:2451:3: () otherlv_1= 'ERequiredRole' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'roleOf:' ( (otherlv_5= RULE_ID ) ) )? (otherlv_6= 'linkedTo:' ( (otherlv_7= RULE_ID ) ) )? otherlv_8= '}'
            {
            // InternalMyDsl.g:2451:3: ()
            // InternalMyDsl.g:2452:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getERequiredRoleAccess().getERequiredRoleAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,61,FOLLOW_48); 

            			newLeafNode(otherlv_1, grammarAccess.getERequiredRoleAccess().getERequiredRoleKeyword_1());
            		
            // InternalMyDsl.g:2462:3: ( (lv_name_2_0= ruleEString ) )
            // InternalMyDsl.g:2463:4: (lv_name_2_0= ruleEString )
            {
            // InternalMyDsl.g:2463:4: (lv_name_2_0= ruleEString )
            // InternalMyDsl.g:2464:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getERequiredRoleAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_3);
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

            otherlv_3=(Token)match(input,12,FOLLOW_73); 

            			newLeafNode(otherlv_3, grammarAccess.getERequiredRoleAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalMyDsl.g:2485:3: (otherlv_4= 'roleOf:' ( (otherlv_5= RULE_ID ) ) )?
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==62) ) {
                alt83=1;
            }
            switch (alt83) {
                case 1 :
                    // InternalMyDsl.g:2486:4: otherlv_4= 'roleOf:' ( (otherlv_5= RULE_ID ) )
                    {
                    otherlv_4=(Token)match(input,62,FOLLOW_56); 

                    				newLeafNode(otherlv_4, grammarAccess.getERequiredRoleAccess().getRoleOfKeyword_4_0());
                    			
                    // InternalMyDsl.g:2490:4: ( (otherlv_5= RULE_ID ) )
                    // InternalMyDsl.g:2491:5: (otherlv_5= RULE_ID )
                    {
                    // InternalMyDsl.g:2491:5: (otherlv_5= RULE_ID )
                    // InternalMyDsl.g:2492:6: otherlv_5= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getERequiredRoleRule());
                    						}
                    					
                    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_74); 

                    						newLeafNode(otherlv_5, grammarAccess.getERequiredRoleAccess().getRoleOfEAssemblyContextCrossReference_4_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:2504:3: (otherlv_6= 'linkedTo:' ( (otherlv_7= RULE_ID ) ) )?
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==63) ) {
                alt84=1;
            }
            switch (alt84) {
                case 1 :
                    // InternalMyDsl.g:2505:4: otherlv_6= 'linkedTo:' ( (otherlv_7= RULE_ID ) )
                    {
                    otherlv_6=(Token)match(input,63,FOLLOW_56); 

                    				newLeafNode(otherlv_6, grammarAccess.getERequiredRoleAccess().getLinkedToKeyword_5_0());
                    			
                    // InternalMyDsl.g:2509:4: ( (otherlv_7= RULE_ID ) )
                    // InternalMyDsl.g:2510:5: (otherlv_7= RULE_ID )
                    {
                    // InternalMyDsl.g:2510:5: (otherlv_7= RULE_ID )
                    // InternalMyDsl.g:2511:6: otherlv_7= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getERequiredRoleRule());
                    						}
                    					
                    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_61); 

                    						newLeafNode(otherlv_7, grammarAccess.getERequiredRoleAccess().getLinkedToEAssemblyConnectorCrossReference_5_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,36,FOLLOW_2); 

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
    // InternalMyDsl.g:2531:1: entryRuleEProvidedRole returns [EObject current=null] : iv_ruleEProvidedRole= ruleEProvidedRole EOF ;
    public final EObject entryRuleEProvidedRole() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEProvidedRole = null;


        try {
            // InternalMyDsl.g:2531:54: (iv_ruleEProvidedRole= ruleEProvidedRole EOF )
            // InternalMyDsl.g:2532:2: iv_ruleEProvidedRole= ruleEProvidedRole EOF
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
    // InternalMyDsl.g:2538:1: ruleEProvidedRole returns [EObject current=null] : ( () otherlv_1= 'EProvidedRole' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'roleOf:' ( (otherlv_5= RULE_ID ) ) )? (otherlv_6= 'linkedFrom:' ( (otherlv_7= RULE_ID ) ) )? otherlv_8= '}' ) ;
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
            // InternalMyDsl.g:2544:2: ( ( () otherlv_1= 'EProvidedRole' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'roleOf:' ( (otherlv_5= RULE_ID ) ) )? (otherlv_6= 'linkedFrom:' ( (otherlv_7= RULE_ID ) ) )? otherlv_8= '}' ) )
            // InternalMyDsl.g:2545:2: ( () otherlv_1= 'EProvidedRole' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'roleOf:' ( (otherlv_5= RULE_ID ) ) )? (otherlv_6= 'linkedFrom:' ( (otherlv_7= RULE_ID ) ) )? otherlv_8= '}' )
            {
            // InternalMyDsl.g:2545:2: ( () otherlv_1= 'EProvidedRole' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'roleOf:' ( (otherlv_5= RULE_ID ) ) )? (otherlv_6= 'linkedFrom:' ( (otherlv_7= RULE_ID ) ) )? otherlv_8= '}' )
            // InternalMyDsl.g:2546:3: () otherlv_1= 'EProvidedRole' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'roleOf:' ( (otherlv_5= RULE_ID ) ) )? (otherlv_6= 'linkedFrom:' ( (otherlv_7= RULE_ID ) ) )? otherlv_8= '}'
            {
            // InternalMyDsl.g:2546:3: ()
            // InternalMyDsl.g:2547:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEProvidedRoleAccess().getEProvidedRoleAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,64,FOLLOW_48); 

            			newLeafNode(otherlv_1, grammarAccess.getEProvidedRoleAccess().getEProvidedRoleKeyword_1());
            		
            // InternalMyDsl.g:2557:3: ( (lv_name_2_0= ruleEString ) )
            // InternalMyDsl.g:2558:4: (lv_name_2_0= ruleEString )
            {
            // InternalMyDsl.g:2558:4: (lv_name_2_0= ruleEString )
            // InternalMyDsl.g:2559:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getEProvidedRoleAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_3);
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

            otherlv_3=(Token)match(input,12,FOLLOW_75); 

            			newLeafNode(otherlv_3, grammarAccess.getEProvidedRoleAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalMyDsl.g:2580:3: (otherlv_4= 'roleOf:' ( (otherlv_5= RULE_ID ) ) )?
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==62) ) {
                alt85=1;
            }
            switch (alt85) {
                case 1 :
                    // InternalMyDsl.g:2581:4: otherlv_4= 'roleOf:' ( (otherlv_5= RULE_ID ) )
                    {
                    otherlv_4=(Token)match(input,62,FOLLOW_56); 

                    				newLeafNode(otherlv_4, grammarAccess.getEProvidedRoleAccess().getRoleOfKeyword_4_0());
                    			
                    // InternalMyDsl.g:2585:4: ( (otherlv_5= RULE_ID ) )
                    // InternalMyDsl.g:2586:5: (otherlv_5= RULE_ID )
                    {
                    // InternalMyDsl.g:2586:5: (otherlv_5= RULE_ID )
                    // InternalMyDsl.g:2587:6: otherlv_5= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEProvidedRoleRule());
                    						}
                    					
                    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_76); 

                    						newLeafNode(otherlv_5, grammarAccess.getEProvidedRoleAccess().getRoleOfEAssemblyContextCrossReference_4_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:2599:3: (otherlv_6= 'linkedFrom:' ( (otherlv_7= RULE_ID ) ) )?
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==65) ) {
                alt86=1;
            }
            switch (alt86) {
                case 1 :
                    // InternalMyDsl.g:2600:4: otherlv_6= 'linkedFrom:' ( (otherlv_7= RULE_ID ) )
                    {
                    otherlv_6=(Token)match(input,65,FOLLOW_56); 

                    				newLeafNode(otherlv_6, grammarAccess.getEProvidedRoleAccess().getLinkedFromKeyword_5_0());
                    			
                    // InternalMyDsl.g:2604:4: ( (otherlv_7= RULE_ID ) )
                    // InternalMyDsl.g:2605:5: (otherlv_7= RULE_ID )
                    {
                    // InternalMyDsl.g:2605:5: (otherlv_7= RULE_ID )
                    // InternalMyDsl.g:2606:6: otherlv_7= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEProvidedRoleRule());
                    						}
                    					
                    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_61); 

                    						newLeafNode(otherlv_7, grammarAccess.getEProvidedRoleAccess().getLinkedFromEAssemblyConnectorCrossReference_5_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,36,FOLLOW_2); 

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


    // $ANTLR start "entryRuleELink"
    // InternalMyDsl.g:2626:1: entryRuleELink returns [EObject current=null] : iv_ruleELink= ruleELink EOF ;
    public final EObject entryRuleELink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleELink = null;


        try {
            // InternalMyDsl.g:2626:46: (iv_ruleELink= ruleELink EOF )
            // InternalMyDsl.g:2627:2: iv_ruleELink= ruleELink EOF
            {
             newCompositeNode(grammarAccess.getELinkRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleELink=ruleELink();

            state._fsp--;

             current =iv_ruleELink; 
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
    // $ANTLR end "entryRuleELink"


    // $ANTLR start "ruleELink"
    // InternalMyDsl.g:2633:1: ruleELink returns [EObject current=null] : ( () otherlv_1= 'ELink' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'connects:' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )+ ) otherlv_8= '}' ) ;
    public final EObject ruleELink() throws RecognitionException {
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
            // InternalMyDsl.g:2639:2: ( ( () otherlv_1= 'ELink' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'connects:' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )+ ) otherlv_8= '}' ) )
            // InternalMyDsl.g:2640:2: ( () otherlv_1= 'ELink' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'connects:' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )+ ) otherlv_8= '}' )
            {
            // InternalMyDsl.g:2640:2: ( () otherlv_1= 'ELink' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'connects:' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )+ ) otherlv_8= '}' )
            // InternalMyDsl.g:2641:3: () otherlv_1= 'ELink' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'connects:' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )+ ) otherlv_8= '}'
            {
            // InternalMyDsl.g:2641:3: ()
            // InternalMyDsl.g:2642:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getELinkAccess().getELinkAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,66,FOLLOW_48); 

            			newLeafNode(otherlv_1, grammarAccess.getELinkAccess().getELinkKeyword_1());
            		
            // InternalMyDsl.g:2652:3: ( (lv_name_2_0= ruleEString ) )
            // InternalMyDsl.g:2653:4: (lv_name_2_0= ruleEString )
            {
            // InternalMyDsl.g:2653:4: (lv_name_2_0= ruleEString )
            // InternalMyDsl.g:2654:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getELinkAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getELinkRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_77); 

            			newLeafNode(otherlv_3, grammarAccess.getELinkAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalMyDsl.g:2675:3: (otherlv_4= 'connects:' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )+ )
            // InternalMyDsl.g:2676:4: otherlv_4= 'connects:' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )+
            {
            otherlv_4=(Token)match(input,67,FOLLOW_56); 

            				newLeafNode(otherlv_4, grammarAccess.getELinkAccess().getConnectsKeyword_4_0());
            			
            // InternalMyDsl.g:2680:4: ( (otherlv_5= RULE_ID ) )
            // InternalMyDsl.g:2681:5: (otherlv_5= RULE_ID )
            {
            // InternalMyDsl.g:2681:5: (otherlv_5= RULE_ID )
            // InternalMyDsl.g:2682:6: otherlv_5= RULE_ID
            {

            						if (current==null) {
            							current = createModelElement(grammarAccess.getELinkRule());
            						}
            					
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_78); 

            						newLeafNode(otherlv_5, grammarAccess.getELinkAccess().getConnectsEContainerCrossReference_4_1_0());
            					

            }


            }

            // InternalMyDsl.g:2693:4: (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )+
            int cnt87=0;
            loop87:
            do {
                int alt87=2;
                int LA87_0 = input.LA(1);

                if ( (LA87_0==14) ) {
                    alt87=1;
                }


                switch (alt87) {
            	case 1 :
            	    // InternalMyDsl.g:2694:5: otherlv_6= ',' ( (otherlv_7= RULE_ID ) )
            	    {
            	    otherlv_6=(Token)match(input,14,FOLLOW_56); 

            	    					newLeafNode(otherlv_6, grammarAccess.getELinkAccess().getCommaKeyword_4_2_0());
            	    				
            	    // InternalMyDsl.g:2698:5: ( (otherlv_7= RULE_ID ) )
            	    // InternalMyDsl.g:2699:6: (otherlv_7= RULE_ID )
            	    {
            	    // InternalMyDsl.g:2699:6: (otherlv_7= RULE_ID )
            	    // InternalMyDsl.g:2700:7: otherlv_7= RULE_ID
            	    {

            	    							if (current==null) {
            	    								current = createModelElement(grammarAccess.getELinkRule());
            	    							}
            	    						
            	    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_47); 

            	    							newLeafNode(otherlv_7, grammarAccess.getELinkAccess().getConnectsEContainerCrossReference_4_2_1_0());
            	    						

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt87 >= 1 ) break loop87;
                        EarlyExitException eee =
                            new EarlyExitException(87, input);
                        throw eee;
                }
                cnt87++;
            } while (true);


            }

            otherlv_8=(Token)match(input,36,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getELinkAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleELink"


    // $ANTLR start "entryRuleEAssemblyContext"
    // InternalMyDsl.g:2721:1: entryRuleEAssemblyContext returns [EObject current=null] : iv_ruleEAssemblyContext= ruleEAssemblyContext EOF ;
    public final EObject entryRuleEAssemblyContext() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEAssemblyContext = null;


        try {
            // InternalMyDsl.g:2721:57: (iv_ruleEAssemblyContext= ruleEAssemblyContext EOF )
            // InternalMyDsl.g:2722:2: iv_ruleEAssemblyContext= ruleEAssemblyContext EOF
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
    // InternalMyDsl.g:2728:1: ruleEAssemblyContext returns [EObject current=null] : ( () otherlv_1= 'EAssemblyContext' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'allocated:' ( (otherlv_5= RULE_ID ) ) )? (otherlv_6= 'encapsulatedByComponent:' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* )? (otherlv_10= 'encapsulatedBySystem:' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' ( (otherlv_13= RULE_ID ) ) )* )? (otherlv_14= 'instantiates:' ( (otherlv_15= RULE_ID ) ) (otherlv_16= ',' ( (otherlv_17= RULE_ID ) ) )* )? (otherlv_18= 'roles:' ( (lv_roles_19_0= ruleERole ) ) (otherlv_20= ',' ( (lv_roles_21_0= ruleERole ) ) )* )? otherlv_22= '}' ) ;
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
            // InternalMyDsl.g:2734:2: ( ( () otherlv_1= 'EAssemblyContext' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'allocated:' ( (otherlv_5= RULE_ID ) ) )? (otherlv_6= 'encapsulatedByComponent:' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* )? (otherlv_10= 'encapsulatedBySystem:' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' ( (otherlv_13= RULE_ID ) ) )* )? (otherlv_14= 'instantiates:' ( (otherlv_15= RULE_ID ) ) (otherlv_16= ',' ( (otherlv_17= RULE_ID ) ) )* )? (otherlv_18= 'roles:' ( (lv_roles_19_0= ruleERole ) ) (otherlv_20= ',' ( (lv_roles_21_0= ruleERole ) ) )* )? otherlv_22= '}' ) )
            // InternalMyDsl.g:2735:2: ( () otherlv_1= 'EAssemblyContext' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'allocated:' ( (otherlv_5= RULE_ID ) ) )? (otherlv_6= 'encapsulatedByComponent:' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* )? (otherlv_10= 'encapsulatedBySystem:' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' ( (otherlv_13= RULE_ID ) ) )* )? (otherlv_14= 'instantiates:' ( (otherlv_15= RULE_ID ) ) (otherlv_16= ',' ( (otherlv_17= RULE_ID ) ) )* )? (otherlv_18= 'roles:' ( (lv_roles_19_0= ruleERole ) ) (otherlv_20= ',' ( (lv_roles_21_0= ruleERole ) ) )* )? otherlv_22= '}' )
            {
            // InternalMyDsl.g:2735:2: ( () otherlv_1= 'EAssemblyContext' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'allocated:' ( (otherlv_5= RULE_ID ) ) )? (otherlv_6= 'encapsulatedByComponent:' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* )? (otherlv_10= 'encapsulatedBySystem:' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' ( (otherlv_13= RULE_ID ) ) )* )? (otherlv_14= 'instantiates:' ( (otherlv_15= RULE_ID ) ) (otherlv_16= ',' ( (otherlv_17= RULE_ID ) ) )* )? (otherlv_18= 'roles:' ( (lv_roles_19_0= ruleERole ) ) (otherlv_20= ',' ( (lv_roles_21_0= ruleERole ) ) )* )? otherlv_22= '}' )
            // InternalMyDsl.g:2736:3: () otherlv_1= 'EAssemblyContext' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'allocated:' ( (otherlv_5= RULE_ID ) ) )? (otherlv_6= 'encapsulatedByComponent:' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* )? (otherlv_10= 'encapsulatedBySystem:' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' ( (otherlv_13= RULE_ID ) ) )* )? (otherlv_14= 'instantiates:' ( (otherlv_15= RULE_ID ) ) (otherlv_16= ',' ( (otherlv_17= RULE_ID ) ) )* )? (otherlv_18= 'roles:' ( (lv_roles_19_0= ruleERole ) ) (otherlv_20= ',' ( (lv_roles_21_0= ruleERole ) ) )* )? otherlv_22= '}'
            {
            // InternalMyDsl.g:2736:3: ()
            // InternalMyDsl.g:2737:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEAssemblyContextAccess().getEAssemblyContextAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,68,FOLLOW_48); 

            			newLeafNode(otherlv_1, grammarAccess.getEAssemblyContextAccess().getEAssemblyContextKeyword_1());
            		
            // InternalMyDsl.g:2747:3: ( (lv_name_2_0= ruleEString ) )
            // InternalMyDsl.g:2748:4: (lv_name_2_0= ruleEString )
            {
            // InternalMyDsl.g:2748:4: (lv_name_2_0= ruleEString )
            // InternalMyDsl.g:2749:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getEAssemblyContextAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_3);
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

            otherlv_3=(Token)match(input,12,FOLLOW_79); 

            			newLeafNode(otherlv_3, grammarAccess.getEAssemblyContextAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalMyDsl.g:2770:3: (otherlv_4= 'allocated:' ( (otherlv_5= RULE_ID ) ) )?
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==69) ) {
                alt88=1;
            }
            switch (alt88) {
                case 1 :
                    // InternalMyDsl.g:2771:4: otherlv_4= 'allocated:' ( (otherlv_5= RULE_ID ) )
                    {
                    otherlv_4=(Token)match(input,69,FOLLOW_56); 

                    				newLeafNode(otherlv_4, grammarAccess.getEAssemblyContextAccess().getAllocatedKeyword_4_0());
                    			
                    // InternalMyDsl.g:2775:4: ( (otherlv_5= RULE_ID ) )
                    // InternalMyDsl.g:2776:5: (otherlv_5= RULE_ID )
                    {
                    // InternalMyDsl.g:2776:5: (otherlv_5= RULE_ID )
                    // InternalMyDsl.g:2777:6: otherlv_5= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEAssemblyContextRule());
                    						}
                    					
                    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_80); 

                    						newLeafNode(otherlv_5, grammarAccess.getEAssemblyContextAccess().getAllocatedEContainerCrossReference_4_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:2789:3: (otherlv_6= 'encapsulatedByComponent:' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* )?
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( (LA90_0==70) ) {
                alt90=1;
            }
            switch (alt90) {
                case 1 :
                    // InternalMyDsl.g:2790:4: otherlv_6= 'encapsulatedByComponent:' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )*
                    {
                    otherlv_6=(Token)match(input,70,FOLLOW_56); 

                    				newLeafNode(otherlv_6, grammarAccess.getEAssemblyContextAccess().getEncapsulatedByComponentKeyword_5_0());
                    			
                    // InternalMyDsl.g:2794:4: ( (otherlv_7= RULE_ID ) )
                    // InternalMyDsl.g:2795:5: (otherlv_7= RULE_ID )
                    {
                    // InternalMyDsl.g:2795:5: (otherlv_7= RULE_ID )
                    // InternalMyDsl.g:2796:6: otherlv_7= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEAssemblyContextRule());
                    						}
                    					
                    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_81); 

                    						newLeafNode(otherlv_7, grammarAccess.getEAssemblyContextAccess().getEncapsulatedByComponentECompositeComponentCrossReference_5_1_0());
                    					

                    }


                    }

                    // InternalMyDsl.g:2807:4: (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )*
                    loop89:
                    do {
                        int alt89=2;
                        int LA89_0 = input.LA(1);

                        if ( (LA89_0==14) ) {
                            alt89=1;
                        }


                        switch (alt89) {
                    	case 1 :
                    	    // InternalMyDsl.g:2808:5: otherlv_8= ',' ( (otherlv_9= RULE_ID ) )
                    	    {
                    	    otherlv_8=(Token)match(input,14,FOLLOW_56); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getEAssemblyContextAccess().getCommaKeyword_5_2_0());
                    	    				
                    	    // InternalMyDsl.g:2812:5: ( (otherlv_9= RULE_ID ) )
                    	    // InternalMyDsl.g:2813:6: (otherlv_9= RULE_ID )
                    	    {
                    	    // InternalMyDsl.g:2813:6: (otherlv_9= RULE_ID )
                    	    // InternalMyDsl.g:2814:7: otherlv_9= RULE_ID
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getEAssemblyContextRule());
                    	    							}
                    	    						
                    	    otherlv_9=(Token)match(input,RULE_ID,FOLLOW_81); 

                    	    							newLeafNode(otherlv_9, grammarAccess.getEAssemblyContextAccess().getEncapsulatedByComponentECompositeComponentCrossReference_5_2_1_0());
                    	    						

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

            // InternalMyDsl.g:2827:3: (otherlv_10= 'encapsulatedBySystem:' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' ( (otherlv_13= RULE_ID ) ) )* )?
            int alt92=2;
            int LA92_0 = input.LA(1);

            if ( (LA92_0==71) ) {
                alt92=1;
            }
            switch (alt92) {
                case 1 :
                    // InternalMyDsl.g:2828:4: otherlv_10= 'encapsulatedBySystem:' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' ( (otherlv_13= RULE_ID ) ) )*
                    {
                    otherlv_10=(Token)match(input,71,FOLLOW_56); 

                    				newLeafNode(otherlv_10, grammarAccess.getEAssemblyContextAccess().getEncapsulatedBySystemKeyword_6_0());
                    			
                    // InternalMyDsl.g:2832:4: ( (otherlv_11= RULE_ID ) )
                    // InternalMyDsl.g:2833:5: (otherlv_11= RULE_ID )
                    {
                    // InternalMyDsl.g:2833:5: (otherlv_11= RULE_ID )
                    // InternalMyDsl.g:2834:6: otherlv_11= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEAssemblyContextRule());
                    						}
                    					
                    otherlv_11=(Token)match(input,RULE_ID,FOLLOW_82); 

                    						newLeafNode(otherlv_11, grammarAccess.getEAssemblyContextAccess().getEncapsulatedBySystemESystemCrossReference_6_1_0());
                    					

                    }


                    }

                    // InternalMyDsl.g:2845:4: (otherlv_12= ',' ( (otherlv_13= RULE_ID ) ) )*
                    loop91:
                    do {
                        int alt91=2;
                        int LA91_0 = input.LA(1);

                        if ( (LA91_0==14) ) {
                            alt91=1;
                        }


                        switch (alt91) {
                    	case 1 :
                    	    // InternalMyDsl.g:2846:5: otherlv_12= ',' ( (otherlv_13= RULE_ID ) )
                    	    {
                    	    otherlv_12=(Token)match(input,14,FOLLOW_56); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getEAssemblyContextAccess().getCommaKeyword_6_2_0());
                    	    				
                    	    // InternalMyDsl.g:2850:5: ( (otherlv_13= RULE_ID ) )
                    	    // InternalMyDsl.g:2851:6: (otherlv_13= RULE_ID )
                    	    {
                    	    // InternalMyDsl.g:2851:6: (otherlv_13= RULE_ID )
                    	    // InternalMyDsl.g:2852:7: otherlv_13= RULE_ID
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getEAssemblyContextRule());
                    	    							}
                    	    						
                    	    otherlv_13=(Token)match(input,RULE_ID,FOLLOW_82); 

                    	    							newLeafNode(otherlv_13, grammarAccess.getEAssemblyContextAccess().getEncapsulatedBySystemESystemCrossReference_6_2_1_0());
                    	    						

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

            // InternalMyDsl.g:2865:3: (otherlv_14= 'instantiates:' ( (otherlv_15= RULE_ID ) ) (otherlv_16= ',' ( (otherlv_17= RULE_ID ) ) )* )?
            int alt94=2;
            int LA94_0 = input.LA(1);

            if ( (LA94_0==72) ) {
                alt94=1;
            }
            switch (alt94) {
                case 1 :
                    // InternalMyDsl.g:2866:4: otherlv_14= 'instantiates:' ( (otherlv_15= RULE_ID ) ) (otherlv_16= ',' ( (otherlv_17= RULE_ID ) ) )*
                    {
                    otherlv_14=(Token)match(input,72,FOLLOW_56); 

                    				newLeafNode(otherlv_14, grammarAccess.getEAssemblyContextAccess().getInstantiatesKeyword_7_0());
                    			
                    // InternalMyDsl.g:2870:4: ( (otherlv_15= RULE_ID ) )
                    // InternalMyDsl.g:2871:5: (otherlv_15= RULE_ID )
                    {
                    // InternalMyDsl.g:2871:5: (otherlv_15= RULE_ID )
                    // InternalMyDsl.g:2872:6: otherlv_15= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEAssemblyContextRule());
                    						}
                    					
                    otherlv_15=(Token)match(input,RULE_ID,FOLLOW_83); 

                    						newLeafNode(otherlv_15, grammarAccess.getEAssemblyContextAccess().getInstantiatesEComponentCrossReference_7_1_0());
                    					

                    }


                    }

                    // InternalMyDsl.g:2883:4: (otherlv_16= ',' ( (otherlv_17= RULE_ID ) ) )*
                    loop93:
                    do {
                        int alt93=2;
                        int LA93_0 = input.LA(1);

                        if ( (LA93_0==14) ) {
                            alt93=1;
                        }


                        switch (alt93) {
                    	case 1 :
                    	    // InternalMyDsl.g:2884:5: otherlv_16= ',' ( (otherlv_17= RULE_ID ) )
                    	    {
                    	    otherlv_16=(Token)match(input,14,FOLLOW_56); 

                    	    					newLeafNode(otherlv_16, grammarAccess.getEAssemblyContextAccess().getCommaKeyword_7_2_0());
                    	    				
                    	    // InternalMyDsl.g:2888:5: ( (otherlv_17= RULE_ID ) )
                    	    // InternalMyDsl.g:2889:6: (otherlv_17= RULE_ID )
                    	    {
                    	    // InternalMyDsl.g:2889:6: (otherlv_17= RULE_ID )
                    	    // InternalMyDsl.g:2890:7: otherlv_17= RULE_ID
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getEAssemblyContextRule());
                    	    							}
                    	    						
                    	    otherlv_17=(Token)match(input,RULE_ID,FOLLOW_83); 

                    	    							newLeafNode(otherlv_17, grammarAccess.getEAssemblyContextAccess().getInstantiatesEComponentCrossReference_7_2_1_0());
                    	    						

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

            // InternalMyDsl.g:2903:3: (otherlv_18= 'roles:' ( (lv_roles_19_0= ruleERole ) ) (otherlv_20= ',' ( (lv_roles_21_0= ruleERole ) ) )* )?
            int alt96=2;
            int LA96_0 = input.LA(1);

            if ( (LA96_0==73) ) {
                alt96=1;
            }
            switch (alt96) {
                case 1 :
                    // InternalMyDsl.g:2904:4: otherlv_18= 'roles:' ( (lv_roles_19_0= ruleERole ) ) (otherlv_20= ',' ( (lv_roles_21_0= ruleERole ) ) )*
                    {
                    otherlv_18=(Token)match(input,73,FOLLOW_15); 

                    				newLeafNode(otherlv_18, grammarAccess.getEAssemblyContextAccess().getRolesKeyword_8_0());
                    			
                    // InternalMyDsl.g:2908:4: ( (lv_roles_19_0= ruleERole ) )
                    // InternalMyDsl.g:2909:5: (lv_roles_19_0= ruleERole )
                    {
                    // InternalMyDsl.g:2909:5: (lv_roles_19_0= ruleERole )
                    // InternalMyDsl.g:2910:6: lv_roles_19_0= ruleERole
                    {

                    						newCompositeNode(grammarAccess.getEAssemblyContextAccess().getRolesERoleParserRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_47);
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

                    // InternalMyDsl.g:2927:4: (otherlv_20= ',' ( (lv_roles_21_0= ruleERole ) ) )*
                    loop95:
                    do {
                        int alt95=2;
                        int LA95_0 = input.LA(1);

                        if ( (LA95_0==14) ) {
                            alt95=1;
                        }


                        switch (alt95) {
                    	case 1 :
                    	    // InternalMyDsl.g:2928:5: otherlv_20= ',' ( (lv_roles_21_0= ruleERole ) )
                    	    {
                    	    otherlv_20=(Token)match(input,14,FOLLOW_15); 

                    	    					newLeafNode(otherlv_20, grammarAccess.getEAssemblyContextAccess().getCommaKeyword_8_2_0());
                    	    				
                    	    // InternalMyDsl.g:2932:5: ( (lv_roles_21_0= ruleERole ) )
                    	    // InternalMyDsl.g:2933:6: (lv_roles_21_0= ruleERole )
                    	    {
                    	    // InternalMyDsl.g:2933:6: (lv_roles_21_0= ruleERole )
                    	    // InternalMyDsl.g:2934:7: lv_roles_21_0= ruleERole
                    	    {

                    	    							newCompositeNode(grammarAccess.getEAssemblyContextAccess().getRolesERoleParserRuleCall_8_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_47);
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
                    	    break loop95;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_22=(Token)match(input,36,FOLLOW_2); 

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


    // $ANTLR start "entryRuleEAssemblyConnector"
    // InternalMyDsl.g:2961:1: entryRuleEAssemblyConnector returns [EObject current=null] : iv_ruleEAssemblyConnector= ruleEAssemblyConnector EOF ;
    public final EObject entryRuleEAssemblyConnector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEAssemblyConnector = null;


        try {
            // InternalMyDsl.g:2961:59: (iv_ruleEAssemblyConnector= ruleEAssemblyConnector EOF )
            // InternalMyDsl.g:2962:2: iv_ruleEAssemblyConnector= ruleEAssemblyConnector EOF
            {
             newCompositeNode(grammarAccess.getEAssemblyConnectorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEAssemblyConnector=ruleEAssemblyConnector();

            state._fsp--;

             current =iv_ruleEAssemblyConnector; 
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
    // $ANTLR end "entryRuleEAssemblyConnector"


    // $ANTLR start "ruleEAssemblyConnector"
    // InternalMyDsl.g:2968:1: ruleEAssemblyConnector returns [EObject current=null] : ( () otherlv_1= 'EAssemblyConnector' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'linkTo:' ( (otherlv_5= RULE_ID ) ) ) (otherlv_6= 'linkFrom:' ( (otherlv_7= RULE_ID ) ) ) otherlv_8= '}' ) ;
    public final EObject ruleEAssemblyConnector() throws RecognitionException {
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
            // InternalMyDsl.g:2974:2: ( ( () otherlv_1= 'EAssemblyConnector' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'linkTo:' ( (otherlv_5= RULE_ID ) ) ) (otherlv_6= 'linkFrom:' ( (otherlv_7= RULE_ID ) ) ) otherlv_8= '}' ) )
            // InternalMyDsl.g:2975:2: ( () otherlv_1= 'EAssemblyConnector' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'linkTo:' ( (otherlv_5= RULE_ID ) ) ) (otherlv_6= 'linkFrom:' ( (otherlv_7= RULE_ID ) ) ) otherlv_8= '}' )
            {
            // InternalMyDsl.g:2975:2: ( () otherlv_1= 'EAssemblyConnector' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'linkTo:' ( (otherlv_5= RULE_ID ) ) ) (otherlv_6= 'linkFrom:' ( (otherlv_7= RULE_ID ) ) ) otherlv_8= '}' )
            // InternalMyDsl.g:2976:3: () otherlv_1= 'EAssemblyConnector' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'linkTo:' ( (otherlv_5= RULE_ID ) ) ) (otherlv_6= 'linkFrom:' ( (otherlv_7= RULE_ID ) ) ) otherlv_8= '}'
            {
            // InternalMyDsl.g:2976:3: ()
            // InternalMyDsl.g:2977:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEAssemblyConnectorAccess().getEAssemblyConnectorAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,74,FOLLOW_48); 

            			newLeafNode(otherlv_1, grammarAccess.getEAssemblyConnectorAccess().getEAssemblyConnectorKeyword_1());
            		
            // InternalMyDsl.g:2987:3: ( (lv_name_2_0= ruleEString ) )
            // InternalMyDsl.g:2988:4: (lv_name_2_0= ruleEString )
            {
            // InternalMyDsl.g:2988:4: (lv_name_2_0= ruleEString )
            // InternalMyDsl.g:2989:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getEAssemblyConnectorAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEAssemblyConnectorRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_84); 

            			newLeafNode(otherlv_3, grammarAccess.getEAssemblyConnectorAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalMyDsl.g:3010:3: (otherlv_4= 'linkTo:' ( (otherlv_5= RULE_ID ) ) )
            // InternalMyDsl.g:3011:4: otherlv_4= 'linkTo:' ( (otherlv_5= RULE_ID ) )
            {
            otherlv_4=(Token)match(input,75,FOLLOW_56); 

            				newLeafNode(otherlv_4, grammarAccess.getEAssemblyConnectorAccess().getLinkToKeyword_4_0());
            			
            // InternalMyDsl.g:3015:4: ( (otherlv_5= RULE_ID ) )
            // InternalMyDsl.g:3016:5: (otherlv_5= RULE_ID )
            {
            // InternalMyDsl.g:3016:5: (otherlv_5= RULE_ID )
            // InternalMyDsl.g:3017:6: otherlv_5= RULE_ID
            {

            						if (current==null) {
            							current = createModelElement(grammarAccess.getEAssemblyConnectorRule());
            						}
            					
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_85); 

            						newLeafNode(otherlv_5, grammarAccess.getEAssemblyConnectorAccess().getLinkToERequiredRoleCrossReference_4_1_0());
            					

            }


            }


            }

            // InternalMyDsl.g:3029:3: (otherlv_6= 'linkFrom:' ( (otherlv_7= RULE_ID ) ) )
            // InternalMyDsl.g:3030:4: otherlv_6= 'linkFrom:' ( (otherlv_7= RULE_ID ) )
            {
            otherlv_6=(Token)match(input,76,FOLLOW_56); 

            				newLeafNode(otherlv_6, grammarAccess.getEAssemblyConnectorAccess().getLinkFromKeyword_5_0());
            			
            // InternalMyDsl.g:3034:4: ( (otherlv_7= RULE_ID ) )
            // InternalMyDsl.g:3035:5: (otherlv_7= RULE_ID )
            {
            // InternalMyDsl.g:3035:5: (otherlv_7= RULE_ID )
            // InternalMyDsl.g:3036:6: otherlv_7= RULE_ID
            {

            						if (current==null) {
            							current = createModelElement(grammarAccess.getEAssemblyConnectorRule());
            						}
            					
            otherlv_7=(Token)match(input,RULE_ID,FOLLOW_61); 

            						newLeafNode(otherlv_7, grammarAccess.getEAssemblyConnectorAccess().getLinkFromEProvidedRoleCrossReference_5_1_0());
            					

            }


            }


            }

            otherlv_8=(Token)match(input,36,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getEAssemblyConnectorAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleEAssemblyConnector"


    // $ANTLR start "entryRuleEProvidedDelegationConnector"
    // InternalMyDsl.g:3056:1: entryRuleEProvidedDelegationConnector returns [EObject current=null] : iv_ruleEProvidedDelegationConnector= ruleEProvidedDelegationConnector EOF ;
    public final EObject entryRuleEProvidedDelegationConnector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEProvidedDelegationConnector = null;


        try {
            // InternalMyDsl.g:3056:69: (iv_ruleEProvidedDelegationConnector= ruleEProvidedDelegationConnector EOF )
            // InternalMyDsl.g:3057:2: iv_ruleEProvidedDelegationConnector= ruleEProvidedDelegationConnector EOF
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
    // InternalMyDsl.g:3063:1: ruleEProvidedDelegationConnector returns [EObject current=null] : ( () otherlv_1= 'EProvidedDelegationConnector' otherlv_2= '{' (otherlv_3= 'linkFrom:' ( (otherlv_4= RULE_ID ) ) ) (otherlv_5= 'linkTo:' ( (otherlv_6= RULE_ID ) ) ) otherlv_7= '}' ) ;
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
            // InternalMyDsl.g:3069:2: ( ( () otherlv_1= 'EProvidedDelegationConnector' otherlv_2= '{' (otherlv_3= 'linkFrom:' ( (otherlv_4= RULE_ID ) ) ) (otherlv_5= 'linkTo:' ( (otherlv_6= RULE_ID ) ) ) otherlv_7= '}' ) )
            // InternalMyDsl.g:3070:2: ( () otherlv_1= 'EProvidedDelegationConnector' otherlv_2= '{' (otherlv_3= 'linkFrom:' ( (otherlv_4= RULE_ID ) ) ) (otherlv_5= 'linkTo:' ( (otherlv_6= RULE_ID ) ) ) otherlv_7= '}' )
            {
            // InternalMyDsl.g:3070:2: ( () otherlv_1= 'EProvidedDelegationConnector' otherlv_2= '{' (otherlv_3= 'linkFrom:' ( (otherlv_4= RULE_ID ) ) ) (otherlv_5= 'linkTo:' ( (otherlv_6= RULE_ID ) ) ) otherlv_7= '}' )
            // InternalMyDsl.g:3071:3: () otherlv_1= 'EProvidedDelegationConnector' otherlv_2= '{' (otherlv_3= 'linkFrom:' ( (otherlv_4= RULE_ID ) ) ) (otherlv_5= 'linkTo:' ( (otherlv_6= RULE_ID ) ) ) otherlv_7= '}'
            {
            // InternalMyDsl.g:3071:3: ()
            // InternalMyDsl.g:3072:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEProvidedDelegationConnectorAccess().getEProvidedDelegationConnectorAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,77,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getEProvidedDelegationConnectorAccess().getEProvidedDelegationConnectorKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_85); 

            			newLeafNode(otherlv_2, grammarAccess.getEProvidedDelegationConnectorAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:3086:3: (otherlv_3= 'linkFrom:' ( (otherlv_4= RULE_ID ) ) )
            // InternalMyDsl.g:3087:4: otherlv_3= 'linkFrom:' ( (otherlv_4= RULE_ID ) )
            {
            otherlv_3=(Token)match(input,76,FOLLOW_56); 

            				newLeafNode(otherlv_3, grammarAccess.getEProvidedDelegationConnectorAccess().getLinkFromKeyword_3_0());
            			
            // InternalMyDsl.g:3091:4: ( (otherlv_4= RULE_ID ) )
            // InternalMyDsl.g:3092:5: (otherlv_4= RULE_ID )
            {
            // InternalMyDsl.g:3092:5: (otherlv_4= RULE_ID )
            // InternalMyDsl.g:3093:6: otherlv_4= RULE_ID
            {

            						if (current==null) {
            							current = createModelElement(grammarAccess.getEProvidedDelegationConnectorRule());
            						}
            					
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_84); 

            						newLeafNode(otherlv_4, grammarAccess.getEProvidedDelegationConnectorAccess().getLinkFromEInterfaceCrossReference_3_1_0());
            					

            }


            }


            }

            // InternalMyDsl.g:3105:3: (otherlv_5= 'linkTo:' ( (otherlv_6= RULE_ID ) ) )
            // InternalMyDsl.g:3106:4: otherlv_5= 'linkTo:' ( (otherlv_6= RULE_ID ) )
            {
            otherlv_5=(Token)match(input,75,FOLLOW_56); 

            				newLeafNode(otherlv_5, grammarAccess.getEProvidedDelegationConnectorAccess().getLinkToKeyword_4_0());
            			
            // InternalMyDsl.g:3110:4: ( (otherlv_6= RULE_ID ) )
            // InternalMyDsl.g:3111:5: (otherlv_6= RULE_ID )
            {
            // InternalMyDsl.g:3111:5: (otherlv_6= RULE_ID )
            // InternalMyDsl.g:3112:6: otherlv_6= RULE_ID
            {

            						if (current==null) {
            							current = createModelElement(grammarAccess.getEProvidedDelegationConnectorRule());
            						}
            					
            otherlv_6=(Token)match(input,RULE_ID,FOLLOW_61); 

            						newLeafNode(otherlv_6, grammarAccess.getEProvidedDelegationConnectorAccess().getLinkToEProvidedRoleCrossReference_4_1_0());
            					

            }


            }


            }

            otherlv_7=(Token)match(input,36,FOLLOW_2); 

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
    // InternalMyDsl.g:3132:1: entryRuleERequiredDelegationConnector returns [EObject current=null] : iv_ruleERequiredDelegationConnector= ruleERequiredDelegationConnector EOF ;
    public final EObject entryRuleERequiredDelegationConnector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleERequiredDelegationConnector = null;


        try {
            // InternalMyDsl.g:3132:69: (iv_ruleERequiredDelegationConnector= ruleERequiredDelegationConnector EOF )
            // InternalMyDsl.g:3133:2: iv_ruleERequiredDelegationConnector= ruleERequiredDelegationConnector EOF
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
    // InternalMyDsl.g:3139:1: ruleERequiredDelegationConnector returns [EObject current=null] : ( () otherlv_1= 'ERequiredDelegationConnector' otherlv_2= '{' (otherlv_3= 'linkFrom:' ( (otherlv_4= RULE_ID ) ) ) (otherlv_5= 'linkTo:' ( (otherlv_6= RULE_ID ) ) ) otherlv_7= '}' ) ;
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
            // InternalMyDsl.g:3145:2: ( ( () otherlv_1= 'ERequiredDelegationConnector' otherlv_2= '{' (otherlv_3= 'linkFrom:' ( (otherlv_4= RULE_ID ) ) ) (otherlv_5= 'linkTo:' ( (otherlv_6= RULE_ID ) ) ) otherlv_7= '}' ) )
            // InternalMyDsl.g:3146:2: ( () otherlv_1= 'ERequiredDelegationConnector' otherlv_2= '{' (otherlv_3= 'linkFrom:' ( (otherlv_4= RULE_ID ) ) ) (otherlv_5= 'linkTo:' ( (otherlv_6= RULE_ID ) ) ) otherlv_7= '}' )
            {
            // InternalMyDsl.g:3146:2: ( () otherlv_1= 'ERequiredDelegationConnector' otherlv_2= '{' (otherlv_3= 'linkFrom:' ( (otherlv_4= RULE_ID ) ) ) (otherlv_5= 'linkTo:' ( (otherlv_6= RULE_ID ) ) ) otherlv_7= '}' )
            // InternalMyDsl.g:3147:3: () otherlv_1= 'ERequiredDelegationConnector' otherlv_2= '{' (otherlv_3= 'linkFrom:' ( (otherlv_4= RULE_ID ) ) ) (otherlv_5= 'linkTo:' ( (otherlv_6= RULE_ID ) ) ) otherlv_7= '}'
            {
            // InternalMyDsl.g:3147:3: ()
            // InternalMyDsl.g:3148:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getERequiredDelegationConnectorAccess().getERequiredDelegationConnectorAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,78,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getERequiredDelegationConnectorAccess().getERequiredDelegationConnectorKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_85); 

            			newLeafNode(otherlv_2, grammarAccess.getERequiredDelegationConnectorAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:3162:3: (otherlv_3= 'linkFrom:' ( (otherlv_4= RULE_ID ) ) )
            // InternalMyDsl.g:3163:4: otherlv_3= 'linkFrom:' ( (otherlv_4= RULE_ID ) )
            {
            otherlv_3=(Token)match(input,76,FOLLOW_56); 

            				newLeafNode(otherlv_3, grammarAccess.getERequiredDelegationConnectorAccess().getLinkFromKeyword_3_0());
            			
            // InternalMyDsl.g:3167:4: ( (otherlv_4= RULE_ID ) )
            // InternalMyDsl.g:3168:5: (otherlv_4= RULE_ID )
            {
            // InternalMyDsl.g:3168:5: (otherlv_4= RULE_ID )
            // InternalMyDsl.g:3169:6: otherlv_4= RULE_ID
            {

            						if (current==null) {
            							current = createModelElement(grammarAccess.getERequiredDelegationConnectorRule());
            						}
            					
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_84); 

            						newLeafNode(otherlv_4, grammarAccess.getERequiredDelegationConnectorAccess().getLinkFromERequiredRoleCrossReference_3_1_0());
            					

            }


            }


            }

            // InternalMyDsl.g:3181:3: (otherlv_5= 'linkTo:' ( (otherlv_6= RULE_ID ) ) )
            // InternalMyDsl.g:3182:4: otherlv_5= 'linkTo:' ( (otherlv_6= RULE_ID ) )
            {
            otherlv_5=(Token)match(input,75,FOLLOW_56); 

            				newLeafNode(otherlv_5, grammarAccess.getERequiredDelegationConnectorAccess().getLinkToKeyword_4_0());
            			
            // InternalMyDsl.g:3186:4: ( (otherlv_6= RULE_ID ) )
            // InternalMyDsl.g:3187:5: (otherlv_6= RULE_ID )
            {
            // InternalMyDsl.g:3187:5: (otherlv_6= RULE_ID )
            // InternalMyDsl.g:3188:6: otherlv_6= RULE_ID
            {

            						if (current==null) {
            							current = createModelElement(grammarAccess.getERequiredDelegationConnectorRule());
            						}
            					
            otherlv_6=(Token)match(input,RULE_ID,FOLLOW_61); 

            						newLeafNode(otherlv_6, grammarAccess.getERequiredDelegationConnectorAccess().getLinkToEInterfaceCrossReference_4_1_0());
            					

            }


            }


            }

            otherlv_7=(Token)match(input,36,FOLLOW_2); 

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


    // $ANTLR start "entryRuleEDelegationConnector"
    // InternalMyDsl.g:3208:1: entryRuleEDelegationConnector returns [EObject current=null] : iv_ruleEDelegationConnector= ruleEDelegationConnector EOF ;
    public final EObject entryRuleEDelegationConnector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEDelegationConnector = null;


        try {
            // InternalMyDsl.g:3208:61: (iv_ruleEDelegationConnector= ruleEDelegationConnector EOF )
            // InternalMyDsl.g:3209:2: iv_ruleEDelegationConnector= ruleEDelegationConnector EOF
            {
             newCompositeNode(grammarAccess.getEDelegationConnectorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEDelegationConnector=ruleEDelegationConnector();

            state._fsp--;

             current =iv_ruleEDelegationConnector; 
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
    // $ANTLR end "entryRuleEDelegationConnector"


    // $ANTLR start "ruleEDelegationConnector"
    // InternalMyDsl.g:3215:1: ruleEDelegationConnector returns [EObject current=null] : (this_EProvidedDelegationConnector_0= ruleEProvidedDelegationConnector | this_ERequiredDelegationConnector_1= ruleERequiredDelegationConnector ) ;
    public final EObject ruleEDelegationConnector() throws RecognitionException {
        EObject current = null;

        EObject this_EProvidedDelegationConnector_0 = null;

        EObject this_ERequiredDelegationConnector_1 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:3221:2: ( (this_EProvidedDelegationConnector_0= ruleEProvidedDelegationConnector | this_ERequiredDelegationConnector_1= ruleERequiredDelegationConnector ) )
            // InternalMyDsl.g:3222:2: (this_EProvidedDelegationConnector_0= ruleEProvidedDelegationConnector | this_ERequiredDelegationConnector_1= ruleERequiredDelegationConnector )
            {
            // InternalMyDsl.g:3222:2: (this_EProvidedDelegationConnector_0= ruleEProvidedDelegationConnector | this_ERequiredDelegationConnector_1= ruleERequiredDelegationConnector )
            int alt97=2;
            int LA97_0 = input.LA(1);

            if ( (LA97_0==77) ) {
                alt97=1;
            }
            else if ( (LA97_0==78) ) {
                alt97=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 97, 0, input);

                throw nvae;
            }
            switch (alt97) {
                case 1 :
                    // InternalMyDsl.g:3223:3: this_EProvidedDelegationConnector_0= ruleEProvidedDelegationConnector
                    {

                    			newCompositeNode(grammarAccess.getEDelegationConnectorAccess().getEProvidedDelegationConnectorParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_EProvidedDelegationConnector_0=ruleEProvidedDelegationConnector();

                    state._fsp--;


                    			current = this_EProvidedDelegationConnector_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:3232:3: this_ERequiredDelegationConnector_1= ruleERequiredDelegationConnector
                    {

                    			newCompositeNode(grammarAccess.getEDelegationConnectorAccess().getERequiredDelegationConnectorParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ERequiredDelegationConnector_1=ruleERequiredDelegationConnector();

                    state._fsp--;


                    			current = this_ERequiredDelegationConnector_1;
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
    // $ANTLR end "ruleEDelegationConnector"


    // $ANTLR start "entryRuleESystemIndependentViewPoint"
    // InternalMyDsl.g:3244:1: entryRuleESystemIndependentViewPoint returns [EObject current=null] : iv_ruleESystemIndependentViewPoint= ruleESystemIndependentViewPoint EOF ;
    public final EObject entryRuleESystemIndependentViewPoint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleESystemIndependentViewPoint = null;


        try {
            // InternalMyDsl.g:3244:68: (iv_ruleESystemIndependentViewPoint= ruleESystemIndependentViewPoint EOF )
            // InternalMyDsl.g:3245:2: iv_ruleESystemIndependentViewPoint= ruleESystemIndependentViewPoint EOF
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
    // InternalMyDsl.g:3251:1: ruleESystemIndependentViewPoint returns [EObject current=null] : ( () otherlv_1= 'ESystemIndependentViewPoint' otherlv_2= '{' (otherlv_3= 'repositoryViewType:' ( (lv_repositoryViewType_4_0= ruleERepositoryViewType ) ) ) otherlv_5= '}' ) ;
    public final EObject ruleESystemIndependentViewPoint() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_repositoryViewType_4_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:3257:2: ( ( () otherlv_1= 'ESystemIndependentViewPoint' otherlv_2= '{' (otherlv_3= 'repositoryViewType:' ( (lv_repositoryViewType_4_0= ruleERepositoryViewType ) ) ) otherlv_5= '}' ) )
            // InternalMyDsl.g:3258:2: ( () otherlv_1= 'ESystemIndependentViewPoint' otherlv_2= '{' (otherlv_3= 'repositoryViewType:' ( (lv_repositoryViewType_4_0= ruleERepositoryViewType ) ) ) otherlv_5= '}' )
            {
            // InternalMyDsl.g:3258:2: ( () otherlv_1= 'ESystemIndependentViewPoint' otherlv_2= '{' (otherlv_3= 'repositoryViewType:' ( (lv_repositoryViewType_4_0= ruleERepositoryViewType ) ) ) otherlv_5= '}' )
            // InternalMyDsl.g:3259:3: () otherlv_1= 'ESystemIndependentViewPoint' otherlv_2= '{' (otherlv_3= 'repositoryViewType:' ( (lv_repositoryViewType_4_0= ruleERepositoryViewType ) ) ) otherlv_5= '}'
            {
            // InternalMyDsl.g:3259:3: ()
            // InternalMyDsl.g:3260:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getESystemIndependentViewPointAccess().getESystemIndependentViewPointAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,79,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getESystemIndependentViewPointAccess().getESystemIndependentViewPointKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_86); 

            			newLeafNode(otherlv_2, grammarAccess.getESystemIndependentViewPointAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:3274:3: (otherlv_3= 'repositoryViewType:' ( (lv_repositoryViewType_4_0= ruleERepositoryViewType ) ) )
            // InternalMyDsl.g:3275:4: otherlv_3= 'repositoryViewType:' ( (lv_repositoryViewType_4_0= ruleERepositoryViewType ) )
            {
            otherlv_3=(Token)match(input,80,FOLLOW_87); 

            				newLeafNode(otherlv_3, grammarAccess.getESystemIndependentViewPointAccess().getRepositoryViewTypeKeyword_3_0());
            			
            // InternalMyDsl.g:3279:4: ( (lv_repositoryViewType_4_0= ruleERepositoryViewType ) )
            // InternalMyDsl.g:3280:5: (lv_repositoryViewType_4_0= ruleERepositoryViewType )
            {
            // InternalMyDsl.g:3280:5: (lv_repositoryViewType_4_0= ruleERepositoryViewType )
            // InternalMyDsl.g:3281:6: lv_repositoryViewType_4_0= ruleERepositoryViewType
            {

            						newCompositeNode(grammarAccess.getESystemIndependentViewPointAccess().getRepositoryViewTypeERepositoryViewTypeParserRuleCall_3_1_0());
            					
            pushFollow(FOLLOW_61);
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

            otherlv_5=(Token)match(input,36,FOLLOW_2); 

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
    // InternalMyDsl.g:3307:1: entryRuleEAssemblyViewPoint returns [EObject current=null] : iv_ruleEAssemblyViewPoint= ruleEAssemblyViewPoint EOF ;
    public final EObject entryRuleEAssemblyViewPoint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEAssemblyViewPoint = null;


        try {
            // InternalMyDsl.g:3307:59: (iv_ruleEAssemblyViewPoint= ruleEAssemblyViewPoint EOF )
            // InternalMyDsl.g:3308:2: iv_ruleEAssemblyViewPoint= ruleEAssemblyViewPoint EOF
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
    // InternalMyDsl.g:3314:1: ruleEAssemblyViewPoint returns [EObject current=null] : ( () otherlv_1= 'EAssemblyViewPoint' otherlv_2= '{' (otherlv_3= 'assemblyViewType:' ( (lv_assemblyViewType_4_0= ruleEAssemblyViewType ) ) ) otherlv_5= '}' ) ;
    public final EObject ruleEAssemblyViewPoint() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_assemblyViewType_4_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:3320:2: ( ( () otherlv_1= 'EAssemblyViewPoint' otherlv_2= '{' (otherlv_3= 'assemblyViewType:' ( (lv_assemblyViewType_4_0= ruleEAssemblyViewType ) ) ) otherlv_5= '}' ) )
            // InternalMyDsl.g:3321:2: ( () otherlv_1= 'EAssemblyViewPoint' otherlv_2= '{' (otherlv_3= 'assemblyViewType:' ( (lv_assemblyViewType_4_0= ruleEAssemblyViewType ) ) ) otherlv_5= '}' )
            {
            // InternalMyDsl.g:3321:2: ( () otherlv_1= 'EAssemblyViewPoint' otherlv_2= '{' (otherlv_3= 'assemblyViewType:' ( (lv_assemblyViewType_4_0= ruleEAssemblyViewType ) ) ) otherlv_5= '}' )
            // InternalMyDsl.g:3322:3: () otherlv_1= 'EAssemblyViewPoint' otherlv_2= '{' (otherlv_3= 'assemblyViewType:' ( (lv_assemblyViewType_4_0= ruleEAssemblyViewType ) ) ) otherlv_5= '}'
            {
            // InternalMyDsl.g:3322:3: ()
            // InternalMyDsl.g:3323:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEAssemblyViewPointAccess().getEAssemblyViewPointAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,81,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getEAssemblyViewPointAccess().getEAssemblyViewPointKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_88); 

            			newLeafNode(otherlv_2, grammarAccess.getEAssemblyViewPointAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:3337:3: (otherlv_3= 'assemblyViewType:' ( (lv_assemblyViewType_4_0= ruleEAssemblyViewType ) ) )
            // InternalMyDsl.g:3338:4: otherlv_3= 'assemblyViewType:' ( (lv_assemblyViewType_4_0= ruleEAssemblyViewType ) )
            {
            otherlv_3=(Token)match(input,82,FOLLOW_89); 

            				newLeafNode(otherlv_3, grammarAccess.getEAssemblyViewPointAccess().getAssemblyViewTypeKeyword_3_0());
            			
            // InternalMyDsl.g:3342:4: ( (lv_assemblyViewType_4_0= ruleEAssemblyViewType ) )
            // InternalMyDsl.g:3343:5: (lv_assemblyViewType_4_0= ruleEAssemblyViewType )
            {
            // InternalMyDsl.g:3343:5: (lv_assemblyViewType_4_0= ruleEAssemblyViewType )
            // InternalMyDsl.g:3344:6: lv_assemblyViewType_4_0= ruleEAssemblyViewType
            {

            						newCompositeNode(grammarAccess.getEAssemblyViewPointAccess().getAssemblyViewTypeEAssemblyViewTypeParserRuleCall_3_1_0());
            					
            pushFollow(FOLLOW_61);
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

            otherlv_5=(Token)match(input,36,FOLLOW_2); 

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
    // InternalMyDsl.g:3370:1: entryRuleEDeploymentViewPoint returns [EObject current=null] : iv_ruleEDeploymentViewPoint= ruleEDeploymentViewPoint EOF ;
    public final EObject entryRuleEDeploymentViewPoint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEDeploymentViewPoint = null;


        try {
            // InternalMyDsl.g:3370:61: (iv_ruleEDeploymentViewPoint= ruleEDeploymentViewPoint EOF )
            // InternalMyDsl.g:3371:2: iv_ruleEDeploymentViewPoint= ruleEDeploymentViewPoint EOF
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
    // InternalMyDsl.g:3377:1: ruleEDeploymentViewPoint returns [EObject current=null] : ( () otherlv_1= 'EDeploymentViewPoint' otherlv_2= '{' otherlv_3= 'allocationViewType:' ( (lv_allocationViewType_4_0= ruleEAllocationViewType ) ) otherlv_5= 'environmentViewType:' ( (lv_environmentViewType_6_0= ruleEEnvironmentViewType ) ) otherlv_7= '}' ) ;
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
            // InternalMyDsl.g:3383:2: ( ( () otherlv_1= 'EDeploymentViewPoint' otherlv_2= '{' otherlv_3= 'allocationViewType:' ( (lv_allocationViewType_4_0= ruleEAllocationViewType ) ) otherlv_5= 'environmentViewType:' ( (lv_environmentViewType_6_0= ruleEEnvironmentViewType ) ) otherlv_7= '}' ) )
            // InternalMyDsl.g:3384:2: ( () otherlv_1= 'EDeploymentViewPoint' otherlv_2= '{' otherlv_3= 'allocationViewType:' ( (lv_allocationViewType_4_0= ruleEAllocationViewType ) ) otherlv_5= 'environmentViewType:' ( (lv_environmentViewType_6_0= ruleEEnvironmentViewType ) ) otherlv_7= '}' )
            {
            // InternalMyDsl.g:3384:2: ( () otherlv_1= 'EDeploymentViewPoint' otherlv_2= '{' otherlv_3= 'allocationViewType:' ( (lv_allocationViewType_4_0= ruleEAllocationViewType ) ) otherlv_5= 'environmentViewType:' ( (lv_environmentViewType_6_0= ruleEEnvironmentViewType ) ) otherlv_7= '}' )
            // InternalMyDsl.g:3385:3: () otherlv_1= 'EDeploymentViewPoint' otherlv_2= '{' otherlv_3= 'allocationViewType:' ( (lv_allocationViewType_4_0= ruleEAllocationViewType ) ) otherlv_5= 'environmentViewType:' ( (lv_environmentViewType_6_0= ruleEEnvironmentViewType ) ) otherlv_7= '}'
            {
            // InternalMyDsl.g:3385:3: ()
            // InternalMyDsl.g:3386:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEDeploymentViewPointAccess().getEDeploymentViewPointAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,83,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getEDeploymentViewPointAccess().getEDeploymentViewPointKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_90); 

            			newLeafNode(otherlv_2, grammarAccess.getEDeploymentViewPointAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,84,FOLLOW_91); 

            			newLeafNode(otherlv_3, grammarAccess.getEDeploymentViewPointAccess().getAllocationViewTypeKeyword_3());
            		
            // InternalMyDsl.g:3404:3: ( (lv_allocationViewType_4_0= ruleEAllocationViewType ) )
            // InternalMyDsl.g:3405:4: (lv_allocationViewType_4_0= ruleEAllocationViewType )
            {
            // InternalMyDsl.g:3405:4: (lv_allocationViewType_4_0= ruleEAllocationViewType )
            // InternalMyDsl.g:3406:5: lv_allocationViewType_4_0= ruleEAllocationViewType
            {

            					newCompositeNode(grammarAccess.getEDeploymentViewPointAccess().getAllocationViewTypeEAllocationViewTypeParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_92);
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

            otherlv_5=(Token)match(input,85,FOLLOW_7); 

            			newLeafNode(otherlv_5, grammarAccess.getEDeploymentViewPointAccess().getEnvironmentViewTypeKeyword_5());
            		
            // InternalMyDsl.g:3427:3: ( (lv_environmentViewType_6_0= ruleEEnvironmentViewType ) )
            // InternalMyDsl.g:3428:4: (lv_environmentViewType_6_0= ruleEEnvironmentViewType )
            {
            // InternalMyDsl.g:3428:4: (lv_environmentViewType_6_0= ruleEEnvironmentViewType )
            // InternalMyDsl.g:3429:5: lv_environmentViewType_6_0= ruleEEnvironmentViewType
            {

            					newCompositeNode(grammarAccess.getEDeploymentViewPointAccess().getEnvironmentViewTypeEEnvironmentViewTypeParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_61);
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

            otherlv_7=(Token)match(input,36,FOLLOW_2); 

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


    // $ANTLR start "entryRuleEViewType"
    // InternalMyDsl.g:3454:1: entryRuleEViewType returns [EObject current=null] : iv_ruleEViewType= ruleEViewType EOF ;
    public final EObject entryRuleEViewType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEViewType = null;


        try {
            // InternalMyDsl.g:3454:50: (iv_ruleEViewType= ruleEViewType EOF )
            // InternalMyDsl.g:3455:2: iv_ruleEViewType= ruleEViewType EOF
            {
             newCompositeNode(grammarAccess.getEViewTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEViewType=ruleEViewType();

            state._fsp--;

             current =iv_ruleEViewType; 
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
    // $ANTLR end "entryRuleEViewType"


    // $ANTLR start "ruleEViewType"
    // InternalMyDsl.g:3461:1: ruleEViewType returns [EObject current=null] : (this_ERepositoryViewType_0= ruleERepositoryViewType | this_EAssemblyViewType_1= ruleEAssemblyViewType | this_EAllocationViewType_2= ruleEAllocationViewType | this_EEnvironmentViewType_3= ruleEEnvironmentViewType ) ;
    public final EObject ruleEViewType() throws RecognitionException {
        EObject current = null;

        EObject this_ERepositoryViewType_0 = null;

        EObject this_EAssemblyViewType_1 = null;

        EObject this_EAllocationViewType_2 = null;

        EObject this_EEnvironmentViewType_3 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:3467:2: ( (this_ERepositoryViewType_0= ruleERepositoryViewType | this_EAssemblyViewType_1= ruleEAssemblyViewType | this_EAllocationViewType_2= ruleEAllocationViewType | this_EEnvironmentViewType_3= ruleEEnvironmentViewType ) )
            // InternalMyDsl.g:3468:2: (this_ERepositoryViewType_0= ruleERepositoryViewType | this_EAssemblyViewType_1= ruleEAssemblyViewType | this_EAllocationViewType_2= ruleEAllocationViewType | this_EEnvironmentViewType_3= ruleEEnvironmentViewType )
            {
            // InternalMyDsl.g:3468:2: (this_ERepositoryViewType_0= ruleERepositoryViewType | this_EAssemblyViewType_1= ruleEAssemblyViewType | this_EAllocationViewType_2= ruleEAllocationViewType | this_EEnvironmentViewType_3= ruleEEnvironmentViewType )
            int alt98=4;
            switch ( input.LA(1) ) {
            case 86:
                {
                alt98=1;
                }
                break;
            case 89:
                {
                alt98=2;
                }
                break;
            case 91:
                {
                alt98=3;
                }
                break;
            case 93:
                {
                alt98=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 98, 0, input);

                throw nvae;
            }

            switch (alt98) {
                case 1 :
                    // InternalMyDsl.g:3469:3: this_ERepositoryViewType_0= ruleERepositoryViewType
                    {

                    			newCompositeNode(grammarAccess.getEViewTypeAccess().getERepositoryViewTypeParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ERepositoryViewType_0=ruleERepositoryViewType();

                    state._fsp--;


                    			current = this_ERepositoryViewType_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:3478:3: this_EAssemblyViewType_1= ruleEAssemblyViewType
                    {

                    			newCompositeNode(grammarAccess.getEViewTypeAccess().getEAssemblyViewTypeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_EAssemblyViewType_1=ruleEAssemblyViewType();

                    state._fsp--;


                    			current = this_EAssemblyViewType_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:3487:3: this_EAllocationViewType_2= ruleEAllocationViewType
                    {

                    			newCompositeNode(grammarAccess.getEViewTypeAccess().getEAllocationViewTypeParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_EAllocationViewType_2=ruleEAllocationViewType();

                    state._fsp--;


                    			current = this_EAllocationViewType_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:3496:3: this_EEnvironmentViewType_3= ruleEEnvironmentViewType
                    {

                    			newCompositeNode(grammarAccess.getEViewTypeAccess().getEEnvironmentViewTypeParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_EEnvironmentViewType_3=ruleEEnvironmentViewType();

                    state._fsp--;


                    			current = this_EEnvironmentViewType_3;
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
    // $ANTLR end "ruleEViewType"


    // $ANTLR start "entryRuleERepositoryViewType"
    // InternalMyDsl.g:3508:1: entryRuleERepositoryViewType returns [EObject current=null] : iv_ruleERepositoryViewType= ruleERepositoryViewType EOF ;
    public final EObject entryRuleERepositoryViewType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleERepositoryViewType = null;


        try {
            // InternalMyDsl.g:3508:60: (iv_ruleERepositoryViewType= ruleERepositoryViewType EOF )
            // InternalMyDsl.g:3509:2: iv_ruleERepositoryViewType= ruleERepositoryViewType EOF
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
    // InternalMyDsl.g:3515:1: ruleERepositoryViewType returns [EObject current=null] : ( () otherlv_1= 'ERepositoryViewType' otherlv_2= '{' (otherlv_3= 'showsInterfaces:' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* )? (otherlv_7= 'showsComponents:' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* )? otherlv_11= '}' ) ;
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
            // InternalMyDsl.g:3521:2: ( ( () otherlv_1= 'ERepositoryViewType' otherlv_2= '{' (otherlv_3= 'showsInterfaces:' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* )? (otherlv_7= 'showsComponents:' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* )? otherlv_11= '}' ) )
            // InternalMyDsl.g:3522:2: ( () otherlv_1= 'ERepositoryViewType' otherlv_2= '{' (otherlv_3= 'showsInterfaces:' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* )? (otherlv_7= 'showsComponents:' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* )? otherlv_11= '}' )
            {
            // InternalMyDsl.g:3522:2: ( () otherlv_1= 'ERepositoryViewType' otherlv_2= '{' (otherlv_3= 'showsInterfaces:' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* )? (otherlv_7= 'showsComponents:' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* )? otherlv_11= '}' )
            // InternalMyDsl.g:3523:3: () otherlv_1= 'ERepositoryViewType' otherlv_2= '{' (otherlv_3= 'showsInterfaces:' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* )? (otherlv_7= 'showsComponents:' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* )? otherlv_11= '}'
            {
            // InternalMyDsl.g:3523:3: ()
            // InternalMyDsl.g:3524:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getERepositoryViewTypeAccess().getERepositoryViewTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,86,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getERepositoryViewTypeAccess().getERepositoryViewTypeKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_93); 

            			newLeafNode(otherlv_2, grammarAccess.getERepositoryViewTypeAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:3538:3: (otherlv_3= 'showsInterfaces:' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* )?
            int alt100=2;
            int LA100_0 = input.LA(1);

            if ( (LA100_0==87) ) {
                alt100=1;
            }
            switch (alt100) {
                case 1 :
                    // InternalMyDsl.g:3539:4: otherlv_3= 'showsInterfaces:' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )*
                    {
                    otherlv_3=(Token)match(input,87,FOLLOW_56); 

                    				newLeafNode(otherlv_3, grammarAccess.getERepositoryViewTypeAccess().getShowsInterfacesKeyword_3_0());
                    			
                    // InternalMyDsl.g:3543:4: ( (otherlv_4= RULE_ID ) )
                    // InternalMyDsl.g:3544:5: (otherlv_4= RULE_ID )
                    {
                    // InternalMyDsl.g:3544:5: (otherlv_4= RULE_ID )
                    // InternalMyDsl.g:3545:6: otherlv_4= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getERepositoryViewTypeRule());
                    						}
                    					
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_94); 

                    						newLeafNode(otherlv_4, grammarAccess.getERepositoryViewTypeAccess().getShowsInterfacesEInterfaceCrossReference_3_1_0());
                    					

                    }


                    }

                    // InternalMyDsl.g:3556:4: (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )*
                    loop99:
                    do {
                        int alt99=2;
                        int LA99_0 = input.LA(1);

                        if ( (LA99_0==14) ) {
                            alt99=1;
                        }


                        switch (alt99) {
                    	case 1 :
                    	    // InternalMyDsl.g:3557:5: otherlv_5= ',' ( (otherlv_6= RULE_ID ) )
                    	    {
                    	    otherlv_5=(Token)match(input,14,FOLLOW_56); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getERepositoryViewTypeAccess().getCommaKeyword_3_2_0());
                    	    				
                    	    // InternalMyDsl.g:3561:5: ( (otherlv_6= RULE_ID ) )
                    	    // InternalMyDsl.g:3562:6: (otherlv_6= RULE_ID )
                    	    {
                    	    // InternalMyDsl.g:3562:6: (otherlv_6= RULE_ID )
                    	    // InternalMyDsl.g:3563:7: otherlv_6= RULE_ID
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getERepositoryViewTypeRule());
                    	    							}
                    	    						
                    	    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_94); 

                    	    							newLeafNode(otherlv_6, grammarAccess.getERepositoryViewTypeAccess().getShowsInterfacesEInterfaceCrossReference_3_2_1_0());
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop99;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalMyDsl.g:3576:3: (otherlv_7= 'showsComponents:' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* )?
            int alt102=2;
            int LA102_0 = input.LA(1);

            if ( (LA102_0==88) ) {
                alt102=1;
            }
            switch (alt102) {
                case 1 :
                    // InternalMyDsl.g:3577:4: otherlv_7= 'showsComponents:' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )*
                    {
                    otherlv_7=(Token)match(input,88,FOLLOW_56); 

                    				newLeafNode(otherlv_7, grammarAccess.getERepositoryViewTypeAccess().getShowsComponentsKeyword_4_0());
                    			
                    // InternalMyDsl.g:3581:4: ( (otherlv_8= RULE_ID ) )
                    // InternalMyDsl.g:3582:5: (otherlv_8= RULE_ID )
                    {
                    // InternalMyDsl.g:3582:5: (otherlv_8= RULE_ID )
                    // InternalMyDsl.g:3583:6: otherlv_8= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getERepositoryViewTypeRule());
                    						}
                    					
                    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_47); 

                    						newLeafNode(otherlv_8, grammarAccess.getERepositoryViewTypeAccess().getShowsComponentsEComponentCrossReference_4_1_0());
                    					

                    }


                    }

                    // InternalMyDsl.g:3594:4: (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )*
                    loop101:
                    do {
                        int alt101=2;
                        int LA101_0 = input.LA(1);

                        if ( (LA101_0==14) ) {
                            alt101=1;
                        }


                        switch (alt101) {
                    	case 1 :
                    	    // InternalMyDsl.g:3595:5: otherlv_9= ',' ( (otherlv_10= RULE_ID ) )
                    	    {
                    	    otherlv_9=(Token)match(input,14,FOLLOW_56); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getERepositoryViewTypeAccess().getCommaKeyword_4_2_0());
                    	    				
                    	    // InternalMyDsl.g:3599:5: ( (otherlv_10= RULE_ID ) )
                    	    // InternalMyDsl.g:3600:6: (otherlv_10= RULE_ID )
                    	    {
                    	    // InternalMyDsl.g:3600:6: (otherlv_10= RULE_ID )
                    	    // InternalMyDsl.g:3601:7: otherlv_10= RULE_ID
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getERepositoryViewTypeRule());
                    	    							}
                    	    						
                    	    otherlv_10=(Token)match(input,RULE_ID,FOLLOW_47); 

                    	    							newLeafNode(otherlv_10, grammarAccess.getERepositoryViewTypeAccess().getShowsComponentsEComponentCrossReference_4_2_1_0());
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop101;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_11=(Token)match(input,36,FOLLOW_2); 

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
    // InternalMyDsl.g:3622:1: entryRuleEAssemblyViewType returns [EObject current=null] : iv_ruleEAssemblyViewType= ruleEAssemblyViewType EOF ;
    public final EObject entryRuleEAssemblyViewType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEAssemblyViewType = null;


        try {
            // InternalMyDsl.g:3622:58: (iv_ruleEAssemblyViewType= ruleEAssemblyViewType EOF )
            // InternalMyDsl.g:3623:2: iv_ruleEAssemblyViewType= ruleEAssemblyViewType EOF
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
    // InternalMyDsl.g:3629:1: ruleEAssemblyViewType returns [EObject current=null] : ( () otherlv_1= 'EAssemblyViewType' otherlv_2= '{' (otherlv_3= 'mainArtifacts:' ( (lv_mainArtifacts_4_0= ruleEAssemblyContext ) ) (otherlv_5= ',' ( (lv_mainArtifacts_6_0= ruleEAssemblyContext ) ) )* )? (otherlv_7= 'showsComponents:' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* )? otherlv_11= '}' ) ;
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
            // InternalMyDsl.g:3635:2: ( ( () otherlv_1= 'EAssemblyViewType' otherlv_2= '{' (otherlv_3= 'mainArtifacts:' ( (lv_mainArtifacts_4_0= ruleEAssemblyContext ) ) (otherlv_5= ',' ( (lv_mainArtifacts_6_0= ruleEAssemblyContext ) ) )* )? (otherlv_7= 'showsComponents:' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* )? otherlv_11= '}' ) )
            // InternalMyDsl.g:3636:2: ( () otherlv_1= 'EAssemblyViewType' otherlv_2= '{' (otherlv_3= 'mainArtifacts:' ( (lv_mainArtifacts_4_0= ruleEAssemblyContext ) ) (otherlv_5= ',' ( (lv_mainArtifacts_6_0= ruleEAssemblyContext ) ) )* )? (otherlv_7= 'showsComponents:' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* )? otherlv_11= '}' )
            {
            // InternalMyDsl.g:3636:2: ( () otherlv_1= 'EAssemblyViewType' otherlv_2= '{' (otherlv_3= 'mainArtifacts:' ( (lv_mainArtifacts_4_0= ruleEAssemblyContext ) ) (otherlv_5= ',' ( (lv_mainArtifacts_6_0= ruleEAssemblyContext ) ) )* )? (otherlv_7= 'showsComponents:' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* )? otherlv_11= '}' )
            // InternalMyDsl.g:3637:3: () otherlv_1= 'EAssemblyViewType' otherlv_2= '{' (otherlv_3= 'mainArtifacts:' ( (lv_mainArtifacts_4_0= ruleEAssemblyContext ) ) (otherlv_5= ',' ( (lv_mainArtifacts_6_0= ruleEAssemblyContext ) ) )* )? (otherlv_7= 'showsComponents:' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* )? otherlv_11= '}'
            {
            // InternalMyDsl.g:3637:3: ()
            // InternalMyDsl.g:3638:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEAssemblyViewTypeAccess().getEAssemblyViewTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,89,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getEAssemblyViewTypeAccess().getEAssemblyViewTypeKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_95); 

            			newLeafNode(otherlv_2, grammarAccess.getEAssemblyViewTypeAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:3652:3: (otherlv_3= 'mainArtifacts:' ( (lv_mainArtifacts_4_0= ruleEAssemblyContext ) ) (otherlv_5= ',' ( (lv_mainArtifacts_6_0= ruleEAssemblyContext ) ) )* )?
            int alt104=2;
            int LA104_0 = input.LA(1);

            if ( (LA104_0==90) ) {
                alt104=1;
            }
            switch (alt104) {
                case 1 :
                    // InternalMyDsl.g:3653:4: otherlv_3= 'mainArtifacts:' ( (lv_mainArtifacts_4_0= ruleEAssemblyContext ) ) (otherlv_5= ',' ( (lv_mainArtifacts_6_0= ruleEAssemblyContext ) ) )*
                    {
                    otherlv_3=(Token)match(input,90,FOLLOW_23); 

                    				newLeafNode(otherlv_3, grammarAccess.getEAssemblyViewTypeAccess().getMainArtifactsKeyword_3_0());
                    			
                    // InternalMyDsl.g:3657:4: ( (lv_mainArtifacts_4_0= ruleEAssemblyContext ) )
                    // InternalMyDsl.g:3658:5: (lv_mainArtifacts_4_0= ruleEAssemblyContext )
                    {
                    // InternalMyDsl.g:3658:5: (lv_mainArtifacts_4_0= ruleEAssemblyContext )
                    // InternalMyDsl.g:3659:6: lv_mainArtifacts_4_0= ruleEAssemblyContext
                    {

                    						newCompositeNode(grammarAccess.getEAssemblyViewTypeAccess().getMainArtifactsEAssemblyContextParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_94);
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

                    // InternalMyDsl.g:3676:4: (otherlv_5= ',' ( (lv_mainArtifacts_6_0= ruleEAssemblyContext ) ) )*
                    loop103:
                    do {
                        int alt103=2;
                        int LA103_0 = input.LA(1);

                        if ( (LA103_0==14) ) {
                            alt103=1;
                        }


                        switch (alt103) {
                    	case 1 :
                    	    // InternalMyDsl.g:3677:5: otherlv_5= ',' ( (lv_mainArtifacts_6_0= ruleEAssemblyContext ) )
                    	    {
                    	    otherlv_5=(Token)match(input,14,FOLLOW_23); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getEAssemblyViewTypeAccess().getCommaKeyword_3_2_0());
                    	    				
                    	    // InternalMyDsl.g:3681:5: ( (lv_mainArtifacts_6_0= ruleEAssemblyContext ) )
                    	    // InternalMyDsl.g:3682:6: (lv_mainArtifacts_6_0= ruleEAssemblyContext )
                    	    {
                    	    // InternalMyDsl.g:3682:6: (lv_mainArtifacts_6_0= ruleEAssemblyContext )
                    	    // InternalMyDsl.g:3683:7: lv_mainArtifacts_6_0= ruleEAssemblyContext
                    	    {

                    	    							newCompositeNode(grammarAccess.getEAssemblyViewTypeAccess().getMainArtifactsEAssemblyContextParserRuleCall_3_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_94);
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
                    	    break loop103;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalMyDsl.g:3702:3: (otherlv_7= 'showsComponents:' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* )?
            int alt106=2;
            int LA106_0 = input.LA(1);

            if ( (LA106_0==88) ) {
                alt106=1;
            }
            switch (alt106) {
                case 1 :
                    // InternalMyDsl.g:3703:4: otherlv_7= 'showsComponents:' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )*
                    {
                    otherlv_7=(Token)match(input,88,FOLLOW_56); 

                    				newLeafNode(otherlv_7, grammarAccess.getEAssemblyViewTypeAccess().getShowsComponentsKeyword_4_0());
                    			
                    // InternalMyDsl.g:3707:4: ( (otherlv_8= RULE_ID ) )
                    // InternalMyDsl.g:3708:5: (otherlv_8= RULE_ID )
                    {
                    // InternalMyDsl.g:3708:5: (otherlv_8= RULE_ID )
                    // InternalMyDsl.g:3709:6: otherlv_8= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEAssemblyViewTypeRule());
                    						}
                    					
                    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_47); 

                    						newLeafNode(otherlv_8, grammarAccess.getEAssemblyViewTypeAccess().getShowsComponentsEComponentCrossReference_4_1_0());
                    					

                    }


                    }

                    // InternalMyDsl.g:3720:4: (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )*
                    loop105:
                    do {
                        int alt105=2;
                        int LA105_0 = input.LA(1);

                        if ( (LA105_0==14) ) {
                            alt105=1;
                        }


                        switch (alt105) {
                    	case 1 :
                    	    // InternalMyDsl.g:3721:5: otherlv_9= ',' ( (otherlv_10= RULE_ID ) )
                    	    {
                    	    otherlv_9=(Token)match(input,14,FOLLOW_56); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getEAssemblyViewTypeAccess().getCommaKeyword_4_2_0());
                    	    				
                    	    // InternalMyDsl.g:3725:5: ( (otherlv_10= RULE_ID ) )
                    	    // InternalMyDsl.g:3726:6: (otherlv_10= RULE_ID )
                    	    {
                    	    // InternalMyDsl.g:3726:6: (otherlv_10= RULE_ID )
                    	    // InternalMyDsl.g:3727:7: otherlv_10= RULE_ID
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getEAssemblyViewTypeRule());
                    	    							}
                    	    						
                    	    otherlv_10=(Token)match(input,RULE_ID,FOLLOW_47); 

                    	    							newLeafNode(otherlv_10, grammarAccess.getEAssemblyViewTypeAccess().getShowsComponentsEComponentCrossReference_4_2_1_0());
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop105;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_11=(Token)match(input,36,FOLLOW_2); 

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
    // InternalMyDsl.g:3748:1: entryRuleEAllocationViewType returns [EObject current=null] : iv_ruleEAllocationViewType= ruleEAllocationViewType EOF ;
    public final EObject entryRuleEAllocationViewType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEAllocationViewType = null;


        try {
            // InternalMyDsl.g:3748:60: (iv_ruleEAllocationViewType= ruleEAllocationViewType EOF )
            // InternalMyDsl.g:3749:2: iv_ruleEAllocationViewType= ruleEAllocationViewType EOF
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
    // InternalMyDsl.g:3755:1: ruleEAllocationViewType returns [EObject current=null] : ( () otherlv_1= 'EAllocationViewType' otherlv_2= '{' (otherlv_3= 'includes:' ( (lv_includes_4_0= ruleEAllocationContext ) ) (otherlv_5= ',' ( (lv_includes_6_0= ruleEAllocationContext ) ) )* )? otherlv_7= '}' ) ;
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
            // InternalMyDsl.g:3761:2: ( ( () otherlv_1= 'EAllocationViewType' otherlv_2= '{' (otherlv_3= 'includes:' ( (lv_includes_4_0= ruleEAllocationContext ) ) (otherlv_5= ',' ( (lv_includes_6_0= ruleEAllocationContext ) ) )* )? otherlv_7= '}' ) )
            // InternalMyDsl.g:3762:2: ( () otherlv_1= 'EAllocationViewType' otherlv_2= '{' (otherlv_3= 'includes:' ( (lv_includes_4_0= ruleEAllocationContext ) ) (otherlv_5= ',' ( (lv_includes_6_0= ruleEAllocationContext ) ) )* )? otherlv_7= '}' )
            {
            // InternalMyDsl.g:3762:2: ( () otherlv_1= 'EAllocationViewType' otherlv_2= '{' (otherlv_3= 'includes:' ( (lv_includes_4_0= ruleEAllocationContext ) ) (otherlv_5= ',' ( (lv_includes_6_0= ruleEAllocationContext ) ) )* )? otherlv_7= '}' )
            // InternalMyDsl.g:3763:3: () otherlv_1= 'EAllocationViewType' otherlv_2= '{' (otherlv_3= 'includes:' ( (lv_includes_4_0= ruleEAllocationContext ) ) (otherlv_5= ',' ( (lv_includes_6_0= ruleEAllocationContext ) ) )* )? otherlv_7= '}'
            {
            // InternalMyDsl.g:3763:3: ()
            // InternalMyDsl.g:3764:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEAllocationViewTypeAccess().getEAllocationViewTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,91,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getEAllocationViewTypeAccess().getEAllocationViewTypeKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_96); 

            			newLeafNode(otherlv_2, grammarAccess.getEAllocationViewTypeAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:3778:3: (otherlv_3= 'includes:' ( (lv_includes_4_0= ruleEAllocationContext ) ) (otherlv_5= ',' ( (lv_includes_6_0= ruleEAllocationContext ) ) )* )?
            int alt108=2;
            int LA108_0 = input.LA(1);

            if ( (LA108_0==92) ) {
                alt108=1;
            }
            switch (alt108) {
                case 1 :
                    // InternalMyDsl.g:3779:4: otherlv_3= 'includes:' ( (lv_includes_4_0= ruleEAllocationContext ) ) (otherlv_5= ',' ( (lv_includes_6_0= ruleEAllocationContext ) ) )*
                    {
                    otherlv_3=(Token)match(input,92,FOLLOW_46); 

                    				newLeafNode(otherlv_3, grammarAccess.getEAllocationViewTypeAccess().getIncludesKeyword_3_0());
                    			
                    // InternalMyDsl.g:3783:4: ( (lv_includes_4_0= ruleEAllocationContext ) )
                    // InternalMyDsl.g:3784:5: (lv_includes_4_0= ruleEAllocationContext )
                    {
                    // InternalMyDsl.g:3784:5: (lv_includes_4_0= ruleEAllocationContext )
                    // InternalMyDsl.g:3785:6: lv_includes_4_0= ruleEAllocationContext
                    {

                    						newCompositeNode(grammarAccess.getEAllocationViewTypeAccess().getIncludesEAllocationContextParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_47);
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

                    // InternalMyDsl.g:3802:4: (otherlv_5= ',' ( (lv_includes_6_0= ruleEAllocationContext ) ) )*
                    loop107:
                    do {
                        int alt107=2;
                        int LA107_0 = input.LA(1);

                        if ( (LA107_0==14) ) {
                            alt107=1;
                        }


                        switch (alt107) {
                    	case 1 :
                    	    // InternalMyDsl.g:3803:5: otherlv_5= ',' ( (lv_includes_6_0= ruleEAllocationContext ) )
                    	    {
                    	    otherlv_5=(Token)match(input,14,FOLLOW_46); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getEAllocationViewTypeAccess().getCommaKeyword_3_2_0());
                    	    				
                    	    // InternalMyDsl.g:3807:5: ( (lv_includes_6_0= ruleEAllocationContext ) )
                    	    // InternalMyDsl.g:3808:6: (lv_includes_6_0= ruleEAllocationContext )
                    	    {
                    	    // InternalMyDsl.g:3808:6: (lv_includes_6_0= ruleEAllocationContext )
                    	    // InternalMyDsl.g:3809:7: lv_includes_6_0= ruleEAllocationContext
                    	    {

                    	    							newCompositeNode(grammarAccess.getEAllocationViewTypeAccess().getIncludesEAllocationContextParserRuleCall_3_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_47);
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
                    	    break loop107;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_7=(Token)match(input,36,FOLLOW_2); 

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
    // InternalMyDsl.g:3836:1: entryRuleEEnvironmentViewType returns [EObject current=null] : iv_ruleEEnvironmentViewType= ruleEEnvironmentViewType EOF ;
    public final EObject entryRuleEEnvironmentViewType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEEnvironmentViewType = null;


        try {
            // InternalMyDsl.g:3836:61: (iv_ruleEEnvironmentViewType= ruleEEnvironmentViewType EOF )
            // InternalMyDsl.g:3837:2: iv_ruleEEnvironmentViewType= ruleEEnvironmentViewType EOF
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
    // InternalMyDsl.g:3843:1: ruleEEnvironmentViewType returns [EObject current=null] : ( () otherlv_1= 'EEnvironmentViewType' otherlv_2= '{' (otherlv_3= 'showsLinks:' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* )? (otherlv_7= 'showsContainers:' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* )? otherlv_11= '}' ) ;
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
            // InternalMyDsl.g:3849:2: ( ( () otherlv_1= 'EEnvironmentViewType' otherlv_2= '{' (otherlv_3= 'showsLinks:' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* )? (otherlv_7= 'showsContainers:' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* )? otherlv_11= '}' ) )
            // InternalMyDsl.g:3850:2: ( () otherlv_1= 'EEnvironmentViewType' otherlv_2= '{' (otherlv_3= 'showsLinks:' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* )? (otherlv_7= 'showsContainers:' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* )? otherlv_11= '}' )
            {
            // InternalMyDsl.g:3850:2: ( () otherlv_1= 'EEnvironmentViewType' otherlv_2= '{' (otherlv_3= 'showsLinks:' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* )? (otherlv_7= 'showsContainers:' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* )? otherlv_11= '}' )
            // InternalMyDsl.g:3851:3: () otherlv_1= 'EEnvironmentViewType' otherlv_2= '{' (otherlv_3= 'showsLinks:' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* )? (otherlv_7= 'showsContainers:' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* )? otherlv_11= '}'
            {
            // InternalMyDsl.g:3851:3: ()
            // InternalMyDsl.g:3852:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEEnvironmentViewTypeAccess().getEEnvironmentViewTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,93,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getEEnvironmentViewTypeAccess().getEEnvironmentViewTypeKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_97); 

            			newLeafNode(otherlv_2, grammarAccess.getEEnvironmentViewTypeAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:3866:3: (otherlv_3= 'showsLinks:' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* )?
            int alt110=2;
            int LA110_0 = input.LA(1);

            if ( (LA110_0==94) ) {
                alt110=1;
            }
            switch (alt110) {
                case 1 :
                    // InternalMyDsl.g:3867:4: otherlv_3= 'showsLinks:' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )*
                    {
                    otherlv_3=(Token)match(input,94,FOLLOW_56); 

                    				newLeafNode(otherlv_3, grammarAccess.getEEnvironmentViewTypeAccess().getShowsLinksKeyword_3_0());
                    			
                    // InternalMyDsl.g:3871:4: ( (otherlv_4= RULE_ID ) )
                    // InternalMyDsl.g:3872:5: (otherlv_4= RULE_ID )
                    {
                    // InternalMyDsl.g:3872:5: (otherlv_4= RULE_ID )
                    // InternalMyDsl.g:3873:6: otherlv_4= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEEnvironmentViewTypeRule());
                    						}
                    					
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_98); 

                    						newLeafNode(otherlv_4, grammarAccess.getEEnvironmentViewTypeAccess().getShowsLinksELinkCrossReference_3_1_0());
                    					

                    }


                    }

                    // InternalMyDsl.g:3884:4: (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )*
                    loop109:
                    do {
                        int alt109=2;
                        int LA109_0 = input.LA(1);

                        if ( (LA109_0==14) ) {
                            alt109=1;
                        }


                        switch (alt109) {
                    	case 1 :
                    	    // InternalMyDsl.g:3885:5: otherlv_5= ',' ( (otherlv_6= RULE_ID ) )
                    	    {
                    	    otherlv_5=(Token)match(input,14,FOLLOW_56); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getEEnvironmentViewTypeAccess().getCommaKeyword_3_2_0());
                    	    				
                    	    // InternalMyDsl.g:3889:5: ( (otherlv_6= RULE_ID ) )
                    	    // InternalMyDsl.g:3890:6: (otherlv_6= RULE_ID )
                    	    {
                    	    // InternalMyDsl.g:3890:6: (otherlv_6= RULE_ID )
                    	    // InternalMyDsl.g:3891:7: otherlv_6= RULE_ID
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getEEnvironmentViewTypeRule());
                    	    							}
                    	    						
                    	    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_98); 

                    	    							newLeafNode(otherlv_6, grammarAccess.getEEnvironmentViewTypeAccess().getShowsLinksELinkCrossReference_3_2_1_0());
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop109;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalMyDsl.g:3904:3: (otherlv_7= 'showsContainers:' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* )?
            int alt112=2;
            int LA112_0 = input.LA(1);

            if ( (LA112_0==95) ) {
                alt112=1;
            }
            switch (alt112) {
                case 1 :
                    // InternalMyDsl.g:3905:4: otherlv_7= 'showsContainers:' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )*
                    {
                    otherlv_7=(Token)match(input,95,FOLLOW_56); 

                    				newLeafNode(otherlv_7, grammarAccess.getEEnvironmentViewTypeAccess().getShowsContainersKeyword_4_0());
                    			
                    // InternalMyDsl.g:3909:4: ( (otherlv_8= RULE_ID ) )
                    // InternalMyDsl.g:3910:5: (otherlv_8= RULE_ID )
                    {
                    // InternalMyDsl.g:3910:5: (otherlv_8= RULE_ID )
                    // InternalMyDsl.g:3911:6: otherlv_8= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEEnvironmentViewTypeRule());
                    						}
                    					
                    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_47); 

                    						newLeafNode(otherlv_8, grammarAccess.getEEnvironmentViewTypeAccess().getShowsContainersEContainerCrossReference_4_1_0());
                    					

                    }


                    }

                    // InternalMyDsl.g:3922:4: (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )*
                    loop111:
                    do {
                        int alt111=2;
                        int LA111_0 = input.LA(1);

                        if ( (LA111_0==14) ) {
                            alt111=1;
                        }


                        switch (alt111) {
                    	case 1 :
                    	    // InternalMyDsl.g:3923:5: otherlv_9= ',' ( (otherlv_10= RULE_ID ) )
                    	    {
                    	    otherlv_9=(Token)match(input,14,FOLLOW_56); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getEEnvironmentViewTypeAccess().getCommaKeyword_4_2_0());
                    	    				
                    	    // InternalMyDsl.g:3927:5: ( (otherlv_10= RULE_ID ) )
                    	    // InternalMyDsl.g:3928:6: (otherlv_10= RULE_ID )
                    	    {
                    	    // InternalMyDsl.g:3928:6: (otherlv_10= RULE_ID )
                    	    // InternalMyDsl.g:3929:7: otherlv_10= RULE_ID
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getEEnvironmentViewTypeRule());
                    	    							}
                    	    						
                    	    otherlv_10=(Token)match(input,RULE_ID,FOLLOW_47); 

                    	    							newLeafNode(otherlv_10, grammarAccess.getEEnvironmentViewTypeAccess().getShowsContainersEContainerCrossReference_4_2_1_0());
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop111;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_11=(Token)match(input,36,FOLLOW_2); 

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
    // InternalMyDsl.g:3950:1: entryRuleEComponent returns [EObject current=null] : iv_ruleEComponent= ruleEComponent EOF ;
    public final EObject entryRuleEComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEComponent = null;


        try {
            // InternalMyDsl.g:3950:51: (iv_ruleEComponent= ruleEComponent EOF )
            // InternalMyDsl.g:3951:2: iv_ruleEComponent= ruleEComponent EOF
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
    // InternalMyDsl.g:3957:1: ruleEComponent returns [EObject current=null] : (this_EComponent_Impl_0= ruleEComponent_Impl | this_ECompositeComponent_1= ruleECompositeComponent ) ;
    public final EObject ruleEComponent() throws RecognitionException {
        EObject current = null;

        EObject this_EComponent_Impl_0 = null;

        EObject this_ECompositeComponent_1 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:3963:2: ( (this_EComponent_Impl_0= ruleEComponent_Impl | this_ECompositeComponent_1= ruleECompositeComponent ) )
            // InternalMyDsl.g:3964:2: (this_EComponent_Impl_0= ruleEComponent_Impl | this_ECompositeComponent_1= ruleECompositeComponent )
            {
            // InternalMyDsl.g:3964:2: (this_EComponent_Impl_0= ruleEComponent_Impl | this_ECompositeComponent_1= ruleECompositeComponent )
            int alt113=2;
            int LA113_0 = input.LA(1);

            if ( (LA113_0==96) ) {
                alt113=1;
            }
            else if ( (LA113_0==50) ) {
                alt113=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 113, 0, input);

                throw nvae;
            }
            switch (alt113) {
                case 1 :
                    // InternalMyDsl.g:3965:3: this_EComponent_Impl_0= ruleEComponent_Impl
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
                    // InternalMyDsl.g:3974:3: this_ECompositeComponent_1= ruleECompositeComponent
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
    // InternalMyDsl.g:3986:1: entryRuleEComponent_Impl returns [EObject current=null] : iv_ruleEComponent_Impl= ruleEComponent_Impl EOF ;
    public final EObject entryRuleEComponent_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEComponent_Impl = null;


        try {
            // InternalMyDsl.g:3986:56: (iv_ruleEComponent_Impl= ruleEComponent_Impl EOF )
            // InternalMyDsl.g:3987:2: iv_ruleEComponent_Impl= ruleEComponent_Impl EOF
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
    // InternalMyDsl.g:3993:1: ruleEComponent_Impl returns [EObject current=null] : ( () otherlv_1= 'EComponent' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'providesInterfaceTo:' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* )? (otherlv_8= 'usesInterfaceFrom:' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* )? (otherlv_12= 'providesDirectly:' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* )? (otherlv_16= 'provides:' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* )? (otherlv_20= 'requires:' ( ( ruleEString ) ) (otherlv_22= ',' ( ( ruleEString ) ) )* )? (otherlv_24= 'behaviourDescription:' ( (lv_behaviourDescription_25_0= ruleEBehaviourDescription ) ) )? otherlv_26= '}' ) ;
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
            // InternalMyDsl.g:3999:2: ( ( () otherlv_1= 'EComponent' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'providesInterfaceTo:' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* )? (otherlv_8= 'usesInterfaceFrom:' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* )? (otherlv_12= 'providesDirectly:' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* )? (otherlv_16= 'provides:' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* )? (otherlv_20= 'requires:' ( ( ruleEString ) ) (otherlv_22= ',' ( ( ruleEString ) ) )* )? (otherlv_24= 'behaviourDescription:' ( (lv_behaviourDescription_25_0= ruleEBehaviourDescription ) ) )? otherlv_26= '}' ) )
            // InternalMyDsl.g:4000:2: ( () otherlv_1= 'EComponent' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'providesInterfaceTo:' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* )? (otherlv_8= 'usesInterfaceFrom:' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* )? (otherlv_12= 'providesDirectly:' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* )? (otherlv_16= 'provides:' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* )? (otherlv_20= 'requires:' ( ( ruleEString ) ) (otherlv_22= ',' ( ( ruleEString ) ) )* )? (otherlv_24= 'behaviourDescription:' ( (lv_behaviourDescription_25_0= ruleEBehaviourDescription ) ) )? otherlv_26= '}' )
            {
            // InternalMyDsl.g:4000:2: ( () otherlv_1= 'EComponent' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'providesInterfaceTo:' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* )? (otherlv_8= 'usesInterfaceFrom:' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* )? (otherlv_12= 'providesDirectly:' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* )? (otherlv_16= 'provides:' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* )? (otherlv_20= 'requires:' ( ( ruleEString ) ) (otherlv_22= ',' ( ( ruleEString ) ) )* )? (otherlv_24= 'behaviourDescription:' ( (lv_behaviourDescription_25_0= ruleEBehaviourDescription ) ) )? otherlv_26= '}' )
            // InternalMyDsl.g:4001:3: () otherlv_1= 'EComponent' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'providesInterfaceTo:' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* )? (otherlv_8= 'usesInterfaceFrom:' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* )? (otherlv_12= 'providesDirectly:' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* )? (otherlv_16= 'provides:' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* )? (otherlv_20= 'requires:' ( ( ruleEString ) ) (otherlv_22= ',' ( ( ruleEString ) ) )* )? (otherlv_24= 'behaviourDescription:' ( (lv_behaviourDescription_25_0= ruleEBehaviourDescription ) ) )? otherlv_26= '}'
            {
            // InternalMyDsl.g:4001:3: ()
            // InternalMyDsl.g:4002:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEComponent_ImplAccess().getEComponentAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,96,FOLLOW_48); 

            			newLeafNode(otherlv_1, grammarAccess.getEComponent_ImplAccess().getEComponentKeyword_1());
            		
            // InternalMyDsl.g:4012:3: ( (lv_name_2_0= ruleEString ) )
            // InternalMyDsl.g:4013:4: (lv_name_2_0= ruleEString )
            {
            // InternalMyDsl.g:4013:4: (lv_name_2_0= ruleEString )
            // InternalMyDsl.g:4014:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getEComponent_ImplAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_3);
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

            otherlv_3=(Token)match(input,12,FOLLOW_99); 

            			newLeafNode(otherlv_3, grammarAccess.getEComponent_ImplAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalMyDsl.g:4035:3: (otherlv_4= 'providesInterfaceTo:' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* )?
            int alt115=2;
            int LA115_0 = input.LA(1);

            if ( (LA115_0==51) ) {
                alt115=1;
            }
            switch (alt115) {
                case 1 :
                    // InternalMyDsl.g:4036:4: otherlv_4= 'providesInterfaceTo:' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )*
                    {
                    otherlv_4=(Token)match(input,51,FOLLOW_48); 

                    				newLeafNode(otherlv_4, grammarAccess.getEComponent_ImplAccess().getProvidesInterfaceToKeyword_4_0());
                    			
                    // InternalMyDsl.g:4040:4: ( ( ruleEString ) )
                    // InternalMyDsl.g:4041:5: ( ruleEString )
                    {
                    // InternalMyDsl.g:4041:5: ( ruleEString )
                    // InternalMyDsl.g:4042:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEComponent_ImplRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getEComponent_ImplAccess().getProvidesInterfaceToEComponentCrossReference_4_1_0());
                    					
                    pushFollow(FOLLOW_100);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:4056:4: (otherlv_6= ',' ( ( ruleEString ) ) )*
                    loop114:
                    do {
                        int alt114=2;
                        int LA114_0 = input.LA(1);

                        if ( (LA114_0==14) ) {
                            alt114=1;
                        }


                        switch (alt114) {
                    	case 1 :
                    	    // InternalMyDsl.g:4057:5: otherlv_6= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_6=(Token)match(input,14,FOLLOW_48); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getEComponent_ImplAccess().getCommaKeyword_4_2_0());
                    	    				
                    	    // InternalMyDsl.g:4061:5: ( ( ruleEString ) )
                    	    // InternalMyDsl.g:4062:6: ( ruleEString )
                    	    {
                    	    // InternalMyDsl.g:4062:6: ( ruleEString )
                    	    // InternalMyDsl.g:4063:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getEComponent_ImplRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getEComponent_ImplAccess().getProvidesInterfaceToEComponentCrossReference_4_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_100);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop114;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalMyDsl.g:4079:3: (otherlv_8= 'usesInterfaceFrom:' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* )?
            int alt117=2;
            int LA117_0 = input.LA(1);

            if ( (LA117_0==52) ) {
                alt117=1;
            }
            switch (alt117) {
                case 1 :
                    // InternalMyDsl.g:4080:4: otherlv_8= 'usesInterfaceFrom:' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )*
                    {
                    otherlv_8=(Token)match(input,52,FOLLOW_48); 

                    				newLeafNode(otherlv_8, grammarAccess.getEComponent_ImplAccess().getUsesInterfaceFromKeyword_5_0());
                    			
                    // InternalMyDsl.g:4084:4: ( ( ruleEString ) )
                    // InternalMyDsl.g:4085:5: ( ruleEString )
                    {
                    // InternalMyDsl.g:4085:5: ( ruleEString )
                    // InternalMyDsl.g:4086:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEComponent_ImplRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getEComponent_ImplAccess().getUsesInterfaceFromEComponentCrossReference_5_1_0());
                    					
                    pushFollow(FOLLOW_101);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:4100:4: (otherlv_10= ',' ( ( ruleEString ) ) )*
                    loop116:
                    do {
                        int alt116=2;
                        int LA116_0 = input.LA(1);

                        if ( (LA116_0==14) ) {
                            alt116=1;
                        }


                        switch (alt116) {
                    	case 1 :
                    	    // InternalMyDsl.g:4101:5: otherlv_10= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_10=(Token)match(input,14,FOLLOW_48); 

                    	    					newLeafNode(otherlv_10, grammarAccess.getEComponent_ImplAccess().getCommaKeyword_5_2_0());
                    	    				
                    	    // InternalMyDsl.g:4105:5: ( ( ruleEString ) )
                    	    // InternalMyDsl.g:4106:6: ( ruleEString )
                    	    {
                    	    // InternalMyDsl.g:4106:6: ( ruleEString )
                    	    // InternalMyDsl.g:4107:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getEComponent_ImplRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getEComponent_ImplAccess().getUsesInterfaceFromEComponentCrossReference_5_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_101);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop116;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalMyDsl.g:4123:3: (otherlv_12= 'providesDirectly:' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* )?
            int alt119=2;
            int LA119_0 = input.LA(1);

            if ( (LA119_0==53) ) {
                alt119=1;
            }
            switch (alt119) {
                case 1 :
                    // InternalMyDsl.g:4124:4: otherlv_12= 'providesDirectly:' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )*
                    {
                    otherlv_12=(Token)match(input,53,FOLLOW_48); 

                    				newLeafNode(otherlv_12, grammarAccess.getEComponent_ImplAccess().getProvidesDirectlyKeyword_6_0());
                    			
                    // InternalMyDsl.g:4128:4: ( ( ruleEString ) )
                    // InternalMyDsl.g:4129:5: ( ruleEString )
                    {
                    // InternalMyDsl.g:4129:5: ( ruleEString )
                    // InternalMyDsl.g:4130:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEComponent_ImplRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getEComponent_ImplAccess().getProvidesDirectlyEServiceCrossReference_6_1_0());
                    					
                    pushFollow(FOLLOW_102);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:4144:4: (otherlv_14= ',' ( ( ruleEString ) ) )*
                    loop118:
                    do {
                        int alt118=2;
                        int LA118_0 = input.LA(1);

                        if ( (LA118_0==14) ) {
                            alt118=1;
                        }


                        switch (alt118) {
                    	case 1 :
                    	    // InternalMyDsl.g:4145:5: otherlv_14= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_14=(Token)match(input,14,FOLLOW_48); 

                    	    					newLeafNode(otherlv_14, grammarAccess.getEComponent_ImplAccess().getCommaKeyword_6_2_0());
                    	    				
                    	    // InternalMyDsl.g:4149:5: ( ( ruleEString ) )
                    	    // InternalMyDsl.g:4150:6: ( ruleEString )
                    	    {
                    	    // InternalMyDsl.g:4150:6: ( ruleEString )
                    	    // InternalMyDsl.g:4151:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getEComponent_ImplRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getEComponent_ImplAccess().getProvidesDirectlyEServiceCrossReference_6_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_102);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop118;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalMyDsl.g:4167:3: (otherlv_16= 'provides:' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* )?
            int alt121=2;
            int LA121_0 = input.LA(1);

            if ( (LA121_0==45) ) {
                alt121=1;
            }
            switch (alt121) {
                case 1 :
                    // InternalMyDsl.g:4168:4: otherlv_16= 'provides:' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )*
                    {
                    otherlv_16=(Token)match(input,45,FOLLOW_48); 

                    				newLeafNode(otherlv_16, grammarAccess.getEComponent_ImplAccess().getProvidesKeyword_7_0());
                    			
                    // InternalMyDsl.g:4172:4: ( ( ruleEString ) )
                    // InternalMyDsl.g:4173:5: ( ruleEString )
                    {
                    // InternalMyDsl.g:4173:5: ( ruleEString )
                    // InternalMyDsl.g:4174:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEComponent_ImplRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getEComponent_ImplAccess().getProvidesEInterfaceCrossReference_7_1_0());
                    					
                    pushFollow(FOLLOW_103);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:4188:4: (otherlv_18= ',' ( ( ruleEString ) ) )*
                    loop120:
                    do {
                        int alt120=2;
                        int LA120_0 = input.LA(1);

                        if ( (LA120_0==14) ) {
                            alt120=1;
                        }


                        switch (alt120) {
                    	case 1 :
                    	    // InternalMyDsl.g:4189:5: otherlv_18= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_18=(Token)match(input,14,FOLLOW_48); 

                    	    					newLeafNode(otherlv_18, grammarAccess.getEComponent_ImplAccess().getCommaKeyword_7_2_0());
                    	    				
                    	    // InternalMyDsl.g:4193:5: ( ( ruleEString ) )
                    	    // InternalMyDsl.g:4194:6: ( ruleEString )
                    	    {
                    	    // InternalMyDsl.g:4194:6: ( ruleEString )
                    	    // InternalMyDsl.g:4195:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getEComponent_ImplRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getEComponent_ImplAccess().getProvidesEInterfaceCrossReference_7_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_103);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop120;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalMyDsl.g:4211:3: (otherlv_20= 'requires:' ( ( ruleEString ) ) (otherlv_22= ',' ( ( ruleEString ) ) )* )?
            int alt123=2;
            int LA123_0 = input.LA(1);

            if ( (LA123_0==46) ) {
                alt123=1;
            }
            switch (alt123) {
                case 1 :
                    // InternalMyDsl.g:4212:4: otherlv_20= 'requires:' ( ( ruleEString ) ) (otherlv_22= ',' ( ( ruleEString ) ) )*
                    {
                    otherlv_20=(Token)match(input,46,FOLLOW_48); 

                    				newLeafNode(otherlv_20, grammarAccess.getEComponent_ImplAccess().getRequiresKeyword_8_0());
                    			
                    // InternalMyDsl.g:4216:4: ( ( ruleEString ) )
                    // InternalMyDsl.g:4217:5: ( ruleEString )
                    {
                    // InternalMyDsl.g:4217:5: ( ruleEString )
                    // InternalMyDsl.g:4218:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEComponent_ImplRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getEComponent_ImplAccess().getRequiresEInterfaceCrossReference_8_1_0());
                    					
                    pushFollow(FOLLOW_68);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:4232:4: (otherlv_22= ',' ( ( ruleEString ) ) )*
                    loop122:
                    do {
                        int alt122=2;
                        int LA122_0 = input.LA(1);

                        if ( (LA122_0==14) ) {
                            alt122=1;
                        }


                        switch (alt122) {
                    	case 1 :
                    	    // InternalMyDsl.g:4233:5: otherlv_22= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_22=(Token)match(input,14,FOLLOW_48); 

                    	    					newLeafNode(otherlv_22, grammarAccess.getEComponent_ImplAccess().getCommaKeyword_8_2_0());
                    	    				
                    	    // InternalMyDsl.g:4237:5: ( ( ruleEString ) )
                    	    // InternalMyDsl.g:4238:6: ( ruleEString )
                    	    {
                    	    // InternalMyDsl.g:4238:6: ( ruleEString )
                    	    // InternalMyDsl.g:4239:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getEComponent_ImplRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getEComponent_ImplAccess().getRequiresEInterfaceCrossReference_8_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_68);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop122;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalMyDsl.g:4255:3: (otherlv_24= 'behaviourDescription:' ( (lv_behaviourDescription_25_0= ruleEBehaviourDescription ) ) )?
            int alt124=2;
            int LA124_0 = input.LA(1);

            if ( (LA124_0==54) ) {
                alt124=1;
            }
            switch (alt124) {
                case 1 :
                    // InternalMyDsl.g:4256:4: otherlv_24= 'behaviourDescription:' ( (lv_behaviourDescription_25_0= ruleEBehaviourDescription ) )
                    {
                    otherlv_24=(Token)match(input,54,FOLLOW_35); 

                    				newLeafNode(otherlv_24, grammarAccess.getEComponent_ImplAccess().getBehaviourDescriptionKeyword_9_0());
                    			
                    // InternalMyDsl.g:4260:4: ( (lv_behaviourDescription_25_0= ruleEBehaviourDescription ) )
                    // InternalMyDsl.g:4261:5: (lv_behaviourDescription_25_0= ruleEBehaviourDescription )
                    {
                    // InternalMyDsl.g:4261:5: (lv_behaviourDescription_25_0= ruleEBehaviourDescription )
                    // InternalMyDsl.g:4262:6: lv_behaviourDescription_25_0= ruleEBehaviourDescription
                    {

                    						newCompositeNode(grammarAccess.getEComponent_ImplAccess().getBehaviourDescriptionEBehaviourDescriptionParserRuleCall_9_1_0());
                    					
                    pushFollow(FOLLOW_61);
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

            otherlv_26=(Token)match(input,36,FOLLOW_2); 

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
    // InternalMyDsl.g:4288:1: entryRuleEBehaviourDescription returns [EObject current=null] : iv_ruleEBehaviourDescription= ruleEBehaviourDescription EOF ;
    public final EObject entryRuleEBehaviourDescription() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEBehaviourDescription = null;


        try {
            // InternalMyDsl.g:4288:62: (iv_ruleEBehaviourDescription= ruleEBehaviourDescription EOF )
            // InternalMyDsl.g:4289:2: iv_ruleEBehaviourDescription= ruleEBehaviourDescription EOF
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
    // InternalMyDsl.g:4295:1: ruleEBehaviourDescription returns [EObject current=null] : ( () otherlv_1= 'EBehaviourDescription' otherlv_2= '{' (otherlv_3= 'internalAction:' ( (lv_internalAction_4_0= ruleEInternalAction ) ) (otherlv_5= ',' ( (lv_internalAction_6_0= ruleEInternalAction ) ) )* )? (otherlv_7= 'loop:' ( (lv_loop_8_0= ruleELoop ) ) (otherlv_9= ',' ( (lv_loop_10_0= ruleELoop ) ) )* )? (otherlv_11= 'branch:' ( (lv_branch_12_0= ruleEBranch ) ) (otherlv_13= ',' ( (lv_branch_14_0= ruleEBranch ) ) )* )? (otherlv_15= 'externalCall:' ( (lv_externalCall_16_0= ruleEExternalCall ) ) (otherlv_17= ',' ( (lv_externalCall_18_0= ruleEExternalCall ) ) )* )? otherlv_19= '}' ) ;
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
            // InternalMyDsl.g:4301:2: ( ( () otherlv_1= 'EBehaviourDescription' otherlv_2= '{' (otherlv_3= 'internalAction:' ( (lv_internalAction_4_0= ruleEInternalAction ) ) (otherlv_5= ',' ( (lv_internalAction_6_0= ruleEInternalAction ) ) )* )? (otherlv_7= 'loop:' ( (lv_loop_8_0= ruleELoop ) ) (otherlv_9= ',' ( (lv_loop_10_0= ruleELoop ) ) )* )? (otherlv_11= 'branch:' ( (lv_branch_12_0= ruleEBranch ) ) (otherlv_13= ',' ( (lv_branch_14_0= ruleEBranch ) ) )* )? (otherlv_15= 'externalCall:' ( (lv_externalCall_16_0= ruleEExternalCall ) ) (otherlv_17= ',' ( (lv_externalCall_18_0= ruleEExternalCall ) ) )* )? otherlv_19= '}' ) )
            // InternalMyDsl.g:4302:2: ( () otherlv_1= 'EBehaviourDescription' otherlv_2= '{' (otherlv_3= 'internalAction:' ( (lv_internalAction_4_0= ruleEInternalAction ) ) (otherlv_5= ',' ( (lv_internalAction_6_0= ruleEInternalAction ) ) )* )? (otherlv_7= 'loop:' ( (lv_loop_8_0= ruleELoop ) ) (otherlv_9= ',' ( (lv_loop_10_0= ruleELoop ) ) )* )? (otherlv_11= 'branch:' ( (lv_branch_12_0= ruleEBranch ) ) (otherlv_13= ',' ( (lv_branch_14_0= ruleEBranch ) ) )* )? (otherlv_15= 'externalCall:' ( (lv_externalCall_16_0= ruleEExternalCall ) ) (otherlv_17= ',' ( (lv_externalCall_18_0= ruleEExternalCall ) ) )* )? otherlv_19= '}' )
            {
            // InternalMyDsl.g:4302:2: ( () otherlv_1= 'EBehaviourDescription' otherlv_2= '{' (otherlv_3= 'internalAction:' ( (lv_internalAction_4_0= ruleEInternalAction ) ) (otherlv_5= ',' ( (lv_internalAction_6_0= ruleEInternalAction ) ) )* )? (otherlv_7= 'loop:' ( (lv_loop_8_0= ruleELoop ) ) (otherlv_9= ',' ( (lv_loop_10_0= ruleELoop ) ) )* )? (otherlv_11= 'branch:' ( (lv_branch_12_0= ruleEBranch ) ) (otherlv_13= ',' ( (lv_branch_14_0= ruleEBranch ) ) )* )? (otherlv_15= 'externalCall:' ( (lv_externalCall_16_0= ruleEExternalCall ) ) (otherlv_17= ',' ( (lv_externalCall_18_0= ruleEExternalCall ) ) )* )? otherlv_19= '}' )
            // InternalMyDsl.g:4303:3: () otherlv_1= 'EBehaviourDescription' otherlv_2= '{' (otherlv_3= 'internalAction:' ( (lv_internalAction_4_0= ruleEInternalAction ) ) (otherlv_5= ',' ( (lv_internalAction_6_0= ruleEInternalAction ) ) )* )? (otherlv_7= 'loop:' ( (lv_loop_8_0= ruleELoop ) ) (otherlv_9= ',' ( (lv_loop_10_0= ruleELoop ) ) )* )? (otherlv_11= 'branch:' ( (lv_branch_12_0= ruleEBranch ) ) (otherlv_13= ',' ( (lv_branch_14_0= ruleEBranch ) ) )* )? (otherlv_15= 'externalCall:' ( (lv_externalCall_16_0= ruleEExternalCall ) ) (otherlv_17= ',' ( (lv_externalCall_18_0= ruleEExternalCall ) ) )* )? otherlv_19= '}'
            {
            // InternalMyDsl.g:4303:3: ()
            // InternalMyDsl.g:4304:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEBehaviourDescriptionAccess().getEBehaviourDescriptionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,97,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getEBehaviourDescriptionAccess().getEBehaviourDescriptionKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_104); 

            			newLeafNode(otherlv_2, grammarAccess.getEBehaviourDescriptionAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:4318:3: (otherlv_3= 'internalAction:' ( (lv_internalAction_4_0= ruleEInternalAction ) ) (otherlv_5= ',' ( (lv_internalAction_6_0= ruleEInternalAction ) ) )* )?
            int alt126=2;
            int LA126_0 = input.LA(1);

            if ( (LA126_0==98) ) {
                alt126=1;
            }
            switch (alt126) {
                case 1 :
                    // InternalMyDsl.g:4319:4: otherlv_3= 'internalAction:' ( (lv_internalAction_4_0= ruleEInternalAction ) ) (otherlv_5= ',' ( (lv_internalAction_6_0= ruleEInternalAction ) ) )*
                    {
                    otherlv_3=(Token)match(input,98,FOLLOW_39); 

                    				newLeafNode(otherlv_3, grammarAccess.getEBehaviourDescriptionAccess().getInternalActionKeyword_3_0());
                    			
                    // InternalMyDsl.g:4323:4: ( (lv_internalAction_4_0= ruleEInternalAction ) )
                    // InternalMyDsl.g:4324:5: (lv_internalAction_4_0= ruleEInternalAction )
                    {
                    // InternalMyDsl.g:4324:5: (lv_internalAction_4_0= ruleEInternalAction )
                    // InternalMyDsl.g:4325:6: lv_internalAction_4_0= ruleEInternalAction
                    {

                    						newCompositeNode(grammarAccess.getEBehaviourDescriptionAccess().getInternalActionEInternalActionParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_105);
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

                    // InternalMyDsl.g:4342:4: (otherlv_5= ',' ( (lv_internalAction_6_0= ruleEInternalAction ) ) )*
                    loop125:
                    do {
                        int alt125=2;
                        int LA125_0 = input.LA(1);

                        if ( (LA125_0==14) ) {
                            alt125=1;
                        }


                        switch (alt125) {
                    	case 1 :
                    	    // InternalMyDsl.g:4343:5: otherlv_5= ',' ( (lv_internalAction_6_0= ruleEInternalAction ) )
                    	    {
                    	    otherlv_5=(Token)match(input,14,FOLLOW_39); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getEBehaviourDescriptionAccess().getCommaKeyword_3_2_0());
                    	    				
                    	    // InternalMyDsl.g:4347:5: ( (lv_internalAction_6_0= ruleEInternalAction ) )
                    	    // InternalMyDsl.g:4348:6: (lv_internalAction_6_0= ruleEInternalAction )
                    	    {
                    	    // InternalMyDsl.g:4348:6: (lv_internalAction_6_0= ruleEInternalAction )
                    	    // InternalMyDsl.g:4349:7: lv_internalAction_6_0= ruleEInternalAction
                    	    {

                    	    							newCompositeNode(grammarAccess.getEBehaviourDescriptionAccess().getInternalActionEInternalActionParserRuleCall_3_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_105);
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
                    	    break loop125;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalMyDsl.g:4368:3: (otherlv_7= 'loop:' ( (lv_loop_8_0= ruleELoop ) ) (otherlv_9= ',' ( (lv_loop_10_0= ruleELoop ) ) )* )?
            int alt128=2;
            int LA128_0 = input.LA(1);

            if ( (LA128_0==99) ) {
                alt128=1;
            }
            switch (alt128) {
                case 1 :
                    // InternalMyDsl.g:4369:4: otherlv_7= 'loop:' ( (lv_loop_8_0= ruleELoop ) ) (otherlv_9= ',' ( (lv_loop_10_0= ruleELoop ) ) )*
                    {
                    otherlv_7=(Token)match(input,99,FOLLOW_43); 

                    				newLeafNode(otherlv_7, grammarAccess.getEBehaviourDescriptionAccess().getLoopKeyword_4_0());
                    			
                    // InternalMyDsl.g:4373:4: ( (lv_loop_8_0= ruleELoop ) )
                    // InternalMyDsl.g:4374:5: (lv_loop_8_0= ruleELoop )
                    {
                    // InternalMyDsl.g:4374:5: (lv_loop_8_0= ruleELoop )
                    // InternalMyDsl.g:4375:6: lv_loop_8_0= ruleELoop
                    {

                    						newCompositeNode(grammarAccess.getEBehaviourDescriptionAccess().getLoopELoopParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_106);
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

                    // InternalMyDsl.g:4392:4: (otherlv_9= ',' ( (lv_loop_10_0= ruleELoop ) ) )*
                    loop127:
                    do {
                        int alt127=2;
                        int LA127_0 = input.LA(1);

                        if ( (LA127_0==14) ) {
                            alt127=1;
                        }


                        switch (alt127) {
                    	case 1 :
                    	    // InternalMyDsl.g:4393:5: otherlv_9= ',' ( (lv_loop_10_0= ruleELoop ) )
                    	    {
                    	    otherlv_9=(Token)match(input,14,FOLLOW_43); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getEBehaviourDescriptionAccess().getCommaKeyword_4_2_0());
                    	    				
                    	    // InternalMyDsl.g:4397:5: ( (lv_loop_10_0= ruleELoop ) )
                    	    // InternalMyDsl.g:4398:6: (lv_loop_10_0= ruleELoop )
                    	    {
                    	    // InternalMyDsl.g:4398:6: (lv_loop_10_0= ruleELoop )
                    	    // InternalMyDsl.g:4399:7: lv_loop_10_0= ruleELoop
                    	    {

                    	    							newCompositeNode(grammarAccess.getEBehaviourDescriptionAccess().getLoopELoopParserRuleCall_4_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_106);
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
                    	    break loop127;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalMyDsl.g:4418:3: (otherlv_11= 'branch:' ( (lv_branch_12_0= ruleEBranch ) ) (otherlv_13= ',' ( (lv_branch_14_0= ruleEBranch ) ) )* )?
            int alt130=2;
            int LA130_0 = input.LA(1);

            if ( (LA130_0==100) ) {
                alt130=1;
            }
            switch (alt130) {
                case 1 :
                    // InternalMyDsl.g:4419:4: otherlv_11= 'branch:' ( (lv_branch_12_0= ruleEBranch ) ) (otherlv_13= ',' ( (lv_branch_14_0= ruleEBranch ) ) )*
                    {
                    otherlv_11=(Token)match(input,100,FOLLOW_41); 

                    				newLeafNode(otherlv_11, grammarAccess.getEBehaviourDescriptionAccess().getBranchKeyword_5_0());
                    			
                    // InternalMyDsl.g:4423:4: ( (lv_branch_12_0= ruleEBranch ) )
                    // InternalMyDsl.g:4424:5: (lv_branch_12_0= ruleEBranch )
                    {
                    // InternalMyDsl.g:4424:5: (lv_branch_12_0= ruleEBranch )
                    // InternalMyDsl.g:4425:6: lv_branch_12_0= ruleEBranch
                    {

                    						newCompositeNode(grammarAccess.getEBehaviourDescriptionAccess().getBranchEBranchParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_107);
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

                    // InternalMyDsl.g:4442:4: (otherlv_13= ',' ( (lv_branch_14_0= ruleEBranch ) ) )*
                    loop129:
                    do {
                        int alt129=2;
                        int LA129_0 = input.LA(1);

                        if ( (LA129_0==14) ) {
                            alt129=1;
                        }


                        switch (alt129) {
                    	case 1 :
                    	    // InternalMyDsl.g:4443:5: otherlv_13= ',' ( (lv_branch_14_0= ruleEBranch ) )
                    	    {
                    	    otherlv_13=(Token)match(input,14,FOLLOW_41); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getEBehaviourDescriptionAccess().getCommaKeyword_5_2_0());
                    	    				
                    	    // InternalMyDsl.g:4447:5: ( (lv_branch_14_0= ruleEBranch ) )
                    	    // InternalMyDsl.g:4448:6: (lv_branch_14_0= ruleEBranch )
                    	    {
                    	    // InternalMyDsl.g:4448:6: (lv_branch_14_0= ruleEBranch )
                    	    // InternalMyDsl.g:4449:7: lv_branch_14_0= ruleEBranch
                    	    {

                    	    							newCompositeNode(grammarAccess.getEBehaviourDescriptionAccess().getBranchEBranchParserRuleCall_5_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_107);
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
                    	    break loop129;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalMyDsl.g:4468:3: (otherlv_15= 'externalCall:' ( (lv_externalCall_16_0= ruleEExternalCall ) ) (otherlv_17= ',' ( (lv_externalCall_18_0= ruleEExternalCall ) ) )* )?
            int alt132=2;
            int LA132_0 = input.LA(1);

            if ( (LA132_0==101) ) {
                alt132=1;
            }
            switch (alt132) {
                case 1 :
                    // InternalMyDsl.g:4469:4: otherlv_15= 'externalCall:' ( (lv_externalCall_16_0= ruleEExternalCall ) ) (otherlv_17= ',' ( (lv_externalCall_18_0= ruleEExternalCall ) ) )*
                    {
                    otherlv_15=(Token)match(input,101,FOLLOW_37); 

                    				newLeafNode(otherlv_15, grammarAccess.getEBehaviourDescriptionAccess().getExternalCallKeyword_6_0());
                    			
                    // InternalMyDsl.g:4473:4: ( (lv_externalCall_16_0= ruleEExternalCall ) )
                    // InternalMyDsl.g:4474:5: (lv_externalCall_16_0= ruleEExternalCall )
                    {
                    // InternalMyDsl.g:4474:5: (lv_externalCall_16_0= ruleEExternalCall )
                    // InternalMyDsl.g:4475:6: lv_externalCall_16_0= ruleEExternalCall
                    {

                    						newCompositeNode(grammarAccess.getEBehaviourDescriptionAccess().getExternalCallEExternalCallParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_47);
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

                    // InternalMyDsl.g:4492:4: (otherlv_17= ',' ( (lv_externalCall_18_0= ruleEExternalCall ) ) )*
                    loop131:
                    do {
                        int alt131=2;
                        int LA131_0 = input.LA(1);

                        if ( (LA131_0==14) ) {
                            alt131=1;
                        }


                        switch (alt131) {
                    	case 1 :
                    	    // InternalMyDsl.g:4493:5: otherlv_17= ',' ( (lv_externalCall_18_0= ruleEExternalCall ) )
                    	    {
                    	    otherlv_17=(Token)match(input,14,FOLLOW_37); 

                    	    					newLeafNode(otherlv_17, grammarAccess.getEBehaviourDescriptionAccess().getCommaKeyword_6_2_0());
                    	    				
                    	    // InternalMyDsl.g:4497:5: ( (lv_externalCall_18_0= ruleEExternalCall ) )
                    	    // InternalMyDsl.g:4498:6: (lv_externalCall_18_0= ruleEExternalCall )
                    	    {
                    	    // InternalMyDsl.g:4498:6: (lv_externalCall_18_0= ruleEExternalCall )
                    	    // InternalMyDsl.g:4499:7: lv_externalCall_18_0= ruleEExternalCall
                    	    {

                    	    							newCompositeNode(grammarAccess.getEBehaviourDescriptionAccess().getExternalCallEExternalCallParserRuleCall_6_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_47);
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
                    	    break loop131;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_19=(Token)match(input,36,FOLLOW_2); 

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


    // $ANTLR start "entryRuleEService"
    // InternalMyDsl.g:4526:1: entryRuleEService returns [EObject current=null] : iv_ruleEService= ruleEService EOF ;
    public final EObject entryRuleEService() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEService = null;


        try {
            // InternalMyDsl.g:4526:49: (iv_ruleEService= ruleEService EOF )
            // InternalMyDsl.g:4527:2: iv_ruleEService= ruleEService EOF
            {
             newCompositeNode(grammarAccess.getEServiceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEService=ruleEService();

            state._fsp--;

             current =iv_ruleEService; 
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
    // $ANTLR end "entryRuleEService"


    // $ANTLR start "ruleEService"
    // InternalMyDsl.g:4533:1: ruleEService returns [EObject current=null] : ( () otherlv_1= 'EService' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleEService() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:4539:2: ( ( () otherlv_1= 'EService' ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalMyDsl.g:4540:2: ( () otherlv_1= 'EService' ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalMyDsl.g:4540:2: ( () otherlv_1= 'EService' ( (lv_name_2_0= ruleEString ) ) )
            // InternalMyDsl.g:4541:3: () otherlv_1= 'EService' ( (lv_name_2_0= ruleEString ) )
            {
            // InternalMyDsl.g:4541:3: ()
            // InternalMyDsl.g:4542:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEServiceAccess().getEServiceAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,102,FOLLOW_48); 

            			newLeafNode(otherlv_1, grammarAccess.getEServiceAccess().getEServiceKeyword_1());
            		
            // InternalMyDsl.g:4552:3: ( (lv_name_2_0= ruleEString ) )
            // InternalMyDsl.g:4553:4: (lv_name_2_0= ruleEString )
            {
            // InternalMyDsl.g:4553:4: (lv_name_2_0= ruleEString )
            // InternalMyDsl.g:4554:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getEServiceAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEServiceRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
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
    // $ANTLR end "ruleEService"


    // $ANTLR start "entryRuleEInternalAction"
    // InternalMyDsl.g:4575:1: entryRuleEInternalAction returns [EObject current=null] : iv_ruleEInternalAction= ruleEInternalAction EOF ;
    public final EObject entryRuleEInternalAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEInternalAction = null;


        try {
            // InternalMyDsl.g:4575:56: (iv_ruleEInternalAction= ruleEInternalAction EOF )
            // InternalMyDsl.g:4576:2: iv_ruleEInternalAction= ruleEInternalAction EOF
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
    // InternalMyDsl.g:4582:1: ruleEInternalAction returns [EObject current=null] : ( () otherlv_1= 'EInternalAction' ) ;
    public final EObject ruleEInternalAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:4588:2: ( ( () otherlv_1= 'EInternalAction' ) )
            // InternalMyDsl.g:4589:2: ( () otherlv_1= 'EInternalAction' )
            {
            // InternalMyDsl.g:4589:2: ( () otherlv_1= 'EInternalAction' )
            // InternalMyDsl.g:4590:3: () otherlv_1= 'EInternalAction'
            {
            // InternalMyDsl.g:4590:3: ()
            // InternalMyDsl.g:4591:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEInternalActionAccess().getEInternalActionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,103,FOLLOW_2); 

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
    // InternalMyDsl.g:4605:1: entryRuleELoop returns [EObject current=null] : iv_ruleELoop= ruleELoop EOF ;
    public final EObject entryRuleELoop() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleELoop = null;


        try {
            // InternalMyDsl.g:4605:46: (iv_ruleELoop= ruleELoop EOF )
            // InternalMyDsl.g:4606:2: iv_ruleELoop= ruleELoop EOF
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
    // InternalMyDsl.g:4612:1: ruleELoop returns [EObject current=null] : ( () otherlv_1= 'ELoop' ) ;
    public final EObject ruleELoop() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:4618:2: ( ( () otherlv_1= 'ELoop' ) )
            // InternalMyDsl.g:4619:2: ( () otherlv_1= 'ELoop' )
            {
            // InternalMyDsl.g:4619:2: ( () otherlv_1= 'ELoop' )
            // InternalMyDsl.g:4620:3: () otherlv_1= 'ELoop'
            {
            // InternalMyDsl.g:4620:3: ()
            // InternalMyDsl.g:4621:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getELoopAccess().getELoopAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,104,FOLLOW_2); 

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
    // InternalMyDsl.g:4635:1: entryRuleEBranch returns [EObject current=null] : iv_ruleEBranch= ruleEBranch EOF ;
    public final EObject entryRuleEBranch() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEBranch = null;


        try {
            // InternalMyDsl.g:4635:48: (iv_ruleEBranch= ruleEBranch EOF )
            // InternalMyDsl.g:4636:2: iv_ruleEBranch= ruleEBranch EOF
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
    // InternalMyDsl.g:4642:1: ruleEBranch returns [EObject current=null] : ( () otherlv_1= 'EBranch' ) ;
    public final EObject ruleEBranch() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:4648:2: ( ( () otherlv_1= 'EBranch' ) )
            // InternalMyDsl.g:4649:2: ( () otherlv_1= 'EBranch' )
            {
            // InternalMyDsl.g:4649:2: ( () otherlv_1= 'EBranch' )
            // InternalMyDsl.g:4650:3: () otherlv_1= 'EBranch'
            {
            // InternalMyDsl.g:4650:3: ()
            // InternalMyDsl.g:4651:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEBranchAccess().getEBranchAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,105,FOLLOW_2); 

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
    // InternalMyDsl.g:4665:1: entryRuleEExternalCall returns [EObject current=null] : iv_ruleEExternalCall= ruleEExternalCall EOF ;
    public final EObject entryRuleEExternalCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEExternalCall = null;


        try {
            // InternalMyDsl.g:4665:54: (iv_ruleEExternalCall= ruleEExternalCall EOF )
            // InternalMyDsl.g:4666:2: iv_ruleEExternalCall= ruleEExternalCall EOF
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
    // InternalMyDsl.g:4672:1: ruleEExternalCall returns [EObject current=null] : ( () otherlv_1= 'EExternalCall' otherlv_2= '{' (otherlv_3= 'to:' ( ( ruleEString ) ) ) otherlv_5= '}' ) ;
    public final EObject ruleEExternalCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalMyDsl.g:4678:2: ( ( () otherlv_1= 'EExternalCall' otherlv_2= '{' (otherlv_3= 'to:' ( ( ruleEString ) ) ) otherlv_5= '}' ) )
            // InternalMyDsl.g:4679:2: ( () otherlv_1= 'EExternalCall' otherlv_2= '{' (otherlv_3= 'to:' ( ( ruleEString ) ) ) otherlv_5= '}' )
            {
            // InternalMyDsl.g:4679:2: ( () otherlv_1= 'EExternalCall' otherlv_2= '{' (otherlv_3= 'to:' ( ( ruleEString ) ) ) otherlv_5= '}' )
            // InternalMyDsl.g:4680:3: () otherlv_1= 'EExternalCall' otherlv_2= '{' (otherlv_3= 'to:' ( ( ruleEString ) ) ) otherlv_5= '}'
            {
            // InternalMyDsl.g:4680:3: ()
            // InternalMyDsl.g:4681:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEExternalCallAccess().getEExternalCallAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,106,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getEExternalCallAccess().getEExternalCallKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_108); 

            			newLeafNode(otherlv_2, grammarAccess.getEExternalCallAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:4695:3: (otherlv_3= 'to:' ( ( ruleEString ) ) )
            // InternalMyDsl.g:4696:4: otherlv_3= 'to:' ( ( ruleEString ) )
            {
            otherlv_3=(Token)match(input,107,FOLLOW_48); 

            				newLeafNode(otherlv_3, grammarAccess.getEExternalCallAccess().getToKeyword_3_0());
            			
            // InternalMyDsl.g:4700:4: ( ( ruleEString ) )
            // InternalMyDsl.g:4701:5: ( ruleEString )
            {
            // InternalMyDsl.g:4701:5: ( ruleEString )
            // InternalMyDsl.g:4702:6: ruleEString
            {

            						if (current==null) {
            							current = createModelElement(grammarAccess.getEExternalCallRule());
            						}
            					

            						newCompositeNode(grammarAccess.getEExternalCallAccess().getToEServiceCrossReference_3_1_0());
            					
            pushFollow(FOLLOW_61);
            ruleEString();

            state._fsp--;


            						afterParserOrEnumRuleCall();
            					

            }


            }


            }

            otherlv_5=(Token)match(input,36,FOLLOW_2); 

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
    // InternalMyDsl.g:4725:1: entryRuleESignature returns [EObject current=null] : iv_ruleESignature= ruleESignature EOF ;
    public final EObject entryRuleESignature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleESignature = null;


        try {
            // InternalMyDsl.g:4725:51: (iv_ruleESignature= ruleESignature EOF )
            // InternalMyDsl.g:4726:2: iv_ruleESignature= ruleESignature EOF
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
    // InternalMyDsl.g:4732:1: ruleESignature returns [EObject current=null] : ( () otherlv_1= 'ESignature' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'returnType:' ( (lv_returnType_5_0= rulePossibleReturnTypes ) ) ) (otherlv_6= 'correspondsTo:' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* )? (otherlv_10= 'parameter:' ( (lv_parameter_11_0= ruleEParameter ) ) (otherlv_12= ',' ( (lv_parameter_13_0= ruleEParameter ) ) )* )? otherlv_14= '}' ) ;
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
            // InternalMyDsl.g:4738:2: ( ( () otherlv_1= 'ESignature' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'returnType:' ( (lv_returnType_5_0= rulePossibleReturnTypes ) ) ) (otherlv_6= 'correspondsTo:' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* )? (otherlv_10= 'parameter:' ( (lv_parameter_11_0= ruleEParameter ) ) (otherlv_12= ',' ( (lv_parameter_13_0= ruleEParameter ) ) )* )? otherlv_14= '}' ) )
            // InternalMyDsl.g:4739:2: ( () otherlv_1= 'ESignature' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'returnType:' ( (lv_returnType_5_0= rulePossibleReturnTypes ) ) ) (otherlv_6= 'correspondsTo:' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* )? (otherlv_10= 'parameter:' ( (lv_parameter_11_0= ruleEParameter ) ) (otherlv_12= ',' ( (lv_parameter_13_0= ruleEParameter ) ) )* )? otherlv_14= '}' )
            {
            // InternalMyDsl.g:4739:2: ( () otherlv_1= 'ESignature' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'returnType:' ( (lv_returnType_5_0= rulePossibleReturnTypes ) ) ) (otherlv_6= 'correspondsTo:' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* )? (otherlv_10= 'parameter:' ( (lv_parameter_11_0= ruleEParameter ) ) (otherlv_12= ',' ( (lv_parameter_13_0= ruleEParameter ) ) )* )? otherlv_14= '}' )
            // InternalMyDsl.g:4740:3: () otherlv_1= 'ESignature' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'returnType:' ( (lv_returnType_5_0= rulePossibleReturnTypes ) ) ) (otherlv_6= 'correspondsTo:' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* )? (otherlv_10= 'parameter:' ( (lv_parameter_11_0= ruleEParameter ) ) (otherlv_12= ',' ( (lv_parameter_13_0= ruleEParameter ) ) )* )? otherlv_14= '}'
            {
            // InternalMyDsl.g:4740:3: ()
            // InternalMyDsl.g:4741:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getESignatureAccess().getESignatureAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,108,FOLLOW_48); 

            			newLeafNode(otherlv_1, grammarAccess.getESignatureAccess().getESignatureKeyword_1());
            		
            // InternalMyDsl.g:4751:3: ( (lv_name_2_0= ruleEString ) )
            // InternalMyDsl.g:4752:4: (lv_name_2_0= ruleEString )
            {
            // InternalMyDsl.g:4752:4: (lv_name_2_0= ruleEString )
            // InternalMyDsl.g:4753:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getESignatureAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_3);
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

            otherlv_3=(Token)match(input,12,FOLLOW_109); 

            			newLeafNode(otherlv_3, grammarAccess.getESignatureAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalMyDsl.g:4774:3: (otherlv_4= 'returnType:' ( (lv_returnType_5_0= rulePossibleReturnTypes ) ) )
            // InternalMyDsl.g:4775:4: otherlv_4= 'returnType:' ( (lv_returnType_5_0= rulePossibleReturnTypes ) )
            {
            otherlv_4=(Token)match(input,109,FOLLOW_110); 

            				newLeafNode(otherlv_4, grammarAccess.getESignatureAccess().getReturnTypeKeyword_4_0());
            			
            // InternalMyDsl.g:4779:4: ( (lv_returnType_5_0= rulePossibleReturnTypes ) )
            // InternalMyDsl.g:4780:5: (lv_returnType_5_0= rulePossibleReturnTypes )
            {
            // InternalMyDsl.g:4780:5: (lv_returnType_5_0= rulePossibleReturnTypes )
            // InternalMyDsl.g:4781:6: lv_returnType_5_0= rulePossibleReturnTypes
            {

            						newCompositeNode(grammarAccess.getESignatureAccess().getReturnTypePossibleReturnTypesEnumRuleCall_4_1_0());
            					
            pushFollow(FOLLOW_111);
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

            // InternalMyDsl.g:4799:3: (otherlv_6= 'correspondsTo:' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* )?
            int alt134=2;
            int LA134_0 = input.LA(1);

            if ( (LA134_0==110) ) {
                alt134=1;
            }
            switch (alt134) {
                case 1 :
                    // InternalMyDsl.g:4800:4: otherlv_6= 'correspondsTo:' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )*
                    {
                    otherlv_6=(Token)match(input,110,FOLLOW_48); 

                    				newLeafNode(otherlv_6, grammarAccess.getESignatureAccess().getCorrespondsToKeyword_5_0());
                    			
                    // InternalMyDsl.g:4804:4: ( ( ruleEString ) )
                    // InternalMyDsl.g:4805:5: ( ruleEString )
                    {
                    // InternalMyDsl.g:4805:5: ( ruleEString )
                    // InternalMyDsl.g:4806:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getESignatureRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getESignatureAccess().getCorrespondsToEServiceCrossReference_5_1_0());
                    					
                    pushFollow(FOLLOW_112);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:4820:4: (otherlv_8= ',' ( ( ruleEString ) ) )*
                    loop133:
                    do {
                        int alt133=2;
                        int LA133_0 = input.LA(1);

                        if ( (LA133_0==14) ) {
                            alt133=1;
                        }


                        switch (alt133) {
                    	case 1 :
                    	    // InternalMyDsl.g:4821:5: otherlv_8= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_8=(Token)match(input,14,FOLLOW_48); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getESignatureAccess().getCommaKeyword_5_2_0());
                    	    				
                    	    // InternalMyDsl.g:4825:5: ( ( ruleEString ) )
                    	    // InternalMyDsl.g:4826:6: ( ruleEString )
                    	    {
                    	    // InternalMyDsl.g:4826:6: ( ruleEString )
                    	    // InternalMyDsl.g:4827:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getESignatureRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getESignatureAccess().getCorrespondsToEServiceCrossReference_5_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_112);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop133;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalMyDsl.g:4843:3: (otherlv_10= 'parameter:' ( (lv_parameter_11_0= ruleEParameter ) ) (otherlv_12= ',' ( (lv_parameter_13_0= ruleEParameter ) ) )* )?
            int alt136=2;
            int LA136_0 = input.LA(1);

            if ( (LA136_0==111) ) {
                alt136=1;
            }
            switch (alt136) {
                case 1 :
                    // InternalMyDsl.g:4844:4: otherlv_10= 'parameter:' ( (lv_parameter_11_0= ruleEParameter ) ) (otherlv_12= ',' ( (lv_parameter_13_0= ruleEParameter ) ) )*
                    {
                    otherlv_10=(Token)match(input,111,FOLLOW_9); 

                    				newLeafNode(otherlv_10, grammarAccess.getESignatureAccess().getParameterKeyword_6_0());
                    			
                    // InternalMyDsl.g:4848:4: ( (lv_parameter_11_0= ruleEParameter ) )
                    // InternalMyDsl.g:4849:5: (lv_parameter_11_0= ruleEParameter )
                    {
                    // InternalMyDsl.g:4849:5: (lv_parameter_11_0= ruleEParameter )
                    // InternalMyDsl.g:4850:6: lv_parameter_11_0= ruleEParameter
                    {

                    						newCompositeNode(grammarAccess.getESignatureAccess().getParameterEParameterParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_47);
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

                    // InternalMyDsl.g:4867:4: (otherlv_12= ',' ( (lv_parameter_13_0= ruleEParameter ) ) )*
                    loop135:
                    do {
                        int alt135=2;
                        int LA135_0 = input.LA(1);

                        if ( (LA135_0==14) ) {
                            alt135=1;
                        }


                        switch (alt135) {
                    	case 1 :
                    	    // InternalMyDsl.g:4868:5: otherlv_12= ',' ( (lv_parameter_13_0= ruleEParameter ) )
                    	    {
                    	    otherlv_12=(Token)match(input,14,FOLLOW_9); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getESignatureAccess().getCommaKeyword_6_2_0());
                    	    				
                    	    // InternalMyDsl.g:4872:5: ( (lv_parameter_13_0= ruleEParameter ) )
                    	    // InternalMyDsl.g:4873:6: (lv_parameter_13_0= ruleEParameter )
                    	    {
                    	    // InternalMyDsl.g:4873:6: (lv_parameter_13_0= ruleEParameter )
                    	    // InternalMyDsl.g:4874:7: lv_parameter_13_0= ruleEParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getESignatureAccess().getParameterEParameterParserRuleCall_6_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_47);
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
                    	    break loop135;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_14=(Token)match(input,36,FOLLOW_2); 

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
    // InternalMyDsl.g:4901:1: entryRuleERepository returns [EObject current=null] : iv_ruleERepository= ruleERepository EOF ;
    public final EObject entryRuleERepository() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleERepository = null;


        try {
            // InternalMyDsl.g:4901:52: (iv_ruleERepository= ruleERepository EOF )
            // InternalMyDsl.g:4902:2: iv_ruleERepository= ruleERepository EOF
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
    // InternalMyDsl.g:4908:1: ruleERepository returns [EObject current=null] : ( () otherlv_1= 'ERepository' otherlv_2= '{' (otherlv_3= 'component:' ( (lv_component_4_0= ruleEComponent ) ) (otherlv_5= ',' ( (lv_component_6_0= ruleEComponent ) ) )* )? (otherlv_7= 'interface:' ( (lv_interface_8_0= ruleEInterface ) ) (otherlv_9= ',' ( (lv_interface_10_0= ruleEInterface ) ) )* )? otherlv_11= '}' ) ;
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
            // InternalMyDsl.g:4914:2: ( ( () otherlv_1= 'ERepository' otherlv_2= '{' (otherlv_3= 'component:' ( (lv_component_4_0= ruleEComponent ) ) (otherlv_5= ',' ( (lv_component_6_0= ruleEComponent ) ) )* )? (otherlv_7= 'interface:' ( (lv_interface_8_0= ruleEInterface ) ) (otherlv_9= ',' ( (lv_interface_10_0= ruleEInterface ) ) )* )? otherlv_11= '}' ) )
            // InternalMyDsl.g:4915:2: ( () otherlv_1= 'ERepository' otherlv_2= '{' (otherlv_3= 'component:' ( (lv_component_4_0= ruleEComponent ) ) (otherlv_5= ',' ( (lv_component_6_0= ruleEComponent ) ) )* )? (otherlv_7= 'interface:' ( (lv_interface_8_0= ruleEInterface ) ) (otherlv_9= ',' ( (lv_interface_10_0= ruleEInterface ) ) )* )? otherlv_11= '}' )
            {
            // InternalMyDsl.g:4915:2: ( () otherlv_1= 'ERepository' otherlv_2= '{' (otherlv_3= 'component:' ( (lv_component_4_0= ruleEComponent ) ) (otherlv_5= ',' ( (lv_component_6_0= ruleEComponent ) ) )* )? (otherlv_7= 'interface:' ( (lv_interface_8_0= ruleEInterface ) ) (otherlv_9= ',' ( (lv_interface_10_0= ruleEInterface ) ) )* )? otherlv_11= '}' )
            // InternalMyDsl.g:4916:3: () otherlv_1= 'ERepository' otherlv_2= '{' (otherlv_3= 'component:' ( (lv_component_4_0= ruleEComponent ) ) (otherlv_5= ',' ( (lv_component_6_0= ruleEComponent ) ) )* )? (otherlv_7= 'interface:' ( (lv_interface_8_0= ruleEInterface ) ) (otherlv_9= ',' ( (lv_interface_10_0= ruleEInterface ) ) )* )? otherlv_11= '}'
            {
            // InternalMyDsl.g:4916:3: ()
            // InternalMyDsl.g:4917:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getERepositoryAccess().getERepositoryAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,112,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getERepositoryAccess().getERepositoryKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_113); 

            			newLeafNode(otherlv_2, grammarAccess.getERepositoryAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:4931:3: (otherlv_3= 'component:' ( (lv_component_4_0= ruleEComponent ) ) (otherlv_5= ',' ( (lv_component_6_0= ruleEComponent ) ) )* )?
            int alt138=2;
            int LA138_0 = input.LA(1);

            if ( (LA138_0==113) ) {
                alt138=1;
            }
            switch (alt138) {
                case 1 :
                    // InternalMyDsl.g:4932:4: otherlv_3= 'component:' ( (lv_component_4_0= ruleEComponent ) ) (otherlv_5= ',' ( (lv_component_6_0= ruleEComponent ) ) )*
                    {
                    otherlv_3=(Token)match(input,113,FOLLOW_25); 

                    				newLeafNode(otherlv_3, grammarAccess.getERepositoryAccess().getComponentKeyword_3_0());
                    			
                    // InternalMyDsl.g:4936:4: ( (lv_component_4_0= ruleEComponent ) )
                    // InternalMyDsl.g:4937:5: (lv_component_4_0= ruleEComponent )
                    {
                    // InternalMyDsl.g:4937:5: (lv_component_4_0= ruleEComponent )
                    // InternalMyDsl.g:4938:6: lv_component_4_0= ruleEComponent
                    {

                    						newCompositeNode(grammarAccess.getERepositoryAccess().getComponentEComponentParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_114);
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

                    // InternalMyDsl.g:4955:4: (otherlv_5= ',' ( (lv_component_6_0= ruleEComponent ) ) )*
                    loop137:
                    do {
                        int alt137=2;
                        int LA137_0 = input.LA(1);

                        if ( (LA137_0==14) ) {
                            alt137=1;
                        }


                        switch (alt137) {
                    	case 1 :
                    	    // InternalMyDsl.g:4956:5: otherlv_5= ',' ( (lv_component_6_0= ruleEComponent ) )
                    	    {
                    	    otherlv_5=(Token)match(input,14,FOLLOW_25); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getERepositoryAccess().getCommaKeyword_3_2_0());
                    	    				
                    	    // InternalMyDsl.g:4960:5: ( (lv_component_6_0= ruleEComponent ) )
                    	    // InternalMyDsl.g:4961:6: (lv_component_6_0= ruleEComponent )
                    	    {
                    	    // InternalMyDsl.g:4961:6: (lv_component_6_0= ruleEComponent )
                    	    // InternalMyDsl.g:4962:7: lv_component_6_0= ruleEComponent
                    	    {

                    	    							newCompositeNode(grammarAccess.getERepositoryAccess().getComponentEComponentParserRuleCall_3_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_114);
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
                    	    break loop137;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalMyDsl.g:4981:3: (otherlv_7= 'interface:' ( (lv_interface_8_0= ruleEInterface ) ) (otherlv_9= ',' ( (lv_interface_10_0= ruleEInterface ) ) )* )?
            int alt140=2;
            int LA140_0 = input.LA(1);

            if ( (LA140_0==114) ) {
                alt140=1;
            }
            switch (alt140) {
                case 1 :
                    // InternalMyDsl.g:4982:4: otherlv_7= 'interface:' ( (lv_interface_8_0= ruleEInterface ) ) (otherlv_9= ',' ( (lv_interface_10_0= ruleEInterface ) ) )*
                    {
                    otherlv_7=(Token)match(input,114,FOLLOW_29); 

                    				newLeafNode(otherlv_7, grammarAccess.getERepositoryAccess().getInterfaceKeyword_4_0());
                    			
                    // InternalMyDsl.g:4986:4: ( (lv_interface_8_0= ruleEInterface ) )
                    // InternalMyDsl.g:4987:5: (lv_interface_8_0= ruleEInterface )
                    {
                    // InternalMyDsl.g:4987:5: (lv_interface_8_0= ruleEInterface )
                    // InternalMyDsl.g:4988:6: lv_interface_8_0= ruleEInterface
                    {

                    						newCompositeNode(grammarAccess.getERepositoryAccess().getInterfaceEInterfaceParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_47);
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

                    // InternalMyDsl.g:5005:4: (otherlv_9= ',' ( (lv_interface_10_0= ruleEInterface ) ) )*
                    loop139:
                    do {
                        int alt139=2;
                        int LA139_0 = input.LA(1);

                        if ( (LA139_0==14) ) {
                            alt139=1;
                        }


                        switch (alt139) {
                    	case 1 :
                    	    // InternalMyDsl.g:5006:5: otherlv_9= ',' ( (lv_interface_10_0= ruleEInterface ) )
                    	    {
                    	    otherlv_9=(Token)match(input,14,FOLLOW_29); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getERepositoryAccess().getCommaKeyword_4_2_0());
                    	    				
                    	    // InternalMyDsl.g:5010:5: ( (lv_interface_10_0= ruleEInterface ) )
                    	    // InternalMyDsl.g:5011:6: (lv_interface_10_0= ruleEInterface )
                    	    {
                    	    // InternalMyDsl.g:5011:6: (lv_interface_10_0= ruleEInterface )
                    	    // InternalMyDsl.g:5012:7: lv_interface_10_0= ruleEInterface
                    	    {

                    	    							newCompositeNode(grammarAccess.getERepositoryAccess().getInterfaceEInterfaceParserRuleCall_4_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_47);
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
                    	    break loop139;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_11=(Token)match(input,36,FOLLOW_2); 

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
    // InternalMyDsl.g:5039:1: rulePossibleReturnTypes returns [Enumerator current=null] : ( (enumLiteral_0= 'Boolean' ) | (enumLiteral_1= 'Char' ) | (enumLiteral_2= 'Date' ) | (enumLiteral_3= 'Double' ) | (enumLiteral_4= 'Float' ) | (enumLiteral_5= 'List' ) | (enumLiteral_6= 'Integer' ) | (enumLiteral_7= 'Long' ) | (enumLiteral_8= 'Map' ) | (enumLiteral_9= 'String' ) | (enumLiteral_10= 'Void' ) | (enumLiteral_11= 'EObject' ) ) ;
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
            // InternalMyDsl.g:5045:2: ( ( (enumLiteral_0= 'Boolean' ) | (enumLiteral_1= 'Char' ) | (enumLiteral_2= 'Date' ) | (enumLiteral_3= 'Double' ) | (enumLiteral_4= 'Float' ) | (enumLiteral_5= 'List' ) | (enumLiteral_6= 'Integer' ) | (enumLiteral_7= 'Long' ) | (enumLiteral_8= 'Map' ) | (enumLiteral_9= 'String' ) | (enumLiteral_10= 'Void' ) | (enumLiteral_11= 'EObject' ) ) )
            // InternalMyDsl.g:5046:2: ( (enumLiteral_0= 'Boolean' ) | (enumLiteral_1= 'Char' ) | (enumLiteral_2= 'Date' ) | (enumLiteral_3= 'Double' ) | (enumLiteral_4= 'Float' ) | (enumLiteral_5= 'List' ) | (enumLiteral_6= 'Integer' ) | (enumLiteral_7= 'Long' ) | (enumLiteral_8= 'Map' ) | (enumLiteral_9= 'String' ) | (enumLiteral_10= 'Void' ) | (enumLiteral_11= 'EObject' ) )
            {
            // InternalMyDsl.g:5046:2: ( (enumLiteral_0= 'Boolean' ) | (enumLiteral_1= 'Char' ) | (enumLiteral_2= 'Date' ) | (enumLiteral_3= 'Double' ) | (enumLiteral_4= 'Float' ) | (enumLiteral_5= 'List' ) | (enumLiteral_6= 'Integer' ) | (enumLiteral_7= 'Long' ) | (enumLiteral_8= 'Map' ) | (enumLiteral_9= 'String' ) | (enumLiteral_10= 'Void' ) | (enumLiteral_11= 'EObject' ) )
            int alt141=12;
            switch ( input.LA(1) ) {
            case 115:
                {
                alt141=1;
                }
                break;
            case 116:
                {
                alt141=2;
                }
                break;
            case 117:
                {
                alt141=3;
                }
                break;
            case 118:
                {
                alt141=4;
                }
                break;
            case 119:
                {
                alt141=5;
                }
                break;
            case 120:
                {
                alt141=6;
                }
                break;
            case 121:
                {
                alt141=7;
                }
                break;
            case 122:
                {
                alt141=8;
                }
                break;
            case 123:
                {
                alt141=9;
                }
                break;
            case 124:
                {
                alt141=10;
                }
                break;
            case 125:
                {
                alt141=11;
                }
                break;
            case 126:
                {
                alt141=12;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 141, 0, input);

                throw nvae;
            }

            switch (alt141) {
                case 1 :
                    // InternalMyDsl.g:5047:3: (enumLiteral_0= 'Boolean' )
                    {
                    // InternalMyDsl.g:5047:3: (enumLiteral_0= 'Boolean' )
                    // InternalMyDsl.g:5048:4: enumLiteral_0= 'Boolean'
                    {
                    enumLiteral_0=(Token)match(input,115,FOLLOW_2); 

                    				current = grammarAccess.getPossibleReturnTypesAccess().getBOOLEANEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getPossibleReturnTypesAccess().getBOOLEANEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:5055:3: (enumLiteral_1= 'Char' )
                    {
                    // InternalMyDsl.g:5055:3: (enumLiteral_1= 'Char' )
                    // InternalMyDsl.g:5056:4: enumLiteral_1= 'Char'
                    {
                    enumLiteral_1=(Token)match(input,116,FOLLOW_2); 

                    				current = grammarAccess.getPossibleReturnTypesAccess().getCHAREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getPossibleReturnTypesAccess().getCHAREnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:5063:3: (enumLiteral_2= 'Date' )
                    {
                    // InternalMyDsl.g:5063:3: (enumLiteral_2= 'Date' )
                    // InternalMyDsl.g:5064:4: enumLiteral_2= 'Date'
                    {
                    enumLiteral_2=(Token)match(input,117,FOLLOW_2); 

                    				current = grammarAccess.getPossibleReturnTypesAccess().getDATEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getPossibleReturnTypesAccess().getDATEEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:5071:3: (enumLiteral_3= 'Double' )
                    {
                    // InternalMyDsl.g:5071:3: (enumLiteral_3= 'Double' )
                    // InternalMyDsl.g:5072:4: enumLiteral_3= 'Double'
                    {
                    enumLiteral_3=(Token)match(input,118,FOLLOW_2); 

                    				current = grammarAccess.getPossibleReturnTypesAccess().getDOUBLEEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getPossibleReturnTypesAccess().getDOUBLEEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:5079:3: (enumLiteral_4= 'Float' )
                    {
                    // InternalMyDsl.g:5079:3: (enumLiteral_4= 'Float' )
                    // InternalMyDsl.g:5080:4: enumLiteral_4= 'Float'
                    {
                    enumLiteral_4=(Token)match(input,119,FOLLOW_2); 

                    				current = grammarAccess.getPossibleReturnTypesAccess().getFLOATEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getPossibleReturnTypesAccess().getFLOATEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:5087:3: (enumLiteral_5= 'List' )
                    {
                    // InternalMyDsl.g:5087:3: (enumLiteral_5= 'List' )
                    // InternalMyDsl.g:5088:4: enumLiteral_5= 'List'
                    {
                    enumLiteral_5=(Token)match(input,120,FOLLOW_2); 

                    				current = grammarAccess.getPossibleReturnTypesAccess().getLISTEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getPossibleReturnTypesAccess().getLISTEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalMyDsl.g:5095:3: (enumLiteral_6= 'Integer' )
                    {
                    // InternalMyDsl.g:5095:3: (enumLiteral_6= 'Integer' )
                    // InternalMyDsl.g:5096:4: enumLiteral_6= 'Integer'
                    {
                    enumLiteral_6=(Token)match(input,121,FOLLOW_2); 

                    				current = grammarAccess.getPossibleReturnTypesAccess().getINTEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getPossibleReturnTypesAccess().getINTEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalMyDsl.g:5103:3: (enumLiteral_7= 'Long' )
                    {
                    // InternalMyDsl.g:5103:3: (enumLiteral_7= 'Long' )
                    // InternalMyDsl.g:5104:4: enumLiteral_7= 'Long'
                    {
                    enumLiteral_7=(Token)match(input,122,FOLLOW_2); 

                    				current = grammarAccess.getPossibleReturnTypesAccess().getLONGEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getPossibleReturnTypesAccess().getLONGEnumLiteralDeclaration_7());
                    			

                    }


                    }
                    break;
                case 9 :
                    // InternalMyDsl.g:5111:3: (enumLiteral_8= 'Map' )
                    {
                    // InternalMyDsl.g:5111:3: (enumLiteral_8= 'Map' )
                    // InternalMyDsl.g:5112:4: enumLiteral_8= 'Map'
                    {
                    enumLiteral_8=(Token)match(input,123,FOLLOW_2); 

                    				current = grammarAccess.getPossibleReturnTypesAccess().getMAPEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_8, grammarAccess.getPossibleReturnTypesAccess().getMAPEnumLiteralDeclaration_8());
                    			

                    }


                    }
                    break;
                case 10 :
                    // InternalMyDsl.g:5119:3: (enumLiteral_9= 'String' )
                    {
                    // InternalMyDsl.g:5119:3: (enumLiteral_9= 'String' )
                    // InternalMyDsl.g:5120:4: enumLiteral_9= 'String'
                    {
                    enumLiteral_9=(Token)match(input,124,FOLLOW_2); 

                    				current = grammarAccess.getPossibleReturnTypesAccess().getSTRINGEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_9, grammarAccess.getPossibleReturnTypesAccess().getSTRINGEnumLiteralDeclaration_9());
                    			

                    }


                    }
                    break;
                case 11 :
                    // InternalMyDsl.g:5127:3: (enumLiteral_10= 'Void' )
                    {
                    // InternalMyDsl.g:5127:3: (enumLiteral_10= 'Void' )
                    // InternalMyDsl.g:5128:4: enumLiteral_10= 'Void'
                    {
                    enumLiteral_10=(Token)match(input,125,FOLLOW_2); 

                    				current = grammarAccess.getPossibleReturnTypesAccess().getVOIDEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_10, grammarAccess.getPossibleReturnTypesAccess().getVOIDEnumLiteralDeclaration_10());
                    			

                    }


                    }
                    break;
                case 12 :
                    // InternalMyDsl.g:5135:3: (enumLiteral_11= 'EObject' )
                    {
                    // InternalMyDsl.g:5135:3: (enumLiteral_11= 'EObject' )
                    // InternalMyDsl.g:5136:4: enumLiteral_11= 'EObject'
                    {
                    enumLiteral_11=(Token)match(input,126,FOLLOW_2); 

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
    // InternalMyDsl.g:5146:1: rulePossibleParameterTypes returns [Enumerator current=null] : ( (enumLiteral_0= 'Boolean' ) | (enumLiteral_1= 'Char' ) | (enumLiteral_2= 'Date' ) | (enumLiteral_3= 'Double' ) | (enumLiteral_4= 'Float' ) | (enumLiteral_5= 'List' ) | (enumLiteral_6= 'Integer' ) | (enumLiteral_7= 'Long' ) | (enumLiteral_8= 'Map' ) | (enumLiteral_9= 'String' ) | (enumLiteral_10= 'EObject' ) ) ;
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
            // InternalMyDsl.g:5152:2: ( ( (enumLiteral_0= 'Boolean' ) | (enumLiteral_1= 'Char' ) | (enumLiteral_2= 'Date' ) | (enumLiteral_3= 'Double' ) | (enumLiteral_4= 'Float' ) | (enumLiteral_5= 'List' ) | (enumLiteral_6= 'Integer' ) | (enumLiteral_7= 'Long' ) | (enumLiteral_8= 'Map' ) | (enumLiteral_9= 'String' ) | (enumLiteral_10= 'EObject' ) ) )
            // InternalMyDsl.g:5153:2: ( (enumLiteral_0= 'Boolean' ) | (enumLiteral_1= 'Char' ) | (enumLiteral_2= 'Date' ) | (enumLiteral_3= 'Double' ) | (enumLiteral_4= 'Float' ) | (enumLiteral_5= 'List' ) | (enumLiteral_6= 'Integer' ) | (enumLiteral_7= 'Long' ) | (enumLiteral_8= 'Map' ) | (enumLiteral_9= 'String' ) | (enumLiteral_10= 'EObject' ) )
            {
            // InternalMyDsl.g:5153:2: ( (enumLiteral_0= 'Boolean' ) | (enumLiteral_1= 'Char' ) | (enumLiteral_2= 'Date' ) | (enumLiteral_3= 'Double' ) | (enumLiteral_4= 'Float' ) | (enumLiteral_5= 'List' ) | (enumLiteral_6= 'Integer' ) | (enumLiteral_7= 'Long' ) | (enumLiteral_8= 'Map' ) | (enumLiteral_9= 'String' ) | (enumLiteral_10= 'EObject' ) )
            int alt142=11;
            switch ( input.LA(1) ) {
            case 115:
                {
                alt142=1;
                }
                break;
            case 116:
                {
                alt142=2;
                }
                break;
            case 117:
                {
                alt142=3;
                }
                break;
            case 118:
                {
                alt142=4;
                }
                break;
            case 119:
                {
                alt142=5;
                }
                break;
            case 120:
                {
                alt142=6;
                }
                break;
            case 121:
                {
                alt142=7;
                }
                break;
            case 122:
                {
                alt142=8;
                }
                break;
            case 123:
                {
                alt142=9;
                }
                break;
            case 124:
                {
                alt142=10;
                }
                break;
            case 126:
                {
                alt142=11;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 142, 0, input);

                throw nvae;
            }

            switch (alt142) {
                case 1 :
                    // InternalMyDsl.g:5154:3: (enumLiteral_0= 'Boolean' )
                    {
                    // InternalMyDsl.g:5154:3: (enumLiteral_0= 'Boolean' )
                    // InternalMyDsl.g:5155:4: enumLiteral_0= 'Boolean'
                    {
                    enumLiteral_0=(Token)match(input,115,FOLLOW_2); 

                    				current = grammarAccess.getPossibleParameterTypesAccess().getBOOLEANEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getPossibleParameterTypesAccess().getBOOLEANEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:5162:3: (enumLiteral_1= 'Char' )
                    {
                    // InternalMyDsl.g:5162:3: (enumLiteral_1= 'Char' )
                    // InternalMyDsl.g:5163:4: enumLiteral_1= 'Char'
                    {
                    enumLiteral_1=(Token)match(input,116,FOLLOW_2); 

                    				current = grammarAccess.getPossibleParameterTypesAccess().getCHAREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getPossibleParameterTypesAccess().getCHAREnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:5170:3: (enumLiteral_2= 'Date' )
                    {
                    // InternalMyDsl.g:5170:3: (enumLiteral_2= 'Date' )
                    // InternalMyDsl.g:5171:4: enumLiteral_2= 'Date'
                    {
                    enumLiteral_2=(Token)match(input,117,FOLLOW_2); 

                    				current = grammarAccess.getPossibleParameterTypesAccess().getDATEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getPossibleParameterTypesAccess().getDATEEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:5178:3: (enumLiteral_3= 'Double' )
                    {
                    // InternalMyDsl.g:5178:3: (enumLiteral_3= 'Double' )
                    // InternalMyDsl.g:5179:4: enumLiteral_3= 'Double'
                    {
                    enumLiteral_3=(Token)match(input,118,FOLLOW_2); 

                    				current = grammarAccess.getPossibleParameterTypesAccess().getDOUBLEEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getPossibleParameterTypesAccess().getDOUBLEEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:5186:3: (enumLiteral_4= 'Float' )
                    {
                    // InternalMyDsl.g:5186:3: (enumLiteral_4= 'Float' )
                    // InternalMyDsl.g:5187:4: enumLiteral_4= 'Float'
                    {
                    enumLiteral_4=(Token)match(input,119,FOLLOW_2); 

                    				current = grammarAccess.getPossibleParameterTypesAccess().getFLOATEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getPossibleParameterTypesAccess().getFLOATEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:5194:3: (enumLiteral_5= 'List' )
                    {
                    // InternalMyDsl.g:5194:3: (enumLiteral_5= 'List' )
                    // InternalMyDsl.g:5195:4: enumLiteral_5= 'List'
                    {
                    enumLiteral_5=(Token)match(input,120,FOLLOW_2); 

                    				current = grammarAccess.getPossibleParameterTypesAccess().getLISTEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getPossibleParameterTypesAccess().getLISTEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalMyDsl.g:5202:3: (enumLiteral_6= 'Integer' )
                    {
                    // InternalMyDsl.g:5202:3: (enumLiteral_6= 'Integer' )
                    // InternalMyDsl.g:5203:4: enumLiteral_6= 'Integer'
                    {
                    enumLiteral_6=(Token)match(input,121,FOLLOW_2); 

                    				current = grammarAccess.getPossibleParameterTypesAccess().getINTEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getPossibleParameterTypesAccess().getINTEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalMyDsl.g:5210:3: (enumLiteral_7= 'Long' )
                    {
                    // InternalMyDsl.g:5210:3: (enumLiteral_7= 'Long' )
                    // InternalMyDsl.g:5211:4: enumLiteral_7= 'Long'
                    {
                    enumLiteral_7=(Token)match(input,122,FOLLOW_2); 

                    				current = grammarAccess.getPossibleParameterTypesAccess().getLONGEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getPossibleParameterTypesAccess().getLONGEnumLiteralDeclaration_7());
                    			

                    }


                    }
                    break;
                case 9 :
                    // InternalMyDsl.g:5218:3: (enumLiteral_8= 'Map' )
                    {
                    // InternalMyDsl.g:5218:3: (enumLiteral_8= 'Map' )
                    // InternalMyDsl.g:5219:4: enumLiteral_8= 'Map'
                    {
                    enumLiteral_8=(Token)match(input,123,FOLLOW_2); 

                    				current = grammarAccess.getPossibleParameterTypesAccess().getMAPEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_8, grammarAccess.getPossibleParameterTypesAccess().getMAPEnumLiteralDeclaration_8());
                    			

                    }


                    }
                    break;
                case 10 :
                    // InternalMyDsl.g:5226:3: (enumLiteral_9= 'String' )
                    {
                    // InternalMyDsl.g:5226:3: (enumLiteral_9= 'String' )
                    // InternalMyDsl.g:5227:4: enumLiteral_9= 'String'
                    {
                    enumLiteral_9=(Token)match(input,124,FOLLOW_2); 

                    				current = grammarAccess.getPossibleParameterTypesAccess().getSTRINGEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_9, grammarAccess.getPossibleParameterTypesAccess().getSTRINGEnumLiteralDeclaration_9());
                    			

                    }


                    }
                    break;
                case 11 :
                    // InternalMyDsl.g:5234:3: (enumLiteral_10= 'EObject' )
                    {
                    // InternalMyDsl.g:5234:3: (enumLiteral_10= 'EObject' )
                    // InternalMyDsl.g:5235:4: enumLiteral_10= 'EObject'
                    {
                    enumLiteral_10=(Token)match(input,126,FOLLOW_2); 

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
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000001FFFFFA000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000000L,0x00000000000A8000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000001FFFFFC000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000000L,0x000000002A400000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000001FFFFF4000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000001FFFFE4000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000001FFFFC4000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000000L,0x0000000000006000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000001FFFF84000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x2000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000001FFFF04000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000001FFFE04000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000001FFFC04000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000001FFF804000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000001FFF004000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0004000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000001FFE004000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000001FFC004000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000001FF8004000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000001FF0004000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000001FE0004000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000001FC0004000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000001F80004000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000001F00004000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000001E00004000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000001C00004000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000001800004000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000001000004000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x00000FD000000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x00000F9000004000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x00000F1000004000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x00000E1000004000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x00000C1000004000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000081000004000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000C01000004000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000801000004000L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0000000000000000L,0x5FF8000000000000L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0078E01000000000L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0070E01000004000L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0060E01000004000L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0040E01000004000L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0040C01000004000L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0040801000004000L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0040001000004000L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0100001000000000L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x0C00000000000000L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x0800000000004000L});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x1000000000004000L});
    public static final BitSet FOLLOW_73 = new BitSet(new long[]{0xC000001000000000L});
    public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x8000001000000000L});
    public static final BitSet FOLLOW_75 = new BitSet(new long[]{0x4000001000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_76 = new BitSet(new long[]{0x0000001000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_77 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_78 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_79 = new BitSet(new long[]{0x0000001000000000L,0x00000000000003E0L});
    public static final BitSet FOLLOW_80 = new BitSet(new long[]{0x0000001000000000L,0x00000000000003C0L});
    public static final BitSet FOLLOW_81 = new BitSet(new long[]{0x0000001000004000L,0x0000000000000380L});
    public static final BitSet FOLLOW_82 = new BitSet(new long[]{0x0000001000004000L,0x0000000000000300L});
    public static final BitSet FOLLOW_83 = new BitSet(new long[]{0x0000001000004000L,0x0000000000000200L});
    public static final BitSet FOLLOW_84 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_85 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_86 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_87 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_88 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_89 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_90 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_91 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_92 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_93 = new BitSet(new long[]{0x0000001000000000L,0x0000000001800000L});
    public static final BitSet FOLLOW_94 = new BitSet(new long[]{0x0000001000004000L,0x0000000001000000L});
    public static final BitSet FOLLOW_95 = new BitSet(new long[]{0x0000001000000000L,0x0000000005000000L});
    public static final BitSet FOLLOW_96 = new BitSet(new long[]{0x0000001000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_97 = new BitSet(new long[]{0x0000001000000000L,0x00000000C0000000L});
    public static final BitSet FOLLOW_98 = new BitSet(new long[]{0x0000001000004000L,0x0000000080000000L});
    public static final BitSet FOLLOW_99 = new BitSet(new long[]{0x0078601000000000L});
    public static final BitSet FOLLOW_100 = new BitSet(new long[]{0x0070601000004000L});
    public static final BitSet FOLLOW_101 = new BitSet(new long[]{0x0060601000004000L});
    public static final BitSet FOLLOW_102 = new BitSet(new long[]{0x0040601000004000L});
    public static final BitSet FOLLOW_103 = new BitSet(new long[]{0x0040401000004000L});
    public static final BitSet FOLLOW_104 = new BitSet(new long[]{0x0000001000000000L,0x0000003C00000000L});
    public static final BitSet FOLLOW_105 = new BitSet(new long[]{0x0000001000004000L,0x0000003800000000L});
    public static final BitSet FOLLOW_106 = new BitSet(new long[]{0x0000001000004000L,0x0000003000000000L});
    public static final BitSet FOLLOW_107 = new BitSet(new long[]{0x0000001000004000L,0x0000002000000000L});
    public static final BitSet FOLLOW_108 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_109 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_110 = new BitSet(new long[]{0x0000000000000000L,0x7FF8000000000000L});
    public static final BitSet FOLLOW_111 = new BitSet(new long[]{0x0000001000000000L,0x0000C00000000000L});
    public static final BitSet FOLLOW_112 = new BitSet(new long[]{0x0000001000004000L,0x0000800000000000L});
    public static final BitSet FOLLOW_113 = new BitSet(new long[]{0x0000001000000000L,0x0006000000000000L});
    public static final BitSet FOLLOW_114 = new BitSet(new long[]{0x0000001000004000L,0x0004000000000000L});

}