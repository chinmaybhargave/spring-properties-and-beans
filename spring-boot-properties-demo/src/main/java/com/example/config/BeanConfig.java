package com.example.config;

import java.time.LocalDate;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.converter.Converter;

import com.example.bean.ExampleBean;
import com.example.converter.LocalDateConverter;

@Configuration
public class BeanConfig {
	
	@Bean
	public ExampleBean exampleBean() {
		ExampleBean bean = new ExampleBean();
		bean.setIntValue(2892);
		return bean;
	}
	
	@Bean
	public Converter<String, LocalDate> stringToLocalDateConverter() {
		return new LocalDateConverter();
	}
}
