package com.training.bridge;

public class Rectangle  extends Shape{

	public Rectangle(IColor color) {
		super(color);
	}

	@Override
	public void applyColor() {
		System.out.println("Rectangle is applied with color");
		getColor().applyColor();
	}

}
