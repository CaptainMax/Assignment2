package com.example.Assignment2.controller;

import com.example.Assignment2.domain.Student;
import com.example.Assignment2.domain.StudentResponse;
import com.example.Assignment2.service.AjaxResponse;
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
public class StudentController {

    //injection
    @Resource
    StudentService studentService;

    //get student by id
    @GetMapping("students/{id}")
    public AjaxResponse getStudent(@PathVariable("id") int id){
        Student student = studentService.getStudent(id);
        log.info("Student: " + student);
        return AjaxResponse.success(student);
    }

    //create a student
    @RequestMapping(value = "/students", method = RequestMethod.POST)
    @PostMapping("/students")
    public AjaxResponse postStudent(@RequestBody Student student){

        studentService.saveStudent(student);

        log.info("SaveArticle:" + student);

        return AjaxResponse.success();
    }

    //update a student
    @PutMapping("/students")
    public AjaxResponse updateStudent(@RequestBody Student student){

        studentService.updateStudent(student);
        log.info("updateArticle:" + student);

        return AjaxResponse.success();
    }

    //delete a student
    @DeleteMapping("/students/{id}")
    public AjaxResponse deleteStudent(@PathVariable("id") int id){

        studentService.deleteStudent(id);

        log.info("updateArticle:" + id);

        return AjaxResponse.success();
    }

    //get all
    @GetMapping("/students")
    public AjaxResponse getStudents(){


        List<Student> students = studentService.getAll();

        log.info("article:" + students);

        return AjaxResponse.success(students);
    }
}
