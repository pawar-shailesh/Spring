package com.yash.main;
import org.apache.log4j.BasicConfigurator;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yash.service.EmployeeService;

/**
 * @author shailesh.pawar
 *
 */
public class App {
	public static void main(String[] args) {
		BasicConfigurator.configure();
		ApplicationContext appContext = new ClassPathXmlApplicationContext("config.xml");
		EmployeeService emps=appContext.getBean("Employee",EmployeeService.class);
		emps.List(1,"Shailesh");
	}
}