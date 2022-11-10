package com.example.RestServices.controllers;

import com.example.RestServices.models.Course;
import com.example.RestServices.services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CourseController {

    @Autowired
    private CourseService courseService;

    @PostMapping("course/add")
    public void addCourse(@RequestBody Course course) {
        courseService.addCourse(course);
    }

    @GetMapping("course/{course_id}")
    public Course getCourse(@PathVariable Long course_id) {

        return courseService.getCourse(course_id);
    }

    @GetMapping("course/all")
    public List<Course> getAllCourse() {
        return courseService.getAll();
    }

    @DeleteMapping("course/delete/{id}")
    public void deleteCourse(@PathVariable Long id) {
        courseService.deleteCourse(id);
    }

    @PutMapping("course/update/{id}")
    public void updateCourse(@RequestBody Course course, @PathVariable Long id) {
        courseService.updateCourse(course,id);
    }
}
