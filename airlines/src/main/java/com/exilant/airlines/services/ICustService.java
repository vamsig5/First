package com.exilant.airlines.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.exilant.airlines.model.Customer;
@Service
public interface ICustService {
public void saveCustomer(Customer customer);
public List<Customer> getAll();
public Customer getCustById(int CustId) ;
public void updateCustomer(Customer customer);
public void deleteCustomer(int custId);
public String hello();	

}
