package com.example.demo.controllers;


import com.example.demo.dao.UserDAO;
import com.example.demo.models.User;
import com.example.demo.services.implem.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.List;

@RestController
@AllArgsConstructor
public class MainController {


    private final UserService userService;

    @GetMapping("/")
    public List<User> getALLUser() {
        return userService.getAll();
    }

    @GetMapping("/update/{id}")
    public User updateUser(@RequestParam int id,
                           @RequestParam String name,
                           @RequestParam String family,
                           @RequestParam int age,
                           @RequestParam String password) {
        return userService.update(id, name, family, age, password);
    }

    @PostMapping("/save")
    public void saveStudentWithImage(@RequestParam String name,
                                     @RequestParam String family,
                                     @RequestParam int age,
                                     @RequestParam String password,
                                     @RequestParam MultipartFile image) {
        String pathToImg = System.getProperty("user.home")
                + File.separator + "javaImg" + File.separator;

        try {
            image.transferTo(new File(pathToImg + image.getOriginalFilename()));
        } catch (IOException e) {
            e.printStackTrace();
        }

        User user = new User();
        user.setName(name);
        user.setFamily(family);
        user.setAge(age);
        user.setPassword(password);
        String fileName = image.getOriginalFilename();
        user.setImg(fileName);
        userService.save(user);

    }
}
