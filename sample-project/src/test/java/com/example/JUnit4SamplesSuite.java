/*
 * Copyright 2015 the original author or authors.
 *
 * All rights reserved. This program and the accompanying materials are
 * made available under the terms of the Eclipse Public License v1.0 which
 * accompanies this distribution and is available at
 *
 * http://www.eclipse.org/legal/epl-v10.html
 */

package com.example;

import static org.junit.gen5.junit4runner.JUnit5.*;

import org.junit.gen5.junit4runner.JUnit5;
import org.junit.gen5.junit4runner.JUnit5.Classes;
import org.junit.gen5.junit4runner.JUnit5.UniqueIds;
import org.junit.runner.RunWith;

@RunWith(JUnit5.class)
@Classes({ SucceedingTestCase.class })
@UniqueIds({
		"junit5:com.example.SampleTestCase#assertAllTest()",
		"junit5:com.example.SampleTestCase#assertAllFailingTest()",
		"junit5:com.example.SampleTestCase@AnInnerTestContext"
})
@Packages({ "com.example.subpackage" })
//@Classes({ SampleTestCase.class, SucceedingTestCase.class, JUnit4TestCase.class })
public class JUnit4SamplesSuite {

	// When you have the following method, it overrides the Classes annotation
	//		public static TestPlanSpecification createSpecification() {
	//			return TestPlanSpecification.build(
	//				TestPlanSpecification.forClassNames(SucceedingTestCase.class.getName()));
	//		}
}
