package com.paltecno.unittesting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ArrayMethodsTest {

	@Test
	public void testFindIndex_numberInArray() {
		ArrayMethods arrayMethods = new ArrayMethods();
		int result = arrayMethods.findIndex(new int[] { 8, 4, 5 }, 4);
		assertEquals(1, result);
	}

	@Test
	public void testFindIndex_numberNotInArray() {
		ArrayMethods arrayMethods = new ArrayMethods();
		assertEquals(-1, arrayMethods.findIndex(new int[] { 8, 4, 5 }, 1));
	}

	@Test
	public void testfindIndex_emptyArray() {
		ArrayMethods arrayMethods = new ArrayMethods();
		assertEquals(-1, arrayMethods.findIndex(new int[] {}, 1));
	}

	@Test
	public void testFindIndex_numberNotInArraywithmessage() {
		ArrayMethods arrayMethods = new ArrayMethods();
		assertEquals(1, arrayMethods.findIndex(new int[] { 8, 4, 5 }, 1),
				"The findIndex method finds the index of a given number");
	}

	@Test
	public void testassertArrayEqual() {
		assertArrayEquals(new int[] { 0, 1, 3, 7 }, new int[] { 0, 5, 3, 7 }, "both arent equal!");
	}

	@Test
	void testAssert() {
		Boolean condition = true;
		assertEquals(true, true);
		assertTrue(condition);

		String str = null;
		assertEquals(null, str);
		assertNull(str);
	}

	@Test
	public void testSortArray() {
		fail("unimplemented method");
	}

	@Test
	public void testfindIndex() {
		ArrayMethods arrayMethods = new ArrayMethods();
		assertAll(() -> assertEquals(1, arrayMethods.findIndex(new int[] { 8, 4, 5 }, 4)),
				() -> assertEquals(-1, arrayMethods.findIndex(new int[] { 8, 4, 5 }, 1)),
				() -> assertEquals(-1, arrayMethods.findIndex(new int[] {}, 1)));
	}

	@Test
	public void testfindIndex_indexOutOfBound() {
		ArrayMethods arrayMethods = new ArrayMethods();
		assertThrows(ArrayIndexOutOfBoundsException.class, () -> arrayMethods.printArray(new int[] { 1, 8, 5 }, 3));
	}

}
