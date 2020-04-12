package com.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.bean.ExampleBean;

@Configuration
public class BeanConfig {
	
	@Bean
	public ExampleBean exampleBean() {
		ExampleBean bean = new ExampleBean();
		bean.setIntValue(2892);
		return bean;
	}
}
