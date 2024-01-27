package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWorld {
	
	@RequestMapping(value="/hello")
	@ResponseBody
	public String sayHello() {
		return "Hello world";
	}

}
