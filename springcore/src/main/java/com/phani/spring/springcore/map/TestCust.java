package com.phani.spring.springcore.map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCust {

	public static void main(String[] args) {
		ApplicationContext con = new ClassPathXmlApplicationContext("config.xml");
		Customer customer = (Customer) con.getBean("customer");
		System.out.println(customer.getId());
		System.out.println(customer.getProducts());
		System.out.println(customer.getClass().getName());
		
	}

}
