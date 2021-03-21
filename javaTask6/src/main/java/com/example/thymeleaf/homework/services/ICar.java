package com.example.thymeleaf.homework.services;

import com.example.thymeleaf.homework.models.Car;

import java.util.List;

public interface ICar {

    void save1(String model, int year);

    void save2(Car car);

    List<Car> getAll();

    Car update(int id,
               String model,
               int year);

    Car getById(int id);

    void deleteById(int id);
}
