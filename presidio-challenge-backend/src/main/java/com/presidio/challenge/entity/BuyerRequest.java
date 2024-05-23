package com.presidio.challenge.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity(name="interest")
@Data
public class BuyerRequest {
	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name="property_id",nullable = false)
	private Property property;
	@ManyToOne
	@JoinColumn(name="buyer_id",nullable = false)
	private UserEntity buyer;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Property getProperty() {
		return property;
	}
	public void setProperty(Property property) {
		this.property = property;
	}
	public UserEntity getBuyer() {
		return buyer;
	}
	public void setBuyer(UserEntity buyer) {
		this.buyer = buyer;
	}
	
	
	
	
}
