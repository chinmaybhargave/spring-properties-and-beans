package com.example.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.example.bean.ExampleCondtionalBean;

@Configuration
@ConditionalOnClass(name = "com.example.bean.ExampleCondtionalBean")
//@ConditionalOnClass(value=ExampleCondtionalBean.class)
public class ConditionalOnClassBeanConfig {
	
	@Bean
	public ExampleCondtionalBean testingConditonalOnClassByFullyQualifiedName() {
		return new ExampleCondtionalBean();
	}
	
	@Bean
	@Primary
	@ConditionalOnClass(name = "com.example.bean.ExampleCondtionalBean")
	public ExampleCondtionalBean testingConditonalOnClassByBeanName() {
		return new ExampleCondtionalBean();
	}
}