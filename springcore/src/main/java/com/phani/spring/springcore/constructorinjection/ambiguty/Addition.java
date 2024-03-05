package com.phani.spring.springcore.constructorinjection.ambiguty;

public class Addition {
	public Addition(int a, int b) {
		System.out.println("Inside the constructor INT");
	}

	public Addition(double a, double b) {
		System.out.println("Inside the constructor DOUBLE");
	}
	public Addition(String a, String b) {
		System.out.println("Inside the constructor DOUBLE");
	}
}
