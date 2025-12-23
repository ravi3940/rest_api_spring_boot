package com.example.restApi.service;

import com.example.restApi.dto.CourseDto;
import com.example.restApi.entity.Course;
import com.example.restApi.repository.CourseRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CourseServiceImpl implements CourseService {

    private final CourseRepository courseRepository;

    public CourseServiceImpl(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    @Override
    public CourseDto addCourse(CourseDto dto) {
        Course course = mapToEntity(dto);
        Course savedCourse = courseRepository.save(course);
        return mapToDto(savedCourse);
    }

    @Override
    public List<CourseDto> getAllCourses() {
        return courseRepository.findAll()
                .stream()
                .map(this::mapToDto)
                .collect(Collectors.toList());
    }

    @Override
    public CourseDto getCourseById(int  id) {
        Course course = courseRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Course not found with id: " + id));
        return mapToDto(course);
    }

    @Override
    public CourseDto updateCourse(int  id, CourseDto dto) {
        Course course = courseRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Course not found with id: " + id));

        course.setCourseName(dto.getCourseName());
        course.setDescription(dto.getDescription());

        return mapToDto(courseRepository.save(course));
    }

    @Override
    public void deleteCourse(int  id) {
        if (!courseRepository.existsById(id)) {
            throw new RuntimeException("Course not found with id: " + id);
        }
        courseRepository.deleteById(id);
    }

    // ---------------- MAPPERS ----------------

    private Course mapToEntity(CourseDto dto) {
        Course course = new Course();
        course.setCourseName(dto.getCourseName());
        course.setDescription(dto.getDescription());
        return course;
    }

    private CourseDto mapToDto(Course course) {
        CourseDto dto = new CourseDto();
        dto.setId(course.getId());
        dto.setCourseName(course.getCourseName());
        dto.setDescription(course.getDescription());
        return dto;
    }
}

