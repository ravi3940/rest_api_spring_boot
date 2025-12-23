package com.example.restApi.service;

import com.example.restApi.entity.Student;
import com.example.restApi.repository.StudentRepository;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class StudentServiceImp implements StudentService {

    private final StudentRepository userrepository ;
    public StudentServiceImp(StudentRepository userrepository){
        this.userrepository  =  userrepository ;
    }
    @Override
    public Student AddNewUser(Student student) {

          return userrepository.save(student) ;

    }

    @Override
    public List<Student> GetAllUser() {
        return   userrepository.findAll();
    }

    @Override
    public Student GetUserById(int id) {
        return userrepository.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found with id: " + id));
    }

    @Override
    public Student updateUser(Student user, int id)  {

        Student  newUser =  userrepository.findById(id).orElseThrow(()->  new RuntimeException( "User  not  found  with this  id " +  id)) ;
        newUser.setId(user.getId());
        newUser.setName(user.getName());
        newUser.setEmail(user.getEmail());
       return    userrepository.save(newUser);

    }

    @Override
    public void   deleteUser(int id) {
       userrepository.deleteById(id);
    }


}
