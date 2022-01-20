package com.example.Assignment2.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "Student")
public class Student {
    @Id
    private int student_id;
    @Column
    private String first_name;
    @Column
    private String last_name;
    @Column
    private String GPA;
//    private Date last_update_time;
//    private Date registered_time;
//    private boolean active;

    public Student(int student_id, String first_name, String last_name, String GPA) {
        this.student_id = student_id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.GPA = GPA;
    }

    public int getStudent_id() {
        return student_id;
    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getGPA() {
        return GPA;
    }

    public void setGPA(String GPA) {
        this.GPA = GPA;
    }

//    public Date getLast_update_time() {
//        return last_update_time;
//    }
//
//    public void setLast_update_time(Date last_update_time) {
//        this.last_update_time = last_update_time;
//    }
//
//    public Date getRegistered_time() {
//        return registered_time;
//    }
//
//    public void setRegistered_time(Date registered_time) {
//        this.registered_time = registered_time;
//    }
//
//    public boolean isActive() {
//        return active;
//    }
//
//    public void setActive(boolean active) {
//        this.active = active;
//    }
}
