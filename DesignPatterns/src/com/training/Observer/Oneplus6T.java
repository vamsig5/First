package com.training.Observer;

import java.util.ArrayList;
import java.util.List;

public class Oneplus6T implements IObservable {
	
	private List<IObserver> users;
	private boolean isArrived=true;

	public Oneplus6T() {
		
		users = new ArrayList<IObserver>();	}

	@Override
	public void adduser(IObserver observer) {
		users.add(observer);

	}

	@Override
	public void remove(IObserver observer) {
users.remove(observer);	}

	@Override
	public void notifyObserver() {
for (IObserver temp : users) {
	temp.update();
}
	}
	
	
	
	public boolean isArrived(){
		return isArrived;
	}
	public void setArrived(boolean isArrived){
		this.isArrived=isArrived;
		notifyObserver();
	}

}
