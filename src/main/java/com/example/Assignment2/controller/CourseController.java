package com.example.Assignment2.controller;

import com.example.Assignment2.domain.CourseResponse;
import com.example.Assignment2.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {
    private final CourseService cs;

    @Autowired
    public CourseController(@Qualifier("courseServiceImpl") CourseService cs){
        this.cs = cs;
    }

    @GetMapping("/course")
    public ResponseEntity<CourseResponse> getCoruse(){
        return new ResponseEntity<>(cs.getAllCourses(), HttpStatus.OK);
    }

    @GetMapping("/course/{id}")
    public ResponseEntity<CourseResponse> findStudentById(
            @PathVariable String id
    ){
        return new ResponseEntity<>(cs.getById(id), HttpStatus.OK);
    }

    @GetMapping("/CreateCourse/{course_id}/{course_info}/{semester}")
    public ResponseEntity<CourseResponse> createCoruse(
            @PathVariable String course_id,
            @PathVariable String course_info,
            @PathVariable String semester
    ){
        return new ResponseEntity<>(cs.createCourse(Integer.parseInt(course_id), course_info, semester), HttpStatus.OK);
    }

    @GetMapping("/deleteCOruse/{course_id}")
    public ResponseEntity<CourseResponse> deleteCoruse(
            @PathVariable String course_id
    ) {
        return new ResponseEntity<>(cs.deleteById(course_id), HttpStatus.OK);
    }
}
