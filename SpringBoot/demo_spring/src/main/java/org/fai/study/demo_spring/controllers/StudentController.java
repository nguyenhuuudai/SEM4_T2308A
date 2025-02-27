package org.fai.study.demo_spring.controllers;

import org.fai.study.demo_spring.entities.Student;
import org.fai.study.demo_spring.services.IStudentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/api/v1/student/")
public class StudentController {
    private final IStudentService studentService;

    public StudentController(IStudentService studentService) {
        this.studentService = studentService;
    }
    @GetMapping("list")
    public List<Student> getAllStudents() {
        try {
            var students = this.studentService.getStudents();
            return students;
        } catch (Exception ex){
            System.out.println(ex.getMessage());
        }
        return null;
    }
}
