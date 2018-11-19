package com.mangaraoit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeController {
	
	@RequestMapping("welcome")
	public ModelAndView welcome(){
		return new ModelAndView("welcomePage","message1","Welcome to spring mvc");
	}
}
