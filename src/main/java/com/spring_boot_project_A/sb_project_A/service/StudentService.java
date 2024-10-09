package com.spring_boot_project_A.sb_project_A.service;


import com.spring_boot_project_A.sb_project_A.entity.Student;


import java.util.List;


public interface StudentService {

    //create
    public Student createStudent(Student student);

    //get student
    public Student getStudentById(long id);

    //getAllStudents
    public List<Student> getAllStudents();

    //update
    public Student updateStudent(Student student);

    //delete
    public void deleteStudent(long id);



}
