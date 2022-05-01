package com.dxc.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.dxc.staticuse.Teacher;

public class JavaConfigMain {
	public static void main(String[] args) {
		ApplicationContext appContext = new AnnotationConfigApplicationContext(JavaConfig.class);
		Student stObj = appContext.getBean("firstStudent",Student.class);
		Teacher teaObj = appContext.getBean("getTeacherObj",Teacher.class);
		stObj.setRollNo(61);
		stObj.study();
		System.out.println(stObj);
		teaObj.setSalary(100000);
		teaObj.teach();
		System.out.println(teaObj);
	}
}
