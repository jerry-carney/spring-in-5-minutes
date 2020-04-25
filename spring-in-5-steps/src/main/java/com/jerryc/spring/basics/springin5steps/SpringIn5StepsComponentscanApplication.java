package com.jerryc.spring.basics.springin5steps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.jerryc.spring.basics.componentscan.ComponentDAO;
//import com.jerryc.spring.basics.componentscan.ComponentJdbcConnection;

@SpringBootApplication
@ComponentScan("com.jerryc.spring.basics.componentscan")
public class SpringIn5StepsComponentscanApplication {
	
	private static Logger LOGGER = LoggerFactory.getLogger(SpringIn5StepsComponentscanApplication.class);
	
	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(SpringIn5StepsComponentscanApplication.class, args);
		
		ComponentDAO componentDAO = applicationContext.getBean(ComponentDAO.class);
		ComponentDAO componentDAO1 = applicationContext.getBean(ComponentDAO.class);
		
		LOGGER.info("{}", componentDAO);
		LOGGER.info("{}", componentDAO.getComponentJdbcConnection());
		LOGGER.info("{}", componentDAO1);
		LOGGER.info("{}", componentDAO1.getComponentJdbcConnection());
	}

}
