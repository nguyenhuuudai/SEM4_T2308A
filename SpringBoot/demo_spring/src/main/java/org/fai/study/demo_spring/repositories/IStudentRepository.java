package org.fai.study.demo_spring.repositories;

import org.fai.study.demo_spring.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IStudentRepository extends JpaRepository<Student, Integer> {
}
