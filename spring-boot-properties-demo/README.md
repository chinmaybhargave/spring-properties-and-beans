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

[TODO] 
- @EnableConfigurationProperties Vs @Import
