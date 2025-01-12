package com.sdlc.pro.sdlcproerrorhaddlingapp;

import com.sdlc.pro.sdlcproerrorhaddlingapp.model.Address;
import com.sdlc.pro.sdlcproerrorhaddlingapp.model.Employee;
import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validation;
import jakarta.validation.Validator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Set;

@SpringBootApplication
public class SdlcProErrorhaddlingAppApplication {

    public static void main(String[] args) {

        SpringApplication.run(SdlcProErrorhaddlingAppApplication.class, args);


//     ***************  how to provide   Validtion  using core java ***************************

//   var address = new Address(-102,"dasf");
//        var employee = new Employee(101,"abdullah",25,"abdu#mail.com",
//                "015487",null);
//     try(  var factory= Validation.buildDefaultValidatorFactory()) {
//              Validator validator=  factory.getValidator();
//            Set<ConstraintViolation<Employee>> errors = validator.validate(employee);
//        for(ConstraintViolation<Employee> error:errors)
//        {
//            System.out.println(error.getPropertyPath()+" "+error.getMessage()+" " + error.getInvalidValue());
//        }
//
//     }

//    ****************************************    end *******************************************

    }

}
