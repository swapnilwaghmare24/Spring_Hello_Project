package com.bridgelabz.springhello.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.bridgelabz.springhello.service.HelloService;

@RestController
public class HelloController {
	@Autowired
	HelloService service;
	
	@GetMapping("/")
	public String hello()
	{
		return service.sayHello();
	}
	
	@GetMapping("/{name}")
	public String getName(@PathVariable String name)
	{
		return service.sayName(name);
	}

}
