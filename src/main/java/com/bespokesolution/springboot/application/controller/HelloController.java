package com.bespokesolution.springboot.application.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@RequestMapping("/")
	public String index(){
		return "Hi I am from SPring Boot Controller";
	}
}
