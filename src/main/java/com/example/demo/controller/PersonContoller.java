package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Person;
import com.example.demo.servoces.PersonService;

@RestController
@RequestMapping("/person")
public class PersonContoller {

	@Autowired
	PersonService service;
	
	@RequestMapping("{id}" )
	public Person getId(@PathVariable("id")Integer id) {
		return service.getPerson(id);
	}
	
	@RequestMapping("/all")
	public List<Person> getAll(){
		return service.getAll();
		
	}
}    
