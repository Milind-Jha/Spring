package com.dxc.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainForCollection {
	public static void main(String[] args) {
		 ApplicationContext appContext = new ClassPathXmlApplicationContext("com/dxc/collections/personConfig.xml");
		  Person personObject = (Person)appContext.getBean("person1");
		  System.out.println(personObject.getName());
		  System.out.println(personObject.getPhones());
		  System.out.println(personObject.getProperty());
		  System.out.println(personObject.getQualification());
	}
}
