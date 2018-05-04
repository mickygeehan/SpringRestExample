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
                put(1,new Student((long) 1,"Michael"));
                put(2,new Student((long)2,"Jim"));
                put(3,new Student((long)3,"John"));
                put(4,new Student((long)4,"Kim"));
                put(5,new Student((long)5,"Mary"));
                put(6,new Student((long)6,"Larry"));
                put(7,new Student((long)7,"Bar"));
                put(8,new Student((long)8,"Bar"));



            }
        };
    }

    public Collection<Student> getAllStudents(){
        return this.students.values();
    }

    public Student getStudent(int id){
        return this.students.get(id);
    }

    public void addStudent(Student student){
        this.students.put((int)(long)student.getId(),student);
    }


}
