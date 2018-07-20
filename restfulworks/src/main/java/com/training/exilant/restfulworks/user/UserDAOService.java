package com.training.exilant.restfulworks.user;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ResponseBody;

@Component
public class UserDAOService {

	
	private static List<User> users=new ArrayList<>();
	
	static{
		users.add(new User(101, "vamsi", new Date()));
		users.add(new User(102, "uma", new Date()));
		users.add(new User(103, "hanu", new Date()));
	}
	public static int userCount=users.size()+100;
	public List<User> getAllUsers() {
		return users;
	}
	public User saveUser(User user) {

	if (user.getUserId() == null) {
		user.setUserId(++userCount);
	}	
	users.add(user);
	return user;
	}
	
	public User getUser(int userId){
		for (User user : users) {
			if (user.getUserId()==userId) {
				return user;
			}
		}return null;
	}
	
	public User deleteUser(int userId){
		return null;
	}
	public User updateUser(int userId){
		return null;
	}
	
	}
