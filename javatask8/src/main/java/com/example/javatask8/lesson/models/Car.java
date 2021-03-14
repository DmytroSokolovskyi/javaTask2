package com.example.javatask8.lesson.models;


import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString(exclude = ("users"))
public class Car {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
    private String model;
    @ManyToMany(cascade = CascadeType.ALL, mappedBy = "cars")
    private List<User> userList = new ArrayList<>();


}
