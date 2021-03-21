package com.example.demo.controllers;


import com.example.demo.models.User;
import com.example.demo.services.implem.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@RestController
@AllArgsConstructor
public class MainController {

    private final UserService userService;

    @GetMapping("/")
    public List<User> getUsers() {
        return userService.getAll();
    }

    @GetMapping("/user/{id}")
    public User getUserId(@PathVariable int id) {
        return userService.getById(id);
    }

    @GetMapping("/delete/{id}")
    public void removeId(@PathVariable int id) {
        userService.deleteById(id);
    }

    @PostMapping("/save")
    public void save(@RequestParam String name,
                     @RequestParam MultipartFile img,
                     @RequestParam MultipartFile resume) {
        userService.save(name, img, resume);
    }

    @PostMapping("/update/{id}")
    public void update(@PathVariable int id,
                       @RequestParam String name,
                       @RequestParam MultipartFile img,
                       @RequestParam MultipartFile resume) {
        userService.updateAll(id, name, img, resume);
    }

    @RequestMapping("/img/{id}")
    public String getImage(@PathVariable int id) {

        String userPic = userService.getImage(id).getImg();
        System.out.println(userPic);
        return userPic;
    }
}
