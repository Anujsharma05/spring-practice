package com.security.bankapplication.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContactController {
	@GetMapping("/contact")
	public String getLoan() {
		return "contact details from db";
	}
}
