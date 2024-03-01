package com.phani.spring.springcore.assign;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestShop {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		ShoppingCart shoppingcart = (ShoppingCart) context.getBean("shoppingcart");
		System.out.println(shoppingcart);
	}

}
