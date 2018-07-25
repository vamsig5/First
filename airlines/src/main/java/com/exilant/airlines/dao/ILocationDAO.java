package com.exilant.airlines.dao;

import javax.sql.DataSource;

import com.exilant.airlines.model.Location;

public interface ILocationDAO {
public void insertLocation(Location location);
public Location getLocationByName( String name);
public void setDataSource(DataSource dataSource);

}
