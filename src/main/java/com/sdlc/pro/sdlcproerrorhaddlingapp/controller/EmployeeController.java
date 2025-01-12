package com.sdlc.pro.sdlcproerrorhaddlingapp.controller;

import com.sdlc.pro.sdlcproerrorhaddlingapp.model.Employee;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api") // Optional base path for clarity
public class EmployeeController {

    @PostMapping(value = "/saveEmployee", produces = "application/json")
    public Employee saveEmployee(@RequestBody Employee employee) {
        return employee; // Simply returning the employee object for testing
    }

}
