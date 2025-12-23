package com.example.restApi.dto;


import lombok.*;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CourseDto {

    private Integer id;
    private String courseName;
    private String description;

    // getters & setters
}

