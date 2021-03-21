package com.example.demo.services;

import com.example.demo.models.User;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface IUser {

    void save(String name,
              MultipartFile img,
              MultipartFile resume);

    List<User> getAll();

    User updateAll(int id,
                   String name,
                   MultipartFile img,
                   MultipartFile resume);

    User getById(int id);

    void deleteById(int id);

    User getImage(int id);
}
