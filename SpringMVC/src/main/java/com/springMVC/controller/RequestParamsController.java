package com.springMVC.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.springMVC.dto.User;

@Controller
public class RequestParamsController {

	@RequestMapping("/showData")
	// The @RequestParam parameter should match the HTML form element name where
	// data is coming from
	public ModelAndView showData(@RequestParam("id") int id, 
			                     @RequestParam("name") String name,
			                     @RequestParam(value="email", required=false, defaultValue="no email provided") String email) {
		
		User user = new User();
		user.setId(id);
		user.setName(name);
		user.setEmail(email);
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("regResult");		
		modelAndView.addObject("user", user);
		
		return modelAndView;

	}

}
 