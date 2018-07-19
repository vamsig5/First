package com.springt.profile;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
@Configuration
@Profile("Production")
public class ProdDataBaseConfig implements DataBaseConfig {
    @Bean
	@Override
	public DataSource createDataSource() {
		DriverManagerDataSource dataSource=new DriverManagerDataSource();
		System.out.println("creating production Database Instance");		
		/*set properties here*/
		
		
		
		return dataSource;
	}

}
