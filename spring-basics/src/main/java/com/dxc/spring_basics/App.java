package com.dxc.spring_basics;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dxc.springcore.springbasics.bean.Student;

public class App 
{
    public static void main( String[] args )
    {
    	System.out.println( "Hello World!" );
    	ApplicationContext applicationContext = new ClassPathXmlApplicationContext("config.xml");
    	Student studentobj1 = (Student) applicationContext.getBean("student1");
        Student studentObj2 = (Student) applicationContext.getBean("student2");
        System.out.println(studentobj1); 
        System.out.println(studentObj2);
        System.out.println(studentobj1.hashCode()); 
        System.out.println(studentObj2.hashCode());
    }
}
