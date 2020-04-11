package com.example.controller.service;

import java.util.ArrayList;

public class Report {

	private String pathogen;
	
	private String status;
	
	private GlobalCases globalCases;
	
	private AffectedLocations affectedLocations;
	
	public String getPathogen() {
		return pathogen;
	}
	public void setPathogen(String pathogen) {
		this.pathogen = pathogen;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public GlobalCases getGlobalCases() {
		return globalCases;
	}
	public void setGlobalCases(GlobalCases globalCases) {
		this.globalCases = globalCases;
	}
	public AffectedLocations getAffectedLocations() {
		return affectedLocations;
	}
	public void setAffectedLocations(AffectedLocations affectedLocations) {
		this.affectedLocations = affectedLocations;
	}
	public Report(String pathogen, String status, GlobalCases globalCases, AffectedLocations affectedLocations) {
		super();
		this.pathogen = pathogen;
		this.status = status;
		this.globalCases = globalCases;
		this.affectedLocations = affectedLocations;
	}
	public Report() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
}
