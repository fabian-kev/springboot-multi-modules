package com.fabiankevin.gradle.multiprojectdemo;

import com.fabiankevin.gradle.user.Student;
import com.fabiankevin.gradle.user.gateway.StudentGateway;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.Arrays;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class StudentController {
    private final StudentGateway studentGateway;
    @GetMapping("/students")
    List<Student> getStudents(){
        return studentGateway.getStudents();
    }


    @PostConstruct
    public void loadStudents(){
        System.out.println("Pre inserting student commence!");
        Arrays.asList(
                Student.builder()
                .name("Yukihira")
                .build(),
                Student.builder()
                .name("Kevin Fabian")
                .build(),
                Student.builder()
                .name("Santa Maria")
                .build()
        ).forEach(student -> studentGateway.save(student));

    }
}
