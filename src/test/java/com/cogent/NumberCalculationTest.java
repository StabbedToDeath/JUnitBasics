package com.cogent;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

public class NumberCalculationTest {
	
	NumberCalculation calculate;
	
	@BeforeEach
	void init() {
		calculate = new NumberCalculation();
	}
	
	@Test
	void testAddition() {
		
		assertEquals(calculate.add(10, 20), 30);
		
	}
	
	@Nested
	class AddTest {
		
		@Test
		void addPositive() {
			assertEquals(calculate.add(1, 1), 2);
		}
		
		@Test
		void addHybrid() {
			assertEquals(calculate.add(1, -1), 0);
		}
		
		@Test
		void addNegative() {
			assertEquals(calculate.add(-1, -1), -2);
		}
	}
	
	@Test
	void testMultiply() {
		
		assertAll(
				() -> assertEquals(calculate.multiply(4, 5), 20),
				() -> assertEquals(calculate.multiply(1, 0), 0),
				() -> assertEquals(calculate.multiply(12, 9), 108)
				);
	}
	
	@Test
	void testDivide() {
		assertThrows(ArithmeticException.class, () -> calculate.divide(1, 0), "Cant divide with 0");
	}
}
