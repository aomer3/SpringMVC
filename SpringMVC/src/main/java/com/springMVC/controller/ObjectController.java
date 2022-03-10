package com.springMVC.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.springMVC.dto.Employee;

@Controller
public class ObjectController {
	
	@RequestMapping("/viewObject")
	public ModelAndView sendObject() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("displayObject");
		
		//Sending objects from controller to UI
		Employee employee = new Employee();
		employee.setId(123);
		employee.setName("Barack Obama");
		employee.setSalary(400000.0);
		
		modelAndView.addObject("employee", employee);
		
		return modelAndView;
	}

}
