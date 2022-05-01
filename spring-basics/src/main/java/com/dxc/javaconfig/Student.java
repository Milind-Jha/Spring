package com.dxc.javaconfig;

import org.springframework.stereotype.Component;

@Component("firstStudent")
public class Student {
	
	private int rollNo;
	
	public void study() {
		System.out.println("studying");
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	@Override
	public String toString() {
		return "Student rollNo=" + rollNo;
	}
	

}
