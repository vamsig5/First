package com.training.microservices.currencyservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyConfigController {
	
	@Autowired
private Configuration configuration;

	@GetMapping("/currency")
	public Configuration retriveCurrencyConfig(){
		return new Configuration(configuration.getInr(),configuration.getUsd());
	}
	
}
