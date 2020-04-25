package com.jerryc.spring.basics.springin5steps.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SomeExternalService {
	
	//external.service.url, from app.properties
	@Value("${external.service.url}")
	private String url;
	
	public String returnServiceURL() {
		return url;
	}

}
