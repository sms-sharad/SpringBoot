package com.example.demo.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Person {
 
	private int id;
	private String fistName;
	private String lastName;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFistName() {
		return fistName;
	}
	public void setFistName(String fistName) {
		this.fistName = fistName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
}
