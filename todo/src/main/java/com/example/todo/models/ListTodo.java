package com.example.todo.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;


@Entity
@NoArgsConstructor
@Getter
@Setter
@ToString
public class ListTodo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String title;
    private LocalTime cretedAt;
    private LocalTime updatedAt;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "list_todo_id")
    private List<Todo> todos = new ArrayList();

    public ListTodo(String title, LocalTime cretedAt, LocalTime updatedAt, List<Todo> todos) {
        this.title = title;
        this.cretedAt = cretedAt;
        this.updatedAt = updatedAt;
        this.todos = todos;
    }
}
