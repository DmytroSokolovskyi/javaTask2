package com.example.demo.services.implem;

import com.example.demo.dao.UserDAO;
import com.example.demo.models.User;
import com.example.demo.services.IUser;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class UserService implements IUser {

    private final UserDAO userDAO;


    @Override
    public void save(String name,
                     MultipartFile img,
                     MultipartFile resume) {
        User newUser = new User();
        newUser.setName(name);

        String pathFolder = System.getProperty("user.home") +
                File.separator + "javaImg" + File.separator;

        try {
            img.transferTo(new File(pathFolder + img.getOriginalFilename()));
            resume.transferTo(new File(pathFolder + resume.getOriginalFilename()));
        } catch (IOException e) {
            e.printStackTrace();
        }
        newUser.setImg(img.getOriginalFilename());
        newUser.setResume(resume.getOriginalFilename());

        userDAO.save(newUser);
    }

    @Override
    public List<User> getAll() {
        return userDAO.findAll();
    }

    @Override
    public User getById(int id) {
        Optional<User> userById = userDAO.findById(id);
        return userById.orElse(null);
    }

    @Override
    public void deleteById(int id) {
        userDAO.deleteById(id);
    }

    @Override
    public User updateAll(int id,
                          String name,
                          MultipartFile img,
                          MultipartFile resume) {
        User userForAdd = userDAO.getOne(id);
        userForAdd.setName(name);
        String pathFolder = System.getProperty("user.home") +
                File.separator + "javaImg" + File.separator;
//        сохраняем
        try {
            img.transferTo(new File(pathFolder + img.getOriginalFilename()));
            resume.transferTo(new File(pathFolder + resume.getOriginalFilename()));
        } catch (IOException e) {
            e.printStackTrace();
        }
        userForAdd.setImg(img.getOriginalFilename());
        userForAdd.setResume(resume.getOriginalFilename());

        return userDAO.save(userForAdd);
    }

    @Override
    public User getImage(int id) {
        return userDAO.getOne(id);
    }

}
