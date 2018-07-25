package com.exilant.airlines.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.exilant.airlines.model.Flight;
import com.exilant.airlines.model.Form;
@Repository
@EnableTransactionManagement
public interface IFlightDAO {
public void insertFlight(Flight flight);
public List<Flight> getAllFlights(Form form);
public Flight getFlightbyId(int fid);
public void deleteFlight(int fid);
public void setDataSource(DataSource dataSource);

}
