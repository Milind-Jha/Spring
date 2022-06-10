package com.company.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.spring.bean.User;
import com.company.spring.dao.UserDAOImpl;

@Service
public class UserServiceImpl {
	
	@Autowired
	private UserDAOImpl userDAOImpl;
	
	public int createUser(User user) {	
		return this.userDAOImpl.saveUser(user);
	}
	public boolean checkPassword(User user) {
		List<User> allUsers = userDAOImpl.getAllUsers();
		for(User u : allUsers) {
			if(u.getEmail().equals(user.getEmail())&&u.getPassword().equals(user.getPassword()))
				return true;
		}
		
		return false;
	}
	public boolean checkUser(User user) {
		List<User> allUsers = userDAOImpl.getAllUsers();
		for(User u : allUsers) {
			if(u.getEmail().equals(user.getEmail())||u.getName().equals(user.getName()))
				return true;
		}
		
		return false;
	}
}
