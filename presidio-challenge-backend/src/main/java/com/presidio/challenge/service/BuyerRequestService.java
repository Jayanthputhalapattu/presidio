package com.presidio.challenge.service;

import java.util.List;

import com.presidio.challenge.dto.ResponseDTO;
import com.presidio.challenge.entity.BuyerRequest;
import com.presidio.challenge.entity.UserEntity;

public interface BuyerRequestService {
	public ResponseDTO sendRequest(BuyerRequest buyerRequest);
	public List<UserEntity> getAllRequestsIdPropertyId(Long id);
	
	

}
