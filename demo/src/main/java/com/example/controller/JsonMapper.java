package com.example.controller;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.example.controller.service.AffectedLocations;
import com.example.controller.service.Countries;
import com.example.controller.service.GlobalCases;
import com.example.controller.service.Report;
import com.example.controller.service.TotalCount;
import com.example.controller.service.WorldCount;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonMapper {

	
	
	public static void main(String[] args) throws JsonProcessingException {
		JsonMapper jsonMapper = new JsonMapper();
		jsonMapper.methodOne();
		jsonMapper.methodTwo();
		
	}
	
	public void methodOne() throws JsonProcessingException {
		ObjectMapper objectMapper = new ObjectMapper();
		Report report = new Report();
		report.setPathogen("covid19");
		report.setStatus("Pandemic");
		report.setGlobalCases(new GlobalCases(10000, 1000));
		
		Map<String,TotalCount> totalCountMap = new HashMap<String,TotalCount>();
		totalCountMap.put("India", new TotalCount(1000, 100, 10, 1));
		totalCountMap.put("UAE", new TotalCount(2000, 200, 40, 15));
		totalCountMap.put("USA", new TotalCount(5000, 500, 345, 165));
					
		report.setAffectedLocations(new AffectedLocations(totalCountMap));
		
		String reportJson = objectMapper.writeValueAsString(report);
		System.out.println(reportJson);
	}
	
	
	public void methodTwo() throws JsonProcessingException {
		ObjectMapper objectMapper = new ObjectMapper();
		
		WorldCount worldCount = new WorldCount();
		worldCount.setTotalCountries("200");
		
		ArrayList<Countries> countries = new ArrayList<Countries>();
		countries.add(new Countries("India", "IND", "Asia"));
		countries.add(new Countries("France", "FRA", "Europe"));
		countries.add(new Countries("Canada", "CAD", "North America"));
		
		worldCount.setCountries(countries);
	
		System.out.println(objectMapper.writeValueAsString(worldCount));;
	}
	
	
}
