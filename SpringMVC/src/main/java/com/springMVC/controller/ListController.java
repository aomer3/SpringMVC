package com.springMVC.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.springMVC.dto.Employee;

@Controller
public class ListController {
	
	@RequestMapping("/viewList")
	public ModelAndView sendList() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("displayList");
		
		//Sending collections from controller to UI
		ArrayList<Employee> employees = new ArrayList();
		
		Employee emp1 = new Employee();
		emp1.setId(1);
		emp1.setName("Barack Obama");
		emp1.setSalary(1200000.0);
		employees.add(emp1);
		
		Employee emp2 = new Employee();
		emp2.setId(2);
		emp2.setName("Bill Clinton");
		emp2.setSalary(8600000.0);
		employees.add(emp2);
		
		Employee emp3 = new Employee();
		emp3.setId(3);
		emp3.setName("Joe Biden");
		emp3.setSalary(4000000.0);
		employees.add(emp3);
		
		modelAndView.addObject("employees", employees);
		
		return modelAndView;
	}

}
