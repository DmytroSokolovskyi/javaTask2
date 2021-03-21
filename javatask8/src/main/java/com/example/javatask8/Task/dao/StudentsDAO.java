package com.example.javatask8.Task.dao;

import com.example.javatask8.Task.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories
public interface StudentsDAO extends JpaRepository<Student, Integer> {
}
