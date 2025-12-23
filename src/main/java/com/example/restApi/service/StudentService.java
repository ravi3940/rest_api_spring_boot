package com.example.restApi.service;

import com.example.restApi.entity.Student;

import java.util.List;


public interface StudentService {
    Student  AddNewUser(Student user) ;
    List<Student> GetAllUser();
    Student  GetUserById(int  id) ;
    Student   updateUser(Student  user , int  id) ;
    void  deleteUser(int  id) ;
}
