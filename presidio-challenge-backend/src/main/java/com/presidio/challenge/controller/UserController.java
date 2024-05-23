package com.presidio.challenge.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.presidio.challenge.dto.ResponseDTO;
import com.presidio.challenge.dto.UserDTO;
import com.presidio.challenge.service.UserService;

@RestController
@RequestMapping("/api/user")
@CrossOrigin(origins="http://localhost:3000")
public class UserController {
	@Autowired
	private UserService userService;
	
	@PostMapping("/login")
	public ResponseEntity<ResponseDTO> login(@RequestBody UserDTO userDTO)
	{
		ResponseDTO responseDTO = new ResponseDTO();
		
		responseDTO = userService.loginUser(userDTO.getEmail(), userDTO.getPassword());
		
		return ResponseEntity.ok(responseDTO);
		
	}
	@PostMapping("/register")
	public ResponseEntity<ResponseDTO> register(@RequestBody UserDTO userDTO)
	{
		ResponseDTO responseDTO = new ResponseDTO();
		
		if(userDTO.getEmail().isEmpty() || userDTO.getPassword().isEmpty())
		{
			responseDTO.setMessage("Please enter all fields");
		}
		
		responseDTO = userService.registerUser(userDTO);
		
		return ResponseEntity.ok(responseDTO);
	}
}
