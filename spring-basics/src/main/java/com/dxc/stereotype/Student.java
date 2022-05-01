package com.dxc.stereotype;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("anyName")
@Scope("prototype")
public class Student {
	

	private String name;
	@Value("32")
	private int roll_no;
	@Value("Los Santos")
	private String city;
	@Value("#{kuchBhi}")
	private List<String> homies;
	
	public List<String> getHomies() {
		return homies;
	}
	public void setHomies(List<String> homies) {
		this.homies = homies;
	}
	public String getName() {
		return name;
	}
	@Value("Mike")
	public void setName(String name) {
		System.out.println("setName triggerred");
		this.name = name;
	}
	public int getRoll_no() {
		return roll_no;
	}
	public void setRoll_no(int roll_no) {
		System.out.println("setRoll triggerred");
		this.roll_no = roll_no;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		System.out.println("setCity triggerred");
		this.city = city;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", roll_no=" + roll_no + ", city=" + city + "]";
	}
		
}
