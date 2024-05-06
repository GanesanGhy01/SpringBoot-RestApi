package com.train.springboot.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.train.springboot.entity.LoginRegister;

public interface LoginRepo extends JpaRepository<LoginRegister, Integer>{

}
