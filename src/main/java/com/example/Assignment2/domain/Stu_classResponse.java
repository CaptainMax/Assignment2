package com.example.Assignment2.domain;

import java.util.List;

public class Stu_classResponse {

    private List<Stu_classDTO> data;

    public Stu_classResponse(List<Stu_classDTO> data) {
        this.data = data;
    }

    public List<Stu_classDTO> getData() {
        return data;
    }

    public void setData(List<Stu_classDTO> data) {
        this.data = data;
    }
}
