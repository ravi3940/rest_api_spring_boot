package com.example.restApi.entity;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="students")
@Data
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;
    private String email;
    private int age;
}
