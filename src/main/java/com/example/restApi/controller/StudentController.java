package com.example.restApi.controller;

import com.example.restApi.entity.Student;
import com.example.restApi.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/v1/students")
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping
    public Student  addStudent(@RequestBody Student dto) {
        return studentService.AddNewUser(dto);
    }

    @GetMapping
    public List<Student> getAllStudents() {
        return studentService.GetAllUser();
    }

    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable int  id) {
        return studentService.GetUserById(id);
    }

    @PutMapping("/{id}")
    public Student updateStudent(@PathVariable int  id,
                                    @RequestBody Student dto) {
        return studentService.updateUser(dto ,id);
    }

    @DeleteMapping("/{id}")
    public String deleteStudent(@PathVariable int  id) {
        studentService.deleteUser(id);
        return "Student deleted successfully";
    }
}

