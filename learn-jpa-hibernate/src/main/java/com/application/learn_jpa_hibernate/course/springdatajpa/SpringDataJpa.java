package com.application.learn_jpa_hibernate.course.springdatajpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.application.learn_jpa_hibernate.course.Course;

public interface SpringDataJpa extends JpaRepository<Course, Long> {
        List<Course> findByAuthor(String author);
        List<Course> findByName(String name);
}
