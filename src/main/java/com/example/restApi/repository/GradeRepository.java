package com.example.restApi.repository;

import com.example.restApi.entity.Grade;
import org.springframework.data.jpa.repository.JpaRepository;

public interface  GradeRepository   extends JpaRepository<Grade , Integer> {

}
