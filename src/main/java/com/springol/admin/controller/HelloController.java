package com.springol.admin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.springol.service.UserService;

@Controller
public class HelloController {
	@Autowired
	private UserService userService;
	
	@GetMapping("/hello")
	public String hello(Model model) {
		model.addAttribute("users", userService.getAll());
		return "hello";
	}
}
