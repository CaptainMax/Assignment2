package com.example.Assignment2.service;

import com.example.Assignment2.domain.Student;
import com.example.Assignment2.domain.StudentResponse;
import org.springframework.stereotype.Service;

@Service
public interface StudentService {
    StudentResponse getAllStudent();
    StudentResponse getById(String id);
    StudentResponse createStudent(int student_id, String first_name, String last_name, String GPA);
    StudentResponse deleteById(String id);
    StudentResponse updateById(String id);

}
