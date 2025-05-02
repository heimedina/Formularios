package com.ideas.springboot.form.validator;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class IdentificadorRegexValidator implements ConstraintValidator<IdentificadorRegex, String>{

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {

		if(value.matches("[0-9]{7}[-][A-Z]{1}")) {
			return true;
		}
		return false;
	}

}
