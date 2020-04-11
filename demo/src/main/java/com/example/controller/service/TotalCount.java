package com.example.controller.service;

public class TotalCount {

	
	private Integer cases;
	private Integer fatal;
	private Integer newCase;
	private Integer newFatal;
	public Integer getCases() {
		return cases;
	}
	public void setCases(Integer cases) {
		this.cases = cases;
	}
	public Integer getFatal() {
		return fatal;
	}
	public void setFatal(Integer fatal) {
		this.fatal = fatal;
	}
	public Integer getNewCase() {
		return newCase;
	}
	public void setNewCase(Integer newCase) {
		this.newCase = newCase;
	}
	public Integer getNewFatal() {
		return newFatal;
	}
	public void setNewFatal(Integer newFatal) {
		this.newFatal = newFatal;
	}
	public TotalCount(Integer cases, Integer fatal, Integer newCase, Integer newFatal) {
		super();
		this.cases = cases;
		this.fatal = fatal;
		this.newCase = newCase;
		this.newFatal = newFatal;
	}
	public TotalCount() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}
