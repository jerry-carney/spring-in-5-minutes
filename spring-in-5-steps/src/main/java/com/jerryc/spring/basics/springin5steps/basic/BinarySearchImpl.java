package com.jerryc.spring.basics.springin5steps.basic;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class BinarySearchImpl {
	//Sorting an Array
	//Search the Array
	//Return the result (index in array)
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	@Qualifier("quick")
	private SortAlgorithm sortAlgorithm;
	
//  CONSTRUCTOR INJECTION
//	public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
//		super();
//		this.sortAlgorithm = sortAlgorithm;
//	}

//	SETTER INJECTION
//	public void setSortAlgorithm(SortAlgorithm sortAlgorithm) {
//		this.sortAlgorithm = sortAlgorithm;
//	}

	public int binarySearch(int[] numbers, int numberToSearchFor) {
		
		int[] sortedNumbers = sortAlgorithm.sort(numbers);
		System.out.println(sortAlgorithm);
		
		return 3;	
	}
	
	@PostConstruct
	public void postConstructInit() {
		logger.info("postConstructInit- do further initialization of the BinarySearchImpl bean");
	}
	
	@PreDestroy
	public void preDestroyStuff() {
		logger.info("preDestroyStuff- do further cleanup before the BinarySearchImpl bean is removed from IOC Container");
	}

}
