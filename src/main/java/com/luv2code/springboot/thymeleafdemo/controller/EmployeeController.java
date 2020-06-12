package com.luv2code.springboot.thymeleafdemo.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.luv2code.springboot.thymeleafdemo.entiry.Employee;

@Controller
@RequestMapping("/employees")
public class EmployeeController {

	
	// add mapping for "/list"
	@GetMapping("/list")
	public String listEmployee(Model theModel) {
		
		// add to the spring model
		theModel.addAttribute("employees", theEmployees);
		
		return "list-employees";
	}
}
