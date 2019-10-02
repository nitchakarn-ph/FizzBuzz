package FizzBuzz;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FizzBuzz {
	
	FizzBuzzTest fizzBuzz = new FizzBuzzTest();
	String output = fizzBuzz.getBuzz(1);

	@Test
	void test_1() {
		assertEquals("Buzz", output);
	}

}
