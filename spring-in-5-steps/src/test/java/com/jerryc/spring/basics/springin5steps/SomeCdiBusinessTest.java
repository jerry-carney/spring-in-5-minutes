package com.jerryc.spring.basics.springin5steps;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.jerryc.spring.basics.springin5steps.cdi.SomeCdiBusiness;
import com.jerryc.spring.basics.springin5steps.cdi.SomeCdiDao;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes= {SpringIn5StepsCdiApplication.class})
public class SomeCdiBusinessTest {
	
	@Autowired
	SomeCdiBusiness business;
	
	@Mock
	SomeCdiDao daoMock;
	
	@InjectMocks
	SomeCdiBusiness businessMock;
	
	@Test  // Regular JUnit-5 Test
	public void testBasicScenario() {
		System.out.println("******HEY JERRY: " + business);
		int result = business.findTheGreatestFromAllData();
		assertEquals(100, result);
	}
	
	@Test  // Mock Test
	public void testMockScenario() {
		when(daoMock.getData()).thenReturn(new int[] {24, 15, 3});
		assertEquals(24, businessMock.findTheGreatestFromAllData());
	}
	
	@Test  // Mock Test
	public void testMockScenarioNull() {
		when(daoMock.getData()).thenReturn(new int[] {});
		assertEquals(Integer.MIN_VALUE, businessMock.findTheGreatestFromAllData());
	}
	
	@Test  // Mock Test
	public void testMockScenarioAllEqual() {
		when(daoMock.getData()).thenReturn(new int[] {19, 19, 19});
		assertEquals(19, businessMock.findTheGreatestFromAllData());
	}
	
	@Test  // Mock Test
	public void testMockScenarioZero() {
		when(daoMock.getData()).thenReturn(new int[] { 0 });
		assertEquals(0, businessMock.findTheGreatestFromAllData());
	}
	
}
