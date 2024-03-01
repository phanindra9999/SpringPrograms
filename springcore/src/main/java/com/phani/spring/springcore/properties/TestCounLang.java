package com.phani.spring.springcore.properties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCounLang {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		CountriesAndLanguages countlang = (CountriesAndLanguages) context.getBean("contriesandlanguages");
		System.out.println(countlang.getCountryAndLang());
		System.out.println(countlang.getClass().getName());
	}

}
