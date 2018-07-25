package com.exilant.airlines.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exilant.airlines.dao.IFlightDAO;
import com.exilant.airlines.model.Flight;
import com.exilant.airlines.model.Form;
@Service
public class FlightService implements IFlightServices {

	
	
	@Autowired
	IFlightDAO flightdao;
	
	
	@Override
	public void saveFlight(Flight flight) {
		flightdao.insertFlight(flight);
		
	}

	@Override
	public List<Flight> getAllFlights(Form form) {
		return flightdao.getAllFlights(form);
	}

	@Override
	public Flight getFlightbyId(int fid) {
		return flightdao.getFlightbyId(fid);
	}

	@Override
	public void deleteFlight(int fid) {
		
	}

}
