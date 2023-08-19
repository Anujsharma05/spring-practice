package com.course.spring.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.course.spring.springmvc.dto.User;

@Controller
public class UserController {

	@RequestMapping("registerPage")
	public ModelAndView registerPage() {
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("userReg");
		return modelAndView;
	}
	
	@RequestMapping(value = "user-registration", method = RequestMethod.POST)
	public ModelAndView userRegistration(@ModelAttribute("user") User user) {
		System.out.println(user);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("regResult");
		modelAndView.addObject("user", user);
		return modelAndView;
	}
	
	/**
	 * Simplify above two methods
	 * 
	 */
	
	@RequestMapping("registerPageSimplify")
	public String registerPageSimplify() {
		//there was no model thats why modelandview was unnecessary
		return "userReg";
	}
	
	@RequestMapping(value = "user-registration-simplify", method = RequestMethod.POST)
	public String userRegistrationSimplify(@ModelAttribute("user") User user, ModelMap modelMap) {
		System.out.println(user);
		
		modelMap.addAttribute("user", user);
		return "regResult";
	}
}
