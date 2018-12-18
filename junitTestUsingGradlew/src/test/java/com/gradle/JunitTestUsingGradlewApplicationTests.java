package com.gradle;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import com.gradle.model.Employee;
import com.gradle.service.EmployeeService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JunitTestUsingGradlewApplicationTests {

   private static Log LOG = LogFactory.getLog(JunitTestUsingGradlewApplicationTests.class);
   @Autowired
   private EmployeeService employeeService;

   List<Employee> listOfEmployee = new ArrayList<>();

   @Autowired
   private ApplicationContext applicationContext;

   @Before
   public void setUp() {
      applicationContext.getBean(EmployeeService.class);
   }

   @Test
   public void contextLoads() {
      assertThat(employeeService).isNotNull();
   }

   @Test(expected = Exception.class)
   public void employeeServiceTest() {
      Employee emply = new Employee();
      emply.setEmpAddressline1("Nagpur");
      emply.setEmpAddressline2("Gondiya");
      emply.setEmpCode("Tagit23323");
      emply.setEmpEmail("ram.kathane@tagitmobile.com");
      emply.setEmpId("4568974");
      emply.setEmpLandlineNo("8965475236");
      emply.setEmpMobileNo("9874563589");
      emply.setEmpName("ram Kathane");
      emply.setEmpSalary(85000000);
      employeeService.addEmployee(emply);

   }
   // (expected = Exception.class)

   @Test
   public void getAllEmployee() {

      listOfEmployee = employeeService.getAllEmployee();
      LOG.info("List Of Employee Size::::::" + listOfEmployee.size());
      listOfEmployee.stream().forEach(System.out::println);
   }

   @After
   public void finalize() {
      LOG.info("finalize");
      listOfEmployee.clear();
      LOG.info("Size of Employee Lis:::::" + listOfEmployee.size());
   }

   @Test
   public void testGetEmployeeById() {
      Optional<Employee> emp = employeeService.getEmployeeById(4);
      System.out.println("get Employee Id:::::::" + emp);
   }

}
