package com.lalalala.s1.home;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

public class HomeController {
	
	@GetMapping("/")
	public String home(Model model) throws Exception {
		model.addAttribute("message", "JSP Project");
		return "index";
	}

}
