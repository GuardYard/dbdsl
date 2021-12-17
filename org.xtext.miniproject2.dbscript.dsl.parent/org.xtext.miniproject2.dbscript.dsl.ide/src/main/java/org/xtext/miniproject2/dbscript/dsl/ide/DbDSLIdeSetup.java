/*
 * generated by Xtext 2.23.0
 */
package org.xtext.miniproject2.dbscript.dsl.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.xtext.util.Modules2;
import org.xtext.miniproject2.dbscript.dsl.DbDSLRuntimeModule;
import org.xtext.miniproject2.dbscript.dsl.DbDSLStandaloneSetup;

/**
 * Initialization support for running Xtext languages as language servers.
 */
public class DbDSLIdeSetup extends DbDSLStandaloneSetup {

	@Override
	public Injector createInjector() {
		return Guice.createInjector(Modules2.mixin(new DbDSLRuntimeModule(), new DbDSLIdeModule()));
	}
	
}
