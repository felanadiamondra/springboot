package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController { 
	public HomeController() {
		super();
	}
	
	@GetMapping(value = "/hello") 
	public ModelAndView sayHello(@RequestParam(value="nom" , required=false) String nom, ModelAndView model) {
		//model.addAttribute("nom", "wick");
		model.setViewName("hello");
		model.addObject("nom", "wick");
		return model;
	}
	
	//@RequestMapping(value = "/hello", method =RequestMethod.GET) 
	//public String sayHello() {
	//	return "hello.jsp";
	//}
}