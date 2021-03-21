package com.example.javatask10.Task.controllers;

import com.example.javatask10.Task.dao.StudentsDAO;
import com.example.javatask10.Task.models.Book;
import com.example.javatask10.Task.models.Lesson;
import com.example.javatask10.Task.models.Student;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
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

    @PostMapping("/save")
    public void saveStudentWithImage(@RequestParam String name,
                                     @RequestParam MultipartFile image) {
        String pathToImg = System.getProperty("user.home")
                + File.separator + "javaImg" + File.separator;

        try {
            image.transferTo(new File(pathToImg + image.getOriginalFilename()));
        } catch (IOException e) {
            e.printStackTrace();
        }

        Student student = new Student();
        student.setName(name);
        String fileName = image.getOriginalFilename();
        student.setImg(fileName);

        studentsDAO.save(student);

 System.out.println(name);
 System.out.println(image);


//        System.getProperties().keySet().forEach(System.out::println);
//        System.getProperties().keySet().forEach(System.out::println);
//        System.getProperty("user.home");
//         System.out.println(System.getProperty("user.home"));
    }

    @GetMapping("/{id}")
    public Student getImageofStudent (@PathVariable int id) {

    return studentsDAO.getOne(id);
    }


}
