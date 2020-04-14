package com.example.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConditionalOnPropertyBeanConfig {
	
	@Bean
	@ConditionalOnProperty(prefix="example.conditional-on-property", name ="enabled", havingValue ="true")
	public String testingConditonalOnProperty() {
		return "SUCCESS-ConditionalOnProperty";
	}
	
	@Bean
	@ConditionalOnProperty(prefix="example.conditional-on-property", name ="key", havingValue ="true", matchIfMissing=true)
	public String testingConditonalOnPropertyMatchIfMissing() {
		return "SUCCESS-ConditionalOnProperty match if missing";
	}
}