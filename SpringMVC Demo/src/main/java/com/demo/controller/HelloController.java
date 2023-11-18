package com.demo.controller;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.test.web.ModelAndViewAssert;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	@RequestMapping("/dis")
	public String display() {
		return "Hello";
	}
	@RequestMapping("/show")
	public String show() {
		return "Hi";
	}
	@RequestMapping("/displaydata")
		public ModelAndView displaydata() {
			String emailid="aditi2gmail.com";
			return new ModelAndView("Data","email",emailid);
		}
	
	@RequestMapping("/List")
	public ModelAndView displayList() {
		List <String> foodlist=new ArrayList<>();
		foodlist.add("Pizza");
		foodlist.add("Burger");
		foodlist.add("Pasta");
		//return new ModelAndView("FoodList","list",foodlist);
		
		ModelAndView model= new ModelAndView("FoodList");
		model.addObject("list",foodlist);
		return model;
		
	}
	@RequestMapping("/pass")
	public String displaydata(Model m) {
		String password="pass@123";
		m.addAttribute("pass",password);
		return "Data";
	}

	@RequestMapping("/emp")
	public ModelAndView addEmployee() {
		
		return new ModelAndView("AddEmployee","command", new Employee()); 
	}
	
	@RequestMapping(value="/save", method= RequestMethod.POST)
	public void saveEmployee(@ModelAttribute Employee emp, HttpServletResponse resp) throws IOException {
		PrintWriter out=resp.getWriter();
		out.print(emp);
	}
	
	@RequestMapping("/cus")
	public ModelAndView addCustomer() {
		
		return new ModelAndView("AddCustomer","command", new Customer()); 
	}
	
	@RequestMapping(value="/saved", method= RequestMethod.POST)
	public void savedCustomer(@ModelAttribute Customer cus, HttpServletResponse resp) throws IOException {
		PrintWriter out=resp.getWriter();
		out.print(cus);
	}
	
	}


