package com.training.bridge;

public class Triange extends Shape{

	public Triange(IColor color) {
		super(color);
		System.out.println("triangle created");
	}

	@Override
	public void applyColor() {
  System.out.println("Triangle is applied with color ");	
   getColor().applyColor();
	}

}
