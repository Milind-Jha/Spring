package com.dxc.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StereoTypeMain {
	public static void main(String[] args) {
		ApplicationContext appContext = new ClassPathXmlApplicationContext("com/dxc/stereotype/stereo-config.xml");
		 Student stObj = appContext.getBean("anyName",Student.class);
		 Student st1 = appContext.getBean("anyName",Student.class);
		 Student st2 = appContext.getBean("anyName",Student.class);
		 System.out.println(stObj+"\t"+st1+"\t"+st2);
		 System.out.println(stObj.getHomies()+"\t"+st1.getHomies()+"\t"+st2.getHomies());
		 System.out.println(stObj.getHomies().getClass());
		 System.out.println(stObj.hashCode());
		 System.out.println(st2.hashCode());
		 System.out.println(st1.hashCode());
	}
}
