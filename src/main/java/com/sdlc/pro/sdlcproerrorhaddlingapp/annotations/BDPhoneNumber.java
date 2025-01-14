package com.sdlc.pro.sdlcproerrorhaddlingapp.annotations;

import com.sdlc.pro.sdlcproerrorhaddlingapp.validators.BDPhoneNumberValidator;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = BDPhoneNumberValidator.class )
public @interface BDPhoneNumber {
    String message() default "Found Bangladeshi invalid phone number";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};


}
