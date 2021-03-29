package com.example.todo.controllers;

import com.example.todo.models.Todo;
import com.example.todo.service.ITodo;
import com.example.todo.service.implem.TodoService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/todo")
@CrossOrigin(origins = "http://localhost:33237")
public class TodoController {

    private TodoService todoService;

    @GetMapping("/{id}")
    public List<ITodo> getTodos(@PathVariable int id) {
        return todoService.getAllTodo(id);
    }

    @PostMapping("/save/{id}")
    public void saveTodo(@PathVariable int id,
                         @RequestBody Todo todo) {
        todoService.saveTodo(id, todo);
    }
}
