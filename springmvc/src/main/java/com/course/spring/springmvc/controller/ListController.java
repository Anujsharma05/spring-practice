package com.course.spring.springmvc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.course.spring.springmvc.dto.Employee;

@Controller
public class ListController {

	@RequestMapping("/emp-list")
	public ModelAndView getEmployeeObject() {

		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("displayList");

		Employee emp1 = new Employee(1, "Michael", 15000.04);
		Employee emp2 = new Employee(2, "Jim", 12000.14);
		Employee emp3 = new Employee(3, "Dwight", 12001.04);

		List<Employee> list = new ArrayList<>();
		list.add(emp1);
		list.add(emp2);
		list.add(emp3);
		modelAndView.addObject("empList", list);

		return modelAndView;
	}
}
