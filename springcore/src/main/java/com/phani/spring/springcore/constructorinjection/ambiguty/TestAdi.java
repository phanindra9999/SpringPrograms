package com.phani.spring.springcore.constructorinjection.ambiguty;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAdi {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/phani/spring/springcore/constructorinjection/ambiguty/config.xml");
		Addition addition = (Addition) context.getBean("addition");
		System.out.println(addition);

	}

}
