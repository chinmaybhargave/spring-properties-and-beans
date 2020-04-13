## spring-boot-properties-demo

This demo application demonstrates the usage of various properties/configurations which are loaded from various sources.

- JVM arguments
- application.properties
- random properties file in resources folder
- cloud [bootstrap.yml has the required configuration]
	Below properties needs to be passed to application via JVM arguments. 	

	spring.cloud.config.server.git.username
	spring.cloud.config.server.git.password

SpringBoot : 2.2.6.RELEASE <br/>
Spring Cloud Config Server : 2.2.1.RELEASE <br/>

 
## NOTES
- @EnableConfigurationProperties : This enables @ConfigurationProperties. This is a convenient way to quickly register @ConfigurationProperties annotated beans.

- @Import : This is a convenient way to quickly register @Configuration annotated beans.

- @ConfigurationPropertiesBinding : The ConfigurationPropertiesBindingPostProcessor is responsible to bind all external properties to the beans annotated with @ConfigurationProperties. This BeanPostProcessor also detects custom converters (besides the default ones) annotated with @ConfigurationPropertiesBinding for type conversion. This annotation enables us to map non-primitive data type properties to the Java Class by adding custom converters. For example, if we have mapped a date in string format to any property key and we want to convert that date in string format to any other format, say LocalDate. This can be achieved with by adding the mentioned annotation on Converter class.

