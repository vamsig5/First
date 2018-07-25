package com.exilant.airlines.dao;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.exilant.airlines.model.Flight;
import com.exilant.airlines.model.Location;
@Repository
public class LocationDAOImpl implements ILocationDAO {
DataSource dataSource;
@Autowired
private JdbcTemplate jdbcTemplate;
	@Override
	public void insertLocation(Location location) {
		 String sql="insert into Location(lname,city,country) "+"values (?,?,?)";
	        jdbcTemplate.update(sql,location.getName(),location.getCity(),location.getCountry());
	        System.out.println("Record Created: "+location);

	}

	@Override
	public Location getLocationByName(String name) {
		 String sql="select * from Location where lname=?";
			
			Location location=jdbcTemplate.queryForObject(sql,new Object[]{name}, new BeanPropertyRowMapper<Location>(Location.class));
			System.out.println("Flight is "+location);
			return location;
	}
@Override
	public void setDataSource(DataSource dataSource){
		this.dataSource=dataSource;
	     this.jdbcTemplate=new JdbcTemplate(dataSource);

	}

}
