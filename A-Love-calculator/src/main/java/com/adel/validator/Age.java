package com.adel.validator;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Documented
@Retention(RUNTIME)
@Target(ElementType.FIELD)
@Constraint(validatedBy = AgeValidator.class)
public @interface Age {

	Class<?>[] groups() default { };

	Class<? extends Payload>[] payload() default { };
	
	String message() default "Age should be between {lower} - {upper}";
	int lower() default 18 ;
	int upper() default 60 ;
}
