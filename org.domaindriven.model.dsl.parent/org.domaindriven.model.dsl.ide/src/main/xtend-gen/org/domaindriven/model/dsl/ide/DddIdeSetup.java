/**
 * generated by Xtext 2.17.0.M2
 */
package org.domaindriven.model.dsl.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.domaindriven.model.dsl.DddRuntimeModule;
import org.domaindriven.model.dsl.DddStandaloneSetup;
import org.domaindriven.model.dsl.ide.DddIdeModule;
import org.eclipse.xtext.util.Modules2;

/**
 * Initialization support for running Xtext languages as language servers.
 */
@SuppressWarnings("all")
public class DddIdeSetup extends DddStandaloneSetup {
  @Override
  public Injector createInjector() {
    DddRuntimeModule _dddRuntimeModule = new DddRuntimeModule();
    DddIdeModule _dddIdeModule = new DddIdeModule();
    return Guice.createInjector(Modules2.mixin(_dddRuntimeModule, _dddIdeModule));
  }
}