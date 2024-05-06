package com.train.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.train.springboot.entity.LoginRegister;
import com.train.springboot.service.LoginService;

@RestController
public class LoginController {
	
	@Autowired
	LoginService loginservice;
	
	@GetMapping("/getUser")
	public List<LoginRegister> getUser(){
		return loginservice.getAllUserDetails();
	}
	
	@PostMapping("/saveUser")
	public LoginRegister saveUser(@RequestBody LoginRegister login) {
		return loginservice.saveUser(login);
	}
	
	@PutMapping("/updateUser")
	public LoginRegister updateUser(@RequestBody LoginRegister login) {
		return loginservice.updateUser(login);
	}
	
	@DeleteMapping("/deleteUser")
	public LoginRegister deleteUser(@RequestBody LoginRegister login) {
		return loginservice.deleteUser(login);
	}
}
