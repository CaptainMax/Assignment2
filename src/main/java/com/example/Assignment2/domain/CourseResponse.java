package com.example.Assignment2.domain;

import java.util.List;

public class CourseResponse {
    private List<CourseDTO> data;

    public CourseResponse(List<CourseDTO> data) {
        this.data = data;
    }

    public List<CourseDTO> getData() {
        return data;
    }

    public void setData(List<CourseDTO> data) {
        this.data = data;
    }
}
