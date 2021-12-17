package org.xtext.miniproject2.dbscript.dsl.parser.antlr.internal;

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
import org.xtext.miniproject2.dbscript.dsl.services.DbDSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDbDSLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'database'", "':'", "'table'", "'id'", "'-'", "'=>'", "'column'", "'f('", "')'", "'add'", "'('", "','", "');'", "'int'", "'varchar(255)'", "'datetime'", "'AutoNumber'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int RULE_INT=6;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalDbDSLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDbDSLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDbDSLParser.tokenNames; }
    public String getGrammarFileName() { return "InternalDbDSL.g"; }



     	private DbDSLGrammarAccess grammarAccess;

        public InternalDbDSLParser(TokenStream input, DbDSLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Database";
       	}

       	@Override
       	protected DbDSLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleDatabase"
    // InternalDbDSL.g:65:1: entryRuleDatabase returns [EObject current=null] : iv_ruleDatabase= ruleDatabase EOF ;
    public final EObject entryRuleDatabase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDatabase = null;


        try {
            // InternalDbDSL.g:65:49: (iv_ruleDatabase= ruleDatabase EOF )
            // InternalDbDSL.g:66:2: iv_ruleDatabase= ruleDatabase EOF
            {
             newCompositeNode(grammarAccess.getDatabaseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDatabase=ruleDatabase();

            state._fsp--;

             current =iv_ruleDatabase; 
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
    // $ANTLR end "entryRuleDatabase"


    // $ANTLR start "ruleDatabase"
    // InternalDbDSL.g:72:1: ruleDatabase returns [EObject current=null] : (otherlv_0= 'database' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_tables_3_0= ruleTable ) )* ( (lv_inserts_4_0= ruleInsert ) )* ) ;
    public final EObject ruleDatabase() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_tables_3_0 = null;

        EObject lv_inserts_4_0 = null;



        	enterRule();

        try {
            // InternalDbDSL.g:78:2: ( (otherlv_0= 'database' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_tables_3_0= ruleTable ) )* ( (lv_inserts_4_0= ruleInsert ) )* ) )
            // InternalDbDSL.g:79:2: (otherlv_0= 'database' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_tables_3_0= ruleTable ) )* ( (lv_inserts_4_0= ruleInsert ) )* )
            {
            // InternalDbDSL.g:79:2: (otherlv_0= 'database' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_tables_3_0= ruleTable ) )* ( (lv_inserts_4_0= ruleInsert ) )* )
            // InternalDbDSL.g:80:3: otherlv_0= 'database' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_tables_3_0= ruleTable ) )* ( (lv_inserts_4_0= ruleInsert ) )*
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getDatabaseAccess().getDatabaseKeyword_0());
            		
            // InternalDbDSL.g:84:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDbDSL.g:85:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDbDSL.g:85:4: (lv_name_1_0= RULE_ID )
            // InternalDbDSL.g:86:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getDatabaseAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDatabaseRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getDatabaseAccess().getColonKeyword_2());
            		
            // InternalDbDSL.g:106:3: ( (lv_tables_3_0= ruleTable ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==13) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalDbDSL.g:107:4: (lv_tables_3_0= ruleTable )
            	    {
            	    // InternalDbDSL.g:107:4: (lv_tables_3_0= ruleTable )
            	    // InternalDbDSL.g:108:5: lv_tables_3_0= ruleTable
            	    {

            	    					newCompositeNode(grammarAccess.getDatabaseAccess().getTablesTableParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_tables_3_0=ruleTable();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDatabaseRule());
            	    					}
            	    					add(
            	    						current,
            	    						"tables",
            	    						lv_tables_3_0,
            	    						"org.xtext.miniproject2.dbscript.dsl.DbDSL.Table");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalDbDSL.g:125:3: ( (lv_inserts_4_0= ruleInsert ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==20) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalDbDSL.g:126:4: (lv_inserts_4_0= ruleInsert )
            	    {
            	    // InternalDbDSL.g:126:4: (lv_inserts_4_0= ruleInsert )
            	    // InternalDbDSL.g:127:5: lv_inserts_4_0= ruleInsert
            	    {

            	    					newCompositeNode(grammarAccess.getDatabaseAccess().getInsertsInsertParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_inserts_4_0=ruleInsert();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDatabaseRule());
            	    					}
            	    					add(
            	    						current,
            	    						"inserts",
            	    						lv_inserts_4_0,
            	    						"org.xtext.miniproject2.dbscript.dsl.DbDSL.Insert");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
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
    // $ANTLR end "ruleDatabase"


    // $ANTLR start "entryRuleTable"
    // InternalDbDSL.g:148:1: entryRuleTable returns [EObject current=null] : iv_ruleTable= ruleTable EOF ;
    public final EObject entryRuleTable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTable = null;


        try {
            // InternalDbDSL.g:148:46: (iv_ruleTable= ruleTable EOF )
            // InternalDbDSL.g:149:2: iv_ruleTable= ruleTable EOF
            {
             newCompositeNode(grammarAccess.getTableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTable=ruleTable();

            state._fsp--;

             current =iv_ruleTable; 
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
    // $ANTLR end "entryRuleTable"


    // $ANTLR start "ruleTable"
    // InternalDbDSL.g:155:1: ruleTable returns [EObject current=null] : (otherlv_0= 'table' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_columns_3_0= ruleAbstractType ) )* ) ;
    public final EObject ruleTable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_columns_3_0 = null;



        	enterRule();

        try {
            // InternalDbDSL.g:161:2: ( (otherlv_0= 'table' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_columns_3_0= ruleAbstractType ) )* ) )
            // InternalDbDSL.g:162:2: (otherlv_0= 'table' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_columns_3_0= ruleAbstractType ) )* )
            {
            // InternalDbDSL.g:162:2: (otherlv_0= 'table' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_columns_3_0= ruleAbstractType ) )* )
            // InternalDbDSL.g:163:3: otherlv_0= 'table' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_columns_3_0= ruleAbstractType ) )*
            {
            otherlv_0=(Token)match(input,13,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getTableAccess().getTableKeyword_0());
            		
            // InternalDbDSL.g:167:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDbDSL.g:168:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDbDSL.g:168:4: (lv_name_1_0= RULE_ID )
            // InternalDbDSL.g:169:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getTableAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTableRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getTableAccess().getColonKeyword_2());
            		
            // InternalDbDSL.g:189:3: ( (lv_columns_3_0= ruleAbstractType ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==14||LA3_0==17) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalDbDSL.g:190:4: (lv_columns_3_0= ruleAbstractType )
            	    {
            	    // InternalDbDSL.g:190:4: (lv_columns_3_0= ruleAbstractType )
            	    // InternalDbDSL.g:191:5: lv_columns_3_0= ruleAbstractType
            	    {

            	    					newCompositeNode(grammarAccess.getTableAccess().getColumnsAbstractTypeParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_columns_3_0=ruleAbstractType();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getTableRule());
            	    					}
            	    					add(
            	    						current,
            	    						"columns",
            	    						lv_columns_3_0,
            	    						"org.xtext.miniproject2.dbscript.dsl.DbDSL.AbstractType");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
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
    // $ANTLR end "ruleTable"


    // $ANTLR start "entryRuleAbstractType"
    // InternalDbDSL.g:212:1: entryRuleAbstractType returns [EObject current=null] : iv_ruleAbstractType= ruleAbstractType EOF ;
    public final EObject entryRuleAbstractType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractType = null;


        try {
            // InternalDbDSL.g:212:53: (iv_ruleAbstractType= ruleAbstractType EOF )
            // InternalDbDSL.g:213:2: iv_ruleAbstractType= ruleAbstractType EOF
            {
             newCompositeNode(grammarAccess.getAbstractTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAbstractType=ruleAbstractType();

            state._fsp--;

             current =iv_ruleAbstractType; 
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
    // $ANTLR end "entryRuleAbstractType"


    // $ANTLR start "ruleAbstractType"
    // InternalDbDSL.g:219:1: ruleAbstractType returns [EObject current=null] : (this_PrimaryKey_0= rulePrimaryKey | this_Column_1= ruleColumn ) ;
    public final EObject ruleAbstractType() throws RecognitionException {
        EObject current = null;

        EObject this_PrimaryKey_0 = null;

        EObject this_Column_1 = null;



        	enterRule();

        try {
            // InternalDbDSL.g:225:2: ( (this_PrimaryKey_0= rulePrimaryKey | this_Column_1= ruleColumn ) )
            // InternalDbDSL.g:226:2: (this_PrimaryKey_0= rulePrimaryKey | this_Column_1= ruleColumn )
            {
            // InternalDbDSL.g:226:2: (this_PrimaryKey_0= rulePrimaryKey | this_Column_1= ruleColumn )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==14) ) {
                alt4=1;
            }
            else if ( (LA4_0==17) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalDbDSL.g:227:3: this_PrimaryKey_0= rulePrimaryKey
                    {

                    			newCompositeNode(grammarAccess.getAbstractTypeAccess().getPrimaryKeyParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_PrimaryKey_0=rulePrimaryKey();

                    state._fsp--;


                    			current = this_PrimaryKey_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDbDSL.g:236:3: this_Column_1= ruleColumn
                    {

                    			newCompositeNode(grammarAccess.getAbstractTypeAccess().getColumnParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Column_1=ruleColumn();

                    state._fsp--;


                    			current = this_Column_1;
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
    // $ANTLR end "ruleAbstractType"


    // $ANTLR start "entryRulePrimaryKey"
    // InternalDbDSL.g:248:1: entryRulePrimaryKey returns [EObject current=null] : iv_rulePrimaryKey= rulePrimaryKey EOF ;
    public final EObject entryRulePrimaryKey() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryKey = null;


        try {
            // InternalDbDSL.g:248:51: (iv_rulePrimaryKey= rulePrimaryKey EOF )
            // InternalDbDSL.g:249:2: iv_rulePrimaryKey= rulePrimaryKey EOF
            {
             newCompositeNode(grammarAccess.getPrimaryKeyRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrimaryKey=rulePrimaryKey();

            state._fsp--;

             current =iv_rulePrimaryKey; 
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
    // $ANTLR end "entryRulePrimaryKey"


    // $ANTLR start "rulePrimaryKey"
    // InternalDbDSL.g:255:1: rulePrimaryKey returns [EObject current=null] : (otherlv_0= 'id' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '-' ( (lv_type_3_0= ruleType ) ) (otherlv_4= '=>' ( (lv_autoIncrement_5_0= ruleType ) ) )? ) ;
    public final EObject rulePrimaryKey() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Enumerator lv_type_3_0 = null;

        Enumerator lv_autoIncrement_5_0 = null;



        	enterRule();

        try {
            // InternalDbDSL.g:261:2: ( (otherlv_0= 'id' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '-' ( (lv_type_3_0= ruleType ) ) (otherlv_4= '=>' ( (lv_autoIncrement_5_0= ruleType ) ) )? ) )
            // InternalDbDSL.g:262:2: (otherlv_0= 'id' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '-' ( (lv_type_3_0= ruleType ) ) (otherlv_4= '=>' ( (lv_autoIncrement_5_0= ruleType ) ) )? )
            {
            // InternalDbDSL.g:262:2: (otherlv_0= 'id' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '-' ( (lv_type_3_0= ruleType ) ) (otherlv_4= '=>' ( (lv_autoIncrement_5_0= ruleType ) ) )? )
            // InternalDbDSL.g:263:3: otherlv_0= 'id' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '-' ( (lv_type_3_0= ruleType ) ) (otherlv_4= '=>' ( (lv_autoIncrement_5_0= ruleType ) ) )?
            {
            otherlv_0=(Token)match(input,14,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getPrimaryKeyAccess().getIdKeyword_0());
            		
            // InternalDbDSL.g:267:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDbDSL.g:268:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDbDSL.g:268:4: (lv_name_1_0= RULE_ID )
            // InternalDbDSL.g:269:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_name_1_0, grammarAccess.getPrimaryKeyAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPrimaryKeyRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getPrimaryKeyAccess().getHyphenMinusKeyword_2());
            		
            // InternalDbDSL.g:289:3: ( (lv_type_3_0= ruleType ) )
            // InternalDbDSL.g:290:4: (lv_type_3_0= ruleType )
            {
            // InternalDbDSL.g:290:4: (lv_type_3_0= ruleType )
            // InternalDbDSL.g:291:5: lv_type_3_0= ruleType
            {

            					newCompositeNode(grammarAccess.getPrimaryKeyAccess().getTypeTypeEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_10);
            lv_type_3_0=ruleType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPrimaryKeyRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_3_0,
            						"org.xtext.miniproject2.dbscript.dsl.DbDSL.Type");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDbDSL.g:308:3: (otherlv_4= '=>' ( (lv_autoIncrement_5_0= ruleType ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==16) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalDbDSL.g:309:4: otherlv_4= '=>' ( (lv_autoIncrement_5_0= ruleType ) )
                    {
                    otherlv_4=(Token)match(input,16,FOLLOW_9); 

                    				newLeafNode(otherlv_4, grammarAccess.getPrimaryKeyAccess().getEqualsSignGreaterThanSignKeyword_4_0());
                    			
                    // InternalDbDSL.g:313:4: ( (lv_autoIncrement_5_0= ruleType ) )
                    // InternalDbDSL.g:314:5: (lv_autoIncrement_5_0= ruleType )
                    {
                    // InternalDbDSL.g:314:5: (lv_autoIncrement_5_0= ruleType )
                    // InternalDbDSL.g:315:6: lv_autoIncrement_5_0= ruleType
                    {

                    						newCompositeNode(grammarAccess.getPrimaryKeyAccess().getAutoIncrementTypeEnumRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_autoIncrement_5_0=ruleType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPrimaryKeyRule());
                    						}
                    						set(
                    							current,
                    							"autoIncrement",
                    							lv_autoIncrement_5_0,
                    							"org.xtext.miniproject2.dbscript.dsl.DbDSL.Type");
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
    // $ANTLR end "rulePrimaryKey"


    // $ANTLR start "entryRuleColumn"
    // InternalDbDSL.g:337:1: entryRuleColumn returns [EObject current=null] : iv_ruleColumn= ruleColumn EOF ;
    public final EObject entryRuleColumn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColumn = null;


        try {
            // InternalDbDSL.g:337:47: (iv_ruleColumn= ruleColumn EOF )
            // InternalDbDSL.g:338:2: iv_ruleColumn= ruleColumn EOF
            {
             newCompositeNode(grammarAccess.getColumnRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleColumn=ruleColumn();

            state._fsp--;

             current =iv_ruleColumn; 
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
    // $ANTLR end "entryRuleColumn"


    // $ANTLR start "ruleColumn"
    // InternalDbDSL.g:344:1: ruleColumn returns [EObject current=null] : (otherlv_0= 'column' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '-' ( (lv_type_3_0= ruleType ) ) (otherlv_4= 'f(' ( (otherlv_5= RULE_ID ) ) otherlv_6= '=>' ( (lv_fkey_7_0= RULE_STRING ) ) otherlv_8= ')' )? ) ;
    public final EObject ruleColumn() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_fkey_7_0=null;
        Token otherlv_8=null;
        Enumerator lv_type_3_0 = null;



        	enterRule();

        try {
            // InternalDbDSL.g:350:2: ( (otherlv_0= 'column' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '-' ( (lv_type_3_0= ruleType ) ) (otherlv_4= 'f(' ( (otherlv_5= RULE_ID ) ) otherlv_6= '=>' ( (lv_fkey_7_0= RULE_STRING ) ) otherlv_8= ')' )? ) )
            // InternalDbDSL.g:351:2: (otherlv_0= 'column' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '-' ( (lv_type_3_0= ruleType ) ) (otherlv_4= 'f(' ( (otherlv_5= RULE_ID ) ) otherlv_6= '=>' ( (lv_fkey_7_0= RULE_STRING ) ) otherlv_8= ')' )? )
            {
            // InternalDbDSL.g:351:2: (otherlv_0= 'column' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '-' ( (lv_type_3_0= ruleType ) ) (otherlv_4= 'f(' ( (otherlv_5= RULE_ID ) ) otherlv_6= '=>' ( (lv_fkey_7_0= RULE_STRING ) ) otherlv_8= ')' )? )
            // InternalDbDSL.g:352:3: otherlv_0= 'column' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '-' ( (lv_type_3_0= ruleType ) ) (otherlv_4= 'f(' ( (otherlv_5= RULE_ID ) ) otherlv_6= '=>' ( (lv_fkey_7_0= RULE_STRING ) ) otherlv_8= ')' )?
            {
            otherlv_0=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getColumnAccess().getColumnKeyword_0());
            		
            // InternalDbDSL.g:356:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDbDSL.g:357:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDbDSL.g:357:4: (lv_name_1_0= RULE_ID )
            // InternalDbDSL.g:358:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_name_1_0, grammarAccess.getColumnAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getColumnRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getColumnAccess().getHyphenMinusKeyword_2());
            		
            // InternalDbDSL.g:378:3: ( (lv_type_3_0= ruleType ) )
            // InternalDbDSL.g:379:4: (lv_type_3_0= ruleType )
            {
            // InternalDbDSL.g:379:4: (lv_type_3_0= ruleType )
            // InternalDbDSL.g:380:5: lv_type_3_0= ruleType
            {

            					newCompositeNode(grammarAccess.getColumnAccess().getTypeTypeEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_11);
            lv_type_3_0=ruleType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getColumnRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_3_0,
            						"org.xtext.miniproject2.dbscript.dsl.DbDSL.Type");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDbDSL.g:397:3: (otherlv_4= 'f(' ( (otherlv_5= RULE_ID ) ) otherlv_6= '=>' ( (lv_fkey_7_0= RULE_STRING ) ) otherlv_8= ')' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==18) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalDbDSL.g:398:4: otherlv_4= 'f(' ( (otherlv_5= RULE_ID ) ) otherlv_6= '=>' ( (lv_fkey_7_0= RULE_STRING ) ) otherlv_8= ')'
                    {
                    otherlv_4=(Token)match(input,18,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getColumnAccess().getFKeyword_4_0());
                    			
                    // InternalDbDSL.g:402:4: ( (otherlv_5= RULE_ID ) )
                    // InternalDbDSL.g:403:5: (otherlv_5= RULE_ID )
                    {
                    // InternalDbDSL.g:403:5: (otherlv_5= RULE_ID )
                    // InternalDbDSL.g:404:6: otherlv_5= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getColumnRule());
                    						}
                    					
                    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_12); 

                    						newLeafNode(otherlv_5, grammarAccess.getColumnAccess().getSourceTableTableCrossReference_4_1_0());
                    					

                    }


                    }

                    otherlv_6=(Token)match(input,16,FOLLOW_13); 

                    				newLeafNode(otherlv_6, grammarAccess.getColumnAccess().getEqualsSignGreaterThanSignKeyword_4_2());
                    			
                    // InternalDbDSL.g:419:4: ( (lv_fkey_7_0= RULE_STRING ) )
                    // InternalDbDSL.g:420:5: (lv_fkey_7_0= RULE_STRING )
                    {
                    // InternalDbDSL.g:420:5: (lv_fkey_7_0= RULE_STRING )
                    // InternalDbDSL.g:421:6: lv_fkey_7_0= RULE_STRING
                    {
                    lv_fkey_7_0=(Token)match(input,RULE_STRING,FOLLOW_14); 

                    						newLeafNode(lv_fkey_7_0, grammarAccess.getColumnAccess().getFkeySTRINGTerminalRuleCall_4_3_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getColumnRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"fkey",
                    							lv_fkey_7_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }

                    otherlv_8=(Token)match(input,19,FOLLOW_2); 

                    				newLeafNode(otherlv_8, grammarAccess.getColumnAccess().getRightParenthesisKeyword_4_4());
                    			

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
    // $ANTLR end "ruleColumn"


    // $ANTLR start "entryRuleInsert"
    // InternalDbDSL.g:446:1: entryRuleInsert returns [EObject current=null] : iv_ruleInsert= ruleInsert EOF ;
    public final EObject entryRuleInsert() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInsert = null;


        try {
            // InternalDbDSL.g:446:47: (iv_ruleInsert= ruleInsert EOF )
            // InternalDbDSL.g:447:2: iv_ruleInsert= ruleInsert EOF
            {
             newCompositeNode(grammarAccess.getInsertRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInsert=ruleInsert();

            state._fsp--;

             current =iv_ruleInsert; 
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
    // $ANTLR end "entryRuleInsert"


    // $ANTLR start "ruleInsert"
    // InternalDbDSL.g:453:1: ruleInsert returns [EObject current=null] : (otherlv_0= 'add' ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (lv_var_3_0= RULE_STRING ) )* (otherlv_4= ',' ( (lv_var_5_0= RULE_STRING ) ) )* otherlv_6= ');' ) ;
    public final EObject ruleInsert() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_var_3_0=null;
        Token otherlv_4=null;
        Token lv_var_5_0=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalDbDSL.g:459:2: ( (otherlv_0= 'add' ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (lv_var_3_0= RULE_STRING ) )* (otherlv_4= ',' ( (lv_var_5_0= RULE_STRING ) ) )* otherlv_6= ');' ) )
            // InternalDbDSL.g:460:2: (otherlv_0= 'add' ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (lv_var_3_0= RULE_STRING ) )* (otherlv_4= ',' ( (lv_var_5_0= RULE_STRING ) ) )* otherlv_6= ');' )
            {
            // InternalDbDSL.g:460:2: (otherlv_0= 'add' ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (lv_var_3_0= RULE_STRING ) )* (otherlv_4= ',' ( (lv_var_5_0= RULE_STRING ) ) )* otherlv_6= ');' )
            // InternalDbDSL.g:461:3: otherlv_0= 'add' ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (lv_var_3_0= RULE_STRING ) )* (otherlv_4= ',' ( (lv_var_5_0= RULE_STRING ) ) )* otherlv_6= ');'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getInsertAccess().getAddKeyword_0());
            		
            // InternalDbDSL.g:465:3: ( (otherlv_1= RULE_ID ) )
            // InternalDbDSL.g:466:4: (otherlv_1= RULE_ID )
            {
            // InternalDbDSL.g:466:4: (otherlv_1= RULE_ID )
            // InternalDbDSL.g:467:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInsertRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_15); 

            					newLeafNode(otherlv_1, grammarAccess.getInsertAccess().getTableTableCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,21,FOLLOW_16); 

            			newLeafNode(otherlv_2, grammarAccess.getInsertAccess().getLeftParenthesisKeyword_2());
            		
            // InternalDbDSL.g:482:3: ( (lv_var_3_0= RULE_STRING ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_STRING) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalDbDSL.g:483:4: (lv_var_3_0= RULE_STRING )
            	    {
            	    // InternalDbDSL.g:483:4: (lv_var_3_0= RULE_STRING )
            	    // InternalDbDSL.g:484:5: lv_var_3_0= RULE_STRING
            	    {
            	    lv_var_3_0=(Token)match(input,RULE_STRING,FOLLOW_16); 

            	    					newLeafNode(lv_var_3_0, grammarAccess.getInsertAccess().getVarSTRINGTerminalRuleCall_3_0());
            	    				

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getInsertRule());
            	    					}
            	    					addWithLastConsumed(
            	    						current,
            	    						"var",
            	    						lv_var_3_0,
            	    						"org.eclipse.xtext.common.Terminals.STRING");
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            // InternalDbDSL.g:500:3: (otherlv_4= ',' ( (lv_var_5_0= RULE_STRING ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==22) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalDbDSL.g:501:4: otherlv_4= ',' ( (lv_var_5_0= RULE_STRING ) )
            	    {
            	    otherlv_4=(Token)match(input,22,FOLLOW_13); 

            	    				newLeafNode(otherlv_4, grammarAccess.getInsertAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalDbDSL.g:505:4: ( (lv_var_5_0= RULE_STRING ) )
            	    // InternalDbDSL.g:506:5: (lv_var_5_0= RULE_STRING )
            	    {
            	    // InternalDbDSL.g:506:5: (lv_var_5_0= RULE_STRING )
            	    // InternalDbDSL.g:507:6: lv_var_5_0= RULE_STRING
            	    {
            	    lv_var_5_0=(Token)match(input,RULE_STRING,FOLLOW_17); 

            	    						newLeafNode(lv_var_5_0, grammarAccess.getInsertAccess().getVarSTRINGTerminalRuleCall_4_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getInsertRule());
            	    						}
            	    						addWithLastConsumed(
            	    							current,
            	    							"var",
            	    							lv_var_5_0,
            	    							"org.eclipse.xtext.common.Terminals.STRING");
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_6=(Token)match(input,23,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getInsertAccess().getRightParenthesisSemicolonKeyword_5());
            		

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
    // $ANTLR end "ruleInsert"


    // $ANTLR start "ruleType"
    // InternalDbDSL.g:532:1: ruleType returns [Enumerator current=null] : ( (enumLiteral_0= 'int' ) | (enumLiteral_1= 'varchar(255)' ) | (enumLiteral_2= 'datetime' ) | (enumLiteral_3= 'AutoNumber' ) ) ;
    public final Enumerator ruleType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalDbDSL.g:538:2: ( ( (enumLiteral_0= 'int' ) | (enumLiteral_1= 'varchar(255)' ) | (enumLiteral_2= 'datetime' ) | (enumLiteral_3= 'AutoNumber' ) ) )
            // InternalDbDSL.g:539:2: ( (enumLiteral_0= 'int' ) | (enumLiteral_1= 'varchar(255)' ) | (enumLiteral_2= 'datetime' ) | (enumLiteral_3= 'AutoNumber' ) )
            {
            // InternalDbDSL.g:539:2: ( (enumLiteral_0= 'int' ) | (enumLiteral_1= 'varchar(255)' ) | (enumLiteral_2= 'datetime' ) | (enumLiteral_3= 'AutoNumber' ) )
            int alt9=4;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt9=1;
                }
                break;
            case 25:
                {
                alt9=2;
                }
                break;
            case 26:
                {
                alt9=3;
                }
                break;
            case 27:
                {
                alt9=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalDbDSL.g:540:3: (enumLiteral_0= 'int' )
                    {
                    // InternalDbDSL.g:540:3: (enumLiteral_0= 'int' )
                    // InternalDbDSL.g:541:4: enumLiteral_0= 'int'
                    {
                    enumLiteral_0=(Token)match(input,24,FOLLOW_2); 

                    				current = grammarAccess.getTypeAccess().getINTEGEREnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTypeAccess().getINTEGEREnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDbDSL.g:548:3: (enumLiteral_1= 'varchar(255)' )
                    {
                    // InternalDbDSL.g:548:3: (enumLiteral_1= 'varchar(255)' )
                    // InternalDbDSL.g:549:4: enumLiteral_1= 'varchar(255)'
                    {
                    enumLiteral_1=(Token)match(input,25,FOLLOW_2); 

                    				current = grammarAccess.getTypeAccess().getTEXTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTypeAccess().getTEXTEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalDbDSL.g:556:3: (enumLiteral_2= 'datetime' )
                    {
                    // InternalDbDSL.g:556:3: (enumLiteral_2= 'datetime' )
                    // InternalDbDSL.g:557:4: enumLiteral_2= 'datetime'
                    {
                    enumLiteral_2=(Token)match(input,26,FOLLOW_2); 

                    				current = grammarAccess.getTypeAccess().getDATEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getTypeAccess().getDATEEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalDbDSL.g:564:3: (enumLiteral_3= 'AutoNumber' )
                    {
                    // InternalDbDSL.g:564:3: (enumLiteral_3= 'AutoNumber' )
                    // InternalDbDSL.g:565:4: enumLiteral_3= 'AutoNumber'
                    {
                    enumLiteral_3=(Token)match(input,27,FOLLOW_2); 

                    				current = grammarAccess.getTypeAccess().getAUTOINCREMENTEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getTypeAccess().getAUTOINCREMENTEnumLiteralDeclaration_3());
                    			

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
    // $ANTLR end "ruleType"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000102002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000024002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x000000000F000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000C00020L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000C00000L});

}