package org.tnsif.junit;
//program to demonstrate on assumption
import static org.junit.Assume.assumeTrue;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

public class JunitAssumptionDemo {
	@Test
	void test() {
		Assumptions.assumeTrue(12==12);
	}
	@Test
	void accept() {
		Assumptions.assumeFalse(12==12);
	}


}
