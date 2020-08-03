package com.me.spring.basics.springapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringappApplication
{
	public static void main(String[] args)
	{
		BinarySearchImpl binarySearch=new BinarySearchImpl(new BubbleSortAlgorithm());
        int result=binarySearch.binarySearch(new int [] {2,4,6,8},3);
        //com.me.spring.basics.springapp.BubbleSortAlgorithm@4cc77c2e

		SortAlgorithm sortAlgorithm=new BubbleSortAlgorithm();
		ComplexBusinessService complexBusinessService=new ComplexBusinessService(sortAlgorithm);

        System.out.println("Result  "+result);
		SpringApplication.run(SpringappApplication.class, args);
	}
}
