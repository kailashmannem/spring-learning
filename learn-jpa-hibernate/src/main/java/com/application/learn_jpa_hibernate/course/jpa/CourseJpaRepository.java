package com.application.learn_jpa_hibernate.course.jpa;
import org.springframework.stereotype.Repository;

import com.application.learn_jpa_hibernate.course.Course;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class CourseJpaRepository {
    @PersistenceContext
    private EntityManager entity;

    public void insert(Course course) {
        entity.merge(course);
    }

    public void deleteById(long id) {
        Course course = findById(id);
        entity.remove(course);
    }

    public Course findById(long id) {
        return entity.find(Course.class, id);
    }
}
