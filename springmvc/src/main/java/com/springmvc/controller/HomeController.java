package com.springmvc.controller;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	Random randm = new Random();
	@RequestMapping("/hom")
	public String home() {
		return "page1";
	}
	
	@RequestMapping("/about")
	public String aboutMethod(Model model) {
		LocalDate localDate = LocalDate.now();
		LocalDateTime localDateTime = LocalDateTime.now();
		DateTimeFormatter dTimeFormatter = DateTimeFormatter.ofPattern( "yyyy-MM-dd HH:mm:ss a");
		String exactTime = localDateTime.format(dTimeFormatter); 
		String time = localDate.toString();
		model.addAttribute("exactTime", exactTime);
		model.addAttribute("time", time);
		List<Integer> numbers = new ArrayList<Integer>();
		
		numbers.add(randm.nextInt(100));
		numbers.add(randm.nextInt(100));
		numbers.add(randm.nextInt(100));
		numbers.add(randm.nextInt(100));
		model.addAttribute("nos", numbers);
		return "page2";
	}
	
	@RequestMapping("/help")
	public ModelAndView helpMethod() {
		
		ModelAndView mv = new ModelAndView();
		List<Integer> numbers = new ArrayList<Integer>();
		numbers.add(randm.nextInt(100));
		numbers.add(randm.nextInt(100));
		numbers.add(randm.nextInt(100));
		numbers.add(randm.nextInt(100));
		mv.addObject("nos", numbers);
		mv.setViewName("page3");
		
		
		return mv;
	}
}
