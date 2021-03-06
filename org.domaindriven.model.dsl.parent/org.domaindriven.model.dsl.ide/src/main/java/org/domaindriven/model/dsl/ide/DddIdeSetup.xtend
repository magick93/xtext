/*
 * generated by Xtext 2.17.0.M2
 */
package org.domaindriven.model.dsl.ide

import com.google.inject.Guice
import org.domaindriven.model.dsl.DddRuntimeModule
import org.domaindriven.model.dsl.DddStandaloneSetup
import org.eclipse.xtext.util.Modules2

/**
 * Initialization support for running Xtext languages as language servers.
 */
class DddIdeSetup extends DddStandaloneSetup {

	override createInjector() {
		Guice.createInjector(Modules2.mixin(new DddRuntimeModule, new DddIdeModule))
	}
	
}
