package com.course.spring.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.course.spring.springmvc.dto.Employee;

@Controller
public class ObjectController {

	@RequestMapping("/emp-obj")
	public ModelAndView getEmployeeObject() {

		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("displayObject");

		Employee emp = new Employee(1, "Michael", 15000.04);

		modelAndView.addObject("emp", emp);

		return modelAndView;
	}
}
