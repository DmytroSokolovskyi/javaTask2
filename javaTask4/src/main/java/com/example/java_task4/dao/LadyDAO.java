package com.example.java_task4.dao;

import com.example.java_task4.model.Lady;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@EnableJpaRepositories
public interface LadyDAO extends JpaRepository<Lady, Integer> {
}
