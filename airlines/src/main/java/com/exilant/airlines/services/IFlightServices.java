package com.exilant.airlines.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.exilant.airlines.model.Flight;
import com.exilant.airlines.model.Form;

@Service
public interface IFlightServices {
	public void saveFlight(Flight flight);
	public List<Flight> getAllFlights(Form form);
	public Flight getFlightbyId(int fid);
	public void deleteFlight(int fid);
}
