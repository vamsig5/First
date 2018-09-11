package com.exilant.blog.services;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exilant.blog.dao.UserRepository;
import com.exilant.blog.model.User;
@Service
public class LoginServiceImpl implements LoginService {

	@Autowired
	private UserRepository userrepo;
	@Override
	public boolean authenticate(String username, String password) {
		
	
		
		  return Objects.equals(username, password);
	}

}
