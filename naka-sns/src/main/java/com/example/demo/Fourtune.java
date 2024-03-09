package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Fourtune {
	@RequestMapping("/fortune")
	public String start() {
		double fn = Math.random();
		if(fn >= 0.7) {
			return "greatFortune.html";
		}else {
			return "misFortune.html";
		}
	}
}
