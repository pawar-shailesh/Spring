package com.yash.SpringWithJDBC;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.yash.SpringWithJDBC.Configuration.ApplicationConfig;
import com.yash.SpringWithJDBC.Model.Employee;
import com.yash.SpringWithJDBC.Service.EmployeeService;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main( String[] args )
	{
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		EmployeeService employeeService = (EmployeeService) context.getBean("employeeService");

		Employee akshay = new Employee(4, "Akshay", "Software Engineer", 32000);
		Employee harshada = new Employee(5, "Harshada", "Software Engineer", 45000);
		Employee usha = new Employee(6, "Usha", "Software Engineer", 32000);

		/*
		employeeService.addEmployee(akshay);
		employeeService.addEmployee(harshada);
		employeeService.addEmployee(usha);
		*/

		System.out.println("Find All");
		List < Employee > employees = employeeService.findAll();
		for (Employee employee: employees) {
			System.out.println(employee);
		}

		System.out.println("Delete Employee Id = 3");
		int deleteMe = 3;
		employeeService.deleteEmployee(deleteMe);

		akshay.setEmpName("Allex - Updated");
		System.out.println("Update Employee Id = 1");
		int updateMe = 1;
		employeeService.editEmployee(akshay, updateMe);

		System.out.println("Find Employee Id = 2");
		Employee employee = employeeService.find(2);
		System.out.println(employee);

		System.out.println("Find All Again");
		employees = employeeService.findAll();
		for (Employee e: employees) {
			System.out.println(e);
		}

		context.close();
	}

}
