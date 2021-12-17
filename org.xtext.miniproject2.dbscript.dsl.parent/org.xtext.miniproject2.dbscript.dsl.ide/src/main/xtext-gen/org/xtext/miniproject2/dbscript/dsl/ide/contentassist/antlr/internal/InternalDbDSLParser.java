package org.xtext.miniproject2.dbscript.dsl.ide.contentassist.antlr.internal;

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
import org.xtext.miniproject2.dbscript.dsl.services.DbDSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDbDSLParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'int'", "'varchar(255)'", "'datetime'", "'AutoNumber'", "'database'", "':'", "'table'", "'id'", "'-'", "'=>'", "'column'", "'f('", "')'", "'add'", "'('", "');'", "','"
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

    	public void setGrammarAccess(DbDSLGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleDatabase"
    // InternalDbDSL.g:53:1: entryRuleDatabase : ruleDatabase EOF ;
    public final void entryRuleDatabase() throws RecognitionException {
        try {
            // InternalDbDSL.g:54:1: ( ruleDatabase EOF )
            // InternalDbDSL.g:55:1: ruleDatabase EOF
            {
             before(grammarAccess.getDatabaseRule()); 
            pushFollow(FOLLOW_1);
            ruleDatabase();

            state._fsp--;

             after(grammarAccess.getDatabaseRule()); 
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
    // $ANTLR end "entryRuleDatabase"


    // $ANTLR start "ruleDatabase"
    // InternalDbDSL.g:62:1: ruleDatabase : ( ( rule__Database__Group__0 ) ) ;
    public final void ruleDatabase() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbDSL.g:66:2: ( ( ( rule__Database__Group__0 ) ) )
            // InternalDbDSL.g:67:2: ( ( rule__Database__Group__0 ) )
            {
            // InternalDbDSL.g:67:2: ( ( rule__Database__Group__0 ) )
            // InternalDbDSL.g:68:3: ( rule__Database__Group__0 )
            {
             before(grammarAccess.getDatabaseAccess().getGroup()); 
            // InternalDbDSL.g:69:3: ( rule__Database__Group__0 )
            // InternalDbDSL.g:69:4: rule__Database__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Database__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDatabaseAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDatabase"


    // $ANTLR start "entryRuleTable"
    // InternalDbDSL.g:78:1: entryRuleTable : ruleTable EOF ;
    public final void entryRuleTable() throws RecognitionException {
        try {
            // InternalDbDSL.g:79:1: ( ruleTable EOF )
            // InternalDbDSL.g:80:1: ruleTable EOF
            {
             before(grammarAccess.getTableRule()); 
            pushFollow(FOLLOW_1);
            ruleTable();

            state._fsp--;

             after(grammarAccess.getTableRule()); 
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
    // $ANTLR end "entryRuleTable"


    // $ANTLR start "ruleTable"
    // InternalDbDSL.g:87:1: ruleTable : ( ( rule__Table__Group__0 ) ) ;
    public final void ruleTable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbDSL.g:91:2: ( ( ( rule__Table__Group__0 ) ) )
            // InternalDbDSL.g:92:2: ( ( rule__Table__Group__0 ) )
            {
            // InternalDbDSL.g:92:2: ( ( rule__Table__Group__0 ) )
            // InternalDbDSL.g:93:3: ( rule__Table__Group__0 )
            {
             before(grammarAccess.getTableAccess().getGroup()); 
            // InternalDbDSL.g:94:3: ( rule__Table__Group__0 )
            // InternalDbDSL.g:94:4: rule__Table__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Table__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTableAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTable"


    // $ANTLR start "entryRuleAbstractType"
    // InternalDbDSL.g:103:1: entryRuleAbstractType : ruleAbstractType EOF ;
    public final void entryRuleAbstractType() throws RecognitionException {
        try {
            // InternalDbDSL.g:104:1: ( ruleAbstractType EOF )
            // InternalDbDSL.g:105:1: ruleAbstractType EOF
            {
             before(grammarAccess.getAbstractTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleAbstractType();

            state._fsp--;

             after(grammarAccess.getAbstractTypeRule()); 
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
    // $ANTLR end "entryRuleAbstractType"


    // $ANTLR start "ruleAbstractType"
    // InternalDbDSL.g:112:1: ruleAbstractType : ( ( rule__AbstractType__Alternatives ) ) ;
    public final void ruleAbstractType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbDSL.g:116:2: ( ( ( rule__AbstractType__Alternatives ) ) )
            // InternalDbDSL.g:117:2: ( ( rule__AbstractType__Alternatives ) )
            {
            // InternalDbDSL.g:117:2: ( ( rule__AbstractType__Alternatives ) )
            // InternalDbDSL.g:118:3: ( rule__AbstractType__Alternatives )
            {
             before(grammarAccess.getAbstractTypeAccess().getAlternatives()); 
            // InternalDbDSL.g:119:3: ( rule__AbstractType__Alternatives )
            // InternalDbDSL.g:119:4: rule__AbstractType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__AbstractType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAbstractTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAbstractType"


    // $ANTLR start "entryRulePrimaryKey"
    // InternalDbDSL.g:128:1: entryRulePrimaryKey : rulePrimaryKey EOF ;
    public final void entryRulePrimaryKey() throws RecognitionException {
        try {
            // InternalDbDSL.g:129:1: ( rulePrimaryKey EOF )
            // InternalDbDSL.g:130:1: rulePrimaryKey EOF
            {
             before(grammarAccess.getPrimaryKeyRule()); 
            pushFollow(FOLLOW_1);
            rulePrimaryKey();

            state._fsp--;

             after(grammarAccess.getPrimaryKeyRule()); 
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
    // $ANTLR end "entryRulePrimaryKey"


    // $ANTLR start "rulePrimaryKey"
    // InternalDbDSL.g:137:1: rulePrimaryKey : ( ( rule__PrimaryKey__Group__0 ) ) ;
    public final void rulePrimaryKey() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbDSL.g:141:2: ( ( ( rule__PrimaryKey__Group__0 ) ) )
            // InternalDbDSL.g:142:2: ( ( rule__PrimaryKey__Group__0 ) )
            {
            // InternalDbDSL.g:142:2: ( ( rule__PrimaryKey__Group__0 ) )
            // InternalDbDSL.g:143:3: ( rule__PrimaryKey__Group__0 )
            {
             before(grammarAccess.getPrimaryKeyAccess().getGroup()); 
            // InternalDbDSL.g:144:3: ( rule__PrimaryKey__Group__0 )
            // InternalDbDSL.g:144:4: rule__PrimaryKey__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PrimaryKey__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryKeyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePrimaryKey"


    // $ANTLR start "entryRuleColumn"
    // InternalDbDSL.g:153:1: entryRuleColumn : ruleColumn EOF ;
    public final void entryRuleColumn() throws RecognitionException {
        try {
            // InternalDbDSL.g:154:1: ( ruleColumn EOF )
            // InternalDbDSL.g:155:1: ruleColumn EOF
            {
             before(grammarAccess.getColumnRule()); 
            pushFollow(FOLLOW_1);
            ruleColumn();

            state._fsp--;

             after(grammarAccess.getColumnRule()); 
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
    // $ANTLR end "entryRuleColumn"


    // $ANTLR start "ruleColumn"
    // InternalDbDSL.g:162:1: ruleColumn : ( ( rule__Column__Group__0 ) ) ;
    public final void ruleColumn() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbDSL.g:166:2: ( ( ( rule__Column__Group__0 ) ) )
            // InternalDbDSL.g:167:2: ( ( rule__Column__Group__0 ) )
            {
            // InternalDbDSL.g:167:2: ( ( rule__Column__Group__0 ) )
            // InternalDbDSL.g:168:3: ( rule__Column__Group__0 )
            {
             before(grammarAccess.getColumnAccess().getGroup()); 
            // InternalDbDSL.g:169:3: ( rule__Column__Group__0 )
            // InternalDbDSL.g:169:4: rule__Column__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Column__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getColumnAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleColumn"


    // $ANTLR start "entryRuleInsert"
    // InternalDbDSL.g:178:1: entryRuleInsert : ruleInsert EOF ;
    public final void entryRuleInsert() throws RecognitionException {
        try {
            // InternalDbDSL.g:179:1: ( ruleInsert EOF )
            // InternalDbDSL.g:180:1: ruleInsert EOF
            {
             before(grammarAccess.getInsertRule()); 
            pushFollow(FOLLOW_1);
            ruleInsert();

            state._fsp--;

             after(grammarAccess.getInsertRule()); 
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
    // $ANTLR end "entryRuleInsert"


    // $ANTLR start "ruleInsert"
    // InternalDbDSL.g:187:1: ruleInsert : ( ( rule__Insert__Group__0 ) ) ;
    public final void ruleInsert() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbDSL.g:191:2: ( ( ( rule__Insert__Group__0 ) ) )
            // InternalDbDSL.g:192:2: ( ( rule__Insert__Group__0 ) )
            {
            // InternalDbDSL.g:192:2: ( ( rule__Insert__Group__0 ) )
            // InternalDbDSL.g:193:3: ( rule__Insert__Group__0 )
            {
             before(grammarAccess.getInsertAccess().getGroup()); 
            // InternalDbDSL.g:194:3: ( rule__Insert__Group__0 )
            // InternalDbDSL.g:194:4: rule__Insert__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Insert__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInsertAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInsert"


    // $ANTLR start "ruleType"
    // InternalDbDSL.g:203:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbDSL.g:207:1: ( ( ( rule__Type__Alternatives ) ) )
            // InternalDbDSL.g:208:2: ( ( rule__Type__Alternatives ) )
            {
            // InternalDbDSL.g:208:2: ( ( rule__Type__Alternatives ) )
            // InternalDbDSL.g:209:3: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // InternalDbDSL.g:210:3: ( rule__Type__Alternatives )
            // InternalDbDSL.g:210:4: rule__Type__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Type__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "rule__AbstractType__Alternatives"
    // InternalDbDSL.g:218:1: rule__AbstractType__Alternatives : ( ( rulePrimaryKey ) | ( ruleColumn ) );
    public final void rule__AbstractType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbDSL.g:222:1: ( ( rulePrimaryKey ) | ( ruleColumn ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==18) ) {
                alt1=1;
            }
            else if ( (LA1_0==21) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalDbDSL.g:223:2: ( rulePrimaryKey )
                    {
                    // InternalDbDSL.g:223:2: ( rulePrimaryKey )
                    // InternalDbDSL.g:224:3: rulePrimaryKey
                    {
                     before(grammarAccess.getAbstractTypeAccess().getPrimaryKeyParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    rulePrimaryKey();

                    state._fsp--;

                     after(grammarAccess.getAbstractTypeAccess().getPrimaryKeyParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDbDSL.g:229:2: ( ruleColumn )
                    {
                    // InternalDbDSL.g:229:2: ( ruleColumn )
                    // InternalDbDSL.g:230:3: ruleColumn
                    {
                     before(grammarAccess.getAbstractTypeAccess().getColumnParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleColumn();

                    state._fsp--;

                     after(grammarAccess.getAbstractTypeAccess().getColumnParserRuleCall_1()); 

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
    // $ANTLR end "rule__AbstractType__Alternatives"


    // $ANTLR start "rule__Type__Alternatives"
    // InternalDbDSL.g:239:1: rule__Type__Alternatives : ( ( ( 'int' ) ) | ( ( 'varchar(255)' ) ) | ( ( 'datetime' ) ) | ( ( 'AutoNumber' ) ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbDSL.g:243:1: ( ( ( 'int' ) ) | ( ( 'varchar(255)' ) ) | ( ( 'datetime' ) ) | ( ( 'AutoNumber' ) ) )
            int alt2=4;
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
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalDbDSL.g:244:2: ( ( 'int' ) )
                    {
                    // InternalDbDSL.g:244:2: ( ( 'int' ) )
                    // InternalDbDSL.g:245:3: ( 'int' )
                    {
                     before(grammarAccess.getTypeAccess().getINTEGEREnumLiteralDeclaration_0()); 
                    // InternalDbDSL.g:246:3: ( 'int' )
                    // InternalDbDSL.g:246:4: 'int'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeAccess().getINTEGEREnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDbDSL.g:250:2: ( ( 'varchar(255)' ) )
                    {
                    // InternalDbDSL.g:250:2: ( ( 'varchar(255)' ) )
                    // InternalDbDSL.g:251:3: ( 'varchar(255)' )
                    {
                     before(grammarAccess.getTypeAccess().getTEXTEnumLiteralDeclaration_1()); 
                    // InternalDbDSL.g:252:3: ( 'varchar(255)' )
                    // InternalDbDSL.g:252:4: 'varchar(255)'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeAccess().getTEXTEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDbDSL.g:256:2: ( ( 'datetime' ) )
                    {
                    // InternalDbDSL.g:256:2: ( ( 'datetime' ) )
                    // InternalDbDSL.g:257:3: ( 'datetime' )
                    {
                     before(grammarAccess.getTypeAccess().getDATEEnumLiteralDeclaration_2()); 
                    // InternalDbDSL.g:258:3: ( 'datetime' )
                    // InternalDbDSL.g:258:4: 'datetime'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeAccess().getDATEEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalDbDSL.g:262:2: ( ( 'AutoNumber' ) )
                    {
                    // InternalDbDSL.g:262:2: ( ( 'AutoNumber' ) )
                    // InternalDbDSL.g:263:3: ( 'AutoNumber' )
                    {
                     before(grammarAccess.getTypeAccess().getAUTOINCREMENTEnumLiteralDeclaration_3()); 
                    // InternalDbDSL.g:264:3: ( 'AutoNumber' )
                    // InternalDbDSL.g:264:4: 'AutoNumber'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeAccess().getAUTOINCREMENTEnumLiteralDeclaration_3()); 

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
    // $ANTLR end "rule__Type__Alternatives"


    // $ANTLR start "rule__Database__Group__0"
    // InternalDbDSL.g:272:1: rule__Database__Group__0 : rule__Database__Group__0__Impl rule__Database__Group__1 ;
    public final void rule__Database__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbDSL.g:276:1: ( rule__Database__Group__0__Impl rule__Database__Group__1 )
            // InternalDbDSL.g:277:2: rule__Database__Group__0__Impl rule__Database__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Database__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Database__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Database__Group__0"


    // $ANTLR start "rule__Database__Group__0__Impl"
    // InternalDbDSL.g:284:1: rule__Database__Group__0__Impl : ( 'database' ) ;
    public final void rule__Database__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbDSL.g:288:1: ( ( 'database' ) )
            // InternalDbDSL.g:289:1: ( 'database' )
            {
            // InternalDbDSL.g:289:1: ( 'database' )
            // InternalDbDSL.g:290:2: 'database'
            {
             before(grammarAccess.getDatabaseAccess().getDatabaseKeyword_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getDatabaseAccess().getDatabaseKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Database__Group__0__Impl"


    // $ANTLR start "rule__Database__Group__1"
    // InternalDbDSL.g:299:1: rule__Database__Group__1 : rule__Database__Group__1__Impl rule__Database__Group__2 ;
    public final void rule__Database__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbDSL.g:303:1: ( rule__Database__Group__1__Impl rule__Database__Group__2 )
            // InternalDbDSL.g:304:2: rule__Database__Group__1__Impl rule__Database__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Database__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Database__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Database__Group__1"


    // $ANTLR start "rule__Database__Group__1__Impl"
    // InternalDbDSL.g:311:1: rule__Database__Group__1__Impl : ( ( rule__Database__NameAssignment_1 ) ) ;
    public final void rule__Database__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbDSL.g:315:1: ( ( ( rule__Database__NameAssignment_1 ) ) )
            // InternalDbDSL.g:316:1: ( ( rule__Database__NameAssignment_1 ) )
            {
            // InternalDbDSL.g:316:1: ( ( rule__Database__NameAssignment_1 ) )
            // InternalDbDSL.g:317:2: ( rule__Database__NameAssignment_1 )
            {
             before(grammarAccess.getDatabaseAccess().getNameAssignment_1()); 
            // InternalDbDSL.g:318:2: ( rule__Database__NameAssignment_1 )
            // InternalDbDSL.g:318:3: rule__Database__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Database__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDatabaseAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Database__Group__1__Impl"


    // $ANTLR start "rule__Database__Group__2"
    // InternalDbDSL.g:326:1: rule__Database__Group__2 : rule__Database__Group__2__Impl rule__Database__Group__3 ;
    public final void rule__Database__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbDSL.g:330:1: ( rule__Database__Group__2__Impl rule__Database__Group__3 )
            // InternalDbDSL.g:331:2: rule__Database__Group__2__Impl rule__Database__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Database__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Database__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Database__Group__2"


    // $ANTLR start "rule__Database__Group__2__Impl"
    // InternalDbDSL.g:338:1: rule__Database__Group__2__Impl : ( ':' ) ;
    public final void rule__Database__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbDSL.g:342:1: ( ( ':' ) )
            // InternalDbDSL.g:343:1: ( ':' )
            {
            // InternalDbDSL.g:343:1: ( ':' )
            // InternalDbDSL.g:344:2: ':'
            {
             before(grammarAccess.getDatabaseAccess().getColonKeyword_2()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getDatabaseAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Database__Group__2__Impl"


    // $ANTLR start "rule__Database__Group__3"
    // InternalDbDSL.g:353:1: rule__Database__Group__3 : rule__Database__Group__3__Impl rule__Database__Group__4 ;
    public final void rule__Database__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbDSL.g:357:1: ( rule__Database__Group__3__Impl rule__Database__Group__4 )
            // InternalDbDSL.g:358:2: rule__Database__Group__3__Impl rule__Database__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__Database__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Database__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Database__Group__3"


    // $ANTLR start "rule__Database__Group__3__Impl"
    // InternalDbDSL.g:365:1: rule__Database__Group__3__Impl : ( ( rule__Database__TablesAssignment_3 )* ) ;
    public final void rule__Database__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbDSL.g:369:1: ( ( ( rule__Database__TablesAssignment_3 )* ) )
            // InternalDbDSL.g:370:1: ( ( rule__Database__TablesAssignment_3 )* )
            {
            // InternalDbDSL.g:370:1: ( ( rule__Database__TablesAssignment_3 )* )
            // InternalDbDSL.g:371:2: ( rule__Database__TablesAssignment_3 )*
            {
             before(grammarAccess.getDatabaseAccess().getTablesAssignment_3()); 
            // InternalDbDSL.g:372:2: ( rule__Database__TablesAssignment_3 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==17) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalDbDSL.g:372:3: rule__Database__TablesAssignment_3
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Database__TablesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getDatabaseAccess().getTablesAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Database__Group__3__Impl"


    // $ANTLR start "rule__Database__Group__4"
    // InternalDbDSL.g:380:1: rule__Database__Group__4 : rule__Database__Group__4__Impl ;
    public final void rule__Database__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbDSL.g:384:1: ( rule__Database__Group__4__Impl )
            // InternalDbDSL.g:385:2: rule__Database__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Database__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Database__Group__4"


    // $ANTLR start "rule__Database__Group__4__Impl"
    // InternalDbDSL.g:391:1: rule__Database__Group__4__Impl : ( ( rule__Database__InsertsAssignment_4 )* ) ;
    public final void rule__Database__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbDSL.g:395:1: ( ( ( rule__Database__InsertsAssignment_4 )* ) )
            // InternalDbDSL.g:396:1: ( ( rule__Database__InsertsAssignment_4 )* )
            {
            // InternalDbDSL.g:396:1: ( ( rule__Database__InsertsAssignment_4 )* )
            // InternalDbDSL.g:397:2: ( rule__Database__InsertsAssignment_4 )*
            {
             before(grammarAccess.getDatabaseAccess().getInsertsAssignment_4()); 
            // InternalDbDSL.g:398:2: ( rule__Database__InsertsAssignment_4 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==24) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalDbDSL.g:398:3: rule__Database__InsertsAssignment_4
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Database__InsertsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getDatabaseAccess().getInsertsAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Database__Group__4__Impl"


    // $ANTLR start "rule__Table__Group__0"
    // InternalDbDSL.g:407:1: rule__Table__Group__0 : rule__Table__Group__0__Impl rule__Table__Group__1 ;
    public final void rule__Table__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbDSL.g:411:1: ( rule__Table__Group__0__Impl rule__Table__Group__1 )
            // InternalDbDSL.g:412:2: rule__Table__Group__0__Impl rule__Table__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Table__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Table__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__0"


    // $ANTLR start "rule__Table__Group__0__Impl"
    // InternalDbDSL.g:419:1: rule__Table__Group__0__Impl : ( 'table' ) ;
    public final void rule__Table__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbDSL.g:423:1: ( ( 'table' ) )
            // InternalDbDSL.g:424:1: ( 'table' )
            {
            // InternalDbDSL.g:424:1: ( 'table' )
            // InternalDbDSL.g:425:2: 'table'
            {
             before(grammarAccess.getTableAccess().getTableKeyword_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getTableAccess().getTableKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__0__Impl"


    // $ANTLR start "rule__Table__Group__1"
    // InternalDbDSL.g:434:1: rule__Table__Group__1 : rule__Table__Group__1__Impl rule__Table__Group__2 ;
    public final void rule__Table__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbDSL.g:438:1: ( rule__Table__Group__1__Impl rule__Table__Group__2 )
            // InternalDbDSL.g:439:2: rule__Table__Group__1__Impl rule__Table__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Table__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Table__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__1"


    // $ANTLR start "rule__Table__Group__1__Impl"
    // InternalDbDSL.g:446:1: rule__Table__Group__1__Impl : ( ( rule__Table__NameAssignment_1 ) ) ;
    public final void rule__Table__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbDSL.g:450:1: ( ( ( rule__Table__NameAssignment_1 ) ) )
            // InternalDbDSL.g:451:1: ( ( rule__Table__NameAssignment_1 ) )
            {
            // InternalDbDSL.g:451:1: ( ( rule__Table__NameAssignment_1 ) )
            // InternalDbDSL.g:452:2: ( rule__Table__NameAssignment_1 )
            {
             before(grammarAccess.getTableAccess().getNameAssignment_1()); 
            // InternalDbDSL.g:453:2: ( rule__Table__NameAssignment_1 )
            // InternalDbDSL.g:453:3: rule__Table__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Table__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTableAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__1__Impl"


    // $ANTLR start "rule__Table__Group__2"
    // InternalDbDSL.g:461:1: rule__Table__Group__2 : rule__Table__Group__2__Impl rule__Table__Group__3 ;
    public final void rule__Table__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbDSL.g:465:1: ( rule__Table__Group__2__Impl rule__Table__Group__3 )
            // InternalDbDSL.g:466:2: rule__Table__Group__2__Impl rule__Table__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__Table__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Table__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__2"


    // $ANTLR start "rule__Table__Group__2__Impl"
    // InternalDbDSL.g:473:1: rule__Table__Group__2__Impl : ( ':' ) ;
    public final void rule__Table__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbDSL.g:477:1: ( ( ':' ) )
            // InternalDbDSL.g:478:1: ( ':' )
            {
            // InternalDbDSL.g:478:1: ( ':' )
            // InternalDbDSL.g:479:2: ':'
            {
             before(grammarAccess.getTableAccess().getColonKeyword_2()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getTableAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__2__Impl"


    // $ANTLR start "rule__Table__Group__3"
    // InternalDbDSL.g:488:1: rule__Table__Group__3 : rule__Table__Group__3__Impl ;
    public final void rule__Table__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbDSL.g:492:1: ( rule__Table__Group__3__Impl )
            // InternalDbDSL.g:493:2: rule__Table__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Table__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__3"


    // $ANTLR start "rule__Table__Group__3__Impl"
    // InternalDbDSL.g:499:1: rule__Table__Group__3__Impl : ( ( rule__Table__ColumnsAssignment_3 )* ) ;
    public final void rule__Table__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbDSL.g:503:1: ( ( ( rule__Table__ColumnsAssignment_3 )* ) )
            // InternalDbDSL.g:504:1: ( ( rule__Table__ColumnsAssignment_3 )* )
            {
            // InternalDbDSL.g:504:1: ( ( rule__Table__ColumnsAssignment_3 )* )
            // InternalDbDSL.g:505:2: ( rule__Table__ColumnsAssignment_3 )*
            {
             before(grammarAccess.getTableAccess().getColumnsAssignment_3()); 
            // InternalDbDSL.g:506:2: ( rule__Table__ColumnsAssignment_3 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==18||LA5_0==21) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalDbDSL.g:506:3: rule__Table__ColumnsAssignment_3
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Table__ColumnsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getTableAccess().getColumnsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__3__Impl"


    // $ANTLR start "rule__PrimaryKey__Group__0"
    // InternalDbDSL.g:515:1: rule__PrimaryKey__Group__0 : rule__PrimaryKey__Group__0__Impl rule__PrimaryKey__Group__1 ;
    public final void rule__PrimaryKey__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbDSL.g:519:1: ( rule__PrimaryKey__Group__0__Impl rule__PrimaryKey__Group__1 )
            // InternalDbDSL.g:520:2: rule__PrimaryKey__Group__0__Impl rule__PrimaryKey__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__PrimaryKey__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimaryKey__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryKey__Group__0"


    // $ANTLR start "rule__PrimaryKey__Group__0__Impl"
    // InternalDbDSL.g:527:1: rule__PrimaryKey__Group__0__Impl : ( 'id' ) ;
    public final void rule__PrimaryKey__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbDSL.g:531:1: ( ( 'id' ) )
            // InternalDbDSL.g:532:1: ( 'id' )
            {
            // InternalDbDSL.g:532:1: ( 'id' )
            // InternalDbDSL.g:533:2: 'id'
            {
             before(grammarAccess.getPrimaryKeyAccess().getIdKeyword_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getPrimaryKeyAccess().getIdKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryKey__Group__0__Impl"


    // $ANTLR start "rule__PrimaryKey__Group__1"
    // InternalDbDSL.g:542:1: rule__PrimaryKey__Group__1 : rule__PrimaryKey__Group__1__Impl rule__PrimaryKey__Group__2 ;
    public final void rule__PrimaryKey__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbDSL.g:546:1: ( rule__PrimaryKey__Group__1__Impl rule__PrimaryKey__Group__2 )
            // InternalDbDSL.g:547:2: rule__PrimaryKey__Group__1__Impl rule__PrimaryKey__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__PrimaryKey__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimaryKey__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryKey__Group__1"


    // $ANTLR start "rule__PrimaryKey__Group__1__Impl"
    // InternalDbDSL.g:554:1: rule__PrimaryKey__Group__1__Impl : ( ( rule__PrimaryKey__NameAssignment_1 ) ) ;
    public final void rule__PrimaryKey__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbDSL.g:558:1: ( ( ( rule__PrimaryKey__NameAssignment_1 ) ) )
            // InternalDbDSL.g:559:1: ( ( rule__PrimaryKey__NameAssignment_1 ) )
            {
            // InternalDbDSL.g:559:1: ( ( rule__PrimaryKey__NameAssignment_1 ) )
            // InternalDbDSL.g:560:2: ( rule__PrimaryKey__NameAssignment_1 )
            {
             before(grammarAccess.getPrimaryKeyAccess().getNameAssignment_1()); 
            // InternalDbDSL.g:561:2: ( rule__PrimaryKey__NameAssignment_1 )
            // InternalDbDSL.g:561:3: rule__PrimaryKey__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__PrimaryKey__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryKeyAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryKey__Group__1__Impl"


    // $ANTLR start "rule__PrimaryKey__Group__2"
    // InternalDbDSL.g:569:1: rule__PrimaryKey__Group__2 : rule__PrimaryKey__Group__2__Impl rule__PrimaryKey__Group__3 ;
    public final void rule__PrimaryKey__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbDSL.g:573:1: ( rule__PrimaryKey__Group__2__Impl rule__PrimaryKey__Group__3 )
            // InternalDbDSL.g:574:2: rule__PrimaryKey__Group__2__Impl rule__PrimaryKey__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__PrimaryKey__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimaryKey__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryKey__Group__2"


    // $ANTLR start "rule__PrimaryKey__Group__2__Impl"
    // InternalDbDSL.g:581:1: rule__PrimaryKey__Group__2__Impl : ( '-' ) ;
    public final void rule__PrimaryKey__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbDSL.g:585:1: ( ( '-' ) )
            // InternalDbDSL.g:586:1: ( '-' )
            {
            // InternalDbDSL.g:586:1: ( '-' )
            // InternalDbDSL.g:587:2: '-'
            {
             before(grammarAccess.getPrimaryKeyAccess().getHyphenMinusKeyword_2()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getPrimaryKeyAccess().getHyphenMinusKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryKey__Group__2__Impl"


    // $ANTLR start "rule__PrimaryKey__Group__3"
    // InternalDbDSL.g:596:1: rule__PrimaryKey__Group__3 : rule__PrimaryKey__Group__3__Impl rule__PrimaryKey__Group__4 ;
    public final void rule__PrimaryKey__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbDSL.g:600:1: ( rule__PrimaryKey__Group__3__Impl rule__PrimaryKey__Group__4 )
            // InternalDbDSL.g:601:2: rule__PrimaryKey__Group__3__Impl rule__PrimaryKey__Group__4
            {
            pushFollow(FOLLOW_12);
            rule__PrimaryKey__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimaryKey__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryKey__Group__3"


    // $ANTLR start "rule__PrimaryKey__Group__3__Impl"
    // InternalDbDSL.g:608:1: rule__PrimaryKey__Group__3__Impl : ( ( rule__PrimaryKey__TypeAssignment_3 ) ) ;
    public final void rule__PrimaryKey__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbDSL.g:612:1: ( ( ( rule__PrimaryKey__TypeAssignment_3 ) ) )
            // InternalDbDSL.g:613:1: ( ( rule__PrimaryKey__TypeAssignment_3 ) )
            {
            // InternalDbDSL.g:613:1: ( ( rule__PrimaryKey__TypeAssignment_3 ) )
            // InternalDbDSL.g:614:2: ( rule__PrimaryKey__TypeAssignment_3 )
            {
             before(grammarAccess.getPrimaryKeyAccess().getTypeAssignment_3()); 
            // InternalDbDSL.g:615:2: ( rule__PrimaryKey__TypeAssignment_3 )
            // InternalDbDSL.g:615:3: rule__PrimaryKey__TypeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__PrimaryKey__TypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryKeyAccess().getTypeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryKey__Group__3__Impl"


    // $ANTLR start "rule__PrimaryKey__Group__4"
    // InternalDbDSL.g:623:1: rule__PrimaryKey__Group__4 : rule__PrimaryKey__Group__4__Impl ;
    public final void rule__PrimaryKey__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbDSL.g:627:1: ( rule__PrimaryKey__Group__4__Impl )
            // InternalDbDSL.g:628:2: rule__PrimaryKey__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PrimaryKey__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryKey__Group__4"


    // $ANTLR start "rule__PrimaryKey__Group__4__Impl"
    // InternalDbDSL.g:634:1: rule__PrimaryKey__Group__4__Impl : ( ( rule__PrimaryKey__Group_4__0 )? ) ;
    public final void rule__PrimaryKey__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbDSL.g:638:1: ( ( ( rule__PrimaryKey__Group_4__0 )? ) )
            // InternalDbDSL.g:639:1: ( ( rule__PrimaryKey__Group_4__0 )? )
            {
            // InternalDbDSL.g:639:1: ( ( rule__PrimaryKey__Group_4__0 )? )
            // InternalDbDSL.g:640:2: ( rule__PrimaryKey__Group_4__0 )?
            {
             before(grammarAccess.getPrimaryKeyAccess().getGroup_4()); 
            // InternalDbDSL.g:641:2: ( rule__PrimaryKey__Group_4__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==20) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalDbDSL.g:641:3: rule__PrimaryKey__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PrimaryKey__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPrimaryKeyAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryKey__Group__4__Impl"


    // $ANTLR start "rule__PrimaryKey__Group_4__0"
    // InternalDbDSL.g:650:1: rule__PrimaryKey__Group_4__0 : rule__PrimaryKey__Group_4__0__Impl rule__PrimaryKey__Group_4__1 ;
    public final void rule__PrimaryKey__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbDSL.g:654:1: ( rule__PrimaryKey__Group_4__0__Impl rule__PrimaryKey__Group_4__1 )
            // InternalDbDSL.g:655:2: rule__PrimaryKey__Group_4__0__Impl rule__PrimaryKey__Group_4__1
            {
            pushFollow(FOLLOW_11);
            rule__PrimaryKey__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimaryKey__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryKey__Group_4__0"


    // $ANTLR start "rule__PrimaryKey__Group_4__0__Impl"
    // InternalDbDSL.g:662:1: rule__PrimaryKey__Group_4__0__Impl : ( '=>' ) ;
    public final void rule__PrimaryKey__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbDSL.g:666:1: ( ( '=>' ) )
            // InternalDbDSL.g:667:1: ( '=>' )
            {
            // InternalDbDSL.g:667:1: ( '=>' )
            // InternalDbDSL.g:668:2: '=>'
            {
             before(grammarAccess.getPrimaryKeyAccess().getEqualsSignGreaterThanSignKeyword_4_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getPrimaryKeyAccess().getEqualsSignGreaterThanSignKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryKey__Group_4__0__Impl"


    // $ANTLR start "rule__PrimaryKey__Group_4__1"
    // InternalDbDSL.g:677:1: rule__PrimaryKey__Group_4__1 : rule__PrimaryKey__Group_4__1__Impl ;
    public final void rule__PrimaryKey__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbDSL.g:681:1: ( rule__PrimaryKey__Group_4__1__Impl )
            // InternalDbDSL.g:682:2: rule__PrimaryKey__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PrimaryKey__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryKey__Group_4__1"


    // $ANTLR start "rule__PrimaryKey__Group_4__1__Impl"
    // InternalDbDSL.g:688:1: rule__PrimaryKey__Group_4__1__Impl : ( ( rule__PrimaryKey__AutoIncrementAssignment_4_1 ) ) ;
    public final void rule__PrimaryKey__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbDSL.g:692:1: ( ( ( rule__PrimaryKey__AutoIncrementAssignment_4_1 ) ) )
            // InternalDbDSL.g:693:1: ( ( rule__PrimaryKey__AutoIncrementAssignment_4_1 ) )
            {
            // InternalDbDSL.g:693:1: ( ( rule__PrimaryKey__AutoIncrementAssignment_4_1 ) )
            // InternalDbDSL.g:694:2: ( rule__PrimaryKey__AutoIncrementAssignment_4_1 )
            {
             before(grammarAccess.getPrimaryKeyAccess().getAutoIncrementAssignment_4_1()); 
            // InternalDbDSL.g:695:2: ( rule__PrimaryKey__AutoIncrementAssignment_4_1 )
            // InternalDbDSL.g:695:3: rule__PrimaryKey__AutoIncrementAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__PrimaryKey__AutoIncrementAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryKeyAccess().getAutoIncrementAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryKey__Group_4__1__Impl"


    // $ANTLR start "rule__Column__Group__0"
    // InternalDbDSL.g:704:1: rule__Column__Group__0 : rule__Column__Group__0__Impl rule__Column__Group__1 ;
    public final void rule__Column__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbDSL.g:708:1: ( rule__Column__Group__0__Impl rule__Column__Group__1 )
            // InternalDbDSL.g:709:2: rule__Column__Group__0__Impl rule__Column__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Column__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Column__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group__0"


    // $ANTLR start "rule__Column__Group__0__Impl"
    // InternalDbDSL.g:716:1: rule__Column__Group__0__Impl : ( 'column' ) ;
    public final void rule__Column__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbDSL.g:720:1: ( ( 'column' ) )
            // InternalDbDSL.g:721:1: ( 'column' )
            {
            // InternalDbDSL.g:721:1: ( 'column' )
            // InternalDbDSL.g:722:2: 'column'
            {
             before(grammarAccess.getColumnAccess().getColumnKeyword_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getColumnAccess().getColumnKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group__0__Impl"


    // $ANTLR start "rule__Column__Group__1"
    // InternalDbDSL.g:731:1: rule__Column__Group__1 : rule__Column__Group__1__Impl rule__Column__Group__2 ;
    public final void rule__Column__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbDSL.g:735:1: ( rule__Column__Group__1__Impl rule__Column__Group__2 )
            // InternalDbDSL.g:736:2: rule__Column__Group__1__Impl rule__Column__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__Column__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Column__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group__1"


    // $ANTLR start "rule__Column__Group__1__Impl"
    // InternalDbDSL.g:743:1: rule__Column__Group__1__Impl : ( ( rule__Column__NameAssignment_1 ) ) ;
    public final void rule__Column__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbDSL.g:747:1: ( ( ( rule__Column__NameAssignment_1 ) ) )
            // InternalDbDSL.g:748:1: ( ( rule__Column__NameAssignment_1 ) )
            {
            // InternalDbDSL.g:748:1: ( ( rule__Column__NameAssignment_1 ) )
            // InternalDbDSL.g:749:2: ( rule__Column__NameAssignment_1 )
            {
             before(grammarAccess.getColumnAccess().getNameAssignment_1()); 
            // InternalDbDSL.g:750:2: ( rule__Column__NameAssignment_1 )
            // InternalDbDSL.g:750:3: rule__Column__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Column__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getColumnAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group__1__Impl"


    // $ANTLR start "rule__Column__Group__2"
    // InternalDbDSL.g:758:1: rule__Column__Group__2 : rule__Column__Group__2__Impl rule__Column__Group__3 ;
    public final void rule__Column__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbDSL.g:762:1: ( rule__Column__Group__2__Impl rule__Column__Group__3 )
            // InternalDbDSL.g:763:2: rule__Column__Group__2__Impl rule__Column__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__Column__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Column__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group__2"


    // $ANTLR start "rule__Column__Group__2__Impl"
    // InternalDbDSL.g:770:1: rule__Column__Group__2__Impl : ( '-' ) ;
    public final void rule__Column__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbDSL.g:774:1: ( ( '-' ) )
            // InternalDbDSL.g:775:1: ( '-' )
            {
            // InternalDbDSL.g:775:1: ( '-' )
            // InternalDbDSL.g:776:2: '-'
            {
             before(grammarAccess.getColumnAccess().getHyphenMinusKeyword_2()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getColumnAccess().getHyphenMinusKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group__2__Impl"


    // $ANTLR start "rule__Column__Group__3"
    // InternalDbDSL.g:785:1: rule__Column__Group__3 : rule__Column__Group__3__Impl rule__Column__Group__4 ;
    public final void rule__Column__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbDSL.g:789:1: ( rule__Column__Group__3__Impl rule__Column__Group__4 )
            // InternalDbDSL.g:790:2: rule__Column__Group__3__Impl rule__Column__Group__4
            {
            pushFollow(FOLLOW_13);
            rule__Column__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Column__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group__3"


    // $ANTLR start "rule__Column__Group__3__Impl"
    // InternalDbDSL.g:797:1: rule__Column__Group__3__Impl : ( ( rule__Column__TypeAssignment_3 ) ) ;
    public final void rule__Column__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbDSL.g:801:1: ( ( ( rule__Column__TypeAssignment_3 ) ) )
            // InternalDbDSL.g:802:1: ( ( rule__Column__TypeAssignment_3 ) )
            {
            // InternalDbDSL.g:802:1: ( ( rule__Column__TypeAssignment_3 ) )
            // InternalDbDSL.g:803:2: ( rule__Column__TypeAssignment_3 )
            {
             before(grammarAccess.getColumnAccess().getTypeAssignment_3()); 
            // InternalDbDSL.g:804:2: ( rule__Column__TypeAssignment_3 )
            // InternalDbDSL.g:804:3: rule__Column__TypeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Column__TypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getColumnAccess().getTypeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group__3__Impl"


    // $ANTLR start "rule__Column__Group__4"
    // InternalDbDSL.g:812:1: rule__Column__Group__4 : rule__Column__Group__4__Impl ;
    public final void rule__Column__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbDSL.g:816:1: ( rule__Column__Group__4__Impl )
            // InternalDbDSL.g:817:2: rule__Column__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Column__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group__4"


    // $ANTLR start "rule__Column__Group__4__Impl"
    // InternalDbDSL.g:823:1: rule__Column__Group__4__Impl : ( ( rule__Column__Group_4__0 )? ) ;
    public final void rule__Column__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbDSL.g:827:1: ( ( ( rule__Column__Group_4__0 )? ) )
            // InternalDbDSL.g:828:1: ( ( rule__Column__Group_4__0 )? )
            {
            // InternalDbDSL.g:828:1: ( ( rule__Column__Group_4__0 )? )
            // InternalDbDSL.g:829:2: ( rule__Column__Group_4__0 )?
            {
             before(grammarAccess.getColumnAccess().getGroup_4()); 
            // InternalDbDSL.g:830:2: ( rule__Column__Group_4__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==22) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalDbDSL.g:830:3: rule__Column__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Column__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getColumnAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group__4__Impl"


    // $ANTLR start "rule__Column__Group_4__0"
    // InternalDbDSL.g:839:1: rule__Column__Group_4__0 : rule__Column__Group_4__0__Impl rule__Column__Group_4__1 ;
    public final void rule__Column__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbDSL.g:843:1: ( rule__Column__Group_4__0__Impl rule__Column__Group_4__1 )
            // InternalDbDSL.g:844:2: rule__Column__Group_4__0__Impl rule__Column__Group_4__1
            {
            pushFollow(FOLLOW_3);
            rule__Column__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Column__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group_4__0"


    // $ANTLR start "rule__Column__Group_4__0__Impl"
    // InternalDbDSL.g:851:1: rule__Column__Group_4__0__Impl : ( 'f(' ) ;
    public final void rule__Column__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbDSL.g:855:1: ( ( 'f(' ) )
            // InternalDbDSL.g:856:1: ( 'f(' )
            {
            // InternalDbDSL.g:856:1: ( 'f(' )
            // InternalDbDSL.g:857:2: 'f('
            {
             before(grammarAccess.getColumnAccess().getFKeyword_4_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getColumnAccess().getFKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group_4__0__Impl"


    // $ANTLR start "rule__Column__Group_4__1"
    // InternalDbDSL.g:866:1: rule__Column__Group_4__1 : rule__Column__Group_4__1__Impl rule__Column__Group_4__2 ;
    public final void rule__Column__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbDSL.g:870:1: ( rule__Column__Group_4__1__Impl rule__Column__Group_4__2 )
            // InternalDbDSL.g:871:2: rule__Column__Group_4__1__Impl rule__Column__Group_4__2
            {
            pushFollow(FOLLOW_12);
            rule__Column__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Column__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group_4__1"


    // $ANTLR start "rule__Column__Group_4__1__Impl"
    // InternalDbDSL.g:878:1: rule__Column__Group_4__1__Impl : ( ( rule__Column__SourceTableAssignment_4_1 ) ) ;
    public final void rule__Column__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbDSL.g:882:1: ( ( ( rule__Column__SourceTableAssignment_4_1 ) ) )
            // InternalDbDSL.g:883:1: ( ( rule__Column__SourceTableAssignment_4_1 ) )
            {
            // InternalDbDSL.g:883:1: ( ( rule__Column__SourceTableAssignment_4_1 ) )
            // InternalDbDSL.g:884:2: ( rule__Column__SourceTableAssignment_4_1 )
            {
             before(grammarAccess.getColumnAccess().getSourceTableAssignment_4_1()); 
            // InternalDbDSL.g:885:2: ( rule__Column__SourceTableAssignment_4_1 )
            // InternalDbDSL.g:885:3: rule__Column__SourceTableAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Column__SourceTableAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getColumnAccess().getSourceTableAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group_4__1__Impl"


    // $ANTLR start "rule__Column__Group_4__2"
    // InternalDbDSL.g:893:1: rule__Column__Group_4__2 : rule__Column__Group_4__2__Impl rule__Column__Group_4__3 ;
    public final void rule__Column__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbDSL.g:897:1: ( rule__Column__Group_4__2__Impl rule__Column__Group_4__3 )
            // InternalDbDSL.g:898:2: rule__Column__Group_4__2__Impl rule__Column__Group_4__3
            {
            pushFollow(FOLLOW_14);
            rule__Column__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Column__Group_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group_4__2"


    // $ANTLR start "rule__Column__Group_4__2__Impl"
    // InternalDbDSL.g:905:1: rule__Column__Group_4__2__Impl : ( '=>' ) ;
    public final void rule__Column__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbDSL.g:909:1: ( ( '=>' ) )
            // InternalDbDSL.g:910:1: ( '=>' )
            {
            // InternalDbDSL.g:910:1: ( '=>' )
            // InternalDbDSL.g:911:2: '=>'
            {
             before(grammarAccess.getColumnAccess().getEqualsSignGreaterThanSignKeyword_4_2()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getColumnAccess().getEqualsSignGreaterThanSignKeyword_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group_4__2__Impl"


    // $ANTLR start "rule__Column__Group_4__3"
    // InternalDbDSL.g:920:1: rule__Column__Group_4__3 : rule__Column__Group_4__3__Impl rule__Column__Group_4__4 ;
    public final void rule__Column__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbDSL.g:924:1: ( rule__Column__Group_4__3__Impl rule__Column__Group_4__4 )
            // InternalDbDSL.g:925:2: rule__Column__Group_4__3__Impl rule__Column__Group_4__4
            {
            pushFollow(FOLLOW_15);
            rule__Column__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Column__Group_4__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group_4__3"


    // $ANTLR start "rule__Column__Group_4__3__Impl"
    // InternalDbDSL.g:932:1: rule__Column__Group_4__3__Impl : ( ( rule__Column__FkeyAssignment_4_3 ) ) ;
    public final void rule__Column__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbDSL.g:936:1: ( ( ( rule__Column__FkeyAssignment_4_3 ) ) )
            // InternalDbDSL.g:937:1: ( ( rule__Column__FkeyAssignment_4_3 ) )
            {
            // InternalDbDSL.g:937:1: ( ( rule__Column__FkeyAssignment_4_3 ) )
            // InternalDbDSL.g:938:2: ( rule__Column__FkeyAssignment_4_3 )
            {
             before(grammarAccess.getColumnAccess().getFkeyAssignment_4_3()); 
            // InternalDbDSL.g:939:2: ( rule__Column__FkeyAssignment_4_3 )
            // InternalDbDSL.g:939:3: rule__Column__FkeyAssignment_4_3
            {
            pushFollow(FOLLOW_2);
            rule__Column__FkeyAssignment_4_3();

            state._fsp--;


            }

             after(grammarAccess.getColumnAccess().getFkeyAssignment_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group_4__3__Impl"


    // $ANTLR start "rule__Column__Group_4__4"
    // InternalDbDSL.g:947:1: rule__Column__Group_4__4 : rule__Column__Group_4__4__Impl ;
    public final void rule__Column__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbDSL.g:951:1: ( rule__Column__Group_4__4__Impl )
            // InternalDbDSL.g:952:2: rule__Column__Group_4__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Column__Group_4__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group_4__4"


    // $ANTLR start "rule__Column__Group_4__4__Impl"
    // InternalDbDSL.g:958:1: rule__Column__Group_4__4__Impl : ( ')' ) ;
    public final void rule__Column__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbDSL.g:962:1: ( ( ')' ) )
            // InternalDbDSL.g:963:1: ( ')' )
            {
            // InternalDbDSL.g:963:1: ( ')' )
            // InternalDbDSL.g:964:2: ')'
            {
             before(grammarAccess.getColumnAccess().getRightParenthesisKeyword_4_4()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getColumnAccess().getRightParenthesisKeyword_4_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group_4__4__Impl"


    // $ANTLR start "rule__Insert__Group__0"
    // InternalDbDSL.g:974:1: rule__Insert__Group__0 : rule__Insert__Group__0__Impl rule__Insert__Group__1 ;
    public final void rule__Insert__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbDSL.g:978:1: ( rule__Insert__Group__0__Impl rule__Insert__Group__1 )
            // InternalDbDSL.g:979:2: rule__Insert__Group__0__Impl rule__Insert__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Insert__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Insert__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Insert__Group__0"


    // $ANTLR start "rule__Insert__Group__0__Impl"
    // InternalDbDSL.g:986:1: rule__Insert__Group__0__Impl : ( 'add' ) ;
    public final void rule__Insert__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbDSL.g:990:1: ( ( 'add' ) )
            // InternalDbDSL.g:991:1: ( 'add' )
            {
            // InternalDbDSL.g:991:1: ( 'add' )
            // InternalDbDSL.g:992:2: 'add'
            {
             before(grammarAccess.getInsertAccess().getAddKeyword_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getInsertAccess().getAddKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Insert__Group__0__Impl"


    // $ANTLR start "rule__Insert__Group__1"
    // InternalDbDSL.g:1001:1: rule__Insert__Group__1 : rule__Insert__Group__1__Impl rule__Insert__Group__2 ;
    public final void rule__Insert__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbDSL.g:1005:1: ( rule__Insert__Group__1__Impl rule__Insert__Group__2 )
            // InternalDbDSL.g:1006:2: rule__Insert__Group__1__Impl rule__Insert__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__Insert__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Insert__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Insert__Group__1"


    // $ANTLR start "rule__Insert__Group__1__Impl"
    // InternalDbDSL.g:1013:1: rule__Insert__Group__1__Impl : ( ( rule__Insert__TableAssignment_1 ) ) ;
    public final void rule__Insert__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbDSL.g:1017:1: ( ( ( rule__Insert__TableAssignment_1 ) ) )
            // InternalDbDSL.g:1018:1: ( ( rule__Insert__TableAssignment_1 ) )
            {
            // InternalDbDSL.g:1018:1: ( ( rule__Insert__TableAssignment_1 ) )
            // InternalDbDSL.g:1019:2: ( rule__Insert__TableAssignment_1 )
            {
             before(grammarAccess.getInsertAccess().getTableAssignment_1()); 
            // InternalDbDSL.g:1020:2: ( rule__Insert__TableAssignment_1 )
            // InternalDbDSL.g:1020:3: rule__Insert__TableAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Insert__TableAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getInsertAccess().getTableAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Insert__Group__1__Impl"


    // $ANTLR start "rule__Insert__Group__2"
    // InternalDbDSL.g:1028:1: rule__Insert__Group__2 : rule__Insert__Group__2__Impl rule__Insert__Group__3 ;
    public final void rule__Insert__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbDSL.g:1032:1: ( rule__Insert__Group__2__Impl rule__Insert__Group__3 )
            // InternalDbDSL.g:1033:2: rule__Insert__Group__2__Impl rule__Insert__Group__3
            {
            pushFollow(FOLLOW_17);
            rule__Insert__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Insert__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Insert__Group__2"


    // $ANTLR start "rule__Insert__Group__2__Impl"
    // InternalDbDSL.g:1040:1: rule__Insert__Group__2__Impl : ( '(' ) ;
    public final void rule__Insert__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbDSL.g:1044:1: ( ( '(' ) )
            // InternalDbDSL.g:1045:1: ( '(' )
            {
            // InternalDbDSL.g:1045:1: ( '(' )
            // InternalDbDSL.g:1046:2: '('
            {
             before(grammarAccess.getInsertAccess().getLeftParenthesisKeyword_2()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getInsertAccess().getLeftParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Insert__Group__2__Impl"


    // $ANTLR start "rule__Insert__Group__3"
    // InternalDbDSL.g:1055:1: rule__Insert__Group__3 : rule__Insert__Group__3__Impl rule__Insert__Group__4 ;
    public final void rule__Insert__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbDSL.g:1059:1: ( rule__Insert__Group__3__Impl rule__Insert__Group__4 )
            // InternalDbDSL.g:1060:2: rule__Insert__Group__3__Impl rule__Insert__Group__4
            {
            pushFollow(FOLLOW_17);
            rule__Insert__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Insert__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Insert__Group__3"


    // $ANTLR start "rule__Insert__Group__3__Impl"
    // InternalDbDSL.g:1067:1: rule__Insert__Group__3__Impl : ( ( rule__Insert__VarAssignment_3 )* ) ;
    public final void rule__Insert__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbDSL.g:1071:1: ( ( ( rule__Insert__VarAssignment_3 )* ) )
            // InternalDbDSL.g:1072:1: ( ( rule__Insert__VarAssignment_3 )* )
            {
            // InternalDbDSL.g:1072:1: ( ( rule__Insert__VarAssignment_3 )* )
            // InternalDbDSL.g:1073:2: ( rule__Insert__VarAssignment_3 )*
            {
             before(grammarAccess.getInsertAccess().getVarAssignment_3()); 
            // InternalDbDSL.g:1074:2: ( rule__Insert__VarAssignment_3 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_STRING) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalDbDSL.g:1074:3: rule__Insert__VarAssignment_3
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__Insert__VarAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getInsertAccess().getVarAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Insert__Group__3__Impl"


    // $ANTLR start "rule__Insert__Group__4"
    // InternalDbDSL.g:1082:1: rule__Insert__Group__4 : rule__Insert__Group__4__Impl rule__Insert__Group__5 ;
    public final void rule__Insert__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbDSL.g:1086:1: ( rule__Insert__Group__4__Impl rule__Insert__Group__5 )
            // InternalDbDSL.g:1087:2: rule__Insert__Group__4__Impl rule__Insert__Group__5
            {
            pushFollow(FOLLOW_17);
            rule__Insert__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Insert__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Insert__Group__4"


    // $ANTLR start "rule__Insert__Group__4__Impl"
    // InternalDbDSL.g:1094:1: rule__Insert__Group__4__Impl : ( ( rule__Insert__Group_4__0 )* ) ;
    public final void rule__Insert__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbDSL.g:1098:1: ( ( ( rule__Insert__Group_4__0 )* ) )
            // InternalDbDSL.g:1099:1: ( ( rule__Insert__Group_4__0 )* )
            {
            // InternalDbDSL.g:1099:1: ( ( rule__Insert__Group_4__0 )* )
            // InternalDbDSL.g:1100:2: ( rule__Insert__Group_4__0 )*
            {
             before(grammarAccess.getInsertAccess().getGroup_4()); 
            // InternalDbDSL.g:1101:2: ( rule__Insert__Group_4__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==27) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalDbDSL.g:1101:3: rule__Insert__Group_4__0
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__Insert__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getInsertAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Insert__Group__4__Impl"


    // $ANTLR start "rule__Insert__Group__5"
    // InternalDbDSL.g:1109:1: rule__Insert__Group__5 : rule__Insert__Group__5__Impl ;
    public final void rule__Insert__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbDSL.g:1113:1: ( rule__Insert__Group__5__Impl )
            // InternalDbDSL.g:1114:2: rule__Insert__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Insert__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Insert__Group__5"


    // $ANTLR start "rule__Insert__Group__5__Impl"
    // InternalDbDSL.g:1120:1: rule__Insert__Group__5__Impl : ( ');' ) ;
    public final void rule__Insert__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbDSL.g:1124:1: ( ( ');' ) )
            // InternalDbDSL.g:1125:1: ( ');' )
            {
            // InternalDbDSL.g:1125:1: ( ');' )
            // InternalDbDSL.g:1126:2: ');'
            {
             before(grammarAccess.getInsertAccess().getRightParenthesisSemicolonKeyword_5()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getInsertAccess().getRightParenthesisSemicolonKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Insert__Group__5__Impl"


    // $ANTLR start "rule__Insert__Group_4__0"
    // InternalDbDSL.g:1136:1: rule__Insert__Group_4__0 : rule__Insert__Group_4__0__Impl rule__Insert__Group_4__1 ;
    public final void rule__Insert__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbDSL.g:1140:1: ( rule__Insert__Group_4__0__Impl rule__Insert__Group_4__1 )
            // InternalDbDSL.g:1141:2: rule__Insert__Group_4__0__Impl rule__Insert__Group_4__1
            {
            pushFollow(FOLLOW_14);
            rule__Insert__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Insert__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Insert__Group_4__0"


    // $ANTLR start "rule__Insert__Group_4__0__Impl"
    // InternalDbDSL.g:1148:1: rule__Insert__Group_4__0__Impl : ( ',' ) ;
    public final void rule__Insert__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbDSL.g:1152:1: ( ( ',' ) )
            // InternalDbDSL.g:1153:1: ( ',' )
            {
            // InternalDbDSL.g:1153:1: ( ',' )
            // InternalDbDSL.g:1154:2: ','
            {
             before(grammarAccess.getInsertAccess().getCommaKeyword_4_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getInsertAccess().getCommaKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Insert__Group_4__0__Impl"


    // $ANTLR start "rule__Insert__Group_4__1"
    // InternalDbDSL.g:1163:1: rule__Insert__Group_4__1 : rule__Insert__Group_4__1__Impl ;
    public final void rule__Insert__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbDSL.g:1167:1: ( rule__Insert__Group_4__1__Impl )
            // InternalDbDSL.g:1168:2: rule__Insert__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Insert__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Insert__Group_4__1"


    // $ANTLR start "rule__Insert__Group_4__1__Impl"
    // InternalDbDSL.g:1174:1: rule__Insert__Group_4__1__Impl : ( ( rule__Insert__VarAssignment_4_1 ) ) ;
    public final void rule__Insert__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbDSL.g:1178:1: ( ( ( rule__Insert__VarAssignment_4_1 ) ) )
            // InternalDbDSL.g:1179:1: ( ( rule__Insert__VarAssignment_4_1 ) )
            {
            // InternalDbDSL.g:1179:1: ( ( rule__Insert__VarAssignment_4_1 ) )
            // InternalDbDSL.g:1180:2: ( rule__Insert__VarAssignment_4_1 )
            {
             before(grammarAccess.getInsertAccess().getVarAssignment_4_1()); 
            // InternalDbDSL.g:1181:2: ( rule__Insert__VarAssignment_4_1 )
            // InternalDbDSL.g:1181:3: rule__Insert__VarAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Insert__VarAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getInsertAccess().getVarAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Insert__Group_4__1__Impl"


    // $ANTLR start "rule__Database__NameAssignment_1"
    // InternalDbDSL.g:1190:1: rule__Database__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Database__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbDSL.g:1194:1: ( ( RULE_ID ) )
            // InternalDbDSL.g:1195:2: ( RULE_ID )
            {
            // InternalDbDSL.g:1195:2: ( RULE_ID )
            // InternalDbDSL.g:1196:3: RULE_ID
            {
             before(grammarAccess.getDatabaseAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDatabaseAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Database__NameAssignment_1"


    // $ANTLR start "rule__Database__TablesAssignment_3"
    // InternalDbDSL.g:1205:1: rule__Database__TablesAssignment_3 : ( ruleTable ) ;
    public final void rule__Database__TablesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbDSL.g:1209:1: ( ( ruleTable ) )
            // InternalDbDSL.g:1210:2: ( ruleTable )
            {
            // InternalDbDSL.g:1210:2: ( ruleTable )
            // InternalDbDSL.g:1211:3: ruleTable
            {
             before(grammarAccess.getDatabaseAccess().getTablesTableParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleTable();

            state._fsp--;

             after(grammarAccess.getDatabaseAccess().getTablesTableParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Database__TablesAssignment_3"


    // $ANTLR start "rule__Database__InsertsAssignment_4"
    // InternalDbDSL.g:1220:1: rule__Database__InsertsAssignment_4 : ( ruleInsert ) ;
    public final void rule__Database__InsertsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbDSL.g:1224:1: ( ( ruleInsert ) )
            // InternalDbDSL.g:1225:2: ( ruleInsert )
            {
            // InternalDbDSL.g:1225:2: ( ruleInsert )
            // InternalDbDSL.g:1226:3: ruleInsert
            {
             before(grammarAccess.getDatabaseAccess().getInsertsInsertParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleInsert();

            state._fsp--;

             after(grammarAccess.getDatabaseAccess().getInsertsInsertParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Database__InsertsAssignment_4"


    // $ANTLR start "rule__Table__NameAssignment_1"
    // InternalDbDSL.g:1235:1: rule__Table__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Table__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbDSL.g:1239:1: ( ( RULE_ID ) )
            // InternalDbDSL.g:1240:2: ( RULE_ID )
            {
            // InternalDbDSL.g:1240:2: ( RULE_ID )
            // InternalDbDSL.g:1241:3: RULE_ID
            {
             before(grammarAccess.getTableAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTableAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__NameAssignment_1"


    // $ANTLR start "rule__Table__ColumnsAssignment_3"
    // InternalDbDSL.g:1250:1: rule__Table__ColumnsAssignment_3 : ( ruleAbstractType ) ;
    public final void rule__Table__ColumnsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbDSL.g:1254:1: ( ( ruleAbstractType ) )
            // InternalDbDSL.g:1255:2: ( ruleAbstractType )
            {
            // InternalDbDSL.g:1255:2: ( ruleAbstractType )
            // InternalDbDSL.g:1256:3: ruleAbstractType
            {
             before(grammarAccess.getTableAccess().getColumnsAbstractTypeParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleAbstractType();

            state._fsp--;

             after(grammarAccess.getTableAccess().getColumnsAbstractTypeParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__ColumnsAssignment_3"


    // $ANTLR start "rule__PrimaryKey__NameAssignment_1"
    // InternalDbDSL.g:1265:1: rule__PrimaryKey__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__PrimaryKey__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbDSL.g:1269:1: ( ( RULE_ID ) )
            // InternalDbDSL.g:1270:2: ( RULE_ID )
            {
            // InternalDbDSL.g:1270:2: ( RULE_ID )
            // InternalDbDSL.g:1271:3: RULE_ID
            {
             before(grammarAccess.getPrimaryKeyAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPrimaryKeyAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryKey__NameAssignment_1"


    // $ANTLR start "rule__PrimaryKey__TypeAssignment_3"
    // InternalDbDSL.g:1280:1: rule__PrimaryKey__TypeAssignment_3 : ( ruleType ) ;
    public final void rule__PrimaryKey__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbDSL.g:1284:1: ( ( ruleType ) )
            // InternalDbDSL.g:1285:2: ( ruleType )
            {
            // InternalDbDSL.g:1285:2: ( ruleType )
            // InternalDbDSL.g:1286:3: ruleType
            {
             before(grammarAccess.getPrimaryKeyAccess().getTypeTypeEnumRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getPrimaryKeyAccess().getTypeTypeEnumRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryKey__TypeAssignment_3"


    // $ANTLR start "rule__PrimaryKey__AutoIncrementAssignment_4_1"
    // InternalDbDSL.g:1295:1: rule__PrimaryKey__AutoIncrementAssignment_4_1 : ( ruleType ) ;
    public final void rule__PrimaryKey__AutoIncrementAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbDSL.g:1299:1: ( ( ruleType ) )
            // InternalDbDSL.g:1300:2: ( ruleType )
            {
            // InternalDbDSL.g:1300:2: ( ruleType )
            // InternalDbDSL.g:1301:3: ruleType
            {
             before(grammarAccess.getPrimaryKeyAccess().getAutoIncrementTypeEnumRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getPrimaryKeyAccess().getAutoIncrementTypeEnumRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryKey__AutoIncrementAssignment_4_1"


    // $ANTLR start "rule__Column__NameAssignment_1"
    // InternalDbDSL.g:1310:1: rule__Column__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Column__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbDSL.g:1314:1: ( ( RULE_ID ) )
            // InternalDbDSL.g:1315:2: ( RULE_ID )
            {
            // InternalDbDSL.g:1315:2: ( RULE_ID )
            // InternalDbDSL.g:1316:3: RULE_ID
            {
             before(grammarAccess.getColumnAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getColumnAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__NameAssignment_1"


    // $ANTLR start "rule__Column__TypeAssignment_3"
    // InternalDbDSL.g:1325:1: rule__Column__TypeAssignment_3 : ( ruleType ) ;
    public final void rule__Column__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbDSL.g:1329:1: ( ( ruleType ) )
            // InternalDbDSL.g:1330:2: ( ruleType )
            {
            // InternalDbDSL.g:1330:2: ( ruleType )
            // InternalDbDSL.g:1331:3: ruleType
            {
             before(grammarAccess.getColumnAccess().getTypeTypeEnumRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getColumnAccess().getTypeTypeEnumRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__TypeAssignment_3"


    // $ANTLR start "rule__Column__SourceTableAssignment_4_1"
    // InternalDbDSL.g:1340:1: rule__Column__SourceTableAssignment_4_1 : ( ( RULE_ID ) ) ;
    public final void rule__Column__SourceTableAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbDSL.g:1344:1: ( ( ( RULE_ID ) ) )
            // InternalDbDSL.g:1345:2: ( ( RULE_ID ) )
            {
            // InternalDbDSL.g:1345:2: ( ( RULE_ID ) )
            // InternalDbDSL.g:1346:3: ( RULE_ID )
            {
             before(grammarAccess.getColumnAccess().getSourceTableTableCrossReference_4_1_0()); 
            // InternalDbDSL.g:1347:3: ( RULE_ID )
            // InternalDbDSL.g:1348:4: RULE_ID
            {
             before(grammarAccess.getColumnAccess().getSourceTableTableIDTerminalRuleCall_4_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getColumnAccess().getSourceTableTableIDTerminalRuleCall_4_1_0_1()); 

            }

             after(grammarAccess.getColumnAccess().getSourceTableTableCrossReference_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__SourceTableAssignment_4_1"


    // $ANTLR start "rule__Column__FkeyAssignment_4_3"
    // InternalDbDSL.g:1359:1: rule__Column__FkeyAssignment_4_3 : ( RULE_STRING ) ;
    public final void rule__Column__FkeyAssignment_4_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbDSL.g:1363:1: ( ( RULE_STRING ) )
            // InternalDbDSL.g:1364:2: ( RULE_STRING )
            {
            // InternalDbDSL.g:1364:2: ( RULE_STRING )
            // InternalDbDSL.g:1365:3: RULE_STRING
            {
             before(grammarAccess.getColumnAccess().getFkeySTRINGTerminalRuleCall_4_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getColumnAccess().getFkeySTRINGTerminalRuleCall_4_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__FkeyAssignment_4_3"


    // $ANTLR start "rule__Insert__TableAssignment_1"
    // InternalDbDSL.g:1374:1: rule__Insert__TableAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__Insert__TableAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbDSL.g:1378:1: ( ( ( RULE_ID ) ) )
            // InternalDbDSL.g:1379:2: ( ( RULE_ID ) )
            {
            // InternalDbDSL.g:1379:2: ( ( RULE_ID ) )
            // InternalDbDSL.g:1380:3: ( RULE_ID )
            {
             before(grammarAccess.getInsertAccess().getTableTableCrossReference_1_0()); 
            // InternalDbDSL.g:1381:3: ( RULE_ID )
            // InternalDbDSL.g:1382:4: RULE_ID
            {
             before(grammarAccess.getInsertAccess().getTableTableIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getInsertAccess().getTableTableIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getInsertAccess().getTableTableCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Insert__TableAssignment_1"


    // $ANTLR start "rule__Insert__VarAssignment_3"
    // InternalDbDSL.g:1393:1: rule__Insert__VarAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Insert__VarAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbDSL.g:1397:1: ( ( RULE_STRING ) )
            // InternalDbDSL.g:1398:2: ( RULE_STRING )
            {
            // InternalDbDSL.g:1398:2: ( RULE_STRING )
            // InternalDbDSL.g:1399:3: RULE_STRING
            {
             before(grammarAccess.getInsertAccess().getVarSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getInsertAccess().getVarSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Insert__VarAssignment_3"


    // $ANTLR start "rule__Insert__VarAssignment_4_1"
    // InternalDbDSL.g:1408:1: rule__Insert__VarAssignment_4_1 : ( RULE_STRING ) ;
    public final void rule__Insert__VarAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbDSL.g:1412:1: ( ( RULE_STRING ) )
            // InternalDbDSL.g:1413:2: ( RULE_STRING )
            {
            // InternalDbDSL.g:1413:2: ( RULE_STRING )
            // InternalDbDSL.g:1414:3: RULE_STRING
            {
             before(grammarAccess.getInsertAccess().getVarSTRINGTerminalRuleCall_4_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getInsertAccess().getVarSTRINGTerminalRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Insert__VarAssignment_4_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000001020000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000240000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000240002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000007800L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x000000000C000020L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000008000002L});

}