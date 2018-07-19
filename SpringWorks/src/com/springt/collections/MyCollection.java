package com.springt.collections;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class MyCollection {
private List questionBank;
private Set addresses;
private AccountMap accountMap;
public MyCollection() {
	super();
	// TODO Auto-generated constructor stub
}
public List getQuestionBank() {
	return questionBank;
}
public void setQuestionBank(List questionBank) {
	this.questionBank = questionBank;
}
public Set getAddresses() {
	return addresses;
}
public void setAddresses(Set addresses) {
	this.addresses = addresses;
}
public AccountMap getAccountMap() {
	return accountMap;
}
public void setAccountMap(AccountMap accountMap) {
	this.accountMap = accountMap;
}
@Override
public String toString() {
	return "MyCollection [questionBank=" + questionBank + ", addresses=" + addresses + ", accountMap=" + accountMap
			+ "]";
}


}
