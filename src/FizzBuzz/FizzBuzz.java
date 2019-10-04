package FizzBuzz;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;


class FizzBuzz {
	
	FizzBuzzTest fizzBuzz;
	
	@BeforeEach
	void setUp() throws Exception {
		fizzBuzz =  new FizzBuzzTest();
	}
	
	@DisplayName("Actual1")
	@Test
	void ShouldBe1_Input1() {
		String output = fizzBuzz.getBuzz(1);
		assertEquals(1, output);
	}
	
	@DisplayName("Actual2")
	@Test
	void ShouldBe2_Input2() {
		String output = fizzBuzz.getBuzz(2);
		assertEquals(2, output);
	}
	
}
