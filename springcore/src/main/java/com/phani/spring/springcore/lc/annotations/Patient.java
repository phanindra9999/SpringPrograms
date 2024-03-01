package com.phani.spring.springcore.lc.annotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Patient {
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	@PostConstruct
	public void hi() {
		System.out.println("This is Hi method");
	}
	
	@PreDestroy
	public void bye() {
		System.out.println("This is Bye method");
	}

	@Override
	public String toString() {
		return "Patient [id=" + id + "]";
	}

}
