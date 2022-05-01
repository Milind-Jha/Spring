package com.dxc.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LifeCycleMain {
	public static void main(String[] args) {
		  AbstractApplicationContext appContext = new ClassPathXmlApplicationContext("com/dxc/lifecycle/lifecycle-config.xml");
		  
		  appContext.registerShutdownHook();
//		  Product product = (Product) appContext.getBean("obj1");
//		  System.out.println(product);
//		  AnotherProduct anotherProduct = (AnotherProduct) appContext.getBean("obj2");
//		  System.out.println(anotherProduct);
		  EkAurProduct ekAurProduct = (EkAurProduct)appContext.getBean("obj3");
		  System.out.println(ekAurProduct);
	}
}
