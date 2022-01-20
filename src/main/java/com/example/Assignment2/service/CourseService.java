package com.example.Assignment2.service;

import com.example.Assignment2.domain.CourseResponse;
import org.springframework.stereotype.Service;

@Service
public interface CourseService {
    CourseResponse getAllCourses();
    CourseResponse getById(String id);
    CourseResponse createCourse(int course_id, String course_info, String semester);
    CourseResponse deleteById(String id);
    CourseResponse updateById();

}
