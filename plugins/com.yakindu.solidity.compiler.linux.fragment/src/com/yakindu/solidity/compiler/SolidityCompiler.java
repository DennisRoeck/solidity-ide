/**
 * Copyright (c) 2017 committers of YAKINDU and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * 	Andreas Muelder - Itemis AG - initial API and implementation
 * 	Karsten Thoms   - Itemis AG - initial API and implementation
 * 	Florian Antony  - Itemis AG - initial API and implementation
 * 	committers of YAKINDU 
 * 
 */
package com.yakindu.solidity.compiler.builder;

import org.eclipse.core.runtime.Path;

import com.yakindu.solidity.compiler.builder.SolidityCompilerBase;

/**
 * @author Florian Antony - Initial contribution and API
 */
public class SolidityCompiler extends SolidityCompilerBase {

	@Override
	protected Path getPath() {
		return new Path("compiler/solc");
	}

}
