package com.exilant.blog.dao;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.redirectedUrl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;

import com.exilant.blog.model.User;

public class UserRepositoryCustImpl implements UserRepositoryCust{
	
	@Override
	public User fingByUsername(String UserName) {
		// TODO Auto-generated method stub
		return null;
	}

}
