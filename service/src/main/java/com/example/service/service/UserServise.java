package com.example.service.service;

import com.example.service.models.User;
import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;
import org.springframework.stereotype.Service;


public interface UserServise {

    void save(User user);

//    List<User> findAll();
}
