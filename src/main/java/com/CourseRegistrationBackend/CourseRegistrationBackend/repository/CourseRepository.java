package com.CourseRegistrationBackend.CourseRegistrationBackend.repository;

import com.CourseRegistrationBackend.CourseRegistrationBackend.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends JpaRepository<Course,Long>{
    // Add custom query methods if needed
}
