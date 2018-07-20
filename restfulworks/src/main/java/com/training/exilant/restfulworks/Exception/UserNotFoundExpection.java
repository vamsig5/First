package com.training.exilant.restfulworks.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class UserNotFoundExpection extends RuntimeException {

	public UserNotFoundExpection() {
		super();
		
	}

	public UserNotFoundExpection(String message) {
		super(message);
		
	}

}
