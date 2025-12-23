package com.example.restApi.service;


import com.example.restApi.dto.EnrollmentDto;
import com.example.restApi.entity.Course;
import com.example.restApi.entity.Enrollment;
import com.example.restApi.entity.Student;
import com.example.restApi.repository.CourseRepository;
import com.example.restApi.repository.EnrollmentRepository;
import com.example.restApi.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class EnrollmentServiceImp  implements  EnrollmentService {

    private final EnrollmentRepository enrollmentRepository;
    private final StudentRepository studentRepository;
    private final CourseRepository courseRepository;

    public EnrollmentServiceImp(EnrollmentRepository enrollmentRepository,
                                 StudentRepository studentRepository,
                                 CourseRepository courseRepository) {
        this.enrollmentRepository = enrollmentRepository;
        this.studentRepository = studentRepository;
        this.courseRepository = courseRepository;
    }

    @Override
    public EnrollmentDto enrollStudent(EnrollmentDto dto) {

        Student student = studentRepository.findById(dto.getStudentId())
                .orElseThrow(() ->
                        new RuntimeException("Student not found with id: " + dto.getStudentId()));

        Course course = courseRepository.findById(dto.getCourseId())
                .orElseThrow(() ->
                        new RuntimeException("Course not found with id: " + dto.getCourseId()));

        Enrollment enrollment = new Enrollment();
        enrollment.setStudent(student);
        enrollment.setCourse(course);
        enrollment.setEnrollmentDate(
                dto.getEnrollmentDate() != null
                        ? dto.getEnrollmentDate()
                        : LocalDate.now()
        );

        Enrollment saved = enrollmentRepository.save(enrollment);

        dto.setId(saved.getId());
        dto.setEnrollmentDate(saved.getEnrollmentDate());

        return dto;
    }
}
