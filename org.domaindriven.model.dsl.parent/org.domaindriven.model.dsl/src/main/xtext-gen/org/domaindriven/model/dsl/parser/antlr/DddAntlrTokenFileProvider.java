/*
 * generated by Xtext 2.17.0.M2
 */
package org.domaindriven.model.dsl.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class DddAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("org/domaindriven/model/dsl/parser/antlr/internal/InternalDdd.tokens");
	}
}
