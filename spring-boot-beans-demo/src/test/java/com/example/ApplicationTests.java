package com.example;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.bean.ExampleBean;
import com.example.bean.ExampleImportBean;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
@AutoConfigureMockMvc
public class ApplicationTests {

	@Autowired
	private ExampleBean exampleBean;
	
	@Autowired
	@Qualifier("primary-example-bean")
	private ExampleBean primaryExampleBean;
	
	
	@Autowired
	private ExampleImportBean exampleImportBean;
	
	@Test
	public void test_beans() {
		assertNotNull(exampleBean);
		assertNotNull(exampleImportBean);
		assertNotNull(primaryExampleBean);
	}
}
