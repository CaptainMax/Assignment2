package com.example.Assignment2.dao;

import com.example.Assignment2.domain.Student;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

@Repository
public class StudentJDBCDAO {
    @Resource
    private JdbcTemplate jdbcTemplate;

    public void save(Student student){
        jdbcTemplate.update(
                "INSERT INTO student(id, gpa, first_name, last_name) values(?,?,?,?)",
                student.getId(),
                student.getGPA(),
                student.getFirst_name(),
                student.getLast_name());
    }
    public void deleteById(int id){
        jdbcTemplate.update("DELETE FROM student WHERE id = ?", id);
    }
    public void updateById(Student student){
        jdbcTemplate.update(
                "UPDATE student SET GPA = ?, first_name = ?, last_name = ? WHERE id =?",
                student.getGPA(),
                student.getFirst_name(),
                student.getLast_name(),
                student.getId());
    }
    public Student findById(int id){
        return jdbcTemplate.queryForObject("SELECT * From student WHERE id = ?", new Object[]{id},
                new BeanPropertyRowMapper<>(Student.class));
    }

    public List<Student> findAll(){
        return (List<Student>)jdbcTemplate.query("SELECT * FROM student",
                new BeanPropertyRowMapper<>(Student.class));
    }
}
