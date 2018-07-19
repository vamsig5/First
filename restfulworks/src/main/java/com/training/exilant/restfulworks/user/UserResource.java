package com.training.exilant.restfulworks.user;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
public class UserResource {
@Autowired
private UserDAOService service;

	@GetMapping("/users")
	public List<User>getAllUsers() {
		return service.getAllUsers();
	}

	@GetMapping(path="/users/{userid}")
	public User getUser(@PathVariable int userid) {
		return service.getUser(userid);
	}
	@PostMapping("/users")
		public void createUser(@RequestBody User user){
		
		User savedUser=service.saveUser(user);
System.out.println(savedUser);
}
	
	
	@PostMapping("/usersv2")
	public User createUserResponseCode(@RequestBody User user) {
		User savedUser=service.saveUser(user);
		URI location=ServletUriComponentsBuilder.fromCurrentRequest().path("/userId").buildAndExpand(savedUser.getUserId()).toUri();
		return (User) ResponseEntity.created(location);
	}
}
