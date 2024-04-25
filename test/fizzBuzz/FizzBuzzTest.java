package fizzBuzz;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FizzBuzzTest {
	
	
	
	@Test
	void test_un() {
		assertEquals(FizzBuzz.fizzBuzz(1), "1");
	}
	
	@Test
	void test_deux() {
		assertEquals(FizzBuzz.fizzBuzz(2), "2");
	}
	
	@Test
	void test_trois() {
		assertEquals(FizzBuzz.fizzBuzz(3), "fizz");
	}
	
	@Test
	void test_quelques_Valeurs() {
		assertEquals(FizzBuzz.fizzBuzz(4), "4");
		assertEquals(FizzBuzz.fizzBuzz(7), "7");
	}
	
	@Test
	void test_cinq() {
		assertEquals(FizzBuzz.fizzBuzz(5), "buzz");
	}
	

	@Test
	void test_multiples() {
		assertEquals(FizzBuzz.fizzBuzz(6), "fizz");
		assertEquals(FizzBuzz.fizzBuzz(9), "fizz");
		assertEquals(FizzBuzz.fizzBuzz(10), "buzz");
		assertEquals(FizzBuzz.fizzBuzz(400), "buzz");
	}
	
	@Test
	void test_multiples_double() {
		assertEquals(FizzBuzz.fizzBuzz(3*5), "fizzbuzz");
		assertEquals(FizzBuzz.fizzBuzz(2*3*5), "fizzbuzz");
		assertEquals(FizzBuzz.fizzBuzz(3*3*5*5), "fizzbuzz");
	}
	

}
