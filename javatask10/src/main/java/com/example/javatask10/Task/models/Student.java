package com.example.javatask10.Task.models;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString(exclude = {"lessons", "books"})

public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    @OneToMany(
            cascade = {CascadeType.ALL},
            fetch = FetchType.LAZY)
    @JoinColumn(name = "student_id")
    private List<Lesson> lessons = new ArrayList<>();

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "student_books",
            joinColumns = {@JoinColumn(name = "students_id")},
            inverseJoinColumns = {@JoinColumn(name = "books_id")}
    )
    private List<Book> bookList = new ArrayList<>();
    private String img;


    public Student(String name, List<Lesson> lessons) {
        this.name = name;
        this.lessons = lessons;
    }

    public Student(String name) {
        this.name = name;
    }

    public Student(String name, String img) {
        this.name = name;
        this.img = img;
    }
}
