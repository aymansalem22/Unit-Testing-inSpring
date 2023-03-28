package com.paltecno.unittesting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ArrayMethodsTest {

	@Test
	public void testFindIndex_numberInArray() {
	ArrayMethods arrayMethods=new ArrayMethods();
	int result=arrayMethods.findIndex(new int[] {8,4,5}, 4);
	assertEquals(1, result);
	}

	@Test
	public void testFindIndex_numberNotInArray() {
		ArrayMethods arrayMethods=new ArrayMethods();
		assertEquals(-1, arrayMethods.findIndex(new int[] {8,4,5}, 1));
	}
	
	@Test
	public void testfindIndex_emptyArray() {
		ArrayMethods arrayMethods=new ArrayMethods();
		assertEquals(-1, arrayMethods.findIndex(new int[] {}, 1));
	}

}
