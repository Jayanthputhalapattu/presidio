package com.presidio.challenge.dto;

import java.util.List;

import jakarta.persistence.Column;
import lombok.Data;

@Data
public class PropertyDto {
	private Long id;
	private String place;
	private int noOfBedRooms;
	private int noOfbathRooms;
	private String nearByHospital;
	private String nearByCollege;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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
	public String getNearByHospital() {
		return nearByHospital;
	}
	public void setNearByHospital(String nearByHospital) {
		this.nearByHospital = nearByHospital;
	}
	public String getNearByCollege() {
		return nearByCollege;
	}
	public void setNearByCollege(String nearByCollege) {
		this.nearByCollege = nearByCollege;
	}
	
	
	

}
