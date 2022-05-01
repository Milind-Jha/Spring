package com.dxc.autowire.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Emp {
	
	@Autowired
	@Qualifier("addObj2")
	private Address address;

	public Address getAddress() {
		return address;
	}
	//@Autowired
	public void setAddress(Address address) {
		System.out.println("value set by setter ");
		this.address = address;
	}

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}

	//@Autowired
	public Emp(Address address) {
		this.address = address;
		System.out.println("Paramatrized Constructor used");
	}

	@Override
	public String toString() {
		return "Emp details = " + address;
	}
	
}
