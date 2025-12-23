package com.example.restApi.entity;



import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "grades")
@Data
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Grade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Integer  id;

    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student student;

    @ManyToOne
    @JoinColumn(name = "course_id")
    private Course course;

    private int marks;

    private String grade;
}

