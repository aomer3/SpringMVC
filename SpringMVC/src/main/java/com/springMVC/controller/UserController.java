package com.springMVC.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.springMVC.dto.User;

@Controller
public class UserController {
	
	//Using ModelAndView (older method of sending and retrieving data from HTML to controller)
	
//	@RequestMapping("/registrationPage")
//	public ModelAndView showRegistrationPage() {
//		ModelAndView modelAndView = new ModelAndView();
//		modelAndView.setViewName("userReg");
//		
//		return modelAndView;
//	}
//	
//	@RequestMapping(value="/registerUser", method=RequestMethod.POST)
//	public ModelAndView registerUser(@ModelAttribute("user") User user) {
//		//Displaying the user data from HTML form, which @ModelAttribute has now 
//		//bound with the User object
//		System.out.println(user);
//		
//		ModelAndView modelAndView = new ModelAndView();
//		
//		//Send user to response page
//		modelAndView.setViewName("regResult");
//		modelAndView.addObject("user", user);
//		
//		return modelAndView;
//	}
	
	
	//Using ModelMap (decouples model and view, better to use this instead)
	
	@RequestMapping("/registrationPage")
	public String showRegistrationPage() {
		
		return "userReg";
	}
	
	@RequestMapping(value="/registerUser", method=RequestMethod.POST)
	public String registerUser(@ModelAttribute("user") User user, ModelMap model) {		
		
		model.addAttribute("user",user);
		return "regResult";
	}


}
