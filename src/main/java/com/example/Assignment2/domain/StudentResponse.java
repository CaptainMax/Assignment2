package com.example.Assignment2.domain;

import java.util.List;

public class StudentResponse {
    private List<StudentDTO> data;

    public StudentResponse(List<StudentDTO> data) {
        this.data = data;
    }

    public List<StudentDTO> getData() {
        return data;
    }

    public void setData(List<StudentDTO> data) {
        this.data = data;
    }
}
