package com.genspark.mycoursesapi.service;

import com.genspark.mycoursesapi.model.Course;
import com.genspark.mycoursesapi.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

/**
 * @author elvisespinoza
 */

@Service
public class CourseServiceImpl implements CourseService {
    private final CourseRepository courseRepository;

    public CourseServiceImpl(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    @Override
    public List<Course> findAllCourses() {
        return courseRepository.findAll();
    }

    @Override
    public void deleteCourse(Long id) {
        courseRepository.deleteById(id);
    }

    @Override
    public Course saveCourse(Course course) {
        course.setCreateTime(LocalDateTime.now());
        return courseRepository.save(course);
    }
}
