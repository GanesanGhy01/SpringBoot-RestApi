package com.train.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.train.springboot.entity.Booking;
import com.train.springboot.service.BookingService;

@RestController
public class BookingController {
	
	@Autowired
	BookingService bookservice;
	
	@GetMapping("/getBook")
	public List<Booking> getBook(){
		return bookservice.getAllBookingDetails(); 
	}
	
	@PostMapping("/saveBook")
	public Booking saveBook(@RequestBody Booking book) {
		return bookservice.saveBook(book);
	}
	
	@PutMapping("/updateBook")
	public Booking updateBook(@RequestBody Booking book) {
		return bookservice.updateBook(book);
	}
	@DeleteMapping("/deleteBook")
	public Booking deleteBook(@RequestBody Booking book) {
		return bookservice.deleteBooking(book);
	}
}
