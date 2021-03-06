package com.hasith.spring.model;

public class Employee {
	private String employeeName;
	private String employeeLocation;

	public Employee() {
	}

	public Employee(String employeeName, String employeeLocation) {
		this.employeeName = employeeName;
		this.employeeLocation = employeeLocation;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeeLocation() {
		return employeeLocation;
	}

	public void setEmployeeLocation(String employeeLocation) {
		this.employeeLocation = employeeLocation;
	}

	@Override
	public String toString() {
		return "Employee [employeeName=" + employeeName + ", employeeLocation=" + employeeLocation + "]";
	}

}
