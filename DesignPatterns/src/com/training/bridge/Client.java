package com.training.bridge;

public class Client {
public static void main(String[] args) {
	Shape triangle=new Triange(new Red());
	triangle.applyColor();
	Shape triangle1=new Triange(new Blue());
	triangle1.applyColor();
	Shape rectangle=new Rectangle(new Red());
	rectangle.applyColor();
}

}
