package com.example.todo.controllers;

import com.example.todo.models.ListTodo;
import com.example.todo.service.implem.TodoService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/list")
@CrossOrigin(origins = "http://localhost:33237")
public class ListController {

private TodoService todoService;


    @GetMapping("/")
    public List<ListTodo> getList() {
        return todoService.getAll();
    }

    @PostMapping("/save")
    public void saveList(@RequestBody String title) {
        todoService.saveList(title);
    }

    @PutMapping("/update/{id}")
    public void updateList(@PathVariable int id,
                           @RequestBody String title) {
        todoService.updateList(id, title);
    }

    @DeleteMapping("/{id}")
    public void deleteList(@PathVariable int id) {
         System.out.println(id);
        todoService.deleteList(id);
    }

    @PostMapping("/search")
    public List<ListTodo> searchList(@RequestBody String key){
         System.out.println(key);
        List<ListTodo> qqq = todoService.searchList(key);
         System.out.println(qqq);
        return todoService.searchList(key);
        }

}
