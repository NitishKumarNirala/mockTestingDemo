package com.gradle;

import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.doThrow;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;

import com.gradle.controller.MockStudentController;
import com.gradle.service.StudentService;
import com.gradle.service.StudentServiceImpl;

@RunWith(MockitoJUnitRunner.class)
@SpringBootTest
public class MockTestApplication {

	private static Log LOG = LogFactory.getLog(MockTestApplication.class);

	@Mock
	private StudentService studentService;

	@InjectMocks
	private StudentServiceImpl studentServiceImpl;
	
	@InjectMocks
	private MockStudentController mockStudentController;


	@Test
	public void testMockCreation() {
		LOG.info("Mock Test Object Creations");
		assertNotNull(studentService);
		assertNotNull(mockStudentController);

	}
	
	@Test
	public void mockTestStudentService() {
		Mockito.when(studentService.getStudentRecord()).thenReturn("A B C D E F");
		 Assert.assertEquals("A B C D E F", studentServiceImpl.getStudentRecord());
	}
	
	@Test
	public void mockTestStudentGetListData() {
		List<String>listOfStudent=new ArrayList<>();
		listOfStudent.add("A");
		listOfStudent.add("B");
		listOfStudent.add("C");
		listOfStudent.add("D");
		listOfStudent.add("E");
		listOfStudent.add("F");
		listOfStudent.add("G");
		listOfStudent.add("H");
		Mockito.when(studentService.getListOfStudentRecord()).thenReturn(listOfStudent);
		 Assert.assertEquals(listOfStudent, studentServiceImpl.getListOfStudentRecord());
	}
	
	@Test(expected = RuntimeException.class)
	public void mockTestMockController() {
		doThrow(new RuntimeException("divide operation not implemented")).doCallRealMethod();
		Mockito.when(studentService.getStudentRecord()).thenReturn("A B C D E F");
		 Assert.assertEquals("A B C D E F", mockStudentController.getEmployee());
	}

}
