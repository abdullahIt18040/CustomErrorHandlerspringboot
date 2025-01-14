package com.sdlc.pro.sdlcproerrorhaddlingapp.validators;

import com.sdlc.pro.sdlcproerrorhaddlingapp.annotations.BDPhoneNumber;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import jakarta.validation.Payload;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class BDPhoneNumberValidator  implements ConstraintValidator<BDPhoneNumber,String> {
    private Class<? extends Payload>[] payloads;
    @Override
    public void initialize(BDPhoneNumber constraintAnnotation) {
          this.payloads = constraintAnnotation.payload();
    }

    @Override
    public boolean isValid(String phone, ConstraintValidatorContext constraintValidatorContext) {
//        log.info("validation bangladeshi phone number:{}",phone);
        boolean flag =phone.matches("(\\+88)?01[3-9]\\d{8}");
        System.out.println("bangladesh phone number is not valid "+phone);
        if(payloads != null && payloads.length!=0 && !flag)
        {
          Class<?> p = payloads[0];
          if("Error".equals(p.getSimpleName())){
              System.out.printf("invalid phone number********************************",phone);
          }
        }
        return flag;
    }
}
