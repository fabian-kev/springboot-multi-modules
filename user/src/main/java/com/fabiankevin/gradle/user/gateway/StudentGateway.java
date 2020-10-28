package com.fabiankevin.gradle.user.gateway;

import com.fabiankevin.gradle.user.Student;
import org.springframework.stereotype.Service;

import java.util.List;

public interface StudentGateway {
    List<Student> getStudents();
    Student save(Student student);
}
