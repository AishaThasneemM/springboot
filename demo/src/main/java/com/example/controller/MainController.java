package com.example.controller;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;

import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.apache.kafka.common.serialization.StringDeserializer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.controller.beans.Employee;
import com.example.controller.beans.Person;
import com.example.controller.repository.EmployeeRepository;

@RestController
public class MainController {
	
	@Autowired
	private EmployeeRepository repository;
	
	@GetMapping("/rest/employee/get/{id}")
	public Employee getEmployeeByID(@PathVariable("id") int id) {
		return repository.retrieve(id);
	}
	
	@GetMapping("/rest/employee/getAll")
	//Returning is List is supported with JSON response only
	//If you want XML, then add a wrapper class as Root XML element, for example EmployeeList
	public List<Employee> getAllEmployees() {
		return repository.getAll();
	}

	@PostMapping("/rest/employee/create")
	public Employee createEmployee(@RequestBody Employee emp) {
		repository.store(emp);
		return emp;
	}
	
	@GetMapping("/rest/employee/search/{name}")
	public Employee getEmployeeByName(@PathVariable("name") String name) {
		return repository.search(name);
	}
	
	@DeleteMapping("/rest/employee/delete/{id}")
	public Employee deleteEmployeeByID(@PathVariable("id") int id) {
		return repository.delete(id);
	}
	
	
	@Autowired
	private Person person;
	
	@RequestMapping("/")
	public String healthCheck() {
		return "OK";
	}
	
	@RequestMapping("/person/get")
	public Person getPerson(@RequestParam(name="name", required=false, defaultValue="Unknown") String name) {
		person.setName(name);
		return person;
	}
	
	@RequestMapping(value="/person/update", method=RequestMethod.POST)
	public Person updatePerson(@RequestParam(name="name", required=true) String name) {
		
		person.setName("my name is " + name);
		return person;
	}
}
