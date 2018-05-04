package com.michael.restdemo.Controller;

import com.michael.restdemo.model.Student;
import com.michael.restdemo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RegisterController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/register")
    public String studentForm(Model model) {
        model.addAttribute("student", new Student());
        return "register";
    }

    @PostMapping("/register")
    public String studentSubmit(@ModelAttribute Student student) {
        this.studentService.addStudent(student);
        return "result";
    }


}
