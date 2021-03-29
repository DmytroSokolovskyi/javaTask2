package com.example.todoback.dao;

import com.example.todoback.models.ListToDo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoDAO extends JpaRepository<ListToDo, Integer> {

}
