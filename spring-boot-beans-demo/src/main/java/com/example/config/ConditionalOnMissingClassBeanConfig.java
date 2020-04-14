package com.example.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnMissingClass(value="com.example.bean.RandomMissingClass")
public class ConditionalOnMissingClassBeanConfig {
	
	@Bean
	public String testingConditonalOnMissingClass() {
		return "BEAN-NOT-CREATED";
	}
}