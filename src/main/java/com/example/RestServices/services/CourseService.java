package com.example.RestServices.services;

import com.example.RestServices.models.Course;
import com.example.RestServices.repositories.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {

    @Autowired
    private CourseRepository courseRepository;


    public void addCourse(Course course) {
        courseRepository.save(course);
    }

    public Course updateCourse(Course course, Long courseId) {
        course.setCourseId(courseId);
        return courseRepository.save(course);
    }

    public void deleteCourse(Long courseId)  {
        courseRepository.deleteById(courseId);
    }

    public Course getCourse(Long courseId) {
        return courseRepository.findById(courseId).orElse(null);
    }

    public List<Course> getAll() {
        return courseRepository.findAll();
    }
}
