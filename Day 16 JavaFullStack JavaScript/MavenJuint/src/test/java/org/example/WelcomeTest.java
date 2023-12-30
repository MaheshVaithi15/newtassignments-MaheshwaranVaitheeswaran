package org.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class WelcomeTest {
	

	Welcome welcome = new Welcome();
	
	@BeforeEach
	void beforeEach() {
		welcome = new Welcome();
		
	}

	@Test
	void testAdd() {
		//fail("Not yet implemented");
		//System.out.println("Test Passed!,..");
		
		
		int expected = 50;
		int actual = welcome.add(20, 30);
		
		assertEquals(actual,expected);
		
		/*if(actual == expected) {
			System.out.println("Passed");
		}
		else {
			fail("Test Failed");
		}*/
		
	}
	
	@Test
	void testMul() {
		//Welcome welcome2 = new Welcome();
		int expected = 600;
		int actual = welcome.mul(20,30);
		
		assertEquals(actual,expected);
		
	}
	
	@Test
	void testDiv() {
		//Welcome welcome2 = new Welcome();
		int expected =0;
		int actual = welcome.div(0,10);
		
		assertEquals(actual,expected);
		assertThrows(ArithmeticException.class,()->welcome.div(0,10),"Exception Occured");
		
	}

	

}
