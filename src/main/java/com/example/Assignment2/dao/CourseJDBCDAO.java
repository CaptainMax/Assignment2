package com.example.Assignment2.dao;

import com.example.Assignment2.domain.Course;
import com.example.Assignment2.domain.Student;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

@Repository
public class CourseJDBCDAO {
    @Resource
    private JdbcTemplate jdbcTemplate;

    public void save(Course course){
        jdbcTemplate.update(
                "INSERT INTO course(course_id, class_info, semester) values(?,?,?)",
                course.getCourse_id(),
                course.getClass_info(),
                course.getSemester());

    }
    public void deleteById(int id){
        jdbcTemplate.update("DELETE FROM course WHERE course_id = ?", id);
    }
    public void updateById(Course course){
        jdbcTemplate.update(
                "UPDATE student SET class_info = ?, semester = ? WHERE course_id =?",
                course.getClass_info(),
                course.getSemester(),
                course.getCourse_id());
    }
    public Course findById(int id){
        return jdbcTemplate.queryForObject("SELECT * From course WHERE course_id = ?", new Object[]{id},
                new BeanPropertyRowMapper<>(Course.class));
    }

    public List<Course> findAll(){
        return (List<Course>)jdbcTemplate.query("SELECT * FROM course",
                new BeanPropertyRowMapper<>(Course.class));
    }
}
