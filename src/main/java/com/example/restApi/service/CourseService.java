package com.example.restApi.service;

import com.example.restApi.dto.CourseDto;

import java.util.List;

public interface CourseService {

    CourseDto addCourse(CourseDto dto);

    List<CourseDto> getAllCourses();

    CourseDto getCourseById(int id);

    CourseDto updateCourse(int id, CourseDto dto);

    void deleteCourse(int id);
}
