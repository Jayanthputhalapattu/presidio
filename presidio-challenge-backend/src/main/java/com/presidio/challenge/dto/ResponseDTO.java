package com.presidio.challenge.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResponseDTO {
	private String message;
	private UserDTO userDto;
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public UserDTO getUserDto() {
		return userDto;
	}
	public void setUserDto(UserDTO userDto) {
		this.userDto = userDto;
	}
	@Override
	public String toString() {
		return "ResponseDTO [message=" + message + ", userDto=" + userDto + "]";
	}
	
	
}
