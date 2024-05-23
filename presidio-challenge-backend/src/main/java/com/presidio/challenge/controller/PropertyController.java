package com.presidio.challenge.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.presidio.challenge.dto.PropertyDto;
import com.presidio.challenge.dto.ResponseDTO;
import com.presidio.challenge.entity.Property;
import com.presidio.challenge.service.PropertyService;

@RestController
@RequestMapping("/api/property")
@CrossOrigin(origins="http://localhost:3000")
public class PropertyController {
	@Autowired
	private PropertyService propertyService;

	@PostMapping("/add-property")
	public ResponseEntity<ResponseDTO> addProperty(@RequestBody Property property)
	{
		ResponseDTO responseDTO = propertyService.addProperty(property);
		
		return ResponseEntity.ok(responseDTO);
	}
	
	@GetMapping("/properties")
	public ResponseEntity<List<PropertyDto>> getAllProperties()
	{
		List<PropertyDto> properties= propertyService.getAllProperties();
		return ResponseEntity.ok(properties);
	}
	
	@GetMapping("/properties/{buyerId}")
	public ResponseEntity<List<PropertyDto>> getBySellerId()
	{
		return null;
	}
	
}
