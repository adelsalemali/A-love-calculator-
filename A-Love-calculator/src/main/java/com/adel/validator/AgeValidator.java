package com.adel.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class AgeValidator implements ConstraintValidator<Age, Integer>{

	private int lower ;//30
	private int upper ;//75
	@Override
	public void initialize(Age age) {
		//I can write the post construct work right here 
		
		this.lower = age.lower();
		this.upper = age.upper();
	}
	
	@Override
	public boolean isValid(Integer age, ConstraintValidatorContext context) {
		//I need to write my logic here
		if(age == null)
		{
			return false;
		}
		if(age < lower || age > upper)
		{
			
			return false ;//fail
		}
		return true;//pass
	}	
}
