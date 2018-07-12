package com.training.bridge;


//this shall be treated as abstract class
//since the reference of the color is kept here


//every shape shall have color
public abstract class Shape {

	private IColor color;

	protected IColor getColor() {
		return color;
	}

	public Shape(IColor color) {
		this.color = color;
	}


	
	public abstract void applyColor();
	
}
