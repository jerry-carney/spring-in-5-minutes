package com.jerryc.spring.basics.springin5steps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.jerryc.spring.basics.springin5steps.basic.BinarySearchImpl;

@SpringBootApplication  //Automatically does a Component Scan the main class package
public class SpringIn5StepsApplication {
	
	//Your need to tell Spring about to wire beans together:
	//1. What are the beans that Spring has to manage? BinarySearchImpl, BubbleSortAlgo, QuickSoutAlgo
	//2. What are the dependencies of a bean? BinarySearchImpl->SortAlgorithm
	//3. Where to search for beans? (Component Scan) => No need, all of our code is in the same package

	public static void main(String[] args) {
		//BinarySearchImpl binarySearch = new BinarySearchImpl(new BubbleSortAlgorithm());
		//Application Context manages all the beans	
		ApplicationContext applicationContext = SpringApplication.run(SpringIn5StepsApplication.class, args);
		
		BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
		BinarySearchImpl binarySearch1 = applicationContext.getBean(BinarySearchImpl.class);
		System.out.println(binarySearch);
		System.out.println(binarySearch1);
		
		int result = binarySearch.binarySearch(new int[] {12,4,6}, 3);
		System.out.println(result);
	}

}
