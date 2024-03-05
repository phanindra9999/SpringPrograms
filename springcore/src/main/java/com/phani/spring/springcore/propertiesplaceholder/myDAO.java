package com.phani.spring.springcore.propertiesplaceholder;

public class myDAO {
	private String dbServer;
	
	myDAO(String dbServer){
		this.dbServer = dbServer;
	}

	@Override
	public String toString() {
		return "myDAO [dbServer=" + dbServer + "]";
	}
}
