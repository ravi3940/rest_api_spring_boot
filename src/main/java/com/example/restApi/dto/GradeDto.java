package com.example.restApi.dto;

import lombok.*;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class GradeDto {

    private Integer  studentId;
    private Integer  courseId;
    private int marks;
    private String grade;
}

