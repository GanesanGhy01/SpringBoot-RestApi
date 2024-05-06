package com.train.springboot.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.train.springboot.entity.Booking;

public interface BookingRepo extends JpaRepository<Booking, Integer>{

}
