package com.security.bankapplication.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NoticeController {
	@GetMapping("/notices")
	public String getLoan() {
		return "notices details from db";
	}
}
