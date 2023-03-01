package org.tnsif.junit;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
@TestInstance(Lifecycle.PER_CLASS)

public class JunitAnnotationsDemo {
	@Test
	@DisplayName("SimpleJunitTestingMethod")
	void test() {
		System.out.println("first Junit test case");
	}
	@Test
	@BeforeAll
	/*if we make this method as static then we will not get method name in testing*/
	/*to overcome this we must have to use @Testinstance*/
	static void display() {
		System.out.println("welcome to Junit5 testing");
	}
	@Test
	@AfterEach
	void accept() {
		System.out.println("after each method demo");
	}
	@Test
	@BeforeEach
	void show() {
		System.out.println("Before each method demo");

	}
	@Test
	@AfterAll
	static void run() {
		System.out.println("After all method demo");
	}
}
