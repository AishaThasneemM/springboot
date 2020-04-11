package com.example.controller.service;

import java.util.Map;

public class AffectedLocations {

	
	Map<String,TotalCount> totalCountMap ;

	public Map<String, TotalCount> getTotalCountMap() {
		return totalCountMap;
	}

	public void setTotalCountMap(Map<String, TotalCount> totalCountMap) {
		this.totalCountMap = totalCountMap;
	}

	public AffectedLocations(Map<String, TotalCount> totalCountMap) {
		super();
		this.totalCountMap = totalCountMap;
	}

	public AffectedLocations() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
