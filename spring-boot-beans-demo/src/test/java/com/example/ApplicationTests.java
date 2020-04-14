package com.example;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.bean.ExampleBean;
import com.example.bean.ExampleImportBean;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class,
properties = { "example.config.enabled=true",
		"example.conditional-on-property.enabled=true" })
public class ApplicationTests {

	@Autowired
	private ExampleBean exampleBean;
	
	@Autowired
	@Qualifier("primary-example-bean")
	private ExampleBean primaryExampleBean;
	
	
	@Autowired
	private ExampleImportBean exampleImportBean;
	
	@Autowired
	private List<String> listOfConditionalBeans;
	
	@Test
	public void test_beans() {
		assertNotNull(exampleBean);
		assertNotNull(exampleImportBean);
		assertNotNull(primaryExampleBean);
		assertEquals(listOfConditionalBeans.size(), 6);
	}
}
