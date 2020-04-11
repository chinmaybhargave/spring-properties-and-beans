package com.example.config;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

@Configuration
@Import({BeanConfig.class})
@PropertySource("/randomFile.properties")
public class PropertiesConfig {
	
	// === system properties ====
	
	@Value("${example.system-property.valuesArray}")
	private String[] valuesArray;
	
	@Value("${example.system-property.systemProperty}")
	private String systemProperty;
	
	@Value("#{systemProperties['systemPropertyKey']}")
	private String systemValueWithSpel;
	
	@Value("#{systemProperties['systemPropertyKey2'] ?: 'default'}")
	private String conditionalValuesWithSpel;

	@Value("#{systemProperties}")
	private Map<String, String> systemPropertiesMap;
	
	// ==========================
	
	@Value("${example.random-file.key}")
	private String keyFromRandomPropertiesFile;
	
	@Value("${example.property-file.key}")
	private String key;
	
	@Value("${example.property-file.another-key: some default value}")
	private String keyWithDefaulValue;
	
	@Value("#{exampleBean.intValue}")
	private int intValue;
	
	@Value("#{'${example.property-file.listOfValues}'.split(',')}")
	private List<String> listOfValues;
	
	@Value("#{${example.property-file.mapOfValues}}")
	private Map<String, Integer> mapOfValues;
	
	@Value("#{${example.property-file.mapOfValues}.key1}")
	private Integer keyFromMap;
	
	@Value("#{${example.property-file.defaul-mapOfValues : {key1: '1', key2: '2'}}}")
	private Map<String, Integer> defaultMap;
	 
//	@Value("#{${example.property-file.defaul-mapOfValues}['key1'] ?: 5}")
//	private Integer unknownMapKeyWithDefaultValue;

}