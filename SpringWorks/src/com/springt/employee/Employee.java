package com.springt.employee;

public class Employee {
	private int empId;
	private String empName;
	private double empSal;
	
	
	public Employee(int empId, String empName, double empSal) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSal = empSal;
	}
	
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSal=" + empSal + "]";
	}

	public Employee() {
		super();
System.out.println("Default Constructor invoked from Employee");	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getEmpSal() {
		return empSal;
	}
	public void setEmpSal(double empSal) {
		this.empSal = empSal;
	}
	public void init() {
System.out.println("Init for Employee goes here");
	}
	public void destroy() {
System.out.println("destroy for Employee");
	}
	public void ginit() {
System.out.println("global init here...");
	}
	public void gdestroy() {
		System.out.println("global destroy here...");
			}
}
