package com.spring_boot_project_A.sb_project_A.repository;

import com.spring_boot_project_A.sb_project_A.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {


}
