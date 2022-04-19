package com.example.SpringBoot.service;
import java.util.List;

import org.springframework.data.domain.Page;

import com.example.SpringBoot.model.Student;

public interface StudentService {
    List<Student> getAllStudent();
    void saveStudent(Student student);
    Student getStudentById(long id);
    void deleteStudentById(long id);
    Page<Student> findPaginated(int pageNo, int pageSize, String sortField, String sortDirection);
}
