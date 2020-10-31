package com.caveofprogramming.spring.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
	@RequestMapping("/login")
	public String showlogin() {
		return "login";
	}
	@RequestMapping("/newAccount")
	public String showNewAccount() {
		return "newAccount";
	}
	@RequestMapping("/createAccount")
	public String createAccount() {
		return "accountCreated";
	}
}
