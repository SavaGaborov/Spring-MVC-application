package com.ticketstore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ContactController {
	
	@RequestMapping(value="/contactus")
	public ModelAndView gettingTheContactView() {
		
	String message = "Contact us"; 
	return new ModelAndView("contactus", "message", message); }

}
