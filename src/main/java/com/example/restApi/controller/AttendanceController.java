package com.example.restApi.controller;


import com.example.restApi.dto.AttendanceDto;
import com.example.restApi.service.AttendanceService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/attendance")
public class AttendanceController {

    private final AttendanceService attendanceService;

    public AttendanceController(AttendanceService attendanceService) {
        this.attendanceService = attendanceService;
    }

    @PostMapping("/")
    public String markAttendance(@RequestBody AttendanceDto dto) {
        attendanceService.markAttendance(dto);
        return "Attendance marked successfully";
    }

}
