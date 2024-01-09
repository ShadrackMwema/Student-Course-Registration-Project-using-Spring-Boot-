package com.CourseRegistrationBackend.CourseRegistrationBackend.controller;

import com.CourseRegistrationBackend.CourseRegistrationBackend.model.Course;
import com.CourseRegistrationBackend.CourseRegistrationBackend.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CourseController {

    @Autowired
    private CourseService courseService;

    @GetMapping("/registration")
    public String showRegistrationForm(Model model) {
        model.addAttribute("course", new Course());
        return "index";
    }

    @PostMapping("/registration")
    public String registerCourse(@ModelAttribute("course") Course course) {
        courseService.registerCourse(course);
        return "redirect:/registration?success";
    }

}
