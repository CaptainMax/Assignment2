package com.example.Assignment2.service;

import com.example.Assignment2.domain.Student;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StudentService {
     public void saveStudent(Student student);
     void deleteStudent(int id);
     void updateStudent(Student student);
     Student getStudent(int id);
     List<Student> getAll();

}
