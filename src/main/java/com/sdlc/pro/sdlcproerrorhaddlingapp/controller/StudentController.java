package com.sdlc.pro.sdlcproerrorhaddlingapp.controller;

import com.sdlc.pro.sdlcproerrorhaddlingapp.annotations.RestControllerIdentifier;
import com.sdlc.pro.sdlcproerrorhaddlingapp.exeptions.ResourceNotFoundException;
import com.sdlc.pro.sdlcproerrorhaddlingapp.model.ResponseError;
import com.sdlc.pro.sdlcproerrorhaddlingapp.model.Student;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
@RestControllerIdentifier
@RequestMapping("/api/v1")
public class StudentController {
    private final List<Student> students = new ArrayList<>();

    public StudentController() {
        students.add(new Student(101,"rakib",3.2554f));

        students.add(new Student(102,"mojid",3.9954f));
    }

    @GetMapping("/get-all-student")
    public List<Student> allStudents(){
        return students;
    }
    @GetMapping(value = "/student")
    public Student getStudent(@RequestParam("id") int id)
    {
      return students.stream().filter(s->s.id()==id).findFirst().orElseThrow(()->
              new ResourceNotFoundException( "Student not Found by id[%d]".formatted(id)));
    }

}
