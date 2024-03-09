package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Form {
	
	@RequestMapping("/")
	public String viewForm() {
		return "form.html";
	}
	
	@RequestMapping("/register")
	public ModelAndView register(@ModelAttribute RegisterBean rb, ModelAndView m) {
		m.addObject("rb", rb);
		m.setViewName("register.html");
		return m;
	}
}
