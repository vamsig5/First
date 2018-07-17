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
		buyMobile(observable);
	}

	public void unSubscribe(IObserver observer){
		observable.remove(observer);;
	}



	public void buyMobile(IObservable observable ) {
		if(observable.getClass().getName().contains("Oneplus6T")){
			System.out.println("huury buy Oneplus6T  now "+name);
		}else if(observable.getClass().getName().contains("Iphone")){
			System.out.println("hurry buy Iphone6T  now "+name);
		}
		
		
	}

}
