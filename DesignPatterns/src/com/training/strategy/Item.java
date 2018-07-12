package com.training.strategy;

public class Item {
private String itemCode;
private int price;
private int quantity;
public Item(String itemCode, int  price,int  quantity) {
	super();
	this.itemCode = itemCode;
	this.price = price;
	this.quantity = quantity;
}
@Override
public String toString() {
	return "Item [itemCode=" + itemCode + ", price=" + price + ", quantity=" + quantity + "]";
}
public String getItemCode() {
	return itemCode;
}
public void setItemCode(String itemCode) {
	this.itemCode = itemCode;
}
public int  getPrice() {
	return price;
}
public void setPrice(int  price) {
	this.price = price;
}
public int  getQuantity() {
	return quantity;
}
public void setQuantity(int  quantity) {
	this.quantity = quantity;
}

}
