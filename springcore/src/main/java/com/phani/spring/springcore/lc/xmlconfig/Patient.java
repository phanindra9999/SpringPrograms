package com.phani.spring.springcore.lc.xmlconfig;

public class Patient {
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void hi() {
		System.out.println("This is Hi method");
	}

	public void bye() {
		System.out.println("This is Bye method");
	}

	@Override
	public String toString() {
		return "Patient [id=" + id + "]";
	}

}
