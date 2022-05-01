package com.dxc.constructorinjection;

public class Add {
	private int a;
	private int b;
	public Add(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}
	
	public void doSum() {
		System.out.println(a+b);
	}
}
