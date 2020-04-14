package com.example.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnExpression;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.bean.ExampleCondtionalBean;

@Configuration
@ConditionalOnExpression(value = "${example.config.enabled}")
//@ConditionalOnExpression(value = "${example.config.enabled} and ${some-other.property}")
//@ConditionalOnExpression(value = "${example.config.enabled} or ${some-other.property}")
//@ConditionalOnExpression(value = "${example.config.enabled:true} and ${some-other.property:true}")
//@ConditionalOnExpression("'${example.config.enabled}'.equals('yes}')")
//@ConditionalOnExpression("#{T(com.example.bean.ExampleBean).getIntValue() eq 999}")
//@ConditionalOnExpression("#{T(com.example.bean.ExampleBean).getIntValue()?.equals(999)}")
public class ConditionalOnExpressionBeanConfig {
	
	@Bean
	public ExampleCondtionalBean testingConditonalOnExpressionByFullyQualifiedName() {
		return new ExampleCondtionalBean();
	}
	
}
