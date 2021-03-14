package com.example.javatask8.Task.controllers;

import com.example.javatask8.Task.dao.StudentsDAO;
import com.example.javatask8.Task.models.Book;
import com.example.javatask8.Task.models.Lesson;
import com.example.javatask8.Task.models.Student;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;



@RestController
@AllArgsConstructor
@RequestMapping("/students")
public class MainController {

    private StudentsDAO studentsDAO;


    @GetMapping("/")
    public List<Student> getStudent () {
        return studentsDAO.findAll();
    }

    @GetMapping("/save")
    public void save() {
        Student student = new Student();
        student.setName("Igor");
        List<Lesson> lessonList = new ArrayList<>();
        lessonList.add(new Lesson("java"));
        lessonList.add(new Lesson("JS"));
        student.setLessons(lessonList);
        studentsDAO.save(student);

    }
    
    @GetMapping("/savewithbooks")
    public void saveWithbooks () {
        Student student = new Student();
        List<Book> books = new ArrayList<>();
        books.add(new Book("java"));
        books.add(new Book("JS"));
        books.add(new Book("HTML"));
        books.add(new Book("CSS"));
        student.setBookList(books);
        studentsDAO.save(student);
    }


}
