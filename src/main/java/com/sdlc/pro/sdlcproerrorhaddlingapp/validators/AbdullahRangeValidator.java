package com.sdlc.pro.sdlcproerrorhaddlingapp.validators;

import com.sdlc.pro.sdlcproerrorhaddlingapp.annotations.AbdullahRange;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class AbdullahRangeValidator implements ConstraintValidator<AbdullahRange, Integer> {

int maxval,minval;
    @Override
    public void initialize(AbdullahRange constraintAnnotation) {
        this.maxval = constraintAnnotation.mx();
        this.minval = constraintAnnotation.min();
    }

    @Override
    public boolean isValid(Integer value, ConstraintValidatorContext constraintValidatorContext) {
        if (value == null) {
            return false; // Or true, based on your requirement for null values
        }

        // Check if the value is within the range
        return value >= minval && value <= maxval;
    }


}
