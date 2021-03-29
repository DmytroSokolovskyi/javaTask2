package com.example.todo.dao;

import com.example.todo.models.ListTodo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoDAO extends JpaRepository<ListTodo, Integer> {
}
