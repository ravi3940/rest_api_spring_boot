package com.example.restApi.service;


import com.example.restApi.dto.AttendanceDto;
import com.example.restApi.entity.Attendance;
import com.example.restApi.entity.AttendanceStatus;
import com.example.restApi.entity.Course;
import com.example.restApi.entity.Student;
import com.example.restApi.repository.AttendanceRepository;
import com.example.restApi.repository.CourseRepository;
import com.example.restApi.repository.StudentRepository;
import org.springframework.stereotype.Service;

@Service
public class AttendanceServiceImp implements   AttendanceService {

    private final AttendanceRepository attendanceRepository;
    private final StudentRepository studentRepository;
    private final CourseRepository courseRepository;

    public AttendanceServiceImp(
            AttendanceRepository attendanceRepository,
            StudentRepository studentRepository,
            CourseRepository courseRepository) {

        this.attendanceRepository = attendanceRepository;
        this.studentRepository = studentRepository;
        this.courseRepository = courseRepository;
    }


    @Override
    public void markAttendance(AttendanceDto dto) {

        Student student = studentRepository.findById(dto.getStudentId())
                .orElseThrow(() -> new RuntimeException(
                        "Student not found with id: " + dto.getStudentId()));

        Course course = courseRepository.findById(dto.getCourseId())
                .orElseThrow(() -> new RuntimeException(
                        "Course not found with id: " + dto.getCourseId()));

        Attendance attendance = new Attendance();
        attendance.setStudent(student);
        attendance.setCourse(course);
        attendance.setDate(dto.getDate());
        attendance.setStatus(AttendanceStatus.valueOf(dto.getStatus()));

        attendanceRepository.save(attendance);
    }
}
