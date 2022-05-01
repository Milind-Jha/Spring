package com.dxc.reference;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainForReference {
	public static void main(String[] args) {
		  ApplicationContext appContext = new ClassPathXmlApplicationContext("com/dxc/reference/referance-config.xml");
		  First firstObj = (First) appContext.getBean("aref");
		  System.out.println(firstObj.getX());
		  System.out.println(firstObj.getSecond().getY());
		 
	}
}
