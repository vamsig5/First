package com.exilant.airlines.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exilant.airlines.dao.ILocationDAO;
import com.exilant.airlines.model.Location;
@Service
public class LocationService implements ILocationServices{

	
	@Autowired
	ILocationDAO locationdao;
	@Override
	public void saveLocation(Location location) {
		locationdao.insertLocation(location);
		
	}

	@Override
	public Location getLocationByName(String name) {
		return locationdao.getLocationByName(name);
	}

}
