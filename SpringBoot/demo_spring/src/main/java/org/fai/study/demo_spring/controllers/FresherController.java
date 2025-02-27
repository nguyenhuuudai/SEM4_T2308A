package org.fai.study.demo_spring.controllers;

import ch.qos.logback.core.model.Model;
import org.fai.study.demo_spring.services.IStudentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/fresher")
public class FresherController {
    private final IStudentService studentService;

    public FresherController(IStudentService studentService) {
        this.studentService = studentService;
    }
    @GetMapping("/list")
    public String GetStudents(Model model) {
        var students = studentService.getStudents();
        return "freshers/index";
    }
}
