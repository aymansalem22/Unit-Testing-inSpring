package com.paltecno.unittesting;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;

public class StudentServiceMockTest {

	@Test
	void testfindTotal() {
		StudentDao studentDaoMock = mock(StudentDao.class);
		when(studentDaoMock.getMarks()).thenReturn(new int[] { 15, 20, 5 });

		StudentService studentService = new StudentService(studentDaoMock);
		int total = studentService.findTotal();
		assertEquals(40, total);
	}

	@Test
	void testfindTotal_EmptyArray() {
		StudentDao studentDaoMock = mock(StudentDao.class);
		when(studentDaoMock.getMarks()).thenReturn(new int[] {});

		StudentService studentService = new StudentService(studentDaoMock);
		int total = studentService.findTotal();
		assertEquals(0, total);
	}

}
