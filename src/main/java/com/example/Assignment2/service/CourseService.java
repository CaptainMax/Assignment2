package com.example.Assignment2.service;

import com.example.Assignment2.domain.Course;
import com.example.Assignment2.domain.CourseResponse;
import com.example.Assignment2.domain.Student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CourseService {
    public void saveCourse(Course course);
    void deleteCourse(int id);
    void updateCourse(Course course);
    Course getCourse(int id);
    List<Course> getAll();

}
