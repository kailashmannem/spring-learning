package com.application.learn_jpa_hibernate.course.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.application.learn_jpa_hibernate.course.Course;

@Component
public class CourseJpaCommandLineRunner implements CommandLineRunner{
    @Autowired
    private CourseJpaRepository repository;

    @Override
    public void run(String... args) throws Exception {
        repository.insert(new Course(1, "Learn AWS", "ABC"));
        System.out.println(repository.findById(1));
        repository.deleteById(1);
    }
    
}
