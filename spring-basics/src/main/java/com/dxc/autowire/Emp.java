package com.dxc.autowire;

public class Emp {
	private Address address;

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		System.out.println("value set by setter ");
		this.address = address;
	}

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Emp(Address address) {
		this.address = address;
		System.out.println("Paramatrized Constructor used");
	}

	@Override
	public String toString() {
		return "Emp details = " + address;
	}
	
}
