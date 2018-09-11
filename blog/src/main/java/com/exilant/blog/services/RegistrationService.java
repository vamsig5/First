package com.exilant.blog.services;

import org.springframework.stereotype.Service;

import com.exilant.blog.model.User;
@Service
public interface RegistrationService {
public String register(User user);
}
