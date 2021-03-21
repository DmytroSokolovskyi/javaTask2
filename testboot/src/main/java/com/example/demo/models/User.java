package com.example.demo.models;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String family;
    private int age;
    private String password;
    private String img;

    public User(String name, String family, int age, String password, String img) {
        this.name = name;
        this.family = family;
        this.age = age;
        this.password = password;
        this.img = img;
    }

    public User(String name, String img) {
        this.name = name;
        this.img = img;
    }

}
