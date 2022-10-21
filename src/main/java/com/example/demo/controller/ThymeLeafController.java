package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ThymeLeafController {
	@GetMapping(value="/thymeleaf")
	public String displayMessage(Model model) {
		model.addAttribute("message", "Hello world!");
		return "thymeleaf/index";
	}
}
