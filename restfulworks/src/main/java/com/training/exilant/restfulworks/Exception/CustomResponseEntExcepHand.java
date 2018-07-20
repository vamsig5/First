package com.training.exilant.restfulworks.Exception;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;


@ControllerAdvice
@RestController
public class CustomResponseEntExcepHand extends ResponseEntityExceptionHandler {
//we want to have method wch can handle all exceptions
	@ExceptionHandler(Exception.class)
	public ResponseEntity<Object> handleAllExceptions(Exception ex,WebRequest request){
		ErrorDetails errorDetails=new ErrorDetails(new Date(), ex.getMessage(), request.getDescription(true));
		
		return new ResponseEntity<Object>(errorDetails, HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	@ExceptionHandler(UserNotFoundExpection.class)
	public ResponseEntity<Object> handleUserNotFoundExpection(Exception ex,WebRequest request){
		ErrorDetails errorDetails=new ErrorDetails(new Date(), ex.getMessage(), "sorry,user not found in DB");
		
		return new ResponseEntity<Object>(errorDetails, HttpStatus.NOT_FOUND);
	}
	
	
}
