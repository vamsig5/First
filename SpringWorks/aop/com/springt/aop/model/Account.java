package com.springt.aop.model;

public class Account {
private int accNo;
private String accName;
private double balance;
@Override
public String toString() {
	return "Account [accNo=" + accNo + ", accNAme=" + accName + ", balance=" + balance + "]";
}
public Account() {
	super();
	// TODO Auto-generated constructor stub
}
public Account(int accNo, String accName, double balance) {
	super();
	this.accNo = accNo;
	this.accName = accName;
	this.balance = balance;
}
public int getAccNo() {
	return accNo;
}
public void setAccNo(int accNo) {
	this.accNo = accNo;
}
public String getAccName() {
	return accName;
}
public void setAccName(String accName) {
	this.accName = accName;
}
public double getBalance() {
	return balance;
}
public void setBalance(double balance) {
	this.balance = balance;
}

}
