package com.training.Observer;

public class Client {
public static void main(String[] args) {
	IObservable observable=new Oneplus6T();
	IObserver user1= new Users(observable, "vam");
	observable.adduser(user1);
	user1.update();
	
	IObservable observable1=new Iphone();
	IObserver user2= new Users(observable1, "raj");
	observable1.adduser(user2);
	user2.update();
}
}
