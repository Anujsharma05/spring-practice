package com.practice.springsecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@GetMapping(path = "/")
	public String home() {
		return "home";
	}

	@GetMapping(path = "/user")
	public String user() {
		return "user";
	}

	@GetMapping(path = "/admin")
	public String admin() {
		return "admin";
	}
}
