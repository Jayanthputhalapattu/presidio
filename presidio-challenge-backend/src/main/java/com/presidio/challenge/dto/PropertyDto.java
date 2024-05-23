package com.presidio.challenge.dto;

import java.util.List;

import lombok.Data;

@Data
public class PropertyDto {
	private Long id;
	
	private Long userId;
	private String place;
	private int noOfBedRooms;
	private int noOfbathRooms;
	private List<String> interest;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public int getNoOfBedRooms() {
		return noOfBedRooms;
	}
	public void setNoOfBedRooms(int noOfBedRooms) {
		this.noOfBedRooms = noOfBedRooms;
	}
	public int getNoOfbathRooms() {
		return noOfbathRooms;
	}
	public void setNoOfbathRooms(int noOfbathRooms) {
		this.noOfbathRooms = noOfbathRooms;
	}
	public List<String> getInterest() {
		return interest;
	}
	public void setInterest(List<String> interest) {
		this.interest = interest;
	}
	
	

}
