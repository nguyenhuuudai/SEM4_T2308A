package org.fai.study.demo_spring.services;

import org.fai.study.demo_spring.entities.Student;
import org.springframework.stereotype.Service;

import java.util.List;

public interface IStudentService {

    public List<Student> getStudents();
}
