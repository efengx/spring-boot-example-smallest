package com.spring.boot.example.smallest.Entity;

import org.springframework.web.bind.annotation.RequestMapping;

import javax.persistence.*;

@Entity
@Table(name="user")
public class UserEntity {
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.AUTO,generator = "")
    private int id;

    @Column
    private String name;

    @Column
    private int age;

    @Column
    private String school;

    public UserEntity(int id, String name, int age, String school) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.school = school;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSchool() {
        return school;
    }
}
