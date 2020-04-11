package com.example.controller.service;

import java.util.ArrayList;

public class WorldCount {
	
	
	private String totalCountries;
	
	private ArrayList<Countries> countries;

	public String getTotalCountries() {
		return totalCountries;
	}

	public void setTotalCountries(String totalCountries) {
		this.totalCountries = totalCountries;
	}

	public ArrayList<Countries> getCountries() {
		return countries;
	}

	public void setCountries(ArrayList<Countries> countries) {
		this.countries = countries;
	}

	public WorldCount(String totalCountries, ArrayList<Countries> countries) {
		super();
		this.totalCountries = totalCountries;
		this.countries = countries;
	}

	public WorldCount() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	

}
