package com.example.java_task4.controllers;


import com.example.java_task4.dao.LessonDAO;
import com.example.java_task4.model.Lesson;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class LessonController {

    private LessonDAO lessonDAO;

    @GetMapping("/savelesson")
    public void savelesson(@RequestParam String lesson) {
        lessonDAO.save(new Lesson(lesson));
    }

    @GetMapping("/lesson")
    public List<Lesson> getLessons() {
        return lessonDAO.findAll();
    }
}
