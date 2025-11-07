package com.application.learn_jpa_hibernate.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.application.learn_jpa_hibernate.course.Course;

@Component
public class CourseJdbcCommandLineRunner implements CommandLineRunner{
    @Autowired
    private CourseJdbcRespository repository;

    @Override
    public void run(String... args) throws Exception {
        repository.insert(new Course(1, "ABC", "XYZ"));
        System.out.println(repository.findById(1));
        repository.deleteById(1);
    }
    
}
