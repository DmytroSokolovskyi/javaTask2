package com.example.javatask10.Task.models;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString(exclude = {"student"})

public class Lesson {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String title;

    @ManyToOne (cascade = {CascadeType.ALL},
                    fetch = FetchType.LAZY)
    @JsonIgnore
    private Student student;

    public Lesson(String title, Student student) {
        this.title = title;
        this.student = student;
    }

    public Lesson(String title) {
        this.title = title;
    }
}
