package org.fai.study.wcd_demo_01.entities;

import jakarta.persistence.*;


@Table(name = "class_name")
@Entity
public class ClassRoom {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int id_class;
    public String class_name;
    public int number_member;

    public ClassRoom() {
    }

    public ClassRoom(String class_name, int id_class, int number_member) {
        this.class_name = class_name;
        this.id_class = id_class;
        this.number_member = number_member;
    }

    public String getClass_name() {
        return class_name;
    }

    public void setClass_name(String class_name) {
        this.class_name = class_name;
    }

    public int getId_class() {
        return id_class;
    }

    public void setId_class(int id_class) {
        this.id_class = id_class;
    }

    public int getNumber_member() {
        return number_member;
    }

    public void setNumber_member(int number_member) {
        this.number_member = number_member;
    }
}
