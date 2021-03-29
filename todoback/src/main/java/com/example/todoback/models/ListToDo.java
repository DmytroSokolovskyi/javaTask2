package com.example.todoback.models;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor
@Getter
@Setter
@ToString
public class ListToDo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String title;
    private String cretedAt;
    private String updatedAt;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Todo> todos = new ArrayList();


    public ListToDo(String title, String cretedAt, String updatedAt, List<Todo> todos) {
        this.title = title;
        this.cretedAt = cretedAt;
        this.updatedAt = updatedAt;
        this.todos = todos;
    }
}
