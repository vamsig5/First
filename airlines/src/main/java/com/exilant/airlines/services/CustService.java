package com.exilant.airlines.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exilant.airlines.dao.ICustomerDAO;
import com.exilant.airlines.model.Customer;
@Service
public class CustService implements ICustService  {
	
	@Autowired
 ICustomerDAO customerdao;
	@Override
	public void saveCustomer(Customer customer) {
		customerdao.insertCustomer(customer);

	}

	@Override
	public Customer getCustById(int custId) {
	System.out.println("in service");
		
		System.out.println(custId);
		return customerdao.getCustomerbyId(custId);
	}

	@Override
	public void updateCustomer(Customer customer) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteCustomer(int custId) {
		customerdao.deleteCustomer(custId);

	}

	@Override
	public String hello() {
		// TODO Auto-generated method stub
		return customerdao.hello();
	}

	@Override
	public List<Customer> getAll() {
		
		return customerdao.getAll();
	}

}
