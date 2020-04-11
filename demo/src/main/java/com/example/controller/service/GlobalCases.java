package com.example.controller.service;

public class GlobalCases {

	private Integer totalCases;
	private Integer totalFatal;
	public Integer getTotalCases() {
		return totalCases;
	}
	public void setTotalCases(Integer totalCases) {
		this.totalCases = totalCases;
	}
	public Integer getTotalFatal() {
		return totalFatal;
	}
	public void setTotalFatal(Integer totalFatal) {
		this.totalFatal = totalFatal;
	}
	public GlobalCases(Integer totalCases, Integer totalFatal) {
		super();
		this.totalCases = totalCases;
		this.totalFatal = totalFatal;
	}
	public GlobalCases() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
