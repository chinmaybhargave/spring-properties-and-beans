package com.example.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.SearchStrategy;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.example.bean.ExampleBean;

@Configuration
@Import(BeanConfig.class)
public class ConditionalOnBeanConfig {
	
	
	@Bean
	@ConditionalOnBean(name= {"primary-example-bean"})
	public String testingConditionalOnBeanByName() {
		return "SUCCESS-ConditionalOnBeanByName";
	}
	
	@Bean
	@ConditionalOnBean(value= ExampleBean.class)
	public String testingConditionalOnBeanByValue() {
		return "SUCCESS-ConditionalOnBeanByValue";
	}
	
	@Bean
	@ConditionalOnBean(type= "com.example.bean.ExampleBean")
	public String testingConditionalOnBeanByType() {
		return "SUCCESS-ConditionalOnBeanByType";
	}
	
	@Bean
	@ConditionalOnMissingBean(name= {"primary-example-bean"})
	public String testingConditionalOnMissingBeanByName() {
		return "BEAN-NOT-CREATED";
	}
	
	@Bean
	@ConditionalOnMissingBean(value= ExampleBean.class)
	public String testingConditionalOnMissingBeanByValue() {
		return "BEAN-NOT-CREATED";
	}
	
	@Bean
	@ConditionalOnMissingBean(type= "com.example.bean.ExampleBean")
	public String testingConditionalOnMissingBeanByType() {
		return "BEAN-NOT-CREATED";
	}
	
	@Bean
	@ConditionalOnMissingBean(search = SearchStrategy.CURRENT)
	public String testingConditionalOnMissingBeanBySearch() {
		//SearchStrategy.ANCESTORS
		//SearchStrategy.CURRENT
		//SearchStrategy.ALL
		return "SUCCESS";
	}
}
