package com.training;

import com.mongodb.BasicDBObject;

public class Employee extends BasicDBObject{
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
private int empid;
private String empname;
private String empemail;
private double empsal;
public Employee() {
	super();
	// TODO Auto-generated constructor stub
}
public Employee(int empid, String empname, String empemail, double empsal) {
	super();
	this.empid = empid;
	this.empname = empname;
	this.empemail = empemail;
	this.empsal = empsal;
}
public int getEmpid() {
	return empid;
}
public void setEmpid(int empid) {
	this.put("empid", empid);
	this.empid = empid;
}
public String getEmpname() {
	return empname;
}
public void setEmpname(String empname) {
	this.put("empname", empname);
	this.empname = empname;
}
public String getEmpemail() {
	return empemail;
}
public void setEmpemail(String empemail) {
	this.put("empemail", empemail);
	this.empemail = empemail;
}
public double getEmpsal() {
	return empsal;
}
public void setEmpsal(double empsal) {
	this.put("empsal", empsal);
	this.empsal = empsal;
}
@Override
public String toString() {
	return "Employee [empid=" + empid + ", empname=" + empname + ", empemail=" + empemail + ", empsal=" + empsal + "]";
}



}
