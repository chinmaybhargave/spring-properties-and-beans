package com.example.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

@Configuration
@Import({BeanConfig.class})
@PropertySource("classpath:/randomFile.properties")
public class PropertiesConfig {
	
}