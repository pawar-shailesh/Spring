package com.yash.SpringWithJDBC.EmployeeDAO;

import java.util.List;

import com.yash.SpringWithJDBC.Model.Employee;

public interface EmployeeDao 
{
	public void addEmployee(Employee employee);

	public void editEmployee(Employee employee, int empId);

	public void deleteEmployee(int empId);

	public Employee find(int empId);

	public List < Employee > findAll();

}
