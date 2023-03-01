package org.tnsif.junit;
//program to demonstrate on assertion annotations
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import org.junit.jupiter.api.Test;

class JunitAssertionDemo {
	@Test
	void test() {
		assertEquals(12,12);
	}
	@Test
	void display() {
		assertFalse(12==1);
	}

}
