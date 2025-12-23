package com.example.restApi.dto;



import lombok.*;

import java.time.LocalDate;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EnrollmentDto {

    private  Integer id;
    private   Integer  studentId;
    private   Integer  courseId;
    private LocalDate enrollmentDate;

    // getters & setters
}

