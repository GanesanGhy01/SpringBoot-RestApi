package com.train.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.train.springboot.entity.Train;
import com.train.springboot.repo.TrainRepo;

@Service
public class TrainService {
	
	@Autowired(required=true)
	TrainRepo trepo;
	
	public List<Train> getAllTrainDetails(){
		return trepo.findAll();
	}
	
	public Train saveTrain(Train t) {
		return trepo.save(t);
	}
	public Train deleteTrain(Train t) {
		trepo.delete(t);
		return t;
	}
	public Train updateTrain(Train t) {
		return trepo.save(t);
	}
}
//{
//    "trainno":22,
//    "trainname":"chennai exp",
//    "start":"chennai",
//    "destination":"mumbai",
//    "startingtime":"10",
//    "endingtime":"20",
//    "avalseat":19
//}
