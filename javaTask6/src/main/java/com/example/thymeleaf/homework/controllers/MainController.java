package com.example.thymeleaf.homework.controllers;

import com.example.thymeleaf.homework.dao.CarDAO;
import com.example.thymeleaf.homework.models.Car;
import com.example.thymeleaf.homework.services.implem.CarService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

@RestController
@AllArgsConstructor
@RequestMapping("/cars")
@CrossOrigin( origins = {"http://localhost:32905"})
public class MainController {

    private CarService carService;

    @GetMapping()
    public List<Car> getCars() {
        return carService.getAll();
    }

    @GetMapping("/{id}")
    public Car getCar (@PathVariable int id) {
        Car carById = carService.getById(id);
    return carById;
    }

    @PostMapping("/save")
    public void save(@RequestBody Car car) {
        carService.save2(car);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        carService.deleteById(id);
    }

//    @GetMapping("/")
//    public String home() {
//        return "index.html";
//    }
//
//    @GetMapping("/cars")
//    public String cars() {
//        return "cars.html";
//    }
//    @GetMapping("/cars/{id}")
//    public String getCar(@PathVariable int id, Model model) {
//        Car one = carDAO.getOne(id);
//        model.addAttribute("car", one);
//        return "car.html";
//    }
//
//    @PostMapping("/save")
//    public String save(@RequestParam Map<String, String> cars, Model model) {
//        System.out.println(cars);
//
////        Car carinput = new Car();
////        Set<Map.Entry<String, String>> entries = cars.entrySet();
////        Iterator<Map.Entry<String, String>> iterator = entries.iterator();
////        while (iterator.hasNext()) {
////            Map.Entry<String, String> next =  iterator.next();
////             if (next.getKey().equals("model")) {
////                 carinput.setModel(next.getValue());
////             };
////            if (next.getKey().equals("year")) {
////                carinput.setYear(next.getValue());
////            };
////        }
////        carDAO.save(carinput);
//
//        carDAO.save(new Car(cars.get("model"), cars.get("year")));
//        model.addAttribute("carSql", carDAO.findAll());
//
//        return "cars.html";
//    }

}
