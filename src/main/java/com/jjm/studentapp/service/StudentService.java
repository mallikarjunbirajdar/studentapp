package com.jjm.studentapp.service;

import com.jjm.studentapp.entity.Student;

import java.util.List;
import java.util.Optional;

public interface StudentService {

    void addStudent(Student student);

    List<Student> showAllStudent();

    Optional<Student> getStudentById(int id);
}
