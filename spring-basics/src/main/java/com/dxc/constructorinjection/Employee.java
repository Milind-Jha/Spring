package com.dxc.constructorinjection;

public class Employee {
	private int emp_id;
	private String name;
	private Resume resume;
	
	
	public Employee(int emp_id, String name, Resume resume) {
		this.emp_id = emp_id;
		this.name = name;
		this.resume=resume;
		System.out.println("Constructor Invoked ");
	}


	@Override
	public String toString() {
		return "Employee [emp_id=" + emp_id + ", name=" + name + ", resume=" + resume + "]";
	}


	
	
	
	

}
