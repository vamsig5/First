package com.springt.autowire;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Configuration
@PropertySource("classpath=./mobileinfo.properties")
public class MobConfig {

	public Mobile mobile;
}
