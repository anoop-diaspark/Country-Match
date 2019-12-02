package com.diaspark.country.mapper;

import org.springframework.stereotype.Component;


import com.diaspark.country.countrydto.MatchScheduleDTO;
import com.diaspark.country.countrydto.RegisterUserDTO;


import com.diaspark.country.entity.ScheduleEntity;
import com.diaspark.country.entity.UserEntity;
@Component
public class EntityToDTOMapper {
	

	 
	 /*	this  function  convert match  entity data to MatchScheduleDTO */
	 public MatchScheduleDTO buildMatchResponseDTO(ScheduleEntity countryOf) {
		 MatchScheduleDTO matchResponseDTO = new MatchScheduleDTO();
		 matchResponseDTO.setId(countryOf.getId());
		 matchResponseDTO.setCountryName(countryOf.getCountryName());
		matchResponseDTO.setMatchDate(countryOf.getDate());
		matchResponseDTO.setMatchType(countryOf.getMatchType());
		matchResponseDTO.setMatchStatus(countryOf.getResult().getMatchStatus());
	        return matchResponseDTO;
	    } 
	 
	/* this function saved user data to RegisterUserDTO */
	 public RegisterUserDTO buildRegisterUserDTO(UserEntity userDAO){
		 RegisterUserDTO registerUserDTO = new RegisterUserDTO();
		 registerUserDTO.setFirstName(userDAO.getFirstName());
		 registerUserDTO.setLastName(userDAO.getLastName());
		 registerUserDTO.setUserName(userDAO.getUserName());
		
		 return registerUserDTO;
		 
	 }
	 
}
