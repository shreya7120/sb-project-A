package com.spring_boot_project_A.sb_project_A.controller;

import com.spring_boot_project_A.sb_project_A.entity.Student;
import com.spring_boot_project_A.sb_project_A.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/student")
public class StudentController {

    private StudentService studentService;

    //create Rest API
    @RequestMapping(path="create/api",method = RequestMethod.POST)
    public ResponseEntity<Student> createStudent(@RequestBody Student student)
    {
        Student savedStudent=studentService.createStudent(student);

        return new ResponseEntity<>(savedStudent, HttpStatus.CREATED);
    }

    //get student by id Rest API

    @GetMapping("/get_student")
    public ResponseEntity<Student> getStudentById(@RequestParam int id)
    {
        Student student=studentService.getStudentById(id);

        return new ResponseEntity<>(student,HttpStatus.OK);
    }

    //build get all students Rest API
    @GetMapping("/all_students")
    public ResponseEntity<List<Student>> getAllStudents()
    {
        List<Student> students=studentService.getAllStudents();
        return new ResponseEntity<>(students,HttpStatus.OK);
    }

    //update student Rest API
    @PutMapping("update_student/{id}")
    public ResponseEntity<Student> updateStudent(@PathVariable("id") int id,
                                                 @RequestBody Student student)
    {

        student.setId(id);
        Student updatedStudent=studentService.updateStudent(student);
        return new ResponseEntity<>(student,HttpStatus.ACCEPTED);
    }

    @DeleteMapping("/del_student/{id}")
    public ResponseEntity<String> deleteStudentById(@PathVariable int id)
    {
        studentService.deleteStudent(id);
        return new ResponseEntity<>("Student deleted successfully ..",HttpStatus.OK);
    }
}
