package com.presidio.challenge.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;

import com.presidio.challenge.dto.PropertyDto;
import com.presidio.challenge.dto.ResponseDTO;
import com.presidio.challenge.entity.Property;
import com.presidio.challenge.entity.UserEntity;
import com.presidio.challenge.repository.PropertyRepo;
import com.presidio.challenge.repository.UserRepository;

@Service
public class PropertyServiceImpl implements PropertyService{
	
	@Autowired
	private PropertyRepo propertyRepo;
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private ModelMapper modelmapper;
	@Override
	public ResponseDTO addProperty(Property property) {
		// TODO Auto-generated method stub
		ResponseDTO responseDTO = new ResponseDTO();
		Optional<UserEntity> userEntity = userRepository.findById(property.getSellId());
		if(userEntity.isEmpty())
		{
			responseDTO.setMessage("Invalid Seller!,please login");
			return responseDTO;
		}
		property.setSeller(userEntity.get());
		propertyRepo.save(property);
		responseDTO.setMessage("Property added");
		return responseDTO;
	}
	@Override
	public List<PropertyDto> getAllProperties()
	{
		List<Property> allProperties = propertyRepo.findAll();
		
		if(allProperties.isEmpty())
		{
			return new ArrayList<>();
		}
		List<PropertyDto> propertyDtos = allProperties.stream().map(p->modelmapper.map(p, PropertyDto.class)).collect(Collectors.toList());
	
		return propertyDtos;
		
	}
	
}
