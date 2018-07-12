package com.training.Observer;


public interface IObservable {
public void adduser(IObserver observer);
public void remove(IObserver observer);
//all of those who r in list
public void notifyObserver();
}
