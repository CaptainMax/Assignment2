package com.example.Assignment2.service.impl;


import com.example.Assignment2.domain.Student;
import com.example.Assignment2.domain.StudentDTO;
import com.example.Assignment2.domain.StudentResponse;
import com.example.Assignment2.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    Student s1 = new Student(1, "aaa", "bbb", "3.85");
    Student s2 = new Student(2, "ddd", "ccc", "3.55");

    List<StudentDTO> list1 = new ArrayList<>();
    {
        list1.add(new StudentDTO(s1));
        list1.add(new StudentDTO(s2));
    }

    List<StudentDTO> studentDTOS = Arrays.asList(new StudentDTO(s1), new StudentDTO((s2)));

    @Override
    public StudentResponse getAllStudent() {
        return new StudentResponse(list1);
    }

    @Override
    public StudentResponse getById(String id) {

        List<StudentDTO> list2 = Arrays.asList(studentDTOS.get(Integer.parseInt(id) - 1));

        //List<StudentDTO> list2 = Arrays.asList(new StudentDTO(s1));
        //List<StudentDTO> list2 = Arrays.asList(list1.stream().filter(u -> u.getStudent_id() == (Integer.parseInt(id) - 1)));
        return new StudentResponse(list2);
    }

    @Override
    public StudentResponse deleteById(String id) {
        return new StudentResponse((List<StudentDTO>) studentDTOS.remove(Integer.parseInt(id) - 1));
    }

    @Override
    public StudentResponse createStudent(int student_id, String first_name, String last_name, String GPA) {
        list1.add(new StudentDTO(new Student(student_id, first_name, last_name, GPA)));
        return new StudentResponse(list1);
    }

    @Override
    public StudentResponse updateById(String id) {

        return null;
    }
}
