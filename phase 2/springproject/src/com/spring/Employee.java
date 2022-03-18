package com.spring;

public class Employee {
	private int employeeID;
	private String employeeName;
	public Employee() {
		
	}
	
	public Employee(int employeeID, String employeeName) {
		super();
		this.employeeID = employeeID;
		this.employeeName = employeeName;
	}

	public int getEmployeeID() {
		return employeeID;
	}
	public void setEmployeeID(int employeeID) {
		System.out.println("setting employee id called");
		this.employeeID = employeeID;
	}
	public String getEmployeeName() {
		
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		System.out.println("setting employee name called");
		this.employeeName = employeeName;
	}
	@Override
	public String toString() {
		return "Employee [employeeID=" + employeeID + ", employeeName=" + employeeName + "]";
	}
	

}
