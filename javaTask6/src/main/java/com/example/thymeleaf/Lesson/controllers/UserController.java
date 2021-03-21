//package com.example.thymeleaf.Lesson.controllers;
//
//
//import com.example.thymeleaf.Lesson.dao.UserDAO;
//import com.example.thymeleaf.Lesson.models.User;
//import lombok.AllArgsConstructor;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//
//import java.util.Map;
//import java.util.Set;
//
//@Controller
//@AllArgsConstructor
//public class MainController {
//
//    private UserDAO userDAO;
//
//    @GetMapping("/")
//    public String home() {
//        System.out.println("index");
//        return "index.html";
//    }
//
//    @GetMapping("/hello")
//    public String hello(Model model) {
//        model.addAttribute("x", "QWERTY");
//        return "hello.html";
//    }
//
//    @GetMapping("/save")
//    public String saveGet(@RequestParam("username") String name, Model model) {
//        System.out.println(name);
//        System.out.println("get");
//        userDAO.save(new User(name));
//        model.addAttribute("users", userDAO.findAll());
//        return "users.html";
//    }
//
//    @PostMapping("/save")
//    public String save(@RequestParam String username, Model model) {
//        System.out.println(username);
//        userDAO.save(new User(username));
//        model.addAttribute("users", userDAO.findAll());
//        return "users.html";
//    }
//
//    @GetMapping("/users/{id}")
////    public String getUser(@PathVariable("id")int userId)
//    public String getUser(@PathVariable int id, Model model) {
////        userDAO.getOne(userId);
//        User one = userDAO.getOne(id);
//        model.addAttribute("user", one);
//        return "user.html";
//    }
//
//
//}
