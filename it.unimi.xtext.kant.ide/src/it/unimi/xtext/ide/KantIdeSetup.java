/*
 * generated by Xtext 2.29.0
 */
package it.unimi.xtext.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import it.unimi.xtext.KantRuntimeModule;
import it.unimi.xtext.KantStandaloneSetup;
import org.eclipse.xtext.util.Modules2;

/**
 * Initialization support for running Xtext languages as language servers.
 */
public class KantIdeSetup extends KantStandaloneSetup {

	@Override
	public Injector createInjector() {
		return Guice.createInjector(Modules2.mixin(new KantRuntimeModule(), new KantIdeModule()));
	}
	
}
