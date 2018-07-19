package com.springt.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.springt.employee.Employee;
import com.springt.interfaces.IEmployeeDAO;

public class EmployeeDAO implements IEmployeeDAO {
	
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplate;

	@Override
	public Employee getEmployee(int empId) {
		String sql="select * from Employee";
		Employee emp=jdbcTemplate.queryForObject(sql,new Object[]{empId}, new BeanPropertyRowMapper<Employee>(Employee.class));
		return null;
	}

	@Override
	public List<Employee> getAllEmps() {
		return null;
	}

	@Override
	public void insertEmployee(Employee employee) {
        String sql="insert into Employee(empid,empname,empsal) "+"values (?,?,?)";
        jdbcTemplate.update(sql,employee.getEmpId(),employee.getEmpName(),employee.getEmpSal());
        System.out.println("Record Created: "+employee);
	}

	@Override
	public void deleteEmployee(int empId) {

	}

	@Override
	public void updateEmployee(int empId, double empNewSalary) {

	}

	@Override
	public void setDataSource(DataSource dataSource) {
     this.dataSource=dataSource;
     this.jdbcTemplate=new JdbcTemplate(dataSource);
	}
	

}
