package com.genspark.mycoursesapi.service;

import com.genspark.mycoursesapi.model.Course;

import java.util.List;

public interface CourseService {
    List<Course> findAllCourses();

    void deleteCourse(Long id);

    Course saveCourse(Course course);
}
