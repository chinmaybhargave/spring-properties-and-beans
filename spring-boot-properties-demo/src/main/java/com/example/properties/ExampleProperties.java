package com.example.properties;

import java.time.LocalDate;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix="example.class")
public class ExampleProperties {
	
	private String someProperty;
	
	private LocalDate startDate;

	public String getSomeProperty() {
		return someProperty;
	}

	public void setSomeProperty(String someProperty) {
		this.someProperty = someProperty;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}
}