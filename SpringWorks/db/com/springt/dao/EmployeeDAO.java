package com.springt.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.core.env.SystemEnvironmentPropertySource;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

import com.springt.entity.Employee;
import com.springt.interfaces.IEmployeeDAO;

public class EmployeeDAO implements IEmployeeDAO {
	
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplate;

	@Override
	public Employee getEmployee(int empId) {

	
		String sql="select * from Employee where empid=?";
		Employee emp=jdbcTemplate.queryForObject(sql,new Object[]{empId}, new BeanPropertyRowMapper<Employee>(Employee.class));
		
		return emp;
		
	}

	@Override
	public List<Employee> getAllEmps() { 
   String sql="select * from Employee";
   List<Employee> empList=jdbcTemplate.query(sql, new ResultSetExtractor<List<Employee>>(){
        

		@Override
		public List<Employee> extractData(ResultSet rs) throws SQLException, DataAccessException {
			
			List<Employee> list = new ArrayList<Employee>();
			while (rs.next()){
				Employee employee=new Employee();
				employee.setEmpId(rs.getInt(1));
				employee.setEmpName(rs.getString(2));
				employee.setEmpSal(rs.getDouble(3));
				list.add(employee);
			}
			return list;
		}

       });
	return empList;	
	}
	

	@Override
	public void insertEmployee(Employee employee) {
        String sql="insert into Employee(empid,empname,empsal) "+"values (?,?,?)";
        jdbcTemplate.update(sql,employee.getEmpId(),employee.getEmpName(),employee.getEmpSal());
        System.out.println("Record Created: "+employee);
	}

	@Override
	public void deleteEmployee(int empId) {
		String sql="delete from Employee where empid = ?";
    jdbcTemplate.update(sql, new Object[] {  empId });
    System.out.println("deleted successfully");
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
