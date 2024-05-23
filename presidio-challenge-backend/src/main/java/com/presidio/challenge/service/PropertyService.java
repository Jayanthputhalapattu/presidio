package com.presidio.challenge.service;

import java.util.List;

import com.presidio.challenge.dto.PropertyDto;
import com.presidio.challenge.dto.ResponseDTO;
import com.presidio.challenge.entity.Property;

public interface PropertyService {
	public ResponseDTO addProperty(Property property);
	public List<PropertyDto> getAllProperties();
}
