package com.paltecno.unittesting;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class StudentServiceStubTest {

	@Test
	void testfindTotal() {
		StudentService studentService = new StudentService(new StudentDaoStub());
		int total = studentService.findTotal();
		assertEquals(40, total);
	}

}
