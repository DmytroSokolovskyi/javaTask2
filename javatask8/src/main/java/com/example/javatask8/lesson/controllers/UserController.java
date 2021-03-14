package com.example.javatask8.lesson.controllers;


import com.example.javatask8.lesson.dao.UserDAO;
import com.example.javatask8.lesson.models.Product;
import com.example.javatask8.lesson.models.User;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/users")
public class UserController {

private UserDAO userDAO;

@GetMapping("/")
public List<User> getUsers() {
    return userDAO.findAll();
}

    @GetMapping("/save")
    public void save() {
        User user = new User();
        user.setName("Vasya");
        List<Product> productList = new ArrayList<>();
        productList.add(new Product("milk"));
        productList.add(new Product("kokos"));
        user.setProducts(productList);

        for (Product product : productList) {
            product.setUser(user);
        }

        userDAO.save(user);
    }
}
