package com.presidio.challenge.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.presidio.challenge.dto.ResponseDTO;
import com.presidio.challenge.entity.BuyerRequest;
import com.presidio.challenge.entity.Property;
import com.presidio.challenge.entity.UserEntity;
import com.presidio.challenge.repository.BuyerRequestRepo;
import com.presidio.challenge.repository.PropertyRepo;
import com.presidio.challenge.repository.UserRepository;
@Service
public class BuyerRequestServiceImpl implements BuyerRequestService {
	@Autowired
	private BuyerRequestRepo buyerReqRepo;

	@Autowired
	private PropertyRepo propertyRepo;
	
	@Autowired
	private UserRepository userRepository;
	@Override
	public ResponseDTO sendRequest(BuyerRequest buyerRequest) {
		
		ResponseDTO responseDTO = new ResponseDTO();
		
		buyerReqRepo.save(buyerRequest);
		responseDTO.setMessage("Expressed Interest!");
		return responseDTO;
	}

	@Override
	public List<UserEntity> getAllRequestsIdPropertyId(Long id) {
		// TODO Auto-generated method stub
		Optional<Property> prop = propertyRepo.findById(id);
		List<BuyerRequest> buyerReqs = buyerReqRepo.findByProperty(prop.get());
		List<UserEntity> users = new ArrayList();
		
		users = buyerReqs.stream().map(p->{
			Optional< UserEntity> user = userRepository.findById(p.getId());

			return user.get();
		}).collect(Collectors.toList());
		
		return users;
	}

}
