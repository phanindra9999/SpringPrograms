package com.phani.spring.springcore.propertiesplaceholder;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestPro {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/phani/spring/springcore/propertiesplaceholder/config.xml");
		myDAO mydao = (myDAO) context.getBean("myDAO");
		System.out.println(mydao);
	}
}
