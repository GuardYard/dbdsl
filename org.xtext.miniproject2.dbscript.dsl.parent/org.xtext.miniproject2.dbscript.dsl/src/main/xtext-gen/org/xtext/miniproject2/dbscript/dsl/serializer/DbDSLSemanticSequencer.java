/*
 * generated by Xtext 2.23.0
 */
package org.xtext.miniproject2.dbscript.dsl.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.xtext.miniproject2.dbscript.dsl.dbDSL.Column;
import org.xtext.miniproject2.dbscript.dsl.dbDSL.Database;
import org.xtext.miniproject2.dbscript.dsl.dbDSL.DbDSLPackage;
import org.xtext.miniproject2.dbscript.dsl.dbDSL.Insert;
import org.xtext.miniproject2.dbscript.dsl.dbDSL.PrimaryKey;
import org.xtext.miniproject2.dbscript.dsl.dbDSL.Table;
import org.xtext.miniproject2.dbscript.dsl.services.DbDSLGrammarAccess;

@SuppressWarnings("all")
public class DbDSLSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private DbDSLGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == DbDSLPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case DbDSLPackage.COLUMN:
				sequence_Column(context, (Column) semanticObject); 
				return; 
			case DbDSLPackage.DATABASE:
				sequence_Database(context, (Database) semanticObject); 
				return; 
			case DbDSLPackage.INSERT:
				sequence_Insert(context, (Insert) semanticObject); 
				return; 
			case DbDSLPackage.PRIMARY_KEY:
				sequence_PrimaryKey(context, (PrimaryKey) semanticObject); 
				return; 
			case DbDSLPackage.TABLE:
				sequence_Table(context, (Table) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     AbstractType returns Column
	 *     Column returns Column
	 *
	 * Constraint:
	 *     (name=ID type=Type (sourceTable=[Table|ID] fkey=STRING)?)
	 */
	protected void sequence_Column(ISerializationContext context, Column semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Database returns Database
	 *
	 * Constraint:
	 *     (name=ID tables+=Table* inserts+=Insert*)
	 */
	protected void sequence_Database(ISerializationContext context, Database semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Insert returns Insert
	 *
	 * Constraint:
	 *     (table=[Table|ID] var+=STRING* var+=STRING*)
	 */
	protected void sequence_Insert(ISerializationContext context, Insert semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     AbstractType returns PrimaryKey
	 *     PrimaryKey returns PrimaryKey
	 *
	 * Constraint:
	 *     (name=ID type=Type autoIncrement=Type?)
	 */
	protected void sequence_PrimaryKey(ISerializationContext context, PrimaryKey semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Table returns Table
	 *
	 * Constraint:
	 *     (name=ID columns+=AbstractType*)
	 */
	protected void sequence_Table(ISerializationContext context, Table semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}