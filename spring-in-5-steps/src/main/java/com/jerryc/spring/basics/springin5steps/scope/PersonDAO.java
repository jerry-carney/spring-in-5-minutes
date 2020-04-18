package com.jerryc.spring.basics.springin5steps.scope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
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
