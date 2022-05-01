package com.dxc.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainForAutowire {
	public static void main(String[] args) {
		 ApplicationContext appContext = new ClassPathXmlApplicationContext("com/dxc/autowire/autowire-config.xml");
		 Emp employee = appContext.getBean("empobj",Emp.class);
		 System.out.println(employee);
	}
}
