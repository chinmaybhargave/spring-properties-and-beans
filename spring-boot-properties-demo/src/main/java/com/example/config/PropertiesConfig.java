package com.example.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

import com.example.properties.ExampleProperties;

@Configuration
@Import({BeanConfig.class, ExampleProperties.class})
@PropertySource("classpath:/randomFile.properties")
public class PropertiesConfig {
	
}