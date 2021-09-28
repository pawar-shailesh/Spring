package com.yash.SpringWithJDBC.Model;

public class Employee {
	private int empId;
    private String empName;
    private String desg;
    private double salary;
    
    
	/**
	 * @param empId
	 * @param empName
	 * @param desg
	 * @param salary
	 */
	public Employee(int empId, String empName, String desg, double salary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.desg = desg;
		this.salary = salary;
	}
	
	
	/**
	 * Default Constructor
	 */
	public Employee() {
		super();
	}


	/**
	 * @return the empId
	 */
	public int getEmpId() {
		return empId;
	}
	/**
	 * @param empId the empId to set
	 */
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	/**
	 * @return the empName
	 */
	public String getEmpName() {
		return empName;
	}
	/**
	 * @param empName the empName to set
	 */
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	/**
	 * @return the desg
	 */
	public String getDesg() {
		return desg;
	}
	/**
	 * @param desg the desg to set
	 */
	public void setDesg(String desg) {
		this.desg = desg;
	}
	/**
	 * @return the salary
	 */
	public double getSalary() {
		return salary;
	}
	/**
	 * @param salary the salary to set
	 */
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", desg=" + desg + ", salary=" + salary + "]";
	}
    

}
