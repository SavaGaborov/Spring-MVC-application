package com.ticketstore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AboutUsController {
	
	@RequestMapping(value="/aboutus")
	public String sayHello (Model model){
		
		model.addAttribute("Argument", "Welcome");
		return "aboutus";
	}

}
