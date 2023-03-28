package com.paltecno.unittesting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class LifeCycleJunitTest {

	private ArrayMethods arrayMethods;

	@BeforeAll
	static void veforeAllTests() {
		System.out.println("Run this code before all tests");
	}

	@BeforeEach
	void init() {
		System.out.println("Initalizing before test");
		arrayMethods = new ArrayMethods();
	}

	@Test
	public void testfindIndex_numberInArray() {
		System.out.println("Test1");
		int result = arrayMethods.findIndex(new int[] { 8, 4, 5 }, 4);
		assertEquals(1, result);
	}

	@Test
	public void testFindIndex_numberNotInArray() {
		System.out.println("Test2");
		assertEquals(-1, arrayMethods.findIndex(new int[] { 8, 4, 5 }, 1));
	}

	@Test
	public void testfindIndex_emptyArray() {
		System.out.println("Test3");
		assertEquals(-1, arrayMethods.findIndex(new int[] {}, 1));
		;
	}

	@Test
	@Disabled
	public void testSortArray() {
		fail("unimplemented method");
	}

	@AfterEach
	void afterEachTest() {
		System.out.println("Clean up after test");
	}

	@AfterAll
	static void afterAllTests() {
		System.out.println("Run this code after all tests");
	}
}
