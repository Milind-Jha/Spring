package com.dxc.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class EkAurProduct {
	
	private String type;
	
	
	@Override
	public String toString() {
		return "EkAurProduct [type=" + type + "]";
	}

	public EkAurProduct() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EkAurProduct(String type) {
		super();
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	@PostConstruct
	public void start() {
		System.out.println("init");
	}
	
	@PreDestroy
	public void end() {
		System.out.println("destroyed");
	}

}
