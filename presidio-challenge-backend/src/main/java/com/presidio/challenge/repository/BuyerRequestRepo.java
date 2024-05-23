package com.presidio.challenge.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.presidio.challenge.entity.BuyerRequest;
import com.presidio.challenge.entity.Property;
import com.presidio.challenge.entity.UserEntity;

@Repository
public interface BuyerRequestRepo extends JpaRepository<BuyerRequest,Long > {
	
	public List<BuyerRequest> findByProperty(Property property);
}
