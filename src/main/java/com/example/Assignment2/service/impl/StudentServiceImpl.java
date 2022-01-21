package com.example.Assignment2.service.impl;


import com.example.Assignment2.dao.StudentJDBCDAO;
import com.example.Assignment2.domain.Student;
import com.example.Assignment2.domain.StudentDTO;
import com.example.Assignment2.domain.StudentResponse;
import com.example.Assignment2.service.StudentService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    //jdbc injection
    @Resource
    StudentJDBCDAO studentJDBCDAO;

    @Override
    public void saveStudent(Student student) {
        studentJDBCDAO.save(student);
    }

    @Override
    public void deleteStudent(int id) {
        studentJDBCDAO.deleteById(id);
    }

    @Override
    @Transactional
    public void updateStudent(Student student) {
//        if(Integer.valueOf(student.getStudent_id()) == null){
//
//        }
//        studentJDBCDAO.deleteById(student.getStudent_id());
//        studentJDBCDAO.save(student);
        studentJDBCDAO.updateById(student);
    }

    @Override
    public Student getStudent(int id) {
        return studentJDBCDAO.findById(id);
    }

    @Override
    public List<Student> getAll() {
        return studentJDBCDAO.findAll();
    }
}
