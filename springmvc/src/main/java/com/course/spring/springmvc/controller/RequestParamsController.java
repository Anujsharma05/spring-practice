package com.course.spring.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RequestParamsController {

	@RequestMapping("showData")
	public ModelAndView showData(@RequestParam("id") int id, @RequestParam("name") String name, @RequestParam(value="sal", required=false, defaultValue="55.33") double salary) {
		
		System.out.println("id:" + id);
		System.out.println("name:" + name);
		System.out.println("salary:" + salary);
		
		ModelAndView modelAndView = new ModelAndView();
		
		modelAndView.setViewName("hello");
		
		return modelAndView;
	}
}
