package com.adel.validator;

import java.util.regex.*;
import java.util.regex.*;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import com.adel.dto.Phone;

public class PhoneValidator implements ConstraintValidator<PhoneNO, String>{


	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		System.out.println();
		 String p = "^[1-9]\\d{2}\\d{3}\\d{4}$"; 
		 Pattern pattern = Pattern.compile(p);
		 Matcher matcher =  pattern.matcher(value);
		 
		 if(matcher.find()) {
			 return true;
		 }else {
			 return false;
		 }
		
	}


}
