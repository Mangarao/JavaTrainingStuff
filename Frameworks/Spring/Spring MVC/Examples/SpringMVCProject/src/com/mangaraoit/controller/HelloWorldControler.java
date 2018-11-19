package com.mangaraoit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldControler {
	@RequestMapping("hello")
	public ModelAndView helloWorld(){
		return new ModelAndView("helloPage", "message", "Hello  Spring mvc");
	}

}
