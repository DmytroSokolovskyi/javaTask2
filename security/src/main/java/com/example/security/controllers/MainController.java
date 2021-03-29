package com.example.security.controllers;


import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.Arrays;
import java.util.List;

@RestController
public class MainController {


    @GetMapping("/")
    public String home(Principal principal) {
        System.out.println(principal);
        System.out.println(SecurityContextHolder.getContext().getAuthentication());
        return "home";
    }


    @GetMapping("/admin/test")
    public List<String> adminTest() {
    return  Arrays.asList("ADMIN", "TEST");
    }


    @GetMapping("/user/test")
    public List<String> userTest() {
        return  Arrays.asList("USER", "TEST");
    }

    @GetMapping("/wide")
    public String wide() {
        return  "WIDE_URL";
    }

}
