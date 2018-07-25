package com.exilant.airlines.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.exilant.airlines.model.Customer;
@Repository
@Component
public interface ICustomerDAO {
public Customer getCustomerbyId(int custId);
public List<Customer> getAll();
public void insertCustomer(Customer customer);
public void updateCustomer(Customer customer);
public void deleteCustomer(int custId);
public void setDataSource(DataSource dataSource);
public String hello();
}
