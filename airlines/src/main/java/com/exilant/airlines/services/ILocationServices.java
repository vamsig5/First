package com.exilant.airlines.services;

import org.springframework.stereotype.Service;

import com.exilant.airlines.model.Location;

@Service
public interface ILocationServices {
	public void saveLocation(Location location);
	public Location getLocationByName( String name);
}
