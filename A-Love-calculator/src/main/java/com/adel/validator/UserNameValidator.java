package com.adel.validator;

import org.apache.catalina.User;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.adel.dto.Register;

public class UserNameValidator implements Validator{

	//Check if the userNameVolidator supports a given object
	@Override
	public boolean supports(Class<?> clazz) {
		
		return  Register.class.equals(clazz); 
	}

	//We need to write our custom validation logic 
	@Override
	public void validate(Object object, Errors errors) {
		
		//to check our filed is null or not 
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "userName", "userName.empty", "User name can't be empty");
		
		//the userName must contains a _
		String userName = ((Register)object).getUserName();
		
		if(!userName.contains("_"))
		{
			errors.rejectValue("userName", "userName.invalid", "User must contains a  _");
		}
	}

}
