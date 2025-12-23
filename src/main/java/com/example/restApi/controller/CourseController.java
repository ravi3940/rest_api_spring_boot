package com.example.restApi.controller;


import com.example.restApi.dto.CourseDto;
import com.example.restApi.service.CourseService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/courses")
public class CourseController {
    private final CourseService courseService;

    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }

    @PostMapping("/")
    public CourseDto addCourse(@RequestBody CourseDto dto) {
        return courseService.addCourse(dto);
    }

    @GetMapping("/")
    public List<CourseDto> getAllCourses() {
        return courseService.getAllCourses();
    }

    @GetMapping("/{id}")
    public CourseDto getCourseById(@PathVariable int id) {
        return courseService.getCourseById(id);
    }

    @PutMapping("/{id}")
    public CourseDto updateCourse(@PathVariable int id,
                                  @RequestBody CourseDto dto) {
        return courseService.updateCourse(id, dto);
    }

    @DeleteMapping("/{id}")
    public String deleteCourse(@PathVariable int  id) {
        courseService.deleteCourse(id);
        return "Course deleted successfully";
    }
}
