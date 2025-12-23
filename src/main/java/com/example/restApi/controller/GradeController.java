package com.example.restApi.controller;


import com.example.restApi.dto.GradeDto;
import com.example.restApi.service.GradeService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/grades")
public class GradeController {

    private final GradeService gradeService;

    public GradeController(GradeService gradeService) {
        this.gradeService = gradeService;
    }

    @PostMapping
    public String addGrade(@RequestBody GradeDto dto) {
        gradeService.addGrade(dto);
        return "Grade added successfully";
    }

}
