package com.example.java_task4.controllers;


import com.example.java_task4.dao.StreetDAO;
import com.example.java_task4.model.Street;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class StreetController {

    private StreetDAO streetDAO;


    @GetMapping("/saveStreet")
    public void saveStreet(@RequestParam String value) {
        Street street = new Street(value);
        streetDAO.save(street);
    }

    @GetMapping("/street")
    public List<Street> getStreet() {
        return streetDAO.findAll();
    }



}
