package com.springmvc.controller;

import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.springmvc.bean.User;

@Controller
public class DetailsController {

	@RequestMapping("/login")
	public String show() {
		return "input1";
	}

	@RequestMapping(path = "/process", method = RequestMethod.POST)
	public ModelAndView takeInput(@RequestParam("firstname") String fName, @RequestParam("lastname") String lName,
			@RequestParam("eMailId") String email, @RequestParam("pass") String password) {
		ModelAndView modelAndView = new ModelAndView();
		StringBuffer reverseName = new StringBuffer(fName+lName).reverse();
		String[] split = email.split("@");
		if(password.equals(reverseName.toString())|| password.equals("abc")) {
			User user = new User();
			user.setName(fName+" "+lName);
			user.setUserName(split[0]);
			user.setEmail(email);
			modelAndView.addObject("userBean", user);
			modelAndView.addObject("inboxmails", ""+new Random().nextInt(500));
			modelAndView.setViewName("success");
		}
		else {
			modelAndView.setViewName("input1");
		}
		return modelAndView;
	}
	
//	@RequestMapping("/process")
//	public String takeInput(@RequestParam("firstname") String fName, @RequestParam("lastname") String lName,
//			@RequestParam("eMailId") String email, @RequestParam("pass") String password,Model model) {
//	
//		StringBuffer reverseName = new StringBuffer(fName+lName).reverse();
//		String[] split = email.split("@");
//		if(password.equals(reverseName.toString())|| password.equals("abc")) {
//			model.addAttribute("firstName", fName);
//			model.addAttribute("lastName", lName);
//			model.addAttribute("username", split[0]);
//			model.addAttribute("inboxmails", new Random().nextInt(500));
//			return "success";
//		}
//		else {
//			return "failure";
//		}
//		
//	}

}
