package com.course.spring.springmvcorm.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.course.spring.springmvcorm.user.entity.User;
import com.course.spring.springmvcorm.user.service.UserService;

@Controller
public class UserController {

	@Autowired
	UserService service;
	
	@RequestMapping(value = "registration-page")
	public String registrationPage() {
		return "userReg";
	}
	
	@RequestMapping(value = "register-user", method=RequestMethod.POST)
	public String save(@ModelAttribute("user") User user, ModelMap modelMap) {
		int result = service.save(user);
		modelMap.addAttribute("result", "User created with Id:" + result);
		return "userReg";
	}
	
	@RequestMapping(value = "users")
	public String listUsers(ModelMap modelMap) {
		
		List<User> users = service.listUsers();
		modelMap.addAttribute("users", users);
		return "displayUsers";
	}
	
	@RequestMapping("validate-email")
	public @ResponseBody String validateEmail(@RequestParam("id") int id) {
		
		User user = service.findUser(id);
		
		String msg = "";
		
		if(user != null) {
			return id + " already exists";
		}
		
		return msg;
	}
	
}
