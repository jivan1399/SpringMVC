package com.knowingmvc.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GreetController {

	@GetMapping(value = "/greeting") // request from browser.
	public String morning(Model model) {
		String msg = "Good Morning";// process in controller

		model.addAttribute("Greeting", msg); // storing controller model/data into variable.
											// and variable name as it is we have to give in JSP file.
		return "greet"; // return type same as view file name
	}
}
