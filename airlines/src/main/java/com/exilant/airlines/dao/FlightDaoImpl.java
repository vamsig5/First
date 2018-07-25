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

import com.exilant.airlines.model.Customer;
import com.exilant.airlines.model.Flight;
import com.exilant.airlines.model.Form;
@Repository
@EnableTransactionManagement
public class FlightDaoImpl implements IFlightDAO {
	
	DataSource dataSource;
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public void insertFlight(Flight flight) {
		String sql="insert into Flight(fid,airline,startAirport,startTime,endAirport,endTime,price,count) "+"values (?,?,?,?,?,?,?)";
        jdbcTemplate.update(sql,flight.getFid(),flight.getAirline(),flight.getStartAirport(),flight.getStartTime(),flight.getEndAirport(),flight.getEndTime(),flight.getPrice(),flight.getCount());;
        System.out.println("Record Created: "+flight);
	}

	@Override
	public Flight getFlightbyId(int fid) {
        String sql="select * from Flight where id=?";
		
		Flight flight=jdbcTemplate.queryForObject(sql,new Object[]{fid}, new BeanPropertyRowMapper<Flight>(Flight.class));
		System.out.println("Flight is "+flight);
		return flight;
	}

	@Override
	public void deleteFlight(int fid) {

	}

	

	@Override
	public List<Flight> getAllFlights(Form form) {
		String sql="select * from Flight where startAirport="+form.getOrigin()+" and endAirport="+form.getDestination();
		   List<Flight> flightList=jdbcTemplate.query(sql, new ResultSetExtractor<List<Flight>>(){

			@Override
			public List<Flight> extractData(ResultSet rs) throws SQLException, DataAccessException {
				List<Flight> list=new ArrayList<Flight>();
				while (rs.next()) {
					Flight flight =new Flight();
					flight.setFid(rs.getString(1));
					flight.setAirline(rs.getString(2));
					flight.setStartAirport(rs.getString(3));
					flight.setStartTime(rs.getString(4));
					flight.setEndAirport(rs.getString(5));
					flight.setEndTime(rs.getString(6));
					flight.setPrice(rs.getInt(7));
					flight.setCount(rs.getInt(8));
					
				}
				
				
				return list;
			}
		   
		   });
		        
		return flightList;
	}
	
	
	
	@Override
	public void setDataSource(DataSource dataSource) {
		this.dataSource=dataSource;
	     this.jdbcTemplate=new JdbcTemplate(dataSource);
	}

}
