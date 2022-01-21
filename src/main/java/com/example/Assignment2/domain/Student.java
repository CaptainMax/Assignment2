package com.example.Assignment2.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Student {


    private int id;

    private String first_name;

    private String last_name;

    private String GPA;
//    private Date last_update_time;
//    private Date registered_time;
//    private boolean active;



}
