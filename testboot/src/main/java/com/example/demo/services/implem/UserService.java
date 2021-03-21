package com.example.demo.services.implem;

import com.example.demo.dao.UserDAO;
import com.example.demo.models.User;
import com.example.demo.services.IUser;

import java.util.List;

public class UserService implements IUser {

    private UserDAO userDAO;

    @Override
    public User save(User user) {
        return userDAO.save(user);
    }

    @Override
    public List<User> getAll() {
        return userDAO.findAll();
    }

    @Override
    public User update(int id, String name, String family, int age, String password) {
        User useradd = userDAO.getOne(id);
        useradd.setName(name);
        useradd.setFamily(family);
        useradd.setAge(age);
        useradd.setPassword(password);

        return userDAO.save(useradd);
    }


    @Override
    public User getById(int id) {
        return userDAO.getOne(id);
    }

    @Override
    public void deleteById(int id) {
        userDAO.deleteById(id);
    }
}
