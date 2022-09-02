package com.genspark.mycoursesapi.repository;

import com.genspark.mycoursesapi.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author elvisespinoza
 */

public interface CourseRepository extends JpaRepository<Course, Long> {
}
