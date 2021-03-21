package com.example.javatask8.lesson.models;


import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@EqualsAndHashCode
@ToString(exclude = {"products", "cars"})
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;

    public User() {
    }

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private List<Product> products = new ArrayList<>();

    @ManyToMany(cascade = CascadeType.ALL)
//    @JoinTable(
//            name = "user_cars",
//            joinColumns = {@JoinColumn(name = "users_id")},
//            inverseJoinColumns = {@JoinColumn(name = "cars_id")}
//    )
    private List<Car> cars = new ArrayList<>();

    public User(String name) {
        this.name = name;
    }

    public User(String name, List<Product> products) {
        this.name = name;
        this.products = products;
    }
}
