package com.example.Assignment2.service.impl;

import com.example.Assignment2.domain.*;
import com.example.Assignment2.service.CourseService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {

    Course c1 = new Course(1, "Math3300", "Spring2022");
    Course c2 = new Course(2, "CS4300", "Spring2022");

    List<CourseDTO> list1 = new ArrayList<>();
    {
        list1.add(new CourseDTO(c1));
        list1.add(new CourseDTO(c2));
    }

    List<CourseDTO> courseDTOS = Arrays.asList(new CourseDTO(c1), new CourseDTO(c2));

    @Override
    public CourseResponse getAllCourses() {
        return new CourseResponse(list1);
    }


    // 1. if id is not int the order will cause issue
    // 2. if delete ont of then may cause issue
    @Override
    public CourseResponse getById(String id) {
        List<CourseDTO> list2 = Arrays.asList(courseDTOS.get(Integer.parseInt(id) - 1));

        return new CourseResponse(list2);
    }

    @Override
    public CourseResponse createCourse(int course_id, String course_info, String semester) {
        list1.add(new CourseDTO(new Course(course_id, course_info, semester)));
        return new CourseResponse(list1);
    }

    @Override
    public CourseResponse deleteById(String id) {
        return new CourseResponse((List<CourseDTO>) courseDTOS.remove(Integer.parseInt(id) - 1));
    }

    // will fix later
    @Override
    public CourseResponse updateById() {
        return null;
    }
}
