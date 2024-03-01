package com.phani.spring.springcore.DependencyAndScopeAssign;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUni {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/phani/spring/springcore/DependencyAndScopeAssign/config.xml");

		University university = (University) context.getBean("university");
		System.out.println(university);

		University university1 = (University) context.getBean("university");
		System.out.println(university1.hashCode());
		University university2 = (University) context.getBean("university");
		System.out.println(university2.hashCode());

	}

}
