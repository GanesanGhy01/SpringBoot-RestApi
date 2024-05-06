package com.train.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.train.springboot.entity.LoginRegister;
import com.train.springboot.repo.LoginRepo;

@Service
public class LoginService {
	
	@Autowired
	LoginRepo loginrepo;
	
	public List<LoginRegister> getAllUserDetails(){
		return loginrepo.findAll();
	}
	
	public LoginRegister saveUser(LoginRegister login) {
		return loginrepo.save(login);
	}
	
	public LoginRegister updateUser(LoginRegister login) {
		return loginrepo.save(login);	
	}
	public LoginRegister deleteUser(LoginRegister login) {
		loginrepo.delete(login);
		return login;
	}
	
}
