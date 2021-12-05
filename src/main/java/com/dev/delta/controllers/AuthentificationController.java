package com.dev.delta.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AuthentificationController {

	@GetMapping("/login")
	public String login(Model model) {
		return "auth/login";
	}
}
