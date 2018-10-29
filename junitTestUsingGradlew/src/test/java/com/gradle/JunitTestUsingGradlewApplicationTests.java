package com.gradle;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import java.util.Optional;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.gradle.model.Employee;
import com.gradle.service.EmployeeService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JunitTestUsingGradlewApplicationTests {

	private static Log LOG=LogFactory.getLog(JunitTestUsingGradlewApplicationTests.class);
	@Autowired
	private EmployeeService employeeService;
	
	@Test
	public void contextLoads() {
		assertThat(employeeService).isNotNull();
	}
	
	
	@Test(expected=Exception.class)
	public void employeeServiceTest() {
	Employee emply=new Employee();
	emply.setEmpAddressline1("Haldiwani");
	emply.setEmpAddressline2("Chennai");
	emply.setEmpCode("45235");
	emply.setEmpEmail("shikha@tagitmobile.com");
	emply.setEmpId("TAGIT34324");
	emply.setEmpLandlineNo("8788888887");
	emply.setEmpMobileNo("1234567889");
	emply.setEmpName("Shikha Bhatt");
	emply.setEmpSalary(85000000);
	employeeService.addEmployee(emply);
		
	}
	
	@Test
	public void getAllEmployee() {

		List<Employee> listOfEmployee = employeeService.getAllEmployee();
		LOG.info("List Of Employee Size::::::" + listOfEmployee.size());
		listOfEmployee.stream().forEach(System.out::println);
	}
	
	@Test(expected=Exception.class)
	public void testGetEmployeeById() {
		Optional<Employee>emp=employeeService.getEmployeeById(4);
	   System.out.println("get Employee Id:::::::"+emp);
	}

}
