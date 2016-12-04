package com.mjduan.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mjduan.project.util.Out;

@Controller
public class HelloController {

	@RequestMapping(value="/hello")
	public @ResponseBody String hello(){
		Out.println("hello method");
		
		return "Hello world";
	}
	
}
