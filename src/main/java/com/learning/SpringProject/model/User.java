package com.learning.SpringProject.model;

import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class User {
    @Id
    private Integer id;
    private String name;
    private Address address;
    private float age;
}
