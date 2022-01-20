package com.example.Assignment2.controller;

import com.example.Assignment2.domain.Student;
import com.example.Assignment2.domain.StudentResponse;
import com.example.Assignment2.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("student")
public class StudentController {
    private final StudentService ss;

    @Autowired

    public StudentController(@Qualifier("studentServiceImpl") StudentService ss) {
        this.ss = ss;
    }

    @GetMapping("/student")
    public ResponseEntity<StudentResponse> getStudent(){
        return new ResponseEntity<>(ss.getAllStudent(), HttpStatus.OK);
    }

    @GetMapping("/student/{id}")
    public ResponseEntity<StudentResponse> findStudentById(
            @PathVariable(value = "id") String id
    ){
        return new ResponseEntity<>(ss.getById(id), HttpStatus.OK);
    }

    @GetMapping("/DeleteStudent/{id}")
    public ResponseEntity<StudentResponse> deleteById(
            @PathVariable(value = "id") String id
    ){
        return new ResponseEntity<>(ss.deleteById(id), HttpStatus.OK);
    }

    //try to use jpa
//    @GetMapping("/DeleteStudent/{id}")
//    @ResponseBody
//    public Student getByUserId(int student_id){
//        Student students = StudentResponse.findByUserId(student_id);
//        return students;
//    }
//    public ResponseEntity<StudentResponse> deleteById(
//            @PathVariable(value = "id") String id
//    ){
//
//        return new ResponseEntity<>(ss.deleteById(id), HttpStatus.OK);
//    }


    //int student_id, String first_name, String last_name, String GPA
    @GetMapping("/CreateStudent/{student_id}/{first_name}/{last_name}/{GPA}")
    public ResponseEntity<StudentResponse> createStudent(
            @PathVariable String student_id,
            @PathVariable String first_name,
            @PathVariable String last_name,
            @PathVariable String GPA

    ){
        return new ResponseEntity<>(ss.createStudent(Integer.parseInt(student_id), first_name, last_name, GPA), HttpStatus.OK);
    }

    @GetMapping("/updateStudent/{student_id}")
    public ResponseEntity<StudentResponse> updateStudent(
            @PathVariable String student_id
    ){
        return new ResponseEntity<>(ss.updateById(student_id), HttpStatus.OK);
    }
}
