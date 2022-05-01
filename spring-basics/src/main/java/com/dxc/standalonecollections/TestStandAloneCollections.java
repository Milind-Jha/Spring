package com.dxc.standalonecollections;

import java.util.TreeMap;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestStandAloneCollections {
	public static void main(String[] args) {
		 ApplicationContext appContext = new ClassPathXmlApplicationContext("com/dxc/standalonecollections/standalone-config.xml");
		 Pojo pojo_obj = appContext.getBean("pojo1",Pojo.class);
		 System.out.println(pojo_obj);
		 System.out.println(pojo_obj.getMembers().getClass());
		 System.out.println(pojo_obj.getSkills().getClass());
		 
	}
}
