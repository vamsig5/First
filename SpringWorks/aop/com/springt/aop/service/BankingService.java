package com.springt.aop.service;

import com.springt.aop.model.CAAccount;
import com.springt.aop.model.SBAccount;

public class BankingService {
	private SBAccount sbAccount;
	private CAAccount caAccount;
	public SBAccount getSbAccount() {
		System.out.println("in Sb Acc");
		return sbAccount;
	}
	public void setSbAccount(SBAccount sbAccount) {
		this.sbAccount = sbAccount;
	}
	public CAAccount getCaAccount() {
		return caAccount;
	}
	public void setCaAccount(CAAccount caAccount) {
		this.caAccount = caAccount;
	}
	@Override
	public String toString() {
		return "BankingService [sbAccount=" + sbAccount + ", caAccount=" + caAccount + "]";
	}
	public BankingService() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String setAndGetString(String name){
		return name;
	}
	public void throwSomeExcep(){
		int a=1;
		if (a==1) {
			throw new RuntimeException("use throw method");
		}
		System.out.println("some thing happens");
		
;	}

}
