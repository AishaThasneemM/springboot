package com.example.controller.repository;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.example.controller.beans.Employee;

@Repository
public class EmployeeRepository implements ObjectRepository<Employee> {

	
	private Map<Integer, Employee> repository;
	
	public EmployeeRepository() {
		this.repository = new HashMap<>();
	}
	
	@Override
	public void store(Employee emp) {
		repository.put(emp.getId(), emp);
		
	}

	@Override
	public Employee retrieve(int id) {
		return repository.get(id);
	}
	
	public ArrayList<Employee> getAll() {
		Collection<Employee> empsAll = repository.values();
		ArrayList<Employee> listOfValues = new ArrayList<Employee>(empsAll);
		return listOfValues;
	}

	@Override
	public Employee search(String name) {
		Collection<Employee> emps = repository.values();
		for (Employee emp : emps) {
			if (emp.getName().equalsIgnoreCase(name))
				return emp;
		}
		return null;
	}

	@Override
	public Employee delete(int id) {
		Employee e = repository.get(id);
		this.repository.remove(id);
		return e;
	}

}
