package com.example.thymeleaf.Lesson.dao;

import com.example.thymeleaf.Lesson.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Service;

@Service
@EnableJpaRepositories
public interface UserDAO extends JpaRepository<User, Integer> {
}
