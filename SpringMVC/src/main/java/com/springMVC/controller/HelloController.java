package com.springMVC.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	
	@RequestMapping("/hello")
	public ModelAndView hello() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("hello");
		
		//Sending primitives from controller to UI
		modelAndView.addObject("id", 498);
		modelAndView.addObject("name", "Derek Johnson");
		modelAndView.addObject("salary", 120000);
		return modelAndView;
	}
	
}
