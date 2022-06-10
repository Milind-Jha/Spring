package com.company.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class SearchController {
	
	@RequestMapping("/searchingoogle")
	public RedirectView search(@RequestParam("keyword") String keyword) {
		String url = "https://www.google.com/search?q="+keyword;
		RedirectView view = new RedirectView();
		view.setUrl(url);
		return view;
	}
}
