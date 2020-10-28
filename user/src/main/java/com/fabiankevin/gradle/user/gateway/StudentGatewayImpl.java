package com.fabiankevin.gradle.user.gateway;

import com.fabiankevin.gradle.user.Student;
import com.fabiankevin.gradle.user.persistence.StudentEntity;
import com.fabiankevin.gradle.user.persistence.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class StudentGatewayImpl implements StudentGateway {
    private final StudentRepository studentRepository;
    @Override
    public List<Student> getStudents() {
        return studentRepository.findAll().stream()
                .map(entity -> new Student(entity.getId(), entity.getName()))
                .collect(Collectors.toList());
    }

    @Override
    public Student save(Student student) {
        StudentEntity entity = new StudentEntity();
        entity.setName(student.getName());
        entity = studentRepository.save(entity);

        Student insertedStudent = Student.builder()
                .id(entity.getId())
                .name(entity.getName())
                .build();
        return insertedStudent;
    }
}
