package com.adel.validator;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Documented
@Retention(RUNTIME)
@Target(FIELD)
@Constraint(validatedBy = PhoneValidator.class)
public @interface PhoneNO {

	Class<?>[] groups() default {};

	Class<? extends Payload>[] payload() default {};
	
	String message() default "Number should be only 10 and no Char";
	int size() default 10;
}
