package com.example.controller.service;

public class Countries {

	private String countryName;
	private String countryCode;
	private String continent;
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	public String getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	public String getContinent() {
		return continent;
	}
	public void setContinent(String continent) {
		this.continent = continent;
	}
	public Countries(String countryName, String countryCode, String continent) {
		super();
		this.countryName = countryName;
		this.countryCode = countryCode;
		this.continent = continent;
	}
	public Countries() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
