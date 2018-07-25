package com.exilant.airlines.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.ResponseBody;

import com.exilant.airlines.model.Customer;
@Repository
@EnableTransactionManagement
public class CustomerDAOImpl implements ICustomerDAO {
  
	 DataSource dataSource;
	
	@Autowired
private JdbcTemplate jdbcTemplate;
	@Override
	public Customer getCustomerbyId(int custId) {
        System.out.println("in dao part");
		String sql="select * from Customer where  custid=?";
		
		Customer cust=jdbcTemplate.queryForObject(sql,new Object[]{custId}, new BeanPropertyRowMapper<Customer>(Customer.class));
		System.out.println("customer is "+cust);
		return cust;
	}

	@Override
	public List<Customer> getAll() {
		 String sql="select * from Customer";
		   List<Customer> custList=jdbcTemplate.query(sql, new ResultSetExtractor<List<Customer>>(){
		        

				

				@Override
				public List<Customer> extractData(ResultSet rs) throws SQLException, DataAccessException {
					List<Customer> list=new ArrayList<Customer>();	
					while (rs.next()) {
						Customer customer=new Customer();
						customer.setCustId(rs.getInt(1));
						customer.setCustName(rs.getString(2));
						customer.setEmail(rs.getString(3));
						customer.setMobile(rs.getString(4));
						customer.setGender(rs.getString(5));
						customer.setAge(rs.getInt(6));
						list.add(customer);
					}
					
					return list;
				}

		       });
			return custList;	
			}

	@Override
	public void insertCustomer(Customer customer) {
		 String sql="insert into Customer(custid,custname,email,mobile,gender,age) "+"values (?,?,?,?,?,?)";
	        jdbcTemplate.update(sql,customer.getCustId(),customer.getCustName(),customer.getEmail(),customer.getMobile(),customer.getGender(),customer.getAge());
	        System.out.println("Record Created: "+customer);

	}

	@Override
	public void updateCustomer(Customer customer) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteCustomer(int custId) {
		String sql="delete from Customer where custid = ?";
	    jdbcTemplate.update(sql, new Object[] {  custId });
	    System.out.println("deleted successfully");

	}

	@Override
	public void setDataSource(DataSource dataSource) {
		this.dataSource=dataSource;
	     this.jdbcTemplate=new JdbcTemplate(dataSource);
	}

	@Override
	public String hello() {
		// TODO Auto-generated method stub
		return "welcome to dao";
	}

}
