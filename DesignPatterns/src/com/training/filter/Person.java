package com.training.filter;

public class Person {
private String name;
private String sex;
private String martialstatus;
public Person(String name, String sex, String martialstatus) {
	super();
	this.name = name;
	this.sex = sex;
	this.martialstatus = martialstatus;
}
@Override
public String toString() {
	return "Person [name=" + name + ", sex=" + sex + ", martialstatus=" + martialstatus + "]";
}
public Person() {
	super();
	// TODO Auto-generated constructor stub
}
protected String getName() {
	return name;
}
protected void setName(String name) {
	this.name = name;
}
protected String getSex() {
	return sex;
}
protected void setSex(String sex) {
	this.sex = sex;
}
protected String getMartialstatus() {
	return martialstatus;
}
protected void setMartialstatus(String martialstatus) {
	this.martialstatus = martialstatus;
}

}
