package com.example.thymeleaf.homework.services.implem;

import com.example.thymeleaf.homework.dao.CarDAO;
import com.example.thymeleaf.homework.models.Car;
import com.example.thymeleaf.homework.services.ICar;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class CarService implements ICar {
 private final  CarDAO carDAO;

    @Override
    public void save1(String model, int year) {
        Car newCar = new Car();
        newCar.setModel(model);
        newCar.setYear(year);
        carDAO.save(newCar);
    }
    @Override
    public void save2(Car car) {
        carDAO.save(car);
    }

    @Override
    public List<Car> getAll() {
        return carDAO.findAll();
    }

    @Override
    public Car update(int id, String model, int year) {
        Car carAdd = carDAO.getOne(id);
        carAdd.setModel(model);
        carAdd.setYear(year);
       return carDAO.save(carAdd);
    }

    @Override
    public Car getById(int id) {
        Optional<Car> carById = carDAO.findById(id);
        return carById.orElse(null);
    }

    @Override
    public void deleteById(int id) {
        carDAO.deleteById(id);
    }
}
