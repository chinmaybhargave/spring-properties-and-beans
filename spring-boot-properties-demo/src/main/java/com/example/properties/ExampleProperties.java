package com.example.properties;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix="example.class")
public class ExampleProperties {
	
	private String someProperty;
	
	private LocalDate startDate;

	private Map<String,String> keyValue = new HashMap<>();
	
	private Map<String,ChildProperty> childProperty = new HashMap<>();
	
	public static class ChildProperty{
		
		private String key;
		
		private String keyTwo;

		public String getKey() {
			return key;
		}

		public void setKey(String key) {
			this.key = key;
		}

		public String getKeyTwo() {
			return keyTwo;
		}

		public void setKeyTwo(String keyTwo) {
			this.keyTwo = keyTwo;
		}
	}
	
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

	public Map<String,String> getKeyValue() {
		return keyValue;
	}

	public void setKeyValue(Map<String,String> keyValue) {
		this.keyValue = keyValue;
	}

	public Map<String,ChildProperty> getChildProperty() {
		return childProperty;
	}

	public void setChildProperty(Map<String,ChildProperty> childProperty) {
		this.childProperty = childProperty;
	}
}