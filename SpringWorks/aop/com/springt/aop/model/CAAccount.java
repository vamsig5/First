package com.springt.aop.model;

public class CAAccount {
	private Account account;

	@Override
	public String toString() {
		return "CAAccount [account=" + account + "]";
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}
	public double showBalance(){
		return account.getBalance();
	}
	
}
