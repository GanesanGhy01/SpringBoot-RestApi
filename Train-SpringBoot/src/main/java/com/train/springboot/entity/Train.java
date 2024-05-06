package com.train.springboot.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="newtrain")
public class Train {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int trainid;
	private int trainno;
	private String trainname;
	private String start;
	private String destination;
	private String startingtime;
	private String endingtime;
	private int avalseat;
	public int getTrainid() {
		return trainid;
	}
	public void setTrainid(int trainid) {
		this.trainid = trainid;
	}
	public int getTrainno() {
		return trainno;
	}
	public void setTrainno(int trainno) {
		this.trainno = trainno;
	}
	public String getTrainname() {
		return trainname;
	}
	public void setTrainname(String trainname) {
		this.trainname = trainname;
	}
	public String getStart() {
		return start;
	}
	public void setStart(String start) {
		this.start = start;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public String getStartingtime() {
		return startingtime;
	}
	public void setStartingtime(String startingtime) {
		this.startingtime = startingtime;
	}
	public String getEndingtime() {
		return endingtime;
	}
	public void setEndingtime(String endingtime) {
		this.endingtime = endingtime;
	}
	public int getAvalseat() {
		return avalseat;
	}
	public void setAvalseat(int avalseat) {
		this.avalseat = avalseat;
	}
	

	
}
