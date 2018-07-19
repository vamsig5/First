package com.springt.aop.model;

public class SBAccount {
private Account acc;

public Account getAcc() {
	System.out.println("in Acc");
	return acc;
}

public void setAcc(Account acc) {
	this.acc= acc;
}

@Override
public String toString() {
	return "SBAccount [account=" + acc+ "]";
}
public double showBalance(){
	this.getTest();
	return acc.getBalance();
}
void getTest(){
	System.out.println("this is default test");
}
public void getOnePara(int x){
	System.out.println("value x: "+x);
}

}
