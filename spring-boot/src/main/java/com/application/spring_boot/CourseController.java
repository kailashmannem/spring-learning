package com.application.spring_boot;

import java.util.List;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class CourseController {
    public String requestMethodName(@RequestParam String param) {
        return new String();
    } 

    @RequestMapping("/courses")
    public List<Course> getllCourses() {
        return List.of(
            new Course(1, "Learn Spring Boot", "Mannem"),
            new Course(2, "Learn AWS", "Mannem"),
            new Course(3, "Learn Azure", "Mannem")
        );
    }
}
