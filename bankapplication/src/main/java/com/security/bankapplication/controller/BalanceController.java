package com.security.bankapplication.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BalanceController {

	@GetMapping("/balance")
	public String getBalance() {
		return "balance from db";
	}
}
