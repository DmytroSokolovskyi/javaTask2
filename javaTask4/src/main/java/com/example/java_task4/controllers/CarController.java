package com.example.java_task4.controllers;


import com.example.java_task4.dao.CarDAO;
import com.example.java_task4.model.Car;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class CarController {
    private CarDAO carDAO;

    @GetMapping("/saveCar")
    public void saveCar(@RequestParam String model) {
        Car car = new Car(model);
       carDAO.save(car);

    }

    @GetMapping("/cars")
    public List<Car> getCar() {

        return carDAO.findAll();
    }



}
