package com.example.restApi.controller;


import com.example.restApi.dto.EnrollmentDto;
import com.example.restApi.service.EnrollmentService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/enrollments")
public class EnrollmentController {
    private final EnrollmentService enrollmentService;

    public EnrollmentController(EnrollmentService enrollmentService) {
        this.enrollmentService = enrollmentService;
    }


    // Enroll a student into a course
    @PostMapping
    public EnrollmentDto enrollStudent(@RequestBody EnrollmentDto dto) {
        return enrollmentService.enrollStudent(dto);
    }
}
