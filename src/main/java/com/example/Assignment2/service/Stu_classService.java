package com.example.Assignment2.service;

import com.example.Assignment2.domain.Stu_classResponse;
import com.example.Assignment2.domain.StudentResponse;
import org.springframework.stereotype.Service;

@Service
public interface Stu_classService {

    Stu_classResponse getAll();
    Stu_classResponse getByClassId(String id);
    Stu_classResponse getByStudentId(String id);
}
