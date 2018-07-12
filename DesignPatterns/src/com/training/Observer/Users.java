package com.training.Observer;

public class Users implements IObserver{
	
	
	
	
	private IObservable observable;
	private String name;
	
	
	//the constructor is a mapper b/w the enduser and the notification product
	
	public Users(IObservable observable,String name) {
		this.observable=observable;
		this.name=name;
		
	}
	
	
	@Override
	public void update() {
		buyMobile();
	}

	public void unSubscribe(IObserver observer){
		observable.remove(observer);;
	}



	public void buyMobile( ) {
System.out.println("huury buy   now "+name);		
	}

}
