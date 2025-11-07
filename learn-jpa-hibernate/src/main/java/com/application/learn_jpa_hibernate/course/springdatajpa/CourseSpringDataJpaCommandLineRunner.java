package com.application.learn_jpa_hibernate.course.springdatajpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.application.learn_jpa_hibernate.course.Course;

@Component
public class CourseSpringDataJpaCommandLineRunner implements CommandLineRunner{
    @Autowired
    private SpringDataJpa repository;

    @Override
    public void run(String... args) throws Exception {
        repository.save(new Course(1, "Learn AWS", "Mannem"));
        System.out.println(repository.findById(1L));
        repository.deleteById(1L);
        repository.findAll();
        repository.count();
        repository.findByAuthor("XYZ");
        repository.findByName("ABC");
    }
    
}
