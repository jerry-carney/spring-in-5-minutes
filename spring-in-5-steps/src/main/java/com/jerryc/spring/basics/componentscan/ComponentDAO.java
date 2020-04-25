package com.jerryc.spring.basics.componentscan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Component
public class ComponentDAO {
	
	@Autowired
	ComponentJdbcConnection componentJdbcConneciton;

	public ComponentJdbcConnection getComponentJdbcConnection() {
		return componentJdbcConneciton;
	}

	public void setComponentJdbcConnection(ComponentJdbcConnection componentJdbcConneciton) {
		this.componentJdbcConneciton = componentJdbcConneciton;
	}

}
