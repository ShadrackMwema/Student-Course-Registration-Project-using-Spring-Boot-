package com.CourseRegistrationBackend.CourseRegistrationBackend.service;

import com.CourseRegistrationBackend.CourseRegistrationBackend.model.Course;
import com.CourseRegistrationBackend.CourseRegistrationBackend.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CourseService {

    @Autowired
    private CourseRepository courseRepository;
    @Transactional
    public Course registerCourse(Course course) {
        // You can add business logic/validation here before saving to the database
        return courseRepository.save(course);
    }



}
