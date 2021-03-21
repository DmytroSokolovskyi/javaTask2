package com.example.service.controllers;


import com.example.service.dao.UserDAO;
import com.example.service.models.User;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor

public class MainController {


private UserDAO userDao;

@GetMapping("/")
public void main () {

    User user = new User("Maks", 23);

    userDao.save(user);
}




}
