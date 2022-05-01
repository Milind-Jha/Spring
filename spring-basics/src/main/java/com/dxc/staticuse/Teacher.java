package com.dxc.staticuse;

public class Teacher {
	
	int salary;
	
	public void teach() {
		System.out.println("teaching");
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Teacher salary = " + salary;
	}
	
	
	
}
