package com.sdlc.pro.sdlcproerrorhaddlingapp.annotations;

import com.sdlc.pro.sdlcproerrorhaddlingapp.validators.AbdullahRangeValidator;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = AbdullahRangeValidator.class)
public @interface AbdullahNotBlank {
    String message() default "Must be provide valid Abdullahnot blank bro! ";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
