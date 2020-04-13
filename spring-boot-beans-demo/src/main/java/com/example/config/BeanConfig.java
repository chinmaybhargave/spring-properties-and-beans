package com.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.Primary;

import com.example.bean.ExampleBean;

@Configuration
@ImportResource("classpath:/spring-beans.xml")
public class BeanConfig {
	
	@Primary
	@Bean("primary-example-bean")
	public ExampleBean exampleBean() {
		return new ExampleBean();
	}
}
