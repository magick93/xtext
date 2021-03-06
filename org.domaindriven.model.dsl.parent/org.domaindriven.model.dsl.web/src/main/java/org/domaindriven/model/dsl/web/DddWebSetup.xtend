/*
 * generated by Xtext 2.17.0.M2
 */
package org.domaindriven.model.dsl.web

import com.google.inject.Guice
import com.google.inject.Injector
import org.domaindriven.model.dsl.DddRuntimeModule
import org.domaindriven.model.dsl.DddStandaloneSetup
import org.domaindriven.model.dsl.ide.DddIdeModule
import org.eclipse.xtext.util.Modules2

/**
 * Initialization support for running Xtext languages in web applications.
 */
class DddWebSetup extends DddStandaloneSetup {
	
	override Injector createInjector() {
		return Guice.createInjector(Modules2.mixin(new DddRuntimeModule, new DddIdeModule, new DddWebModule))
	}
	
}
