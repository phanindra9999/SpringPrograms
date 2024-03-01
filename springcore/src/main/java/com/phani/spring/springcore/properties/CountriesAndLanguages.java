package com.phani.spring.springcore.properties;

import java.util.Properties;

public class CountriesAndLanguages {
	private Properties CountryAndLang;

	public Properties getCountryAndLang() {
		return CountryAndLang;
	}

	public void setCountryAndLang(Properties countryAndLang) {
		CountryAndLang = countryAndLang;
	}

	@Override
	public String toString() {
		return "CountriesAndLanguages [CountryAndLang=" + CountryAndLang + "]";
	}
	
	
}
