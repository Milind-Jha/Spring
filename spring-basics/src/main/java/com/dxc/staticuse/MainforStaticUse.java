package com.dxc.staticuse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dxc.reference.First;

public class MainforStaticUse {
	public static void main(String[] args) {
		 ApplicationContext appContext = new ClassPathXmlApplicationContext("com/dxc/staticuse/staticuse-config.xml");
		 AnyClass anyClassObj = appContext.getBean("anyClass",AnyClass.class);
		 System.out.println(anyClassObj); 
	}
}
