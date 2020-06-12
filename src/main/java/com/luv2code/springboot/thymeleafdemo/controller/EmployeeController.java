package com.luv2code.springboot.thymeleafdemo.controller;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.luv2code.springboot.thymeleafdemo.model.Employee;

@Controller
@RequestMapping("/employees")
public class EmployeeController {

	// load employee date
	
	private List<Employee> employees;
	
	@PostConstruct
	private void loadData() {
		
		// create employees
		
		// create the list
		
		// add to the list
		
	}
	// add mapping for "/list"
	
}
