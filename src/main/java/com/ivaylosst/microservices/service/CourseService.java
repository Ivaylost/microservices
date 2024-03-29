package com.ivaylosst.microservices.service;

import com.ivaylosst.microservices.model.Course;

import java.util.List;

public interface CourseService {
    Course saveCourse(Course course);

    void deleteCourse(Long courseId);

    List<Course> findAllCourses();
}
