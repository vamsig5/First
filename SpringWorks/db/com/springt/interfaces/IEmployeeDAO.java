package com.springt.interfaces;

import java.util.List;

import javax.sql.DataSource;

import com.springt.entity.Employee;


public interface IEmployeeDAO {

	public Employee getEmployee(int empId);
	public List<Employee> getAllEmps();
	public void insertEmployee(Employee employee);
	public void deleteEmployee(int empId);
	public void updateEmployee(int empId,double empNewSalary);
	
	//datasource shall be injected from .xml file to class and that is mandate
	public void setDataSource(DataSource dataSource);
}
