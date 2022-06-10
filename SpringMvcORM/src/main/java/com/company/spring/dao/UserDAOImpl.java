package com.company.spring.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.company.spring.bean.User;

@Repository
public class UserDAOImpl {
	
	@Autowired
	private HibernateTemplate  hibernateTemplate;
	
	@Transactional
	public int saveUser(User user) {	
		int result =(Integer) this.hibernateTemplate.save(user);
		return result;
	}
	
	public List<User> getAllUsers(){
		List<User> allUsers = this.hibernateTemplate.loadAll(User.class);
		return allUsers;
	}

}
