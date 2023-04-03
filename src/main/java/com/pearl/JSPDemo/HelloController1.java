package com.pearl.JSPDemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HelloController1 {
	@GetMapping("/home")
	public String home() {
		return "home";
	}
	@GetMapping("/")
	public String test() {
		return "home";
	}
}
