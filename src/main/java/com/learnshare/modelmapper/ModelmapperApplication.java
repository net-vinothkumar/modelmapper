package com.learnshare.modelmapper;

import com.learnshare.modelmapper.dto.UserDTO;
import com.learnshare.modelmapper.model.User;
import org.modelmapper.ModelMapper;

public class ModelmapperApplication {

	public static void main(String[] args) {
		simpleModelMappingDemo();
	}

	private static void simpleModelMappingDemo() {
		User sourceUser = new User(1, "David", "david@testemail.com", "1234567889");

		UserDTO targetUserDTO = new UserDTO();

		ModelMapper modelMapper = new ModelMapper();

		modelMapper.map(sourceUser, targetUserDTO);

		System.out.println(targetUserDTO.getName());
		System.out.println(targetUserDTO.getEmailAddress());
		System.out.println(targetUserDTO.getMobileNumber());
		System.out.println(targetUserDTO.getUserCity());
	}
}
