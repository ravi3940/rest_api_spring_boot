package com.example.restApi.dto;


import lombok.*;

import java.time.LocalDate;

@Data
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class AttendanceDto {

    private Integer studentId;
    private Integer courseId;
    private LocalDate date;
    private String status; // PRESENT / ABSENT

    // getters & setters
}

