package com.train.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.train.springboot.entity.Booking;
import com.train.springboot.repo.BookingRepo;

@Service
public class BookingService {
	
	@Autowired
	BookingRepo bookrepo;
	
	public List<Booking> getAllBookingDetails(){
		return bookrepo.findAll();
	}
	
	public Booking saveBook(Booking book) {
		return bookrepo.save(book);
	}
	public Booking updateBook(Booking book) {
		return bookrepo.save(book);
	}
	public Booking deleteBooking(Booking book) {
		bookrepo.delete(book);
		return book;
	}
}
