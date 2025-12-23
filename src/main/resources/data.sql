INSERT INTO courses (course_name, description) VALUES
                                                   ('Java', 'Core Java and OOP concepts'),
                                                   ('Spring Boot', 'Backend development using Spring Boot'),
                                                   ('Database', 'SQL fundamentals');

INSERT INTO students (name, email, age) VALUES
                                            ('Ravi Kumar', 'ravi@gmail.com', 22),
                                            ('Amit Sharma', 'amit@gmail.com', 23),
                                            ('Neha Verma', 'neha@gmail.com', 21);


INSERT INTO enrollments (student_id, course_id, enrollment_date) VALUES
                                                                     (1, 1, '2025-01-01'),
                                                                     (1, 2, '2025-01-02'),
                                                                     (2, 1, '2025-01-03'),
                                                                     (3, 3, '2025-01-04');

INSERT INTO attendance (student_id, course_id, date, status) VALUES
                                                                 (1, 1, '2025-01-10', 'PRESENT'),
                                                                 (1, 2, '2025-01-10', 'ABSENT'),
                                                                 (2, 1, '2025-01-10', 'PRESENT'),
                                                                 (3, 3, '2025-01-10', 'PRESENT');

INSERT INTO grades (student_id, course_id, marks, grade) VALUES
                                                             (1, 1, 85, 'A'),
                                                             (1, 2, 78, 'B'),
                                                             (2, 1, 90, 'A+'),
                                                             (3, 3, 88, 'A');
