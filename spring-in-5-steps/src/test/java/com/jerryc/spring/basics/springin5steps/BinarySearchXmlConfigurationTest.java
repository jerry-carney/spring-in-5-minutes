package com.jerryc.spring.basics.springin5steps;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.jerryc.spring.basics.springin5steps.basic.BinarySearchImpl;

@ExtendWith(SpringExtension.class)
//@ContextConfiguration(classes= {SpringIn5StepsBasicApplication.class}) //Java Context
@ContextConfiguration(locations="/applicationContext.xml") //XML Context
public class BinarySearchXmlConfigurationTest {
	
	@Autowired
	BinarySearchImpl binarySearch;

	@Test
	public void testBasicScenario() {
		System.out.println("******HEY JERRY: " + binarySearch);
		int result = binarySearch.binarySearch(new int[] {}, 5);
		assertEquals(3, result);
	}

}
