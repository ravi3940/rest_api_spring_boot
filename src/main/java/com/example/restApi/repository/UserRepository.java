package com.example.restApi.repository;

import com.example.restApi.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public  interface  UserRepository   extends JpaRepository<User, Integer> {


}
