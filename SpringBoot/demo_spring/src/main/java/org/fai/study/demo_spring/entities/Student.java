package org.fai.study.demo_spring.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String email;
    private String first_name;
    private String last_name;
    private Integer id_class;

    public Student() {
    }

    public Student(String email, String first_name, Integer id, Integer id_class, String last_name) {
        this.email = email;
        this.first_name = first_name;
        this.id = id;
        this.id_class = id_class;
        this.last_name = last_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId_class() {
        return id_class;
    }

    public void setId_class(Integer id_class) {
        this.id_class = id_class;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }
}
