package com.example.restApi.repository;

import com.example.restApi.entity.Attendance;
import org.springframework.data.jpa.repository.JpaRepository;

public  interface  AttendanceRepository extends JpaRepository<Attendance , Integer> {
}
