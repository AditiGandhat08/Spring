package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController 
{
	@RequestMapping("/dis")
	public String display() {
		return "Hello";
	}
	@RequestMapping("/hi")
	public String displayWorld() {
		return "HelloWorld";
	}

}
