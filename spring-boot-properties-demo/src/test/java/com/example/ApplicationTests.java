package com.example;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
@AutoConfigureMockMvc
public class ApplicationTests {
	
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
	private String keyFromApplicationPropertiesFile;
	
	@Value("${example.property-file.another-key:some default value}")
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
	 
//		@Value("#{${example.property-file.defaul-mapOfValues}['key1'] ?: 5}")
//		private Integer unknownMapKeyWithDefaultValue;

	
	@Test
	public void test_if_properties_are_being_set() {
		assertThat(this.valuesArray.length, is(3));
		assertThat(this.valuesArray[0], is("a"));
		assertThat(this.valuesArray[1], is("b"));
		assertThat(this.valuesArray[2], is("c"));
		
		assertThat(this.systemProperty, is("systemProeprtyValue"));
		assertThat(this.systemValueWithSpel, is("24hgjh23g423"));
		assertThat(this.conditionalValuesWithSpel, is("23b42m3"));
		
		//assertThat(this.systemPropertiesMap.size(), is(66));
		
		assertThat(this.keyFromRandomPropertiesFile, is("some value"));
		assertThat(this.keyFromApplicationPropertiesFile, is("value"));
		assertThat(this.keyWithDefaulValue, is("some default value"));
		assertThat(this.intValue, is(2892));
		
		assertThat(this.listOfValues.size(), is(4));
		assertThat(this.listOfValues.get(0), is("value"));
		assertThat(this.listOfValues.get(1), is("value1"));
		assertThat(this.listOfValues.get(2), is("value2"));
		assertThat(this.listOfValues.get(3), is("value3"));
		
		assertThat(this.mapOfValues.size(), is(3));
		assertThat(this.mapOfValues.get("key1"), is(1));
		assertThat(this.mapOfValues.get("key2"), is(2));
		assertThat(this.mapOfValues.get("key3"), is(3));

		assertThat(this.defaultMap.size(), is(2));
		assertThat(this.defaultMap.get("key1"), is(1));
		assertThat(this.defaultMap.get("key2"), is(2));
	}
}
