package com.presidio.challenge.entity;

import java.util.List;

import jakarta.annotation.Generated;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor

public class Property {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@ManyToOne
	@JoinColumn
	private UserEntity seller;
	@OneToMany(mappedBy = "property",cascade = CascadeType.ALL)
	private List<BuyerRequest> buyerRequests;
	@Column(name="place")
	private String place;
	@Column(name="no_of_bedrooms")
	private int noOfBedRooms;
	@Column(name="no_of_bathrooms")
	private int noOfBathRooms;
	@Column(name="nearby_hospital")
	private String nearByHospital;
	@Column(name="nearby_college")
	private String nearByCollege;
	
	private long sellId;
	
	public UserEntity getSeller() {
		return seller;
	}
	public void setSeller(UserEntity seller) {
		this.seller = seller;
	}
	public long getSellId() {
		return sellId;
	}
	public void setSellId(long sellId) {
		this.sellId = sellId;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public List<BuyerRequest> getBuyerRequests() {
		return buyerRequests;
	}
	public void setBuyerRequests(List<BuyerRequest> buyerRequests) {
		this.buyerRequests = buyerRequests;
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
	public int getNoOfBathRooms() {
		return noOfBathRooms;
	}
	public void setNoOfBathRooms(int noOfBathRooms) {
		this.noOfBathRooms = noOfBathRooms;
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
