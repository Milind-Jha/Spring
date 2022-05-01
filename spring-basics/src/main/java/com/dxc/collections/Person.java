package com.dxc.collections;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Person {
	
	private String name;
	private List<String> phones;
	private Set<String> property;
	private Map<String,Integer> qualification;
	public String getName() {
		return name;
	}
	 
	
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Person(String name, List<String> phones, Set<String> property, Map<String, Integer> qualification) {
		super();
		this.name = name;
		this.phones = phones;
		this.property = property;
		this.qualification = qualification;
	}


	public void setName(String name) {
		this.name = name;
	}
	public List<String> getPhones() {
		return phones;
	}
	public void setPhones(List<String> phones) {
		this.phones = phones;
	}
	public Set<String> getProperty() {
		return property;
	}
	public void setProperty(Set<String> property) {
		this.property = property;
	}
	public Map<String, Integer> getQualification() {
		return qualification;
	}
	public void setQualification(Map<String, Integer> qualification) {
		this.qualification = qualification;
	}
	
	
}
