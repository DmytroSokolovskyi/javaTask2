package com.example.java_task4.dao;

import com.example.java_task4.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@EnableJpaRepositories
public interface CarDAO extends JpaRepository<Car, Integer> {
}
