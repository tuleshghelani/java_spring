package com.tulesh.springdemosecond.mvc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {

    Logger logger = LoggerFactory.getLogger(StudentController.class);
    @RequestMapping("/showForm")
    public String showForm(Model theModel){
        Student theStudent=new Student();

        theModel.addAttribute("student",theStudent);

        return "student-form";
    }

    @RequestMapping("/processForm")
    public String processForm(@ModelAttribute("student")Student theStudent){
        logger.info("the Student : {} ",theStudent.getFirstName()+
                " {} ",theStudent.getLastName());
        return  "student-confirmation";
    }

}
