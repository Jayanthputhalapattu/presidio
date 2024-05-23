package com.presidio.challenge.service;

import com.presidio.challenge.dto.ResponseDTO;
import com.presidio.challenge.dto.UserDTO;

public interface UserService {
		
	public ResponseDTO registerUser(UserDTO userDTO);
	
	public ResponseDTO loginUser(String email,String password);
}
