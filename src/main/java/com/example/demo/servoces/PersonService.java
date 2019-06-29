package com.example.demo.servoces;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.example.demo.model.Person;

@Service
public class PersonService {
	
	//Map<Integer,Person> person=new HashMap<Integer,Person>();
	List<Person> person=new ArrayList<Person>(); 
	
	public  PersonService() {
	    Person govind=new Person();
	    govind.setId(1);
	    govind.setLastName("raut");
	    govind.setFistName("Goinda");
	    person.add(govind);
	    
	    Person anna=new Person();
	    anna.setId(2);
	    anna.setLastName("patil");
	    anna.setFistName("Annasaheb");
	    person.add(anna);
	    
	    Person jalu=new Person();
	    jalu.setId(3);
	    jalu.setLastName("Shinde");
	    jalu.setFistName("Jalindar");
	    person.add(jalu); 

	    Person sharad=new Person();
	    sharad.setId(4);
	    sharad.setLastName("Shinde");
	    sharad.setFistName("sharad");
	    
	    person.add(sharad);
	    
	    Person kanif=new Person();
	    kanif.setId(5);
	    kanif.setLastName("Shinde");
	    kanif.setFistName("kanif");
	    person.add(kanif);
	}
	public Person getPerson(Integer id) {
	 for(Person p:person) {
		 if(p.getId()==id)
			 return p;
	 }
		return null;
	}
	
	public List<Person> getAll() {
		return person;
		
	}

}
