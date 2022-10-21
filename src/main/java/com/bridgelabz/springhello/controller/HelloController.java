package com.bridgelabz.springhello.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bridgelabz.springhello.model.User;
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
	
	@PostMapping("/adduser")
	public User addUser(@RequestBody User user)
	{
		return service.addUser(user);
	}
	
	@GetMapping("/allusers")
	public List<User> getAll()
	{
		return service.getAllUsers();
	}
	
	@GetMapping("/id/{id}")
	public User getUserById(@PathVariable int id)
	{
		return service.getUserById(id);
	}
	
	@DeleteMapping("/id/{id}")
	public String deleteUserById(@PathVariable int id)
	{
		return service.deleteUserById(id);
	}
	
	@PutMapping("/id/{id}")
	public User updateUser(@RequestBody User user, @PathVariable int id)
	{
		return service.updateUser(id,user);
	}
}
