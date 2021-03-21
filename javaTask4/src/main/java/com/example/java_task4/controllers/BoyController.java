package com.example.java_task4.controllers;


import com.example.java_task4.dao.BoyDAO;
import com.example.java_task4.model.Boy;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor

public class BoyController {
    private BoyDAO boyDAO;

    @GetMapping("/saveboy")
    public String saveBoy(@RequestParam String name) {
        boyDAO.save(new Boy(name));
        return name;
    }

    @GetMapping("/boy")
    public List<Boy> getBoy() {
        return boyDAO.findAll();
    }

}
