package com.CourseRegistrationBackend.CourseRegistrationBackend.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Course {
    @Id
    @GeneratedValue
    private Long id;

    private String name;


    private String course;

    // Constructors, getters, and setters

    public Course() {
    }

    public Course(String name, String course) {
        this.name = name;
        this.course = course;
    }

    // Getters and setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    // toString method for logging or debugging

    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                ", course='" + course + '\'' +
                '}';
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
