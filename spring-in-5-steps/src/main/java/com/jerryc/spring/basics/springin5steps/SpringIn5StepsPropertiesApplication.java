package com.jerryc.spring.basics.springin5steps;

//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.jerryc.spring.basics.springin5steps.properties.SomeExternalService;

@Configuration
@ComponentScan
@PropertySource("classpath:app.properties")
public class SpringIn5StepsPropertiesApplication {
	
	public static void main(String[] args) {
		
		try (AnnotationConfigApplicationContext applicationContext =
			new AnnotationConfigApplicationContext(SpringIn5StepsPropertiesApplication.class)) {
		
			SomeExternalService someExternalService = applicationContext.getBean(SomeExternalService.class);
			System.out.println(someExternalService.returnServiceURL());

		}
	}

}
