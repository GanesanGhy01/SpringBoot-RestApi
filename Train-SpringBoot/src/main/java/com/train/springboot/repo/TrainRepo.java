package com.train.springboot.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.train.springboot.entity.Train;

@Repository
public interface TrainRepo extends JpaRepository<Train, Integer> {

}
