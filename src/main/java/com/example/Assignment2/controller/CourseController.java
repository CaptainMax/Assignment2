package com.example.Assignment2.controller;

import com.example.Assignment2.domain.Course;
import com.example.Assignment2.domain.CourseResponse;
import com.example.Assignment2.domain.Student;
import com.example.Assignment2.service.AjaxResponse;
import com.example.Assignment2.service.CourseService;
import com.example.Assignment2.service.StudentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@Slf4j
@RestController
@RequestMapping("/rest")
public class CourseController {
    //injection
    @Resource
    CourseService courseService;

    //get course by id
    @GetMapping("/courses/{id}")
    public AjaxResponse getCoruse(@PathVariable("id") int id){
        Course course = courseService.getCourse(id);
        log.info("Course: " + course);
        return AjaxResponse.success(course);
    }

    //create a course
    //@RequestMapping(value = "/courses", method = RequestMethod.POST)
    @PostMapping("/courses")
    public AjaxResponse postCourse(@RequestBody Course course){

        courseService.saveCourse(course);

        log.info("SaveArticle:" + course);

        return AjaxResponse.success();
    }

    //update a course
    @PutMapping("/courses")
    public AjaxResponse updateCourse(@RequestBody Course course){

        courseService.updateCourse(course);
        log.info("updateCourse:" + course);

        return AjaxResponse.success();
    }

    //delete a student
    @DeleteMapping("/courses/{id}")
    public AjaxResponse deleteCourse(@PathVariable("id") int id){

        courseService.deleteCourse(id);

        log.info("deleteCoruse:" + id);

        return AjaxResponse.success();
    }

    //get all
    @GetMapping("/courses")
    public AjaxResponse getStudents(){


        List<Course> courses = courseService.getAll();

        log.info("article:" + courses);

        return AjaxResponse.success(courses);
    }
}
