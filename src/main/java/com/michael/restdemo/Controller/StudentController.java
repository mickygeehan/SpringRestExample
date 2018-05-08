package com.michael.restdemo.Controller;

import com.michael.restdemo.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.michael.restdemo.service.StudentService;

import java.util.Collection;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    StudentService stuService;

    @RequestMapping(value = "/all",method = RequestMethod.GET)
    public Collection<Student> getAll(){
        return this.stuService.getAllStudents();
    }

    @RequestMapping(value="{id}", method = RequestMethod.GET)
    public Student getStudent(@PathVariable("id") int id){
        return this.stuService.getStudent(id);
    }

}
