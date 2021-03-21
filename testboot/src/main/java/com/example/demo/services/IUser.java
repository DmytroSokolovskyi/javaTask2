package com.example.demo.services;


import com.example.demo.models.User;

import java.util.List;

public interface IUser {
    User save(User user);
    List<User> getAll();
    User update(int id, String name, String family, int age, String password);
    User getById(int id);
    void deleteById(int id);
}
