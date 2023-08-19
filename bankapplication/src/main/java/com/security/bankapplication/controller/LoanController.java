package com.security.bankapplication.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoanController {

	@GetMapping("/loans")
	public String getLoan() {
		return "loan details from db";
	}
}
