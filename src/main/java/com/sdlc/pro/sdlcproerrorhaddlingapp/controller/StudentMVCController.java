package com.sdlc.pro.sdlcproerrorhaddlingapp.controller;


import com.sdlc.pro.sdlcproerrorhaddlingapp.annotations.MvcControllerIdentifier;
import com.sdlc.pro.sdlcproerrorhaddlingapp.exeptions.PageNotFoundException;
import com.sdlc.pro.sdlcproerrorhaddlingapp.exeptions.ResourceNotFoundException;
import com.sdlc.pro.sdlcproerrorhaddlingapp.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
@MvcControllerIdentifier
public class StudentMVCController {
    private final List<Student> students = new ArrayList<>();

    public StudentMVCController() {
        students.add(new Student(101,"rakib",3.2554f));

        students.add(new Student(102,"mojid",3.9954f));
    }

    @GetMapping(value = "/student")
    public String getStudent(@RequestParam("id") int id, Model model)
    {

        var student =  students.stream().filter(s->s.id()==id).findFirst().orElseThrow(()->
                new ResourceNotFoundException( "Student not Found by id[%d]".formatted(id)));


          model.addAttribute("student",student);

                return "stu";
    }

//    @GetMapping(value = "/student")
//    public Student getStudentHtml(@RequestParam("id") int id) {
//        return students.stream()
//                .filter(s -> s.id() == id)
//                .findFirst()
//                .orElseThrow(() -> new ResourceNotFoundException("Student not Found by id [%d]".formatted(id)));
//
//
//    }

}
