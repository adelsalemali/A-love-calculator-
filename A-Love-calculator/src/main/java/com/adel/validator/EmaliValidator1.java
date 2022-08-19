package com.adel.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.adel.dto.Register;

public class EmaliValidator1 implements Validator{

	@Override
	public boolean supports(Class<?> clazz) {
		
		return Register.class.equals(clazz);
	}

	@Override
	public void validate(Object object, Errors errors) {
		
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "communicationDTO.email", "email.empty", "Email can't be empty");
		
		String email = ((Register)object).getCommunicationDTO().getEmail();
		
		if(!email.endsWith("gmail.com"))
		{
			errors.rejectValue("communicationDTO.email", "email.invalid", "Email must contains gmail.com");
		}
		else if(!email.contains("@"))
		{
			errors.rejectValue("communicationDTO.email", "email.invalid", "Email must contains @");
		}
		
		
		
	}

}
