package com.springt.autowire;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component(value="camera")@Qualifier
public class Camera {
private String type;

public Camera() {
	System.out.println("creating camera "+this);
}

public String getType() {
	return type;
}

public void setType(String type) {
	this.type = type;
}

}
