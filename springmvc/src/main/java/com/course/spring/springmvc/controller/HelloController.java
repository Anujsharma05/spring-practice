package com.course.spring.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

	@RequestMapping("/hello")
	public ModelAndView hello() {

		ModelAndView modelAndView = new ModelAndView();
		
		modelAndView.setViewName("hello");
		
		modelAndView.addObject("id", 12);
		modelAndView.addObject("name", "Anuj");
		modelAndView.addObject("salary", 3333.33);
		
		return modelAndView;

	}
}
