package com.yash.aspect;
/**
 * @author shailesh.pawar
 */
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class MyAspect {
	@Before("execution(* com.yash.service.EmployeeService.List(..))")
	public void PrintBefore()
	{
		System.out.println("Collect the information of all employees.(@Before)...............");
	}
	@After("execution(* com.yash.service.EmployeeService.List(..))")
	public void PrintAfter()
	{
		System.out.println("After method.(@After).......");
	}
}
