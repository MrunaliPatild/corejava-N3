package org.tnsif.junit;
import static org.junit.Assert.assertNotNull;

//program to demonstrate on parameterized test
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
class ParameterizedTestDemo {
	@ParameterizedTest
	@ValueSource(strings= {"Nia","Diya"})
	void test() {
		System.out.println("hello");
	}
	
	@ParameterizedTest
	@ValueSource(strings= {"Nia","Diya"})
	void display(String str) {
		assertNotNull(str);
	}
}
