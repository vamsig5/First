package com.training.strategy;

public class CreditCrad implements Payment {
	private String name;
	private String cardNumber;
	private String cvv;
	private String dateOfExpiry;
	private double discount;
	private String bankName;

	public CreditCrad(String name, String cardNumber, String cvv, String dateOfExpiry, double discount,
			String bankName) {
		super();
		this.name = name;
		this.cardNumber = cardNumber;
		this.cvv = cvv;
		this.dateOfExpiry = dateOfExpiry;
		this.discount = discount;
		this.bankName = bankName;
	}

	@Override
	public String toString() {
		return "CreditCrad [name=" + name + ", cardNumber=" + cardNumber + ", cvv=" + cvv + ", dateOfExpiry="
				+ dateOfExpiry + ", discount=" + discount + ", bankName=" + bankName + "]";
	}

	@Override
	public void pay(int amount) {
if(this.bankName.equalsIgnoreCase("dbs")){
	amount=(int)(amount-(amount*0.1));
	System.out.println("paying with dbs and got 10% discount"+amount);
}else{
	System.out.println("paid amount of"+amount+"with credit card"+bankName);
}
	}

}
