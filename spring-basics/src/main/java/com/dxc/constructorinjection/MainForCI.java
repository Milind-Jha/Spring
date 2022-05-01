package com.dxc.constructorinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainForCI {
	public static void main(String[] args) {
		 ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/dxc/constructorinjection/config.xml");
		 Employee employeeObj = (Employee) applicationContext.getBean("employee1");
		 System.out.println(employeeObj);
		 Add additionObj = (Add) applicationContext.getBean("addobj");
		 additionObj.doSum();
	}
}
