package com.springt.profile;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

//DEV-ORACLE
@Profile("Development")
@Configuration
public class DevDataBaseConfig implements DataBaseConfig{

	@Override
	@Bean
	public DataSource createDataSource() {
		DriverManagerDataSource dataSource=new DriverManagerDataSource();
		System.out.println("creating Development Database Instance");		
		
		
		
		
		return dataSource;
	}

}
