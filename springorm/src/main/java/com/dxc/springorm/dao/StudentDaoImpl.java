package com.dxc.springorm.dao;

import java.util.List;
import java.util.Scanner;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.dxc.springorm.entity.Student;

public class StudentDaoImpl {
	
	private HibernateTemplate hibernateTemplate;
	
	@Transactional
	public int insert(Student student) {
		int result =(Integer) this.hibernateTemplate.save(student);
		return result;
	}
	
	public Student getStudent(int id) {
		Student student = this.hibernateTemplate.get(Student.class, id);
		return student;
	}
	
	public List<Student> getAllStudents(){
		List<Student> allStudents = this.hibernateTemplate.loadAll(Student.class);
		return allStudents;
	}
	
	@Transactional
	public boolean deleteStudent(int id) {
		Student student = this.hibernateTemplate.get(Student.class, id);
		if(student==null)
			return false;
		this.hibernateTemplate.delete(student);
		return true;
	}
	
	@Transactional
	public void update(Student student) {
		this.hibernateTemplate.update(student);
	}
	

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
	
	
	

}
