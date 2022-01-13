package com.luv2code.springdemo.rest;

import com.luv2code.springdemo.entity.Student;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {

    private List<Student> theStudent;

    @PostConstruct
    public void loadData() {
        theStudent = new ArrayList<>();

        theStudent.add(new Student("a1", "a2"));
        theStudent.add(new Student("b1", "b2"));
        theStudent.add(new Student("c1", "c2"));
    }

    @GetMapping("/students")
    public List<Student> getStudents() {

        return theStudent;
    }

    @GetMapping("/students/{studentID}")
    public Student getStudent(@PathVariable int studentID) {
        if((studentID>=theStudent.size())||(studentID<0)){
            throw  new StudentNotFoundException("Student id not found"+studentID);
        }
        return theStudent.get(studentID);
    }

//    @ExceptionHandler
//    public ResponseEntity<StudentErrorResponse> handlerException(StudentNotFoundException exe){
//        StudentErrorResponse error=new StudentErrorResponse();
//        error.setStatus(HttpStatus.NOT_FOUND.value());
//        error.setMessage(exe.getMessage());
//        error.setTimeStamp(System.currentTimeMillis());
//
//        return new ResponseEntity<>(error,HttpStatus.NOT_FOUND);
//    }
//
//    @ExceptionHandler
//    public ResponseEntity<StudentErrorResponse> handleException(Exception exe){
//        StudentErrorResponse error=new StudentErrorResponse();
//        error.setStatus(HttpStatus.BAD_REQUEST.value());
//        error.setMessage(exe.getMessage());
//        error.setTimeStamp(System.currentTimeMillis());
//
//        return new ResponseEntity<>(error,HttpStatus.NOT_FOUND);
//    }
}
