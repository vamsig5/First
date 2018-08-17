package com.training.exilant.restfulworks.user;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.Resource;
import org.springframework.hateoas.mvc.ControllerLinkBuilder;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;
import org.springframework.hateoas.mvc.ControllerLinkBuilderFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.training.exilant.restfulworks.Exception.UserNotFoundExpection;



@RestController
public class UserResource {
@Autowired
private UserDAOService service;

	@GetMapping("/users")
	public List<User> getAllUsers() {
		return service.getAllUsers();
	}

//	@GetMapping(path="/users/{userid}")
//	public User getUser(@PathVariable int userid) {
//		User getUser=service.getUser(userid);
//		if (getUser==null) {
//			throw new UserNotFoundExpection("id = "+userid);
//		}
//		return getUser;
//	}
	
	
	
	
//@PostMapping("/users")
//	public void createUser(@RequestBody User user){
//	
//		User savedUser=service.saveUser(user);
//System.out.println(savedUser);
//}
	
	
	@PostMapping("/usersv2")
	public ResponseEntity<Object> createUserResponseCode(@RequestBody User user) {
		System.out.println(user);
		User savedUser=service.saveUser(user);
		URI location=ServletUriComponentsBuilder.fromCurrentRequest().path("/{userId}").buildAndExpand(savedUser.getUserId()).toUri();
		return ResponseEntity.created(location).build();
	}



//////////////
@GetMapping(path="/usersv2/{userid}")
public User getUserv2(@PathVariable int userid) {
	User getUser=service.getUser(userid);
	if (getUser==null) {
		throw new UserNotFoundExpection("id = "+userid);
	}
	
	
	Resource<User> resource=new Resource<User>(getUser);
	
	ControllerLinkBuilder linkTo=new ControllerLinkBuilderFactory().linkTo(methodOn(this.getClass()).getAllUsers());
	resource.add(linkTo.withRel("all-users"));
	return getUser;
}

@PostMapping("/users2v")
public void createUserv2(@RequestBody User user){

User savedUser=service.saveUser(user);
System.out.println(savedUser);
Resource<User> resource=new Resource<User>(savedUser);

ControllerLinkBuilder linkTo=new ControllerLinkBuilderFactory().linkTo(methodOn(this.getClass()).getUserv2(savedUser.getUserId()));
resource.add(linkTo.withRel("select-User"));
}



}
