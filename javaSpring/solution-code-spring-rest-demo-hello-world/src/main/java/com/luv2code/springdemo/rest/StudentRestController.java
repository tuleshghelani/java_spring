package com.luv2code.springdemo.rest;

import com.luv2code.springdemo.entity.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {

    @GetMapping("/students")
    public List<Student> getStudents(){
        List<Student> theStudent=new ArrayList<>();

        theStudent.add(new Student("a1","a2"));
        theStudent.add(new Student("b1","b2"));
        theStudent.add(new Student("c1","c2"));

        return theStudent;
    }
}
