package com.example.Assignment2.domain;

public class StudentDTO {
    private int student_id;
    private String first_name;
    private String last_name;
   // private String GPA;

    public StudentDTO(Student s){
        this(s.getStudent_id(), s.getFirst_name(), s.getLast_name());
    }
    public StudentDTO(int student_id, String first_name, String last_name) {
        this.student_id = student_id;
        this.first_name = first_name;
        this.last_name = last_name;
        //this.GPA = GPA;
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

//    public String getGPA() {
//        return GPA;
//    }
//
//    public void setGPA(String GPA) {
//        this.GPA = GPA;
//    }
}
