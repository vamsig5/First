package com.training.strategy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Client {
	public static void main(String[] args) {
		List<Item> items=Arrays.asList(new Item("IBB10-monitor", 70, 5),new Item("IBB10-pen", 30, 4));

		ShoppingCart cart=new ShoppingCart(items);
		for (Item item : items) {
			cart.addItem(item);
		}
//		cart.addItem(new Item("IBB10-pen", 30, 4));
//		cart.addItem(new Item("IBB10-monitor", 70, 5));
		
		System.out.println("Total Amount:"+cart.calculatetotal());
		Payment payment=new EWallet("vam@gamil.com", "1234456", "paytm");
		cart.checkOut(payment);
	}

}
