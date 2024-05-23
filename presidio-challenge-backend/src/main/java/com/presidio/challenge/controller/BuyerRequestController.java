package com.presidio.challenge.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.presidio.challenge.dto.ResponseDTO;
import com.presidio.challenge.entity.BuyerRequest;
import com.presidio.challenge.entity.UserEntity;
import com.presidio.challenge.service.BuyerRequestService;
import com.presidio.challenge.service.BuyerRequestServiceImpl;

@Controller
@RequestMapping("/api/request")
public class BuyerRequestController {
	
	@Autowired
	private BuyerRequestService buyerRequestService;
	
	@PostMapping("/add-request")
	public ResponseEntity<ResponseDTO> addBuyerReq(@RequestBody BuyerRequest buyerRequest)
	{
		
		ResponseDTO responseDTO = buyerRequestService.sendRequest(buyerRequest);
		
		return ResponseEntity.ok(responseDTO);
	}
	
	@GetMapping("/{sellerId}")
	public ResponseEntity<List<UserEntity>> getBuyerReqBySellerId(@PathVariable("sellerId")Long sellerId)
	{
		
		return ResponseEntity.ok(buyerRequestService.getAllRequestsIdPropertyId(sellerId));
	}

}
