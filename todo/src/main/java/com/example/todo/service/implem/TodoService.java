package com.example.todo.service.implem;

import com.example.todo.dao.TodoDAO;
import com.example.todo.models.ListTodo;
import com.example.todo.models.Todo;
import com.example.todo.service.ITodo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;


@Service
@AllArgsConstructor
public class TodoService implements ITodo {

    private TodoDAO todoDAO;

    @Override
    public List<ListTodo> getAll() {
        return todoDAO.findAll();
    }

    @Override
    public void saveList(String title) {
        ListTodo list = new ListTodo();
        Date d = new Date();
        list.setTitle(title);
        list.setCretedAt(LocalTime.now());
        todoDAO.save(list);
    }

    @Override
    public void updateList(int id, String title) {
        ListTodo byId = todoDAO.getOne(id);
        byId.setUpdatedAt(LocalTime.now());
        byId.setTitle(title);
        todoDAO.save(byId);
    }

    @Override
    public void deleteList(int id) {
         System.out.println(id);
        todoDAO.deleteById(id);
    }

    @Override
    public List<ListTodo> searchList(String key) {
        List<ListTodo> getAll = todoDAO.findAll();
        List<ListTodo> rezult = getAll.stream()
                .filter(i -> i.getTitle().toLowerCase().contains(key.toLowerCase()))
                .collect(Collectors.toList());
         System.out.println(rezult);
        return rezult;
    }

    @Override
    public void saveTodo(int id, Todo todo) {
        ListTodo byId = todoDAO.getOne(id);
        List<Todo> t = new ArrayList<>();
        t.add(todo);
        byId.setTodos(t);
        todoDAO.save(byId);
    }

    @Override
    public List<ITodo> getAllTodo(int id) {
        return null;
    }
}
