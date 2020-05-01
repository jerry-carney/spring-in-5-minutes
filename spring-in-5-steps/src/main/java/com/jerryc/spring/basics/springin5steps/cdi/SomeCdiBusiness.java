package com.jerryc.spring.basics.springin5steps.cdi;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;

import javax.inject.Inject;
import javax.inject.Named;

//@Component
@Named
public class SomeCdiBusiness {
	
	//@Autowired
	@Inject
	SomeCdiDao someCdiDao;

	public SomeCdiDao getSomeCdiDao() {
		return someCdiDao;
	}

	public void setSomeCdiDao(SomeCdiDao someCdiDao) {
		this.someCdiDao = someCdiDao;
	}
	
	public int findTheGreatestFromAllData() {
		int[] data = someCdiDao.getData();
		int greatest = Integer.MIN_VALUE;
		for (int value : data) {
			if (value > greatest) {
				greatest = value;
			}
		}
		return greatest;
	}
}
