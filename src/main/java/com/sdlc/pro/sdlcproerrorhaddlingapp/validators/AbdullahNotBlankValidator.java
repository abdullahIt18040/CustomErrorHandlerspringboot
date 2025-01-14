package com.sdlc.pro.sdlcproerrorhaddlingapp.validators;

import com.sdlc.pro.sdlcproerrorhaddlingapp.annotations.AbdullahNotBlank;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class AbdullahNotBlankValidator implements ConstraintValidator<AbdullahNotBlank,String> {
    @Override
    public void initialize(AbdullahNotBlank constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        if(!s.equals(""))
        {
            return  true ;
        }
 return  true;
    }
}
