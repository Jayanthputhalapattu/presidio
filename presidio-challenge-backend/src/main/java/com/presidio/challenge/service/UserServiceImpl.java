package com.presidio.challenge.service;

import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.stereotype.Service;

import com.presidio.challenge.dto.ResponseDTO;
import com.presidio.challenge.dto.UserDTO;
import com.presidio.challenge.entity.UserEntity;
import com.presidio.challenge.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService{
	@Autowired
	private UserRepository userRepo;
	@Autowired 
	private ModelMapper modelMapper;

	@Override
	public ResponseDTO registerUser(UserDTO userDTO) {
		ResponseDTO responseDto = new ResponseDTO();
		
		try {
			UserEntity user = modelMapper.map(userDTO,UserEntity.class);
			userRepo.save(user);
			
			responseDto.setMessage("User Registration Successfull");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
		return responseDto;
		
	}

	@Override
	public ResponseDTO loginUser(String email, String password) {
		ResponseDTO responseDto = new ResponseDTO();
		// TODO Auto-generated method stub
		Optional<UserEntity> userEntity = userRepo.findByEmailAndPassword(email, password);
		if(userEntity.isEmpty())
		{
			responseDto.setMessage("Invalid email or password");
			return responseDto;
		}
		UserEntity user = userEntity.get();
		UserDTO userDTO = modelMapper.map(user,UserDTO.class);
		responseDto.setMessage("login successfull");
		responseDto.setUserDto(userDTO);
		return responseDto;
	}
	
}
