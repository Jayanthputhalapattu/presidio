package com.presidio.challenge.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;import com.fasterxml.jackson.databind.annotation.JsonAppend.Prop;
import com.presidio.challenge.entity.Property;

@Repository
public interface PropertyRepo extends JpaRepository<Property, Long>{
	


}
