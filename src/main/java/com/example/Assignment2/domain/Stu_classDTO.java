package com.example.Assignment2.domain;

public class Stu_classDTO {
    private int id;
    private int stu_id;
    private int class_id;
    private String grade;

    public Stu_classDTO(Stu_class sc){
        this(sc.getId(), sc.getStu_id(), sc.getClass_id(), sc.getGrade());
    }

    public Stu_classDTO(int id, int stu_id, int class_id, String grade) {
        this.id = id;
        this.stu_id = stu_id;
        this.class_id = class_id;
        this.grade = grade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStu_id() {
        return stu_id;
    }

    public void setStu_id(int stu_id) {
        this.stu_id = stu_id;
    }

    public int getClass_id() {
        return class_id;
    }

    public void setClass_id(int class_id) {
        this.class_id = class_id;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
}
