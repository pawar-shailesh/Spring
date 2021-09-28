package com.yash.SpringWithJDBC.EmployeeDaoImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.yash.SpringWithJDBC.EmployeeDAO.EmployeeDao;
import com.yash.SpringWithJDBC.Model.Employee;

@Repository
@Qualifier("employeeDao")
public class EmployeeDaoImpl implements EmployeeDao  {

	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public void addEmployee(Employee employee) {
		jdbcTemplate.update("INSERT INTO employee (emp_id, emp_name,desg, salary) VALUES (?, ?, ?, ?)",
				employee.getEmpId(), employee.getEmpName(), employee.getDesg(), employee.getSalary());
		System.out.println("Employee Added!!");

	}

	@Override
	public void editEmployee(Employee employee, int empId) {
		jdbcTemplate.update("UPDATE employee SET emp_name = ? WHERE person_id = ? ",
				employee.getEmpName(), empId);
		System.out.println("Employee Updated!!");

	}

	@Override
	public void deleteEmployee(int empId) {
		jdbcTemplate.update("DELETE from employee WHERE emp_id = ? ", empId);
		System.out.println("Employee Deleted!!");

	}

	@Override
	public Employee find(int empId) {
		Employee employee = (Employee) jdbcTemplate.queryForObject("SELECT * FROM employee where emp_id = ? ",
				new Object[] { empId }, new BeanPropertyRowMapper(Employee.class));

		return employee;
	}

	@Override
	public List<Employee> findAll() {
		List < Employee > employees = jdbcTemplate.query("SELECT * FROM employee", new BeanPropertyRowMapper(Employee.class));
		return employees;
	}

}

