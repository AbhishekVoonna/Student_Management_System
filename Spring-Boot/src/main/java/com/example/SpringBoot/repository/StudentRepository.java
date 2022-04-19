package com.example.SpringBoot.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.SpringBoot.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{

}