package com.yash.SpringWithJDBC.ServiceImpl;

import java.util.List;

import com.yash.SpringWithJDBC.EmployeeDAO.EmployeeDao;
import com.yash.SpringWithJDBC.Model.Employee;
import com.yash.SpringWithJDBC.Service.EmployeeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService 
{
	@Autowired
	EmployeeDao employeeDao;

	@Override
	public void addEmployee(Employee employee) {
		employeeDao.addEmployee(employee);

	}

	@Override
	public void editEmployee(Employee employee, int empId) {
		employeeDao.editEmployee(employee, empId);

	}

	@Override
	public void deleteEmployee(int empId) {
		employeeDao.deleteEmployee(empId);

	}

	@Override
	public Employee find(int empId) {
		return employeeDao.find(empId);
	}

	@Override
	public List<Employee> findAll() {

		return employeeDao.findAll();
	}

}
