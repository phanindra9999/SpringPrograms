package com.phani.spring.springcore.constructorinjection;

public class Employee {
	private int id;
	private Adrress adrress;

	Employee(int id, Adrress adrress) {
		this.id = id;
		this.adrress = adrress;
	}

	public int getId() {
		return id;
	}

	public Adrress getAdrress() {
		return adrress;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", adrress=" + adrress + "]";
	}

}
