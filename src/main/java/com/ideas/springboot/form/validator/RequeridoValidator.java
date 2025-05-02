package com.ideas.springboot.form.validator;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class RequeridoValidator implements ConstraintValidator<Requerido, String> {

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		if(value== null || value.isEmpty() || value.isBlank()) {
			return false;
		}
		return true;
	}

}
