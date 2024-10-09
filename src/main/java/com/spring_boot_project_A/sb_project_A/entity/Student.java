package com.spring_boot_project_A.sb_project_A.entity;


import jakarta.persistence.*;
import lombok.Data;
import lombok.experimental.Accessors;


@Accessors(chain = true)
@Data
@Entity
@Table(name="student_table")
public class Student {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id;
    @Column(name="student_name",nullable=false,unique = true,length = 100)
    private String name;
    @Column(name="student_city")
    private String city;



}
