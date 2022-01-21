package com.example.Assignment2.service.impl;

import com.example.Assignment2.dao.CourseJDBCDAO;
import com.example.Assignment2.dao.StudentJDBCDAO;
import com.example.Assignment2.domain.*;
import com.example.Assignment2.service.CourseService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {
    //jdbc injection
    @Resource
    CourseJDBCDAO courseJDBCDAO;
    @Override
    public void saveCourse(Course course) {
        courseJDBCDAO.save(course);
    }

    @Override
    public void deleteCourse(int id) {
        courseJDBCDAO.deleteById(id);
    }

    @Override
    public void updateCourse(Course course) {
        courseJDBCDAO.updateById(course);
    }

    @Override
    public Course getCourse(int id) {
        return courseJDBCDAO.findById(id);
    }

    @Override
    public List<Course> getAll() {
        return courseJDBCDAO.findAll();
    }
}
