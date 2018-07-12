package com.training.composite;

import java.util.List;

public class Customer {
private int custId;
private String custName;
private List<Customer> references;
public int getCustId() {
	return custId;
}
public void setCustId(int custId) {
	this.custId = custId;
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
	
	this.custId = custId;
	this.custName = custName;
}
@Override
public String toString() {
	return "Customer [CustId=" + custId + ", custName=" + custName + "]";
}
public void addReference(Customer customer){
	System.out.println(customer);
	this.references.add(customer);
}
public void removeReference(Customer customer){
	this.references.remove(customer);
}
}
