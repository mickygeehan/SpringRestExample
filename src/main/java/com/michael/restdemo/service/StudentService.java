package com.michael.restdemo.service;


import com.michael.restdemo.model.Student;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;

@Service
public class StudentService {


    private HashMap<Integer,Student> students;

    public StudentService(){

        students = new HashMap<Integer, Student>(){
            {
                put(1,new Student(1,18,"Michael"));
                put(2,new Student(2,23,"Jim"));
                put(3,new Student(3,23,"John"));
                put(4,new Student(4,23,"Kim"));
                put(5,new Student(5,23,"Mary"));
                put(6,new Student(6,23,"Larry"));
                put(7,new Student(7,23,"Bar"));
                put(8,new Student(8,23,"Bar"));



            }
        };
    }

    public Collection<Student> getAllStudents(){
        return this.students.values();
    }

    public Student getStudent(int id){
        return this.students.get(id);
    }


}
