package com.example.restApi.repository;

import com.example.restApi.entity.Enrollment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface  EnrollmentRepository  extends JpaRepository<Enrollment , Integer> {
}
