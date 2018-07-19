package com.training.exilant.restfulworks.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.training.exilant.restfulworks.model.HelloWorld;

@RestController
public class HelloController {
	//@RequestMapping(method=RequestMethod.GET,path="hello")
	@GetMapping("/hello")
public String helloWorld(){
	return "Hello World";
}
	
	@GetMapping("/hellobean")
	public HelloWorld helloWorld1(){
		return new HelloWorld("Hello world");
	}
	
	//http://localhost/hello/vamsi
	@GetMapping(path="/hello/path/{name}")
	public HelloWorld helloPathVariable(@PathVariable String name){
		return new HelloWorld("Hello Mr."+name);
	}
}
