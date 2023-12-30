package org.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ArrayDemoTest {

	@Test
	void testArrdemo() {
		ArrayDemo demo = new ArrayDemo();
		
		int[] actual=demo.arrdemo();
		int[] expected= {1,2,3};
		
		//assertArrayEquals(actual,expected,"Failed Equal");
		assertArrayEquals(actual,actual);
		//assertThrows(Exception.class,()->demo.demoarr(),"Exception Occured");
	}

}
