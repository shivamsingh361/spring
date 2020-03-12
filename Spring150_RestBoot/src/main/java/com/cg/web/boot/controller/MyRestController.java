package com.cg.web.boot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// http://localhost:8082/hello

@RestController
public class MyRestController {
	@RequestMapping("/hello")
	public String hello(){
		return "Hello";
	}
}
