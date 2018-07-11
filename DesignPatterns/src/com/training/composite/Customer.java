package com.training.composite;

import java.util.List;

public class Customer {
private int CustId;
private String custName;
private List<Customer> references;
public int getCustId() {
	return CustId;
}
public void setCustId(int custId) {
	CustId = custId;
}
public String getCustName() {
	return custName;
}
public void setCustName(String custName) {
	this.custName = custName;
}
public List<Customer> getReferences() {
	return references;
}
public void setReferences(List<Customer> references) {
	this.references = references;
}
public Customer(int custId, String custName) {
	super();
	CustId = custId;
	this.custName = custName;
}
@Override
public String toString() {
	return "Customer [CustId=" + CustId + ", custName=" + custName + "]";
}
public void addReference(Customer customer){
	System.out.println(customer);
	this.references.add(customer);
}
public void removeReference(Customer customer){
	this.references.remove(customer);
}
}
