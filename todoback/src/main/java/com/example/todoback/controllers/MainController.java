package com.example.todoback.controllers;

import com.example.todoback.dao.TodoDAO;
import com.example.todoback.models.ListToDo;
import com.example.todoback.models.Todo;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@AllArgsConstructor
public class MainController {

private TodoDAO todoDAO;
//
    List<Todo> todos = new ArrayList();
//
//    ListToDo mytodo = new ListToDo("qwert", "12", "14", todos);
//
    todoDAO.save();

}
