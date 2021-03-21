package com.example.java_task4.controllers;


import com.example.java_task4.dao.LadyDAO;
import com.example.java_task4.model.Lady;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class LadyController {

    private LadyDAO ladyDAO;

    @GetMapping("/savelady")
    public String saveLady(@RequestParam String name) {
        ladyDAO.save(new Lady(name));
        return name;
    }

    @GetMapping("/lady")
    public List<Lady> getLady() {
        return ladyDAO.findAll();
    }


}



