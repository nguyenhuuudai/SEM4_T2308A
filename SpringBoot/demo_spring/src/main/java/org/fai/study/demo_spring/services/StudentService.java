package org.fai.study.demo_spring.services;

import org.fai.study.demo_spring.entities.Student;
import org.fai.study.demo_spring.repositories.IStudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentService implements IStudentService {

    private final IStudentRepository studentRepository;

    public StudentService(IStudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> getStudents() {
        try {
            var students = studentRepository.findAll();
            return students;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

}
