package com.example.restApi.service;


import com.example.restApi.dto.GradeDto;
import com.example.restApi.entity.Course;
import com.example.restApi.entity.Grade;
import com.example.restApi.entity.Student;
import com.example.restApi.repository.CourseRepository;
import com.example.restApi.repository.GradeRepository;
import com.example.restApi.repository.StudentRepository;
import org.springframework.stereotype.Service;

@Service
public class GradeServiceImp   implements  GradeService {

    private final GradeRepository gradeRepository;
    private final StudentRepository studentRepository;
    private final CourseRepository courseRepository;

    public GradeServiceImp(GradeRepository gradeRepository,
                            StudentRepository studentRepository,
                            CourseRepository courseRepository) {
        this.gradeRepository = gradeRepository;
        this.studentRepository = studentRepository;
        this.courseRepository = courseRepository;
    }

    @Override
    public void addGrade(GradeDto dto) {

        Student student = studentRepository.findById(dto.getStudentId())
                .orElseThrow(() ->
                        new RuntimeException("Student not found with id: " + dto.getStudentId()));

        Course course = courseRepository.findById(dto.getCourseId())
                .orElseThrow(() ->
                        new RuntimeException("Course not found with id: " + dto.getCourseId()));

        Grade grade = new Grade();
        grade.setStudent(student);
        grade.setCourse(course);
        grade.setMarks(dto.getMarks());
        grade.setGrade(dto.getGrade());

        gradeRepository.save(grade);
    }
}
