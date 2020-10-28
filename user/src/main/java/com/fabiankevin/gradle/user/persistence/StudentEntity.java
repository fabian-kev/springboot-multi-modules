package com.fabiankevin.gradle.user.persistence;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table
public class StudentEntity {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
}
