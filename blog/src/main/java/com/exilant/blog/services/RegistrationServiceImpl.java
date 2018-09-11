package com.exilant.blog.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exilant.blog.dao.UserRepository;
import com.exilant.blog.model.User;

@Service
public class RegistrationServiceImpl implements RegistrationService {

	@Autowired
	private UserRepository userrepo;
	@Override
	public String register(User user) {
		
		userrepo.save(user);
		return "success register";
	}

}
