package com.example.javatask8.Task.models;


import javax.persistence.*;

import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString(exclude = {"students"})
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String info;
    @ManyToMany(cascade = CascadeType.ALL,
            mappedBy ="bookList")
    private List<Student> students = new ArrayList<>();

    public Book(String info) {
        this.info = info;
    }
}
