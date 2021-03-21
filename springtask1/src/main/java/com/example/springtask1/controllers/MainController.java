package com.example.springtask1.controllers;


import com.example.springtask1.models.Calc;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor

public class MainController {

    @GetMapping("/calc")
    public String calc() {
        System.out.println("calc");
        return "calc";
    }

    @GetMapping("/calculator")
    public void calculator(@RequestParam int a,
                           @RequestParam String action,
                           @RequestParam int b) {

 System.out.println(a + action + b);
        Calc calc = new Calc(a, action, b);
        calc.calculate();

    }
}
