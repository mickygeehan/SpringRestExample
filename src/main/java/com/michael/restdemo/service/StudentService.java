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
                put(1,new Student((long) 1,"Michael","micky","password"));
                put(2,new Student((long)2,"Jim","lo","pass"));
                put(3,new Student((long)3,"John","lo","pass"));
                put(4,new Student((long)4,"Kim","lo","pass"));
                put(5,new Student((long)5,"Mary","lo","pass"));
                put(6,new Student((long)6,"Larry","lo","pass"));
                put(7,new Student((long)7,"Bar","lo","pass"));
                put(8,new Student((long)8,"Bar","lo","pass"));
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
