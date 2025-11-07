package com.application.learn_jpa_hibernate.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.application.learn_jpa_hibernate.course.Course;

@Repository
public class CourseJdbcRespository {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    public void insert(Course course) {
        jdbcTemplate.update("INSERT INTO COURSE (ID, NAME, AUTHOR) VALUES (?, ?, ?)", 
            course.getId(), course.getName(), course.getAuthor());
    }
    public void deleteById(long id) {
        jdbcTemplate.update("DELETE FROM COURSE WHERE ID = ?", id);
    }
    public Course findById(long id) {
        return jdbcTemplate.queryForObject("SELECT * FROM COURSE WHERE ID = ?", 
            new BeanPropertyRowMapper<Course>(Course.class), id);
    }
}
