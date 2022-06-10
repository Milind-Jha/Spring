package com.company.spring.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.company.spring.bean.User;
import com.company.spring.service.UserServiceImpl;

@Controller
public class HomeController {

	@Autowired
	private UserServiceImpl userServiceImpl;

	@RequestMapping(path = "/login", method = RequestMethod.POST)
	public String showLoginPage() {
		return "input1";
	}

	@RequestMapping(path = "/signup", method = RequestMethod.POST)
	public String showSignUpPage() {
		return "signUp";
	}

	@RequestMapping(path = "/processforlogin", method = RequestMethod.POST)
	public ModelAndView login(@ModelAttribute("user") User user) {
		ModelAndView mView = new ModelAndView();
		if (!userServiceImpl.checkUser(user)) {
			mView.addObject("status","User Not Registered " );
			mView.setViewName("signUp");
		}
		else if (userServiceImpl.checkPassword(user)) {
			mView.addObject("user", user);
			mView.addObject("inboxmails", new Random().nextInt(500));
			mView.setViewName("success");
		} else {
			mView.setViewName("failure");
		}
		return mView;
	}

//	@RequestMapping(path = "/processforsignup", method = RequestMethod.POST)
//	public ModelAndView signUp(@ModelAttribute("user") User user) {
//		ModelAndView mView = new ModelAndView();
//		if (!userServiceImpl.checkUser(user)) {
//			mView.addObject("user", user);
//			mView.addObject("nos", new Random().nextInt(500));
//			mView.setViewName("signUpSuccess");
//			this.userServiceImpl.createUser(user);
//		}
//
//		else {
//			if (userServiceImpl.checkPassword(user)) {
//				mView.addObject("status","User Already Registered " );
//				mView.setViewName("input1");
//			} else {
//				mView.setViewName("failure");
//			}
//		}
//		return mView;
//	}
	
	@RequestMapping(path = "/processforsignup", method = RequestMethod.POST)
	public String signUp(@RequestParam("name") String name, @RequestParam("email") String email,
			@RequestParam("password") String password, Model model) {	
		User user = new User();
		user.setName(name);
		user.setEmail(email);
		user.setPassword(password);
		if (!userServiceImpl.checkUser(user)) {
			this.userServiceImpl.createUser(user);
			model.addAttribute("user", user);
			return "signUpSuccess";
			}
		else {
			if (userServiceImpl.checkPassword(user)) {
				model.addAttribute("status","User Already Registered " );
				return "input1";
			} 
			else {
				return "failure";
			}
		}
	}
}
