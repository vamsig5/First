package com.exilant.day1;

public class Customer {

	private int custid;
	private String custName;
     private double custPurchases;
     private String designation;
	public Customer(int custid, String custName, double custPurchases, String designation) {
		super();
		this.custid = custid;
		this.custName = custName;
		this.custPurchases = custPurchases;
		this.designation = designation;
	}
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Customer [custid=" + custid + ", custName=" + custName + ", custPurchases=" + custPurchases
				+ ", designation=" + designation + "]";
	}
	public int getCustid() {
		return custid;
	}
	public void setCustid(int custid) {
		this.custid = custid;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public double getCustPurchases() {
		return custPurchases;
	}
	public void setCustPurchases(double custPurchases) {
		this.custPurchases = custPurchases;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
     
}
