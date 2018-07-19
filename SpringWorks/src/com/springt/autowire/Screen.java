package com.springt.autowire;

import org.springframework.stereotype.Component;


public class Screen {

private int len;
private int bre;
private String glassType;

public String getGlassType() {
	return glassType;
}

public void setGlassType(String glassType) {
	this.glassType = glassType;
}

public Screen() {
System.out.println("Creating screen "+this);
}


public int getLen() {
	return len;
}

public void setLen(int len) {
	this.len = len;
}

public int getBre() {
	return bre;
}

public void setBre(int bre) {
	this.bre = bre;
}

}
