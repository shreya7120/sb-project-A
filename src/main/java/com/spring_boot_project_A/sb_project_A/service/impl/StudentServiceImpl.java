package com.spring_boot_project_A.sb_project_A.service.impl;

import com.spring_boot_project_A.sb_project_A.entity.Student;
import com.spring_boot_project_A.sb_project_A.repository.StudentRepository;
import com.spring_boot_project_A.sb_project_A.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class StudentServiceImpl implements StudentService {


    private StudentRepository studentRepository;

    //create
    @Override
    public Student createStudent(Student student) {

        return studentRepository.save(student);

    }

    //getById
    @Override
    public Student getStudentById(long id) {
        Optional<Student> student=studentRepository.findById(id);

        return student.get();
    }

    //getAll
    @Override
    public List<Student> getAllStudents() {

        return studentRepository.findAll();
    }

    //update
    @Override
    public Student updateStudent(Student student) {


        Optional<Student> existingStudent=studentRepository.findById(student.getId());

       Student updateStudent= existingStudent.get();
        updateStudent.setId(student.getId()).
                setName(student.getName()).
                setCity(student.getCity());

        Student updatedSt=studentRepository.save(updateStudent);

        return updatedSt;
    }

    //delete
    @Override
    public void deleteStudent(long id) {
        studentRepository.deleteById(id);

    }
}
