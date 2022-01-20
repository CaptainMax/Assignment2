package com.example.Assignment2.domain;

public class CourseDTO {
    private int course_id;
    private String class_info;
    private String semester;

    public CourseDTO(Course c){
        this(c.getCourse_id(), c.getClass_info(), c.getClass_info());
    }

    public CourseDTO(int course_id, String class_info, String semester) {
        this.course_id = course_id;
        this.class_info = class_info;
        this.semester = semester;
    }

    public int getCourse_id() {
        return course_id;
    }

    public void setCourse_id(int course_id) {
        this.course_id = course_id;
    }

    public String getClass_info() {
        return class_info;
    }

    public void setClass_info(String class_info) {
        this.class_info = class_info;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }
}
