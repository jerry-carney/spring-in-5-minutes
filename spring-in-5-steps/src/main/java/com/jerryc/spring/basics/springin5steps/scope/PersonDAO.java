package com.jerryc.spring.basics.springin5steps.scope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

//@Component
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
//@Component
@Repository
public class PersonDAO {
	
	@Autowired
	JdbcConnection jdbcConneciton;

	public JdbcConnection getJdbcConneciton() {
		return jdbcConneciton;
	}

	public void setJdbcConneciton(JdbcConnection jdbcConneciton) {
		this.jdbcConneciton = jdbcConneciton;
	}

}
