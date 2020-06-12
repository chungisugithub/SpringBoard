package com.luv2code.springboot.thymeleafdemo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Controller
public class DemoController {

	// create mapping for "/hello"
	public String sayHello(Model theModel) {
		
		theModel.addAttribute("theDate", new java.util.Date());
		
		return "helloworld";
		
	}
}
