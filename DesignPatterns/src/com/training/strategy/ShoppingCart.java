package com.training.strategy;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
	List<Item> items=new ArrayList<Item>();

	public ShoppingCart(List<Item> items) {
		//super();
		this.items = new ArrayList<Item>();
	}
public ShoppingCart() {
	}
public void addItem(Item item){
	System.out.println(item);
	this.items.add(item);
}
public void removeItem(Item item){
	this.items.remove(item);
}
public void modifyItem(Item item){
	
}
public int calculatetotal(){
	int sum=0;
	for (Item item : items) {
		sum=sum + item.getPrice() * item.getQuantity();
	}
	return sum;
}
public void checkOut(Payment payment ){
	payment.pay(calculatetotal());
}
}
