package com.train.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.train.springboot.entity.Train;
import com.train.springboot.service.TrainService;

@RestController
public class TrainController {
	
	@Autowired
	TrainService tservice;
	
	@GetMapping("/getTrain")
	public List<Train> getTrain(){
		return tservice.getAllTrainDetails();
	}
	
	@PostMapping("/saveTrain")
	public Train saveTrain(@RequestBody Train t) {
		return tservice.saveTrain(t);
	}
	
	@PutMapping("/updateTrain")
	public Train updateTrain(@RequestBody Train t) {
		return tservice.updateTrain(t);
	}
	
	@DeleteMapping("/deleteTrain")
	public Train deleteTrain(@RequestBody Train t) {
		return tservice.deleteTrain(t);
	}
	
}
