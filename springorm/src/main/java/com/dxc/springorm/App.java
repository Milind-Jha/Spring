package com.dxc.springorm;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dxc.springorm.dao.StudentDaoImpl;
import com.dxc.springorm.entity.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//         System.out.println( "Hello World!" );
//         Student student = new Student(3,"Arinjay","Mumbai");
         ApplicationContext appContext = new ClassPathXmlApplicationContext("config.xml");
         StudentDaoImpl stDao = appContext.getBean("studentDao",StudentDaoImpl.class);
//         int insert = stDao.insert(student);
//         System.out.println(insert);
         List<Student> allStudents = stDao.getAllStudents();
         for(Student st : allStudents) {
        	 System.out.println(st);
         }
         
         boolean deleteResult1 = stDao.deleteStudent(0);
         boolean deleteResult2 = stDao.deleteStudent(1);
         System.out.println(deleteResult1 + " : "+ deleteResult2);
         Student student = new Student(2,"simran","Kolkata");
         stDao.update(student);
         
         List<Student> allStudents1 = stDao.getAllStudents();
         for(Student st : allStudents1) {
        	 System.out.println(st);
         }  
    }
}
