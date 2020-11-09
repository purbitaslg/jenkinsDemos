package com.dxc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {

	@GetMapping("/hi")
	public String sayHello() {
		
		return "Hello JenkinsGIT Demo";
	}
}
