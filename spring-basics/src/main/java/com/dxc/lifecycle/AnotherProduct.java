package com.dxc.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class AnotherProduct implements InitializingBean,DisposableBean {
	private double price;
	
	
	public AnotherProduct() {
		super();
		// TODO Auto-generated constructor stub
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "AnotherProduct : price=" + price;
	}

	public void afterPropertiesSet() throws Exception {
		// init
		System.out.println("initialization");	
	}

	public void destroy() throws Exception {
		// destroy
		System.out.println("desytoying");
	}
	
	
	
	
	
}
