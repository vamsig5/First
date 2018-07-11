package com.exilant.day1;

public class PriorityCustomer {
	private int custid;
	private String custName;
	private String type;
	public PriorityCustomer(int custid, String custName, String type) {
		super();
		this.custid = custid;
		this.custName = custName;
		this.type = type;
	}
	@Override
	public String toString() {
		return "PriorityCustomer [custid=" + custid + ", custName=" + custName + ", type=" + type + "]";
	}
	public PriorityCustomer() {
	
	
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
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
}
